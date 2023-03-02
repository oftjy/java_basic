package com.itheima.ArrayListP;

import java.util.ArrayList;
import java.util.Scanner;

public class 元素搜索 {
    public static void main(String[] args) {
        /**
         案例：学生信息系统：展示数据，并按照学号完成搜索
         学生类信息（学号，姓名，性别，班级）
         测试数据：
         "20180302","叶孤城",23,"护理一班"
         "20180303","东方不败",23,"推拿二班"
         "20180304","西门吹雪",26,"中药学四班"
         "20180305","梅超风",26,"神经科2班"
         */
        // 1、定义一个学生类，后期用于创建对象封装学生数据
        // 2、定义一个集合对象用于装学生对象
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302", "叶孤城", 23, "护理一班"));
        students.add(new Student("20180303", "东方不败", 23, "推拿二班"));
        students.add(new Student("20180304", "西门吹雪", 26, "中药学四班"));
        students.add(new Student("20180305", "梅超风", 26, "神经科2班"));
//        遍历并输出每一个对象的值
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getStudyId() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getClassName());
        }
        Scanner sc = new Scanner(System.in);

        while(true){
            String id = sc.next();
            Student s = getStudentByStudyId(students,id);
            if(s==null){
                System.out.println("查无此人");
            }else{
                System.out.println(s.getStudyId() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getClassName());
            }
        }
    }

    public static Student getStudentByStudyId(ArrayList<Student> students, String studyId) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getStudyId().equals(studyId)) {
                return s;
            }
        }
        return null;
    }
}

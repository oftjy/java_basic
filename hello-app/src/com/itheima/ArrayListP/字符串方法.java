package com.itheima.ArrayListP;

public class 字符串方法 {
    public static void main(String[] args) {
//        1、public int length:获取字符串的长度
        String name = "我爱你中国";
        System.out.println(name.length());
//        2、public char charAt(int index);获取某个索引位置处的字符串
        char c = name.charAt(1);
        System.out.println(c);
        System.out.println("------遍历字符串中的每个字符---------");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }
//        3、public char []toCharArray();把字符串转换成字符数组
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
//        4、public String substring(int beginIndex,int endIndex)(截取，包前不包后）
        String name2 = "Java是最好的语言";
        String rs =name2.substring(0,9);
        System.out.println(rs);
        String rs1 =name2.substring(4,9);
        System.out.println(rs1);
//        5、public String substring(int beginIndex);从当前索引一直截取到末尾
        String name3 = "金三胖是最厉害的80后，金三胖okk";
        String rs2 = name3.substring(3);
        System.out.println(rs2);
//        6、public String replace(CharSequence target,CharSequence replacement)
        String rs3=name3.replace("金三胖","???");
        System.out.println(rs3);
//        7、public String contains(CharSequence s)
        System.out.println(name3.contains("金三胖"));
        System.out.println(name3.contains("金二胖"));
//        8、public Boolean startsWith(String prefix)
        System.out.println(name3.startsWith("金"));
//        9、public String [] split(String s) : 按照某个内容把字符串分割成字符串数组返回。
        String name4 = "王宝强,贾乃亮,陈羽凡";
        String [] names= name4.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println("选择了："+names[i]);
        }
    }
}

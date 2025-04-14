package hello;

public class PrintTriangle {
    public static void main(String[]args){
        int rows=5;//控制行数
        for (int i=1;i<=rows;i++){
            //打印空格（左对齐）
            for(int j=1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            //打印*号（）构成三角形
            for(int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();//换行
            }
        }
    }


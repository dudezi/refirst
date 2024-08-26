package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 1;
        System.out.println("== 게시판 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine();

            if(command.trim().equals("종료")){
                break;
            } else if (command.trim().equals("등록")) {
                System.out.print("제목 : ");
                String subject = sc.nextLine();
                System.out.print("내용 : ");
                String contnet = sc.nextLine();

                System.out.printf("%d번 게시글이 등록되었습니다.\n", index);
                index++;
            }
        }
        sc.close();
    }
}
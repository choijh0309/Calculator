package com.codestates;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner sc = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
           1. 사용자의 입력을 다음과 같이 받을 수 있습니다.
                - 첫 번째 입력에서는 숫자를 입력 받습니다.
                - 두 번째 입력에서는 연산자를 입력 받습니다.
                - 세 번째 입력에서는 숫자를 받아야 합니다.
           2. 연산자의 종류는 +, -, *, / 네 가지입니다.
           3. 연산자의 종류에 따라 조건을 분기합니다.
           4. 소수점 연산을 수행할 수 있어야 합니다.
           5. 연산 결과를 콘솔에 출력합니다.
                - 세 번째 입력 데이터인 숫자를 입력한 후, 엔터를 치면 연산 결과를 콘솔에 출력해야 합니다.
        */
        // TODO...
        do {
            System.out.print("숫자를 입력해주세요 : ");
            double leftOperand = sc.nextDouble();
            sc.nextLine();

            System.out.print("연산자를 입력해주세요 : ");
            String operator = sc.nextLine();

            System.out.print("숫자를 입력해주세요 : ");
            double rightOperand = sc.nextDouble();

            double result;

            switch (operator) {
                case "+" :
                    result = leftOperand + rightOperand;
                    System.out.println("계산 결과 : " + result);
                    break;
                case "-" :
                    result = leftOperand - rightOperand;
                    System.out.println("계산 결과 : " + result);
                    break;
                case "*" :
                    result = leftOperand * rightOperand;
                    System.out.println("계산 결과 : " + result);
                    break;
                case "/" :
                    result = leftOperand / rightOperand;
                    System.out.println("계산 결과 : " + result);
                    break;
                default:
                    System.out.println("잘못된 연산입니다");
                    break;
            }
        } while (true);
    }
}

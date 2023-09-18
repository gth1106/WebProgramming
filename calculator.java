package p20230918;

import javax.swing.*;  // Swing 컴포넌트를 사용하기 위한 라이브러리
import java.awt.*;     // GUI 관련 유틸리티와 레이아웃 관리자를 사용하기 위한 라이브러리

public class calculator extends JFrame {

    private JButton[] buttons;  // 버튼 배열 선언
    // 버튼 레이블을 위한 문자열 배열
    private String[] labels = {
        "7", "8", "9", "/", "C",
        "4", "5", "6", "*", "<",
        "1", "2", "3", "-", "=",
        "0", ".", "+", "", ""
    };

    public calculator() {
        JTextField txtField = new JTextField(35);  // 텍스트 필드 생성
        JPanel panel = new JPanel(new GridLayout(4, 5)); // 4x5 그리드 레이아웃으로 패널 생성

        buttons = new JButton[20];  // 20개의 버튼을 위한 배열 초기화

        // 모든 레이블에 대해 버튼을 생성하고 패널에 추가
        for (int index = 0; index < labels.length; index++) {
            buttons[index] = new JButton(labels[index]);  // 버튼 생성
            // 4번째 열과 그 이후의 버튼에 대한 텍스트 컬러 설정
            if (index % 5 >= 3) {  
                buttons[index].setForeground(Color.red);
            } else {
                buttons[index].setForeground(Color.blue);
            }
            buttons[index].setBackground(Color.yellow);  // 배경색 설정
            panel.add(buttons[index]);  // 패널에 버튼 추가
        }

        add(txtField, BorderLayout.NORTH);  // 프레임 상단에 텍스트 필드 추가
        add(panel, BorderLayout.CENTER);    // 프레임 중앙에 패널 추가
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 창 종료 버튼 클릭시 프로그램 종료
        setVisible(true);  // 프레임을 화면에 표시
        pack();  // 컴포넌트의 추천된 크기에 따라 프레임 크기 조정
    }

   
}

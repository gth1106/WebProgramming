package p20230918; // 패키지명 선언

import java.awt.Color;
// 필요한 클래스들을 임포트
import java.awt.FlowLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

// MyFrameTextField 클래스가 JFrame 클래스를 상속받아 JFrame 기능을 활용할 수 있게 함
public class MyFrameTextField extends JFrame {
    
    public MyFrameTextField() { // 생성자 선언
        
        setTitle("로그인 화면 "); // 프레임의 제목 설정
        setSize(300, 150); // 프레임의 크기를 너비 300, 높이 150으로 설정
        
        
        JPanel panel1 = new JPanel();// JPanel 인스턴스 생성
        add(panel1);
        // 패널을 프레임에 추가
        
        FlowLayout layout = new FlowLayout(); // FlowLayout 레이아웃 관리자 인스턴스 생성
        this.setLayout(layout); // 프레임의 레이아웃을 FlowLayout으로 설정
        getContentPane().setBackground(Color.yellow);
        layout.setAlignment(FlowLayout.RIGHT); // FlowLayout의 정렬을 오른쪽으로 설정
        
        
        panel1.add(new JLabel("id  :")); // "id :" 라벨을 패널에 추가
        panel1.add(new TextField(20)); // 20 글자 크기의 텍스트 필드를 패널에 추가
        panel1.add(new JLabel("pass:")); // "pass :" 라벨을 패널에 추가
        panel1.add(new JPasswordField(20)); // 20 글자 크기의 패스워드 필드를 패널에 추가
        
        
        
        JButton button = new JButton("login"); // "login" 버튼 생성
        panel1.add(button); // 생성된 버튼을 패널에 추가
        
        JButton button2 = new JButton("cancel"); // "cancel" 버튼 생성
        panel1.add(button2); // 생성된 버튼을 패널에 추가
        
        setVisible(true); // 프레임을 화면에 보이게 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 닫을 때의 동작을 지정 (프로그램 종료)
    }
}

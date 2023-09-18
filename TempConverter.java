package p20230918; // 패키지명 선언

import java.awt.Color;
// 필요한 클래스들을 임포트
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// MyFrameTextField 클래스가 JFrame 클래스를 상속받아 JFrame 기능을 활용할 수 있게 함
public class TempConverter extends JFrame {
    
    public TempConverter() { // 생성자 선언
        
        setTitle("섭씨화씨온도 변환기 "); // 프레임의 제목 설정
        setSize(300, 150); // 프레임의 크기를 너비 300, 높이 150으로 설정
        
        
        JPanel panel1 = new JPanel();// JPanel 인스턴스 생성
        add(panel1);
        // 패널을 프레임에 추가
        
        FlowLayout layout = new FlowLayout(); // FlowLayout 레이아웃 관리자 인스턴스 생성
        
        getContentPane().setBackground(Color.yellow);
        layout.setAlignment(FlowLayout.RIGHT); // FlowLayout의 정렬을 오른쪽으로 설정
        
        
        panel1.add(new JLabel("섭씨온도     :")); // "id :" 라벨을 패널에 추가
        JTextField txtFieldID = new JTextField(20);
        txtFieldID.setBackground(Color.cyan);
        //txtFieldID.setText();
        
        panel1.add(txtFieldID); // 20 글자 크기의 텍스트 필드를 패널에 추가
        panel1.add(new JLabel("화씨온도:")); // "pass :" 라벨을 패널에 추가
        JTextField pwField = new JTextField(20); // 20 글자 크기의 패스워드 필드를 패널에 추가
        //pwField.setText("abce");
        pwField.setBackground(Color.cyan);
        txtFieldID.requestFocus();
        panel1.add(pwField);
        panel1.setBackground(Color.yellow);
        
        
        JButton login = new JButton("화씨->섭씨");
        panel1.add(login);
        login.addActionListener(e->{
            try {
                String t = txtFieldID.getText();
                int i = Integer.parseInt(t);
                int f = (int)((i - 32) * 5/9);
                pwField.setText(Integer.toString(f));
            } catch (NumberFormatException ex) {
                // 사용자에게 오류 메시지 표시 (예: 팝업 메시지)
                JOptionPane.showMessageDialog(null, "올바른 숫자 값을 입력해주세요.");
            }
        });
        
        JButton cancel = new JButton("섭씨->화씨");
        cancel.addActionListener(e->{
            try {
                String t1 = pwField.getText();
                int i1 = Integer.parseInt(t1);
                int f1 = (int)((i1 * 1.8) + 32);
                txtFieldID.setText(Integer.toString(f1));
            } catch (NumberFormatException ex) {
                // 사용자에게 오류 메시지 표시 (예: 팝업 메시지)
                JOptionPane.showMessageDialog(null, "올바른 숫자 값을 입력해주세요.");
            }
        });
        panel1.add(cancel); // 생성된 버튼을 패널에 추가
        
        setVisible(true); // 프레임을 화면에 보이게 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 닫을 때의 동작을 지정 (프로그램 종료)
    }
}

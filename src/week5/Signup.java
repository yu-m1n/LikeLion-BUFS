package week5;//이후 코드 리뷰용 파일(구현 완료 X)
import java.io.*;

public class Signup { //진행과정에서 수정.. + 해시맵 쓰기
    public static void main(String[] args) throws IOException {
        boolean signup = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String id;
        String pw;
        String birth;
        String mail;

        while(!signup){
            System.out.print("회원가입을 하시겠습니까?(Y/N): ");
            String s = br.readLine();

            if (s.equals("N") || s.equals("n")){
                signup = true;
                System.out.println("회원가입이 종료되었습니다. 감사합니다.");
            }

            if(signup == true){
                break;
            }

            else if (s.equals("Y") || s.equals("y")) {
                //signup = false;
                System.out.println("회원가입을 계속 진행하겠습니다.");
                System.out.print("아이디를 입력해주세요: ");
                id = br.readLine();

                System.out.println("당신의 아이디는 " +id+ " 입니다");

                System.out.print("비밀번호를 입력해주세요: ");
                pw = br.readLine();

                System.out.print("비밀번호 확인을 위해 한 번 더 입력해주세요: ");
                String rpw = br.readLine();
                int cnt = 5; //

                if(!pw.equals(rpw)){ //pw와 rpw 비밀번호가 일치하지 않을 경우
                    for (int i = 5; i > 0; i--) {
                        System.out.println("이전에 입력한 비밀번호와 다릅니다.");
                        System.out.print("비밀번호를 다시 한 번 더 입력해주세요: ");
                        rpw = br.readLine();


                        if(pw.equals(rpw)) { //기회를 얻은 후 비밀번호가 일치하는 경우
                            System.out.println("다음 단계로 넘어가겠습니다.");
                            break;
                        }
                        if(!pw.equals(rpw)) { //기회 한 번 틀린 경우(반복)
                            cnt--;
                            System.out.println("남은 비밀번호 작성 횟수는 " + cnt+ " 입니다.");

                            if(!pw.equals(rpw)){ //기회 모두 소진
                                System.out.println("5번의 기회를 모두 틀렸습니다.");
                                System.out.println("회원가입이 종료되었습니다.");
                                break;
                            }
                        }
                    }
                }
            }
            else{
                //System.out.println("당신의 비밀번호는 " +pw+ " 입니다."); //보완
                System.out.print("생년월일 6자리를 입력해주세요: ");
                birth = br.readLine();

                System.out.print("이메일을 입력해주세요: ");
                mail = br.readLine();

                //System.out.println("당신의 아이디는 " + id + " 입니다"); //저장된 값들 보여주기 ->
                //System.out.println("비밀번호는 " + pw + " 입니다");
                System.out.println("당신의 생년월일은 " + birth +" 입니다.");
                System.out.println("당신의 이메일은 " + mail +" 입니다.");

                System.out.println("회원 가입이 완료 되었습니다. 감사합니다.");

                signup = true;
                if(signup == true) {
                    break;
                }
            }
        }
    }
}

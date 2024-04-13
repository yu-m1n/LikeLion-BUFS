import java.io.*;

public class Signup {
    public static void main(String[] args) throws IOException {
        boolean signup = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
                String id = br.readLine();

                //bw.write("입력하신 아이디는 "+id+"입니다."); //입력한 아이디 확인하는 기능 만들기?

                System.out.print("비밀번호를 입력해주세요: ");
                String pw = br.readLine();

                for(int i = 0; i < 6; i++ ){
                    String pw2 = br.readLine(); //???????????? 이걸 어디에 넣어야할꼬 현 상태: 비밀번호 입력 받고 확인 상태가 아닌데도 그냥 입력 받으려고 함
                    if(pw != pw2){ //아님 여기가 잘못 되었나
                        System.out.print("비밀번호 확인을 위해 한 번 더 입력해주세요: ");
                        //////////비밀번호 확인 추가하기//////////////////////
                    }
                    else{
                        System.out.print("생년월일 6자리를 입력해주세요: ");
                        String birth = br.readLine();

                        System.out.print("이메일을 입력해주세요: ");
                        String mail = br.readLine();

                        System.out.println("회원 가입이 완료 되었습니다. 감사합니다.");
                        //System.out.println("당신의 아이디는" ) //저장된 값들 보여주기
                    }
                }
            }
        }

        //br.close();
    }
    }



import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

// 1. 회원가입 선택 (y/n)
// 2. ID 입력 구현
// 3. 비밀번호/비밀번호 확인 구현
// 4. 생년월일/ 생년월일 6자리 확인 구현
// 5. 이메일 받기

//현재 문제
//회원가입 의사 잘못된 입력 -- continue로 해결
//비밀번호 5번 확인
// 비밀번호를 제대로 입력한 경우에 다시 아이디 입력으로 넘어옴
public class new_signup {
    public static void main(String[] args)throws IOException {
        boolean signup = false;

        while(!signup){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("---회원가입을 하시겠습니까?---( Y / N )");
            System.out.print(">> ");

            String s = br.readLine();

            if (s.equals("Y") || s.equals("y")){
                //signup = false;
                signup = true;

                System.out.println("회원가입을 계속 진행하겠습니다.");
            }
            else if (s.equals("N") || s.equals("n")){ //추가 참고 -- equalsIgnoreCase 시용시 대소문자 구분 X
                signup = true;
                //signup = fal se;

                System.out.println("회원가입이 종료되었습니다. 감사합니다.");
                System.exit(0);
            }
            else{
                System.out.println("---입력하신 값을 다시 확인해주세요---");
                continue;
            }

            ArrayList users = new ArrayList();
            while(true){
                HashMap user = new HashMap();

                System.out.print("아이디를 입력해주세요: ");
                String id = br.readLine();

                System.out.println("---당신의 아이디는 " +id+ " 입니다---");

                String pw = "";
                while(true){
                    System.out.print("비밀번호를 입력해주세요: ");
                    pw = br.readLine();

                    System.out.print("비밀번호 확인을 위해 한 번 더 입력해주세요: ");
                    String pwConfirm = br.readLine();

                    if(pw.equals(pwConfirm)){
                        break;
                    }
                    else{
                        System.out.println("---이전에 입력한 비밀번호와 다릅니다---");
                        System.out.print("비밀번호를 다시 한 번 더 입력해주세요(총 횟수 5번): ");
                        pwConfirm = br.readLine();
                        int cnt = 5;

                        while(!pw.equals(pwConfirm)) { //기회 한 번 틀린 경우(반복)
                            cnt--;
                            System.out.println("남은 비밀번호 작성 횟수는 " + cnt + "번입니다.");
                            System.out.print("비밀번호를 다시 한 번 더 입력해주세요: ");
                            pwConfirm = br.readLine();

                            if(pw.equals(pwConfirm)) { //기회를 얻은 후 비밀번호가 일치하는 경우
                                System.out.println("---다음 단계로 넘어가겠습니다---");
                                break;
                            }

                            if(cnt == 1){ //기회 모두 소진
                                System.out.println("5번의 기회를 모두 틀렸습니다.");
                                System.out.println("회원가입이 종료되었습니다. 다시 시도 바랍니다.");
                                System.exit(0);
                            }

                        }
                        String birth = "";
                        while(true){
                            System.out.print("생년월일 6자리를 입력해주세요: ");
                            birth = br.readLine();
                            if(birth.length() == 6){
                                break;
                            }
                            else{
                                System.out.print("6자리 생년월일을 다시 입력해주세요: ");
                            }
                        }
                    }
                }
            }

            //switch(){
            //case 1:
            //}
        }
    }
}
package week6.signup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _Signup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean signup = false;

        HashMap<String, String> user = new HashMap<>();

        while (!signup) {
            System.out.println("---회원가입을 하시겠습니까?---( Y / N )");
            System.out.print(">> ");

            String s = br.readLine();

            if (s.equals("Y") || s.equals("y")) {
                signup = false;

                System.out.println("회원가입을 계속 진행하겠습니다");
            }
            else if (s.equals("N") || s.equals("n")){
                signup = true;

                System.out.println("회원가입이 종료되었습니다. 감사합니다.");
                System.exit(0);
            }
            else{
                System.out.println("---입력하신 값을 다시 확인해주세요---");
                continue;
            }
            if(!signup){
                System.out.print("아이디를 입력해주세요: ");
                String id = br.readLine();

                System.out.println("---당신의 아이디는 " +id+ " 입니다---");

                System.out.print("비밀번호를 입력해주세요: ");
                String pw = br.readLine();

                System.out.print("비밀번호 확인을 위해 한 번 더 입력해주세요: ");
                String pwConfirm = br.readLine();

                if (pw.equals(pwConfirm)) { ////////////////////////
                }
                else{
                    System.out.println("---이전에 입력한 비밀번호와 다릅니다---");
                    System.out.print("비밀번호를 다시 한 번 더 입력해주세요(총 횟수 5번): ");
                    pwConfirm = br.readLine();

                    int cnt = 4;

                    for(int i = 0; i < 5; i++){ //cnt의 수만큼 반복하도록
                        if(!pw.equals(pwConfirm)){ //기회를 한 번 틀린 경우

                            if(cnt == 0){
                                System.out.println("5번의 기회를 모두 틀렸습니다.");
                                System.out.println("회원가입이 종료되었습니다. 다시 시도 바랍니다.");
                                System.exit(0);
                            }

                            System.out.println("남은 비밀번호 작성 횟수는 " + cnt +"번입니다");
                            System.out.print("비밀번호를 다시 한 번 더 입력해주세요: ");
                            pwConfirm = br.readLine();

                            if(pw.equals(pwConfirm)){
                                System.out.println("---다음 단계로 넘어가겠습니다---");
                                break;
                            }
                            cnt--;
                        }
                    }
                }
                String birth = "";

                if(!signup){
                    System.out.print("생년월일 6자리를 입력해주세요: ");
                    birth = br.readLine();

                    if(birth.length() != 6){

                        System.out.print("6자리의 생년월일로 다시 입력해주세요: ");
                        birth = br.readLine();

                        if(birth.length() == 6){
                            System.out.print("이메일을 입력해주세요: ");
                        }
                        else{
                            System.out.println("회원가입을 종료합니다.");
                            System.exit(0);
                        }
                    }
                    else{
                        System.out.print("이메일을 입력해주세요: ");
                    }
                }
                String email = br.readLine();

                user.put("ID", id);
                user.put("PassWord", pw);
                user.put("Birthday", birth);
                user.put("Email",email);

                System.out.println("아이디는 " + user.get("ID") + " 입니다"); //저장된 값들 보여주기 ->
                System.out.println("비밀번호는 " + user.get("PassWord") + " 입니다");
                System.out.println("생년월일은 " + user.get("Birthday") +" 입니다.");
                System.out.println("이메일은 " + user.get("Email") +" 입니다.");

                System.out.println("회원 가입이 완료 되었습니다. 감사합니다.");

                System.out.println("---비밀번호를 변경하시겠습니까?---(y/n)");
                System.out.print(">> ");
                String m = br.readLine();

                if(m.equals("Y") || m.equals("y")){
                    System.out.print("기존 비밀번호를 입력해주세요: ");
                    String correctPw = br.readLine();

                    if(pw.equals(correctPw)){
                        System.out.print("변경할 비밀번호를 입력해주세요: ");
                        String newPw = br.readLine();

                        //user.replace("password", newpw); ---------- 처리 방식 생각해보기 -> 살려뒀다가 나중 비밀번호 변경 당시 이전에 사용했던 비밀번호와 동일하면 변경할 패스워드 사용 못하게 Or 그냥 삭제
                        user.put("NewPassword", newPw);
                        System.out.println("비밀번호가 변경되었습니다.");
                        System.out.println("변경된 비밀번호는 "+ newPw +" 입니다");
                    }
                    else{
                        System.out.println("기존 비밀번호가 다릅니다.");
                        System.out.println("비밀번호 변경을 종료합니다.");
                    }
                }
                else{
                    System.out.println("비밀번호 변경을 하지 않습니다. 감사합니다.");
                    System.exit(0);
                }
                System.exit(0);
            }
        }
    }
}


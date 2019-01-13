package common;
import java.sql.SQLException;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tip_system = "����ϵͳ";
        String tip_menu = "��ѡ��˵�: ";       
        String tip_exit = "ϵͳ�˳�, ллʹ�� ! ";
        String infos =  "****��ӭ����" + tip_system + "****\n\t    " +
                         "1.��¼\n  \t    2.�˳�\n" +
                         "*****************************";
        String name,password;       
        
        System.out.println (infos);
        System.out.print (tip_menu);
        
		//�û���¼
        Scanner scanner = new Scanner (System.in);

        String input = null;
        while (true) {
            try {
                // input=scanner.next().trim();
                input = scanner.next();


                if (!(input).matches("1|2")) {
                    System.err.print(tip_menu);
                } else {
                    int nextInt = Integer.parseInt(input);
                    switch (nextInt) {
                        case 1://��¼
                            System.out.print("�������û�����");
                            name = scanner.next();
                            System.out.println("��������");
                            password = scanner.next();

                            User user = DataProcessing.searchUser(name, password);

                            if (user == null)
                                System.out.println("�û����������");
                            else
                                user.showMenu();

                            break;
                        case 2://�˳�
                            System.out.println(tip_exit);
                            scanner.close();
                            System.exit(0);
                            break;
                    }

                    System.out.println(infos);
                    System.out.print(tip_menu);
                }
                // System.out.println(infos);
                // System.out.print(tip_menu);
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
	}

}

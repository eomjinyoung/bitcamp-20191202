import java.util.ArrayList;
import java.util.Scanner;

public class StudentSelector {
  public static void main(String[] args) throws Exception {

    String[] names = {//
        "권혁윤", "김다혜", "김현진", "문국대", "손동영", "손영국", "송율리아", //
        "신은정", "오승우", "이승휘", "이준기", "전은혜", "조은성", //
        "김나영", "김용휘", "노기현", "박종윤", "손진영", "신나라", //
        "신지섭", "이선경", "이신애", "이지원", "정지윤", "채진호", "홍성준"//
    };


    ArrayList<String> list = new ArrayList<>();
    for (String name : names) {
      list.add(name);
    }

    Scanner keyboard = new Scanner(System.in);

    while (list.size() > 0) {
      int no = -1;
      for (int i = 0; i < 30; i++) {
        no = (int) (Math.random() * list.size());
        System.out.print(".");
        Thread.sleep(200);
      }

      Thread.sleep(3000);
      System.out.println(list.remove(no));
      keyboard.nextLine();
    }

    keyboard.close();
  }
}

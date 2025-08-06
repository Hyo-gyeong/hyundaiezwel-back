package arrayType;

public class ArrayIrregular {
  public static void main(String[] args) {
    int a[][] = new int[4][]; // 열이 null을 참조하게끔 초기화됨
    a[0] = new int[1];
    a[1] = new int[2];
    a[2] = new int[3];
    a[3] = new int[4];

    char b[][] = {{'a'}, {'b','c'}, {'d','e','f'}};

    String student[][] = {{"홍길동", "학생"}, {"성춘향", "3학년", "영문학과"}};

    System.out.println(student[0][1]);

    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a[i].length; j++){
        a[i][j] = j;
      }
    }
  }
}

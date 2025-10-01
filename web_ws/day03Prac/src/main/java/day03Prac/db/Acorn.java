package day03Prac.db;

public class Acorn {
   
   String id;
   String pw;
   String name;
   int point;
   
   //생성자
   public Acorn() {}
   
   public Acorn(String id, String pw, String name, int point) {
      super();
      this.id = id;
      this.pw = pw;
      this.name = name;
      this.point = point;
   }
   
   //toString() 오버라이드
   @Override
   public String toString() {
      return "Acorn [id=" + id + ", pw=" + pw + ", name=" + name + ", point=" + point + "]";
   }
   
   //getter
   public String getId() {
      return id;
   }
   
   public String getPw() {
      return pw;
   }
   
   public String getName() {
      return name;
   }
   
   public int getPoint() {
      return point;
   }

}
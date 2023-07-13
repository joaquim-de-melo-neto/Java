import java.util.Comparator;

 public class TimeComparator implements Comparator<Time2>
 {
   @Override
   public int compare(Time2 time1, Time2 time2)
   {
      int hourDifference = time1.getHour() - time2.getHour();
  
      if (hourDifference != 0) // testa a primeira hora
        return hourDifference;
  
      int minuteDifference = time1.getMinute() - time2.getMinute();
  
      if (minuteDifference != 0) // então testa o minuto
        return minuteDifference;
  
      int secondDifference = time1.getSecond() - time2.getSecond();
        return secondDifference;
  }
} // fim da classe TimeComparator

// Método sort de Collections com um objeto Comparator personalizado.
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Collections;

 public class Sort3
 {
   public static void main(String[] args)
   {
     List<Time2> list = new ArrayList<>(); // cria List
  
     list.add(new Time2(6, 24, 34));
     list.add(new Time2(18, 14, 58));
     list.add(new Time2(6, 05, 34));
     list.add(new Time2(12, 14, 58));
     list.add(new Time2(6, 24, 22));
  
   // gera saída de elementos List
     System.out.printf("Unsorted array elements:%n%s%n", list);
  
  // classifica em ordem utilizando um comparador 
     Collections.sort(list, new TimeComparator());
  
   // gera saída de elementos List
     System.out.printf("Sorted list elements:%n%s%n", list);
   }
 } // fim da classe Sort3

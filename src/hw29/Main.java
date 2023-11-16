package hw29;
/**
 * 15/11/2023 homework * * @author Boris Iurciuc (cohort36)
 */
public class Main {

    public static void main(String[] args) {
      double[] arr = {4, 2, 7, 1, -5, 6};

    arrayList arrayList = new arrayList(arr);

      System.out.println(arrayList.contains(arrayList.indexOf(7)));

      System.out.println(arrayList.isEmpty());

      arrayList.set(arrayList.indexOf(1), 10);

      arrayList.add(arrayList.indexOf(7), 123);

      arrayList.remove(arrayList.indexOf(7));

      arrayList.addLast(222);

      arrayList.removeLast();
      System.out.println(arrayList);

      arrayList.removeVal(7);

      arrayList.replace(2, -111);
    }
}

package BtvnBuoi2;
import java.util.Scanner;

public class Bai2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = null;
    int n = 0;

    while (true) {
      System.out.println("-----------------------");
      System.out.println("1. Nhập mảng");
      System.out.println("2. Hiển thị mảng");
      System.out.println("3. Thêm phần tử vào mảng");
      System.out.println("4. Xóa phần tử trong mảng");
      System.out.println("5. Hiển thị mảng đảo ngược");
      System.out.println("6. Hiển thị phần tử đầu và các số chia hết cho nó");
      System.out.println("7. Tính tổng các số nguyên tố trong mảng");
      System.out.println("8. Thoát");

      System.out.print("Nhập lựa chọn của bạn: ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Nhập số phần tử của mảng: ");
          n = sc.nextInt();
          arr = new int[n];
          for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
          }
          break;
        case 2:
          if (arr == null) {
            System.out.println("Mảng chưa được khởi tạo!");
          } else {
            System.out.println("Mảng vừa tạo là: ");
            for (int i = 0; i < n; i++) {
              System.out.print(arr[i] + " ");
            }
            System.out.println();
          }
          break;
        case 3:
          if (arr == null) {
            System.out.println("Mảng chưa được khởi tạo!");
          } else {
            System.out.print("Nhập giá trị cần thêm: ");
            int value = sc.nextInt();
            System.out.print("Nhập vị trí muốn thêm (từ 1 đến " + n + "): ");
            int index = sc.nextInt() - 1;
            if (index < 0 || index > n) {
              System.out.println("Vị trí không hợp lệ!");
            } else {
              arr = insertElement(arr, value, index, n);
              n++;
              System.out.println("Đã thêm phần tử mới vào mảng!");
            }
          }
          break;
        case 4:
          if (arr == null) {
            System.out.println("Mảng chưa được khởi tạo!");
          } else {
            System.out.print("Nhập vị trí muốn xóa (từ 1 đến " + n + "): ");
            int index = sc.nextInt() - 1;
            if (index < 0 || index >= n) {
              System.out.println("Vị trí không hợp lệ!");
            } else {
              arr = deleteElement(arr, index, n);
              n--;
              System.out.println("Đã xóa phần tử trong mảng!");
            }
          }
          break;
        case 5:
          if (arr == null) {
            System.out.println("Mảng chưa được khởi tạo!");
          } else {
            int[] reversedArr = reverseArray(arr, n);
            System.out.println("Mảng đảo ngược là: ");
            for (int i = 0; i < n; i++) {
              System.out.print(reversedArr[i] + " ");
            }
            System.out.println();
          }
          break;
        case 6:
          if (arr == null) {
            System.out.println("Mảng chưa được khởi tạo!");
          } else {
            int element = arr[0];
            System.out.println("Phần tử đầu tiên của mảng là: " + element);
            System.out.println("Các số chia hết cho " + element + " trong mảng là: ");
            for (int i = 0; i < n; i++) {
              if (arr[i] % element == 0) {
                System.out.print(arr[i] + " ");
              }
            }
            System.out.println();
          }
          break;
        case 7:
          if (arr == null) {
            System.out.println("Mảng chưa được khởi tạo!");
          } else {
            int sum = sumOfPrimeNumbers(arr, n);
            System.out.println("Tổng các số nguyên tố trong mảng là: " + sum);
          }
          break;
        case 8:
          System.out.println("Chương trình đã thoát!");
          return;
        default:
          System.out.println("Lựa chọn không hợp lệ!");
          break;
      }
    }
  }

  public static int[] insertElement(int[] arr, int value, int index, int n) {
    int[] newArray = new int[n + 1];
    for (int i = 0; i < index; i++) {
      newArray[i] = arr[i];
    }
    newArray[index] = value;
    for (int i = index + 1; i < n + 1; i++) {
      newArray[i] = arr[i - 1];
    }
    return newArray;
  }

  public static int[] deleteElement(int[] arr, int index, int n) {
    int[] newArray = new int[n - 1];
    for (int i = 0; i < index; i++) {
      newArray[i] = arr[i];
    }
    for (int i = index; i < n - 1; i++) {
      newArray[i] = arr[i + 1];
    }
    return newArray;
  }

  public static int[] reverseArray(int[] arr, int n) {
    int[] reversedArr = new int[n];
    for (int i = 0; i < n; i++) {
      reversedArr[i] = arr[n - i - 1];
    }
    return reversedArr;
  }

  public static boolean isPrimeNumber(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int sumOfPrimeNumbers(int[] arr, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      if (isPrimeNumber(arr[i])) {
        sum += arr[i];
      }
    }
    return sum;
  }
}

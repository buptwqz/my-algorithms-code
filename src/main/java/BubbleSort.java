/**
 * @Author: Qizheng Wang
 * @Email: qizheng.wang@foxmail.com
 * @Date: 2025/3/22 下午7:24
 * @GitHub: https://github.com/buptwqz
 * @Description: 冒泡排序
 **/
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0;i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

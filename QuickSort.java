package algorithm;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = { 49, 38, 65, 97, 76, 13, 27 };
		sort(array, 0, array.length - 1);
	}

	/**
	 * һ������Ԫ����ɴ˷�����key��߶���keyС��key�ұ߶���key��
	 * 
	 * 
	 ** @param array��������
	 * 
	 * 
	 ** @param low������ʼλ��
	 * 
	 * 
	 ** @param high�������λ��
	 * 
	 * 
	 ** @return��Ԫ����������
	 */
	private static int sortUnit(int[] array, int low, int high) {
		int key = array[low];
		while (low < high) {
			/* �Ӻ���ǰ������keyС��ֵ */
			while (array[high] >= key && high > low)
				high--;
			/* ��keyС�ķ���� */
			array[low] = array[high];
			/* ��ǰ���������key���ֵ����key��ķ��ұ� */
			while (array[low] <= key && high > low)
				low++;
			/* ��key��ķ��ұ� */
			array[high] = array[low];
		}
		//��߶���keyС���ұ߶���key�� ��key�����α굱ǰλ�á� ��ʱlow����high
		array[low] = key;
		//��ӡ
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();

		return high;
	}

	/**
	 * ��������
	 *
	 * @paramarry
	 * @return
	 */
	public static void sort(int[] array, int low, int high) {
		if (low >= high)
			return;
		/* ���һ�ε�Ԫ���� */
		int index = sortUnit(array, low, high);
		/* ����ߵ�Ԫ�������� */
		sort(array, low, index - 1);
		/* ���ұߵ�Ԫ�������� */
		sort(array, index + 1, high);
	}
}

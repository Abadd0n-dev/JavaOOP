package Lesson3;

public class Main {
    public static void main(String[] args) {
        int[] arr = {32, 455, 435, 41, 10, 22};

        Task2 list = new Task2();
		list.Add(4);
		list.Add(1);
		list.Add(3);
		list.Add(5);

		for(Integer num : list){
			System.out.println(num);
		}

		System.out.println();
		System.out.println(list.Get(23));
	}
}


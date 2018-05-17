import java.util.Arrays;

import javax.swing.JOptionPane;

public class SimpleSorter {
	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog(null, "Give me three numbers. Seperate the numbers with spaces. For example, 3 5 9");
		String[] a = num.split(" ");
		int[] b = new int[3];
		b[0] = Integer.parseInt(a[0]);
		b[1] = Integer.parseInt(a[1]);
		b[2] = Integer.parseInt(a[2]);
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		int[] c = new int[3];
		c[2] = b[0];
		c[1] = b[1];
		c[0] = b[2];
		System.out.println(Arrays.toString(c));
		
		
	}
}

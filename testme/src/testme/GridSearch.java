package testme;

import java.util.ArrayList;
import java.util.Scanner;

public class GridSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}

			boolean found = false;
			ArrayList listIndex =  new ArrayList();
			for (int G_i = 0; G_i < G.length && !found; G_i++) {
				if (G[G_i].contains(P[0])) {
					int j = G_i;
					int p_i = 0;
					listIndex = new ArrayList();
					for(int x = 0; x<G[G_i].length();){
						int index = G[G_i].indexOf(P[0],x);
						if(index != -1){
							listIndex.add(index);
							x=index+1;
						}else{
						x++;}
					}
					while (j < G.length && p_i < P.length) {
						if (G[j].contains(P[p_i]) && listIndex.contains(G[j].indexOf(P[p_i]))) {
							p_i++;
							j++;
							found = true;
						} else {
							found = false;
							break;
						}
					}
				}
			}
			if (found) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}
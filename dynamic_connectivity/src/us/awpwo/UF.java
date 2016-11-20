package us.awpwo;

public class UF {

	protected int[] id;
	private int[] N;
	
	public UF(int N) {
		id = new int[N];
		this.N = new int[N];
		for (int i = 0; i < N; ++i) {
			id[i] = i;
		}
	}
	
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		if (i == j) return;
		 if (sz[i] < sz[j]) {
		 id[i] = j;
		 sz[j] += sz[i];
		 }
		else {
		 id[j] = i;
		 sz[i] += sz[j];
		}

	}
	
	public boolean connected(int p, int q) {
		return false;
	}
	
}
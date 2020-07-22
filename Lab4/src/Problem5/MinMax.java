package Problem5;

public class MinMax {
	static class Pair {
		public int min;
		public int max;
		
		public Pair(int min, int max) {
			this.min = min;
			this.max = max;
		}
	}
		public Pair minmax(int values[]) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int i = 0; i < values.length; i++) {
				if (min > values[i])
					min = values[i];
				if (max < values[i])
					max = values[i];
			}
			return new Pair(min, max);
		}
	}

	



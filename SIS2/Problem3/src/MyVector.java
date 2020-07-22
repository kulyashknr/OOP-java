
public class MyVector extends MyCollection {
		int a = 100000;
		public int size;
		public int[] vector = new int[a];
		
		public MyVector() {
			size = 0;
		}
		
		public MyVector (int[] a) {
			size = a.length;
			for (int i = 0; i < size; i++)
				vector[i] = a[i];
		}
		
		public void add (int element) {
			vector[size] = element;
			size++;
		}
		
		public void add (int index, int element) {
			if (index > size) {
				System.out.print ("Error");
				return;
			}
		
			size++;
			for (int i = size; i >= index; i--) {
				int a = vector[i];
				int b = vector[i - 1];
				vector[i - 1] = b;
				vector[i] = a;
			}
			vector[index] = element;
		}
		
		public void clear () {
			for (int i = size - 1; i >= 0; i--)
				vector[i] = 0;
			size = 0;
		}
		
		public boolean contains (int o) {
			for (int i = 0; i < size; i++)
				if (o == vector[i])
					return true;
			return false;
		}
		
		public int indexOf (int o) {
			for (int i = 0; i < size; i++)
				if (o == vector[i])
					return i;
			return -1;
		}
		
		public void insertElementAt (int index, int x) {
			if (index >= size) {
				System.out.print ("Error");
				return;
			}
			vector[index] = x;
		}
		
		public boolean isEmpty() {
			if (size != 0)
				return false;
			return true;
		}
		
		public void removeElementAt (int index) {
			if (index >= size) {
				System.out.print ("Error");
				return;
			}
			for (int i = index; i < size; i++) {
				int x = vector[i];
				int y = vector[i + 1];
				vector[i + 1] = y;
				vector[i] = x;
			}
			vector[size - 1] = 0;
			size--;
		}
		
		public void remove (int element) {
			for (int i = 0; i < size; i++) {
				if (vector[i] == element) {
					removeElementAt (i);
					return;
				}
			}
		}
		
		public void removeAll (int element) {
			for (int i = 0; i < size; i++) {
				if (vector[i] == element) {
					removeElementAt (i);
				}
			}
		}
		
		public void reverse () {
			for (int i = 0; i < size / 2; i++) {
				int a = vector[i];
				int b = vector[size - i - 1];
				vector[i] = b;
				vector[size - i - 1] = a;
			}
		}
		
		public int size () {
			return size;
		}
		
		public void set (int index, int element) {
			if (index >= size) {
				System.out.print("Error");
			}
			vector[index] = element;
		}
		
		public int[] toArray () {
			return vector;
		}
		
		public String toString() {
			String s = "Vector: {";
			for (int i = 0; i <= size - 1; i++) {
				s += vector[i];
				if(i != size-1)
					s+=" ";
			}
			return s + "}";
		}

		public void BubbleSort(int[] a) {  
			int b = a.length;  
			int x = 0;  
			for(int i = 0; i < b; i++){  
				for(int j = 1; j < (b - i); j++){  
					if(a[j - 1] > a[j]){                                
						x = a[j - 1];  
						a[j - 1] = a[j];  
						a[j] = x;  
			                }  
			                          
			             }  
			         }
			    }			
		}
	

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		
		int[] counts = new int[10];
		int[] bonus = new int[15];
		int[] bestScores = new int[5];
		Random random = new Random();
		
		System.out.println("a) Configure os 10 elementos do array de inteiros counts como 0.");
		for(int i = 0; i < counts.length; i++){
			counts[i] = 0;
		}
		System.out.printf("counts\t");
		for(int i = 0; i < counts.length; i++){
			System.out.printf("%d\t", counts[0]);
		}
		
		System.out.println("\n\nb) Adicione um a cada um dos 15 elementos do array de inteiros bonus.");
		for(int i = 0; i < bonus.length; i++){
			bonus[i] += 1;
		}
		System.out.printf("bonus\t");
		for(int i = 0; i < bonus.length; i++){
			System.out.printf("%d\t", bonus[i]);
		}
		
		System.out.println("\n\nc) Exiba os cinco valores de inteiros bestScores em formato de coluna.");
		for(int i = 0; i < bestScores.length; i++){
			bestScores[i] = 1 + random.nextInt(10);
		}
		System.out.printf("\tbestScores\n");
		for(int i = 0; i < bestScores.length; i++){
			System.out.printf("\t%d\n", bestScores[i]);
		}
		
		

	}

}

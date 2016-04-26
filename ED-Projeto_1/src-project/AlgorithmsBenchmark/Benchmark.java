package AlgorithmsBenchmark;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ThreadLocalRandom;

import Sort.AbstractSort;
import Sort.InsertionSort;
import Lists.LinkedList;
import Lists.List;
import Sort.MergeSortArrayAuxiliar;


/**
 * Classe que representa uma medicao do processo de ordenacao.
 * 
 * @author rbonifacio
 */
class Medicao {
	private static final String SEP = ",";

	private String algoritmo;
	private int tamanhoAmostra;
	private int repeticao;
	private long tempoOrdenacao;

	public Medicao(String algoritmo, int tamanhoAmostra, int repeticao, long tempoOrdenacao) {
		this.algoritmo = algoritmo;
		this.tamanhoAmostra = tamanhoAmostra;
		this.repeticao = repeticao;
		this.tempoOrdenacao = tempoOrdenacao;
	}

	public String getAlgoritmo() {
		return algoritmo;
	}

	public int getTamanhoAmostra() {
		return tamanhoAmostra;
	}

	public int getRepeticao() {
		return repeticao;
	}

	public long getTempoOrdenacao() {
		return tempoOrdenacao;
	}

	@Override
	public String toString() {
		return algoritmo + SEP + tamanhoAmostra + SEP + repeticao + SEP + tempoOrdenacao;
	}
}

/**
 * Classe que representa o programa principal, e que eh responsavel por coletar
 * o tempo de ordenacao de diferentes algoritmos.
 * 
 * @author rbonifacio
 */
public class Benchmark {
	private static final int REPETICOES = 1;
	private static final int AMOSTRAS[] = { 20, 100, 1000 };

	/*
	 * Gera uma lista de valores aleatorios entre zero e tamanhoAleatorio
	 * 
	 * @param tamanho define tanto a quantidade de elementos da lista quanto os
	 * possiveis valores presentes na lista, que precisam estar entre zero e
	 * tamanhoAleatorio.
	 * 
	 * @return lista de valores gerados de forma aleatoria.
	 */
	private static List geraValoresAleatorios(int tamanhoAmostra) {
		List res = new LinkedList();

		for (int i = 0; i < tamanhoAmostra; i++) {
			res.insert(0, ThreadLocalRandom.current().nextInt(0, tamanhoAmostra + 1));
		}
		return res;
	}

	/*
	 * Programa principal!
	 */
	public static void main(String args[]) {
		// array com as implementacoes do algoritmos.
		// vc deve adicionar a esse array as suas proprias
		// implementacoes, onde cada implementacao precisa
		// implementar a interface AbstractSort.

		AbstractSort arr[] = { new InsertionSort(), new MergeSortArrayAuxiliar() };

		String nomeArquivo = "bench-" + System.currentTimeMillis();
		Path arquivo = Paths.get(nomeArquivo);

		try (BufferedWriter writer = Files.newBufferedWriter(arquivo)) {
			for (AbstractSort s : arr) { 
				for (int tamanhoAmostra : AMOSTRAS) { 
					for (int i = 0; i < REPETICOES; i++) { 
						List original = geraValoresAleatorios(tamanhoAmostra);

						long t1 = System.nanoTime();
						s.sort(original);
						long t2 = System.nanoTime();

						Medicao m = new Medicao(s.getClass().toString(), tamanhoAmostra, i, t2 - t1);
						writer.write(m.toString() + "\n");
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Um problema ocorreu na execucao do benchmarking");
			System.out.println(e.getMessage());
		}
	}
}
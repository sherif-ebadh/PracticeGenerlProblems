
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SelectKWords_Java8 {

	public static void main(String[] args) {

		try {
			findTopHundredThousandFrequentPhrases("c:\\test.txt",3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	// Another solution using Java 8
	static List<Map.Entry<String, Integer>> findTopHundredThousandFrequentPhrases(String filePath, int k) throws IOException {
		Map<String, Integer> occurrences = new HashMap<>();

		File file = new File(filePath);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		try {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] phrases = line.split("\\|");
				for (String phrase : phrases) {
					if (!occurrences.containsKey(phrase)) {
						occurrences.put(phrase, 1);
					} else {
						occurrences.put(phrase, occurrences.get(phrase) + 1);
					}
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return Collections.emptyList();
		}finally{
			bufferedReader.close();
		}

		List<Map.Entry<String, Integer>> hashMapEntries = new ArrayList<>(occurrences.entrySet());
		Collections.sort(hashMapEntries, (e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));

		return hashMapEntries.stream().limit(k).collect(Collectors.toList());
	}

}
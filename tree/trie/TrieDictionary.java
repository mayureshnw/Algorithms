import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
// import java.rmi.RemoteException;
// import java.util.logging.Level;
// import java.util.logging.Logger;

class TrieDictionary {
	private static class Node {
		Node[] references = new Node[26];
		boolean endOfWord;

		public Node() {
			endOfWord = false;
			for(int i=0;i<26;i++) {
				references[i] = null;
			}
		}
	}

	Node root = new Node();

	public void insert(String word) {
		int level;
		int wordlength = word.length();
		int charindex;

		Node crawl = root;

		for(level=0;level<wordlength;level++) {
			charindex = word.charAt(level)-'a';
			if(crawl.references[charindex]==null) {
				crawl.references[charindex] = new Node();
			}

			crawl = crawl.references[charindex];
		}
		crawl.endOfWord = true;
	}

	public boolean search(String word) {
		int level;
		int wordlength = word.length();
		int charindex;
		Node crawl = root;
		for(level=0;level<wordlength;level++) {
			charindex = word.charAt(level)-'a';
			if(crawl.references[charindex]==null) return false;

			crawl = crawl.references[charindex];
		}

		return crawl!=null && crawl.endOfWord;
	}

	public void importAndIndex(String filepath) {
		ArrayList<String> arr = new ArrayList<String>();
    try (BufferedReader br = new BufferedReader(new FileReader(filepath)))
    {
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            arr.add(sCurrentLine);
        }
    }
		catch (IOException e) {
        e.printStackTrace();
				System.out.println(e);
    }

		for(int i=0;i<arr.size();i++) {
			this.insert(arr.get(i));
		}
	}

	public static void main(String[] args) {
		String keys[] = {"the", "a", "there", "answer", "any","by", "bye", "their"};
		TrieDictionary dict = new TrieDictionary();
		dict.importAndIndex(".\\words.txt");

		for(int i=0;i<keys.length;i++) {
			System.out.println(keys[i]+" "+dict.search(keys[i]));
		}
		System.out.println(dict.search("zippy"));
	}
}

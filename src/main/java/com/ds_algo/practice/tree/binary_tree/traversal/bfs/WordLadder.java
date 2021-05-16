package com.ds_algo.practice.tree.binary_tree.traversal.bfs;

import java.util.*;

public class WordLadder {
    int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String> wordSet = new HashSet<>(wordList);
        Queue<String> queue  = new LinkedList<>();
        queue.offer(beginWord);
        queue.offer(null);
        int result = 1;
        while(!queue.isEmpty()){
            String word = queue.poll();
            if(word == null){
                if(!queue.isEmpty()){
                    queue.offer(null);
                    result++;
                }
            }else {
                for(int i=0;i<beginWord.length();i++){
                    for(char letter = 'a' ;letter<='z';letter++){
                        StringBuilder sb = new StringBuilder(word);
                        sb.setCharAt(i, letter);
                        if(wordSet.contains(sb.toString())){
                            if(sb.toString().equals(endWord)) return result+1;
                            wordSet.remove(sb.toString());
                            queue.offer(sb.toString());
                        }
                    }

                }
            }
        }
        return 0;

    }
}

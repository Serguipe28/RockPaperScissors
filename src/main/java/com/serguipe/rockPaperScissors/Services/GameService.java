package com.serguipe.rockPaperScissors.Services;

import com.serguipe.rockPaperScissors.Models.Paper;
import com.serguipe.rockPaperScissors.Models.Rock;
import com.serguipe.rockPaperScissors.Models.Scissors;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class GameService {

    public String play(String trie){
        String selected = pcTrie();
        String result = "" ;
        result = verification(trie, selected, result);
        return result ;

    }

    private String verification(String trie, String selected, String result) {
        if(Objects.equals(trie, selected)){
            result = trie + " vs "+ selected + " = Empate";
        }else if (Objects.equals(trie, "Rock")){
            if (Objects.equals(selected, "Paper")){
                result = trie +" vs " + selected + " = Gana " + selected;
            }else {
                result = trie +" vs " + selected + " = Gana " + trie;
            }
        }else if (Objects.equals(trie, "Paper")){
            if (Objects.equals(selected, "Rock")){
                result = trie +" vs " + selected + " = Gana " + trie;
            }else {
                result = trie + " vs " +selected + " = Gana " + selected;
            }
        }else if (Objects.equals(trie, "Scissors")){
            if (Objects.equals(selected, "Rock")){
                result = trie + " vs " +selected + " = Gana " + selected;
            }else {
                result = trie + " vs " + selected + " = Gana " + trie;
            }
        }
        return result;
    }

    private String pcTrie() {
        int select = (int)(Math.random()*3);
        List<String> playerPc = new ArrayList<String>();
        playerPc.add(0, new Rock().getName());
        playerPc.add(1, new Paper().getName());
        playerPc.add(2, new Scissors().getName());

        return playerPc.get(select);
    }
}

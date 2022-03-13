package com.serguipe.rockPaperScissors.Services;

import com.serguipe.rockPaperScissors.Models.Paper;
import com.serguipe.rockPaperScissors.Models.Rock;
import com.serguipe.rockPaperScissors.Models.Scissors;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    public String play(){

        List playerPc = new ArrayList();
        int select = (int)(Math.random()*3);
        playerPc.add(0, new Rock());
        playerPc.add(1, new Paper());
        playerPc.add(2, new Scissors());



        return playerPc.get(select).toString();

    }
}

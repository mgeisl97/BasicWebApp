package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "mara2";
        } else if (query.contains("plus")){ // TODO extend the programm here
            String [] i = query.split(" ");
            int t = -1;
            int a = 0;
            int b = 0;
            for(String s : i) {
                t++;
                if(s.equals("plus")) {
                    a = Integer.parseInt(i[t+1]);
                    b = Integer.parseInt(i[t-1]);
                }
            }
            int result = a + b;
            return "result";
        }
    }
}

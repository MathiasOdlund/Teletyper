package com.teletyper.aang.wordlist;


public record Wordlist(
        Integer wpm,
        String username,
        Integer score
) {

    @Override
    public Integer wpm() {
        return wpm;
    }

    @Override
    public String toString() {
        return "Wordlist{" +
                "wpm=" + wpm +
                ", username='" + username + '\'' +
                ", score=" + score +
                '}';
    }
}

package com.stiw3054.problem.p1;

import java.io.IOException;

public class RunCommand {

    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("git clone https://github.com/zhamri/MyClass-JSoup.git");

    }
}
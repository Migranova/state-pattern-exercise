package com.example.examplestatemachine;

public class RejectState extends State {

    public RejectState(StateContext sc) {
        this.sc = sc;
        this.accept = false;
    }


    @Override
    public void actionA() {
        super.actionA();

        if (sc.getisFirstA()) {
            sc.setState(sc.getAcceptState());
        }
    }

    @Override
    public void actionB() {
        super.actionB();

        if (!sc.getisFirstA()) {
            sc.setState(sc.getAcceptState());
        }
    }
}
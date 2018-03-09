
package com.example.examplestatemachine;

public class StateContext {
    State AcceptState ;
    State RejectState ;
    State initial;
    private Boolean isFirstA = null;

    public StateContext () {
        this.RejectState = new RejectState(this);
        this.AcceptState = new AcceptState(this);
        initial = RejectState ;
    }

    public boolean isAccept() {
        return initial.isAccept();
    }

    public void setState(State initial) {
        this.initial = initial;
    }

    public State getAcceptState() {
        return this.AcceptState;
    }

    public State getRejectState() {
        return this.RejectState;
    }

    public Boolean getisFirstA() {
        return isFirstA;
    }
}

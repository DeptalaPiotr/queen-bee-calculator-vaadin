package com.queenbeecalculatorvaadin.model;

import java.time.LocalDateTime;

public class CalculatorModel {

    LocalDateTime beeQueenIsolation;
    LocalDateTime raisingColony;
    LocalDateTime larvaeTransfer;
    LocalDateTime returningQueen;
    LocalDateTime returningQueenNoLater;
    LocalDateTime sealingWax;
    LocalDateTime histolysis;
    LocalDateTime insulation;
    LocalDateTime possibleQueenHatching;
    LocalDateTime queenHatching;

    public CalculatorModel() {
    }

    public LocalDateTime getBeeQueenIsolation() {
        return beeQueenIsolation;
    }

    public void setBeeQueenIsolation(LocalDateTime beeQueenIsolation) {
        this.beeQueenIsolation = beeQueenIsolation;
    }

    public LocalDateTime getRaisingColony() {
        return raisingColony;
    }

    public void setRaisingColony(LocalDateTime raisingColony) {
        this.raisingColony = raisingColony;
    }

    public LocalDateTime getLarvaeTransfer() {
        return larvaeTransfer;
    }

    public void setLarvaeTransfer(LocalDateTime larvaeTransfer) {
        this.larvaeTransfer = larvaeTransfer;
    }

    public LocalDateTime getReturningQueen() {
        return returningQueen;
    }

    public void setReturningQueen(LocalDateTime returningQueen) {
        this.returningQueen = returningQueen;
    }

    public LocalDateTime getReturningQueenNoLater() {
        return returningQueenNoLater;
    }

    public void setReturningQueenNoLater(LocalDateTime returningQueenNoLater) {
        this.returningQueenNoLater = returningQueenNoLater;
    }

    public LocalDateTime getSealingWax() {
        return sealingWax;
    }

    public void setSealingWax(LocalDateTime sealingWax) {
        this.sealingWax = sealingWax;
    }

    public LocalDateTime getHistolysis() {
        return histolysis;
    }

    public void setHistolysis(LocalDateTime histolysis) {
        this.histolysis = histolysis;
    }

    public LocalDateTime getInsulation() {
        return insulation;
    }

    public void setInsulation(LocalDateTime insulation) {
        this.insulation = insulation;
    }

    public LocalDateTime getPossibleQueenHatching() {
        return possibleQueenHatching;
    }

    public void setPossibleQueenHatching(LocalDateTime possibleQueenHatching) {
        this.possibleQueenHatching = possibleQueenHatching;
    }

    public LocalDateTime getQueenHatching() {
        return queenHatching;
    }

    public void setQueenHatching(LocalDateTime queenHatching) {
        this.queenHatching = queenHatching;
    }

    @Override
    public String toString() {
        return "CalculatorModel{" +
                "beeQueenIsolation=" + beeQueenIsolation +
                ", raisingColony=" + raisingColony +
                ", larvaeTransfer=" + larvaeTransfer +
                ", returningQueen=" + returningQueen +
                ", returningQueenNoLater=" + returningQueenNoLater +
                ", sealingWax=" + sealingWax +
                ", histolysis=" + histolysis +
                ", insulation=" + insulation +
                ", possibleQueenHatching=" + possibleQueenHatching +
                ", queenHatching=" + queenHatching +
                '}';
    }
}

package com.example.TaskManager.enums;

public enum Status {
    InProgress,Finished, Cancelled;

    @Override
    public String toString() {
        switch (this){
            case Finished -> {
                return "Finished";
            }

            case Cancelled -> {
                return "Cancelled";
            }

            case InProgress -> {
                return "InProgress";
            }

            default -> {
                return "Unknown status";
            }
        }
    }
}

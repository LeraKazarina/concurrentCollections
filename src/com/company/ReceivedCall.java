package com.company;

public class ReceivedCall {
    private String phoneNumber;

    public ReceivedCall() {
        createPhoneNumber();
    }

    private void createPhoneNumber() {
        int minBound = 100_000_000;
        int maxBound = 999_999_999;

        phoneNumber = String.valueOf((int)(Math.random() * ((maxBound - minBound) + 1)) + minBound);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

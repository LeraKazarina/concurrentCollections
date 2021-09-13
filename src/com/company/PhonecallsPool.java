package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

public class PhonecallsPool {

    private ConcurrentLinkedQueue<ReceivedCall> callPool = new ConcurrentLinkedQueue<>();
    private boolean isAccess = false;

    public void addIncomeCall(ReceivedCall call) {
        callPool.add(call);
    }

    //оператор отвечает на звонок
    public ReceivedCall removeIncomingCallOrReturnNullIfEmpty() {
        return callPool.poll();
    }

    public boolean isEmpty() {
        if (callPool.peek() == null) {
            return true;
        }
        return false;
    }

}

package com.bytedance.globalpayment.iap.model;

import com.bytedance.covode.number.Covode;

public enum IapPaymentMethod {
    GOOGLE("GP"),
    AMAZON("amazon"),
    UNKNOWN("UNKNOWN");
    
    public final String channelName;

    static {
        Covode.recordClassIndex(17394);
    }

    private IapPaymentMethod(String str) {
        this.channelName = str;
    }
}

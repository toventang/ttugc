package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.ar */
public enum EnumC9534ar {
    TEST("TEST"),
    FIRE("FIRE"),
    GOOGLE("GooglePay"),
    DIAMOND("DIAMOND"),
    ONECARD("OneCard"),
    VISA("Visa"),
    MASTERCARD("MasterCard"),
    BOKU("Pay by mobile"),
    HUOLI("Huoli"),
    CJ("CJ"),
    UNKNOWN("UNKNOWN");
    

    /* renamed from: a */
    String f23152a;

    public final String getValue() {
        return this.f23152a;
    }

    static {
        Covode.recordClassIndex(11073);
    }

    private EnumC9534ar(String str) {
        this.f23152a = str;
    }
}

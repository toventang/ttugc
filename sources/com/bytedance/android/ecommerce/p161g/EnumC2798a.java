package com.bytedance.android.ecommerce.p161g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.g.a */
public enum EnumC2798a {
    CLOSED("closed"),
    EXPIRED("expired"),
    INIT("init"),
    SUCCESS("success"),
    FAILED("failed"),
    UNKNOW("unknow");
    

    /* renamed from: a */
    private String f8387a;

    public final String getStatus() {
        return this.f8387a;
    }

    static {
        Covode.recordClassIndex(3224);
    }

    public static EnumC2798a getOrderStatus(String str) {
        EnumC2798a[] values = values();
        for (EnumC2798a aVar : values) {
            if (TextUtils.equals(aVar.f8387a, str)) {
                return aVar;
            }
        }
        return UNKNOW;
    }

    private EnumC2798a(String str) {
        this.f8387a = str;
    }
}

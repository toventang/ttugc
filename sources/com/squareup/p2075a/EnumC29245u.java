package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.squareup.a.u */
public enum EnumC29245u {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: a */
    private final String f69337a;

    public final String toString() {
        return this.f69337a;
    }

    static {
        Covode.recordClassIndex(35594);
    }

    public static EnumC29245u get(String str) {
        EnumC29245u uVar = HTTP_1_0;
        if (str.equals(uVar.f69337a)) {
            return uVar;
        }
        EnumC29245u uVar2 = HTTP_1_1;
        if (str.equals(uVar2.f69337a)) {
            return uVar2;
        }
        EnumC29245u uVar3 = HTTP_2;
        if (str.equals(uVar3.f69337a)) {
            return uVar3;
        }
        EnumC29245u uVar4 = SPDY_3;
        if (str.equals(uVar4.f69337a)) {
            return uVar4;
        }
        throw new IOException("Unexpected protocol: ".concat(String.valueOf(str)));
    }

    private EnumC29245u(String str) {
        this.f69337a = str;
    }
}

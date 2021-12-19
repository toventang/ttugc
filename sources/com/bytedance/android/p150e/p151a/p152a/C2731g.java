package com.bytedance.android.p150e.p151a.p152a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.bytedance.android.e.a.a.g */
public final class C2731g {
    static {
        Covode.recordClassIndex(3157);
    }

    /* renamed from: b */
    public static long m7902b(C2730f fVar) {
        return fVar.mo7314f();
    }

    /* renamed from: a */
    public static boolean m7901a(C2730f fVar) {
        int e = fVar.mo7313e();
        if (e == 0) {
            return false;
        }
        if (e == 1) {
            return true;
        }
        throw new IOException(C1764a.m5928a("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(e)}));
    }

    /* renamed from: c */
    public static void m7903c(C2730f fVar) {
        int i = fVar.f8137a;
        if (i == 0) {
            fVar.mo7314f();
        } else if (i == 1) {
            fVar.mo7316h();
        } else if (i == 2) {
            fVar.mo7311c();
        } else if (i == 5) {
            fVar.mo7315g();
        } else {
            throw new IllegalStateException("Unexpected field encoding found!");
        }
    }
}

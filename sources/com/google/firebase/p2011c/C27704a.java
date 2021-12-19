package com.google.firebase.p2011c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.firebase.p2011c.AbstractC27706c;

/* renamed from: com.google.firebase.c.a */
public final class C27704a implements AbstractC27706c {

    /* renamed from: a */
    private C27708d f65120a;

    static {
        Covode.recordClassIndex(33286);
    }

    C27704a(Context context) {
        this.f65120a = C27708d.m55399a(context);
    }

    @Override // com.google.firebase.p2011c.AbstractC27706c
    /* renamed from: a */
    public final AbstractC27706c.EnumC27707a mo46342a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = this.f65120a.mo46345a(str, currentTimeMillis);
        boolean a2 = this.f65120a.mo46344a(currentTimeMillis);
        if (a) {
            if (a2) {
                return AbstractC27706c.EnumC27707a.COMBINED;
            }
        } else if (a2) {
            return AbstractC27706c.EnumC27707a.GLOBAL;
        } else {
            if (!a) {
                return AbstractC27706c.EnumC27707a.NONE;
            }
        }
        return AbstractC27706c.EnumC27707a.SDK;
    }
}

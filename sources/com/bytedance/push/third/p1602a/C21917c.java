package com.bytedance.push.third.p1602a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.third.AbstractC21918b;
import com.p2082ss.android.message.p2159a.C30062a;

/* renamed from: com.bytedance.push.third.a.c */
public final class C21917c extends C21916b {

    /* renamed from: a */
    private Context f51902a;

    static {
        Covode.recordClassIndex(25582);
    }

    public C21917c(Context context) {
        this.f51902a = context;
    }

    @Override // com.bytedance.push.third.p1602a.C21916b
    /* renamed from: a */
    public final boolean mo35679a(AbstractC21918b bVar, int i) {
        if (bVar == null || !C30062a.m60804a(this.f51902a, "com.android.vending") || !C30062a.m60804a(this.f51902a, "com.google.android.gms")) {
            return false;
        }
        return true;
    }
}

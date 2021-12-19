package com.bytedance.push.third.p1602a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.third.AbstractC21918b;

/* renamed from: com.bytedance.push.third.a.a */
public final class C21915a extends C21916b {

    /* renamed from: a */
    private Context f51901a;

    static {
        Covode.recordClassIndex(25580);
    }

    public C21915a(Context context) {
        this.f51901a = context;
    }

    @Override // com.bytedance.push.third.p1602a.C21916b
    /* renamed from: a */
    public final boolean mo35679a(AbstractC21918b bVar, int i) {
        if (bVar == null || !bVar.isPushAvailable(this.f51901a, i)) {
            return false;
        }
        return true;
    }
}

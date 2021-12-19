package com.bytedance.android.live.broadcast.p197f;

import com.C1764a;
import com.bytedance.android.live.broadcast.p197f.C3229a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.f.c */
public final /* synthetic */ class C3232c implements AbstractC88433f {

    /* renamed from: a */
    private final C3229a f9284a;

    static {
        Covode.recordClassIndex(3713);
    }

    C3232c(C3229a aVar) {
        this.f9284a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C3229a aVar = this.f9284a;
        Long l = (Long) obj;
        if (aVar.f38654y != null) {
            ((C3229a.AbstractC3230a) aVar.f38654y).mo8501a(false, C1764a.m5929a(Locale.getDefault(), aVar.f9272a, new Object[]{Long.valueOf((10 - l.longValue()) - 1)}));
        }
    }
}

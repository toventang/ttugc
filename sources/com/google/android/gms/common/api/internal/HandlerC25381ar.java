package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1945d.HandlerC25727g;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.ar */
public final class HandlerC25381ar extends HandlerC25727g {

    /* renamed from: a */
    private final /* synthetic */ C25380aq f60238a;

    static {
        Covode.recordClassIndex(30780);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C25380aq aqVar = this.f60238a;
            aqVar.f60213b.lock();
            try {
                if (aqVar.mo41588i()) {
                    aqVar.mo41587h();
                }
            } finally {
                aqVar.f60213b.unlock();
            }
        } else if (i != 2) {
            int i2 = message.what;
        } else {
            C25380aq.m48854a(this.f60238a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandlerC25381ar(C25380aq aqVar, Looper looper) {
        super(looper);
        this.f60238a = aqVar;
    }
}

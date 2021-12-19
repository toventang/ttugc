package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1945d.HandlerC25727g;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.ay */
public final class HandlerC25388ay extends HandlerC25727g {

    /* renamed from: a */
    private final /* synthetic */ C25386aw f60257a;

    static {
        Covode.recordClassIndex(30787);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((AbstractC25385av) message.obj).mo41595a(this.f60257a);
        } else if (i != 2) {
            int i2 = message.what;
        } else {
            throw ((Throwable) message.obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandlerC25388ay(C25386aw awVar, Looper looper) {
        super(looper);
        this.f60257a = awVar;
    }
}

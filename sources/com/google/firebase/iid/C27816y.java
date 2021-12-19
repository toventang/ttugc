package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.C27809x;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.y */
public final /* synthetic */ class C27816y implements Handler.Callback {

    /* renamed from: a */
    private final C27809x.ServiceConnectionC27810a f65343a;

    static {
        Covode.recordClassIndex(33404);
    }

    C27816y(C27809x.ServiceConnectionC27810a aVar) {
        this.f65343a = aVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f65343a.mo46460a(message);
    }
}

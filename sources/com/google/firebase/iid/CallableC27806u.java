package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.firebase.C27695b;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.iid.u */
final /* synthetic */ class CallableC27806u implements Callable {

    /* renamed from: a */
    private final Intent f65322a;

    static {
        Covode.recordClassIndex(33394);
    }

    CallableC27806u(Intent intent) {
        this.f65322a = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Intent intent = this.f65322a;
        String a = C27805t.m55588a(intent, "CMD");
        if (a != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(C27805t.m55589b(intent));
                String.valueOf(a).length();
                String.valueOf(valueOf).length();
            }
            if ("RST".equals(a) || "RST_FULL".equals(a)) {
                FirebaseInstanceId.getInstance(C27695b.m55376d()).mo46402g();
            } else if ("SYNC".equals(a)) {
                FirebaseInstanceId instance = FirebaseInstanceId.getInstance(C27695b.m55376d());
                FirebaseInstanceId.f65198a.mo46431b(instance.mo46403h());
                instance.mo46398b();
            }
        }
        return -1;
    }
}

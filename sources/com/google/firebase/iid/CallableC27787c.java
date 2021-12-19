package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.iid.c */
final /* synthetic */ class CallableC27787c implements Callable {

    /* renamed from: a */
    private final Context f65288a;

    /* renamed from: b */
    private final Intent f65289b;

    static {
        Covode.recordClassIndex(33375);
    }

    CallableC27787c(Context context, Intent intent) {
        this.f65288a = context;
        this.f65289b = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f65288a;
        Intent intent = this.f65289b;
        C27773ap a = C27773ap.m55533a();
        a.f65256c.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return Integer.valueOf(a.mo46425a(context, intent2));
    }
}

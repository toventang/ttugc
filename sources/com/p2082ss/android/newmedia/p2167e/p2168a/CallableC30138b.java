package com.p2082ss.android.newmedia.p2167e.p2168a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.p2167e.p2168a.C30134a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.newmedia.e.a.b */
final /* synthetic */ class CallableC30138b implements Callable {

    /* renamed from: a */
    private final Context f71904a;

    /* renamed from: b */
    private final String f71905b;

    static {
        Covode.recordClassIndex(36637);
    }

    CallableC30138b(Context context, String str) {
        this.f71904a = context;
        this.f71905b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C30134a.View$OnLongClickListenerC301351.DialogInterface$OnClickListenerC301361.m60960a(this.f71904a, this.f71905b);
    }
}

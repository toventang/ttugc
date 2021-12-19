package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.awemepushlib.manager.C81900a;
import com.p2082ss.android.ugc.awemepushlib.p4245a.C81806a;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.p */
final /* synthetic */ class RunnableC81881p implements Runnable {

    /* renamed from: a */
    private final Context f183046a;

    static {
        Covode.recordClassIndex(95295);
    }

    RunnableC81881p(Context context) {
        this.f183046a = context;
    }

    public final void run() {
        Context context = this.f183046a;
        if (((Boolean) C81806a.f182933e.getValue()).booleanValue()) {
            C81868j.m141783b(context);
        } else {
            new Handler(Looper.getMainLooper()).post(new RunnableC81882q(context));
        }
        StringBuilder sb = new StringBuilder("method_push_start_bdpush_start");
        int i = C81868j.f183030a;
        C81868j.f183030a = i + 1;
        C81859c.m141752a(sb.append(i).toString());
        C81900a.m141823a().mo125561f(context);
        System.out.println();
        C81859c.m141753b("method_push_start_bdpush_start");
    }
}

package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.o */
final /* synthetic */ class CallableC81880o implements Callable {

    /* renamed from: a */
    private final Context f183045a;

    static {
        Covode.recordClassIndex(95294);
    }

    CallableC81880o(Context context) {
        this.f183045a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C81868j.m141784c(this.f183045a);
    }
}

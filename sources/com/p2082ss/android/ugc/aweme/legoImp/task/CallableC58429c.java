package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.c */
public final /* synthetic */ class CallableC58429c implements Callable {

    /* renamed from: a */
    private final Context f133035a;

    static {
        Covode.recordClassIndex(68684);
    }

    public CallableC58429c(Context context) {
        this.f133035a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return CleanEffectsTask.m105549b(this.f133035a);
    }
}

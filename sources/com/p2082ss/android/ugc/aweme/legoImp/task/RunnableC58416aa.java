package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.aa */
public final /* synthetic */ class RunnableC58416aa implements Runnable {

    /* renamed from: a */
    private final C58453z f133005a;

    /* renamed from: b */
    private final Context f133006b;

    static {
        Covode.recordClassIndex(68657);
    }

    public RunnableC58416aa(C58453z zVar, Context context) {
        this.f133005a = zVar;
        this.f133006b = context;
    }

    public final void run() {
        Context context = this.f133006b;
        new TuxTextView(context);
        new TuxIconView(context);
    }
}

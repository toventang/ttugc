package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.fe.method.i */
public final /* synthetic */ class C47956i implements WeakHandler.IHandler {

    /* renamed from: a */
    private final C47937e f111072a;

    /* renamed from: b */
    private final int f111073b;

    static {
        Covode.recordClassIndex(56665);
    }

    C47956i(C47937e eVar, int i) {
        this.f111072a = eVar;
        this.f111073b = i;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.f111072a.mo79950a(this.f111073b, message);
    }
}

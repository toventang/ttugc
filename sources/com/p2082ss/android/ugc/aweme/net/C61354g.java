package com.p2082ss.android.ugc.aweme.net;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.net.g */
public final class C61354g<TTaskResult> implements AbstractC1729g<TTaskResult, Object> {

    /* renamed from: a */
    private Handler f139337a;

    /* renamed from: b */
    private int f139338b = 0;

    static {
        Covode.recordClassIndex(71987);
    }

    public C61354g(Handler handler) {
        this.f139337a = handler;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i<TTaskResult> iVar) {
        Handler handler = this.f139337a;
        if (handler == null) {
            return null;
        }
        Message obtainMessage = handler.obtainMessage(this.f139338b);
        if (iVar.mo5539b()) {
            obtainMessage.obj = null;
        } else if (iVar.mo5544c()) {
            obtainMessage.obj = iVar.mo5546e();
        } else {
            obtainMessage.obj = iVar.mo5545d();
        }
        this.f139337a.sendMessage(obtainMessage);
        return null;
    }
}

package com.p2082ss.android.ugc.aweme.account.util;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.account.util.j */
public final class C33041j<TTaskResult> implements AbstractC1729g<TTaskResult, Object> {

    /* renamed from: a */
    Handler f78587a;

    /* renamed from: b */
    int f78588b = 0;

    static {
        Covode.recordClassIndex(39848);
    }

    public C33041j(Handler handler) {
        this.f78587a = handler;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i<TTaskResult> iVar) {
        Handler handler = this.f78587a;
        if (handler == null) {
            return null;
        }
        Message obtainMessage = handler.obtainMessage(this.f78588b);
        if (iVar.mo5539b()) {
            obtainMessage.obj = null;
        } else if (iVar.mo5544c()) {
            obtainMessage.obj = iVar.mo5546e();
        } else {
            obtainMessage.obj = iVar.mo5545d();
        }
        this.f78587a.sendMessage(obtainMessage);
        return null;
    }
}

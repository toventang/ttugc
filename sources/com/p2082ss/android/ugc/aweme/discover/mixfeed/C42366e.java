package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e */
public final class C42366e<TTaskResult> implements AbstractC1729g<TTaskResult, Object> {

    /* renamed from: a */
    private Handler f98703a;

    /* renamed from: b */
    private int f98704b = 0;

    static {
        Covode.recordClassIndex(50311);
    }

    public C42366e(Handler handler) {
        this.f98703a = handler;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i<TTaskResult> iVar) {
        if (!(this.f98703a == null || iVar == null || iVar.mo5539b())) {
            Message obtainMessage = this.f98703a.obtainMessage(this.f98704b);
            if (iVar.mo5544c()) {
                obtainMessage.obj = iVar.mo5546e();
            } else {
                obtainMessage.obj = iVar.mo5545d();
                if (obtainMessage.obj == null) {
                    return null;
                }
            }
            this.f98703a.sendMessage(obtainMessage);
        }
        return null;
    }
}

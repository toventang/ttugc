package com.p2082ss.android.ugc.aweme.lego.p3390a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.c */
public class HandlerC58141c extends Handler {
    static {
        Covode.recordClassIndex(68207);
    }

    public HandlerC58141c() {
    }

    /* renamed from: a */
    public final void mo95648a() {
        mo95649a(1205, 15000);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC58141c(Handler.Callback callback) {
        super(callback);
        C89219l.m154721d(callback, "");
    }

    /* renamed from: a */
    public final void mo95649a(int i, long j) {
        Message obtainMessage = obtainMessage();
        C89219l.m154716b(obtainMessage, "");
        obtainMessage.what = i;
        obtainMessage.obj = null;
        removeMessages(i);
        sendMessageDelayed(obtainMessage, j);
    }
}

package com.google.android.gms.internal.p1947f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.f.d */
public class HandlerC25738d extends Handler {

    /* renamed from: a */
    private static AbstractC25739e f60861a;

    static {
        Covode.recordClassIndex(31153);
    }

    public HandlerC25738d() {
    }

    public HandlerC25738d(Looper looper) {
        super(looper);
    }

    public final void dispatchMessage(Message message) {
        if (f60861a == null) {
            super.dispatchMessage(message);
        } else {
            super.dispatchMessage(message);
        }
    }

    public boolean sendMessageAtTime(Message message, long j) {
        return super.sendMessageAtTime(message, j);
    }

    public HandlerC25738d(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}

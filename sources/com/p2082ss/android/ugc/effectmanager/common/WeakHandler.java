package com.p2082ss.android.ugc.effectmanager.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.WeakHandler */
public class WeakHandler extends Handler {
    private IHandler mHandler;

    /* renamed from: com.ss.android.ugc.effectmanager.common.WeakHandler$IHandler */
    public interface IHandler {
        static {
            Covode.recordClassIndex(95440);
        }

        void handleMsg(Message message);
    }

    static {
        Covode.recordClassIndex(95439);
    }

    public WeakHandler(IHandler iHandler) {
        super(Looper.getMainLooper());
        this.mHandler = iHandler;
    }

    public void handleMessage(Message message) {
        IHandler iHandler = this.mHandler;
        if (iHandler != null && message != null) {
            iHandler.handleMsg(message);
        }
    }

    public WeakHandler(Looper looper, IHandler iHandler) {
        super(looper);
        this.mHandler = iHandler;
    }
}

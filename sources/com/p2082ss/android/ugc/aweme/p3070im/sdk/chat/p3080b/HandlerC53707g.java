package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.g */
public final class HandlerC53707g extends Handler {

    /* renamed from: a */
    WeakReference<AbstractC53708a> f123231a;

    /* renamed from: b */
    private volatile int f123232b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.g$a */
    public interface AbstractC53708a {
        static {
            Covode.recordClassIndex(63288);
        }

        /* renamed from: a */
        void mo90255a();

        /* renamed from: a */
        void mo90256a(int i);

        /* renamed from: a */
        void mo90257a(Object obj, int i);
    }

    static {
        Covode.recordClassIndex(63287);
    }

    public HandlerC53707g(AbstractC53708a aVar) {
        this.f123231a = new WeakReference<>(aVar);
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        AbstractC53708a aVar = this.f123231a.get();
        if (aVar != null && message != null) {
            Object obj = message.obj;
            switch (message.what) {
                case 1:
                    aVar.mo90256a(message.arg1);
                    if (this.f123232b != 0) {
                        this.f123232b = 0;
                        removeMessages(1);
                        return;
                    }
                    return;
                case 2:
                    if (this.f123232b == 0) {
                        sendEmptyMessageDelayed(1, 300);
                    }
                    this.f123232b++;
                    return;
                case 3:
                    aVar.mo90255a();
                    return;
                case 4:
                    if (obj != null) {
                        aVar.mo90257a(obj, 0);
                        return;
                    }
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (obj != null) {
                        aVar.mo90257a(obj, 1);
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (obj != null) {
                        aVar.mo90257a(obj, 2);
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if (obj != null) {
                        aVar.mo90257a(obj, 3);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public HandlerC53707g(Looper looper, AbstractC53708a aVar) {
        super(looper);
        this.f123231a = new WeakReference<>(aVar);
    }

    public final boolean sendMessageAtTime(Message message, long j) {
        C56244a.m102190b("RefreshHandler", "sendMessageAtTime msg=" + message + " uptimeMillis=" + j);
        return super.sendMessageAtTime(message, j);
    }
}

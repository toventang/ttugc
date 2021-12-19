package com.bytedance.geckox.p1026m;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1022i.C14957a;

/* renamed from: com.bytedance.geckox.m.b */
public final class C14970b {

    /* renamed from: a */
    public Handler f36563a;

    /* renamed from: b */
    private HandlerThread f36564b;

    /* renamed from: c */
    private final String f36565c;

    /* renamed from: d */
    private final int f36566d = 3;

    static {
        Covode.recordClassIndex(17083);
    }

    /* renamed from: a */
    private void m27564a() {
        if (this.f36563a == null || this.f36564b.getLooper() == null) {
            HandlerThread handlerThread = new HandlerThread(this.f36565c, this.f36566d);
            this.f36564b = handlerThread;
            handlerThread.start();
            this.f36563a = new HandlerC14971a(this.f36564b.getLooper());
        }
    }

    public C14970b(String str) {
        this.f36565c = str;
        m27564a();
    }

    /* renamed from: a */
    public final void mo24085a(AbstractC14969a aVar) {
        mo24086a(aVar, InteractFirstFrameTimeOutDurationSetting.DEFAULT, 300000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.geckox.m.b$a */
    public class HandlerC14971a extends Handler {
        static {
            Covode.recordClassIndex(17084);
        }

        public final void handleMessage(Message message) {
            AbstractC14969a aVar = (AbstractC14969a) message.obj;
            C14957a.m27543a("handler timer task execute", Integer.valueOf(aVar.mo24079a()), Long.valueOf(aVar.f36560b));
            aVar.mo24080b();
            if (aVar.f36560b > 0) {
                Message obtainMessage = C14970b.this.f36563a.obtainMessage(message.what);
                obtainMessage.obj = aVar;
                C14970b.this.f36563a.sendMessageDelayed(obtainMessage, aVar.f36560b);
            }
        }

        public HandlerC14971a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public final void mo24086a(AbstractC14969a aVar, long j, long j2) {
        m27564a();
        int a = aVar.mo24079a();
        aVar.f36560b = j2;
        Message obtainMessage = this.f36563a.obtainMessage(a);
        obtainMessage.obj = aVar;
        obtainMessage.what = a;
        this.f36563a.sendMessageDelayed(obtainMessage, j);
    }
}

package com.bytedance.sdk.p1625a.p1650j.p1651a;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.a.j.a.a */
public class C22456a extends Thread implements WeakHandler.IHandler {

    /* renamed from: a */
    protected static C22462f f53084a = C22462f.m42397a();

    /* renamed from: b */
    protected static final AtomicInteger f53085b = new AtomicInteger();

    /* renamed from: c */
    protected WeakHandler f53086c;

    /* renamed from: d */
    private final BlockingQueue<AbstractC22460e> f53087d;

    /* renamed from: e */
    private volatile boolean f53088e;

    /* renamed from: f */
    private volatile boolean f53089f;

    /* renamed from: g */
    private String f53090g;

    /* renamed from: b */
    public boolean mo36742b() {
        return this.f53089f;
    }

    /* renamed from: a */
    public void mo36740a() {
        this.f53088e = true;
        interrupt();
    }

    /* renamed from: d */
    public void mo36744d() {
        this.f53086c.removeMessages(0);
    }

    /* renamed from: c */
    public void mo36743c() {
        mo36744d();
        this.f53086c.sendEmptyMessageDelayed(0, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    static {
        Covode.recordClassIndex(26272);
    }

    public void run() {
        String str;
        String str2;
        String str3;
        Process.setThreadPriority(10);
        while (true) {
            try {
                AbstractC22460e take = this.f53087d.take();
                mo36744d();
                if (take != null && (take instanceof AbstractRunnableC22458c)) {
                    AbstractRunnableC22458c cVar = (AbstractRunnableC22458c) take;
                    String str4 = null;
                    try {
                        this.f53089f = true;
                        mo36741a(cVar);
                        if (cVar.mo36747a()) {
                            this.f53089f = false;
                        } else {
                            str2 = Thread.currentThread().getName();
                            try {
                                str = cVar.f53099e;
                                if (!C13627m.m24498a(str) && !C13627m.m24498a(str2)) {
                                    Thread.currentThread().setName(str);
                                }
                                cVar.run();
                                mo36743c();
                            } catch (Throwable unused) {
                                str3 = null;
                                str4 = str2;
                                str2 = str4;
                                str = str3;
                                this.f53089f = false;
                                Thread.currentThread().setName(str2);
                            }
                            this.f53089f = false;
                            if (!C13627m.m24498a(str) && !C13627m.m24498a(str2)) {
                                Thread.currentThread().setName(str2);
                            }
                        }
                    } catch (Throwable unused2) {
                        str3 = null;
                        str2 = str4;
                        str = str3;
                        this.f53089f = false;
                        Thread.currentThread().setName(str2);
                    }
                }
            } catch (InterruptedException unused3) {
                if (this.f53088e) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo36741a(AbstractRunnableC22458c cVar) {
        if (cVar != null) {
            cVar.mo36754g();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 0) {
                    f53084a.mo36758d();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22456a(BlockingQueue<AbstractC22460e> blockingQueue, String str, String str2) {
        super(TextUtils.isEmpty(str) ? "ApiDispatcher-Thread" : str);
        this.f53086c = new WeakHandler(Looper.getMainLooper(), this);
        this.f53088e = false;
        this.f53089f = false;
        this.f53090g = "ApiDispatcher";
        this.f53087d = blockingQueue;
        this.f53090g = str2;
    }
}

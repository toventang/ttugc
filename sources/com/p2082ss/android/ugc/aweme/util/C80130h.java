package com.p2082ss.android.ugc.aweme.util;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.util.h */
public final class C80130h implements WeakHandler.IHandler {

    /* renamed from: a */
    private final long f179540a;

    /* renamed from: b */
    private final long f179541b = 100;

    /* renamed from: c */
    private long f179542c;

    /* renamed from: d */
    private boolean f179543d;

    /* renamed from: e */
    private boolean f179544e;

    /* renamed from: f */
    private boolean f179545f;

    /* renamed from: g */
    private boolean f179546g;

    /* renamed from: h */
    private Handler f179547h = new WeakHandler(this);

    /* renamed from: i */
    private AbstractC80131a f179548i;

    /* renamed from: com.ss.android.ugc.aweme.util.h$a */
    public interface AbstractC80131a {
        static {
            Covode.recordClassIndex(93375);
        }

        /* renamed from: a */
        void mo97028a();
    }

    static {
        Covode.recordClassIndex(93374);
    }

    /* renamed from: c */
    public final synchronized boolean mo123590c() {
        boolean z;
        MethodCollector.m26663i(14313);
        z = this.f179544e;
        MethodCollector.m26664o(14313);
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo123588a() {
        MethodCollector.m26663i(14311);
        this.f179543d = true;
        this.f179545f = false;
        this.f179546g = false;
        this.f179547h.removeMessages(1);
        MethodCollector.m26664o(14311);
    }

    /* renamed from: b */
    public final synchronized C80130h mo123589b() {
        MethodCollector.m26663i(14312);
        this.f179546g = false;
        this.f179543d = false;
        this.f179544e = false;
        this.f179545f = true;
        if (this.f179540a <= 0) {
            this.f179544e = true;
            this.f179545f = false;
            AbstractC80131a aVar = this.f179548i;
            if (aVar != null) {
                aVar.mo97028a();
            }
            MethodCollector.m26664o(14312);
            return this;
        }
        this.f179542c = SystemClock.elapsedRealtime() + this.f179540a;
        Handler handler = this.f179547h;
        handler.sendMessage(handler.obtainMessage(1));
        MethodCollector.m26664o(14312);
        return this;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        MethodCollector.m26663i(14314);
        synchronized (this) {
            try {
                if (!this.f179543d && !this.f179546g) {
                    long elapsedRealtime = this.f179542c - SystemClock.elapsedRealtime();
                    long j = 0;
                    if (elapsedRealtime <= 0) {
                        this.f179544e = true;
                        this.f179545f = false;
                        AbstractC80131a aVar = this.f179548i;
                        if (aVar != null) {
                            aVar.mo97028a();
                        }
                    } else {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime();
                        long j2 = this.f179541b;
                        if (elapsedRealtime < j2) {
                            long j3 = elapsedRealtime - elapsedRealtime2;
                            if (j3 >= 0) {
                                j = j3;
                            }
                        } else {
                            long j4 = j2 - elapsedRealtime2;
                            while (j4 < 0) {
                                j4 += this.f179541b;
                            }
                            j = j4;
                        }
                        Handler handler = this.f179547h;
                        handler.sendMessageDelayed(handler.obtainMessage(1), j);
                    }
                    MethodCollector.m26664o(14314);
                }
            } finally {
                MethodCollector.m26664o(14314);
            }
        }
    }

    public C80130h(long j, AbstractC80131a aVar) {
        this.f179540a = j;
        this.f179548i = aVar;
    }
}

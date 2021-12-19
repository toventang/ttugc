package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.a */
public final class C32308a implements WeakHandler.IHandler {

    /* renamed from: a */
    private final long f77077a;

    /* renamed from: b */
    private final long f77078b;

    /* renamed from: c */
    private long f77079c;

    /* renamed from: d */
    private long f77080d;

    /* renamed from: e */
    private boolean f77081e;

    /* renamed from: f */
    private boolean f77082f;

    /* renamed from: g */
    private boolean f77083g;

    /* renamed from: h */
    private Handler f77084h = new WeakHandler(this);

    /* renamed from: i */
    private AbstractC32309a f77085i;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.a$a */
    public interface AbstractC32309a {
        static {
            Covode.recordClassIndex(39077);
        }

        /* renamed from: a */
        void mo58205a();

        /* renamed from: a */
        void mo58389a(long j);

        /* renamed from: b */
        void mo58206b();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.a$b */
    public static class C32310b implements AbstractC32309a {
        static {
            Covode.recordClassIndex(39078);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: a */
        public void mo58205a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: a */
        public void mo58389a(long j) {
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: b */
        public void mo58206b() {
        }
    }

    static {
        Covode.recordClassIndex(39076);
    }

    /* renamed from: b */
    public final synchronized long mo58386b() {
        long j;
        MethodCollector.m26663i(11279);
        j = this.f77079c;
        MethodCollector.m26664o(11279);
        return j;
    }

    /* renamed from: c */
    public final synchronized boolean mo58387c() {
        boolean z;
        MethodCollector.m26663i(11280);
        z = this.f77082f;
        MethodCollector.m26664o(11280);
        return z;
    }

    /* renamed from: d */
    public final synchronized boolean mo58388d() {
        boolean z;
        MethodCollector.m26663i(11281);
        z = this.f77083g;
        MethodCollector.m26664o(11281);
        return z;
    }

    /* renamed from: a */
    public final synchronized C32308a mo58384a() {
        MethodCollector.m26663i(11134);
        this.f77081e = false;
        this.f77082f = false;
        this.f77083g = true;
        if (this.f77077a <= 0) {
            this.f77082f = true;
            this.f77083g = false;
            AbstractC32309a aVar = this.f77085i;
            if (aVar != null) {
                aVar.mo58206b();
            }
            MethodCollector.m26664o(11134);
            return this;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f77077a;
        this.f77080d = elapsedRealtime + j;
        this.f77079c = j;
        AbstractC32309a aVar2 = this.f77085i;
        if (aVar2 != null) {
            aVar2.mo58205a();
        }
        Handler handler = this.f77084h;
        handler.sendMessage(handler.obtainMessage(1));
        MethodCollector.m26664o(11134);
        return this;
    }

    /* renamed from: a */
    public final void mo58385a(AbstractC32309a aVar) {
        this.f77085i = aVar;
        if (this.f77082f && aVar != null) {
            aVar.mo58206b();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        MethodCollector.m26663i(11434);
        synchronized (this) {
            try {
                if (!this.f77081e) {
                    long elapsedRealtime = this.f77080d - SystemClock.elapsedRealtime();
                    this.f77079c = elapsedRealtime;
                    long j = 0;
                    if (elapsedRealtime <= 0) {
                        this.f77082f = true;
                        this.f77083g = false;
                        AbstractC32309a aVar = this.f77085i;
                        if (aVar != null) {
                            aVar.mo58206b();
                        }
                    } else {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        AbstractC32309a aVar2 = this.f77085i;
                        if (aVar2 != null) {
                            aVar2.mo58389a(this.f77079c);
                        }
                        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                        long j2 = this.f77079c;
                        long j3 = this.f77078b;
                        if (j2 < j3) {
                            long j4 = j2 - elapsedRealtime3;
                            if (j4 >= 0) {
                                j = j4;
                            }
                        } else {
                            long j5 = j3 - elapsedRealtime3;
                            while (j5 < 0) {
                                j5 += this.f77078b;
                            }
                            j = j5;
                        }
                        Handler handler = this.f77084h;
                        handler.sendMessageDelayed(handler.obtainMessage(1), j);
                    }
                    MethodCollector.m26664o(11434);
                }
            } finally {
                MethodCollector.m26664o(11434);
            }
        }
    }

    public C32308a(long j, long j2, AbstractC32309a aVar) {
        this.f77077a = j;
        this.f77078b = j2;
        this.f77085i = aVar;
    }
}

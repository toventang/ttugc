package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.AbstractC87793j;
import com.twitter.sdk.android.core.C87691i;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.m */
public final class C87734m<T extends C87691i> {

    /* renamed from: a */
    protected final C87736a f199265a;

    /* renamed from: b */
    private final C87749p f199266b;

    /* renamed from: c */
    private final AbstractC87793j<T> f199267c;

    /* renamed from: d */
    private final ExecutorService f199268d;

    /* renamed from: e */
    private final AbstractC87738o f199269e;

    static {
        Covode.recordClassIndex(103723);
    }

    /* renamed from: a */
    public final void mo142180a() {
        T a = this.f199267c.mo142121a();
        long currentTimeMillis = System.currentTimeMillis();
        if (a != null && this.f199265a.mo142182a(currentTimeMillis)) {
            this.f199268d.submit(new RunnableC87737n(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo142181b() {
        for (T t : this.f199267c.mo142124b().values()) {
            this.f199269e.mo142185a(t);
        }
        this.f199265a.mo142183b(System.currentTimeMillis());
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.twitter.sdk.android.core.internal.m$a */
    public static class C87736a {

        /* renamed from: a */
        public boolean f199271a;

        /* renamed from: b */
        public long f199272b;

        /* renamed from: c */
        private final Calendar f199273c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        static {
            Covode.recordClassIndex(103725);
        }

        /* renamed from: b */
        public final synchronized void mo142183b(long j) {
            MethodCollector.m26663i(5232);
            this.f199271a = false;
            this.f199272b = j;
            MethodCollector.m26664o(5232);
        }

        /* renamed from: a */
        public final synchronized boolean mo142182a(long j) {
            boolean z;
            boolean z2;
            MethodCollector.m26663i(5171);
            long j2 = this.f199272b;
            if (j - j2 > 21600000) {
                z = true;
            } else {
                z = false;
            }
            this.f199273c.setTimeInMillis(j);
            int i = this.f199273c.get(6);
            int i2 = this.f199273c.get(1);
            this.f199273c.setTimeInMillis(j2);
            int i3 = this.f199273c.get(6);
            int i4 = this.f199273c.get(1);
            if (i == i3 && i2 == i4) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f199271a || (!z && !z2)) {
                MethodCollector.m26664o(5171);
                return false;
            }
            this.f199271a = true;
            MethodCollector.m26664o(5171);
            return true;
        }
    }

    public C87734m(AbstractC87793j<T> jVar, ExecutorService executorService, AbstractC87738o<T> oVar) {
        this(jVar, new C87749p(), executorService, new C87736a(), oVar);
    }

    private C87734m(AbstractC87793j<T> jVar, C87749p pVar, ExecutorService executorService, C87736a aVar, AbstractC87738o oVar) {
        this.f199266b = pVar;
        this.f199267c = jVar;
        this.f199268d = executorService;
        this.f199265a = aVar;
        this.f199269e = oVar;
    }
}

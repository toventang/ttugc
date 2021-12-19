package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.C87728g;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.c */
public abstract class AbstractC87762c<T> implements AbstractC87776o<T> {

    /* renamed from: a */
    protected final Context f199336a;

    /* renamed from: b */
    protected final AbstractC87767g<T> f199337b;

    /* renamed from: c */
    final ScheduledExecutorService f199338c;

    /* renamed from: d */
    final AtomicReference<ScheduledFuture<?>> f199339d;

    /* renamed from: e */
    public volatile int f199340e = -1;

    static {
        Covode.recordClassIndex(103760);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87777p
    /* renamed from: c */
    public final boolean mo142213c() {
        try {
            return this.f199337b.mo142224a();
        } catch (IOException unused) {
            C87728g.m152677b(this.f199336a, "Failed to roll file over.");
            return false;
        }
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87777p
    /* renamed from: b */
    public final void mo142212b() {
        if (this.f199339d.get() != null) {
            C87728g.m152671a(this.f199336a, "Cancelling time-based rollover because no events are currently being generated.");
            this.f199339d.get().cancel(false);
            this.f199339d.set(null);
        }
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87773l
    /* renamed from: a */
    public final void mo142210a() {
        AbstractC87778q d = mo142214d();
        if (d == null) {
            C87728g.m152671a(this.f199336a, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        C87728g.m152671a(this.f199336a, "Sending all files");
        List<File> c = this.f199337b.mo142226c();
        int i = 0;
        while (c.size() > 0) {
            try {
                C87728g.m152671a(this.f199336a, C1764a.m5929a(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(c.size())}));
                if (!d.mo142205a(c)) {
                    break;
                }
                i += c.size();
                this.f199337b.mo142223a(c);
                c = this.f199337b.mo142226c();
            } catch (Exception e) {
                C87728g.m152677b(this.f199336a, "Failed to send batch of analytics files to server: " + e.getMessage());
            }
        }
        if (i == 0) {
            this.f199337b.mo142227d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo142215a(int i) {
        this.f199340e = i;
        m152735a(0, (long) this.f199340e);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87773l
    /* renamed from: a */
    public final void mo142211a(T t) {
        C87728g.m152671a(this.f199336a, t.toString());
        try {
            this.f199337b.mo142222a((Object) t);
        } catch (IOException unused) {
            C87728g.m152677b(this.f199336a, "Failed to write event.");
        }
        if (this.f199340e != -1) {
            m152735a((long) this.f199340e, (long) this.f199340e);
        }
    }

    /* renamed from: a */
    private void m152735a(long j, long j2) {
        if (this.f199339d.get() == null) {
            RunnableC87759ac acVar = new RunnableC87759ac(this.f199336a, this);
            C87728g.m152671a(this.f199336a, "Scheduling time based file roll over every " + j2 + " seconds");
            try {
                this.f199339d.set(this.f199338c.scheduleAtFixedRate(acVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException unused) {
                C87728g.m152677b(this.f199336a, "Failed to schedule time based file roll over");
            }
        }
    }

    public AbstractC87762c(Context context, ScheduledExecutorService scheduledExecutorService, AbstractC87767g<T> gVar) {
        this.f199336a = context;
        this.f199338c = scheduledExecutorService;
        this.f199337b = gVar;
        this.f199339d = new AtomicReference<>();
    }
}

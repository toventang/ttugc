package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.twitter.sdk.android.core.internal.C87728g;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.i */
public abstract class AbstractC87770i<T> implements AbstractC87775n {

    /* renamed from: a */
    protected final Context f199364a;

    /* renamed from: b */
    protected final ScheduledExecutorService f199365b;

    /* renamed from: c */
    protected AbstractC87776o<T> f199366c;

    static {
        Covode.recordClassIndex(103768);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo142232b() {
        try {
            this.f199366c.mo142210a();
        } catch (Exception unused) {
            C87728g.m152677b(this.f199364a, "Failed to send events files.");
        }
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87775n
    /* renamed from: a */
    public final void mo142229a() {
        m152753a((Runnable) new RunnableC87772k(this));
    }

    /* renamed from: a */
    private void m152753a(Runnable runnable) {
        try {
            this.f199365b.submit(runnable);
        } catch (Exception unused) {
            C87728g.m152677b(this.f199364a, "Failed to submit events task");
        }
    }

    /* renamed from: a */
    public final void mo142230a(T t) {
        m152753a((Runnable) new RunnableC87771j(this, t));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo142231a(Object obj, boolean z) {
        try {
            this.f199366c.mo142211a(obj);
            if (z) {
                this.f199366c.mo142213c();
            }
        } catch (Exception unused) {
            C87728g.m152677b(this.f199364a, "Failed to record event.");
        }
    }

    public AbstractC87770i(Context context, AbstractC87776o<T> oVar, AbstractC87767g gVar, ScheduledExecutorService scheduledExecutorService) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f199364a = applicationContext;
        this.f199365b = scheduledExecutorService;
        this.f199366c = oVar;
        gVar.mo142221a((AbstractC87775n) this);
    }
}

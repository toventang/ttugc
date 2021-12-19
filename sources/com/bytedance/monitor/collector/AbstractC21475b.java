package com.bytedance.monitor.collector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.p1548b.AbstractC21450d;
import com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e;
import com.bytedance.monitor.p1546a.p1548b.C21435a;
import com.bytedance.monitor.p1546a.p1548b.C21448c;

/* renamed from: com.bytedance.monitor.collector.b */
public abstract class AbstractC21475b {

    /* renamed from: a */
    public String f50912a;

    /* renamed from: b */
    protected int f50913b;

    /* renamed from: c */
    protected int f50914c = 1;

    /* renamed from: d */
    protected volatile boolean f50915d;

    /* renamed from: e */
    protected AbstractC21450d f50916e;

    static {
        Covode.recordClassIndex(25102);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Pair<String, ?> mo35057a(long j, long j2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo35075b() {
        this.f50913b = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo35058b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Pair<String, ?> mo35059c() {
        return null;
    }

    /* renamed from: a */
    public void mo35073a() {
        if (this.f50913b >= 0) {
            this.f50913b = 2;
            return;
        }
        throw new IllegalStateException("collector has destroyed, can not start.");
    }

    /* renamed from: a */
    public final void mo35074a(final int i) {
        AbstractRunnableC21452e a = C21448c.m40280a("refreshConfig", new Runnable() {
            /* class com.bytedance.monitor.collector.AbstractC21475b.RunnableC214761 */

            static {
                Covode.recordClassIndex(25103);
            }

            public final void run() {
                int i;
                if (AbstractC21475b.this.f50913b >= 0 && AbstractC21475b.this.f50913b == 2 && AbstractC21475b.this.f50914c != (i = i)) {
                    AbstractC21475b.this.f50914c = i;
                    AbstractC21475b.this.mo35058b(i);
                }
            }
        });
        AbstractC21450d dVar = this.f50916e;
        if (dVar != null) {
            dVar.mo35034a(a);
        }
    }

    public AbstractC21475b(int i, String str) {
        this.f50912a = str;
        this.f50914c = i;
        C21501k a = C21501k.m40384a();
        if (!a.f51024b.contains(this)) {
            a.f51024b.add(this);
            if (a.f51026d) {
                mo35073a();
            }
        }
        this.f50916e = C21435a.C21439a.f50832a;
    }
}

package com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58513d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.f.c */
public final class C58574c {

    /* renamed from: c */
    private static final AbstractC58513d f133435c = new AbstractC58513d() {
        /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58574c.C585751 */

        static {
            Covode.recordClassIndex(68870);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3399a.AbstractC58513d
        /* renamed from: a */
        public final void mo30093a(long j) {
        }
    };

    /* renamed from: a */
    public AbstractC58561c<C58555a<C58555a>> f133436a;

    /* renamed from: b */
    public AbstractC58513d f133437b = f133435c;

    /* renamed from: d */
    private long f133438d = 500;

    /* renamed from: e */
    private Timer f133439e;

    static {
        Covode.recordClassIndex(68869);
    }

    /* renamed from: d */
    private void m107679d() {
        Timer timer = this.f133439e;
        if (timer != null) {
            timer.cancel();
            this.f133439e.purge();
            this.f133439e = null;
        }
    }

    /* renamed from: b */
    public final void mo96037b() {
        if (this.f133436a != null && this.f133437b != f133435c) {
            m107679d();
        }
    }

    /* renamed from: c */
    public final void mo96038c() {
        m107679d();
        this.f133436a = null;
        this.f133438d = 500;
        this.f133437b = f133435c;
    }

    /* renamed from: a */
    public final void mo96035a() {
        if (this.f133436a != null && this.f133437b != f133435c) {
            m107679d();
            this.f133439e = new Timer();
            this.f133439e.schedule(new TimerTask() {
                /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58574c.C585762 */

                static {
                    Covode.recordClassIndex(68871);
                }

                public final void run() {
                    if (C58574c.this.f133436a != null && C58574c.this.f133437b != null) {
                        C58574c.this.f133437b.mo30093a((long) C58574c.this.f133436a.mo16743i());
                    }
                }
            }, this.f133438d - (((long) this.f133436a.mo16743i()) % this.f133438d), this.f133438d);
        }
    }

    /* renamed from: a */
    public final void mo96036a(AbstractC58513d dVar) {
        if (dVar != null) {
            this.f133437b = dVar;
        } else {
            this.f133437b = f133435c;
        }
        this.f133438d = 5;
    }
}

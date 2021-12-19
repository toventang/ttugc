package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4466c;
import com.bytedance.android.live.liveinteract.platform.common.api.C5672a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.c */
public final class C4557c extends C4466c.AbstractC4467a {
    static {
        Covode.recordClassIndex(5133);
    }

    public C4557c(C4466c.AbstractC4468b bVar) {
        super(bVar);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.c$a */
    static final class C4558a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4557c f12164a;

        static {
            Covode.recordClassIndex(5134);
        }

        C4558a(C4557c cVar) {
            this.f12164a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C4466c.AbstractC4468b bVar = (C4466c.AbstractC4468b) this.f12164a.f12053h;
            if (bVar != null) {
                bVar.mo10244a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.c$b */
    static final class C4559b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4557c f12165a;

        static {
            Covode.recordClassIndex(5135);
        }

        C4559b(C4557c cVar) {
            this.f12165a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4466c.AbstractC4468b bVar = (C4466c.AbstractC4468b) this.f12165a.f12053h;
            if (bVar != null) {
                bVar.mo10245a(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.c$c */
    static final class C4560c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4557c f12166a;

        static {
            Covode.recordClassIndex(5136);
        }

        C4560c(C4557c cVar) {
            this.f12166a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C4466c.AbstractC4468b bVar = (C4466c.AbstractC4468b) this.f12166a.f12053h;
            if (bVar != null) {
                bVar.mo10246b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.c$d */
    static final class C4561d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4557c f12167a;

        static {
            Covode.recordClassIndex(5137);
        }

        C4561d(C4557c cVar) {
            this.f12167a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4466c.AbstractC4468b bVar = (C4466c.AbstractC4468b) this.f12167a.f12053h;
            if (bVar != null) {
                bVar.mo10247b(th);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4466c.AbstractC4467a
    /* renamed from: a */
    public final void mo10242a(boolean z) {
        AbstractC88979t<C5832d<Void>> a = C5672a.m12412a(0, z);
        if (a != null) {
            ((AbstractC11181z) a.mo143274a(mo10250f())).mo17950a(new C4558a(this), new C4559b(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4466c.AbstractC4467a
    /* renamed from: b */
    public final void mo10243b(boolean z) {
        AbstractC88979t<C5832d<Void>> a = C5672a.m12412a(2, z);
        if (a != null) {
            ((AbstractC11181z) a.mo143274a(mo10250f())).mo17950a(new C4560c(this), new C4561d(this));
        }
    }
}

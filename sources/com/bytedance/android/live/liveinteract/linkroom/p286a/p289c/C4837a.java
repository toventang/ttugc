package com.bytedance.android.live.liveinteract.linkroom.p286a.p289c;

import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p287a.C4831a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.c.a */
public final class C4837a extends C4831a.AbstractC4832a {
    static {
        Covode.recordClassIndex(5419);
    }

    public C4837a(C4831a.AbstractC4833b bVar) {
        super(bVar);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.c.a$a */
    static final class C4838a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4837a f12682a;

        static {
            Covode.recordClassIndex(5420);
        }

        C4838a(C4837a aVar) {
            this.f12682a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C4831a.AbstractC4833b bVar = (C4831a.AbstractC4833b) this.f12682a.f12053h;
            if (bVar != null) {
                bVar.mo10561a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.c.a$b */
    static final class C4839b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4837a f12683a;

        static {
            Covode.recordClassIndex(5421);
        }

        C4839b(C4837a aVar) {
            this.f12683a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4831a.AbstractC4833b bVar = (C4831a.AbstractC4833b) this.f12683a.f12053h;
            if (bVar != null) {
                bVar.mo10562a(th);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p287a.C4831a.AbstractC4832a
    /* renamed from: a */
    public final void mo10560a(long j) {
        ((CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class)).checkPermissionV3(j).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C4838a(this), new C4839b(this));
    }
}

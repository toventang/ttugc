package com.bytedance.android.live.liveinteract.multilive.anchor.p353d;

import com.bytedance.android.live.liveinteract.multilive.anchor.p350a.C5479a;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7676a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.d.a */
public final class C5499a extends C5479a.AbstractC5480a {
    static {
        Covode.recordClassIndex(6094);
    }

    public C5499a(C5479a.AbstractC5481b bVar) {
        super(bVar);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.d.a$a */
    static final class C5500a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5499a f14077a;

        static {
            Covode.recordClassIndex(6095);
        }

        C5500a(C5499a aVar) {
            this.f14077a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5479a.AbstractC5481b bVar = (C5479a.AbstractC5481b) this.f14077a.f12053h;
            if (bVar != null) {
                bVar.mo11295a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.d.a$b */
    static final class C5501b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5499a f14078a;

        static {
            Covode.recordClassIndex(6096);
        }

        C5501b(C5499a aVar) {
            this.f14078a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C5479a.AbstractC5481b bVar = (C5479a.AbstractC5481b) this.f14078a.f12053h;
            if (bVar != null) {
                bVar.mo11296a(th);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p350a.C5479a.AbstractC5480a
    /* renamed from: a */
    public final void mo11294a(Long l, Long l2, C7676a aVar) {
        if (l == null || l2 == null || aVar == null) {
            C5479a.AbstractC5481b bVar = (C5479a.AbstractC5481b) this.f12053h;
            if (bVar != null) {
                bVar.mo11296a(new Throwable("param illegal."));
                return;
            }
            return;
        }
        ((MultiLiveApi) C5805e.m12718a().mo11572a(MultiLiveApi.class)).updateAnchorPanelSettings(l.longValue(), l.longValue(), l2.longValue(), aVar.f19019a, aVar.f19020b, 0, 0).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5500a(this), new C5501b(this));
    }
}

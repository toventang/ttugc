package com.p2082ss.android.ugc.awemepushlib.p4246b;

import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.frontier.C21810b;
import com.bytedance.push.frontier.p1594a.AbstractC21807b;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.AbstractC61578ae;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.AbstractC61607z;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61591m;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61598t;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61604w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.awemepushlib.b.a */
public final class C81819a implements AbstractC21807b {

    /* renamed from: a */
    public static final C81819a f182953a = new C81819a();

    /* renamed from: b */
    private static AbstractC61607z f182954b;

    private C81819a() {
    }

    static {
        Covode.recordClassIndex(95231);
    }

    @Override // com.bytedance.push.frontier.p1594a.AbstractC21807b
    /* renamed from: a */
    public final void mo35489a() {
        AbstractC61607z zVar = f182954b;
        if (zVar != null) {
            C61598t a = C61598t.f139791j.mo99346a();
            C61591m mVar = new C61591m(C21810b.f51680a, C21810b.f51681b);
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(zVar, "");
            a.f139798g.remove(mVar);
        }
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.b.a$b */
    static final class C81821b implements AbstractC61607z {

        /* renamed from: a */
        final /* synthetic */ AbstractC13651e f182956a;

        static {
            Covode.recordClassIndex(95233);
        }

        C81821b(AbstractC13651e eVar) {
            this.f182956a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notice.api.p3514e.AbstractC61607z
        /* renamed from: a */
        public final void mo99326a(WsChannelMsg wsChannelMsg) {
            C89219l.m154721d(wsChannelMsg, "");
            AbstractC13651e eVar = this.f182956a;
            if (eVar != null) {
                eVar.mo21945a(wsChannelMsg);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.b.a$a */
    static final class C81820a implements AbstractC61578ae {

        /* renamed from: a */
        final /* synthetic */ AbstractC13651e f182955a;

        static {
            Covode.recordClassIndex(95232);
        }

        C81820a(AbstractC13651e eVar) {
            this.f182955a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notice.api.p3514e.AbstractC61578ae
        /* renamed from: a */
        public final void mo99327a(C61604w wVar) {
            C89219l.m154721d(wVar, "");
            AbstractC13651e eVar = this.f182955a;
            if (eVar != null) {
                eVar.mo21944a(wVar.f139803a, wVar.f139804b);
            }
        }
    }

    @Override // com.bytedance.push.frontier.p1594a.AbstractC21807b
    /* renamed from: a */
    public final void mo35490a(AbstractC13651e eVar) {
        C61598t a = C61598t.f139791j.mo99346a();
        C81820a aVar = new C81820a(eVar);
        C89219l.m154721d(aVar, "");
        a.f139797f.add(aVar);
        if (f182954b == null) {
            f182954b = new C81821b(eVar);
        }
        AbstractC61607z zVar = f182954b;
        if (zVar != null) {
            C61598t.f139791j.mo99346a().mo99342a(new C61591m(C21810b.f51680a, C21810b.f51681b), zVar);
        }
    }
}

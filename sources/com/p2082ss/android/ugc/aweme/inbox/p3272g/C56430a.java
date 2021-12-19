package com.p2082ss.android.ugc.aweme.inbox.p3272g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.C56340d;
import com.p2082ss.android.ugc.aweme.inbox.C56398e;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.inbox.C56592y;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56501q;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66621e;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.g.a */
public final class C56430a extends AbstractC56447g<C56340d> implements AbstractC66619c {

    /* renamed from: g */
    private C88411a f128699g;

    /* renamed from: h */
    private final AbstractC66617b f128700h;

    static {
        Covode.recordClassIndex(66250);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: c */
    public final void mo91926c(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: b */
    public final void mo93407b() {
        C88411a aVar = this.f128699g;
        if (aVar == null) {
            C89219l.m154710a("subscription");
        }
        aVar.dispose();
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: a */
    public final void mo93405a() {
        C88411a aVar = new C88411a();
        this.f128699g = aVar;
        this.f128700h.setUFRSubscription(aVar);
        RecommendUserVM e = mo93415e();
        if (!e.f128413i) {
            C56592y.m102559a("authorize_card_show", EnumC56508r.BOTTOM);
            e.f128413i = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.a$a */
    static final class C56432a extends AbstractC89220m implements AbstractC89172b<C56398e.C56399a, C89391z> {

        /* renamed from: a */
        public static final C56432a f128702a = new C56432a();

        static {
            Covode.recordClassIndex(66252);
        }

        C56432a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56398e.C56399a aVar) {
            C56398e.C56399a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo93389b();
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56430a(AbstractC66617b bVar) {
        super(bVar.getContainer());
        C89219l.m154721d(bVar, "");
        this.f128700h = bVar;
        bVar.mo9139b();
        bVar.setActionListener(this);
        bVar.setEnterFrom("notification_page");
        mo93412a(C564311.f128701a);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: b */
    public final void mo93408b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        super.mo93408b(bVar);
        this.f128700h.mo61458a(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: a */
    public final /* synthetic */ void mo93406a(C56340d dVar) {
        C89219l.m154721d(dVar, "");
        this.f128700h.mo61459a(EnumC66622f.CONTACT, EnumC66621e.INBOX_SMALL, -1);
        this.f128700h.setUFRExternalParams(C89041ag.m154412a(C89387v.m154943a("position", "bottom")));
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: b */
    public final void mo91925b(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        mo93415e().mo93322a(mo93413c());
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: a */
    public final void mo91924a(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        EnumC56501q.CONTACTS.markAction();
        C56407f.m102373a(C56432a.f128702a);
        mo93415e();
        C56592y.m102559a("find_friends", EnumC56508r.BOTTOM);
    }
}

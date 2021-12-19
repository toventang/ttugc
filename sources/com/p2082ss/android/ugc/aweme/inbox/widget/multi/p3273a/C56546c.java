package com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56501q;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56563c;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66621e;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.c */
public final class C56546c extends AbstractC56557f<C56563c> implements AbstractC66619c {

    /* renamed from: a */
    private C88411a f128939a;

    /* renamed from: b */
    private final AbstractC66617b f128940b;

    static {
        Covode.recordClassIndex(66369);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: c */
    public final void mo91926c(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    /* renamed from: b */
    public final void mo93483b() {
        super.mo93483b();
        C88411a aVar = this.f128939a;
        if (aVar == null) {
            C89219l.m154710a("subscription");
        }
        aVar.dispose();
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    public final void bP_() {
        C88411a aVar = new C88411a();
        this.f128939a = aVar;
        this.f128940b.setUFRSubscription(aVar);
        MultiViewModel d = mo93489d();
        if (!d.f128892k) {
            d.f128892k = true;
            C62259e.m112620a("authorize_card_show", EnumC56508r.TOP);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56546c(AbstractC66617b bVar) {
        super(bVar.getContainer());
        C89219l.m154721d(bVar, "");
        this.f128940b = bVar;
        bVar.mo9139b();
        bVar.setActionListener(this);
        bVar.setEnterFrom("notification_page");
        mo93487a(C565471.f128941a);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: a */
    public final void mo91924a(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        EnumC56501q.CONTACTS.markAction();
        mo93489d();
        C62259e.m112620a("find_friends", EnumC56508r.TOP);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    /* renamed from: b */
    public final void mo93480b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        this.f128940b.mo61458a(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.widget.multi.k] */
    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    /* renamed from: a */
    public final /* synthetic */ void mo93479a(C56563c cVar) {
        C56563c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        this.f128940b.mo61459a(EnumC66622f.CONTACT, EnumC66621e.INBOX_NORMAL, cVar2.f128972a);
        this.f128940b.setUFRExternalParams(C89041ag.m154412a(C89387v.m154943a("position", "top")));
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: b */
    public final void mo91925b(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        mo93489d().mo93471a(mo93488c());
    }
}

package com.p2082ss.android.ugc.aweme.search.keyword;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.keyword.SugKeywordViewModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter */
public final class SugKeywordPresenter implements AbstractC33974au, AbstractC57066a.AbstractC57069c {

    /* renamed from: a */
    public AbstractC57066a.AbstractC57070d f151354a;

    /* renamed from: b */
    public final ActivityC0945e f151355b;

    /* renamed from: c */
    private final AbstractC89244h f151356c = C89250i.m154773a((AbstractC89171a) new C67589a(this));

    static {
        Covode.recordClassIndex(79227);
    }

    /* renamed from: b */
    public final SugKeywordViewModel mo106528b() {
        return (SugKeywordViewModel) this.f151356c.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter$a */
    static final class C67589a extends AbstractC89220m implements AbstractC89171a<SugKeywordViewModel> {

        /* renamed from: a */
        final /* synthetic */ SugKeywordPresenter f151357a;

        static {
            Covode.recordClassIndex(79228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67589a(SugKeywordPresenter sugKeywordPresenter) {
            super(0);
            this.f151357a = sugKeywordPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SugKeywordViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3881a(this.f151357a.f151355b, (C1175ad.AbstractC1177b) null).mo3983a(SugKeywordViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a.AbstractC57069c
    /* renamed from: a */
    public final String mo94223a() {
        return String.valueOf(mo106528b().mo94222a().getValue());
    }

    public SugKeywordPresenter(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f151355b = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a.AbstractC57069c
    /* renamed from: a */
    public final void mo94224a(String str) {
        C89219l.m154721d(str, "");
        mo106528b().mo94222a().setValue(str);
    }
}

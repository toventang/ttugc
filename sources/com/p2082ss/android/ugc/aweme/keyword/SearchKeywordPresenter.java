package com.p2082ss.android.ugc.aweme.keyword;

import android.text.Editable;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter */
public final class SearchKeywordPresenter implements AbstractC33974au, AbstractC57066a.AbstractC57067a {

    /* renamed from: a */
    public final ActivityC0945e f129929a;

    /* renamed from: b */
    private final AbstractC89244h f129930b = C89250i.m154773a((AbstractC89171a) new C57063b(this));

    /* renamed from: c */
    private final AbstractC89244h f129931c = C89250i.m154773a((AbstractC89171a) new C57062a(this));

    static {
        Covode.recordClassIndex(66953);
    }

    /* renamed from: c */
    private final SearchKeywordViewModel m103422c() {
        return (SearchKeywordViewModel) this.f129930b.getValue();
    }

    /* renamed from: d */
    private final SearchEditTextViewModel m103423d() {
        return (SearchEditTextViewModel) this.f129931c.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter$a */
    static final class C57062a extends AbstractC89220m implements AbstractC89171a<SearchEditTextViewModel> {

        /* renamed from: a */
        final /* synthetic */ SearchKeywordPresenter f129932a;

        static {
            Covode.recordClassIndex(66954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57062a(SearchKeywordPresenter searchKeywordPresenter) {
            super(0);
            this.f129932a = searchKeywordPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchEditTextViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3881a(this.f129932a.f129929a, (C1175ad.AbstractC1177b) null).mo3983a(SearchEditTextViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter$b */
    static final class C57063b extends AbstractC89220m implements AbstractC89171a<SearchKeywordViewModel> {

        /* renamed from: a */
        final /* synthetic */ SearchKeywordPresenter f129933a;

        static {
            Covode.recordClassIndex(66955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57063b(SearchKeywordPresenter searchKeywordPresenter) {
            super(0);
            this.f129933a = searchKeywordPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchKeywordViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3881a(this.f129933a.f129929a, (C1175ad.AbstractC1177b) null).mo3983a(SearchKeywordViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a.AbstractC57068b
    /* renamed from: a */
    public final C57071b mo94218a() {
        C57071b value = m103422c().mo94221a().getValue();
        if (value == null) {
            return new C57071b(null, null, 3);
        }
        return value;
    }

    @Override // com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a.AbstractC57068b
    /* renamed from: b */
    public final String mo94220b() {
        Editable text;
        String obj;
        EditText value = m103423d().mo106527a().getValue();
        if (value == null || (text = value.getText()) == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    public SearchKeywordPresenter(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f129929a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a.AbstractC57067a
    /* renamed from: a */
    public final void mo94219a(C57071b bVar) {
        C89219l.m154721d(bVar, "");
        m103422c().mo94221a().setValue(bVar);
    }
}

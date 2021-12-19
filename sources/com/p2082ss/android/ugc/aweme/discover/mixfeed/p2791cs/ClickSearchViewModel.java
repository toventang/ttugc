package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p2082ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p2082ss.android.ugc.aweme.discover.api.p2765a.C41855a;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.ClickSearchWord;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchViewModel */
public final class ClickSearchViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public WeakReference<Fragment> f98605a;

    /* renamed from: b */
    private final AbstractC89244h f98606b = C89250i.m154773a((AbstractC89171a) C42331d.f98620a);

    /* renamed from: c */
    private final AbstractC89244h f98607c = C89250i.m154773a((AbstractC89171a) C42329b.f98613a);

    /* renamed from: d */
    private final AbstractC89244h f98608d = C89250i.m154773a((AbstractC89171a) C42332e.f98621a);

    static {
        Covode.recordClassIndex(50272);
    }

    /* renamed from: a */
    public final NextLiveData<C42340b> mo71517a() {
        return (NextLiveData) this.f98606b.getValue();
    }

    /* renamed from: b */
    public final NextLiveData<C42344e> mo71522b() {
        return (NextLiveData) this.f98607c.getValue();
    }

    /* renamed from: c */
    public final NextLiveData<Integer> mo71523c() {
        return (NextLiveData) this.f98608d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchViewModel$b */
    static final class C42329b extends AbstractC89220m implements AbstractC89171a<NextLiveData<C42344e>> {

        /* renamed from: a */
        public static final C42329b f98613a = new C42329b();

        static {
            Covode.recordClassIndex(50274);
        }

        C42329b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NextLiveData<C42344e> invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchViewModel$d */
    static final class C42331d extends AbstractC89220m implements AbstractC89171a<NextLiveData<C42340b>> {

        /* renamed from: a */
        public static final C42331d f98620a = new C42331d();

        static {
            Covode.recordClassIndex(50276);
        }

        C42331d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NextLiveData<C42340b> invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchViewModel$e */
    static final class C42332e extends AbstractC89220m implements AbstractC89171a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C42332e f98621a = new C42332e();

        static {
            Covode.recordClassIndex(50277);
        }

        C42332e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NextLiveData<Integer> invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: d */
    public final void mo71524d() {
        mo71517a().setValue(new C42340b());
        mo71522b().setValue(null);
    }

    /* renamed from: a */
    public final void mo71521a(Integer num) {
        mo71523c().setValue(num);
    }

    /* renamed from: a */
    private final void m84693a(AbstractC89172b<? super C42344e, C89391z> bVar) {
        bVar.invoke(mo71522b().getValue());
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchViewModel$a */
    static final class C42328a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ ClickSearchViewModel f98609a;

        /* renamed from: b */
        final /* synthetic */ int f98610b;

        /* renamed from: c */
        final /* synthetic */ String f98611c;

        /* renamed from: d */
        final /* synthetic */ String f98612d;

        static {
            Covode.recordClassIndex(50273);
        }

        C42328a(ClickSearchViewModel clickSearchViewModel, int i, String str, String str2) {
            this.f98609a = clickSearchViewModel;
            this.f98610b = i;
            this.f98611c = str;
            this.f98612d = str2;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            Object d;
            C89219l.m154716b(iVar, "");
            if (iVar.mo5535a() && (d = iVar.mo5545d()) != null) {
                ClickSearchViewModel clickSearchViewModel = this.f98609a;
                int i = this.f98610b;
                String str = this.f98611c;
                C89219l.m154716b(str, "");
                clickSearchViewModel.mo71519a(i, str, this.f98612d, new C41855a<>((ClickSearchResponse) d), true);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchViewModel$c */
    public static final class C42330c extends AbstractC89220m implements AbstractC89172b<C42344e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ClickSearchViewModel f98614a;

        /* renamed from: b */
        final /* synthetic */ int f98615b;

        /* renamed from: c */
        final /* synthetic */ String f98616c;

        /* renamed from: d */
        final /* synthetic */ String f98617d;

        /* renamed from: e */
        final /* synthetic */ C41855a f98618e;

        /* renamed from: f */
        final /* synthetic */ boolean f98619f;

        static {
            Covode.recordClassIndex(50275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42330c(ClickSearchViewModel clickSearchViewModel, int i, String str, String str2, C41855a aVar, boolean z) {
            super(1);
            this.f98614a = clickSearchViewModel;
            this.f98615b = i;
            this.f98616c = str;
            this.f98617d = str2;
            this.f98618e = aVar;
            this.f98619f = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C42344e eVar) {
            C42344e eVar2 = eVar;
            if (eVar2 != null && eVar2.f98645b == EnumC42343d.DATA_FETCHING && this.f98615b == eVar2.f98644a) {
                this.f98614a.mo71517a().postValue(new C42340b(this.f98615b, this.f98616c, this.f98617d, this.f98618e, this.f98619f));
                this.f98614a.mo71522b().setValue(new C42344e(this.f98615b, EnumC42343d.FINISHED));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo71518a(int i) {
        C42344e value = mo71522b().getValue();
        if (value != null && value.f98644a == i) {
            mo71522b().setValue(new C42344e(i, EnumC42343d.FINISHED));
        }
    }

    /* renamed from: a */
    public final void mo71520a(Aweme aweme, String str, int i) {
        C41855a<ClickSearchResponse> aVar;
        T t;
        List<ClickSearchWord> list;
        T t2;
        List<ClickSearchWord> list2;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        mo71522b().setValue(new C42344e(i, EnumC42343d.DATA_FETCHING));
        String aid = aweme.getAid();
        C42340b value = mo71517a().getValue();
        if (value == null || (aVar = value.f98638d) == null || (t = aVar.f97652b) == null || (list = t.wordsList) == null || list.size() <= 0 || value.f98635a != i) {
            SuggestWordsApi.C41852a aVar2 = new SuggestWordsApi.C41852a();
            aVar2.f97643f = str;
            aVar2.f97644g = aid;
            SuggestWordsApi.m83836d(aVar2).mo5534a(new C42328a(this, i, aid, str), C1731i.f5564c, null);
            return;
        }
        C41855a<ClickSearchResponse> aVar3 = value.f98638d;
        if (!(aVar3 == null || (t2 = aVar3.f97652b) == null || (list2 = t2.wordsList) == null)) {
            Integer.valueOf(list2.size());
        }
        C89219l.m154716b(aid, "");
        mo71519a(i, aid, str, value.f98638d, false);
    }

    /* renamed from: a */
    public final void mo71519a(int i, String str, String str2, C41855a<ClickSearchResponse> aVar, boolean z) {
        m84693a(new C42330c(this, i, str, str2, aVar, z));
    }
}

package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41636al;
import com.p2082ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p2082ss.android.ugc.aweme.discover.api.p2765a.C41855a;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingData;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.VisitedAccount;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41502aj;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41504al;
import com.p2082ss.android.ugc.aweme.discover.p2760a.p2761a.C41488a;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41893a;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41910a;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41913b;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41915c;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41916d;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41918e;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41919f;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41920g;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41933l;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.intermediate.C42871b;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67476ah;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67480aj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67488ao;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67490ap;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67526bh;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67532bk;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67562n;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import com.p2082ss.android.ugc.aweme.search.viewmodel.SuggestWordsViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80372ec;
import com.p2082ss.android.ugc.aweme.utils.C80512gt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ay */
public abstract class AbstractC42708ay<SuggestType> extends AbstractC42584a implements AbstractC42664al.AbstractC42666b, AbstractC42664al.AbstractC42667c, AbstractC42664al.AbstractC42668d, AbstractC42664al.AbstractC42669e, AbstractC90252i, AbstractC90253j {

    /* renamed from: n */
    public static final C42709a f99615n = new C42709a((byte) 0);

    /* renamed from: o */
    private SuggestWordsViewModel f99616o;

    /* renamed from: p */
    private final AbstractC1214u<C41855a<List<TypeWords>>> f99617p = new C42710b(this);

    /* renamed from: q */
    private final AbstractC1214u<Word> f99618q = new C42711c(this);

    /* renamed from: r */
    private final AbstractC1214u<C41855a<TrendingData>> f99619r = new C42713e(this);

    /* renamed from: s */
    private final AbstractC89244h f99620s = C80372ec.m139350a(new C42712d(this));

    /* renamed from: t */
    private SparseArray f99621t;

    static {
        Covode.recordClassIndex(50812);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(236, new RunnableC90250g(AbstractC42708ay.class, "onSearchHistoryChangedEvent", C41933l.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo72802x();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: x */
    public void mo72802x() {
        SparseArray sparseArray = this.f99621t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C41636al<SuggestType> mo72939y() {
        return (C41636al) this.f99620s.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ay$a */
    public static final class C42709a {
        static {
            Covode.recordClassIndex(50813);
        }

        private C42709a() {
        }

        public /* synthetic */ C42709a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: a */
    public final void mo72780a(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        super.mo72780a(dVar);
        C41636al<SuggestType> y = mo72939y();
        if (y != null) {
            y.mo70850b();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int i = this.f99351j;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a, com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a
    /* renamed from: a */
    public final int mo71102a() {
        int u = mo72799u();
        if (this instanceof C42778bm) {
            u = Integer.MIN_VALUE;
        }
        return SearchHistory.toHistoryType(u);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ay$d */
    static final class C42712d extends AbstractC89220m implements AbstractC89171a<C41636al<SuggestType>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42708ay f99624a;

        static {
            Covode.recordClassIndex(50816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42712d(AbstractC42708ay ayVar) {
            super(0);
            this.f99624a = ayVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            AbstractC42708ay ayVar = this.f99624a;
            C41636al alVar = new C41636al(ayVar);
            C41893a aVar = new C41893a(alVar);
            C89219l.m154721d(aVar, "");
            ((AbstractC42584a) ayVar).f99346a = aVar;
            return alVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42666b
    /* renamed from: b */
    public final void mo72863b() {
        new C67480aj().mo106488q("clear_all").mo106486f(mo72798t()).mo96792f();
        mo72788j().clearSearchHistory();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42666b
    /* renamed from: c */
    public final void mo72865c() {
        new C67480aj().mo106488q("show_all").mo106486f(mo72798t()).mo96792f();
        C41636al<SuggestType>.C41638b a = mo72939y().mo70847a();
        a.f97126e = true;
        a.mo70852b();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: m */
    public final void mo72791m() {
        super.mo72791m();
        C41636al<SuggestType> y = mo72939y();
        C89219l.m154721d(this, "");
        C41915c cVar = y.f97113a;
        C89219l.m154721d(this, "");
        cVar.f97781a = this;
        C41910a aVar = y.f97114b;
        C89219l.m154721d(this, "");
        aVar.f97777a = this;
        C41913b bVar = y.f97116d;
        C89219l.m154721d(this, "");
        bVar.f97779a = this;
        C41916d dVar = y.f97115c;
        C89219l.m154721d(this, "");
        dVar.f97782a = this;
        C41636al<SuggestType> y2 = mo72939y();
        C89219l.m154721d(this, "");
        C41918e eVar = y2.f97117e;
        C89219l.m154721d(this, "");
        eVar.f97784a = this;
        C41636al<SuggestType> y3 = mo72939y();
        C89219l.m154721d(this, "");
        C41920g gVar = y3.f97118f;
        C89219l.m154721d(this, "");
        gVar.f97788a = this;
        C41636al<SuggestType> y4 = mo72939y();
        C89219l.m154721d(this, "");
        C41919f fVar = y4.f97119g;
        C89219l.m154721d(this, "");
        fVar.f97787a = this;
        C41636al<SuggestType> y5 = mo72939y();
        y5.f97117e.f97785b = mo72786h();
        y5.f97117e.f97786c = y5.f97120h;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: n */
    public final void mo72792n() {
        super.mo72792n();
        if (C41504al.f96824a || C41502aj.f96820a || C41488a.f96795a) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            SuggestWordsViewModel a = SuggestWordsViewModel.C67805a.m119992a(activity);
            if (C41504al.f96824a || C41502aj.f96820a) {
                C33943c<C41855a<List<TypeWords>>> cVar = a.f151963a;
                ActivityC0945e activity2 = getActivity();
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                cVar.observe(activity2, this.f99617p);
            }
            if (mo72790l()) {
                C33943c<Word> cVar2 = a.f151964b;
                ActivityC0945e activity3 = getActivity();
                if (activity3 == null) {
                    C89219l.m154715b();
                }
                cVar2.observe(activity3, this.f99618q);
            }
            if (C41488a.f96795a) {
                C33943c<C41855a<TrendingData>> cVar3 = a.f151966d;
                ActivityC0945e activity4 = getActivity();
                if (activity4 == null) {
                    C89219l.m154715b();
                }
                cVar3.observe(activity4, this.f99619r);
            }
            this.f99616o = a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: p */
    public final void mo72794p() {
        SuggestWordsViewModel suggestWordsViewModel;
        C33943c<C41855a<TrendingData>> cVar;
        String str;
        super.mo72794p();
        mo72939y().mo70847a().f97127f = null;
        mo72939y().mo70849a(mo72789k(), true);
        RecyclerView d = mo72783d();
        C41893a aVar = ((AbstractC42584a) this).f99346a;
        if (aVar == null) {
            C89219l.m154710a("mHeaderAndFooterWrapper");
        }
        d.setAdapter(aVar);
        if (!mo72789k().isEmpty()) {
            new C67480aj().mo106488q("show").mo106486f(mo72798t()).mo96792f();
        }
        if (C41504al.f96824a || C41502aj.f96820a) {
            SuggestWordsViewModel suggestWordsViewModel2 = this.f99616o;
            if (suggestWordsViewModel2 != null) {
                C67674b b = SearchEnterViewModel.C42997a.m85831b(getActivity());
                C67562n.C67563a.m119642a(0);
                SuggestWordsApi.C41852a aVar2 = new SuggestWordsApi.C41852a();
                aVar2.f97638a = "100011";
                if (b != null) {
                    str = b.getGroupId();
                } else {
                    str = null;
                }
                aVar2.f97641d = str;
                aVar2.f97646i = Integer.valueOf(C41504al.m83449a());
                C89219l.m154721d(aVar2, "");
                SuggestWordsApi.m83832a().getSuggestWords(aVar2.f97638a, aVar2.f97641d, aVar2.f97642e, aVar2.f97646i, C80512gt.f180112c.mo123769a().mo123767a(), "qrec").mo5534a(new SuggestWordsViewModel.C67806b(suggestWordsViewModel2), C1731i.f5564c, null);
            }
        } else {
            C42871b.m85602a(System.currentTimeMillis(), false);
        }
        if (C41488a.f96795a) {
            if (mo72786h().backFromSearchResult && mo72786h().enterSearchMiddlePageByBack) {
                mo72786h().getDismissKeyboard().setValue(true);
            }
            SuggestWordsViewModel suggestWordsViewModel3 = this.f99616o;
            if ((suggestWordsViewModel3 == null || (cVar = suggestWordsViewModel3.f151966d) == null || cVar.getValue() == null || !mo72786h().backFromSearchResult) && (suggestWordsViewModel = this.f99616o) != null) {
                suggestWordsViewModel.mo106904a();
            }
        }
        this.f99351j = 1;
        C41636al<SuggestType> y = mo72939y();
        if (y != null) {
            y.mo70850b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: a */
    public final void mo72779a(View view) {
        C89219l.m154721d(view, "");
        super.mo72779a(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ay$c */
    static final class C42711c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC42708ay f99623a;

        static {
            Covode.recordClassIndex(50815);
        }

        C42711c(AbstractC42708ay ayVar) {
            this.f99623a = ayVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Word word = (Word) obj;
            if (!TextUtils.isEmpty(word.getWord())) {
                this.f99623a.mo72786h().getFirstGuessWord().setValue(word);
                C67674b bVar = SearchEnterViewModel.C42997a.m85830a(this.f99623a.getActivity()).f100248a;
                if (bVar != null) {
                    bVar.setSearchHint(word.getWord());
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42669e
    /* renamed from: a */
    public final void mo72869a(RecyclerView.AbstractC1371n nVar) {
        C89219l.m154721d(nVar, "");
        mo72783d().mo4405a(nVar);
    }

    @AbstractC90264r(mo145423b = true)
    public final void onSearchHistoryChangedEvent(C41933l lVar) {
        C89219l.m154721d(lVar, "");
        mo72789k().clear();
        mo72789k().addAll(mo72797s());
        if (af_() && (mo72783d().getAdapter() instanceof C41893a)) {
            mo72939y().mo70849a(mo72789k(), false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ay$e */
    static final class C42713e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC42708ay f99625a;

        static {
            Covode.recordClassIndex(50817);
        }

        C42713e(AbstractC42708ay ayVar) {
            this.f99625a = ayVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            ArrayList<C67590l> arrayList;
            C41855a aVar = (C41855a) obj;
            if (aVar == null) {
                return;
            }
            if (aVar.f97651a) {
                T t = aVar.f97652b;
                C41636al<SuggestType>.C41638b a = this.f99625a.mo72939y().mo70847a();
                a.f97128g = t;
                a.mo70852b();
                AbstractC42708ay ayVar = this.f99625a;
                if (t == null || (arrayList = t.billboardInfo) == null) {
                    i = 0;
                } else {
                    i = arrayList.size();
                }
                C39162r.m79460a("trending_topic_show", new C33744d().mo59983a("search_position", ayVar.mo72801w()).mo59980a("order", -1).mo59980a("item_num", i).f79943a);
                return;
            }
            this.f99625a.mo72939y().mo70848a((List<TypeWords>) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ay$b */
    static final class C42710b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC42708ay f99622a;

        static {
            Covode.recordClassIndex(50814);
        }

        C42710b(AbstractC42708ay ayVar) {
            this.f99622a = ayVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<VisitedAccount> list;
            List<Word> list2;
            C41855a aVar = (C41855a) obj;
            if (aVar == null) {
                return;
            }
            if (aVar.f97651a) {
                T t = aVar.f97652b;
                this.f99622a.mo72939y().mo70848a((List<TypeWords>) t);
                if (t != null) {
                    for (T t2 : t) {
                        if (!t2.fromCache && (list2 = t2.words) != null && (!list2.isEmpty())) {
                            AbstractC42708ay ayVar = this.f99622a;
                            List<Word> list3 = t2.words;
                            String str = t2.imprId;
                            C89219l.m154721d(str, "");
                            if (list3 != null) {
                                ((C67530bj) new C67526bh().mo106470c(Integer.valueOf(list3.size())).mo106477y(ayVar.mo72801w()).mo106469a(SearchEnterViewModel.C42997a.m85830a(ayVar.getActivity()).mo73185b().obtainLogData("tab_name")).mo106484d(str)).mo106474v("recom_search").mo96792f();
                                int i = 0;
                                for (T t3 : list3) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        C89070n.m154520a();
                                    }
                                    T t4 = t3;
                                    ((C67530bj) ((C67530bj) new C67532bk().mo106453i(t4.getId())).mo106475w(t4.getWord()).mo106484d(str)).mo106477y(ayVar.mo72801w()).mo106469a(SearchEnterViewModel.C42997a.m85830a(ayVar.getActivity()).mo73185b().obtainLogData("tab_name")).mo106474v("recom_search").mo106471d(Integer.valueOf(i)).mo106475w(t4.getWord()).mo106464A(t4.getWordType()).mo106453i(t4.getId()).mo96792f();
                                    i = i2;
                                }
                            }
                        }
                        if (!t2.fromCache && (list = t2.visitedAccount) != null && (!list.isEmpty())) {
                            AbstractC42708ay ayVar2 = this.f99622a;
                            List<VisitedAccount> list4 = t2.visitedAccount;
                            C89219l.m154721d(t2.imprId, "");
                            if (list4 != null) {
                                new C67490ap().mo106477y(ayVar2.mo72801w()).mo106481b((Integer) -1).mo96792f();
                                int i3 = 0;
                                for (T t5 : list4) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        C89070n.m154520a();
                                    }
                                    T t6 = t5;
                                    C67490ap apVar = new C67490ap();
                                    apVar.mo106452c("sug_user_id", t6.getUid());
                                    ((C67530bj) apVar.mo106477y(ayVar2.mo72801w()).mo106481b(Integer.valueOf(i3))).mo106472t(t6.getRelationShip()).mo106482b(t6.getNickname()).mo96792f();
                                    i3 = i4;
                                }
                            }
                        }
                    }
                }
                C42871b.m85602a(System.currentTimeMillis(), false);
                return;
            }
            this.f99622a.mo72939y().mo70848a((List<TypeWords>) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42666b
    /* renamed from: b */
    public final void mo72864b(SearchHistory searchHistory, int i) {
        C89219l.m154721d(searchHistory, "");
        if (i >= 0 && i < mo72789k().size()) {
            new C67480aj().mo106488q("clear").mo106481b(Integer.valueOf(i)).mo106482b(searchHistory.keyword).mo106486f(mo72798t()).mo96792f();
            mo72788j().deleteSearchHistory(searchHistory);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42666b
    /* renamed from: a */
    public final void mo72862a(SearchHistory searchHistory, int i) {
        C89219l.m154721d(searchHistory, "");
        C67678d searchFrom = new C67678d().setKeyword(searchHistory.keyword).setSearchFrom("search_history");
        C89219l.m154716b(searchFrom, "");
        C67605g.m119729a(4, searchFrom);
        C67606h.m119735a(4, searchFrom);
        C67592a.f151373f.onEventStart(searchFrom);
        mo72780a(searchFrom);
        new C67480aj().mo106488q("click").mo106481b(Integer.valueOf(i)).mo106482b(searchHistory.keyword).mo106486f(mo72798t()).mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42667c
    /* renamed from: a */
    public final void mo72866a(VisitedAccount visitedAccount, int i) {
        List<VisitedAccount> list;
        if (visitedAccount != null) {
            ((C67530bj) ((C67488ao) new C67488ao().mo106488q("clear")).mo106438r(visitedAccount.getUid()).mo106477y(mo72801w()).mo106481b(Integer.valueOf(i))).mo106472t(visitedAccount.getRelationShip()).mo106482b(visitedAccount.getNickname()).mo96792f();
            C41636al<SuggestType>.C41638b a = mo72939y().mo70847a();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            List<TypeWords> list2 = a.f97127f;
            if (list2 != null) {
                for (T t : list2) {
                    if (t == null || (list = t.visitedAccount) == null || !(!list.isEmpty())) {
                        arrayList.add(t);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        List<VisitedAccount> list3 = t.visitedAccount;
                        if (list3 != null) {
                            for (T t2 : list3) {
                                String uid = t2.getUid();
                                if (uid != null && !uid.equals(visitedAccount.getUid())) {
                                    arrayList2.add(t2);
                                }
                            }
                        }
                        t.visitedAccount = arrayList2;
                        List<VisitedAccount> list4 = t.visitedAccount;
                        if (list4 == null || !(!list4.isEmpty())) {
                            z = true;
                        } else {
                            arrayList.add(t);
                        }
                        List<VisitedAccount> list5 = t.visitedAccount;
                        if (list5 != null) {
                            Integer.valueOf(list5.size());
                        }
                    }
                }
            }
            a.f97127f = arrayList;
            if (z) {
                a.mo70852b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42668d
    /* renamed from: a */
    public final void mo72868a(Word word, int i) {
        C42452d.f98939k = 0;
        SearchIntermediateViewModel h = mo72786h();
        if (h != null) {
            h.handleSuggestWordItemClick(word, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42669e
    /* renamed from: b */
    public final void mo72871b(C67590l lVar, int i, int i2) {
        C89219l.m154721d(lVar, "");
        C39162r.m79460a("trending_topic_click", new C33744d().mo59983a("search_position", mo72801w()).mo59980a("order", i).mo59980a("item_num", i2).mo59983a("trending_topic_tag", lVar.getType()).mo59982a("trending_topic_vv", lVar.getHeatValue()).mo59983a("search_keyword", lVar.getTrendingName()).f79943a);
        C67678d trendingEventId = new C67678d().setKeyword(lVar.getTrendingName()).setSearchFrom("trending_topic").setTrendingEventId(lVar.getEventId());
        C89219l.m154716b(trendingEventId, "");
        C67605g.m119729a(7, trendingEventId);
        C67606h.m119735a(7, trendingEventId);
        C67592a.f151373f.onEventStart(trendingEventId);
        mo72780a(trendingEventId);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42667c
    /* renamed from: a */
    public final void mo72867a(VisitedAccount visitedAccount, String str, int i) {
        if (visitedAccount != null) {
            ((C67530bj) ((C67488ao) new C67488ao().mo106488q("click")).mo106438r(visitedAccount.getUid()).mo106477y(mo72801w()).mo106481b(Integer.valueOf(i))).mo106472t(visitedAccount.getRelationShip()).mo106482b(visitedAccount.getNickname()).mo96792f();
            C67540c a = ((C67540c) new C67476ah().mo106459o("search_most_visited").mo106460p("click_search_most_visited")).mo106482b(visitedAccount.getNickname()).mo106484d(str).mo106480a(str).mo106479a(Integer.valueOf(i));
            a.mo106452c("to_user_id", visitedAccount.getUid());
            a.mo106452c("user_tag", visitedAccount.getRelationShip());
            a.mo96792f();
            mo72781a(visitedAccount.getSecUid(), visitedAccount.getUid(), visitedAccount.getNickname());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al.AbstractC42669e
    /* renamed from: a */
    public final void mo72870a(C67590l lVar, int i, int i2) {
        C89219l.m154721d(lVar, "");
        C39162r.m79460a("trending_topic_show", new C33744d().mo59983a("search_position", mo72801w()).mo59980a("order", i).mo59980a("item_num", i2).mo59983a("trending_topic_tag", lVar.getType()).mo59982a("trending_topic_vv", lVar.getHeatValue()).mo59983a("search_keyword", lVar.getTrendingName()).f79943a);
    }
}

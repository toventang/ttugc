package com.p2082ss.android.ugc.aweme.discover.p2797ui.intermediate;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.google.gson.C27910f;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.TemplateData;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.common.p2636h.C39133d;
import com.p2082ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p2082ss.android.ugc.aweme.discover.api.p2765a.C41855a;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42201a;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42203c;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42205d;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42207e;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.C42193a;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.C42197b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2782d.C42213c;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingData;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingDataJson;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41501ai;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41502aj;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41504al;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41545q;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41548t;
import com.p2082ss.android.ugc.aweme.discover.p2760a.p2761a.C41488a;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41922b;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41925d;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41933l;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67562n;
import com.p2082ss.android.ugc.aweme.search.viewmodel.SuggestWordsViewModel;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.intermediate.DynamicSingleIntermediateFragment */
public final class DynamicSingleIntermediateFragment extends AbstractC42584a implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: n */
    public C42207e f99953n;

    /* renamed from: o */
    public final C27910f f99954o = new C27910f();

    /* renamed from: p */
    private SuggestWordsViewModel f99955p;

    /* renamed from: q */
    private int f99956q = -1;

    /* renamed from: r */
    private final AbstractC1214u<C41855a<String>> f99957r = new C42867b(this);

    /* renamed from: s */
    private final AbstractC1214u<Word> f99958s = new C42866a(this);

    /* renamed from: t */
    private final AbstractC1214u<C41855a<TrendingData>> f99959t = new C42868c(this);

    /* renamed from: u */
    private SparseArray f99960u;

    static {
        Covode.recordClassIndex(50970);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(183, new RunnableC90250g(DynamicSingleIntermediateFragment.class, "onDiscoverSearchEvent", C41925d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(236, new RunnableC90250g(DynamicSingleIntermediateFragment.class, "onSearchHistoryChangedEvent", C41933l.class, ThreadMode.MAIN, 0, true));
        hashMap.put(398, new RunnableC90250g(DynamicSingleIntermediateFragment.class, "onClickVisitedAccountEvent", C41922b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(Integer.valueOf((int) LiveFeedRefreshTimeSetting.DEFAULT), new RunnableC90250g(DynamicSingleIntermediateFragment.class, "onJsBroadcastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo72802x();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: x */
    public final void mo72802x() {
        SparseArray sparseArray = this.f99960u;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: q */
    public final void mo72795q() {
        mo72783d().setVisibility(0);
        mo72784e().setVisibility(4);
        super.mo72795q();
    }

    /* renamed from: y */
    private final String m85595y() {
        List<SearchHistory> s = mo72797s();
        JSONArray jSONArray = new JSONArray();
        for (SearchHistory searchHistory : s) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("word", searchHistory.keyword);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("historyList", jSONArray);
        String jSONObject3 = jSONObject2.toString();
        C89219l.m154716b(jSONObject3, "");
        return jSONObject3;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: o */
    public final boolean mo72793o() {
        Integer value = mo72786h().getIntermediateState().getValue();
        if (value == null) {
            return false;
        }
        if (value.intValue() == 2) {
            if (mo72784e().getVisibility() == 0) {
                mo72784e().setVisibility(4);
            }
        } else if (value.intValue() == 0) {
            if (mo72784e().getVisibility() == 0) {
                mo72784e().setVisibility(4);
            }
        } else if (value.intValue() == 1 && mo72783d().getVisibility() == 0) {
            mo72783d().setVisibility(4);
        }
        return super.mo72793o();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: p */
    public final void mo72794p() {
        String groupId;
        SuggestWordsViewModel suggestWordsViewModel;
        String str;
        MethodCollector.m26663i(7610);
        int i = 0;
        mo72784e().setVisibility(0);
        C42207e eVar = this.f99953n;
        if (eVar == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        ViewParent parent = eVar.getParent();
        String str2 = null;
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup e = mo72784e();
        C42207e eVar2 = this.f99953n;
        if (eVar2 == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        e.addView(eVar2, new ViewGroup.LayoutParams(-1, -1));
        C42207e eVar3 = this.f99953n;
        if (eVar3 == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        List<C42201a> a = C42869a.m85601a();
        C42201a aVar = (C42201a) C89070n.m154561b((List) a, 0);
        if (aVar != null) {
            this.f99956q = C42197b.m84461a(aVar.f98365b);
        }
        eVar3.mo71405a(a);
        C42207e eVar4 = this.f99953n;
        if (eVar4 == null) {
            C89219l.m154710a("dynamicViewsContainer");
        } else {
            C42203c cVar = eVar4.f98378b;
            if (cVar == null) {
                C89219l.m154710a("dynamicViewAdapter");
            } else {
                cVar.f98368a.clear();
                cVar.f98369b.clear();
            }
        }
        super.mo72794p();
        new C42213c().mo71412a("click_input_area").mo96792f();
        boolean z = C41545q.f96896a;
        if ((!mo72786h().backFromSearchResult || z) && ((C41504al.f96824a || C41502aj.f96820a) && (suggestWordsViewModel = this.f99955p) != null)) {
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
            SuggestWordsApi.m83831a(aVar2).mo5534a(new SuggestWordsViewModel.C67807c(suggestWordsViewModel), C1731i.f5564c, null);
        }
        if (C41488a.f96795a) {
            SuggestWordsViewModel suggestWordsViewModel2 = this.f99955p;
            if (suggestWordsViewModel2 != null) {
                suggestWordsViewModel2.mo106904a();
            }
            C42207e eVar5 = this.f99953n;
            if (eVar5 == null) {
                C89219l.m154710a("dynamicViewsContainer");
            } else {
                RecyclerView recyclerView = eVar5.f98377a;
                if (recyclerView == null) {
                    C89219l.m154710a("recyclerView");
                }
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).mo4347a(0, 0);
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        if (mo72786h().backFromSearchResult) {
            str2 = "result";
        } else {
            C67674b b2 = SearchEnterViewModel.C42997a.m85831b(getActivity());
            if (b2 != null) {
                str2 = b2.getEnterSearchFrom();
            }
        }
        jSONObject.put("enter_from", str2);
        jSONObject.put("search_position", mo72801w());
        jSONObject.put("show_most_visited_account", C16048b.m29633a().mo25412a(true, "show_most_visited_account", 0));
        jSONObject.put("show_search_history_lines", C41501ai.f96818a);
        jSONObject.put("show_suggest_search_words", C16048b.m29633a().mo25412a(true, "show_suggest_search_words", 0));
        Integer value = mo72786h().getSearchTabIndex().getValue();
        if (value == null) {
            value = -1;
        }
        String str3 = "";
        C89219l.m154716b(value, str3);
        jSONObject.put(StringSet.type, C67458j.m119528a(value.intValue()));
        jSONObject.put("language", C80398en.m139370a().toString());
        jSONObject.put("appLanguage", SettingServiceImpl.m120782v().mo108872h());
        jSONObject.put("appLocale", C53438a.m98623b());
        jSONObject.put("is_lynx_request_suggest", !z);
        C67674b b3 = SearchEnterViewModel.C42997a.m85831b(getActivity());
        if (!(b3 == null || (groupId = b3.getGroupId()) == null)) {
            str3 = groupId;
        }
        jSONObject.put("from_group_id", str3);
        if (this.f99956q == 1) {
            i = 1;
        }
        jSONObject.put("is_built_in", String.valueOf(i));
        jSONObject.put("prerender", String.valueOf(C41548t.f96901a ? 1 : 0));
        jSONObject.put("timestamp", C39133d.f92337a);
        Object obtainLogData = SearchEnterViewModel.C42997a.m85830a(getActivity()).mo73185b().obtainLogData("tab_name");
        if (obtainLogData != null) {
            jSONObject.put("tab_name", obtainLogData.toString());
        }
        C42207e eVar6 = this.f99953n;
        if (eVar6 == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        eVar6.mo71404a("searchTransferEnter", jSONObject);
        String y = m85595y();
        C42207e eVar7 = this.f99953n;
        if (eVar7 == null) {
            C89219l.m154710a("dynamicViewsContainer");
            MethodCollector.m26664o(7610);
            return;
        }
        eVar7.mo71403a(y);
        MethodCollector.m26664o(7610);
    }

    /* renamed from: a */
    public static final /* synthetic */ C42207e m85594a(DynamicSingleIntermediateFragment dynamicSingleIntermediateFragment) {
        C42207e eVar = dynamicSingleIntermediateFragment.f99953n;
        if (eVar == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        return eVar;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onClickVisitedAccountEvent(C41922b bVar) {
        if (bVar != null) {
            mo72781a(bVar.f97793c, bVar.f97792b, bVar.f97791a);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        if (C89219l.m154714a(jVar.f111077b.get("eventName"), (Object) "SearchTransferFirstScreenFinished")) {
            C42871b.m85602a(System.currentTimeMillis(), true);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN, mo145423b = true)
    public final void onSearchHistoryChangedEvent(C41933l lVar) {
        C89219l.m154721d(lVar, "");
        if (af_()) {
            String y = m85595y();
            C42207e eVar = this.f99953n;
            if (eVar == null) {
                C89219l.m154710a("dynamicViewsContainer");
            } else {
                eVar.mo71403a(y);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.intermediate.DynamicSingleIntermediateFragment$a */
    static final class C42866a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DynamicSingleIntermediateFragment f99961a;

        static {
            Covode.recordClassIndex(50971);
        }

        C42866a(DynamicSingleIntermediateFragment dynamicSingleIntermediateFragment) {
            this.f99961a = dynamicSingleIntermediateFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Word word = (Word) obj;
            if (!TextUtils.isEmpty(word.getWord())) {
                this.f99961a.mo72786h().getFirstGuessWord().setValue(word);
                C67674b bVar = SearchEnterViewModel.C42997a.m85830a(this.f99961a.getActivity()).f100248a;
                if (bVar != null) {
                    bVar.setSearchHint(word.getWord());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.intermediate.DynamicSingleIntermediateFragment$b */
    static final class C42867b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DynamicSingleIntermediateFragment f99962a;

        static {
            Covode.recordClassIndex(50972);
        }

        C42867b(DynamicSingleIntermediateFragment dynamicSingleIntermediateFragment) {
            this.f99962a = dynamicSingleIntermediateFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C41855a aVar = (C41855a) obj;
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("guessSearchData", (HashMap) this.f99962a.f99954o.mo46670a((String) aVar.f97652b, (Class) HashMap.class));
                TemplateData a = TemplateData.m56772a(linkedHashMap);
                C89219l.m154716b(a, "");
                a.f66712b = "guessSearchDataProcess";
                C42207e a2 = DynamicSingleIntermediateFragment.m85594a(this.f99962a);
                if (a2 != null) {
                    a2.mo71401a(a);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.intermediate.DynamicSingleIntermediateFragment$c */
    static final class C42868c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DynamicSingleIntermediateFragment f99963a;

        static {
            Covode.recordClassIndex(50973);
        }

        C42868c(DynamicSingleIntermediateFragment dynamicSingleIntermediateFragment) {
            this.f99963a = dynamicSingleIntermediateFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C41855a aVar = (C41855a) obj;
            if (aVar != null && aVar.f97651a) {
                T t = aVar.f97652b;
                try {
                    C42207e a = DynamicSingleIntermediateFragment.m85594a(this.f99963a);
                    if (a != null) {
                        String b = this.f99963a.f99954o.mo46674b(new TrendingDataJson(t));
                        C89219l.m154716b(b, "");
                        a.mo71403a(b);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: a */
    public final void mo72779a(View view) {
        C89219l.m154721d(view, "");
        super.mo72779a(view);
        this.f99953n = C42205d.m84471a().getFirst();
        if (C41504al.f96824a || C41502aj.f96820a || C41488a.f96795a) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            SuggestWordsViewModel a = SuggestWordsViewModel.C67805a.m119992a(activity);
            if (C41504al.f96824a || C41502aj.f96820a) {
                C33943c<C41855a<String>> cVar = a.f151965c;
                ActivityC0945e activity2 = getActivity();
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                cVar.observe(activity2, this.f99957r);
            }
            if (mo72790l()) {
                C33943c<Word> cVar2 = a.f151964b;
                ActivityC0945e activity3 = getActivity();
                if (activity3 == null) {
                    C89219l.m154715b();
                }
                cVar2.observe(activity3, this.f99958s);
            }
            if (C41488a.f96795a) {
                C33943c<C41855a<TrendingData>> cVar3 = a.f151966d;
                ActivityC0945e activity4 = getActivity();
                if (activity4 == null) {
                    C89219l.m154715b();
                }
                cVar3.observe(activity4, this.f99959t);
            }
            this.f99955p = a;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDiscoverSearchEvent(C41925d dVar) {
        String str;
        if (dVar != null && !dVar.f97796a) {
            JSONObject jSONObject = new JSONObject();
            if (mo72786h().backFromSearchResult) {
                str = "result";
            } else {
                C67674b b = SearchEnterViewModel.C42997a.m85831b(getActivity());
                if (b != null) {
                    str = b.getEnterSearchFrom();
                } else {
                    str = null;
                }
            }
            jSONObject.put("enter_from", str);
            Integer value = mo72786h().getSearchTabIndex().getValue();
            if (value == null) {
                value = 0;
            }
            C89219l.m154716b(value, "");
            jSONObject.put(StringSet.type, C67458j.m119528a(value.intValue()));
            C42207e eVar = this.f99953n;
            if (eVar == null) {
                C89219l.m154710a("dynamicViewsContainer");
            } else {
                eVar.mo71404a("searchTransferQuit", jSONObject);
            }
            C42193a.m84452a();
        }
    }
}

package com.p2082ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.google.gson.C27917g;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.p2082ss.android.sdk.webview.C30248e;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41643am;
import com.p2082ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42020h;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42205d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42312e;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42455g;
import com.p2082ss.android.ugc.aweme.discover.mob.C42465m;
import com.p2082ss.android.ugc.aweme.discover.mob.C42466n;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41529f;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41531g;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41533i;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41534j;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41535k;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41547s;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41548t;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41902e;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42120s;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42639ae;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42640af;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42778bm;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.intermediate.C42871b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.intermediate.DynamicSingleIntermediateFragment;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42912b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.C42954c;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.FeedbackSubmitSuccessMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.OpenConfirmAlertMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.SearchKeywordChangeMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.DeleteMostVisitedAccountMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.DeleteSearchHistoryMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.FollowPACheckMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.GetSearchHistoryMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.HideSearchLoadingMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.KeyboardChangeMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.OpenAlertMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.OpenEffectRecordMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.OpenHotSpotMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.OpenLiveMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.OpenLiveMoreMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.OpenPlaylistMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.PlayMusicBridge;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.SaveSearchHistoryAndGoDetail;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.SearchCardClickMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.SearchLaunchChatMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.SearchRefreshMonitorMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.SearchRequestSuccessMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.UpdateGeneralSearchBackgroundMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.UpdateRawDataMethod;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.suggest.C42964c;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.suggest.DiscoverySuggestSearchViewHolder;
import com.p2082ss.android.ugc.aweme.discover.service.C42524a;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.p2082ss.android.ugc.aweme.search.gson.SearchMixFeedCollectionTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67677c;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.model.C67680f;
import com.p2082ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67363b;
import com.p2082ss.android.ugc.aweme.search.p3692h.C67452c;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67504aw;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67617g;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import com.p2082ss.android.ugc.aweme.search.p3699m.C67648a;
import com.p2082ss.android.ugc.aweme.search.p3705s.C67721b;
import com.p2082ss.android.ugc.aweme.utils.C80375ef;
import com.p2082ss.android.ugc.aweme.utils.C80512gt;
import com.p2082ss.android.ugc.aweme.xsearch.C81689d;
import com.p2082ss.android.ugc.aweme.xsearch.horizontallist.LynxSearchHorizontal;
import com.p2082ss.android.ugc.aweme.xsearch.live.LynxSearchLive;
import com.p2082ss.android.ugc.aweme.xsearch.video.C81772d;
import com.p2082ss.android.ugc.aweme.xsearch.video.LynxSearchVideo;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.a */
public abstract class AbstractC67337a implements ISearchService {
    static {
        Covode.recordClassIndex(78965);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: c */
    public final ISearchResultStatistics mo106213c() {
        return C42466n.f98992a;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: d */
    public final AbstractC67366e mo106215d() {
        return C42912b.f100060a;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: f */
    public final AbstractC41955b mo106217f() {
        return C42524a.f99151b;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: h */
    public final boolean mo106219h() {
        return C67641m.f151543a;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final boolean mo106207a(Activity activity) {
        return activity instanceof SearchResultActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106201a(C67677c cVar) {
        C89219l.m154721d(cVar, "");
        if (mo106226o()) {
            mo106224m();
        }
        C67680f fVar = new C67680f();
        fVar.setClickMagnifyingGlassTime(System.currentTimeMillis());
        cVar.f151638b.setTimeParam(fVar);
        C67435g.m119470a(cVar.f151637a, cVar.f151638b, cVar.f151639c, cVar.f151642f);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106199a(C27917g gVar) {
        C89219l.m154721d(gVar, "");
        if (C67617g.m119768a()) {
            gVar.mo46679a(new SearchMixFeedCollectionTypeAdapterFactory());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106205a(JSONObject jSONObject) {
        if (jSONObject != null && TextUtils.equals(jSONObject.optString("eventName"), "updateKeyword")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String str = null;
            String optString = optJSONObject != null ? optJSONObject.optString(StringSet.type, "") : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            if (optJSONObject2 != null) {
                str = optJSONObject2.optString("search_word", "");
            }
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(str)) {
                new Word().setWord(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106197a(int i, String str, int i2, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        String a = C42467o.m84876a(str4);
        C59252q o = new C59252q().mo96825o(C42467o.m84875a(i2));
        o.f135315r = str2;
        o.f135314q = str3;
        new C42455g().setOrder(i).setSearchKeyword(str).setRid(str2).setEnterFrom("find_friends").setEnterMethod(a).installToMetrics(o);
        o.mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106204a(String str, String str2, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        ((C67540c) new C67504aw(str).mo106459o(str2)).mo106483c(C48027ac.C48028a.f111257a.mo80055a(C42452d.m84857a())).mo106487g(C42452d.f98933e).mo96786a("tag_id", str3).mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106200a(C30248e eVar, WeakReference<Context> weakReference) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(weakReference, "");
        C18288a aVar = eVar.f72166b;
        if (aVar != null) {
            eVar.mo53711a(C42954c.f100162a, new SearchKeywordChangeMethod(aVar));
            eVar.mo53711a("openConfirmAlert", new OpenConfirmAlertMethod(weakReference, aVar));
            eVar.mo53711a("feedbackSubmitSuccess", new FeedbackSubmitSuccessMethod(aVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106203a(Exception exc, String str) {
        C89219l.m154721d(exc, "");
        C89219l.m154721d(str, "");
        C42912b.m85668a(exc, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106202a(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        C67605g.m119729a(0, dVar);
        C67606h.m119735a(0, dVar);
        C67592a.f151373f.onEventStart(dVar);
        C67721b.m119889a(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106206a(boolean z, List<? extends Aweme> list, int i) {
        C41902e.m83943a(z, list, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e6, code lost:
        if (r1.equals("playlist") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ef, code lost:
        if (r1.equals("selfharm") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f8, code lost:
        if (r1.equals("chat") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010d, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) "private", (java.lang.Object) r11.get("tab_name")) != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0116, code lost:
        if (r1.equals("unknow") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011f, code lost:
        if (r1.equals("notification_page") != false) goto L_0x00a3;
     */
    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106198a(androidx.lifecycle.AbstractC1204m r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.AbstractC67337a.mo106198a(androidx.lifecycle.m, java.lang.String, java.util.Map):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: k */
    public final boolean mo106222k() {
        return C41535k.m83471a();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: n */
    public final AbstractC42020h mo106225n() {
        return C42047s.C42048a.m84150a();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: q */
    public final boolean mo106228q() {
        return C41531g.m83469a();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: i */
    public final boolean mo106220i() {
        return ((Boolean) C41529f.f96867a.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: j */
    public final boolean mo106221j() {
        if (C16048b.m29633a().mo25412a(true, "enlarge_feed_search_icon", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: m */
    public final void mo106224m() {
        if (mo106226o()) {
            C42205d.m84472a(C41547s.f96899a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: o */
    public final boolean mo106226o() {
        if (!C41548t.f96901a || C42205d.f98373a) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: s */
    public final boolean mo106230s() {
        if (C16048b.m29633a().mo25412a(true, "black_discover_search_box_text", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: b */
    public final void mo106209b() {
        SearchHistoryManager.inst("").clearForAccountChange();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: e */
    public final C67674b mo106216e() {
        Activity j = C17873f.m33102j();
        if (j == null || !(j instanceof ActivityC0945e)) {
            return null;
        }
        return SearchEnterViewModel.C42997a.m85831b((ActivityC0945e) j);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: g */
    public final Fragment mo106218g() {
        long currentTimeMillis = System.currentTimeMillis();
        if (C42871b.f99968a <= 0) {
            C42871b.f99968a = currentTimeMillis;
        }
        if (!C41533i.f96873a) {
            return new C42778bm();
        }
        C42205d.m84471a();
        return new DynamicSingleIntermediateFragment();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: l */
    public final boolean mo106223l() {
        C41534j b;
        Integer num;
        C41534j b2 = C41535k.m83472b();
        Integer num2 = null;
        if (b2 != null) {
            num2 = b2.f96876b;
        }
        if (num2 == null || num2.intValue() != 1 || (b = C41535k.m83472b()) == null || (num = b.f96875a) == null || num.intValue() != 1 || C67431f.m119465a("search_common").getInt("feed_search_tips_shown", -1) == 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: r */
    public final AbstractC88979t<DiscoverSectionItem.SuggestSearchSection> mo106229r() {
        SuggestWordsApi.C41852a aVar = (SuggestWordsApi.C41852a) C89250i.m154773a((AbstractC89171a) C42964c.C42966b.f100190a).getValue();
        C89219l.m154721d(aVar, "");
        AbstractC88979t<R> d = SuggestWordsApi.m83832a().getSuggestSearchList(aVar.f97638a, aVar.f97639b, C80512gt.f180112c.mo123769a().mo123767a(), aVar.f97640c, aVar.f97647j).mo142925c(C42964c.C42965a.f100189a).mo142930d();
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: p */
    public final Map<String, String> mo106227p() {
        String str;
        int i;
        C67469ad c;
        String str2;
        C67469ad c2;
        String a = C42452d.m84857a();
        String str3 = "";
        if (a == null) {
            a = str3;
        }
        AbstractC67567q a2 = C67486am.m119564a();
        if (a2 == null || (c2 = a2.mo106431c()) == null || (str = c2.f151151a) == null) {
            str = str3;
        }
        AbstractC67567q a3 = C67486am.m119564a();
        if (!(a3 == null || (c = a3.mo106431c()) == null || (str2 = c.f151152b) == null)) {
            str3 = str2;
        }
        String str4 = C42452d.f98933e;
        AbstractC67567q a4 = C67486am.m119564a();
        if (a4 != null) {
            i = a4.mo106426a();
        } else {
            i = 0;
        }
        return C89041ag.m154421a(C89387v.m154943a("imprId", a), C89387v.m154943a("searchId", str), C89387v.m154943a("searchKeyword", str3), C89387v.m154943a("searchResultId", str4), C89387v.m154943a("searchType", C42465m.m84870b(i)));
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106195a() {
        C81772d dVar = C81772d.C81774b.f182846a;
        dVar.mo125489a(null, null, null, dVar.f182842b);
        C81772d.C81774b.f182846a.f182841a = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106196a(int i) {
        C81689d.f182657a = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final AbstractC42640af mo106191a(boolean z) {
        return new C42120s();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: c */
    public final void mo106214c(boolean z) {
        C41531g.f96870a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final LynxUI<?> mo106189a(AbstractC28520j jVar) {
        C89219l.m154721d(jVar, "");
        return new LynxSearchVideo(jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: b */
    public final LynxUI<?> mo106208b(AbstractC28520j jVar) {
        C89219l.m154721d(jVar, "");
        return new LynxSearchHorizontal(jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: c */
    public final LynxUI<?> mo106212c(AbstractC28520j jVar) {
        C89219l.m154721d(jVar, "");
        return new LynxSearchLive(jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: b */
    public final void mo106210b(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        C67721b.m119889a(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: b */
    public final void mo106211b(boolean z) {
        C67431f.m119465a("search_common").storeInt("feed_search_tips_shown", z ? 1 : 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final FeedSearchIconViewModel mo106192a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(FeedSearchIconViewModel.class);
        C89219l.m154716b(a, "");
        FeedSearchIconViewModel feedSearchIconViewModel = (FeedSearchIconViewModel) a;
        if (!feedSearchIconViewModel.mo106646a().hasObservers()) {
            C80375ef.m139355a(feedSearchIconViewModel.mo106646a(), eVar, new C67452c(eVar));
        }
        return feedSearchIconViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final List<AbstractC16183k> mo106194a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return C89070n.m154522b(new com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.SearchKeywordChangeMethod(bVar), new PlayMusicBridge(bVar), new UpdateGeneralSearchBackgroundMethod(bVar), new UpdateRawDataMethod(bVar), new DeleteSearchHistoryMethod(bVar), new GetSearchHistoryMethod(bVar), new OpenAlertMethod(bVar), new KeyboardChangeMethod(bVar), new OpenLiveMethod(bVar), new SearchLaunchChatMethod(bVar), new FollowPACheckMethod(bVar), new OpenLiveMoreMethod(bVar), new SaveSearchHistoryAndGoDetail(bVar), new DeleteMostVisitedAccountMethod(bVar), new OpenEffectRecordMethod(bVar), new SearchCardClickMethod(bVar), new OpenPlaylistMethod(bVar), new HideSearchLoadingMethod(bVar), new SearchRequestSuccessMethod(bVar), new SearchRefreshMonitorMethod(bVar), new OpenHotSpotMethod(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final JediSimpleViewHolder<DiscoverSectionItem> mo106188a(ViewGroup viewGroup, ActivityC0945e eVar) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.avn, viewGroup, false);
        C89219l.m154716b(a, "");
        return new DiscoverySuggestSearchViewHolder(a, eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final Intent mo106187a(Activity activity, Uri uri) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
        C67674b.C67675a newBuilder = C67674b.Companion.newBuilder();
        C67648a.m119791a(uri, newBuilder);
        C67674b a = newBuilder.mo106686a();
        C67678d dVar = new C67678d();
        C67648a.m119792a(uri, dVar);
        dVar.setSearchEnterParam(a);
        Intent intent = new Intent(activity, SearchResultActivity.class);
        new Bundle();
        intent.putExtra("searchParam", dVar);
        intent.putExtras(intent.putExtra("search_enter_param", a));
        return intent;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final String mo106193a(User user, Context context) {
        if (user != null) {
            return C42312e.m84674a(user);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final AbstractC42639ae mo106190a(C67678d dVar, AbstractC57066a.AbstractC57067a aVar, AbstractC51187d dVar2, AbstractC67363b bVar, String str) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar2, "");
        return new C41643am(dVar, aVar, dVar2, bVar, str);
    }
}

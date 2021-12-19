package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1182af;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.discover.helper.C41989ai;
import com.p2082ss.android.ugc.aweme.discover.helper.C42040m;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.container.C42284a;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2784a.AbstractC42265a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42469q;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41927f;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet.C42952a;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.C43028d;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchLiveViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.v */
public final class C42978v extends AbstractC42971u implements C42815b.AbstractC42817b {

    /* renamed from: K */
    private final C12814b f100219K;

    /* renamed from: L */
    private boolean f100220L;

    /* renamed from: M */
    private SparseArray f100221M;

    /* renamed from: o */
    public final C27910f f100222o = new C27910f();

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.v$b */
    public static final class C42980b extends AbstractC89220m implements AbstractC89172b<C43028d, C43028d> {
        public static final C42980b INSTANCE = new C42980b();

        static {
            Covode.recordClassIndex(51112);
        }

        public C42980b() {
            super(1);
        }

        public final C43028d invoke(C43028d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(51110);
    }

    /* renamed from: m */
    private final SearchLiveViewModel m85796m() {
        return (SearchLiveViewModel) this.f100219K.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: a */
    public final View mo71296a(int i) {
        if (this.f100221M == null) {
            this.f100221M = new SparseArray();
        }
        View view = (View) this.f100221M.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f100221M.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    public final void bb_() {
        SparseArray sparseArray = this.f100221M;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: c */
    public final String mo71298c() {
        return "live";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(237, new RunnableC90250g(C42978v.class, "enterLiveRoom", C41927f.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bb_();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.v$d */
    public static final class C42982d extends AbstractC89220m implements AbstractC89171a<C42978v> {

        /* renamed from: a */
        final /* synthetic */ Fragment f100224a;

        static {
            Covode.recordClassIndex(51114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42982d(Fragment fragment) {
            super(0);
            this.f100224a = fragment;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.discover.ui.v, androidx.fragment.app.Fragment] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.discover.p2797ui.C42978v invoke() {
            /*
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.f100224a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.C42978v.C42982d.invoke():androidx.fragment.app.Fragment");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: r */
    public final boolean mo71311r() {
        return this.f100220L;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.v$c */
    public static final class C42981c extends AbstractC89220m implements AbstractC89171a<C12874b<C43028d>> {
        public static final C42981c INSTANCE = new C42981c();

        static {
            Covode.recordClassIndex(51113);
        }

        public C42981c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C43028d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.v$f */
    public static final class C42984f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C42984f INSTANCE = new C42984f();

        static {
            Covode.recordClassIndex(51116);
        }

        public C42984f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.v$e */
    public static final class C42983e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f100225a;

        static {
            Covode.recordClassIndex(51115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42983e(Fragment fragment) {
            super(0);
            this.f100225a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f100225a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.v$a */
    public static final class C42979a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f100223a;

        static {
            Covode.recordClassIndex(51111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42979a(AbstractC89277c cVar) {
            super(0);
            this.f100223a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f100223a).getName();
        }
    }

    public C42978v() {
        AbstractC89277c a = C89204ab.m154669a(SearchLiveViewModel.class);
        this.f100219K = new C12814b(a, new C42979a(a), C42981c.INSTANCE, new C42982d(this), new C42983e(this), C42984f.INSTANCE, C42980b.INSTANCE);
        this.f99509t = C67458j.f151139h;
        this.f100220L = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b.AbstractC42817b
    /* renamed from: a */
    public final void mo60375a(String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("roomId", str);
        AbstractC42208f d = mo73158d();
        if (d != null) {
            d.mo71404a("verticalLiveBack", jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.v$g */
    static final class C42985g extends AbstractC89220m implements AbstractC89172b<SearchLiveList, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42978v f100226a;

        static {
            Covode.recordClassIndex(51117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42985g(C42978v vVar) {
            super(1);
            this.f100226a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(SearchLiveList searchLiveList) {
            String str;
            String str2;
            String str3;
            String str4;
            SearchLiveList searchLiveList2 = searchLiveList;
            C89219l.m154721d(searchLiveList2, "");
            C42469q.m84885b(this.f100226a.f99509t);
            AbstractC42208f d = this.f100226a.mo73158d();
            String b = this.f100226a.f100222o.mo46674b(new C42714az(searchLiveList2, new C42663ak(C42469q.m84886c(this.f100226a.f99509t))));
            C89219l.m154716b(b, "");
            d.mo71406b(b);
            C42978v vVar = this.f100226a;
            LogPbBean logPbBean = searchLiveList2.logPb;
            Long l = null;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            vVar.f100207j = str;
            this.f100226a.mo73159g();
            C42047s a = C42047s.C42048a.m84150a();
            String u = this.f100226a.mo72879u();
            LogPbBean logPbBean2 = searchLiveList2.logPb;
            if (logPbBean2 == null || (str2 = logPbBean2.getImprId()) == null) {
                str2 = "";
            }
            GlobalDoodleConfig globalDoodleConfig = searchLiveList2.globalDoodleConfig;
            if (globalDoodleConfig != null) {
                str3 = globalDoodleConfig.getSearchChannel();
            } else {
                str3 = null;
            }
            GlobalDoodleConfig globalDoodleConfig2 = searchLiveList2.globalDoodleConfig;
            if (globalDoodleConfig2 != null) {
                str4 = globalDoodleConfig2.getNewSource();
            } else {
                str4 = null;
            }
            BaseResponse.ServerTimeExtra serverTimeExtra = searchLiveList2.extra;
            if (serverTimeExtra != null) {
                l = Long.valueOf(serverTimeExtra.now);
            }
            a.mo71203a(new C42040m(u, str2, str3, str4, l));
            this.f100226a.mo73154a(searchLiveList2.globalDoodleConfig);
            this.f100226a.mo73155a(searchLiveList2.logPb);
            this.f100226a.mo73162i();
            C42978v vVar2 = this.f100226a;
            int size = searchLiveList2.liveList.size();
            C89219l.m154721d(searchLiveList2, "");
            C67605g.m119730a(vVar2.f99508s).mo106586c(size).mo106587d().mo106580a(searchLiveList2.getRequestId()).mo106579a(searchLiveList2).mo106583b(0);
            C67606h.m119736a(vVar2.f99508s).mo106608e(size).mo106600b().mo106599a(searchLiveList2.getRequestId()).mo106598a(searchLiveList2).mo106604c(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.v$h */
    static final class C42986h extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42978v f100227a;

        static {
            Covode.recordClassIndex(51118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42986h(C42978v vVar) {
            super(1);
            this.f100227a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f100227a.mo73159g();
            C42978v vVar = this.f100227a;
            C89219l.m154721d(th2, "");
            C67605g.m119730a(vVar.f99508s).mo106587d().mo106583b(1).mo106584b(th2.getMessage());
            C67606h.m119736a(vVar.f99508s).mo106600b().mo106604c(1).mo106602b(th2.getMessage());
            if (th2 instanceof C34485a) {
                try {
                    AbstractC42208f d = this.f100227a.mo73158d();
                    String b = this.f100227a.f100222o.mo46674b(new C42714az((SearchLiveList) this.f100227a.f100222o.mo46670a(((C34485a) th2).getResponse(), SearchLiveList.class), new C42663ak(C42469q.m84886c(this.f100227a.f99509t))));
                    C89219l.m154716b(b, "");
                    d.mo71406b(b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                AbstractC42208f d2 = this.f100227a.mo73158d();
                String b2 = this.f100227a.f100222o.mo46674b(new C42714az(null, new C42663ak(C42469q.m84886c(this.f100227a.f99509t))));
                C89219l.m154716b(b2, "");
                d2.mo71406b(b2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42635aa
    /* renamed from: a */
    public final void mo72826a(AbstractC42208f fVar) {
        C89219l.m154721d(fVar, "");
        AbstractC42265a[] aVarArr = {new C42952a()};
        C89219l.m154721d(aVarArr, "");
        C89070n.m154536a((Collection) ((C42284a) fVar).f98513f, (Object[]) aVarArr);
        C42345d a = C41989ai.m84052a();
        if (a != null) {
            fVar.mo71402a(a);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void enterLiveRoom(C41927f fVar) {
        EnterRoomConfig.LogData logData;
        String str;
        LiveRoomStruct liveRoomStruct;
        String str2;
        String str3;
        String str4;
        C89219l.m154721d(fVar, "");
        LiveRoomStruct liveRoomStruct2 = fVar.f97802a;
        ArrayList<LiveRoomStruct> arrayList = fVar.f97803b;
        EnterRoomConfig enterRoomConfig = fVar.f97805d;
        long j = fVar.f97804c;
        Boolean bool = fVar.f97806e;
        if (enterRoomConfig != null && (logData = enterRoomConfig.f28232b) != null && (str = logData.f28281y) != null && str.length() > 0) {
            LiveRoomStruct liveRoomStruct3 = null;
            if (1 != 0) {
                Activity j2 = C17873f.m33102j();
                if (arrayList != null) {
                    liveRoomStruct = arrayList.get(0);
                    liveRoomStruct3 = arrayList.get(arrayList.size() - 1);
                } else {
                    liveRoomStruct = null;
                }
                if (liveRoomStruct2 != null) {
                    Long.valueOf(liveRoomStruct2.f114485id);
                    Long.valueOf(liveRoomStruct2.getAnchorId());
                }
                if (liveRoomStruct != null) {
                    Long.valueOf(liveRoomStruct.f114485id);
                    Long.valueOf(liveRoomStruct.getAnchorId());
                }
                if (liveRoomStruct3 != null) {
                    Long.valueOf(liveRoomStruct3.f114485id);
                    Long.valueOf(liveRoomStruct3.getAnchorId());
                }
                EnterRoomConfig.LogData logData2 = enterRoomConfig.f28232b;
                if (logData2 == null || (str2 = logData2.f28281y) == null) {
                    str2 = "";
                }
                EnterRoomConfig.LogData logData3 = enterRoomConfig.f28232b;
                if (logData3 == null || (str3 = logData3.f28269m) == null) {
                    str3 = "";
                }
                EnterRoomConfig.LogData logData4 = enterRoomConfig.f28232b;
                if (logData4 == null || (str4 = logData4.f28280x) == null) {
                    str4 = "";
                }
                C42815b bVar = new C42815b(str2, j, "", str3, str4, this, bool);
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                s.mo95835i().mo105589a(j2, enterRoomConfig, liveRoomStruct2, arrayList, bVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        AssemViewModel.m23030a(m85796m(), C42990w.f100233a, null, new C42986h(this), null, new C42985g(this), 10);
        super.onViewCreated(view, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u
    /* renamed from: a */
    public final void mo73153a(int i, C67437b bVar) {
        String str;
        super.mo73153a(i, bVar);
        mo73160h();
        SearchLiveViewModel m = m85796m();
        String u = mo72879u();
        C67678d dVar = this.f99507r;
        if (dVar == null || (str = dVar.getPreSearchId()) == null) {
            str = "";
        }
        String str2 = this.f99510u;
        if (str2 == null) {
            str2 = "";
        }
        C42174f fVar = new C42174f(u, 0, this.f99511v, "live", AbstractC42670am.f99493H, 0, str, this.f100207j, 0, 20, str2, null, null, null, null, null, 0, null, null, 1046562);
        C89219l.m154721d(fVar, "");
        AbstractC89568bz unused = C89624i.m155555a(m.aP_(), null, null, new SearchLiveViewModel.C42999b(m, fVar, null), 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b.AbstractC42817b
    /* renamed from: a */
    public final void mo60374a(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        C89219l.m154721d(searchLiveList, "");
        C89219l.m154721d(list, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("searchLiveData", this.f100222o.mo46674b(searchLiveList));
        AbstractC42208f d = mo73158d();
        if (d != null) {
            d.mo71404a("verticalLiveLoadMore", jSONObject);
        }
    }
}

package com.p2082ss.android.ugc.aweme.flowfeed.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42437s;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42438t;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41551v;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67532bk;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67554j;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg;
import com.p2082ss.android.ugc.aweme.utils.C80375ef;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.DetailFeedSearchHelper */
public final class DetailFeedSearchHelper implements AbstractC80379eg {

    /* renamed from: a */
    static AbstractC88412b f117735a;

    /* renamed from: b */
    public static C51046a f117736b;

    /* renamed from: c */
    public static final DetailFeedSearchHelper f117737c = new DetailFeedSearchHelper();

    private DetailFeedSearchHelper() {
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        AbstractC80379eg.C80380a.onCreate(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC80379eg.C80380a.onDestroy(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        AbstractC80379eg.C80380a.onPause(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        AbstractC80379eg.C80380a.onResume(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        AbstractC80379eg.C80380a.onStart(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        AbstractC80379eg.C80380a.onStop(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.DetailFeedSearchHelper$a */
    public static final class C51046a {

        /* renamed from: a */
        public final AbstractC1204m f117738a;

        /* renamed from: b */
        public final String f117739b;

        /* renamed from: c */
        public final Map<String, String> f117740c;

        static {
            Covode.recordClassIndex(60231);
        }

        public final String toString() {
            return "EntryInfo(owner=" + this.f117738a + ", awemeId=" + this.f117739b + ", params=" + this.f117740c + ")";
        }

        public final int hashCode() {
            return super.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            C51046a aVar = (C51046a) obj;
            if (!C89219l.m154714a(this.f117738a, aVar.f117738a) || !C89219l.m154714a((Object) this.f117739b, (Object) aVar.f117739b)) {
                return false;
            }
            return true;
        }

        public C51046a(AbstractC1204m mVar, String str, Map<String, String> map) {
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            this.f117738a = mVar;
            this.f117739b = str;
            this.f117740c = map;
        }
    }

    static {
        Covode.recordClassIndex(60230);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void release() {
        AbstractC88412b bVar = f117735a;
        if (bVar != null && !bVar.isDisposed()) {
            AbstractC88412b bVar2 = f117735a;
            if (bVar2 == null) {
                C89219l.m154715b();
            }
            bVar2.dispose();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.DetailFeedSearchHelper$b */
    public static final class RunnableC51047b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f117741a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f117742b;

        /* renamed from: c */
        final /* synthetic */ String f117743c;

        /* renamed from: d */
        final /* synthetic */ Map f117744d;

        static {
            Covode.recordClassIndex(60232);
        }

        public RunnableC51047b(View view, AbstractC1204m mVar, String str, Map map) {
            this.f117741a = view;
            this.f117742b = mVar;
            this.f117743c = str;
            this.f117744d = map;
        }

        public final void run() {
            String a;
            MethodCollector.m26663i(8083);
            View view = this.f117741a;
            View findViewWithTag = view.findViewWithTag("search_bar");
            if (findViewWithTag == null) {
                View view2 = DetailFeedServiceImpl.m65254b().mo57059a(view).get("search_bar_in_feed");
                if (view2 != null) {
                    ViewStub viewStub = (ViewStub) view2;
                    viewStub.setLayoutResource(R.layout.atw);
                    findViewWithTag = viewStub.inflate();
                    C89219l.m154716b(findViewWithTag, "");
                    findViewWithTag.setTag("search_bar");
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                    MethodCollector.m26664o(8083);
                    throw nullPointerException;
                }
            }
            C89219l.m154716b(findViewWithTag, "");
            if (C41551v.m83486a() == 3) {
                DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.f117737c;
                AbstractC1204m mVar = this.f117742b;
                String str = this.f117743c;
                Map map = this.f117744d;
                detailFeedSearchHelper.release();
                if (map.containsKey("isTrending")) {
                    a = "trending_inflow";
                } else {
                    a = DetailFeedSearchHelper.m95436a(map);
                }
                C89219l.m154721d(str, "");
                C89219l.m154721d(a, "");
                DetailFeedSearchHelper.f117735a = SearchApiNew.RealApi.C41840a.f97604a.fetchFeedDetailWords(str, a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C51050e(mVar, findViewWithTag, map), new C51051f(mVar, findViewWithTag, map));
                C80375ef.m139356a(mVar, detailFeedSearchHelper);
                MethodCollector.m26664o(8083);
                return;
            }
            DetailFeedSearchHelper.m95437a(findViewWithTag, null, this.f117744d);
            MethodCollector.m26664o(8083);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.DetailFeedSearchHelper$e */
    static final class C51050e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f117751a;

        /* renamed from: b */
        final /* synthetic */ View f117752b;

        /* renamed from: c */
        final /* synthetic */ Map f117753c;

        static {
            Covode.recordClassIndex(60235);
        }

        C51050e(AbstractC1204m mVar, View view, Map map) {
            this.f117751a = mVar;
            this.f117752b = view;
            this.f117753c = map;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C42438t tVar = (C42438t) obj;
            if (!DetailFeedSearchHelper.m95439a(this.f117751a)) {
                DetailFeedSearchHelper.m95437a(this.f117752b, tVar, this.f117753c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.DetailFeedSearchHelper$f */
    static final class C51051f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f117754a;

        /* renamed from: b */
        final /* synthetic */ View f117755b;

        /* renamed from: c */
        final /* synthetic */ Map f117756c;

        static {
            Covode.recordClassIndex(60236);
        }

        C51051f(AbstractC1204m mVar, View view, Map map) {
            this.f117754a = mVar;
            this.f117755b = view;
            this.f117756c = map;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (!DetailFeedSearchHelper.m95439a(this.f117754a)) {
                DetailFeedSearchHelper.m95437a(this.f117755b, null, this.f117756c);
            }
        }
    }

    /* renamed from: a */
    public static String m95436a(Map<String, String> map) {
        String str = map.get("enter_from");
        if (TextUtils.isEmpty(str)) {
            return "unknow";
        }
        if (str == null) {
            C89219l.m154715b();
        }
        return str;
    }

    /* renamed from: b */
    public static void m95440b(Map<String, String> map) {
        String a;
        C67554j jVar = (C67554j) new C67554j().mo106502b("1").mo106460p("enter");
        if (map.containsKey("tab_name")) {
            jVar.mo106501a(map.get("tab_name"));
        }
        if (map.containsKey("isTrending")) {
            a = "trending_inflow";
        } else {
            a = m95436a(map);
        }
        jVar.mo106459o(a);
        jVar.mo96792f();
    }

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.DetailFeedSearchHelper$c */
    public static final class View$OnClickListenerC51048c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f117745a;

        /* renamed from: b */
        final /* synthetic */ Map f117746b;

        static {
            Covode.recordClassIndex(60233);
        }

        public View$OnClickListenerC51048c(View view, Map map) {
            this.f117745a = view;
            this.f117746b = map;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRoute withParam = SmartRouter.buildRoute(this.f117745a.getContext(), "//search").withParam("set_hint_by_sug_word", true).withParam("is_from_video", "1").withParam("in_single_stack", true).withParam("group_id", (String) this.f117746b.get("group_id"));
            C89219l.m154716b(withParam, "");
            DetailFeedSearchHelper.m95438a(withParam, this.f117746b);
            withParam.open();
            DetailFeedSearchHelper.m95440b(this.f117746b);
        }
    }

    /* renamed from: a */
    public static boolean m95439a(AbstractC1204m mVar) {
        AbstractC1196i lifecycle = mVar.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        if (lifecycle.mo4011a() == AbstractC1196i.EnumC1199b.DESTROYED) {
            return true;
        }
        Objects.requireNonNull(mVar, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        if (((Fragment) mVar).getView() == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.DetailFeedSearchHelper$d */
    public static final class View$OnClickListenerC51049d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f117747a;

        /* renamed from: b */
        final /* synthetic */ Map f117748b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f117749c;

        /* renamed from: d */
        final /* synthetic */ C42438t f117750d;

        static {
            Covode.recordClassIndex(60234);
        }

        View$OnClickListenerC51049d(View view, Map map, C89233z.C89238e eVar, C42438t tVar) {
            this.f117747a = view;
            this.f117748b = map;
            this.f117749c = eVar;
            this.f117750d = tVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRoute withParam = SmartRouter.buildRoute(this.f117747a.getContext(), "//search").withParam("is_from_video", "1").withParam("in_single_stack", true).withParam("group_id", (String) this.f117748b.get("group_id"));
            if (TextUtils.isEmpty(this.f117749c.element)) {
                withParam.withParam("set_hint_by_sug_word", true);
            } else {
                withParam.withParam("search_hint_word", (String) this.f117749c.element);
                C42438t tVar = this.f117750d;
                if (tVar == null) {
                    C89219l.m154715b();
                }
                List<C42437s> list = tVar.f98906a;
                if (list == null) {
                    C89219l.m154715b();
                }
                withParam.withParam("hint_group_id", list.get(0).f98905b);
                withParam.withParam("hint_imp_id", this.f117750d.mo71641a());
            }
            C89219l.m154716b(withParam, "");
            DetailFeedSearchHelper.m95438a(withParam, this.f117748b);
            withParam.open();
            DetailFeedSearchHelper.m95440b(this.f117748b);
        }
    }

    /* renamed from: a */
    public static void m95438a(SmartRoute smartRoute, Map<String, String> map) {
        if (map.containsKey("isTrending")) {
            smartRoute.withParam("search_position", "trending_inflow");
            smartRoute.withParam("tab_name", m95436a(map));
            smartRoute.withParam("enter_from", "trending_inflow");
            return;
        }
        if (map.containsKey("tab_name")) {
            smartRoute.withParam("tab_name", map.get("tab_name"));
        }
        smartRoute.withParam("enter_from", m95436a(map));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m95437a(View view, C42438t tVar, Map<String, String> map) {
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = "";
        TextView textView = (TextView) view.findViewById(R.id.f3_);
        T t = null;
        if (!(tVar == null || tVar.f98906a == null)) {
            List<C42437s> list = tVar.f98906a;
            if (list == null) {
                C89219l.m154715b();
            }
            if (!list.isEmpty()) {
                List<C42437s> list2 = tVar.f98906a;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                String str = list2.get(0).f98904a;
                if (C80537hk.m139613a(str)) {
                    if (str == 0) {
                        C89219l.m154715b();
                    }
                    t = str;
                }
            }
        }
        C89219l.m154716b(textView, "");
        String str2 = t;
        if (TextUtils.isEmpty(str2)) {
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            str2 = context.getResources().getString(R.string.fj);
        } else {
            if (t == null) {
                C89219l.m154715b();
            }
            eVar.element = t;
        }
        textView.setText(str2);
        view.setOnClickListener(new View$OnClickListenerC51049d(view, map, eVar, tVar));
        if (C80537hk.m139613a(t)) {
            if (tVar == null) {
                C89219l.m154715b();
            }
            C67530bj v = new C67532bk().mo106477y(m95436a(map)).mo106471d((Integer) 0).mo106474v("search_bar_outer");
            if (t == null) {
                C89219l.m154715b();
            }
            C67530bj bjVar = (C67530bj) ((C67540c) v.mo106475w(t).mo106453i(map.get("group_id"))).mo106484d(tVar.mo71641a()).mo106479a((Integer) -1);
            if (map.containsKey("isTrending")) {
                bjVar.mo106477y("trending_inflow");
            } else {
                bjVar.mo106477y(m95436a(map));
            }
            if (map.containsKey("tab_name")) {
                bjVar.mo106469a((Object) map.get("tab_name"));
            }
            bjVar.mo96792f();
        }
    }
}

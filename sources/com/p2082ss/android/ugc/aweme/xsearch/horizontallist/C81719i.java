package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.alog.C2688c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.lynx.react.bridge.ReadableMap;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.C34246c;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.C42261b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41923c;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41930i;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42077d;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50540h;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51053b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import com.p2082ss.android.ugc.aweme.xsearch.C81687b;
import com.p2082ss.android.ugc.aweme.xsearch.C81688c;
import com.p2082ss.android.ugc.aweme.xsearch.horizontallist.AbstractC81695b;
import com.p2082ss.android.ugc.aweme.xsearch.video.C81753b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.i */
public final class C81719i extends AbstractView$OnAttachStateChangeListenerC41671b implements AbstractC90252i, AbstractC90253j {

    /* renamed from: n */
    public static final C81720a f182726n = new C81720a((byte) 0);

    /* renamed from: a */
    public final ViewGroup f182727a;

    /* renamed from: b */
    public ReadableMap f182728b;

    /* renamed from: c */
    public C81687b f182729c;

    /* renamed from: d */
    public boolean f182730d = true;

    /* renamed from: e */
    public final C81729k f182731e;

    /* renamed from: f */
    public int f182732f;

    /* renamed from: g */
    public AbstractC34186b.AbstractC34192d f182733g;

    /* renamed from: h */
    public AbstractC81695b.C81699c f182734h;

    /* renamed from: i */
    public int f182735i;

    /* renamed from: m */
    public AbstractC51043a f182736m;

    /* renamed from: o */
    private List<C81701d> f182737o;

    /* renamed from: p */
    private View f182738p;

    /* renamed from: q */
    private C81703f f182739q;

    /* renamed from: r */
    private final AbstractC89244h f182740r;

    static {
        Covode.recordClassIndex(95124);
    }

    /* renamed from: d */
    public final Runnable mo125395d() {
        return (Runnable) this.f182740r.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(76, new RunnableC90250g(C81719i.class, "onOuterContainerStatusChanged", C41923c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(77, new RunnableC90250g(C81719i.class, "onOpenHotSpotEvent", C41930i.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.i$a */
    public static final class C81720a {
        static {
            Covode.recordClassIndex(95125);
        }

        private C81720a() {
        }

        public /* synthetic */ C81720a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.i$b */
    static final class C81721b extends AbstractC89220m implements AbstractC89171a<RunnableC817221> {

        /* renamed from: a */
        final /* synthetic */ C81719i f182741a;

        static {
            Covode.recordClassIndex(95126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81721b(C81719i iVar) {
            super(0);
            this.f182741a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RunnableC817221 invoke() {
            return new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.xsearch.horizontallist.C81719i.C81721b.RunnableC817221 */

                /* renamed from: a */
                final /* synthetic */ C81721b f182742a;

                static {
                    Covode.recordClassIndex(95127);
                }

                public final void run() {
                    this.f182742a.f182741a.f182727a.removeCallbacks(this);
                    this.f182742a.f182741a.f182733g = this.f182742a.f182741a.mo125394c();
                    if (this.f182742a.f182741a.f182733g == null) {
                        C2688c.m7778a(1, "SearchHorizontalForLynx", "run in callBack");
                        this.f182742a.f182741a.f182727a.postDelayed(this, 100);
                        this.f182742a.f182741a.mo125393b();
                        return;
                    }
                    C2688c.m7778a(1, "SearchHorizontalForLynx", "finish in callBack");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f182742a = r1;
                }
            };
        }
    }

    /* renamed from: a */
    public final boolean mo60336a() {
        ReadableMap readableMap = this.f182728b;
        if (readableMap == null) {
            return false;
        }
        return readableMap.hasKey("rank");
    }

    /* renamed from: b */
    public final void mo125393b() {
        if (this.f182735i < 10) {
            this.f182731e.f182761c.mo86401f();
            this.f182735i++;
            return;
        }
        this.f182731e.f182761c.mo86404i();
        this.f182735i = 0;
    }

    /* renamed from: f */
    private final List<C81753b> m141576f() {
        ArrayList arrayList = new ArrayList();
        RecyclerView a = this.f182731e.mo60484a();
        int childCount = a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = a.getChildAt(i);
            while (true) {
                if (!(childAt instanceof ViewGroup)) {
                    break;
                } else if (childAt instanceof C81753b) {
                    arrayList.add(childAt);
                    break;
                } else {
                    childAt = ((ViewGroup) childAt).getChildAt(0);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final AbstractC34186b.AbstractC34192d mo125394c() {
        List<C81753b> f = m141576f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            SearchPlayerCore core = f.get(i).getCore();
            if (core != null && core.aZ_()) {
                this.f182733g = core;
                return core;
            }
        }
        return null;
    }

    /* renamed from: e */
    private final void m141575e() {
        C81688c cVar;
        C81703f fVar;
        Integer num;
        C81703f fVar2 = this.f182739q;
        if (!(fVar2 == null || (cVar = fVar2.f182698c) == null || (fVar = this.f182739q) == null)) {
            fVar.f182697b = this.f182729c;
            List<C81701d> list = this.f182737o;
            if (list != null) {
                for (T t : list) {
                    List<Aweme> awemeList = cVar.f182656j.getAwemeList();
                    C89219l.m154716b(awemeList, "");
                    C89219l.m154721d(awemeList, "");
                    t.f182689b = awemeList;
                    t.f182690c = Integer.valueOf(this.f182732f);
                    t.f182692e = this.f182728b;
                    List<C81701d> list2 = this.f182737o;
                    if (list2 != null) {
                        num = Integer.valueOf(list2.size());
                    } else {
                        num = null;
                    }
                    t.f182691d = num;
                    t.f182693f = this.f182734h;
                }
                fVar.f182696a = list;
                this.f182737o = list;
                mo125390a(fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo125390a(C81703f fVar) {
        this.f182739q = fVar;
        this.f182731e.mo125402a(fVar);
    }

    /* renamed from: a */
    public final void mo125392a(boolean z) {
        this.f182731e.mo60484a().setTag(Boolean.valueOf(z));
        this.f182730d = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public final void onViewAttachedToWindow(View view) {
        C89219l.m154721d(view, "");
        C2688c.m7778a(1, "HorizontalContainer", " onViewAttachedToWindow  ".concat(String.valueOf(this)));
        super.onViewAttachedToWindow(view);
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public final void onViewDetachedFromWindow(View view) {
        C89219l.m154721d(view, "");
        C2688c.m7778a(1, "HorizontalContainer", " onViewDetachedFromWindow  ".concat(String.valueOf(this)));
        super.onViewDetachedFromWindow(view);
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: a */
    private final void m141574a(Bundle bundle) {
        if (this.f182738p == null) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    break;
                } else if (parent instanceof C42261b) {
                    this.f182738p = (View) parent;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        View view2 = this.f182738p;
        if (view2 != null) {
            C67568r a = C42460j.C42461a.m84864a(view2);
            String str = "general_search";
            if (!TextUtils.equals(a.f151312g, str)) {
                str = "search_result";
            }
            bundle.putString("enter_from", str);
            bundle.putString("search_keyword", a.f151311f);
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 70);
            bundle.putString("search_id", a.f151314i);
            bundle.putString("key_search_type", a.f151310e);
        }
    }

    /* renamed from: a */
    public final void mo125391a(List<C81701d> list) {
        C89219l.m154721d(list, "");
        C2688c.m7778a(1, "LynxSearchHorizontal", "bindFromLynx".concat(String.valueOf(list)));
        this.f182737o = list;
        m141575e();
        C67568r F = mo70877F();
        F.mo106518g("general_search");
        String str = F.f151329x.get("search_id");
        if (str != null) {
            F.mo106520i(str);
            String b = C48027ac.C48028a.f111257a.mo80057b(str);
            C89219l.m154716b(b, "");
            F.mo106521j(b);
        }
        String str2 = F.f151329x.get("impr_id");
        if (str2 != null) {
            F.mo106520i(str2);
            String b2 = C48027ac.C48028a.f111257a.mo80057b(str2);
            C89219l.m154716b(b2, "");
            F.mo106521j(b2);
        }
        this.f182731e.mo125403a(list, mo70877F());
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onOpenHotSpotEvent(C41930i iVar) {
        String str;
        C89219l.m154721d(iVar, "");
        List<Aweme> f = this.f182731e.f182760b.mo125400f();
        if (!f.isEmpty()) {
            Bundle bundle = iVar.f97809a;
            String string = bundle.getString("id");
            if (!TextUtils.isEmpty(string)) {
                if (string == null) {
                    C89219l.m154715b();
                }
                C50540h.f116810b = f;
                C42077d dVar = new C42077d();
                dVar.mo71276a_(f);
                C50529ae.f116790a = dVar;
                AbstractC34186b.AbstractC34192d c = mo125394c();
                this.f182733g = c;
                if (c != null && (c instanceof SearchPlayerCore)) {
                    Objects.requireNonNull(c, "null cannot be cast to non-null type com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore");
                    C34246c dataProvider = ((SearchPlayerCore) c).getDataProvider();
                    Aweme aweme = dataProvider.f80987d;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    if (C89219l.m154714a((Object) string, (Object) str)) {
                        C51053b a = dataProvider.mo60666a();
                        if (a != null) {
                            dataProvider.f80988e = true;
                            C49625h a2 = C49625h.m93072a();
                            C89219l.m154716b(a2, "");
                            a2.f114189a = dataProvider.f80998o;
                            C49625h a3 = C49625h.m93072a();
                            C89219l.m154716b(a3, "");
                            a3.f114191c = a.f117760d;
                            C49625h a4 = C49625h.m93072a();
                            C89219l.m154716b(a4, "");
                            a4.f114195g = true;
                        }
                    } else {
                        AbstractC34186b.AbstractC34192d dVar2 = this.f182733g;
                        if (dVar2 != null) {
                            dVar2.bi_();
                        }
                    }
                }
                m141574a(bundle);
                this.f182731e.f80762e = string;
                SmartRoute withParam = new SmartRoute(mo70878G()).withParam(bundle);
                String string2 = bundle.getString("trending_event_id");
                if (!TrendingDetailServiceImpl.m137898b().mo122881a() || TextUtils.isEmpty(string2)) {
                    withParam.withUrl("//aweme/detail").withParam("video_from", "from_search_ad_no_request");
                } else {
                    withParam.withUrl("//trending/detail").withParam("outer_aweme_id", string).withParam("is_from_trending_card", "1").withParam("video_from", "from_trending_inflow");
                }
                withParam.open();
                this.f182731e.f182761c.f117777h = true;
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onOuterContainerStatusChanged(C41923c cVar) {
        AbstractC34186b.AbstractC34192d dVar;
        C89219l.m154721d(cVar, "");
        int i = cVar.f97795a;
        if (i == 1) {
            AbstractC34186b.AbstractC34192d dVar2 = this.f182733g;
            if (dVar2 != null) {
                dVar2.mo60424A();
            }
            this.f182731e.f182761c.f117777h = false;
        } else if (i == 2) {
            Iterator<WeakReference<AbstractC34186b.AbstractC34192d>> it = C34181a.m69856a().mo123655a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                WeakReference<AbstractC34186b.AbstractC34192d> next = it.next();
                if (next.get() != null) {
                    AbstractC34186b.AbstractC34192d dVar3 = next.get();
                    if (dVar3 == null) {
                        C89219l.m154715b();
                    }
                    if (dVar3.aZ_()) {
                        AbstractC34186b.AbstractC34192d dVar4 = next.get();
                        if (dVar4 == null) {
                            C89219l.m154715b();
                        }
                        dVar = dVar4;
                    }
                }
            }
            this.f182733g = dVar;
        } else if (i == 3) {
            List<C81753b> f = m141576f();
            int size = f.size();
            for (int i2 = 0; i2 < size; i2++) {
                SearchPlayerCore core = f.get(i2).getCore();
                if (core != null) {
                    C34181a.m69859b(core);
                    core.mo60425B();
                }
            }
            C2688c.m7778a(1, "HorizontalContainer", "release " + f.size());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81719i(View view, AbstractC51043a aVar, AbstractC51044b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        MethodCollector.m26663i(9264);
        this.f182736m = aVar;
        View findViewById = view.findViewById(R.id.dr4);
        C89219l.m154716b(findViewById, "");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.f182727a = viewGroup;
        C2688c.m7778a(1, "HorizontalContainer", "SearchHorizontalViewHolder:  initSubHolder" + viewGroup);
        viewGroup.removeAllViews();
        View view2 = this.itemView;
        if (view2 != null) {
            ViewGroup viewGroup2 = (ViewGroup) view2;
            AbstractC51043a aVar2 = this.f182736m;
            C81703f fVar = this.f182739q;
            C89219l.m154721d(viewGroup2, "");
            C81729k kVar = new C81729k(new C41827d(C67641m.m119786a(viewGroup2, R.layout.awu)), aVar2, bVar);
            kVar.mo125402a(fVar);
            viewGroup.addView(kVar.mo60490i());
            kVar.mo60484a().setTag(Boolean.valueOf(this.f182730d));
            this.f182731e = kVar;
            this.f182732f = 1;
            this.f182740r = C89250i.m154773a((AbstractC89171a) new C81721b(this));
            MethodCollector.m26664o(9264);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(9264);
        throw nullPointerException;
    }
}

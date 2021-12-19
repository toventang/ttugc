package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.X2CFragmentMainPageIcon;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.main.guide.C59096b;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.C59247l;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d */
public final class C53385d implements AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public static final HashMap<String, String> f122574j = C89041ag.m154428c(new C89378p("Following", "homepage_follow"), new C89378p("For You", "homepage_hot"));

    /* renamed from: k */
    public static final HashMap<String, String> f122575k = C89041ag.m154428c(new C89378p("Following", "enter_homepage_follow"), new C89378p("For You", "enter_homepage_hot"));

    /* renamed from: l */
    public static final HashMap<String, String> f122576l = C89041ag.m154428c(new C89378p("Following", "click_follow_tab"), new C89378p("For You", "click_hot_tab"));

    /* renamed from: m */
    public static final C53387a f122577m = new C53387a((byte) 0);

    /* renamed from: a */
    public final C53362a f122578a;

    /* renamed from: b */
    public final C53362a.C53379g f122579b;

    /* renamed from: c */
    public AbstractC53384c f122580c;

    /* renamed from: d */
    public AbstractC53383b f122581d;

    /* renamed from: e */
    public boolean f122582e;

    /* renamed from: f */
    public boolean f122583f;

    /* renamed from: g */
    public ActivityC0945e f122584g;

    /* renamed from: h */
    public C53362a.C53377f f122585h;

    /* renamed from: i */
    public HashMap<String, AbstractC35329by> f122586i = new HashMap<>();

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(60, new RunnableC90250g(C53385d.class, "onDislikeAwemeEvent", C49678f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(326, new RunnableC90250g(C53385d.class, "onScrollToFeedFollowGuideEvent", C59096b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d$a */
    public static final class C53387a {
        static {
            Covode.recordClassIndex(62950);
        }

        private C53387a() {
        }

        public /* synthetic */ C53387a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final ActivityC0945e mo89970a() {
        ActivityC0945e eVar = this.f122584g;
        Objects.requireNonNull(eVar, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d$c */
    public static final class RunnableC53389c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53385d f122589a;

        static {
            Covode.recordClassIndex(62952);
        }

        public RunnableC53389c(C53385d dVar) {
            this.f122589a = dVar;
        }

        public final void run() {
            C53362a aVar = this.f122589a.f122578a;
            AbstractC53384c cVar = this.f122589a.f122580c;
            if (cVar == null) {
                C89219l.m154715b();
            }
            C53362a.C53377f a = aVar.mo89839a(cVar.mo89966a());
            if (a != null) {
                a.mo89946a();
            }
        }
    }

    /* renamed from: c */
    private String m98487c() {
        Object obj;
        C53362a.C53377f fVar = this.f122585h;
        if (fVar == null || (obj = fVar.f122562e) == null) {
            obj = "For You";
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d$e */
    public static final class CallableC53391e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C53385d f122591a;

        /* renamed from: b */
        final /* synthetic */ String f122592b;

        /* renamed from: c */
        final /* synthetic */ String f122593c;

        /* renamed from: d */
        final /* synthetic */ String f122594d;

        /* renamed from: e */
        final /* synthetic */ String f122595e;

        static {
            Covode.recordClassIndex(62954);
        }

        CallableC53391e(C53385d dVar, String str, String str2, String str3, String str4) {
            this.f122591a = dVar;
            this.f122592b = str;
            this.f122593c = str2;
            this.f122594d = str3;
            this.f122595e = str4;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C59247l lVar = new C59247l(this.f122592b);
            lVar.f135247a = this.f122593c;
            C59247l a = lVar.mo96816a(this.f122594d);
            a.f135248b = this.f122595e;
            a.mo96817f(AwemeChangeCallBack.m108593a(this.f122591a.mo89970a())).mo96792f();
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo89973b() {
        int i;
        Object obj;
        AbstractC53384c cVar = this.f122580c;
        if (cVar != null) {
            i = cVar.mo89966a();
        } else {
            i = -1;
        }
        C53362a.C53377f a = this.f122578a.mo89839a(i);
        if (a != null) {
            obj = a.f122562e;
        } else {
            obj = null;
        }
        if (C89219l.m154714a(obj, (Object) "For You")) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(62948);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d$b */
    public static final class C53388b implements C53362a.AbstractC53365c {

        /* renamed from: a */
        final /* synthetic */ C53385d f122588a;

        static {
            Covode.recordClassIndex(62951);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C53388b(C53385d dVar) {
            this.f122588a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a.AbstractC53365c
        /* renamed from: b */
        public final void mo89897b(C53362a.C53377f fVar) {
            this.f122588a.f122585h = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a.AbstractC53365c
        /* renamed from: a */
        public final void mo89896a(C53362a.C53377f fVar) {
            C89219l.m154721d(fVar, "");
            if (this.f122588a.f122585h == null) {
                this.f122588a.f122585h = fVar;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d$d */
    public static final class C53390d implements C53362a.AbstractC53364b {

        /* renamed from: a */
        final /* synthetic */ C53385d f122590a;

        static {
            Covode.recordClassIndex(62953);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C53390d(C53385d dVar) {
            this.f122590a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a.AbstractC53364b
        /* renamed from: a */
        public final void mo89895a(C53362a.C53377f fVar) {
            Object obj;
            C53392e eVar;
            C53385d dVar = this.f122590a;
            dVar.f122585h = dVar.f122578a.mo89839a(this.f122590a.f122578a.getSelectedTabPosition());
            if (fVar != null) {
                obj = fVar.f122562e;
            } else {
                obj = null;
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            if ((!C89219l.m154714a((Object) str, (Object) "Following")) && (eVar = (C53392e) HomeTabViewModel.C53309a.m98315a(this.f122590a.f122584g).mo89739b(str)) != null) {
                eVar.mo89980a();
            }
            AbstractC35329by byVar = this.f122590a.f122586i.get(str);
            if (byVar != null) {
                byVar.mo57292h();
            }
            this.f122590a.mo89972a(str);
        }
    }

    /* renamed from: b */
    private final void m98486b(String str) {
        C29823c.m60080a(mo89970a(), f122574j.get(str), "click");
    }

    @AbstractC90264r
    public final void onDislikeAwemeEvent(C49678f fVar) {
        int i;
        C89219l.m154721d(fVar, "");
        if (fVar.f114342b == 1) {
            C53362a aVar = this.f122578a;
            boolean z = fVar.f114341a;
            C53362a.C53369e eVar = aVar.f122492a;
            int i2 = 255;
            if (!z) {
                i = 255;
                i2 = 0;
            } else {
                i = 0;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
            C89219l.m154716b(ofInt, "");
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new C53362a.C53369e.C53371a(eVar));
            ofInt.start();
        }
    }

    @AbstractC90264r
    public final void onScrollToFeedFollowGuideEvent(C59096b bVar) {
        int i;
        C89219l.m154721d(bVar, "");
        int i2 = 0;
        if (bVar.f134504a) {
            C53362a aVar = this.f122578a;
            C89219l.m154721d("Following", "");
            int childCount = aVar.f122492a.getChildCount();
            while (true) {
                Object obj = null;
                if (i2 >= childCount) {
                    break;
                }
                C53362a.C53377f a = aVar.mo89839a(i2);
                if (a != null) {
                    obj = a.f122562e;
                }
                if (C89219l.m154714a((Object) "Following", obj)) {
                    C53362a.C53377f a2 = aVar.mo89839a(i2);
                    if (a2 != null) {
                        i = a2.f122558a;
                    }
                } else {
                    i2++;
                }
            }
            i = -1;
            C53362a aVar2 = this.f122578a;
            if (i >= 0 && i <= aVar2.f122492a.getChildCount() - 1) {
                aVar2.f122492a.mo89936a(i, true);
                return;
            }
            return;
        }
        int selectedTabPosition = this.f122578a.getSelectedTabPosition();
        C53362a aVar3 = this.f122578a;
        if (selectedTabPosition >= 0 && selectedTabPosition <= aVar3.f122492a.getChildCount() - 1) {
            aVar3.f122492a.mo89936a(selectedTabPosition, false);
        }
    }

    public C53385d(FrameLayout frameLayout) {
        C53362a aVar;
        C89219l.m154721d(frameLayout, "");
        MethodCollector.m26663i(1208);
        if (C67248d.m119177e()) {
            X2CFragmentMainPageIcon x2CFragmentMainPageIcon = (X2CFragmentMainPageIcon) C58221f.m105142a(new X2CFragmentMainPageIcon());
            if (x2CFragmentMainPageIcon.f122368i != null) {
                X2CFragmentMainPageIcon.m98293a(x2CFragmentMainPageIcon.f122368i);
                aVar = x2CFragmentMainPageIcon.f122368i;
                x2CFragmentMainPageIcon.f122368i = null;
                if (aVar != null) {
                    this.f122583f = true;
                }
            }
            Context context = frameLayout.getContext();
            C89219l.m154716b(context, "");
            aVar = new C53362a(context, (byte) 0);
        } else {
            Context context2 = frameLayout.getContext();
            C89219l.m154716b(context2, "");
            aVar = new C53362a(context2, (byte) 0);
        }
        this.f122578a = aVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (C16048b.m29633a().mo25421a(true, "optimize_feed_tab_layout", false)) {
            layoutParams.gravity = 1;
            layoutParams.topMargin = (int) C13628n.m24520b(aVar.getContext(), -3.0f);
        } else {
            layoutParams.gravity = 17;
        }
        aVar.setLayoutParams(layoutParams);
        Context context3 = frameLayout.getContext();
        C89219l.m154716b(context3, "");
        aVar.setBackgroundColor(context3.getResources().getColor(R.color.c9));
        aVar.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53385d.View$OnAttachStateChangeListenerC533861 */

            /* renamed from: a */
            final /* synthetic */ C53385d f122587a;

            static {
                Covode.recordClassIndex(62949);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f122587a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                C89219l.m154721d(view, "");
                EventBus.m156966a(EventBus.m156962a(), this.f122587a);
            }

            public final void onViewDetachedFromWindow(View view) {
                C89219l.m154721d(view, "");
                EventBus.m156962a().mo145395b(this.f122587a);
            }
        });
        frameLayout.addView(aVar, 0);
        Context context4 = aVar.getContext();
        if (context4 != null) {
            this.f122584g = (ActivityC0945e) context4;
            aVar.setVisibility(0);
            if (aVar.f122496e == null) {
                aVar.f122496e = new C53362a.C53379g(aVar);
            }
            C53362a.C53379g gVar = aVar.f122496e;
            if (gVar == null) {
                C89219l.m154715b();
            }
            this.f122579b = gVar;
            MethodCollector.m26664o(1208);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.m26664o(1208);
        throw nullPointerException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014a, code lost:
        if ((r0 instanceof com.p2082ss.android.ugc.aweme.service.AbstractC67848b) != false) goto L_0x014c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89972a(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 379
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53385d.mo89972a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo89971a(int i, int i2) {
        String str;
        C53362a.C53377f a = this.f122578a.mo89839a(i);
        Object obj = null;
        if (a != null) {
            obj = a.f122562e;
        }
        if (!(obj instanceof String) || obj == null) {
            obj = "";
        }
        String str2 = f122575k.get(obj);
        String str3 = f122574j.get(m98487c());
        if (i2 == 2) {
            str = "slide";
        } else if (i2 == 1) {
            str = f122576l.get(obj);
        } else if (i2 == 3) {
            str = "goback_icon";
        } else {
            str = "click_follow_tab";
        }
        C1731i.m5640b(new CallableC53391e(this, str2, str, str3, FollowFeedServiceImpl.m95503c().mo86499a(this.f122584g)), C39162r.m79452a());
    }
}

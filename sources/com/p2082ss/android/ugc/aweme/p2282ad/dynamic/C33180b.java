package com.p2082ss.android.ugc.aweme.p2282ad.dynamic;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33203a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2294c.C33215a;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.dynamic.b */
public final class C33180b implements AbstractC33207d, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C33180b f78839a = new C33180b();

    /* renamed from: b */
    private static final AbstractC89244h f78840b = C89250i.m154774a(EnumC89331m.NONE, C33181a.f78849a);

    /* renamed from: c */
    private static final AbstractC89244h f78841c = C89250i.m154774a(EnumC89331m.NONE, C33182b.f78850a);

    /* renamed from: d */
    private static final AbstractC89244h f78842d = C89250i.m154774a(EnumC89331m.NONE, C33183c.f78851a);

    /* renamed from: e */
    private static final AbstractC89244h f78843e = C89250i.m154774a(EnumC89331m.NONE, C33184d.f78852a);

    /* renamed from: f */
    private static HashMap<String, C33203a> f78844f = new HashMap<>();

    /* renamed from: g */
    private static WeakReference<Context> f78845g;

    /* renamed from: h */
    private static int f78846h;

    /* renamed from: i */
    private static int f78847i;

    /* renamed from: j */
    private static int f78848j;

    /* renamed from: a */
    public static int m68004a() {
        return ((Number) f78840b.getValue()).intValue();
    }

    /* renamed from: d */
    private static int m68009d() {
        return ((Number) f78841c.getValue()).intValue();
    }

    /* renamed from: e */
    private static AbstractC33214c m68010e() {
        return (AbstractC33214c) f78842d.getValue();
    }

    /* renamed from: f */
    private static String m68011f() {
        return (String) f78843e.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(315, new RunnableC90250g(C33180b.class, "onDynamicAdReadyEvent", C33186c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(99, new RunnableC90250g(C33180b.class, "onAdFeedRefreshEvent", C33215a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.b$e */
    public static final class C33185e implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f78853a;

        /* renamed from: b */
        final /* synthetic */ int f78854b;

        /* renamed from: c */
        final /* synthetic */ int f78855c;

        /* renamed from: d */
        private final String f78856d = "onDCViewSize";

        static {
            Covode.recordClassIndex(40005);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f78856d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f78853a;
        }

        C33185e(int i, int i2) {
            this.f78854b = i;
            this.f78855c = i2;
            this.f78853a = new JSONObject().put("viewPortWidth", i).put("viewPortHeight", i2);
        }
    }

    private C33180b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d
    /* renamed from: a */
    public final void mo59089a(Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        DynamicVideo dynamicVideo;
        String lynxScheme;
        AbstractC35142e a;
        if (aweme != null) {
            WeakReference<Context> weakReference = f78845g;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                C89219l.m154721d("preload failed: context is null", "");
            } else if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && (dynamicVideo = awemeRawAd.getDynamicVideo()) != null && (lynxScheme = dynamicVideo.getLynxScheme()) != null && lynxScheme.length() != 0 && f78844f.get(aweme.getAid()) == null) {
                C33203a aVar = new C33203a(aweme, z);
                HashMap<String, C33203a> hashMap = f78844f;
                String aid = aweme.getAid();
                C89219l.m154716b(aid, "");
                hashMap.put(aid, aVar);
                C89219l.m154721d("preload start, lynxScheme: ".concat(String.valueOf(lynxScheme)), "");
                aVar.f78901e = System.currentTimeMillis();
                BulletContainerView bulletContainerView = new BulletContainerView(context, null, 6, (byte) 0);
                aVar.f78898b = bulletContainerView;
                bulletContainerView.mo26839a(BulletService.m71938f().mo61849a(context), 17, 0, 0, 0, 0);
                Uri.Builder buildUpon = Uri.parse(lynxScheme).buildUpon();
                buildUpon.appendQueryParameter("initialData", m68005a(aweme));
                Bundle bundle = new Bundle();
                AbstractC33214c e = m68010e();
                if (e != null) {
                    e.mo59144a(bundle, aweme, context);
                }
                AbstractC33214c e2 = m68010e();
                if (!(e2 == null || (a = e2.mo59142a(bulletContainerView, m68011f(), new C33179a(aVar))) == null)) {
                    String builder = buildUpon.toString();
                    C89219l.m154716b(builder, "");
                    a.mo61984a(builder, bundle);
                }
                C18129a.m33746a("draw_ad", "dc_prerender", aweme.getAwemeRawAd()).mo28897a("is_first", Integer.valueOf(z ? 1 : 0)).mo28901b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.b$c */
    static final class C33183c extends AbstractC89220m implements AbstractC89171a<AbstractC33214c> {

        /* renamed from: a */
        public static final C33183c f78851a = new C33183c();

        static {
            Covode.recordClassIndex(40003);
        }

        C33183c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC33214c invoke() {
            AbstractC39043a a = CommercializeAdServiceImpl.m79243a().mo67720a(17);
            if (!(a instanceof AbstractC33214c)) {
                return null;
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.b$d */
    static final class C33184d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C33184d f78852a = new C33184d();

        static {
            Covode.recordClassIndex(40004);
        }

        C33184d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (f != null) {
                return f.mo59391g("dynamic_ad_feed");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.b$a */
    static final class C33181a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C33181a f78849a = new C33181a();

        static {
            Covode.recordClassIndex(40001);
        }

        C33181a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            DynamicAdConfig a = C33187d.m68023a();
            if (a != null) {
                i = a.getLynxViewPreRenderGap();
            } else {
                i = 6;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.b$b */
    static final class C33182b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C33182b f78850a = new C33182b();

        static {
            Covode.recordClassIndex(40002);
        }

        C33182b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            DynamicAdConfig a = C33187d.m68023a();
            if (a != null) {
                i = a.getLynxViewReleaseGap();
            } else {
                i = 8;
            }
            if (i <= C33180b.m68004a()) {
                i = C33180b.m68004a() + 1;
            }
            return Integer.valueOf(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d
    /* renamed from: b */
    public final C89378p<Integer, Integer> mo59090b() {
        return new C89378p<>(Integer.valueOf(f78846h), Integer.valueOf(f78847i));
    }

    static {
        Covode.recordClassIndex(40000);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d
    /* renamed from: c */
    public final void mo59091c() {
        C80298cg.m139205b(this);
        for (Map.Entry<String, C33203a> entry : f78844f.entrySet()) {
            BulletContainerView bulletContainerView = entry.getValue().f78898b;
            if (bulletContainerView != null) {
                bulletContainerView.mo25721a();
            }
        }
        f78844f.clear();
        f78846h = 0;
        f78847i = 0;
        f78848j = 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d
    /* renamed from: a */
    public final C33203a mo59083a(String str) {
        return f78844f.get(str);
    }

    /* renamed from: a */
    private static String m68005a(Aweme aweme) {
        String str;
        C28022o oVar = new C28022o();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            C89219l.m154716b(awemeRawAd, "");
            Long adId = awemeRawAd.getAdId();
            String str2 = null;
            if (adId != null) {
                str = String.valueOf(adId.longValue());
            } else {
                str = null;
            }
            oVar.mo46801a("adId", str);
            oVar.mo46801a("creativeId", awemeRawAd.getCreativeIdStr());
            oVar.mo46801a("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                str2 = String.valueOf(groupId.longValue());
            }
            oVar.mo46801a("groupId", str2);
        }
        String oVar2 = oVar.toString();
        C89219l.m154716b(oVar2, "");
        return oVar2;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onAdFeedRefreshEvent(C33215a aVar) {
        MethodCollector.m26663i(9003);
        C89219l.m154721d(aVar, "");
        for (Map.Entry<String, C33203a> entry : f78844f.entrySet()) {
            C33203a value = entry.getValue();
            BulletContainerView bulletContainerView = value.f78898b;
            if (bulletContainerView != null) {
                ViewParent parent = bulletContainerView.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(bulletContainerView);
                }
                bulletContainerView.mo25721a();
                C18129a.m33746a("draw_ad", "dc_release", value.f78902f.getAwemeRawAd()).mo28897a("is_first", Integer.valueOf(value.f78903g ? 1 : 0)).mo28901b();
            }
        }
        f78844f.clear();
        f78848j = 0;
        MethodCollector.m26664o(9003);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDynamicAdReadyEvent(C33186c cVar) {
        int i;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d("DynamicAdReadyEvent", "");
        int i2 = cVar.f78857a;
        Collection<C33203a> values = f78844f.values();
        C89219l.m154716b(values, "");
        for (T t : values) {
            BulletContainerView bulletContainerView = t.f78898b;
            if (bulletContainerView != null) {
                i = bulletContainerView.hashCode();
                continue;
            } else {
                i = 0;
                continue;
            }
            if (i == i2) {
                t.f78897a = 1;
                t.f78900d = cVar.f78858b;
                Aweme aweme = t.f78902f;
                Video video = aweme.getVideo();
                if (video != null) {
                    video.setDuration((double) cVar.f78858b);
                }
                C18129a.m33746a("draw_ad", "dc_ready", aweme.getAwemeRawAd()).mo28897a("is_first", Integer.valueOf(t.f78903g ? 1 : 0)).mo28897a("time", Long.valueOf(System.currentTimeMillis() - t.f78901e)).mo28901b();
                return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d
    /* renamed from: a */
    public final void mo59086a(Context context) {
        if (context != null) {
            f78845g = new WeakReference<>(context);
            C80298cg.m139204a(this);
        }
    }

    /* renamed from: b */
    private static void m68007b(int i, List<? extends Aweme> list) {
        if (i >= 0 && i < list.size()) {
            Aweme aweme = (Aweme) list.get(i);
            if (C37699a.m76251aW(aweme)) {
                C89219l.m154721d("trigger release cache, index = ".concat(String.valueOf(i)), "");
                m68006a(aweme.getAid(), true);
            }
        }
    }

    /* renamed from: c */
    private final void m68008c(int i, List<? extends Aweme> list) {
        if (i >= 0 && i < list.size()) {
            Aweme aweme = (Aweme) list.get(i);
            if (C37699a.m76251aW(aweme)) {
                C89219l.m154721d("trigger preload again, index = ".concat(String.valueOf(i)), "");
                mo59089a(aweme, false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d
    /* renamed from: a */
    public final void mo59084a(int i, int i2) {
        f78846h = i;
        f78847i = i2;
        Collection<C33203a> values = f78844f.values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            C89219l.m154721d("send onDCViewSize event", "");
            AbstractC16208i iVar = it.next().f78899c;
            if (iVar != null) {
                iVar.onEvent(new C33185e(i, i2));
            }
        }
    }

    /* renamed from: a */
    private static void m68006a(String str, boolean z) {
        BulletContainerView bulletContainerView;
        MethodCollector.m26663i(8685);
        if (str == null) {
            MethodCollector.m26664o(8685);
            return;
        }
        C33203a aVar = f78844f.get(str);
        ViewGroup viewGroup = null;
        if (!(aVar == null || (bulletContainerView = aVar.f78898b) == null)) {
            ViewParent parent = bulletContainerView.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = parent;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.removeView(bulletContainerView);
            }
            bulletContainerView.mo25721a();
            if (z) {
                C18129a.m33746a("draw_ad", "dc_release", aVar.f78902f.getAwemeRawAd()).mo28897a("is_first", Integer.valueOf(aVar.f78903g ? 1 : 0)).mo28901b();
            }
            C89219l.m154721d("releaseCacheByAwemeId, awemeId: ".concat(String.valueOf(str)), "");
        }
        f78844f.remove(str);
        MethodCollector.m26664o(8685);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d
    /* renamed from: a */
    public final void mo59085a(int i, List<? extends Aweme> list) {
        if (list != null) {
            int i2 = f78848j;
            if (i > i2) {
                m68007b(i - m68009d(), list);
                m68008c(m68004a() + i, list);
            } else if (i < i2) {
                m68007b(m68009d() + i, list);
                m68008c(i - m68004a(), list);
            }
            f78848j = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d
    /* renamed from: a */
    public final void mo59088a(Aweme aweme, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (aweme != null && C37699a.m76251aW(aweme)) {
            C33203a a = mo59083a(aweme.getAid());
            int i = 0;
            if (a == null || a.f78897a != 1) {
                C89219l.m154721d("fallback to native video", "");
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    awemeRawAd.setDynamicVideo(null);
                }
                aVar.invoke();
                m68006a(aweme.getAid(), false);
                C18129a.C18130a a2 = C18129a.m33746a("draw_ad", "dc_downgrade", aweme.getAwemeRawAd());
                if (a == null || a.f78903g) {
                    i = 1;
                }
                a2.mo28897a("is_first", Integer.valueOf(i)).mo28901b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d
    /* renamed from: a */
    public final void mo59087a(Aweme aweme, int i, List<? extends Aweme> list) {
        String str;
        C89219l.m154721d(list, "");
        if (C37699a.m76251aW(aweme)) {
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            m68006a(str, true);
        }
        m68008c(i + m68004a(), list);
    }
}

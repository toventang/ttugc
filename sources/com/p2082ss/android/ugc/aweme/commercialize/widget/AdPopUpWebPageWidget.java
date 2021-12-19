package com.p2082ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.platform.p1352b.C18822b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.p2019b.C27895a;
import com.lynx.tasm.EnumC28856r;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37975a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37977b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38615aa;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38618ac;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget */
public final class AdPopUpWebPageWidget extends AbsAdFeedWidget implements AbstractC33974au {

    /* renamed from: m */
    public static final Map<String, WeakReference<Runnable>> f92171m = new HashMap();

    /* renamed from: n */
    public static final C39024b f92172n = new C39024b((byte) 0);

    /* renamed from: a */
    public AdPopUpWebPageView f92173a;

    /* renamed from: h */
    public String f92174h;

    /* renamed from: i */
    long f92175i;

    /* renamed from: j */
    final C39030d f92176j = new C39030d(this);

    /* renamed from: k */
    final C39033g f92177k = new C39033g(this);

    /* renamed from: l */
    final C39031e f92178l = new C39031e(this);

    /* renamed from: s */
    private final Runnable f92179s = new RunnableC39029c(this);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b */
    public static final class C39024b {
        static {
            Covode.recordClassIndex(46624);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b$a */
        public static final class C39025a extends C27895a<List<? extends String>> {
            static {
                Covode.recordClassIndex(46625);
            }

            C39025a() {
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b$b */
        public static final class C39026b extends C27895a<Boolean> {
            static {
                Covode.recordClassIndex(46626);
            }

            C39026b() {
            }
        }

        private C39024b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b$c */
        public static final class C39027c extends AbstractC89220m implements AbstractC89171a<Object> {

            /* renamed from: a */
            final /* synthetic */ AdPopUpWebPageView f92181a;

            /* renamed from: b */
            final /* synthetic */ C37977b f92182b;

            static {
                Covode.recordClassIndex(46627);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39027c(AdPopUpWebPageView adPopUpWebPageView, C37977b bVar) {
                super(0);
                this.f92181a = adPopUpWebPageView;
                this.f92182b = bVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final Object invoke() {
                return Boolean.valueOf(this.f92181a.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C39024b.C39027c.RunnableC390281 */

                    /* renamed from: a */
                    final /* synthetic */ C39027c f92183a;

                    static {
                        Covode.recordClassIndex(46628);
                    }

                    {
                        this.f92183a = r1;
                    }

                    public final void run() {
                        this.f92183a.f92181a.mo66105a(this.f92183a.f92182b);
                    }
                }));
            }
        }

        public /* synthetic */ C39024b(byte b) {
            this();
        }

        /* renamed from: b */
        public static FrameLayout m79197b(Activity activity) {
            FrameLayout d = m79201d(activity);
            if (d == null) {
                return m79202e(activity);
            }
            return d;
        }

        /* renamed from: b */
        private static void m79198b(C37977b bVar) {
            String str;
            WeakReference<Runnable> weakReference;
            Runnable runnable;
            if (bVar != null && (str = bVar.f89728h) != null && (weakReference = AdPopUpWebPageWidget.f92171m.get(str)) != null && (runnable = weakReference.get()) != null) {
                runnable.run();
            }
        }

        /* renamed from: c */
        static AdPopUpWebPageView m79200c(Activity activity) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout b = m79197b(activity);
            if (b != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) b.findViewById(R.id.fg);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        /* renamed from: d */
        private static FrameLayout m79201d(Activity activity) {
            View inflate;
            MethodCollector.m26663i(8855);
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.e8);
            if (viewStub == null) {
                inflate = activity.findViewById(R.id.e7);
            } else {
                viewStub.setLayoutResource(R.layout.a3d);
                inflate = viewStub.inflate();
                if (inflate == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    MethodCollector.m26664o(8855);
                    throw nullPointerException;
                }
            }
            FrameLayout frameLayout = (FrameLayout) inflate;
            MethodCollector.m26664o(8855);
            return frameLayout;
        }

        /* renamed from: e */
        private static FrameLayout m79202e(Activity activity) {
            View inflate;
            MethodCollector.m26663i(9009);
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.dm);
            if (viewStub == null) {
                inflate = activity.findViewById(R.id.dl);
            } else {
                viewStub.setLayoutResource(R.layout.cl);
                inflate = viewStub.inflate();
                if (inflate == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    MethodCollector.m26664o(9009);
                    throw nullPointerException;
                }
            }
            FrameLayout frameLayout = (FrameLayout) inflate;
            MethodCollector.m26664o(9009);
            return frameLayout;
        }

        /* renamed from: a */
        public final void mo67715a(Activity activity) {
            MethodCollector.m26663i(8715);
            C89219l.m154721d(activity, "");
            AdPopUpWebPageView c = m79200c(activity);
            if (c != null) {
                c.mo66109b();
                FrameLayout b = m79197b(activity);
                if (b != null) {
                    b.removeView(c);
                    MethodCollector.m26664o(8715);
                    return;
                }
                MethodCollector.m26664o(8715);
                return;
            }
            MethodCollector.m26664o(8715);
        }

        /* renamed from: a */
        public final boolean mo67716a(C37977b bVar) {
            if (bVar == null) {
                return false;
            }
            Context context = bVar.f89721a;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null) {
                return false;
            }
            m79198b(bVar);
            AdPopUpWebPageView c = m79200c(activity);
            if (c == null || c.mo66115g()) {
                return false;
            }
            FrameLayout b = m79197b(activity);
            if (b != null) {
                b.setVisibility(0);
            }
            c.getActionMode().f89717f = bVar.f89724d;
            c.mo66106a(new C39027c(c, bVar));
            return true;
        }

        /* renamed from: a */
        public static boolean m79196a(AwemeRawAd awemeRawAd, String str) {
            if (awemeRawAd == null || awemeRawAd.getWebviewType() != 1 || m79199b(awemeRawAd, str)) {
                return false;
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m79199b(com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd r7, java.lang.String r8) {
            /*
                if (r8 != 0) goto L_0x0012
                if (r7 == 0) goto L_0x000a
                java.lang.String r0 = r7.getWebUrl()
                if (r0 != 0) goto L_0x000c
            L_0x000a:
                java.lang.String r0 = ""
            L_0x000c:
                android.net.Uri r1 = android.net.Uri.parse(r0)
            L_0x0010:
                r6 = 0
                goto L_0x0017
            L_0x0012:
                android.net.Uri r1 = android.net.Uri.parse(r8)
                goto L_0x0010
            L_0x0017:
                java.lang.String r0 = "immersive_mode"
                java.lang.String r5 = r1.getQueryParameter(r0)     // Catch:{ UnsupportedOperationException -> 0x005b }
                r0 = 1
                if (r7 == 0) goto L_0x002b
                boolean r4 = com.p2082ss.android.ugc.aweme.feed.p2979x.C50543k.m94758a(r7)     // Catch:{ UnsupportedOperationException -> 0x005b }
            L_0x0024:
                java.lang.String r0 = "topbar_type"
                java.lang.String r3 = r1.getQueryParameter(r0)     // Catch:{ UnsupportedOperationException -> 0x005b }
                goto L_0x002d
            L_0x002b:
                r4 = 1
                goto L_0x0024
            L_0x002d:
                java.lang.String r2 = "1"
                if (r3 != 0) goto L_0x0034
            L_0x0031:
                if (r5 == 0) goto L_0x0057
                goto L_0x0046
            L_0x0034:
                int r1 = r3.hashCode()
                r0 = 48
                if (r1 == r0) goto L_0x003d
                goto L_0x004b
            L_0x003d:
                java.lang.String r0 = "0"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x004f
                goto L_0x0031
            L_0x0046:
                boolean r6 = p4600h.p4611f.p4613b.C89219l.m154714a(r5, r2)
                goto L_0x004f
            L_0x004b:
                r0 = 49
                if (r1 == r0) goto L_0x0050
            L_0x004f:
                return r6
            L_0x0050:
                boolean r0 = r3.equals(r2)
                if (r0 == 0) goto L_0x004f
                goto L_0x0059
            L_0x0057:
                if (r4 != 0) goto L_0x004f
            L_0x0059:
                r6 = 1
                goto L_0x004f
            L_0x005b:
                r0 = move-exception
                r0.printStackTrace()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C39024b.m79199b(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, java.lang.String):boolean");
        }

        /* renamed from: a */
        public final AdPopUpWebPageView mo67714a(Activity activity, C38618ac acVar, AdPopUpWebPageView.AbstractC37940a aVar, AdPopUpWebPageView.AbstractC37942c cVar) {
            MethodCollector.m26663i(8569);
            C89219l.m154721d(activity, "");
            C89219l.m154721d(acVar, "");
            AdPopUpWebPageView c = m79200c(activity);
            if (c == null) {
                c = new AdPopUpWebPageView(activity, (byte) 0);
                c.setId(R.id.fg);
                c.setParams(acVar);
                c.setMBehaviorCallback(aVar);
                c.setKeyDownCallBack(cVar);
                FrameLayout b = m79197b(activity);
                if (b != null) {
                    b.addView(c);
                }
            }
            MethodCollector.m26664o(8569);
            return c;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$f */
    public static final class C39032f extends C27895a<Boolean> {
        static {
            Covode.recordClassIndex(46632);
        }

        C39032f() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$e */
    public static final class C39031e implements AdPopUpWebPageView.AbstractC37942c {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageWidget f92186a;

        static {
            Covode.recordClassIndex(46631);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37942c
        /* renamed from: a */
        public final void mo66148a() {
            this.f92186a.f92174h = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39031e(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f92186a = adPopUpWebPageWidget;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        mo67711a(System.currentTimeMillis() - this.f92175i);
        super.onPause();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        this.f92175i = System.currentTimeMillis();
        super.onResume();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$g */
    public static final class C39033g implements AdPopUpWebPageView.AbstractC37943d {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageWidget f92187a;

        static {
            Covode.recordClassIndex(46633);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37943d
        /* renamed from: a */
        public final void mo66149a() {
            this.f92187a.f92174h = "button";
            DataCenter dataCenter = this.f92187a.f80273e;
            if (dataCenter != null) {
                dataCenter.mo60191a("action_ad_pop_up_web_resume_video", (Object) null);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37943d
        /* renamed from: b */
        public final void mo66150b() {
            AwemeRawAd awemeRawAd;
            AdPopUpWebPageView adPopUpWebPageView = this.f92187a.f92173a;
            if (adPopUpWebPageView != null) {
                C37975a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = this.f92187a.f92081o;
                AwemeRawAd awemeRawAd2 = null;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.mo66197b(awemeRawAd)) {
                    C38182f.C38184b a = C38182f.m77418a();
                    a.f90211a = "homepage_landing_ad";
                    a.f90212b = "report";
                    a.mo66497b(this.f92187a.f92081o).mo66495a((Context) null);
                    Aweme aweme2 = this.f92187a.f92081o;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    }
                    C18129a.m33746a("homepage_landing_ad", "report", awemeRawAd2).mo28902c();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39033g(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f92187a = adPopUpWebPageWidget;
        }
    }

    static {
        Covode.recordClassIndex(46622);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59238a() {
        super.mo59238a();
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_on_page_selected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_on_page_unselected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_video_on_resume_play", (AbstractC1214u<C33942b>) this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo67713f() {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.f92081o;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getWebviewPannelStyle() != 1) {
            return "landing_page";
        }
        return "close";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo67712e() {
        String str;
        AwemeRawAd awemeRawAd;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme aweme = this.f92081o;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (str = awemeRawAd.getWebUrl()) == null) {
            str = "";
        }
        linkedHashMap.put("url", str);
        linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        C18494b.m34415a(new C18484a("ad_webview_close", System.currentTimeMillis(), C18822b.m34925a(linkedHashMap)));
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$c */
    static final class RunnableC39029c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageWidget f92184a;

        static {
            Covode.recordClassIndex(46629);
        }

        RunnableC39029c(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f92184a = adPopUpWebPageWidget;
        }

        public final void run() {
            ActivityC0945e activity;
            Fragment fragment;
            Context context;
            String str;
            String str2;
            AwemeRawAd awemeRawAd;
            String str3;
            Context context2;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AwemeRawAd awemeRawAd4;
            AdPopUpWebPageWidget adPopUpWebPageWidget = this.f92184a;
            Fragment fragment2 = adPopUpWebPageWidget.f92082p;
            AwemeRawAd awemeRawAd5 = null;
            if (fragment2 != null && (activity = fragment2.getActivity()) != null && (fragment = adPopUpWebPageWidget.f92082p) != null && (context = fragment.getContext()) != null) {
                Aweme aweme = adPopUpWebPageWidget.f92081o;
                if (aweme == null || (awemeRawAd4 = aweme.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd4.getSource();
                }
                if (!TextUtils.isEmpty(str)) {
                    Aweme aweme2 = adPopUpWebPageWidget.f92081o;
                    if (aweme2 == null || (awemeRawAd3 = aweme2.getAwemeRawAd()) == null) {
                        str2 = null;
                    } else {
                        str2 = awemeRawAd3.getSource();
                    }
                } else {
                    Aweme aweme3 = adPopUpWebPageWidget.f92081o;
                    if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (str2 = awemeRawAd.getWebTitle()) == null) {
                        str2 = "";
                    }
                }
                C39024b bVar = AdPopUpWebPageWidget.f92172n;
                C38618ac.C38619a aVar = new C38618ac.C38619a();
                Aweme aweme4 = adPopUpWebPageWidget.f92081o;
                if (aweme4 == null || (awemeRawAd2 = aweme4.getAwemeRawAd()) == null || (str3 = awemeRawAd2.getWebUrl()) == null) {
                    str3 = "";
                }
                C38618ac.C38619a a = aVar.mo67199a(str3).mo67197a(adPopUpWebPageWidget.f92082p).mo67195a(C80534hh.m139609b());
                if (str2 == null) {
                    str2 = "";
                }
                C38618ac.C38619a b = a.mo67201b(str2);
                Aweme aweme5 = adPopUpWebPageWidget.f92081o;
                Bundle bundle = new Bundle();
                Fragment fragment3 = adPopUpWebPageWidget.f92082p;
                if (!(fragment3 == null || (context2 = fragment3.getContext()) == null)) {
                    C89219l.m154716b(context2, "");
                    if (!(aweme5 == null || aweme5.getAwemeRawAd() == null)) {
                        C38739d.m78570a(bundle, aweme5, context2);
                        C38739d.m78573b(bundle, aweme5, context2);
                        C38739d.m78575c(bundle, aweme5, context2);
                        C38739d.m78569a(bundle, context2);
                    }
                }
                C38618ac.C38619a a2 = b.mo67196a(bundle);
                Aweme aweme6 = adPopUpWebPageWidget.f92081o;
                if (aweme6 != null) {
                    awemeRawAd5 = aweme6.getAwemeRawAd();
                }
                C38618ac.C38619a a3 = a2.mo67198a(awemeRawAd5);
                a3.f91274h = adPopUpWebPageWidget.mo67710a(context, adPopUpWebPageWidget.f92081o);
                adPopUpWebPageWidget.f92173a = bVar.mo67714a(activity, a3.mo67200a(), adPopUpWebPageWidget.f92176j, adPopUpWebPageWidget.f92178l);
                AdPopUpWebPageView adPopUpWebPageView = adPopUpWebPageWidget.f92173a;
                if (adPopUpWebPageView != null) {
                    adPopUpWebPageView.setTitleBarCallback(adPopUpWebPageWidget.f92177k);
                }
                adPopUpWebPageWidget.hashCode();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$d */
    public static final class C39030d implements AdPopUpWebPageView.AbstractC37940a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageWidget f92185a;

        static {
            Covode.recordClassIndex(46630);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66146a(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66143a() {
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            Integer num;
            C37975a actionMode;
            AdPopUpWebPageWidget adPopUpWebPageWidget = this.f92185a;
            AbstractC81915c.m141874a(new C39023a(true));
            DataCenter dataCenter = adPopUpWebPageWidget.f80273e;
            AwemeRawAd awemeRawAd4 = null;
            if (dataCenter != null) {
                dataCenter.mo60191a("on_ad_pop_up_web_page_show", (Object) null);
            }
            DataCenter dataCenter2 = adPopUpWebPageWidget.f80273e;
            if (dataCenter2 != null) {
                AdPopUpWebPageView adPopUpWebPageView = adPopUpWebPageWidget.f92173a;
                if (adPopUpWebPageView == null || (actionMode = adPopUpWebPageView.getActionMode()) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(actionMode.f89717f);
                }
                dataCenter2.mo60191a("action_ad_pop_up_web_pause_video", num);
            }
            adPopUpWebPageWidget.f92175i = System.currentTimeMillis();
            AdPopUpWebPageView adPopUpWebPageView2 = adPopUpWebPageWidget.f92173a;
            if (adPopUpWebPageView2 != null) {
                C37975a actionMode2 = adPopUpWebPageView2.getActionMode();
                Aweme aweme = adPopUpWebPageWidget.f92081o;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode2.mo66196a(awemeRawAd)) {
                    C38182f.C38184b a = C38182f.m77418a();
                    a.f90211a = "landing_ad";
                    a.f90212b = "detail_show";
                    a.mo66497b(adPopUpWebPageWidget.f92081o).mo66495a((Context) null);
                    Aweme aweme2 = adPopUpWebPageWidget.f92081o;
                    if (aweme2 != null) {
                        awemeRawAd3 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd3 = null;
                    }
                    C18129a.m33746a("landing_ad", "detail_show", awemeRawAd3).mo28902c();
                }
                C37975a actionMode3 = adPopUpWebPageView2.getActionMode();
                Aweme aweme3 = adPopUpWebPageWidget.f92081o;
                if (aweme3 != null) {
                    awemeRawAd2 = aweme3.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                if (actionMode3.mo66197b(awemeRawAd2)) {
                    C38182f.C38184b a2 = C38182f.m77418a();
                    a2.f90211a = "homepage_landing_ad";
                    a2.f90212b = "detail_show";
                    a2.mo66497b(adPopUpWebPageWidget.f92081o).mo66495a((Context) null);
                    Aweme aweme4 = adPopUpWebPageWidget.f92081o;
                    if (aweme4 != null) {
                        awemeRawAd4 = aweme4.getAwemeRawAd();
                    }
                    C18129a.m33746a("homepage_landing_ad", "detail_show", awemeRawAd4).mo28902c();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39030d(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f92185a = adPopUpWebPageWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: b */
        public final void mo66147b(int i) {
            DataCenter dataCenter = this.f92185a.f80273e;
            if (dataCenter != null) {
                dataCenter.mo60191a("action_ad_pop_up_web_pause_video", (Object) null);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66144a(int i) {
            String str;
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AwemeRawAd awemeRawAd4;
            AdPopUpWebPageWidget adPopUpWebPageWidget = this.f92185a;
            AbstractC81915c.m141874a(new C39023a(false));
            DataCenter dataCenter = adPopUpWebPageWidget.f80273e;
            if (dataCenter != null) {
                dataCenter.mo60191a("on_ad_pop_up_web_page_hide", (Object) null);
            }
            DataCenter dataCenter2 = adPopUpWebPageWidget.f80273e;
            if (dataCenter2 != null) {
                dataCenter2.mo60191a("action_ad_pop_up_web_resume_video", (Object) null);
            }
            AdPopUpWebPageView adPopUpWebPageView = adPopUpWebPageWidget.f92173a;
            if (adPopUpWebPageView != null) {
                String str2 = "slide";
                if (C38615aa.f91246d == 1) {
                    str = str2;
                } else {
                    str = "slide_down";
                }
                C37975a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = adPopUpWebPageWidget.f92081o;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.mo66196a(awemeRawAd)) {
                    C38182f.C38184b a = C38182f.m77418a();
                    a.f90211a = "landing_ad";
                    a.f90212b = adPopUpWebPageWidget.mo67713f();
                    String str3 = adPopUpWebPageWidget.f92174h;
                    if (str3 == null) {
                        str3 = str;
                    }
                    a.mo66504c(str3).mo66497b(adPopUpWebPageWidget.f92081o).mo66495a((Context) null);
                    String f = adPopUpWebPageWidget.mo67713f();
                    Aweme aweme2 = adPopUpWebPageWidget.f92081o;
                    if (aweme2 != null) {
                        awemeRawAd4 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd4 = null;
                    }
                    C18129a.C18130a a2 = C18129a.m33746a("landing_ad", f, awemeRawAd4);
                    String str4 = adPopUpWebPageWidget.f92174h;
                    if (str4 != null) {
                        str = str4;
                    }
                    a2.mo28900b("refer", str).mo28902c();
                }
                C37975a actionMode2 = adPopUpWebPageView.getActionMode();
                Aweme aweme3 = adPopUpWebPageWidget.f92081o;
                if (aweme3 != null) {
                    awemeRawAd2 = aweme3.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                if (actionMode2.mo66197b(awemeRawAd2)) {
                    C38182f.C38184b a3 = C38182f.m77418a();
                    a3.f90211a = "homepage_landing_ad";
                    a3.f90212b = adPopUpWebPageWidget.mo67713f();
                    String str5 = adPopUpWebPageWidget.f92174h;
                    if (str5 == null) {
                        str5 = str2;
                    }
                    a3.mo66504c(str5).mo66497b(adPopUpWebPageWidget.f92081o).mo66495a((Context) null);
                    String f2 = adPopUpWebPageWidget.mo67713f();
                    Aweme aweme4 = adPopUpWebPageWidget.f92081o;
                    if (aweme4 != null) {
                        awemeRawAd3 = aweme4.getAwemeRawAd();
                    } else {
                        awemeRawAd3 = null;
                    }
                    C18129a.C18130a a4 = C18129a.m33746a("homepage_landing_ad", f2, awemeRawAd3);
                    String str6 = adPopUpWebPageWidget.f92174h;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    a4.mo28900b("refer", str2).mo28902c();
                }
            }
            adPopUpWebPageWidget.mo67711a(System.currentTimeMillis() - adPopUpWebPageWidget.f92175i);
            adPopUpWebPageWidget.mo67712e();
            this.f92185a.f92174h = null;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66145a(int i, Boolean bool) {
            this.f92185a.mo67712e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$a */
    public static final class C39023a implements AbstractC81914b {

        /* renamed from: a */
        public final boolean f92180a;

        static {
            Covode.recordClassIndex(46623);
        }

        public C39023a(boolean z) {
            this.f92180a = z;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67711a(long j) {
        if (this.f92173a != null) {
            C33744d dVar = new C33744d();
            dVar.mo59981a("duration", j);
            C39162r.m79460a("h5_stay_time", dVar.f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59239a(C33942b bVar) {
        String str;
        Fragment fragment;
        ActivityC0945e activity;
        String aid;
        Aweme aweme;
        String aid2;
        String extra;
        boolean z;
        boolean z2;
        Fragment fragment2;
        ActivityC0945e activity2;
        super.onChanged(bVar);
        if (bVar != null && (str = bVar.f80277a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode != -1132409520) {
                    if (hashCode == 2040441990 && str.equals("ad_video_on_resume_play") && this.f92173a != null && (fragment2 = this.f92082p) != null && (activity2 = fragment2.getActivity()) != null) {
                        C89219l.m154716b(activity2, "");
                        C89219l.m154721d(activity2, "");
                        AdPopUpWebPageView c = C39024b.m79200c(activity2);
                        if (c != null && c.mo66115g()) {
                            this.f80273e.mo60191a("action_ad_pop_up_web_pause_video", (Object) null);
                        }
                    }
                } else if (str.equals("ad_feed_on_page_selected") && (aweme = this.f92081o) != null) {
                    List<AnchorCommonStruct> anchors = aweme.getAnchors();
                    if (anchors != null) {
                        Iterator<AnchorCommonStruct> it = anchors.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            AnchorCommonStruct next = it.next();
                            if (next.getType() == 24 && (extra = next.getExtra()) != null && extra.length() != 0) {
                                AbstractC28019l a = C28024q.m56139a(next.getExtra());
                                C89219l.m154716b(a, "");
                                Boolean bool = (Boolean) new C27910f().mo46668a(a.mo46789j().mo46803c("is_schema_lynx"), new C39024b.C39026b().type);
                                if (bool != null) {
                                    if (!bool.booleanValue()) {
                                        if (aweme == null) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (aweme.getAwemeRawAd() != null) {
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (awemeRawAd == null || awemeRawAd.getWebviewType() != 1) {
                            z = false;
                        } else {
                            z = true;
                        }
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 == null || awemeRawAd2.getProfileWithWebview() != 1) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z && !z2) {
                            return;
                        }
                        Aweme aweme2 = this.f92081o;
                        if (aweme2 != null && (aid2 = aweme2.getAid()) != null) {
                            f92171m.put(aid2, new WeakReference<>(this.f92179s));
                        }
                    }
                }
            } else if (str.equals("ad_feed_on_page_unselected")) {
                Aweme aweme3 = this.f92081o;
                if (!(aweme3 == null || (aid = aweme3.getAid()) == null)) {
                    f92171m.remove(aid);
                }
                if (this.f92173a != null && (fragment = this.f92082p) != null && (activity = fragment.getActivity()) != null) {
                    f92172n.mo67715a(activity);
                    this.f92173a = null;
                    hashCode();
                }
            }
        }
    }

    /* renamed from: a */
    public final AnchorLynxModel mo67710a(Context context, Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        String str;
        C89219l.m154721d(context, "");
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        boolean z = false;
        int i = 0;
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            i++;
            if (anchorCommonStruct.getType() == 24) {
                AbstractC28019l a = C28024q.m56139a(anchorCommonStruct.getExtra());
                C89219l.m154716b(a, "");
                if (C89219l.m154714a(new C27910f().mo46668a(a.mo46789j().mo46803c("is_schema_lynx"), new C39032f().type), (Object) true)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_lynx_landing_page", true);
                    bundle.putBoolean("hide_nav_bar", true);
                    bundle.putBoolean("hide_status_bar", false);
                    bundle.putBoolean("bundle_nav_bar_status_padding", true);
                    bundle.putBoolean("need_bottom_out", true);
                    AbstractC28019l a2 = C28024q.m56139a(anchorCommonStruct.getExtra());
                    C89219l.m154716b(a2, "");
                    List list = (List) new C27910f().mo46668a(a2.mo46789j().mo46803c("gecko_channel"), new C39024b.C39025a().type);
                    if (!C13603b.m24435a((Collection) list)) {
                        str = (String) list.get(0);
                    } else {
                        str = "";
                    }
                    bundle.putString("lynx_channel_name", str);
                    bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(C13628n.m24504a(context), 1073741824));
                    bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(C13628n.m24521b(context) - C80534hh.m139609b(), 1073741824));
                    String schema = anchorCommonStruct.getSchema();
                    if (schema == null) {
                        schema = "";
                    }
                    Uri parse = Uri.parse(schema);
                    C89219l.m154716b(parse, "");
                    String str2 = "1";
                    if (parse.isHierarchical()) {
                        bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                        if (TextUtils.equals(parse.getQueryParameter("async_layout"), str2)) {
                            bundle.putBoolean("preset_safe_point", true);
                            bundle.putInt("thread_strategy", EnumC28856r.PART_ON_LAYOUT.mo49985id());
                        }
                    }
                    if (anchors.size() == 1) {
                        str2 = "0";
                    } else if (i != 0) {
                        str2 = "2";
                    }
                    String schema2 = anchorCommonStruct.getSchema();
                    if (schema2 == null) {
                        schema2 = "";
                    }
                    Uri.Builder buildUpon = Uri.parse(schema2).buildUpon();
                    String id = anchorCommonStruct.getId();
                    if (anchors.size() == 1) {
                        z = true;
                    }
                    String uri = buildUpon.appendQueryParameter("extra", m79189a(aweme, id, z, str2)).build().toString();
                    C89219l.m154716b(uri, "");
                    return new AnchorLynxModel(uri, bundle);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private String m79189a(Aweme aweme, String str, boolean z, String str2) {
        String str3;
        String str4;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C28022o oVar = new C28022o();
        try {
            oVar.mo46801a("enter_from", this.f92083q);
            oVar.mo46801a("from_source", "item_anchor");
            String str5 = null;
            if (aweme != null) {
                str3 = aweme.getAid();
            } else {
                str3 = null;
            }
            oVar.mo46801a("from_group_id", str3);
            if (aweme != null) {
                str5 = aweme.getAuthorUid();
            }
            oVar.mo46801a("from_author_id", str5);
            oVar.mo46801a("scene_id", str);
            if (z) {
                str4 = "item_play";
            } else {
                str4 = "anchor_list";
            }
            oVar.mo46801a("position", str4);
            oVar.mo46801a("anchor_type", str2);
        } catch (Exception unused) {
        }
        String oVar2 = oVar.toString();
        C89219l.m154716b(oVar2, "");
        return oVar2;
    }
}

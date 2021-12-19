package com.bytedance.ies.ugc.aweme.commercialize.splash.show;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.C17957a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1260d.C17959a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17964b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17993j;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18027h;
import com.p2082ss.android.p2092ad.splash.AbstractC29683u;
import com.p2082ss.android.p2092ad.splash.AbstractC29684v;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.d */
public final class C18009d {

    /* renamed from: a */
    static boolean f42877a;

    /* renamed from: b */
    public static final C18009d f42878b = new C18009d();

    /* renamed from: c */
    private static boolean f42879c;

    /* renamed from: d */
    private static boolean f42880d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.d$c */
    public static final class C18012c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18012c f42883a = new C18012c();

        static {
            Covode.recordClassIndex(20634);
        }

        C18012c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.d$e */
    public static final class C18014e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18014e f42885a = new C18014e();

        static {
            Covode.recordClassIndex(20636);
        }

        C18014e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.d$g */
    public static final class C18016g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18016g f42887a = new C18016g();

        static {
            Covode.recordClassIndex(20638);
        }

        C18016g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C18009d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.d$a */
    public static final class C18010a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C18010a f42881a = new C18010a();

        static {
            Covode.recordClassIndex(20632);
        }

        C18010a() {
            super(0);
        }

        /* renamed from: a */
        public static boolean m33530a() {
            if (!C39223a.m79597k().mo68722f()) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m33530a());
        }
    }

    static {
        Covode.recordClassIndex(20631);
    }

    /* renamed from: a */
    public static void m33520a() {
        m33521b();
        m33523c();
        m33525d();
    }

    /* renamed from: b */
    private static void m33521b() {
        C17873f.m33099g().mo143254a(C18013d.f42884a, C18014e.f42885a);
    }

    /* renamed from: c */
    private static void m33523c() {
        C17873f.m33101i().mo143254a(C18015f.f42886a, C18016g.f42887a);
    }

    /* renamed from: d */
    private static void m33525d() {
        C17873f.m33095c().mo143254a(C18011b.f42882a, C18012c.f42883a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.d$f */
    public static final class C18015f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18015f f42886a = new C18015f();

        static {
            Covode.recordClassIndex(20637);
        }

        C18015f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (SettingsManager.m29616a().mo25400a("splash_quit_enable", true)) {
                C17938a.m33353b(C17867d.m33078a()).mo51693c();
            }
        }
    }

    /* renamed from: c */
    private final boolean m33524c(Context context) {
        if (!C17938a.m33349a() || !mo28739a(context)) {
            return false;
        }
        return m33527e(context);
    }

    /* renamed from: d */
    private static boolean m33526d(Context context) {
        if (C18010a.m33530a()) {
            return false;
        }
        return C17938a.m33344a(context).mo51700g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.d$b */
    public static final class C18011b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18011b f42882a = new C18011b();

        static {
            Covode.recordClassIndex(20633);
        }

        C18011b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Intent intent;
            Activity activity = (Activity) obj;
            if (activity != null) {
                if (SettingsManager.m29616a().mo25400a("prevent_push_topview", true) && (intent = activity.getIntent()) != null) {
                    C17964b.f42783b = intent.getBooleanExtra("from_notification", false);
                }
                C18009d.f42878b.mo28740a(activity, 2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.d$d */
    public static final class C18013d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18013d f42884a = new C18013d();

        static {
            Covode.recordClassIndex(20635);
        }

        C18013d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            Context a = C17867d.m33078a();
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C17938a.m33353b(a).mo51689b();
                C18009d.f42877a = true;
            } else if (C17938a.m33349a()) {
                if (C29495h.f70227c == null) {
                    C17938a.m33344a(a);
                }
                C17938a.m33353b(a).mo51682a();
            }
        }
    }

    /* renamed from: b */
    private static boolean m33522b(Context context) {
        boolean z;
        if (!f42877a || C17964b.f42784c || !(context instanceof Activity)) {
            C17964b.f42783b = false;
            C17964b.f42785d = false;
            z = false;
        } else if (context instanceof NormalSplashAdActivity) {
            return false;
        } else {
            AbstractC17934b a = C17957a.m33426a();
            if ((a != null && a.mo28622a((Activity) context)) || !m33526d(context)) {
                return false;
            }
            z = m33527e(context);
            C17964b.f42785d = z;
            f42877a = false;
        }
        C17964b.f42784c = false;
        return z;
    }

    /* renamed from: e */
    private static boolean m33527e(Context context) {
        AbstractC17934b a = C17957a.m33426a();
        if (a != null && a.mo28638h()) {
            TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, "Don't show the normal open screen Reason: the trace function is turned on", null, 0, 6, null);
            return false;
        } else if (context == null) {
            TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, "Don't show the normal open screen Reason: context == null", null, 0, 6, null);
            return false;
        } else if (C17964b.f42783b) {
            C17964b.f42783b = false;
            TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, "Don’t show the normal open screen Reason: Come in from the notification point, don’t show the ad", null, 0, 6, null);
            return false;
        } else {
            AbstractC29683u a2 = C17938a.m33344a(context);
            if (a2 == null) {
                TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, "Don’t show the normal open screen Reason: splashAdManager is empty", null, 0, 6, null);
                return false;
            }
            AbstractC29684v f = a2.mo51699f();
            C89219l.m154716b(f, "");
            NormalSplashAdActivity.C18004a aVar = new NormalSplashAdActivity.C18004a();
            f.mo51714a(aVar);
            C17975i.f42808h = null;
            C17975i.f42809i = false;
            return NormalSplashAdActivity.f42867a.mo28737a(context, f, f.mo51713a(context), aVar);
        }
    }

    /* renamed from: a */
    public final boolean mo28739a(Context context) {
        MethodCollector.m26663i(2823);
        C89219l.m154721d(context, "");
        if (f42879c) {
            boolean z = f42880d;
            MethodCollector.m26664o(2823);
            return z;
        }
        synchronized (this) {
            try {
                if (!f42879c) {
                    if (C17993j.m33510d()) {
                        C18027h.m33593a();
                        C18027h.m33594b();
                    }
                    C17959a.m33429a("get_splash_manager");
                    C17938a.m33344a(context);
                    C17959a.m33430b("get_splash_manager");
                    C17959a.m33429a("has_splash_ad");
                    f42880d = m33526d(context);
                    C17959a.m33430b("has_splash_ad");
                    f42879c = true;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(2823);
                throw th;
            }
        }
        boolean z2 = f42880d;
        MethodCollector.m26664o(2823);
        return z2;
    }

    /* renamed from: a */
    public final boolean mo28740a(Context context, int i) {
        C89219l.m154721d(context, "");
        if (i == 1) {
            return m33524c(context);
        }
        if (i == 2) {
            return m33522b(context);
        }
        return false;
    }
}

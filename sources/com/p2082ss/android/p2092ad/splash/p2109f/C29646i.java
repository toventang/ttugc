package com.p2082ss.android.p2092ad.splash.p2109f;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.C29627w;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Locale;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ad.splash.f.i */
public final class C29646i {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f70705a = {new C89232y(C89204ab.m154669a(C29646i.class), "isXm", "isXm()Z"), new C89232y(C89204ab.m154669a(C29646i.class), "isOplus", "isOplus()Z"), new C89232y(C89204ab.m154669a(C29646i.class), "isVi", "isVi()Z"), new C89232y(C89204ab.m154669a(C29646i.class), "isOp", "isOp()Z"), new C89232y(C89204ab.m154669a(C29646i.class), "isHave", "isHave()Z"), new C89232y(C89204ab.m154669a(C29646i.class), "isSsung", "isSsung()Z"), new C89232y(C89204ab.m154669a(C29646i.class), "isGoogle", "isGoogle()Z")};

    /* renamed from: b */
    static String f70706b;

    /* renamed from: c */
    public static final C29646i f70707c = new C29646i();

    /* renamed from: d */
    private static final AbstractC89244h f70708d = C89250i.m154773a((AbstractC89171a) C29653g.f70721a);

    /* renamed from: e */
    private static final AbstractC89244h f70709e = C89250i.m154773a((AbstractC89171a) C29650d.f70718a);

    /* renamed from: f */
    private static final AbstractC89244h f70710f = C89250i.m154773a((AbstractC89171a) C29652f.f70720a);

    /* renamed from: g */
    private static final AbstractC89244h f70711g = C89250i.m154773a((AbstractC89171a) C29649c.f70717a);

    /* renamed from: h */
    private static final AbstractC89244h f70712h = C89250i.m154773a((AbstractC89171a) C29648b.f70716a);

    /* renamed from: i */
    private static final AbstractC89244h f70713i = C89250i.m154773a((AbstractC89171a) C29651e.f70719a);

    /* renamed from: j */
    private static final AbstractC89244h f70714j = C89250i.m154773a((AbstractC89171a) C29647a.f70715a);

    private C29646i() {
    }

    /* renamed from: com.ss.android.ad.splash.f.i$a */
    static final class C29647a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C29647a f70715a = new C29647a();

        static {
            Covode.recordClassIndex(36043);
        }

        C29647a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C89361p.m154908a((CharSequence) C29646i.f70706b, (CharSequence) "google", false));
        }
    }

    /* renamed from: com.ss.android.ad.splash.f.i$d */
    static final class C29650d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C29650d f70718a = new C29650d();

        static {
            Covode.recordClassIndex(36046);
        }

        C29650d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C89361p.m154908a((CharSequence) C29646i.f70706b, (CharSequence) "oneplus", false));
        }
    }

    /* renamed from: com.ss.android.ad.splash.f.i$e */
    static final class C29651e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C29651e f70719a = new C29651e();

        static {
            Covode.recordClassIndex(36047);
        }

        C29651e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C89361p.m154908a((CharSequence) C29646i.f70706b, (CharSequence) "samsung", false));
        }
    }

    /* renamed from: com.ss.android.ad.splash.f.i$f */
    static final class C29652f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C29652f f70720a = new C29652f();

        static {
            Covode.recordClassIndex(36048);
        }

        C29652f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C89361p.m154908a((CharSequence) C29646i.f70706b, (CharSequence) "vivo", false));
        }
    }

    /* renamed from: com.ss.android.ad.splash.f.i$g */
    static final class C29653g extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C29653g f70721a = new C29653g();

        static {
            Covode.recordClassIndex(36049);
        }

        C29653g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C89361p.m154908a((CharSequence) C29646i.f70706b, (CharSequence) "xiaomi", false));
        }
    }

    /* renamed from: com.ss.android.ad.splash.f.i$b */
    static final class C29648b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C29648b f70716a = new C29648b();

        static {
            Covode.recordClassIndex(36044);
        }

        C29648b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (C89361p.m154908a((CharSequence) C29646i.f70706b, (CharSequence) "huawei", false) || C89361p.m154908a((CharSequence) C29646i.f70706b, (CharSequence) "honor", false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ad.splash.f.i$c */
    static final class C29649c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C29649c f70717a = new C29649c();

        static {
            Covode.recordClassIndex(36045);
        }

        C29649c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (C89361p.m154908a((CharSequence) C29646i.f70706b, (CharSequence) "oppo", false) || C89361p.m154908a((CharSequence) C29646i.f70706b, (CharSequence) "realme", false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(36042);
        String str = Build.BRAND;
        C89219l.m154709a((Object) str, "");
        Locale locale = Locale.getDefault();
        C89219l.m154709a((Object) locale, "");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            C89219l.m154709a((Object) lowerCase, "");
            f70706b = lowerCase;
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    public static int m59698a(Context context) {
        int identifier;
        C29627w a = C29495h.m59095a();
        C89219l.m154709a((Object) a, "");
        if (!a.f70670r) {
            return C29661o.m59775c(context);
        }
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (android.provider.Settings.Secure.getInt(r9.getContentResolver(), "buttons_show_on_screen_navkeys", 0) != 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (r1 != 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0100, code lost:
        if (((java.lang.Boolean) com.p2082ss.android.p2092ad.splash.p2109f.C29646i.f70714j.getValue()).booleanValue() != false) goto L_0x0053;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo51930b(android.content.Context r9) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.p2109f.C29646i.mo51930b(android.content.Context):int");
    }

    /* renamed from: a */
    static int m59699a(Context context, boolean z) {
        if (context == null) {
            return 0;
        }
        Object a = m59700a(context, "window");
        if (a != null) {
            Display defaultDisplay = ((WindowManager) a).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            int i = Build.VERSION.SDK_INT;
            defaultDisplay.getRealMetrics(displayMetrics);
            if (z) {
                int i2 = displayMetrics.heightPixels;
                if (i2 != 0) {
                    return i2;
                }
                Resources resources = context.getResources();
                C89219l.m154709a((Object) resources, "");
                DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
                if (displayMetrics2 != null) {
                    return displayMetrics2.heightPixels;
                }
                return 0;
            }
            int i3 = displayMetrics.widthPixels;
            if (i3 != 0) {
                return i3;
            }
            C29627w a2 = C29495h.m59095a();
            C89219l.m154709a((Object) a2, "");
            if (!a2.f70670r) {
                return C29661o.m59768a(context);
            }
            Resources resources2 = context.getResources();
            C89219l.m154709a((Object) resources2, "");
            DisplayMetrics displayMetrics3 = resources2.getDisplayMetrics();
            if (displayMetrics3 != null) {
                return displayMetrics3.widthPixels;
            }
            return 0;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    private static Object m59700a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9763);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(9763);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}

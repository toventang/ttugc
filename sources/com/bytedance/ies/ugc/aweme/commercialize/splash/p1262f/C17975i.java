package com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.p2082ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p078c.p080b.C1752a;
import p078c.p080b.C1756d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.f.i */
public final class C17975i {

    /* renamed from: a */
    public static boolean f42801a;

    /* renamed from: b */
    public static boolean f42802b = true;

    /* renamed from: c */
    public static boolean f42803c;

    /* renamed from: d */
    public static String f42804d;

    /* renamed from: e */
    public static Long f42805e;

    /* renamed from: f */
    public static boolean f42806f = true;

    /* renamed from: g */
    public static boolean f42807g;

    /* renamed from: h */
    public static String f42808h;

    /* renamed from: i */
    public static boolean f42809i;

    /* renamed from: j */
    public static boolean f42810j;

    /* renamed from: k */
    public static boolean f42811k;

    /* renamed from: l */
    public static boolean f42812l;

    /* renamed from: m */
    public static boolean f42813m;

    /* renamed from: n */
    public static final C17975i f42814n = new C17975i();

    private C17975i() {
    }

    /* renamed from: a */
    public static final void m33460a() {
        f42804d = null;
        f42805e = null;
    }

    /* renamed from: b */
    public static final String m33463b() {
        if (f42810j) {
            return m33467d();
        }
        return m33466c();
    }

    static {
        Covode.recordClassIndex(20593);
    }

    /* renamed from: e */
    public static final boolean m33468e() {
        if (!TextUtils.isEmpty(f42808h)) {
            return true;
        }
        TroubleshootingLogDelegate.awesomeSplashLog$default(TroubleshootingLogDelegate.INSTANCE, "no TopView id", null, 0, 6, null);
        return false;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.f.i$a */
    static final class RunnableC17976a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f42815a;

        static {
            Covode.recordClassIndex(20594);
        }

        RunnableC17976a(View view) {
            this.f42815a = view;
        }

        public final void run() {
            this.f42815a.setVisibility(0);
            this.f42815a.setAlpha(0.0f);
            ObjectAnimator.ofFloat(this.f42815a, "alpha", 0.0f, 1.0f).setDuration(430L).start();
        }
    }

    /* renamed from: c */
    public static final String m33466c() {
        Context context;
        IHostContextDepend iHostContextDepend = C16091a.f38743c;
        if (iHostContextDepend != null) {
            context = iHostContextDepend.getApplicationContext();
        } else {
            context = null;
        }
        if (context == null) {
            return null;
        }
        try {
            C1756d.m5892a(context);
            return C1756d.m5892a(context) + "/awemeSplashCache/";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static final String m33467d() {
        C1752a a = C1756d.m5890a("y+6T0e/qfIqkZDbYHfFiN/8XI5L6pbEB5d+bZ2FLxi1E6LD99U2nNfzcaGWObA==");
        C89219l.m154716b(a, "");
        a.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        C1752a a2 = C1756d.m5890a("y+6T0e/qfIqkZDbYHfFiN/8XI5L6pbEB5d+bZ2FLxi1E6LD99U2nNfzcaGWObA==");
        C89219l.m154716b(a2, "");
        return sb.append(a2.getAbsolutePath()).append(File.separator).toString();
    }

    /* renamed from: a */
    public static final void m33462a(Intent intent) {
        boolean b;
        if (intent == null) {
            b = false;
        } else {
            b = m33465b(intent);
        }
        f42803c = b;
    }

    /* renamed from: a */
    public static final String m33458a(String str) {
        String a = m33459a(str, m33467d());
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return m33459a(str, m33466c());
    }

    /* renamed from: b */
    private static boolean m33465b(Intent intent) {
        if (intent == null || !TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final JSONObject m33464b(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_show_fail_type", str);
            if (!TextUtils.isEmpty(null)) {
                jSONObject2.put("ad_show_fail_type2_reason", (Object) null);
            }
            if (f42802b) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            jSONObject2.put("awemelaunch", str2);
            jSONObject.put("ad_extra_data", jSONObject2.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static String m33459a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String a = C89219l.m154704a(str2, (Object) str);
            if (new File(a).exists()) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m33461a(int i, View... viewArr) {
        C89219l.m154721d(viewArr, "");
        int i2 = 0;
        if (viewArr.length != 0) {
            if (i == 1 || i == 2) {
                int length = viewArr.length;
                while (i2 < length) {
                    View view = viewArr[i2];
                    if (!(view == null || view.getVisibility() == 8)) {
                        view.setVisibility(4);
                    }
                    i2++;
                }
            } else if (i == 3) {
                int length2 = viewArr.length;
                while (i2 < length2) {
                    View view2 = viewArr[i2];
                    if (!(view2 == null || view2.getVisibility() == 8)) {
                        view2.postDelayed(new RunnableC17976a(view2), 260);
                    }
                    i2++;
                }
            } else if (i == 4) {
                for (View view3 : viewArr) {
                    if (!(view3 == null || view3.getVisibility() == 8)) {
                        view3.setVisibility(0);
                        view3.setAlpha(1.0f);
                    }
                }
            }
        }
    }
}

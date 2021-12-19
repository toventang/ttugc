package com.p2082ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1216w;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.newmedia.redbadge.C30188d;
import com.p2082ss.android.newmedia.redbadge.C30189e;
import com.p2082ss.android.newmedia.redbadge.p2170b.C30179a;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.lancet.I18nLancet;
import com.p2082ss.android.ugc.awemepushlib.interaction.C81850aa;
import com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager */
public class AwemeRedBadgerManager implements AbstractC1192f {

    /* renamed from: b */
    public static AwemeRedBadgerManager f183060b = new AwemeRedBadgerManager();

    /* renamed from: a */
    C30189e f183061a = C30189e.m61060a();

    /* renamed from: c */
    private boolean f183062c = "oppo".equalsIgnoreCase(Build.BRAND);

    /* renamed from: d */
    private boolean f183063d;

    /* renamed from: e */
    private boolean f183064e;

    static {
        Covode.recordClassIndex(95307);
    }

    /* renamed from: b */
    private static String m141800b() {
        if (!TextUtils.isEmpty(I18nLancet.f132194a)) {
            return I18nLancet.f132194a;
        }
        String a = C30062a.m60800a();
        I18nLancet.f132194a = a;
        return a;
    }

    public AwemeRedBadgerManager() {
        boolean z;
        boolean equalsIgnoreCase = "vivo".equalsIgnoreCase(Build.BRAND);
        this.f183063d = equalsIgnoreCase;
        if (this.f183062c || equalsIgnoreCase) {
            z = true;
        } else {
            z = false;
        }
        this.f183064e = z;
    }

    /* renamed from: a */
    public final void mo125541a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C1216w.f4006i.getLifecycle().mo4012a(this);
        } else {
            new Handler(Looper.getMainLooper()).post(new RunnableC81903d(this));
        }
    }

    /* renamed from: b */
    public final void mo125543b(Context context) {
        if (C81850aa.f183008a == 0 || C81850aa.f183008a == 2) {
            this.f183061a.mo53608a(context, 0);
        }
    }

    /* renamed from: a */
    public static void m141795a(Context context) {
        try {
            if (!C13627m.m24498a(AppLog.getClientId()) && !C13627m.m24498a(C18205a.m33878a())) {
                C30179a.m61024a(context).mo53591c(AppLog.getSessionKey());
                C30179a.m61024a(context).mo53593d(m141800b());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static String m141801c(Context context) {
        ResolveInfo resolveInfo;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null || resolveInfo.activityInfo == null) {
            return "";
        }
        return resolveInfo.activityInfo.packageName;
    }

    /* renamed from: a */
    private void m141796a(Context context, int i) {
        this.f183061a.mo53609b(context, i);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            C29339a.m58752a(new Runnable() {
                /* class com.p2082ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager.RunnableC818931 */

                static {
                    Covode.recordClassIndex(95308);
                }

                public final void run() {
                    AwemeRedBadgerManager.this.mo125543b(C51427a.f118503a);
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m141799a(JSONObject jSONObject, Context context) {
        boolean z;
        boolean z2;
        boolean a = C30179a.m61024a(context).mo53585a();
        String b = C30179a.m61024a(context).mo53586b();
        boolean z3 = true;
        if (jSONObject.optInt("is_desktop_red_badge_show", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (AccountService.m65215a().mo57069e().isChildrenMode()) {
                z = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z != a) {
            C30179a.m61024a(context).mo53584a(z);
            z2 = true;
        } else {
            z2 = false;
        }
        String optString = jSONObject.optString("desktop_red_badge_args", "");
        if (optString == null || optString.equals(b)) {
            z3 = z2;
        } else {
            C30179a.m61024a(context).f71954a.mo53660a().mo53656a("desktop_red_badge_args", optString).mo53657a();
        }
        if (!C30179a.m61024a(context).mo53585a() && C81850aa.f183008a == 0) {
            C30189e.m61060a().mo53608a(context, 0);
        }
        return z3;
    }

    /* renamed from: a */
    public final boolean mo125542a(Context context, C81823b bVar) {
        boolean z;
        try {
            String str = "";
            boolean z2 = true;
            if (1 != bVar.extra.redBadgeOnly || bVar.extra.badgeCount < 0) {
                if (bVar.extra.badgeCount >= 0) {
                    try {
                        m141796a(context, bVar.extra.badgeCount);
                    } catch (C30188d e) {
                        e.printStackTrace();
                        str = Log.getStackTraceString(e);
                        z2 = false;
                    }
                    m141798a(context, z2, str, bVar);
                    m141797a(context, bVar.extra.badgeCount, z2, str, bVar);
                }
                return false;
            }
            try {
                m141796a(context, bVar.extra.badgeCount);
                z = true;
            } catch (C30188d e2) {
                e2.printStackTrace();
                str = Log.getStackTraceString(e2);
                z = false;
            }
            m141798a(context, z, str, bVar);
            m141797a(context, bVar.extra.badgeCount, z, str, bVar);
            return true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m141798a(Context context, boolean z, String str, C81823b bVar) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putInt("success", z ? 1 : 0);
        String str3 = "";
        if (!z) {
            if (str == null) {
                str = str3;
            }
            bundle.putString("stack_info", str);
        }
        String c = m141801c(context);
        if (c != null) {
            str3 = c;
        }
        bundle.putString("launcher_package", str3);
        bundle.putLong("rule_id", bVar.f182958id);
        if (1 == bVar.extra.redBadgeOnly) {
            str2 = "receive";
        } else {
            str2 = "with_artical";
        }
        bundle.putString("show_type", str2);
        C39162r.m79453a("red_badge_receive", bundle);
    }

    /* renamed from: a */
    private static void m141797a(Context context, int i, boolean z, String str, C81823b bVar) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putInt("badge_number", i);
        bundle.putInt("success", z ? 1 : 0);
        String str3 = "";
        if (!z) {
            if (str == null) {
                str = str3;
            }
            bundle.putString("stack_info", str);
        }
        String c = m141801c(context);
        if (c != null) {
            str3 = c;
        }
        bundle.putString("launcher_package", str3);
        if (1 == bVar.extra.redBadgeOnly) {
            str2 = "receive";
        } else {
            str2 = "with_artical";
        }
        bundle.putString("show_type", str2);
        bundle.putLong("rule_id", bVar.f182958id);
        C39162r.m79453a("red_badge_show", bundle);
    }
}

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.p025c.C0497g;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.C25504g;
import com.google.android.gms.common.p1938c.C25499b;
import com.google.android.gms.common.p1938c.C25500c;
import com.google.android.gms.common.util.C25606h;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C25542e {

    /* renamed from: a */
    private static final C0497g<String, String> f60606a = new C0497g<>();

    static {
        Covode.recordClassIndex(30945);
    }

    /* renamed from: a */
    public static String m49277a(Context context) {
        String packageName = context.getPackageName();
        try {
            C25499b a = C25500c.f60481a.mo41741a(context);
            return a.f60480a.getPackageManager().getApplicationLabel(C25499b.m49169a(a.f60480a.getPackageManager(), packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    /* renamed from: a */
    public static String m49278a(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.anl);
        }
        if (i == 2) {
            return resources.getString(R.string.ans);
        }
        if (i == 3) {
            return resources.getString(R.string.ani);
        }
        if (i == 5) {
            return m49279a(context, "common_google_play_services_invalid_account_title");
        }
        if (i == 7) {
            return m49279a(context, "common_google_play_services_network_error_title");
        }
        if (i == 17) {
            return m49279a(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i != 20) {
            return null;
        }
        return m49279a(context, "common_google_play_services_restricted_profile_title");
    }

    /* renamed from: a */
    public static String m49279a(Context context, String str) {
        MethodCollector.m26663i(9721);
        C0497g<String, String> gVar = f60606a;
        synchronized (gVar) {
            try {
                String str2 = gVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources c = C25504g.m49187c(context);
                if (c == null) {
                    MethodCollector.m26664o(9721);
                    return null;
                }
                int identifier = c.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        "Missing resource: ".concat(valueOf);
                    } else {
                        new String("Missing resource: ");
                    }
                    MethodCollector.m26664o(9721);
                    return null;
                }
                String string = c.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    String valueOf2 = String.valueOf(str);
                    if (valueOf2.length() != 0) {
                        "Got empty resource: ".concat(valueOf2);
                    } else {
                        new String("Got empty resource: ");
                    }
                    MethodCollector.m26664o(9721);
                    return null;
                }
                gVar.put(str, string);
                MethodCollector.m26664o(9721);
                return string;
            } finally {
                MethodCollector.m26664o(9721);
            }
        }
    }

    /* renamed from: b */
    public static String m49281b(Context context, int i) {
        Resources resources = context.getResources();
        String a = m49277a(context);
        if (i == 1) {
            return resources.getString(R.string.ank, a);
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.anh, a);
            } else if (i == 5) {
                return m49280a(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m49280a(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(R.string.anp, a);
                } else if (i == 20) {
                    return m49280a(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m49280a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m49280a(context, "common_google_play_services_sign_in_failed_text", a);
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            return resources.getString(R.string.ant, a);
                        default:
                            return resources.getString(R.string.ano, a);
                    }
                }
            }
        } else if (C25606h.m49415b(context)) {
            return resources.getString(R.string.anu);
        } else {
            return resources.getString(R.string.anr, a);
        }
    }

    /* renamed from: a */
    public static String m49280a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m49279a(context, str);
        if (a == null) {
            a = resources.getString(R.string.ano);
        }
        return C1764a.m5929a(resources.getConfiguration().locale, a, new Object[]{str2});
    }
}

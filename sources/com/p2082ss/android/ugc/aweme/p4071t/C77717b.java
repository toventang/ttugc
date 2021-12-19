package com.p2082ss.android.ugc.aweme.p4071t;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73948ai;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.t.b */
public class C77717b {

    /* renamed from: a */
    private static ExecutorService f174297a;

    /* renamed from: com.ss.android.ugc.aweme.t.b$a */
    public interface AbstractC77720a {
        static {
            Covode.recordClassIndex(90770);
        }

        /* renamed from: a */
        void mo100642a();

        /* renamed from: a */
        void mo100643a(ArrayList<String> arrayList);

        /* renamed from: b */
        void mo100644b(ArrayList<String> arrayList);
    }

    static {
        Covode.recordClassIndex(90767);
    }

    /* renamed from: a */
    public static boolean m135749a() {
        if (!LiveOuterService.m107269s().mo95829c().mo96132a() || !C31575b.m65865g().isLogin() || C73948ai.m130039a().contains("x86")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Bundle m135745a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m135746a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m135748a(final String str, final String str2) {
        MethodCollector.m26663i(5766);
        if (f174297a == null) {
            synchronized (C77717b.class) {
                try {
                    if (f174297a == null) {
                        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
                        a.f95504b = "AppsFlyer";
                        f174297a = C40780g.m82242a(a.mo70028a());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5766);
                    throw th;
                }
            }
        }
        C1731i.m5640b(new Callable<Object>() {
            /* class com.p2082ss.android.ugc.aweme.p4071t.C77717b.CallableC777181 */

            static {
                Covode.recordClassIndex(90768);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                UgCommonServiceImpl.m138290j().mo123092a().mo123113a(str, str2);
                return null;
            }
        }, f174297a);
        MethodCollector.m26664o(5766);
    }

    /* renamed from: a */
    public static void m135747a(Activity activity, String str) {
        if (activity != null) {
            str.hashCode();
            switch (str.hashCode()) {
                case -1672998758:
                    if (!str.equals("UNLOGIN_PROFILE")) {
                        return;
                    }
                    break;
                case -1382453013:
                    if (!str.equals("NOTIFICATION")) {
                        return;
                    }
                    break;
                case 2223327:
                    if (str.equals("HOME")) {
                        C34729o.m70953a(activity);
                        if (Build.VERSION.SDK_INT >= 23) {
                            activity.getWindow().getDecorView().setSystemUiVisibility(1024);
                            return;
                        }
                        return;
                    }
                    return;
                case 2614219:
                    if (!str.equals("USER")) {
                        return;
                    }
                    break;
                case 53655674:
                    if (!str.equals("UNLOGIN_NOTIFICATION")) {
                        return;
                    }
                    break;
                case 1055811561:
                    if (!str.equals("DISCOVER")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            C34729o.m70953a(activity);
            C34729o.m70958b(activity);
        }
    }
}

package com.p2082ss.android.ugc.tools.utils;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.net.UnknownHostException;

/* renamed from: com.ss.android.ugc.tools.utils.q */
public final class C84911q {
    static {
        Covode.recordClassIndex(98905);
    }

    /* renamed from: a */
    public static void m145921a(String str) {
        C63244g.m114602a().mo73263I().mo101626a(3, "Tools-Client", str);
    }

    /* renamed from: b */
    public static void m145926b(String str) {
        C63244g.m114602a().mo73263I().mo101626a(6, "Tools-Client", str);
    }

    /* renamed from: c */
    public static void m145927c(String str) {
        C63244g.m114602a().mo73263I().mo101626a(5, "Tools-Client", str);
    }

    /* renamed from: d */
    public static void m145928d(String str) {
        C63244g.m114602a().mo73263I().mo101626a(4, "Tools-Client", str);
    }

    /* renamed from: b */
    public static String m145925b(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        return Log.getStackTraceString(th);
    }

    /* renamed from: a */
    public static void m145924a(Throwable th) {
        C63244g.m114602a().mo73263I().mo101626a(6, "Tools-Client", m145925b(th));
    }

    /* renamed from: a */
    public static void m145922a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "Tools-Client";
        }
        C63244g.m114602a().mo73263I().mo101626a(3, str, str2);
    }

    /* renamed from: a */
    public static void m145923a(String str, Throwable th) {
        if (TextUtils.isEmpty(str)) {
            m145924a(th);
        } else {
            C63244g.m114602a().mo73263I().mo101626a(6, str, m145925b(th));
        }
    }
}

package com.p2082ss.android.ugc.aweme.p3452ml.p3453a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14657f;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ttnet.TTNetInit;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ml.a.e */
public final class C59981e {

    /* renamed from: a */
    public static String f136579a;

    /* renamed from: b */
    public static int f136580b = -1;

    /* renamed from: c */
    public static long f136581c;

    /* renamed from: d */
    public static int f136582d = -1;

    /* renamed from: e */
    public static long f136583e;

    /* renamed from: f */
    public static int f136584f;

    /* renamed from: g */
    public static long f136585g = 0;

    /* renamed from: h */
    public static boolean f136586h;

    /* renamed from: i */
    public static long f136587i = 0;

    /* renamed from: j */
    public static int f136588j;

    /* renamed from: k */
    public static long f136589k = 0;

    /* renamed from: l */
    private static String f136590l = "";

    /* renamed from: m */
    private static long f136591m;

    /* renamed from: n */
    private static C14657f f136592n;

    /* renamed from: o */
    private static C14657f f136593o;

    /* renamed from: p */
    private static long f136594p = 0;

    static {
        Covode.recordClassIndex(70401);
        C14657f fVar = new C14657f();
        f136592n = fVar;
        f136593o = fVar;
        fVar.f35576c = 0;
        f136592n.f35575b = 0;
        f136592n.f35574a = 0;
    }

    /* renamed from: a */
    public static int m109500a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("duration")) {
            return 0;
        }
        try {
            return jSONObject.optInt("duration");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static C14657f m109502b(long j) {
        if (j - f136594p > 30000) {
            try {
                C14657f networkQuality = TTNetInit.getNetworkQuality();
                if (networkQuality != null) {
                    f136593o = networkQuality;
                }
            } catch (Exception unused) {
            }
            f136594p = j;
        }
        return f136593o;
    }

    /* renamed from: a */
    public static String m109501a(long j) {
        if (j - f136591m > 30000) {
            Context a = C17867d.m33078a();
            if (TextUtils.isEmpty(C58029j.f132249a) || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132249a = C13624l.m24481a(C13624l.m24479a(a));
            }
            f136590l = C58029j.f132249a;
            f136591m = j;
        }
        return f136590l;
    }
}

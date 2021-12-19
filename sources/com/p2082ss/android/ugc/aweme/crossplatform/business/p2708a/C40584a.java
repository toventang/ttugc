package com.p2082ss.android.ugc.aweme.crossplatform.business.p2708a;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.a.a */
public final class C40584a {

    /* renamed from: a */
    public long f94974a;

    /* renamed from: b */
    public int f94975b = -1;

    /* renamed from: c */
    public long f94976c;

    /* renamed from: d */
    public boolean f94977d;

    /* renamed from: e */
    public boolean f94978e;

    /* renamed from: f */
    public String f94979f;

    /* renamed from: g */
    public String f94980g;

    /* renamed from: h */
    public boolean f94981h = true;

    /* renamed from: i */
    public boolean f94982i;

    /* renamed from: j */
    public int f94983j;

    /* renamed from: k */
    public String f94984k;

    /* renamed from: l */
    public long f94985l = -1;

    /* renamed from: m */
    public boolean f94986m;

    /* renamed from: n */
    private boolean f94987n;

    /* renamed from: o */
    private boolean f94988o;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.a.a$a */
    public static class C40585a {

        /* renamed from: a */
        public static String f94989a;

        /* renamed from: b */
        public static String f94990b;

        /* renamed from: c */
        public static boolean f94991c;

        /* renamed from: d */
        public static String f94992d;

        /* renamed from: e */
        public static String f94993e;

        static {
            Covode.recordClassIndex(48424);
        }
    }

    static {
        Covode.recordClassIndex(48423);
    }

    /* renamed from: b */
    public static void m81932b() {
        C40585a.f94989a = null;
        C40585a.f94990b = null;
        C40585a.f94991c = false;
        C40585a.f94992d = null;
        C40585a.f94993e = null;
    }

    /* renamed from: a */
    public final void mo69741a() {
        this.f94988o = false;
        this.f94981h = true;
        this.f94978e = false;
        this.f94987n = false;
        this.f94980g = null;
        this.f94976c = 0;
        if (this.f94982i) {
            this.f94974a = 0;
        }
        this.f94986m = false;
    }

    /* renamed from: a */
    public static C13624l.EnumC13625a m81929a(Context context) {
        if (C58029j.f132251c != C13624l.EnumC13625a.UNKNOWN && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132251c;
        }
        C13624l.EnumC13625a d = C13624l.m24488d(context);
        C58029j.f132251c = d;
        return d;
    }

    /* renamed from: a */
    public static void m81930a(String str, String str2) {
        C40585a.f94989a = str;
        C40585a.f94990b = str2;
        C40585a.f94991c = false;
    }

    /* renamed from: a */
    public static void m81931a(String str, String str2, String str3) {
        C40585a.f94989a = str;
        C40585a.f94992d = str2;
        C40585a.f94993e = str3;
        C40585a.f94991c = true;
    }

    /* renamed from: a */
    public final void mo69744a(WebView webView, String str, long j, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f94987n = true;
        mo69742a(webView.getContext(), str, j, str2, jSONObject, jSONObject2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d8 A[Catch:{ Exception -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f7 A[Catch:{ Exception -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0100 A[Catch:{ Exception -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0101 A[Catch:{ Exception -> 0x0178 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69742a(android.content.Context r19, java.lang.String r20, long r21, java.lang.String r23, org.json.JSONObject r24, org.json.JSONObject r25) {
        /*
        // Method dump skipped, instructions count: 387
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.business.p2708a.C40584a.mo69742a(android.content.Context, java.lang.String, long, java.lang.String, org.json.JSONObject, org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final void mo69743a(Context context, String str, long j, String str2, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        JSONObject jSONObject3;
        long j2;
        String str3 = str;
        JSONObject jSONObject4 = jSONObject2;
        try {
            C13624l.EnumC13625a a = m81929a(context);
            if (a != C13624l.EnumC13625a.NONE) {
                if (jSONObject == null) {
                    jSONObject3 = new JSONObject();
                } else {
                    jSONObject3 = jSONObject;
                }
                jSONObject3.put("ac", C13624l.m24481a(a));
                long j3 = this.f94976c;
                if (j3 > 0) {
                    j2 = this.f94974a;
                } else {
                    j3 = System.currentTimeMillis();
                    j2 = this.f94974a;
                }
                long j4 = j3 - j2;
                if (a == C13624l.EnumC13625a.WIFI) {
                    if (j4 < 1) {
                        return;
                    }
                } else if (j4 < 1) {
                    return;
                }
                if (j4 > 0) {
                    jSONObject3.put("duration", Math.min(j4, 90000L));
                    if (str3 == null) {
                        str3 = this.f94979f;
                        if (str3 == null && (str3 = this.f94984k) == null) {
                            return;
                        }
                    }
                    jSONObject3.put("is_ad_event", "1");
                    jSONObject3.put("tag", "draw_ad");
                    if (jSONObject4 == null) {
                        jSONObject4 = new JSONObject();
                    }
                    jSONObject4.put("next_url", str3);
                    int i2 = 1;
                    if (this.f94982i && this.f94983j != 1) {
                        i2 = 0;
                    }
                    jSONObject4.put("first_page", i2);
                    jSONObject4.put("render_type", "h5");
                    jSONObject4.put("pct", i);
                    int i3 = this.f94975b;
                    if (i3 != -1) {
                        jSONObject4.put("preload_status", i3);
                    }
                    jSONObject3.put("ad_extra_data", jSONObject4.toString());
                    ITalentAdRevenueShareService e = TalentAdRevenueShareServiceImpl.m77931e();
                    if (e != null) {
                        e.mo67028a(str2, jSONObject);
                    }
                    C18129a.C18130a a2 = C18129a.m33747a("ad_wap_stat", "progress_load_finish", String.valueOf(j), "", "0");
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a2.mo28900b(next, jSONObject3.opt(next));
                    }
                    a2.mo28901b();
                }
            }
        } catch (Exception unused) {
        }
    }
}

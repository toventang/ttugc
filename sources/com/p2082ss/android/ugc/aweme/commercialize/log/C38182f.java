package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.f */
public class C38182f {

    /* renamed from: a */
    private static C38184b f90209a;

    static {
        Covode.recordClassIndex(45661);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.f$a */
    public static class C38183a {

        /* renamed from: a */
        public JSONObject f90210a;

        static {
            Covode.recordClassIndex(45662);
        }

        private C38183a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final JSONObject mo66482a() {
            if (this.f90210a == null) {
                this.f90210a = new JSONObject();
            }
            return this.f90210a;
        }

        /* synthetic */ C38183a(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo66483a(String str, long j) {
            try {
                mo66482a().put(str, j);
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final void mo66484a(String str, Object obj) {
            try {
                mo66482a().put(str, obj);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.f$b */
    public static class C38184b {

        /* renamed from: a */
        public String f90211a;

        /* renamed from: b */
        public String f90212b;

        /* renamed from: c */
        public String f90213c;

        /* renamed from: d */
        public String f90214d;

        /* renamed from: e */
        public final C38183a f90215e = new C38183a((byte) 0);

        /* renamed from: f */
        public String f90216f;

        static {
            Covode.recordClassIndex(45663);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo66494a() {
            this.f90211a = null;
            this.f90212b = null;
            this.f90213c = null;
            this.f90214d = null;
            this.f90215e.f90210a = null;
        }

        /* renamed from: a */
        public final void mo66495a(Context context) {
            Context context2 = context;
            if (context2 == null) {
                context2 = C17867d.m33078a();
            }
            m77424b(context2);
            AbstractC37880bd a = C38000g.m77050a();
            String str = this.f90211a;
            String str2 = this.f90212b;
            JSONObject jSONObject = this.f90215e.f90210a;
            String str3 = this.f90213c;
            a.mo65883a(context2, str, str2, jSONObject, (str3 == null || !str3.matches("[+-]?\\d+")) ? "0" : this.f90213c, m77425c());
            C38182f.m77420a(this);
        }

        /* renamed from: c */
        private long m77425c() {
            try {
                String str = this.f90214d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return 0;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return 0;
            }
        }

        /* renamed from: b */
        public final void mo66502b() {
            m77424b(C17867d.m33078a());
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("category", "event_v3");
                if (!TextUtils.isEmpty(this.f90211a)) {
                    hashMap.put("tag", this.f90211a);
                }
                if (!TextUtils.isEmpty(this.f90212b)) {
                    hashMap.put("label", this.f90212b);
                }
                if (!TextUtils.isEmpty(this.f90213c)) {
                    hashMap.put("value", this.f90213c);
                }
                if (!TextUtils.isEmpty(this.f90214d)) {
                    hashMap.put("ext_value", this.f90214d);
                }
                JSONObject a = this.f90215e.mo66482a();
                ITalentAdRevenueShareService e = TalentAdRevenueShareServiceImpl.m77931e();
                if (e != null && !TextUtils.isEmpty(this.f90213c)) {
                    e.mo67028a(this.f90213c, a);
                }
                Iterator<String> keys = a.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals("has_v3", next)) {
                        try {
                            Object opt = a.opt(next);
                            if (opt instanceof String) {
                                hashMap.put(next, (String) opt);
                            } else {
                                hashMap.put(next, new C27910f().mo46674b(opt));
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.f90216f)) {
                    C39162r.m79460a(this.f90216f, hashMap);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            C38182f.m77420a(this);
        }

        /* renamed from: a */
        public final C38184b mo66485a(long j) {
            this.f90215e.mo66483a("duration", j);
            return this;
        }

        /* renamed from: c */
        public final C38184b mo66503c(Long l) {
            this.f90215e.mo66484a("ad_id", l);
            return this;
        }

        /* renamed from: d */
        public final C38184b mo66505d(String str) {
            this.f90215e.mo66484a("track_label", str);
            return this;
        }

        /* renamed from: e */
        public final C38184b mo66506e(String str) {
            this.f90215e.mo66484a("log_extra", str);
            return this;
        }

        /* renamed from: a */
        public final C38184b mo66490a(Long l) {
            String l2;
            if (l == null) {
                l2 = null;
            } else {
                l2 = l.toString();
            }
            this.f90213c = l2;
            return this;
        }

        /* renamed from: b */
        public final C38184b mo66496b(C38214ac acVar) {
            if (acVar != null) {
                this.f90213c = acVar.creativeId;
                mo66506e(acVar.logExtra);
            }
            return this;
        }

        /* renamed from: b */
        private void m77424b(Context context) {
            this.f90215e.mo66484a("is_ad_event", "1");
            String c = m77426c(context);
            if (!C13627m.m24498a(c)) {
                this.f90215e.mo66484a("nt", c);
            }
        }

        /* renamed from: a */
        public final C38184b mo66489a(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                mo66490a(awemeRawAd.getCreativeId());
                mo66506e(awemeRawAd.getLogExtra());
                this.f90215e.mo66484a("ad_id", awemeRawAd.getAdId());
            }
            return this;
        }

        /* renamed from: c */
        public final C38184b mo66504c(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f90215e.mo66484a("refer", str);
            }
            return this;
        }

        /* renamed from: c */
        private static String m77426c(Context context) {
            if (!TextUtils.isEmpty(C58029j.f132249a) && C58029j.m104846b() && !C58029j.m104847c()) {
                return C58029j.f132249a;
            }
            String a = C13624l.m24481a(C13624l.m24479a(context));
            C58029j.f132249a = a;
            return a;
        }

        /* renamed from: a */
        public final C38184b mo66486a(C38214ac acVar) {
            String str;
            if (acVar != null) {
                String str2 = "";
                if (acVar.creativeId == null) {
                    str = str2;
                } else {
                    str = acVar.creativeId;
                }
                this.f90213c = str;
                if (acVar.logExtra != null) {
                    str2 = acVar.logExtra;
                }
                mo66506e(str2);
                this.f90215e.mo66483a("ad_id", -1);
            }
            return this;
        }

        /* renamed from: b */
        public final C38184b mo66497b(Aweme aweme) {
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                mo66498b(aweme.getAwemeRawAd());
            }
            return this;
        }

        /* renamed from: a */
        public final C38184b mo66487a(Banner banner) {
            String logExtra;
            if (banner != null) {
                mo66490a(Long.valueOf(banner.getCreativeId()));
                if (banner.getLogExtra() == null) {
                    logExtra = "";
                } else {
                    logExtra = banner.getLogExtra();
                }
                mo66506e(logExtra);
                this.f90215e.mo66483a("ad_id", -1);
            }
            return this;
        }

        /* renamed from: b */
        public final C38184b mo66498b(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                mo66490a(awemeRawAd.getCreativeId());
                mo66499b(awemeRawAd.getGroupId());
                mo66506e(awemeRawAd.getLogExtra());
            }
            return this;
        }

        /* renamed from: a */
        public final C38184b mo66488a(Aweme aweme) {
            if (aweme == null) {
                throw new NullPointerException("getAwemeRawAd");
            }
            mo66490a(aweme.getAwemeRawAd().getCreativeId());
            mo66506e(aweme.getAwemeRawAd().getLogExtra());
            this.f90215e.mo66484a("ad_id", aweme.getAwemeRawAd().getAdId());
            return this;
        }

        /* renamed from: b */
        public final C38184b mo66499b(Long l) {
            String l2;
            if (l == null) {
                l2 = null;
            } else {
                l2 = l.toString();
            }
            this.f90214d = l2;
            return this;
        }

        /* renamed from: a */
        public final C38184b mo66491a(Object obj) {
            this.f90215e.mo66484a("ad_extra_data", new C27910f().mo46674b(obj));
            return this;
        }

        /* renamed from: b */
        public final C38184b mo66500b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f90215e.mo66484a("tag_id", str);
            }
            return this;
        }

        /* renamed from: a */
        public final C38184b mo66492a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f90215e.mo66484a("prop_id", str);
            }
            return this;
        }

        /* renamed from: b */
        public final C38184b mo66501b(JSONObject jSONObject) {
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f90215e.mo66484a(next, jSONObject.opt(next));
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C38184b mo66493a(JSONObject jSONObject) {
            this.f90215e.mo66484a("ad_extra_data", jSONObject);
            return this;
        }
    }

    /* renamed from: a */
    public static C38184b m77418a() {
        C38184b bVar;
        MethodCollector.m26663i(7008);
        synchronized (C38182f.class) {
            try {
                bVar = f90209a;
                if (bVar != null) {
                    f90209a = null;
                } else {
                    bVar = null;
                }
            } finally {
                MethodCollector.m26664o(7008);
            }
        }
        if (bVar == null) {
            bVar = new C38184b();
        } else {
            bVar.mo66494a();
        }
        return bVar;
    }

    /* renamed from: a */
    static void m77420a(C38184b bVar) {
        MethodCollector.m26663i(7168);
        synchronized (C38182f.class) {
            try {
                if (f90209a == null) {
                    f90209a = bVar;
                    bVar.mo66494a();
                }
            } finally {
                MethodCollector.m26664o(7168);
            }
        }
    }

    /* renamed from: a */
    public static C38184b m77419a(String str, String str2, long j) {
        C38184b a = m77418a();
        a.f90215e.mo66484a("ad_event_priority", "10");
        a.f90215e.mo66484a("ad_event_type", "monitor");
        a.f90215e.mo66484a("track_url_list", str);
        a.f90215e.mo66484a("track_status", str2);
        a.f90215e.mo66483a("ts", j);
        String a2 = RawURLGetter.m77316a("other");
        if (!TextUtils.isEmpty(a2)) {
            a.f90215e.mo66484a("user_agent", a2);
        }
        return a;
    }
}

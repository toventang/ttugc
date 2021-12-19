package com.p2082ss.android.ugc.aweme.commercialize.log.p2599a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a.C18133a;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.track.C38525a;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.a.a */
public class C38151a {

    /* renamed from: a */
    private static C38153b f90120a;

    static {
        Covode.recordClassIndex(45630);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.a.a$a */
    public static class C38152a {

        /* renamed from: a */
        public JSONObject f90121a;

        static {
            Covode.recordClassIndex(45631);
        }

        private C38152a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final JSONObject mo66442a() {
            if (this.f90121a == null) {
                this.f90121a = new JSONObject();
            }
            return this.f90121a;
        }

        /* synthetic */ C38152a(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo66443a(String str, long j) {
            try {
                mo66442a().put(str, j);
            } catch (JSONException unused) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo66444a(String str, Object obj) {
            try {
                mo66442a().put(str, obj);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.a.a$b */
    public static class C38153b {

        /* renamed from: a */
        public String f90122a;

        /* renamed from: b */
        public String f90123b;

        /* renamed from: c */
        public String f90124c;

        /* renamed from: d */
        public String f90125d;

        /* renamed from: e */
        public final C38152a f90126e = new C38152a((byte) 0);

        /* renamed from: f */
        public String f90127f;

        static {
            Covode.recordClassIndex(45632);
        }

        /* renamed from: e */
        private long m77339e() {
            try {
                String str = this.f90125d;
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
        public final C38153b mo66450b() {
            this.f90126e.mo66444a("ad_event_type", "debug");
            return this;
        }

        /* renamed from: f */
        private void m77340f() {
            this.f90126e.mo66444a("is_ad_event", "1");
            String a = m77338a(C17867d.m33078a());
            if (!C13627m.m24498a(a)) {
                this.f90126e.mo66444a("nt", a);
            }
        }

        /* renamed from: c */
        public final void mo66455c() {
            String str;
            m77340f();
            String str2 = this.f90122a;
            String str3 = this.f90123b;
            JSONObject jSONObject = this.f90126e.f90121a;
            String str4 = this.f90124c;
            if (str4 == null || !str4.matches("[+-]?\\d+")) {
                str = "0";
            } else {
                str = this.f90124c;
            }
            C38187i.m77455a(str2, str3, jSONObject, str, m77339e());
            C38151a.m77334a(this);
        }

        /* renamed from: d */
        public final void mo66456d() {
            C17867d.m33078a();
            m77340f();
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("category", "event_v3");
                if (!TextUtils.isEmpty(this.f90122a)) {
                    hashMap.put("tag", this.f90122a);
                }
                if (!TextUtils.isEmpty(this.f90123b)) {
                    hashMap.put("label", this.f90123b);
                }
                if (!TextUtils.isEmpty(this.f90124c)) {
                    hashMap.put("value", this.f90124c);
                }
                if (!TextUtils.isEmpty(this.f90125d)) {
                    hashMap.put("ext_value", this.f90125d);
                }
                JSONObject a = this.f90126e.mo66442a();
                C18133a.f43191a.mo28906a(this.f90122a, this.f90123b, this.f90124c, a);
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
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.f90127f) && C16091a.f38741a != null) {
                    C16091a.f38741a.onEventV3Map(this.f90127f, hashMap);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            C38151a.m77334a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo66449a() {
            this.f90122a = null;
            this.f90123b = null;
            this.f90124c = null;
            this.f90125d = null;
            this.f90126e.f90121a = null;
        }

        /* renamed from: b */
        public final C38153b mo66453b(String str) {
            this.f90126e.mo66444a("track_label", str);
            return this;
        }

        /* renamed from: c */
        public final C38153b mo66454c(String str) {
            this.f90126e.mo66444a("log_extra", str);
            return this;
        }

        /* renamed from: a */
        public final C38153b mo66446a(Long l) {
            String l2;
            if (l == null) {
                l2 = null;
            } else {
                l2 = l.toString();
            }
            this.f90124c = l2;
            return this;
        }

        /* renamed from: a */
        public final C38153b mo66445a(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                mo66446a(awemeRawAd.getCreativeId());
                mo66454c(awemeRawAd.getLogExtra());
                this.f90126e.mo66444a("ad_id", awemeRawAd.getAdId());
            }
            return this;
        }

        /* renamed from: b */
        public final C38153b mo66451b(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                mo66446a(awemeRawAd.getCreativeId());
                mo66452b(awemeRawAd.getGroupId());
                mo66454c(awemeRawAd.getLogExtra());
            }
            return this;
        }

        /* renamed from: a */
        private static String m77338a(Context context) {
            if (!TextUtils.isEmpty(C58029j.f132249a) && C58029j.m104846b() && !C58029j.m104847c()) {
                return C58029j.f132249a;
            }
            String a = C13624l.m24481a(C13624l.m24479a(context));
            C58029j.f132249a = a;
            return a;
        }

        /* renamed from: b */
        public final C38153b mo66452b(Long l) {
            String l2;
            if (l == null) {
                l2 = null;
            } else {
                l2 = l.toString();
            }
            this.f90125d = l2;
            return this;
        }

        /* renamed from: a */
        public final C38153b mo66447a(Object obj) {
            this.f90126e.mo66444a("ad_extra_data", new C27910f().mo46674b(obj));
            return this;
        }

        /* renamed from: a */
        public final C38153b mo66448a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f90126e.mo66444a("refer", str);
            }
            return this;
        }
    }

    /* renamed from: a */
    public static C38153b m77332a() {
        C38153b bVar;
        MethodCollector.m26663i(9125);
        synchronized (C38151a.class) {
            try {
                bVar = f90120a;
                if (bVar != null) {
                    f90120a = null;
                } else {
                    bVar = null;
                }
            } finally {
                MethodCollector.m26664o(9125);
            }
        }
        if (bVar == null) {
            bVar = new C38153b();
        } else {
            bVar.mo66449a();
        }
        return bVar;
    }

    /* renamed from: a */
    static void m77334a(C38153b bVar) {
        MethodCollector.m26663i(9278);
        synchronized (C38151a.class) {
            try {
                if (f90120a == null) {
                    f90120a = bVar;
                    bVar.mo66449a();
                }
            } finally {
                MethodCollector.m26664o(9278);
            }
        }
    }

    /* renamed from: a */
    public static C38153b m77333a(String str, String str2, long j) {
        C38153b a = m77332a();
        a.f90126e.mo66444a("ad_event_priority", "10");
        a.f90126e.mo66444a("ad_event_type", "monitor");
        a.f90126e.mo66444a("track_url_list", str);
        a.f90126e.mo66444a("track_status", str2);
        a.f90126e.mo66443a("ts", j);
        String e = C38525a.f91037a.mo65638e();
        if (!TextUtils.isEmpty(e)) {
            a.f90126e.mo66444a("user_agent", e);
        }
        return a;
    }
}

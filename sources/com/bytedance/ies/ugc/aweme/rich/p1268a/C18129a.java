package com.bytedance.ies.ugc.aweme.rich.p1268a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a.C18133a;
import com.google.gson.C27910f;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.commercialize.p2573l.C38033c;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.rich.a.a */
public final class C18129a {

    /* renamed from: a */
    public static final C18129a f43181a = new C18129a();

    private C18129a() {
    }

    static {
        Covode.recordClassIndex(20770);
    }

    /* renamed from: a */
    private static C18130a m33745a() {
        return new C18130a("", "", "", null, null);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.rich.a.a$a */
    public static final class C18130a {

        /* renamed from: a */
        public final Map<String, Object> f43182a = new LinkedHashMap();

        /* renamed from: b */
        public final String f43183b;

        /* renamed from: c */
        public final String f43184c;

        /* renamed from: d */
        public final String f43185d;

        /* renamed from: e */
        public final String f43186e;

        /* renamed from: f */
        public final String f43187f;

        /* renamed from: g */
        private final Map<String, Object> f43188g = new LinkedHashMap();

        static {
            Covode.recordClassIndex(20771);
        }

        /* renamed from: d */
        private final boolean m33748d() {
            if (TextUtils.isEmpty(this.f43183b) || TextUtils.isEmpty(this.f43184c) || TextUtils.isEmpty(this.f43185d)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final void mo28902c() {
            ExecutorService executorService;
            if (m33748d()) {
                if (C38033c.m77103a()) {
                    C18137d.m33763a(this.f43183b, this.f43184c, this.f43185d, this.f43187f, this.f43186e).mo28911a(this.f43188g).mo28913b(this.f43182a).mo28915c();
                    return;
                }
                CallableC18132b bVar = new CallableC18132b(this);
                IAppLogDepend iAppLogDepend = C16091a.f38741a;
                if (iAppLogDepend != null) {
                    executorService = iAppLogDepend.getLogThreadPool();
                } else {
                    executorService = null;
                }
                C1731i.m5640b(bVar, executorService);
            }
        }

        /* renamed from: b */
        public final void mo28901b() {
            ExecutorService executorService;
            if (m33748d()) {
                if (C38033c.m77103a()) {
                    C18137d.m33763a(this.f43183b, this.f43184c, this.f43185d, this.f43187f, this.f43186e).mo28911a(this.f43188g).mo28913b(this.f43182a).mo28914b();
                    return;
                }
                CallableC18131a aVar = new CallableC18131a(this);
                IAppLogDepend iAppLogDepend = C16091a.f38741a;
                if (iAppLogDepend != null) {
                    executorService = iAppLogDepend.getLogThreadPool();
                } else {
                    executorService = null;
                }
                C1731i.m5640b(aVar, executorService);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.aweme.rich.a.a$a$b */
        public static final class CallableC18132b<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C18130a f43190a;

            static {
                Covode.recordClassIndex(20773);
            }

            CallableC18132b(C18130a aVar) {
                this.f43190a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                IAppLogDepend iAppLogDepend;
                if (!TextUtils.equals(this.f43190a.f43184c, "click")) {
                    JSONObject a = this.f43190a.mo28899a();
                    a.put("tag", this.f43190a.f43183b);
                    a.put("value", this.f43190a.f43185d);
                    a.put("group_id", this.f43190a.f43186e);
                    a.put("category", "event_v3");
                    C18133a.f43191a.mo28906a(this.f43190a.f43183b, this.f43190a.f43184c, this.f43190a.f43185d, a);
                    String a2 = C16048b.m29633a().mo25417a(true, "enable_send_staging_adlog", "v3");
                    if (a2 != null) {
                        int hashCode = a2.hashCode();
                        if (hashCode == 3707) {
                            a2.equals("v1");
                        } else if (hashCode != 3709) {
                            if (hashCode == 96673 && a2.equals("all")) {
                                a.put("_ad_staging_flag", "3");
                                IAppLogDepend iAppLogDepend2 = C16091a.f38741a;
                                if (iAppLogDepend2 != null) {
                                    iAppLogDepend2.onEventV3Json(this.f43190a.f43184c, a);
                                }
                            }
                        } else if (a2.equals("v3") && (iAppLogDepend = C16091a.f38741a) != null) {
                            iAppLogDepend.onEventV3Json(this.f43190a.f43184c, a);
                        }
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public final JSONObject mo28899a() {
            JSONObject jSONObject = new JSONObject();
            Context a = C17867d.m33078a();
            jSONObject.put("log_extra", this.f43187f);
            jSONObject.put("is_ad_event", "1");
            if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132254f = NetworkUtils.getNetworkAccessType(a);
            }
            String str = C58029j.f132254f;
            jSONObject.put("nt", str);
            for (Map.Entry<String, Object> entry : this.f43182a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (TextUtils.equals(this.f43184c, "click")) {
                jSONObject.put("has_v3", "1");
            }
            Map<String, Object> map = this.f43188g;
            if (map != null && !map.isEmpty()) {
                jSONObject.put("ad_extra_data", new C27910f().mo46674b(this.f43188g));
            }
            new StringBuilder("tag = ").append(this.f43183b).append(" label = ").append(this.f43184c).append(" + creativeId = ").append(this.f43185d).append(" groupId = ").append(this.f43186e).append(' ').append("logExtra = ").append(this.f43187f).append(" adExtraData = ").append(this.f43188g).append(" params = ").append(new C27910f().mo46674b(this.f43182a)).append(" nt = ").append(str);
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.aweme.rich.a.a$a$a */
        public static final class CallableC18131a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C18130a f43189a;

            static {
                Covode.recordClassIndex(20772);
            }

            CallableC18131a(C18130a aVar) {
                this.f43189a = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
            @Override // java.util.concurrent.Callable
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() {
                /*
                // Method dump skipped, instructions count: 314
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a.C18130a.CallableC18131a.call():java.lang.Object");
            }
        }

        /* renamed from: a */
        public final C18130a mo28898a(Map<String, ? extends Object> map) {
            if (map == null || map.isEmpty()) {
                return this;
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                this.f43188g.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: a */
        public final C18130a mo28897a(String str, Object obj) {
            if (!(str == null || str.length() == 0 || obj == null || ((obj instanceof String) && ((CharSequence) obj).length() == 0))) {
                this.f43188g.put(str, obj);
            }
            return this;
        }

        /* renamed from: b */
        public final C18130a mo28900b(String str, Object obj) {
            if (!(str == null || str.length() == 0 || obj == null || ((obj instanceof String) && ((CharSequence) obj).length() == 0))) {
                this.f43182a.put(str, obj);
            }
            return this;
        }

        public C18130a(String str, String str2, String str3, String str4, String str5) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            this.f43183b = str;
            this.f43184c = str2;
            this.f43185d = str3;
            this.f43186e = str4;
            this.f43187f = str5;
        }
    }

    /* renamed from: a */
    public static final C18130a m33746a(String str, String str2, AwemeRawAd awemeRawAd) {
        String valueOf;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (awemeRawAd == null) {
            return m33745a();
        }
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return m33745a();
        }
        creativeId.longValue();
        if (awemeRawAd.getGroupId() == null) {
            valueOf = "0";
        } else {
            valueOf = String.valueOf(awemeRawAd.getGroupId().longValue());
        }
        return C18135b.m33759a(awemeRawAd, m33747a(str, str2, String.valueOf(awemeRawAd.getCreativeId().longValue()), awemeRawAd.getLogExtra(), valueOf));
    }

    /* renamed from: a */
    public static final C18130a m33747a(String str, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new C18130a(str, str2, str3, str5, str4);
    }
}

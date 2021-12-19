package com.bytedance.ies.ugc.aweme.rich.p1268a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a.C18133a;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.rich.a.d */
public final class C18137d {

    /* renamed from: a */
    public static final C18137d f43195a = new C18137d();

    private C18137d() {
    }

    static {
        Covode.recordClassIndex(20778);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.rich.a.d$a */
    public static final class C18138a {

        /* renamed from: a */
        public final Map<String, Object> f43196a = new LinkedHashMap();

        /* renamed from: b */
        public final Map<String, Object> f43197b = new LinkedHashMap();

        /* renamed from: c */
        public final String f43198c;

        /* renamed from: d */
        public final String f43199d;

        /* renamed from: e */
        public final String f43200e;

        /* renamed from: f */
        public final String f43201f;

        /* renamed from: g */
        public final String f43202g;

        static {
            Covode.recordClassIndex(20779);
        }

        /* renamed from: d */
        private final boolean m33766d() {
            if (TextUtils.isEmpty(this.f43198c) || TextUtils.isEmpty(this.f43199d) || TextUtils.isEmpty(this.f43200e)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final void mo28914b() {
            ExecutorService executorService;
            if (m33766d()) {
                CallableC18139a aVar = new CallableC18139a(this);
                IAppLogDepend iAppLogDepend = C16091a.f38741a;
                if (iAppLogDepend != null) {
                    executorService = iAppLogDepend.getLogThreadPool();
                } else {
                    executorService = null;
                }
                C1731i.m5636a(aVar, executorService);
            }
        }

        /* renamed from: c */
        public final void mo28915c() {
            ExecutorService executorService;
            if (m33766d()) {
                CallableC18140b bVar = new CallableC18140b(this);
                IAppLogDepend iAppLogDepend = C16091a.f38741a;
                if (iAppLogDepend != null) {
                    executorService = iAppLogDepend.getLogThreadPool();
                } else {
                    executorService = null;
                }
                C1731i.m5636a(bVar, executorService);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.aweme.rich.a.d$a$b */
        public static final class CallableC18140b<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C18138a f43204a;

            static {
                Covode.recordClassIndex(20781);
            }

            CallableC18140b(C18138a aVar) {
                this.f43204a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                IAppLogDepend iAppLogDepend;
                if (!TextUtils.equals(this.f43204a.f43199d, "click")) {
                    JSONObject a = this.f43204a.mo28912a();
                    a.put("tag", this.f43204a.f43198c);
                    a.put("value", this.f43204a.f43200e);
                    a.put("group_id", this.f43204a.f43201f);
                    a.put("category", "event_v3");
                    C18133a.f43191a.mo28906a(this.f43204a.f43198c, this.f43204a.f43199d, this.f43204a.f43200e, a);
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
                                    iAppLogDepend2.onEventV3Json(this.f43204a.f43199d, a);
                                }
                            }
                        } else if (a2.equals("v3") && (iAppLogDepend = C16091a.f38741a) != null) {
                            iAppLogDepend.onEventV3Json(this.f43204a.f43199d, a);
                        }
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public final JSONObject mo28912a() {
            Context applicationContext;
            JSONObject jSONObject = new JSONObject();
            IHostContextDepend iHostContextDepend = C16091a.f38743c;
            if (iHostContextDepend == null || (applicationContext = iHostContextDepend.getApplicationContext()) == null) {
                return jSONObject;
            }
            jSONObject.put("log_extra", this.f43202g);
            jSONObject.put("is_ad_event", "1");
            if (TextUtils.isEmpty(C58029j.f132249a) || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132249a = C13624l.m24490f(applicationContext);
            }
            String str = C58029j.f132249a;
            jSONObject.put("nt", str);
            for (Map.Entry<String, Object> entry : this.f43196a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (TextUtils.equals(this.f43199d, "click")) {
                jSONObject.put("has_v3", "1");
            }
            Map<String, Object> map = this.f43197b;
            if (map != null && !map.isEmpty()) {
                jSONObject.put("ad_extra_data", new C27910f().mo46674b(this.f43197b));
            }
            new StringBuilder("tag = ").append(this.f43198c).append(" label = ").append(this.f43199d).append(" + creativeId = ").append(this.f43200e).append(" groupId = ").append(this.f43201f).append(' ').append("logExtra = ").append(this.f43202g).append(" adExtraData = ").append(this.f43197b).append(" params = ").append(new C27910f().mo46674b(this.f43196a)).append(" nt = ").append(str);
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.aweme.rich.a.d$a$a */
        public static final class CallableC18139a<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C18138a f43203a;

            static {
                Covode.recordClassIndex(20780);
            }

            CallableC18139a(C18138a aVar) {
                this.f43203a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                Context context;
                IAppLogDepend iAppLogDepend;
                IHostContextDepend iHostContextDepend = C16091a.f38743c;
                if (iHostContextDepend != null) {
                    context = iHostContextDepend.getApplicationContext();
                } else {
                    context = null;
                }
                if (context != null) {
                    JSONObject a = this.f43203a.mo28912a();
                    C18133a.f43191a.mo28906a(this.f43203a.f43198c, this.f43203a.f43199d, this.f43203a.f43200e, a);
                    long j = 0;
                    try {
                        if (this.f43203a.f43201f != null) {
                            j = Long.parseLong(this.f43203a.f43201f);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (TextUtils.equals(this.f43203a.f43199d, "click")) {
                        C18138a aVar = this.f43203a;
                        JSONObject a2 = aVar.mo28912a();
                        a2.remove("has_v3");
                        a2.put("tag", aVar.f43198c);
                        a2.put("value", aVar.f43200e);
                        a2.put("group_id", aVar.f43201f);
                        a2.put("category", "event_v3");
                        IAppLogDepend iAppLogDepend2 = C16091a.f38741a;
                        if (iAppLogDepend2 != null) {
                            iAppLogDepend2.onEventV3Json("realtime_click", a2);
                        }
                        String str = aVar.f43202g;
                        JSONObject jSONObject = new JSONObject();
                        if (str != null) {
                            AbstractC28019l a3 = C28024q.m56139a(str);
                            C89219l.m154709a((Object) a3, "");
                            AbstractC28019l c = a3.mo46789j().mo46803c("rit");
                            if (c != null) {
                                jSONObject.put("ctr_rit", c.mo46689c());
                            }
                        }
                        jSONObject.put("service", "ctr_click");
                        IMonitorDepend iMonitorDepend = C16091a.f38742b;
                        if (iMonitorDepend != null) {
                            iMonitorDepend.monitorCommonLog("ctr_monitor", jSONObject);
                        }
                        IAppLogDepend iAppLogDepend3 = C16091a.f38741a;
                        if (iAppLogDepend3 != null) {
                            iAppLogDepend3.onEventV1(context, this.f43203a.f43198c, "event_v1", this.f43203a.f43199d, this.f43203a.f43200e, j, a);
                        }
                    } else {
                        String a4 = C16048b.m29633a().mo25417a(true, "enable_send_staging_adlog", "v3");
                        if (a4 != null) {
                            int hashCode = a4.hashCode();
                            if (hashCode != 3707) {
                                if (hashCode != 3709) {
                                    if (hashCode == 96673 && a4.equals("all")) {
                                        a.put("_ad_staging_flag", "1");
                                        IAppLogDepend iAppLogDepend4 = C16091a.f38741a;
                                        if (iAppLogDepend4 != null) {
                                            iAppLogDepend4.onEventV1(context, this.f43203a.f43198c, "event_v1", this.f43203a.f43199d, this.f43203a.f43200e, j, a);
                                        }
                                        a.put("_ad_staging_flag", "3");
                                        a.put("tag", this.f43203a.f43198c);
                                        a.put("value", this.f43203a.f43200e);
                                        a.put("group_id", this.f43203a.f43201f);
                                        a.put("category", "event_v3");
                                        IAppLogDepend iAppLogDepend5 = C16091a.f38741a;
                                        if (iAppLogDepend5 != null) {
                                            iAppLogDepend5.onEventV3Json(this.f43203a.f43199d, a);
                                        }
                                    }
                                } else if (a4.equals("v3")) {
                                    a.put("tag", this.f43203a.f43198c);
                                    a.put("value", this.f43203a.f43200e);
                                    a.put("group_id", this.f43203a.f43201f);
                                    a.put("category", "event_v3");
                                    IAppLogDepend iAppLogDepend6 = C16091a.f38741a;
                                    if (iAppLogDepend6 != null) {
                                        iAppLogDepend6.onEventV3Json(this.f43203a.f43199d, a);
                                    }
                                }
                            } else if (a4.equals("v1") && (iAppLogDepend = C16091a.f38741a) != null) {
                                iAppLogDepend.onEventV1(context, this.f43203a.f43198c, "event_v1", this.f43203a.f43199d, this.f43203a.f43200e, j, a);
                            }
                        }
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public final C18138a mo28911a(Map<String, ? extends Object> map) {
            if (map == null || map.isEmpty()) {
                return this;
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                this.f43197b.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: b */
        public final C18138a mo28913b(Map<String, ? extends Object> map) {
            if (map == null || map.isEmpty()) {
                return this;
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                this.f43196a.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: a */
        public final C18138a mo28910a(String str, Object obj) {
            if (str.length() == 0 || ((CharSequence) obj).length() == 0) {
                return this;
            }
            this.f43196a.put(str, obj);
            return this;
        }

        public C18138a(String str, String str2, String str3, String str4, String str5) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            C89219l.m154719c(str3, "");
            this.f43198c = str;
            this.f43199d = str2;
            this.f43200e = str3;
            this.f43201f = str4;
            this.f43202g = str5;
        }
    }

    /* renamed from: b */
    public static final boolean m33765b() {
        return TextUtils.equals(C16048b.m29633a().mo25417a(true, "enable_send_staging_adlog", "v3"), "v1");
    }

    /* renamed from: a */
    public static final boolean m33764a() {
        return TextUtils.equals(C16048b.m29633a().mo25417a(true, "enable_send_staging_adlog", "v3"), "all");
    }

    /* renamed from: a */
    public static final C18138a m33763a(String str, String str2, String str3, String str4, String str5) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        return new C18138a(str, str2, str3, str5, str4);
    }
}

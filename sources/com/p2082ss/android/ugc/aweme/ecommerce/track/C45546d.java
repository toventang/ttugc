package com.p2082ss.android.ugc.aweme.ecommerce.track;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.track.d */
public final class C45546d {

    /* renamed from: a */
    public static long f106066a = -1;

    /* renamed from: b */
    public static final C89350l f106067b = new C89350l("\"net_error\":-?\\d+");

    /* renamed from: c */
    public static final C89350l f106068c = new C89350l("\\|.*?,");

    /* renamed from: d */
    public static final C45546d f106069d = new C45546d();

    private C45546d() {
    }

    /* renamed from: a */
    public final void mo76755a(IPdpStarter.PdpEnterParam pdpEnterParam, String str, String str2, int i) {
        C89219l.m154721d(pdpEnterParam, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m88090a(pdpEnterParam, str, str2, i, 8);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.d$c */
    public static final class CallableC45549c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ HashMap f106077a;

        /* renamed from: b */
        final /* synthetic */ String f106078b;

        static {
            Covode.recordClassIndex(54040);
        }

        CallableC45549c(HashMap hashMap, String str) {
            this.f106077a = hashMap;
            this.f106078b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : this.f106077a.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                C39162r.m79461a(this.f106078b, jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(54037);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.d$d */
    public static final class CallableC45550d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ IPdpStarter.PdpEnterParam f106079a;

        static {
            Covode.recordClassIndex(54041);
        }

        CallableC45550d(IPdpStarter.PdpEnterParam pdpEnterParam) {
            this.f106079a = pdpEnterParam;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            String str;
            try {
                HashMap<String, Object> trackParams = this.f106079a.getTrackParams();
                String str2 = null;
                if (trackParams != null) {
                    obj = trackParams.get("author_id");
                } else {
                    obj = null;
                }
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str3 = (String) obj;
                HashMap<String, Object> trackParams2 = this.f106079a.getTrackParams();
                if (trackParams2 != null) {
                    obj2 = trackParams2.get("source_page_type");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str4 = (String) obj2;
                HashMap<String, Object> trackParams3 = this.f106079a.getTrackParams();
                if (trackParams3 != null) {
                    obj3 = trackParams3.get("anchor_show_type");
                } else {
                    obj3 = null;
                }
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str5 = (String) obj3;
                HashMap<String, Object> trackParams4 = this.f106079a.getTrackParams();
                if (trackParams4 != null) {
                    obj4 = trackParams4.get("source_content_id");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof String) {
                    str2 = obj4;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("product_id", this.f106079a.getProductId());
                jSONObject.put("author_id", str3);
                jSONObject.put("source_page_type", str4);
                jSONObject.put("anchor_show_type", str5);
                jSONObject.put("source_content_id", str2);
                HashMap<String, Object> trackParams5 = this.f106079a.getTrackParams();
                if (trackParams5 == null || (str = trackParams5.toString()) == null) {
                    str = "";
                }
                jSONObject.put("track_params", str);
                Activity[] activityStack = ActivityStack.getActivityStack();
                C89219l.m154716b(activityStack, "");
                jSONObject.put("page_stack", C89064i.m154484a(activityStack, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C45547a.f106070a, 31));
                C39162r.m79461a("rd_tiktokec_report_param_null", jSONObject);
            } catch (Throwable unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.d$a */
    static final class C45547a extends AbstractC89220m implements AbstractC89172b<Activity, CharSequence> {

        /* renamed from: a */
        public static final C45547a f106070a = new C45547a();

        static {
            Covode.recordClassIndex(54038);
        }

        C45547a() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(Activity activity) {
            String simpleName = activity.getClass().getSimpleName();
            C89219l.m154716b(simpleName, "");
            return simpleName;
        }
    }

    /* renamed from: a */
    public static void m88089a(IPdpStarter.PdpEnterParam pdpEnterParam) {
        C89219l.m154721d(pdpEnterParam, "");
        C1731i.m5640b(new CallableC45550d(pdpEnterParam), C1731i.f5562a);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.d$b */
    public static final class C45548b extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f106071a;

        /* renamed from: b */
        final /* synthetic */ HashMap f106072b;

        /* renamed from: c */
        final /* synthetic */ boolean f106073c;

        /* renamed from: d */
        final /* synthetic */ int f106074d;

        /* renamed from: e */
        final /* synthetic */ String f106075e;

        /* renamed from: f */
        final /* synthetic */ int f106076f;

        static {
            Covode.recordClassIndex(54039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45548b(String str, HashMap hashMap, boolean z, int i, String str2, int i2) {
            super(1);
            this.f106071a = str;
            this.f106072b = hashMap;
            this.f106073c = z;
            this.f106074d = i;
            this.f106075e = str2;
            this.f106076f = i2;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            String str;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo76752b("page_name", this.f106071a);
            HashMap hashMap = this.f106072b;
            if (hashMap != null) {
                aVar2.mo76753c("anchor_show_type", hashMap.get("product_id"));
                aVar2.mo76753c("author_id", this.f106072b.get("author_id"));
                aVar2.mo76753c("enter_from_info", this.f106072b.get("enter_from_info"));
                aVar2.mo76753c("entrance_form", this.f106072b.get("entrance_form"));
                aVar2.mo76753c("entrance_info", this.f106072b.get("entrance_info"));
                aVar2.mo76753c("follow_status", this.f106072b.get("follow_status"));
                aVar2.mo76753c("product_id", this.f106072b.get("product_id"));
                aVar2.mo76753c("product_source", this.f106072b.get("product_source"));
                aVar2.mo76753c("source", this.f106072b.get("source"));
                aVar2.mo76753c("source_from", this.f106072b.get("source_from"));
                aVar2.mo76753c("source_page_type", this.f106072b.get("source_page_type"));
            }
            if (this.f106073c) {
                str = "yes";
            } else {
                str = "no";
            }
            aVar2.mo76752b("is_retry", str);
            aVar2.mo76752b("is_check_passed", Integer.valueOf(this.f106074d));
            aVar2.mo76753c("api_path", this.f106075e);
            aVar2.mo76752b("preload_type", Integer.valueOf(this.f106076f));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m88094a(String str, HashMap<String, Object> hashMap) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        C1731i.m5640b(new CallableC45549c(hashMap, str), C1731i.f5562a);
    }

    /* renamed from: a */
    public final void mo76754a(IPdpStarter.PdpEnterParam pdpEnterParam, int i) {
        C89219l.m154721d(pdpEnterParam, "");
        m88090a(pdpEnterParam, (String) null, (String) null, i, 14);
    }

    /* renamed from: a */
    public static void m88091a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i) {
        Object obj;
        String str;
        C89219l.m154721d(pdpEnterParam, "");
        HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
        if (trackParams == null || (obj = trackParams.get("click_product_start_time")) == null) {
            obj = -1L;
        }
        C89219l.m154716b(obj, "");
        HashMap hashMap = new HashMap();
        hashMap.putAll(pdpEnterParam.getRequestParams());
        HashMap<String, Object> trackParams2 = pdpEnterParam.getTrackParams();
        if (trackParams2 == null) {
            trackParams2 = new HashMap<>();
        }
        hashMap.putAll(trackParams2);
        if ((obj instanceof Long) && (!C89219l.m154714a(obj, (Object) -1L))) {
            hashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (z) {
            str = "yes";
        } else {
            str = "no";
        }
        hashMap.put("is_retry", str);
        hashMap.put("preload_type", Integer.valueOf(i));
        hashMap.put("api_path", "/api/v1/shop/product_info/get");
        if (!hashMap.containsKey("page_name")) {
            hashMap.put("page_name", "product_detail");
        }
        m88094a("rd_tiktokec_product_detail_request_send", hashMap);
    }

    /* renamed from: a */
    private static void m88092a(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, String str, String str2, int i) {
        Object obj;
        boolean z;
        C89219l.m154721d(semiPdpEnterParams, "");
        HashMap<String, Object> trackParams = semiPdpEnterParams.getTrackParams();
        if (trackParams == null || (obj = trackParams.get("click_product_start_time")) == null) {
            obj = -1L;
        }
        C89219l.m154716b(obj, "");
        HashMap hashMap = new HashMap();
        hashMap.putAll(semiPdpEnterParams.getRequestParams());
        HashMap<String, Object> trackParams2 = semiPdpEnterParams.getTrackParams();
        if (trackParams2 == null) {
            trackParams2 = new HashMap<>();
        }
        hashMap.putAll(trackParams2);
        if ((obj instanceof Long) && (!C89219l.m154714a(obj, (Object) -1L))) {
            hashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (f106066a > 0) {
            hashMap.put("api_duration", Long.valueOf(System.currentTimeMillis() - f106066a));
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str2 == null || str2.length() == 0) {
            hashMap.put("is_success", "yes");
        } else {
            hashMap.put("error_code", str2);
            hashMap.put("error_message", str);
            hashMap.put("is_success", "no");
        }
        hashMap.put("preload_type", Integer.valueOf(i));
        if (!hashMap.containsKey("page_name")) {
            hashMap.put("page_name", "semi_product_detail");
        }
        m88094a("rd_tiktokec_product_detail_request_result", hashMap);
    }

    /* renamed from: a */
    public static /* synthetic */ void m88093a(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, String str, String str2, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            i = 0;
        }
        m88092a(semiPdpEnterParams, str, str2, i);
    }

    /* renamed from: a */
    private static /* synthetic */ void m88090a(IPdpStarter.PdpEnterParam pdpEnterParam, String str, String str2, int i, int i2) {
        long j;
        boolean z;
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            i = 0;
        }
        C89219l.m154721d(pdpEnterParam, "");
        HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
        if (trackParams == null || (j = trackParams.get("click_product_start_time")) == null) {
            j = -1L;
        }
        C89219l.m154716b(j, "");
        HashMap hashMap = new HashMap();
        hashMap.putAll(pdpEnterParam.getRequestParams());
        HashMap<String, Object> trackParams2 = pdpEnterParam.getTrackParams();
        if (trackParams2 == null) {
            trackParams2 = new HashMap<>();
        }
        hashMap.putAll(trackParams2);
        if ((j instanceof Long) && (!C89219l.m154714a(j, (Object) -1L))) {
            hashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) j).longValue()));
        }
        if (f106066a > 0) {
            hashMap.put("api_duration", Long.valueOf(System.currentTimeMillis() - f106066a));
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str2 == null || str2.length() == 0) {
            hashMap.put("is_success", "yes");
        } else {
            hashMap.put("error_code", str2);
            hashMap.put("error_message", str);
            hashMap.put("is_success", "no");
        }
        hashMap.put("preload_type", Integer.valueOf(i));
        if (!hashMap.containsKey("page_name")) {
            hashMap.put("page_name", "product_detail");
        }
        m88094a("rd_tiktokec_product_detail_request_result", hashMap);
    }

    /* renamed from: a */
    public static void m88095a(HashMap<String, Object> hashMap, int i, boolean z, String str, int i2, String str2) {
        C89219l.m154721d(str2, "");
        C45544c.m88081a("rd_page_params_check", new C45548b(str2, hashMap, z, i, str, i2));
    }
}

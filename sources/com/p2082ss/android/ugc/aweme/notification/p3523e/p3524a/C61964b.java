package com.p2082ss.android.ugc.aweme.notification.p3523e.p3524a;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.e.a.b */
public final class C61964b {

    /* renamed from: a */
    public static Long f140649a;

    /* renamed from: b */
    public static Long f140650b;

    /* renamed from: c */
    public static final C61964b f140651c = new C61964b();

    /* renamed from: d */
    private static Long f140652d;

    private C61964b() {
    }

    static {
        Covode.recordClassIndex(72713);
    }

    /* renamed from: a */
    public static void m112085a() {
        f140652d = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: c */
    public static void m112092c() {
        f140649a = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: d */
    public static void m112093d() {
        f140650b = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: b */
    public static void m112091b() {
        Long l = f140652d;
        if (l != null) {
            m112088a("notice_filter_data", System.currentTimeMillis() - l.longValue(), (Integer) null);
        }
        f140652d = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a.b$a */
    public static final class CallableC61965a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C61561m f140653a;

        /* renamed from: b */
        final /* synthetic */ String f140654b;

        static {
            Covode.recordClassIndex(72714);
        }

        public CallableC61965a(C61561m mVar, String str) {
            this.f140653a = mVar;
            this.f140654b = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.LinkedHashMap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            HashMap<Integer, Integer> hashMap = this.f140653a.f139737c;
            if (hashMap == null || hashMap.isEmpty()) {
                str = "is empty";
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                    if (entry.getValue().intValue() > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                str = C89070n.m154551a(C89041ag.m154432e(linkedHashMap), ", ", "{", "}", 0, (CharSequence) null, C61966a.f140655a, 24);
            }
            C61964b.m112089a(this.f140654b, "Get notificationIndicator\r\nmergeMap " + str + "\r\ngroup = " + this.f140653a.f139735a + "\r\ncount = " + this.f140653a.f139736b);
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a.b$a$a */
        static final class C61966a extends AbstractC89220m implements AbstractC89172b<C89378p<? extends Integer, ? extends Integer>, CharSequence> {

            /* renamed from: a */
            public static final C61966a f140655a = new C61966a();

            static {
                Covode.recordClassIndex(72715);
            }

            C61966a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ CharSequence invoke(C89378p<? extends Integer, ? extends Integer> pVar) {
                C89378p<? extends Integer, ? extends Integer> pVar2 = pVar;
                C89219l.m154721d(pVar2, "");
                return "group(" + pVar2.getFirst() + ")=" + pVar2.getSecond();
            }
        }
    }

    /* renamed from: a */
    public static void m112086a(int i) {
        Long l = f140649a;
        if (l != null) {
            m112088a("notice_list_total", System.currentTimeMillis() - l.longValue(), Integer.valueOf(i));
        }
        f140649a = null;
    }

    /* renamed from: a */
    public static final void m112089a(String str, String str2) {
        C51423a.m95784a(4, str, str2);
    }

    /* renamed from: a */
    private static void m112090a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C12290b.m22066a(str, (JSONObject) null, (JSONObject) null, jSONObject);
    }

    /* renamed from: a */
    public static void m112087a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("notice_group", i);
        jSONObject.put("notice_request_id", str);
        jSONObject.put("notice_error_reason", str2);
        m112090a("notice_monitor_list_abnormal", jSONObject);
    }

    /* renamed from: a */
    public static void m112088a(String str, long j, Integer num) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("notice_duration_type", str);
        jSONObject.put("notice_duration", j);
        if (num != null) {
            jSONObject.put("notice_group", num.intValue());
        }
        m112090a("notice_monitor_list_duration", jSONObject);
    }
}

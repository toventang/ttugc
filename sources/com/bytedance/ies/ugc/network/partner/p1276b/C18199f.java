package com.bytedance.ies.ugc.network.partner.p1276b;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.network.partner.b.f */
public final class C18199f {

    /* renamed from: a */
    public final boolean f43341a;

    /* renamed from: b */
    public final C18202h f43342b;

    /* renamed from: c */
    public final C18195b f43343c;

    /* renamed from: d */
    public final C18196c f43344d;

    /* renamed from: e */
    public int f43345e;

    /* renamed from: f */
    public int f43346f;

    /* renamed from: g */
    public boolean f43347g;

    /* renamed from: h */
    public int f43348h;

    /* renamed from: i */
    public Object f43349i;

    /* renamed from: j */
    public String f43350j;

    /* renamed from: k */
    public C22096s f43351k;

    /* renamed from: l */
    private final AbstractC89244h f43352l;

    /* renamed from: m */
    private final Request f43353m;

    static {
        Covode.recordClassIndex(20855);
    }

    /* renamed from: a */
    public final Map<Class<?>, Object> mo29058a() {
        return (Map) this.f43352l.getValue();
    }

    /* renamed from: com.bytedance.ies.ugc.network.partner.b.f$a */
    static final class C18200a extends AbstractC89220m implements AbstractC89171a<HashMap<Class<?>, Object>> {

        /* renamed from: a */
        public static final C18200a f43354a = new C18200a();

        static {
            Covode.recordClassIndex(20856);
        }

        C18200a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<Class<?>, Object> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: b */
    public final Request mo29059b() {
        Request.C22024a a = this.f43353m.newBuilder().mo35839a(this.f43344d.f43332a, this.f43344d.f43333b).mo35838a(this.f43342b.mo29061a());
        a.f52025c = this.f43343c.mo29046a();
        a.f52029g = this.f43345e;
        a.f52029g = this.f43346f;
        a.f52030h = this.f43347g;
        a.f52031i = this.f43348h;
        a.f52033k = this.f43349i;
        a.f52034l = this.f43350j;
        for (Map.Entry<Class<?>, Object> entry : mo29058a().entrySet()) {
            Class<?> key = entry.getKey();
            if (!(key instanceof Class)) {
                key = null;
            }
            a.mo35837a(key, entry.getValue());
        }
        Request a2 = a.mo35840a();
        C89219l.m154716b(a2, "");
        a2.setMetrics(this.f43351k);
        return a2;
    }

    public C18199f(Request request) {
        C18195b bVar;
        C89219l.m154721d(request, "");
        this.f43353m = request;
        this.f43341a = request.isAddCommonParam();
        C18202h a = C18202h.m33867a(request.getUrl());
        C89219l.m154716b(a, "");
        this.f43342b = a;
        if (request.getHeaders() == null) {
            bVar = new C18195b();
        } else {
            List<C22027b> headers = request.getHeaders();
            C89219l.m154716b(headers, "");
            bVar = new C18195b(headers);
        }
        this.f43343c = bVar;
        this.f43344d = new C18196c(request);
        this.f43345e = request.getPriorityLevel();
        this.f43346f = request.getRequestPriorityLevel();
        this.f43347g = request.isResponseStreaming();
        this.f43348h = request.getMaxLength();
        this.f43349i = request.getExtraInfo();
        String serviceType = request.getServiceType();
        C89219l.m154716b(serviceType, "");
        this.f43350j = serviceType;
        this.f43352l = C89250i.m154773a((AbstractC89171a) C18200a.f43354a);
        C22096s metrics = request.getMetrics();
        C89219l.m154716b(metrics, "");
        this.f43351k = metrics;
    }
}

package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4446c.C86757a;
import com.p2082ss.ugc.effectplatform.p4452i.C86802b;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.Map;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.r */
public final class C86957r extends AbstractC86851a<FetchHotEffectResponse, FetchHotEffectResponse> {

    /* renamed from: c */
    public static final C86958a f196058c = new C86958a((byte) 0);

    /* renamed from: d */
    private final C86687a f196059d;

    /* renamed from: f */
    private final int f196060f;

    /* renamed from: g */
    private final int f196061g;

    /* renamed from: h */
    private final String f196062h;

    /* renamed from: i */
    private final Map<String, String> f196063i;

    static {
        Covode.recordClassIndex(102722);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.r$a */
    public static final class C86958a {
        static {
            Covode.recordClassIndex(102723);
        }

        private C86958a() {
        }

        public /* synthetic */ C86958a(byte b) {
            this();
        }
    }

    /* renamed from: g */
    private final FetchHotEffectResponse m150597g() {
        String b;
        V v = this.f196059d.f195467w.f199870a;
        if (v == null || (b = v.mo140007b("effectgalleryhot")) == null) {
            return null;
        }
        try {
            C86695b bVar = this.f196059d.f195461q;
            if (bVar != null) {
                return (FetchHotEffectResponse) bVar.f195508a.convertJsonToObj(b, FetchHotEffectResponse.class);
            }
            return null;
        } catch (Exception e) {
            C88060b.m153136a("FetchHotEffectListTask", "Json Exception: ".concat(String.valueOf(e)), null);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap<String, String> a = C86992i.m150657a(this.f196059d, true);
        a.put("cursor", String.valueOf(this.f196061g));
        a.put("count", String.valueOf(this.f196060f));
        a.put("panel", "default");
        Map<String, String> map = this.f196063i;
        if (map != null) {
            a.putAll(map);
        }
        return new C86701e(C87002p.m150693a(a, this.f196059d.f195433A + this.f196059d.f195445a + "/hoteffects"), null, null, null, false, 62);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00c0 A[ADDED_TO_REGION, EDGE_INSN: B:89:0x00c0->B:64:0x00c0 ?: BREAK  , SYNTHETIC] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a, com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139952a() {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.task.C86957r.mo139952a():void");
    }

    /* renamed from: a */
    private final long m150594a(FetchHotEffectResponse fetchHotEffectResponse) {
        String convertObjToJson;
        long j;
        if (fetchHotEffectResponse == null) {
            return 0;
        }
        try {
            C86695b bVar = this.f196059d.f195461q;
            if (!(bVar == null || (convertObjToJson = bVar.f195508a.convertObjToJson(fetchHotEffectResponse)) == null)) {
                V v = this.f196059d.f195467w.f199870a;
                if (v != null) {
                    j = v.mo140005a("effectgalleryhot", convertObjToJson);
                } else {
                    j = 0;
                }
                return j / ((long) C86757a.f195654a);
            }
        } catch (Exception e) {
            C88060b.m153136a("FetchHotEffectListTask", "saveHotEffectList: ".concat(String.valueOf(e)), null);
        }
        return 0;
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ FetchHotEffectResponse mo140547a(C86695b bVar, String str) {
        return m150596b(bVar, str);
    }

    /* renamed from: b */
    private static FetchHotEffectResponse m150596b(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (FetchHotEffectResponse) bVar.f195508a.convertJsonToObj(str, FetchHotEffectResponse.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo140548a(long j, long j2, long j3, FetchHotEffectResponse fetchHotEffectResponse) {
        C89219l.m154719c(fetchHotEffectResponse, "");
        long currentTimeMillis = System.currentTimeMillis();
        C86993j.m150662a(this.f196059d.f195453i, fetchHotEffectResponse.getEffect_list());
        C86993j.m150662a(this.f196059d.f195453i, fetchHotEffectResponse.getCollection_list());
        C86993j.m150663a(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getEffect_list());
        C86993j.m150663a(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getCollection_list());
        C86993j.m150667b(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getEffect_list());
        C86993j.m150667b(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getCollection_list());
        V v = this.f196059d.f195463s.f199870a;
        if (v != null) {
            C86802b.m150349a(v, this.f196059d, C89041ag.m154421a(C89387v.m154943a("duration", Long.valueOf(currentTimeMillis - j)), C89387v.m154943a("network_time", Long.valueOf(j2 - j))));
        }
        super.mo140548a(j, j2, j3, (AbstractC86845h) fetchHotEffectResponse);
        m150594a(fetchHotEffectResponse);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86957r(C86687a aVar, int i, int i2, String str, Map<String, String> map) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f196059d = aVar;
        this.f196060f = i;
        this.f196061g = i2;
        this.f196062h = str;
        this.f196063i = map;
    }
}

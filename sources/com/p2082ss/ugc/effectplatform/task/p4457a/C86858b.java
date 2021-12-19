package com.p2082ss.ugc.effectplatform.task.p4457a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.p4450g.C86791c;
import com.p2082ss.ugc.effectplatform.task.AbstractC86891b;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.Map;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.task.a.b */
public final class C86858b extends AbstractC86891b {

    /* renamed from: a */
    private final C86687a f195817a;

    /* renamed from: b */
    private final String f195818b;

    /* renamed from: c */
    private final int f195819c;

    /* renamed from: d */
    private final String f195820d = null;

    /* renamed from: f */
    private final String f195821f = null;

    static {
        Covode.recordClassIndex(102623);
    }

    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
    }

    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        mo140584c();
    }

    /* renamed from: c */
    public final SingleAlgorithmModelResponse mo140584c() {
        Integer num;
        SingleAlgorithmModelResponse singleAlgorithmModelResponse;
        C89378p[] pVarArr = new C89378p[5];
        String str = this.f195817a.f195447c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        pVarArr[0] = C89387v.m154943a("sdk_version", str);
        String str3 = this.f195817a.f195452h;
        if (str3 != null) {
            str2 = str3;
        }
        pVarArr[1] = C89387v.m154943a("device_type", str2);
        pVarArr[2] = C89387v.m154943a("device_platform", "android");
        C86687a.EnumC86690c cVar = this.f195817a.f195438F;
        if (cVar != null) {
            num = Integer.valueOf(cVar.ordinal());
        } else {
            num = null;
        }
        pVarArr[3] = C89387v.m154943a("status", String.valueOf(num));
        pVarArr[4] = C89387v.m154943a(StringSet.name, this.f195818b);
        Map b = C89041ag.m154427b(pVarArr);
        int i = this.f195819c;
        if (i > 0) {
            b.put("busi_id", String.valueOf(i));
        }
        b.putAll(C86992i.m150657a(this.f195817a, false));
        String str4 = this.f195820d;
        if (str4 != null && (!C89361p.m154870a((CharSequence) str4))) {
            b.put("big_version", str4);
        }
        C86701e eVar = new C86701e(C87002p.m150693a(b, this.f195817a.f195433A + "/model/api/model"), EnumC86699c.GET, null, null, false, 60);
        V v = this.f195817a.f195462r.f199870a;
        if (v == null) {
            m150452a(new C86840e(10011));
            return null;
        }
        try {
            String a = C86791c.m150338a(v.fetchFromNetwork(eVar).f195518b);
            if (a.length() == 0) {
                m150452a(new C86840e(10002));
                return null;
            }
            C86695b bVar = this.f195817a.f195461q;
            if (bVar != null && (singleAlgorithmModelResponse = (SingleAlgorithmModelResponse) bVar.f195508a.convertJsonToObj(a, SingleAlgorithmModelResponse.class)) != null) {
                return singleAlgorithmModelResponse;
            }
            m150452a(new C86840e(10008));
            return null;
        } catch (Exception e) {
            C88060b.m153136a("FetchModelInfoByNameTask", "fetch single model info failed!", e);
            m150452a(new C86840e(e));
            return null;
        }
    }

    /* renamed from: a */
    private static void m150452a(C86840e eVar) {
        C88060b.m153136a("FetchModelInfoByNameTask", "fetch single model info failed!, " + eVar.f195757b, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86858b(C86687a aVar, String str, int i) {
        super(null, aVar.f195443K);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f195817a = aVar;
        this.f195818b = str;
        this.f195819c = i;
    }
}

package com.bytedance.helios.sdk.p1095c.p1096a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.AbstractC15309g;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.p1099f.p1100a.AbstractC15438b;
import com.bytedance.helios.sdk.p1099f.p1102c.C15467r;
import com.bytedance.helios.sdk.utils.C15484f;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.c.a.b */
public final class C15380b implements AbstractC15309g {
    static {
        Covode.recordClassIndex(17632);
    }

    /* renamed from: com.bytedance.helios.sdk.c.a.b$a */
    static final class C15381a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f37515a;

        /* renamed from: b */
        final /* synthetic */ Map f37516b;

        /* renamed from: c */
        final /* synthetic */ C15318n f37517c;

        static {
            Covode.recordClassIndex(17633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15381a(Map.Entry entry, Map map, C15318n nVar) {
            super(0);
            this.f37515a = entry;
            this.f37516b = map;
            this.f37517c = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(((AbstractC15438b) this.f37515a.getValue()).mo25182a(this.f37517c));
        }
    }

    @Override // com.bytedance.helios.api.p1088b.AbstractC15309g
    /* renamed from: a */
    public final void mo24832a(C15318n nVar) {
        C89219l.m154719c(nVar, "");
        for (T t : HeliosEnvImpl.INSTANCE.getApiConfig().getApiInfoList(nVar.f37356b)) {
            Map d = C89041ag.m154431d(HeliosEnvImpl.INSTANCE.getBaseExpressionEnv());
            for (Map.Entry<String, AbstractC15438b> entry : HeliosEnvImpl.INSTANCE.getMonitorConditions().entrySet()) {
                d.put(entry.getKey(), new C15381a(entry, d, nVar));
            }
            for (T t2 : t.getMonitorConfigs()) {
                boolean a = C15467r.m28453a(t2.getEffectExpression(), d);
                C15484f.m28491a("Helios-Control-Api", "MonitorHandler isEffectConfig=" + a + " effectExpression=" + t2.getEffectExpression() + " id=" + nVar.f37356b + " startedTime=" + nVar.f37366l, (String) null, 12);
                if (a) {
                    nVar.f37379y.f37328d = t;
                    nVar.f37379y.f37329e = t2;
                    boolean a2 = C15467r.m28453a(t2.getConditionExpression(), d);
                    C15484f.m28491a("Helios-Control-Api", "MonitorHandler isCondition=" + a2 + " conditionExpression=" + t2.getConditionExpression() + " id=" + nVar.f37356b + " startedTime=" + nVar.f37366l, (String) null, 12);
                    if (a2) {
                        nVar.f37379y.f37331g.add(t2);
                    }
                }
            }
        }
    }
}

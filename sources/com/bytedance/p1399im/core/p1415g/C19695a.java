package com.bytedance.p1399im.core.p1415g;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1408d.C19586am;
import com.bytedance.p1399im.core.proto.ClientMetric;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.ReportClientMetricsRequestBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.g.a */
public final class C19695a extends AbstractC19927w {
    static {
        Covode.recordClassIndex(22539);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19695a() {
        super(IMCMD.REPORT_CLIENT_METRICS.getValue());
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar == null || kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.report_client_metrics_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31648a(int i, List<C19586am> list) {
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (C19586am amVar : list) {
                if (amVar != null) {
                    ClientMetric.Builder v = new ClientMetric.Builder().metric_type(amVar.f46500a).mo32077k(amVar.f46501b).mo32080v(Long.valueOf(amVar.f46502c));
                    if (amVar.f46503d != null) {
                        v.tags(amVar.f46503d);
                    }
                    arrayList.add(v.build());
                }
            }
            mo31798a(i, new RequestBody.Builder().report_client_metrics_body(new ReportClientMetricsRequestBody.Builder().report_metrics_list(arrayList).build()).build(), null, new Object[0]);
        }
    }
}

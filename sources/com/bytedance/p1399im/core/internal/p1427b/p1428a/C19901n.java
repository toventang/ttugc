package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.C19738a;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.proto.Config;
import com.bytedance.p1399im.core.proto.GetConfigsRequestBody;
import com.bytedance.p1399im.core.proto.GetConfigsResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.n */
public final class C19901n extends AbstractC19927w<Void> {
    static {
        Covode.recordClassIndex(22745);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19901n() {
        super(IMCMD.GET_CONFIGS.getValue());
    }

    /* renamed from: c */
    public final void mo31782c() {
        mo31798a(0, new RequestBody.Builder().get_configs_body(new GetConfigsRequestBody.Builder().build()).build(), null, new Object[0]);
    }

    public C19901n(AbstractC19479b<Void> bVar) {
        super(IMCMD.GET_CONFIGS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar == null || kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.get_configs_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
            return;
        }
        GetConfigsResponseBody getConfigsResponseBody = kVar.f47482f.body.get_configs_body;
        List<Config> list = getConfigsResponseBody.configs;
        if (list != null && !list.isEmpty()) {
            C19738a.f46919l = C19738a.m36932a(list);
            for (Config config : list) {
                if (!(config == null || config.conf_name == null || config.conf_value == null)) {
                    String str = config.conf_name;
                    str.hashCode();
                    switch (str.hashCode()) {
                        case -1702692503:
                            if (str.equals("p2pMinInterval")) {
                                C19738a.f46917j = C19996e.m37748a(config.conf_value, C19738a.f46917j);
                                break;
                            } else {
                                continue;
                            }
                        case -1302860124:
                            if (str.equals("conversationMsgRepairCount")) {
                                C19738a.f46914g = C19996e.m37746a(config.conf_value, C19738a.f46914g);
                                break;
                            } else {
                                continue;
                            }
                        case -1289425504:
                            if (str.equals("conversationMsgRepairRatio")) {
                                C19738a.f46915h = C19996e.m37745a(config.conf_value, C19738a.f46915h);
                                break;
                            } else {
                                continue;
                            }
                        case -1287953929:
                            if (str.equals("conversationMsgRepairStart")) {
                                C19738a.f46913f = C19996e.m37748a(config.conf_value, C19738a.f46913f);
                                break;
                            } else {
                                continue;
                            }
                        case -354402478:
                            if (str.equals("dbReportRate")) {
                                C19738a.f46918k = Float.valueOf(C19996e.m37745a(config.conf_value, C19738a.f46918k.floatValue()));
                                C20041s.m37876a();
                                C20041s.f47627a.mo27990a("db_report_rate", Float.valueOf(C19738a.f46918k.floatValue()));
                                break;
                            } else {
                                continue;
                            }
                        case 150002420:
                            if (str.equals("repairEnabled")) {
                                C19738a.f46911d = C19996e.m37755a(config.conf_value, C19738a.f46911d);
                                break;
                            } else {
                                continue;
                            }
                        case 849643188:
                            if (str.equals("autoPollingMsgEnabled")) {
                                C19738a.f46908a = C19996e.m37755a(config.conf_value, C19738a.f46908a);
                                break;
                            } else {
                                continue;
                            }
                        case 1056039696:
                            if (str.equals("conversationMsgRepairInterval")) {
                                C19738a.f46912e = C19996e.m37748a(config.conf_value, C19738a.f46912e);
                                break;
                            } else {
                                continue;
                            }
                        case 1217269700:
                            if (str.equals("defaultPollingMsgInterval")) {
                                C19738a.f46910c = C19996e.m37748a(config.conf_value, C19738a.f46910c);
                                break;
                            } else {
                                continue;
                            }
                        case 1263202419:
                            if (str.equals("p2pEnabled")) {
                                C19738a.f46916i = C19996e.m37755a(config.conf_value, C19738a.f46916i);
                                break;
                            } else {
                                continue;
                            }
                        case 2076115403:
                            if (str.equals("triggerPollingMsgEnabled")) {
                                C19738a.f46909b = C19996e.m37755a(config.conf_value, C19738a.f46909b);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
        String b = C19999h.f47538a.mo46674b(getConfigsResponseBody);
        C20041s.m37876a();
        C20041s.f47627a.mo27992a(C20041s.m37878a("imsdk_cloud_config"), b);
        mo31800a((Object) null);
    }
}

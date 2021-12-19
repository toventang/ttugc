package com.bytedance.helios.sdk.p1095c.p1096a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.ControlConfig;
import com.bytedance.helios.api.p1088b.AbstractC15309g;
import com.bytedance.helios.api.p1088b.C15302a;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.sdk.p1097d.C15401f;
import com.bytedance.helios.sdk.p1097d.C15403h;
import com.bytedance.helios.sdk.p1097d.C15407j;
import com.bytedance.helios.sdk.p1097d.C15410l;
import com.bytedance.helios.sdk.p1097d.C15418q;
import com.bytedance.helios.sdk.p1097d.C15423u;
import com.bytedance.helios.sdk.p1098e.C15430c;
import com.bytedance.helios.sdk.utils.C15481c;
import java.util.Set;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.c.a.a */
public final class C15379a implements AbstractC15309g {

    /* renamed from: a */
    private final C15380b f37514a;

    static {
        Covode.recordClassIndex(17631);
    }

    public C15379a(C15380b bVar) {
        C89219l.m154719c(bVar, "");
        this.f37514a = bVar;
    }

    @Override // com.bytedance.helios.api.p1088b.AbstractC15309g
    /* renamed from: a */
    public final void mo24832a(C15318n nVar) {
        C89219l.m154719c(nVar, "");
        if (C89219l.m154714a((Object) nVar.f37370p, (Object) "SensitiveApiException")) {
            this.f37514a.mo24832a(nVar);
        }
        Set<Object> set = nVar.f37379y.f37331g;
        if (set != null) {
            Set<ControlConfig> f = C89206ad.m154684f(set);
            for (ControlConfig controlConfig : f) {
                String warningType = controlConfig.getWarningType();
                if (warningType != null && !C89361p.m154870a((CharSequence) warningType)) {
                    Set<String> set2 = nVar.f37375u;
                    String warningType2 = controlConfig.getWarningType();
                    if (warningType2 == null) {
                        C89219l.m154707a();
                    }
                    set2.add(warningType2);
                }
                if (controlConfig.getUploadALog()) {
                    nVar.f37377w = true;
                }
                if (controlConfig.getFilterEventExtraInfo()) {
                    nVar.f37378x = true;
                }
            }
            if (!f.isEmpty()) {
                nVar.f37368n.put("hit_control_configs", C15481c.m28482a(f));
            }
            if (nVar.f37375u.contains("cross_region")) {
                nVar.f37368n.put("location_timeline", C15430c.m28383a());
            }
            String str = nVar.f37355a;
            if (C89219l.m154714a((Object) str, (Object) C15407j.f37617a)) {
                if (C89361p.m154929e((CharSequence) nVar.f37357c, (CharSequence) (C15407j.f37618b + '2'))) {
                    nVar.mo24860k(C15407j.f37618b + '2');
                } else {
                    nVar.mo24860k(C15407j.f37618b);
                }
                C15302a aVar = nVar.f37349A;
                if (aVar != null && aVar.f37318a > 0) {
                    nVar.f37354F.add("pair_not_close");
                }
            } else if (C89219l.m154714a((Object) str, (Object) C15401f.f37600a) || C89219l.m154714a((Object) str, (Object) "nar")) {
                nVar.mo24860k(C15401f.f37601b);
                C15302a aVar2 = nVar.f37349A;
                if (aVar2 != null && aVar2.f37318a > 0) {
                    nVar.f37354F.add("pair_not_close");
                }
            } else if (C89219l.m154714a((Object) str, (Object) C15423u.f37651a)) {
                nVar.mo24860k(C15423u.f37652b);
            } else if (C89219l.m154714a((Object) str, (Object) C15418q.f37639a)) {
                nVar.mo24860k(C15418q.f37640b);
            } else if (C89219l.m154714a((Object) str, (Object) C15410l.f37624a)) {
                nVar.mo24860k(C15410l.f37625b);
            } else if (C89219l.m154714a((Object) str, (Object) C15403h.f37606a)) {
                nVar.mo24860k(C15403h.f37607b);
                nVar.f37354F.add("service");
            }
            nVar.f37354F.addAll(nVar.f37375u);
            if (C89219l.m154714a((Object) nVar.f37351C, (Object) "jsb")) {
                nVar.f37354F.add("jsb");
            }
            if (C89361p.m154874b(nVar.f37370p, "AppOpsException_", false)) {
                nVar.f37354F.add("app_ops");
                String str2 = nVar.f37358d;
                switch (str2.hashCode()) {
                    case -1671423430:
                        if (!str2.equals("android:coarse_location")) {
                            return;
                        }
                        nVar.mo24860k(C15418q.f37640b);
                        return;
                    case -1220541694:
                        if (!str2.equals("android:read_phone_state")) {
                            return;
                        }
                        nVar.mo24860k(C15423u.f37652b);
                        return;
                    case -517868421:
                        if (!str2.equals("android:read_phone_numbers")) {
                            return;
                        }
                        nVar.mo24860k(C15423u.f37652b);
                        return;
                    case -210165041:
                        if (!str2.equals("android:fine_location")) {
                            return;
                        }
                        nVar.mo24860k(C15418q.f37640b);
                        return;
                    case 1191287187:
                        if (str2.equals("android:record_audio")) {
                            nVar.mo24860k(C15401f.f37601b);
                            return;
                        }
                        return;
                    case 1528082064:
                        if (str2.equals("android:camera")) {
                            nVar.mo24860k(C15407j.f37618b);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } else {
            throw new C89388w("null cannot be cast to non-null type");
        }
    }
}

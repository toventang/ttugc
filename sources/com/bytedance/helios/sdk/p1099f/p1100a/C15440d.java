package com.bytedance.helios.sdk.p1099f.p1100a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.ControlConfig;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.sdk.utils.C15481c;
import com.bytedance.helios.sdk.utils.C15484f;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.f.a.d */
public final class C15440d implements AbstractC15438b {

    /* renamed from: a */
    private final boolean f37688a;

    static {
        Covode.recordClassIndex(17692);
    }

    public C15440d(boolean z) {
        this.f37688a = z;
    }

    @Override // com.bytedance.helios.sdk.p1099f.p1100a.AbstractC15438b
    /* renamed from: a */
    public final boolean mo25182a(C15318n nVar) {
        boolean z;
        Map<String, String> extraInfo;
        C89219l.m154719c(nVar, "");
        ControlConfig controlConfig = (ControlConfig) nVar.f37379y.f37329e;
        String str = (controlConfig == null || (extraInfo = controlConfig.getExtraInfo()) == null) ? null : extraInfo.get("permissions");
        if (nVar.f37356b != 102600 || str == null || C89361p.m154870a((CharSequence) str)) {
            z = true;
        } else {
            Object[] objArr = nVar.f37379y.f37325a;
            Object[] objArr2 = objArr != null ? objArr[0] : null;
            List a = C15481c.m28483a(str, String[].class);
            if (objArr2 != null && (objArr2 instanceof Object[])) {
                Object[] objArr3 = objArr2;
                if (objArr3.length > 0) {
                    int size = a.size();
                    z = false;
                    for (int i = 0; i < size; i++) {
                        Object obj = a.get(i);
                        int length = objArr3.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int i4 = i3 + 1;
                            if (C89219l.m154714a(objArr3[i2], obj)) {
                                if (this.f37688a) {
                                    objArr2[i3] = "";
                                }
                                nVar.f37377w = true;
                                z = true;
                            }
                            i2++;
                            i3 = i4;
                        }
                    }
                    if (!z) {
                        return z;
                    }
                }
            }
            return false;
        }
        nVar.f37375u.add("parameter");
        C15484f.m28491a("Helios-Control-Api", "ParameterCondition isBlock=" + this.f37688a + " id=" + nVar.f37356b + " startedTime=" + nVar.f37366l, (String) null, 12);
        return z;
    }
}

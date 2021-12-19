package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65406cr;
import com.p2082ss.android.ugc.aweme.services.IVEABService;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.VEABServiceImpl */
public final class VEABServiceImpl implements IVEABService {
    static {
        Covode.recordClassIndex(76815);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IVEABService
    public final Map<String, C65406cr.AbstractC65407a> getVESDKABPropertyMap() {
        return C65460eo.m117186b();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IVEABService
    public final void clearPanel() {
        C63238c.f143571I.mo104599a().mo104580a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IVEABService
    public final C89378p<Object, Integer> getABValue(C65406cr.AbstractC65407a aVar) {
        C89219l.m154721d(aVar, "");
        return C63238c.f143571I.mo104600a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IVEABService
    public final void setABPanelValue(C65406cr.AbstractC65407a aVar, String str) {
        C89219l.m154721d(aVar, "");
        C65460eo eoVar = C63238c.f143571I;
        C89219l.m154721d(aVar, "");
        if (str == null) {
            eoVar.mo104599a().mo104592g(aVar);
            return;
        }
        C65406cr.EnumC65408b b = aVar.mo104594b();
        if (b != null) {
            int i = C65463ep.f147649b[b.ordinal()];
            if (i == 1) {
                try {
                    eoVar.mo104599a().mo104585a(aVar, Boolean.parseBoolean(str));
                } catch (Exception unused) {
                }
            } else if (i == 2) {
                eoVar.mo104599a().mo104582a(aVar, Integer.parseInt(str));
            } else if (i == 3) {
                eoVar.mo104599a().mo104583a(aVar, Long.parseLong(str));
            } else if (i == 4) {
                eoVar.mo104599a().mo104581a(aVar, Float.parseFloat(str));
            } else if (i == 5) {
                eoVar.mo104599a().mo104584a(aVar, str);
            }
        }
    }
}

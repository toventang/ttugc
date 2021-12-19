package com.p2082ss.ugc.live.sdk.msg.p4473d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87081e;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.sdk.msg.d.d */
public final class C87107d {

    /* renamed from: a */
    public static final C87107d f196379a = new C87107d();

    private C87107d() {
    }

    static {
        Covode.recordClassIndex(102903);
    }

    /* renamed from: a */
    public static final byte[] m150856a(C87081e eVar) {
        byte[] bArr;
        C89219l.m154719c(eVar, "");
        if (eVar.f196305e != null) {
            bArr = eVar.f196305e;
        } else if (eVar.f196306f != null) {
            bArr = eVar.f196306f.mo13099a();
        } else {
            Map<String, String> map = eVar.f196308h;
            if (map == null || map.isEmpty()) {
                bArr = new byte[0];
            } else {
                bArr = C87105b.m150853a(eVar.f196308h);
            }
        }
        C89219l.m154709a((Object) bArr, "");
        return bArr;
    }
}

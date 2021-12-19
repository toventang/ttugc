package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2823b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.b.f */
public final class C43465f extends AbstractC43460a {

    /* renamed from: a */
    private final boolean f101387a;

    /* renamed from: b */
    private final String f101388b;

    static {
        Covode.recordClassIndex(51694);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        C89378p[] pVarArr = new C89378p[1];
        if (this.f101387a) {
            str = "1";
        } else {
            str = "0";
        }
        pVarArr[0] = C89387v.m154943a("is_fail", str);
        HashMap<String, Object> c = C89041ag.m154428c(pVarArr);
        if (!this.f101387a) {
            c.put("fail_reason", this.f101388b);
        }
        return c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43465f(boolean z, String str) {
        super("tiktokec_edit_address_save_click_result");
        C89219l.m154721d(str, "");
        this.f101387a = z;
        this.f101388b = str;
    }
}

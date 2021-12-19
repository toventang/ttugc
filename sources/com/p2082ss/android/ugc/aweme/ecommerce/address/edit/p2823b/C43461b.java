package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2823b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.b.b */
public final class C43461b extends AbstractC43460a {

    /* renamed from: a */
    private final String f101381a;

    /* renamed from: b */
    private final Boolean f101382b;

    /* renamed from: c */
    private final String f101383c;

    static {
        Covode.recordClassIndex(51690);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        String str;
        HashMap<String, Object> c = C89041ag.m154428c(C89387v.m154943a("button_for", this.f101381a));
        Boolean bool = this.f101382b;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "1";
            } else {
                str = "0";
            }
            c.put("is_default_address", str);
        }
        String str2 = this.f101383c;
        if (str2 != null) {
            c.put("is_email_valid", str2);
        }
        return c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43461b(String str, Boolean bool, String str2) {
        super("tiktokec_shipping_address_page_button_click");
        C89219l.m154721d(str, "");
        this.f101381a = str;
        this.f101382b = bool;
        this.f101383c = str2;
    }
}

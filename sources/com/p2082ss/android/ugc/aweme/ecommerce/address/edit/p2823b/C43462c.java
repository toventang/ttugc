package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2823b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.b.c */
public final class C43462c extends AbstractC43460a {

    /* renamed from: a */
    private final String f101384a;

    /* renamed from: b */
    private final String f101385b;

    static {
        Covode.recordClassIndex(51691);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return C89041ag.m154428c(C89387v.m154943a("button_for", this.f101385b), C89387v.m154943a("popup_for", this.f101384a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43462c(String str, String str2) {
        super("tiktokec_edit_address_popup_button_click");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f101384a = str;
        this.f101385b = str2;
    }
}

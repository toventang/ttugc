package com.bytedance.ies.xbridge.system.p1357b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.system.p1356a.AbstractC18850c;
import com.bytedance.ies.xbridge.system.p1361c.C18900d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.b.c */
public final class C18879c extends AbstractC18850c {
    static {
        Covode.recordClassIndex(21589);
    }

    @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18850c
    /* renamed from: a */
    public final void mo29835a(C18900d dVar, AbstractC18850c.AbstractC18851a aVar, EnumC18483e eVar) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        String str = dVar.f44738a;
        if (str == null) {
            C89219l.m154710a("phoneNumber");
        }
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null));
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29837a("Context not provided in host");
            return;
        }
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
        aVar.mo29836a(new C18745b(), "");
    }
}

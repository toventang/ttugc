package com.bytedance.ies.xbridge.system.p1357b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.system.p1356a.AbstractC18856e;
import com.bytedance.ies.xbridge.system.p1361c.C18904f;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.b.e */
public final class C18885e extends AbstractC18856e {
    static {
        Covode.recordClassIndex(21595);
    }

    @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18856e
    /* renamed from: a */
    public final void mo29841a(C18904f fVar, AbstractC18856e.AbstractC18857a aVar, EnumC18483e eVar) {
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29843a("Context not provided in host");
            return;
        }
        String str = fVar.f44742a;
        if (str == null) {
            C89219l.m154710a("phoneNumber");
        }
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("smsto", str, null));
        String str2 = fVar.f44743b;
        if (str2 == null) {
            C89219l.m154710a("content");
        }
        intent.putExtra("sms_body", str2);
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
        aVar.mo29842a(new C18745b(), "");
    }
}

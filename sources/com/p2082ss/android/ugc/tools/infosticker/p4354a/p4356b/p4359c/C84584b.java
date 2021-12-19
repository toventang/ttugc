package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4359c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50690b;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84603k;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.b */
public final class C84584b implements AbstractC84603k {

    /* renamed from: a */
    private final String f189036a;

    static {
        Covode.recordClassIndex(98549);
    }

    public C84584b(String str) {
        C89219l.m154721d(str, "");
        this.f189036a = str;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84603k
    /* renamed from: b */
    public final boolean mo129521b(InfoStickerEffect infoStickerEffect) {
        C89219l.m154721d(infoStickerEffect, "");
        return C84902i.m145892a(mo129520a(infoStickerEffect));
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84603k
    /* renamed from: a */
    public final String mo129520a(InfoStickerEffect infoStickerEffect) {
        C89219l.m154721d(infoStickerEffect, "");
        return C50690b.m94983a(this.f189036a) + infoStickerEffect.getId() + ".gif";
    }
}

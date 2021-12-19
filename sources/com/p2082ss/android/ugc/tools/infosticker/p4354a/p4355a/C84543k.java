package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.a.k */
public final class C84543k {

    /* renamed from: a */
    public final ProviderEffect f188948a;

    /* renamed from: b */
    public final C84545m f188949b;

    /* renamed from: c */
    public final Integer f188950c;

    /* renamed from: d */
    public final Exception f188951d;

    static {
        Covode.recordClassIndex(98508);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84543k)) {
            return false;
        }
        C84543k kVar = (C84543k) obj;
        return C89219l.m154714a(this.f188948a, kVar.f188948a) && C89219l.m154714a(this.f188949b, kVar.f188949b) && C89219l.m154714a(this.f188950c, kVar.f188950c) && C89219l.m154714a(this.f188951d, kVar.f188951d);
    }

    public final int hashCode() {
        ProviderEffect providerEffect = this.f188948a;
        int i = 0;
        int hashCode = (providerEffect != null ? providerEffect.hashCode() : 0) * 31;
        C84545m mVar = this.f188949b;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        Integer num = this.f188950c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Exception exc = this.f188951d;
        if (exc != null) {
            i = exc.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "InfoStickerProviderDownloadEvent(sticker=" + this.f188948a + ", info=" + this.f188949b + ", progress=" + this.f188950c + ", exception=" + this.f188951d + ")";
    }

    public /* synthetic */ C84543k(ProviderEffect providerEffect, C84545m mVar) {
        this(providerEffect, mVar, null, null);
    }

    public C84543k(ProviderEffect providerEffect, C84545m mVar, Integer num, Exception exc) {
        C89219l.m154721d(providerEffect, "");
        C89219l.m154721d(mVar, "");
        this.f188948a = providerEffect;
        this.f188949b = mVar;
        this.f188950c = num;
        this.f188951d = exc;
    }
}

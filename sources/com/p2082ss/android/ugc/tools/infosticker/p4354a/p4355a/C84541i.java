package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.a.i */
public final class C84541i {

    /* renamed from: a */
    public final InfoStickerEffect f188940a;

    /* renamed from: b */
    public final C84547o f188941b;

    /* renamed from: c */
    public final Integer f188942c;

    /* renamed from: d */
    public final Exception f188943d;

    static {
        Covode.recordClassIndex(98506);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84541i)) {
            return false;
        }
        C84541i iVar = (C84541i) obj;
        return C89219l.m154714a(this.f188940a, iVar.f188940a) && C89219l.m154714a(this.f188941b, iVar.f188941b) && C89219l.m154714a(this.f188942c, iVar.f188942c) && C89219l.m154714a(this.f188943d, iVar.f188943d);
    }

    public final int hashCode() {
        InfoStickerEffect infoStickerEffect = this.f188940a;
        int i = 0;
        int hashCode = (infoStickerEffect != null ? infoStickerEffect.hashCode() : 0) * 31;
        C84547o oVar = this.f188941b;
        int hashCode2 = (hashCode + (oVar != null ? oVar.hashCode() : 0)) * 31;
        Integer num = this.f188942c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Exception exc = this.f188943d;
        if (exc != null) {
            i = exc.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "InfoStickerEffectDownloadEvent(sticker=" + this.f188940a + ", info=" + this.f188941b + ", progress=" + this.f188942c + ", exception=" + this.f188943d + ")";
    }

    public /* synthetic */ C84541i(InfoStickerEffect infoStickerEffect, C84547o oVar) {
        this(infoStickerEffect, oVar, null, null);
    }

    public C84541i(InfoStickerEffect infoStickerEffect, C84547o oVar, Integer num, Exception exc) {
        C89219l.m154721d(infoStickerEffect, "");
        C89219l.m154721d(oVar, "");
        this.f188940a = infoStickerEffect;
        this.f188941b = oVar;
        this.f188942c = num;
        this.f188943d = exc;
    }
}

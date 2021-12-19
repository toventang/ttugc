package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.a.j */
public final class C84542j {

    /* renamed from: a */
    public final InfoStickerEffect f188944a;

    /* renamed from: b */
    public final C84550r f188945b;

    /* renamed from: c */
    public final Integer f188946c;

    /* renamed from: d */
    public final Exception f188947d;

    static {
        Covode.recordClassIndex(98507);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84542j)) {
            return false;
        }
        C84542j jVar = (C84542j) obj;
        return C89219l.m154714a(this.f188944a, jVar.f188944a) && C89219l.m154714a(this.f188945b, jVar.f188945b) && C89219l.m154714a(this.f188946c, jVar.f188946c) && C89219l.m154714a(this.f188947d, jVar.f188947d);
    }

    public final int hashCode() {
        InfoStickerEffect infoStickerEffect = this.f188944a;
        int i = 0;
        int hashCode = (infoStickerEffect != null ? infoStickerEffect.hashCode() : 0) * 31;
        C84550r rVar = this.f188945b;
        int hashCode2 = (hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        Integer num = this.f188946c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Exception exc = this.f188947d;
        if (exc != null) {
            i = exc.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "InfoStickerNewDownloadEvent(effect=" + this.f188944a + ", info=" + this.f188945b + ", progress=" + this.f188946c + ", exception=" + this.f188947d + ")";
    }
}

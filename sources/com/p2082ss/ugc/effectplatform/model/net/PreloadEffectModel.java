package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.PreloadEffectModel */
public final class PreloadEffectModel {
    private final String effect_id;
    private final String md5;

    static {
        Covode.recordClassIndex(102592);
    }

    public final String getEffect_id() {
        return this.effect_id;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final int hashCode() {
        return (this.effect_id.hashCode() * 31) + this.md5.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C89219l.m154714a(C89204ab.m154669a(getClass()), C89204ab.m154669a(obj.getClass())))) {
            return false;
        }
        PreloadEffectModel preloadEffectModel = (PreloadEffectModel) obj;
        if (!(!C89219l.m154714a((Object) this.effect_id, (Object) preloadEffectModel.effect_id)) && !(!C89219l.m154714a((Object) this.md5, (Object) preloadEffectModel.md5))) {
            return true;
        }
        return false;
    }

    public PreloadEffectModel(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.effect_id = str;
        this.md5 = str2;
    }
}

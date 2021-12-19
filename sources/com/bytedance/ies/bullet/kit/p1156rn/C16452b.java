package com.bytedance.ies.bullet.kit.p1156rn;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1880e.C24420i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.rn.b */
public final class C16452b {

    /* renamed from: a */
    public final C24420i f39507a;

    static {
        Covode.recordClassIndex(18774);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C16452b) && C89219l.m154714a(this.f39507a, ((C16452b) obj).f39507a);
        }
        return true;
    }

    public final int hashCode() {
        C24420i iVar = this.f39507a;
        if (iVar != null) {
            return iVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FrescoConfig(imagePipelineConfig=" + this.f39507a + ")";
    }
}

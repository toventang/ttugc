package com.p2082ss.android.ugc.aweme.geofencing.p3047c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.geofencing.c.b */
public final class C52892b {
    @AbstractC27891c(mo46611a = "translations")

    /* renamed from: a */
    public final List<C52891a> f121662a;

    static {
        Covode.recordClassIndex(62297);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C52892b) && C89219l.m154714a(this.f121662a, ((C52892b) obj).f121662a);
        }
        return true;
    }

    public final int hashCode() {
        List<C52891a> list = this.f121662a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Translations(translations=" + this.f121662a + ")";
    }
}

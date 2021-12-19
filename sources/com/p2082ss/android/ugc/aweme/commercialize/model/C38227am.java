package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.am */
public final class C38227am {
    @AbstractC27891c(mo46611a = "seconds")

    /* renamed from: a */
    public final int f90315a = 0;
    @AbstractC27891c(mo46611a = "url_list")

    /* renamed from: b */
    public final List<String> f90316b = null;

    static {
        Covode.recordClassIndex(45711);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38227am)) {
            return false;
        }
        C38227am amVar = (C38227am) obj;
        return this.f90315a == amVar.f90315a && C89219l.m154714a(this.f90316b, amVar.f90316b);
    }

    public final int hashCode() {
        int i = this.f90315a * 31;
        List<String> list = this.f90316b;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PlaybackSecondsTrack(seconds=" + this.f90315a + ", urlList=" + this.f90316b + ")";
    }

    private C38227am() {
    }
}

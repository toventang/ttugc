package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settings.z */
public final class C68762z {
    @AbstractC27891c(mo46611a = "dimensional")

    /* renamed from: a */
    public final int f153809a = 0;
    @AbstractC27891c(mo46611a = "keyword_list")

    /* renamed from: b */
    public final String[] f153810b = null;

    static {
        Covode.recordClassIndex(81031);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68762z)) {
            return false;
        }
        C68762z zVar = (C68762z) obj;
        return this.f153809a == zVar.f153809a && C89219l.m154714a(this.f153810b, zVar.f153810b);
    }

    public final int hashCode() {
        int i = this.f153809a * 31;
        String[] strArr = this.f153810b;
        return i + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final String toString() {
        return "PopupBlockList(dimensional=" + this.f153809a + ", keywordList=" + Arrays.toString(this.f153810b) + ")";
    }

    private C68762z() {
    }
}

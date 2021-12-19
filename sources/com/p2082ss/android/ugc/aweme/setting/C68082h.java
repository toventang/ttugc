package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.h */
public final class C68082h {
    @AbstractC27891c(mo46611a = "locale")

    /* renamed from: a */
    public final List<String> f152478a = null;

    static {
        Covode.recordClassIndex(80278);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C68082h) && C89219l.m154714a(this.f152478a, ((C68082h) obj).f152478a);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.f152478a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CreatorLocale(locale=" + this.f152478a + ")";
    }

    private C68082h() {
    }
}

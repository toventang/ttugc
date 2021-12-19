package com.p2082ss.android.ugc.aweme.challenge.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.data.a */
public final class C35505a {
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    public final String f83732a;
    @AbstractC27891c(mo46611a = "is_private")

    /* renamed from: b */
    public Boolean f83733b;

    static {
        Covode.recordClassIndex(42699);
    }

    public final int hashCode() {
        int i;
        String str = this.f83732a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + (C89219l.m154714a(this.f83733b, true) ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.data.LocalHashTag");
        C35505a aVar = (C35505a) obj;
        if (!(!C89219l.m154714a((Object) this.f83732a, (Object) aVar.f83732a)) && !(!C89219l.m154714a(this.f83733b, aVar.f83733b))) {
            return true;
        }
        return false;
    }

    public C35505a(String str, Boolean bool) {
        C89219l.m154721d(str, "");
        this.f83732a = str;
        this.f83733b = bool;
    }
}

package com.p2082ss.android.ugc.aweme.contentlanguage.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.api.a */
public final class C40186a {

    /* renamed from: a */
    public final List<C68343a> f94359a;

    /* renamed from: b */
    public final List<C68343a> f94360b;

    static {
        Covode.recordClassIndex(47981);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40186a)) {
            return false;
        }
        C40186a aVar = (C40186a) obj;
        return C89219l.m154714a(this.f94359a, aVar.f94359a) && C89219l.m154714a(this.f94360b, aVar.f94360b);
    }

    public final int hashCode() {
        List<C68343a> list = this.f94359a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C68343a> list2 = this.f94360b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ContentLanguageResult(selected=" + this.f94359a + ", unselect=" + this.f94360b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.setting.serverpush.a.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.setting.serverpush.a.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40186a(List<? extends C68343a> list, List<? extends C68343a> list2) {
        this.f94359a = list;
        this.f94360b = list2;
    }
}

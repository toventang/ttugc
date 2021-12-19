package com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.e */
public final class C59858e {

    /* renamed from: a */
    public final Integer f136342a;

    /* renamed from: b */
    public final List<Aweme> f136343b;

    /* renamed from: c */
    public final boolean f136344c;

    static {
        Covode.recordClassIndex(70263);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59858e)) {
            return false;
        }
        C59858e eVar = (C59858e) obj;
        return C89219l.m154714a(this.f136342a, eVar.f136342a) && C89219l.m154714a(this.f136343b, eVar.f136343b) && this.f136344c == eVar.f136344c;
    }

    public final int hashCode() {
        Integer num = this.f136342a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<Aweme> list = this.f136343b;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f136344c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "PanelState(event=" + this.f136342a + ", list=" + this.f136343b + ", hasMore=" + this.f136344c + ")";
    }

    private /* synthetic */ C59858e() {
        this(null, null, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59858e(Integer num, List<? extends Aweme> list, boolean z) {
        this.f136342a = num;
        this.f136343b = list;
        this.f136344c = z;
    }
}

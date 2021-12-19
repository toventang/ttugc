package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.model.c */
public final class C77380c implements Serializable {
    @AbstractC27891c(mo46611a = "statistic")

    /* renamed from: a */
    private final C77382e f173619a;
    @AbstractC27891c(mo46611a = "items")

    /* renamed from: b */
    private final List<Aweme> f173620b;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: c */
    private final String f173621c;

    static {
        Covode.recordClassIndex(90410);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.model.c */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C77380c copy$default(C77380c cVar, C77382e eVar, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = cVar.f173619a;
        }
        if ((i & 2) != 0) {
            list = cVar.f173620b;
        }
        if ((i & 4) != 0) {
            str = cVar.f173621c;
        }
        return cVar.copy(eVar, list, str);
    }

    public final C77382e component1() {
        return this.f173619a;
    }

    public final List<Aweme> component2() {
        return this.f173620b;
    }

    public final String component3() {
        return this.f173621c;
    }

    public final C77380c copy(C77382e eVar, List<? extends Aweme> list, String str) {
        return new C77380c(eVar, list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77380c)) {
            return false;
        }
        C77380c cVar = (C77380c) obj;
        return C89219l.m154714a(this.f173619a, cVar.f173619a) && C89219l.m154714a(this.f173620b, cVar.f173620b) && C89219l.m154714a(this.f173621c, cVar.f173621c);
    }

    public final int hashCode() {
        C77382e eVar = this.f173619a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        List<Aweme> list = this.f173620b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f173621c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "StoryArchDetail(statistic=" + this.f173619a + ", items=" + this.f173620b + ", extra=" + this.f173621c + ")";
    }

    public final String getExtra() {
        return this.f173621c;
    }

    public final List<Aweme> getItems() {
        return this.f173620b;
    }

    public final C77382e getStatistic() {
        return this.f173619a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public C77380c(C77382e eVar, List<? extends Aweme> list, String str) {
        this.f173619a = eVar;
        this.f173620b = list;
        this.f173621c = str;
    }
}

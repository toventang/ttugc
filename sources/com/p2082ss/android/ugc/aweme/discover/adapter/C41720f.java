package com.p2082ss.android.ugc.aweme.discover.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.f */
public final class C41720f extends SearchMusic {

    /* renamed from: a */
    private boolean f97332a;

    /* renamed from: b */
    private final List<Music> f97333b;

    static {
        Covode.recordClassIndex(49633);
    }

    public C41720f() {
        this(false, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.adapter.f */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41720f copy$default(C41720f fVar, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fVar.f97332a;
        }
        if ((i & 2) != 0) {
            list = fVar.f97333b;
        }
        return fVar.copy(z, list);
    }

    public final boolean component1() {
        return this.f97332a;
    }

    public final List<Music> component2() {
        return this.f97333b;
    }

    public final C41720f copy(boolean z, List<Music> list) {
        C89219l.m154721d(list, "");
        return new C41720f(z, list);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchMusic
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41720f)) {
            return false;
        }
        C41720f fVar = (C41720f) obj;
        return this.f97332a == fVar.f97332a && C89219l.m154714a(this.f97333b, fVar.f97333b);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchMusic
    public final int hashCode() {
        boolean z = this.f97332a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        List<Music> list = this.f97333b;
        return i4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ClusterButtonData(isMobShowSent=" + this.f97332a + ", clusterList=" + this.f97333b + ")";
    }

    public final List<Music> getClusterList() {
        return this.f97333b;
    }

    public final boolean isMobShowSent() {
        return this.f97332a;
    }

    public final void setMobShowSent(boolean z) {
        this.f97332a = z;
    }

    public C41720f(boolean z, List<Music> list) {
        C89219l.m154721d(list, "");
        this.f97332a = z;
        this.f97333b = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41720f(boolean z, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : list);
    }
}

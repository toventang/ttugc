package com.p2082ss.android.ugc.aweme.autoplay.p2346b;

import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.b.h */
public final class C34105h {

    /* renamed from: a */
    public final C42410g f80637a;

    /* renamed from: b */
    public final C67568r f80638b;

    /* renamed from: c */
    public final List<Aweme> f80639c;

    /* renamed from: d */
    public final ArrayList<Long> f80640d;

    /* renamed from: e */
    public final List<RoomInfo> f80641e;

    /* renamed from: f */
    public final Long f80642f;

    static {
        Covode.recordClassIndex(41039);
    }

    public C34105h() {
        this(null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34105h)) {
            return false;
        }
        C34105h hVar = (C34105h) obj;
        return C89219l.m154714a(this.f80637a, hVar.f80637a) && C89219l.m154714a(this.f80638b, hVar.f80638b) && C89219l.m154714a(this.f80639c, hVar.f80639c) && C89219l.m154714a(this.f80640d, hVar.f80640d) && C89219l.m154714a(this.f80641e, hVar.f80641e) && C89219l.m154714a(this.f80642f, hVar.f80642f);
    }

    public final int hashCode() {
        C42410g gVar = this.f80637a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        C67568r rVar = this.f80638b;
        int hashCode2 = (hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        List<Aweme> list = this.f80639c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ArrayList<Long> arrayList = this.f80640d;
        int hashCode4 = (hashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        List<RoomInfo> list2 = this.f80641e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Long l = this.f80642f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "TopLiveData(cardInfo=" + this.f80637a + ", mobParam=" + this.f80638b + ", roomList=" + this.f80639c + ", roomIdList=" + this.f80640d + ", roomInfoList=" + this.f80641e + ", startCursor=" + this.f80642f + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34105h(C67568r rVar, List list, Long l, int i) {
        this(null, (i & 2) != 0 ? null : rVar, (i & 4) != 0 ? null : list, null, null, (i & 32) == 0 ? l : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> */
    /* JADX WARN: Multi-variable type inference failed */
    public C34105h(C42410g gVar, C67568r rVar, List<? extends Aweme> list, ArrayList<Long> arrayList, List<? extends RoomInfo> list2, Long l) {
        this.f80637a = gVar;
        this.f80638b = rVar;
        this.f80639c = list;
        this.f80640d = arrayList;
        this.f80641e = list2;
        this.f80642f = l;
    }
}

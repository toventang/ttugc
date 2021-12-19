package com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.AbstractC36030a;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.AbstractC36034b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.c */
public final class C36038c {

    /* renamed from: a */
    public final MusicModel f85124a;

    /* renamed from: b */
    public AbstractC36030a f85125b;

    /* renamed from: c */
    public AbstractC36034b f85126c;

    static {
        Covode.recordClassIndex(43286);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36038c)) {
            return false;
        }
        C36038c cVar = (C36038c) obj;
        return C89219l.m154714a(this.f85124a, cVar.f85124a) && C89219l.m154714a(this.f85125b, cVar.f85125b) && C89219l.m154714a(this.f85126c, cVar.f85126c);
    }

    public final int hashCode() {
        MusicModel musicModel = this.f85124a;
        int i = 0;
        int hashCode = (musicModel != null ? musicModel.hashCode() : 0) * 31;
        AbstractC36030a aVar = this.f85125b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC36034b bVar = this.f85126c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "MusicStatus(musicModel=" + this.f85124a + ", loadStatus=" + this.f85125b + ", playStatus=" + this.f85126c + ")";
    }

    public /* synthetic */ C36038c(MusicModel musicModel) {
        this(musicModel, AbstractC36030a.C36033c.f85120a, AbstractC36034b.C36037c.f85123a);
    }

    private C36038c(MusicModel musicModel, AbstractC36030a aVar, AbstractC36034b bVar) {
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f85124a = musicModel;
        this.f85125b = aVar;
        this.f85126c = bVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C36038c m73465a(C36038c cVar, MusicModel musicModel, AbstractC36030a aVar, AbstractC36034b bVar, int i) {
        if ((i & 1) != 0) {
            musicModel = cVar.f85124a;
        }
        if ((i & 2) != 0) {
            aVar = cVar.f85125b;
        }
        if ((i & 4) != 0) {
            bVar = cVar.f85126c;
        }
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        return new C36038c(musicModel, aVar, bVar);
    }
}

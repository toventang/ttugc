package com.p2082ss.android.ugc.aweme.music.assem.video;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.video.e */
public final class C60706e implements AbstractC12853j {

    /* renamed from: a */
    public final MusicModel f137934a;

    /* renamed from: b */
    public final EnumC60707f f137935b;

    static {
        Covode.recordClassIndex(71262);
    }

    /* renamed from: a */
    public static C60706e m110228a(MusicModel musicModel, EnumC60707f fVar) {
        C89219l.m154721d(fVar, "");
        return new C60706e(musicModel, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60706e)) {
            return false;
        }
        C60706e eVar = (C60706e) obj;
        return C89219l.m154714a(this.f137934a, eVar.f137934a) && C89219l.m154714a(this.f137935b, eVar.f137935b);
    }

    public final int hashCode() {
        MusicModel musicModel = this.f137934a;
        int i = 0;
        int hashCode = (musicModel != null ? musicModel.hashCode() : 0) * 31;
        EnumC60707f fVar = this.f137935b;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MusicState(playingModel=" + this.f137934a + ", playingStatus=" + this.f137935b + ")";
    }

    public /* synthetic */ C60706e() {
        this(null, EnumC60707f.Default);
    }

    private C60706e(MusicModel musicModel, EnumC60707f fVar) {
        C89219l.m154721d(fVar, "");
        this.f137934a = musicModel;
        this.f137935b = fVar;
    }
}

package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.g.f */
public final class C57271f {

    /* renamed from: a */
    public MusicModel f130451a;

    /* renamed from: b */
    public int f130452b;

    /* renamed from: c */
    public boolean f130453c;

    static {
        Covode.recordClassIndex(67176);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57271f)) {
            return false;
        }
        C57271f fVar = (C57271f) obj;
        return C89219l.m154714a(this.f130451a, fVar.f130451a) && this.f130452b == fVar.f130452b && this.f130453c == fVar.f130453c;
    }

    public final int hashCode() {
        MusicModel musicModel = this.f130451a;
        int hashCode = (((musicModel != null ? musicModel.hashCode() : 0) * 31) + this.f130452b) * 31;
        boolean z = this.f130453c;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "PlayMusicInfo(musicModel=" + this.f130451a + ", pageType=" + this.f130452b + ", isLoop=" + this.f130453c + ")";
    }

    public C57271f(MusicModel musicModel, int i, boolean z) {
        this.f130451a = musicModel;
        this.f130452b = i;
        this.f130453c = z;
    }
}

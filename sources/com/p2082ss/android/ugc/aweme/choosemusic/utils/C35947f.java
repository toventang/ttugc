package com.p2082ss.android.ugc.aweme.choosemusic.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.f */
public final class C35947f {

    /* renamed from: a */
    public MusicModel f84840a;

    /* renamed from: b */
    public int f84841b;

    /* renamed from: c */
    public boolean f84842c;

    static {
        Covode.recordClassIndex(43189);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35947f)) {
            return false;
        }
        C35947f fVar = (C35947f) obj;
        return C89219l.m154714a(this.f84840a, fVar.f84840a) && this.f84841b == fVar.f84841b && this.f84842c == fVar.f84842c;
    }

    public final int hashCode() {
        MusicModel musicModel = this.f84840a;
        int hashCode = (((musicModel != null ? musicModel.hashCode() : 0) * 31) + this.f84841b) * 31;
        boolean z = this.f84842c;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "PlayMusicInfo(musicModel=" + this.f84840a + ", pageType=" + this.f84841b + ", isLoop=" + this.f84842c + ")";
    }

    public C35947f(MusicModel musicModel, int i, boolean z) {
        this.f84840a = musicModel;
        this.f84841b = i;
        this.f84842c = z;
    }
}

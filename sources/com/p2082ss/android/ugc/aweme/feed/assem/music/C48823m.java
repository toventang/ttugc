package com.p2082ss.android.ugc.aweme.feed.assem.music;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.music.m */
public final class C48823m implements AbstractC12853j {

    /* renamed from: a */
    public final Music f112696a;

    /* renamed from: b */
    public final boolean f112697b;

    /* renamed from: c */
    public final boolean f112698c;

    /* renamed from: d */
    public final boolean f112699d;

    /* renamed from: e */
    public final boolean f112700e;

    /* renamed from: f */
    public final boolean f112701f;

    static {
        Covode.recordClassIndex(57609);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48823m)) {
            return false;
        }
        C48823m mVar = (C48823m) obj;
        return C89219l.m154714a(this.f112696a, mVar.f112696a) && this.f112697b == mVar.f112697b && this.f112698c == mVar.f112698c && this.f112699d == mVar.f112699d && this.f112700e == mVar.f112700e && this.f112701f == mVar.f112701f;
    }

    public final int hashCode() {
        Music music = this.f112696a;
        int hashCode = (music != null ? music.hashCode() : 0) * 31;
        boolean z = this.f112697b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.f112698c;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.f112699d;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.f112700e;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        if (!this.f112701f) {
            i = 0;
        }
        return i17 + i;
    }

    public final String toString() {
        return "VideoMusicCoverState(music=" + this.f112696a + ", isScheduleVideo=" + this.f112697b + ", startMusicAnimation=" + this.f112698c + ", startNotesAnimation=" + this.f112699d + ", pauseNotesAnimation=" + this.f112700e + ", stopNotesAnimation=" + this.f112701f + ")";
    }

    public /* synthetic */ C48823m() {
        this(null, false, false, false, false, false);
    }

    private C48823m(Music music, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f112696a = music;
        this.f112697b = z;
        this.f112698c = z2;
        this.f112699d = z3;
        this.f112700e = z4;
        this.f112701f = z5;
    }

    /* renamed from: a */
    public static /* synthetic */ C48823m m92084a(C48823m mVar, Music music, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        boolean z6 = z5;
        boolean z7 = z4;
        Music music2 = music;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        if ((i & 1) != 0) {
            music2 = mVar.f112696a;
        }
        if ((i & 2) != 0) {
            z8 = mVar.f112697b;
        }
        if ((i & 4) != 0) {
            z9 = mVar.f112698c;
        }
        if ((i & 8) != 0) {
            z10 = mVar.f112699d;
        }
        if ((i & 16) != 0) {
            z7 = mVar.f112700e;
        }
        if ((i & 32) != 0) {
            z6 = mVar.f112701f;
        }
        return new C48823m(music2, z8, z9, z10, z7, z6);
    }
}

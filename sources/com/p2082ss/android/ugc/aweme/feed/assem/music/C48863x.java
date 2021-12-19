package com.p2082ss.android.ugc.aweme.feed.assem.music;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.music.x */
public final class C48863x implements AbstractC12853j {

    /* renamed from: a */
    public final Music f112744a;

    /* renamed from: b */
    public final boolean f112745b;

    /* renamed from: c */
    public final AwemeRawAd f112746c;

    /* renamed from: d */
    public final boolean f112747d;

    /* renamed from: e */
    public final boolean f112748e;

    /* renamed from: f */
    public final boolean f112749f;

    static {
        Covode.recordClassIndex(57649);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48863x)) {
            return false;
        }
        C48863x xVar = (C48863x) obj;
        return C89219l.m154714a(this.f112744a, xVar.f112744a) && this.f112745b == xVar.f112745b && C89219l.m154714a(this.f112746c, xVar.f112746c) && this.f112747d == xVar.f112747d && this.f112748e == xVar.f112748e && this.f112749f == xVar.f112749f;
    }

    public final int hashCode() {
        Music music = this.f112744a;
        int i = 0;
        int hashCode = (music != null ? music.hashCode() : 0) * 31;
        boolean z = this.f112745b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        AwemeRawAd awemeRawAd = this.f112746c;
        if (awemeRawAd != null) {
            i = awemeRawAd.hashCode();
        }
        int i7 = (i6 + i) * 31;
        boolean z2 = this.f112747d;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f112748e;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        if (!this.f112749f) {
            i2 = 0;
        }
        return i15 + i2;
    }

    public final String toString() {
        return "VideoMusicTitleState(music=" + this.f112744a + ", isScheduleVideo=" + this.f112745b + ", awemeRawAd=" + this.f112746c + ", startMusicAnimation=" + this.f112747d + ", pauseNotesAnimation=" + this.f112748e + ", stopNotesAnimation=" + this.f112749f + ")";
    }

    public /* synthetic */ C48863x() {
        this(null, false, null, false, false, false);
    }

    private C48863x(Music music, boolean z, AwemeRawAd awemeRawAd, boolean z2, boolean z3, boolean z4) {
        this.f112744a = music;
        this.f112745b = z;
        this.f112746c = awemeRawAd;
        this.f112747d = z2;
        this.f112748e = z3;
        this.f112749f = z4;
    }

    /* renamed from: a */
    public static /* synthetic */ C48863x m92094a(C48863x xVar, Music music, boolean z, AwemeRawAd awemeRawAd, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5 = z4;
        boolean z6 = z3;
        Music music2 = music;
        boolean z7 = z;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        boolean z8 = z2;
        if ((i & 1) != 0) {
            music2 = xVar.f112744a;
        }
        if ((i & 2) != 0) {
            z7 = xVar.f112745b;
        }
        if ((i & 4) != 0) {
            awemeRawAd2 = xVar.f112746c;
        }
        if ((i & 8) != 0) {
            z8 = xVar.f112747d;
        }
        if ((i & 16) != 0) {
            z6 = xVar.f112748e;
        }
        if ((i & 32) != 0) {
            z5 = xVar.f112749f;
        }
        return new C48863x(music2, z7, awemeRawAd2, z8, z6, z5);
    }
}

package com.p2082ss.android.ugc.aweme.music.p3481ui.p3485d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.d.f */
public final class C61163f {

    /* renamed from: a */
    public final String f138864a;

    /* renamed from: b */
    public final long f138865b;

    /* renamed from: c */
    public final int f138866c;

    static {
        Covode.recordClassIndex(71768);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61163f)) {
            return false;
        }
        C61163f fVar = (C61163f) obj;
        return C89219l.m154714a(this.f138864a, fVar.f138864a) && this.f138865b == fVar.f138865b && this.f138866c == fVar.f138866c;
    }

    public final String toString() {
        return "MusicListRequestParams(musicId=" + this.f138864a + ", cursor=" + this.f138865b + ", count=" + this.f138866c + ")";
    }

    private /* synthetic */ C61163f() {
        this(null, 0, 20);
    }

    public final int hashCode() {
        int i;
        String str = this.f138864a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f138865b;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f138866c;
    }

    public C61163f(String str, long j, int i) {
        this.f138864a = str;
        this.f138865b = j;
        this.f138866c = i;
    }
}

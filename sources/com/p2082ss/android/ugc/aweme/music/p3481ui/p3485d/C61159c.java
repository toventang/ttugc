package com.p2082ss.android.ugc.aweme.music.p3481ui.p3485d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.d.c */
public final class C61159c {

    /* renamed from: a */
    public final String f138858a;

    /* renamed from: b */
    public final long f138859b;

    /* renamed from: c */
    public final int f138860c;

    static {
        Covode.recordClassIndex(71764);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61159c)) {
            return false;
        }
        C61159c cVar = (C61159c) obj;
        return C89219l.m154714a(this.f138858a, cVar.f138858a) && this.f138859b == cVar.f138859b && this.f138860c == cVar.f138860c;
    }

    public final String toString() {
        return "MusicAwemeListRequestParams(musicId=" + this.f138858a + ", cursor=" + this.f138859b + ", count=" + this.f138860c + ")";
    }

    public final int hashCode() {
        int i;
        String str = this.f138858a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f138859b;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f138860c;
    }

    public C61159c(String str, long j, int i) {
        this.f138858a = str;
        this.f138859b = j;
        this.f138860c = i;
    }
}

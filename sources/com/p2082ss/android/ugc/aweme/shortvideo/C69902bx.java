package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bx */
public final class C69902bx {

    /* renamed from: a */
    private final ShortVideoContext f156185a;

    static {
        Covode.recordClassIndex(82311);
    }

    public C69902bx(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        this.f156185a = shortVideoContext;
    }

    /* renamed from: b */
    public static EnumC69901bw m123466b(long j, long j2) {
        return m123465a(j, j2);
    }

    /* renamed from: a */
    public static EnumC69901bw m123465a(long j, long j2) {
        if (j2 == 0) {
            return EnumC69901bw.NONE;
        }
        long min = Math.min(j, j2);
        if (min != j2 || min >= j) {
            return EnumC69901bw.NONE;
        }
        return EnumC69901bw.MUSIC;
    }
}

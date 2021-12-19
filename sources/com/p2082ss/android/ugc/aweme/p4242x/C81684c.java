package com.p2082ss.android.ugc.aweme.p4242x;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.x.c */
public final class C81684c {

    /* renamed from: c */
    public static final C81685a f182639c = new C81685a((byte) 0);

    /* renamed from: a */
    public final String f182640a;

    /* renamed from: b */
    public final Bitmap f182641b;

    static {
        Covode.recordClassIndex(95088);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81684c)) {
            return false;
        }
        C81684c cVar = (C81684c) obj;
        return C89219l.m154714a(this.f182640a, cVar.f182640a) && C89219l.m154714a(this.f182641b, cVar.f182641b);
    }

    public final int hashCode() {
        String str = this.f182640a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Bitmap bitmap = this.f182641b;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VideoCoverLoadResult(coverPath=" + this.f182640a + ", bitmap=" + this.f182641b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.x.c$a */
    public static final class C81685a {
        static {
            Covode.recordClassIndex(95089);
        }

        private C81685a() {
        }

        public /* synthetic */ C81685a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C81684c m141549a(String str) {
            return new C81684c(str, null);
        }
    }

    public C81684c(String str, Bitmap bitmap) {
        this.f182640a = str;
        this.f182641b = bitmap;
    }
}

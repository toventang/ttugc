package com.p2082ss.android.ugc.aweme.sticker.repository.p3983a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.a.ab */
public final class C75690ab {

    /* renamed from: a */
    public final Integer f170119a;

    /* renamed from: b */
    public final String f170120b;

    /* renamed from: c */
    public final long f170121c;

    static {
        Covode.recordClassIndex(88621);
    }

    public C75690ab() {
        this(0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75690ab)) {
            return false;
        }
        C75690ab abVar = (C75690ab) obj;
        return C89219l.m154714a(this.f170119a, abVar.f170119a) && C89219l.m154714a(this.f170120b, abVar.f170120b) && this.f170121c == abVar.f170121c;
    }

    public final int hashCode() {
        Integer num = this.f170119a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f170120b;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.f170121c;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "StickerDownloadInfo(errorCode=" + this.f170119a + ", errorMsg=" + this.f170120b + ", totalSize=" + this.f170121c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C75690ab(long j, int i) {
        this(null, null, (i & 4) != 0 ? 0 : j);
    }

    public C75690ab(Integer num, String str, long j) {
        this.f170119a = num;
        this.f170120b = str;
        this.f170121c = j;
    }
}

package com.bytedance.android.livesdk;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.bd */
public final class C6903bd {

    /* renamed from: a */
    public String f17286a;

    /* renamed from: b */
    public long f17287b;

    /* renamed from: c */
    public String f17288c;

    /* renamed from: d */
    public String f17289d;

    static {
        Covode.recordClassIndex(7641);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6903bd)) {
            return false;
        }
        C6903bd bdVar = (C6903bd) obj;
        return C89219l.m154714a(this.f17286a, bdVar.f17286a) && this.f17287b == bdVar.f17287b && C89219l.m154714a(this.f17288c, bdVar.f17288c) && C89219l.m154714a(this.f17289d, bdVar.f17289d);
    }

    public final String toString() {
        return "ShowRechargeDialogData(chargeReason=" + this.f17286a + ", needCoins=" + this.f17287b + ", previousPage=" + this.f17288c + ", giftEnterFrom=" + this.f17289d + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f17286a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f17287b;
        int i4 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f17288c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f17289d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public C6903bd(String str, long j, String str2, String str3) {
        C89219l.m154721d(str, "");
        this.f17286a = str;
        this.f17287b = j;
        this.f17288c = str2;
        this.f17289d = str3;
    }
}

package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Arrays;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.b */
public final class C44072b {
    @AbstractC27891c(mo46611a = "cvv_length")

    /* renamed from: a */
    public final int[] f102728a;
    @AbstractC27891c(mo46611a = "card_brand_regex")

    /* renamed from: b */
    public final String f102729b;
    @AbstractC27891c(mo46611a = "card_brand_length")

    /* renamed from: c */
    public final int[] f102730c;
    @AbstractC27891c(mo46611a = "card_brand_display_name")

    /* renamed from: d */
    public final String f102731d;
    @AbstractC27891c(mo46611a = "card_brand")

    /* renamed from: e */
    public final String f102732e;
    @AbstractC27891c(mo46611a = "payment_method_id")

    /* renamed from: f */
    public final String f102733f;

    static {
        Covode.recordClassIndex(52383);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f102728a;
        int i6 = 0;
        if (iArr != null) {
            i = Arrays.hashCode(iArr);
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str = this.f102729b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        int[] iArr2 = this.f102730c;
        if (iArr2 != null) {
            i3 = Arrays.hashCode(iArr2);
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str2 = this.f102731d;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str3 = this.f102732e;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String str4 = this.f102733f;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i11 + i6;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BankCardRule");
        int[] iArr = this.f102728a;
        if (iArr != null) {
            int[] iArr2 = ((C44072b) obj).f102728a;
            if (iArr2 == null || !Arrays.equals(iArr, iArr2)) {
                return false;
            }
        } else if (((C44072b) obj).f102728a != null) {
            return false;
        }
        C44072b bVar = (C44072b) obj;
        if (!C89219l.m154714a((Object) this.f102729b, (Object) bVar.f102729b)) {
            return false;
        }
        int[] iArr3 = this.f102730c;
        if (iArr3 != null) {
            int[] iArr4 = bVar.f102730c;
            if (iArr4 == null || !Arrays.equals(iArr3, iArr4)) {
                return false;
            }
        } else if (bVar.f102730c != null) {
            return false;
        }
        if (!(!C89219l.m154714a((Object) this.f102731d, (Object) bVar.f102731d)) && !(!C89219l.m154714a((Object) this.f102732e, (Object) bVar.f102732e)) && !(!C89219l.m154714a((Object) this.f102733f, (Object) bVar.f102733f))) {
            return true;
        }
        return false;
    }
}

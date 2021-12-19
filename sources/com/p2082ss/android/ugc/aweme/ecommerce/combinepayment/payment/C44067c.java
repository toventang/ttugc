package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44089r;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44090s;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c */
public final class C44067c {

    /* renamed from: k */
    public static final C44069b f102712k = new C44069b((byte) 0);
    @AbstractC27891c(mo46611a = "current_progress")

    /* renamed from: a */
    public final Integer f102713a;
    @AbstractC27891c(mo46611a = "total_progress")

    /* renamed from: b */
    public final Integer f102714b;
    @AbstractC27891c(mo46611a = "button_type")

    /* renamed from: c */
    public final Integer f102715c;
    @AbstractC27891c(mo46611a = "payment_data")

    /* renamed from: d */
    public final C44089r f102716d;
    @AbstractC27891c(mo46611a = "price")

    /* renamed from: e */
    public final String f102717e;

    /* renamed from: f */
    public boolean f102718f;
    @AbstractC27891c(mo46611a = "payment_info")

    /* renamed from: g */
    public final C44085n f102719g;
    @AbstractC27891c(mo46611a = "track_params")

    /* renamed from: h */
    public final HashMap<String, Object> f102720h;
    @AbstractC27891c(mo46611a = "payment_price")

    /* renamed from: i */
    public final List<C44090s> f102721i;
    @AbstractC27891c(mo46611a = "shipping_address")

    /* renamed from: j */
    public final Address f102722j;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c$a */
    public enum EnumC44068a {
        NEXT,
        CONTINUE,
        PAY_NOW;

        static {
            Covode.recordClassIndex(52374);
        }
    }

    static {
        Covode.recordClassIndex(52373);
    }

    public C44067c() {
        this(null, null, null, null, null, false, null, null, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44067c)) {
            return false;
        }
        C44067c cVar = (C44067c) obj;
        return C89219l.m154714a(this.f102713a, cVar.f102713a) && C89219l.m154714a(this.f102714b, cVar.f102714b) && C89219l.m154714a(this.f102715c, cVar.f102715c) && C89219l.m154714a(this.f102716d, cVar.f102716d) && C89219l.m154714a(this.f102717e, cVar.f102717e) && this.f102718f == cVar.f102718f && C89219l.m154714a(this.f102719g, cVar.f102719g) && C89219l.m154714a(this.f102720h, cVar.f102720h) && C89219l.m154714a(this.f102721i, cVar.f102721i) && C89219l.m154714a(this.f102722j, cVar.f102722j);
    }

    public final int hashCode() {
        Integer num = this.f102713a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f102714b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f102715c;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        C44089r rVar = this.f102716d;
        int hashCode4 = (hashCode3 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        String str = this.f102717e;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f102718f;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode5 + i2) * 31;
        C44085n nVar = this.f102719g;
        int hashCode6 = (i5 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        HashMap<String, Object> hashMap = this.f102720h;
        int hashCode7 = (hashCode6 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<C44090s> list = this.f102721i;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        Address address = this.f102722j;
        if (address != null) {
            i = address.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "EnterParams(currentProgress=" + this.f102713a + ", totalProgress=" + this.f102714b + ", buttonType=" + this.f102715c + ", paymentData=" + this.f102716d + ", price=" + this.f102717e + ", isHalfScreen=" + this.f102718f + ", paymentInfo=" + this.f102719g + ", trackParams=" + this.f102720h + ", paymentPrice=" + this.f102721i + ", shippingAddress=" + this.f102722j + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c$b */
    public static final class C44069b {
        static {
            Covode.recordClassIndex(52375);
        }

        private C44069b() {
        }

        public /* synthetic */ C44069b(byte b) {
            this();
        }
    }

    private C44067c(Integer num, Integer num2, Integer num3, C44089r rVar, String str, boolean z, C44085n nVar, HashMap<String, Object> hashMap, List<C44090s> list, Address address) {
        this.f102713a = num;
        this.f102714b = num2;
        this.f102715c = num3;
        this.f102716d = rVar;
        this.f102717e = str;
        this.f102718f = z;
        this.f102719g = nVar;
        this.f102720h = hashMap;
        this.f102721i = list;
        this.f102722j = address;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C44067c(Integer num, Integer num2, Integer num3, C44089r rVar, String str, boolean z, C44085n nVar, HashMap hashMap, List list, Address address, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : rVar, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : nVar, (i & 128) != 0 ? null : hashMap, (i & 256) != 0 ? null : list, (i & 512) == 0 ? address : null);
    }
}

package com.p2082ss.android.ugc.aweme.sticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.EffectSdkExtra */
public final class EffectSdkExtra implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectSdkExtra> CREATOR = new C75241a();
    @AbstractC27891c(mo46611a = "pl")

    /* renamed from: a */
    private PlDataBean f169167a;

    static {
        Covode.recordClassIndex(88135);
    }

    public EffectSdkExtra() {
        this(null, 1, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        this.f169167a.writeToParcel(parcel, 0);
    }

    public final PlDataBean getPl() {
        return this.f169167a;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.EffectSdkExtra$a */
    public static class C75241a implements Parcelable.Creator<EffectSdkExtra> {
        static {
            Covode.recordClassIndex(88136);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EffectSdkExtra[] newArray(int i) {
            return new EffectSdkExtra[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EffectSdkExtra createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new EffectSdkExtra(PlDataBean.CREATOR.createFromParcel(parcel));
        }
    }

    public final void setPl(PlDataBean plDataBean) {
        C89219l.m154721d(plDataBean, "");
        this.f169167a = plDataBean;
    }

    public EffectSdkExtra(PlDataBean plDataBean) {
        C89219l.m154721d(plDataBean, "");
        this.f169167a = plDataBean;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EffectSdkExtra(com.p2082ss.android.ugc.aweme.sticker.PlDataBean r15, int r16, p4600h.p4611f.p4613b.C89214g r17) {
        /*
            r14 = this;
            r1 = r15
            r0 = r16 & 1
            if (r0 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.sticker.PlDataBean r1 = new com.ss.android.ugc.aweme.sticker.PlDataBean
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1023(0x3ff, float:1.434E-42)
            r13 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r14
        L_0x0018:
            r14.<init>(r1)
            return
        L_0x001c:
            r0 = r14
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.EffectSdkExtra.<init>(com.ss.android.ugc.aweme.sticker.PlDataBean, int, h.f.b.g):void");
    }
}

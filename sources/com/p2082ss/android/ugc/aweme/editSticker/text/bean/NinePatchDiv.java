package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv */
public final class NinePatchDiv implements Parcelable, Serializable {
    public static final Parcelable.Creator<NinePatchDiv> CREATOR = new C46061a();
    private final int end;
    private final int start;

    static {
        Covode.recordClassIndex(54605);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_NinePatchDiv_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88920x8b56af73(int i) {
        return i;
    }

    public static /* synthetic */ NinePatchDiv copy$default(NinePatchDiv ninePatchDiv, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ninePatchDiv.start;
        }
        if ((i3 & 2) != 0) {
            i2 = ninePatchDiv.end;
        }
        return ninePatchDiv.copy(i, i2);
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.end;
    }

    public final NinePatchDiv copy(int i, int i2) {
        return new NinePatchDiv(i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NinePatchDiv)) {
            return false;
        }
        NinePatchDiv ninePatchDiv = (NinePatchDiv) obj;
        return this.start == ninePatchDiv.start && this.end == ninePatchDiv.end;
    }

    public final int hashCode() {
        return (m88920x8b56af73(this.start) * 31) + m88920x8b56af73(this.end);
    }

    public final String toString() {
        return "NinePatchDiv(start=" + this.start + ", end=" + this.end + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv$a */
    public static class C46061a implements Parcelable.Creator<NinePatchDiv> {
        static {
            Covode.recordClassIndex(54606);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ NinePatchDiv[] newArray(int i) {
            return new NinePatchDiv[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ NinePatchDiv createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new NinePatchDiv(parcel.readInt(), parcel.readInt());
        }
    }

    public NinePatchDiv(int i, int i2) {
        this.start = i;
        this.end = i2;
    }
}

package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent */
public final class ToastContent implements Parcelable {
    public static final Parcelable.Creator<ToastContent> CREATOR = new C43609a();
    @AbstractC27891c(mo46611a = "duration")
    private final Integer duration;
    @AbstractC27891c(mo46611a = "message")
    private final String message;
    @AbstractC27891c(mo46611a = "toast_type")
    private final Integer toastType;

    static {
        Covode.recordClassIndex(51864);
    }

    public static /* synthetic */ ToastContent copy$default(ToastContent toastContent, Integer num, Integer num2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = toastContent.toastType;
        }
        if ((i & 2) != 0) {
            num2 = toastContent.duration;
        }
        if ((i & 4) != 0) {
            str = toastContent.message;
        }
        return toastContent.copy(num, num2, str);
    }

    public final Integer component1() {
        return this.toastType;
    }

    public final Integer component2() {
        return this.duration;
    }

    public final String component3() {
        return this.message;
    }

    public final ToastContent copy(Integer num, Integer num2, String str) {
        C89219l.m154721d(str, "");
        return new ToastContent(num, num2, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastContent)) {
            return false;
        }
        ToastContent toastContent = (ToastContent) obj;
        return C89219l.m154714a(this.toastType, toastContent.toastType) && C89219l.m154714a(this.duration, toastContent.duration) && C89219l.m154714a(this.message, toastContent.message);
    }

    public final int hashCode() {
        Integer num = this.toastType;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.duration;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ToastContent(toastType=" + this.toastType + ", duration=" + this.duration + ", message=" + this.message + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Integer num = this.toastType;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.duration;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.message);
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getToastType() {
        return this.toastType;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent$a */
    public static class C43609a implements Parcelable.Creator<ToastContent> {
        static {
            Covode.recordClassIndex(51865);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ToastContent[] newArray(int i) {
            return new ToastContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ToastContent createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new ToastContent(valueOf, num, parcel.readString());
        }
    }

    public ToastContent(Integer num, Integer num2, String str) {
        C89219l.m154721d(str, "");
        this.toastType = num;
        this.duration = num2;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastContent(Integer num, Integer num2, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : num, num2, str);
    }
}

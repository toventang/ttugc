package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX */
public final class ExceptionUX implements Parcelable {
    public static final Parcelable.Creator<ExceptionUX> CREATOR = new C43602a();
    @AbstractC27891c(mo46611a = "dialog_content")
    private final DialogContent dialogContent;
    @AbstractC27891c(mo46611a = "exception_ux_type")
    private final Integer exceptionUXType;
    @AbstractC27891c(mo46611a = "redirect_content")
    private final RedirectContent redirectContent;
    @AbstractC27891c(mo46611a = "render_page")
    private final Boolean renderPage;
    @AbstractC27891c(mo46611a = "toast_content")
    private final ToastContent toastContent;
    @AbstractC27891c(mo46611a = "verification_content")
    private final String verificationContent;

    static {
        Covode.recordClassIndex(51850);
    }

    public static /* synthetic */ ExceptionUX copy$default(ExceptionUX exceptionUX, Integer num, Boolean bool, DialogContent dialogContent2, ToastContent toastContent2, String str, RedirectContent redirectContent2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = exceptionUX.exceptionUXType;
        }
        if ((i & 2) != 0) {
            bool = exceptionUX.renderPage;
        }
        if ((i & 4) != 0) {
            dialogContent2 = exceptionUX.dialogContent;
        }
        if ((i & 8) != 0) {
            toastContent2 = exceptionUX.toastContent;
        }
        if ((i & 16) != 0) {
            str = exceptionUX.verificationContent;
        }
        if ((i & 32) != 0) {
            redirectContent2 = exceptionUX.redirectContent;
        }
        return exceptionUX.copy(num, bool, dialogContent2, toastContent2, str, redirectContent2);
    }

    public final Integer component1() {
        return this.exceptionUXType;
    }

    public final Boolean component2() {
        return this.renderPage;
    }

    public final DialogContent component3() {
        return this.dialogContent;
    }

    public final ToastContent component4() {
        return this.toastContent;
    }

    public final String component5() {
        return this.verificationContent;
    }

    public final RedirectContent component6() {
        return this.redirectContent;
    }

    public final ExceptionUX copy(Integer num, Boolean bool, DialogContent dialogContent2, ToastContent toastContent2, String str, RedirectContent redirectContent2) {
        return new ExceptionUX(num, bool, dialogContent2, toastContent2, str, redirectContent2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionUX)) {
            return false;
        }
        ExceptionUX exceptionUX = (ExceptionUX) obj;
        return C89219l.m154714a(this.exceptionUXType, exceptionUX.exceptionUXType) && C89219l.m154714a(this.renderPage, exceptionUX.renderPage) && C89219l.m154714a(this.dialogContent, exceptionUX.dialogContent) && C89219l.m154714a(this.toastContent, exceptionUX.toastContent) && C89219l.m154714a(this.verificationContent, exceptionUX.verificationContent) && C89219l.m154714a(this.redirectContent, exceptionUX.redirectContent);
    }

    public final int hashCode() {
        Integer num = this.exceptionUXType;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.renderPage;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        DialogContent dialogContent2 = this.dialogContent;
        int hashCode3 = (hashCode2 + (dialogContent2 != null ? dialogContent2.hashCode() : 0)) * 31;
        ToastContent toastContent2 = this.toastContent;
        int hashCode4 = (hashCode3 + (toastContent2 != null ? toastContent2.hashCode() : 0)) * 31;
        String str = this.verificationContent;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        RedirectContent redirectContent2 = this.redirectContent;
        if (redirectContent2 != null) {
            i = redirectContent2.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "ExceptionUX(exceptionUXType=" + this.exceptionUXType + ", renderPage=" + this.renderPage + ", dialogContent=" + this.dialogContent + ", toastContent=" + this.toastContent + ", verificationContent=" + this.verificationContent + ", redirectContent=" + this.redirectContent + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Integer num = this.exceptionUXType;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.renderPage;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        DialogContent dialogContent2 = this.dialogContent;
        if (dialogContent2 != null) {
            parcel.writeInt(1);
            dialogContent2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ToastContent toastContent2 = this.toastContent;
        if (toastContent2 != null) {
            parcel.writeInt(1);
            toastContent2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.verificationContent);
        RedirectContent redirectContent2 = this.redirectContent;
        if (redirectContent2 != null) {
            parcel.writeInt(1);
            redirectContent2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final DialogContent getDialogContent() {
        return this.dialogContent;
    }

    public final Integer getExceptionUXType() {
        return this.exceptionUXType;
    }

    public final RedirectContent getRedirectContent() {
        return this.redirectContent;
    }

    public final Boolean getRenderPage() {
        return this.renderPage;
    }

    public final ToastContent getToastContent() {
        return this.toastContent;
    }

    public final String getVerificationContent() {
        return this.verificationContent;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX$a */
    public static class C43602a implements Parcelable.Creator<ExceptionUX> {
        static {
            Covode.recordClassIndex(51851);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ExceptionUX[] newArray(int i) {
            return new ExceptionUX[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ExceptionUX createFromParcel(Parcel parcel) {
            Boolean bool;
            C89219l.m154721d(parcel, "");
            RedirectContent redirectContent = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            DialogContent createFromParcel = parcel.readInt() != 0 ? DialogContent.CREATOR.createFromParcel(parcel) : null;
            ToastContent createFromParcel2 = parcel.readInt() != 0 ? ToastContent.CREATOR.createFromParcel(parcel) : null;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                redirectContent = RedirectContent.CREATOR.createFromParcel(parcel);
            }
            return new ExceptionUX(valueOf, bool, createFromParcel, createFromParcel2, readString, redirectContent);
        }
    }

    public ExceptionUX(Integer num, Boolean bool, DialogContent dialogContent2, ToastContent toastContent2, String str, RedirectContent redirectContent2) {
        this.exceptionUXType = num;
        this.renderPage = bool;
        this.dialogContent = dialogContent2;
        this.toastContent = toastContent2;
        this.verificationContent = str;
        this.redirectContent = redirectContent2;
    }
}

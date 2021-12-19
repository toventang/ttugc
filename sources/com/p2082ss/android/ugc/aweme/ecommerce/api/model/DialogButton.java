package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton */
public final class DialogButton implements Parcelable {
    public static final Parcelable.Creator<DialogButton> CREATOR = new C43600a();
    @AbstractC27891c(mo46611a = "button_action")
    private final ButtonAction buttonAction;
    @AbstractC27891c(mo46611a = "dialog_button_style")
    private final Integer dialogButtonStyle;
    @AbstractC27891c(mo46611a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(51846);
    }

    public static /* synthetic */ DialogButton copy$default(DialogButton dialogButton, String str, Integer num, ButtonAction buttonAction2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogButton.text;
        }
        if ((i & 2) != 0) {
            num = dialogButton.dialogButtonStyle;
        }
        if ((i & 4) != 0) {
            buttonAction2 = dialogButton.buttonAction;
        }
        return dialogButton.copy(str, num, buttonAction2);
    }

    public final String component1() {
        return this.text;
    }

    public final Integer component2() {
        return this.dialogButtonStyle;
    }

    public final ButtonAction component3() {
        return this.buttonAction;
    }

    public final DialogButton copy(String str, Integer num, ButtonAction buttonAction2) {
        return new DialogButton(str, num, buttonAction2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogButton)) {
            return false;
        }
        DialogButton dialogButton = (DialogButton) obj;
        return C89219l.m154714a(this.text, dialogButton.text) && C89219l.m154714a(this.dialogButtonStyle, dialogButton.dialogButtonStyle) && C89219l.m154714a(this.buttonAction, dialogButton.buttonAction);
    }

    public final int hashCode() {
        String str = this.text;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.dialogButtonStyle;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        ButtonAction buttonAction2 = this.buttonAction;
        if (buttonAction2 != null) {
            i = buttonAction2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "DialogButton(text=" + this.text + ", dialogButtonStyle=" + this.dialogButtonStyle + ", buttonAction=" + this.buttonAction + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.text);
        Integer num = this.dialogButtonStyle;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        ButtonAction buttonAction2 = this.buttonAction;
        if (buttonAction2 != null) {
            parcel.writeInt(1);
            buttonAction2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final ButtonAction getButtonAction() {
        return this.buttonAction;
    }

    public final Integer getDialogButtonStyle() {
        return this.dialogButtonStyle;
    }

    public final String getText() {
        return this.text;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton$a */
    public static class C43600a implements Parcelable.Creator<DialogButton> {
        static {
            Covode.recordClassIndex(51847);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DialogButton[] newArray(int i) {
            return new DialogButton[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DialogButton createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            ButtonAction buttonAction = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                buttonAction = ButtonAction.CREATOR.createFromParcel(parcel);
            }
            return new DialogButton(readString, valueOf, buttonAction);
        }
    }

    public DialogButton(String str, Integer num, ButtonAction buttonAction2) {
        this.text = str;
        this.dialogButtonStyle = num;
        this.buttonAction = buttonAction2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogButton(String str, Integer num, ButtonAction buttonAction2, int i, C89214g gVar) {
        this(str, (i & 2) != 0 ? 0 : num, buttonAction2);
    }
}

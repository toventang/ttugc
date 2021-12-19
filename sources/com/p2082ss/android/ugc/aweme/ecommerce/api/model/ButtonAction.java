package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction */
public final class ButtonAction implements Parcelable {
    public static final Parcelable.Creator<ButtonAction> CREATOR = new C43598a();
    @AbstractC27891c(mo46611a = "button_action_info")
    private final ButtonActionInfo buttonActionInfo;
    @AbstractC27891c(mo46611a = "button_action_type")
    private final Integer buttonActionType;

    static {
        Covode.recordClassIndex(51842);
    }

    public static /* synthetic */ ButtonAction copy$default(ButtonAction buttonAction, Integer num, ButtonActionInfo buttonActionInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = buttonAction.buttonActionType;
        }
        if ((i & 2) != 0) {
            buttonActionInfo2 = buttonAction.buttonActionInfo;
        }
        return buttonAction.copy(num, buttonActionInfo2);
    }

    public final Integer component1() {
        return this.buttonActionType;
    }

    public final ButtonActionInfo component2() {
        return this.buttonActionInfo;
    }

    public final ButtonAction copy(Integer num, ButtonActionInfo buttonActionInfo2) {
        return new ButtonAction(num, buttonActionInfo2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonAction)) {
            return false;
        }
        ButtonAction buttonAction = (ButtonAction) obj;
        return C89219l.m154714a(this.buttonActionType, buttonAction.buttonActionType) && C89219l.m154714a(this.buttonActionInfo, buttonAction.buttonActionInfo);
    }

    public final int hashCode() {
        Integer num = this.buttonActionType;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        ButtonActionInfo buttonActionInfo2 = this.buttonActionInfo;
        if (buttonActionInfo2 != null) {
            i = buttonActionInfo2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ButtonAction(buttonActionType=" + this.buttonActionType + ", buttonActionInfo=" + this.buttonActionInfo + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Integer num = this.buttonActionType;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        ButtonActionInfo buttonActionInfo2 = this.buttonActionInfo;
        if (buttonActionInfo2 != null) {
            parcel.writeInt(1);
            buttonActionInfo2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final ButtonActionInfo getButtonActionInfo() {
        return this.buttonActionInfo;
    }

    public final Integer getButtonActionType() {
        return this.buttonActionType;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction$a */
    public static class C43598a implements Parcelable.Creator<ButtonAction> {
        static {
            Covode.recordClassIndex(51843);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ButtonAction[] newArray(int i) {
            return new ButtonAction[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ButtonAction createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            ButtonActionInfo buttonActionInfo = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                buttonActionInfo = ButtonActionInfo.CREATOR.createFromParcel(parcel);
            }
            return new ButtonAction(valueOf, buttonActionInfo);
        }
    }

    public ButtonAction(Integer num, ButtonActionInfo buttonActionInfo2) {
        this.buttonActionType = num;
        this.buttonActionInfo = buttonActionInfo2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ButtonAction(Integer num, ButtonActionInfo buttonActionInfo2, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : num, buttonActionInfo2);
    }
}

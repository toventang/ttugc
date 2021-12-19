package com.bytedance.ies.android.base.runtime.depend;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class DialogBuilder {
    private final boolean cancelOnTouchOutside;
    private final Context context;
    private final int messageResId;
    private final int negativeBtnResId;
    private final DialogInterface.OnClickListener negativeClickListener;
    private final int positiveBtnTextResId;
    private final DialogInterface.OnClickListener positiveClickListener;
    private final int titleResId;

    static {
        Covode.recordClassIndex(18384);
    }

    public static /* synthetic */ DialogBuilder copy$default(DialogBuilder dialogBuilder, Context context2, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            context2 = dialogBuilder.context;
        }
        if ((i5 & 2) != 0) {
            i = dialogBuilder.titleResId;
        }
        if ((i5 & 4) != 0) {
            i2 = dialogBuilder.messageResId;
        }
        if ((i5 & 8) != 0) {
            i3 = dialogBuilder.positiveBtnTextResId;
        }
        if ((i5 & 16) != 0) {
            onClickListener = dialogBuilder.positiveClickListener;
        }
        if ((i5 & 32) != 0) {
            i4 = dialogBuilder.negativeBtnResId;
        }
        if ((i5 & 64) != 0) {
            onClickListener2 = dialogBuilder.negativeClickListener;
        }
        if ((i5 & 128) != 0) {
            z = dialogBuilder.cancelOnTouchOutside;
        }
        return dialogBuilder.copy(context2, i, i2, i3, onClickListener, i4, onClickListener2, z);
    }

    public final Context component1() {
        return this.context;
    }

    public final int component2() {
        return this.titleResId;
    }

    public final int component3() {
        return this.messageResId;
    }

    public final int component4() {
        return this.positiveBtnTextResId;
    }

    public final DialogInterface.OnClickListener component5() {
        return this.positiveClickListener;
    }

    public final int component6() {
        return this.negativeBtnResId;
    }

    public final DialogInterface.OnClickListener component7() {
        return this.negativeClickListener;
    }

    public final boolean component8() {
        return this.cancelOnTouchOutside;
    }

    public final DialogBuilder copy(Context context2, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        C89219l.m154719c(context2, "");
        return new DialogBuilder(context2, i, i2, i3, onClickListener, i4, onClickListener2, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DialogBuilder) {
                DialogBuilder dialogBuilder = (DialogBuilder) obj;
                if (!(C89219l.m154714a(this.context, dialogBuilder.context) && this.titleResId == dialogBuilder.titleResId && this.messageResId == dialogBuilder.messageResId && this.positiveBtnTextResId == dialogBuilder.positiveBtnTextResId && C89219l.m154714a(this.positiveClickListener, dialogBuilder.positiveClickListener) && this.negativeBtnResId == dialogBuilder.negativeBtnResId && C89219l.m154714a(this.negativeClickListener, dialogBuilder.negativeClickListener) && this.cancelOnTouchOutside == dialogBuilder.cancelOnTouchOutside)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Context context2 = this.context;
        int i = 0;
        int hashCode = (((((((context2 != null ? context2.hashCode() : 0) * 31) + this.titleResId) * 31) + this.messageResId) * 31) + this.positiveBtnTextResId) * 31;
        DialogInterface.OnClickListener onClickListener = this.positiveClickListener;
        int hashCode2 = (((hashCode + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31) + this.negativeBtnResId) * 31;
        DialogInterface.OnClickListener onClickListener2 = this.negativeClickListener;
        if (onClickListener2 != null) {
            i = onClickListener2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.cancelOnTouchOutside;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "DialogBuilder(context=" + this.context + ", titleResId=" + this.titleResId + ", messageResId=" + this.messageResId + ", positiveBtnTextResId=" + this.positiveBtnTextResId + ", positiveClickListener=" + this.positiveClickListener + ", negativeBtnResId=" + this.negativeBtnResId + ", negativeClickListener=" + this.negativeClickListener + ", cancelOnTouchOutside=" + this.cancelOnTouchOutside + ")";
    }

    public final boolean getCancelOnTouchOutside() {
        return this.cancelOnTouchOutside;
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getMessageResId() {
        return this.messageResId;
    }

    public final int getNegativeBtnResId() {
        return this.negativeBtnResId;
    }

    public final DialogInterface.OnClickListener getNegativeClickListener() {
        return this.negativeClickListener;
    }

    public final int getPositiveBtnTextResId() {
        return this.positiveBtnTextResId;
    }

    public final DialogInterface.OnClickListener getPositiveClickListener() {
        return this.positiveClickListener;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public DialogBuilder(Context context2, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        C89219l.m154719c(context2, "");
        this.context = context2;
        this.titleResId = i;
        this.messageResId = i2;
        this.positiveBtnTextResId = i3;
        this.positiveClickListener = onClickListener;
        this.negativeBtnResId = i4;
        this.negativeClickListener = onClickListener2;
        this.cancelOnTouchOutside = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogBuilder(Context context2, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, int i4, DialogInterface.OnClickListener onClickListener2, boolean z, int i5, C89214g gVar) {
        this(context2, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? null : onClickListener, (i5 & 32) == 0 ? i4 : 0, (i5 & 64) == 0 ? onClickListener2 : null, (i5 & 128) != 0 ? true : z);
    }
}

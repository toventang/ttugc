package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class DialogBuilder {
    private final DialogInterface.OnCancelListener cancelListener;
    private final boolean cancelOnTouchOutside;
    private final Context context;
    private final String message;
    private final String negativeBtnText;
    private final DialogInterface.OnClickListener negativeClickListener;
    private final String positiveBtnText;
    private final DialogInterface.OnClickListener positiveClickListener;
    private final String title;

    static {
        Covode.recordClassIndex(21128);
    }

    public static /* synthetic */ DialogBuilder copy$default(DialogBuilder dialogBuilder, Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            context2 = dialogBuilder.context;
        }
        if ((i & 2) != 0) {
            str = dialogBuilder.title;
        }
        if ((i & 4) != 0) {
            str2 = dialogBuilder.message;
        }
        if ((i & 8) != 0) {
            str3 = dialogBuilder.positiveBtnText;
        }
        if ((i & 16) != 0) {
            onClickListener = dialogBuilder.positiveClickListener;
        }
        if ((i & 32) != 0) {
            str4 = dialogBuilder.negativeBtnText;
        }
        if ((i & 64) != 0) {
            onClickListener2 = dialogBuilder.negativeClickListener;
        }
        if ((i & 128) != 0) {
            onCancelListener = dialogBuilder.cancelListener;
        }
        if ((i & 256) != 0) {
            z = dialogBuilder.cancelOnTouchOutside;
        }
        return dialogBuilder.copy(context2, str, str2, str3, onClickListener, str4, onClickListener2, onCancelListener, z);
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.positiveBtnText;
    }

    public final DialogInterface.OnClickListener component5() {
        return this.positiveClickListener;
    }

    public final String component6() {
        return this.negativeBtnText;
    }

    public final DialogInterface.OnClickListener component7() {
        return this.negativeClickListener;
    }

    public final DialogInterface.OnCancelListener component8() {
        return this.cancelListener;
    }

    public final boolean component9() {
        return this.cancelOnTouchOutside;
    }

    public final DialogBuilder copy(Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        C89219l.m154719c(context2, "");
        return new DialogBuilder(context2, str, str2, str3, onClickListener, str4, onClickListener2, onCancelListener, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogBuilder)) {
            return false;
        }
        DialogBuilder dialogBuilder = (DialogBuilder) obj;
        return C89219l.m154714a(this.context, dialogBuilder.context) && C89219l.m154714a(this.title, dialogBuilder.title) && C89219l.m154714a(this.message, dialogBuilder.message) && C89219l.m154714a(this.positiveBtnText, dialogBuilder.positiveBtnText) && C89219l.m154714a(this.positiveClickListener, dialogBuilder.positiveClickListener) && C89219l.m154714a(this.negativeBtnText, dialogBuilder.negativeBtnText) && C89219l.m154714a(this.negativeClickListener, dialogBuilder.negativeClickListener) && C89219l.m154714a(this.cancelListener, dialogBuilder.cancelListener) && this.cancelOnTouchOutside == dialogBuilder.cancelOnTouchOutside;
    }

    public final int hashCode() {
        Context context2 = this.context;
        int i = 0;
        int hashCode = (context2 != null ? context2.hashCode() : 0) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.positiveBtnText;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        DialogInterface.OnClickListener onClickListener = this.positiveClickListener;
        int hashCode5 = (hashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        String str4 = this.negativeBtnText;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        DialogInterface.OnClickListener onClickListener2 = this.negativeClickListener;
        int hashCode7 = (hashCode6 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        DialogInterface.OnCancelListener onCancelListener = this.cancelListener;
        if (onCancelListener != null) {
            i = onCancelListener.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
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
        return "DialogBuilder(context=" + this.context + ", title=" + this.title + ", message=" + this.message + ", positiveBtnText=" + this.positiveBtnText + ", positiveClickListener=" + this.positiveClickListener + ", negativeBtnText=" + this.negativeBtnText + ", negativeClickListener=" + this.negativeClickListener + ", cancelListener=" + this.cancelListener + ", cancelOnTouchOutside=" + this.cancelOnTouchOutside + ")";
    }

    public final DialogInterface.OnCancelListener getCancelListener() {
        return this.cancelListener;
    }

    public final boolean getCancelOnTouchOutside() {
        return this.cancelOnTouchOutside;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getNegativeBtnText() {
        return this.negativeBtnText;
    }

    public final DialogInterface.OnClickListener getNegativeClickListener() {
        return this.negativeClickListener;
    }

    public final String getPositiveBtnText() {
        return this.positiveBtnText;
    }

    public final DialogInterface.OnClickListener getPositiveClickListener() {
        return this.positiveClickListener;
    }

    public final String getTitle() {
        return this.title;
    }

    public DialogBuilder(Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        C89219l.m154719c(context2, "");
        this.context = context2;
        this.title = str;
        this.message = str2;
        this.positiveBtnText = str3;
        this.positiveClickListener = onClickListener;
        this.negativeBtnText = str4;
        this.negativeClickListener = onClickListener2;
        this.cancelListener = onCancelListener;
        this.cancelOnTouchOutside = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogBuilder(Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z, int i, C89214g gVar) {
        this(context2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : onClickListener, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : onClickListener2, (i & 128) == 0 ? onCancelListener : null, (i & 256) != 0 ? true : z);
    }
}

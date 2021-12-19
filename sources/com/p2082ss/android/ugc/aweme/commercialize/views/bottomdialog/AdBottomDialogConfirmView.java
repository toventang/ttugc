package com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.AdBottomDialogConfirmView */
public final class AdBottomDialogConfirmView extends DmtTextView {
    static {
        Covode.recordClassIndex(46390);
    }

    public AdBottomDialogConfirmView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setClickable(boolean z) {
        super.setClickable(z);
        if (z) {
            setTextColor(Color.parseColor("#fe2c55"));
        } else {
            setTextColor(Color.parseColor("#80fe2c55"));
        }
    }

    private /* synthetic */ AdBottomDialogConfirmView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdBottomDialogConfirmView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}

package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.p2082ss.android.ugc.aweme.p2307ai.View$OnTouchListenerC33472d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.CheckButton */
public class CheckButton extends DmtButton {
    static {
        Covode.recordClassIndex(67946);
    }

    public CheckButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CheckButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        setBackgroundResource(R.drawable.ax5);
        setOnTouchListener(new View$OnTouchListenerC33472d());
    }
}

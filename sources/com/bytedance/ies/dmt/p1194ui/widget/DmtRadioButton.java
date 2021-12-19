package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0439n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtRadioButton */
public class DmtRadioButton extends C0439n {
    static {
        Covode.recordClassIndex(19741);
    }

    public void setFontType(String str) {
        C17301b.m32033a().mo27614a(this, str);
    }

    public DmtRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private DmtRadioButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.a8m);
        C17301b.m32033a().mo27613a(this, attributeSet);
    }
}

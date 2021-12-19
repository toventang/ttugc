package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;

public class DeprecatedCheckBox extends AppCompatCheckBox {
    static {
        Covode.recordClassIndex(4554);
    }

    public void setFontType(String str) {
        C17301b.m32033a().mo27614a(this, str);
    }

    public DeprecatedCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C17301b.m32033a().mo27613a(this, attributeSet);
    }
}

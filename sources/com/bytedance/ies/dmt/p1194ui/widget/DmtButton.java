package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtButton */
public class DmtButton extends AppCompatButton {
    static {
        Covode.recordClassIndex(19738);
    }

    public DmtButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m31885a(AttributeSet attributeSet) {
        C17301b.m32033a().mo27613a(this, attributeSet);
    }

    public void setFontType(String str) {
        C17301b.m32033a().mo27614a(this, str);
    }

    public DmtButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m31885a(attributeSet);
    }

    public DmtButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        m31885a(attributeSet);
    }
}

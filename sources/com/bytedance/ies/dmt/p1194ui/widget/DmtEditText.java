package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtEditText */
public class DmtEditText extends AppCompatEditText {
    static {
        Covode.recordClassIndex(19739);
    }

    public DmtEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m31886a(AttributeSet attributeSet) {
        C17301b.m32033a().mo27613a(this, attributeSet);
    }

    public void setFontType(String str) {
        C17301b.m32033a().mo27614a(this, str);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.dispatchWindowFocusChanged(z);
            } catch (NullPointerException | SecurityException e) {
                e.printStackTrace();
            }
        } else {
            super.dispatchWindowFocusChanged(z);
        }
    }

    public DmtEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m31886a(attributeSet);
    }

    public DmtEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31886a(attributeSet);
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.onFocusChanged(z, i, rect);
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        } else {
            super.onFocusChanged(z, i, rect);
        }
    }
}

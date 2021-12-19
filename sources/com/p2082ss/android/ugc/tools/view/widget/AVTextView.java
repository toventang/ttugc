package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.style.C84981g;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVTextView */
public class AVTextView extends AppCompatTextView {
    static {
        Covode.recordClassIndex(98998);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            getText();
            return false;
        }
    }

    public String toString() {
        return super.toString() + ", text: " + ((Object) getText());
    }

    public AVTextView(Context context) {
        this(context, null);
    }

    public AVTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C84981g.m146056a((TextView) this, attributeSet, true);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public AVTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C84981g.m146056a((TextView) this, attributeSet, true);
    }
}

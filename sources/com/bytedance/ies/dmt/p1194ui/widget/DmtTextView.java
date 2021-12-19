package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17195b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17304e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtTextView */
public class DmtTextView extends AppCompatTextView {

    /* renamed from: a */
    private C17195b f41305a;

    static {
        Covode.recordClassIndex(19744);
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

    public void setFontDefinition(int i) {
        C17304e.m32041b(this, i);
    }

    public void setFontSize(int i) {
        C17304e.m32039a(this, i);
    }

    public void setFontWeight(int i) {
        C17304e.m32042c(this, i);
    }

    public DmtTextView(Context context) {
        this(context, null);
    }

    public void setFontType(String str) {
        C17301b.m32033a().mo27614a(this, str);
    }

    /* renamed from: a */
    public void mo27162a(AttributeSet attributeSet) {
        C17301b.m32033a().mo27613a(this, attributeSet);
        C89219l.m154721d(this, "");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.akw});
        C89219l.m154716b(obtainStyledAttributes, "");
        C17304e.m32041b(this, obtainStyledAttributes.getInt(0, 0));
        C17195b bVar = new C17195b(getContext(), attributeSet);
        this.f41305a = bVar;
        C89219l.m154721d(this, "");
        CharSequence text = getText();
        if (bVar.f40976a != 0) {
            setText(bVar.mo27181a(text));
        }
    }

    public DmtTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo27162a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C17195b bVar = this.f41305a;
        if (bVar == null) {
            super.setText(charSequence, bufferType);
        } else {
            super.setText(bVar.mo27181a(charSequence), bufferType);
        }
    }

    public DmtTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo27162a(attributeSet);
    }
}

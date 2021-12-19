package com.bytedance.ies.dmt.p1194ui.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.a */
public abstract class AbstractC17250a extends FrameLayout implements AbstractC17178d {

    /* renamed from: a */
    protected DmtTextView f41213a;

    /* renamed from: b */
    protected int f41214b;

    static {
        Covode.recordClassIndex(19717);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d
    /* renamed from: a */
    public abstract void mo27128a(int i);

    /* renamed from: a */
    public abstract void mo27298a(boolean z);

    public abstract void setDividerLineBackground(int i);

    public int getColorMode() {
        return this.f41214b;
    }

    public DmtTextView getTitleView() {
        return this.f41213a;
    }

    public void setColorMode(int i) {
        if (this.f41214b != i) {
            this.f41214b = i;
            mo27128a(i);
        }
        this.f41214b = i;
    }

    public void setTitle(int i) {
        DmtTextView dmtTextView = this.f41213a;
        if (dmtTextView != null) {
            dmtTextView.setText(i);
        }
    }

    public void setTitleColor(int i) {
        DmtTextView dmtTextView = this.f41213a;
        if (dmtTextView != null) {
            dmtTextView.setTextColor(i);
        }
    }

    public void setTitleSize(float f) {
        DmtTextView dmtTextView = this.f41213a;
        if (dmtTextView != null) {
            dmtTextView.setTextSize(f);
        }
    }

    public void setTitle(CharSequence charSequence) {
        DmtTextView dmtTextView = this.f41213a;
        if (dmtTextView != null) {
            dmtTextView.setText(charSequence);
        }
    }

    public AbstractC17250a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC17250a(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
    }
}

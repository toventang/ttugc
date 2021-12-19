package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.tux.input.TuxCheckBox;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView */
public final class ChooseOneOfMultiItemView extends ConstraintLayout {

    /* renamed from: g */
    private String f153279g;

    /* renamed from: h */
    private String f153280h;

    /* renamed from: i */
    private boolean f153281i;

    /* renamed from: j */
    private boolean f153282j;

    /* renamed from: k */
    private HashMap f153283k;

    static {
        Covode.recordClassIndex(80736);
    }

    public ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: b */
    private View m120906b(int i) {
        if (this.f153283k == null) {
            this.f153283k = new HashMap();
        }
        View view = (View) this.f153283k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f153283k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getMDesc() {
        return this.f153280h;
    }

    public final String getMText() {
        return this.f153279g;
    }

    public final boolean getSelect() {
        return this.f153282j;
    }

    public final boolean getShowDiv() {
        return this.f153281i;
    }

    public final void setMDesc(String str) {
        this.f153280h = str;
    }

    public final void setMText(String str) {
        this.f153279g = str;
    }

    public final void setSelect(boolean z) {
        this.f153282j = z;
        TuxCheckBox tuxCheckBox = (TuxCheckBox) m120906b(R.id.bh1);
        C89219l.m154716b(tuxCheckBox, "");
        tuxCheckBox.setChecked(this.f153282j);
    }

    public final void setShowDiv(boolean z) {
        this.f153281i = z;
        if (z) {
            View b = m120906b(R.id.am_);
            C89219l.m154716b(b, "");
            b.setVisibility(0);
            return;
        }
        View b2 = m120906b(R.id.am_);
        C89219l.m154716b(b2, "");
        b2.setVisibility(8);
    }

    private /* synthetic */ ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f153279g = "";
        this.f153280h = "";
        this.f153281i = true;
        ConstraintLayout.inflate(context, R.layout.ay3, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.xs, R.attr.y4, R.attr.ab_, R.attr.abv});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f153279g = obtainStyledAttributes.getString(1);
            this.f153280h = obtainStyledAttributes.getString(0);
            setShowDiv(obtainStyledAttributes.getBoolean(3, true));
            setSelect(obtainStyledAttributes.getBoolean(2, false));
            obtainStyledAttributes.recycle();
        }
        DmtTextView dmtTextView = (DmtTextView) m120906b(R.id.text);
        C89219l.m154716b(dmtTextView, "");
        dmtTextView.setText(this.f153279g);
        if (TextUtils.isEmpty(this.f153280h)) {
            DmtTextView dmtTextView2 = (DmtTextView) m120906b(R.id.ajd);
            C89219l.m154716b(dmtTextView2, "");
            dmtTextView2.setVisibility(8);
            return;
        }
        DmtTextView dmtTextView3 = (DmtTextView) m120906b(R.id.ajd);
        C89219l.m154716b(dmtTextView3, "");
        dmtTextView3.setVisibility(0);
        DmtTextView dmtTextView4 = (DmtTextView) m120906b(R.id.ajd);
        C89219l.m154716b(dmtTextView4, "");
        dmtTextView4.setText(this.f153280h);
    }
}

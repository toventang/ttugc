package com.bytedance.ies.dmt.p1194ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.SettingItem */
public class SettingItem extends AbstractC17281a {

    /* renamed from: a */
    protected FrameLayout f41415a;

    /* renamed from: b */
    protected ImageView f41416b;

    /* renamed from: c */
    protected TextView f41417c;

    /* renamed from: d */
    protected ImageView f41418d;

    static {
        Covode.recordClassIndex(19760);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.dmt.p1194ui.widget.setting.AbstractC17281a
    public int getRightLayoutId() {
        return R.layout.bh5;
    }

    public View getRightLayout() {
        return this.f41415a;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.setting.AbstractC17281a
    public TextView getTxtRight() {
        return this.f41417c;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.setting.AbstractC17281a
    public void setRightTxt(String str) {
        super.setRightTxt(str);
        this.f41417c.setText(this.f41420e);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.dmt.p1194ui.widget.setting.AbstractC17281a
    /* renamed from: a */
    public final void mo27479a(Context context) {
        super.mo27479a(context);
        this.f41416b = (ImageView) this.f41421f.findViewById(R.id.bz6);
        this.f41415a = (FrameLayout) this.f41421f.findViewById(R.id.dkc);
        this.f41417c = (TextView) this.f41421f.findViewById(R.id.f2u);
        this.f41418d = (ImageView) this.f41421f.findViewById(R.id.by3);
    }

    public SettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.dmt.p1194ui.widget.setting.AbstractC17281a
    /* renamed from: a */
    public final void mo27480a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.st, R.attr.sx, R.attr.sy, R.attr.vi});
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.f41416b.setVisibility(8);
        }
        this.f41417c.setText(this.f41420e);
        if (C17175b.m31708b(context)) {
            i = R.drawable.ccj;
        } else {
            i = R.drawable.ccl;
        }
        Drawable drawable = getResources().getDrawable(obtainStyledAttributes.getResourceId(0, i));
        if (drawable != null) {
            this.f41416b.setImageDrawable(drawable);
        }
        this.f41417c.setTextColor(this.f41431p);
        obtainStyledAttributes.recycle();
    }

    public SettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
    }
}

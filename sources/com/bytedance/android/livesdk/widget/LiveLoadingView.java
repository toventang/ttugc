package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;

public class LiveLoadingView extends DmtLoadingLayout {

    /* renamed from: a */
    private int f27211a;

    static {
        Covode.recordClassIndex(13000);
    }

    public LiveLoadingView(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout
    public void setVisibility(int i) {
        if (getContext() != null) {
            super.setVisibility(i);
            this.f27211a = i;
        }
    }

    public LiveLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this) {
            return;
        }
        if (i != 0) {
            super.setVisibility(8);
        } else {
            super.setVisibility(this.f27211a);
        }
    }

    private LiveLoadingView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        setVisibility(getVisibility());
    }
}

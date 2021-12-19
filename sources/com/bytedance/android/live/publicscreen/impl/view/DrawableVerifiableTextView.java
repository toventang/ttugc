package com.bytedance.android.live.publicscreen.impl.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.chatroom.p499ui.NoMoreSpaceTextView;
import com.bytedance.covode.number.Covode;

public class DrawableVerifiableTextView extends NoMoreSpaceTextView {

    /* renamed from: a */
    private Drawable f15115a;

    static {
        Covode.recordClassIndex(6649);
    }

    public void setVerifiedDrawable(Drawable drawable) {
        this.f15115a = drawable;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f15115a) {
            return true;
        }
        return false;
    }

    public DrawableVerifiableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

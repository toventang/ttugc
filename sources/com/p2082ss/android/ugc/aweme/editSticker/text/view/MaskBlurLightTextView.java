package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.MaskBlurLightTextView */
public class MaskBlurLightTextView extends AppCompatTextView {
    static {
        Covode.recordClassIndex(54773);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setMaskBlurColor(int i) {
        setShadowLayer(10.0f, 0.0f, 0.0f, i);
    }

    public MaskBlurLightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

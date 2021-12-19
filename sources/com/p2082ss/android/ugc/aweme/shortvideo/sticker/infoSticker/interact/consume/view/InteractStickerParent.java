package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent */
public final class InteractStickerParent extends RelativeLayout {

    /* renamed from: a */
    private boolean f163687a = true;

    static {
        Covode.recordClassIndex(85648);
    }

    public final boolean getNeedConsumeEvent() {
        return this.f163687a;
    }

    public final void setNeedConsumeEvent(boolean z) {
        this.f163687a = z;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f163687a) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public InteractStickerParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(7817);
        MethodCollector.m26664o(7817);
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a */
public abstract class AbstractC70516a extends FrameLayout implements AbstractC70527h {

    /* renamed from: a */
    public boolean f157702a;

    static {
        Covode.recordClassIndex(82972);
    }

    public abstract View getEndSlide();

    public abstract View getStartSlide();

    public void setEditViewHeight(boolean z) {
    }

    public AbstractC70516a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC70516a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

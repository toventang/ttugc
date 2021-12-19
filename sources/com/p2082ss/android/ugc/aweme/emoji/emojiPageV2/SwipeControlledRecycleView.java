package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.SwipeControlledRecycleView */
public final class SwipeControlledRecycleView extends RecyclerView {

    /* renamed from: O */
    private boolean f108247O = true;

    static {
        Covode.recordClassIndex(55050);
    }

    public final boolean getMSwipeEnabled() {
        return this.f108247O;
    }

    public final void setMSwipeEnabled(boolean z) {
        this.f108247O = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (this.f108247O) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (this.f108247O) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeControlledRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }
}

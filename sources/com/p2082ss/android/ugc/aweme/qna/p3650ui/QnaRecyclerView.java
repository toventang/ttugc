package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.QnaRecyclerView */
public final class QnaRecyclerView extends RecyclerView {

    /* renamed from: O */
    private float f149076O = -1.0f;

    /* renamed from: P */
    private EnumC66300a f149077P;

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.QnaRecyclerView$a */
    public enum EnumC66300a {
        UP,
        DOWN;

        static {
            Covode.recordClassIndex(77811);
        }
    }

    static {
        Covode.recordClassIndex(77810);
    }

    public final EnumC66300a getPrevDragDir() {
        return this.f149077P;
    }

    public final void setPrevDragDir(EnumC66300a aVar) {
        this.f149077P = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f149076O = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            if (motionEvent.getY() - this.f149076O > 0.0f) {
                this.f149077P = EnumC66300a.DOWN;
            } else {
                this.f149077P = EnumC66300a.UP;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QnaRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }
}

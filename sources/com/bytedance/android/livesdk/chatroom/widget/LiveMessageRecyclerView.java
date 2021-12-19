package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;

public class LiveMessageRecyclerView extends RecyclerView {

    /* renamed from: O */
    private boolean f20202O = true;

    static {
        Covode.recordClassIndex(8959);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (canScrollVertically(1)) {
            return 1.0f;
        }
        return 0.0f;
    }

    public void setDisableAllowIntercept(boolean z) {
        this.f20202O = z;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public LiveMessageRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMessageRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}

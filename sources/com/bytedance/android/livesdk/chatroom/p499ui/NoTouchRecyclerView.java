package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.NoTouchRecyclerView */
public class NoTouchRecyclerView extends RecyclerView {
    static {
        Covode.recordClassIndex(8491);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public NoTouchRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

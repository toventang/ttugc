package com.bytedance.android.live.publicscreen.impl.game;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class GameMsgRecyclerView extends LiveMessageRecyclerView {

    /* renamed from: O */
    private int f14995O;

    static {
        Covode.recordClassIndex(6577);
    }

    public GameMsgRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getMaxHeight() {
        return this.f14995O;
    }

    public final void setMaxHeight(int i) {
        this.f14995O = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onMeasure(int i, int i2) {
        int i3 = this.f14995O;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    private /* synthetic */ GameMsgRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GameMsgRecyclerView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}

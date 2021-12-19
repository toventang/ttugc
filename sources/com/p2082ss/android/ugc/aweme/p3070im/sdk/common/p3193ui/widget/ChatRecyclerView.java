package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ChatRecyclerView */
public final class ChatRecyclerView extends RecyclerView {

    /* renamed from: O */
    private int f126431O;

    static {
        Covode.recordClassIndex(65062);
    }

    public ChatRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ ChatRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ChatRecyclerView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int m;
        View c;
        super.onLayout(z, i, i2, i3, i4);
        RecyclerView.AbstractC1362i layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null && !linearLayoutManager.f4338n && (m = linearLayoutManager.mo4373m()) >= 0 && (c = linearLayoutManager.mo4358c(m)) != null) {
            ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int i5 = ((RecyclerView.C1367j) layoutParams).topMargin;
            int top = c.getTop();
            if (top > i5 && this.f126431O == 0) {
                int i6 = i5 - top;
                this.f126431O = i6;
                linearLayoutManager.mo4721i(i6);
                linearLayoutManager.mo4329a(true);
            }
        }
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AutoPollRecyclerView */
public final class AutoPollRecyclerView extends RecyclerView {

    /* renamed from: P */
    public static final C70543a f157763P = new C70543a((byte) 0);

    /* renamed from: O */
    public boolean f157764O;

    static {
        Covode.recordClassIndex(83001);
    }

    public AutoPollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AutoPollRecyclerView$a */
    public static final class C70543a {
        static {
            Covode.recordClassIndex(83002);
        }

        private C70543a() {
        }

        public /* synthetic */ C70543a(byte b) {
            this();
        }
    }

    /* renamed from: q */
    public final void mo5599q() {
        if (this.f157764O) {
            this.f157764O = false;
            mo4479i();
        }
    }

    public final void setRunning(boolean z) {
        this.f157764O = z;
    }

    /* renamed from: g */
    public final void mo111272g(int i) {
        RecyclerView.AbstractC1350a adapter = getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            this.f157764O = true;
            if (i == -1) {
                mo4435d(0);
            } else {
                mo4435d(itemCount - 1);
            }
        }
    }

    /* renamed from: g */
    public final void mo111273g(int i, int i2) {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            RecyclerView.AbstractC1362i layoutManager = getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).mo4347a(i, i2);
            return;
        }
        throw new IllegalArgumentException("layoutManager must be a subclass of LinearLayoutManager");
    }

    private /* synthetic */ AutoPollRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AutoPollRecyclerView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}

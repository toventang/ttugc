package com.p2082ss.android.ugc.aweme.shortvideo.cut.model;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.ScrollInterceptedLayoutManager */
public final class ScrollInterceptedLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public boolean f156708a = true;

    static {
        Covode.recordClassIndex(82506);
    }

    public ScrollInterceptedLayoutManager() {
        super(0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: f */
    public final boolean mo4366f() {
        if (!super.mo4366f() || !this.f156708a) {
            return false;
        }
        return true;
    }

    public ScrollInterceptedLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

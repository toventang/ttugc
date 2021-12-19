package com.p2082ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.widget.a */
public class C34744a extends RecyclerView {

    /* renamed from: O */
    private List<Object> f82061O;

    static {
        Covode.recordClassIndex(41740);
    }

    public int getEndItemIndex() {
        if (!mo5599q()) {
            return getAdapter().getItemCount() - 1;
        }
        return 0;
    }

    public int getFirstPosition() {
        if (getChildCount() <= 0) {
            return -1;
        }
        return m4277d(getChildAt(0));
    }

    public int getLastPosition() {
        if (getChildCount() <= 0) {
            return -1;
        }
        return m4277d(getChildAt(getChildCount() - 1));
    }

    public int getStartItemIndex() {
        if (!mo5599q()) {
            return 0;
        }
        return getAdapter().getItemCount() - 1;
    }

    /* renamed from: q */
    private boolean mo5599q() {
        if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) getLayoutManager()).f4561f;
        }
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).f4336l;
        }
        return false;
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        List<Object> list = this.f82061O;
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public C34744a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C34744a(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}

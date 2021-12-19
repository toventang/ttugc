package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.AbstractC0320p;
import androidx.appcompat.view.menu.C0302h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;

public class NavigationMenuView extends RecyclerView implements AbstractC0320p {
    static {
        Covode.recordClassIndex(32112);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p
    /* renamed from: a */
    public final void mo817a(C0302h hVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NavigationMenuView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}

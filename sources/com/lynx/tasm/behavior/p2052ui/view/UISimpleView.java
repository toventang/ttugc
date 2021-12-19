package com.lynx.tasm.behavior.p2052ui.view;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.UIGroup;

/* renamed from: com.lynx.tasm.behavior.ui.view.UISimpleView */
public abstract class UISimpleView<T extends ViewGroup> extends UIGroup<T> {
    static {
        Covode.recordClassIndex(34776);
    }

    public UISimpleView(Context context) {
        this((AbstractC28520j) context);
    }

    public UISimpleView(AbstractC28520j jVar) {
        this(jVar, null);
    }

    public UISimpleView(AbstractC28520j jVar, Object obj) {
        super(jVar, obj);
    }
}

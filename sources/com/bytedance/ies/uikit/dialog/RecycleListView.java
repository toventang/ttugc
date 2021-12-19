package com.bytedance.ies.uikit.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RecycleListView extends ListView {

    /* renamed from: a */
    public boolean f43503a = true;

    static {
        Covode.recordClassIndex(20913);
    }

    public RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(13261);
        MethodCollector.m26664o(13261);
    }
}

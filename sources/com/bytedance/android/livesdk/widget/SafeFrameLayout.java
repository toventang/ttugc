package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.utils.C11228aq;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;

public class SafeFrameLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(13022);
    }

    public SafeFrameLayout(Context context) {
        super(context);
        MethodCollector.m26663i(2950);
        MethodCollector.m26664o(2950);
    }

    @Override // android.view.View
    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        try {
            super.restoreHierarchyState(sparseArray);
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "error_msg", e.toString());
            JSONObject a = C11228aq.m19888a((ViewGroup) this);
            C3866a.m9476a(jSONObject, "dump", a);
            int i = 0;
            if (a.optJSONObject("repeat_id") != null) {
                i = 1;
            }
            C3868c.m9492a("ttlive_xg_restore_dump", i, jSONObject);
        }
    }

    public SafeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(2954);
        MethodCollector.m26664o(2954);
    }
}

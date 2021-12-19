package com.lynx.tasm.p2054c;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;

/* renamed from: com.lynx.tasm.c.g */
public final class C28729g extends C28725c {
    static {
        Covode.recordClassIndex(34823);
    }

    /* renamed from: a */
    private void m57543a(JavaOnlyArray javaOnlyArray) {
        if (javaOnlyArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < javaOnlyArray.size(); i++) {
                JavaOnlyMap map = javaOnlyArray.getMap(i);
                if (map != null && !map.isEmpty()) {
                    arrayList.add(map);
                }
            }
            mo49838a("attachedCells", arrayList);
        }
    }

    private C28729g(int i, String str) {
        super(i, str);
    }

    /* renamed from: a */
    public static C28729g m57542a(int i, String str) {
        return new C28729g(i, str);
    }

    /* renamed from: a */
    public final void mo49841a(int i, JavaOnlyArray javaOnlyArray) {
        mo49838a("state", Integer.valueOf(i));
        if (javaOnlyArray != null) {
            m57543a(javaOnlyArray);
        }
    }

    /* renamed from: a */
    public final void mo49840a(int i, int i2, int i3, JavaOnlyArray javaOnlyArray) {
        if (DisplayMetricsHolder.m57911a() != null) {
            float f = DisplayMetricsHolder.m57911a().density;
            mo49838a("scrollLeft", Float.valueOf(0.0f / f));
            mo49838a("scrollTop", Float.valueOf(((float) i) / f));
            mo49838a("deltaX", Float.valueOf(((float) i2) / f));
            mo49838a("deltaY", Float.valueOf(((float) i3) / f));
            m57543a(javaOnlyArray);
        }
    }
}

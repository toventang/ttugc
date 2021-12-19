package com.bytedance.mira.plugin.hook.flipped;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.mira.plugin.hook.flipped.compat.AbstractC21417c;
import com.bytedance.mira.plugin.hook.flipped.compat.C21415a;
import com.bytedance.mira.plugin.hook.flipped.compat.C21416b;
import com.bytedance.mira.plugin.hook.flipped.compat.FlippedV2Impl;

/* renamed from: com.bytedance.mira.plugin.hook.flipped.a */
public final class C21414a {
    static {
        Covode.recordClassIndex(25034);
    }

    /* renamed from: a */
    public static void m40195a() {
        AbstractC21417c cVar;
        if (Build.VERSION.SDK_INT >= 30 || (Build.VERSION.SDK_INT == 29 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            cVar = new FlippedV2Impl();
        } else if (Build.VERSION.SDK_INT >= 28 || (Build.VERSION.SDK_INT == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            cVar = new C21416b();
        } else {
            cVar = new C21415a();
        }
        cVar.mo35017a();
    }
}

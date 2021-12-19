package com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a.f */
public final class C31319f {
    static {
        Covode.recordClassIndex(38019);
    }

    /* renamed from: a */
    public static void m65521a(int i) {
        C1731i.m5640b(new CallableC31320g(i), C1731i.f5564c);
    }

    /* renamed from: a */
    public static void m65522a(String str) {
        C1731i.m5640b(new CallableC31321h(str), C1731i.f5564c);
    }

    /* renamed from: b */
    static final /* synthetic */ Object m65523b(int i) {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null) {
            return null;
        }
        new C23144b(validTopActivity).mo37633a(R.style.nz).mo37640e(i).mo37637b();
        return null;
    }

    /* renamed from: b */
    static final /* synthetic */ Object m65524b(String str) {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null) {
            return null;
        }
        new C23144b(validTopActivity).mo37633a(R.style.nz).mo37635a(str).mo37637b();
        return null;
    }
}

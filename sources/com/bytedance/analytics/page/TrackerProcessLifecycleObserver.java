package com.bytedance.analytics.page;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class TrackerProcessLifecycleObserver implements AbstractC1202k {

    /* renamed from: a */
    public static final TrackerProcessLifecycleObserver f7813a = new TrackerProcessLifecycleObserver();

    /* renamed from: b */
    private static boolean f7814b = true;

    /* renamed from: com.bytedance.analytics.page.TrackerProcessLifecycleObserver$a */
    public /* synthetic */ class C2595a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7815a;

        static {
            Covode.recordClassIndex(2983);
            int[] iArr = new int[AbstractC1196i.EnumC1198a.values().length];
            iArr[AbstractC1196i.EnumC1198a.ON_START.ordinal()] = 1;
            iArr[AbstractC1196i.EnumC1198a.ON_STOP.ordinal()] = 2;
            f7815a = iArr;
        }
    }

    private TrackerProcessLifecycleObserver() {
    }

    static {
        Covode.recordClassIndex(2982);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (C2595a.f7815a[aVar.ordinal()] == 1 && f7814b) {
            f7814b = false;
        }
    }
}

package com.p2082ss.android.ugc.aweme.detail;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.b */
public final /* synthetic */ class C41110b implements AbstractC1214u {

    /* renamed from: a */
    private final AbstractC41102a f96105a;

    static {
        Covode.recordClassIndex(48989);
    }

    C41110b(AbstractC41102a aVar) {
        this.f96105a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        AbstractC41102a aVar = this.f96105a;
        if (((Boolean) obj).booleanValue() && aVar.f96084y != null) {
            aVar.f96084y.setMaxScrollHeight(Integer.MAX_VALUE);
            aVar.f96084y.scrollTo(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
    }
}

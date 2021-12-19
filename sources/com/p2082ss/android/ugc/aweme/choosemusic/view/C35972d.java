package com.p2082ss.android.ugc.aweme.choosemusic.view;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.d */
public final /* synthetic */ class C35972d implements AbstractC1214u {

    /* renamed from: a */
    private final AbstractC35966c f84938a;

    static {
        Covode.recordClassIndex(43218);
    }

    C35972d(AbstractC35966c cVar) {
        this.f84938a = cVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        AbstractC35966c cVar = this.f84938a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            KeyboardUtils.m70897c(cVar.f84916j);
        }
    }
}

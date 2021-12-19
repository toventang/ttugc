package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import java.util.Collection;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.q.e */
public final /* synthetic */ class C49868e implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC49815a f114953a;

    static {
        Covode.recordClassIndex(58975);
    }

    C49868e(AbstractC49815a aVar) {
        this.f114953a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC49815a aVar = this.f114953a;
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) obj;
        if (aVar.f114768W != null) {
            baseScrollSwitchStateManager.mo89345a(!C13603b.m24435a((Collection) aVar.f114768W.mo80288e()));
        }
    }
}

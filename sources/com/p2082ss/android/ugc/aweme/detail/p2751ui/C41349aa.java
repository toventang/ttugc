package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49679g;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.C89386u;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.ui.aa */
public final /* synthetic */ class C41349aa implements AbstractC1214u {

    /* renamed from: a */
    private final C41426z f96509a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f96510b;

    /* renamed from: c */
    private final int f96511c;

    static {
        Covode.recordClassIndex(49244);
    }

    C41349aa(C41426z zVar, ScrollSwitchStateManager scrollSwitchStateManager, int i) {
        this.f96509a = zVar;
        this.f96510b = scrollSwitchStateManager;
        this.f96511c = i;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C41426z zVar = this.f96509a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f96510b;
        int i = this.f96511c;
        C89386u uVar = (C89386u) obj;
        int intValue = ((Integer) uVar.getFirst()).intValue();
        ((Float) uVar.getSecond()).floatValue();
        int intValue2 = ((Integer) uVar.getThird()).intValue();
        if (intValue == scrollSwitchStateManager.mo89351c("page_feed")) {
            if (!zVar.f96639n) {
                zVar.f96639n = true;
                AbstractC81915c.m141874a(new C49679g());
            }
            if (intValue2 > i) {
                zVar.f96636k.mo70477b(false);
            } else {
                zVar.f96636k.mo70477b(true);
            }
        }
    }
}

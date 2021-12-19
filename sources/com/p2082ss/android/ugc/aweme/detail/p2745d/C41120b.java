package com.p2082ss.android.ugc.aweme.detail.p2745d;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34667a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.d.b */
public final class C41120b extends C34667a {

    /* renamed from: a */
    private final ActivityC0945e f96116a;

    /* renamed from: c */
    private final C41119a f96117c;

    static {
        Covode.recordClassIndex(49000);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager.AbstractC34662a, com.p2082ss.android.ugc.aweme.base.p2379ui.C34667a
    /* renamed from: a */
    public final boolean mo61309a(int i) {
        if (!this.f96117c.mo61309a(i)) {
            return false;
        }
        if (i == -1) {
            return ScrollSwitchStateManager.C52950a.m97811a(this.f96116a).mo89350b("page_discover");
        }
        return true;
    }

    public C41120b(ActivityC0945e eVar, C41119a aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        this.f96116a = eVar;
        this.f96117c = aVar;
    }
}

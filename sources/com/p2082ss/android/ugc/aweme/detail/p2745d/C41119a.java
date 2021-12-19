package com.p2082ss.android.ugc.aweme.detail.p2745d;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34667a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.d.a */
public final class C41119a extends C34667a {

    /* renamed from: a */
    private final ActivityC0945e f96115a;

    static {
        Covode.recordClassIndex(48999);
    }

    public C41119a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f96115a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager.AbstractC34662a, com.p2082ss.android.ugc.aweme.base.p2379ui.C34667a
    /* renamed from: a */
    public final boolean mo61309a(int i) {
        Aweme a;
        if (i == -1 && ScrollSwitchStateManager.C52950a.m97811a(this.f96115a).mo89350b("page_feed") && ((a = AwemeChangeCallBack.m108593a(this.f96115a)) == null || a.getAuthor() == null)) {
            return false;
        }
        return true;
    }
}

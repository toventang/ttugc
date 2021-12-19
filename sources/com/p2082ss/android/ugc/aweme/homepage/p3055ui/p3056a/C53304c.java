package com.p2082ss.android.ugc.aweme.homepage.p3055ui.p3056a;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34667a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.a.c */
public final class C53304c extends C34667a {

    /* renamed from: a */
    private final ActivityC0945e f122345a;

    /* renamed from: c */
    private final C53303b f122346c;

    static {
        Covode.recordClassIndex(62855);
    }

    /* renamed from: a */
    private final boolean m98257a() {
        if (!ScrollSwitchStateManager.C52950a.m97811a(this.f122345a).mo89350b("page_feed") || !C89219l.m154714a((Object) ScrollSwitchStateManager.C52950a.m97811a(this.f122345a).f121768j, (Object) "USER")) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager.AbstractC34662a, com.p2082ss.android.ugc.aweme.base.p2379ui.C34667a
    /* renamed from: a */
    public final boolean mo61309a(int i) {
        if (!this.f122346c.mo61309a(i) && !m98257a()) {
            return false;
        }
        if (i == -1) {
            if (ScrollSwitchStateManager.C52950a.m97811a(this.f122345a).mo89350b("page_discover") || m98257a()) {
                return true;
            }
            return false;
        } else if (i != 1 || !m98257a()) {
            return true;
        } else {
            return false;
        }
    }

    public C53304c(ActivityC0945e eVar, C53303b bVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bVar, "");
        this.f122345a = eVar;
        this.f122346c = bVar;
    }
}

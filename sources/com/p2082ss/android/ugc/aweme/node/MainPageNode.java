package com.p2082ss.android.ugc.aweme.node;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.AbstractC15501d;
import com.p2082ss.android.ugc.aweme.AbstractC35331bz;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.TabFragmentGroup;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53318b;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.node.MainPageNode */
public final class MainPageNode extends TabFragmentGroup {

    /* renamed from: j */
    private final ActivityC0945e f139655j;

    static {
        Covode.recordClassIndex(72186);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: Y_ */
    public final String mo62207Y_() {
        return "page_feed";
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: a */
    public final View mo62208a(AbstractC35331bz bzVar) {
        C89219l.m154721d(bzVar, "");
        return null;
    }

    @Override // com.bytedance.hox.AbstractC15498b
    /* renamed from: b */
    public final boolean mo25228b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.bytedance.hox.AbstractC15501d
    /* renamed from: d */
    public final String mo25232d() {
        return "page_feed";
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: g */
    public final Bundle mo25235g() {
        return null;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: f */
    public final Class<? extends Fragment> mo25234f() {
        return HomePageUIFrameServiceImpl.m108627e().mo89386b("page_feed");
    }

    public MainPageNode(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f139655j = eVar;
        for (T t : HomeTabViewModel.C53309a.m98315a(eVar).mo89736a()) {
            if (!(t instanceof C53318b)) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.bytedance.hox.HoxNode");
                mo25225a((AbstractC15501d) t);
            }
        }
    }

    @Override // com.bytedance.hox.AbstractC15498b
    /* renamed from: a */
    public final void mo25226a(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        TabChangeManager.C59002a.m108439a(this.f139655j).mo96533a(str, bundle.getBoolean(C34792be.f82122a, false));
    }
}

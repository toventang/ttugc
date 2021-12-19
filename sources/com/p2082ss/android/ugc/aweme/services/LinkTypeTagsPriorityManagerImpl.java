package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.link.C38038b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.services.LinkTypeTagsPriorityManagerImpl */
public final class LinkTypeTagsPriorityManagerImpl implements ILinkTypeTagsPriorityManager {
    static {
        Covode.recordClassIndex(79674);
    }

    public static ILinkTypeTagsPriorityManager createILinkTypeTagsPriorityManagerbyMonsterPlugin(boolean z) {
        Object a = C81908b.m141854a(ILinkTypeTagsPriorityManager.class, z);
        if (a != null) {
            return (ILinkTypeTagsPriorityManager) a;
        }
        return new LinkTypeTagsPriorityManagerImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public final boolean shouldShowAnchor(Aweme aweme) {
        if (aweme == null || C37699a.m76301i(aweme)) {
            return false;
        }
        C38214ac a = C38681bh.m78486a(aweme);
        if (a == null || !a.showOnFeed()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public final boolean shouldShowCommerce(Aweme aweme, boolean z, int i) {
        return C38038b.m77116a("shopping_cart", aweme, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public final boolean shouldShowMovie(Aweme aweme, boolean z, int i) {
        return C38038b.m77116a("movie", aweme, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public final boolean shouldShowOpenPlatform(Aweme aweme, boolean z, int i) {
        return C38038b.m77116a("open_platform", aweme, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public final boolean shouldShowSticker(Aweme aweme, boolean z, int i) {
        return C38038b.m77116a("sticker", aweme, z);
    }
}

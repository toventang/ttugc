package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.AbstractC35331bz;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.C43044dj;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53348m;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.hometab.HomeTab;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53318b;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationTab;
import com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.a */
public final class C53311a implements AbstractC35331bz {

    /* renamed from: a */
    public static final C53311a f122381a = new C53311a();

    private C53311a() {
    }

    static {
        Covode.recordClassIndex(62871);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35331bz
    /* renamed from: a */
    public final <T extends View> T mo62210a(C43044dj djVar) {
        C89219l.m154721d(djVar, "");
        return new C53348m((C33931ar) djVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35331bz
    /* renamed from: a */
    public final List<AbstractC35329by> mo62211a(Context context) {
        C89219l.m154721d(context, "");
        return C89070n.m154524c(new HomeTab(context), HomePageUIFrameServiceImpl.m108627e().mo89385b(context), new C53318b(context), new NotificationTab(context), ProfileServiceImpl.m114884g().mo101951a(context));
    }
}

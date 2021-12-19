package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.AbstractC35331bz;
import com.p2082ss.android.ugc.aweme.C43044dj;
import com.p2082ss.android.ugc.aweme.feed.api.FeedModuleServiceImpl;
import com.p2082ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53392e;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.b */
public final class C53312b implements AbstractC35331bz {

    /* renamed from: a */
    public static final C53312b f122382a = new C53312b();

    private C53312b() {
    }

    static {
        Covode.recordClassIndex(62872);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35331bz
    /* renamed from: a */
    public final <T extends View> T mo62210a(C43044dj djVar) {
        C89219l.m154721d(djVar, "");
        return new C53392e(djVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35331bz
    /* renamed from: a */
    public final List<AbstractC35329by> mo62211a(Context context) {
        C89219l.m154721d(context, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(FollowFeedServiceImpl.m95503c().mo86498a(context));
        AbstractC35329by b = FeedModuleServiceImpl.m91780a().mo80448b(context);
        C89219l.m154716b(b, "");
        arrayList.add(b);
        return arrayList;
    }
}

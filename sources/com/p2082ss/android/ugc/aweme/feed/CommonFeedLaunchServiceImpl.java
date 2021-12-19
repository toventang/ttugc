package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2329g.C33755c;
import com.p2082ss.android.ugc.aweme.app.p2329g.HandlerThreadC33754b;

/* renamed from: com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl */
public class CommonFeedLaunchServiceImpl implements ICommonFeedLaunchService {
    static {
        Covode.recordClassIndex(56737);
    }

    /* renamed from: b */
    public static ICommonFeedLaunchService m91019b() {
        Object a = C81908b.m141854a(ICommonFeedLaunchService.class, false);
        if (a != null) {
            return (ICommonFeedLaunchService) a;
        }
        return new CommonFeedLaunchServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    /* renamed from: a */
    public final void mo80038a() {
        if (C33755c.m69098a()) {
            HandlerThreadC33754b bVar = C33755c.m69099b().f79961a;
            if (bVar.f79958a != null) {
                bVar.f79958a.sendMessage(bVar.f79958a.obtainMessage(1));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    /* renamed from: a */
    public final void mo80039a(boolean z) {
        if (C49710k.f114395c == null) {
            C49710k.f114395c = Boolean.valueOf(z);
        }
    }
}

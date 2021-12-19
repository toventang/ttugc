package com.p2082ss.android.ugc.aweme.badge;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.badge.DialogC34423b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.services.badge.IBadgeService;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69109b;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69317i;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.badge.a */
public final class C34422a implements IBadgeService {
    static {
        Covode.recordClassIndex(41370);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.badge.IBadgeService
    public final void showBadgeShareDialog(Activity activity, Aweme aweme) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aweme, "");
        AwemeSharePackage a = AwemeSharePackage.C69206a.m122312a(aweme, activity, -1, "", "");
        C69684e.C69686b bVar = new C69684e.C69686b();
        boolean c = ShareDependService.C68822a.m121324a().mo109350c();
        if (IMService.createIIMServicebyMonsterPlugin(false) != null && !c) {
            C69317i.m122515a(bVar, ShareDependService.C68822a.m121324a().mo109325a(a, "others_homepage"));
        }
        C68863ah.f154027a.mo109409a(bVar, activity, false);
        bVar.mo109823a(new C69109b());
        bVar.f155584o = false;
        bVar.mo109824a(a);
        bVar.mo109826a(new DialogC34423b.C34424a.C34425a());
        C69684e a2 = bVar.mo109831a();
        Video video = aweme.getVideo();
        C89219l.m154716b(video, "");
        try {
            new DialogC34423b(activity, a2, video.getCover(), (byte) 0).show();
        } catch (Exception e) {
            C84911q.m145923a("BadgeShareDialog", e);
        }
    }
}

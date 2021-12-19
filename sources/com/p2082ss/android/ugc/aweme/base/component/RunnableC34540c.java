package com.p2082ss.android.ugc.aweme.base.component;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.experiment.C46993gt;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import org.greenrobot.eventbus.EventBus;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.component.c */
final /* synthetic */ class RunnableC34540c implements Runnable {

    /* renamed from: a */
    private final EventActivityComponent f81555a;

    /* renamed from: b */
    private final C71900f f81556b;

    /* renamed from: c */
    private final ActivityC0945e f81557c;

    static {
        Covode.recordClassIndex(41502);
    }

    RunnableC34540c(EventActivityComponent eventActivityComponent, C71900f fVar, ActivityC0945e eVar) {
        this.f81555a = eventActivityComponent;
        this.f81556b = fVar;
        this.f81557c = eVar;
    }

    public final void run() {
        EventActivityComponent eventActivityComponent = this.f81555a;
        C71900f fVar = this.f81556b;
        ActivityC0945e eVar = this.f81557c;
        Aweme aweme = (Aweme) fVar.f161090d;
        if (aweme.getStatus().getPrivateStatus() != 1 || !SharePrefCache.inst().getIsPrivateAvailable().mo59941c().booleanValue()) {
            String stickerIDs = aweme.getStickerIDs();
            String[] sharePostEffectIds = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().getSharePostEffectIds();
            if (sharePostEffectIds != null && stickerIDs != null) {
                int length = sharePostEffectIds.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (stickerIDs.contains(sharePostEffectIds[i])) {
                        Object obj = fVar.f161090d;
                        Aweme aweme2 = null;
                        if (obj instanceof Aweme) {
                            aweme2 = (Aweme) obj;
                        }
                        if (!(eventActivityComponent.f81549b == null || !C33067a.m67725a(eventActivityComponent.f81549b) || aweme2 == null)) {
                            AVExternalServiceImpl.m113114a().getBadgeService().showBadgeShareDialog(eventActivityComponent.f81549b, aweme2);
                        }
                    } else {
                        i++;
                    }
                }
            }
            if (fVar.f161094h instanceof CreateAwemeResponse) {
                CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) fVar.f161094h;
                if (createAwemeResponse.aweme.getAwemeType() == 40) {
                    AVExternalServiceImpl.m113114a().publishService().showLighteningPublishSuccessPopWindow(eVar, createAwemeResponse.aweme);
                } else if (fVar.f161094h.shoutOutsType <= 0 && !C68863ah.f154028b.mo109364a(fVar, eVar)) {
                    eventActivityComponent.f81548a = C68863ah.f154027a.mo109394a(eVar, (Aweme) fVar.f161090d);
                    String curUserId = C31575b.m65865g().getCurUserId();
                    C89219l.m154721d(curUserId, "");
                    eventActivityComponent.f81548a.setOnDismissListener(new C34541d(eventActivityComponent, C46993gt.f109502a.mo61049a("last_time_show_publish_success_window_".concat(String.valueOf(curUserId)))));
                    eventActivityComponent.f81548a.mo85244c();
                    long currentTimeMillis = System.currentTimeMillis();
                    C89219l.m154721d(curUserId, "");
                    C46993gt.f109502a.mo61053a("last_time_show_publish_success_window_".concat(String.valueOf(curUserId)), currentTimeMillis);
                    C73991bj.m130128a("PublishDurationMonitor MANUAL_END showSuccessWindow");
                }
            }
        } else {
            C68863ah.f154027a.mo109395a(eVar, (Aweme) fVar.f161090d, fVar.f161087a);
        }
        Object a = EventBus.m156962a().mo145391a(C71900f.class);
        if (a != null) {
            EventBus.m156962a().mo145399f(a);
        }
    }
}

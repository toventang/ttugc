package com.bytedance.android.livesdk.newvideogift;

import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.message.C9888r;
import com.bytedance.android.livesdk.newvideogift.p595a.C9950b;
import com.bytedance.android.livesdk.newvideogift.p595a.C9970j;
import com.bytedance.android.livesdk.service.p625c.p628c.C10731d;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11629a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.newvideogift.d */
final /* synthetic */ class RunnableC9985d implements Runnable {

    /* renamed from: a */
    private final LiveNewVideoGiftWidget f24261a;

    /* renamed from: b */
    private final C9888r f24262b;

    static {
        Covode.recordClassIndex(11539);
    }

    RunnableC9985d(LiveNewVideoGiftWidget liveNewVideoGiftWidget, C9888r rVar) {
        this.f24261a = liveNewVideoGiftWidget;
        this.f24262b = rVar;
    }

    public final void run() {
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = this.f24261a;
        C9888r rVar = this.f24262b;
        if (liveNewVideoGiftWidget.f24082d != null) {
            VideoGiftView videoGiftView = liveNewVideoGiftWidget.f24082d;
            if (videoGiftView.f24098f == null || rVar == null) {
                C10731d.C10732a.C10733a.f25859a.f25855e.mo142944a();
                return;
            }
            videoGiftView.setTextEffect(rVar.f23907i);
            videoGiftView.mo16655a(rVar);
            C9950b bVar = videoGiftView.f24098f;
            String str = rVar.f23902d;
            long j = rVar.f23899a;
            long j2 = rVar.f23908j;
            long j3 = rVar.f23900b;
            C3940j.m9594a().removeCallbacks(bVar.f24109g);
            if (bVar.f24107e == null) {
                bVar.f24107e = ((IGiftService) C6193a.m13435a(IGiftService.class)).giftPlayControllerManager().mo16679a(bVar.f24103a.hashCode());
                if (bVar.f24107e == null && (bVar.f24103a instanceof ActivityC0945e)) {
                    bVar.f24107e = ((IGiftService) C6193a.m13435a(IGiftService.class)).giftPlayControllerManager().mo16681b(bVar.f24103a.hashCode(), (ActivityC0580d) bVar.f24103a);
                }
                if (bVar.f24107e != null) {
                    bVar.f24107e.mo16665a(bVar.f24105c);
                    bVar.f24107e.mo16666a(bVar.f24106d);
                    bVar.f24107e.mo16663a(bVar.f24104b);
                }
                C3854a.m9453a(4, "GiftCtlManager", "play gift video fail, because player is null.");
            }
            AbstractC11629a aVar = bVar.f24107e;
            if (aVar != null) {
                bVar.f24111i = j;
                bVar.f24112j = j2;
                bVar.f24113k = j3;
                C9970j.m18395a(C9970j.EnumC9971a.playcontroller_start, bVar.f24111i, bVar.f24112j, bVar.f24113k);
                aVar.mo16667a(str, j);
                return;
            }
            C3854a.m9453a(4, "GiftCtlManager", "play gift video fail, because player is null.");
        }
    }
}

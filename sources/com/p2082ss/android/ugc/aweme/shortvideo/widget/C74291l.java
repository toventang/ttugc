package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63227bk;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p2082ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75382h;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.C76086b;
import com.p2082ss.android.ugc.aweme.sticker.types.unlock.C76108c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.l */
public final class C74291l {

    /* renamed from: a */
    ActivityC0945e f167056a;

    /* renamed from: b */
    AbstractC75382h f167057b;

    /* renamed from: c */
    OnUnlockShareFinishListener f167058c = new OnUnlockShareFinishListener() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.C74291l.C742921 */

        static {
            Covode.recordClassIndex(87064);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onVKShareSucceed(Effect effect) {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onShareAppFailed() {
            C63238c.f143568F.mo101710a(C74291l.this.f167056a);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onShareAppSucceed(Effect effect) {
            C76108c cVar = new C76108c();
            cVar.f170995a = UnLockSticker.STICKER_UNLOCKED;
            cVar.f170996b = effect;
            cVar.f170998d = true;
            AbstractC81915c.m141875b(cVar);
        }
    };

    static {
        Covode.recordClassIndex(87063);
    }

    /* renamed from: a */
    public final boolean mo116896a() {
        Effect a = m130699a(this.f167056a);
        if (!C72847c.m128632b(a) || C76086b.m133424a(a)) {
            return false;
        }
        this.f167057b.mo115244a(a);
        return true;
    }

    public C74291l(ActivityC0945e eVar) {
        this.f167056a = eVar;
        Effect a = m130699a(eVar);
        AbstractC63227bk bkVar = C63238c.f143568F;
        this.f167057b = bkVar.mo101708a(bkVar.mo101709a(), eVar, a, this.f167058c, false);
    }

    /* renamed from: a */
    private static Effect m130699a(ActivityC0945e eVar) {
        AbstractC84089j jVar;
        if (eVar == null || (jVar = (AbstractC84089j) ApiCenter.C2545a.m7450a(eVar).mo7015b(AbstractC84089j.class)) == null) {
            return null;
        }
        return jVar.mo23167t().mo119302n().mo119323b().getValue();
    }
}

package com.p2082ss.android.ugc.gamora.recorder.choosemusic;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.C2559g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a */
public interface AbstractC83490a extends AbstractC2547b {
    static {
        Covode.recordClassIndex(97376);
    }

    void changeCancelMusicBtnVisible(boolean z);

    void changeHasMusic(C69905c cVar);

    void changeMusicUi();

    void clearMusic();

    C89378p<Integer, Integer> getChooseMusicAnchorViewPosition();

    C69905c getCurrentMusic();

    C2559g<C89391z> getMusicAdded();

    C2559g<C89391z> getMusicCleared();

    C89378p<Effect, Boolean> getStickerMusicCancelState();

    void handleCancelMusicResultEvent();

    void handleChooseMusic(C40888d dVar);

    void handleChooseMusicResultEvent(C69905c cVar, String str);

    void initStitch();

    void onChooseMusicDone(boolean z, String str, C69905c cVar, String str2);

    boolean recordHasMusic();

    void setStickerMusicCancelState(C89378p<? extends Effect, Boolean> pVar);

    void setUiLoadingMusic(boolean z);

    void showMusicTips(Integer num);

    void startPreviewMusic(boolean z);

    void stopPreviewMusic();

    void stopStickerBGM();

    void tryHideMusicTips();

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a$a */
    public static final class C83491a {

        /* renamed from: a */
        public static final C83491a f186458a = new C83491a();

        private C83491a() {
        }

        static {
            Covode.recordClassIndex(97377);
        }

        /* renamed from: a */
        public static final AbstractC83490a m143864a(ActivityC0945e eVar) {
            AbstractC83490a b = m143865b(eVar);
            if (b == null) {
                C89219l.m154715b();
            }
            return b;
        }

        /* renamed from: b */
        public static final AbstractC83490a m143865b(ActivityC0945e eVar) {
            if (eVar == null) {
                return null;
            }
            return (AbstractC83490a) ApiCenter.C2545a.m7450a(eVar).mo7015b(AbstractC83490a.class);
        }
    }
}

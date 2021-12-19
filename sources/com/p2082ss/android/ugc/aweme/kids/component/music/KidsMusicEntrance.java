package com.p2082ss.android.ugc.aweme.kids.component.music;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.component.music.KidsMusicEntrance */
public final class KidsMusicEntrance implements IKidsMusicEntrance {
    static {
        Covode.recordClassIndex(67483);
    }

    /* renamed from: a */
    public static IKidsMusicEntrance m104241a() {
        MethodCollector.m26663i(7246);
        Object a = C81908b.m141854a(IKidsMusicEntrance.class, false);
        if (a != null) {
            IKidsMusicEntrance iKidsMusicEntrance = (IKidsMusicEntrance) a;
            MethodCollector.m26664o(7246);
            return iKidsMusicEntrance;
        }
        if (C81908b.f183211bN == null) {
            synchronized (IKidsMusicEntrance.class) {
                try {
                    if (C81908b.f183211bN == null) {
                        C81908b.f183211bN = new KidsMusicEntrance();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7246);
                    throw th;
                }
            }
        }
        KidsMusicEntrance kidsMusicEntrance = (KidsMusicEntrance) C81908b.f183211bN;
        MethodCollector.m26664o(7246);
        return kidsMusicEntrance;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance
    /* renamed from: a */
    public final void mo94340a(Fragment fragment, int i, String str, int i2, Object obj, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(obj, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        MusicModel musicModel = (MusicModel) obj;
        if (i2 == 2) {
            C57268c.f130442a = "video_shoot_page";
        } else {
            C57268c.f130442a = "video_edit_page";
        }
        String string = fragment.getString(R.string.ad6);
        SmartRoute withParam = SmartRouter.buildRoute(fragment.getContext(), "//choosemusic/kids/home").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        AVChallenge curChallenge = AVExternalServiceImpl.m113114a().publishService().getCurChallenge();
        if (curChallenge != null) {
            withParam.withParam("challenge", curChallenge.cid);
        }
        withParam.withParam("title", string).withParam("music_model", musicModel).withParam("music_allow_clear", z).withParam("music_is_photomv", z2).withParam("creation_id", str3).withParam("shoot_way", str2).withParam("hide_local_music", z4).withParam("extra_beat_music_sticker", z3);
        if (bundle != null) {
            withParam.withParam("arguments", bundle);
        }
        fragment.startActivityForResult(withParam.buildIntent(), i);
    }
}

package com.p2082ss.android.ugc.aweme.initializer;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.component.music.KidsMusicEntrance;
import com.p2082ss.android.ugc.aweme.music.model.MusicDetail;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60829g;
import com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60865q;
import com.p2082ss.android.ugc.aweme.music.presenter.C60856l;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63191aq;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69800b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.musicprovider.C84158e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.initializer.o */
public final class C56785o implements AbstractC63193as {
    static {
        Covode.recordClassIndex(66650);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as
    /* renamed from: b */
    public final String mo93926b() {
        return C84158e.m144733a().mo128989d();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as
    /* renamed from: a */
    public final String mo93920a() {
        return C84158e.m144733a().mo128988c();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as
    /* renamed from: a */
    public final String mo93921a(String str) {
        return C60829g.m110430a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as
    /* renamed from: a */
    public final C69905c mo93919a(Object obj) {
        if (obj != null) {
            return C69800b.m123327a((MusicModel) obj);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as
    /* renamed from: a */
    public final boolean mo93924a(int i) {
        if (MusicModel.MusicType.LOCAL.ordinal() == i) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as
    /* renamed from: a */
    public final void mo93923a(String str, final AbstractC63191aq aqVar) {
        C60856l lVar = new C60856l();
        lVar.mo67839a_(new AbstractC60865q() {
            /* class com.p2082ss.android.ugc.aweme.initializer.C56785o.C567861 */

            static {
                Covode.recordClassIndex(66651);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60865q
            /* renamed from: a */
            public final void mo93927a() {
                if (aqVar != null) {
                    new RuntimeException("music should not be null");
                    aqVar.mo101642a();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60865q
            /* renamed from: a */
            public final void mo93929a(Exception exc) {
                AbstractC63191aq aqVar = aqVar;
                if (aqVar != null) {
                    aqVar.mo101642a();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60865q
            /* renamed from: a */
            public final void mo93928a(MusicDetail musicDetail) {
                C69905c cVar;
                AbstractC63191aq aqVar = aqVar;
                if (aqVar != null) {
                    if (musicDetail.music != null) {
                        cVar = C69800b.m123327a(musicDetail.music.convertToMusicModel());
                    } else {
                        cVar = null;
                    }
                    aqVar.mo101643a(cVar);
                }
            }
        });
        lVar.mo57616a(str, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as
    /* renamed from: a */
    public final boolean mo93925a(C69905c cVar, Context context, boolean z) {
        if (C60826d.f138235b) {
            cVar.getMusicStatus();
            cVar.getPath();
        } else if (cVar == null) {
            return true;
        }
        if (!TextUtils.isEmpty(cVar.getPath()) && cVar.getMusicStatus() != 0) {
            return true;
        }
        String offlineDesc = cVar.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.dau);
        }
        if (!z) {
            return false;
        }
        new C79459a(context).mo123052a(offlineDesc).mo123053a();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as
    /* renamed from: a */
    public final void mo93922a(Fragment fragment, int i, String str, int i2, Object obj, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5) {
        if (AccountService.m65215a().mo57069e().isChildrenMode()) {
            KidsMusicEntrance.m104241a().mo94340a(fragment, i, str, i2, obj, z, z2, bundle, str2, str3, z3, z4);
            return;
        }
        MusicModel musicModel = (MusicModel) obj;
        if (i2 == 2) {
            C35936b.f84812a = "video_shoot_page";
        } else {
            C35936b.f84812a = "video_edit_page";
        }
        String string = fragment.getString(R.string.ad6);
        if (CommerceMediaServiceImpl.m77578f().mo66513b()) {
            string = fragment.getString(R.string.d_n);
        }
        SmartRoute withParam = SmartRouter.buildRoute(fragment.getContext(), "//choosemusic/home").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        AVChallenge curChallenge = AVExternalServiceImpl.m113114a().publishService().getCurChallenge();
        if (curChallenge != null) {
            withParam.withParam("challenge", curChallenge.cid);
        }
        withParam.withParam("title", string).withParam("music_model", musicModel).withParam("music_allow_clear", z).withParam("music_is_photomv", z2).withParam("creation_id", str3).withParam("shoot_way", str2).withParam("hide_local_music", z4).withParam("extra_beat_music_sticker", z3).withParam("long_video", z5);
        if (bundle != null) {
            withParam.withParam("arguments", bundle);
        }
        fragment.startActivityForResult(withParam.buildIntent(), i);
    }
}

package com.p2082ss.android.ugc.aweme.choosemusic.model;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.challenge.service.ChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.p2082ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a.AbstractC35878f;
import com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a.C35872c;
import com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a.C35877e;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.music.api.MusicApi;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IAVMobService;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.b */
public final class C35899b {

    /* renamed from: a */
    public ChooseMusicApi.API f84728a = ChooseMusicApi.f84343a;

    /* renamed from: b */
    public DataCenter f84729b;

    /* renamed from: c */
    public boolean f84730c;

    /* renamed from: d */
    Context f84731d;

    /* renamed from: e */
    IAVMobService f84732e;

    /* renamed from: f */
    public boolean f84733f;

    /* renamed from: g */
    public boolean f84734g;

    /* renamed from: h */
    public boolean f84735h;

    static {
        Covode.recordClassIndex(43139);
    }

    /* renamed from: a */
    public final void mo63025a(boolean z, String str, Music music, boolean z2, int i) {
        Integer num = (Integer) this.f84729b.mo60195b("radio_cursor", (Object) 0);
        if (num.intValue() != 0 || !C68027bm.m120329a() || m73272a()) {
            mo63021a(ChooseMusicApi.m72938a(num, str, z2, i), str, z, music);
        } else {
            C35872c.C35873a.m73265a().mo62973a(new C35877e(num.intValue(), str, z2, i), AbstractC35878f.C35879a.f84673a).mo143254a(new C35901c(this, str, z, music), new C35902d(this));
        }
    }

    /* renamed from: a */
    private static boolean m73272a() {
        if (CommerceMediaServiceImpl.m77578f().mo66516d()) {
            return true;
        }
        if (CommerceMediaServiceImpl.m77578f().mo66511a() || !CommerceMediaServiceImpl.m77578f().mo66515c()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo63026b(int i) {
        if (!this.f84734g) {
            this.f84734g = true;
            ChooseMusicApi.m72936a(0, 20, i).mo5534a(new C35903e(this, C27252o.m54253a()), C1731i.f5564c, null);
        }
    }

    /* renamed from: c */
    public final void mo63028c(int i) {
        if (!this.f84735h) {
            this.f84735h = true;
            this.f84728a.getHotMusicList(0, 20, false, i).mo5534a(new C35905g(this), C1731i.f5564c, null);
        }
    }

    /* renamed from: a */
    static List<Music> m73271a(List<Music> list) {
        ArrayList arrayList = new ArrayList();
        if (!CommerceMediaServiceImpl.m77578f().mo66517e() || list == null || list.isEmpty()) {
            return list;
        }
        for (Music music : list) {
            if (music.isCommercialMusic()) {
                arrayList.add(music);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo63020a(int i) {
        ChooseMusicApi.m72935a(0, i).mo5534a(new C35912n(this), C1731i.f5564c, null);
    }

    /* renamed from: a */
    private static C1731i<C35888ah> m73269a(C1731i<C35888ah> iVar, Music music) {
        if (music == null) {
            return iVar;
        }
        return iVar.mo5534a(new C35910l(music), C1731i.f5562a, null);
    }

    public C35899b(Context context, DataCenter dataCenter) {
        this.f84729b = dataCenter;
        this.f84731d = context;
        this.f84732e = AVExternalServiceImpl.m113114a().getAVMobService();
    }

    /* renamed from: a */
    static final /* synthetic */ C35888ah m73270a(Music music, C1731i iVar) {
        try {
            Music music2 = MusicApi.m110045a(music.getMid(), 0).music;
            if (music2 != null) {
                music.setCollectStatus(music2.getCollectStatus());
            }
        } catch (Exception unused) {
        }
        return (C35888ah) iVar.mo5545d();
    }

    /* renamed from: b */
    public final void mo63027b(String str, int i, int i2) {
        ChooseMusicApi.m72940b(str, 0, 30, i, i2).mo5534a(new C35916r(this, i), C1731i.f5564c, null);
    }

    /* renamed from: a */
    public final void mo63023a(String str, int i, int i2) {
        if (!this.f84733f) {
            this.f84733f = true;
            ChooseMusicApi.m72939a(str, 0, 30, i, i2).mo5534a(new C35914p(this), C1731i.f5564c, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63021a(C1731i<C35888ah> iVar, String str, boolean z, Music music) {
        C35909k kVar = new C35909k(this, z, str, music);
        if (music == null && Looper.myLooper() == Looper.getMainLooper()) {
            iVar.mo5532a(kVar);
        } else {
            m73269a(iVar, music).mo5534a(kVar, C1731i.f5564c, null);
        }
    }

    /* renamed from: a */
    public final void mo63024a(String str, String str2, Music music, final int i) {
        ChallengeServiceImpl.m72642a().mo62526a("data_challenge", str, str2, music, new IChallengeService.AbstractC35542a() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.model.C35899b.C359001 */

            /* renamed from: a */
            final /* synthetic */ boolean f84736a = false;

            static {
                Covode.recordClassIndex(43140);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel>, java.util.List */
            @Override // com.p2082ss.android.ugc.aweme.challenge.service.IChallengeService.AbstractC35542a
            /* renamed from: a */
            public final boolean mo62529a(String str, Challenge challenge) {
                List arrayList = new ArrayList();
                List<MusicModel> b = C35937c.m73327b(challenge.getConnectMusics());
                if (!CommerceMediaServiceImpl.m77578f().mo66517e() || b.isEmpty()) {
                    arrayList = b;
                } else {
                    for (MusicModel musicModel : b) {
                        if (musicModel.isCommerceMusic()) {
                            arrayList.add(musicModel);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    C35899b.this.f84729b.mo60191a(str, challenge);
                }
                return ((Boolean) C35899b.this.f84729b.mo60195b("is_busi_sticker", (Object) false)).booleanValue();
            }

            @Override // com.p2082ss.android.ugc.aweme.challenge.service.IChallengeService.AbstractC35542a
            /* renamed from: a */
            public final void mo62528a(String str, Music music, boolean z) {
                C35899b.this.mo63025a(this.f84736a, str, music, z, i);
            }
        });
    }

    /* renamed from: a */
    public final void mo63022a(MusicModel musicModel, String str, int i, int i2, int i3) {
        this.f84728a.collectMusic(str, i).mo5534a(new C35907i(this, musicModel, i, i2, i3, str), C1731i.f5564c, null);
    }
}

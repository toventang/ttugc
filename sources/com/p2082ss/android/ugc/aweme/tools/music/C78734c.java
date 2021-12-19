package com.p2082ss.android.ugc.aweme.tools.music;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61064a;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.music.service.IMusicService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40884a;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40885b;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40891f;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40886c;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63191aq;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63147a;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.C78694a;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.C78723e;
import com.p2082ss.android.ugc.aweme.tools.music.p4120a.C78678b;
import com.p2082ss.android.ugc.aweme.tools.music.p4120a.View$OnClickListenerC78654a;
import com.p2082ss.android.ugc.aweme.tools.music.p4123b.C78730a;
import com.p2082ss.android.ugc.aweme.tools.music.p4123b.C78733b;
import com.p2082ss.android.ugc.aweme.tools.music.p4124c.AbstractC78743a;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.C78744a;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.C78817e;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4126a.C78748b;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4127b.C78775g;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78819a;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78821b;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78823c;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78825d;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.c */
public final class C78734c implements AbstractC63154aa {

    /* renamed from: b */
    public final AbstractC63193as f176927b;

    static {
        Covode.recordClassIndex(91877);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: k */
    public final AbstractC63154aa.AbstractC63157c mo101552k() {
        return AIChooseMusicManager.f176813c;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: l */
    public final AbstractC63154aa.AbstractC63164i mo101553l() {
        return C78723e.f176911a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final void mo101538a(Activity activity, int i, C40886c cVar, AbstractC89172b<? super C40888d, C89391z> bVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        C78730a aVar2 = new C78730a((ActivityC0945e) activity);
        C78735a aVar3 = new C78735a(this, 110, cVar);
        C78730a.AbstractC78731a a = mo122579a(bVar, aVar);
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(a, "");
        C78733b bVar2 = aVar2.f176924a;
        if (bVar2 == null) {
            C89219l.m154710a("mAvoidOnResultFragment");
        }
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(a, "");
        List<C78730a.AbstractC78731a> list = bVar2.f176925a.get(110);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(list.size(), a);
        bVar2.f176925a.put(110, list);
        aVar3.invoke(bVar2);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final void mo101539a(Activity activity, FrameLayout frameLayout, C40886c cVar, AbstractC89172b<? super C40888d, C89391z> bVar, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(cVar, "");
        AVExternalServiceImpl.m113114a().provideAVPerformance().step(OpenMusicPanelPerformanceMonitor.f142464a, "open_choose_music_page");
        if (C68027bm.m120329a()) {
            IAccountUserService e = AccountService.m65215a().mo57069e();
            C89219l.m154716b(e, "");
            if (!e.isChildrenMode()) {
                IMusicService m = MusicService.m81198m();
                Bundle bundle = new Bundle();
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", cVar.f95696b);
                AVChallenge curChallenge = AVExternalServiceImpl.m113114a().publishService().getCurChallenge();
                if (curChallenge != null) {
                    bundle.putString("challenge", curChallenge.cid);
                }
                bundle.putString("title", cVar.f95695a);
                MusicModel musicModel = new MusicModel();
                musicModel.setMvThemeMusic(cVar.f95704j);
                bundle.putSerializable("music_model", musicModel);
                bundle.putBoolean("music_allow_clear", cVar.f95697c);
                bundle.putBoolean("music_is_photomv", cVar.f95698d);
                bundle.putString("creation_id", cVar.f95701g);
                bundle.putString("shoot_way", cVar.f95700f);
                bundle.putBoolean("long_video", cVar.f95705k);
                bundle.putBoolean("hide_local_music", cVar.f95703i);
                bundle.putBoolean("extra_beat_music_sticker", cVar.f95702h);
                if (cVar.f95699e != null) {
                    bundle.putBundle("arguments", cVar.f95699e);
                }
                m.mo69300a(activity, frameLayout, bundle, new C78736b(this, bVar, aVar), aVar2);
                return;
            }
        }
        mo101538a((AbstractC63154aa) activity, (Activity) 110, cVar, (AbstractC89172b) bVar, (AbstractC89171a) aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: a */
    public final void mo101746a(String str, AbstractC63191aq aqVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aqVar, "");
        this.f176927b.mo93923a(str, aqVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: a */
    public final void mo101744a(Context context, C69905c cVar, int i, AbstractC63257p.AbstractC63258a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        MusicService.m81198m().mo69301a(context, C78821b.C78822a.m137588a(cVar), i, new C78737c(aVar, cVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: a */
    public final boolean mo101747a(C69905c cVar, Context context, boolean z) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(context, "");
        return this.f176927b.mo93925a(cVar, context, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: a */
    public final String mo101742a(String str) {
        String a = this.f176927b.mo93921a(str);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final boolean mo101541a(int i) {
        return this.f176927b.mo93924a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final void mo101540a(Context context, String str, boolean z, ProgressDialog progressDialog, AbstractC63154aa.AbstractC63161f fVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        MusicService.m81198m().mo69303a(context, str, z, progressDialog, new C78739e(fVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: a */
    public final void mo101743a() {
        MusicService.m81198m().mo69315d();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final List<C69905c> mo101537a(int i, String str) {
        MusicList a;
        IMusicService m = MusicService.m81198m();
        if (m == null || (a = m.mo69295a(i, str)) == null || C84904k.m145909a(a.musicList)) {
            return null;
        }
        return C78821b.C78822a.m137589a(C78823c.C78824a.m137590a(a.musicList));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: a */
    public final void mo101745a(Context context, String str, UrlModel urlModel, AbstractC63257p.AbstractC63258a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(urlModel, "");
        MusicService.m81198m().mo69302a(context, str, urlModel, new C78738d(aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c$d */
    public static final class C78738d implements AbstractC61065b {

        /* renamed from: a */
        final /* synthetic */ AbstractC63257p.AbstractC63258a f176936a;

        static {
            Covode.recordClassIndex(91881);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: b */
        public final void mo69328b() {
            AbstractC63257p.AbstractC63258a aVar = this.f176936a;
            if (aVar != null) {
                aVar.mo101753a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69324a() {
            AbstractC63257p.AbstractC63258a aVar = this.f176936a;
            if (aVar != null) {
                aVar.mo101755a(-1, "");
            }
        }

        C78738d(AbstractC63257p.AbstractC63258a aVar) {
            this.f176936a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69325a(int i) {
            AbstractC63257p.AbstractC63258a aVar = this.f176936a;
            if (aVar != null) {
                aVar.mo101754a(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69326a(C84125a aVar) {
            C89219l.m154721d(aVar, "");
            AbstractC63257p.AbstractC63258a aVar2 = this.f176936a;
            if (aVar2 != null) {
                aVar2.mo101755a(Integer.valueOf(aVar.getErrorCode()), aVar.getErrorMsg());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
            C89219l.m154721d(str, "");
            AbstractC63257p.AbstractC63258a aVar = this.f176936a;
            if (aVar != null) {
                aVar.mo101756a(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: f */
    public final void mo101547f() {
        MusicService.m81198m().mo69322k();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: g */
    public final AbstractC63147a mo101548g() {
        return new C78775g();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: h */
    public final boolean mo101549h() {
        return C71529w.m126421a("music");
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: i */
    public final void mo101550i() {
        C71529w.m126422b("music");
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: j */
    public final void mo101551j() {
        C78748b.f176963h.mo122591a(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: b */
    public final boolean mo101749b() {
        IMusicService m = MusicService.m81198m();
        C89219l.m154716b(m, "");
        return m.mo69317f();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: c */
    public final String mo101750c() {
        AbstractC63193as asVar = this.f176927b;
        C89219l.m154716b(asVar, "");
        String a = asVar.mo93920a();
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: d */
    public final String mo101752d() {
        AbstractC63193as asVar = this.f176927b;
        C89219l.m154716b(asVar, "");
        String b = asVar.mo93926b();
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: e */
    public final void mo101546e() {
        MusicService.m81198m().mo69306a((Integer) 0);
    }

    public C78734c() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        this.f176927b = createIAVServiceProxybyMonsterPlugin.getMusicService();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: m */
    public final Class<?> mo101554m() {
        IMusicService m = MusicService.m81198m();
        C89219l.m154716b(m, "");
        Class<?> l = m.mo69323l();
        C89219l.m154716b(l, "");
        return l;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c$c */
    public static final class C78737c implements AbstractC61065b {

        /* renamed from: a */
        final /* synthetic */ AbstractC63257p.AbstractC63258a f176934a;

        /* renamed from: b */
        final /* synthetic */ C69905c f176935b;

        static {
            Covode.recordClassIndex(91880);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69324a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: b */
        public final void mo69328b() {
            this.f176934a.mo101753a();
            C39162r.m79460a("download_music", new C84425b().mo129406a("enter_from", "draft_page").mo129406a("music_id", this.f176935b.getMusicId()).f188764a);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69325a(int i) {
            this.f176934a.mo101754a(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69326a(C84125a aVar) {
            C89219l.m154721d(aVar, "");
            this.f176934a.mo101755a(Integer.valueOf(aVar.getErrorCode()), aVar.getErrorMsg());
        }

        C78737c(AbstractC63257p.AbstractC63258a aVar, C69905c cVar) {
            this.f176934a = aVar;
            this.f176935b = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
            C89219l.m154721d(str, "");
            this.f176934a.mo101756a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c$e */
    public static final class C78739e implements AbstractC61064a {

        /* renamed from: a */
        final /* synthetic */ AbstractC63154aa.AbstractC63161f f176937a;

        static {
            Covode.recordClassIndex(91882);
        }

        C78739e(AbstractC63154aa.AbstractC63161f fVar) {
            this.f176937a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61064a
        /* renamed from: a */
        public final void mo98583a(Exception exc) {
            C89219l.m154721d(exc, "");
            this.f176937a.mo101592a(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61064a
        /* renamed from: a */
        public final void mo98584a(String str, MusicModel musicModel) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(musicModel, "");
            AbstractC63154aa.AbstractC63161f fVar = this.f176937a;
            C69905c a = C78821b.m137586a(musicModel);
            if (a == null) {
                C89219l.m154715b();
            }
            fVar.mo101593a(str, a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c$g */
    public static final class C78741g implements AbstractC63154aa.AbstractC63162g {

        /* renamed from: a */
        final /* synthetic */ AbstractC40891f f176941a;

        static {
            Covode.recordClassIndex(91884);
        }

        C78741g(AbstractC40891f fVar) {
            this.f176941a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63162g
        /* renamed from: a */
        public final AbstractC63154aa.AbstractC63162g mo101595a(List<String> list) {
            C78678b.f176800c.f176803b = this.f176941a;
            C78678b.f176800c.mo122552a(list);
            return this;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63162g
        /* renamed from: a */
        public final AbstractC63154aa.AbstractC63162g mo101594a(AbstractC40885b bVar) {
            C89219l.m154721d(bVar, "");
            C78678b.f176800c.f176803b = this.f176941a;
            C78678b.f176800c.f176802a = new C78742a(bVar);
            return this;
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.c$g$a */
        static final class C78742a implements AbstractC78743a {

            /* renamed from: a */
            final /* synthetic */ AbstractC40885b f176942a;

            static {
                Covode.recordClassIndex(91885);
            }

            C78742a(AbstractC40885b bVar) {
                this.f176942a = bVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.music.p4124c.AbstractC78743a
            /* renamed from: a */
            public final void mo122542a(MusicModel musicModel, boolean z) {
                this.f176942a.mo70071a(C78821b.m137586a(musicModel), z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: b */
    public final C69905c mo101543b(MusicModel musicModel) {
        return C78821b.m137586a(musicModel);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final AbstractC63154aa.AbstractC63162g mo101531a(AbstractC40891f fVar) {
        C78678b.f176800c.f176803b = fVar;
        return new C78741g(fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: b */
    public final String mo101748b(C69905c cVar) {
        C89219l.m154721d(cVar, "");
        String a = MusicService.m81198m().mo69297a(C78821b.C78822a.m137588a(cVar));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: c */
    public final C69905c mo101544c(String str) {
        MusicModel musicModel;
        C89219l.m154721d(str, "");
        Music a = MusicService.m81198m().mo69293a(str);
        if (a != null) {
            musicModel = a.convertToMusicModel();
        } else {
            musicModel = null;
        }
        return C78821b.m137586a(musicModel);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: b */
    public final int mo101542b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int[] iArr = new int[10];
        if (str == null) {
            C89219l.m154715b();
        }
        int audioFileInfo = VEUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            return iArr[3];
        }
        C51423a.m95787a("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ".concat(String.valueOf(audioFileInfo)));
        return C80418fa.m139408b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: c */
    public final String mo101751c(C69905c cVar) {
        C89219l.m154721d(cVar, "");
        String b = MusicService.m81198m().mo69311b(C78821b.C78822a.m137588a(cVar));
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c$a */
    static final class C78735a extends AbstractC89220m implements AbstractC89172b<Fragment, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78734c f176928a;

        /* renamed from: b */
        final /* synthetic */ int f176929b;

        /* renamed from: c */
        final /* synthetic */ C40886c f176930c;

        static {
            Covode.recordClassIndex(91878);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78735a(C78734c cVar, int i, C40886c cVar2) {
            super(1);
            this.f176928a = cVar;
            this.f176929b = i;
            this.f176930c = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Fragment fragment) {
            Fragment fragment2 = fragment;
            C89219l.m154721d(fragment2, "");
            AbstractC63193as asVar = this.f176928a.f176927b;
            int i = this.f176929b;
            String str = this.f176930c.f95695a;
            int i2 = this.f176930c.f95696b;
            MusicModel musicModel = new MusicModel();
            musicModel.setMvThemeMusic(this.f176930c.f95704j);
            asVar.mo93922a(fragment2, i, str, i2, musicModel, this.f176930c.f95697c, this.f176930c.f95698d, this.f176930c.f95699e, this.f176930c.f95700f, this.f176930c.f95701g, this.f176930c.f95702h, this.f176930c.f95703i, this.f176930c.f95705k);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final AVChallenge mo101533a(Challenge challenge) {
        if (challenge != null) {
            return C78819a.m137583a(challenge);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: d */
    public final void mo101545d(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                String string = C78694a.f176838a.getString("ai_music_setting", "");
                if (!TextUtils.isEmpty(string)) {
                    C78744a.f176943a = (C78744a) C78825d.f177140a.mo46670a(string, C78744a.class);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            AIChooseMusicManager.m137318g();
            return;
        }
        try {
            C78744a.f176943a = (C78744a) C78825d.f177140a.mo46670a(str, C78744a.class);
            SharedPreferences.Editor edit = C78694a.f176838a.edit();
            edit.putString("ai_music_setting", str);
            edit.commit();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        AIChooseMusicManager.m137318g();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final C69905c mo101534a(Object obj) {
        C69905c a = this.f176927b.mo93919a(obj);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final C70625d mo101535a(Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        if (serializable instanceof MusicWaveBean) {
            C70625d dVar = new C70625d();
            dVar.setMusicWavePointArray(((MusicWaveBean) serializable).getMusicWavePointArray());
            return dVar;
        } else if (serializable instanceof C70625d) {
            return (C70625d) serializable;
        } else {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: a */
    public final MusicModel mo101740a(C69905c cVar) {
        if (cVar == null) {
            return null;
        }
        return C78821b.C78822a.m137588a(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final Object mo101536a(C70625d dVar) {
        if (dVar == null) {
            return null;
        }
        MusicWaveBean musicWaveBean = new MusicWaveBean();
        musicWaveBean.setMusicWavePointArray(dVar.getMusicWavePointArray());
        return musicWaveBean;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p
    /* renamed from: a */
    public final String mo101741a(MusicModel musicModel) {
        C89219l.m154721d(musicModel, "");
        String a = MusicService.m81198m().mo69297a(musicModel);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c$f */
    public static final class C78740f implements C78730a.AbstractC78731a {

        /* renamed from: a */
        final /* synthetic */ C78734c f176938a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f176939b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f176940c;

        static {
            Covode.recordClassIndex(91883);
        }

        /* renamed from: a */
        private static String m137454a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.music.p4123b.C78730a.AbstractC78731a
        /* renamed from: a */
        public final void mo122578a(int i, Intent intent) {
            Boolean bool;
            String str;
            Serializable serializable;
            String str2;
            C69905c a;
            if (i == -1) {
                MusicModel musicModel = null;
                if (intent != null) {
                    bool = Boolean.valueOf(intent.getBooleanExtra("is_cancel_current_choose_music", false));
                    str = m137454a(intent, "path");
                    serializable = intent.getSerializableExtra("music_model");
                } else {
                    bool = null;
                    str = null;
                    serializable = null;
                }
                MusicModel musicModel2 = (MusicModel) serializable;
                if (intent != null) {
                    str2 = m137454a(intent, "music_origin");
                } else {
                    str2 = null;
                }
                if (musicModel2 != null) {
                    int b = this.f176938a.mo101542b(str);
                    if (musicModel2.getMusicType() == MusicModel.MusicType.LOCAL) {
                        musicModel2.setLocalPath(str);
                        Music convertToMusic = musicModel2.convertToMusic();
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUri(str);
                        ArrayList arrayList = new ArrayList();
                        if (str != null) {
                            arrayList.add(str);
                        }
                        urlModel.setUrlList(arrayList);
                        if (convertToMusic != null) {
                            convertToMusic.setPlayUrl(urlModel);
                            musicModel = convertToMusic.convertToMusicModel();
                        }
                        a = C78821b.m137586a(musicModel);
                    } else {
                        a = C78821b.m137586a(musicModel2);
                    }
                    if (a != null) {
                        a.duration = b;
                    }
                    AbstractC89172b bVar = this.f176939b;
                    if (bVar != null) {
                        bVar.invoke(C40888d.C40889a.m82358a(bool, str2, a, str));
                        return;
                    }
                    return;
                }
                AbstractC89172b bVar2 = this.f176939b;
                if (bVar2 != null) {
                    bVar2.invoke(C40888d.C40889a.m82358a(bool, str2, null, str));
                    return;
                }
                return;
            }
            AbstractC89171a aVar = this.f176940c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        C78740f(C78734c cVar, AbstractC89172b bVar, AbstractC89171a aVar) {
            this.f176938a = cVar;
            this.f176939b = bVar;
            this.f176940c = aVar;
        }
    }

    /* renamed from: a */
    public final C78730a.AbstractC78731a mo122579a(AbstractC89172b<? super C40888d, C89391z> bVar, AbstractC89171a<C89391z> aVar) {
        return new C78740f(this, bVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c$b */
    static final class C78736b extends AbstractC89220m implements AbstractC89183m<Integer, Intent, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78734c f176931a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f176932b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f176933c;

        static {
            Covode.recordClassIndex(91879);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78736b(C78734c cVar, AbstractC89172b bVar, AbstractC89171a aVar) {
            super(2);
            this.f176931a = cVar;
            this.f176932b = bVar;
            this.f176933c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Intent intent) {
            this.f176931a.mo122579a(this.f176932b, this.f176933c).mo122578a(num.intValue(), intent);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final AbstractC63154aa.AbstractC63163h mo101532a(List<C69905c> list, AbstractC40895j jVar) {
        C89219l.m154721d(jVar, "");
        if (C84904k.m145909a(list)) {
            return new C78817e(new ArrayList(), jVar);
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            C89219l.m154715b();
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C78821b.C78822a.m137588a((C69905c) it.next()));
        }
        return new C78817e(arrayList, jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa
    /* renamed from: a */
    public final AbstractC63154aa.AbstractC63159d mo101530a(ActivityC0218d dVar, AbstractC31071f fVar, AbstractC40884a aVar, boolean z, int i, AbstractC89171a<String> aVar2) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return new View$OnClickListenerC78654a(dVar, fVar, aVar, z, i, aVar2);
    }
}

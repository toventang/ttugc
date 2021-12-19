package com.p2082ss.android.ugc.aweme.shortvideo.p3839l;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34724j;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.detail.api.DetailApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.DuetConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.StickerDownloadConfig;
import com.p2082ss.android.ugc.aweme.setting.C68190n;
import com.p2082ss.android.ugc.aweme.setting.C68340s;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70661b;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.C72731b;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.C72732c;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.C72733d;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.ProgressDialogC72983g;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.util.C80159r;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p077b.C1731i;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.b */
public final class C71924b {

    /* renamed from: a */
    public String f161168a = "";

    /* renamed from: b */
    public Map<String, String> f161169b = Collections.emptyMap();

    /* renamed from: c */
    public String f161170c;

    /* renamed from: d */
    public Effect f161171d = null;

    /* renamed from: e */
    public int f161172e;

    /* renamed from: f */
    public ProgressDialogC74145d f161173f;

    /* renamed from: g */
    ProgressDialogC72983g f161174g;

    /* renamed from: h */
    protected Activity f161175h;

    /* renamed from: i */
    public AbstractC71934a f161176i = new C71935b();

    /* renamed from: j */
    public List<String> f161177j;

    /* renamed from: k */
    public Aweme f161178k;

    /* renamed from: l */
    public String f161179l = "";

    /* renamed from: m */
    public boolean f161180m = false;

    /* renamed from: n */
    public boolean f161181n = false;

    /* renamed from: o */
    public boolean f161182o;

    /* renamed from: p */
    public boolean f161183p;

    /* renamed from: q */
    public int f161184q;

    /* renamed from: r */
    public final IRecordService.UICallback f161185r = new IRecordService.UICallback() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.C719294 */

        static {
            Covode.recordClassIndex(84478);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService.UICallback
        public final void postFail() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService.UICallback
        public final boolean checkIsCanceled() {
            return C71924b.this.f161182o;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService.UICallback
        public final void preSuccess() {
            C71924b.this.mo113568a();
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService.UICallback
        public final void postSuccess() {
            AbstractC71934a aVar = C71924b.this.f161176i;
            C71924b.this.f161178k.getAid();
            aVar.mo59730a();
            C33744d dVar = new C33744d();
            C71924b.this.mo113569a(dVar);
            dVar.mo59980a("loading_status", 1);
            AVExternalServiceImpl.m113114a().getAVMobService().onEventV3("loading_finish", dVar.f79943a);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService.UICallback
        public final void preFail(int i) {
            C71924b.this.mo113573b();
        }
    };

    /* renamed from: s */
    public Runnable f161186s = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.RunnableC719338 */

        static {
            Covode.recordClassIndex(84482);
        }

        public final void run() {
            if (C71924b.this.f161173f != null) {
                ProgressDialogC74145d dVar = C71924b.this.f161173f;
                int i = 100;
                if (C71924b.this.f161172e < 100) {
                    i = C71924b.this.f161172e;
                }
                dVar.setProgress(i);
            }
        }
    };

    /* renamed from: t */
    private String f161187t = "duet";

    /* renamed from: u */
    private String f161188u;

    /* renamed from: v */
    private String f161189v;

    /* renamed from: w */
    private String f161190w = AVExternalServiceImpl.m113114a().configService().cacheConfig().cacheDir();

    /* renamed from: x */
    private Handler f161191x = new Handler(Looper.getMainLooper());

    /* renamed from: y */
    private long f161192y;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.b$a */
    public interface AbstractC71934a {
        static {
            Covode.recordClassIndex(84483);
        }

        /* renamed from: a */
        void mo59730a();

        /* renamed from: b */
        void mo59731b();
    }

    static {
        Covode.recordClassIndex(84473);
    }

    /* renamed from: e */
    private static boolean m127000e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: h */
    private void m127003h() {
        C29339a.m58754b(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.RunnableC719327 */

            static {
                Covode.recordClassIndex(84481);
            }

            public final void run() {
                if (C71924b.this.f161175h != null) {
                    new C23144b(C71924b.this.f161175h).mo37640e(R.string.sz).mo37637b();
                }
            }
        });
    }

    /* renamed from: i */
    private boolean m127004i() {
        return TextUtils.equals("duet_page", this.f161179l);
    }

    /* renamed from: b */
    public final void mo113573b() {
        C29339a.m58754b(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.RunnableC719316 */

            static {
                Covode.recordClassIndex(84480);
            }

            public final void run() {
                if (C71924b.this.f161175h != null) {
                    if (!C71924b.this.f161183p) {
                        C71924b.this.f161183p = true;
                        C33744d dVar = new C33744d();
                        C71924b.this.mo113569a(dVar);
                        dVar.mo59980a("loading_status", 0);
                        AVExternalServiceImpl.m113114a().getAVMobService().onEventV3("loading_finish", dVar.f79943a);
                    }
                    if (!C68340s.m120620a() || !C71924b.this.f161182o) {
                        C71924b.this.mo113568a();
                        new C23144b(C71924b.this.f161175h).mo37640e(R.string.bba).mo37637b();
                        C71924b.this.f161176i.mo59731b();
                    }
                }
            }
        });
    }

    /* renamed from: f */
    private static boolean m127001f() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean e = m127000e();
        C58029j.f132256h = e;
        return e;
    }

    /* renamed from: j */
    private void m127005j() {
        if (this.f161174g == null) {
            if (C68340s.m120620a()) {
                this.f161174g = ProgressDialogC72983g.C72985b.m128885a(this.f161175h, ProgressDialogC72983g.EnumC72984a.VISIBLE_AFTER_5S, new C71945l(this));
            } else {
                this.f161174g = ProgressDialogC72983g.C72985b.m128884a(this.f161175h);
            }
            this.f161174g.mo115402a();
            this.f161174g.setMessage(this.f161175h.getResources().getString(R.string.bde));
            this.f161192y = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo113574c() {
        if (C68190n.m120442a()) {
            ProgressDialogC72983g gVar = this.f161174g;
            if (gVar != null) {
                gVar.setMessage(this.f161175h.getResources().getString(R.string.fvf));
                return;
            }
            return;
        }
        mo113568a();
        Activity activity = this.f161175h;
        ProgressDialogC74145d a = ProgressDialogC74145d.m130371a(activity, activity.getResources().getString(R.string.fvf));
        this.f161173f = a;
        a.setIndeterminate(true);
    }

    /* renamed from: g */
    private void m127002g() {
        C1731i<TResult> iVar;
        if (C80635y.m139808c(this.f161178k)) {
            VideoUrlModel playAddrH264 = this.f161178k.getVideo().getPlayAddrH264();
            if (playAddrH264 == null || C13603b.m24435a((Collection) playAddrH264.getUrlList())) {
                this.f161176i.mo59731b();
                return;
            }
            C1731i[] iVarArr = new C1731i[2];
            this.f161171d = null;
            final C1743j jVar = new C1743j();
            AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("duet", new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.C719272 */

                static {
                    Covode.recordClassIndex(84476);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    C71924b.this.mo113573b();
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    Video video = C71924b.this.f161178k.getVideo();
                    if (video == null) {
                        jVar.mo5555a((Object) null);
                    } else {
                        asyncAVService.uiService().recordService().preloadDuetLayout(video.getWidth(), video.getHeight(), new C71946m(this, jVar));
                    }
                }
            });
            iVarArr[0] = jVar.f5610a;
            final C1743j jVar2 = new C1743j();
            C1731i.m5640b(CallableC71942i.f161217a, C1731i.f5562a);
            VideoUrlModel playAddrH2642 = this.f161178k.getVideo().getPlayAddrH264();
            this.f161177j = C72732c.m128229a(playAddrH2642.getUrlList(), this.f161178k);
            String b = C13607d.m24442b(playAddrH2642.getBitRatedRatioUri());
            this.f161170c = this.f161190w + b + ".mp4";
            this.f161188u = this.f161190w + "temp_" + b + ".mp4";
            this.f161189v = this.f161190w + "temp_" + b + ".wav";
            if (C80720e.m139927b(this.f161170c)) {
                jVar2.mo5555a((Object) null);
                iVar = jVar2.f5610a;
            } else {
                if (!C80720e.m139927b(this.f161170c)) {
                    C80720e.m139917a(this.f161190w, false);
                }
                C72733d.m128230a(this.f161178k, this.f161177j, this.f161190w, b + ".mp4", new C72731b(this.f161177j, this.f161187t) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.C719283 */

                    static {
                        Covode.recordClassIndex(84477);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.AbstractC72729a
                    /* renamed from: a */
                    public final boolean mo113581a() {
                        return C71924b.this.f161182o;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.AbstractC72729a
                    /* renamed from: a */
                    public final void mo113580a(String str, String str2) {
                        super.mo113580a(str, str2);
                        if (new File(str2).length() == 0) {
                            Exception exc = new Exception("WaterMarkComposer download file size == 0: " + C71924b.this.f161177j);
                            C51423a.m95790a((Throwable) exc);
                            jVar2.mo5554a(exc);
                            return;
                        }
                        C71924b.this.f161170c = str2;
                        jVar2.mo5555a((Object) null);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.AbstractC72729a
                    /* renamed from: a */
                    public final void mo113579a(Exception exc, String str, Integer num) {
                        super.mo113579a(exc, str, num);
                        jVar2.mo5554a(exc);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.AbstractC72729a
                    /* renamed from: a */
                    public final void mo113578a(int i, long j, long j2) {
                        super.mo113578a(i, j, j2);
                        if (C71924b.this.f161175h != null) {
                            C71924b.this.f161184q = i;
                            C71924b.this.f161172e = i;
                            if (!C68190n.m120442a()) {
                                C29339a.m58754b(C71924b.this.f161186s);
                            }
                        }
                    }
                });
                iVar = jVar2.f5610a;
            }
            iVarArr[1] = iVar;
            C1731i.m5638b((Collection<? extends C1731i<?>>) C27404ap.m54809a(iVarArr)).mo5534a(new C71940g(this), C1731i.f5564c, null);
            this.f161184q = 0;
            this.f161191x.postDelayed(new RunnableC71941h(this), 60000);
        } else if (!C58071d.m104909c() || this.f161178k.getAuthor() == null || !this.f161178k.getAuthor().isPreventDownload()) {
            mo113568a();
            if (this.f161175h != null) {
                new C23144b(this.f161175h).mo37640e(R.string.bdm).mo37637b();
            }
        } else if (this.f161175h != null) {
            mo113568a();
            new C23144b(this.f161175h).mo37640e(R.string.bdf).mo37637b();
            this.f161176i.mo59731b();
        }
    }

    /* renamed from: a */
    public final void mo113568a() {
        ProgressDialogC74145d dVar;
        ProgressDialogC72983g gVar;
        if (C68190n.m120442a() && (gVar = this.f161174g) != null) {
            try {
                gVar.dismiss();
            } catch (Exception unused) {
            }
            this.f161174g = null;
        } else if (!C68190n.m120442a() && (dVar = this.f161173f) != null) {
            try {
                dVar.dismiss();
            } catch (Exception unused2) {
            }
            this.f161173f = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo113575d() {
        String str;
        String str2;
        String shootway;
        if (C80580in.m139687c()) {
            return;
        }
        if (this.f161175h != null) {
            if (TextUtils.isEmpty(this.f161168a)) {
                this.f161168a = UUID.randomUUID().toString();
            }
            RecordConfig.Builder creationId = new RecordConfig.Builder().creationId(this.f161168a);
            if (m127004i()) {
                str = "duet_page";
            } else {
                str = "duet";
            }
            RecordConfig.Builder musicOrigin = creationId.shootWay(str).enterFrom(this.f161179l).groupId(this.f161178k.getAid()).musicOrigin("duet");
            final DuetConfig duetConfig = new DuetConfig(this.f161170c, this.f161188u, this.f161189v, this.f161178k.getAuthor(), this.f161178k.getAid(), 1000, m126998a(this.f161178k), this.f161180m, this.f161181n);
            Aweme aweme = this.f161178k;
            if (aweme != null && aweme.hasStickerID()) {
                musicOrigin.stickers(C80159r.m138917a(this.f161178k.getStickerIDs()));
            }
            Aweme aweme2 = this.f161178k;
            if (!(aweme2 == null || aweme2.getMusic() == null)) {
                musicOrigin.musicModel(this.f161178k.getMusic().convertToMusicModel());
            }
            Aweme aweme3 = this.f161178k;
            if (!(aweme3 == null || aweme3.getGameInfo() == null)) {
                duetConfig.setDuetGameScore(Integer.valueOf(this.f161178k.getGameInfo().getGameScore()));
                duetConfig.setMStickerDownloadConfig(new StickerDownloadConfig(m126999b(this.f161178k), C58071d.m104913g()));
            }
            final RecordConfig build = musicOrigin.build();
            C33744d a = new C33744d().mo59983a("creation_id", build.getCreationId()).mo59983a("shoot_way", build.getShootway()).mo59982a("is_ui_shoot", (Object) false).mo59981a("time_elapsed_since_launch_app", AVExternalServiceImpl.m113114a().infoService().getDurationSinceAppForeground(this.f161168a)).mo59986a(this.f161169b).mo59980a("is_through_duet_sticker", this.f161180m ? 1 : 0).mo59980a("is_from_duet_button", this.f161181n ? 1 : 0).mo59983a("prop_id", this.f161178k.getStickerIDs());
            if (m127004i()) {
                a.mo59983a("origin_group_id", this.f161178k.getAid());
                a.mo59983a("origin_author_id", this.f161178k.getAuthorUid());
            } else {
                a.mo59983a("group_id", build.getGroupId());
            }
            C49812b a2 = FeedParamProvider.C49809a.m93270a(this.f161175h);
            if (a2 == null || a2.getNewsId() == null) {
                str2 = "";
            } else {
                str2 = a2.getNewsId();
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo59983a("news_id", str2);
            }
            a.mo59983a("duet_layout", "new_left");
            AVExternalServiceImpl.m113114a().getAVMobService().onEventV3("shoot", a.f79943a);
            duetConfig.setOutputDir(this.f161190w);
            duetConfig.setDuetLayout(this.f161171d);
            Aweme aweme4 = this.f161178k;
            if (!(aweme4 == null || aweme4.getFromRawChallenge() == null || !this.f161178k.getFromRawChallenge().isCommerce())) {
                duetConfig.setDuetChallenge(this.f161178k.getFromRawChallenge().getChallengeName());
            }
            C59213ah.f134852a = build.getEnterFrom();
            if (TextUtils.isEmpty(build.getShootway())) {
                shootway = "duet_with_movie";
            } else {
                shootway = build.getShootway();
            }
            AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel(shootway, new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.C719305 */

                static {
                    Covode.recordClassIndex(84479);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    C71924b.this.mo113573b();
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    asyncAVService.uiService().recordService().startDuet(C71924b.this.f161175h, build, duetConfig, C71924b.this.f161185r, C71924b.this.f161179l, build.getShootway());
                }
            });
            return;
        }
        mo113573b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.b$b */
    class C71935b implements AbstractC71934a {
        static {
            Covode.recordClassIndex(84484);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.AbstractC71934a
        /* renamed from: a */
        public final void mo59730a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.AbstractC71934a
        /* renamed from: b */
        public final void mo59731b() {
        }

        C71935b() {
        }
    }

    /* renamed from: a */
    private void m126997a(String str) {
        if (this.f161175h != null) {
            new C23144b(this.f161175h).mo37635a(str).mo37637b();
            mo113568a();
            this.f161176i.mo59731b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Object mo113572b(C1731i iVar) {
        if (!iVar.mo5544c() && !iVar.mo5539b() && iVar.mo5545d() != null) {
            this.f161178k = (Aweme) iVar.mo5545d();
        }
        m127002g();
        return null;
    }

    /* renamed from: a */
    private static boolean m126998a(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getDuetStickerStruct() != null) {
                    return interactStickerStruct.getDuetStickerStruct().getOpenMic();
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static String m126999b(Aweme aweme) {
        if (aweme.getStickerIDs() != null && !aweme.getStickerIDs().isEmpty()) {
            try {
                return aweme.getStickerIDs().split(",")[0];
            } catch (NumberFormatException unused) {
                C51423a.m95787a("id format error");
            }
        }
        return "-1";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo113567a(C1731i iVar) {
        if (iVar.mo5544c()) {
            mo113573b();
            return null;
        } else if (this.f161182o) {
            return null;
        } else {
            C29339a.m58754b(new RunnableC71943j(this));
            C29339a.m58752a(new RunnableC71944k(this));
            return null;
        }
    }

    /* renamed from: a */
    public final void mo113569a(C33744d dVar) {
        String str;
        C33744d a = dVar.mo59983a("creation_id", this.f161168a);
        if (m127004i()) {
            str = "duet_page";
        } else {
            str = "duet";
        }
        a.mo59983a("shoot_way", str).mo59983a("enter_from", this.f161179l).mo59981a("loading_duration", System.currentTimeMillis() - this.f161192y).mo59983a("group_id", this.f161178k.getVideo().getPlayAddrH264().getSourceId()).mo59983a("content_source", "shoot").mo59983a("content_type", "video").mo59983a("loading_type", "video");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo113566a(Activity activity, C1731i iVar) {
        if (iVar.mo5544c() || iVar.mo5539b()) {
            m126997a(activity.getResources().getString(R.string.dcr));
        } else if (!((C70661b) iVar.mo5545d()).f158161a) {
            String str = ((C70661b) iVar.mo5545d()).f158164d;
            if (TextUtils.isEmpty(str)) {
                str = activity.getResources().getString(R.string.re);
            }
            m126997a(str);
        } else if (!C80635y.m139808c(this.f161178k)) {
            C1731i.m5640b(new CallableC71938e(this), C1731i.f5562a).mo5534a(new C71939f(this), C1731i.f5564c, null);
        } else {
            m127002g();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo113570a(Aweme aweme, Activity activity, String str) {
        this.f161175h = activity;
        this.f161182o = false;
        if (!AVExternalServiceImpl.m113114a().publishService().isPublishable()) {
            m127003h();
            this.f161176i.mo59731b();
        } else if (C80580in.m139687c()) {
            this.f161176i.mo59731b();
            mo113568a();
        } else {
            this.f161178k = aweme;
            this.f161179l = str;
            if (!(aweme == null || aweme.getAuthor() == null)) {
                if (!C80720e.m139939e()) {
                    new C23144b(this.f161175h).mo37640e(R.string.feu).mo37637b();
                } else if (C80720e.m139940f() < 20971520) {
                    new C23144b(this.f161175h).mo37640e(R.string.fev).mo37637b();
                } else if (CommerceMediaServiceImpl.m77578f().mo66514b(this.f161178k.getMusic())) {
                    if (this.f161175h != null) {
                        new C23144b(this.f161175h).mo37640e(R.string.fq9).mo37637b();
                    }
                } else if (this.f161175h == null || m127001f()) {
                    if (C68190n.m120442a()) {
                        m127005j();
                    } else {
                        if (this.f161173f == null) {
                            Activity activity2 = this.f161175h;
                            this.f161173f = ProgressDialogC74145d.m130371a(activity2, activity2.getResources().getString(R.string.bde));
                        }
                        this.f161173f.setIndeterminate(false);
                        this.f161173f.setProgress(0);
                        this.f161192y = System.currentTimeMillis();
                    }
                    C1731i.m5640b(new CallableC71936c(aweme), C1731i.f5562a).mo5534a(new C71937d(this, activity), C1731i.f5564c, null);
                    return;
                } else {
                    new C23144b(this.f161175h).mo37640e(R.string.dcr).mo37637b();
                    return;
                }
            }
            this.f161176i.mo59731b();
            mo113568a();
        }
    }

    /* renamed from: a */
    public final void mo113571a(final String str, Activity activity, final String str2) {
        Activity activity2;
        this.f161175h = activity;
        this.f161182o = false;
        if (!AVExternalServiceImpl.m113114a().publishService().isPublishable()) {
            m127003h();
            this.f161176i.mo59731b();
        } else if (C34724j.m70936a(str)) {
            this.f161176i.mo59731b();
        } else if (this.f161175h == null || m127001f()) {
            this.f161175h = activity;
            this.f161179l = str2;
            if (m127004i()) {
                this.f161187t = "duet_page";
            }
            if (C68190n.m120442a() && this.f161174g == null && this.f161175h != null) {
                m127005j();
            } else if (!C68190n.m120442a() && this.f161173f == null && (activity2 = this.f161175h) != null) {
                ProgressDialogC74145d a = ProgressDialogC74145d.m130371a(activity2, activity2.getResources().getString(R.string.bde));
                this.f161173f = a;
                a.setIndeterminate(true);
                this.f161192y = System.currentTimeMillis();
            }
            C29339a.m58752a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.RunnableC719251 */

                static {
                    Covode.recordClassIndex(84474);
                }

                public final void run() {
                    try {
                        final Aweme a = DetailApi.m82809a(str, "", 0);
                        C29339a.m58754b(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.RunnableC719251.RunnableC719261 */

                            static {
                                Covode.recordClassIndex(84475);
                            }

                            public final void run() {
                                if (C71924b.this.f161175h != null) {
                                    Aweme aweme = a;
                                    if (aweme == null) {
                                        C71924b.this.mo113568a();
                                    } else if (aweme.getStatus() != null && a.getStatus().isPrivate()) {
                                        new C23144b(C71924b.this.f161175h).mo37640e(R.string.cc8).mo37637b();
                                        C71924b.this.mo113568a();
                                        C71924b.this.f161176i.mo59731b();
                                    } else if (a.getStatus() == null || !a.getStatus().isDelete()) {
                                        C71924b.this.mo113570a(a, C71924b.this.f161175h, str2);
                                    } else {
                                        new C23144b(C71924b.this.f161175h).mo37640e(R.string.cc7).mo37637b();
                                        C71924b.this.mo113568a();
                                        C71924b.this.f161176i.mo59731b();
                                    }
                                }
                            }
                        });
                    } catch (Exception unused) {
                        C71924b.this.mo113573b();
                    }
                }
            });
        } else {
            new C23144b(this.f161175h).mo37640e(R.string.dcr).mo37637b();
        }
    }
}

package com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.C57081b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57086b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.C57093f;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57107a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.AbstractC57122f;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.ProgressDialogC57125a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57145a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57146b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57147c;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57154a;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57158b;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57160c;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57166d;
import com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57155a;
import com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57157c;
import com.p2082ss.android.ugc.aweme.kids.p3314b.p3316b.C57159a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.a.h.d */
public class C57136d {

    /* renamed from: a */
    private C0484a<String, Boolean> f130071a = new C0484a<>();

    /* renamed from: c */
    protected AbstractC57135c f130072c;

    /* renamed from: d */
    protected int f130073d;

    /* renamed from: e */
    public ProgressDialog f130074e;

    /* renamed from: f */
    public C57160c f130075f;

    /* renamed from: g */
    protected C57081b f130076g;

    /* renamed from: h */
    public AbstractC57141a f130077h;

    /* renamed from: i */
    public String f130078i;

    /* renamed from: j */
    public C57107a f130079j;

    /* renamed from: k */
    public boolean f130080k;

    /* renamed from: l */
    public MusicModel f130081l;

    /* renamed from: m */
    public int f130082m;

    /* renamed from: n */
    protected CountDownTimer f130083n;

    /* renamed from: o */
    public boolean f130084o;

    /* renamed from: p */
    public long f130085p = -1;

    /* renamed from: q */
    public boolean f130086q = true;

    /* renamed from: r */
    public AbstractC57155a f130087r;

    /* renamed from: com.ss.android.ugc.aweme.kids.a.h.d$a */
    public interface AbstractC57141a {
        static {
            Covode.recordClassIndex(67035);
        }

        /* renamed from: a */
        void mo94302a();
    }

    static {
        Covode.recordClassIndex(67030);
    }

    /* renamed from: a */
    protected static String m103514a(int i, int i2) {
        if (i2 == 0) {
            switch (i) {
                case 0:
                    return "edit_page_list";
                case 1:
                    return "edit_page_favourite";
                case 2:
                    return "edit_page_search";
                case 3:
                    return "edit_page_banner";
                case 4:
                default:
                    return "";
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return "edit_page_local";
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return "single_song";
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return "edit_page_fm";
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return "sticker_rec";
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return "challenge_rec";
            }
        } else if (i2 != 2) {
            return "";
        } else {
            switch (i) {
                case 0:
                    return "shoot_page_list";
                case 1:
                    return "shoot_page_favourite";
                case 2:
                    return "shoot_page_search";
                case 3:
                    return "shoot_page_banner";
                case 4:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                default:
                    return "";
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return "shoot_page_local";
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return "shoot_page_fm";
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return "sticker_rec";
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return "challenge_rec";
            }
        }
    }

    /* renamed from: a */
    public void mo94287a() {
        mo94292b();
    }

    /* renamed from: f */
    private static boolean m103516f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo94292b() {
        CountDownTimer countDownTimer = this.f130083n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f130075f.mo94354b();
    }

    /* renamed from: c */
    public void mo94295c() {
        this.f130075f.mo94352a(new AbstractC57157c() {
            /* class com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d.C571371 */

            static {
                Covode.recordClassIndex(67031);
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57157c
            /* renamed from: a */
            public final void mo94299a(int i) {
                if (C57136d.this.f130081l != null) {
                    C57136d dVar = C57136d.this;
                    dVar.mo94293b(dVar.f130081l, C57136d.this.f130082m, C57136d.this.f130084o);
                }
                if (C57136d.this.f130086q) {
                    C57136d.this.mo94289a("play_music");
                }
                if (C57136d.this.f130080k && C57136d.this.f130075f != null) {
                    C57136d.this.mo94292b();
                }
                if (C57136d.this.f130072c != null) {
                    if (!(C57136d.this.f130072c.mo94283h() == null || i == 0)) {
                        C57136d.this.f130072c.mo94283h().setDuration(i);
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo94298e() {
        ProgressDialog progressDialog = this.f130074e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f130074e = null;
        }
    }

    /* renamed from: d */
    public void mo94297d() {
        this.f130071a.clear();
        CountDownTimer countDownTimer = this.f130083n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.f130072c != null) {
            this.f130072c = null;
        }
        if (this.f130077h != null) {
            this.f130077h = null;
        }
        C57081b bVar = this.f130076g;
        C57093f fVar = bVar.f129952b;
        for (Map.Entry<String, AbstractC57086b> entry : fVar.f129979a.entrySet()) {
            entry.getKey();
            entry.getValue().mo94242a();
        }
        for (Map.Entry<String, AbstractC57086b> entry2 : fVar.f129980b.entrySet()) {
            entry2.getKey();
            entry2.getValue().mo94242a();
        }
        fVar.f129979a.clear();
        fVar.f129980b.clear();
        AbstractC57122f fVar2 = bVar.f129953c;
        if (fVar2 != null) {
            fVar2.mo94268e();
        }
        this.f130075f.mo94349a();
    }

    /* renamed from: b */
    public final C57136d mo94291b(int i) {
        this.f130073d = i;
        return this;
    }

    public C57136d(AbstractC57135c cVar) {
        this.f130072c = cVar;
        this.f130075f = new C57160c();
        C57081b bVar = new C57081b(this.f130072c.mo94284i(), "music_choose_page");
        this.f130076g = bVar;
        bVar.f129951a = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo94294b(String str) {
        this.f130071a.put(str, false);
        CountDownTimer countDownTimer = this.f130083n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C57081b bVar = this.f130076g;
        C89219l.m154721d(str, "");
        C57093f fVar = bVar.f129952b;
        C89219l.m154721d(str, "");
        AbstractC57086b remove = fVar.f129979a.remove(str);
        if (remove != null) {
            remove.mo94243b();
        }
        AbstractC57086b remove2 = fVar.f129980b.remove(str);
        if (remove2 != null) {
            remove2.mo94243b();
        }
        AbstractC57122f fVar2 = bVar.f129953c;
        if (fVar2 != null) {
            fVar2.mo94268e();
        }
    }

    /* renamed from: a */
    public final void mo94289a(String str) {
        String str2;
        C57107a aVar;
        String str3;
        if (this.f130081l != null) {
            C33744d a = new C33744d().mo59983a("music_id", this.f130081l.getMusicId());
            int i = this.f130082m;
            String str4 = "song_choose_page";
            String str5 = "";
            if (i != 0) {
                if (i == 1) {
                    str4 = "collection_music";
                } else if (i != 2) {
                    str4 = i == 3 ? "song_category" : str5;
                }
            }
            C33744d a2 = a.mo59983a("enter_from", str4).mo59983a("enter_method", "click_play_music");
            int i2 = this.f130073d;
            if (i2 != 1) {
                if (i2 == 0) {
                    str2 = "video_edit_page";
                } else if (i2 == 2) {
                    str2 = "video_shoot_page";
                }
                C33744d a3 = a2.mo59983a("previous_page", str2);
                aVar = this.f130079j;
                if (aVar != null || aVar.f130020b == null) {
                    str3 = str5;
                } else {
                    str3 = this.f130079j.f130020b;
                }
                C33744d a4 = a3.mo59983a("category_id", str3);
                C57107a aVar2 = this.f130079j;
                if (!(aVar2 == null || aVar2.f130019a == null)) {
                    str5 = this.f130079j.f130019a;
                }
                C39162r.m79460a(str, a4.mo59983a("category_name", str5).f79943a);
            }
            str2 = str5;
            C33744d a32 = a2.mo59983a("previous_page", str2);
            aVar = this.f130079j;
            if (aVar != null) {
            }
            str3 = str5;
            C33744d a42 = a32.mo59983a("category_id", str3);
            C57107a aVar22 = this.f130079j;
            str5 = this.f130079j.f130019a;
            C39162r.m79460a(str, a42.mo59983a("category_name", str5).f79943a);
        }
    }

    /* renamed from: a */
    private void m103515a(final MusicModel musicModel, final String str, boolean z) {
        this.f130076g.mo94241a(musicModel, new AbstractC57123a() {
            /* class com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d.C571404 */

            static {
                Covode.recordClassIndex(67034);
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
            /* renamed from: a */
            public final void mo94228a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
            /* renamed from: b */
            public final void mo94232b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
            /* renamed from: a */
            public final void mo94230a(C57154a aVar) {
                C57136d.this.mo94298e();
                if (C57136d.this.f130072c != null && C57136d.this.f130072c.mo94285j()) {
                    C57136d.this.f130072c.mo94284i();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
            /* renamed from: a */
            public final void mo94229a(int i) {
                if (C57136d.this.f130072c != null && C57136d.this.f130072c.mo94285j() && C57136d.this.f130072c.mo94284i() != null && C57136d.this.f130074e != null) {
                    C57136d.this.f130074e.setProgress(i);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
            /* renamed from: a */
            public final void mo94231a(String str, MusicWaveBean musicWaveBean) {
                musicModel.setMusicWaveBean(musicWaveBean);
                C57136d.this.mo94290a(str, musicModel, str);
            }
        }, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo94293b(final MusicModel musicModel, final int i, final boolean z) {
        CountDownTimer countDownTimer = this.f130083n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
            long realAuditionDuration = (long) musicModel.getRealAuditionDuration();
            if (realAuditionDuration <= 0) {
                C51423a.m95787a("MusicDownloadPlayHelper: audition_duration is zero, music id: " + musicModel.getMusicId());
                return;
            }
            CountDownTimerC571382 r1 = new CountDownTimer(realAuditionDuration) {
                /* class com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d.CountDownTimerC571382 */

                static {
                    Covode.recordClassIndex(67032);
                }

                public final void onTick(long j) {
                }

                public final void onFinish() {
                    C57136d.this.f130075f.mo94354b();
                    if (C57136d.this.f130087r != null) {
                        C57136d.this.f130087r.mo94347a();
                    }
                    if (z) {
                        C57136d.this.mo94288a(musicModel, i, true);
                    }
                }
            };
            this.f130083n = r1;
            r1.start();
        }
    }

    /* renamed from: a */
    public void mo94288a(MusicModel musicModel, int i, boolean z) {
        AbstractC57135c cVar;
        Activity i2;
        this.f130085p = SystemClock.elapsedRealtime();
        if (musicModel != null && (cVar = this.f130072c) != null && (i2 = cVar.mo94284i()) != null) {
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m103516f();
            }
            if (!C58029j.f132256h) {
                new C79459a(i2).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            this.f130082m = i;
            if (C57147c.m103544a(musicModel, i2, true)) {
                MusicModel a = C57145a.m103539a(musicModel);
                this.f130081l = a;
                this.f130084o = z;
                this.f130075f.mo94354b();
                String localPath = a.getLocalPath();
                C57159a aVar = new C57159a();
                aVar.f130123f = a.getMusicId();
                if (a.getMusicType() == MusicModel.MusicType.ONLINE) {
                    aVar.f130120c = 4;
                    String str = C57166d.m103601a().f130152a.mo94369a() + C57158b.m103575c(localPath);
                    aVar.f130121d = a.getRealAuditionDuration();
                    if (TextUtils.isEmpty(str) || !C80720e.m139927b(str) || new File(str).length() <= 0) {
                        if (a.isNeedSetCookie()) {
                            String cookie = CookieManager.getInstance().getCookie(a.getUrl().getUrlList().get(0));
                            HashMap<String, String> hashMap = new HashMap<>();
                            hashMap.put("cookie", cookie);
                            aVar.f130122e = hashMap;
                        }
                        aVar.f130119b = a.getUrl().getUrlList();
                        this.f130075f.mo94353a(aVar, z);
                        AbstractC57141a aVar2 = this.f130077h;
                        if (aVar2 != null) {
                            aVar2.mo94302a();
                            return;
                        }
                        return;
                    }
                    aVar.f130118a = str;
                    this.f130075f.mo94353a(aVar, z);
                    AbstractC57141a aVar3 = this.f130077h;
                    if (aVar3 != null) {
                        aVar3.mo94302a();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo94296c(final MusicModel musicModel, final int i, boolean z) {
        if (this.f130072c != null && musicModel != null) {
            this.f130081l = musicModel;
            this.f130080k = false;
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                AVExternalServiceImpl.m113114a().abilityService().infoService().mp3Legal(musicModel.getLocalPath(), new IAVInfoService.IGetInfoCallback<Integer>() {
                    /* class com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d.C571393 */

                    static {
                        Covode.recordClassIndex(67033);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
                    public final /* synthetic */ void finish(Integer num) {
                        if (num.intValue() == 0) {
                            C57136d.this.mo94290a(musicModel.getLocalPath(), musicModel, C57136d.m103514a(i, C57136d.this.f130073d));
                            return;
                        }
                        Activity i = C57136d.this.f130072c.mo94284i();
                        if (i != null) {
                            new C79459a(i).mo123050a(R.string.cxu).mo123053a();
                        }
                    }
                });
                return;
            }
            mo94292b();
            Activity i2 = this.f130072c.mo94284i();
            if (i2 == null || !C57147c.m103544a(musicModel, i2, true)) {
                new Exception(i2.getString(R.string.dau));
            } else if (musicModel.getMusicType().equals(MusicModel.MusicType.ONLINE)) {
                String musicId = musicModel.getMusicId();
                AbstractC57135c cVar = this.f130072c;
                if (cVar != null) {
                    Activity i3 = cVar.mo94284i();
                    ProgressDialogC57125a.EnumC57126a aVar = ProgressDialogC57125a.EnumC57126a.VISIBLE_AFTER_5S;
                    C57142e eVar = new C57142e(this, musicId);
                    C89219l.m154721d(i3, "");
                    C89219l.m154721d(aVar, "");
                    C89219l.m154721d(eVar, "");
                    ProgressDialogC57125a aVar2 = new ProgressDialogC57125a(i3, aVar, (byte) 0);
                    aVar2.f130058c = eVar;
                    aVar2.setCancelable(false);
                    if ((i3 instanceof Activity) && C33067a.m67726a(i3, true) && !i3.isFinishing()) {
                        aVar2.show();
                    }
                    this.f130074e = aVar2;
                }
                this.f130071a.put(musicModel.getMusicId(), true);
                String a = m103514a(i, this.f130073d);
                AVExternalServiceImpl.m113114a().provideAVPerformance().start("av_music_download", "MusicDownloadPlayHelper start");
                if (TextUtils.isEmpty(musicModel.getBindChallengeId()) || TextUtils.equals(musicModel.getBindChallengeId(), "0")) {
                    m103515a(musicModel, a, z);
                } else {
                    C1731i.m5640b(new CallableC57143f(musicModel), C1731i.f5562a).mo5534a(new C57144g(this, musicModel, a, z), C1731i.f5564c, null);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo94290a(String str, MusicModel musicModel, String str2) {
        AbstractC57135c cVar = this.f130072c;
        if (cVar != null) {
            this.f130080k = true;
            if (cVar.mo94284i() != null) {
                mo94292b();
                C57146b.m103541a().pause();
                AVExternalServiceImpl.m113114a().publishService().setCurMusic(musicModel);
                ProgressDialog progressDialog = this.f130074e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                this.f130072c.mo94282a(str, musicModel, str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo94286a(MusicModel musicModel, String str, boolean z, C1731i iVar) {
        if (!this.f130071a.get(musicModel.getMusicId()).booleanValue()) {
            return null;
        }
        if (iVar.mo5539b() || iVar.mo5544c()) {
            mo94298e();
            return null;
        }
        m103515a(musicModel, str, z);
        return null;
    }
}

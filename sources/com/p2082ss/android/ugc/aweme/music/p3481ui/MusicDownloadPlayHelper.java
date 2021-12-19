package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.core.app.ActivityC0580d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.p025c.C0484a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.UIUXBugsExperimentService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.AbstractC60326a;
import com.p2082ss.android.ugc.aweme.music.C60789f;
import com.p2082ss.android.ugc.aweme.music.model.MusicCategory;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60825c;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.music.p3481ui.ProgressDialogC61165e;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import com.p2082ss.android.ugc.musicprovider.C84157d;
import com.p2082ss.android.ugc.musicprovider.C84158e;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;
import com.p2082ss.android.ugc.musicprovider.p4318a.C84126a;
import com.p2082ss.android.ugc.musicprovider.p4320c.C84140b;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper */
public class MusicDownloadPlayHelper implements AbstractC33974au, AbstractC60326a {

    /* renamed from: a */
    private Context f138605a;

    /* renamed from: b */
    private C0484a<String, Boolean> f138606b = new C0484a<>();

    /* renamed from: c */
    protected AbstractC61180m f138607c;

    /* renamed from: d */
    protected int f138608d;

    /* renamed from: e */
    public ProgressDialog f138609e;

    /* renamed from: f */
    public C84157d f138610f;

    /* renamed from: g */
    protected C60789f f138611g;

    /* renamed from: h */
    public AbstractC61086a f138612h;

    /* renamed from: i */
    public boolean f138613i;

    /* renamed from: j */
    public ProgressDialogC61165e f138614j;

    /* renamed from: k */
    public String f138615k;

    /* renamed from: l */
    public MusicCategory f138616l;

    /* renamed from: m */
    public int f138617m;

    /* renamed from: n */
    public boolean f138618n;

    /* renamed from: o */
    public MusicModel f138619o;

    /* renamed from: p */
    public int f138620p;

    /* renamed from: q */
    protected CountDownTimer f138621q;

    /* renamed from: r */
    public boolean f138622r;

    /* renamed from: s */
    public long f138623s = -1;

    /* renamed from: t */
    public boolean f138624t = true;

    /* renamed from: u */
    public AbstractC84160a f138625u;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper$a */
    public interface AbstractC61086a {
        static {
            Covode.recordClassIndex(71689);
        }

        /* renamed from: a */
        void mo62754a();
    }

    static {
        Covode.recordClassIndex(71683);
    }

    /* renamed from: a */
    private static String mo63048a(int i) {
        switch (i) {
            case 0:
            case 1:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return "change_music_page";
            case 2:
                return "search_music";
            case 3:
                return "change_music_page_detail";
            case 4:
            default:
                return "";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "personal_homepage";
        }
    }

    /* renamed from: a */
    protected static String m110644a(int i, int i2) {
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

    /* renamed from: c */
    private static String m110649c(int i) {
        if (i == 0) {
            return "music_library_hot";
        }
        if (i == 1) {
            return "music_library_mine";
        }
        if (i == 2) {
            return "music_library_search";
        }
        if (i == 3) {
            return "music_library_list";
        }
        return null;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            dismissDialog();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    public void aw_() {
        mo63044c();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: f */
    public final void mo97996f() {
        mo63044c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r9 != false) goto L_0x008c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98619a(final com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel r5, final int r6, boolean r7, boolean r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper.mo98619a(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, int, boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo98621a(String str, MusicModel musicModel, String str2) {
        AbstractC61180m mVar = this.f138607c;
        if (mVar != null) {
            this.f138618n = true;
            if (mVar.mo62886i() != null) {
                mo63044c();
                C60825c.m110422a().pause();
                mo98606a(musicModel);
                ProgressDialog progressDialog = this.f138609e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                this.f138613i = false;
                C80273bt.m139146b(this.f138614j);
                this.f138607c.mo62880a(str, musicModel, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo98620a(String str) {
        if (this.f138619o != null) {
            if (this.f138620p == 2) {
                C33744d dVar = new C33744d();
                dVar.mo59983a("music_id", this.f138619o.getMusicId()).mo59983a("enter_from", "search_music").mo59983a("search_keyword", C60826d.f138234a).mo59983a("log_pb", new C27910f().mo46674b(this.f138619o.getLogPb()));
                C39162r.m79461a(str, C61143be.m110761a(dVar.f79943a));
                return;
            }
            C33744d a = new C33744d().mo59983a("music_id", this.f138619o.getMusicId());
            int i = this.f138620p;
            String str2 = "";
            String str3 = "song_choose_page";
            if (i != 0) {
                if (i == 1) {
                    str3 = "collection_music";
                } else if (i != 2) {
                    str3 = i == 3 ? "song_category" : str2;
                }
            }
            C33744d a2 = a.mo59983a("enter_from", str3).mo59983a("enter_method", "click_play_music");
            int i2 = this.f138608d;
            if (i2 != 1) {
                if (i2 == 0) {
                    str2 = "video_edit_page";
                } else if (i2 == 2) {
                    str2 = "video_shoot_page";
                }
            }
            C39162r.m79460a(str, a2.mo59983a("previous_page", str2).mo59983a("category_id", m110652i()).mo59983a("category_name", m110653j()).f79943a);
        }
    }

    /* renamed from: g */
    public final void mo98626g() {
        AbstractC61086a aVar = this.f138612h;
        if (aVar != null) {
            aVar.mo62754a();
        }
    }

    /* renamed from: i */
    private String m110652i() {
        MusicCategory musicCategory = this.f138616l;
        if (musicCategory == null || musicCategory.categoryId == null) {
            return "";
        }
        return this.f138616l.categoryId;
    }

    /* renamed from: j */
    private String m110653j() {
        MusicCategory musicCategory = this.f138616l;
        if (musicCategory == null || musicCategory.categoryName == null) {
            return "";
        }
        return this.f138616l.categoryName;
    }

    /* renamed from: k */
    private static boolean m110654k() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public void mo63043b() {
        this.f138610f.mo128981a(new AbstractC84162c() {
            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper.C610811 */

            static {
                Covode.recordClassIndex(71684);
            }

            @Override // com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c
            /* renamed from: a */
            public final void mo63046a(int i) {
                if (MusicDownloadPlayHelper.this.f138619o != null) {
                    MusicDownloadPlayHelper musicDownloadPlayHelper = MusicDownloadPlayHelper.this;
                    musicDownloadPlayHelper.mo98624c(musicDownloadPlayHelper.f138619o, MusicDownloadPlayHelper.this.f138620p, MusicDownloadPlayHelper.this.f138622r);
                }
                if (MusicDownloadPlayHelper.this.f138624t) {
                    MusicDownloadPlayHelper.this.mo98620a("play_music");
                }
                if (MusicDownloadPlayHelper.this.f138618n && MusicDownloadPlayHelper.this.f138610f != null) {
                    MusicDownloadPlayHelper.this.mo63044c();
                }
                if (MusicDownloadPlayHelper.this.f138607c != null) {
                    if (!(MusicDownloadPlayHelper.this.f138607c.mo62885h() == null || i == 0)) {
                        MusicDownloadPlayHelper.this.f138607c.mo62885h().setDuration(i);
                    }
                    MusicDownloadPlayHelper.this.f138607c.mo62876a(MusicDownloadPlayHelper.this.f138619o, SystemClock.elapsedRealtime() - MusicDownloadPlayHelper.this.f138623s);
                    MusicDownloadPlayHelper.this.mo98626g();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo63044c() {
        CountDownTimer countDownTimer = this.f138621q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f138610f.mo128984b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = (androidx.fragment.app.ActivityC0945e) r0.mo62886i();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m110651h() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.music.ui.m r0 = r4.f138607c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.app.Activity r0 = r0.mo62886i()
            androidx.fragment.app.e r0 = (androidx.fragment.app.ActivityC0945e) r0
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            com.ss.android.ugc.aweme.base.SafeHandler r3 = new com.ss.android.ugc.aweme.base.SafeHandler
            r3.<init>(r0)
            com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper$2 r2 = new com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper$2
            r2.<init>(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper.m110651h():void");
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void dismissDialog() {
        ProgressDialog progressDialog = this.f138609e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f138609e = null;
        }
        this.f138613i = false;
        C80273bt.m139146b(this.f138614j);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: e */
    public final void mo97995e() {
        CountDownTimer countDownTimer = this.f138621q;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
        C84157d dVar = this.f138610f;
        if (dVar.f187822a != null) {
            C84140b bVar = dVar.f187822a;
            if (bVar.f187768d != null) {
                bVar.f187768d.mo98592d();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: d */
    public void mo63045d() {
        this.f138606b.clear();
        CountDownTimer countDownTimer = this.f138621q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.f138607c != null) {
            this.f138607c = null;
        }
        if (this.f138612h != null) {
            this.f138612h = null;
        }
        this.f138605a = null;
        this.f138611g.mo98198a();
        this.f138610f.mo128977a();
    }

    /* renamed from: b */
    public final MusicDownloadPlayHelper mo98622b(int i) {
        this.f138608d = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98606a(MusicModel musicModel) {
        AVExternalServiceImpl.m113114a().publishService().setCurMusic(musicModel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo98623b(String str) {
        this.f138606b.put(str, false);
        CountDownTimer countDownTimer = this.f138621q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f138611g.mo98199a(str);
        AbstractC61180m mVar = this.f138607c;
        if (mVar != null) {
            mVar.mo62890r();
        }
    }

    public MusicDownloadPlayHelper(AbstractC61180m mVar) {
        this.f138607c = mVar;
        this.f138605a = mVar.mo62886i();
        this.f138610f = new C84157d();
        C60789f fVar = new C60789f(this.f138607c.mo62886i(), true, true, true, "music_choose_page");
        this.f138611g = fVar;
        fVar.f138135a = 1;
    }

    /* renamed from: b */
    private void m110647b(MusicModel musicModel) {
        AbstractC61180m mVar = this.f138607c;
        if (mVar != null) {
            this.f138618n = true;
            if (mVar.mo62886i() != null) {
                mo63044c();
                C60825c.m110422a().pause();
                mo98606a(musicModel);
                ProgressDialog progressDialog = this.f138609e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                this.f138613i = false;
                C80273bt.m139146b(this.f138614j);
                this.f138607c.mo62883c(musicModel);
            }
        }
    }

    /* renamed from: c */
    private void m110650c(String str) {
        AbstractC61180m mVar = this.f138607c;
        if (mVar != null) {
            ActivityC0580d dVar = (ActivityC0580d) mVar.mo62886i();
            this.f138609e = ProgressDialogC61165e.C61167b.m110785a(dVar, ProgressDialogC61165e.EnumC61166a.VISIBLE_AFTER_5S, new C61140bb(this, str));
            dVar.getLifecycle().mo4012a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo63042a(MusicModel musicModel, Context context) {
        return C60826d.m110428a(musicModel, context, true);
    }

    /* renamed from: b */
    private void m110648b(MusicModel musicModel, int i) {
        String str;
        String str2;
        C33743c cVar = new C33743c();
        if (i == 2) {
            cVar.mo59976a("source", "search");
        }
        int i2 = this.f138608d;
        if (i2 != 1) {
            String str3 = "";
            if (i2 == 0) {
                str = "mid_page";
                str2 = "video_edit_page";
            } else if (i2 == 2) {
                str = "shoot_page";
                str2 = "video_shoot_page";
            } else {
                str = str3;
                str2 = str;
            }
            cVar.mo59976a("enter_from", m110649c(i));
            if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE) {
                if (!C13627m.m24498a(musicModel.getMusicId())) {
                    C39162r.onEvent(MobClick.obtain().setEventName("music_add").setLabelName(str).setValue(musicModel.getMusicId()).setJsonObject(cVar.mo59977a()));
                    String a = mo63048a(i);
                    if (TextUtils.equals("personal_homepage", a)) {
                        C33744d dVar = new C33744d();
                        C33744d a2 = dVar.mo59983a("enter_from", a).mo59983a("music_id", musicModel.getMusicId()).mo59983a("category_id", m110652i()).mo59983a("category_name", m110653j()).mo59980a("order", this.f138617m + 1);
                        if (!TextUtils.equals("personal_homepage", a)) {
                            str3 = str2;
                        }
                        a2.mo59983a("previous_page", str3);
                        if (TextUtils.equals(a, "search_music")) {
                            dVar.mo59983a("search_keyword", C60826d.f138234a);
                            dVar.mo59983a("log_pb", new C27910f().mo46674b(musicModel.getLogPb()));
                            if (C35936b.m73321a()) {
                                dVar.mo59983a("is_commercial", "1");
                            }
                            C39162r.m79461a("add_music", C61143be.m110761a(dVar.f79943a));
                            return;
                        }
                        if (C35936b.m73321a()) {
                            dVar.mo59983a("is_commercial", "1");
                        }
                        C39162r.m79460a("add_music", dVar.f79943a);
                    }
                }
            } else if (!C13627m.m24498a(musicModel.getSongId())) {
                C39162r.onEvent(MobClick.obtain().setEventName("music_add").setLabelName(str).setValue(musicModel.getSongId()).setJsonObject(cVar.mo59977a()));
            }
        } else if (!C13627m.m24498a(musicModel.getMusicId())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("song_position", this.f138615k);
                if (i == 2) {
                    jSONObject.put("search_keyword", musicModel.getSearchKeyWords());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C39162r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("popular_song").setValue(musicModel.getMusicId()).setJsonObject(jSONObject));
        }
    }

    /* renamed from: a */
    public final void mo98618a(MusicModel musicModel, int i) {
        String str;
        String a = mo63048a(i);
        int i2 = this.f138608d;
        String str2 = "";
        if (i2 == 0) {
            str = "video_edit_page";
        } else if (i2 == 2) {
            str = "video_shoot_page";
        } else {
            str = str2;
        }
        C33744d dVar = new C33744d();
        C33744d a2 = dVar.mo59983a("enter_from", a).mo59983a("music_id", musicModel.getMusicId()).mo59983a("category_id", m110652i()).mo59983a("category_name", m110653j()).mo59980a("order", this.f138617m + 1);
        if (!TextUtils.equals("personal_homepage", a)) {
            str2 = str;
        }
        a2.mo59983a("previous_page", str2);
        if (C35936b.m73321a()) {
            dVar.mo59983a("is_commercial", "1");
        }
        C39162r.m79461a("add_music", C61143be.m110761a(dVar.f79943a));
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: b */
    public final void mo97994b(MusicModel musicModel, int i, boolean z) {
        mo97993a(musicModel, i, z, false);
    }

    /* renamed from: a */
    private void m110645a(final MusicModel musicModel, final String str, boolean z) {
        this.f138611g.mo98201a(musicModel, new AbstractC61065b() {
            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper.C610855 */

            static {
                Covode.recordClassIndex(71688);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
            /* renamed from: a */
            public final void mo69324a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
            /* renamed from: b */
            public final void mo69328b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
            /* renamed from: a */
            public final void mo69325a(int i) {
                if (MusicDownloadPlayHelper.this.f138607c != null && MusicDownloadPlayHelper.this.f138607c.bT_() && MusicDownloadPlayHelper.this.f138607c.mo62886i() != null && !UIUXBugsExperimentService.m65442b().mo57250a() && MusicDownloadPlayHelper.this.f138609e != null) {
                    MusicDownloadPlayHelper.this.f138609e.setProgress(i);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
            /* renamed from: a */
            public final void mo69326a(C84125a aVar) {
                MusicDownloadPlayHelper.this.dismissDialog();
                if (MusicDownloadPlayHelper.this.f138607c != null && MusicDownloadPlayHelper.this.f138607c.bT_() && MusicDownloadPlayHelper.this.f138607c.mo62886i() != null) {
                    MusicDownloadPlayHelper.this.f138607c.mo62878a(musicModel, aVar);
                    C39162r.onEvent(MobClick.obtain().setEventName("music_download_end").setLabelName("perf_monitor").setExtValueString(musicModel.getMusicId()).setJsonObject(new C39163s().mo67941a("is_success", "0").mo67941a("sdk_type", String.valueOf(MusicService.m81198m().mo69314c())).mo67942a()));
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
            /* renamed from: a */
            public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
                musicModel.setMusicWaveBean(musicWaveBean);
                MusicDownloadPlayHelper.this.mo98621a(str, musicModel, str);
                C39162r.onEvent(MobClick.obtain().setEventName("music_download_end").setLabelName("perf_monitor").setExtValueString(musicModel.getMusicId()).setJsonObject(new C39163s().mo67941a("is_success", "1").mo67941a("downloadStrategy", String.valueOf(MusicService.m81198m().mo69314c())).mo67942a()));
            }
        }, true, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo98624c(final MusicModel musicModel, final int i, final boolean z) {
        CountDownTimer countDownTimer = this.f138621q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
            long realAuditionDuration = (long) musicModel.getRealAuditionDuration();
            if (realAuditionDuration <= 0) {
                C51423a.m95787a("MusicDownloadPlayHelper: audition_duration is zero, music id: " + musicModel.getMusicId());
                return;
            }
            CountDownTimerC610833 r1 = new CountDownTimer(realAuditionDuration) {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper.CountDownTimerC610833 */

                static {
                    Covode.recordClassIndex(71686);
                }

                public final void onTick(long j) {
                }

                public final void onFinish() {
                    MusicDownloadPlayHelper.this.f138610f.mo128984b();
                    if (MusicDownloadPlayHelper.this.f138625u != null) {
                        MusicDownloadPlayHelper.this.f138625u.mo63051a();
                    }
                    if (z) {
                        MusicDownloadPlayHelper.this.mo63041a(musicModel, i, true);
                    }
                }
            };
            this.f138621q = r1;
            r1.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: a */
    public void mo63041a(MusicModel musicModel, int i, boolean z) {
        AbstractC61180m mVar;
        Activity i2;
        this.f138623s = SystemClock.elapsedRealtime();
        if (musicModel != null && (mVar = this.f138607c) != null && (i2 = mVar.mo62886i()) != null) {
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m110654k();
            }
            if (!C58029j.f132256h) {
                new C79459a(i2).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            this.f138620p = i;
            if (mo63042a(musicModel, i2)) {
                this.f138619o = musicModel;
                this.f138622r = z;
                this.f138610f.mo128984b();
                String localPath = musicModel.getLocalPath();
                C84126a aVar = new C84126a();
                aVar.f187741f = musicModel.getMusicId();
                if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE) {
                    aVar.f187738c = 4;
                    String a = C84158e.m144733a().mo128985a(localPath);
                    aVar.f187739d = musicModel.getRealAuditionDuration();
                    if (TextUtils.isEmpty(a) || !C80720e.m139927b(a) || new File(a).length() <= 0) {
                        if (musicModel.isNeedSetCookie()) {
                            String cookie = CookieManager.getInstance().getCookie(musicModel.getUrl().getUrlList().get(0));
                            HashMap<String, String> hashMap = new HashMap<>();
                            hashMap.put("cookie", cookie);
                            aVar.f187740e = hashMap;
                        }
                        aVar.f187737b = musicModel.getUrl().getUrlList();
                        this.f138610f.mo128978a(aVar, z);
                        return;
                    }
                    aVar.f187736a = a;
                    this.f138610f.mo128978a(aVar, z);
                    AbstractC61086a aVar2 = this.f138612h;
                    if (aVar2 != null) {
                        aVar2.mo62754a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m110646a(MusicModel musicModel, String str, boolean z, boolean z2) {
        AVExternalServiceImpl.m113114a().provideAVPerformance().start("av_music_download", "MusicDownloadPlayHelper start");
        if (!TextUtils.isEmpty(musicModel.getBindChallengeId()) && !TextUtils.equals(musicModel.getBindChallengeId(), "0")) {
            C1731i.m5640b(new CallableC61141bc(musicModel), C1731i.f5562a).mo5534a(new C61142bd(this, musicModel, z2, str, z), C1731i.f5564c, null);
        } else if (z2) {
            m110647b(musicModel);
        } else {
            m110645a(musicModel, str, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: a */
    public final void mo97993a(MusicModel musicModel, int i, boolean z, boolean z2) {
        mo98619a(musicModel, i, z, z2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo98617a(MusicModel musicModel, boolean z, String str, boolean z2, C1731i iVar) {
        if (!this.f138606b.get(musicModel.getMusicId()).booleanValue()) {
            return null;
        }
        if (iVar.mo5539b() || iVar.mo5544c()) {
            dismissDialog();
            return null;
        } else if (z) {
            m110647b(musicModel);
            return null;
        } else {
            m110645a(musicModel, str, z2);
            return null;
        }
    }
}

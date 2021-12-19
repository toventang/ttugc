package com.p2082ss.android.ugc.aweme.music.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49955a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49966c;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.musicprovider.C84157d;
import com.p2082ss.android.ugc.musicprovider.p4318a.C84126a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.n */
public final class C60860n extends C60856l<AbstractC60866r> implements AbstractC47430d, CheckableImageView.AbstractC61078a {

    /* renamed from: A */
    public int f138294A = 0;

    /* renamed from: B */
    public String f138295B;

    /* renamed from: C */
    public String f138296C = "";

    /* renamed from: D */
    public String f138297D = "";

    /* renamed from: E */
    public int f138298E = 0;

    /* renamed from: F */
    private C47426a f138299F;

    /* renamed from: G */
    private Boolean f138300G;

    /* renamed from: f */
    public MusicModel f138301f;

    /* renamed from: g */
    public Music f138302g;

    /* renamed from: k */
    public String f138303k;

    /* renamed from: l */
    public String f138304l;

    /* renamed from: m */
    public String f138305m;

    /* renamed from: n */
    public String f138306n = "single_song";

    /* renamed from: o */
    public String f138307o;

    /* renamed from: p */
    public C84157d f138308p = new C84157d();

    /* renamed from: q */
    CountDownTimer f138309q;

    /* renamed from: r */
    public C61225w f138310r;

    /* renamed from: s */
    public boolean f138311s = false;

    /* renamed from: t */
    public C1213t<Boolean> f138312t = new C1213t<>();

    /* renamed from: u */
    boolean f138313u;

    /* renamed from: v */
    public boolean f138314v = true;

    /* renamed from: w */
    public String f138315w;

    /* renamed from: x */
    public String f138316x;

    /* renamed from: y */
    long f138317y = -1;

    /* renamed from: z */
    long f138318z = -1;

    static {
        Covode.recordClassIndex(71448);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
    public final void bX_() {
    }

    /* renamed from: m */
    private void m110462m() {
        this.f138311s = !this.f138311s;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    public final void ck_() {
        super.ck_();
        CountDownTimer countDownTimer = this.f138309q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f138308p.mo128977a();
    }

    /* renamed from: d */
    public final void mo98504d() {
        mo98506f();
        CountDownTimer countDownTimer = this.f138309q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: k */
    public final Effect mo98508k() {
        C61225w wVar = this.f138310r;
        if (wVar != null) {
            return wVar.f139007c;
        }
        return null;
    }

    /* renamed from: e */
    public final String mo98505e() {
        if (TextUtils.isEmpty(this.f138295B)) {
            return null;
        }
        try {
            return new JSONObject(this.f138295B).getString("shoot_from");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public final String mo98509l() {
        if (TextUtils.isEmpty(this.f138316x)) {
            return null;
        }
        ArrayList<String> b = m110461b(this.f138316x);
        if (!b.isEmpty()) {
            return b.get(0);
        }
        return null;
    }

    public C60860n() {
        C47426a aVar = new C47426a();
        this.f138299F = aVar;
        aVar.mo67839a_(this);
        this.f138299F.f110158c = "single_song";
        this.f138312t.setValue(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.C60856l, com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92287i != null && this.f92286h != null) {
            T t = this.f92286h.mData;
            if (t == null) {
                super.mo57526a_(new RuntimeException("music detail should not be null"));
                return;
            }
            Music music = t.music;
            if (music != null) {
                this.f138302g = music;
                this.f138301f = music.convertToMusicModel();
                Context a = C17867d.m33078a();
                C89219l.m154721d(a, "");
                if (AVExternalServiceImpl.m113114a().provideTakeInSameOptimize().enableTakeInSameRecordOptimize(a)) {
                    this.f138310r.mo98756a(this.f138301f, mo98509l(), true, true, false, this.f138294A, false);
                }
                super.mo57528c();
                if (this.f138301f.getCollectionType() != null) {
                    boolean equals = MusicModel.CollectionType.COLLECTED.equals(this.f138301f.getCollectionType());
                    this.f138311s = equals;
                    this.f138312t.setValue(Boolean.valueOf(equals));
                }
            } else if (((C60856l) this).f92287i != null) {
                ((AbstractC60865q) ((C60856l) this).f92287i).mo93927a();
            }
        }
    }

    /* renamed from: f */
    public final void mo98506f() {
        CountDownTimer countDownTimer = this.f138309q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f138300G = Boolean.valueOf(this.f138313u);
        this.f138313u = false;
        this.f138308p.mo128984b();
        ((AbstractC60866r) this.f92287i).mo98513a(m110460a(this.f138302g));
        if (this.f138301f != null && this.f138300G.booleanValue()) {
            Map<String, String> p = SearchServiceImpl.m119336t().mo106227p();
            C39162r.m79460a("music_play_time", new C33744d().mo59983a("enter_method", "click_play_music").mo59983a("enter_from", this.f138306n).mo59983a("search_type", p.get("searchType")).mo59983a("previous_page_position", this.f138305m).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(p.get("imprId"))).mo59983a("impr_id", p.get("imprId")).mo59983a("music_id", this.f138301f.getMusicId()).mo59980a("time", this.f138301f.getDuration()).mo59980a("duration", this.f138301f.getDuration()).mo59981a("stay_time", SystemClock.elapsedRealtime() - this.f138318z).f79943a);
        }
    }

    /* renamed from: g */
    public final void mo98507g() {
        String str;
        this.f138317y = SystemClock.elapsedRealtime();
        this.f138313u = true;
        if (this.f138301f != null) {
            C84126a aVar = new C84126a();
            aVar.f187741f = this.f138301f.getMusicId();
            if (this.f138301f.getMusicType() == MusicModel.MusicType.ONLINE) {
                aVar.f187738c = 4;
            }
            if (C16048b.m29633a().mo25421a(true, "remove_15s_cap_music", true)) {
                aVar.f187739d = this.f138301f.getAuditionDuration().intValue();
            } else {
                aVar.f187739d = this.f138301f.getDuration();
            }
            if (this.f138301f.isPlayUrlValid()) {
                aVar.f187737b = this.f138301f.getUrl().getUrlList();
            }
            ((AbstractC60866r) this.f92287i).mo98516c();
            this.f138308p.mo128981a(new C60864p(this));
            this.f138308p.mo128978a(aVar, true);
            MobClick labelName = MobClick.obtain().setEventName("music_play").setLabelName("single_song");
            C39163s sVar = new C39163s();
            MusicModel musicModel = this.f138301f;
            if (musicModel != null) {
                str = musicModel.getMusicId();
            } else {
                str = "";
            }
            C39162r.onEvent(labelName.setJsonObject(sVar.mo67941a("song_id", str).mo67942a()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
    /* renamed from: a */
    public final void mo62594a(int i) {
        if (i == 1) {
            this.f138312t.setValue(Boolean.valueOf(this.f138311s));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: e_ */
    public final void mo62592e_(Exception exc) {
        m110462m();
        this.f138312t.setValue(Boolean.valueOf(this.f138311s));
    }

    /* renamed from: a */
    public static boolean m110460a(Music music) {
        if (music == null) {
            return false;
        }
        if (music.getMusicStatus() == 0 || CommerceMediaServiceImpl.m77578f().mo66514b(music)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static ArrayList<String> m110461b(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String[] split = str.split(",");
        for (String str2 : split) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo98500a(Context context) {
        if (this.f138301f != null) {
            if (!MusicService.m81198m().mo69308a(this.f138301f, context, true)) {
                C39162r.m79460a("user_music_failed", new C33744d().mo59983a("previous_page", "single_song").mo59983a("action_type", "save").mo59983a("music_id", this.f138301f.getMusicId()).mo59983a("enter_from", this.f138304l).f79943a);
                return;
            }
            this.f138299F.mo57616a(1, this.f138301f.getMusicId(), Integer.valueOf(1 ^ (this.f138311s ? 1 : 0)));
            m110462m();
        }
    }

    /* renamed from: b */
    public final void mo98503b(C33744d dVar) {
        if (!TextUtils.isEmpty(this.f138316x)) {
            ArrayList<String> b = m110461b(this.f138316x);
            if (!b.isEmpty()) {
                dVar.mo59983a("prop_id", b.get(0));
            }
        }
    }

    /* renamed from: a */
    public final void mo98501a(C33744d dVar) {
        if (!TextUtils.isEmpty(this.f138295B)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f138295B);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    dVar.mo59982a(next, jSONObject.opt(next));
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62587a(BaseResponse baseResponse) {
        if (this.f138311s) {
            this.f138301f.setCollectionType(MusicModel.CollectionType.COLLECTED);
            this.f138302g.setCollectStatus(1);
            C60793b bVar = new C60793b(1, this.f138301f);
            bVar.f138152c = "music_detail";
            bVar.f138153d = hashCode();
            AbstractC81915c.m141874a(bVar);
            if (this.f92287i != null) {
                ((AbstractC60866r) this.f92287i).mo98515b(baseResponse);
            }
            C39162r.onEvent(MobClick.obtain().setEventName("collection_music_cancel").setLabelName("single_song").setValue(String.valueOf(this.f138301f.getMusicId())).setExtValueLong(0));
            return;
        }
        this.f138301f.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
        this.f138302g.setCollectStatus(0);
        C60793b bVar2 = new C60793b(0, this.f138301f);
        bVar2.f138152c = "music_detail";
        bVar2.f138153d = hashCode();
        AbstractC81915c.m141874a(bVar2);
        C39162r.onEvent(MobClick.obtain().setEventName("collection_music").setLabelName("single_song").setValue(String.valueOf(this.f138301f.getMusicId())).setExtValueLong(0));
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62589a(String str) {
        ((AbstractC60866r) this.f92287i).mo62589a(str);
    }

    /* renamed from: a */
    public static String m110458a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo98502a(String str, String str2) {
        if (this.f138301f != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(str, "qr_code")) {
                C39162r.m79460a("share_music", new C33744d().mo59983a("music_id", this.f138301f.getMusicId()).mo59983a("platform", str).mo59983a("process_id", str2).mo59983a("share_mode", "normal_share").f79943a);
            }
            C68863ah.f154028b.mo109361a(str, 2);
        }
    }

    /* renamed from: a */
    public static void m110459a(String str, boolean z, Music music) {
        if (z && music != null) {
            C39088c cVar = new C39088c();
            cVar.mo67838a(new C49955a());
            C49966c.C49967a aVar = new C49966c.C49967a();
            aVar.f115215a = music.getMid();
            aVar.f115216b = 1;
            aVar.f115219e = -1;
            aVar.f115221g = 2;
            aVar.f115222h = str;
            cVar.mo57616a(aVar.mo85008a());
        }
    }
}

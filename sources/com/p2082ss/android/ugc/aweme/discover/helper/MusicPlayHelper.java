package com.p2082ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.C60789f;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67511b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67586z;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.musicprovider.C84157d;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;
import com.p2082ss.android.ugc.musicprovider.p4318a.C84126a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper */
public final class MusicPlayHelper extends AbstractC1174ac {

    /* renamed from: e */
    public static final C41959a f97849e = new C41959a((byte) 0);

    /* renamed from: a */
    public final C33943c<C89378p<Integer, Long>> f97850a = new C33943c<>();

    /* renamed from: b */
    public Music f97851b;

    /* renamed from: c */
    CountDownTimer f97852c;

    /* renamed from: d */
    public final C33943c<C42042o> f97853d = new C33943c<>();

    /* renamed from: f */
    private final C84157d f97854f = new C84157d();

    /* renamed from: g */
    private C60789f f97855g;

    /* renamed from: h */
    private String f97856h = "";

    static {
        Covode.recordClassIndex(49886);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$a */
    public static final class C41959a {
        static {
            Covode.recordClassIndex(49887);
        }

        private C41959a() {
        }

        public /* synthetic */ C41959a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$e */
    public static final class CountDownTimerC41963e extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f97867a;

        /* renamed from: b */
        final /* synthetic */ long f97868b;

        static {
            Covode.recordClassIndex(49891);
        }

        public final void onTick(long j) {
        }

        public final void onFinish() {
            this.f97867a.mo71126a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC41963e(MusicPlayHelper musicPlayHelper, long j, long j2) {
            super(j2, 1000);
            this.f97867a = musicPlayHelper;
            this.f97868b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$c */
    static final class C41961c implements AbstractC84160a {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f97865a;

        static {
            Covode.recordClassIndex(49889);
        }

        C41961c(MusicPlayHelper musicPlayHelper) {
            this.f97865a = musicPlayHelper;
        }

        @Override // com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a
        /* renamed from: a */
        public final void mo63051a() {
            this.f97865a.f97850a.setValue(new C89378p<>(0, -1L));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$d */
    static final class C41962d implements AbstractC84161b {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f97866a;

        static {
            Covode.recordClassIndex(49890);
        }

        C41962d(MusicPlayHelper musicPlayHelper) {
            this.f97866a = musicPlayHelper;
        }

        @Override // com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b
        /* renamed from: a */
        public final void mo63052a() {
            this.f97866a.f97850a.setValue(new C89378p<>(0, -1L));
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        CountDownTimer countDownTimer = this.f97852c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        mo71126a();
        this.f97854f.mo128977a();
        C60789f fVar = this.f97855g;
        if (fVar != null) {
            fVar.mo98198a();
        }
    }

    /* renamed from: a */
    public final void mo71126a() {
        CountDownTimer countDownTimer = this.f97852c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f97854f.mo128984b();
        this.f97851b = null;
        this.f97850a.setValue(new C89378p<>(0, -1L));
    }

    /* renamed from: b */
    public final boolean mo71131b(long j) {
        C89378p<Integer, Long> value;
        C89378p<Integer, Long> value2;
        if (this.f97850a.getValue() == null || (value = this.f97850a.getValue()) == null || value.getFirst().intValue() != 1 || (value2 = this.f97850a.getValue()) == null || value2.getSecond().longValue() != j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo71129a(AbstractC1214u<C89378p<Integer, Long>> uVar) {
        C89219l.m154721d(uVar, "");
        this.f97850a.removeObserver(uVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b */
    static final class C41960b implements AbstractC84162c {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f97857a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f97858b;

        /* renamed from: c */
        final /* synthetic */ Music f97859c;

        /* renamed from: d */
        final /* synthetic */ boolean f97860d;

        /* renamed from: e */
        final /* synthetic */ MusicModel f97861e;

        /* renamed from: f */
        final /* synthetic */ int f97862f;

        /* renamed from: g */
        final /* synthetic */ boolean f97863g;

        /* renamed from: h */
        final /* synthetic */ String f97864h;

        static {
            Covode.recordClassIndex(49888);
        }

        C41960b(MusicPlayHelper musicPlayHelper, ActivityC0945e eVar, Music music, boolean z, MusicModel musicModel, int i, boolean z2, String str) {
            this.f97857a = musicPlayHelper;
            this.f97858b = eVar;
            this.f97859c = music;
            this.f97860d = z;
            this.f97861e = musicModel;
            this.f97862f = i;
            this.f97863g = z2;
            this.f97864h = str;
        }

        @Override // com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c
        /* renamed from: a */
        public final void mo63046a(int i) {
            String str;
            String str2;
            String str3;
            C67469ad c;
            String str4;
            C67469ad c2;
            MusicPlayHelper musicPlayHelper = this.f97857a;
            Music music = this.f97859c;
            if (C16048b.m29633a().mo25421a(true, "remove_15s_cap_music", true)) {
                CountDownTimer countDownTimer = musicPlayHelper.f97852c;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                if (music.getDuration() != music.getRealAuditionDuration()) {
                    long realAuditionDuration = ((long) music.getRealAuditionDuration()) * 1000;
                    if (realAuditionDuration <= 0) {
                        C51423a.m95791b(3, null, "MusicPlayHelper: audition_duration is zero, music id: " + music.getId());
                    } else {
                        musicPlayHelper.f97852c = new CountDownTimerC41963e(musicPlayHelper, realAuditionDuration, realAuditionDuration);
                        CountDownTimer countDownTimer2 = musicPlayHelper.f97852c;
                        if (countDownTimer2 != null) {
                            countDownTimer2.start();
                        }
                    }
                }
            }
            this.f97857a.f97850a.setValue(new C89378p<>(2, Long.valueOf(this.f97859c.getId())));
            if (!this.f97860d) {
                MusicModel musicModel = this.f97861e;
                String str5 = "";
                C89219l.m154716b(musicModel, str5);
                int i2 = this.f97862f;
                boolean z = this.f97863g;
                String str6 = this.f97864h;
                String a = C42452d.m84857a();
                C67540c g = ((C67540c) new C67586z().mo106455k(musicModel.getMusicId())).mo106487g(str6);
                if (z) {
                    str = "general_search";
                } else {
                    str = "search_result";
                }
                C67511b o = g.mo106459o(str);
                if (musicModel.getSoundsListType() == 1 || musicModel.getSoundsListType() == 2) {
                    str2 = "aladdin_card";
                } else {
                    str2 = "click_search_result";
                }
                C67540c d = ((C67540c) o.mo106460p(str2)).mo106481b(Integer.valueOf(i2)).mo106483c(C48027ac.C48028a.f111257a.mo80055a(a)).mo106484d(a);
                AbstractC67567q a2 = C67486am.m119564a();
                if (a2 == null || (c2 = a2.mo106431c()) == null || (str3 = c2.f151152b) == null) {
                    str3 = str5;
                }
                C67540c b = d.mo106482b(str3);
                AbstractC67567q a3 = C67486am.m119564a();
                if (!(a3 == null || (c = a3.mo106431c()) == null || (str4 = c.f151151a) == null)) {
                    str5 = str4;
                }
                b.mo106480a(str5).mo96792f();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo71130a(long j) {
        C89378p<Integer, Long> value;
        C89378p<Integer, Long> value2;
        if (this.f97850a.getValue() == null || (value = this.f97850a.getValue()) == null || value.getFirst().intValue() != 2 || (value2 = this.f97850a.getValue()) == null || value2.getSecond().longValue() != j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo71128a(AbstractC1204m mVar, AbstractC1214u<C89378p<Integer, Long>> uVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(uVar, "");
        this.f97850a.mo60213a(mVar, uVar, false);
    }

    /* renamed from: a */
    private static void m84015a(Context context, Music music) {
        String offlineDesc = music.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.dau);
        }
        new C79459a(context).mo123052a(offlineDesc).mo123053a();
    }

    /* renamed from: a */
    public final void mo71127a(ActivityC0945e eVar, Music music, String str, int i, boolean z, boolean z2, String str2) {
        List<String> urlList;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(music, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f97854f.mo128984b();
        this.f97851b = music;
        this.f97856h = str2;
        MusicModel convertToMusicModel = music.convertToMusicModel();
        if (MusicService.m81198m().mo69308a(convertToMusicModel, eVar, true)) {
            C84126a aVar = new C84126a();
            C89219l.m154716b(convertToMusicModel, "");
            aVar.f187741f = convertToMusicModel.getMusicId();
            if (convertToMusicModel.getMusicType() == MusicModel.MusicType.ONLINE) {
                aVar.f187738c = 4;
            }
            if (C16048b.m29633a().mo25421a(true, "remove_15s_cap_music", true)) {
                Integer auditionDuration = convertToMusicModel.getAuditionDuration();
                C89219l.m154716b(auditionDuration, "");
                aVar.f187739d = auditionDuration.intValue();
            } else {
                aVar.f187739d = convertToMusicModel.getDuration();
            }
            this.f97850a.setValue(new C89378p<>(1, Long.valueOf(music.getId())));
            this.f97854f.mo128981a(new C41960b(this, eVar, music, z2, convertToMusicModel, i, z, str2));
            this.f97854f.mo128979a(new C41961c(this));
            this.f97854f.mo128980a(new C41962d(this));
            UrlModel playUrl = music.getPlayUrl();
            if (playUrl == null || (urlList = playUrl.getUrlList()) == null) {
                m84015a(eVar, music);
            } else if (urlList.size() > 0) {
                aVar.f187737b = urlList;
                this.f97854f.mo128978a(aVar, false);
            } else {
                m84015a(eVar, music);
                C51423a.m95791b(3, null, "Music Url List size is zero, and music id:  " + music.getId());
            }
            eVar.getLifecycle().mo4012a(new MusicPlayHelper$play$6(this));
        }
    }
}

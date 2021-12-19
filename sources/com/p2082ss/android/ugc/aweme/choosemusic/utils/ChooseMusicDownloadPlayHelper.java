package com.p2082ss.android.ugc.aweme.choosemusic.utils;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35889ai;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61143be;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper */
public class ChooseMusicDownloadPlayHelper extends MusicDownloadPlayHelper implements AbstractC33974au {

    /* renamed from: a */
    public C35754b f84802a;

    /* renamed from: b */
    public AbstractC35934a f84803b;

    /* renamed from: v */
    private Handler f84804v;

    /* renamed from: w */
    private HandlerThread f84805w;

    /* renamed from: x */
    private C35889ai f84806x;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper$a */
    public interface AbstractC35934a {
        static {
            Covode.recordClassIndex(43176);
        }

        /* renamed from: a */
        void mo62891a();

        /* renamed from: b */
        void mo62892b();
    }

    static {
        Covode.recordClassIndex(43171);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper
    /* renamed from: b */
    public final void mo63043b() {
        this.f138610f.mo128981a(new C35935a(this));
        this.f138610f.mo128979a(new AbstractC84160a() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.C359312 */

            static {
                Covode.recordClassIndex(43173);
            }

            @Override // com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a
            /* renamed from: a */
            public final void mo63051a() {
                if (ChooseMusicDownloadPlayHelper.this.f84803b != null) {
                    ChooseMusicDownloadPlayHelper.this.f84803b.mo62891a();
                }
                if (ChooseMusicDownloadPlayHelper.this.f84802a.f84354h) {
                    C35936b.m73316a(ChooseMusicDownloadPlayHelper.this.f138619o.getMusicId());
                    C35936b.m73317a(ChooseMusicDownloadPlayHelper.this.f138619o.getMusicId(), ChooseMusicDownloadPlayHelper.this.f84802a, ChooseMusicDownloadPlayHelper.this.f138619o);
                }
            }
        });
        this.f138610f.mo128980a(new AbstractC84161b() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.C359323 */

            static {
                Covode.recordClassIndex(43174);
            }

            @Override // com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b
            /* renamed from: a */
            public final void mo63052a() {
                if (ChooseMusicDownloadPlayHelper.this.f84803b != null) {
                    ChooseMusicDownloadPlayHelper.this.f84803b.mo62892b();
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper, com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    public final void aw_() {
        super.aw_();
        if (this.f138619o != null && this.f84802a != null) {
            C35936b.m73316a(this.f138619o.getMusicId());
            C35936b.m73317a(this.f138619o.getMusicId(), this.f84802a, this.f138619o);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper
    /* renamed from: c */
    public final void mo63044c() {
        if (this.f138621q != null) {
            this.f138621q.cancel();
        }
        if (this.f84804v != null) {
            Message obtain = Message.obtain();
            obtain.what = 2;
            this.f84804v.sendMessage(obtain);
        } else if (this.f138610f != null) {
            this.f138610f.mo128984b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper, com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: d */
    public final void mo63045d() {
        super.mo63045d();
        HandlerThread handlerThread = this.f84805w;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f84805w = null;
        }
        Handler handler = this.f84804v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f84804v = null;
        }
        if (this.f138610f != null) {
            this.f138610f.mo128979a((AbstractC84160a) null);
            this.f138610f.mo128980a((AbstractC84161b) null);
            this.f138610f.mo128981a((AbstractC84162c) null);
            this.f138610f.mo128977a();
        }
        this.f84803b = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo63048a(int i) {
        String str;
        if (this.f138619o != null) {
            MusicModel musicModel = this.f138619o;
            if (this.f138621q != null) {
                this.f138621q.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                this.f138621q = new CountDownTimer((long) musicModel.getRealAuditionDuration()) {
                    /* class com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.CountDownTimerC359334 */

                    static {
                        Covode.recordClassIndex(43175);
                    }

                    public final void onTick(long j) {
                    }

                    public final void onFinish() {
                        ChooseMusicDownloadPlayHelper.this.f138610f.mo128984b();
                        if (ChooseMusicDownloadPlayHelper.this.f84803b != null) {
                            ChooseMusicDownloadPlayHelper.this.f84803b.mo62891a();
                        }
                    }
                };
                this.f138621q.start();
            }
        }
        C35754b bVar = this.f84802a;
        MusicModel musicModel2 = this.f138619o;
        if (!(bVar == null || musicModel2 == null || musicModel2.getMusicType() == MusicModel.MusicType.LOCAL || C35936b.f84814c == -1)) {
            C33744d dVar = new C33744d();
            dVar.mo59983a("enter_from", bVar.f84347a).mo59983a("music_id", musicModel2.getMusicId()).mo59983a("category_name", bVar.f84348b).mo59983a("enter_method", bVar.f84349c).mo59983a("previous_page", bVar.f84350d).mo59980a("order", C35936b.f84814c).mo59983a("creation_id", C35936b.f84815d);
            if (!TextUtils.isEmpty(bVar.f84353g)) {
                dVar.mo59983a("tag_id", bVar.f84353g);
            }
            if (!TextUtils.isEmpty(bVar.f84352f)) {
                dVar.mo59983a("prop_id", bVar.f84352f);
            }
            if (!TextUtils.isEmpty(bVar.f84351e)) {
                dVar.mo59983a("category_id", bVar.f84351e);
            }
            if (bVar.f84355i != null) {
                dVar.mo59982a("log_pb", bVar.f84355i);
                if (!TextUtils.isEmpty(bVar.f84355i.getImprId())) {
                    str = bVar.f84355i.getImprId();
                } else {
                    str = "";
                }
                dVar.mo59983a("impr_id", str);
            }
            if (TextUtils.equals(bVar.f84347a, "search_music")) {
                dVar.mo59983a("search_keyword", C35936b.f84813b);
                dVar.mo59983a("log_pb", new C27910f().mo46674b(musicModel2.getLogPb()));
                dVar.mo59983a("search_id", musicModel2.getSearchId());
                dVar.mo59981a("search_result_id", musicModel2.getId());
                if (C35936b.m73321a()) {
                    dVar.mo59983a("is_commercial", "1");
                }
                C39162r.m79461a("play_music", C61143be.m110761a(dVar.f79943a));
            } else {
                if (C35936b.m73321a()) {
                    dVar.mo59983a("is_commercial", "1");
                }
                C39162r.m79460a("play_music", dVar.f79943a);
            }
        }
        String musicId = this.f138619o.getMusicId();
        if (C35936b.f84817f == null) {
            C35936b.f84817f = new C35946e();
        }
        C35936b.f84817f.mo63062a(musicId, i);
        String musicId2 = this.f138619o.getMusicId();
        C35889ai aiVar = this.f84806x;
        if (aiVar != null && TextUtils.equals(musicId2, aiVar.f84694a)) {
            C12290b.m22064a("time_from_click_music_to_start_play", new C33743c().mo59975a("duration", Long.valueOf(System.currentTimeMillis() - this.f84806x.f84695b)).mo59977a());
        }
        if (this.f138618n && this.f138610f != null) {
            mo63044c();
        }
        if (!(this.f138607c == null || this.f138607c.mo62885h() == null || i == 0)) {
            this.f138607c.mo62885h().setDuration(i);
        }
        super.mo98626g();
    }

    public ChooseMusicDownloadPlayHelper(AbstractC61180m mVar, AbstractC35934a aVar) {
        super(mVar);
        this.f84803b = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper, com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: a */
    public final void mo63041a(MusicModel musicModel, int i, boolean z) {
        C35947f fVar = new C35947f(musicModel, i, z);
        if (musicModel != null) {
            this.f84806x = new C35889ai(musicModel.getMusicId(), System.currentTimeMillis());
        }
        if (this.f84805w == null) {
            HandlerThread handlerThread = new HandlerThread("play_music");
            this.f84805w = handlerThread;
            handlerThread.start();
        }
        if (this.f84804v == null) {
            this.f84804v = new Handler(this.f84805w.getLooper()) {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.HandlerC359301 */

                static {
                    Covode.recordClassIndex(43172);
                }

                public final void handleMessage(Message message) {
                    if (message.what == 2) {
                        if (ChooseMusicDownloadPlayHelper.this.f138610f != null) {
                            ChooseMusicDownloadPlayHelper.this.f138610f.mo128984b();
                        }
                    } else if (message.what == 1) {
                        C35947f fVar = (C35947f) message.obj;
                        ChooseMusicDownloadPlayHelper.super.mo63041a((ChooseMusicDownloadPlayHelper) fVar.f84840a, (MusicModel) fVar.f84841b, (int) fVar.f84842c);
                    }
                }
            };
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = fVar;
        this.f84804v.sendMessage(obtain);
    }
}

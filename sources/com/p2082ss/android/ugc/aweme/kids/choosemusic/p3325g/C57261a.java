package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57257s;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d;
import com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57155a;
import com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57156b;
import com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57157c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.g.a */
public final class C57261a extends C57136d {

    /* renamed from: a */
    public C57171a f130432a;

    /* renamed from: b */
    public AbstractC57266a f130433b;

    /* renamed from: s */
    private Handler f130434s;

    /* renamed from: t */
    private HandlerThread f130435t;

    /* renamed from: u */
    private C57257s f130436u;

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.g.a$a */
    public interface AbstractC57266a {
        static {
            Covode.recordClassIndex(67171);
        }

        /* renamed from: a */
        void mo94425a();

        /* renamed from: b */
        void mo94426b();
    }

    static {
        Covode.recordClassIndex(67166);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d
    /* renamed from: a */
    public final void mo94287a() {
        super.mo94287a();
        if (this.f130081l != null && this.f130432a != null) {
            C57268c.m103828a(this.f130081l.getMusicId());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d
    /* renamed from: c */
    public final void mo94295c() {
        this.f130075f.mo94352a(new C57267b(this));
        this.f130075f.mo94350a(new AbstractC57155a() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57261a.C572632 */

            static {
                Covode.recordClassIndex(67168);
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57155a
            /* renamed from: a */
            public final void mo94347a() {
                if (C57261a.this.f130433b != null) {
                    C57261a.this.f130433b.mo94425a();
                }
                if (C57261a.this.f130432a.f130166h) {
                    C57268c.m103828a(C57261a.this.f130081l.getMusicId());
                }
            }
        });
        this.f130075f.mo94351a(new AbstractC57156b() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57261a.C572643 */

            static {
                Covode.recordClassIndex(67169);
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57156b
            /* renamed from: a */
            public final void mo94348a() {
                if (C57261a.this.f130433b != null) {
                    C57261a.this.f130433b.mo94426b();
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d
    /* renamed from: b */
    public final void mo94292b() {
        if (this.f130083n != null) {
            this.f130083n.cancel();
        }
        if (this.f130434s != null) {
            Message obtain = Message.obtain();
            obtain.what = 2;
            this.f130434s.sendMessage(obtain);
        } else if (this.f130075f != null) {
            this.f130075f.mo94354b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d
    /* renamed from: d */
    public final void mo94297d() {
        super.mo94297d();
        HandlerThread handlerThread = this.f130435t;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f130435t = null;
        }
        Handler handler = this.f130434s;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f130434s = null;
        }
        if (this.f130075f != null) {
            this.f130075f.mo94350a((AbstractC57155a) null);
            this.f130075f.mo94351a((AbstractC57156b) null);
            this.f130075f.mo94352a((AbstractC57157c) null);
            this.f130075f.mo94349a();
        }
        this.f130433b = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo94464a(int i) {
        if (this.f130081l != null) {
            MusicModel musicModel = this.f130081l;
            if (this.f130083n != null) {
                this.f130083n.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                this.f130083n = new CountDownTimer((long) musicModel.getRealAuditionDuration()) {
                    /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57261a.CountDownTimerC572654 */

                    static {
                        Covode.recordClassIndex(67170);
                    }

                    public final void onTick(long j) {
                    }

                    public final void onFinish() {
                        C57261a.this.f130075f.mo94354b();
                        if (C57261a.this.f130433b != null) {
                            C57261a.this.f130433b.mo94425a();
                        }
                    }
                };
                this.f130083n.start();
            }
        }
        C57171a aVar = this.f130432a;
        MusicModel musicModel2 = this.f130081l;
        if (!(aVar == null || musicModel2 == null || musicModel2.getMusicType() == MusicModel.MusicType.LOCAL || C57268c.f130443b == -1)) {
            C33744d dVar = new C33744d();
            dVar.mo59983a("enter_from", aVar.f130159a).mo59983a("music_id", musicModel2.getMusicId()).mo59983a("category_name", aVar.f130160b).mo59983a("enter_method", aVar.f130161c).mo59983a("previous_page", aVar.f130162d).mo59980a("order", C57268c.f130443b);
            C39162r.m79460a("play_music", dVar.f79943a);
        }
        String musicId = this.f130081l.getMusicId();
        if (C57268c.f130446e == null) {
            C57268c.f130446e = new C57270e();
        }
        C57270e eVar = C57268c.f130446e;
        eVar.f130447a = musicId;
        eVar.f130449c = 0;
        eVar.f130448b = System.currentTimeMillis();
        eVar.f130450d = i;
        String musicId2 = this.f130081l.getMusicId();
        C57257s sVar = this.f130436u;
        if (sVar != null && TextUtils.equals(musicId2, sVar.f130425a)) {
            C12290b.m22064a("time_from_click_music_to_start_play", new C33743c().mo59975a("duration", Long.valueOf(System.currentTimeMillis() - this.f130436u.f130426b)).mo59977a());
        }
        if (this.f130080k && this.f130075f != null) {
            mo94292b();
        }
        if (this.f130072c != null && this.f130072c.mo94283h() != null && i != 0) {
            this.f130072c.mo94283h().setDuration(i);
        }
    }

    public C57261a(AbstractC57135c cVar, AbstractC57266a aVar) {
        super(cVar);
        this.f130433b = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d
    /* renamed from: a */
    public final void mo94288a(MusicModel musicModel, int i, boolean z) {
        C57271f fVar = new C57271f(musicModel, i, z);
        if (musicModel != null) {
            this.f130436u = new C57257s(musicModel.getMusicId(), System.currentTimeMillis());
        }
        if (this.f130435t == null) {
            HandlerThread handlerThread = new HandlerThread("play_music");
            this.f130435t = handlerThread;
            handlerThread.start();
        }
        if (this.f130434s == null) {
            this.f130434s = new Handler(this.f130435t.getLooper()) {
                /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57261a.HandlerC572621 */

                static {
                    Covode.recordClassIndex(67167);
                }

                public final void handleMessage(Message message) {
                    if (message.what == 2) {
                        if (C57261a.this.f130075f != null) {
                            C57261a.this.f130075f.mo94354b();
                        }
                    } else if (message.what == 1) {
                        C57271f fVar = (C57271f) message.obj;
                        C57261a.super.mo94288a((C57261a) fVar.f130451a, (MusicModel) fVar.f130452b, (int) fVar.f130453c);
                    }
                }
            };
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = fVar;
        this.f130434s.sendMessage(obtain);
    }
}

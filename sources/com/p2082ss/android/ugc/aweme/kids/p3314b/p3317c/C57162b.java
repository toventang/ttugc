package com.p2082ss.android.ugc.aweme.kids.p3314b.p3317c;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57124b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.p3311a.C57132b;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57166d;
import com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57155a;
import com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57156b;
import com.p2082ss.android.ugc.aweme.kids.p3314b.p3315a.AbstractC57157c;
import com.p2082ss.android.ugc.aweme.kids.p3314b.p3316b.C57159a;
import java.util.Collection;
import java.util.LinkedList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.b.c.b */
public final class C57162b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, AbstractC57124b {

    /* renamed from: a */
    public static final C57163a f130129a = new C57163a((byte) 0);

    /* renamed from: b */
    private boolean f130130b;

    /* renamed from: c */
    private AbstractC57157c f130131c;

    /* renamed from: d */
    private AbstractC57156b f130132d;

    /* renamed from: e */
    private AbstractC57155a f130133e;

    /* renamed from: f */
    private MediaPlayer f130134f;

    /* renamed from: g */
    private CountDownTimer f130135g;

    /* renamed from: h */
    private long f130136h;

    /* renamed from: i */
    private C57159a f130137i;

    /* renamed from: j */
    private String f130138j;

    /* renamed from: k */
    private final Context f130139k;

    /* renamed from: l */
    private final String f130140l;

    static {
        Covode.recordClassIndex(67062);
    }

    public C57162b(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.b.c.b$a */
    public static final class C57163a {
        static {
            Covode.recordClassIndex(67063);
        }

        private C57163a() {
        }

        public /* synthetic */ C57163a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private final void m103592c() {
        CountDownTimer countDownTimer = this.f130135g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.b.c.b$c */
    public static final class CountDownTimerC57165c extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C57162b f130145a;

        /* renamed from: b */
        final /* synthetic */ LinkedList f130146b;

        /* renamed from: c */
        final /* synthetic */ C57159a f130147c;

        /* renamed from: d */
        final /* synthetic */ boolean f130148d;

        static {
            Covode.recordClassIndex(67065);
        }

        public final void onTick(long j) {
        }

        public final void onFinish() {
            if (C13603b.m24435a((Collection) this.f130146b)) {
                this.f130145a.mo94361a(0, 0);
            } else {
                this.f130145a.mo94362a(this.f130146b, this.f130147c, this.f130148d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC57165c(C57162b bVar, LinkedList linkedList, C57159a aVar, boolean z, long j) {
            super(j, 1000);
            this.f130145a = bVar;
            this.f130146b = linkedList;
            this.f130147c = aVar;
            this.f130148d = z;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57124b
    /* renamed from: a */
    public final void mo94269a() {
        MediaPlayer mediaPlayer;
        try {
            m103592c();
            this.f130130b = true;
            MediaPlayer mediaPlayer2 = this.f130134f;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = this.f130134f) != null) {
                mediaPlayer.pause();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57124b
    /* renamed from: b */
    public final void mo94274b() {
        try {
            mo94269a();
            MediaPlayer mediaPlayer = this.f130134f;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.f130134f;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.f130134f = null;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57124b
    /* renamed from: a */
    public final void mo94270a(AbstractC57155a aVar) {
        this.f130133e = aVar;
    }

    private /* synthetic */ C57162b(Context context) {
        this(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57124b
    /* renamed from: a */
    public final void mo94271a(AbstractC57156b bVar) {
        this.f130132d = bVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        AbstractC57155a aVar = this.f130133e;
        if (aVar != null) {
            aVar.mo94347a();
        }
    }

    /* renamed from: a */
    private final void m103590a(Exception exc) {
        AbstractC57156b bVar = this.f130132d;
        if (bVar != null) {
            bVar.mo94348a();
        }
        mo94274b();
        m103591b(exc);
    }

    /* renamed from: b */
    private final void m103591b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f130136h;
        C57159a aVar = this.f130137i;
        if (aVar != null && exc != null) {
            C57132b.m103507a(-1, elapsedRealtime, aVar.f130119b.toString(), this.f130138j, exc.getMessage(), this.f130140l);
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            if (!this.f130130b) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f130136h;
                C57159a aVar = this.f130137i;
                if (aVar != null) {
                    String obj = aVar.f130119b.toString();
                    String str = this.f130138j;
                    C12290b.m22060a("aweme_music_play_error_rate", 0, new C33743c().mo59975a("duration", Long.valueOf(elapsedRealtime)).mo59976a("fileUri", str).mo59976a("fileUrlList", obj).mo59971a("isUseTTPlayer", (Boolean) false).mo59976a("trace", this.f130140l).mo59977a());
                }
                MediaPlayer mediaPlayer2 = this.f130134f;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                    AbstractC57157c cVar = this.f130131c;
                    if (cVar != null) {
                        cVar.mo94299a(mediaPlayer2.getDuration());
                    }
                }
                m103592c();
            }
        } catch (IllegalStateException e) {
            mo94274b();
            m103590a(e);
        } finally {
            m103592c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57124b
    /* renamed from: a */
    public final void mo94272a(AbstractC57157c cVar) {
        this.f130131c = cVar;
    }

    private C57162b(Context context, String str) {
        C89219l.m154721d(context, "");
        this.f130139k = context;
        this.f130140l = str;
    }

    /* renamed from: a */
    public final void mo94361a(int i, int i2) {
        AbstractC57156b bVar = this.f130132d;
        if (bVar != null) {
            bVar.mo94348a();
        }
        mo94274b();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f130136h;
        C57159a aVar = this.f130137i;
        if (aVar != null) {
            C57132b.m103507a(i, elapsedRealtime, aVar.f130119b.toString(), this.f130138j, String.valueOf(i2), this.f130140l);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57124b
    /* renamed from: a */
    public final void mo94273a(C57159a aVar, boolean z) {
        C89219l.m154721d(aVar, "");
        if (this.f130134f == null) {
            this.f130134f = new MediaPlayer();
        }
        LinkedList<String> linkedList = new LinkedList<>();
        if (!TextUtils.isEmpty(aVar.f130118a)) {
            linkedList.add(aVar.f130118a);
        } else if (!C13603b.m24435a((Collection) aVar.f130119b)) {
            linkedList.addAll(aVar.f130119b);
        } else {
            return;
        }
        m103592c();
        this.f130130b = false;
        MediaPlayer mediaPlayer = this.f130134f;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(new C57164b(this, linkedList, aVar, z));
        }
        mo94362a(linkedList, aVar, z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.b.c.b$b */
    static final class C57164b implements MediaPlayer.OnErrorListener {

        /* renamed from: a */
        final /* synthetic */ C57162b f130141a;

        /* renamed from: b */
        final /* synthetic */ LinkedList f130142b;

        /* renamed from: c */
        final /* synthetic */ C57159a f130143c;

        /* renamed from: d */
        final /* synthetic */ boolean f130144d;

        static {
            Covode.recordClassIndex(67064);
        }

        C57164b(C57162b bVar, LinkedList linkedList, C57159a aVar, boolean z) {
            this.f130141a = bVar;
            this.f130142b = linkedList;
            this.f130143c = aVar;
            this.f130144d = z;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (C13603b.m24435a((Collection) this.f130142b)) {
                this.f130141a.mo94361a(i, i2);
                return false;
            }
            this.f130141a.mo94362a(this.f130142b, this.f130143c, this.f130144d);
            return false;
        }
    }

    /* renamed from: a */
    private final void m103589a(C57159a aVar, boolean z, LinkedList<String> linkedList) {
        CountDownTimerC57165c cVar = new CountDownTimerC57165c(this, linkedList, aVar, z, C57166d.f130150e);
        this.f130135g = cVar;
        cVar.start();
    }

    /* renamed from: a */
    public final void mo94362a(LinkedList<String> linkedList, C57159a aVar, boolean z) {
        MediaPlayer mediaPlayer;
        if (!this.f130130b && (mediaPlayer = this.f130134f) != null) {
            try {
                this.f130137i = aVar;
                m103589a(aVar, z, linkedList);
                String poll = linkedList.poll();
                this.f130138j = poll;
                Uri parse = Uri.parse(poll);
                mediaPlayer.stop();
                mediaPlayer.reset();
                this.f130136h = SystemClock.elapsedRealtime();
                mediaPlayer.setAudioStreamType(3);
                if (aVar.f130122e != null) {
                    mediaPlayer.setDataSource(this.f130139k, parse, aVar.f130122e);
                } else {
                    mediaPlayer.setDataSource(this.f130139k, parse);
                }
                mediaPlayer.setLooping(z);
                mediaPlayer.prepareAsync();
                mediaPlayer.setOnPreparedListener(this);
                mediaPlayer.setOnCompletionListener(this);
            } catch (Exception e) {
                mo94274b();
                m103590a(e);
            }
        }
    }
}

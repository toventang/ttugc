package com.p2082ss.android.ugc.musicprovider.p4320c;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61135b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61136c;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c;
import com.p2082ss.android.ugc.musicprovider.C84158e;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;
import com.p2082ss.android.ugc.musicprovider.p4318a.C84126a;
import java.util.Collection;
import java.util.LinkedList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.musicprovider.c.c */
public final class C84141c implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, AbstractC61066c {

    /* renamed from: a */
    public static final C84142a f187770a = new C84142a((byte) 0);

    /* renamed from: b */
    private boolean f187771b;

    /* renamed from: c */
    private AbstractC84162c f187772c;

    /* renamed from: d */
    private AbstractC84161b f187773d;

    /* renamed from: e */
    private AbstractC84160a f187774e;

    /* renamed from: f */
    private MediaPlayer f187775f;

    /* renamed from: g */
    private CountDownTimer f187776g;

    /* renamed from: h */
    private long f187777h;

    /* renamed from: i */
    private C84126a f187778i;

    /* renamed from: j */
    private String f187779j;

    /* renamed from: k */
    private final Context f187780k;

    /* renamed from: l */
    private final String f187781l;

    static {
        Covode.recordClassIndex(98040);
    }

    public C84141c(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.c$a */
    public static final class C84142a {
        static {
            Covode.recordClassIndex(98041);
        }

        private C84142a() {
        }

        public /* synthetic */ C84142a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: b */
    public final void mo98590b() {
        mo98585a();
    }

    /* renamed from: e */
    private final void m144692e() {
        CountDownTimer countDownTimer = this.f187776g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: d */
    public final void mo98592d() {
        try {
            MediaPlayer mediaPlayer = this.f187775f;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.c$c */
    public static final class CountDownTimerC84144c extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C84141c f187786a;

        /* renamed from: b */
        final /* synthetic */ LinkedList f187787b;

        /* renamed from: c */
        final /* synthetic */ C84126a f187788c;

        /* renamed from: d */
        final /* synthetic */ boolean f187789d;

        static {
            Covode.recordClassIndex(98043);
        }

        public final void onTick(long j) {
        }

        public final void onFinish() {
            if (C13603b.m24435a((Collection) this.f187787b)) {
                this.f187786a.mo128963a(0, 0);
            } else {
                this.f187786a.mo128964a(this.f187787b, this.f187788c, this.f187789d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC84144c(C84141c cVar, LinkedList linkedList, C84126a aVar, boolean z, long j) {
            super(j, 1000);
            this.f187786a = cVar;
            this.f187787b = linkedList;
            this.f187788c = aVar;
            this.f187789d = z;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: c */
    public final void mo98591c() {
        try {
            mo98585a();
            MediaPlayer mediaPlayer = this.f187775f;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.f187775f;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.f187775f = null;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98585a() {
        MediaPlayer mediaPlayer;
        try {
            m144692e();
            this.f187771b = true;
            MediaPlayer mediaPlayer2 = this.f187775f;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = this.f187775f) != null) {
                mediaPlayer.pause();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98587a(AbstractC84160a aVar) {
        this.f187774e = aVar;
    }

    private /* synthetic */ C84141c(Context context) {
        this(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98588a(AbstractC84161b bVar) {
        this.f187773d = bVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        AbstractC84160a aVar = this.f187774e;
        if (aVar != null) {
            aVar.mo63051a();
        }
    }

    /* renamed from: a */
    private final void m144690a(Exception exc) {
        AbstractC84161b bVar = this.f187773d;
        if (bVar != null) {
            bVar.mo63052a();
        }
        mo98591c();
        m144691b(exc);
    }

    /* renamed from: b */
    private final void m144691b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f187777h;
        C84126a aVar = this.f187778i;
        if (aVar != null && exc != null) {
            C61136c.m110752a(-1, elapsedRealtime, aVar.f187737b.toString(), this.f187779j, exc.getMessage(), this.f187781l);
            C61135b.m110750a(aVar.f187741f, aVar.f187737b.toString(), this.f187779j, exc.getMessage());
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            if (!this.f187771b) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f187777h;
                C84126a aVar = this.f187778i;
                if (aVar != null) {
                    C61136c.m110753a(elapsedRealtime, aVar.f187737b.toString(), this.f187779j, this.f187781l);
                    C61135b.m110749a(aVar.f187741f, aVar.f187737b.toString(), this.f187779j, Long.valueOf(elapsedRealtime));
                }
                MediaPlayer mediaPlayer2 = this.f187775f;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                    AbstractC84162c cVar = this.f187772c;
                    if (cVar != null) {
                        cVar.mo63046a(mediaPlayer2.getDuration());
                    }
                }
                m144692e();
            }
        } catch (IllegalStateException e) {
            mo98591c();
            m144690a(e);
        } finally {
            m144692e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98589a(AbstractC84162c cVar) {
        this.f187772c = cVar;
    }

    private C84141c(Context context, String str) {
        C89219l.m154721d(context, "");
        this.f187780k = context;
        this.f187781l = str;
    }

    /* renamed from: a */
    public final void mo128963a(int i, int i2) {
        AbstractC84161b bVar = this.f187773d;
        if (bVar != null) {
            bVar.mo63052a();
        }
        mo98591c();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f187777h;
        C84126a aVar = this.f187778i;
        if (aVar != null) {
            C61136c.m110752a(i, elapsedRealtime, aVar.f187737b.toString(), this.f187779j, String.valueOf(i2), this.f187781l);
            C61135b.m110750a(aVar.f187741f, aVar.f187737b.toString(), this.f187779j, String.valueOf(i2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98586a(C84126a aVar, boolean z) {
        C89219l.m154721d(aVar, "");
        if (this.f187775f == null) {
            this.f187775f = new MediaPlayer();
        }
        LinkedList<String> linkedList = new LinkedList<>();
        if (!TextUtils.isEmpty(aVar.f187736a)) {
            linkedList.add(aVar.f187736a);
        } else if (!C13603b.m24435a((Collection) aVar.f187737b)) {
            linkedList.addAll(aVar.f187737b);
        } else {
            return;
        }
        m144692e();
        this.f187771b = false;
        MediaPlayer mediaPlayer = this.f187775f;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(new C84143b(this, linkedList, aVar, z));
        }
        mo128964a(linkedList, aVar, z);
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.c$b */
    static final class C84143b implements MediaPlayer.OnErrorListener {

        /* renamed from: a */
        final /* synthetic */ C84141c f187782a;

        /* renamed from: b */
        final /* synthetic */ LinkedList f187783b;

        /* renamed from: c */
        final /* synthetic */ C84126a f187784c;

        /* renamed from: d */
        final /* synthetic */ boolean f187785d;

        static {
            Covode.recordClassIndex(98042);
        }

        C84143b(C84141c cVar, LinkedList linkedList, C84126a aVar, boolean z) {
            this.f187782a = cVar;
            this.f187783b = linkedList;
            this.f187784c = aVar;
            this.f187785d = z;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (C13603b.m24435a((Collection) this.f187783b)) {
                this.f187782a.mo128963a(i, i2);
                return false;
            }
            this.f187782a.mo128964a(this.f187783b, this.f187784c, this.f187785d);
            return false;
        }
    }

    /* renamed from: a */
    private final void m144689a(C84126a aVar, boolean z, LinkedList<String> linkedList) {
        CountDownTimerC84144c cVar = new CountDownTimerC84144c(this, linkedList, aVar, z, C84158e.f187824e);
        this.f187776g = cVar;
        cVar.start();
    }

    /* renamed from: a */
    public final void mo128964a(LinkedList<String> linkedList, C84126a aVar, boolean z) {
        MediaPlayer mediaPlayer;
        if (!this.f187771b && (mediaPlayer = this.f187775f) != null) {
            try {
                this.f187778i = aVar;
                m144689a(aVar, z, linkedList);
                String poll = linkedList.poll();
                this.f187779j = poll;
                Uri parse = Uri.parse(poll);
                mediaPlayer.stop();
                mediaPlayer.reset();
                this.f187777h = SystemClock.elapsedRealtime();
                mediaPlayer.setAudioStreamType(3);
                if (aVar.f187740e != null) {
                    mediaPlayer.setDataSource(this.f187780k, parse, aVar.f187740e);
                } else {
                    mediaPlayer.setDataSource(this.f187780k, parse);
                }
                mediaPlayer.setLooping(z);
                mediaPlayer.prepareAsync();
                mediaPlayer.setOnPreparedListener(this);
                mediaPlayer.setOnCompletionListener(this);
            } catch (Exception e) {
                mo98591c();
                m144690a(e);
            }
        }
    }
}

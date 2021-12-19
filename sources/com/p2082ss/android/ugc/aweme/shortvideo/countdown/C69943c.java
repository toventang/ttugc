package com.p2082ss.android.ugc.aweme.shortvideo.countdown;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.c */
public final class C69943c implements AbstractC69973i {

    /* renamed from: a */
    public final SoundPool f156316a;

    /* renamed from: b */
    public Integer f156317b;

    /* renamed from: c */
    public final Context f156318c;

    /* renamed from: d */
    private final int f156319d;

    /* renamed from: e */
    private final int f156320e;

    /* renamed from: f */
    private final int f156321f;

    /* renamed from: g */
    private final Handler f156322g = new Handler();

    /* renamed from: h */
    private LinkedList<Integer> f156323h;

    static {
        Covode.recordClassIndex(82354);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.c$a */
    public static final class RunnableC69944a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C69943c f156324a;

        static {
            Covode.recordClassIndex(82355);
        }

        RunnableC69944a(C69943c cVar) {
            this.f156324a = cVar;
        }

        public final void run() {
            Integer num = this.f156324a.f156317b;
            if (num != null) {
                this.f156324a.f156316a.stop(num.intValue());
                this.f156324a.mo110384a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69973i
    /* renamed from: b */
    public final void mo110386b() {
        this.f156322g.removeCallbacksAndMessages(null);
        this.f156316a.release();
        this.f156317b = null;
        this.f156323h.clear();
    }

    /* renamed from: a */
    public final void mo110384a() {
        Integer poll = this.f156323h.poll();
        this.f156317b = poll;
        if (poll != null) {
            this.f156316a.play(poll.intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            this.f156322g.postDelayed(new RunnableC69944a(this), 1000);
        }
    }

    public C69943c(Context context) {
        SoundPool soundPool;
        C89219l.m154721d(context, "");
        this.f156318c = context;
        if (Build.VERSION.SDK_INT >= 21) {
            soundPool = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
            C89219l.m154716b(soundPool, "");
        } else {
            soundPool = new SoundPool(3, 3, 0);
        }
        this.f156316a = soundPool;
        this.f156319d = soundPool.load(context, R.raw.shot_count_down_a, 1);
        this.f156320e = soundPool.load(context, R.raw.shot_count_down_b, 1);
        this.f156321f = soundPool.load(context, R.raw.shot_count_down_c, 1);
        this.f156323h = new LinkedList<>();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69973i
    /* renamed from: a */
    public final void mo110385a(int i) {
        if (i == 10) {
            int i2 = 0;
            do {
                this.f156323h.offer(Integer.valueOf(this.f156319d));
                i2++;
            } while (i2 < 7);
        }
        this.f156323h.offer(Integer.valueOf(this.f156320e));
        this.f156323h.offer(Integer.valueOf(this.f156320e));
        this.f156323h.offer(Integer.valueOf(this.f156321f));
        mo110384a();
    }
}

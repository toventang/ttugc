package com.p2082ss.android.ugc.aweme.ftc.countdown;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.countdown.c */
public final class C52459c implements AbstractC52495k {

    /* renamed from: a */
    public final SoundPool f120807a;

    /* renamed from: b */
    public Integer f120808b;

    /* renamed from: c */
    public final Context f120809c;

    /* renamed from: d */
    private final int f120810d;

    /* renamed from: e */
    private final int f120811e;

    /* renamed from: f */
    private final int f120812f;

    /* renamed from: g */
    private final Handler f120813g = new Handler();

    /* renamed from: h */
    private LinkedList<Integer> f120814h;

    static {
        Covode.recordClassIndex(61855);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.c$a */
    public static final class RunnableC52460a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52459c f120815a;

        static {
            Covode.recordClassIndex(61856);
        }

        RunnableC52460a(C52459c cVar) {
            this.f120815a = cVar;
        }

        public final void run() {
            Integer num = this.f120815a.f120808b;
            if (num != null) {
                this.f120815a.f120807a.stop(num.intValue());
                this.f120815a.mo88238a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52495k
    /* renamed from: b */
    public final void mo88240b() {
        this.f120813g.removeCallbacksAndMessages(null);
        this.f120807a.release();
        this.f120808b = null;
        this.f120814h.clear();
    }

    /* renamed from: a */
    public final void mo88238a() {
        Integer poll = this.f120814h.poll();
        this.f120808b = poll;
        if (poll != null) {
            this.f120807a.play(poll.intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            this.f120813g.postDelayed(new RunnableC52460a(this), 1000);
        }
    }

    public C52459c(Context context) {
        SoundPool soundPool;
        C89219l.m154721d(context, "");
        this.f120809c = context;
        if (Build.VERSION.SDK_INT >= 21) {
            soundPool = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
            C89219l.m154716b(soundPool, "");
        } else {
            soundPool = new SoundPool(3, 3, 0);
        }
        this.f120807a = soundPool;
        this.f120810d = soundPool.load(context, R.raw.shot_count_down_a, 1);
        this.f120811e = soundPool.load(context, R.raw.shot_count_down_b, 1);
        this.f120812f = soundPool.load(context, R.raw.shot_count_down_c, 1);
        this.f120814h = new LinkedList<>();
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52495k
    /* renamed from: a */
    public final void mo88239a(int i) {
        if (i == 10) {
            int i2 = 0;
            do {
                this.f120814h.offer(Integer.valueOf(this.f120810d));
                i2++;
            } while (i2 < 7);
        }
        this.f120814h.offer(Integer.valueOf(this.f120811e));
        this.f120814h.offer(Integer.valueOf(this.f120811e));
        this.f120814h.offer(Integer.valueOf(this.f120812f));
        mo88238a();
    }
}

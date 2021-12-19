package com.p2082ss.ttm.player;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttm.p4406a.C86222e;

/* renamed from: com.ss.ttm.player.c */
final class C86240c {

    /* renamed from: a */
    final C86241a f192645a;

    /* renamed from: b */
    int f192646b;

    /* renamed from: c */
    long f192647c;

    /* renamed from: d */
    long f192648d;

    /* renamed from: e */
    long f192649e;

    /* renamed from: f */
    long f192650f;

    static {
        Covode.recordClassIndex(101417);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttm.player.c$a */
    public static final class C86241a {

        /* renamed from: a */
        final AudioTrack f192651a;

        /* renamed from: b */
        final AudioTimestamp f192652b = new AudioTimestamp();

        /* renamed from: c */
        long f192653c;

        /* renamed from: d */
        long f192654d;

        /* renamed from: e */
        public long f192655e;

        static {
            Covode.recordClassIndex(101418);
        }

        /* renamed from: a */
        public final long mo136795a() {
            return this.f192652b.nanoTime / 1000;
        }

        public C86241a(AudioTrack audioTrack) {
            this.f192651a = audioTrack;
        }
    }

    /* renamed from: a */
    public final void mo136791a() {
        if (this.f192645a != null) {
            mo136792a(0);
        }
    }

    /* renamed from: b */
    public final long mo136793b() {
        C86241a aVar = this.f192645a;
        if (aVar != null) {
            return aVar.mo136795a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    public final long mo136794c() {
        C86241a aVar = this.f192645a;
        if (aVar != null) {
            return aVar.f192655e;
        }
        return -1;
    }

    public C86240c(AudioTrack audioTrack) {
        if (C86222e.f192440a >= 19) {
            this.f192645a = new C86241a(audioTrack);
            mo136791a();
            return;
        }
        this.f192645a = null;
        mo136792a(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo136792a(int i) {
        this.f192646b = i;
        if (i == 0) {
            this.f192649e = 0;
            this.f192650f = -1;
            this.f192647c = System.nanoTime() / 1000;
            this.f192648d = 5000;
        } else if (i == 1) {
            this.f192648d = 5000;
        } else if (i == 2 || i == 3) {
            this.f192648d = 10000000;
        } else if (i == 4) {
            this.f192648d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}

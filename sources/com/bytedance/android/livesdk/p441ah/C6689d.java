package com.bytedance.android.livesdk.p441ah;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ah.d */
public final class C6689d {

    /* renamed from: a */
    public final Handler f16592a;

    /* renamed from: b */
    public final Runnable f16593b;

    /* renamed from: c */
    final Runnable f16594c;

    /* renamed from: d */
    public int f16595d = 5;

    /* renamed from: e */
    public AbstractC6690a f16596e;

    /* renamed from: com.bytedance.android.livesdk.ah.d$a */
    public interface AbstractC6690a {
        static {
            Covode.recordClassIndex(7428);
        }

        /* renamed from: a */
        void mo12835a();

        /* renamed from: a */
        void mo12836a(int i);

        /* renamed from: b */
        void mo12837b(int i);
    }

    static {
        Covode.recordClassIndex(7427);
    }

    /* renamed from: com.bytedance.android.livesdk.ah.d$c */
    static final class RunnableC6692c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6689d f16598a;

        static {
            Covode.recordClassIndex(7430);
        }

        RunnableC6692c(C6689d dVar) {
            this.f16598a = dVar;
        }

        public final void run() {
            this.f16598a.f16592a.postDelayed(this.f16598a.f16593b, 1000);
        }
    }

    /* renamed from: a */
    public final void mo12834a() {
        this.f16596e.mo12836a(this.f16595d);
        this.f16592a.postDelayed(this.f16594c, 0);
    }

    /* renamed from: com.bytedance.android.livesdk.ah.d$b */
    static final class RunnableC6691b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6689d f16597a;

        static {
            Covode.recordClassIndex(7429);
        }

        RunnableC6691b(C6689d dVar) {
            this.f16597a = dVar;
        }

        public final void run() {
            if (this.f16597a.f16595d == 0) {
                this.f16597a.f16596e.mo12835a();
            } else if (this.f16597a.f16595d > 0) {
                C6689d dVar = this.f16597a;
                dVar.f16595d--;
                C6689d dVar2 = this.f16597a;
                dVar2.f16596e.mo12837b(dVar2.f16595d);
                dVar2.f16592a.postDelayed(dVar2.f16593b, 1000);
            }
        }
    }

    public C6689d(AbstractC6690a aVar) {
        C89219l.m154721d(aVar, "");
        this.f16596e = aVar;
        this.f16592a = new Handler(Looper.getMainLooper());
        this.f16593b = new RunnableC6691b(this);
        this.f16594c = new RunnableC6692c(this);
    }
}

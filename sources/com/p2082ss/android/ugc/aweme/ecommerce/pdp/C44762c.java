package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.c */
public final class C44762c {

    /* renamed from: m */
    public static final HashMap<String, C44762c> f104428m = new HashMap<>();

    /* renamed from: n */
    public static final C44764a f104429n = new C44764a((byte) 0);

    /* renamed from: a */
    public long f104430a = -1;

    /* renamed from: b */
    public long f104431b;

    /* renamed from: c */
    long f104432c;

    /* renamed from: d */
    long f104433d;

    /* renamed from: e */
    public final Handler f104434e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    final List<AbstractC89187q<Integer, Integer, Long, C89391z>> f104435f = new ArrayList();

    /* renamed from: g */
    public long f104436g = 1000;

    /* renamed from: h */
    public int f104437h;

    /* renamed from: i */
    int f104438i;

    /* renamed from: j */
    int f104439j;

    /* renamed from: k */
    public Runnable f104440k = new Runnable(this) {
        /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44762c.RunnableC447631 */

        /* renamed from: a */
        final /* synthetic */ C44762c f104442a;

        static {
            Covode.recordClassIndex(53149);
        }

        {
            this.f104442a = r1;
        }

        public final void run() {
            long j;
            this.f104442a.f104431b = SystemClock.elapsedRealtime();
            if (this.f104442a.f104437h == 3) {
                C44762c cVar = this.f104442a;
                if (cVar.f104435f.isEmpty()) {
                    cVar.f104439j++;
                }
                if (cVar.f104439j == 30) {
                    cVar.f104435f.clear();
                    cVar.mo75882a();
                    C44762c.f104428m.remove(cVar.f104441l);
                }
                this.f104442a.f104434e.postDelayed(C44762c.m87488a(this.f104442a), this.f104442a.f104436g);
                return;
            }
            C44762c cVar2 = this.f104442a;
            if (cVar2.f104431b < cVar2.f104432c) {
                cVar2.f104437h = 1;
                cVar2.f104430a = cVar2.f104432c - cVar2.f104431b;
            } else if (cVar2.f104431b < cVar2.f104432c || cVar2.f104431b >= cVar2.f104433d) {
                cVar2.f104430a = 0;
                cVar2.f104437h = 3;
            } else {
                cVar2.f104437h = 2;
                cVar2.f104430a = cVar2.f104433d - cVar2.f104431b;
            }
            Iterator<T> it = cVar2.f104435f.iterator();
            while (it.hasNext()) {
                it.next().invoke(Integer.valueOf(cVar2.f104437h), Integer.valueOf(cVar2.f104438i), Long.valueOf(cVar2.f104430a));
            }
            cVar2.f104438i = cVar2.f104437h;
            if (this.f104442a.f104437h != 3) {
                Handler handler = this.f104442a.f104434e;
                Runnable a = C44762c.m87488a(this.f104442a);
                int i = (this.f104442a.f104430a > this.f104442a.f104436g ? 1 : (this.f104442a.f104430a == this.f104442a.f104436g ? 0 : -1));
                C44762c cVar3 = this.f104442a;
                if (i > 0) {
                    j = cVar3.f104436g;
                } else {
                    j = cVar3.f104430a;
                }
                handler.postDelayed(a, j);
            }
        }
    };

    /* renamed from: l */
    public final String f104441l;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.c$a */
    public static final class C44764a {
        static {
            Covode.recordClassIndex(53150);
        }

        private C44764a() {
        }

        public /* synthetic */ C44764a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C44762c m87491a(String str) {
            C89219l.m154721d(str, "");
            HashMap<String, C44762c> hashMap = C44762c.f104428m;
            C44762c cVar = hashMap.get(str);
            if (cVar == null) {
                cVar = new C44762c(str);
                hashMap.put(str, cVar);
            }
            return cVar;
        }
    }

    static {
        Covode.recordClassIndex(53148);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo75882a() {
        Handler handler = this.f104434e;
        Runnable runnable = this.f104440k;
        if (runnable == null) {
            C89219l.m154710a("countDownAction");
        }
        handler.removeCallbacks(runnable);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.c$b */
    public static final class RunnableC44765b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44762c f104443a;

        /* renamed from: b */
        final /* synthetic */ FlashSale f104444b;

        /* renamed from: c */
        final /* synthetic */ long f104445c = 1000;

        static {
            Covode.recordClassIndex(53151);
        }

        public RunnableC44765b(C44762c cVar, FlashSale flashSale) {
            this.f104443a = cVar;
            this.f104444b = flashSale;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 156
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44762c.RunnableC44765b.run():void");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Runnable m87488a(C44762c cVar) {
        Runnable runnable = cVar.f104440k;
        if (runnable == null) {
            C89219l.m154710a("countDownAction");
        }
        return runnable;
    }

    public C44762c(String str) {
        C89219l.m154721d(str, "");
        this.f104441l = str;
    }

    /* renamed from: a */
    public final void mo75883a(AbstractC89187q<? super Integer, ? super Integer, ? super Long, C89391z> qVar) {
        C89219l.m154721d(qVar, "");
        if (!this.f104435f.contains(qVar)) {
            this.f104435f.add(qVar);
        }
    }
}

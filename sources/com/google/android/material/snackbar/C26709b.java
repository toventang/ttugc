package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
final class C26709b {

    /* renamed from: e */
    private static C26709b f63276e;

    /* renamed from: a */
    final Object f63277a = new Object();

    /* renamed from: b */
    final Handler f63278b = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        /* class com.google.android.material.snackbar.C26709b.C267101 */

        static {
            Covode.recordClassIndex(32173);
        }

        public final boolean handleMessage(Message message) {
            MethodCollector.m26663i(12122);
            if (message.what != 0) {
                MethodCollector.m26664o(12122);
                return false;
            }
            C26709b bVar = C26709b.this;
            C26712b bVar2 = (C26712b) message.obj;
            synchronized (bVar.f63277a) {
                try {
                    if (bVar.f63279c == bVar2 || bVar.f63280d == bVar2) {
                        bVar.mo44258a(bVar2, 2);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12122);
                    throw th;
                }
            }
            MethodCollector.m26664o(12122);
            return true;
        }
    });

    /* renamed from: c */
    C26712b f63279c;

    /* renamed from: d */
    C26712b f63280d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.b$a */
    public interface AbstractC26711a {
        static {
            Covode.recordClassIndex(32174);
        }

        /* renamed from: a */
        void mo44237a();

        /* renamed from: a */
        void mo44238a(int i);
    }

    static {
        Covode.recordClassIndex(32172);
    }

    /* renamed from: a */
    static C26709b m53029a() {
        if (f63276e == null) {
            f63276e = new C26709b();
        }
        return f63276e;
    }

    private C26709b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo44259b() {
        C26712b bVar = this.f63280d;
        if (bVar != null) {
            this.f63279c = bVar;
            this.f63280d = null;
            AbstractC26711a aVar = bVar.f63282a.get();
            if (aVar != null) {
                aVar.mo44237a();
            } else {
                this.f63279c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.b$b */
    public static class C26712b {

        /* renamed from: a */
        final WeakReference<AbstractC26711a> f63282a;

        /* renamed from: b */
        int f63283b;

        /* renamed from: c */
        boolean f63284c;

        static {
            Covode.recordClassIndex(32175);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo44266a(AbstractC26711a aVar) {
            if (aVar == null || this.f63282a.get() != aVar) {
                return false;
            }
            return true;
        }

        C26712b(int i, AbstractC26711a aVar) {
            this.f63282a = new WeakReference<>(aVar);
            this.f63283b = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo44263e(AbstractC26711a aVar) {
        C26712b bVar = this.f63279c;
        if (bVar == null || !bVar.mo44266a(aVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo44264f(AbstractC26711a aVar) {
        C26712b bVar = this.f63280d;
        if (bVar == null || !bVar.mo44266a(aVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo44261c(AbstractC26711a aVar) {
        boolean e;
        MethodCollector.m26663i(11132);
        synchronized (this.f63277a) {
            try {
                e = mo44263e(aVar);
            } finally {
                MethodCollector.m26664o(11132);
            }
        }
        return e;
    }

    /* renamed from: a */
    public final void mo44255a(AbstractC26711a aVar) {
        MethodCollector.m26663i(11130);
        synchronized (this.f63277a) {
            try {
                if (mo44263e(aVar) && !this.f63279c.f63284c) {
                    this.f63279c.f63284c = true;
                    this.f63278b.removeCallbacksAndMessages(this.f63279c);
                }
            } finally {
                MethodCollector.m26664o(11130);
            }
        }
    }

    /* renamed from: b */
    public final void mo44260b(AbstractC26711a aVar) {
        MethodCollector.m26663i(11131);
        synchronized (this.f63277a) {
            try {
                if (mo44263e(aVar) && this.f63279c.f63284c) {
                    this.f63279c.f63284c = false;
                    mo44257a(this.f63279c);
                }
            } finally {
                MethodCollector.m26664o(11131);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo44262d(AbstractC26711a aVar) {
        boolean z;
        MethodCollector.m26663i(11133);
        synchronized (this.f63277a) {
            try {
                if (!mo44263e(aVar)) {
                    if (!mo44264f(aVar)) {
                        z = false;
                    }
                }
                z = true;
            } finally {
                MethodCollector.m26664o(11133);
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44257a(C26712b bVar) {
        if (bVar.f63283b != -2) {
            int i = 2750;
            if (bVar.f63283b > 0) {
                i = bVar.f63283b;
            } else if (bVar.f63283b == -1) {
                i = 1500;
            }
            this.f63278b.removeCallbacksAndMessages(bVar);
            Handler handler = this.f63278b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), (long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo44258a(C26712b bVar, int i) {
        AbstractC26711a aVar = bVar.f63282a.get();
        if (aVar == null) {
            return false;
        }
        this.f63278b.removeCallbacksAndMessages(bVar);
        aVar.mo44238a(i);
        return true;
    }

    /* renamed from: a */
    public final void mo44256a(AbstractC26711a aVar, int i) {
        MethodCollector.m26663i(10991);
        synchronized (this.f63277a) {
            try {
                if (mo44263e(aVar)) {
                    mo44258a(this.f63279c, i);
                } else if (mo44264f(aVar)) {
                    mo44258a(this.f63280d, i);
                }
            } finally {
                MethodCollector.m26664o(10991);
            }
        }
    }
}

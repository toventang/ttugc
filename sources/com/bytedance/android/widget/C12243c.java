package com.bytedance.android.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p036g.C0693f;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.bytedance.android.widget.c */
public final class C12243c {

    /* renamed from: a */
    public LayoutInflater f29506a;

    /* renamed from: b */
    public Handler f29507b;

    /* renamed from: c */
    public C12247c f29508c;

    /* renamed from: d */
    private Handler.Callback f29509d = new Handler.Callback() {
        /* class com.bytedance.android.widget.C12243c.C122441 */

        static {
            Covode.recordClassIndex(13979);
        }

        public final boolean handleMessage(Message message) {
            C12246b bVar = (C12246b) message.obj;
            if (bVar.f29515d == null) {
                bVar.f29515d = C1764a.m5927a(C12243c.this.f29506a, bVar.f29514c, bVar.f29513b, false);
            }
            bVar.f29516e.onInflateFinished(bVar.f29515d, bVar.f29514c, bVar.f29513b);
            C12247c cVar = C12243c.this.f29508c;
            bVar.f29516e = null;
            bVar.f29512a = null;
            bVar.f29513b = null;
            bVar.f29514c = 0;
            bVar.f29515d = null;
            cVar.f29518b.release(bVar);
            return true;
        }
    };

    /* renamed from: com.bytedance.android.widget.c$d */
    public interface AbstractC12248d {
        static {
            Covode.recordClassIndex(13983);
        }

        void onInflateFinished(View view, int i, ViewGroup viewGroup);
    }

    static {
        Covode.recordClassIndex(13978);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.widget.c$b */
    public static class C12246b {

        /* renamed from: a */
        C12243c f29512a;

        /* renamed from: b */
        ViewGroup f29513b;

        /* renamed from: c */
        int f29514c;

        /* renamed from: d */
        View f29515d;

        /* renamed from: e */
        AbstractC12248d f29516e;

        static {
            Covode.recordClassIndex(13981);
        }

        C12246b() {
        }
    }

    /* renamed from: com.bytedance.android.widget.c$a */
    static class C12245a extends LayoutInflater {

        /* renamed from: a */
        private static final String[] f29511a = {"android.widget.", "android.webkit.", "android.app."};

        static {
            Covode.recordClassIndex(13980);
        }

        C12245a(Context context) {
            super(context);
        }

        public final LayoutInflater cloneInContext(Context context) {
            return new C12245a(context);
        }

        /* access modifiers changed from: protected */
        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) {
            for (String str2 : f29511a) {
                try {
                    View createView = createView(str, str2, attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.widget.c$c */
    public static class C12247c extends Thread {

        /* renamed from: a */
        final ArrayBlockingQueue<C12246b> f29517a;

        /* renamed from: b */
        final C0693f.C0696c<C12246b> f29518b;

        static {
            Covode.recordClassIndex(13982);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|8|6) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:6:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
            L_0x0000:
                java.util.concurrent.ArrayBlockingQueue<com.bytedance.android.widget.c$b> r0 = r5.f29517a     // Catch:{ InterruptedException -> 0x0000 }
                java.lang.Object r4 = r0.take()     // Catch:{ InterruptedException -> 0x0000 }
                com.bytedance.android.widget.c$b r4 = (com.bytedance.android.widget.C12243c.C12246b) r4     // Catch:{ InterruptedException -> 0x0000 }
                r3 = 0
                com.bytedance.android.widget.c r0 = r4.f29512a     // Catch:{ RuntimeException -> 0x0017 }
                android.view.LayoutInflater r2 = r0.f29506a     // Catch:{ RuntimeException -> 0x0017 }
                int r1 = r4.f29514c     // Catch:{ RuntimeException -> 0x0017 }
                android.view.ViewGroup r0 = r4.f29513b     // Catch:{ RuntimeException -> 0x0017 }
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r0, r3)     // Catch:{ RuntimeException -> 0x0017 }
                r4.f29515d = r0     // Catch:{ RuntimeException -> 0x0017 }
            L_0x0017:
                com.bytedance.android.widget.c r0 = r4.f29512a
                android.os.Handler r0 = r0.f29507b
                android.os.Message r0 = android.os.Message.obtain(r0, r3, r4)
                r0.sendToTarget()
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.widget.C12243c.C12247c.run():void");
        }

        private C12247c(int i) {
            this.f29517a = new ArrayBlockingQueue<>(i);
            this.f29518b = new C0693f.C0696c<>(10);
            start();
        }

        /* synthetic */ C12247c(int i, byte b) {
            this(i);
        }
    }

    public C12243c(Context context, int i) {
        this.f29506a = new C12245a(context);
        this.f29507b = new Handler(this.f29509d);
        this.f29508c = new C12247c(i, (byte) 0);
    }

    /* renamed from: a */
    public final void mo19742a(int i, ViewGroup viewGroup, AbstractC12248d dVar) {
        C12246b acquire = this.f29508c.f29518b.acquire();
        if (acquire == null) {
            acquire = new C12246b();
        }
        acquire.f29512a = this;
        acquire.f29514c = i;
        acquire.f29513b = viewGroup;
        acquire.f29516e = dVar;
        try {
            this.f29508c.f29517a.put(acquire);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }
}

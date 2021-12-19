package androidx.p022b.p023a;

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

/* renamed from: androidx.b.a.a */
public final class C0464a {

    /* renamed from: a */
    LayoutInflater f1786a;

    /* renamed from: b */
    Handler f1787b;

    /* renamed from: c */
    C0468c f1788c;

    /* renamed from: d */
    private Handler.Callback f1789d = new Handler.Callback() {
        /* class androidx.p022b.p023a.C0464a.C04651 */

        static {
            Covode.recordClassIndex(530);
        }

        public final boolean handleMessage(Message message) {
            C0467b bVar = (C0467b) message.obj;
            if (bVar.f1795d == null) {
                bVar.f1795d = C1764a.m5927a(C0464a.this.f1786a, bVar.f1794c, bVar.f1793b, false);
            }
            bVar.f1796e.onInflateFinished(bVar.f1795d, bVar.f1794c, bVar.f1793b);
            C0468c cVar = C0464a.this.f1788c;
            bVar.f1796e = null;
            bVar.f1792a = null;
            bVar.f1793b = null;
            bVar.f1794c = 0;
            bVar.f1795d = null;
            cVar.f1799c.release(bVar);
            return true;
        }
    };

    /* renamed from: androidx.b.a.a$d */
    public interface AbstractC0469d {
        static {
            Covode.recordClassIndex(534);
        }

        void onInflateFinished(View view, int i, ViewGroup viewGroup);
    }

    static {
        Covode.recordClassIndex(529);
    }

    /* renamed from: androidx.b.a.a$b */
    static class C0467b {

        /* renamed from: a */
        C0464a f1792a;

        /* renamed from: b */
        ViewGroup f1793b;

        /* renamed from: c */
        int f1794c;

        /* renamed from: d */
        View f1795d;

        /* renamed from: e */
        AbstractC0469d f1796e;

        static {
            Covode.recordClassIndex(532);
        }

        C0467b() {
        }
    }

    /* renamed from: androidx.b.a.a$c */
    static class C0468c extends Thread {

        /* renamed from: a */
        static final C0468c f1797a;

        /* renamed from: b */
        ArrayBlockingQueue<C0467b> f1798b = new ArrayBlockingQueue<>(10);

        /* renamed from: c */
        C0693f.C0696c<C0467b> f1799c = new C0693f.C0696c<>(10);

        static {
            Covode.recordClassIndex(533);
            C0468c cVar = new C0468c();
            f1797a = cVar;
            cVar.start();
        }

        private C0468c() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|8|6) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:6:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
            L_0x0000:
                java.util.concurrent.ArrayBlockingQueue<androidx.b.a.a$b> r0 = r5.f1798b     // Catch:{ InterruptedException -> 0x0000 }
                java.lang.Object r4 = r0.take()     // Catch:{ InterruptedException -> 0x0000 }
                androidx.b.a.a$b r4 = (androidx.p022b.p023a.C0464a.C0467b) r4     // Catch:{ InterruptedException -> 0x0000 }
                r3 = 0
                androidx.b.a.a r0 = r4.f1792a     // Catch:{ RuntimeException -> 0x0017 }
                android.view.LayoutInflater r2 = r0.f1786a     // Catch:{ RuntimeException -> 0x0017 }
                int r1 = r4.f1794c     // Catch:{ RuntimeException -> 0x0017 }
                android.view.ViewGroup r0 = r4.f1793b     // Catch:{ RuntimeException -> 0x0017 }
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r0, r3)     // Catch:{ RuntimeException -> 0x0017 }
                r4.f1795d = r0     // Catch:{ RuntimeException -> 0x0017 }
            L_0x0017:
                androidx.b.a.a r0 = r4.f1792a
                android.os.Handler r0 = r0.f1787b
                android.os.Message r0 = android.os.Message.obtain(r0, r3, r4)
                r0.sendToTarget()
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.p022b.p023a.C0464a.C0468c.run():void");
        }
    }

    /* renamed from: androidx.b.a.a$a */
    static class C0466a extends LayoutInflater {

        /* renamed from: a */
        private static final String[] f1791a = {"android.widget.", "android.webkit.", "android.app."};

        static {
            Covode.recordClassIndex(531);
        }

        C0466a(Context context) {
            super(context);
        }

        public final LayoutInflater cloneInContext(Context context) {
            return new C0466a(context);
        }

        /* access modifiers changed from: protected */
        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) {
            for (String str2 : f1791a) {
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

    public C0464a(Context context) {
        this.f1786a = new C0466a(context);
        this.f1787b = new Handler(this.f1789d);
        this.f1788c = C0468c.f1797a;
    }

    /* renamed from: a */
    public final void mo2025a(int i, ViewGroup viewGroup, AbstractC0469d dVar) {
        C0467b acquire = this.f1788c.f1799c.acquire();
        if (acquire == null) {
            acquire = new C0467b();
        }
        acquire.f1792a = this;
        acquire.f1794c = i;
        acquire.f1793b = viewGroup;
        acquire.f1796e = dVar;
        try {
            this.f1788c.f1798b.put(acquire);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }
}

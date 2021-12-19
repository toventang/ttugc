package net.openid.appauth.p4649a;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.p024a.AbstractServiceConnectionC0481d;
import androidx.browser.p024a.C0471b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import net.openid.appauth.p4651c.C89977a;

/* renamed from: net.openid.appauth.a.e */
public final class C89970e {

    /* renamed from: a */
    public final AtomicReference<C0471b> f203864a = new AtomicReference<>();

    /* renamed from: b */
    public final CountDownLatch f203865b = new CountDownLatch(1);

    /* renamed from: c */
    private final WeakReference<Context> f203866c;

    /* renamed from: d */
    private AbstractServiceConnectionC0481d f203867d;

    static {
        Covode.recordClassIndex(106141);
    }

    /* renamed from: b */
    public final C0471b mo144630b() {
        try {
            this.f203865b.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            C89977a.m156120b("Interrupted while waiting for browser connection", new Object[0]);
            this.f203865b.countDown();
        }
        return this.f203864a.get();
    }

    /* renamed from: a */
    public final synchronized void mo144628a() {
        MethodCollector.m26663i(10103);
        if (this.f203867d == null) {
            MethodCollector.m26664o(10103);
            return;
        }
        Context context = this.f203866c.get();
        if (context != null) {
            context.unbindService(this.f203867d);
        }
        this.f203864a.set(null);
        C89977a.m156118a("CustomTabsService is disconnected", new Object[0]);
        MethodCollector.m26664o(10103);
    }

    public C89970e(Context context) {
        this.f203866c = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final synchronized void mo144629a(String str) {
        MethodCollector.m26663i(9947);
        if (this.f203867d != null) {
            MethodCollector.m26664o(9947);
            return;
        }
        this.f203867d = new AbstractServiceConnectionC0481d() {
            /* class net.openid.appauth.p4649a.C89970e.C899711 */

            static {
                Covode.recordClassIndex(106142);
            }

            /* renamed from: b */
            private void m156111b(C0471b bVar) {
                C89970e.this.f203864a.set(bVar);
                C89970e.this.f203865b.countDown();
            }

            @Override // androidx.browser.p024a.AbstractServiceConnectionC0481d
            /* renamed from: a */
            public final void mo2033a(C0471b bVar) {
                C89977a.m156118a("CustomTabsService is connected", new Object[0]);
                bVar.mo2031a();
                m156111b(bVar);
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                C89977a.m156118a("CustomTabsService is disconnected", new Object[0]);
                m156111b(null);
            }
        };
        Context context = this.f203866c.get();
        if (context == null || !C0471b.m1710a(context, str, this.f203867d)) {
            C89977a.m156120b("Unable to bind custom tabs service", new Object[0]);
            this.f203865b.countDown();
        }
        MethodCollector.m26664o(9947);
    }
}

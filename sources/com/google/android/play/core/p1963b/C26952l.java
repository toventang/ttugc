package com.google.android.play.core.p1963b;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.b.l */
public final class C26952l<T extends IInterface> {

    /* renamed from: l */
    private static final Map<String, Handler> f63826l = new HashMap();

    /* renamed from: a */
    final Context f63827a;

    /* renamed from: b */
    final C26909b f63828b;

    /* renamed from: c */
    final String f63829c;

    /* renamed from: d */
    final List<AbstractRunnableC26936c> f63830d = new ArrayList();

    /* renamed from: e */
    boolean f63831e;

    /* renamed from: f */
    final Intent f63832f;

    /* renamed from: g */
    final AbstractC26948h<T> f63833g;

    /* renamed from: h */
    final WeakReference<AbstractC26947g> f63834h;

    /* renamed from: i */
    final IBinder.DeathRecipient f63835i = new C26944d(this);

    /* renamed from: j */
    ServiceConnection f63836j;

    /* renamed from: k */
    public T f63837k;

    static {
        Covode.recordClassIndex(32427);
    }

    public C26952l(Context context, C26909b bVar, String str, Intent intent, AbstractC26948h<T> hVar) {
        this.f63827a = context;
        this.f63828b = bVar;
        this.f63829c = str;
        this.f63832f = intent;
        this.f63833g = hVar;
        this.f63834h = new WeakReference<>(null);
    }

    /* renamed from: a */
    public final void mo44651a() {
        mo44653b(new C26946f(this));
    }

    /* renamed from: a */
    public final void mo44652a(AbstractRunnableC26936c cVar) {
        mo44653b(new C26945e(this, cVar.f63817g, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo44653b(AbstractRunnableC26936c cVar) {
        Handler handler;
        MethodCollector.m26663i(13119);
        Map<String, Handler> map = f63826l;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f63829c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f63829c, 10);
                    handlerThread.start();
                    map.put(this.f63829c, new Handler(handlerThread.getLooper()));
                }
                handler = map.get(this.f63829c);
            } catch (Throwable th) {
                MethodCollector.m26664o(13119);
                throw th;
            }
        }
        handler.post(cVar);
        MethodCollector.m26664o(13119);
    }
}

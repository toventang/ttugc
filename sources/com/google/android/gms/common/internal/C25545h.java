package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.internal.p1945d.HandlerC25727g;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.h */
public final class C25545h implements Handler.Callback {

    /* renamed from: a */
    public final AbstractC25546a f60610a;

    /* renamed from: b */
    public final ArrayList<AbstractC25357i.AbstractC25359b> f60611b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<AbstractC25357i.AbstractC25359b> f60612c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<AbstractC25357i.AbstractC25360c> f60613d = new ArrayList<>();

    /* renamed from: e */
    public volatile boolean f60614e = false;

    /* renamed from: f */
    public final AtomicInteger f60615f = new AtomicInteger(0);

    /* renamed from: g */
    public boolean f60616g = false;

    /* renamed from: h */
    public final Handler f60617h;

    /* renamed from: i */
    public final Object f60618i = new Object();

    /* renamed from: com.google.android.gms.common.internal.h$a */
    public interface AbstractC25546a {
        static {
            Covode.recordClassIndex(30949);
        }

        /* renamed from: g */
        boolean mo41583g();
    }

    static {
        Covode.recordClassIndex(30948);
    }

    /* renamed from: a */
    public final void mo41815a() {
        this.f60614e = false;
        this.f60615f.incrementAndGet();
    }

    /* renamed from: a */
    public final void mo41816a(AbstractC25357i.AbstractC25360c cVar) {
        MethodCollector.m26663i(9412);
        C25565r.m49314a(cVar);
        synchronized (this.f60618i) {
            try {
                if (this.f60613d.contains(cVar)) {
                    String.valueOf(String.valueOf(cVar)).length();
                } else {
                    this.f60613d.add(cVar);
                }
            } finally {
                MethodCollector.m26664o(9412);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        MethodCollector.m26663i(9568);
        if (message.what == 1) {
            AbstractC25357i.AbstractC25359b bVar = (AbstractC25357i.AbstractC25359b) message.obj;
            synchronized (this.f60618i) {
                try {
                    if (this.f60614e && this.f60610a.mo41583g() && this.f60611b.contains(bVar)) {
                        bVar.mo34348a(null);
                    }
                } finally {
                    MethodCollector.m26664o(9568);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
        MethodCollector.m26664o(9568);
        return false;
    }

    public C25545h(Looper looper, AbstractC25546a aVar) {
        this.f60610a = aVar;
        this.f60617h = new HandlerC25727g(looper, this);
    }
}

package com.bytedance.framwork.core.p1005c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.framwork.core.c.d */
public final class C14809d {

    /* renamed from: c */
    private static C14809d f36086c;

    /* renamed from: a */
    public final Map<String, AbstractC14801a> f36087a;

    /* renamed from: b */
    final AtomicBoolean f36088b;

    /* renamed from: d */
    private final Context f36089d;

    /* renamed from: e */
    private final C14811f f36090e;

    /* renamed from: f */
    private final LinkedList<C14805b> f36091f;

    static {
        Covode.recordClassIndex(16909);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC14801a mo23835a(String str) {
        return this.f36087a.get(str);
    }

    private C14809d(Context context) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f36088b = atomicBoolean;
        LinkedList<C14805b> linkedList = new LinkedList<>();
        this.f36091f = linkedList;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f36089d = applicationContext;
        this.f36087a = new ConcurrentHashMap();
        C14811f fVar = new C14811f(applicationContext, this, linkedList, atomicBoolean);
        this.f36090e = fVar;
        fVar.start();
    }

    /* renamed from: a */
    public static C14809d m27185a(Context context) {
        MethodCollector.m26663i(11367);
        if (f36086c == null) {
            synchronized (C14809d.class) {
                try {
                    if (f36086c == null) {
                        f36086c = new C14809d(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11367);
                    throw th;
                }
            }
        }
        C14809d dVar = f36086c;
        MethodCollector.m26664o(11367);
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo23836a(String str, byte[] bArr) {
        MethodCollector.m26663i(11529);
        if (this.f36088b.get() || bArr == null || bArr.length <= 0) {
            MethodCollector.m26664o(11529);
            return false;
        } else if (mo23835a(str) == null) {
            MethodCollector.m26664o(11529);
            return false;
        } else {
            synchronized (this.f36091f) {
                try {
                    if (this.f36088b.get()) {
                        return false;
                    }
                    if (this.f36091f.size() >= 2000) {
                        this.f36091f.poll();
                    }
                    boolean add = this.f36091f.add(new C14805b(str, bArr));
                    C14811f fVar = this.f36090e;
                    synchronized (fVar.f36095a) {
                        try {
                            fVar.f36095a.notify();
                        } finally {
                            MethodCollector.m26664o(11529);
                        }
                    }
                    return add;
                } finally {
                    MethodCollector.m26664o(11529);
                }
            }
        }
    }
}

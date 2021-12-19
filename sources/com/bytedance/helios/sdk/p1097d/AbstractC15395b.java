package com.bytedance.helios.sdk.p1097d;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;

/* renamed from: com.bytedance.helios.sdk.d.b */
public abstract class AbstractC15395b {

    /* renamed from: b */
    private static final String f37576b = AbstractC15395b.class.getSimpleName();

    /* renamed from: a */
    public final SparseArray<C15400e> f37577a = new SparseArray<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25135a(C15397d dVar, Throwable th);

    /* renamed from: a */
    public abstract int[] mo25138a();

    static {
        Covode.recordClassIndex(17647);
    }

    /* renamed from: a */
    public final C15400e mo25133a(int i) {
        return this.f37577a.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25134a(int i, C15400e eVar) {
        this.f37577a.put(i, eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo25137a(Throwable th, C15400e eVar, C15397d dVar) {
        StackTraceElement[] b = C14042ab.m25502b(th);
        StackTraceElement stackTraceElement = new StackTraceElement(getClass().getCanonicalName(), eVar.f37598d, eVar.f37599e + ".kt", 0);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(b.length + 1)];
        stackTraceElementArr[0] = stackTraceElement;
        System.arraycopy(b, 0, stackTraceElementArr, 1, b.length);
        th.setStackTrace(stackTraceElementArr);
        mo25135a(dVar, th);
    }

    /* renamed from: a */
    public final void mo25136a(Object obj, Object obj2, Object[] objArr, int i, long j, boolean z, String str) {
        C15400e a = mo25133a(i);
        HandlerThreadC15486g.m28499b().post(new RunnableC15396c(this, new Throwable(a.f37599e + "." + a.f37598d + " SensitiveApiException"), a, new C15397d(obj, obj2, objArr, i, j, z, (String) null, str, Thread.currentThread().getName())));
    }
}

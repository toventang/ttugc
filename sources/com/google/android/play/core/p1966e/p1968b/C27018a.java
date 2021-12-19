package com.google.android.play.core.p1966e.p1968b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.C26882a;
import com.google.android.play.core.p1963b.C26902at;
import com.google.android.play.core.p1965d.C26991q;
import com.google.android.play.core.p1966e.AbstractC26995aa;
import com.google.android.play.core.p1966e.AbstractC27030c;
import com.google.android.play.core.p1966e.AbstractC27034f;
import com.google.android.play.core.p1966e.AbstractC27035g;
import com.google.android.play.core.p1966e.C26993a;
import com.google.android.play.core.p1966e.C26998ad;
import com.google.android.play.core.p1966e.C27006al;
import com.google.android.play.core.p1966e.EnumC27002ah;
import com.google.android.play.core.tasks.AbstractC27062d;
import com.google.android.play.core.tasks.C27064f;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.e.b.a */
public final class C27018a implements AbstractC27030c {

    /* renamed from: a */
    static final long f63936a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    final Context f63937b;

    /* renamed from: c */
    final C26882a<AbstractC27034f> f63938c;

    /* renamed from: d */
    final Executor f63939d;

    /* renamed from: e */
    public final File f63940e;

    /* renamed from: f */
    final Set<String> f63941f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g */
    final Set<String> f63942g = Collections.synchronizedSet(new HashSet());

    /* renamed from: h */
    final AtomicBoolean f63943h = new AtomicBoolean(false);

    /* renamed from: i */
    private final Handler f63944i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    private final C27006al f63945j;

    /* renamed from: k */
    private final C26902at f63946k;

    /* renamed from: l */
    private final AbstractC26995aa f63947l;

    /* renamed from: m */
    private final AtomicReference<AbstractC27034f> f63948m = new AtomicReference<>();

    /* renamed from: n */
    private final C27019b f63949n;

    static {
        Covode.recordClassIndex(32494);
    }

    C27018a(Context context, File file, C27006al alVar) {
        Executor a = C26991q.m53632a();
        C26902at atVar = new C26902at(context);
        C27019b bVar = C27019b.f63950a;
        this.f63937b = context;
        this.f63940e = file;
        this.f63945j = alVar;
        this.f63939d = a;
        this.f63946k = atVar;
        this.f63949n = bVar;
        this.f63938c = new C26882a<>();
        this.f63947l = EnumC27002ah.f63903a;
    }

    /* renamed from: a */
    private final synchronized AbstractC27034f m53685a(AbstractC27028k kVar) {
        MethodCollector.m26663i(13432);
        AbstractC27034f c = mo44724c();
        AbstractC27034f a = kVar.mo44726a(c);
        if (this.f63948m.compareAndSet(c, a)) {
            MethodCollector.m26664o(13432);
            return a;
        }
        MethodCollector.m26664o(13432);
        return null;
    }

    /* renamed from: a */
    static String m53686a(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: a */
    private final void m53687a(AbstractC27034f fVar) {
        this.f63944i.post(new RunnableC27024g(this, fVar));
    }

    /* renamed from: d */
    private final C26998ad m53688d() {
        C26998ad c = this.f63945j.mo44715c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final AbstractC27062d<Void> mo44703a(int i) {
        try {
            AbstractC27034f a = m53685a(new C27023f(i));
            if (a != null) {
                m53687a(a);
            }
            return C27064f.m53801a((Object) null);
        } catch (C26993a e) {
            return C27064f.m53800a((Exception) e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0110, code lost:
        if (r1.contains(r11) == false) goto L_0x0113;
     */
    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.tasks.AbstractC27062d<java.lang.Integer> mo44704a(com.google.android.play.core.p1966e.C27032e r21) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1966e.p1968b.C27018a.mo44704a(com.google.android.play.core.e.e):com.google.android.play.core.tasks.d");
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final Set<String> mo44705a() {
        HashSet hashSet = new HashSet();
        if (this.f63945j.mo44714b() != null) {
            hashSet.addAll(this.f63945j.mo44714b());
        }
        hashSet.addAll(this.f63942g);
        return hashSet;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final void mo44706a(AbstractC27035g gVar) {
        this.f63938c.mo44562a(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44722a(List<Intent> list, List<String> list2, List<String> list3, long j, boolean z) {
        this.f63947l.mo44700a().mo44656a(list, new C27027j(this, list2, list3, j, z, list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo44723a(int i, int i2, Long l, Long l2, List<String> list, Integer num, List<String> list2) {
        AbstractC27034f a = m53685a(new C27020c(num, i, i2, l, l2, list, list2));
        if (a == null) {
            return false;
        }
        m53687a(a);
        return true;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final boolean mo44707a(AbstractC27034f fVar, Activity activity, int i) {
        return false;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: b */
    public final AbstractC27062d<AbstractC27034f> mo44708b(int i) {
        AbstractC27034f c = mo44724c();
        return (c == null || c.mo44734a() != i) ? C27064f.m53800a((Exception) new C26993a(-4)) : C27064f.m53801a(c);
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: b */
    public final Set<String> mo44709b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f63945j.mo44713a());
        hashSet.addAll(this.f63941f);
        return hashSet;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: b */
    public final void mo44710b(AbstractC27035g gVar) {
        this.f63938c.mo44564b(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC27034f mo44724c() {
        return this.f63948m.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo44725c(int i) {
        return mo44723a(6, i, null, null, null, null, null);
    }
}

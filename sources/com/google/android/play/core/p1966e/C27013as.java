package com.google.android.play.core.p1966e;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1964c.AbstractC26967a;
import com.google.android.play.core.tasks.AbstractC27062d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.as */
public final class C27013as implements AbstractC27030c {

    /* renamed from: a */
    final C27010ap f63924a;

    /* renamed from: b */
    private final C27048t f63925b;

    /* renamed from: c */
    private final C27006al f63926c;

    /* renamed from: d */
    private final C27050v f63927d;

    /* renamed from: e */
    private final Handler f63928e = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(32489);
    }

    C27013as(C27048t tVar, C27010ap apVar, C27006al alVar, C27050v vVar) {
        this.f63925b = tVar;
        this.f63924a = apVar;
        this.f63926c = alVar;
        this.f63927d = vVar;
    }

    /* renamed from: a */
    static List<String> m53671a(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Locale locale : list) {
            if (Build.VERSION.SDK_INT >= 21) {
                arrayList.add(locale.toLanguageTag());
            }
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final AbstractC27062d<Void> mo44703a(int i) {
        return this.f63925b.mo44750b(i);
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final Set<String> mo44705a() {
        Set<String> b = this.f63926c.mo44714b();
        return b == null ? Collections.emptySet() : b;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final synchronized void mo44706a(AbstractC27035g gVar) {
        MethodCollector.m26663i(11919);
        this.f63924a.mo44660a((AbstractC26967a) gVar);
        MethodCollector.m26664o(11919);
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: b */
    public final AbstractC27062d<AbstractC27034f> mo44708b(int i) {
        return this.f63925b.mo44748a(i);
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: b */
    public final Set<String> mo44709b() {
        return this.f63926c.mo44713a();
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: b */
    public final synchronized void mo44710b(AbstractC27035g gVar) {
        MethodCollector.m26663i(12056);
        this.f63924a.mo44664b(gVar);
        MethodCollector.m26664o(12056);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r3.containsAll(r2) != false) goto L_0x0018;
     */
    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.tasks.AbstractC27062d<java.lang.Integer> mo44704a(com.google.android.play.core.p1966e.C27032e r6) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1966e.C27013as.mo44704a(com.google.android.play.core.e.e):com.google.android.play.core.tasks.d");
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27030c
    /* renamed from: a */
    public final boolean mo44707a(AbstractC27034f fVar, Activity activity, int i) {
        C27012ar arVar = new C27012ar(activity);
        if (fVar.mo44735b() != 8 || fVar.mo44741h() == null) {
            return false;
        }
        arVar.mo44412a(fVar.mo44741h().getIntentSender(), i);
        return true;
    }
}

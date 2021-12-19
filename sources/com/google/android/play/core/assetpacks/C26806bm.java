package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1963b.C26909b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.bm */
public final class C26806bm {

    /* renamed from: a */
    static final C26909b f63563a = new C26909b("ExtractorSessionStoreView");

    /* renamed from: b */
    final C26769ac f63564b;

    /* renamed from: c */
    final AbstractC26916bg<AbstractC26857dj> f63565c;

    /* renamed from: d */
    final C26791ay f63566d;

    /* renamed from: e */
    public final Map<Integer, C26803bj> f63567e = new HashMap();

    /* renamed from: f */
    final ReentrantLock f63568f = new ReentrantLock();

    /* renamed from: g */
    private final AbstractC26916bg<Executor> f63569g;

    static {
        Covode.recordClassIndex(32281);
    }

    C26806bm(C26769ac acVar, AbstractC26916bg<AbstractC26857dj> bgVar, C26791ay ayVar, AbstractC26916bg<Executor> bgVar2) {
        this.f63564b = acVar;
        this.f63565c = bgVar;
        this.f63566d = ayVar;
        this.f63569g = bgVar2;
    }

    /* renamed from: a */
    static String m53242a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new C26787au("Session without pack received.");
    }

    /* renamed from: a */
    static <T> List<T> m53243a(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44495a(int i) {
        mo44494a(new C26800bg(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C26803bj mo44496b(int i) {
        Map<Integer, C26803bj> map = this.f63567e;
        Integer valueOf = Integer.valueOf(i);
        C26803bj bjVar = map.get(valueOf);
        if (bjVar != null) {
            return bjVar;
        }
        throw new C26787au(C1764a.m5928a("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo44497c(int i) {
        mo44494a(new C26799bf(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> T mo44494a(AbstractC26805bl<T> blVar) {
        try {
            this.f63568f.lock();
            return blVar.mo44493a();
        } finally {
            this.f63568f.unlock();
        }
    }
}

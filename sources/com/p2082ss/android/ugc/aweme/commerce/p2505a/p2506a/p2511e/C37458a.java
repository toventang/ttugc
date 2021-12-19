package com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2511e;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.C37446c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.a.e.a */
public final class C37458a {

    /* renamed from: a */
    public final HashMap<View, String> f88431a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<View, String> f88432b = new HashMap<>();

    /* renamed from: c */
    public final HashSet<View> f88433c = new HashSet<>();

    /* renamed from: d */
    final HashSet<String> f88434d = new HashSet<>();

    /* renamed from: e */
    public C37446c f88435e;

    /* renamed from: f */
    boolean f88436f;

    static {
        Covode.recordClassIndex(44843);
    }

    /* renamed from: a */
    public final void mo65168a() {
        this.f88435e = null;
        this.f88436f = false;
        this.f88431a.clear();
        this.f88432b.clear();
        this.f88433c.clear();
        this.f88434d.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65169a(C37446c cVar, String str) {
        Iterator<WeakReference<View>> it = cVar.f88397a.iterator();
        while (it.hasNext()) {
            WeakReference<View> next = it.next();
            if (next.get() != null) {
                this.f88432b.put(next.get(), str);
            }
        }
    }
}

package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.squareup.a.m */
public final class C29231m {

    /* renamed from: a */
    private int f69271a = 64;

    /* renamed from: b */
    private int f69272b = 5;

    /* renamed from: c */
    private final Deque<Object> f69273c = new ArrayDeque();

    /* renamed from: d */
    private final Deque<Object> f69274d = new ArrayDeque();

    /* renamed from: e */
    private final Deque<C29219e> f69275e = new ArrayDeque();

    static {
        Covode.recordClassIndex(35580);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo50971a(C29219e eVar) {
        MethodCollector.m26663i(2898);
        this.f69275e.add(eVar);
        MethodCollector.m26664o(2898);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo50972b(C29219e eVar) {
        MethodCollector.m26663i(2900);
        if (this.f69275e.remove(eVar)) {
            MethodCollector.m26664o(2900);
        } else {
            AssertionError assertionError = new AssertionError("Call wasn't in-flight!");
            MethodCollector.m26664o(2900);
            throw assertionError;
        }
    }
}

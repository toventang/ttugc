package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;

/* renamed from: com.facebook.imagepipeline.memory.g */
public final class C24488g<T> {

    /* renamed from: a */
    protected final SparseArray<C24489a<T>> f58189a = new SparseArray<>();

    /* renamed from: b */
    C24489a<T> f58190b;

    /* renamed from: c */
    C24489a<T> f58191c;

    static {
        Covode.recordClassIndex(28632);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.g$a */
    public static class C24489a<I> {

        /* renamed from: a */
        C24489a<I> f58192a;

        /* renamed from: b */
        int f58193b;

        /* renamed from: c */
        LinkedList<I> f58194c;

        /* renamed from: d */
        C24489a<I> f58195d;

        static {
            Covode.recordClassIndex(28633);
        }

        public final String toString() {
            return "LinkedEntry(key: " + this.f58193b + ")";
        }

        private C24489a(int i, LinkedList<I> linkedList) {
            this.f58192a = null;
            this.f58193b = i;
            this.f58194c = linkedList;
            this.f58195d = null;
        }

        /* synthetic */ C24489a(int i, LinkedList linkedList, byte b) {
            this(i, linkedList);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* renamed from: a */
    public final synchronized T mo40369a() {
        MethodCollector.m26663i(4368);
        C24489a<T> aVar = this.f58191c;
        if (aVar == null) {
            MethodCollector.m26664o(4368);
            return null;
        }
        I pollLast = aVar.f58194c.pollLast();
        if (aVar.f58194c.isEmpty()) {
            m46775a(aVar);
            this.f58189a.remove(aVar.f58193b);
        }
        MethodCollector.m26664o(4368);
        return pollLast;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.facebook.imagepipeline.memory.g$a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.facebook.imagepipeline.memory.g$a<T>, com.facebook.imagepipeline.memory.g$a<I> */
    /* renamed from: b */
    private void m46776b(C24489a<T> aVar) {
        if (this.f58190b != aVar) {
            m46775a(aVar);
            C24489a aVar2 = (C24489a<T>) this.f58190b;
            if (aVar2 == null) {
                this.f58190b = aVar;
                this.f58191c = aVar;
                return;
            }
            aVar.f58195d = aVar2;
            this.f58190b.f58192a = aVar;
            this.f58190b = aVar;
        }
    }

    /* renamed from: a */
    private synchronized void m46775a(C24489a<T> aVar) {
        MethodCollector.m26663i(4353);
        C24489a aVar2 = (C24489a<I>) aVar.f58192a;
        C24489a aVar3 = (C24489a<I>) aVar.f58195d;
        if (aVar2 != null) {
            aVar2.f58195d = aVar3;
        }
        if (aVar3 != null) {
            aVar3.f58192a = aVar2;
        }
        aVar.f58192a = null;
        aVar.f58195d = null;
        if (aVar == this.f58190b) {
            this.f58190b = aVar3;
        }
        if (aVar == this.f58191c) {
            this.f58191c = aVar2;
        }
        MethodCollector.m26664o(4353);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* renamed from: a */
    public final synchronized T mo40370a(int i) {
        MethodCollector.m26663i(4286);
        C24489a<T> aVar = this.f58189a.get(i);
        if (aVar == null) {
            MethodCollector.m26664o(4286);
            return null;
        }
        I pollFirst = aVar.f58194c.pollFirst();
        m46776b(aVar);
        MethodCollector.m26664o(4286);
        return pollFirst;
    }

    /* renamed from: a */
    public final synchronized void mo40371a(int i, T t) {
        MethodCollector.m26663i(4351);
        C24489a<T> aVar = this.f58189a.get(i);
        if (aVar == null) {
            aVar = new C24489a<>(i, new LinkedList(), (byte) 0);
            this.f58189a.put(i, aVar);
        }
        aVar.f58194c.addLast(t);
        m46776b(aVar);
        MethodCollector.m26664o(4351);
    }
}

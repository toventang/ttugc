package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC27894b;
import com.google.gson.AbstractC28033w;
import com.google.gson.p2018a.AbstractC27892d;
import com.google.gson.p2018a.AbstractC27893e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder implements AbstractC28033w, Cloneable {

    /* renamed from: a */
    public static final Excluder f65578a = new Excluder();

    /* renamed from: b */
    public double f65579b = -1.0d;

    /* renamed from: c */
    public int f65580c = 136;

    /* renamed from: d */
    public boolean f65581d = true;

    /* renamed from: e */
    public boolean f65582e;

    /* renamed from: f */
    public List<AbstractC27894b> f65583f = Collections.emptyList();

    /* renamed from: g */
    public List<AbstractC27894b> f65584g = Collections.emptyList();

    static {
        Covode.recordClassIndex(33514);
    }

    /* renamed from: a */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    private boolean m55957a(AbstractC27892d dVar) {
        if (dVar == null || dVar.mo46613a() <= this.f65579b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m55960c(Class<?> cls) {
        if (!cls.isMemberClass() || m55961d(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m55961d(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m55958a(AbstractC27893e eVar) {
        if (eVar == null || eVar.mo46614a() > this.f65579b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m55959b(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo46702a(Class<?> cls) {
        if (this.f65579b != -1.0d && !mo46701a((AbstractC27892d) cls.getAnnotation(AbstractC27892d.class), (AbstractC27893e) cls.getAnnotation(AbstractC27893e.class))) {
            return true;
        }
        if ((this.f65581d || !m55960c(cls)) && !m55959b(cls)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2 == false) goto L_0x0014;
     */
    @Override // com.google.gson.AbstractC28033w
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.google.gson.AbstractC28031v<T> create(final com.google.gson.C27910f r8, final com.google.gson.p2019b.C27895a<T> r9) {
        /*
            r7 = this;
            r6 = r9
            java.lang.Class<? super T> r3 = r6.rawType
            boolean r2 = r7.mo46702a(r3)
            r1 = 0
            r0 = 1
            if (r2 != 0) goto L_0x0011
            boolean r0 = r7.mo46703a(r3, r0)
            if (r0 == 0) goto L_0x0023
        L_0x0011:
            r4 = 1
            if (r2 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = r7.mo46703a(r3, r1)
            if (r0 == 0) goto L_0x0021
        L_0x001a:
            r3 = 1
        L_0x001b:
            if (r4 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0025
            r0 = 0
            return r0
        L_0x0021:
            r3 = 0
            goto L_0x001b
        L_0x0023:
            r4 = 0
            goto L_0x0014
        L_0x0025:
            com.google.gson.internal.Excluder$1 r1 = new com.google.gson.internal.Excluder$1
            r2 = r7
            r5 = r8
            r1.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.create(com.google.gson.f, com.google.gson.b.a):com.google.gson.v");
    }

    /* renamed from: a */
    public final boolean mo46701a(AbstractC27892d dVar, AbstractC27893e eVar) {
        if (!m55957a(dVar) || !m55958a(eVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo46703a(Class<?> cls, boolean z) {
        List<AbstractC27894b> list;
        if (z) {
            list = this.f65583f;
        } else {
            list = this.f65584g;
        }
        for (AbstractC27894b bVar : list) {
            if (bVar.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Excluder mo46700a(AbstractC27894b bVar, boolean z, boolean z2) {
        Excluder a = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.f65583f);
            a.f65583f = arrayList;
            arrayList.add(bVar);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.f65584g);
            a.f65584g = arrayList2;
            arrayList2.add(bVar);
        }
        return a;
    }
}

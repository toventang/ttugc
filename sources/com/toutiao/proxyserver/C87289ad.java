package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.util.ArrayDeque;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.toutiao.proxyserver.ad */
public final class C87289ad {

    /* renamed from: a */
    public List<String> f197846a;

    /* renamed from: b */
    public final ArrayDeque<C87290a> f197847b;

    /* renamed from: c */
    private final ArrayDeque<C87290a> f197848c;

    static {
        Covode.recordClassIndex(103185);
    }

    /* renamed from: com.toutiao.proxyserver.ad$a */
    class C87290a {

        /* renamed from: a */
        final String f197849a;

        /* renamed from: b */
        boolean f197850b = true;

        static {
            Covode.recordClassIndex(103186);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo141324a() {
            if (this.f197850b) {
                C87289ad.this.f197847b.addLast(this);
                this.f197850b = false;
            }
        }

        C87290a(String str) {
            this.f197849a = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo141322a() {
        if (!this.f197848c.isEmpty() || !this.f197847b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C87290a mo141323b() {
        if (!this.f197848c.isEmpty()) {
            return this.f197848c.removeFirst();
        }
        if (!this.f197847b.isEmpty()) {
            return this.f197847b.removeFirst();
        }
        throw new NoSuchElementException();
    }

    public C87289ad(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("urls is empty");
        }
        int size = list.size();
        this.f197846a = list;
        this.f197848c = new ArrayDeque<>(size);
        this.f197847b = new ArrayDeque<>(size);
        for (String str : list) {
            if (C87328b.m151558a(str)) {
                this.f197848c.add(new C87290a(str));
            }
        }
    }
}

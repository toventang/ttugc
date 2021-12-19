package com.bytedance.p802b.p813c.p818d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p834j.p839e.AbstractC13109a;
import java.util.LinkedList;

/* renamed from: com.bytedance.b.c.d.a */
public final class C13024a implements AbstractC13109a {

    /* renamed from: a */
    public double f31738a;

    /* renamed from: b */
    public double f31739b;

    /* renamed from: c */
    private Pair<Long, LinkedList<AbstractC13109a.C13110a>> f31740c;

    /* renamed from: d */
    private Pair<Long, LinkedList<AbstractC13109a.C13110a>> f31741d;

    static {
        Covode.recordClassIndex(14860);
    }

    @Override // com.bytedance.p802b.p834j.p839e.AbstractC13109a
    /* renamed from: a */
    public final double mo20881a() {
        return this.f31738a;
    }

    @Override // com.bytedance.p802b.p834j.p839e.AbstractC13109a
    /* renamed from: b */
    public final double mo20883b() {
        return this.f31739b;
    }

    /* renamed from: com.bytedance.b.c.d.a$a */
    public static final class C13025a {

        /* renamed from: a */
        public static final C13024a f31742a = new C13024a((byte) 0);

        static {
            Covode.recordClassIndex(14861);
        }
    }

    private C13024a() {
        this.f31738a = -1.0d;
        this.f31739b = -1.0d;
        this.f31740c = new Pair<>(0L, new LinkedList());
        this.f31741d = new Pair<>(0L, new LinkedList());
    }

    /* synthetic */ C13024a(byte b) {
        this();
    }

    /* renamed from: a */
    public final synchronized void mo20882a(LinkedList<AbstractC13109a.C13110a> linkedList) {
        this.f31740c = new Pair<>(Long.valueOf(System.currentTimeMillis()), linkedList);
    }

    /* renamed from: b */
    public final synchronized void mo20884b(LinkedList<AbstractC13109a.C13110a> linkedList) {
        this.f31741d = new Pair<>(Long.valueOf(System.currentTimeMillis()), linkedList);
    }
}

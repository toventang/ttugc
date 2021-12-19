package com.p2082ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.gamora.editor.y */
public final class C83395y {

    /* renamed from: d */
    public static final List<Integer> f186260d = C89070n.m154522b(1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 13, 15);

    /* renamed from: e */
    public static final C83396a f186261e = new C83396a((byte) 0);

    /* renamed from: a */
    public final int f186262a;

    /* renamed from: b */
    public final int f186263b;

    /* renamed from: c */
    public final int f186264c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83395y)) {
            return false;
        }
        C83395y yVar = (C83395y) obj;
        return this.f186262a == yVar.f186262a && this.f186263b == yVar.f186263b && this.f186264c == yVar.f186264c;
    }

    public final int hashCode() {
        return (((this.f186262a * 31) + this.f186263b) * 31) + this.f186264c;
    }

    public final String toString() {
        return "EditToolbarItemModel(type=" + this.f186262a + ", iconRes=" + this.f186263b + ", textRes=" + this.f186264c + ")";
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.y$a */
    public static final class C83396a {
        static {
            Covode.recordClassIndex(97282);
        }

        private C83396a() {
        }

        public /* synthetic */ C83396a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(97281);
    }

    public C83395y(int i, int i2, int i3) {
        this.f186262a = i;
        this.f186263b = i2;
        this.f186264c = i3;
    }
}

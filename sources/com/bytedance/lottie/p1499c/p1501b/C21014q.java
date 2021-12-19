package com.bytedance.lottie.p1499c.p1501b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1496a.AbstractC20935b;
import com.bytedance.lottie.p1495a.p1496a.C20953r;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;

/* renamed from: com.bytedance.lottie.c.b.q */
public final class C21014q implements AbstractC20993b {

    /* renamed from: a */
    public final String f49818a;

    /* renamed from: b */
    public final EnumC21015a f49819b;

    /* renamed from: c */
    public final C20978b f49820c;

    /* renamed from: d */
    public final C20978b f49821d;

    /* renamed from: e */
    public final C20978b f49822e;

    static {
        Covode.recordClassIndex(24630);
    }

    /* renamed from: com.bytedance.lottie.c.b.q$a */
    public enum EnumC21015a {
        Simultaneously,
        Individually;

        static {
            Covode.recordClassIndex(24631);
        }

        public static EnumC21015a forId(int i) {
            if (i == 1) {
                return Simultaneously;
            }
            if (i == 2) {
                return Individually;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f49820c + ", end: " + this.f49821d + ", offset: " + this.f49822e + "}";
    }

    @Override // com.bytedance.lottie.p1499c.p1501b.AbstractC20993b
    /* renamed from: a */
    public final AbstractC20935b mo34483a(C21106i iVar, AbstractC21017a aVar) {
        return new C20953r(aVar, this);
    }

    public C21014q(String str, EnumC21015a aVar, C20978b bVar, C20978b bVar2, C20978b bVar3) {
        this.f49818a = str;
        this.f49819b = aVar;
        this.f49820c = bVar;
        this.f49821d = bVar2;
        this.f49822e = bVar3;
    }
}

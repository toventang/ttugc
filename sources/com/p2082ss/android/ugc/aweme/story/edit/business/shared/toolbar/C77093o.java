package com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.o */
public final class C77093o {

    /* renamed from: d */
    public static final List<Integer> f172926d = C89070n.m154522b(1, 2, 3, 4, 5, 0);

    /* renamed from: e */
    public static final C77094a f172927e = new C77094a((byte) 0);

    /* renamed from: a */
    public final int f172928a;

    /* renamed from: b */
    public final int f172929b;

    /* renamed from: c */
    public final int f172930c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77093o)) {
            return false;
        }
        C77093o oVar = (C77093o) obj;
        return this.f172928a == oVar.f172928a && this.f172929b == oVar.f172929b && this.f172930c == oVar.f172930c;
    }

    public final int hashCode() {
        return (((this.f172928a * 31) + this.f172929b) * 31) + this.f172930c;
    }

    public final String toString() {
        return "ToolbarItemModel(type=" + this.f172928a + ", iconRes=" + this.f172929b + ", textRes=" + this.f172930c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.o$a */
    public static final class C77094a {
        static {
            Covode.recordClassIndex(90095);
        }

        private C77094a() {
        }

        public /* synthetic */ C77094a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(90094);
    }

    public C77093o(int i, int i2, int i3) {
        this.f172928a = i;
        this.f172929b = i2;
        this.f172930c = i3;
    }
}

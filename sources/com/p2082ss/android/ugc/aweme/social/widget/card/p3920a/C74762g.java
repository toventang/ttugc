package com.p2082ss.android.ugc.aweme.social.widget.card.p3920a;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.a.g */
public final class C74762g {

    /* renamed from: e */
    public static final C74763a f168043e = new C74763a((byte) 0);

    /* renamed from: a */
    public final Map<EnumC74761f, EnumC74754a> f168044a;

    /* renamed from: b */
    public final boolean f168045b;

    /* renamed from: c */
    public final boolean f168046c;

    /* renamed from: d */
    public final int f168047d;

    static {
        Covode.recordClassIndex(87607);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74762g)) {
            return false;
        }
        C74762g gVar = (C74762g) obj;
        return C89219l.m154714a(this.f168044a, gVar.f168044a) && this.f168045b == gVar.f168045b && this.f168046c == gVar.f168046c && this.f168047d == gVar.f168047d;
    }

    public final int hashCode() {
        Map<EnumC74761f, EnumC74754a> map = this.f168044a;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        boolean z = this.f168045b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        if (!this.f168046c) {
            i = 0;
        }
        return ((i5 + i) * 31) + this.f168047d;
    }

    public final String toString() {
        return "PermissionConfig(types=" + this.f168044a + ", shouldRequestData=" + this.f168045b + ", shouldInsertUser=" + this.f168046c + ", groupIndex=" + this.f168047d + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.a.g$a */
    public static final class C74763a {
        static {
            Covode.recordClassIndex(87608);
        }

        private C74763a() {
        }

        public /* synthetic */ C74763a(byte b) {
            this();
        }
    }

    public /* synthetic */ C74762g(Map map) {
        this(map, false, false, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<com.ss.android.ugc.aweme.social.widget.card.a.f, ? extends com.ss.android.ugc.aweme.social.widget.card.a.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public C74762g(Map<EnumC74761f, ? extends EnumC74754a> map, boolean z, boolean z2, int i) {
        C89219l.m154721d(map, "");
        this.f168044a = map;
        this.f168045b = z;
        this.f168046c = z2;
        this.f168047d = i;
    }
}

package com.p2082ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.a */
public final class C47797a {

    /* renamed from: c */
    public static final C47798a f110744c = new C47798a((byte) 0);

    /* renamed from: a */
    public final Aweme f110745a;

    /* renamed from: b */
    public final int f110746b;

    static {
        Covode.recordClassIndex(56423);
    }

    public C47797a() {
        this(null, 0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47797a)) {
            return false;
        }
        C47797a aVar = (C47797a) obj;
        return C89219l.m154714a(this.f110745a, aVar.f110745a) && this.f110746b == aVar.f110746b;
    }

    public final int hashCode() {
        Aweme aweme = this.f110745a;
        return ((aweme != null ? aweme.hashCode() : 0) * 31) + this.f110746b;
    }

    public final String toString() {
        return "AwemeWithManage(aweme=" + this.f110745a + ", manageState=" + this.f110746b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.a$a */
    public static final class C47798a {
        static {
            Covode.recordClassIndex(56424);
        }

        private C47798a() {
        }

        public /* synthetic */ C47798a(byte b) {
            this();
        }
    }

    public C47797a(Aweme aweme, int i) {
        C89219l.m154721d(aweme, "");
        this.f110745a = aweme;
        this.f110746b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C47797a(Aweme aweme, int i, int i2) {
        this((i2 & 1) != 0 ? new Aweme() : aweme, (i2 & 2) != 0 ? 0 : i);
    }
}

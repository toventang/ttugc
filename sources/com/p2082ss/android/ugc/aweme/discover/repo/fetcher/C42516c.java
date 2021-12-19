package com.p2082ss.android.ugc.aweme.discover.repo.fetcher;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.c */
public final class C42516c implements Serializable {
    public static final C42517a Companion = new C42517a(null);

    /* renamed from: a */
    private boolean f99129a;

    /* renamed from: b */
    private final int f99130b;

    static {
        Covode.recordClassIndex(50605);
    }

    public static /* synthetic */ C42516c copy$default(C42516c cVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cVar.f99130b;
        }
        return cVar.copy(i);
    }

    public final int component1() {
        return this.f99130b;
    }

    public final C42516c copy(int i) {
        return new C42516c(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C42516c) && this.f99130b == ((C42516c) obj).f99130b;
        }
        return true;
    }

    public final String toString() {
        return "DiscoverRequestParam(cursor=" + this.f99130b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.c$a */
    public static final class C42517a implements Serializable {
        static {
            Covode.recordClassIndex(50606);
        }

        private C42517a() {
        }

        public /* synthetic */ C42517a(C89214g gVar) {
            this();
        }
    }

    public final int getCursor() {
        return this.f99130b;
    }

    public final int hashCode() {
        return this.f99130b;
    }

    public final boolean isFromSuggestSearch() {
        return this.f99129a;
    }

    public final void setFromSuggestSearch(boolean z) {
        this.f99129a = z;
    }

    public C42516c(int i) {
        this.f99130b = i;
    }
}

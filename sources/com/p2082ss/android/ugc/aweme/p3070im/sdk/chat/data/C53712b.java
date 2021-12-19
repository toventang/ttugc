package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.b */
public final class C53712b implements Serializable {

    /* renamed from: a */
    private final String f123242a;

    static {
        Covode.recordClassIndex(63292);
    }

    public C53712b() {
        this(null, 1, null);
    }

    public static /* synthetic */ C53712b copy$default(C53712b bVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f123242a;
        }
        return bVar.copy(str);
    }

    public final String component1() {
        return this.f123242a;
    }

    public final C53712b copy(String str) {
        C89219l.m154721d(str, "");
        return new C53712b(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C53712b) && C89219l.m154714a(this.f123242a, ((C53712b) obj).f123242a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f123242a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StatisticParams(enterFrom=" + this.f123242a + ")";
    }

    public final String getEnterFrom() {
        return this.f123242a;
    }

    public C53712b(String str) {
        C89219l.m154721d(str, "");
        this.f123242a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C53712b(String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? "chat" : str);
    }
}

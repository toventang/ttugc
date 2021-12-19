package com.p2082ss.android.ugc.aweme.search.p3687e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.e.h */
public final class C67385h {
    @AbstractC27891c(mo46611a = "enabled")

    /* renamed from: a */
    public final Integer f150959a;
    @AbstractC27891c(mo46611a = "preload_interval_ms")

    /* renamed from: b */
    public final Long f150960b;
    @AbstractC27891c(mo46611a = "resource_channel")

    /* renamed from: c */
    public final String f150961c;
    @AbstractC27891c(mo46611a = "lynx_channel")

    /* renamed from: d */
    public final String f150962d;

    static {
        Covode.recordClassIndex(79015);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67385h)) {
            return false;
        }
        C67385h hVar = (C67385h) obj;
        return C89219l.m154714a(this.f150959a, hVar.f150959a) && C89219l.m154714a(this.f150960b, hVar.f150960b) && C89219l.m154714a(this.f150961c, hVar.f150961c) && C89219l.m154714a(this.f150962d, hVar.f150962d);
    }

    public final int hashCode() {
        Integer num = this.f150959a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Long l = this.f150960b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.f150961c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f150962d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "Settings(enabled=" + this.f150959a + ", preloadIntervalMillis=" + this.f150960b + ", resourceChannel=" + this.f150961c + ", lynxTemplateChannel=" + this.f150962d + ")";
    }

    private C67385h() {
        this.f150959a = null;
        this.f150960b = null;
        this.f150961c = null;
        this.f150962d = null;
    }

    public /* synthetic */ C67385h(byte b) {
        this();
    }
}

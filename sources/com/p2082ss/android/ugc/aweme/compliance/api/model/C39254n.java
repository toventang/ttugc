package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Map;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.n */
public final class C39254n implements Serializable {
    public static final C39255a Companion = new C39255a((byte) 0);
    @AbstractC27891c(mo46611a = "account")

    /* renamed from: a */
    private final Map<String, C39256o> f92733a;
    @AbstractC27891c(mo46611a = "video")

    /* renamed from: b */
    private final Map<String, C39256o> f92734b;

    static {
        Covode.recordClassIndex(46912);
    }

    public C39254n() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.n */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39254n copy$default(C39254n nVar, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = nVar.f92733a;
        }
        if ((i & 2) != 0) {
            map2 = nVar.f92734b;
        }
        return nVar.copy(map, map2);
    }

    public final Map<String, C39256o> component1() {
        return this.f92733a;
    }

    public final Map<String, C39256o> component2() {
        return this.f92734b;
    }

    public final C39254n copy(Map<String, C39256o> map, Map<String, C39256o> map2) {
        return new C39254n(map, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39254n)) {
            return false;
        }
        C39254n nVar = (C39254n) obj;
        return C89219l.m154714a(this.f92733a, nVar.f92733a) && C89219l.m154714a(this.f92734b, nVar.f92734b);
    }

    public final int hashCode() {
        Map<String, C39256o> map = this.f92733a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, C39256o> map2 = this.f92734b;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PrivacySettingRestriction(account=" + this.f92733a + ", videoPrivacy=" + this.f92734b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.api.model.n$a */
    public static final class C39255a {
        static {
            Covode.recordClassIndex(46913);
        }

        private C39255a() {
        }

        public /* synthetic */ C39255a(byte b) {
            this();
        }
    }

    public final Map<String, C39256o> getAccount() {
        return this.f92733a;
    }

    public final Map<String, C39256o> getVideoPrivacy() {
        return this.f92734b;
    }

    public C39254n(Map<String, C39256o> map, Map<String, C39256o> map2) {
        this.f92733a = map;
        this.f92734b = map2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o getTargetRestrictionItem(int r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
            r1 = 0
            if (r3 == 0) goto L_0x0012
            r0 = 1
            if (r3 == r0) goto L_0x000f
            r0 = 2
            if (r3 == r0) goto L_0x000f
        L_0x000e:
            return r1
        L_0x000f:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.o> r0 = r2.f92734b
            goto L_0x0014
        L_0x0012:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.o> r0 = r2.f92733a
        L_0x0014:
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.get(r4)
            com.ss.android.ugc.aweme.compliance.api.model.o r0 = (com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.api.model.C39254n.getTargetRestrictionItem(int, java.lang.String):com.ss.android.ugc.aweme.compliance.api.model.o");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39254n(Map map, Map map2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
    }
}

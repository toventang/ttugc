package com.p2082ss.android.ugc.aweme.net.p3500j;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Set;
import p4600h.p4601a.C89036ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.j.g */
public final class C61409g {
    @AbstractC27891c(mo46611a = "enable")

    /* renamed from: a */
    public boolean f139422a;
    @AbstractC27891c(mo46611a = "intercept_enable")

    /* renamed from: b */
    public boolean f139423b;
    @AbstractC27891c(mo46611a = "ttnet_sampling")

    /* renamed from: c */
    public int f139424c;
    @AbstractC27891c(mo46611a = "okhttp_sampling")

    /* renamed from: d */
    public int f139425d;
    @AbstractC27891c(mo46611a = "urlconnection_sampling")

    /* renamed from: e */
    public int f139426e;
    @AbstractC27891c(mo46611a = "applog_sampling")

    /* renamed from: f */
    public int f139427f;
    @AbstractC27891c(mo46611a = "commonlog_sampling")

    /* renamed from: g */
    public int f139428g;
    @AbstractC27891c(mo46611a = "front_back_count")

    /* renamed from: h */
    public int f139429h;
    @AbstractC27891c(mo46611a = "flow_control")

    /* renamed from: i */
    public int f139430i;
    @AbstractC27891c(mo46611a = "rule_regex")

    /* renamed from: j */
    public String f139431j;
    @AbstractC27891c(mo46611a = "max_size")

    /* renamed from: k */
    public final long f139432k;
    @AbstractC27891c(mo46611a = "intercept_api_list")

    /* renamed from: l */
    public final Set<String> f139433l;
    @AbstractC27891c(mo46611a = "check_list")

    /* renamed from: m */
    public Set<String> f139434m;

    static {
        Covode.recordClassIndex(72059);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61409g)) {
            return false;
        }
        C61409g gVar = (C61409g) obj;
        return this.f139422a == gVar.f139422a && this.f139423b == gVar.f139423b && this.f139424c == gVar.f139424c && this.f139425d == gVar.f139425d && this.f139426e == gVar.f139426e && this.f139427f == gVar.f139427f && this.f139428g == gVar.f139428g && this.f139429h == gVar.f139429h && this.f139430i == gVar.f139430i && C89219l.m154714a(this.f139431j, gVar.f139431j) && this.f139432k == gVar.f139432k && C89219l.m154714a(this.f139433l, gVar.f139433l) && C89219l.m154714a(this.f139434m, gVar.f139434m);
    }

    public final String toString() {
        return "PayLoadControl(enable=" + this.f139422a + ", intercept=" + this.f139423b + ", ttNetSampling=" + this.f139424c + ", okHttpSampling=" + this.f139425d + ", urlConnectionSampling=" + this.f139426e + ", appLogSampling=" + this.f139427f + ", commonLogSampling=" + this.f139428g + ", count=" + this.f139429h + ", flowControl=" + this.f139430i + ", ruleRegex=" + this.f139431j + ", maxSize=" + this.f139432k + ", interceptApi=" + this.f139433l + ", checkList=" + this.f139434m + ")";
    }

    public /* synthetic */ C61409g() {
        this("", C89036ab.INSTANCE, C89036ab.INSTANCE);
    }

    public final int hashCode() {
        int i;
        int i2;
        boolean z = this.f139422a;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = i4 * 31;
        if (!this.f139423b) {
            i3 = 0;
        }
        int i8 = (((((((((((((((i7 + i3) * 31) + this.f139424c) * 31) + this.f139425d) * 31) + this.f139426e) * 31) + this.f139427f) * 31) + this.f139428g) * 31) + this.f139429h) * 31) + this.f139430i) * 31;
        String str = this.f139431j;
        int i9 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f139432k;
        int i10 = (((i8 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        Set<String> set = this.f139433l;
        if (set != null) {
            i2 = set.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        Set<String> set2 = this.f139434m;
        if (set2 != null) {
            i9 = set2.hashCode();
        }
        return i11 + i9;
    }

    private C61409g(String str, Set<String> set, Set<String> set2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(set, "");
        C89219l.m154721d(set2, "");
        this.f139422a = false;
        this.f139423b = false;
        this.f139424c = 0;
        this.f139425d = 0;
        this.f139426e = 0;
        this.f139427f = 0;
        this.f139428g = 0;
        this.f139429h = 6;
        this.f139430i = 2;
        this.f139431j = str;
        this.f139432k = 5242880;
        this.f139433l = set;
        this.f139434m = set2;
    }
}

package com.p2082ss.android.ugc.aweme.search.p3696l.p3697a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.p1264a.C18087e;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchUserLinearLayoutManager;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.a.e */
public final class C67603e {

    /* renamed from: A */
    public boolean f151418A;

    /* renamed from: B */
    public final List<Runnable> f151419B = new ArrayList();

    /* renamed from: C */
    public final C67678d f151420C;

    /* renamed from: a */
    public long f151421a;

    /* renamed from: b */
    public int f151422b;

    /* renamed from: c */
    public long f151423c;

    /* renamed from: d */
    public long f151424d;

    /* renamed from: e */
    public long f151425e;

    /* renamed from: f */
    public AbstractC33631g f151426f;

    /* renamed from: g */
    public int f151427g;

    /* renamed from: h */
    public int f151428h;

    /* renamed from: i */
    public int f151429i;

    /* renamed from: j */
    public int f151430j;

    /* renamed from: k */
    public int f151431k;

    /* renamed from: l */
    public int f151432l;

    /* renamed from: m */
    public int f151433m;

    /* renamed from: n */
    public int f151434n = -1;

    /* renamed from: o */
    public String f151435o;

    /* renamed from: p */
    public int f151436p = -1;

    /* renamed from: q */
    public String f151437q;

    /* renamed from: r */
    public int f151438r;

    /* renamed from: s */
    public int f151439s = -1;

    /* renamed from: t */
    public int f151440t = -1;

    /* renamed from: u */
    public int f151441u;

    /* renamed from: v */
    public long f151442v = -1;

    /* renamed from: w */
    public long f151443w = -1;

    /* renamed from: x */
    public long f151444x = -1;

    /* renamed from: y */
    public C18087e f151445y;

    /* renamed from: z */
    public boolean f151446z;

    static {
        Covode.recordClassIndex(79242);
    }

    /* renamed from: e */
    public final C67603e mo106589e() {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        this.f151441u = 1;
        return this;
    }

    /* renamed from: g */
    public final void mo106592g() {
        if (!C89219l.m154714a(this, C67604f.f151447a)) {
            C67605g.m119734b(this.f151420C);
        }
    }

    /* renamed from: b */
    public final C67603e mo106582b() {
        if (!C89219l.m154714a(this, C67604f.f151447a) && this.f151423c == 0) {
            this.f151423c = System.currentTimeMillis();
        }
        return this;
    }

    /* renamed from: c */
    public final C67603e mo106585c() {
        if (!C89219l.m154714a(this, C67604f.f151447a) && this.f151424d == 0) {
            this.f151424d = System.currentTimeMillis();
        }
        return this;
    }

    /* renamed from: d */
    public final C67603e mo106587d() {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        long j = this.f151423c;
        if (j == 0) {
            j = this.f151421a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f151425e = currentTimeMillis;
        this.f151432l = (int) (currentTimeMillis - j);
        return this;
    }

    /* renamed from: f */
    public final C67603e mo106591f() {
        this.f151443w = SearchUserLinearLayoutManager.f99343a;
        SearchUserLinearLayoutManager.f99343a = -1;
        return this;
    }

    public final String toString() {
        return "SearchResultShowEvent(tabType=" + this.f151427g + ", trigger=" + this.f151428h + ", displayType=" + this.f151429i + ", itemCount=" + this.f151430j + ", cost=" + this.f151431k + ", netCost=" + this.f151432l + ", netLogId=" + this.f151435o + ", status=" + this.f151436p + ", errorMsg=" + this.f151437q + ')';
    }

    /* renamed from: a */
    public final boolean mo106581a() {
        if (this.f151423c > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private C67603e m119711f(int i) {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        this.f151427g = i;
        return this;
    }

    /* renamed from: a */
    public final C67603e mo106579a(AbstractC33631g gVar) {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        this.f151426f = gVar;
        return this;
    }

    /* renamed from: b */
    public final C67603e mo106584b(String str) {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        this.f151437q = str;
        return this;
    }

    /* renamed from: c */
    public final C67603e mo106586c(int i) {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        this.f151430j = i;
        return this;
    }

    /* renamed from: d */
    public final C67603e mo106588d(int i) {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        this.f151433m = i;
        return this;
    }

    /* renamed from: a */
    public final C67603e mo106577a(long j) {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        long j2 = this.f151423c;
        if (j2 == 0) {
            j2 = this.f151421a;
        }
        this.f151425e = j;
        this.f151432l = (int) (j - j2);
        return this;
    }

    /* renamed from: e */
    public final C67603e mo106590e(int i) {
        if (this.f151439s == -1) {
            this.f151439s = i;
        } else if (this.f151440t == -1) {
            this.f151440t = i;
        }
        return this;
    }

    public C67603e(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        this.f151420C = dVar;
    }

    /* renamed from: a */
    public final C67603e mo106578a(C18087e eVar) {
        if (eVar == null || C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        this.f151445y = eVar.mo28849b();
        return this;
    }

    /* renamed from: b */
    public final C67603e mo106583b(int i) {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        this.f151436p = i;
        if (i == 0) {
            this.f151437q = null;
            this.f151438r = 0;
        } else {
            this.f151438r = 1;
        }
        return this;
    }

    /* renamed from: a */
    public final C67603e mo106576a(int i) {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        if (i == C67458j.f151134c) {
            m119711f(2);
        } else if (i == C67458j.f151135d) {
            m119711f(1);
        } else if (i == C67458j.f151136e) {
            m119711f(4);
        } else if (i == C67458j.f151138g) {
            m119711f(5);
        } else if (i == C67458j.f151133b) {
            m119711f(0);
        } else if (i == C67458j.f151139h) {
            m119711f(6);
        }
        this.f151420C.setIndex(i);
        return this;
    }

    /* renamed from: a */
    public final C67603e mo106580a(String str) {
        if (C89219l.m154714a(this, C67604f.f151447a)) {
            return this;
        }
        this.f151435o = str;
        return this;
    }
}

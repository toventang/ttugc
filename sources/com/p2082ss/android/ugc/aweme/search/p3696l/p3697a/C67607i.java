package com.p2082ss.android.ugc.aweme.search.p3696l.p3697a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.p1264a.C18087e;
import com.bytedance.lighten.p1477a.C20751h;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchUserLinearLayoutManager;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.a.i */
public final class C67607i {

    /* renamed from: a */
    public long f151457a;

    /* renamed from: b */
    public int f151458b;

    /* renamed from: c */
    public long f151459c;

    /* renamed from: d */
    public long f151460d;

    /* renamed from: e */
    public long f151461e;

    /* renamed from: f */
    public int f151462f;

    /* renamed from: g */
    public int f151463g = -1;

    /* renamed from: h */
    public AbstractC33631g f151464h;

    /* renamed from: i */
    public int f151465i;

    /* renamed from: j */
    public int f151466j;

    /* renamed from: k */
    public int f151467k = -1;

    /* renamed from: l */
    public String f151468l;

    /* renamed from: m */
    public int f151469m = -1;

    /* renamed from: n */
    public String f151470n;

    /* renamed from: o */
    public int f151471o;

    /* renamed from: p */
    public int f151472p;

    /* renamed from: q */
    public long f151473q = -1;

    /* renamed from: r */
    public C18087e f151474r;

    /* renamed from: s */
    public int f151475s;

    /* renamed from: t */
    public int f151476t = -1;

    /* renamed from: u */
    public int f151477u;

    /* renamed from: v */
    public Integer f151478v = 0;

    /* renamed from: w */
    public boolean f151479w;

    /* renamed from: x */
    public final List<Runnable> f151480x = new ArrayList();

    /* renamed from: y */
    public final C67678d f151481y;

    static {
        Covode.recordClassIndex(79246);
    }

    /* renamed from: d */
    public final C67607i mo106605d() {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151472p = 1;
        return this;
    }

    /* renamed from: e */
    public final C67607i mo106607e() {
        this.f151473q = SearchUserLinearLayoutManager.f99343a;
        SearchUserLinearLayoutManager.f99343a = -1;
        return this;
    }

    /* renamed from: b */
    public final C67607i mo106600b() {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        long j = this.f151460d;
        if (j == 0) {
            j = this.f151457a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f151461e = currentTimeMillis;
        this.f151462f = (int) (currentTimeMillis - j);
        return this;
    }

    /* renamed from: c */
    public final C67607i mo106603c() {
        if (!C89219l.m154714a(this, C67608j.f151482a) && this.f151459c == 0) {
            this.f151459c = System.currentTimeMillis();
        }
        return this;
    }

    /* renamed from: f */
    public final void mo106610f() {
        if (!C89219l.m154714a(this, C67608j.f151482a)) {
            C67606h.m119738b(this.f151481y);
        }
    }

    /* renamed from: a */
    public final C67607i mo106594a() {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        if (this.f151460d == 0) {
            this.f151460d = System.currentTimeMillis();
        }
        Context context = C20751h.f48987a;
        C89219l.m154716b(context, "");
        this.f151463g = C80422fe.m139426b(context).getValue();
        return this;
    }

    public final String toString() {
        return "SearchResultShowEventV2(tabType=" + this.f151477u + ", trigger=" + this.f151458b + ", itemCount=" + this.f151465i + ", cost=" + this.f151475s + ", netLogId=" + this.f151468l + ", status=" + this.f151469m + ", errorMsg=" + this.f151470n + ')';
    }

    /* renamed from: g */
    private C67607i m119739g(int i) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151477u = i;
        return this;
    }

    /* renamed from: a */
    public final C67607i mo106598a(AbstractC33631g gVar) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151464h = gVar;
        return this;
    }

    /* renamed from: b */
    public final C67607i mo106601b(int i) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151476t = i;
        return this;
    }

    /* renamed from: f */
    public final C67607i mo106609f(int i) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151466j = i;
        return this;
    }

    /* renamed from: a */
    public final C67607i mo106596a(long j) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        long j2 = this.f151460d;
        if (j2 == 0) {
            j2 = this.f151457a;
        }
        this.f151461e = j;
        this.f151462f = (int) (j - j2);
        return this;
    }

    /* renamed from: d */
    public final C67607i mo106606d(int i) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151471o = i;
        return this;
    }

    /* renamed from: e */
    public final C67607i mo106608e(int i) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151465i = i;
        return this;
    }

    public C67607i(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        this.f151481y = dVar;
    }

    /* renamed from: b */
    public final C67607i mo106602b(String str) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151470n = str;
        return this;
    }

    /* renamed from: c */
    public final C67607i mo106604c(int i) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151469m = i;
        if (i == 0) {
            this.f151470n = null;
            this.f151471o = 0;
        } else {
            this.f151471o = 1;
        }
        return this;
    }

    /* renamed from: a */
    public final C67607i mo106595a(int i) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        if (i == C67458j.f151134c) {
            m119739g(2);
        } else if (i == C67458j.f151135d) {
            m119739g(1);
        } else if (i == C67458j.f151136e) {
            m119739g(4);
        } else if (i == C67458j.f151138g) {
            m119739g(5);
        } else if (i == C67458j.f151133b) {
            m119739g(0);
        } else if (i == C67458j.f151139h) {
            m119739g(6);
        }
        this.f151481y.setIndex(i);
        return this;
    }

    /* renamed from: a */
    public final C67607i mo106597a(C18087e eVar) {
        if (eVar == null || C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151474r = eVar.mo28849b();
        return this;
    }

    /* renamed from: a */
    public final C67607i mo106599a(String str) {
        if (C89219l.m154714a(this, C67608j.f151482a)) {
            return this;
        }
        this.f151468l = str;
        return this;
    }
}

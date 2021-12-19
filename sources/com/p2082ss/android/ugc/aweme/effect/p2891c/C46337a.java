package com.p2082ss.android.ugc.aweme.effect.p2891c;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effect.c.a */
public final class C46337a {

    /* renamed from: a */
    public long f108010a = -1;

    /* renamed from: b */
    public long f108011b = -1;

    /* renamed from: c */
    public Map<String, Long> f108012c = new LinkedHashMap();

    /* renamed from: d */
    public Map<String, Long> f108013d = new LinkedHashMap();

    /* renamed from: e */
    public boolean f108014e;

    /* renamed from: f */
    private int f108015f;

    static {
        Covode.recordClassIndex(54914);
    }

    /* renamed from: a */
    public final long mo78828a() {
        long j = this.f108010a;
        if (j < 0) {
            return 0;
        }
        return j;
    }

    /* renamed from: a */
    public final void mo78829a(int i) {
        if (this.f108015f != i) {
            this.f108015f = i;
            this.f108010a = 0;
            this.f108011b = 0;
            this.f108012c.clear();
            this.f108013d.clear();
            mo78831a(false);
        }
    }

    /* renamed from: a */
    public final void mo78831a(boolean z) {
        this.f108014e = z;
        if (!z) {
            this.f108012c.clear();
            this.f108013d.clear();
        }
    }

    /* renamed from: a */
    public final void mo78830a(int i, int i2) {
        if (mo78828a() > 0) {
            this.f108010a = ((long) i) - mo78828a();
        }
        long j = this.f108011b;
        if (j > 0) {
            this.f108011b = ((long) i2) - j;
        }
    }
}

package com.p2082ss.android.ugc.aweme.p2426bw.p2427a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35322c;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35323d;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.bw.a.b */
public class C35321b<M extends AbstractC35322c, V extends AbstractC35323d> {

    /* renamed from: a */
    protected final String f83347a = getClass().getSimpleName();

    /* renamed from: b */
    protected M f83348b;

    /* renamed from: c */
    protected V f83349c;

    static {
        Covode.recordClassIndex(42489);
    }

    /* renamed from: b */
    public final void mo62188b() {
        M m = this.f83348b;
        if (m != null) {
            m.onDestroy();
        }
        this.f83348b = null;
        this.f83349c = null;
    }

    public C35321b(M m, V v) {
        Objects.requireNonNull(m, "Model can not null");
        Objects.requireNonNull(v, "View can not null");
        this.f83348b = m;
        this.f83349c = v;
    }
}

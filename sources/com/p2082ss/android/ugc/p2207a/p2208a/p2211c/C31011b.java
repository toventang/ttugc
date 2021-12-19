package com.p2082ss.android.ugc.p2207a.p2208a.p2211c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p2207a.p2208a.p2209a.AbstractC31005c;
import com.p2082ss.android.ugc.p2207a.p2208a.p2209a.EnumC31006d;
import com.p2082ss.android.ugc.p2207a.p2208a.p2210b.C31008a;

/* renamed from: com.ss.android.ugc.a.a.c.b */
public final class C31011b<P extends C31008a> {

    /* renamed from: a */
    public AbstractC31005c<P> f74331a;

    /* renamed from: b */
    public P f74332b;

    /* renamed from: c */
    public Bundle f74333c;

    /* renamed from: d */
    public boolean f74334d;

    static {
        Covode.recordClassIndex(37639);
    }

    /* renamed from: a */
    public final P mo56093a() {
        if (this.f74331a != null) {
            if (this.f74332b == null && this.f74333c != null) {
                this.f74332b = (P) ((C31008a) EnumC31006d.INSTANCE.getPresenter(this.f74333c.getString("presenter_id")));
            }
            if (this.f74332b == null) {
                this.f74332b = this.f74331a.mo56086a();
                EnumC31006d.INSTANCE.add(this.f74332b);
                Bundle bundle = this.f74333c;
                if (bundle != null) {
                    bundle.getBundle("presenter");
                }
            }
            this.f74333c = null;
        }
        return this.f74332b;
    }

    public C31011b(AbstractC31005c<P> cVar) {
        this.f74331a = cVar;
    }
}

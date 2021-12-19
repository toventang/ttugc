package com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.p3698a;

import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.p979a.EnumC14591d;

/* renamed from: com.ss.android.ugc.aweme.search.l.a.a.c */
public final class C67595c extends C67593a {

    /* renamed from: b */
    public C13624l.EnumC13625a f151380b;

    /* renamed from: c */
    private String f151381c;

    /* renamed from: d */
    private EnumC14591d f151382d;

    static {
        Covode.recordClassIndex(79234);
    }

    public final String toString() {
        return "SearchChainDeviceEnv(searchDomain=" + this.f151381c + ", network=" + this.f151380b + ", bandWidthQuality=" + this.f151382d + ')';
    }

    /* renamed from: a */
    public final void mo106554a(C13624l.EnumC13625a aVar) {
        if (this.f151380b == null) {
            this.f151380b = aVar;
            String str = aVar;
            if (aVar == null) {
                str = "";
            }
            mo106552a("network", str);
        }
    }

    /* renamed from: a */
    public final void mo106555a(EnumC14591d dVar) {
        if (this.f151382d == null) {
            this.f151382d = dVar;
            String str = dVar;
            if (dVar == null) {
                str = "";
            }
            mo106552a("band_width_quality", str);
        }
    }

    /* renamed from: a */
    public final void mo106556a(String str) {
        if (this.f151381c == null) {
            this.f151381c = str;
            if (str == null) {
                str = "";
            }
            mo106552a("search_domain", str);
        }
    }
}

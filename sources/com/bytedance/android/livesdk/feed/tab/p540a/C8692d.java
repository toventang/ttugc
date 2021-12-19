package com.bytedance.android.livesdk.feed.tab.p540a;

import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.C9520ag;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.tab.a.d */
public final class C8692d implements AbstractC8691c {

    /* renamed from: a */
    String[] f21439a = {"live"};

    /* renamed from: b */
    String[] f21440b;

    /* renamed from: c */
    String[] f21441c = {"live"};

    /* renamed from: d */
    String[] f21442d = {"live"};

    /* renamed from: e */
    int[] f21443e = {1};

    /* renamed from: f */
    int[] f21444f = {1};

    /* renamed from: g */
    int[] f21445g = {1};

    /* renamed from: h */
    int[] f21446h = {1};

    /* renamed from: i */
    int[] f21447i = {1001};

    /* renamed from: j */
    int[] f21448j = {0};

    /* renamed from: k */
    boolean[] f21449k = {false};

    /* renamed from: l */
    int[] f21450l = {0};

    static {
        Covode.recordClassIndex(9559);
    }

    @Override // com.bytedance.android.livesdk.feed.tab.p540a.AbstractC8691c
    /* renamed from: a */
    public final List<C9520ag> mo14975a() {
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i < this.f21439a.length; i++) {
            C9520ag agVar = new C9520ag();
            agVar.setId((long) this.f21446h[i]);
            agVar.setEvent(this.f21441c[i]);
            agVar.setName(this.f21439a[i]);
            agVar.setUrl(this.f21440b[i]);
            agVar.setShowdefault(this.f21443e[i]);
            agVar.setStyle(this.f21444f[i]);
            agVar.setType(this.f21445g[i]);
            agVar.setSource(this.f21447i[i]);
            agVar.setDislike(this.f21448j[i]);
            arrayList.add(agVar);
        }
        return arrayList;
    }

    public C8692d() {
        if (C11725f.f28051c == null) {
            C11725f.f28051c = Boolean.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline());
        }
        if (C11725f.f28051c.booleanValue()) {
            StringBuilder sb = new StringBuilder("https://");
            C5809h.m12739a();
            this.f21440b = new String[]{sb.append(C5809h.m12740c()).append("/webcast/feed/?content_type=0&style=2&channel_id=21&debug=true").toString()};
        } else {
            StringBuilder sb2 = new StringBuilder("https://");
            C5809h.m12739a();
            this.f21440b = new String[]{sb2.append(C5809h.m12740c()).append("/webcast/feed/?content_type=0&style=2&channel_id=21").toString()};
        }
        this.f21439a[0] = "Top LIVEs";
        this.f21444f[0] = 2;
    }
}

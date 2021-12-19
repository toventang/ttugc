package com.p2082ss.android.ugc.playerkit.videoview.p4328c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.session.C84230b;
import com.p2082ss.android.ugc.playerkit.session.Session;
import com.p2082ss.android.ugc.playerkit.videoview.p4327b.AbstractC84256a;
import com.p2082ss.android.ugc.playerkit.videoview.p4327b.AbstractC84258c;
import com.p2082ss.android.ugc.playerkit.videoview.p4327b.C84260e;

/* renamed from: com.ss.android.ugc.playerkit.videoview.c.a */
public final class C84262a {

    /* renamed from: a */
    public static C84262a f188441a = new C84262a();

    /* renamed from: b */
    public AbstractC84258c f188442b;

    /* renamed from: c */
    private final AbstractC84256a f188443c = new C84260e();

    static {
        Covode.recordClassIndex(98177);
    }

    private C84262a() {
    }

    /* renamed from: a */
    public final void mo129281a(String str) {
        C84230b c = mo129284c(str);
        if (c != null) {
            c.f188304a = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final AbstractC63051l mo129283b(String str) {
        AbstractC84256a aVar = this.f188443c;
        mo129284c(str);
        return aVar.mo129279a();
    }

    /* renamed from: c */
    public final C84230b mo129284c(String str) {
        MethodCollector.m26663i(4109);
        C84230b bVar = null;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(4109);
            return null;
        }
        Session b = C84229a.f188297a.mo129050b(str);
        if (b != null) {
            if (b.state == null) {
                synchronized (this) {
                    try {
                        if (b.state == null) {
                            bVar = new C84230b();
                            b.state = bVar;
                        }
                    } finally {
                        MethodCollector.m26664o(4109);
                    }
                }
            } else {
                bVar = b.state;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo129282a(String str, int i, int i2) {
        C84230b c = mo129284c(str);
        if (c != null) {
            c.f188305b = i;
            c.f188306c = i2;
        }
    }
}

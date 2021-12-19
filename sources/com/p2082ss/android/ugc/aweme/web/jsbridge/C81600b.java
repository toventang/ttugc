package com.p2082ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37838g;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.b */
public final class C81600b implements AbstractC18293d {

    /* renamed from: b */
    public static final C81601a f182483b = new C81601a((byte) 0);

    /* renamed from: a */
    public final C18288a f182484a;

    static {
        Covode.recordClassIndex(94997);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.b$a */
    public static final class C81601a {
        static {
            Covode.recordClassIndex(94998);
        }

        private C81601a() {
        }

        public /* synthetic */ C81601a(byte b) {
            this();
        }
    }

    public C81600b(C18288a aVar) {
        this.f182484a = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if (hVar != null) {
            hVar.f43676i = false;
            String str = hVar.f43670c;
            C89219l.m154716b(str, "");
            AbstractC81915c.m141874a(new C37838g(str, hVar.f43671d, hVar.f43669b, this.f182484a));
        }
    }
}

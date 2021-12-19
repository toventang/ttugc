package com.p2082ss.android.ugc.aweme.tcm.impl.p4078c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.platform.p1352b.C18822b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61549a;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61550b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61554f;
import com.p2082ss.android.ugc.aweme.notice.api.p3508a.AbstractC61534a;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61595q;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tcm.api.p4073a.AbstractC77727a;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4075a.C77736a;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.c.a */
public final class C77756a implements AbstractC61534a {

    /* renamed from: b */
    public static C77756a f174373b;

    /* renamed from: c */
    public static final C77757a f174374c = new C77757a((byte) 0);

    /* renamed from: a */
    public C61549a f174375a;

    static {
        Covode.recordClassIndex(90817);
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.c.a$a */
    public static final class C77757a {
        static {
            Covode.recordClassIndex(90818);
        }

        private C77757a() {
        }

        /* renamed from: a */
        public final synchronized C77756a mo121302a() {
            C77756a aVar;
            MethodCollector.m26663i(12532);
            if (C77756a.f174373b == null) {
                C77756a.f174373b = new C77756a();
            }
            aVar = C77756a.f174373b;
            if (aVar == null) {
                C89219l.m154715b();
            }
            MethodCollector.m26664o(12532);
            return aVar;
        }

        public /* synthetic */ C77757a(byte b) {
            this();
        }
    }

    public C77756a() {
        C61595q.f139777f.mo99331a(EnumC61554f.BC, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3508a.AbstractC61534a
    /* renamed from: a */
    public final void mo59576a(C61550b bVar) {
        String str;
        User b;
        if (bVar instanceof C61549a) {
            C61549a aVar = (C61549a) bVar;
            this.f174375a = aVar;
            if (aVar != null) {
                AbstractC77727a a = C77736a.m135835a();
                if (a == null || (b = a.mo65702b()) == null) {
                    str = null;
                } else {
                    str = b.getUid();
                }
                aVar.setUid(str);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("videoCounts", Integer.valueOf(aVar.getNewContentNum()));
            C18494b.m34415a(new C18484a("onBCVideoCountsChange", aVar.getUpdateTime(), C18822b.m34925a(linkedHashMap)));
        }
    }
}

package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3181j;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3250a.AbstractC56189c;
import java.util.List;
import java.util.Vector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.j.a */
public final class C55154a {

    /* renamed from: a */
    public static volatile boolean f126200a;

    /* renamed from: b */
    public static final List<C19538ai> f126201b = new Vector();

    /* renamed from: c */
    public static final C55154a f126202c = new C55154a();

    private C55154a() {
    }

    /* renamed from: a */
    public static boolean m100862a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(64882);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.j.a$a */
    public static final class C55155a implements AbstractC56189c {
        static {
            Covode.recordClassIndex(64883);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3250a.AbstractC56189c
        /* renamed from: a */
        public final void mo92074a() {
            C55154a.f126200a = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3250a.AbstractC56189c
        /* renamed from: a */
        public final void mo92075a(boolean z, String str) {
            C89219l.m154721d(str, "");
            if (z) {
                for (C19538ai aiVar : C55154a.f126201b) {
                    C55231t.m101001b(aiVar);
                }
            }
            C55154a.f126201b.clear();
        }
    }
}

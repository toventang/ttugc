package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.app.C33836o;
import com.p2082ss.android.ugc.aweme.net.corenet.IESNetDepend;
import com.p2082ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.p2082ss.android.ugc.aweme.p3060i.C53429a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.WSHelperImpl */
public final class WSHelperImpl implements WSHelper {
    static {
        Covode.recordClassIndex(93443);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.WSHelper
    /* renamed from: b */
    public final int mo99368b() {
        return (int) C17867d.m33084e();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.WSHelper
    /* renamed from: c */
    public final boolean mo99369c() {
        C33836o a = C33836o.m69201a();
        C89219l.m154716b(a, "");
        return a.f80094a.f121705b;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.WSHelper
    /* renamed from: a */
    public final String mo99365a() {
        return IESNetDepend.m111015g().mo37260a(C17867d.m33078a(), "frontier_urls", "");
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.WSHelper
    /* renamed from: d */
    public final String mo99370d() {
        return IESNetDepend.m111015g().mo37260a(C17867d.m33078a(), "boe_ws_host", "");
    }

    /* renamed from: e */
    public static WSHelper m138982e() {
        MethodCollector.m26663i(9450);
        Object a = C81908b.m141854a(WSHelper.class, false);
        if (a != null) {
            WSHelper wSHelper = (WSHelper) a;
            MethodCollector.m26664o(9450);
            return wSHelper;
        }
        if (C81908b.f183357eA == null) {
            synchronized (WSHelper.class) {
                try {
                    if (C81908b.f183357eA == null) {
                        C81908b.f183357eA = new WSHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9450);
                    throw th;
                }
            }
        }
        WSHelperImpl wSHelperImpl = (WSHelperImpl) C81908b.f183357eA;
        MethodCollector.m26664o(9450);
        return wSHelperImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.WSHelper
    /* renamed from: a */
    public final void mo99366a(AbstractC33485al alVar) {
        C89219l.m154721d(alVar, "");
        C53429a.m98598c().mo89996a(alVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.WSHelper
    /* renamed from: a */
    public final void mo99367a(String str) {
        C89219l.m154721d(str, "");
        IESNetDepend.m111015g().mo37261a(C17867d.m33078a(), C89041ag.m154412a(C89387v.m154943a("boe_ws_host", str)));
    }
}

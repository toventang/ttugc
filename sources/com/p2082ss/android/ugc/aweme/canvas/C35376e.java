package com.p2082ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.property.C65389cb;
import com.p2082ss.android.ugc.aweme.property.C65494q;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C70640dl;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.e */
public final class C35376e {

    /* renamed from: a */
    public static final C35376e f83458a = new C35376e();

    private C35376e() {
    }

    static {
        Covode.recordClassIndex(42547);
    }

    /* renamed from: a */
    public static C65494q m72402a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
            return C65389cb.m117086a();
        }
        if (C35386h.f83481a) {
            return C35408s.f83546b;
        }
        return new C65494q(10000, 10000);
    }

    /* renamed from: b */
    public static C89378p<Integer, Integer> m72403b() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
            if (C35416z.f83574a) {
                return C89387v.m154943a(Integer.valueOf(C70640dl.f158120a), Integer.valueOf(C70640dl.f158121b));
            }
            return C89387v.m154943a(Integer.valueOf(C70640dl.f158122c), Integer.valueOf(C70640dl.f158123d));
        } else if (C35409t.f83548a) {
            return C89387v.m154943a(Integer.valueOf(C70640dl.f158120a), Integer.valueOf(C70640dl.f158121b));
        } else {
            return C89387v.m154943a(Integer.valueOf(C70640dl.f158122c), Integer.valueOf(C70640dl.f158123d));
        }
    }
}

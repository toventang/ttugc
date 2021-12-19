package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.ds */
public final class C65436ds {

    /* renamed from: a */
    public static final C65436ds f147600a = new C65436ds();

    private C65436ds() {
    }

    static {
        Covode.recordClassIndex(76923);
    }

    /* renamed from: a */
    public static final boolean m117154a() {
        if (C16048b.m29633a().mo25421a(true, "story_lightning_slidebar_swipeclose", false)) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            if (!createIAVServiceProxybyMonsterPlugin.getStoryService().mo93870d() || C63244g.m114602a().mo73255A().mo93901a()) {
                return false;
            }
            return true;
        }
        return false;
    }
}

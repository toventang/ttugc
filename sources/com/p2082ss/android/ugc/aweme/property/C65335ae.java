package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.ae */
public final class C65335ae {

    /* renamed from: a */
    public static final C65335ae f147463a = new C65335ae();

    private C65335ae() {
    }

    static {
        Covode.recordClassIndex(76822);
    }

    /* renamed from: a */
    public static final boolean m117016a() {
        if (m117021f() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m117017b() {
        if (m117021f() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m117018c() {
        if (m117021f() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m117019d() {
        if (m117021f() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m117020e() {
        if (m117021f() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static final int m117021f() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        boolean e = createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e();
        if (C63244g.m114602a().mo73255A().mo93901a() || e) {
            return 0;
        }
        return C16048b.m29633a().mo25412a(true, "edit_page_progress_optimization", 0);
    }
}

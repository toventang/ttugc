package com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65349as;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.a */
public final class C70935a {

    /* renamed from: a */
    public static final C70935a f158826a = new C70935a();

    private C70935a() {
    }

    static {
        Covode.recordClassIndex(83429);
    }

    /* renamed from: a */
    public static final boolean m125235a() {
        if (C70942f.m125238a()) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e() || C63244g.m114602a().mo73255A().mo93901a() || !C63244g.m114602a().mo73255A().mo93903b() || C65349as.m117035a() != 1 || Build.VERSION.SDK_INT <= 20) {
                return false;
            }
            return true;
        }
        return false;
    }
}

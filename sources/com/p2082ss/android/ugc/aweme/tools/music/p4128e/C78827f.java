package com.p2082ss.android.ugc.aweme.tools.music.p4128e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.ttuploader.TTImageUploader;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.f */
public final class C78827f {

    /* renamed from: a */
    public static final C78827f f177141a = new C78827f();

    private C78827f() {
    }

    static {
        Covode.recordClassIndex(91970);
    }

    /* renamed from: a */
    public static final TTImageUploader m137594a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService().mo101687a("ttvideouploader");
        try {
            return new TTImageUploader();
        } catch (Throwable unused) {
            return null;
        }
    }
}

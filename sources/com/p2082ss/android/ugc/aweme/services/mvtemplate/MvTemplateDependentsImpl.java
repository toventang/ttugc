package com.p2082ss.android.ugc.aweme.services.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.AbstractC78928a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78929a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78934f;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78935g;

/* renamed from: com.ss.android.ugc.aweme.services.mvtemplate.MvTemplateDependentsImpl */
public final class MvTemplateDependentsImpl implements AbstractC78928a {
    private final AVAppPlayingVideoViewProxyImpl avAppPlayingVideoViewProxy = new AVAppPlayingVideoViewProxyImpl();
    private final AVVideoViewComponentFactoryImpl avVideoViewComponentFactory = new AVVideoViewComponentFactoryImpl();
    private final KeepSurfaceTextureViewFactoryImpl keepSurfaceTextureViewFactory = new KeepSurfaceTextureViewFactoryImpl();

    static {
        Covode.recordClassIndex(79911);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.AbstractC78928a
    public final AbstractC78929a getAVAppPlayingVideoViewProxy() {
        return this.avAppPlayingVideoViewProxy;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.AbstractC78928a
    public final AbstractC78934f getAVVideoViewComponentFactory() {
        return this.avVideoViewComponentFactory;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.AbstractC78928a
    public final AbstractC78935g getKeepSurfaceTextureViewFactory() {
        return this.keepSurfaceTextureViewFactory;
    }
}

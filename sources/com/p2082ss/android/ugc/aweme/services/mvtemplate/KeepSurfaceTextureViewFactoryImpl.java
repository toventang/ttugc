package com.p2082ss.android.ugc.aweme.services.mvtemplate;

import android.content.Context;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78935g;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;

/* renamed from: com.ss.android.ugc.aweme.services.mvtemplate.KeepSurfaceTextureViewFactoryImpl */
public final class KeepSurfaceTextureViewFactoryImpl implements AbstractC78935g {
    static {
        Covode.recordClassIndex(79910);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78935g
    public final TextureView create(Context context) {
        return new KeepSurfaceTextureView(context);
    }
}

package com.p2082ss.android.ugc.aweme.port.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.View$OnClickListenerC70004cq;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h;

/* renamed from: com.ss.android.ugc.aweme.port.internal.m */
public final class C63297m extends AbstractC0952i.AbstractC0954b {

    /* renamed from: a */
    private final ActivityC0945e f143672a;

    /* renamed from: b */
    private final AbstractC72630h f143673b;

    /* renamed from: c */
    private final IAVPublishService.OnPublishCallback f143674c;

    static {
        Covode.recordClassIndex(74574);
    }

    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
    public final void onFragmentDetached(AbstractC0952i iVar, Fragment fragment) {
        super.onFragmentDetached(iVar, fragment);
        if (fragment instanceof View$OnClickListenerC70004cq) {
            this.f143672a.getSupportFragmentManager().mo3554a(this);
            AbstractC72630h hVar = this.f143673b;
            if (hVar != null) {
                hVar.mo101825b((AbstractC74304x) fragment);
            }
            IAVPublishService.OnPublishCallback onPublishCallback = this.f143674c;
            if (onPublishCallback != null) {
                onPublishCallback.onStopPublish();
            }
        }
    }

    public C63297m(ActivityC0945e eVar, AbstractC72630h hVar, IAVPublishService.OnPublishCallback onPublishCallback) {
        this.f143672a = eVar;
        this.f143673b = hVar;
        this.f143674c = onPublishCallback;
    }

    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
    public final void onFragmentAttached(AbstractC0952i iVar, Fragment fragment, Context context) {
        AbstractC72630h hVar;
        super.onFragmentAttached(iVar, fragment, context);
        if ((fragment instanceof View$OnClickListenerC70004cq) && (hVar = this.f143673b) != null) {
            hVar.mo101823a((AbstractC74304x) fragment);
        }
    }

    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
    public final void onFragmentViewCreated(AbstractC0952i iVar, Fragment fragment, View view, Bundle bundle) {
        super.onFragmentViewCreated(iVar, fragment, view, bundle);
    }
}

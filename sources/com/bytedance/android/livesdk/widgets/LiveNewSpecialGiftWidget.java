package com.bytedance.android.livesdk.widgets;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.gift.C4345u;
import com.bytedance.android.livesdk.C6906bg;
import com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class LiveNewSpecialGiftWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    LiveNewSendGiftAnimationView f27424a;

    /* renamed from: b */
    C10700d f27425b;

    /* renamed from: c */
    boolean f27426c;

    /* renamed from: d */
    private AbstractC89172b<C10700d, C89391z> f27427d = new C11436a(this);

    static {
        Covode.recordClassIndex(13093);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bgr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = (LiveNewSendGiftAnimationView) findViewById(R.id.azc);
        this.f27424a = liveNewSendGiftAnimationView;
        liveNewSendGiftAnimationView.setAnimationType(LiveNewSendGiftAnimationView.EnumC10674a.Special);
        this.f27424a.setVisibility(8);
        if (this.dataChannel != null) {
            this.dataChannel.mo28315b(C4345u.class, (Object) false);
        }
        this.f27424a.setOnClickListener(new View$OnClickListenerC11437b(this));
        if (this.dataChannel != null) {
            this.dataChannel.mo28309a((AbstractC1204m) this, C6906bg.class, (AbstractC89172b) this.f27427d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo18273a(C10700d dVar) {
        this.f27425b = dVar;
        this.f27424a.setVisibility(0);
        this.dataChannel.mo28315b(C4345u.class, (Object) true);
        if (!this.f27426c) {
            this.f27426c = true;
            this.f27424a.mo17591a(new RunnableC11439d(this));
        }
        return C89391z.f203057a;
    }
}

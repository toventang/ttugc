package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.C3010ab;
import com.bytedance.android.live.broadcast.model.C3269m;
import com.bytedance.android.live.broadcast.preview.p200a.C3367a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewSeeMoreDetailWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    public boolean f9975a;

    /* renamed from: b */
    public boolean f9976b;

    static {
        Covode.recordClassIndex(4110);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgm;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (!(view instanceof LiveButton)) {
            view = null;
        }
        LiveButton liveButton = (LiveButton) view;
        if (liveButton != null) {
            liveButton.setOnClickListener(new View$OnClickListenerC3607a(this));
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28314b(C3010ab.class, (AbstractC89172b) new C3608b(this, liveButton));
            }
        }
    }

    /* renamed from: a */
    public final void mo8897a(boolean z) {
        super.show();
        this.f9975a = z;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSeeMoreDetailWidget$b */
    static final class C3608b extends AbstractC89220m implements AbstractC89172b<C3269m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewSeeMoreDetailWidget f9978a;

        /* renamed from: b */
        final /* synthetic */ LiveButton f9979b;

        static {
            Covode.recordClassIndex(4112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3608b(PreviewSeeMoreDetailWidget previewSeeMoreDetailWidget, LiveButton liveButton) {
            super(1);
            this.f9978a = previewSeeMoreDetailWidget;
            this.f9979b = liveButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3269m mVar) {
            C89219l.m154721d(mVar, "");
            this.f9979b.setEnabled(true);
            this.f9979b.mo9603b(R.style.sl);
            this.f9978a.f9976b = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSeeMoreDetailWidget$a */
    static final class View$OnClickListenerC3607a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewSeeMoreDetailWidget f9977a;

        static {
            Covode.recordClassIndex(4111);
        }

        View$OnClickListenerC3607a(PreviewSeeMoreDetailWidget previewSeeMoreDetailWidget) {
            this.f9977a = previewSeeMoreDetailWidget;
        }

        public final void onClick(View view) {
            String str;
            if (!this.f9977a.f9976b) {
                if (this.f9977a.f9975a) {
                    str = "1";
                } else {
                    str = "0";
                }
                C6501b.C6502a.m13948a("livesdk_live_studio_detail_click").mo12651a("anchor_id", C3367a.m8811a()).mo12651a("from_message", str).mo12655b();
                AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
                Context context = this.f9977a.getContext();
                AbstractC6956d.C6957a b = AbstractC6963e.m14872b("https://www.tiktok.com/studio/download");
                b.f17378b = C3966y.m9657a((int) R.string.e_y);
                b.f17385i = false;
                webViewManager.mo13248a(context, b);
            }
        }
    }
}

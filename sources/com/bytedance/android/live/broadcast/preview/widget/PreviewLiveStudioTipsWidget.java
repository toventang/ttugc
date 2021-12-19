package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.preview.p200a.C3367a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9078cq;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewLiveStudioTipsWidget extends LiveWidget implements AbstractC33974au {
    static {
        Covode.recordClassIndex(4105);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC3606a(this));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        String str;
        EnumC11728i iVar;
        super.show();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (iVar = (EnumC11728i) dataChannel.mo28318b(C3802x.class)) == null) {
            str = "";
        } else {
            str = C11729j.m20684a(iVar);
        }
        C89219l.m154721d(str, "");
        C6501b.C6502a.m13948a("livesdk_live_studio_available_show").mo12651a("anchor_id", C3367a.m8811a()).mo12644a(str).mo12655b();
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveStudioTipsWidget$a */
    static final class View$OnClickListenerC3606a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewLiveStudioTipsWidget f9968a;

        static {
            Covode.recordClassIndex(4106);
        }

        View$OnClickListenerC3606a(PreviewLiveStudioTipsWidget previewLiveStudioTipsWidget) {
            this.f9968a = previewLiveStudioTipsWidget;
        }

        public final void onClick(View view) {
            DataChannel dataChannel = this.f9968a.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28319c(C9078cq.class);
            }
        }
    }
}

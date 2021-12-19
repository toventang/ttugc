package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.preview.C3522m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewReplayWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    private C3522m f9970a;

    static {
        Covode.recordClassIndex(4108);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b8s;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: a */
    public final void mo8895a() {
        C3522m mVar = this.f9970a;
        if (mVar != null) {
            mVar.mo8809b();
        }
    }

    /* renamed from: b */
    public final void mo8896b() {
        C3522m mVar = this.f9970a;
        if (mVar != null) {
            mVar.mo8808a();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        Context context = this.context;
        View view = getView();
        if (view != null) {
            C89219l.m154716b(view, "");
            DataChannel dataChannel = this.dataChannel;
            C89219l.m154716b(dataChannel, "");
            this.f9970a = new C3522m(context, view, dataChannel);
        }
    }
}

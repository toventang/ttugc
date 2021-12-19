package com.bytedance.android.live.broadcast.widget;

import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.stream.capture.AbstractC3697f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;

public class CaptureWidget2 extends AbsCaptureWidget implements AbstractC33974au {

    /* renamed from: c */
    AbstractC3697f f10369c;

    /* renamed from: d */
    SurfaceView f10370d;

    static {
        Covode.recordClassIndex(4271);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.ben;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget
    public void onDestroy() {
        super.onDestroy();
        this.f10369c = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget
    public void onCreate() {
        super.onCreate();
        this.f10370d = (SurfaceView) getView();
    }

    CaptureWidget2(AbstractC3697f fVar, AbstractC3055a aVar) {
        super(aVar);
        this.f10369c = fVar;
    }
}

package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.C3249k;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewChangeOrientationWidget extends PreviewToolBaseWidget implements AbstractC33974au {

    /* renamed from: a */
    private boolean f9923a;

    /* renamed from: b */
    private final int f9924b;

    /* renamed from: c */
    private final int f9925c;

    static {
        Covode.recordClassIndex(4076);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final int mo8870a() {
        return this.f9924b;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: b */
    public final int mo8872b() {
        return this.f9925c;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        m9006c();
    }

    public PreviewChangeOrientationWidget() {
        boolean z;
        C6805b<Boolean> bVar = AbstractC6804a.f17045cs;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        if (a != null) {
            z = a.booleanValue();
        } else {
            z = false;
        }
        this.f9923a = z;
        this.f9924b = R.string.eic;
        this.f9925c = 2131234598;
    }

    /* renamed from: c */
    private final void m9006c() {
        LiveTextView liveTextView;
        ImageView imageView;
        LiveTextView liveTextView2;
        ImageView imageView2;
        if (this.f9923a) {
            View view = getView();
            if (!(view == null || (imageView2 = (ImageView) view.findViewById(R.id.fis)) == null)) {
                imageView2.setImageResource(2131234073);
            }
            View view2 = getView();
            if (!(view2 == null || (liveTextView2 = (LiveTextView) view2.findViewById(R.id.fiu)) == null)) {
                liveTextView2.setText(R.string.eid);
            }
        } else {
            View view3 = getView();
            if (!(view3 == null || (imageView = (ImageView) view3.findViewById(R.id.fis)) == null)) {
                imageView.setImageResource(2131234074);
            }
            View view4 = getView();
            if (!(view4 == null || (liveTextView = (LiveTextView) view4.findViewById(R.id.fiu)) == null)) {
                liveTextView.setText(R.string.eif);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28315b(C3249k.class, Boolean.valueOf(this.f9923a));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final void mo8871a(View view) {
        int i;
        C89219l.m154721d(view, "");
        this.f9923a = !this.f9923a;
        C6805b<Boolean> bVar = AbstractC6804a.f17045cs;
        C89219l.m154716b(bVar, "");
        C6806c.m14603a(bVar, Boolean.valueOf(this.f9923a));
        m9006c();
        if (this.f9923a) {
            i = R.string.eie;
        } else {
            i = R.string.eig;
        }
        C11226ao.m19882a(C3966y.m9669e(), i);
    }
}

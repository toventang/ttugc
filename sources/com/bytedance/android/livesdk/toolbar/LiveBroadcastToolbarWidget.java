package com.bytedance.android.livesdk.toolbar;

import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p385p.EnumC5852o;
import com.bytedance.android.live.p385p.EnumC5854q;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveBroadcastToolbarWidget extends LiveToolbarWidget implements AbstractC33974au {

    /* renamed from: c */
    private List<? extends EnumC5847l> f26171c = new ArrayList();

    static {
        Covode.recordClassIndex(12498);
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bej;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget
    /* renamed from: a */
    public final LinearLayout mo17761a() {
        View view = getView();
        if (view != null) {
            return (LinearLayout) view.findViewById(R.id.c6);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget
    /* renamed from: b */
    public final void mo17762b() {
        LinearLayout linearLayout;
        super.mo17762b();
        EnumC5852o oVar = EnumC5852o.LEFT;
        DataChannel dataChannel = this.dataChannel;
        View view = getView();
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.c_)) != null) {
            List<? extends EnumC5847l> list = this.f26171c;
            EnumC5854q qVar = this.f26175b;
            C89219l.m154716b(qVar, "");
            oVar.createHolder(dataChannel, linearLayout, list, qVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget
    /* renamed from: c */
    public final void mo17763c() {
        View findViewById;
        View findViewById2;
        View view = getView();
        if (!(view == null || (findViewById2 = view.findViewById(R.id.c_)) == null)) {
            findViewById2.setPadding(C3966y.m9653a(8.0f), 0, 0, 0);
        }
        View view2 = getView();
        if (view2 != null && (findViewById = view2.findViewById(R.id.c6)) != null) {
            findViewById.setPadding(C3966y.m9653a(8.0f), 0, C3966y.m9653a(8.0f), 0);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        super.onInit(objArr);
        if (objArr != null && objArr.length > 1) {
            Object obj = objArr[1];
            if (!(obj instanceof List)) {
                obj = null;
            }
            List<? extends EnumC5847l> list = (List) obj;
            if (list != null) {
                this.f26171c = list;
            }
        }
    }
}

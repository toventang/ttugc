package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.model.C3253a;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewFollowerWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    boolean f9939a;

    static {
        Covode.recordClassIndex(4090);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgi;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        if (this.f9939a) {
            super.show();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28313b((AbstractC1204m) this, C9094df.class, (AbstractC89172b) new C3595a(this));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewFollowerWidget$a */
    static final class C3595a extends AbstractC89220m implements AbstractC89172b<C3272o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewFollowerWidget f9940a;

        static {
            Covode.recordClassIndex(4091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3595a(PreviewFollowerWidget previewFollowerWidget) {
            super(1);
            this.f9940a = previewFollowerWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3272o oVar) {
            String str;
            Integer valueOf;
            LiveTextView liveTextView;
            C3272o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            PreviewFollowerWidget previewFollowerWidget = this.f9940a;
            C3253a aVar = oVar2.f9375j;
            if (aVar == null || aVar.f9308a <= 0) {
                previewFollowerWidget.f9939a = false;
                previewFollowerWidget.hide();
                C6501b a = C6501b.C6502a.m13948a("livesdk_live_takepage_fans_show_fail").mo12643a(previewFollowerWidget.dataChannel);
                if (!(aVar == null || (valueOf = Integer.valueOf(aVar.f9309b)) == null)) {
                    if (valueOf.intValue() == 1) {
                        str = "zero_online";
                    } else if (valueOf.intValue() == 2) {
                        str = "lower_than_10_percent";
                    } else if (valueOf.intValue() == 3) {
                        str = "lower_than_10";
                    } else if (valueOf.intValue() == 4) {
                        str = "in_control_group";
                    } else if (valueOf.intValue() == 6) {
                        str = "l1_anchor";
                    }
                    a.mo12651a("fail_reason", str).mo12655b();
                }
                str = "tech_fail";
                a.mo12651a("fail_reason", str).mo12655b();
            } else {
                previewFollowerWidget.f9939a = true;
                previewFollowerWidget.show();
                View view = previewFollowerWidget.getView();
                if (!(view == null || (liveTextView = (LiveTextView) view.findViewById(R.id.cr)) == null)) {
                    liveTextView.setShadowLayer((float) C3966y.m9653a(1.0f), 0.0f, (float) C3966y.m9653a(1.0f), C0643b.m2378c(liveTextView.getContext(), R.color.va));
                    Context context = liveTextView.getContext();
                    C89219l.m154716b(context, "");
                    liveTextView.setText(context.getResources().getQuantityString(R.plurals.g2, aVar.f9308a, C11266h.m19966a(aVar.f9308a)));
                }
                C6501b.C6502a.m13948a("livesdk_live_takepage_active_fans_show").mo12643a(previewFollowerWidget.dataChannel).mo12645a("show_active_fans_num", aVar.f9308a).mo12655b();
            }
            return C89391z.f203057a;
        }
    }
}

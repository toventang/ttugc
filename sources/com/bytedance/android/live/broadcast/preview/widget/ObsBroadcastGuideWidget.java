package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.C3010ab;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class ObsBroadcastGuideWidget extends LiveWidget implements AbstractC33974au {
    static {
        Covode.recordClassIndex(4064);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bga;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28313b((AbstractC1204m) this, C3802x.class, (AbstractC89172b) new C3577a(this));
        }
        if (LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue() == 2) {
            ((ImageView) findViewById(R.id.dte)).setImageResource(R.drawable.c9n);
            View findViewById = findViewById(R.id.dtc);
            C89219l.m154716b(findViewById, "");
            ((LiveTextView) findViewById).setText(C3966y.m9657a((int) R.string.e88));
            View findViewById2 = findViewById(R.id.dtd);
            C89219l.m154716b(findViewById2, "");
            ((LiveTextView) findViewById2).setText(C3966y.m9657a((int) R.string.e87));
            View findViewById3 = findViewById(R.id.ehc);
            C89219l.m154716b(findViewById3, "");
            ((LiveTextView) findViewById3).setText(C3966y.m9657a((int) R.string.e8e));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.ObsBroadcastGuideWidget$a */
    static final class C3577a extends AbstractC89220m implements AbstractC89172b<EnumC11728i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ObsBroadcastGuideWidget f9905a;

        static {
            Covode.recordClassIndex(4065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3577a(ObsBroadcastGuideWidget obsBroadcastGuideWidget) {
            super(1);
            this.f9905a = obsBroadcastGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC11728i iVar) {
            DataChannel dataChannel;
            C89219l.m154721d(iVar, "");
            if (iVar == EnumC11728i.THIRD_PARTY && ((dataChannel = this.f9905a.dataChannel) == null || dataChannel.mo28318b(C3010ab.class) == null)) {
                this.f9905a.show();
            } else {
                this.f9905a.hide();
            }
            return C89391z.f203057a;
        }
    }
}

package com.bytedance.android.live.publicscreen.impl.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.p561j.C9111dw;
import com.bytedance.android.livesdk.p561j.C9113dy;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

public final class PortraitPublicScreenWidget extends PublicScreenWidget implements AbstractC33974au {
    static {
        Covode.recordClassIndex(6658);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: e */
    public final boolean mo11850e() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    /* renamed from: i */
    public final void mo11911i() {
        super.mo11911i();
        this.f15136d.setHasFixedSize(true);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget$c */
    static final class RunnableC6045c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PortraitPublicScreenWidget f15132a;

        static {
            Covode.recordClassIndex(6661);
        }

        RunnableC6045c(PortraitPublicScreenWidget portraitPublicScreenWidget) {
            this.f15132a = portraitPublicScreenWidget;
        }

        public final void run() {
            View view;
            ViewGroup.LayoutParams layoutParams;
            if (this.f15132a.isViewValid && (view = this.f15132a.getView()) != null && (layoutParams = view.getLayoutParams()) != null) {
                PortraitPublicScreenWidget.m13250a("init", "height: " + layoutParams.height + ", width: " + layoutParams.width);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget$a */
    static final class C6043a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PortraitPublicScreenWidget f15130a;

        static {
            Covode.recordClassIndex(6659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6043a(PortraitPublicScreenWidget portraitPublicScreenWidget) {
            super(1);
            this.f15130a = portraitPublicScreenWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f15130a.mo11925f(num.intValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget$b */
    static final class C6044b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PortraitPublicScreenWidget f15131a;

        static {
            Covode.recordClassIndex(6660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6044b(PortraitPublicScreenWidget portraitPublicScreenWidget) {
            super(1);
            this.f15131a = portraitPublicScreenWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            PortraitPublicScreenWidget portraitPublicScreenWidget = this.f15131a;
            if (portraitPublicScreenWidget.getView() != null) {
                ((ViewGroup.MarginLayoutParams) portraitPublicScreenWidget.getView().getLayoutParams()).topMargin = intValue;
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28313b((AbstractC1204m) this, C9111dw.class, (AbstractC89172b) new C6043a(this)).mo28313b((AbstractC1204m) this, C9113dy.class, (AbstractC89172b) new C6044b(this));
        }
        View view = getView();
        if (view != null) {
            view.post(new RunnableC6045c(this));
        }
    }
}

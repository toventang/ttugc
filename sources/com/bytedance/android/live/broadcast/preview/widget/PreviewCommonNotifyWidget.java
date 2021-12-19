package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.C3014af;
import com.bytedance.android.live.broadcast.C3228f;
import com.bytedance.android.live.broadcast.model.C3267k;
import com.bytedance.android.live.broadcast.model.EnumC3268l;
import com.bytedance.android.live.broadcast.view.C3751a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewCommonNotifyWidget extends LiveWidget implements AbstractC33974au {
    static {
        Covode.recordClassIndex(4079);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgf;
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
            dataChannel.mo28314b(C3228f.class, (AbstractC89172b) new C3587a(this)).mo28310a(C3014af.class, (AbstractC89172b) new C3588b(this));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewCommonNotifyWidget$b */
    static final class C3588b extends AbstractC89220m implements AbstractC89172b<EnumC3268l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommonNotifyWidget f9929a;

        static {
            Covode.recordClassIndex(4081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3588b(PreviewCommonNotifyWidget previewCommonNotifyWidget) {
            super(1);
            this.f9929a = previewCommonNotifyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC3268l lVar) {
            MethodCollector.m26663i(8316);
            EnumC3268l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            PreviewCommonNotifyWidget previewCommonNotifyWidget = this.f9929a;
            View a = previewCommonNotifyWidget.mo8880a(lVar2);
            if (a != null) {
                a.startAnimation(AnimationUtils.loadAnimation(previewCommonNotifyWidget.context, R.anim.eb));
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(8316);
            return zVar;
        }
    }

    /* renamed from: a */
    public final View mo8880a(EnumC3268l lVar) {
        View view = getView();
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C3751a) && ((C3751a) childAt).getTag() == lVar) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewCommonNotifyWidget$a */
    static final class C3587a extends AbstractC89220m implements AbstractC89172b<C3267k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewCommonNotifyWidget f9928a;

        static {
            Covode.recordClassIndex(4080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3587a(PreviewCommonNotifyWidget previewCommonNotifyWidget) {
            super(1);
            this.f9928a = previewCommonNotifyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3267k kVar) {
            MethodCollector.m26663i(8465);
            C3267k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            if (kVar2.f9353a == 0) {
                this.f9928a.show();
                if (this.f9928a.mo8880a(kVar2.f9354b) == null) {
                    View view = this.f9928a.getView();
                    if (!(view instanceof ViewGroup)) {
                        view = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (viewGroup != null) {
                        Context context = this.f9928a.getContext();
                        C89219l.m154716b(context, "");
                        C3751a aVar = new C3751a(context, (byte) 0);
                        aVar.setTag(kVar2.f9354b);
                        aVar.setArrowVisibility(kVar2.f9356d);
                        aVar.setNotifyText(kVar2.f9355c);
                        viewGroup.addView(aVar);
                    }
                }
            } else {
                C11279p.m20006a(this.f9928a.mo8880a(kVar2.f9354b));
                View view2 = this.f9928a.getView();
                if (view2 == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    MethodCollector.m26664o(8465);
                    throw nullPointerException;
                } else if (((ViewGroup) view2).getChildCount() == 0) {
                    this.f9928a.hide();
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(8465);
            return zVar;
        }
    }
}

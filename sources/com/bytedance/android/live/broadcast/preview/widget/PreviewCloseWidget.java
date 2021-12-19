package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3903ac;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewCloseWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    public final AbstractC89171a<AbstractC11683e> f9926a;

    static {
        Covode.recordClassIndex(4077);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bge;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ViewGroup.LayoutParams layoutParams;
        super.onCreate();
        View view = getView();
        if (view != null) {
            View view2 = getView();
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin += C3903ac.m9533a(this.context);
            view.setLayoutParams(marginLayoutParams);
        }
        View view3 = getView();
        if (view3 != null) {
            view3.setOnClickListener(new View$OnClickListenerC3586a(this));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewCloseWidget$a */
    static final class View$OnClickListenerC3586a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewCloseWidget f9927a;

        static {
            Covode.recordClassIndex(4078);
        }

        View$OnClickListenerC3586a(PreviewCloseWidget previewCloseWidget) {
            this.f9927a = previewCloseWidget;
        }

        public final void onClick(View view) {
            AbstractC11683e invoke = this.f9927a.f9926a.invoke();
            if (invoke != null) {
                invoke.mo8847a();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewCloseWidget(AbstractC89171a<? extends AbstractC11683e> aVar) {
        C89219l.m154721d(aVar, "");
        this.f9926a = aVar;
    }
}

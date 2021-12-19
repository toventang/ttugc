package com.bytedance.android.live.broadcast.preview.widget.base;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

public abstract class PreviewToolBaseWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget$b */
    public final /* synthetic */ class View$OnClickListenerC3649b implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f10069a;

        static {
            Covode.recordClassIndex(4161);
        }

        public View$OnClickListenerC3649b(AbstractC89172b bVar) {
            this.f10069a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            C89219l.m154716b(this.f10069a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(4159);
    }

    /* renamed from: a */
    public abstract int mo8870a();

    /* renamed from: a */
    public abstract void mo8871a(View view);

    /* renamed from: b */
    public abstract int mo8872b();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgo;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: d */
    public final void mo8933d() {
        View view;
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.fit);
        } else {
            view = null;
        }
        C11279p.m20017b(view);
    }

    /* renamed from: e */
    public final void mo8934e() {
        View view;
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.fit);
        } else {
            view = null;
        }
        C11279p.m20006a(view);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        View view = getView();
        if (view != null) {
            ((ImageView) view.findViewById(R.id.fis)).setImageResource(mo8872b());
            LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.fiu);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setText(C3966y.m9657a(mo8870a()));
            view.setOnClickListener(new View$OnClickListenerC3649b(new C3648a(this)));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget$a */
    static final /* synthetic */ class C3648a extends C89217j implements AbstractC89172b<View, C89391z> {
        static {
            Covode.recordClassIndex(4160);
        }

        C3648a(PreviewToolBaseWidget previewToolBaseWidget) {
            super(1, previewToolBaseWidget, PreviewToolBaseWidget.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            ((PreviewToolBaseWidget) this.receiver).mo8871a(view2);
            return C89391z.f203057a;
        }
    }
}

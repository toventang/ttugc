package com.p2082ss.android.ugc.asve.recorder.reaction.p2225a;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.b */
public final class C31223b {

    /* renamed from: a */
    private final AbstractC89244h f74831a;

    static {
        Covode.recordClassIndex(37869);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo56867a() {
        return (View) this.f74831a.getValue();
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.b$a */
    static final class C31224a extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31218a f74832a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f74833b;

        /* renamed from: c */
        final /* synthetic */ View f74834c;

        static {
            Covode.recordClassIndex(37870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31224a(AbstractC31218a aVar, ViewGroup viewGroup, View view) {
            super(0);
            this.f74832a = aVar;
            this.f74833b = viewGroup;
            this.f74834c = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            MethodCollector.m26663i(7639);
            int[] b = this.f74832a.mo56854b();
            if (b == null) {
                MethodCollector.m26664o(7639);
                return null;
            }
            View view = new View(this.f74833b.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = this.f74834c.getTop() + b[0];
            layoutParams.height = (this.f74834c.getHeight() - b[0]) - b[1];
            layoutParams.leftMargin = this.f74834c.getLeft() + b[2];
            layoutParams.width = (this.f74834c.getWidth() - b[2]) - b[3];
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            layoutParams.gravity = 0;
            view.setBackgroundResource(this.f74832a.mo56850a().mo56218g());
            this.f74833b.addView(view, layoutParams);
            MethodCollector.m26664o(7639);
            return view;
        }
    }

    public C31223b(ViewGroup viewGroup, View view, AbstractC31218a aVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f74831a = C89250i.m154773a((AbstractC89171a) new C31224a(aVar, viewGroup, view));
    }
}

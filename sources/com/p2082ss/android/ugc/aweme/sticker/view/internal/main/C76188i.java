package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76148d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.i */
public final class C76188i implements AbstractC76148d {

    /* renamed from: a */
    private final View f171155a;

    /* renamed from: b */
    private final View f171156b;

    /* renamed from: c */
    private final FrameLayout f171157c;

    static {
        Covode.recordClassIndex(89138);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.i$a */
    static final class View$OnClickListenerC76189a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f171158a;

        static {
            Covode.recordClassIndex(89139);
        }

        View$OnClickListenerC76189a(AbstractC89171a aVar) {
            this.f171158a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f171158a.invoke();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76148d
    /* renamed from: a */
    public final void mo119903a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f171156b.setOnClickListener(new View$OnClickListenerC76189a(aVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76148d
    /* renamed from: a */
    public final void mo119904a(boolean z) {
        int i;
        int i2;
        int childCount = this.f171157c.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f171157c.getChildAt(i3);
            if (childAt == this.f171155a) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                childAt.setVisibility(i2);
            } else {
                C89219l.m154716b(childAt, "");
                if (!z) {
                    i = 0;
                } else {
                    i = 4;
                }
                childAt.setVisibility(i);
            }
        }
    }

    public C76188i(FrameLayout frameLayout, AbstractC89172b<? super ViewGroup, ? extends C89378p<? extends View, ? extends View>> bVar) {
        C89378p pVar;
        C89219l.m154721d(frameLayout, "");
        MethodCollector.m26663i(6040);
        this.f171157c = frameLayout;
        if (bVar == null || (pVar = (C89378p) bVar.invoke(frameLayout)) == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(frameLayout.getContext());
            appCompatTextView.setText(R.string.bop);
            appCompatTextView.setTextColor(-1);
            appCompatTextView.setGravity(17);
            pVar = C89387v.m154943a(appCompatTextView, appCompatTextView);
        }
        frameLayout.addView((View) pVar.getFirst(), -1, -1);
        this.f171155a = (View) pVar.component1();
        this.f171156b = (View) pVar.component2();
        MethodCollector.m26664o(6040);
    }
}

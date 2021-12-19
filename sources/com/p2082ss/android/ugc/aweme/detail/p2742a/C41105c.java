package com.p2082ss.android.ugc.aweme.detail.p2742a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41241j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.a.c */
public final class C41105c implements AbstractC41241j {

    /* renamed from: a */
    public final View f96094a;

    /* renamed from: b */
    public final Context f96095b;

    /* renamed from: c */
    public final ViewGroup f96096c;

    static {
        Covode.recordClassIndex(48980);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41241j
    /* renamed from: b */
    public final void mo70362b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f96094a.clearAnimation();
        this.f96094a.setVisibility(8);
        aVar.invoke();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41241j
    /* renamed from: a */
    public final void mo70361a(AbstractC89171a<C89391z> aVar) {
        MethodCollector.m26663i(6673);
        C89219l.m154721d(aVar, "");
        this.f96094a.setVisibility(0);
        if (this.f96094a.getAnimation() == null) {
            this.f96094a.startAnimation(AnimationUtils.loadAnimation(this.f96095b, R.anim.b9));
        }
        aVar.invoke();
        MethodCollector.m26664o(6673);
    }

    public C41105c(Context context, ViewGroup viewGroup) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        this.f96095b = context;
        this.f96096c = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.e6v);
        C89219l.m154716b(findViewById, "");
        this.f96094a = findViewById;
        viewGroup.setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.p2082ss.android.ugc.aweme.detail.p2742a.C41105c.View$OnTouchListenerC411061 */

            /* renamed from: a */
            final /* synthetic */ C41105c f96097a;

            static {
                Covode.recordClassIndex(48981);
            }

            {
                this.f96097a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                MethodCollector.m26663i(6257);
                C89219l.m154716b(motionEvent, "");
                int action = motionEvent.getAction();
                if (action == 0) {
                    C41105c cVar = this.f96097a;
                    cVar.mo70362b(AbstractC41241j.C41242a.C41244b.f96354a);
                    cVar.f96096c.startAnimation(AnimationUtils.loadAnimation(cVar.f96095b, R.anim.b8));
                } else if (action == 1) {
                    C41105c cVar2 = this.f96097a;
                    cVar2.mo70361a(AbstractC41241j.C41242a.C41243a.f96353a);
                    cVar2.f96096c.clearAnimation();
                }
                MethodCollector.m26664o(6257);
                return false;
            }
        });
    }
}

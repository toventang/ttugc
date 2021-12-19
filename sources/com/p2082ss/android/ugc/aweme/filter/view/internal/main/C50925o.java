package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.EnumC50699g;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.o */
public final class C50925o extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final ImageView f117509a;

    /* renamed from: b */
    public final C85035a f117510b;

    /* renamed from: c */
    ObjectAnimator f117511c;

    /* renamed from: d */
    public FilterBean f117512d;

    /* renamed from: e */
    public EnumC50699g f117513e = EnumC50699g.FILTER_STATE_UNKNOWN;

    /* renamed from: f */
    public final AbstractC89183m<FilterBean, EnumC50699g, C89391z> f117514f;

    static {
        Covode.recordClassIndex(60100);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86279a() {
        ObjectAnimator objectAnimator = this.f117511c;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.f117509a;
        C89219l.m154716b(imageView, "");
        imageView.setRotation(0.0f);
        this.f117509a.setImageResource(2131230945);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.filter.FilterBean, ? super com.ss.android.ugc.aweme.filter.repository.a.g, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50925o(View view, AbstractC89183m<? super FilterBean, ? super EnumC50699g, C89391z> mVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(mVar, "");
        this.f117514f = mVar;
        this.f117509a = (ImageView) view.findViewById(R.id.bv8);
        this.f117510b = (C85035a) view.findViewById(R.id.br3);
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50925o.View$OnClickListenerC509261 */

            /* renamed from: a */
            final /* synthetic */ C50925o f117515a;

            static {
                Covode.recordClassIndex(60101);
            }

            {
                this.f117515a = r1;
            }

            public final void onClick(View view) {
                FilterBean filterBean;
                ClickAgent.onClick(view);
                if (this.f117515a.getAdapterPosition() != -1 && (filterBean = this.f117515a.f117512d) != null) {
                    this.f117515a.f117510b.mo122007a(false);
                    this.f117515a.f117514f.invoke(filterBean, this.f117515a.f117513e);
                }
            }
        });
    }
}

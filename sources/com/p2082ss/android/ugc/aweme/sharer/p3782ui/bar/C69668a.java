package com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69576b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a */
public final class C69668a extends RecyclerView.AbstractC1350a<C69669a> {

    /* renamed from: c */
    public static final C69670b f155524c = new C69670b((byte) 0);

    /* renamed from: a */
    public List<? extends AbstractC69693h> f155525a = C89086z.INSTANCE;

    /* renamed from: b */
    public final AbstractC69675c f155526b;

    static {
        Covode.recordClassIndex(82044);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C69669a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m123068a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a$b */
    public static final class C69670b {
        static {
            Covode.recordClassIndex(82046);
        }

        private C69670b() {
        }

        public /* synthetic */ C69670b(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f155525a.size();
    }

    public C69668a(AbstractC69675c cVar) {
        C89219l.m154721d(cVar, "");
        this.f155526b = cVar;
    }

    /* renamed from: a */
    public final void mo109819a(List<? extends AbstractC69693h> list) {
        C89219l.m154721d(list, "");
        this.f155525a = list;
        notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a$c */
    static final class View$OnClickListenerC69671c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C69668a f155530a;

        /* renamed from: b */
        final /* synthetic */ int f155531b;

        static {
            Covode.recordClassIndex(82047);
        }

        View$OnClickListenerC69671c(C69668a aVar, int i) {
            this.f155530a = aVar;
            this.f155531b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C69576b.m122788a(view, 1200)) {
                this.f155530a.f155526b.mo109614a((AbstractC69693h) this.f155530a.f155525a.get(this.f155531b));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewDetachedFromWindow(C69669a aVar) {
        C69669a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        Animation animation = aVar2.f155527a.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        super.onViewDetachedFromWindow(aVar2);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a$a */
    public static final class C69669a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ImageView f155527a;

        /* renamed from: b */
        public final TextView f155528b;

        /* renamed from: c */
        public final View f155529c;

        static {
            Covode.recordClassIndex(82045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69669a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.dx8);
            C89219l.m154716b(findViewById, "");
            this.f155527a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.dx_);
            C89219l.m154716b(findViewById2, "");
            this.f155528b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.dx9);
            C89219l.m154716b(findViewById3, "");
            this.f155529c = findViewById3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a$e */
    static final class C69673e extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f155533a;

        static {
            Covode.recordClassIndex(82049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69673e(int i) {
            super(1);
            this.f155533a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f155533a;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewAttachedToWindow(C69669a aVar) {
        C69669a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        super.onViewAttachedToWindow(aVar2);
        int adapterPosition = aVar2.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < getItemCount()) {
            ((AbstractC69693h) this.f155525a.get(adapterPosition)).mo61916a(aVar2.f155527a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a$d */
    static final class C69672d extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C69672d f155532a = new C69672d();

        static {
            Covode.recordClassIndex(82048);
        }

        C69672d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.h);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 23.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54469h = C89241a.m154730a(TypedValue.applyDimension(1, 46.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            eVar2.f54468g = C89241a.m154730a(TypedValue.applyDimension(1, 46.0f, system3.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m123068a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(4469);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ah6, viewGroup, false);
        C89219l.m154716b(a2, "");
        C69669a aVar = new C69669a(a2);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(4469);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C69669a aVar, int i) {
        Drawable drawable;
        float f;
        C69669a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        Context context = aVar2.f155527a.getContext();
        AbstractC69693h hVar = (AbstractC69693h) this.f155525a.get(i);
        int i2 = 0;
        if (C89064i.m154489a(C69674b.f155534a, hVar.mo61919c())) {
            int co_ = hVar.co_();
            C89219l.m154716b(context, "");
            drawable = new LayerDrawable(new Drawable[]{C23005c.m43393a(new C69673e(co_)).mo37368a(context), C23009f.m43397a(C69672d.f155532a).mo37389a(context)});
        } else {
            C89219l.m154716b(context, "");
            drawable = context.getResources().getDrawable(hVar.co_());
        }
        aVar2.f155527a.setImageDrawable(drawable);
        ((AbstractC69693h) this.f155525a.get(i)).mo61917a(aVar2.f155528b);
        View view = aVar2.f155529c;
        if (!((AbstractC69693h) this.f155525a.get(i)).mo61921d()) {
            i2 = 8;
        }
        view.setVisibility(i2);
        ImageView imageView = aVar2.f155527a;
        float f2 = 1.0f;
        if (((AbstractC69693h) this.f155525a.get(i)).mo61923f()) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        imageView.setAlpha(f);
        TextView textView = aVar2.f155528b;
        if (!((AbstractC69693h) this.f155525a.get(i)).mo61923f()) {
            f2 = 0.34f;
        }
        textView.setAlpha(f2);
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC69671c(this, i));
    }
}

package com.p2082ss.android.ugc.aweme.share.more.p3770ui.p3771a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
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
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.share.more.p3769b.C69339a;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69576b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69675c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.C69674b;
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

/* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a */
public final class C69350a extends RecyclerView.AbstractC1350a<C69351a> {

    /* renamed from: c */
    public static final C69352b f154935c = new C69352b((byte) 0);

    /* renamed from: a */
    public List<? extends AbstractC69693h> f154936a = C89086z.INSTANCE;

    /* renamed from: b */
    public final AbstractC69675c f154937b;

    static {
        Covode.recordClassIndex(81682);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C69351a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m122548a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a$b */
    public static final class C69352b {
        static {
            Covode.recordClassIndex(81684);
        }

        private C69352b() {
        }

        public /* synthetic */ C69352b(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f154936a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a$a */
    public static class C69351a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(81683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69351a(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a$c */
    public static final class C69353c extends C69351a {
        static {
            Covode.recordClassIndex(81685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69353c(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }
    }

    public C69350a(AbstractC69675c cVar) {
        C89219l.m154721d(cVar, "");
        this.f154937b = cVar;
    }

    /* renamed from: a */
    public final void mo109624a(List<? extends AbstractC69693h> list) {
        C89219l.m154721d(list, "");
        this.f154936a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (this.f154936a.get(i) instanceof C69339a) {
            return 0;
        }
        return 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a$e */
    static final class View$OnClickListenerC69355e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C69350a f154940a;

        /* renamed from: b */
        final /* synthetic */ int f154941b;

        static {
            Covode.recordClassIndex(81687);
        }

        View$OnClickListenerC69355e(C69350a aVar, int i) {
            this.f154940a = aVar;
            this.f154941b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C69576b.m122788a(view, 1200)) {
                this.f154940a.f154937b.mo109614a((AbstractC69693h) this.f154940a.f154936a.get(this.f154941b));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewDetachedFromWindow(C69351a aVar) {
        C69351a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        if (aVar2 instanceof C69354d) {
            Animation animation = ((C69354d) aVar2).f154938a.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            super.onViewDetachedFromWindow(aVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a$d */
    public static final class C69354d extends C69351a {

        /* renamed from: a */
        public final ImageView f154938a;

        /* renamed from: b */
        public final TextView f154939b;

        static {
            Covode.recordClassIndex(81686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69354d(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.clg);
            C89219l.m154716b(findViewById, "");
            this.f154938a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.clh);
            C89219l.m154716b(findViewById2, "");
            this.f154939b = (TextView) findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a$f */
    static final class C69356f extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f154942a;

        static {
            Covode.recordClassIndex(81688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69356f(int i) {
            super(1);
            this.f154942a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f154942a;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewAttachedToWindow(C69351a aVar) {
        C69351a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        if (aVar2 instanceof C69354d) {
            super.onViewAttachedToWindow(aVar2);
            C69354d dVar = (C69354d) aVar2;
            int adapterPosition = dVar.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < getItemCount()) {
                ((AbstractC69693h) this.f154936a.get(adapterPosition)).mo61916a(dVar.f154938a);
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m122548a(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.m26663i(6890);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i != 1) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ays, viewGroup, false);
            C89219l.m154716b(a, "");
            viewHolder = new C69353c(a);
        } else {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ayx, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C69354d(a2);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(6890);
        return viewHolder;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C69351a aVar, int i) {
        Drawable drawable;
        float f;
        C69351a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        if (aVar2 instanceof C69354d) {
            C69354d dVar = (C69354d) aVar2;
            Context context = dVar.f154938a.getContext();
            AbstractC69693h hVar = (AbstractC69693h) this.f154936a.get(i);
            if (C89064i.m154489a(C69674b.f155534a, hVar.mo61919c())) {
                int g = hVar.mo61924g();
                C89219l.m154716b(context, "");
                drawable = C23005c.m43393a(new C69356f(g)).mo37368a(context);
            } else {
                C89219l.m154716b(context, "");
                drawable = context.getResources().getDrawable(hVar.mo61924g());
            }
            dVar.f154938a.setImageDrawable(drawable);
            ((AbstractC69693h) this.f154936a.get(i)).mo61917a(dVar.f154939b);
            ImageView imageView = dVar.f154938a;
            float f2 = 1.0f;
            if (((AbstractC69693h) this.f154936a.get(i)).mo61923f()) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            imageView.setAlpha(f);
            TextView textView = dVar.f154939b;
            if (!((AbstractC69693h) this.f154936a.get(i)).mo61923f()) {
                f2 = 0.34f;
            }
            textView.setAlpha(f2);
            aVar2.itemView.setOnClickListener(new View$OnClickListenerC69355e(this, i));
        }
    }
}

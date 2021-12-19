package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23163i;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.views.C81429a;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84697h;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84632c;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85029d;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85030e;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.s */
public final class C72251s extends AbstractC84650b<ProviderEffect> implements AbstractC84632c<ProviderEffect> {

    /* renamed from: a */
    public String f161983a;

    /* renamed from: b */
    public int f161984b;

    /* renamed from: c */
    public final AbstractC84697h<ProviderEffect> f161985c;

    /* renamed from: v */
    private final AbstractC1204m f161986v;

    /* renamed from: w */
    private final int f161987w = 2;

    static {
        Covode.recordClassIndex(84916);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84632c
    /* renamed from: a */
    public final String mo114473a() {
        return this.f161983a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: c */
    public final AbstractC1204m mo114480c() {
        return this.f161986v;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: d */
    public final int mo114481d() {
        return this.f161987w;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final void mo114479b() {
        LiveData<String> a;
        super.mo114479b();
        AbstractC84697h<ProviderEffect> hVar = this.f161985c;
        if (hVar != null && (a = hVar.mo129617a()) != null) {
            a.removeObservers(this.f161986v);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.s$a */
    static final class C72252a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C72251s f161988a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f161989b;

        static {
            Covode.recordClassIndex(84917);
        }

        C72252a(C72251s sVar, AbstractC1204m mVar) {
            this.f161988a = sVar;
            this.f161989b = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f161988a.f161983a = (String) obj;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.s$b */
    public static final class C72253b extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C72251s f161990a;

        static {
            Covode.recordClassIndex(84918);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72253b(C72251s sVar) {
            this.f161990a = sVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (this.f161990a.f161984b != i) {
                this.f161990a.f161984b = i;
                C72251s sVar = this.f161990a;
                sVar.mo114474a(sVar.f161984b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            C72251s sVar = this.f161990a;
            sVar.mo114474a(sVar.f161984b);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84632c
    /* renamed from: a */
    public final void mo114477a(String str) {
        AbstractC84697h<ProviderEffect> hVar = this.f161985c;
        if (hVar != null) {
            hVar.mo129618a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.s$e */
    static final class C72259e extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        public static final C72259e f161996a = new C72259e();

        static {
            Covode.recordClassIndex(84924);
        }

        C72259e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146192a(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.s$c */
    static final class C72254c extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        final /* synthetic */ C72251s f161991a;

        static {
            Covode.recordClassIndex(84919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72254c(C72251s sVar) {
            super(1);
            this.f161991a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146190a(viewGroup2, new AbstractC89183m<TextView, TextView, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72251s.C72254c.C722551 */

                /* renamed from: a */
                final /* synthetic */ C72254c f161992a;

                static {
                    Covode.recordClassIndex(84920);
                }

                {
                    this.f161992a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(TextView textView, TextView textView2) {
                    TextView textView3 = textView;
                    TextView textView4 = textView2;
                    C89219l.m154721d(textView3, "");
                    C89219l.m154721d(textView4, "");
                    textView3.setText(R.string.gzz);
                    textView3.setTextColor(C0643b.m2378c(this.f161992a.f161991a.f189154s, R.color.bx));
                    textView4.setText(R.string.h00);
                    textView4.setTextColor(C0643b.m2378c(this.f161992a.f161991a.f189154s, R.color.bx));
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.s$d */
    static final class C72256d extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        final /* synthetic */ C72251s f161993a;

        static {
            Covode.recordClassIndex(84921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72256d(C72251s sVar) {
            super(1);
            this.f161993a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146191a(viewGroup2, new AbstractC89187q<TextView, TextView, TextView, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72251s.C72256d.C722571 */

                /* renamed from: a */
                final /* synthetic */ C72256d f161994a;

                static {
                    Covode.recordClassIndex(84922);
                }

                {
                    this.f161994a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89187q
                public final /* synthetic */ C89391z invoke(TextView textView, TextView textView2, TextView textView3) {
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    TextView textView6 = textView3;
                    C89219l.m154721d(textView4, "");
                    C89219l.m154721d(textView5, "");
                    C89219l.m154721d(textView6, "");
                    textView4.setText(R.string.gzs);
                    textView4.setTextColor(C0643b.m2378c(this.f161994a.f161993a.f189154s, R.color.bx));
                    textView5.setText(R.string.gzr);
                    textView5.setTextColor(C0643b.m2378c(this.f161994a.f161993a.f189154s, R.color.bx));
                    textView6.setText(R.string.gzy);
                    textView6.setTextColor(C0643b.m2378c(this.f161994a.f161993a.f189154s, R.color.bx));
                    textView6.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72251s.C72256d.C722571.View$OnClickListenerC722581 */

                        /* renamed from: a */
                        final /* synthetic */ C722571 f161995a;

                        static {
                            Covode.recordClassIndex(84923);
                        }

                        {
                            this.f161995a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            AbstractC84697h<ProviderEffect> hVar = this.f161995a.f161994a.f161993a.f161985c;
                            if (hVar != null) {
                                hVar.mo129563f();
                            }
                        }
                    });
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final RecyclerView mo114472a(View view) {
        C89219l.m154721d(view, "");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.e93);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(this.f161987w, 1);
        recyclerView.setItemViewCacheSize(this.f161987w);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        return recyclerView;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final AbstractC85027b<EnumC85026a> mo114478b(View view) {
        C89219l.m154721d(view, "");
        AbstractC85027b<EnumC85026a> b = super.mo114478b(view);
        if (b instanceof C85029d) {
            C85029d dVar = (C85029d) b;
            dVar.mo129961a(EnumC85026a.LOADING, C72259e.f161996a);
            dVar.mo129961a(EnumC85026a.EMPTY, new C72254c(this));
            dVar.mo129961a(EnumC85026a.ERROR, new C72256d(this));
        }
        return b;
    }

    /* renamed from: a */
    public final void mo114474a(int i) {
        int k;
        int m;
        boolean z;
        RecyclerView.AbstractC1362i layoutManager = mo129581p().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null && (k = linearLayoutManager.mo4371k()) <= (m = linearLayoutManager.mo4373m())) {
            while (true) {
                RecyclerView.ViewHolder f = mo129581p().mo4451f(k);
                if (!(f instanceof C72260t)) {
                    f = null;
                }
                AbstractC84686f fVar = (AbstractC84686f) f;
                if (fVar != null) {
                    CircleDraweeView imageView = fVar.f189208g.getImageView();
                    if ((imageView instanceof C81429a) && imageView != null) {
                        if (i == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        imageView.mo125081a(z);
                    }
                }
                if (k != m) {
                    k++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final void mo114475a(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        super.mo114475a(mVar);
        AbstractC84697h<ProviderEffect> hVar = this.f161985c;
        if (hVar != null) {
            hVar.mo129617a().observe(mVar, new C72252a(this, mVar));
        }
        mo129581p().mo4405a(new C72253b(this));
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo114471a(ViewGroup viewGroup, AbstractC89187q<? super ProviderEffect, ? super Integer, ? super EnumC84444c, C89391z> qVar) {
        MethodCollector.m26663i(10193);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(qVar, "");
        C85037b.C85038a aVar = new C85037b.C85038a(this.f189154s);
        aVar.f190276g = (int) C84912r.m145930a(this.f189154s, 80.0f);
        aVar.f190277h = (int) C84912r.m145930a(this.f189154s, 80.0f);
        aVar.f190279j = false;
        aVar.f190302a = 2131230945;
        aVar.f190303b = 2131230947;
        aVar.f190290u = true;
        C85037b a = aVar.mo122016b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        a.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this.f189154s);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        frameLayout.addView(a);
        C72260t tVar = new C72260t(frameLayout, a, qVar);
        MethodCollector.m26664o(10193);
        return tVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final /* synthetic */ void mo114476a(RecyclerView.ViewHolder viewHolder, int i, ProviderEffect providerEffect, EnumC84444c cVar, Integer num) {
        boolean z;
        String width;
        Float valueOf;
        String height;
        Integer valueOf2;
        ProviderEffect providerEffect2 = providerEffect;
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(providerEffect2, "");
        C89219l.m154721d(cVar, "");
        if (!(viewHolder instanceof C72260t)) {
            viewHolder = null;
        }
        C72260t tVar = (C72260t) viewHolder;
        if (tVar != null) {
            int i2 = this.f161984b;
            C89219l.m154721d(providerEffect2, "");
            C89219l.m154721d(cVar, "");
            ProviderEffect.StickerBean sticker_info = providerEffect2.getSticker_info();
            if (!(sticker_info == null || (width = sticker_info.getWidth()) == null || (valueOf = Float.valueOf((((float) tVar.f161999b) + 0.0f) / Float.parseFloat(width))) == null)) {
                float floatValue = valueOf.floatValue();
                ProviderEffect.StickerBean sticker_info2 = providerEffect2.getSticker_info();
                if (!(sticker_info2 == null || (height = sticker_info2.getHeight()) == null || (valueOf2 = Integer.valueOf((int) (((float) Integer.parseInt(height)) * floatValue))) == null)) {
                    tVar.f189208g.getImageView().setLayoutParams(new FrameLayout.LayoutParams(tVar.f161999b, valueOf2.intValue()));
                }
            }
            tVar.mo129601a(providerEffect2, i, cVar, num);
            CircleDraweeView imageView = tVar.f189208g.getImageView();
            View view = tVar.itemView;
            C89219l.m154716b(view, "");
            imageView.setBackgroundColor(C0643b.m2378c(view.getContext(), R.color.j));
            C24246a aVar = (C24246a) imageView.getHierarchy();
            C89219l.m154716b(aVar, "");
            aVar.mo39958a(C24229q.AbstractC24231b.f57454d);
            C23163i.m43667b(imageView, Integer.valueOf(tVar.f161998a), Integer.valueOf(tVar.f161998a), Integer.valueOf(tVar.f161998a), Integer.valueOf(tVar.f161998a), false);
            Objects.requireNonNull(imageView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.AnimateDraweeView");
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            imageView.mo125081a(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72251s(Context context, AbstractC1204m mVar, AbstractC84697h<com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect> hVar, AbstractC84700k<com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect> kVar, ViewGroup viewGroup, AbstractC89172b<? super AbstractC84650b.C84654c, C89391z> bVar) {
        super(context, mVar, hVar, kVar, viewGroup, bVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        this.f161986v = mVar;
        this.f161985c = hVar;
    }
}

package com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1483t;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50694b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.tools.view.style.C84980f;
import com.p2082ss.android.ugc.tools.view.style.C84981g;
import com.p2082ss.android.ugc.tools.view.style.EnumC84965a;
import com.p2082ss.android.ugc.tools.view.style.StyleRecyclerView;
import com.p2082ss.android.ugc.tools.view.widget.AbstractLoadingLayout;
import com.p2082ss.android.ugc.tools.view.widget.DoubleColorBallAnimationLayout;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85012b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView */
public final class FilterBoxListView extends AbstractLoadingLayout {

    /* renamed from: a */
    List<? extends C89378p<EffectCategoryModel, ? extends List<C50853f>>> f117271a;

    /* renamed from: b */
    public AbstractC50839c f117272b;

    /* renamed from: c */
    public Drawable f117273c;

    /* renamed from: d */
    public Drawable f117274d;

    /* renamed from: j */
    private final RecyclerView f117275j;

    /* renamed from: k */
    private final RecyclerView f117276k;

    /* renamed from: l */
    private C50852e f117277l = new C50852e();

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$c */
    public interface AbstractC50839c {
        static {
            Covode.recordClassIndex(60011);
        }

        /* renamed from: a */
        void mo86229a(EffectCategoryModel effectCategoryModel, C50694b bVar);

        /* renamed from: b */
        void mo86230b(EffectCategoryModel effectCategoryModel, C50694b bVar);

        /* renamed from: c */
        void mo86231c(EffectCategoryModel effectCategoryModel, C50694b bVar);
    }

    static {
        Covode.recordClassIndex(60001);
    }

    public final C50852e getFilterBoxViewConfigure() {
        return this.f117277l;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$a */
    public final class C50830a extends AbstractC85012b<C50853f> {

        /* renamed from: c */
        private ContextWrapper f117279c;

        static {
            Covode.recordClassIndex(60002);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m95221a(this, viewGroup, i);
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$a$a */
        public final class C50831a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final int f117280a;

            /* renamed from: b */
            final /* synthetic */ C50830a f117281b;

            /* renamed from: c */
            private final SimpleDraweeView f117282c;

            /* renamed from: d */
            private final TextView f117283d;

            /* renamed from: e */
            private final ImageView f117284e;

            static {
                Covode.recordClassIndex(60003);
            }

            /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$a$a$a */
            static final class C50834a extends AbstractC89220m implements AbstractC89171a<C89391z> {

                /* renamed from: a */
                final /* synthetic */ C50831a f117288a;

                static {
                    Covode.recordClassIndex(60006);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C50834a(C50831a aVar) {
                    super(0);
                    this.f117288a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    T t;
                    EffectCategoryModel effectCategoryModel;
                    if (this.f117288a.getAdapterPosition() >= 0) {
                        C50853f fVar = (C50853f) this.f117288a.f117281b.mo129933a(this.f117288a.getAdapterPosition());
                        FilterBoxListView filterBoxListView = FilterBoxListView.this;
                        C50694b bVar = fVar.f117324a;
                        C89219l.m154721d(bVar, "");
                        List<? extends C89378p<EffectCategoryModel, ? extends List<C50853f>>> list = filterBoxListView.f117271a;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                t = null;
                                if (!it.hasNext()) {
                                    break;
                                }
                                t = it.next();
                                Iterator it2 = ((Iterable) t.getSecond()).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Object next = it2.next();
                                    if (C89219l.m154714a((Object) ((C50853f) next).f117324a.f117036a.f117049c, (Object) bVar.f117036a.f117049c)) {
                                        if (next != null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            T t2 = t;
                            if (!(t2 == null || (effectCategoryModel = (EffectCategoryModel) t2.getFirst()) == null)) {
                                if (fVar.f117324a.f117038c) {
                                    AbstractC50839c cVar = FilterBoxListView.this.f117272b;
                                    if (cVar != null) {
                                        cVar.mo86229a(effectCategoryModel, fVar.f117324a);
                                    }
                                } else {
                                    fVar.f117325b = !fVar.f117325b;
                                    this.f117288a.mo86225a(fVar);
                                    if (fVar.f117325b) {
                                        AbstractC50839c cVar2 = FilterBoxListView.this.f117272b;
                                        if (cVar2 != null) {
                                            cVar2.mo86230b(effectCategoryModel, fVar.f117324a);
                                        }
                                    } else {
                                        AbstractC50839c cVar3 = FilterBoxListView.this.f117272b;
                                        if (cVar3 != null) {
                                            cVar3.mo86231c(effectCategoryModel, fVar.f117324a);
                                        }
                                    }
                                }
                            }
                        }
                        throw new NoSuchElementException();
                    }
                    return C89391z.f203057a;
                }
            }

            /* renamed from: a */
            public final void mo86225a(C50853f fVar) {
                Drawable drawable;
                float f;
                C89219l.m154721d(fVar, "");
                C84402a.m145173a(this.f117282c, String.valueOf(fVar.f117324a.f117036a.f117054h));
                this.f117283d.setText(fVar.f117324a.f117036a.f117049c);
                ImageView imageView = this.f117284e;
                if (fVar.f117325b) {
                    drawable = FilterBoxListView.this.f117274d;
                } else {
                    drawable = FilterBoxListView.this.f117273c;
                }
                imageView.setImageDrawable(drawable);
                if (fVar.f117324a.f117038c) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                imageView.setAlpha(f);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C50831a(C50830a aVar, final LinearLayout linearLayout) {
                super(linearLayout);
                C89219l.m154721d(linearLayout, "");
                this.f117281b = aVar;
                View childAt = linearLayout.getChildAt(0);
                Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) childAt;
                this.f117282c = simpleDraweeView;
                View childAt2 = linearLayout.getChildAt(1);
                Objects.requireNonNull(childAt2, "null cannot be cast to non-null type android.widget.TextView");
                this.f117283d = (TextView) childAt2;
                View childAt3 = linearLayout.getChildAt(2);
                Objects.requireNonNull(childAt3, "null cannot be cast to non-null type android.widget.ImageView");
                this.f117284e = (ImageView) childAt3;
                Context context = FilterBoxListView.this.getContext();
                C89219l.m154716b(context, "");
                this.f117280a = context.getResources().getColor(R.color.u_);
                C24246a aVar2 = (C24246a) simpleDraweeView.getHierarchy();
                aVar2 = aVar2 == null ? new C24247b(FilterBoxListView.this.getResources()).mo39973a() : aVar2;
                C24250e eVar = new C24250e();
                eVar.mo39982a(FilterBoxListView.this.getFilterBoxViewConfigure().f117323b.f117302a);
                if (!FilterBoxListView.this.getFilterBoxViewConfigure().f117323b.f117302a) {
                    eVar.mo39978a((float) FilterBoxListView.this.getFilterBoxViewConfigure().f117323b.f117303b);
                }
                C89219l.m154716b(aVar2, "");
                aVar2.mo39959a(eVar);
                aVar2.mo39958a(C24229q.AbstractC24231b.f57458h);
                simpleDraweeView.setHierarchy(aVar2);
                Context context2 = FilterBoxListView.this.getContext();
                C89219l.m154716b(context2, "");
                int a = (int) C84912r.m145930a(context2, (float) FilterBoxListView.this.getFilterBoxViewConfigure().f117323b.f117304c);
                Context context3 = FilterBoxListView.this.getContext();
                C89219l.m154716b(context3, "");
                int a2 = (int) C84912r.m145930a(context3, (float) FilterBoxListView.this.getFilterBoxViewConfigure().f117323b.f117305d);
                ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
                layoutParams = layoutParams == null ? new LinearLayout.LayoutParams(a, a2) : layoutParams;
                layoutParams.width = a;
                layoutParams.height = a2;
                simpleDraweeView.setLayoutParams(layoutParams);
                final C50834a aVar3 = new C50834a(this);
                linearLayout.setOnClickListener(new View.OnClickListener() {
                    /* class com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.C50830a.C50831a.View$OnClickListenerC508321 */

                    static {
                        Covode.recordClassIndex(60004);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        aVar3.invoke();
                    }
                });
                linearLayout.setOnTouchListener(new View.OnTouchListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.C50830a.C50831a.View$OnTouchListenerC508332 */

                    /* renamed from: a */
                    final /* synthetic */ C50831a f117286a;

                    static {
                        Covode.recordClassIndex(60005);
                    }

                    {
                        this.f117286a = r1;
                    }

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        C89219l.m154716b(motionEvent, "");
                        if (motionEvent.getAction() == 1) {
                            ObjectAnimator ofInt = ObjectAnimator.ofInt(linearLayout, "backgroundColor", this.f117286a.f117280a, 16777215);
                            C89219l.m154716b(ofInt, "");
                            ofInt.setDuration(500L);
                            ofInt.setEvaluator(new ArgbEvaluator());
                            ofInt.start();
                        }
                        return false;
                    }
                });
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C50830a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            C89219l.m154721d(viewHolder, "");
            if (!(viewHolder instanceof C50831a)) {
                viewHolder = null;
            }
            C50831a aVar = (C50831a) viewHolder;
            if (aVar != null) {
                aVar.mo86225a((C50853f) mo129933a(i));
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m95221a(C50830a aVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(2262);
            C89219l.m154721d(viewGroup, "");
            if (aVar.f117279c == null) {
                AbstractC89172b<? super Context, ? extends ContextWrapper> bVar = FilterBoxListView.this.getFilterBoxViewConfigure().f117323b.f117306e;
                Context context = viewGroup.getContext();
                C89219l.m154716b(context, "");
                aVar.f117279c = (ContextWrapper) bVar.invoke(context);
            }
            ContextWrapper contextWrapper = aVar.f117279c;
            if (contextWrapper == null) {
                C89219l.m154715b();
            }
            View a2 = C1764a.m5927a(LayoutInflater.from(contextWrapper), R.layout.d8, viewGroup, false);
            if (a2 != null) {
                C50831a aVar2 = new C50831a(aVar, (LinearLayout) a2);
                try {
                    if (aVar2.itemView.getParent() != null) {
                        try {
                            a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                            C22708a.m42800a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(aVar2.itemView);
                            }
                        }
                    }
                } catch (Exception e) {
                    C63423ai.m115002a(e);
                    C51423a.m95786a(e);
                }
                C80493gg.f180088a = aVar2.getClass().getName();
                MethodCollector.m26664o(2262);
                return aVar2;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            MethodCollector.m26664o(2262);
            throw nullPointerException;
        }
    }

    public final void setCallback(AbstractC50839c cVar) {
        this.f117272b = cVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$b */
    public final class C50835b extends AbstractC1483t<EffectCategoryModel, C50837a> {

        /* renamed from: b */
        public String f117289b;

        static {
            Covode.recordClassIndex(60007);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m95223a(this, viewGroup, i);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C50835b() {
            super(new C1445j.AbstractC1451e<EffectCategoryModel>() {
                /* class com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.C50835b.C508361 */

                static {
                    Covode.recordClassIndex(60008);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
                /* renamed from: a */
                public final /* synthetic */ boolean mo4953a(EffectCategoryModel effectCategoryModel, EffectCategoryModel effectCategoryModel2) {
                    EffectCategoryModel effectCategoryModel3 = effectCategoryModel;
                    EffectCategoryModel effectCategoryModel4 = effectCategoryModel2;
                    C89219l.m154721d(effectCategoryModel3, "");
                    C89219l.m154721d(effectCategoryModel4, "");
                    return C89219l.m154714a((Object) effectCategoryModel3.getName(), (Object) effectCategoryModel4.getName());
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
                /* renamed from: b */
                public final /* synthetic */ boolean mo4954b(EffectCategoryModel effectCategoryModel, EffectCategoryModel effectCategoryModel2) {
                    EffectCategoryModel effectCategoryModel3 = effectCategoryModel;
                    EffectCategoryModel effectCategoryModel4 = effectCategoryModel2;
                    C89219l.m154721d(effectCategoryModel3, "");
                    C89219l.m154721d(effectCategoryModel4, "");
                    return C89219l.m154714a((Object) effectCategoryModel3.getName(), (Object) effectCategoryModel4.getName());
                }
            });
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$b$a */
        public final class C50837a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final TextView f117291a;

            /* renamed from: b */
            final /* synthetic */ C50835b f117292b;

            static {
                Covode.recordClassIndex(60009);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C50837a(C50835b bVar, FrameLayout frameLayout) {
                super(frameLayout);
                C89219l.m154721d(frameLayout, "");
                this.f117292b = bVar;
                View childAt = frameLayout.getChildAt(0);
                Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                this.f117291a = (TextView) childAt;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.C50835b.C50837a.View$OnClickListenerC508381 */

                    /* renamed from: a */
                    final /* synthetic */ C50837a f117293a;

                    static {
                        Covode.recordClassIndex(60010);
                    }

                    {
                        this.f117293a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        if (this.f117293a.getAdapterPosition() >= 0) {
                            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) this.f117293a.f117292b.mo5017a(this.f117293a.getAdapterPosition());
                            FilterBoxListView filterBoxListView = FilterBoxListView.this;
                            C89219l.m154716b(effectCategoryModel, "");
                            C89219l.m154721d(effectCategoryModel, "");
                            filterBoxListView.mo86219a(effectCategoryModel);
                            this.f117293a.f117292b.f117289b = effectCategoryModel.getName();
                            this.f117293a.f117292b.notifyDataSetChanged();
                        }
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean a;
            float f;
            C50837a aVar = (C50837a) viewHolder;
            C89219l.m154721d(aVar, "");
            com.p2082ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel = (com.p2082ss.ugc.effectplatform.model.EffectCategoryModel) mo5017a(i);
            String str = this.f117289b;
            if (str == null) {
                this.f117289b = effectCategoryModel.getName();
                a = true;
            } else {
                a = C89219l.m154714a((Object) str, (Object) effectCategoryModel.getName());
            }
            C89219l.m154716b(effectCategoryModel, "");
            C89219l.m154721d(effectCategoryModel, "");
            aVar.f117291a.setText(effectCategoryModel.getName());
            TextView textView = aVar.f117291a;
            if (a) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            textView.setAlpha(f);
            if (a) {
                aVar.f117291a.setTypeface(aVar.f117291a.getTypeface(), 1);
                return;
            }
            Typeface a2 = C84980f.m146052a(EnumC84965a.MEDIUM.getFONT_NAME());
            if (a2 != null) {
                aVar.f117291a.setTypeface(a2);
            } else {
                aVar.f117291a.setTypeface(aVar.f117291a.getTypeface(), 0);
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m95223a(C50835b bVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(1066);
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.d9, viewGroup, false);
            if (a2 != null) {
                C50837a aVar = new C50837a(bVar, (FrameLayout) a2);
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
                MethodCollector.m26664o(1066);
                return aVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            MethodCollector.m26664o(1066);
            throw nullPointerException;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.AbstractLoadingLayout
    /* renamed from: a */
    public final View mo86218a(Context context) {
        MethodCollector.m26663i(987);
        C89219l.m154721d(context, "");
        Space space = new Space(context);
        MethodCollector.m26664o(987);
        return space;
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.AbstractLoadingLayout
    /* renamed from: b */
    public final View mo86220b(Context context) {
        MethodCollector.m26663i(989);
        C89219l.m154721d(context, "");
        Space space = new Space(context);
        MethodCollector.m26664o(989);
        return space;
    }

    public final void setFilterBoxViewConfigure(C50852e eVar) {
        C89219l.m154721d(eVar, "");
        this.f117277l = eVar;
        RecyclerView.AbstractC1350a adapter = this.f117275j.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        RecyclerView.AbstractC1350a adapter2 = this.f117276k.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r0 == null) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86219a(com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r3) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.f117276k
            androidx.recyclerview.widget.RecyclerView$a r1 = r0.getAdapter()
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.DetailAdapter"
            java.util.Objects.requireNonNull(r1, r0)
            com.ss.android.ugc.tools.view.widget.a.b r1 = (com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85012b) r1
            if (r3 != 0) goto L_0x0015
            h.a.z r0 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0011:
            r1.mo129936a(r0)
            return
        L_0x0015:
            java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, ? extends java.util.List<com.ss.android.ugc.aweme.filter.view.internal.filterbox.f>>> r0 = r2.f117271a
            if (r0 == 0) goto L_0x0023
            java.util.List r0 = com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a.m94978a(r0, r3)
            if (r0 != 0) goto L_0x0011
        L_0x001f:
            p4600h.p4611f.p4613b.C89219l.m154715b()
            goto L_0x0011
        L_0x0023:
            r0 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.mo86219a(com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel):void");
    }

    public final void setCategoryMap(List<? extends C89378p<EffectCategoryModel, ? extends List<C50694b>>> list) {
        C89219l.m154721d(list, "");
        setState(0);
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            Object first = t.getFirst();
            Iterable<C50694b> iterable = (Iterable) t.getSecond();
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a(iterable, 10));
            for (C50694b bVar : iterable) {
                arrayList2.add(new C50853f(bVar));
            }
            arrayList.add(C89387v.m154943a(first, arrayList2));
        }
        this.f117271a = arrayList;
        C50835b bVar2 = new C50835b();
        this.f117275j.setAdapter(bVar2);
        bVar2.mo5018a(C50687a.m94977a(list));
        mo86219a((EffectCategoryModel) C89070n.m154583g(C50687a.m94977a(list)));
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$d */
    public final class C50840d extends RecyclerView.AbstractC1361h {

        /* renamed from: b */
        private final int f117295b;

        static {
            Covode.recordClassIndex(60012);
        }

        public C50840d(int i) {
            this.f117295b = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            if (RecyclerView.m4277d(view) == 0) {
                rect.top = this.f117295b;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.AbstractLoadingLayout
    /* renamed from: a */
    public final View mo78403a(Context context, AttributeSet attributeSet) {
        C89219l.m154721d(context, "");
        return new DoubleColorBallAnimationLayout(context, attributeSet, 0);
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.AbstractLoadingLayout
    /* renamed from: a */
    public final void mo78404a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        super.mo78404a(i, i2);
        int i6 = 0;
        if (this.f190054e != null) {
            View view = this.f190054e;
            C89219l.m154716b(view, "");
            if (i2 == 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            view.setVisibility(i5);
        }
        View view2 = this.f190055f;
        C89219l.m154716b(view2, "");
        if (i2 == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        View view3 = this.f190057h;
        C89219l.m154716b(view3, "");
        if (i2 == 2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = this.f190056g;
        C89219l.m154716b(view4, "");
        if (i2 != 3) {
            i6 = 8;
        }
        view4.setVisibility(i6);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterBoxListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(1087);
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        StyleRecyclerView styleRecyclerView = new StyleRecyclerView(context2, (AttributeSet) null, 6);
        styleRecyclerView.getContext();
        styleRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        styleRecyclerView.setAdapter(new C50835b());
        Context context3 = styleRecyclerView.getContext();
        C89219l.m154716b(context3, "");
        styleRecyclerView.mo4415b(new C50840d((int) C84912r.m145930a(context3, 8.0f)));
        this.f117275j = styleRecyclerView;
        Context context4 = getContext();
        C89219l.m154716b(context4, "");
        int color = context4.getResources().getColor(R.color.u9);
        Context context5 = getContext();
        C89219l.m154716b(context5, "");
        int dimensionPixelSize = context5.getResources().getDimensionPixelSize(R.dimen.cl);
        float f = (float) dimensionPixelSize;
        styleRecyclerView.setBackground(C84966b.C84967a.m146038a().mo129755b(color).mo129753a(color, 0).mo129754a(new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}).mo129750a());
        Context context6 = getContext();
        C89219l.m154716b(context6, "");
        StyleRecyclerView styleRecyclerView2 = new StyleRecyclerView(context6, (AttributeSet) null, 6);
        styleRecyclerView2.getContext();
        styleRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        styleRecyclerView2.setAdapter(new C50830a());
        Context context7 = styleRecyclerView2.getContext();
        C89219l.m154716b(context7, "");
        styleRecyclerView2.mo4415b(new C50840d((int) C84912r.m145930a(context7, 8.0f)));
        this.f117276k = styleRecyclerView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(styleRecyclerView, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(styleRecyclerView2, new LinearLayout.LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        Context context8 = getContext();
        C89219l.m154716b(context8, "");
        Drawable drawable = context8.getResources().getDrawable(2131232205);
        Context context9 = getContext();
        C89219l.m154716b(context9, "");
        this.f117273c = C84981g.m146053a(drawable, context9.getResources().getColor(R.color.ub));
        Context context10 = getContext();
        C89219l.m154716b(context10, "");
        this.f117274d = context10.getResources().getDrawable(2131232195);
        MethodCollector.m26664o(1087);
    }
}

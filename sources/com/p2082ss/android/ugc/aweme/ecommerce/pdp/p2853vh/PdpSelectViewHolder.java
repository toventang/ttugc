package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.p1719f.p1720a.C23127c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.AbstractC44779h;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44774d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44780i;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44781j;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44782k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44783l;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ShopPolicy;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.PdpSelectItemView;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.AbstractC89244h;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder */
public final class PdpSelectViewHolder extends AbsFullSpanVH<AbstractC44779h> implements AbstractC33974au {

    /* renamed from: f */
    public final Fragment f104803f;

    /* renamed from: g */
    private final PdpSelectItemView f104804g = ((PdpSelectItemView) this.itemView.findViewById(R.id.dub));

    /* renamed from: j */
    private final AbstractC89244h f104805j;

    static {
        Covode.recordClassIndex(53332);
    }

    /* renamed from: n */
    public final PdpViewModel mo70807n() {
        return (PdpViewModel) this.f104805j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C44998a.C44999a.m87685a(view, false);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: g */
    public final void mo33829g() {
        mo76082a(new C44955i(aQ_(), (byte) 0));
        super.mo33829g();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$a */
    public static final class C44922a extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f104806a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f104807b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f104808c;

        static {
            Covode.recordClassIndex(53333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44922a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f104806a = jediViewHolder;
            this.f104807b = cVar;
            this.f104808c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpSelectViewHolder.C44922a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_vh_PdpSelectViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87613x774c6a26(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$b */
    public static final class C44923b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f104809a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpSelectViewHolder f104810b;

        /* renamed from: c */
        final /* synthetic */ AbstractC44779h f104811c;

        static {
            Covode.recordClassIndex(53334);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$b$a */
        public static final class C44924a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f104812a;

            /* renamed from: b */
            final /* synthetic */ C44923b f104813b;

            static {
                Covode.recordClassIndex(53335);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44924a(AbstractC89124d dVar, C44923b bVar) {
                super(2, dVar);
                this.f104813b = bVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C44924a(dVar, this.f104813b);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C44924a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f104812a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    PdpViewModel n = this.f104813b.f104810b.mo70807n();
                    C449251 r1 = new AbstractC89172b<AbstractC89124d<? super C89391z>, Object>(this, null) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpSelectViewHolder.C44923b.C44924a.C449251 */

                        /* renamed from: a */
                        int f104814a;

                        /* renamed from: b */
                        final /* synthetic */ C44924a f104815b;

                        static {
                            Covode.recordClassIndex(53336);
                        }

                        {
                            this.f104815b = r2;
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final AbstractC89124d<C89391z> create(AbstractC89124d<?> dVar) {
                            C89219l.m154721d(dVar, "");
                            return 

                            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
                            /* renamed from: a */
                            public final void mo60873a(View view) {
                                if (view != null) {
                                    AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new C44924a(null, this), 2);
                                    C44720k kVar = this.f104810b.mo70807n().f104162s;
                                    if (kVar != null) {
                                        kVar.mo75861a(this.f104811c.mo75904a(), (AbstractC44779h) null);
                                    }
                                }
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public C44923b(PdpSelectViewHolder pdpSelectViewHolder, AbstractC44779h hVar) {
                                super(700);
                                this.f104810b = pdpSelectViewHolder;
                                this.f104811c = hVar;
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$c */
                        public static final class C44926c extends AbstractView$OnClickListenerC80259bp {

                            /* renamed from: a */
                            final /* synthetic */ long f104816a = 700;

                            /* renamed from: b */
                            final /* synthetic */ PdpSelectViewHolder f104817b;

                            /* renamed from: c */
                            final /* synthetic */ AbstractC44779h f104818c;

                            static {
                                Covode.recordClassIndex(53337);
                            }

                            /* access modifiers changed from: package-private */
                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$c$a */
                            public static final class C44927a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                /* renamed from: a */
                                int f104819a;

                                /* renamed from: b */
                                final /* synthetic */ C44926c f104820b;

                                static {
                                    Covode.recordClassIndex(53338);
                                }

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                C44927a(AbstractC89124d dVar, C44926c cVar) {
                                    super(2, dVar);
                                    this.f104820b = cVar;
                                }

                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                    C89219l.m154721d(dVar, "");
                                    return new C44927a(dVar, this.f104820b);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                    return ((C44927a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                }

                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                public final Object invokeSuspend(Object obj) {
                                    EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                    int i = this.f104819a;
                                    if (i == 0) {
                                        C89382r.m154942a(obj);
                                        PdpViewModel n = this.f104820b.f104817b.mo70807n();
                                        C449281 r1 = new AbstractC89172b<AbstractC89124d<? super C89391z>, Object>(this, null) {
                                            /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpSelectViewHolder.C44926c.C44927a.C449281 */

                                            /* renamed from: a */
                                            int f104821a;

                                            /* renamed from: b */
                                            final /* synthetic */ C44927a f104822b;

                                            static {
                                                Covode.recordClassIndex(53339);
                                            }

                                            {
                                                this.f104822b = r2;
                                            }

                                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                            public final AbstractC89124d<C89391z> create(AbstractC89124d<?> dVar) {
                                                C89219l.m154721d(dVar, "");
                                                return 

                                                @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
                                                /* renamed from: a */
                                                public final void mo60873a(View view) {
                                                    if (view != null) {
                                                        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new C44927a(null, this), 2);
                                                        C44720k kVar = this.f104817b.mo70807n().f104162s;
                                                        if (kVar != null) {
                                                            kVar.mo75861a(this.f104818c.mo75904a(), (AbstractC44779h) null);
                                                        }
                                                    }
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public C44926c(PdpSelectViewHolder pdpSelectViewHolder, AbstractC44779h hVar) {
                                                    super(700);
                                                    this.f104817b = pdpSelectViewHolder;
                                                    this.f104818c = hVar;
                                                }
                                            }

                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$e */
                                            public static final class C44930e extends AbstractView$OnClickListenerC80259bp {

                                                /* renamed from: a */
                                                final /* synthetic */ long f104826a = 700;

                                                /* renamed from: b */
                                                final /* synthetic */ PdpSelectViewHolder f104827b;

                                                /* renamed from: c */
                                                final /* synthetic */ AbstractC44779h f104828c;

                                                static {
                                                    Covode.recordClassIndex(53341);
                                                }

                                                @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
                                                /* renamed from: a */
                                                public final void mo60873a(View view) {
                                                    View view2;
                                                    if (view != null) {
                                                        PdpViewModel n = this.f104827b.mo70807n();
                                                        Fragment fragment = this.f104827b.f104803f;
                                                        if (fragment != null) {
                                                            view2 = fragment.getView();
                                                        } else {
                                                            view2 = null;
                                                        }
                                                        n.mo75817a(view2, 0);
                                                        C44720k kVar = this.f104827b.mo70807n().f104162s;
                                                        if (kVar != null) {
                                                            kVar.mo75861a(this.f104828c.mo75904a(), (AbstractC44779h) null);
                                                        }
                                                    }
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public C44930e(PdpSelectViewHolder pdpSelectViewHolder, AbstractC44779h hVar) {
                                                    super(700);
                                                    this.f104827b = pdpSelectViewHolder;
                                                    this.f104828c = hVar;
                                                }
                                            }

                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$d */
                                            public static final class C44929d extends AbstractView$OnClickListenerC80259bp {

                                                /* renamed from: a */
                                                final /* synthetic */ long f104823a = 700;

                                                /* renamed from: b */
                                                final /* synthetic */ PdpSelectViewHolder f104824b;

                                                /* renamed from: c */
                                                final /* synthetic */ AbstractC44779h f104825c;

                                                static {
                                                    Covode.recordClassIndex(53340);
                                                }

                                                @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
                                                /* renamed from: a */
                                                public final void mo60873a(View view) {
                                                    Context context;
                                                    if (view != null) {
                                                        PdpViewModel n = this.f104824b.mo70807n();
                                                        Fragment fragment = this.f104824b.f104803f;
                                                        if (fragment == null || (context = fragment.getContext()) == null) {
                                                            C22708a.m42800a("Open shipping failed. Context is NULL");
                                                        } else {
                                                            n.f104157n = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new PdpViewModel.C44654n(n, context, null), 2);
                                                        }
                                                        C44720k kVar = this.f104824b.mo70807n().f104162s;
                                                        if (kVar != null) {
                                                            kVar.mo75861a(this.f104825c.mo75904a(), this.f104825c);
                                                        }
                                                    }
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public C44929d(PdpSelectViewHolder pdpSelectViewHolder, AbstractC44779h hVar) {
                                                    super(700);
                                                    this.f104824b = pdpSelectViewHolder;
                                                    this.f104825c = hVar;
                                                }
                                            }

                                            @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
                                            /* renamed from: a */
                                            public final /* synthetic */ void mo33817a(Object obj) {
                                                String str;
                                                Context context;
                                                String str2;
                                                String str3;
                                                String priceStr;
                                                AbstractC44779h hVar = (AbstractC44779h) obj;
                                                C89219l.m154721d(hVar, "");
                                                String str4 = null;
                                                this.f104804g.setDesc(null);
                                                this.f104804g.setSubDesc(null);
                                                this.f104804g.setSecondLineDescL2(null);
                                                this.f104804g.setSecondLineDescL1(null);
                                                this.f104804g.setSecondLineDescExtra(null);
                                                PdpSelectItemView pdpSelectItemView = this.f104804g;
                                                C89219l.m154716b(pdpSelectItemView, "");
                                                Context context2 = pdpSelectItemView.getContext();
                                                C89219l.m154716b(context2, "");
                                                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.fj);
                                                this.f104804g.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                                this.f104804g.setBackIconVisibility(true);
                                                if (hVar instanceof C44780i) {
                                                    this.f104804g.setTitle(R.string.bfx);
                                                    PdpSelectItemView pdpSelectItemView2 = this.f104804g;
                                                    C89219l.m154716b(pdpSelectItemView2, "");
                                                    pdpSelectItemView2.setOnClickListener(new C44923b(this, hVar));
                                                    PdpSelectItemView pdpSelectItemView3 = this.f104804g;
                                                    List<ShopPolicy> list = ((C44780i) hVar).f104484a;
                                                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                                                    Iterator<T> it = list.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(it.next().f104711a);
                                                    }
                                                    pdpSelectItemView3.setSecondLineDescL1(C89070n.m154551a(arrayList, " · ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
                                                    this.f104804g.setPadding(dimensionPixelSize, C34728n.m70946a(24.0d), dimensionPixelSize, dimensionPixelSize);
                                                } else if (hVar instanceof C44783l) {
                                                    this.f104804g.setTitle(R.string.bg3);
                                                    PdpSelectItemView pdpSelectItemView4 = this.f104804g;
                                                    C89219l.m154716b(pdpSelectItemView4, "");
                                                    pdpSelectItemView4.setOnClickListener(new C44926c(this, hVar));
                                                } else if (hVar instanceof C44781j) {
                                                    C44774d dVar = ((C44781j) hVar).f104485a;
                                                    if (dVar == null) {
                                                        PdpSelectItemView pdpSelectItemView5 = this.f104804g;
                                                        View view = this.itemView;
                                                        C89219l.m154716b(view, "");
                                                        pdpSelectItemView5.setDesc(view.getContext().getString(R.string.bfn));
                                                    } else {
                                                        Price price = dVar.f104457a;
                                                        if ((price == null || (priceStr = price.getPriceStr()) == null || priceStr.length() == 0) && ((str2 = dVar.f104458b) == null || str2.length() == 0)) {
                                                            String str5 = dVar.f104461e;
                                                            if (str5 == null || str5.length() == 0) {
                                                                View view2 = this.itemView;
                                                                C89219l.m154716b(view2, "");
                                                                str3 = view2.getContext().getString(R.string.bfn);
                                                            } else {
                                                                str3 = dVar.f104461e;
                                                            }
                                                            C89219l.m154716b(str3, "");
                                                            this.f104804g.setDesc(str3);
                                                            this.f104804g.setSubDesc(null);
                                                            this.f104804g.setDescLineThru(false);
                                                            this.f104804g.setSecondLineDescL2(null);
                                                        } else {
                                                            this.f104804g.setDesc(dVar.f104458b);
                                                            PdpSelectItemView pdpSelectItemView6 = this.f104804g;
                                                            Price price2 = dVar.f104457a;
                                                            if (price2 != null) {
                                                                str4 = price2.getPriceStr();
                                                            }
                                                            pdpSelectItemView6.setSubDesc(str4);
                                                            this.f104804g.setDescLineThru(true);
                                                            this.f104804g.setSecondLineDescL2(dVar.f104462f);
                                                            if (dVar.f104466j) {
                                                                PdpSelectItemView pdpSelectItemView7 = this.f104804g;
                                                                View view3 = this.itemView;
                                                                C89219l.m154716b(view3, "");
                                                                pdpSelectItemView7.setSubDescColor(C0643b.m2378c(view3.getContext(), R.color.bh));
                                                            } else {
                                                                PdpSelectItemView pdpSelectItemView8 = this.f104804g;
                                                                View view4 = this.itemView;
                                                                C89219l.m154716b(view4, "");
                                                                pdpSelectItemView8.setSubDescColor(C0643b.m2378c(view4.getContext(), R.color.bx));
                                                            }
                                                            String str6 = dVar.f104464h;
                                                            if (!(str6 == null || str6.length() == 0)) {
                                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                                Fragment fragment = this.f104803f;
                                                                if (!(fragment == null || (context = fragment.getContext()) == null)) {
                                                                    C89219l.m154716b(context, "");
                                                                    C23001b bVar = new C23001b(context, R.raw.icon_truck_moving_ltr);
                                                                    SpannableString spannableString = new SpannableString(" ");
                                                                    bVar.setBounds(0, 0, C34728n.m70946a(14.0d), C34728n.m70946a(11.0d));
                                                                    bVar.mo37377c(C0643b.m2378c(context, R.color.bh));
                                                                    spannableString.setSpan(new C23127c(bVar), 0, spannableString.length(), 33);
                                                                    spannableStringBuilder.append((CharSequence) spannableString);
                                                                    int c = C0643b.m2378c(context, R.color.bh);
                                                                    SpannableString spannableString2 = new SpannableString(" " + context.getString(R.string.bfk) + " ");
                                                                    spannableString2.setSpan(new ForegroundColorSpan(c), 0, spannableString2.length(), 33);
                                                                    spannableString2.setSpan(new C23126b(62, true), 0, spannableString2.length(), 33);
                                                                    spannableStringBuilder.append((CharSequence) spannableString2);
                                                                }
                                                                spannableStringBuilder.append((CharSequence) dVar.f104464h);
                                                                this.f104804g.setSecondLineDescExtra(spannableStringBuilder);
                                                            }
                                                        }
                                                        this.f104804g.setSecondLineDescL1(dVar.f104463g);
                                                    }
                                                    this.f104804g.setTitle(R.string.bfe);
                                                    PdpSelectItemView pdpSelectItemView9 = this.f104804g;
                                                    C89219l.m154716b(pdpSelectItemView9, "");
                                                    pdpSelectItemView9.setOnClickListener(new C44929d(this, hVar));
                                                    this.f104804g.setPadding(dimensionPixelSize, C34728n.m70946a(24.0d), dimensionPixelSize, dimensionPixelSize);
                                                } else if (hVar instanceof C44782k) {
                                                    this.f104804g.setTitle(R.string.bg9);
                                                    if (!mo70807n().f104152f || C89361p.m154870a((CharSequence) ((C44782k) hVar).f104486a)) {
                                                        PdpSelectItemView pdpSelectItemView10 = this.f104804g;
                                                        C89219l.m154716b(pdpSelectItemView10, "");
                                                        pdpSelectItemView10.setOnClickListener(new C44930e(this, hVar));
                                                    } else {
                                                        this.f104804g.setBackIconVisibility(false);
                                                    }
                                                    C44782k kVar = (C44782k) hVar;
                                                    if (C89361p.m154870a((CharSequence) kVar.f104486a)) {
                                                        PdpSelectItemView pdpSelectItemView11 = this.f104804g;
                                                        C89219l.m154716b(pdpSelectItemView11, "");
                                                        str = pdpSelectItemView11.getContext().getString(R.string.bfn);
                                                    } else {
                                                        str = kVar.f104486a;
                                                    }
                                                    C89219l.m154716b(str, "");
                                                    this.f104804g.setDescLineThru(false);
                                                    this.f104804g.setDesc(str);
                                                }
                                            }

                                            /* JADX WARNING: Illegal instructions before constructor call */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public PdpSelectViewHolder(android.view.ViewGroup r5, androidx.fragment.app.Fragment r6) {
                                                /*
                                                    r4 = this;
                                                    java.lang.String r3 = ""
                                                    p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
                                                    android.content.Context r2 = r5.getContext()
                                                    r1 = 2131559023(0x7f0d026f, float:1.8743378E38)
                                                    r0 = 0
                                                    android.view.View r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a.m87492a(r2, r1, r5, r0)
                                                    p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                                                    r4.<init>(r0)
                                                    r4.f104803f = r6
                                                    android.view.View r1 = r4.itemView
                                                    r0 = 2131368052(0x7f0a1874, float:1.8356043E38)
                                                    android.view.View r0 = r1.findViewById(r0)
                                                    com.ss.android.ugc.aweme.ecommerce.pdp.view.PdpSelectItemView r0 = (com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.PdpSelectItemView) r0
                                                    r4.f104804g = r0
                                                    java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
                                                    h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                                                    com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder$a
                                                    r0.<init>(r4, r1, r1)
                                                    h.h r0 = p4600h.C89250i.m154773a(r0)
                                                    r4.f104805j = r0
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpSelectViewHolder.<init>(android.view.ViewGroup, androidx.fragment.app.Fragment):void");
                                            }
                                        }

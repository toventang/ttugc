package com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2839b.C44384a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2840vh.ShipFromBarHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2840vh.ShipToBarHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44456c;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter */
public final class LogisticAdapter extends AbstractC34489c<Object> {

    /* renamed from: d */
    public final AbstractC1204m f103550d;

    static {
        Covode.recordClassIndex(52751);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$LogisticViewHolder */
    public final class LogisticViewHolder extends JediSimpleViewHolder<LogisticDTO> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ LogisticAdapter f103551f;

        /* renamed from: g */
        private final AbstractC89244h f103552g;

        static {
            Covode.recordClassIndex(52752);
        }

        /* renamed from: m */
        public final DeliveryPanelViewModel mo63351m() {
            return (DeliveryPanelViewModel) this.f103552g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void cc_() {
            super.cc_();
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$LogisticViewHolder$a */
        public static final class C44414a extends AbstractC89220m implements AbstractC89171a<DeliveryPanelViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f103553a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f103554b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f103555c;

            static {
                Covode.recordClassIndex(52753);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44414a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f103553a = jediViewHolder;
                this.f103554b = cVar;
                this.f103555c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter.LogisticViewHolder.C44414a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_delivery_page_logistic_LogisticAdapter$LogisticViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m87129xfacae0fb(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$LogisticViewHolder$b */
        public static final class C44415b extends AbstractView$OnClickListenerC80259bp {

            /* renamed from: a */
            final /* synthetic */ long f103556a = 700;

            /* renamed from: b */
            final /* synthetic */ LogisticViewHolder f103557b;

            /* renamed from: c */
            final /* synthetic */ LogisticDTO f103558c;

            static {
                Covode.recordClassIndex(52754);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                if (view != null) {
                    this.f103557b.mo63351m().mo33689c(new DeliveryPanelViewModel.C44475i(this.f103558c));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44415b(LogisticViewHolder logisticViewHolder, LogisticDTO logisticDTO) {
                super(700);
                this.f103557b = logisticViewHolder;
                this.f103558c = logisticDTO;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$LogisticViewHolder$d */
        static final class C44417d extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ View f103562a;

            /* renamed from: b */
            final /* synthetic */ LogisticViewHolder f103563b;

            /* renamed from: c */
            final /* synthetic */ LogisticDTO f103564c;

            static {
                Covode.recordClassIndex(52756);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44417d(View view, LogisticViewHolder logisticViewHolder, LogisticDTO logisticDTO) {
                super(1);
                this.f103562a = view;
                this.f103563b = logisticViewHolder;
                this.f103564c = logisticDTO;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00c7  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState r9) {
                /*
                // Method dump skipped, instructions count: 237
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter.LogisticViewHolder.C44417d.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(LogisticDTO logisticDTO) {
            boolean z;
            String str;
            int i;
            String str2;
            String str3;
            String str4;
            LogisticDTO logisticDTO2 = logisticDTO;
            C89219l.m154721d(logisticDTO2, "");
            View view = this.itemView;
            C89219l.m154716b(view, "");
            if (this.f48794i != this.f103551f.getItemCount() - 1) {
                z = true;
            } else {
                z = false;
            }
            C44998a.C44999a.m87685a(view, z);
            View view2 = this.itemView;
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.agt);
            C89219l.m154716b(tuxTextView, "");
            Price price = logisticDTO2.f103619f;
            if (price == null || (str = price.getPriceStr()) == null) {
                str = "";
            }
            tuxTextView.setText(str);
            if (C89219l.m154714a((Object) logisticDTO2.f103621h, (Object) true)) {
                i = R.color.bh;
            } else {
                i = R.color.bx;
            }
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            ((TuxTextView) view2.findViewById(R.id.agt)).setTextColor(C0643b.m2378c(view3.getContext(), i));
            TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.cxo);
            C89219l.m154716b(tuxTextView2, "");
            TextPaint paint = tuxTextView2.getPaint();
            C89219l.m154716b(paint, "");
            TuxTextView tuxTextView3 = (TuxTextView) view2.findViewById(R.id.cxo);
            C89219l.m154716b(tuxTextView3, "");
            TextPaint paint2 = tuxTextView3.getPaint();
            C89219l.m154716b(paint2, "");
            paint.setFlags(paint2.getFlags() | 16);
            TuxTextView tuxTextView4 = (TuxTextView) view2.findViewById(R.id.cxo);
            C89219l.m154716b(tuxTextView4, "");
            String str5 = logisticDTO2.f103620g;
            if (str5 == null) {
                str5 = "";
            }
            tuxTextView4.setText(str5);
            TuxTextView tuxTextView5 = (TuxTextView) view2.findViewById(R.id.c7r);
            C89219l.m154716b(tuxTextView5, "");
            LogisticTextDTO logisticTextDTO = logisticDTO2.f103623j;
            String str6 = null;
            if (logisticTextDTO != null) {
                str2 = logisticTextDTO.f103627c;
            } else {
                str2 = null;
            }
            m87126a(tuxTextView5, str2);
            TuxTextView tuxTextView6 = (TuxTextView) view2.findViewById(R.id.alt);
            C89219l.m154716b(tuxTextView6, "");
            LogisticTextDTO logisticTextDTO2 = logisticDTO2.f103623j;
            if (logisticTextDTO2 != null) {
                str3 = logisticTextDTO2.f103625a;
            } else {
                str3 = null;
            }
            m87126a(tuxTextView6, str3);
            TuxTextView tuxTextView7 = (TuxTextView) view2.findViewById(R.id.ehh);
            C89219l.m154716b(tuxTextView7, "");
            LogisticTextDTO logisticTextDTO3 = logisticDTO2.f103623j;
            if (logisticTextDTO3 != null) {
                str4 = logisticTextDTO3.f103629e;
            } else {
                str4 = null;
            }
            m87126a(tuxTextView7, str4);
            TuxTextView tuxTextView8 = (TuxTextView) view2.findViewById(R.id.ajb);
            C89219l.m154716b(tuxTextView8, "");
            m87126a(tuxTextView8, logisticDTO2.f103615b);
            TuxTextView tuxTextView9 = (TuxTextView) view2.findViewById(R.id.dwa);
            C89219l.m154716b(tuxTextView9, "");
            LogisticTextDTO logisticTextDTO4 = logisticDTO2.f103623j;
            if (logisticTextDTO4 != null) {
                str6 = logisticTextDTO4.f103626b;
            }
            m87126a(tuxTextView9, str6);
            view2.setOnClickListener(new C44415b(this, logisticDTO2));
            AbstractC88412b unused = selectSubscribe(mo63351m(), C44424a.f103571a, new C20370ah(), new C44416c(view2, this, logisticDTO2));
            withState(mo63351m(), new C44417d(view2, this, logisticDTO2));
        }

        /* renamed from: a */
        private static void m87126a(TextView textView, String str) {
            int i = 0;
            if (str == null || str.length() == 0) {
                i = 8;
            }
            textView.setVisibility(i);
            textView.setText(str);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$LogisticViewHolder$c */
        static final class C44416c extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<LogisticDTO>, LogisticDTO, C89391z> {

            /* renamed from: a */
            final /* synthetic */ View f103559a;

            /* renamed from: b */
            final /* synthetic */ LogisticViewHolder f103560b;

            /* renamed from: c */
            final /* synthetic */ LogisticDTO f103561c;

            static {
                Covode.recordClassIndex(52755);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44416c(View view, LogisticViewHolder logisticViewHolder, LogisticDTO logisticDTO) {
                super(2);
                this.f103559a = view;
                this.f103560b = logisticViewHolder;
                this.f103561c = logisticDTO;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<LogisticDTO> jediSimpleViewHolder, LogisticDTO logisticDTO) {
                String str;
                LogisticDTO logisticDTO2 = logisticDTO;
                C89219l.m154721d(jediSimpleViewHolder, "");
                RadioButton radioButton = (RadioButton) this.f103559a.findViewById(R.id.ddr);
                C89219l.m154716b(radioButton, "");
                if (logisticDTO2 != null) {
                    str = logisticDTO2.f103624k;
                } else {
                    str = null;
                }
                radioButton.setChecked(C89219l.m154714a((Object) str, (Object) this.f103561c.f103624k));
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public LogisticViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
                r4.f103551f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558961(0x7f0d0231, float:1.8743253E38)
                r0 = 0
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                r4.<init>(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$LogisticViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$LogisticViewHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r4.f103552g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter.LogisticViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter, android.view.ViewGroup):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((AbstractC34491d) this).f81477a.mo33895b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$b */
    static final class C44419b extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C44419b f103566a = new C44419b();

        static {
            Covode.recordClassIndex(52758);
        }

        C44419b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new ShipToBarHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$d */
    static final class C44421d extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C44421d f103568a = new C44421d();

        static {
            Covode.recordClassIndex(52760);
        }

        C44421d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new ShipFromBarHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$f */
    static final class C44423f extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ LogisticAdapter f103570a;

        static {
            Covode.recordClassIndex(52762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44423f(LogisticAdapter logisticAdapter) {
            super(1);
            this.f103570a = logisticAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new LogisticViewHolder(this.f103570a, viewGroup2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogisticAdapter(AbstractC1204m mVar) {
        super(mVar, (C1445j.AbstractC1451e) null, 6);
        C89219l.m154721d(mVar, "");
        this.f103550d = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$a */
    static final class C44418a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ LogisticAdapter f103565a;

        static {
            Covode.recordClassIndex(52757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44418a(LogisticAdapter logisticAdapter) {
            super(1);
            this.f103565a = logisticAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f103565a.mo33762a(num.intValue()) instanceof C44384a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$c */
    static final class C44420c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ LogisticAdapter f103567a;

        static {
            Covode.recordClassIndex(52759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44420c(LogisticAdapter logisticAdapter) {
            super(1);
            this.f103567a = logisticAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f103567a.mo33762a(num.intValue()) instanceof C44456c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.LogisticAdapter$e */
    static final class C44422e extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ LogisticAdapter f103569a;

        static {
            Covode.recordClassIndex(52761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44422e(LogisticAdapter logisticAdapter) {
            super(1);
            this.f103569a = logisticAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f103569a.mo33762a(num.intValue()) instanceof LogisticDTO);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: a */
    public final void mo60935a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, ?>> gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC20638g unused = gVar.mo33893a(new C44418a(this), null, C44419b.f103566a);
        AbstractC20638g unused2 = gVar.mo33893a(new C44420c(this), null, C44421d.f103568a);
        AbstractC20638g unused3 = gVar.mo33893a(new C44422e(this), null, new C44423f(this));
    }
}

package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.address.p2820a.C43340a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder */
public final class SwitchInputItemViewHolder extends JediSimpleViewHolder<C43340a> implements AbstractC33974au {

    /* renamed from: f */
    final AbstractC89244h f101462f;

    static {
        Covode.recordClassIndex(51740);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder$a */
    public static final class C43508a extends AbstractC89220m implements AbstractC89171a<AddressEditViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f101463a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f101464b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f101465c;

        static {
            Covode.recordClassIndex(51741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43508a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f101463a = jediViewHolder;
            this.f101464b = cVar;
            this.f101465c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder.C43508a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_address_edit_viewholder_SwitchInputItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86561xdb841a91(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder$b */
    public static final class C43509b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f101466a = 700;

        /* renamed from: b */
        final /* synthetic */ CommonItemView f101467b;

        /* renamed from: c */
        final /* synthetic */ SwitchInputItemViewHolder f101468c;

        /* renamed from: d */
        final /* synthetic */ C43340a f101469d;

        static {
            Covode.recordClassIndex(51742);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            if (view != null) {
                CommonItemView commonItemView = this.f101467b;
                commonItemView.setChecked(!commonItemView.mo27138d());
                C43340a aVar = this.f101469d;
                if (this.f101467b.mo27138d()) {
                    str = "1";
                } else {
                    str = "0";
                }
                aVar.f101149b = str;
                ((AddressEditViewModel) this.f101468c.f101462f.getValue()).f101251e = true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43509b(CommonItemView commonItemView, SwitchInputItemViewHolder switchInputItemViewHolder, C43340a aVar) {
            super(700);
            this.f101467b = commonItemView;
            this.f101468c = switchInputItemViewHolder;
            this.f101469d = aVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchInputItemViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558948(0x7f0d0224, float:1.8743226E38)
            r0 = 0
            android.view.View r0 = com.C1764a.m5927a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r4.f101462f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C43340a aVar) {
        C43340a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
        CommonItemView commonItemView = (CommonItemView) view;
        commonItemView.setLeftText(aVar2.f101148a.f101202g);
        C0792v.m2746a(commonItemView, (Drawable) null);
        Object obj = aVar2.f101149b;
        if ((obj instanceof String) && obj != null) {
            commonItemView.setChecked(C89219l.m154714a(obj, (Object) "1"));
        }
        commonItemView.setOnClickListener(new C43509b(commonItemView, this, aVar2));
    }
}

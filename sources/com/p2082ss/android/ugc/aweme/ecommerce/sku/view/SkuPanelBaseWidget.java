package com.p2082ss.android.ugc.aweme.ecommerce.sku.view;

import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget */
public class SkuPanelBaseWidget extends JediBaseWidget implements AbstractC33974au {

    /* renamed from: h */
    private final AbstractC89244h f105873h;

    static {
        Covode.recordClassIndex(53923);
    }

    /* renamed from: l */
    public final SkuPanelViewModel mo76667l() {
        return (SkuPanelViewModel) this.f105873h.getValue();
    }

    /* renamed from: m */
    public void mo76668m() {
    }

    /* renamed from: n */
    public void mo76669n() {
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: c */
    public final void mo39080c() {
        super.mo39080c();
        mo76669n();
        mo76668m();
    }

    public SkuPanelBaseWidget() {
        AbstractC89277c a = C89204ab.m154669a(SkuPanelViewModel.class);
        this.f105873h = C89250i.m154773a((AbstractC89171a) new C45440a(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget$a */
    public static final class C45440a extends AbstractC89220m implements AbstractC89171a<SkuPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f105874a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f105875b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105876c;

        static {
            Covode.recordClassIndex(53924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45440a(Widget widget, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f105874a = widget;
            this.f105875b = cVar;
            this.f105876c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget.C45440a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_sku_view_SkuPanelBaseWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m88005x684bee2f(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends View> T mo76666a(int i) {
        View view = this.f56005e;
        if (view == null) {
            C89219l.m154715b();
        }
        T t = (T) view.findViewById(i);
        if (t == null) {
            C89219l.m154715b();
        }
        return t;
    }
}

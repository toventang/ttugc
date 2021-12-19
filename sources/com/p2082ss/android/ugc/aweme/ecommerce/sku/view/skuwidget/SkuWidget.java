package com.p2082ss.android.ugc.aweme.ecommerce.sku.view.skuwidget;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.C45502d;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.EnumC45533a;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.SkuWidget */
public final class SkuWidget extends SkuPanelBaseWidget implements AbstractC33974au {

    /* renamed from: h */
    public LinearLayout f105958h;

    /* renamed from: i */
    public C45502d f105959i;

    /* renamed from: j */
    private final int f105960j = R.layout.qz;

    static {
        Covode.recordClassIndex(53977);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: b */
    public final int mo39079b() {
        return this.f105960j;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    /* renamed from: m */
    public final void mo76668m() {
        super.mo76668m();
        C45502d dVar = this.f105959i;
        if (dVar == null) {
            C89219l.m154710a("specListLayout");
        }
        dVar.setCheckedChangeListener(new C45490a(this));
        AbstractC88412b unused = selectSubscribe(mo76667l(), C45493a.f105964a, new C20370ah(), new C45491b(this));
        AbstractC88412b unused2 = selectSubscribe(mo76667l(), C45494b.f105965a, new C20370ah(), new C45492c(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    /* renamed from: n */
    public final void mo76669n() {
        MethodCollector.m26663i(7894);
        super.mo76669n();
        this.f105958h = (LinearLayout) mo76666a(R.id.e2m);
        Context context = mo39077a().getContext();
        C89219l.m154716b(context, "");
        this.f105959i = new C45502d(context);
        LinearLayout linearLayout = this.f105958h;
        if (linearLayout == null) {
            C89219l.m154710a("skuWidgetContainer");
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f105958h;
        if (linearLayout2 == null) {
            C89219l.m154710a("skuWidgetContainer");
        }
        C45502d dVar = this.f105959i;
        if (dVar == null) {
            C89219l.m154710a("specListLayout");
        }
        linearLayout2.addView(dVar);
        MethodCollector.m26664o(7894);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.SkuWidget$a */
    public static final class C45490a implements C45502d.AbstractC45503a {

        /* renamed from: a */
        final /* synthetic */ SkuWidget f105961a;

        static {
            Covode.recordClassIndex(53978);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45490a(SkuWidget skuWidget) {
            this.f105961a = skuWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.C45502d.AbstractC45503a
        /* renamed from: a */
        public final void mo76686a(String[] strArr) {
            C89219l.m154721d(strArr, "");
            this.f105961a.mo76667l().mo76705a(strArr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.SkuWidget$b */
    static final class C45491b extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuWidget f105962a;

        static {
            Covode.recordClassIndex(53979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45491b(SkuWidget skuWidget) {
            super(2);
            this.f105962a = skuWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            int i;
            Boolean bool2 = bool;
            C89219l.m154721d(iVar, "");
            LinearLayout linearLayout = this.f105962a.f105958h;
            if (linearLayout == null) {
                C89219l.m154710a("skuWidgetContainer");
            }
            if (bool2 == null || !bool2.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.SkuWidget$c */
    static final class C45492c extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, EnumC45533a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuWidget f105963a;

        static {
            Covode.recordClassIndex(53980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45492c(SkuWidget skuWidget) {
            super(2);
            this.f105963a = skuWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x006a */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.d] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [T] */
        /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7 A[Catch:{ Exception -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0161 A[Catch:{ Exception -> 0x0171 }] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.jedi.arch.AbstractC20477i r18, com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.EnumC45533a r19) {
            /*
            // Method dump skipped, instructions count: 384
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.SkuWidget.C45492c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}

package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85029d;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.b */
public final class C76264b extends C76275g {

    /* renamed from: l */
    public static final C76265a f171323l = new C76265a((byte) 0);

    static {
        Covode.recordClassIndex(89215);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.b$a */
    public static final class C76265a {
        static {
            Covode.recordClassIndex(89216);
        }

        private C76265a() {
        }

        public /* synthetic */ C76265a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76275g
    /* renamed from: n */
    public final AbstractC76397b<Effect> mo119988n() {
        return new FavoriteStickerListViewModel(this, mo119977d(), mo119978e(), mo119979f());
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76275g, com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    /* renamed from: a */
    public final void mo119973a(List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        ADAPTER adapter = this.f171304d;
        if (adapter != null && getActivity() != null) {
            adapter.f171235i = this.f171305e;
            adapter.mo119952a(list);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    /* renamed from: b */
    public final AbstractC85027b<EnumC85026a> mo119975b(View view) {
        C89219l.m154721d(view, "");
        AbstractC85027b<EnumC85026a> b = super.mo119975b(view);
        if (b instanceof C85029d) {
            ((C85029d) b).mo129961a(EnumC85026a.EMPTY, new C76266b(this));
        }
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.b$b */
    static final class C76266b extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        final /* synthetic */ C76264b f171324a;

        static {
            Covode.recordClassIndex(89217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76266b(C76264b bVar) {
            super(1);
            this.f171324a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            Object obj;
            MethodCollector.m26663i(7245);
            C89219l.m154721d(viewGroup, "");
            AbstractC89172b<? super ViewGroup, ? extends View> bVar = this.f171324a.mo119981i().f171029f.f169831e;
            if (bVar == null || (obj = bVar.invoke(viewGroup)) == null) {
                obj = this.f171324a.getLayoutInflater().inflate(R.layout.aaw, (ViewGroup) null);
                C89219l.m154716b(obj, "");
            }
            MethodCollector.m26664o(7245);
            return obj;
        }
    }
}

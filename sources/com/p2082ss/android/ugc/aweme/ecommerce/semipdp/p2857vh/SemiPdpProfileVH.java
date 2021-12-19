package com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2857vh;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44786o;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.C44953g;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.C45349j;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45562g;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpProfileVH */
public final class SemiPdpProfileVH extends JediSimpleViewHolder<C44786o> implements AbstractC33974au {

    /* renamed from: f */
    public final View f105724f;

    /* renamed from: g */
    private final AbstractC89244h f105725g;

    static {
        Covode.recordClassIndex(53833);
    }

    /* renamed from: m */
    public final SemiPdpViewModel mo63351m() {
        return (SemiPdpViewModel) this.f105725g.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        C44998a.C44999a.m87685a(this.f105724f, true);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpProfileVH$a */
    public static final class C45371a extends AbstractC89220m implements AbstractC89171a<SemiPdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f105726a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f105727b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105728c;

        static {
            Covode.recordClassIndex(53834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45371a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f105726a = jediViewHolder;
            this.f105727b = cVar;
            this.f105728c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2857vh.SemiPdpProfileVH.C45371a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_semipdp_vh_SemiPdpProfileVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87942xa20e6f04(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemiPdpProfileVH(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f105724f = view;
        AbstractC89277c a = C89204ab.m154669a(SemiPdpViewModel.class);
        this.f105725g = C89250i.m154773a((AbstractC89171a) new C45371a(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpProfileVH$b */
    public static final class C45372b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105729a = 700;

        /* renamed from: b */
        final /* synthetic */ View f105730b;

        /* renamed from: c */
        final /* synthetic */ SemiPdpProfileVH f105731c;

        /* renamed from: d */
        final /* synthetic */ C44786o f105732d;

        static {
            Covode.recordClassIndex(53835);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            if (view != null) {
                C45349j a = this.f105731c.mo63351m().mo76402a();
                if (a != null) {
                    if (this.f105731c.mo63351m().f105583d) {
                        str = "full_screen";
                    } else {
                        str = "half_screen";
                    }
                    HashMap<String, Object> h = this.f105731c.mo63351m().mo76412h();
                    C89219l.m154721d("showcase_detail", "");
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(h, "");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("module_name", "showcase_detail");
                    linkedHashMap.put("page_show_type", str);
                    linkedHashMap.putAll(h);
                    a.mo76429b("tiktokec_module_click", linkedHashMap);
                }
                SemiPdpViewModel m = this.f105731c.mo63351m();
                Context context = this.f105730b.getContext();
                C89219l.m154716b(context, "");
                m.mo76405a(context, this.f105732d.f104495e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45372b(View view, SemiPdpProfileVH semiPdpProfileVH, C44786o oVar) {
            super(700);
            this.f105730b = view;
            this.f105731c = semiPdpProfileVH;
            this.f105732d = oVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C44786o oVar) {
        long j;
        CharSequence string;
        C44786o oVar2 = oVar;
        C89219l.m154721d(oVar2, "");
        View view = this.f105724f;
        C20766v a = C45562g.m88109a((Object) oVar2.f104491a).mo34179a("ShopProfileVH");
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        Context context = view2.getContext();
        C89219l.m154716b(context, "");
        a.f49126w = C44953g.m87644a(context);
        a.f49092E = (SmartImageView) view.findViewById(R.id.dzy);
        a.mo34186c();
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dzz);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(oVar2.f104492b);
        Long l = oVar2.f104493c;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        int i = 0;
        if (j > 1) {
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            Context context2 = view3.getContext();
            C89219l.m154716b(context2, "");
            string = context2.getResources().getString(R.string.bfz, Long.valueOf(j));
        } else {
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            Context context3 = view4.getContext();
            C89219l.m154716b(context3, "");
            string = context3.getResources().getString(R.string.bf9, Long.valueOf(j));
        }
        C89219l.m154716b(string, "");
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.d73);
        C89219l.m154716b(tuxTextView2, "");
        if (C89361p.m154888a(string, String.valueOf(j), 0, false, 6) != -1) {
            string = C45573n.m88118a(string, String.valueOf(j));
        }
        tuxTextView2.setText(string);
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.d73);
        C89219l.m154716b(tuxTextView3, "");
        if (j == 0) {
            i = 8;
        }
        tuxTextView3.setVisibility(i);
        View findViewById = view.findViewById(R.id.e01);
        C89219l.m154716b(findViewById, "");
        findViewById.setOnClickListener(new C45372b(view, this, oVar2));
    }
}

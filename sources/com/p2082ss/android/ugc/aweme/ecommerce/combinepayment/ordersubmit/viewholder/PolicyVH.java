package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43744e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44088q;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44089r;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH */
public final class PolicyVH extends JediSimpleViewHolder<C43744e> implements AbstractC33974au {

    /* renamed from: j */
    public static final C43917b f102389j = new C43917b((byte) 0);

    /* renamed from: f */
    final AbstractC89244h f102390f;

    /* renamed from: g */
    public final View f102391g;

    static {
        Covode.recordClassIndex(52203);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH$b */
    public static final class C43917b {
        static {
            Covode.recordClassIndex(52205);
        }

        private C43917b() {
        }

        public /* synthetic */ C43917b(byte b) {
            this();
        }

        /* renamed from: a */
        public static HashMap<String, Object> m86824a(String str, boolean z) {
            HashMap<String, Object> hashMap = new HashMap<>();
            if (str != null) {
                hashMap.put("__INTERNAL_ROUTE__", str);
            }
            hashMap.put("disableBounces", 1);
            if (!z) {
                hashMap.put("__status_bar", true);
                hashMap.put("hide_nav_bar", 1);
                hashMap.put("container_color_auto_dark", 1);
                hashMap.put("should_full_screen", 1);
            } else {
                hashMap.put("use_webview_title", 1);
            }
            return hashMap;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        C44998a.C44999a.m87685a(this.f102391g, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH$a */
    public static final class C43916a extends AbstractC89220m implements AbstractC89171a<OrderSubmitViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f102392a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f102393b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f102394c;

        static {
            Covode.recordClassIndex(52204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43916a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f102392a = jediViewHolder;
            this.f102393b = cVar;
            this.f102394c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH.C43916a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_PolicyVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86823xed6eb688(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH$d */
    public static final class C43919d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ View f102398a;

        static {
            Covode.recordClassIndex(52207);
        }

        C43919d(View view) {
            this.f102398a = view;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f102398a.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            IBulletService f = BulletService.m71938f();
            Context context = this.f102398a.getContext();
            C89219l.m154716b(context, "");
            String uri = C45264j.m87841a("https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_law/index.html", C43917b.m86824a("/service", false)).build().toString();
            C89219l.m154716b(uri, "");
            f.mo61852a(context, uri);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH$e */
    public static final class C43920e extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ View f102399a;

        static {
            Covode.recordClassIndex(52208);
        }

        C43920e(View view) {
            this.f102399a = view;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f102399a.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            IBulletService f = BulletService.m71938f();
            Context context = this.f102399a.getContext();
            C89219l.m154716b(context, "");
            String uri = C45264j.m87841a("https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_law/index.html", C43917b.m86824a("/policy", false)).build().toString();
            C89219l.m154716b(uri, "");
            f.mo61852a(context, uri);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH$c */
    public static final class C43918c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ View f102395a;

        /* renamed from: b */
        final /* synthetic */ PolicyVH f102396b;

        /* renamed from: c */
        final /* synthetic */ C43744e f102397c;

        static {
            Covode.recordClassIndex(52206);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f102395a.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C44089r paymentMethods;
            C44088q qVar;
            List<String> list;
            String str;
            C89219l.m154721d(view, "");
            BillInfoData billInfoData = ((OrderSubmitViewModel) this.f102396b.f102390f.getValue()).f101789k;
            if (billInfoData != null && (paymentMethods = billInfoData.getPaymentMethods()) != null && (qVar = paymentMethods.f102825e) != null && (list = qVar.f102820b) != null && (str = (String) C89070n.m154583g((List) list)) != null) {
                IBulletService f = BulletService.m71938f();
                Context context = this.f102395a.getContext();
                C89219l.m154716b(context, "");
                String uri = C45264j.m87841a(str, C43917b.m86824a(null, true)).build().toString();
                C89219l.m154716b(uri, "");
                f.mo61852a(context, uri);
            }
        }

        C43918c(View view, PolicyVH policyVH, C43744e eVar) {
            this.f102395a = view;
            this.f102396b = policyVH;
            this.f102397c = eVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PolicyVH(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f102391g = view;
        AbstractC89277c a = C89204ab.m154669a(OrderSubmitViewModel.class);
        this.f102390f = C89250i.m154773a((AbstractC89171a) new C43916a(this, a, a));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C43744e eVar) {
        C43744e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        View view = this.f102391g;
        String string = view.getContext().getString(R.string.ful);
        C89219l.m154716b(string, "");
        String string2 = view.getContext().getString(R.string.fum);
        C89219l.m154716b(string2, "");
        String string3 = view.getContext().getString(R.string.bil);
        C89219l.m154716b(string3, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        int i = 0;
        String string4 = context.getResources().getString(R.string.bim, string, string2, string3);
        C89219l.m154716b(string4, "");
        int a = C89361p.m154888a((CharSequence) string4, string, 0, false, 6);
        int length = string.length() + a;
        int a2 = C89361p.m154888a((CharSequence) string4, string2, 0, false, 6);
        int length2 = string2.length() + a2;
        int a3 = C89361p.m154888a((CharSequence) string4, string3, 0, false, 6);
        int length3 = string3.length() + a3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string4);
        if (a >= 0 && length < string4.length()) {
            spannableStringBuilder.setSpan(new StyleSpan(1), a, length, 17);
            spannableStringBuilder.setSpan(new C43919d(view), a, length, 17);
        }
        if (a2 >= 0 && length2 < string4.length()) {
            spannableStringBuilder.setSpan(new StyleSpan(1), a2, length2, 17);
            spannableStringBuilder.setSpan(new C43920e(view), a2, length2, 17);
        }
        if (a3 >= 0 && length3 < string4.length()) {
            spannableStringBuilder.setSpan(new StyleSpan(1), a3, length3, 17);
            spannableStringBuilder.setSpan(new C43918c(view, this, eVar2), a3, length3, 17);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.d3n);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(spannableStringBuilder);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.d3n);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setClickable(true);
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.d3n);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        if (!eVar2.f101977a) {
            i = 8;
        }
        view.setVisibility(i);
    }
}

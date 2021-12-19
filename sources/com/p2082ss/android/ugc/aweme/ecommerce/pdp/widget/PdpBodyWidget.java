package com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.C20624b;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.p2835a.C44323a;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.p2818a.C43314b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44770d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2849a.C44681b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44712f;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44760v;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.AbstractC44779h;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44774d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44778g;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44781j;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44784m;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44786o;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.C44955i;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.C45183b;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45565j;
import com.p2082ss.android.ugc.aweme.ecommerce.util.ScrollTopLinearLayoutManager;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.FixedRecyclerView;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget */
public final class PdpBodyWidget extends JediBaseWidget implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    public static final C45015b f105008k = new C45015b((byte) 0);

    /* renamed from: h */
    public final float f105009h = (((float) C45563h.f106106b) - C45563h.m88110a());

    /* renamed from: i */
    public final float f105010i = C13628n.m24520b(C17879g.m33104a(), 44.0f);

    /* renamed from: j */
    public final Fragment f105011j;

    /* renamed from: l */
    private final AbstractC89244h f105012l;

    /* renamed from: m */
    private final AbstractC89244h f105013m = C89250i.m154773a((AbstractC89171a) new C45016c(this));

    /* renamed from: n */
    private final ViewTreeObserver.OnGlobalLayoutListener f105014n = new ViewTreeObserver$OnGlobalLayoutListenerC45035n(this);

    static {
        Covode.recordClassIndex(53438);
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: b */
    public final int mo39079b() {
        return R.layout.pi;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(343, new RunnableC90250g(PdpBodyWidget.class, "onRefreshPdp", C44760v.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: l */
    public final PdpViewModel mo76157l() {
        return (PdpViewModel) this.f105012l.getValue();
    }

    /* renamed from: m */
    public final C44681b mo76158m() {
        return (C44681b) this.f105013m.getValue();
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$b */
    public static final class C45015b {
        static {
            Covode.recordClassIndex(53440);
        }

        private C45015b() {
        }

        public /* synthetic */ C45015b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$c */
    static final class C45016c extends AbstractC89220m implements AbstractC89171a<C44681b> {

        /* renamed from: a */
        final /* synthetic */ PdpBodyWidget f105018a;

        static {
            Covode.recordClassIndex(53441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45016c(PdpBodyWidget pdpBodyWidget) {
            super(0);
            this.f105018a = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C44681b invoke() {
            C44681b bVar = new C44681b(this.f105018a.f105011j);
            bVar.mo67829d(false);
            return bVar;
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: e */
    public final void mo39083e() {
        super.mo39083e();
        C44720k kVar = mo76157l().f104162s;
        if (kVar != null) {
            kVar.f104323f = SystemClock.elapsedRealtime();
            kVar.f104319b = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: n */
    public final void mo76159n() {
        FixedRecyclerView fixedRecyclerView;
        ViewTreeObserver viewTreeObserver;
        int i = Build.VERSION.SDK_INT;
        View view = this.f56005e;
        if (view != null && (fixedRecyclerView = (FixedRecyclerView) view.findViewById(R.id.dgn)) != null && (viewTreeObserver = fixedRecyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f105014n);
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: h */
    public final void mo39086h() {
        C44720k kVar;
        super.mo39086h();
        if (ActivityStack.isAppBackGround() && (kVar = mo76157l().f104162s) != null) {
            kVar.mo75859a("close");
        }
        C44720k kVar2 = mo76157l().f104162s;
        long j = 0;
        if (kVar2 != null) {
            long j2 = kVar2.f104319b;
            if (j2 != 0) {
                j = SystemClock.elapsedRealtime() - j2;
            }
        }
        ExecutorC34605m.f81660a.execute(new RunnableC45036o(this, j));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$a */
    public static final class C45014a extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f105015a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f105016b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105017c;

        static {
            Covode.recordClassIndex(53439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45014a(Widget widget, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f105015a = widget;
            this.f105016b = cVar;
            this.f105017c = cVar2;
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.C45014a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_widget_PdpBodyWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87712xea789f31(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: i */
    public final void mo39087i() {
        String str;
        String str2;
        int i;
        super.mo39087i();
        Activity k = mo60928k();
        C44766a aVar = C44766a.f104446e.get(k);
        if (aVar != null) {
            aVar.f104447f--;
            if (aVar.f104447f == 0) {
                C44766a.f104446e.remove(k);
            }
        }
        mo76157l();
        ProductPackStruct productPackStruct = mo76157l().f104150d;
        if (productPackStruct == null || (str = productPackStruct.f104674b) == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
        C45183b remove = C45183b.f105321e.remove(str);
        if (remove != null) {
            remove.f105323b.mo33461c();
            remove.f105325d = null;
        }
        mo76159n();
        C80298cg.m139205b(this);
        C44323a.f103368a.clear();
        ProductPackStruct productPackStruct2 = mo76157l().f104150d;
        if (productPackStruct2 == null || (str2 = productPackStruct2.f104674b) == null) {
            str2 = "";
        }
        boolean z = mo76157l().f104149c;
        C89219l.m154721d(str2, "");
        if (z) {
            i = 2;
        } else {
            i = 3;
        }
        AbstractC81915c.m141874a(new C43314b(str2, 4, Integer.valueOf(i)));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$o */
    static final class RunnableC45036o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PdpBodyWidget f105046a;

        /* renamed from: b */
        final /* synthetic */ long f105047b;

        static {
            Covode.recordClassIndex(53461);
        }

        RunnableC45036o(PdpBodyWidget pdpBodyWidget, long j) {
            this.f105046a = pdpBodyWidget;
            this.f105047b = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
            if (r1 != null) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
            if (r1 == null) goto L_0x0052;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 203
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.RunnableC45036o.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$n */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC45035n implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ PdpBodyWidget f105045a;

        static {
            Covode.recordClassIndex(53460);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC45035n(PdpBodyWidget pdpBodyWidget) {
            this.f105045a = pdpBodyWidget;
        }

        public final void onGlobalLayout() {
            FixedRecyclerView fixedRecyclerView;
            String str;
            int i;
            long j;
            boolean z;
            VoucherInfo voucherInfo;
            List<Voucher> vouchers;
            View view = this.f105045a.f56005e;
            if (view != null && (fixedRecyclerView = (FixedRecyclerView) view.findViewById(R.id.dgn)) != null && fixedRecyclerView.getChildCount() > 0) {
                C44720k kVar = this.f105045a.mo76157l().f104162s;
                if (kVar != null) {
                    PdpViewModel l = this.f105045a.mo76157l();
                    C89219l.m154721d(l, "");
                    kVar.f104339v = true;
                    kVar.f104337t = SystemClock.elapsedRealtime();
                    boolean z2 = l.f104148b;
                    int i2 = l.f104161r;
                    int i3 = l.f104155l;
                    long j2 = kVar.f104318a.get("click_product_start_time");
                    if (j2 == null) {
                        j2 = -1L;
                    }
                    C89219l.m154716b(j2, "");
                    C44720k.C44729i iVar = new C44720k.C44729i(j2);
                    long j3 = kVar.f104337t - kVar.f104334q;
                    long j4 = kVar.f104336s - kVar.f104335r;
                    boolean z3 = kVar.f104338u;
                    Object obj = kVar.f104312B.getRequestParams().get("template");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    String str2 = (String) obj;
                    if (str2 == null) {
                        str2 = "tt_pdp_full";
                    }
                    long longValue = ((Number) iVar.invoke(Long.valueOf(SystemClock.elapsedRealtime()))).longValue();
                    long j5 = kVar.f104341x;
                    if (j5 != -1) {
                        j = SystemClock.elapsedRealtime() - j5;
                    } else {
                        j = -1;
                    }
                    new C44712f(z2, j3, j4, z3, i2, str2, i3, longValue, j, kVar.f104340w).mo76746c(kVar.f104318a);
                    ProductPackStruct productPackStruct = l.f104150d;
                    if (productPackStruct == null || (voucherInfo = productPackStruct.f104684l) == null || (vouchers = voucherInfo.getVouchers()) == null || vouchers.size() <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z4 = l.f104148b;
                    long j6 = kVar.f104318a.get("click_product_start_time");
                    if (j6 == null) {
                        j6 = -1L;
                    }
                    C89219l.m154716b(j6, "");
                    if (kVar.f104339v) {
                        C45544c.m88081a("tiktokec_enter_product_detail", new C44720k.C44735o(kVar, z4, j6, z));
                    }
                    kVar.mo75878c(l.f104148b);
                    C45544c.m88081a("ViewContent", new C44720k.C44723c(kVar));
                }
                ProductPackStruct productPackStruct2 = this.f105045a.mo76157l().f104150d;
                if (productPackStruct2 == null || (str = productPackStruct2.f104674b) == null) {
                    str = "";
                }
                boolean z5 = this.f105045a.mo76157l().f104148b;
                C89219l.m154721d(str, "");
                if (z5) {
                    i = 2;
                } else {
                    i = 3;
                }
                AbstractC81915c.m141874a(new C43314b(str, 1, Integer.valueOf(i)));
                int i4 = Build.VERSION.SDK_INT;
                this.f105045a.mo76159n();
            }
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: c */
    public final void mo39080c() {
        Context context;
        FixedRecyclerView fixedRecyclerView;
        View view;
        TuxStatusView tuxStatusView;
        Context context2;
        View view2;
        TuxStatusView tuxStatusView2;
        FixedRecyclerView fixedRecyclerView2;
        float f;
        super.mo39080c();
        View view3 = this.f56005e;
        if (!(view3 == null || (context = view3.getContext()) == null)) {
            View view4 = this.f56005e;
            if (!(view4 == null || (fixedRecyclerView2 = (FixedRecyclerView) view4.findViewById(R.id.dgn)) == null)) {
                fixedRecyclerView2.setAdapter(mo76158m());
                float b = C13628n.m24520b(C17879g.m33104a(), 84.0f) + ((float) mo76157l().mo75824b());
                ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
                scrollTopLinearLayoutManager.f106089a = ((int) b) + 1;
                fixedRecyclerView2.setLayoutManager(scrollTopLinearLayoutManager);
                fixedRecyclerView2.mo4402a(new C44998a(C0643b.m2378c(context, R.color.b6), (int) C13628n.m24520b(context, 0.5f), C13628n.m24520b(context, 16.0f)));
                float f2 = (float) C45563h.f106106b;
                IPdpStarter.PdpEnterParam pdpEnterParam = mo76157l().f104147a;
                if (pdpEnterParam != null) {
                    f = pdpEnterParam.getExpandHeight();
                } else {
                    f = 0.0f;
                }
                fixedRecyclerView2.mo4405a(new C45017d(this, (f2 - f) + b));
                fixedRecyclerView2.getViewTreeObserver().addOnGlobalLayoutListener(this.f105014n);
                C80330da.C80331a.m139266a("tiktokec_anchor_product_detail").mo123698a(fixedRecyclerView2);
            }
            View view5 = this.f56005e;
            if (!(view5 == null || (fixedRecyclerView = (FixedRecyclerView) view5.findViewById(R.id.dgn)) == null)) {
                C89233z.C89234a aVar = new C89233z.C89234a();
                aVar.element = true;
                AbstractC88412b unused = selectSubscribe(mo76157l(), C45062a.f105102a, new C20370ah(), new C45029j(this, aVar, fixedRecyclerView));
                AbstractC88412b unused2 = selectSubscribe(mo76157l(), C45066e.f105106a, C45067f.f105107a, new C20370ah(), new C45032k(this));
                AbstractC88412b unused3 = selectSubscribe(mo76157l(), C45068g.f105108a, C45069h.f105109a, new C20370ah(), new C45033l(this, fixedRecyclerView));
                View view6 = this.f56005e;
                if (view6 != null) {
                    view = view6.findViewById(R.id.ae7);
                } else {
                    view = null;
                }
                AbstractC88412b unused4 = selectSubscribe(mo76157l(), C45070i.f105110a, new C20370ah(), new C45018e(view));
                mo76157l().mo75829g(new C45019f(this));
                if (!(mo76157l().f104148b || (view2 = this.f56005e) == null || (tuxStatusView2 = (TuxStatusView) view2.findViewById(R.id.e77)) == null)) {
                    C23163i.m43660a((View) tuxStatusView2, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf((int) this.f105009h), false, 23);
                }
                View view7 = this.f56005e;
                if (!(view7 == null || (tuxStatusView = (TuxStatusView) view7.findViewById(R.id.e77)) == null)) {
                    View view8 = this.f56005e;
                    if (view8 != null) {
                        context2 = view8.getContext();
                    } else {
                        context2 = null;
                    }
                    View a = C44766a.m87492a(context2, R.layout.pk, null, false);
                    C89219l.m154716b(a, "");
                    tuxStatusView.mo37868a(a);
                }
                AbstractC88412b unused5 = selectSubscribe(mo76157l(), C45063b.f105103a, new C20370ah(), new C45020g(this));
                AbstractC88412b unused6 = selectSubscribe(mo76157l(), C45064c.f105104a, new C20370ah(), new C45023h(this));
                AbstractC88412b unused7 = selectSubscribe(mo76157l(), C45065d.f105105a, new C20370ah(), new C45026i(this));
                C80298cg.m139204a(this);
            }
        }
        View view9 = this.f56005e;
        if (view9 != null) {
            CardView cardView = (CardView) view9.findViewById(R.id.el0);
            C89219l.m154716b(cardView, "");
            cardView.setVisibility(8);
            ((CardView) view9.findViewById(R.id.el0)).setOnClickListener(new View$OnClickListenerC45034m(view9, this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$f */
    static final class C45019f extends AbstractC89220m implements AbstractC89172b<Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpBodyWidget f105025a;

        static {
            Covode.recordClassIndex(53444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45019f(PdpBodyWidget pdpBodyWidget) {
            super(1);
            this.f105025a = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Float f) {
            TuxStatusView tuxStatusView;
            float floatValue = f.floatValue();
            View view = this.f105025a.f56005e;
            if (!(view == null || (tuxStatusView = (TuxStatusView) view.findViewById(R.id.e77)) == null)) {
                C23163i.m43660a((View) tuxStatusView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf((int) (this.f105025a.f105009h * (1.0f - floatValue))), false, 23);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$m */
    static final class View$OnClickListenerC45034m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f105043a;

        /* renamed from: b */
        final /* synthetic */ PdpBodyWidget f105044b;

        static {
            Covode.recordClassIndex(53459);
        }

        View$OnClickListenerC45034m(View view, PdpBodyWidget pdpBodyWidget) {
            this.f105043a = view;
            this.f105044b = pdpBodyWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C44720k kVar = this.f105044b.mo76157l().f104162s;
            if (kVar != null) {
                kVar.mo75873b("to_top", (HashMap<String, Object>) null);
            }
            ((RecyclerView) this.f105043a.findViewById(R.id.dgn)).mo4435d(0);
        }
    }

    @AbstractC90264r
    public final void onRefreshPdp(C44760v vVar) {
        String str;
        C89219l.m154721d(vVar, "");
        String str2 = vVar.f104424a;
        ProductPackStruct productPackStruct = mo76157l().f104150d;
        if (productPackStruct != null) {
            str = productPackStruct.f104674b;
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str2, (Object) str)) {
            mo76157l().mo75822a(false, true);
        }
    }

    public PdpBodyWidget(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f105011j = fragment;
        AbstractC89277c a = C89204ab.m154669a(PdpViewModel.class);
        this.f105012l = C89250i.m154773a((AbstractC89171a) new C45014a(this, a, a));
    }

    /* renamed from: a */
    public final void mo76156a(RecyclerView recyclerView) {
        int i;
        Float f;
        String str;
        C44774d dVar;
        C44774d dVar2;
        Price price;
        C44774d dVar3;
        Price price2;
        String priceVal;
        Context context = recyclerView.getContext();
        C89219l.m154716b(context, "");
        float dimension = context.getResources().getDimension(R.dimen.ff);
        int[] iArr = new int[2];
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int k = linearLayoutManager.mo4371k();
        int m = linearLayoutManager.mo4373m();
        if (k <= m) {
            while (true) {
                View c = linearLayoutManager.mo4358c(k);
                if (c != null) {
                    C89219l.m154716b(c, "");
                    String str2 = null;
                    Object tag = c.getTag(R.id.aaq);
                    if (!(tag instanceof C44955i)) {
                        tag = null;
                    }
                    C44955i iVar = (C44955i) tag;
                    if (iVar != null) {
                        c.getLocationInWindow(iArr);
                        int i2 = iArr[1];
                        View view = this.f56005e;
                        if (view != null) {
                            i = view.getHeight();
                        } else {
                            i = 0;
                        }
                        int i3 = (int) (((float) i) - dimension);
                        if (i2 >= i3 || i2 <= 0) {
                            if (iVar.f104892b) {
                                iVar.f104892b = false;
                            }
                        } else if (!iVar.f104892b) {
                            iVar.f104892b = true;
                            if (iVar.f104891a instanceof AbstractC44779h) {
                                Object obj = iVar.f104891a;
                                if (!(obj instanceof C44781j)) {
                                    obj = null;
                                }
                                C44781j jVar = (C44781j) obj;
                                if (jVar == null || (dVar3 = jVar.f104485a) == null || (price2 = dVar3.f104457a) == null || (priceVal = price2.getPriceVal()) == null) {
                                    f = null;
                                } else {
                                    f = C89361p.m154861c(priceVal);
                                }
                                Object obj2 = iVar.f104891a;
                                if (!(obj2 instanceof C44781j)) {
                                    obj2 = null;
                                }
                                C44781j jVar2 = (C44781j) obj2;
                                if (jVar2 == null || (dVar2 = jVar2.f104485a) == null || (price = dVar2.f104457a) == null) {
                                    str = null;
                                } else {
                                    str = price.getCurrency();
                                }
                                Object obj3 = iVar.f104891a;
                                if (!(obj3 instanceof C44781j)) {
                                    obj3 = null;
                                }
                                C44781j jVar3 = (C44781j) obj3;
                                if (!(jVar3 == null || (dVar = jVar3.f104485a) == null)) {
                                    str2 = dVar.f104465i;
                                }
                                C44720k kVar = mo76157l().f104162s;
                                if (kVar != null) {
                                    C44720k.m87440a(kVar, ((AbstractC44779h) iVar.f104891a).mo75904a(), mo76157l().f104148b, f, str, str2, 16);
                                }
                            } else if (!(iVar.f104891a instanceof C44784m) || !C89219l.m154714a((Object) ((C44784m) iVar.f104891a).f104489b, (Object) "title")) {
                                if (iVar.f104891a instanceof C44786o) {
                                    C44720k kVar2 = mo76157l().f104162s;
                                    if (kVar2 != null) {
                                        C44720k.m87440a(kVar2, "showcase_detail", mo76157l().f104148b, null, null, null, 60);
                                    }
                                } else if (iVar.f104891a instanceof C44778g) {
                                    C44720k kVar3 = mo76157l().f104162s;
                                    if (kVar3 != null) {
                                        kVar3.mo75853a((C44778g) iVar.f104891a);
                                    }
                                } else if ((iVar.f104891a instanceof ProductDetailReview) || (iVar.f104891a instanceof ReviewItemStruct)) {
                                    C44720k kVar4 = mo76157l().f104162s;
                                    if (kVar4 != null) {
                                        kVar4.mo75852a();
                                    }
                                    if (iVar.f104891a instanceof ReviewItemStruct) {
                                        C44720k kVar5 = mo76157l().f104162s;
                                        if (kVar5 != null) {
                                            kVar5.mo75855a((ReviewItemStruct) iVar.f104891a);
                                        }
                                        C44720k kVar6 = mo76157l().f104162s;
                                        if (kVar6 != null) {
                                            kVar6.mo75869b((ReviewItemStruct) iVar.f104891a);
                                        }
                                    }
                                }
                            } else if (i2 < i3 / 2) {
                                iVar.f104892b = true;
                            }
                        }
                    }
                    if (k != m) {
                        k++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$d */
    public static final class C45017d extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        public boolean f105019a;

        /* renamed from: b */
        public int f105020b;

        /* renamed from: c */
        public int f105021c;

        /* renamed from: d */
        final /* synthetic */ PdpBodyWidget f105022d;

        /* renamed from: e */
        final /* synthetic */ float f105023e;

        static {
            Covode.recordClassIndex(53442);
        }

        C45017d(PdpBodyWidget pdpBodyWidget, float f) {
            this.f105022d = pdpBodyWidget;
            this.f105023e = f;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i != this.f105020b && i == 0 && this.f105019a) {
                C44720k kVar = this.f105022d.mo76157l().f104162s;
                if (kVar != null) {
                    kVar.mo75877c("fulltodetail");
                }
                this.f105019a = false;
            }
            this.f105020b = i;
            if (i == 0) {
                this.f105022d.mo76157l().mo75818a(recyclerView, (int) this.f105023e, true);
            } else if (i != 1) {
                return;
            }
            this.f105022d.mo76157l().f104167x = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            this.f105019a = true;
            this.f105021c += i2;
            this.f105022d.mo76157l().mo33689c(new PdpViewModel.C44638aa(this.f105021c));
            this.f105022d.mo76157l().mo75818a(recyclerView, (int) this.f105023e, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$e */
    static final class C45018e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f105024a;

        static {
            Covode.recordClassIndex(53443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45018e(View view) {
            super(2);
            this.f105024a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Float f) {
            float floatValue = f.floatValue();
            C89219l.m154721d(iVar, "");
            View view = this.f105024a;
            if (view != null) {
                view.setAlpha(1.0f - floatValue);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$j */
    static final class C45029j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpBodyWidget f105035a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f105036b;

        /* renamed from: c */
        final /* synthetic */ FixedRecyclerView f105037c;

        static {
            Covode.recordClassIndex(53454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45029j(PdpBodyWidget pdpBodyWidget, C89233z.C89234a aVar, FixedRecyclerView fixedRecyclerView) {
            super(2);
            this.f105035a = pdpBodyWidget;
            this.f105036b = aVar;
            this.f105037c = fixedRecyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            List<? extends Object> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            if (!list2.isEmpty()) {
                this.f105035a.mo76158m().mo33763a(list2, new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.C45029j.C450301 */

                    /* renamed from: a */
                    final /* synthetic */ C45029j f105038a;

                    static {
                        Covode.recordClassIndex(53455);
                    }

                    {
                        this.f105038a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        View view;
                        if (this.f105038a.f105036b.element && (view = this.f105038a.f105035a.f56005e) != null) {
                            view.post(new Runnable(this) {
                                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.C45029j.C450301.RunnableC450311 */

                                /* renamed from: a */
                                final /* synthetic */ C450301 f105039a;

                                static {
                                    Covode.recordClassIndex(53456);
                                }

                                {
                                    this.f105039a = r1;
                                }

                                public final void run() {
                                    this.f105039a.f105038a.f105035a.mo76156a((RecyclerView) this.f105039a.f105038a.f105037c);
                                }
                            });
                        }
                        return C89391z.f203057a;
                    }
                });
                this.f105036b.element = false;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$h */
    static final class C45023h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C44770d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpBodyWidget f105029a;

        static {
            Covode.recordClassIndex(53448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45023h(PdpBodyWidget pdpBodyWidget) {
            super(2);
            this.f105029a = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C44770d dVar) {
            RecyclerView recyclerView;
            AbstractC20477i iVar2 = iVar;
            C44770d dVar2 = dVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(dVar2, "");
            if (dVar2.f104452b) {
                int i = dVar2.f104451a;
                if (i == 0) {
                    View view = this.f105029a.f56005e;
                    if (!(view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.dgn)) == null)) {
                        recyclerView.mo4435d(0);
                    }
                } else if (i == 1) {
                    iVar2.withState(this.f105029a.mo76157l(), new AbstractC89172b<PdpMainState, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.C45023h.C450241 */

                        /* renamed from: a */
                        final /* synthetic */ C45023h f105030a;

                        static {
                            Covode.recordClassIndex(53449);
                        }

                        {
                            this.f105030a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(PdpMainState pdpMainState) {
                            View view;
                            RecyclerView recyclerView;
                            PdpMainState pdpMainState2 = pdpMainState;
                            C89219l.m154721d(pdpMainState2, "");
                            Iterator<Object> it = pdpMainState2.getContentList().iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (!(it.next() instanceof ProductDetailReview)) {
                                    i++;
                                } else if (i >= 0 && (view = this.f105030a.f105029a.f56005e) != null && (recyclerView = (RecyclerView) view.findViewById(R.id.dgn)) != null) {
                                    recyclerView.mo4435d(i);
                                }
                            }
                            return C89391z.f203057a;
                        }
                    });
                } else if (i == 2) {
                    iVar2.withState(this.f105029a.mo76157l(), new AbstractC89172b<PdpMainState, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.C45023h.C450252 */

                        /* renamed from: a */
                        final /* synthetic */ C45023h f105031a;

                        static {
                            Covode.recordClassIndex(53450);
                        }

                        {
                            this.f105031a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(PdpMainState pdpMainState) {
                            View view;
                            RecyclerView recyclerView;
                            PdpMainState pdpMainState2 = pdpMainState;
                            C89219l.m154721d(pdpMainState2, "");
                            Iterator<Object> it = pdpMainState2.getContentList().iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (!(it.next() instanceof C44784m)) {
                                    i++;
                                } else if (i >= 0 && (view = this.f105031a.f105029a.f56005e) != null && (recyclerView = (RecyclerView) view.findViewById(R.id.dgn)) != null) {
                                    recyclerView.mo4435d(i);
                                }
                            }
                            return C89391z.f203057a;
                        }
                    });
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$i */
    static final class C45026i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpBodyWidget f105032a;

        static {
            Covode.recordClassIndex(53451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45026i(PdpBodyWidget pdpBodyWidget) {
            super(2);
            this.f105032a = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            Integer num2 = num;
            C89219l.m154721d(iVar, "");
            if (num2 != null && num2.intValue() == 3) {
                ActivityC0945e b = C20624b.m38846b(this.f105032a);
                Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                AbstractC1196i lifecycle = b.getLifecycle();
                C89219l.m154716b(lifecycle, "");
                if (lifecycle.mo4011a() == AbstractC1196i.EnumC1199b.RESUMED) {
                    C23028c.m43435a((C23023b) C23013a.C23015a.m43405a(C20624b.m38846b(this.f105032a)).mo37479a(R.string.bhu).mo37483b(R.string.bht), new AbstractC89172b<C23025b, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.C45026i.C450271 */

                        /* renamed from: a */
                        final /* synthetic */ C45026i f105033a;

                        static {
                            Covode.recordClassIndex(53452);
                        }

                        {
                            this.f105033a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C23025b bVar) {
                            C23025b bVar2 = bVar;
                            C89219l.m154721d(bVar2, "");
                            bVar2.mo37416a(R.string.fv_, new AbstractC89172b<C23024a, C89391z>(this) {
                                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.C45026i.C450271.C450281 */

                                /* renamed from: a */
                                final /* synthetic */ C450271 f105034a;

                                static {
                                    Covode.recordClassIndex(53453);
                                }

                                {
                                    this.f105034a = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                    C89219l.m154721d(aVar, "");
                                    if (this.f105034a.f105033a.f105032a.mo76157l().f104162s != null) {
                                        C44720k.m87444b((Map<String, ? extends Object>) null);
                                    }
                                    return C89391z.f203057a;
                                }
                            });
                            return C89391z.f203057a;
                        }
                    }).mo37405a().mo37396b().show();
                    if (this.f105032a.mo76157l().f104162s != null) {
                        C44720k.m87443a((Map<String, ? extends Object>) null);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$g */
    static final class C45020g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpBodyWidget f105026a;

        static {
            Covode.recordClassIndex(53445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45020g(PdpBodyWidget pdpBodyWidget) {
            super(2);
            this.f105026a = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            TuxStatusView tuxStatusView;
            TuxStatusView tuxStatusView2;
            TuxStatusView tuxStatusView3;
            TuxStatusView tuxStatusView4;
            TuxStatusView tuxStatusView5;
            TuxStatusView tuxStatusView6;
            TuxStatusView tuxStatusView7;
            TuxStatusView tuxStatusView8;
            TuxStatusView tuxStatusView9;
            TuxStatusView tuxStatusView10;
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            View view = this.f105026a.f56005e;
            if (!(view == null || (tuxStatusView10 = (TuxStatusView) view.findViewById(R.id.e77)) == null)) {
                C23163i.m43660a((View) tuxStatusView10, (Integer) null, Integer.valueOf((int) this.f105026a.f105010i), (Integer) null, (Integer) null, false, 29);
            }
            if (intValue == -1) {
                View view2 = this.f105026a.f56005e;
                if (!(view2 == null || (tuxStatusView = (TuxStatusView) view2.findViewById(R.id.e77)) == null)) {
                    tuxStatusView.setVisibility(8);
                }
            } else if (intValue == 0) {
                View view3 = this.f105026a.f56005e;
                if (!(view3 == null || (tuxStatusView3 = (TuxStatusView) view3.findViewById(R.id.e77)) == null)) {
                    C23163i.m43660a((View) tuxStatusView3, (Integer) null, (Integer) 0, (Integer) null, (Integer) null, false, 29);
                }
                View view4 = this.f105026a.f56005e;
                if (!(view4 == null || (tuxStatusView2 = (TuxStatusView) view4.findViewById(R.id.e77)) == null)) {
                    tuxStatusView2.mo37867a();
                }
            } else if (intValue == 2) {
                View view5 = this.f105026a.f56005e;
                if (view5 != null) {
                    view5.setVisibility(0);
                }
                View view6 = this.f105026a.f56005e;
                if (!(view6 == null || (tuxStatusView4 = (TuxStatusView) view6.findViewById(R.id.e77)) == null)) {
                    tuxStatusView4.setStatus(C45565j.m88112a(true, new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.C45020g.C450211 */

                        /* renamed from: a */
                        final /* synthetic */ C45020g f105027a;

                        static {
                            Covode.recordClassIndex(53446);
                        }

                        {
                            this.f105027a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            this.f105027a.f105026a.mo76157l().mo75828g();
                            return C89391z.f203057a;
                        }
                    }));
                }
            } else if (intValue == 3) {
                View view7 = this.f105026a.f56005e;
                if (view7 != null) {
                    view7.setVisibility(0);
                }
                View view8 = this.f105026a.f56005e;
                if (!(view8 == null || (tuxStatusView5 = (TuxStatusView) view8.findViewById(R.id.e77)) == null)) {
                    tuxStatusView5.setStatus(C45565j.m88113b(true, new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.C45020g.C450222 */

                        /* renamed from: a */
                        final /* synthetic */ C45020g f105028a;

                        static {
                            Covode.recordClassIndex(53447);
                        }

                        {
                            this.f105028a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            this.f105028a.f105026a.mo76157l().mo75828g();
                            return C89391z.f203057a;
                        }
                    }));
                }
            } else if (intValue == 4) {
                View view9 = this.f105026a.f56005e;
                if (!(view9 == null || (tuxStatusView7 = (TuxStatusView) view9.findViewById(R.id.e77)) == null)) {
                    tuxStatusView7.setVisibility(0);
                }
                View view10 = this.f105026a.f56005e;
                if (!(view10 == null || (tuxStatusView6 = (TuxStatusView) view10.findViewById(R.id.e77)) == null)) {
                    TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                    String string = C20624b.m38846b(this.f105026a).getString(R.string.bgt);
                    C89219l.m154716b(string, "");
                    cVar.mo37879a(string);
                    String string2 = C20624b.m38846b(this.f105026a).getString(R.string.bgs);
                    C89219l.m154716b(string2, "");
                    cVar.mo37878a((CharSequence) string2);
                    cVar.mo37876a(0, R.drawable.yv);
                    tuxStatusView6.setStatus(cVar);
                }
            } else if (intValue == 5) {
                View view11 = this.f105026a.f56005e;
                if (!(view11 == null || (tuxStatusView9 = (TuxStatusView) view11.findViewById(R.id.e77)) == null)) {
                    tuxStatusView9.setVisibility(0);
                }
                View view12 = this.f105026a.f56005e;
                if (!(view12 == null || (tuxStatusView8 = (TuxStatusView) view12.findViewById(R.id.e77)) == null)) {
                    TuxStatusView.C23263c cVar2 = new TuxStatusView.C23263c();
                    String string3 = C20624b.m38846b(this.f105026a).getString(R.string.bgv);
                    C89219l.m154716b(string3, "");
                    cVar2.mo37879a(string3);
                    String string4 = C20624b.m38846b(this.f105026a).getString(R.string.bgu);
                    C89219l.m154716b(string4, "");
                    cVar2.mo37878a((CharSequence) string4);
                    cVar2.mo37876a(0, R.drawable.z4);
                    tuxStatusView8.setStatus(cVar2);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$l */
    static final class C45033l extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Float, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpBodyWidget f105041a;

        /* renamed from: b */
        final /* synthetic */ FixedRecyclerView f105042b;

        static {
            Covode.recordClassIndex(53458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45033l(PdpBodyWidget pdpBodyWidget, FixedRecyclerView fixedRecyclerView) {
            super(3);
            this.f105041a = pdpBodyWidget;
            this.f105042b = fixedRecyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Float f, Integer num) {
            f.floatValue();
            num.intValue();
            C89219l.m154721d(iVar, "");
            this.f105041a.mo76156a((RecyclerView) this.f105042b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget$k */
    static final class C45032k extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Integer, ProductDetailReview, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpBodyWidget f105040a;

        static {
            Covode.recordClassIndex(53457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45032k(PdpBodyWidget pdpBodyWidget) {
            super(3);
            this.f105040a = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num, ProductDetailReview productDetailReview) {
            CardView cardView;
            CardView cardView2;
            List<ReviewItemStruct> list;
            CardView cardView3;
            int intValue = num.intValue();
            ProductDetailReview productDetailReview2 = productDetailReview;
            C89219l.m154721d(iVar, "");
            if (productDetailReview2 != null && (list = productDetailReview2.f104666c) != null && (!list.isEmpty())) {
                View view = this.f105040a.f56005e;
                if (!(view == null || (cardView3 = (CardView) view.findViewById(R.id.el0)) == null)) {
                    cardView3.setVisibility(8);
                }
            } else if (intValue < C45563h.f106106b) {
                View view2 = this.f105040a.f56005e;
                if (!(view2 == null || (cardView2 = (CardView) view2.findViewById(R.id.el0)) == null)) {
                    cardView2.setVisibility(8);
                }
            } else {
                C44720k kVar = this.f105040a.mo76157l().f104162s;
                if (kVar != null) {
                    kVar.mo75864a("to_top", (HashMap<String, Object>) null);
                }
                View view3 = this.f105040a.f56005e;
                if (!(view3 == null || (cardView = (CardView) view3.findViewById(R.id.el0)) == null)) {
                    cardView.setVisibility(0);
                }
            }
            return C89391z.f203057a;
        }
    }
}

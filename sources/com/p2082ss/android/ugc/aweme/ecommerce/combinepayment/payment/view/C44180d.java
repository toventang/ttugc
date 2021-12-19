package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44071a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d */
public final class C44180d extends LinearLayout {

    /* renamed from: a */
    private final int f103023a;

    /* renamed from: b */
    private final int f103024b;

    /* renamed from: c */
    private final int f103025c;

    /* renamed from: d */
    private final C20745e f103026d;

    /* renamed from: e */
    private final View f103027e;

    /* renamed from: f */
    private PaymentViewModel f103028f;

    /* renamed from: g */
    private AbstractC89172b<? super String, C89391z> f103029g;

    /* renamed from: h */
    private boolean f103030h;

    /* renamed from: i */
    private C44086o f103031i;

    /* renamed from: j */
    private SparseArray f103032j;

    static {
        Covode.recordClassIndex(52491);
    }

    /* renamed from: a */
    public final View mo75037a(int i) {
        if (this.f103032j == null) {
            this.f103032j = new SparseArray();
        }
        View view = (View) this.f103032j.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103032j.put(i, findViewById);
        return findViewById;
    }

    public final C20745e getCircleOption() {
        return this.f103026d;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.String, h.z>, h.f.a.b<java.lang.String, h.z> */
    public final AbstractC89172b<String, C89391z> getOnCheckedListener() {
        return this.f103029g;
    }

    public final C44086o getPaymentMethod() {
        return this.f103031i;
    }

    public final PaymentViewModel getPaymentViewModel() {
        return this.f103028f;
    }

    private final List<String> getAllCardIcons() {
        List<C44086o> list;
        C44086o oVar = this.f103031i;
        if (oVar == null || (list = oVar.f102801h) == null) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().f102798e;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d$b */
    static final class RunnableC44183b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f103035a;

        /* renamed from: b */
        final /* synthetic */ C44180d f103036b;

        static {
            Covode.recordClassIndex(52494);
        }

        RunnableC44183b(String str, C44180d dVar) {
            this.f103035a = str;
            this.f103036b = dVar;
        }

        public final void run() {
            TuxTextView tuxTextView = (TuxTextView) this.f103036b.mo75037a(R.id.ajd);
            C89219l.m154716b(tuxTextView, "");
            TextPaint paint = tuxTextView.getPaint();
            C89219l.m154716b(paint, "");
            TuxTextView tuxTextView2 = (TuxTextView) this.f103036b.mo75037a(R.id.ajd);
            C89219l.m154716b(tuxTextView2, "");
            paint.setTextSize(tuxTextView2.getTextSize());
            float measureText = paint.measureText(this.f103035a);
            TuxTextView tuxTextView3 = (TuxTextView) this.f103036b.mo75037a(R.id.ajd);
            C89219l.m154716b(tuxTextView3, "");
            if (measureText > ((float) tuxTextView3.getWidth())) {
                TuxTextView tuxTextView4 = (TuxTextView) this.f103036b.mo75037a(R.id.ajd);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
                this.f103036b.mo75038a(this.f103035a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d$a */
    static final class C44182a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        public static final C44182a f103034a = new C44182a();

        static {
            Covode.recordClassIndex(52493);
        }

        C44182a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(String str) {
            return C89391z.f203057a;
        }
    }

    public final void setPaymentViewModel(PaymentViewModel paymentViewModel) {
        this.f103028f = paymentViewModel;
    }

    public final void setOnCheckedListener(AbstractC89172b<? super String, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103029g = bVar;
    }

    /* renamed from: a */
    public final void mo75038a(String str) {
        TuxTextView tuxTextView = (TuxTextView) mo75037a(R.id.ea7);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = (TuxTextView) mo75037a(R.id.ea7);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44180d(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8092);
        this.f103023a = (int) C13628n.m24520b(context, 4.0f);
        this.f103024b = (int) C13628n.m24520b(context, 22.0f);
        this.f103025c = (int) C13628n.m24520b(context, 14.0f);
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48961e = C13628n.m24520b(context, 2.0f);
        this.f103026d = aVar.mo34169a();
        this.f103029g = C44182a.f103034a;
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        setBackgroundColor(C0643b.m2378c(context, R.color.r));
        View inflate = View.inflate(context, R.layout.pd, this);
        C89219l.m154716b(inflate, "");
        this.f103027e = inflate;
        inflate.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44180d.View$OnClickListenerC441811 */

            /* renamed from: a */
            final /* synthetic */ C44180d f103033a;

            static {
                Covode.recordClassIndex(52492);
            }

            {
                this.f103033a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                AbstractC89172b<String, C89391z> onCheckedListener = this.f103033a.getOnCheckedListener();
                C44086o paymentMethod = this.f103033a.getPaymentMethod();
                if (paymentMethod != null) {
                    str = paymentMethod.f102794a;
                } else {
                    str = null;
                }
                onCheckedListener.invoke(str);
            }
        });
        C0792v.m2746a(mo75037a(R.id.ddr), (Drawable) null);
        MethodCollector.m26664o(8092);
    }

    public final void setChecked(boolean z) {
        int i;
        MethodCollector.m26663i(7937);
        this.f103030h = z;
        TuxRadio tuxRadio = (TuxRadio) mo75037a(R.id.ddr);
        C89219l.m154716b(tuxRadio, "");
        tuxRadio.setChecked(z);
        C44086o oVar = this.f103031i;
        if (!C89219l.m154714a((Object) (oVar != null ? oVar.f102794a : null), (Object) "pm_pi_ccdc_all") || !z) {
            ((LinearLayout) mo75037a(R.id.a1s)).removeAllViews();
            MethodCollector.m26664o(7937);
            return;
        }
        List<String> allCardIcons = getAllCardIcons();
        ViewGroup viewGroup = (ViewGroup) mo75037a(R.id.a1s);
        viewGroup.removeAllViews();
        if (allCardIcons.size() > 6) {
            allCardIcons = allCardIcons.subList(0, 6);
        }
        C89219l.m154716b(viewGroup, "");
        int size = allCardIcons.size();
        for (int childCount = viewGroup.getChildCount(); childCount < size; childCount++) {
            SmartImageView smartImageView = new SmartImageView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f103024b, this.f103025c);
            layoutParams.weight = 1.0f;
            smartImageView.setLayoutParams(layoutParams);
            smartImageView.setBackgroundResource(R.drawable.xs);
            viewGroup.addView(smartImageView);
        }
        int childCount2 = viewGroup.getChildCount();
        for (int size2 = allCardIcons.size(); size2 < childCount2; size2++) {
            View childAt = viewGroup.getChildAt(size2);
            if (childAt != null) {
                childAt.setVisibility(8);
            }
        }
        Iterator it = C89070n.m154518a((Collection<?>) allCardIcons).iterator();
        while (it.hasNext()) {
            int a = ((AbstractC89040af) it).mo143429a();
            View childAt2 = viewGroup.getChildAt(a);
            if (childAt2 != null && (childAt2 instanceof SmartImageView)) {
                if (a != C89070n.m154517a((List) allCardIcons)) {
                    i = this.f103023a;
                } else {
                    i = 0;
                }
                C23163i.m43668b(childAt2, null, null, Integer.valueOf(i), null, false, 27);
                String str = allCardIcons.get(a);
                String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    str = null;
                }
                String str3 = str;
                if (str3 == null) {
                    str3 = " ";
                }
                C20766v a2 = C20761r.m39061a(str3);
                a2.f49115l = R.color.v;
                a2.f49125v = EnumC20767w.FIT_XY;
                a2.f49093F = (ImageView) childAt2;
                a2.mo34186c();
                ((SmartImageView) childAt2).setCircleOptions(this.f103026d);
            }
        }
        MethodCollector.m26664o(7937);
    }

    public final void setPaymentMethod(C44086o oVar) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        C44071a aVar;
        this.f103031i = oVar;
        Boolean bool2 = null;
        if (oVar != null) {
            str = oVar.f102798e;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0 || str == null) {
            str = " ";
        }
        C20766v a = C20761r.m39061a(str);
        a.f49115l = R.color.v;
        a.f49093F = (ImageView) this.f103027e.findViewById(R.id.czt);
        a.mo34186c();
        C20745e.C20746a aVar2 = new C20745e.C20746a();
        aVar2.f48961e = C13628n.m24520b(getContext(), 2.0f);
        ((SmartImageView) this.f103027e.findViewById(R.id.czt)).setCircleOptions(aVar2.mo34169a());
        TuxTextView tuxTextView = (TuxTextView) this.f103027e.findViewById(R.id.czu);
        C89219l.m154716b(tuxTextView, "");
        C44086o oVar2 = this.f103031i;
        if (oVar2 != null) {
            str2 = oVar2.f102795b;
        } else {
            str2 = null;
        }
        tuxTextView.setText(str2);
        ((TuxTextView) this.f103027e.findViewById(R.id.czu)).setTextColor(C0643b.m2378c(getContext(), R.color.bx));
        SmartImageView smartImageView = (SmartImageView) this.f103027e.findViewById(R.id.czt);
        C89219l.m154716b(smartImageView, "");
        smartImageView.setAlpha(1.0f);
        C44086o oVar3 = this.f103031i;
        if (!(oVar3 == null || (aVar = oVar3.f102813t) == null || !C89219l.m154714a((Object) false, (Object) aVar.f102725a))) {
            ((TuxTextView) this.f103027e.findViewById(R.id.czu)).setTextColor(C0643b.m2378c(getContext(), R.color.bz));
            SmartImageView smartImageView2 = (SmartImageView) this.f103027e.findViewById(R.id.czt);
            C89219l.m154716b(smartImageView2, "");
            smartImageView2.setAlpha(0.3f);
        }
        C44086o oVar4 = this.f103031i;
        if (oVar4 != null) {
            bool = oVar4.f102808o;
        } else {
            bool = null;
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            ((TuxTextView) mo75037a(R.id.ajd)).setBackgroundResource(R.drawable.xh);
            TuxTextView tuxTextView2 = (TuxTextView) mo75037a(R.id.ajd);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(getContext().getString(R.string.bib));
            ((TuxTextView) mo75037a(R.id.ajd)).setTextColor(C0643b.m2378c(getContext(), R.color.c5));
            TuxTextView tuxTextView3 = (TuxTextView) mo75037a(R.id.ajd);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setVisibility(0);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) mo75037a(R.id.ajd);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
        }
        C44086o oVar5 = this.f103031i;
        if (oVar5 == null || (str3 = oVar5.f102805l) == null || str3.length() <= 0) {
            TuxTextView tuxTextView5 = (TuxTextView) mo75037a(R.id.ea7);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
            return;
        }
        C44086o oVar6 = this.f103031i;
        if (oVar6 != null) {
            bool2 = oVar6.f102808o;
        }
        if (C89219l.m154714a((Object) bool2, (Object) true)) {
            mo75038a(str3);
            return;
        }
        TuxTextView tuxTextView6 = (TuxTextView) mo75037a(R.id.ajd);
        C89219l.m154716b(tuxTextView6, "");
        tuxTextView6.setVisibility(0);
        ((TuxTextView) mo75037a(R.id.ajd)).setBackgroundResource(R.drawable.xv);
        ((TuxTextView) mo75037a(R.id.ajd)).setTextColor(C0643b.m2378c(getContext(), R.color.bh));
        TuxTextView tuxTextView7 = (TuxTextView) mo75037a(R.id.ajd);
        C89219l.m154716b(tuxTextView7, "");
        tuxTextView7.setText(str3);
        ((TuxTextView) mo75037a(R.id.ajd)).post(new RunnableC44183b(str3, this));
    }

    public /* synthetic */ C44180d(Context context, byte b) {
        this(context);
    }
}

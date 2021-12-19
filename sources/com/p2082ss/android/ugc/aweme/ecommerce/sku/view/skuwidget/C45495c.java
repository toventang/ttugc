package com.p2082ss.android.ugc.aweme.ecommerce.sku.view.skuwidget;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20734k;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45090c;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.p2862a.C45430a;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45562g;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c */
public final class C45495c extends FrameLayout {

    /* renamed from: f */
    public static final C45496a f105966f = new C45496a((byte) 0);

    /* renamed from: a */
    List<C45430a> f105967a;

    /* renamed from: b */
    public C45430a f105968b;

    /* renamed from: c */
    final int f105969c = 1;

    /* renamed from: d */
    public int f105970d = -1;

    /* renamed from: e */
    public AbstractC45497b f105971e;

    /* renamed from: g */
    private final int f105972g;

    /* renamed from: h */
    private final int f105973h;

    /* renamed from: i */
    private final int f105974i;

    /* renamed from: j */
    private final int f105975j = m88037a(8.0f);

    /* renamed from: k */
    private final int f105976k = m88037a(7.0f);

    /* renamed from: l */
    private final int f105977l = m88037a(11.0f);

    /* renamed from: m */
    private final int f105978m;

    /* renamed from: n */
    private String f105979n;

    /* renamed from: o */
    private final SparseArray<List<View>> f105980o = new SparseArray<>();

    /* renamed from: p */
    private final ArrayList<Integer> f105981p = new ArrayList<>();

    /* renamed from: q */
    private C20745e f105982q;

    /* renamed from: r */
    private final C20745e f105983r;

    /* renamed from: s */
    private int f105984s;

    /* renamed from: t */
    private boolean f105985t;

    /* renamed from: u */
    private Drawable f105986u;

    /* renamed from: v */
    private Drawable f105987v;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c$b */
    public interface AbstractC45497b {
        static {
            Covode.recordClassIndex(53985);
        }

        /* renamed from: a */
        void mo76693a(int i, C45430a aVar);
    }

    static {
        Covode.recordClassIndex(53983);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c$a */
    public static final class C45496a {
        static {
            Covode.recordClassIndex(53984);
        }

        private C45496a() {
        }

        public /* synthetic */ C45496a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c$e */
    public static final class C45500e implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f105991a;

        static {
            Covode.recordClassIndex(53988);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.C45495c.C45500e.C455011 */

                /* renamed from: a */
                public int f105992a;

                /* renamed from: b */
                final /* synthetic */ C45500e f105993b;

                static {
                    Covode.recordClassIndex(53989);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f105992a < this.f105993b.f105991a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f105993b.f105991a;
                    int i = this.f105992a;
                    this.f105992a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f105993b = r1;
                }
            };
        }

        public C45500e(ViewGroup viewGroup) {
            this.f105991a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c$c */
    public static final class C45498c implements AbstractC20734k {

        /* renamed from: a */
        final /* synthetic */ C45090c f105988a;

        static {
            Covode.recordClassIndex(53986);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34146a(Uri uri) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34147a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34148a(Uri uri, C20758o oVar) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34149a(Uri uri, Throwable th) {
        }

        C45498c(C45090c cVar) {
            this.f105988a = cVar;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            this.f105988a.mo76188a(th);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
            this.f105988a.mo76185a(oVar);
        }
    }

    public final void setCheckedViewInfo(C45430a aVar) {
        C89219l.m154721d(aVar, "");
        this.f105968b = aVar;
    }

    public final void setOnItemCheckedListener(AbstractC45497b bVar) {
        C89219l.m154721d(bVar, "");
        this.f105971e = bVar;
    }

    /* renamed from: a */
    private static Context m88038a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private final int m88037a(float f) {
        Context context = getContext();
        C89219l.m154716b(context, "");
        return (int) C13628n.m24520b(m88038a(context), f);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c$d */
    static final class View$OnClickListenerC45499d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45495c f105989a;

        /* renamed from: b */
        final /* synthetic */ C45430a f105990b;

        static {
            Covode.recordClassIndex(53987);
        }

        View$OnClickListenerC45499d(C45495c cVar, C45430a aVar) {
            this.f105989a = cVar;
            this.f105990b = aVar;
        }

        public final void onClick(View view) {
            C45430a aVar;
            ClickAgent.onClick(view);
            if (this.f105990b.f105839a) {
                C45495c cVar = this.f105989a;
                if (C89219l.m154714a(cVar.f105968b, this.f105990b)) {
                    aVar = null;
                } else {
                    aVar = this.f105990b;
                }
                cVar.f105968b = aVar;
                C45495c cVar2 = this.f105989a;
                int childCount = cVar2.getChildCount();
                for (int i = cVar2.f105969c; i < childCount; i++) {
                    View childAt = cVar2.getChildAt(i);
                    int i2 = i - cVar2.f105969c;
                    List<C45430a> list = cVar2.f105967a;
                    if (list == null) {
                        C89219l.m154710a("itemViewInfoList");
                    }
                    if (i2 < list.size()) {
                        List<C45430a> list2 = cVar2.f105967a;
                        if (list2 == null) {
                            C89219l.m154710a("itemViewInfoList");
                        }
                        C89219l.m154716b(childAt, "");
                        cVar2.mo76687a(childAt, list2.get(i2));
                    }
                }
                AbstractC45497b bVar = this.f105989a.f105971e;
                if (bVar != null) {
                    bVar.mo76693a(this.f105989a.f105970d, this.f105989a.f105968b);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45495c(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7127);
        this.f105978m = C0643b.m2378c(context, R.color.c5);
        this.f105973h = m88037a(8.0f);
        this.f105974i = m88037a(12.0f);
        this.f105972g = m88037a(8.0f);
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48958b = C13628n.m24520b(context, 0.5f);
        aVar.f48961e = C13628n.m24520b(context, 2.0f);
        aVar.f48959c = C0643b.m2378c(context, R.color.b6);
        C20745e a = aVar.mo34169a();
        C89219l.m154716b(a, "");
        this.f105982q = a;
        C20745e.C20746a aVar2 = new C20745e.C20746a();
        aVar2.f48958b = C13628n.m24520b(context, 1.0f);
        aVar2.f48961e = C13628n.m24520b(context, 2.0f);
        aVar2.f48959c = C0643b.m2378c(context, R.color.bh);
        C20745e a2 = aVar2.mo34169a();
        C89219l.m154716b(a2, "");
        this.f105983r = a2;
        this.f105984s = m88037a(56.0f);
        this.f105985t = C80471gb.m139482a();
        this.f105986u = C0643b.m2369a(context, (int) R.drawable.zl);
        this.f105987v = C0643b.m2369a(context, (int) R.drawable.zm);
        MethodCollector.m26664o(7127);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo76687a(View view, C45430a aVar) {
        if (view instanceof TuxTextView) {
            m88040a((TuxTextView) view, aVar);
        }
        if (view instanceof ViewGroup) {
            m88039a((ViewGroup) view, aVar);
        }
    }

    /* renamed from: a */
    private final void m88040a(TuxTextView tuxTextView, C45430a aVar) {
        if (!aVar.f105839a) {
            tuxTextView.setBackgroundResource(R.drawable.y4);
            tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.bz));
            return;
        }
        C45430a aVar2 = this.f105968b;
        if (aVar2 == null || !C89219l.m154714a(aVar2, aVar)) {
            tuxTextView.setBackgroundResource(R.drawable.y4);
            tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
            return;
        }
        tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.bh));
        tuxTextView.setBackgroundResource(R.drawable.y3);
    }

    /* renamed from: a */
    private final void m88039a(ViewGroup viewGroup, C45430a aVar) {
        SmartImageView smartImageView = null;
        TuxTextView tuxTextView = null;
        for (View view : new C45500e(viewGroup)) {
            if (view instanceof SmartImageView) {
                smartImageView = (SmartImageView) view;
            } else if (view instanceof TuxTextView) {
                tuxTextView = (TuxTextView) view;
            }
        }
        if (!aVar.f105839a) {
            viewGroup.setBackgroundResource(R.drawable.y4);
            if (smartImageView != null) {
                smartImageView.setAlpha(0.34f);
            }
            if (tuxTextView != null) {
                tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.bz));
                return;
            }
            return;
        }
        if (smartImageView != null) {
            smartImageView.setAlpha(1.0f);
            smartImageView.setCircleOptions(this.f105982q);
            smartImageView.setPlaceholderImage(this.f105986u);
        }
        C45430a aVar2 = this.f105968b;
        if (aVar2 == null || !C89219l.m154714a(aVar2, aVar)) {
            if (tuxTextView != null) {
                tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
            }
            viewGroup.setBackgroundResource(R.drawable.y4);
            return;
        }
        if (tuxTextView != null) {
            tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.bh));
        }
        viewGroup.setBackgroundResource(R.drawable.y3);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        NullPointerException e;
        MethodCollector.m26663i(6826);
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount == 0) {
            MethodCollector.m26664o(6826);
            return;
        }
        this.f105980o.clear();
        this.f105981p.clear();
        int i3 = 0;
        View childAt = getChildAt(0);
        C89219l.m154716b(childAt, "");
        int measuredHeight = childAt.getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = this.f105969c; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            C89219l.m154716b(childAt2, "");
            int measuredWidth2 = childAt2.getMeasuredWidth();
            i4 += measuredWidth2;
            if (i5 > 0) {
                i4 += this.f105973h;
            }
            if (i4 > measuredWidth) {
                i6++;
                i4 = measuredWidth2;
                i5 = 0;
            }
            List<View> list = this.f105980o.get(i6);
            if (list == null) {
                list = new ArrayList<>();
                this.f105980o.put(i6, list);
            }
            list.add(childAt2);
            i5++;
        }
        int size = this.f105980o.size();
        for (int i8 = 0; i8 < size; i8++) {
            try {
                int i9 = 0;
                for (View view : this.f105980o.get(i8)) {
                    try {
                        i9 = Math.max(i9, view.getMeasuredHeight());
                    } catch (NullPointerException e2) {
                        e = e2;
                        i3 = i9;
                        NullPointerException nullPointerException = new NullPointerException(e.getMessage() + ", description: index " + i8 + ", arr " + this.f105980o + ", lineNum: " + i6 + ", lineWidth: " + i4 + ", lineMaxHeight: " + i3);
                        MethodCollector.m26664o(6826);
                        throw nullPointerException;
                    }
                }
                this.f105981p.add(Integer.valueOf(i9));
            } catch (NullPointerException e3) {
                e = e3;
                NullPointerException nullPointerException2 = new NullPointerException(e.getMessage() + ", description: index " + i8 + ", arr " + this.f105980o + ", lineNum: " + i6 + ", lineWidth: " + i4 + ", lineMaxHeight: " + i3);
                MethodCollector.m26664o(6826);
                throw nullPointerException2;
            }
        }
        Iterator<Integer> it = this.f105981p.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            C89219l.m154716b(next, "");
            i3 += next.intValue();
        }
        setMeasuredDimension(measuredWidth, measuredHeight + this.f105977l + i3 + ((this.f105980o.size() - 1) * this.f105972g));
        MethodCollector.m26664o(6826);
    }

    /* renamed from: a */
    public final void mo76688a(String str, List<C45430a> list, int i) {
        View tuxTextView;
        SmartImageView smartImageView;
        TuxTextView tuxTextView2;
        C20714a aVar;
        int i2 = 6819;
        MethodCollector.m26663i(6819);
        if (getContext() == null || list.isEmpty() || str == null) {
            MethodCollector.m26664o(6819);
            return;
        }
        this.f105967a = list;
        this.f105970d = i;
        this.f105979n = str;
        Context context = getContext();
        C89219l.m154716b(context, "");
        TuxTextView tuxTextView3 = new TuxTextView(context, null, 0, 6);
        tuxTextView3.setTextColor(this.f105978m);
        tuxTextView3.setTuxFont(62);
        tuxTextView3.setText(str);
        tuxTextView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(tuxTextView3);
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            C45430a aVar2 = list.get(i3);
            if (aVar2.f105842d == null) {
                Context context2 = getContext();
                C89219l.m154716b(context2, "");
                tuxTextView = new TuxTextView(context2, null, 0, 6);
                ((TuxTextView) tuxTextView).setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                smartImageView = null;
                tuxTextView2 = null;
            } else if (list.size() <= 6) {
                tuxTextView = LayoutInflater.from(getContext()).inflate(R.layout.qu, (ViewGroup) null);
                smartImageView = (SmartImageView) tuxTextView.findViewById(R.id.e21);
                tuxTextView2 = (TuxTextView) tuxTextView.findViewById(R.id.e23);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(m88037a(100.0f), m88037a(127.0f)));
            } else {
                tuxTextView = LayoutInflater.from(getContext()).inflate(R.layout.qt, (ViewGroup) null);
                smartImageView = (SmartImageView) tuxTextView.findViewById(R.id.e20);
                tuxTextView2 = (TuxTextView) tuxTextView.findViewById(R.id.e22);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            }
            if (tuxTextView instanceof ViewGroup) {
                C45090c cVar = new C45090c();
                cVar.mo76187a("sku_detail");
                cVar.mo76183a(i3);
                Image image = aVar2.f105842d;
                if (image != null) {
                    aVar = image.toThumbFirstImageUrlModel();
                } else {
                    aVar = null;
                }
                cVar.mo76184a(aVar);
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(aVar2.f105841c);
                }
                C20766v a = C45562g.m88108a(aVar2.f105842d);
                a.f49126w = this.f105982q;
                a.f49125v = EnumC20767w.CENTER_CROP;
                C20766v a2 = a.mo34179a("SpecLayout");
                a2.f49092E = smartImageView;
                a2.mo34181a(new C45498c(cVar));
            } else if (tuxTextView instanceof TuxTextView) {
                TuxTextView tuxTextView4 = (TuxTextView) tuxTextView;
                tuxTextView4.setIncludeFontPadding(false);
                tuxTextView4.setTuxFont(61);
                int i4 = this.f105974i;
                tuxTextView.setPadding(i4, this.f105975j, i4, this.f105976k);
                tuxTextView4.setText(aVar2.f105841c);
                tuxTextView4.setMaxLines(2);
            }
            addView(tuxTextView);
            mo76687a(tuxTextView, aVar2);
            tuxTextView.setOnClickListener(new View$OnClickListenerC45499d(this, aVar2));
            i3++;
            i2 = 6819;
        }
        MethodCollector.m26664o(i2);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int intValue;
        int i5;
        MethodCollector.m26663i(6973);
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() == 0) {
            MethodCollector.m26664o(6973);
            return;
        }
        View childAt = getChildAt(0);
        C89219l.m154716b(childAt, "");
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        if (!this.f105985t) {
            childAt.layout(0, 0, measuredWidth, measuredHeight);
        } else {
            childAt.layout(getMeasuredWidth() - measuredWidth, 0, getMeasuredWidth(), measuredHeight);
        }
        int size = this.f105980o.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            List<View> list = this.f105980o.get(i7);
            int size2 = list.size();
            if (i7 == 0) {
                intValue = this.f105977l + measuredHeight;
            } else {
                intValue = this.f105981p.get(i7 - 1).intValue() + this.f105972g;
            }
            i6 += intValue;
            int i8 = 0;
            for (int i9 = 0; i9 < size2; i9++) {
                View view = list.get(i9);
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i9 > 0) {
                    i5 = (this.f105973h * i9) + i8;
                } else {
                    i5 = 0;
                }
                if (!this.f105985t) {
                    view.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
                } else {
                    view.layout((getMeasuredWidth() - measuredWidth2) - i5, i6, getMeasuredWidth() - i5, measuredHeight2 + i6);
                }
                i8 += measuredWidth2;
            }
        }
        MethodCollector.m26664o(6973);
    }
}

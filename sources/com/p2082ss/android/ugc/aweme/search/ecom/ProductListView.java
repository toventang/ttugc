package com.p2082ss.android.ugc.aweme.search.ecom;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67397b;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.ProductListView */
public final class ProductListView extends PowerList {

    /* renamed from: R */
    public static final int f150970R;

    /* renamed from: aa */
    private static final C67389a f150971aa = new C67389a((byte) 0);

    /* renamed from: P */
    public boolean f150972P;

    /* renamed from: Q */
    public AbstractC89171a<C89391z> f150973Q;

    /* renamed from: S */
    private C67397b f150974S;

    /* renamed from: T */
    private AbstractC67411e f150975T;

    /* renamed from: U */
    private AbstractC67393a f150976U;

    /* renamed from: V */
    private boolean f150977V;

    /* renamed from: W */
    private int f150978W;

    public ProductListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.ProductListView$a */
    static final class C67389a {
        static {
            Covode.recordClassIndex(79021);
        }

        private C67389a() {
        }

        public /* synthetic */ C67389a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.ProductListView$c */
    static final class C67391c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProductListView f150983a;

        static {
            Covode.recordClassIndex(79023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67391c(ProductListView productListView) {
            super(0);
            this.f150983a = productListView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            AbstractC89171a<C89391z> aVar = this.f150983a.f150973Q;
            if (aVar != null) {
                aVar.invoke();
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(79018);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f150970R = C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.ProductListView$b */
    public final class C67390b extends RecyclerView.AbstractC1361h {

        /* renamed from: b */
        private final int f150982b;

        static {
            Covode.recordClassIndex(79022);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C67390b() {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            this.f150982b = C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            int d = RecyclerView.m4277d(view);
            int a = sVar.mo4782a() - 1;
            if (d == 0) {
                if (C23163i.m43664a(ProductListView.this)) {
                    rect.left = this.f150982b;
                    rect.right = 0;
                    return;
                }
                rect.right = this.f150982b;
                rect.left = 0;
            } else if (d != a) {
                rect.left = this.f150982b;
                rect.right = this.f150982b;
            } else if (a < 0) {
            } else {
                if (C23163i.m43664a(ProductListView.this)) {
                    rect.left = 0;
                    rect.right = this.f150982b;
                    return;
                }
                rect.right = 0;
                rect.left = this.f150982b;
            }
        }
    }

    public final void setData(C67397b bVar) {
        C89219l.m154721d(bVar, "");
        getState().mo28128a();
        this.f150978W = 0;
        this.f150974S = bVar;
        List<C67394a> list = bVar.f151002b;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                if (t.f150991g != null) {
                    this.f150977V = true;
                }
                arrayList.add(new C67409c(t, this.f150976U, this.f150975T));
            }
            getState().mo28133a(arrayList);
        }
        if (C89219l.m154714a((Object) bVar.f151001a, (Object) true)) {
            getState().mo28132a(new C67410d(new C67391c(this)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onMeasure(int i, int i2) {
        int height;
        int i3 = this.f150978W;
        if (i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            return;
        }
        int i4 = 0;
        RecyclerView.ViewHolder f = mo4451f(0);
        if (f == null) {
            f = mo4392a(0, false);
        }
        if (!(f instanceof ProductCell)) {
            f = null;
        }
        ProductCell productCell = (ProductCell) f;
        if (productCell == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.f150977V) {
            if (productCell.f150963a != null) {
                SmartImageView smartImageView = productCell.f150963a;
                if (smartImageView == null) {
                    C89219l.m154710a("coverImage");
                }
                int height2 = smartImageView.getHeight();
                SmartImageView smartImageView2 = productCell.f150963a;
                if (smartImageView2 == null) {
                    C89219l.m154710a("coverImage");
                }
                int a = height2 + ProductCell.m119430a((View) smartImageView2);
                TextView textView = productCell.f150964b;
                if (textView == null) {
                    C89219l.m154710a("titleText");
                }
                int height3 = textView.getHeight();
                TextView textView2 = productCell.f150964b;
                if (textView2 == null) {
                    C89219l.m154710a("titleText");
                }
                int a2 = height3 + ProductCell.m119430a((View) textView2);
                TextView textView3 = productCell.f150965j;
                if (textView3 == null) {
                    C89219l.m154710a("priceText");
                }
                int height4 = textView3.getHeight();
                TextView textView4 = productCell.f150965j;
                if (textView4 == null) {
                    C89219l.m154710a("priceText");
                }
                int a3 = height4 + ProductCell.m119430a((View) textView4);
                ViewGroup viewGroup = productCell.f150966k;
                if (viewGroup == null) {
                    C89219l.m154710a("tagLayout");
                }
                int visibility = viewGroup.getVisibility();
                ViewGroup viewGroup2 = productCell.f150966k;
                if (viewGroup2 == null) {
                    C89219l.m154710a("tagLayout");
                }
                if (viewGroup2.getVisibility() != 0) {
                    ViewGroup viewGroup3 = productCell.f150966k;
                    if (viewGroup3 == null) {
                        C89219l.m154710a("tagLayout");
                    }
                    C11279p.m20021c(viewGroup3);
                }
                ViewGroup viewGroup4 = productCell.f150966k;
                if (viewGroup4 == null) {
                    C89219l.m154710a("tagLayout");
                }
                if (viewGroup4.getHeight() <= 0) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    ViewGroup viewGroup5 = productCell.f150966k;
                    if (viewGroup5 == null) {
                        C89219l.m154710a("tagLayout");
                    }
                    viewGroup5.measure(0, makeMeasureSpec);
                    ViewGroup viewGroup6 = productCell.f150966k;
                    if (viewGroup6 == null) {
                        C89219l.m154710a("tagLayout");
                    }
                    height = viewGroup6.getMeasuredHeight();
                } else {
                    ViewGroup viewGroup7 = productCell.f150966k;
                    if (viewGroup7 == null) {
                        C89219l.m154710a("tagLayout");
                    }
                    height = viewGroup7.getHeight();
                }
                ViewGroup viewGroup8 = productCell.f150966k;
                if (viewGroup8 == null) {
                    C89219l.m154710a("tagLayout");
                }
                int a4 = height + ProductCell.m119430a((View) viewGroup8);
                ViewGroup viewGroup9 = productCell.f150966k;
                if (viewGroup9 == null) {
                    C89219l.m154710a("tagLayout");
                }
                viewGroup9.setVisibility(visibility);
                i4 = a + a2 + a4 + a3;
            }
        } else if (productCell.f150963a != null) {
            SmartImageView smartImageView3 = productCell.f150963a;
            if (smartImageView3 == null) {
                C89219l.m154710a("coverImage");
            }
            int height5 = smartImageView3.getHeight();
            SmartImageView smartImageView4 = productCell.f150963a;
            if (smartImageView4 == null) {
                C89219l.m154710a("coverImage");
            }
            int a5 = height5 + ProductCell.m119430a((View) smartImageView4);
            TextView textView5 = productCell.f150964b;
            if (textView5 == null) {
                C89219l.m154710a("titleText");
            }
            int height6 = textView5.getHeight();
            TextView textView6 = productCell.f150964b;
            if (textView6 == null) {
                C89219l.m154710a("titleText");
            }
            int a6 = height6 + ProductCell.m119430a((View) textView6);
            TextView textView7 = productCell.f150965j;
            if (textView7 == null) {
                C89219l.m154710a("priceText");
            }
            int height7 = textView7.getHeight();
            TextView textView8 = productCell.f150965j;
            if (textView8 == null) {
                C89219l.m154710a("priceText");
            }
            i4 = a5 + a6 + height7 + ProductCell.m119430a((View) textView8);
        }
        int i5 = i4 + f150970R;
        this.f150978W = i5;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
    }

    /* renamed from: a */
    public final void mo106296a(AbstractC67411e eVar, AbstractC67393a aVar, AbstractC89171a<C89391z> aVar2) {
        this.f150975T = eVar;
        this.f150976U = aVar;
        this.f150973Q = aVar2;
    }

    private /* synthetic */ ProductListView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProductListView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        setClipToPadding(false);
        setOrientation(0);
        mo4402a(new C67390b());
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        C23163i.m43660a((View) this, valueOf, Integer.valueOf(f150970R), Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()))), (Integer) 0, false, 16);
        mo28083a(ProductCell.class, ProductSeeAllCell.class);
        RecyclerView.AbstractC1350a adapter = getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new RecyclerView.AbstractC1353c(this) {
                /* class com.p2082ss.android.ugc.aweme.search.ecom.ProductListView.C673871 */

                /* renamed from: a */
                final /* synthetic */ ProductListView f150979a;

                static {
                    Covode.recordClassIndex(79019);
                }

                /* renamed from: com.ss.android.ugc.aweme.search.ecom.ProductListView$1$a */
                static final class RunnableC67388a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C673871 f150980a;

                    static {
                        Covode.recordClassIndex(79020);
                    }

                    RunnableC67388a(C673871 r1) {
                        this.f150980a = r1;
                    }

                    public final void run() {
                        RecyclerView.AbstractC1350a adapter;
                        this.f150980a.f150979a.requestLayout();
                        if (this.f150980a.f150979a.f150972P && (adapter = this.f150980a.f150979a.getAdapter()) != null) {
                            adapter.notifyDataSetChanged();
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f150979a = r1;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
                /* renamed from: b */
                public final void mo4660b(int i, int i2) {
                    this.f150979a.postDelayed(new RunnableC67388a(this), 300);
                }
            });
        }
        this.f150972P = true;
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}

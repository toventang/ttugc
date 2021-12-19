package com.airbnb.epoxy;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.p092a.AbstractC1893a;
import com.airbnb.epoxy.p092a.AbstractC1898d;
import com.airbnb.epoxy.p092a.AbstractC1904i;
import com.airbnb.epoxy.p092a.C1896c;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public class EpoxyRecyclerView extends RecyclerView {

    /* renamed from: P */
    public static final C1885a f5704P = new C1885a((byte) 0);

    /* renamed from: ab */
    private static final C1892a f5705ab = new C1892a();

    /* renamed from: O */
    public boolean f5706O;

    /* renamed from: Q */
    private final C1955r f5707Q;

    /* renamed from: R */
    private AbstractC1944n f5708R;

    /* renamed from: S */
    private RecyclerView.AbstractC1350a<?> f5709S;

    /* renamed from: T */
    private boolean f5710T;

    /* renamed from: U */
    private int f5711U;

    /* renamed from: V */
    private final Runnable f5712V;

    /* renamed from: W */
    private final List<C1896c<?>> f5713W;

    /* renamed from: aa */
    private final List<C1887c<?, ?, ?>> f5714aa;

    static final class ModelBuilderCallbackController extends AbstractC1944n {
        private AbstractC1886b callback = new C1883a();

        static {
            Covode.recordClassIndex(2063);
        }

        /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$ModelBuilderCallbackController$a */
        public static final class C1883a implements AbstractC1886b {
            static {
                Covode.recordClassIndex(2064);
            }

            @Override // com.airbnb.epoxy.EpoxyRecyclerView.AbstractC1886b
            /* renamed from: a */
            public final void mo5612a(AbstractC1944n nVar) {
                C89219l.m154719c(nVar, "");
            }

            C1883a() {
            }
        }

        public final AbstractC1886b getCallback() {
            return this.callback;
        }

        /* access modifiers changed from: protected */
        @Override // com.airbnb.epoxy.AbstractC1944n
        public final void buildModels() {
            this.callback.mo5612a(this);
        }

        public final void setCallback(AbstractC1886b bVar) {
            C89219l.m154719c(bVar, "");
            this.callback = bVar;
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$b */
    public interface AbstractC1886b {
        static {
            Covode.recordClassIndex(2068);
        }

        /* renamed from: a */
        void mo5612a(AbstractC1944n nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$c */
    public static final class C1887c<T extends AbstractC1956s<?>, U extends AbstractC1904i, P extends AbstractC1898d> {

        /* renamed from: a */
        public final int f5716a;

        /* renamed from: b */
        public final AbstractC89183m<Context, RuntimeException, C89391z> f5717b;

        /* renamed from: c */
        public final AbstractC1893a<T, U, P> f5718c;

        /* renamed from: d */
        public final AbstractC89171a<P> f5719d;

        static {
            Covode.recordClassIndex(2069);
        }
    }

    public EpoxyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    static final class WithModelsController extends AbstractC1944n {
        private AbstractC89172b<? super AbstractC1944n, C89391z> callback = C1884a.f5715a;

        static {
            Covode.recordClassIndex(2065);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.airbnb.epoxy.n, h.z>, h.f.a.b<com.airbnb.epoxy.n, h.z> */
        public final AbstractC89172b<AbstractC1944n, C89391z> getCallback() {
            return this.callback;
        }

        /* access modifiers changed from: protected */
        @Override // com.airbnb.epoxy.AbstractC1944n
        public final void buildModels() {
            this.callback.invoke(this);
        }

        /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$WithModelsController$a */
        static final class C1884a extends AbstractC89220m implements AbstractC89172b<AbstractC1944n, C89391z> {

            /* renamed from: a */
            public static final C1884a f5715a = new C1884a();

            static {
                Covode.recordClassIndex(2066);
            }

            C1884a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC1944n nVar) {
                C89219l.m154719c(nVar, "");
                return C89391z.f203057a;
            }
        }

        public final void setCallback(AbstractC89172b<? super AbstractC1944n, C89391z> bVar) {
            C89219l.m154719c(bVar, "");
            this.callback = bVar;
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$a */
    public static final class C1885a {
        static {
            Covode.recordClassIndex(2067);
        }

        private C1885a() {
        }

        public /* synthetic */ C1885a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final C1955r getSpacingDecorator() {
        return this.f5707Q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$d */
    public static final class C1888d extends AbstractC89220m implements AbstractC89171a<RecyclerView.RecycledViewPool> {

        /* renamed from: a */
        final /* synthetic */ EpoxyRecyclerView f5720a;

        static {
            Covode.recordClassIndex(2070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1888d(EpoxyRecyclerView epoxyRecyclerView) {
            super(0);
            this.f5720a = epoxyRecyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView.RecycledViewPool invoke() {
            return new C1922al();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void requestLayout() {
        m6065t();
        super.requestLayout();
    }

    /* renamed from: u */
    private final void m6066u() {
        this.f5709S = null;
        if (this.f5706O) {
            removeCallbacks(this.f5712V);
            this.f5706O = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.AbstractC1350a<?> aVar = this.f5709S;
        if (aVar != null) {
            mo4401a((RecyclerView.AbstractC1350a) aVar, false);
        }
        m6066u();
    }

    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$e */
    static final class RunnableC1889e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EpoxyRecyclerView f5721a;

        static {
            Covode.recordClassIndex(2071);
        }

        RunnableC1889e(EpoxyRecyclerView epoxyRecyclerView) {
            this.f5721a = epoxyRecyclerView;
        }

        public final void run() {
            if (this.f5721a.f5706O) {
                this.f5721a.f5706O = false;
                this.f5721a.mo5599q();
            }
        }
    }

    static {
        Covode.recordClassIndex(2062);
    }

    /* renamed from: v */
    private final void m6067v() {
        if (C1924b.m6128a(getContext())) {
            getRecycledViewPool().clear();
        }
    }

    /* renamed from: q */
    public final void mo5599q() {
        RecyclerView.AbstractC1350a<?> adapter = getAdapter();
        if (adapter != null) {
            mo4401a((RecyclerView.AbstractC1350a) null, true);
            this.f5709S = adapter;
        }
        m6067v();
    }

    /* renamed from: t */
    private final void m6065t() {
        RecyclerView.AbstractC1362i layoutManager = getLayoutManager();
        AbstractC1944n nVar = this.f5708R;
        if ((layoutManager instanceof GridLayoutManager) && nVar != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (nVar.getSpanCount() != gridLayoutManager.f4316b || gridLayoutManager.f4321g != nVar.getSpanSizeLookup()) {
                nVar.setSpanCount(gridLayoutManager.f4316b);
                gridLayoutManager.mo4320a(nVar.getSpanSizeLookup());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<T> it = this.f5713W.iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().f5730a.f5739a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (this.f5710T) {
            int i = this.f5711U;
            if (i > 0) {
                this.f5706O = true;
                postDelayed(this.f5712V, (long) i);
            } else {
                mo5599q();
            }
        }
        m6067v();
    }

    /* renamed from: s */
    private void m6064s() {
        setClipToPadding(false);
        C1892a aVar = f5705ab;
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        C1888d dVar = new C1888d(this);
        C89219l.m154719c(context, "");
        C89219l.m154719c(dVar, "");
        Iterator<PoolReference> it = aVar.f5725a.iterator();
        C89219l.m154709a((Object) it, "");
        PoolReference poolReference = null;
        while (it.hasNext()) {
            PoolReference next = it.next();
            C89219l.m154709a((Object) next, "");
            PoolReference poolReference2 = next;
            if (poolReference2.mo5618a() == context) {
                if (poolReference == null) {
                    poolReference = poolReference2;
                } else {
                    throw new IllegalStateException("A pool was already found");
                }
            } else if (C1924b.m6128a(poolReference2.mo5618a())) {
                poolReference2.f5722a.clear();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(context, (RecyclerView.RecycledViewPool) dVar.invoke(), aVar);
            AbstractC1196i a = C1892a.m6074a(context);
            if (a != null) {
                a.mo4012a(poolReference);
            }
            aVar.f5725a.add(poolReference);
        }
        setRecycledViewPool(poolReference.f5722a);
    }

    /* renamed from: r */
    private final void m6063r() {
        C1896c<?> cVar;
        Iterator<T> it = this.f5713W.iterator();
        while (it.hasNext()) {
            mo4418b((RecyclerView.AbstractC1371n) it.next());
        }
        this.f5713W.clear();
        RecyclerView.AbstractC1350a adapter = getAdapter();
        if (adapter != null) {
            C89219l.m154709a((Object) adapter, "");
            for (T t : this.f5714aa) {
                if (adapter instanceof AbstractC1942l) {
                    AbstractC1942l lVar = (AbstractC1942l) adapter;
                    AbstractC89171a<P> aVar = t.f5719d;
                    AbstractC89183m<Context, RuntimeException, C89391z> mVar = t.f5717b;
                    int i = t.f5716a;
                    List a = C89070n.m154516a(t.f5718c);
                    C89219l.m154719c(lVar, "");
                    C89219l.m154719c(aVar, "");
                    C89219l.m154719c(mVar, "");
                    C89219l.m154719c(a, "");
                    cVar = new C1896c<>(lVar, (AbstractC89171a<? extends Object>) aVar, (AbstractC89183m<? super Context, ? super RuntimeException, C89391z>) mVar, i, (List<? extends AbstractC1893a<?, ?, ? extends Object>>) a);
                } else {
                    AbstractC1944n nVar = this.f5708R;
                    if (nVar != null) {
                        AbstractC89171a<P> aVar2 = t.f5719d;
                        AbstractC89183m<Context, RuntimeException, C89391z> mVar2 = t.f5717b;
                        int i2 = t.f5716a;
                        List a2 = C89070n.m154516a(t.f5718c);
                        C89219l.m154719c(nVar, "");
                        C89219l.m154719c(aVar2, "");
                        C89219l.m154719c(mVar2, "");
                        C89219l.m154719c(a2, "");
                        cVar = new C1896c<>(nVar, aVar2, mVar2, i2, a2);
                    }
                }
                this.f5713W.add(cVar);
                mo4405a(cVar);
            }
        }
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int i) {
        this.f5711U = i;
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean z) {
        this.f5710T = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.AbstractC1362i iVar) {
        super.setLayoutManager(iVar);
        m6065t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.AbstractC1350a<?> aVar) {
        super.setAdapter(aVar);
        m6066u();
        m6063r();
    }

    public final void setControllerAndBuildModels(AbstractC1944n nVar) {
        C89219l.m154719c(nVar, "");
        nVar.requestModelBuild();
        setController(nVar);
    }

    public final void setItemSpacingRes(int i) {
        setItemSpacingPx(getResources().getDimensionPixelOffset(i));
    }

    public final void setController(AbstractC1944n nVar) {
        C89219l.m154719c(nVar, "");
        this.f5708R = nVar;
        setAdapter(nVar.getAdapter());
        m6065t();
    }

    public final void setItemSpacingDp(int i) {
        Resources resources = getResources();
        C89219l.m154709a((Object) resources, "");
        setItemSpacingPx((int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics()));
    }

    public void setItemSpacingPx(int i) {
        mo4425c(this.f5707Q);
        this.f5707Q.f5827a = i;
        if (i > 0) {
            mo4415b(this.f5707Q);
        }
    }

    public void setModels(List<? extends AbstractC1956s<?>> list) {
        C89219l.m154719c(list, "");
        AbstractC1944n nVar = this.f5708R;
        if (!(nVar instanceof SimpleEpoxyController)) {
            nVar = null;
        }
        SimpleEpoxyController simpleEpoxyController = (SimpleEpoxyController) nVar;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(list);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean z;
        LinearLayoutManager linearLayoutManager;
        C89219l.m154719c(layoutParams, "");
        if (getLayoutParams() == null) {
            z = true;
        } else {
            z = false;
        }
        super.setLayoutParams(layoutParams);
        if (z && getLayoutManager() == null) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2.height == -1 || layoutParams2.height == 0) {
                if (layoutParams2.width == -1 || layoutParams2.width == 0) {
                    setHasFixedSize(true);
                }
                getContext();
                linearLayoutManager = new LinearLayoutManager();
            } else {
                getContext();
                linearLayoutManager = new LinearLayoutManager(0, false);
            }
            setLayoutManager(linearLayoutManager);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: a */
    public final void mo4401a(RecyclerView.AbstractC1350a<?> aVar, boolean z) {
        super.mo4401a(aVar, z);
        m6066u();
        m6063r();
    }

    private /* synthetic */ EpoxyRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private EpoxyRecyclerView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        this.f5707Q = new C1955r();
        this.f5710T = true;
        this.f5711U = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.f5712V = new RunnableC1889e(this);
        this.f5713W = new ArrayList();
        this.f5714aa = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.y3}, 0, 0);
            setItemSpacingPx(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            obtainStyledAttributes.recycle();
        }
        m6064s();
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}

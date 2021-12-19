package com.airbnb.epoxy.stickyheader;

import android.graphics.PointF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.AbstractC1931d;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public AbstractC1931d f5849a;

    /* renamed from: b */
    public final List<Integer> f5850b;

    /* renamed from: c */
    public View f5851c;

    /* renamed from: d */
    public int f5852d;

    /* renamed from: e */
    public int f5853e;

    /* renamed from: f */
    public int f5854f;

    /* renamed from: g */
    private float f5855g;

    /* renamed from: h */
    private float f5856h;

    /* renamed from: i */
    private final C1960a f5857i;

    static {
        Covode.recordClassIndex(2150);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4692a(RecyclerView.AbstractC1350a<?> aVar, RecyclerView.AbstractC1350a<?> aVar2) {
        super.mo4692a(aVar, aVar2);
        m6221a(aVar2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4350a(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            parcelable = null;
        }
        SavedState savedState = (SavedState) parcelable;
        if (savedState != null) {
            this.f5853e = savedState.f5859b;
            this.f5854f = savedState.f5860c;
            super.mo4350a(savedState.f5858a);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        C89219l.m154719c(oVar, "");
        int intValue = ((Number) m6220a(new C1971l(this, i, oVar, sVar))).intValue();
        if (intValue != 0) {
            m6224a(oVar, false);
        }
        return intValue;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final void mo4347a(int i, int i2) {
        m6235f(i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final View mo4314a(View view, int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(oVar, "");
        C89219l.m154719c(sVar, "");
        return (View) m6220a(new C1969j(this, view, i, oVar, sVar));
    }

    /* renamed from: a */
    private final boolean m6226a(View view, RecyclerView.C1367j jVar) {
        if (!jVar.mo4745B_() && !jVar.mo4744A_()) {
            if (this.f4334j != 1) {
                return this.f4336l ? ((float) view.getLeft()) + view.getTranslationX() <= ((float) this.f4485J) + this.f5855g : ((float) view.getRight()) - view.getTranslationX() >= this.f5855g;
            }
            if (this.f4336l) {
                return ((float) view.getTop()) + view.getTranslationY() <= ((float) this.f4486K) + this.f5856h;
            }
            if (((float) view.getBottom()) - view.getTranslationY() >= this.f5856h) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo4318a(int i) {
        int size = this.f5850b.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (this.f5850b.get(i3).intValue() > i) {
                size = i3 - 1;
            } else if (this.f5850b.get(i3).intValue() >= i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$c */
    static final class C1962c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5864a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.C1378s f5865b;

        static {
            Covode.recordClassIndex(2155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1962c(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1378s sVar) {
            super(0);
            this.f5864a = stickyHeaderLinearLayoutManager;
            this.f5865b = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo4365f((StickyHeaderLinearLayoutManager) this.f5865b));
        }
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$d */
    static final class C1963d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5866a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.C1378s f5867b;

        static {
            Covode.recordClassIndex(2156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1963d(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1378s sVar) {
            super(0);
            this.f5866a = stickyHeaderLinearLayoutManager;
            this.f5867b = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo4338d((StickyHeaderLinearLayoutManager) this.f5867b));
        }
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$e */
    static final class C1964e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5868a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.C1378s f5869b;

        static {
            Covode.recordClassIndex(2157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1964e(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1378s sVar) {
            super(0);
            this.f5868a = stickyHeaderLinearLayoutManager;
            this.f5869b = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo4333b((StickyHeaderLinearLayoutManager) this.f5869b));
        }
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$f */
    static final class C1965f extends AbstractC89220m implements AbstractC89171a<PointF> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5870a;

        /* renamed from: b */
        final /* synthetic */ int f5871b;

        static {
            Covode.recordClassIndex(2158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1965f(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i) {
            super(0);
            this.f5870a = stickyHeaderLinearLayoutManager;
            this.f5871b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PointF invoke() {
            return StickyHeaderLinearLayoutManager.super.mo4360d((StickyHeaderLinearLayoutManager) this.f5871b);
        }
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$g */
    static final class C1966g extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5872a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.C1378s f5873b;

        static {
            Covode.recordClassIndex(2159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1966g(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1378s sVar) {
            super(0);
            this.f5872a = stickyHeaderLinearLayoutManager;
            this.f5873b = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo4367g((StickyHeaderLinearLayoutManager) this.f5873b));
        }
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$h */
    static final class C1967h extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5874a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.C1378s f5875b;

        static {
            Covode.recordClassIndex(2160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1967h(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1378s sVar) {
            super(0);
            this.f5874a = stickyHeaderLinearLayoutManager;
            this.f5875b = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo4339e((StickyHeaderLinearLayoutManager) this.f5875b));
        }
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$i */
    static final class C1968i extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5876a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.C1378s f5877b;

        static {
            Covode.recordClassIndex(2161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1968i(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1378s sVar) {
            super(0);
            this.f5876a = stickyHeaderLinearLayoutManager;
            this.f5877b = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo4336c((StickyHeaderLinearLayoutManager) this.f5877b));
        }
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$j */
    static final class C1969j extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5878a;

        /* renamed from: b */
        final /* synthetic */ View f5879b;

        /* renamed from: c */
        final /* synthetic */ int f5880c;

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1372o f5881d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView.C1378s f5882e;

        static {
            Covode.recordClassIndex(2162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1969j(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, View view, int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
            super(0);
            this.f5878a = stickyHeaderLinearLayoutManager;
            this.f5879b = view;
            this.f5880c = i;
            this.f5881d = oVar;
            this.f5882e = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return StickyHeaderLinearLayoutManager.super.mo4314a((StickyHeaderLinearLayoutManager) this.f5879b, (View) this.f5880c, (int) this.f5881d, (RecyclerView.C1372o) this.f5882e);
        }
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$k */
    static final class C1970k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5883a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.C1372o f5884b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView.C1378s f5885c;

        static {
            Covode.recordClassIndex(2163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1970k(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
            super(0);
            this.f5883a = stickyHeaderLinearLayoutManager;
            this.f5884b = oVar;
            this.f5885c = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            StickyHeaderLinearLayoutManager.super.mo4337c((StickyHeaderLinearLayoutManager) this.f5884b, (RecyclerView.C1372o) this.f5885c);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final Parcelable mo4362e() {
        return new SavedState(super.mo4362e(), this.f5853e, this.f5854f);
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$l */
    static final class C1971l extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5886a;

        /* renamed from: b */
        final /* synthetic */ int f5887b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView.C1372o f5888c;

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1378s f5889d;

        static {
            Covode.recordClassIndex(2164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1971l(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
            super(0);
            this.f5886a = stickyHeaderLinearLayoutManager;
            this.f5887b = i;
            this.f5888c = oVar;
            this.f5889d = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo4312a((StickyHeaderLinearLayoutManager) this.f5887b, (int) this.f5888c, (RecyclerView.C1372o) this.f5889d));
        }
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$m */
    static final class C1972m extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5890a;

        /* renamed from: b */
        final /* synthetic */ int f5891b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView.C1372o f5892c;

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1378s f5893d;

        static {
            Covode.recordClassIndex(2165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1972m(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
            super(0);
            this.f5890a = stickyHeaderLinearLayoutManager;
            this.f5891b = i;
            this.f5892c = oVar;
            this.f5893d = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.mo4331b((StickyHeaderLinearLayoutManager) this.f5891b, (int) this.f5892c, (RecyclerView.C1372o) this.f5893d));
        }
    }

    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC1961b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5862a;

        /* renamed from: b */
        final /* synthetic */ View f5863b;

        static {
            Covode.recordClassIndex(2154);
        }

        public final void onGlobalLayout() {
            int i = Build.VERSION.SDK_INT;
            this.f5863b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f5862a.f5853e != -1) {
                StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = this.f5862a;
                stickyHeaderLinearLayoutManager.mo4347a(stickyHeaderLinearLayoutManager.f5853e, this.f5862a.f5854f);
                this.f5862a.mo5806e(-1, Integer.MIN_VALUE);
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC1961b(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, View view) {
            this.f5862a = stickyHeaderLinearLayoutManager;
            this.f5863b = view;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$a */
    public final class C1960a extends RecyclerView.AbstractC1353c {

        /* renamed from: a */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5861a;

        static {
            Covode.recordClassIndex(2153);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            this.f5861a.f5850b.clear();
            AbstractC1931d dVar = this.f5861a.f5849a;
            if (dVar != null) {
                int itemCount = dVar.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    AbstractC1931d dVar2 = this.f5861a.f5849a;
                    if (dVar2 != null && dVar2.mo5724b(i)) {
                        this.f5861a.f5850b.add(Integer.valueOf(i));
                    }
                }
            }
            if (!(this.f5861a.f5851c == null || this.f5861a.f5850b.contains(Integer.valueOf(this.f5861a.f5852d)))) {
                this.f5861a.mo5805d((RecyclerView.C1372o) null);
            }
        }

        /* renamed from: a */
        private final void m6260a(int i) {
            int intValue = this.f5861a.f5850b.remove(i).intValue();
            int k = this.f5861a.mo5807k(intValue);
            if (k != -1) {
                this.f5861a.f5850b.add(k, Integer.valueOf(intValue));
            } else {
                this.f5861a.f5850b.add(Integer.valueOf(intValue));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            int size = this.f5861a.f5850b.size();
            if (size > 0) {
                int k = this.f5861a.mo5807k(i);
                while (k != -1 && k < size) {
                    this.f5861a.f5850b.set(k, Integer.valueOf(this.f5861a.f5850b.get(k).intValue() + i2));
                    k++;
                }
            }
            int i3 = i2 + i;
            while (i < i3) {
                AbstractC1931d dVar = this.f5861a.f5849a;
                if (dVar != null && dVar.mo5724b(i)) {
                    int k2 = this.f5861a.mo5807k(i);
                    if (k2 != -1) {
                        this.f5861a.f5850b.add(k2, Integer.valueOf(i));
                    } else {
                        this.f5861a.f5850b.add(Integer.valueOf(i));
                    }
                }
                i++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            int size = this.f5861a.f5850b.size();
            if (size > 0) {
                int i3 = i + i2;
                int i4 = i3 - 1;
                if (i4 >= i) {
                    while (true) {
                        int a = this.f5861a.mo4318a(i4);
                        if (a != -1) {
                            this.f5861a.f5850b.remove(a);
                            size--;
                        }
                        if (i4 == i) {
                            break;
                        }
                        i4--;
                    }
                }
                if (this.f5861a.f5851c != null && !this.f5861a.f5850b.contains(Integer.valueOf(this.f5861a.f5852d))) {
                    this.f5861a.mo5805d((RecyclerView.C1372o) null);
                }
                int k = this.f5861a.mo5807k(i3);
                while (k != -1 && k < size) {
                    this.f5861a.f5850b.set(k, Integer.valueOf(this.f5861a.f5850b.get(k).intValue() - i2));
                    k++;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            int size = this.f5861a.f5850b.size();
            if (size <= 0) {
                return;
            }
            if (i < i2) {
                int k = this.f5861a.mo5807k(i);
                while (k != -1 && k < size) {
                    int intValue = this.f5861a.f5850b.get(k).intValue();
                    if (intValue >= i && intValue < i + i3) {
                        this.f5861a.f5850b.set(k, Integer.valueOf(intValue - (i2 - i)));
                        m6260a(k);
                    } else if (intValue >= i + i3 && intValue <= i2) {
                        this.f5861a.f5850b.set(k, Integer.valueOf(intValue - i3));
                        m6260a(k);
                    } else {
                        return;
                    }
                    k++;
                }
                return;
            }
            int k2 = this.f5861a.mo5807k(i2);
            while (k2 != -1 && k2 < size) {
                int intValue2 = this.f5861a.f5850b.get(k2).intValue();
                if (intValue2 >= i && intValue2 < i + i3) {
                    this.f5861a.f5850b.set(k2, Integer.valueOf(intValue2 + (i2 - i)));
                    m6260a(k2);
                } else if (i2 <= intValue2 && i >= intValue2) {
                    this.f5861a.f5850b.set(k2, Integer.valueOf(intValue2 + i3));
                    m6260a(k2);
                } else {
                    return;
                }
                k2++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4712c(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        super.mo4712c(recyclerView);
        m6221a(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r.AbstractC1377b, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: d */
    public final PointF mo4360d(int i) {
        return (PointF) m6220a(new C1965f(this, i));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final int mo4336c(RecyclerView.C1378s sVar) {
        C89219l.m154719c(sVar, "");
        return ((Number) m6220a(new C1968i(this, sVar))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: d */
    public final int mo4338d(RecyclerView.C1378s sVar) {
        C89219l.m154719c(sVar, "");
        return ((Number) m6220a(new C1963d(this, sVar))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final int mo4339e(RecyclerView.C1378s sVar) {
        C89219l.m154719c(sVar, "");
        return ((Number) m6220a(new C1967h(this, sVar))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: f */
    public final int mo4365f(RecyclerView.C1378s sVar) {
        C89219l.m154719c(sVar, "");
        return ((Number) m6220a(new C1962c(this, sVar))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final int mo4367g(RecyclerView.C1378s sVar) {
        C89219l.m154719c(sVar, "");
        return ((Number) m6220a(new C1966g(this, sVar))).intValue();
    }

    /* renamed from: l */
    private final int m6236l(int i) {
        int size = this.f5850b.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (this.f5850b.get(i3).intValue() > i) {
                size = i3 - 1;
            } else {
                if (i3 < this.f5850b.size() - 1) {
                    i2 = i3 + 1;
                    if (this.f5850b.get(i2).intValue() <= i) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: w */
    private final void m6237w(View view) {
        mo4725l(view);
        if (this.f4334j != 1) {
            view.layout(0, mo4732u(), view.getMeasuredWidth(), this.f4486K - mo4734w());
        } else {
            view.layout(mo4731t(), 0, this.f4485J - mo4733v(), view.getMeasuredHeight());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4333b(RecyclerView.C1378s sVar) {
        C89219l.m154719c(sVar, "");
        return ((Number) m6220a(new C1964e(this, sVar))).intValue();
    }

    /* renamed from: d */
    public final void mo5805d(RecyclerView.C1372o oVar) {
        View view = this.f5851c;
        if (view != null) {
            this.f5851c = null;
            this.f5852d = -1;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            AbstractC1931d dVar = this.f5849a;
            if (dVar != null) {
                dVar.mo5721b(view);
            }
            m4428k(view);
            mo4715d(view);
            if (oVar != null) {
                oVar.mo4757a(view);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final void mo4363e(int i) {
        m6235f(i, Integer.MIN_VALUE);
    }

    /* renamed from: k */
    public final int mo5807k(int i) {
        int size = this.f5850b.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (this.f5850b.get(i4).intValue() >= i) {
                    size = i4;
                }
            }
            if (this.f5850b.get(i3).intValue() >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    /* renamed from: a */
    private final <T> T m6220a(AbstractC89171a<? extends T> aVar) {
        View view = this.f5851c;
        if (view != null) {
            mo4720h(view);
        }
        T t = (T) aVar.invoke();
        View view2 = this.f5851c;
        if (view2 != null) {
            mo4722i(view2);
        }
        return t;
    }

    /* renamed from: x */
    private final boolean m6238x(View view) {
        if (this.f4334j != 1) {
            if (this.f4336l) {
                if (((float) view.getRight()) - view.getTranslationX() > ((float) this.f4485J) + this.f5855g) {
                    return true;
                }
                return false;
            } else if (((float) view.getLeft()) + view.getTranslationX() < this.f5855g) {
                return true;
            } else {
                return false;
            }
        } else if (this.f4336l) {
            if (((float) view.getBottom()) - view.getTranslationY() > ((float) this.f4486K) + this.f5856h) {
                return true;
            }
            return false;
        } else if (((float) view.getTop()) + view.getTranslationY() < this.f5856h) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private final void m6221a(RecyclerView.AbstractC1350a<?> aVar) {
        AbstractC1931d dVar = this.f5849a;
        if (dVar != null) {
            dVar.unregisterAdapterDataObserver(this.f5857i);
        }
        if (aVar instanceof AbstractC1931d) {
            AbstractC1931d dVar2 = (AbstractC1931d) aVar;
            this.f5849a = dVar2;
            if (dVar2 != null) {
                dVar2.registerAdapterDataObserver(this.f5857i);
            }
            this.f5857i.mo4655a();
            return;
        }
        this.f5849a = null;
        this.f5850b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        C89219l.m154719c(oVar, "");
        C89219l.m154719c(sVar, "");
        m6220a(new C1970k(this, oVar, sVar));
        if (!sVar.f4535g) {
            m6224a(oVar, true);
        }
    }

    /* renamed from: b */
    private final float m6227b(View view, View view2) {
        int i;
        if (this.f4334j != 1) {
            return this.f5856h;
        }
        float f = this.f5856h;
        if (this.f4336l) {
            f += (float) (this.f4486K - view.getHeight());
        }
        if (view2 == null) {
            return f;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = 0;
        if (marginLayoutParams2 != null) {
            i = marginLayoutParams2.bottomMargin;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams;
        if (marginLayoutParams3 != null) {
            i2 = marginLayoutParams3.topMargin;
        }
        if (this.f4336l) {
            return C89271h.m154768b((float) (view2.getBottom() + i), f);
        }
        return C89271h.m154771c((float) ((view2.getTop() - i2) - view.getHeight()), f);
    }

    /* renamed from: c */
    private final float m6230c(View view, View view2) {
        int i;
        if (this.f4334j != 0) {
            return this.f5855g;
        }
        float f = this.f5855g;
        if (this.f4336l) {
            f += (float) (this.f4485J - view.getWidth());
        }
        if (view2 == null) {
            return f;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = 0;
        if (marginLayoutParams2 != null) {
            i = marginLayoutParams2.leftMargin;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams;
        if (marginLayoutParams3 != null) {
            i2 = marginLayoutParams3.rightMargin;
        }
        if (this.f4336l) {
            return C89271h.m154768b((float) (view2.getRight() + i2), f);
        }
        return C89271h.m154771c((float) ((view2.getLeft() - i) - view.getWidth()), f);
    }

    /* renamed from: f */
    private final void m6235f(int i, int i2) {
        mo5806e(-1, Integer.MIN_VALUE);
        int l = m6236l(i);
        if (l == -1 || mo4318a(i) != -1) {
            super.mo4347a(i, i2);
            return;
        }
        int i3 = i - 1;
        if (mo4318a(i3) != -1) {
            super.mo4347a(i3, i2);
        } else if (this.f5851c == null || l != mo4318a(this.f5852d)) {
            mo5806e(i, i2);
            super.mo4347a(i, i2);
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            View view = this.f5851c;
            if (view == null) {
                C89219l.m154707a();
            }
            super.mo4347a(i, i2 + view.getHeight());
        }
    }

    /* renamed from: e */
    public final void mo5806e(int i, int i2) {
        this.f5853e = i;
        this.f5854f = i2;
    }

    /* renamed from: a */
    private final void m6222a(RecyclerView.C1372o oVar, int i) {
        View b = oVar.mo4762b(i);
        C89219l.m154709a((Object) b, "");
        AbstractC1931d dVar = this.f5849a;
        if (dVar != null) {
            dVar.mo5716a(b);
        }
        mo4710c(b);
        m6237w(b);
        mo4724j(b);
        this.f5851c = b;
        this.f5852d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (m4426e(r0) != r2) goto L_0x008b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m6224a(androidx.recyclerview.widget.RecyclerView.C1372o r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.m6224a(androidx.recyclerview.widget.RecyclerView$o, boolean):void");
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C1959a();

        /* renamed from: a */
        public final Parcelable f5858a;

        /* renamed from: b */
        public final int f5859b;

        /* renamed from: c */
        public final int f5860c;

        /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$SavedState$a */
        public static class C1959a implements Parcelable.Creator {
            static {
                Covode.recordClassIndex(2152);
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                C89219l.m154719c(parcel, "");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        static {
            Covode.recordClassIndex(2151);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) obj;
            return C89219l.m154714a(this.f5858a, savedState.f5858a) && this.f5859b == savedState.f5859b && this.f5860c == savedState.f5860c;
        }

        public final int hashCode() {
            Parcelable parcelable = this.f5858a;
            return ((((parcelable != null ? parcelable.hashCode() : 0) * 31) + this.f5859b) * 31) + this.f5860c;
        }

        public final String toString() {
            return "SavedState(superState=" + this.f5858a + ", scrollPosition=" + this.f5859b + ", scrollOffset=" + this.f5860c + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154719c(parcel, "");
            parcel.writeParcelable(this.f5858a, i);
            parcel.writeInt(this.f5859b);
            parcel.writeInt(this.f5860c);
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            this.f5858a = parcelable;
            this.f5859b = i;
            this.f5860c = i2;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        C89219l.m154719c(oVar, "");
        int intValue = ((Number) m6220a(new C1972m(this, i, oVar, sVar))).intValue();
        if (intValue != 0) {
            m6224a(oVar, false);
        }
        return intValue;
    }

    /* renamed from: a */
    private final void m6223a(RecyclerView.C1372o oVar, View view, int i) {
        oVar.mo4758a(view, i);
        this.f5852d = i;
        m6237w(view);
        if (this.f5853e != -1) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC1961b(this, view));
        }
    }
}

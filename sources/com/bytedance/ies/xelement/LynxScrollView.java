package com.bytedance.ies.xelement;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.xelement.C18989b;
import com.bytedance.ies.xelement.C19252i;
import com.bytedance.services.apm.api.C22708a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28724b;
import com.lynx.tasm.p2054c.C28730h;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class LynxScrollView extends AbsLynxUIScroll<C18989b> {

    /* renamed from: p */
    public static final C18920a f44783p = new C18920a((byte) 0);

    /* renamed from: a */
    public boolean f44784a;

    /* renamed from: b */
    public boolean f44785b;

    /* renamed from: c */
    public boolean f44786c;

    /* renamed from: d */
    public boolean f44787d;

    /* renamed from: e */
    public boolean f44788e;

    /* renamed from: f */
    public boolean f44789f;

    /* renamed from: g */
    public RecyclerView f44790g;

    /* renamed from: h */
    public int f44791h;

    /* renamed from: i */
    public C19252i f44792i;

    /* renamed from: j */
    public int f44793j;

    /* renamed from: k */
    public int f44794k;

    /* renamed from: l */
    public boolean f44795l;

    /* renamed from: m */
    public int f44796m = 1;

    /* renamed from: n */
    public int f44797n;

    /* renamed from: o */
    public boolean f44798o = true;

    /* renamed from: q */
    private int f44799q;

    /* renamed from: r */
    private int f44800r;

    /* renamed from: s */
    private LynxBounceView f44801s;

    static {
        Covode.recordClassIndex(21652);
    }

    /* renamed from: b */
    public static boolean m35116b(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: c */
    public static boolean m35117c(int i) {
        return (i & 2) != 0;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final boolean canHaveFlattenChild() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            switch (nextKey.hashCode()) {
                case -1826701651:
                    if (nextKey.equals("scroll-to-id")) {
                        scrollToId(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1383205240:
                    if (nextKey.equals("bounce")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setBounces(z);
                        continue;
                    }
                    break;
                case -1138034670:
                    if (nextKey.equals("enable-load-more")) {
                        boolean z2 = true;
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, true);
                        }
                        enableLoadMore(z2);
                        continue;
                    }
                    break;
                case 363559068:
                    if (nextKey.equals("layout-direction")) {
                        setLayoutDirection(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 561570840:
                    if (nextKey.equals("overflow-text")) {
                        overflowText(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1448017537:
                    if (nextKey.equals("page-enable")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setPageEnable(z);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final boolean needCustomLayout() {
        return true;
    }

    @AbstractC28525m(mo49059a = "overflow-text")
    public final void overflowText(String str) {
        C89219l.m154719c(str, "");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public final void setScrollTap(boolean z) {
    }

    /* renamed from: com.bytedance.ies.xelement.LynxScrollView$a */
    public static final class C18920a {
        static {
            Covode.recordClassIndex(21655);
        }

        private C18920a() {
        }

        public /* synthetic */ C18920a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxScrollView$e */
    final class C18924e extends LinearLayoutManager {

        /* renamed from: a */
        final /* synthetic */ LynxScrollView f44805a;

        static {
            Covode.recordClassIndex(21659);
        }

        /* renamed from: com.bytedance.ies.xelement.LynxScrollView$e$b */
        static final class RunnableC18926b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C18924e f44807a;

            /* renamed from: b */
            final /* synthetic */ C89233z.C89236c f44808b;

            static {
                Covode.recordClassIndex(21661);
            }

            RunnableC18926b(C18924e eVar, C89233z.C89236c cVar) {
                this.f44807a = eVar;
                this.f44808b = cVar;
            }

            public final void run() {
                this.f44807a.f44805a.mo29970a(this.f44808b.element);
            }
        }

        /* renamed from: com.bytedance.ies.xelement.LynxScrollView$e$a */
        final class C18925a extends C1481r {

            /* renamed from: f */
            final /* synthetic */ C18924e f44806f;

            static {
                Covode.recordClassIndex(21660);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: b */
            public final int mo5013b() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: c */
            public final int mo5016c() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final float mo4862a(DisplayMetrics displayMetrics) {
                if (displayMetrics == null) {
                    return super.mo4862a(displayMetrics);
                }
                int i = Build.VERSION.SDK_INT;
                return 50.0f / ((float) displayMetrics.densityDpi);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18925a(C18924e eVar, Context context) {
                super(context);
                C89219l.m154719c(context, "");
                this.f44806f = eVar;
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: a */
        public final void mo4324a(RecyclerView.C1378s sVar) {
            super.mo4324a(sVar);
            if (this.f44805a.f44793j > 0) {
                LynxScrollView lynxScrollView = this.f44805a;
                if (lynxScrollView.mo29971a(lynxScrollView.f44793j, false)) {
                    this.f44805a.f44793j = 0;
                }
            }
            if (this.f44805a.f44794k > 0) {
                C89233z.C89236c cVar = new C89233z.C89236c();
                cVar.element = this.f44805a.f44794k;
                this.f44805a.f44794k = 0;
                LynxScrollView.m35115a(this.f44805a).post(new RunnableC18926b(this, cVar));
            }
        }

        public C18924e(LynxScrollView lynxScrollView, Context context) {
            C89219l.m154719c(context, "");
            this.f44805a = lynxScrollView;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: a */
        public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
            C89219l.m154719c(recyclerView, "");
            C89219l.m154719c(sVar, "");
            Context context = recyclerView.getContext();
            C89219l.m154709a((Object) context, "");
            C18925a aVar = new C18925a(this, context);
            aVar.f4515g = i;
            mo4695a(aVar);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxScrollView$b */
    final class C18921b extends RecyclerView.AbstractC1350a<C18922c> {

        /* renamed from: a */
        public HashSet<Integer> f44802a = new HashSet<>();

        static {
            Covode.recordClassIndex(21656);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C18922c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m35126a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return LynxScrollView.this.mChildren.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C18921b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemViewType(int i) {
            return ((LynxBaseUI) LynxScrollView.this.mChildren.get(i)).hashCode();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onViewAttachedToWindow(C18922c cVar) {
            C28719c cVar2;
            C89219l.m154719c(cVar, "");
            int adapterPosition = cVar.getAdapterPosition();
            if (adapterPosition < LynxScrollView.this.mChildren.size() && !this.f44802a.contains(Integer.valueOf(adapterPosition))) {
                LynxBaseUI lynxBaseUI = (LynxBaseUI) LynxScrollView.this.mChildren.get(adapterPosition);
                if (lynxBaseUI != null && (lynxBaseUI instanceof LynxImpressionView)) {
                    LynxImpressionView lynxImpressionView = (LynxImpressionView) lynxBaseUI;
                    if (lynxImpressionView.f44768a) {
                        lynxImpressionView.hashCode();
                        AbstractC28520j jVar = lynxImpressionView.mContext;
                        if (!(jVar == null || (cVar2 = jVar.f67064e) == null)) {
                            cVar2.mo49834a(new C28724b(lynxImpressionView.getSign(), "impression"));
                        }
                    }
                }
                this.f44802a.add(Integer.valueOf(adapterPosition));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onViewDetachedFromWindow(C18922c cVar) {
            C28719c cVar2;
            C89219l.m154719c(cVar, "");
            int adapterPosition = cVar.getAdapterPosition();
            if (adapterPosition < LynxScrollView.this.mChildren.size() && this.f44802a.contains(Integer.valueOf(adapterPosition))) {
                LynxBaseUI lynxBaseUI = (LynxBaseUI) LynxScrollView.this.mChildren.get(adapterPosition);
                if (lynxBaseUI != null && (lynxBaseUI instanceof LynxImpressionView)) {
                    LynxImpressionView lynxImpressionView = (LynxImpressionView) lynxBaseUI;
                    if (lynxImpressionView.f44769b) {
                        lynxImpressionView.hashCode();
                        AbstractC28520j jVar = lynxImpressionView.mContext;
                        if (!(jVar == null || (cVar2 = jVar.f67064e) == null)) {
                            cVar2.mo49834a(new C28724b(lynxImpressionView.getSign(), "exit"));
                        }
                    }
                }
                this.f44802a.remove(Integer.valueOf(adapterPosition));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(C18922c cVar, int i) {
            C18922c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            LynxScrollView lynxScrollView = LynxScrollView.this;
            View view = cVar2.itemView;
            C89219l.m154709a((Object) view, "");
            Object obj = lynxScrollView.mChildren.get(i);
            C89219l.m154709a(obj, "");
            int width = ((LynxBaseUI) obj).getWidth();
            Object obj2 = lynxScrollView.mChildren.get(i);
            C89219l.m154709a(obj2, "");
            RecyclerView.C1367j jVar = new RecyclerView.C1367j(width, ((LynxBaseUI) obj2).getHeight());
            Object obj3 = lynxScrollView.mChildren.get(i);
            C89219l.m154709a(obj3, "");
            jVar.leftMargin = ((LynxBaseUI) obj3).mMarginLeft;
            Object obj4 = lynxScrollView.mChildren.get(i);
            C89219l.m154709a(obj4, "");
            jVar.rightMargin = ((LynxBaseUI) obj4).mMarginRight;
            Object obj5 = lynxScrollView.mChildren.get(i);
            C89219l.m154709a(obj5, "");
            jVar.topMargin = ((LynxBaseUI) obj5).mMarginTop;
            Object obj6 = lynxScrollView.mChildren.get(i);
            C89219l.m154709a(obj6, "");
            jVar.bottomMargin = ((LynxBaseUI) obj6).mMarginBottom;
            view.setLayoutParams(jVar);
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m35126a(C18921b bVar, ViewGroup viewGroup, int i) {
            C18922c cVar;
            boolean a;
            MethodCollector.m26663i(6618);
            C89219l.m154719c(viewGroup, "");
            Iterator it = LynxScrollView.this.mChildren.iterator();
            while (true) {
                if (!it.hasNext()) {
                    AbstractC28520j jVar = LynxScrollView.this.mContext;
                    C89219l.m154709a((Object) jVar, "");
                    cVar = new C18922c(new FrameLayout(jVar.mo49032a()));
                    break;
                }
                LynxBaseUI lynxBaseUI = (LynxBaseUI) it.next();
                if (lynxBaseUI.hashCode() == i) {
                    T t = ((LynxUI) lynxBaseUI).mView;
                    C89219l.m154709a((Object) t, "");
                    cVar = new C18922c(t);
                    break;
                }
            }
            try {
                if (cVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(cVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = cVar.getClass().getName();
            MethodCollector.m26664o(6618);
            return cVar;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxScrollView$h */
    public static final class C18929h extends RecyclerView {

        /* renamed from: O */
        final /* synthetic */ LynxScrollView f44812O;

        /* renamed from: P */
        final /* synthetic */ Context f44813P;

        static {
            Covode.recordClassIndex(21664);
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            RecyclerView.AbstractC1356f itemAnimator = getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.mo4663a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final void onDetachedFromWindow() {
            C19252i iVar = this.f44812O.f44792i;
            if (iVar != null) {
                RecyclerView a = LynxScrollView.m35115a(this.f44812O);
                C89219l.m154719c(a, "");
                ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnScrollChangedListener(iVar.f45471a);
                }
                iVar.f45471a = null;
            }
            super.onDetachedFromWindow();
            this.f44812O.f44792i = null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
            if (r0 == null) goto L_0x004a;
         */
        @Override // androidx.recyclerview.widget.RecyclerView
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void requestLayout() {
            /*
            // Method dump skipped, instructions count: 108
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxScrollView.C18929h.requestLayout():void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18929h(Context context, LynxScrollView lynxScrollView, Context context2) {
            super(context);
            this.f44812O = lynxScrollView;
            this.f44813P = context2;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final int getScrollX() {
        RecyclerView recyclerView = this.f44790g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        return recyclerView.computeHorizontalScrollOffset();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final int getScrollY() {
        RecyclerView recyclerView = this.f44790g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        return recyclerView.computeVerticalScrollOffset();
    }

    /* renamed from: com.bytedance.ies.xelement.LynxScrollView$g */
    public static final class C18928g implements C18989b.AbstractC18991b {

        /* renamed from: a */
        final /* synthetic */ LynxScrollView f44810a;

        /* renamed from: b */
        final /* synthetic */ Context f44811b;

        static {
            Covode.recordClassIndex(21663);
        }

        @Override // com.bytedance.ies.xelement.C18989b.AbstractC18991b
        /* renamed from: a */
        public final void mo29984a() {
            AbstractC28520j jVar;
            C28719c cVar;
            if (this.f44810a.f44784a && (jVar = this.f44810a.mContext) != null && (cVar = jVar.f67064e) != null) {
                cVar.mo49834a(new C28724b(this.f44810a.getSign(), "scrolltobounce"));
            }
        }

        C18928g(LynxScrollView lynxScrollView, Context context) {
            this.f44810a = lynxScrollView;
            this.f44811b = context;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        int i3 = this.mPaddingTop + this.mBorderTopWidth;
        int i4 = this.mPaddingBottom + this.mBorderBottomWidth;
        RecyclerView recyclerView = this.f44790g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.setPadding(i, i3, i2, i4);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void measureChildren() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Integer num;
        super.measureChildren();
        LynxBounceView lynxBounceView = this.f44801s;
        if (lynxBounceView != null) {
            lynxBounceView.measure();
        }
        View mBounceView = ((C18989b) this.mView).getMBounceView();
        Integer num2 = null;
        if (!(mBounceView == null || (layoutParams2 = mBounceView.getLayoutParams()) == null)) {
            LynxBounceView lynxBounceView2 = this.f44801s;
            if (lynxBounceView2 != null) {
                num = Integer.valueOf(lynxBounceView2.getWidth());
            } else {
                num = null;
            }
            layoutParams2.width = num.intValue();
        }
        View mBounceView2 = ((C18989b) this.mView).getMBounceView();
        if (!(mBounceView2 == null || (layoutParams = mBounceView2.getLayoutParams()) == null)) {
            LynxBounceView lynxBounceView3 = this.f44801s;
            if (lynxBounceView3 != null) {
                num2 = Integer.valueOf(lynxBounceView3.getHeight());
            }
            layoutParams.height = num2.intValue();
        }
        LynxBounceView lynxBounceView4 = this.f44801s;
        if (lynxBounceView4 != null) {
            lynxBounceView4.layout();
        }
    }

    /* renamed from: a */
    public final int mo29968a() {
        int i;
        int i2;
        int i3;
        RecyclerView recyclerView = this.f44790g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int i4 = 0;
        if (linearLayoutManager == null || this.mChildren.size() == 0) {
            return 0;
        }
        int k = linearLayoutManager.mo4371k();
        if (k >= 0 && k < this.mChildren.size()) {
            View c = linearLayoutManager.mo4358c(k);
            if (linearLayoutManager.mo4366f()) {
                if (this.mLynxDirection == 2) {
                    int width = getWidth();
                    Object obj = this.mChildren.get(this.mChildren.size() - 1);
                    C89219l.m154709a(obj, "");
                    int left = width - ((LynxBaseUI) obj).getLeft();
                    Object obj2 = this.mChildren.get(this.mChildren.size() - 1);
                    C89219l.m154709a(obj2, "");
                    int i5 = left + ((LynxBaseUI) obj2).mMarginLeft + this.mPaddingLeft;
                    Object obj3 = this.mChildren.get(0);
                    C89219l.m154709a(obj3, "");
                    int left2 = ((LynxBaseUI) obj3).getLeft();
                    Object obj4 = this.mChildren.get(k);
                    C89219l.m154709a(obj4, "");
                    int left3 = left2 - ((LynxBaseUI) obj4).getLeft();
                    Object obj5 = this.mChildren.get(0);
                    C89219l.m154709a(obj5, "");
                    int width2 = left3 + ((LynxBaseUI) obj5).getWidth();
                    Object obj6 = this.mChildren.get(0);
                    C89219l.m154709a(obj6, "");
                    int i6 = width2 + ((LynxBaseUI) obj6).mMarginRight + this.mPaddingRight;
                    if (c != null) {
                        i3 = getWidth() - c.getLeft();
                    } else {
                        i3 = 0;
                    }
                    int i7 = i6 - i3;
                    if ((i5 - getWidth()) - i7 <= this.f44799q) {
                        i4 = 2;
                    }
                    if (i7 <= this.f44800r) {
                        i4 |= 1;
                    }
                    this.f44797n = i7;
                } else {
                    Object obj7 = this.mChildren.get(this.mChildren.size() - 1);
                    C89219l.m154709a(obj7, "");
                    int left4 = ((LynxBaseUI) obj7).getLeft();
                    Object obj8 = this.mChildren.get(this.mChildren.size() - 1);
                    C89219l.m154709a(obj8, "");
                    int width3 = left4 + ((LynxBaseUI) obj8).getWidth();
                    Object obj9 = this.mChildren.get(this.mChildren.size() - 1);
                    C89219l.m154709a(obj9, "");
                    int i8 = width3 + ((LynxBaseUI) obj9).mMarginRight + this.mPaddingLeft;
                    Object obj10 = this.mChildren.get(k);
                    C89219l.m154709a(obj10, "");
                    int left5 = ((LynxBaseUI) obj10).getLeft() + 0;
                    if (c != null) {
                        i2 = c.getLeft();
                    } else {
                        i2 = 0;
                    }
                    int i9 = left5 - i2;
                    int width4 = (i8 - i9) - getWidth();
                    if (i9 <= this.f44800r) {
                        i4 = 1;
                    }
                    if (width4 <= this.f44799q) {
                        i4 |= 2;
                    }
                    this.f44797n = i9;
                }
            } else if (linearLayoutManager.mo4368g()) {
                Object obj11 = this.mChildren.get(this.mChildren.size() - 1);
                C89219l.m154709a(obj11, "");
                int top = ((LynxBaseUI) obj11).getTop();
                Object obj12 = this.mChildren.get(this.mChildren.size() - 1);
                C89219l.m154709a(obj12, "");
                int height = top + ((LynxBaseUI) obj12).getHeight();
                Object obj13 = this.mChildren.get(this.mChildren.size() - 1);
                C89219l.m154709a(obj13, "");
                int i10 = height + ((LynxBaseUI) obj13).mMarginBottom + this.mPaddingBottom;
                Object obj14 = this.mChildren.get(k);
                C89219l.m154709a(obj14, "");
                int top2 = ((LynxBaseUI) obj14).getTop();
                if (c != null) {
                    i = c.getTop();
                } else {
                    i = 0;
                }
                int i11 = top2 - i;
                int height2 = (i10 - getHeight()) - i11;
                if (i11 <= this.f44800r) {
                    i4 = 1;
                }
                if (height2 <= this.f44799q) {
                    i4 |= 2;
                }
                this.f44797n = i11;
            }
        }
        return i4;
    }

    @AbstractC28525m(mo49059a = "enable-load-more", mo49064f = true)
    public final void enableLoadMore(boolean z) {
        this.f44798o = z;
    }

    @AbstractC28525m(mo49059a = "page-enable", mo49064f = false)
    public final void setPageEnable(boolean z) {
        this.f44789f = z;
    }

    /* renamed from: com.bytedance.ies.xelement.LynxScrollView$d */
    final class C18923d extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(21658);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C18923d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154719c(recyclerView, "");
            LynxScrollView.this.recognizeGesturere();
            if (LynxScrollView.this.f44788e && LynxScrollView.this.f44791h == 1 && (i == 2 || i == 0)) {
                if (((C18989b) LynxScrollView.this.mView).getMScrollDirection() == C18989b.EnumC18992c.HORIZONTAL_LEFT || ((C18989b) LynxScrollView.this.mView).getMScrollDirection() == C18989b.EnumC18992c.HORIZONTAL_RIGHT) {
                    int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                    LynxScrollView.this.mo29969a(computeHorizontalScrollOffset, 0, computeHorizontalScrollOffset, 0, "dragend");
                }
                if (((C18989b) LynxScrollView.this.mView).getMScrollDirection() == C18989b.EnumC18992c.VERTICAL_BOTTOM || ((C18989b) LynxScrollView.this.mView).getMScrollDirection() == C18989b.EnumC18992c.VERTICAL_TOP) {
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    LynxScrollView.this.mo29969a(0, computeVerticalScrollOffset, 0, computeVerticalScrollOffset, "dragend");
                }
            }
            LynxScrollView.this.f44791h = i;
            if (i == 0 && LynxScrollView.this.f44789f) {
                if (((C18989b) LynxScrollView.this.mView).getMScrollDirection() == C18989b.EnumC18992c.HORIZONTAL_LEFT || ((C18989b) LynxScrollView.this.mView).getMScrollDirection() == C18989b.EnumC18992c.HORIZONTAL_RIGHT) {
                    int measuredWidth = recyclerView.getMeasuredWidth();
                    int computeHorizontalScrollOffset2 = recyclerView.computeHorizontalScrollOffset() % measuredWidth;
                    if (computeHorizontalScrollOffset2 * 2 > measuredWidth) {
                        recyclerView.mo4395a(measuredWidth - computeHorizontalScrollOffset2, 0);
                    } else {
                        recyclerView.mo4395a(-computeHorizontalScrollOffset2, 0);
                    }
                } else if (((C18989b) LynxScrollView.this.mView).getMScrollDirection() == C18989b.EnumC18992c.VERTICAL_BOTTOM || ((C18989b) LynxScrollView.this.mView).getMScrollDirection() == C18989b.EnumC18992c.VERTICAL_TOP) {
                    int measuredHeight = recyclerView.getMeasuredHeight();
                    int computeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset() % measuredHeight;
                    if (computeVerticalScrollOffset2 * 2 > measuredHeight) {
                        recyclerView.mo4395a(0, measuredHeight - computeVerticalScrollOffset2);
                    } else {
                        recyclerView.mo4395a(0, -computeVerticalScrollOffset2);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154719c(recyclerView, "");
            if (LynxScrollView.this.f44786c || LynxScrollView.this.f44785b) {
                int a = LynxScrollView.this.mo29968a();
                if (!LynxScrollView.this.f44786c || (!LynxScrollView.m35117c(a) || !(!LynxScrollView.m35117c(LynxScrollView.this.f44796m)))) {
                    if (LynxScrollView.this.f44785b && (LynxScrollView.m35116b(a) && (!LynxScrollView.m35116b(LynxScrollView.this.f44796m)))) {
                        if (i != 0) {
                            LynxScrollView lynxScrollView = LynxScrollView.this;
                            lynxScrollView.mo29969a(lynxScrollView.f44797n, 0, LynxScrollView.this.f44797n + i, 0, "scrolltoupper");
                        } else if (i2 != 0) {
                            LynxScrollView lynxScrollView2 = LynxScrollView.this;
                            lynxScrollView2.mo29969a(0, lynxScrollView2.f44797n, 0, LynxScrollView.this.f44797n + i2, "scrolltoupper");
                        }
                    }
                } else if (i != 0) {
                    LynxScrollView lynxScrollView3 = LynxScrollView.this;
                    lynxScrollView3.mo29969a(lynxScrollView3.f44797n, 0, LynxScrollView.this.f44797n + i, 0, "scrolltolower");
                } else if (i2 != 0) {
                    LynxScrollView lynxScrollView4 = LynxScrollView.this;
                    lynxScrollView4.mo29969a(0, lynxScrollView4.f44797n, 0, LynxScrollView.this.f44797n + i2, "scrolltolower");
                }
                LynxScrollView.this.f44796m = a;
            }
            if (!LynxScrollView.this.f44787d) {
                return;
            }
            if (i != 0) {
                LynxScrollView lynxScrollView5 = LynxScrollView.this;
                lynxScrollView5.mo29969a(lynxScrollView5.f44797n, 0, LynxScrollView.this.f44797n + i, 0, "scroll");
            } else if (i2 != 0) {
                LynxScrollView lynxScrollView6 = LynxScrollView.this;
                lynxScrollView6.mo29969a(0, lynxScrollView6.f44797n, 0, LynxScrollView.this.f44797n + i2, "scroll");
            }
        }
    }

    @AbstractC28525m(mo49059a = "bounce", mo49064f = false)
    public final void setBounces(boolean z) {
        ((C18989b) this.mView).setMEnableBounce(z);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public final void setLowerThreshole(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f44799q = i;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public final void setUpperThreshole(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f44800r = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.LynxScrollView$c */
    public static final class C18922c extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(21657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18922c(View view) {
            super(view);
            C89219l.m154719c(view, "");
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxScrollView$f */
    static final class C18927f extends C1481r {

        /* renamed from: f */
        private int f44809f;

        static {
            Covode.recordClassIndex(21662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C18927f(Context context) {
            super(context);
            C89219l.m154719c(context, "");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C18927f(Context context, int i) {
            this(context);
            C89219l.m154719c(context, "");
            this.f44809f = i;
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final int mo5012a(View view, int i) {
            C89219l.m154719c(view, "");
            RecyclerView.AbstractC1362i iVar = this.f4517i;
            if (iVar == null || !iVar.mo4368g()) {
                return 0;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return (iVar.mo4732u() - (RecyclerView.AbstractC1362i.m4432p(view) - ((RecyclerView.C1367j) layoutParams).topMargin)) + this.f44809f;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: b */
        public final int mo5015b(View view, int i) {
            C89219l.m154719c(view, "");
            RecyclerView.AbstractC1362i iVar = this.f4517i;
            if (iVar == null || !iVar.mo4366f()) {
                return 0;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return (iVar.mo4731t() - (RecyclerView.AbstractC1362i.m4431o(view) - ((RecyclerView.C1367j) layoutParams).leftMargin)) + this.f44809f;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxScrollView(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
    }

    /* renamed from: a */
    public static final /* synthetic */ RecyclerView m35115a(LynxScrollView lynxScrollView) {
        RecyclerView recyclerView = lynxScrollView.f44790g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        return recyclerView;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void removeChildV2(LynxBaseUI lynxBaseUI) {
        C89219l.m154719c(lynxBaseUI, "");
        removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public final void scrollToIndex(int i) {
        if (!mo29971a(i, false)) {
            this.f44793j = i;
        } else {
            this.f44793j = 0;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public final void setScrollLeft(int i) {
        this.f44794k = 0;
        if (!mo29970a(i)) {
            this.f44794k = i;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public final void setScrollTop(int i) {
        this.f44794k = 0;
        if (!mo29970a(i)) {
            this.f44794k = i;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        this.mLynxDirection = i;
        if (i == 2) {
            RecyclerView recyclerView = this.f44790g;
            if (recyclerView == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView.setLayoutDirection(1);
            return;
        }
        RecyclerView recyclerView2 = this.f44790g;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView2.setLayoutDirection(0);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        C89219l.m154719c(lynxBaseUI, "");
        int indexOf = this.mChildren.indexOf(lynxBaseUI);
        if (this.mChildren.remove(lynxBaseUI)) {
            RecyclerView recyclerView = this.f44790g;
            if (recyclerView == null) {
                C89219l.m154710a("mRecyclerView");
            }
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemRemoved(indexOf);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f44786c = map.containsKey("scrolltolower");
            this.f44785b = map.containsKey("scrolltoupper");
            this.f44787d = map.containsKey("scroll");
            this.f44784a = map.containsKey("scrolltobounce");
            this.f44788e = map.containsKey("dragend");
        }
    }

    @AbstractC28525m(mo49059a = "layout-direction")
    public final void setLayoutDirection(String str) {
        C89219l.m154719c(str, "");
        if (C89219l.m154714a((Object) str, (Object) "ltr")) {
            RecyclerView recyclerView = this.f44790g;
            if (recyclerView == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView.setLayoutDirection(0);
        } else if (C89219l.m154714a((Object) str, (Object) "rtl")) {
            RecyclerView recyclerView2 = this.f44790g;
            if (recyclerView2 == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView2.setLayoutDirection(1);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    public final void mo29936a(boolean z) {
        LinearLayoutManager linearLayoutManager = null;
        if (!z) {
            ((C18989b) this.mView).setMScrollDirection(C18989b.EnumC18992c.HORIZONTAL_RIGHT);
            RecyclerView recyclerView = this.f44790g;
            if (recyclerView == null) {
                C89219l.m154710a("mRecyclerView");
            }
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = layoutManager;
            }
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) linearLayoutManager;
            if (linearLayoutManager2 != null) {
                linearLayoutManager2.mo4356b(0);
                return;
            }
            return;
        }
        ((C18989b) this.mView).setMScrollDirection(C18989b.EnumC18992c.VERTICAL_BOTTOM);
        RecyclerView recyclerView2 = this.f44790g;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        RecyclerView.AbstractC1362i layoutManager2 = recyclerView2.getLayoutManager();
        if (layoutManager2 instanceof LinearLayoutManager) {
            linearLayoutManager = layoutManager2;
        }
        LinearLayoutManager linearLayoutManager3 = linearLayoutManager;
        if (linearLayoutManager3 != null) {
            linearLayoutManager3.mo4356b(1);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: b */
    public final void mo29937b(boolean z) {
        LinearLayoutManager linearLayoutManager = null;
        if (z) {
            ((C18989b) this.mView).setMScrollDirection(C18989b.EnumC18992c.HORIZONTAL_RIGHT);
            RecyclerView recyclerView = this.f44790g;
            if (recyclerView == null) {
                C89219l.m154710a("mRecyclerView");
            }
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = layoutManager;
            }
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) linearLayoutManager;
            if (linearLayoutManager2 != null) {
                linearLayoutManager2.mo4356b(0);
                return;
            }
            return;
        }
        ((C18989b) this.mView).setMScrollDirection(C18989b.EnumC18992c.VERTICAL_BOTTOM);
        RecyclerView recyclerView2 = this.f44790g;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        RecyclerView.AbstractC1362i layoutManager2 = recyclerView2.getLayoutManager();
        if (layoutManager2 instanceof LinearLayoutManager) {
            linearLayoutManager = layoutManager2;
        }
        LinearLayoutManager linearLayoutManager3 = linearLayoutManager;
        if (linearLayoutManager3 != null) {
            linearLayoutManager3.mo4356b(1);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        C89219l.m154719c(context, "");
        C18989b bVar = new C18989b(context);
        bVar.setOnScrollToEndListener(new C18928g(this, context));
        bVar.setMScrollDirection(C18989b.EnumC18992c.VERTICAL_BOTTOM);
        C18929h hVar = new C18929h(context, this, context);
        hVar.setAdapter(new C18921b());
        hVar.setLayoutDirection(0);
        C18924e eVar = new C18924e(this, context);
        eVar.mo4356b(1);
        hVar.setLayoutManager(eVar);
        hVar.mo4405a(new C18923d());
        this.f44790g = hVar;
        bVar.setMContentView(hVar);
        RecyclerView recyclerView = this.f44790g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.setClipChildren(false);
        RecyclerView recyclerView2 = this.f44790g;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        C19252i iVar = new C19252i();
        this.f44792i = iVar;
        C89219l.m154719c(recyclerView2, "");
        recyclerView2.mo4405a(iVar.f45472b);
        C89219l.m154719c(recyclerView2, "");
        iVar.f45471a = new C19252i.ViewTreeObserver$OnScrollChangedListenerC19254b(recyclerView2, iVar);
        ViewTreeObserver viewTreeObserver = recyclerView2.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnScrollChangedListener(iVar.f45471a);
        }
        bVar.setClipChildren(false);
        return bVar;
    }

    @AbstractC28525m(mo49059a = "scroll-to-id")
    public final void scrollToId(String str) {
        C89219l.m154719c(str, "");
        List list = this.mChildren;
        C89219l.m154709a((Object) list, "");
        for (Object obj : list) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) obj;
            C89219l.m154709a((Object) lynxBaseUI, "");
            if (C89219l.m154714a((Object) lynxBaseUI.mName, (Object) str)) {
                if (obj != null) {
                    int indexOf = this.mChildren.indexOf(obj);
                    RecyclerView recyclerView = this.f44790g;
                    if (recyclerView == null) {
                        C89219l.m154710a("mRecyclerView");
                    }
                    if (recyclerView.getAdapter() != null) {
                        RecyclerView recyclerView2 = this.f44790g;
                        if (recyclerView2 == null) {
                            C89219l.m154710a("mRecyclerView");
                        }
                        RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
                        if (adapter == null) {
                            C89219l.m154707a();
                        }
                        C89219l.m154709a((Object) adapter, "");
                        if (adapter.getItemCount() > indexOf) {
                            RecyclerView recyclerView3 = this.f44790g;
                            if (recyclerView3 == null) {
                                C89219l.m154710a("mRecyclerView");
                            }
                            recyclerView3.mo4435d(indexOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    public final void setScrollBarEnable(boolean z) {
        if (((C18989b) this.mView).getMScrollDirection() == C18989b.EnumC18992c.VERTICAL_BOTTOM || ((C18989b) this.mView).getMScrollDirection() == C18989b.EnumC18992c.VERTICAL_TOP) {
            RecyclerView recyclerView = this.f44790g;
            if (recyclerView == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView.setVerticalScrollBarEnabled(z);
        } else if (((C18989b) this.mView).getMScrollDirection() == C18989b.EnumC18992c.HORIZONTAL_LEFT || ((C18989b) this.mView).getMScrollDirection() == C18989b.EnumC18992c.HORIZONTAL_RIGHT) {
            RecyclerView recyclerView2 = this.f44790g;
            if (recyclerView2 == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView2.setHorizontalScrollBarEnabled(z);
        }
    }

    /* renamed from: a */
    public final boolean mo29970a(int i) {
        RecyclerView recyclerView = this.f44790g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        int computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        RecyclerView recyclerView2 = this.f44790g;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        int computeVerticalScrollRange = recyclerView2.computeVerticalScrollRange();
        if (computeHorizontalScrollRange > 0) {
            RecyclerView recyclerView3 = this.f44790g;
            if (recyclerView3 == null) {
                C89219l.m154710a("mRecyclerView");
            }
            int computeHorizontalScrollOffset = i - recyclerView3.computeHorizontalScrollOffset();
            RecyclerView recyclerView4 = this.f44790g;
            if (recyclerView4 == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView4.scrollBy(computeHorizontalScrollOffset, 0);
            return true;
        } else if (computeVerticalScrollRange <= 0) {
            return false;
        } else {
            RecyclerView recyclerView5 = this.f44790g;
            if (recyclerView5 == null) {
                C89219l.m154710a("mRecyclerView");
            }
            int computeVerticalScrollOffset = i - recyclerView5.computeVerticalScrollOffset();
            RecyclerView recyclerView6 = this.f44790g;
            if (recyclerView6 == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView6.scrollBy(0, computeVerticalScrollOffset);
            return true;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void insertChildV2(LynxBaseUI lynxBaseUI, int i) {
        C89219l.m154719c(lynxBaseUI, "");
        insertChild(lynxBaseUI, i);
    }

    @AbstractC28528p
    public final void scrollToIndex(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        try {
            if (mo29971a(readableMap.getInt("index", 0), readableMap.getBoolean("smooth", false))) {
                callback.invoke(0, javaOnlyMap);
                return;
            }
            callback.invoke(1, javaOnlyMap);
        } catch (Throwable th) {
            javaOnlyMap.put("error", th.getMessage());
            callback.invoke(4, javaOnlyMap);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        C89219l.m154719c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxBounceView) {
            LynxBounceView lynxBounceView = (LynxBounceView) lynxBaseUI;
            String str = lynxBounceView.f44765a;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        ((C18989b) this.mView).setMScrollDirection(C18989b.EnumC18992c.VERTICAL_BOTTOM);
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        ((C18989b) this.mView).setMScrollDirection(C18989b.EnumC18992c.VERTICAL_TOP);
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        ((C18989b) this.mView).setMScrollDirection(C18989b.EnumC18992c.HORIZONTAL_LEFT);
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        ((C18989b) this.mView).setMScrollDirection(C18989b.EnumC18992c.HORIZONTAL_RIGHT);
                        break;
                    }
                    break;
            }
            this.f44801s = lynxBounceView;
            ((C18989b) this.mView).setMBounceView((C28698a) lynxBounceView.mView);
        } else if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i, lynxBaseUI);
            RecyclerView recyclerView = this.f44790g;
            if (recyclerView == null) {
                C89219l.m154710a("mRecyclerView");
            }
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemInserted(i);
            }
        }
        lynxBaseUI.setParent(this);
    }

    /* renamed from: a */
    public final boolean mo29971a(int i, boolean z) {
        if (i < 0) {
            return false;
        }
        RecyclerView recyclerView = this.f44790g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        if (recyclerView.getAdapter() == null) {
            return false;
        }
        RecyclerView recyclerView2 = this.f44790g;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
        if (adapter == null) {
            C89219l.m154707a();
        }
        C89219l.m154709a((Object) adapter, "");
        if (adapter.getItemCount() <= i) {
            return false;
        }
        if (z) {
            RecyclerView recyclerView3 = this.f44790g;
            if (recyclerView3 == null) {
                C89219l.m154710a("mRecyclerView");
            }
            recyclerView3.mo4435d(i);
            return true;
        }
        RecyclerView recyclerView4 = this.f44790g;
        if (recyclerView4 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        RecyclerView.AbstractC1362i layoutManager = recyclerView4.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager == null) {
            return true;
        }
        linearLayoutManager.mo4347a(i, 0);
        return true;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    public final void mo29934a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
        C89219l.m154719c(lynxBaseUI, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        mo29935a(lynxBaseUI, z, str, str2, 0);
    }

    /* renamed from: a */
    public final void mo29969a(int i, int i2, int i3, int i4, String str) {
        C28719c cVar;
        C89219l.m154719c(str, "");
        C28730h a = C28730h.m57546a(getSign(), str);
        RecyclerView recyclerView = this.f44790g;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        RecyclerView recyclerView2 = this.f44790g;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        a.mo49842a(i, i2, computeVerticalScrollOffset, recyclerView2.computeHorizontalScrollOffset(), i3 - i, i4 - i2);
        AbstractC28520j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f67064e) != null) {
            cVar.mo49834a(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    @Override // com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29935a(com.lynx.tasm.behavior.p2052ui.LynxBaseUI r11, boolean r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxScrollView.mo29935a(com.lynx.tasm.behavior.ui.LynxBaseUI, boolean, java.lang.String, java.lang.String, int):void");
    }
}

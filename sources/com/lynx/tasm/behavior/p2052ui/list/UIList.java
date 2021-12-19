package com.lynx.tasm.behavior.p2052ui.list;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.AbstractC1392ac;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.C1494y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.list.C28638f;
import com.lynx.tasm.behavior.p2052ui.list.C28646i;
import com.lynx.tasm.behavior.p2052ui.list.ListLayoutManager;
import com.lynx.tasm.behavior.p2052ui.view.UIComponent;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.utils.C28926j;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.ui.list.UIList */
public class UIList extends AbsLynxList<RecyclerView> {

    /* renamed from: h */
    public static boolean f67360h;

    /* renamed from: c */
    public C28646i f67361c;

    /* renamed from: d */
    public int f67362d = 1;

    /* renamed from: e */
    C28637e f67363e;

    /* renamed from: f */
    boolean f67364f = true;

    /* renamed from: g */
    public ViewGroup f67365g;

    /* renamed from: i */
    private String f67366i = "single";

    /* renamed from: j */
    private boolean f67367j = true;

    /* renamed from: k */
    private C28638f f67368k;

    /* renamed from: l */
    private boolean f67369l;

    /* renamed from: m */
    private boolean f67370m;

    /* renamed from: n */
    private AbstractC1392ac f67371n;

    /* renamed from: o */
    private View$OnAttachStateChangeListenerC28640g f67372o;

    /* renamed from: p */
    private C28626a f67373p;

    /* renamed from: q */
    private int f67374q = -1;

    static {
        Covode.recordClassIndex(34679);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList, com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            if (hashCode != -1035189822) {
                if (hashCode != 1683042429) {
                    if (hashCode == 1816872768 && nextKey.equals("auto-measure")) {
                        setAutoMeasure(readableMap.getDynamic(nextKey));
                    }
                } else if (nextKey.equals("android-diffable")) {
                    setDiffable(readableMap.getDynamic(nextKey));
                }
            } else if (nextKey.equals("enable-new-exposure-strategy")) {
                boolean z = false;
                if (!readableMap.isNull(nextKey)) {
                    z = readableMap.getBoolean(nextKey, false);
                }
                setNewAppear(z);
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setCacheQueueRatio(AbstractC28367a aVar) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setScrollStateChangeEventThrottle(String str) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setScrollX(AbstractC28367a aVar) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setScrollY(AbstractC28367a aVar) {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingTop + this.mBorderTopWidth;
        int i2 = this.mPaddingBottom + this.mBorderBottomWidth;
        ((RecyclerView) this.mView).setPadding(this.mPaddingLeft + this.mBorderLeftWidth, i, this.mPaddingRight + this.mBorderRightWidth, i2);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.AbstractC28618d
    public void requestLayout() {
        ((RecyclerView) this.mView).requestLayout();
        if (!((RecyclerView) this.mView).isLayoutRequested()) {
            final View view = this.mView;
            ((RecyclerView) this.mView).post(new Runnable() {
                /* class com.lynx.tasm.behavior.p2052ui.list.UIList.RunnableC286231 */

                static {
                    Covode.recordClassIndex(34682);
                }

                public final void run() {
                    view.requestLayout();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo49550b() {
        LLog.m56860b("UIList", "onLayoutCompleted " + this.f67361c.f67459f.size());
        if (this.f67370m && ((RecyclerView) this.mView).getChildCount() > 0) {
            this.f67363e.mo49573a(this.f67361c.f67459f);
            this.f67370m = false;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void layout() {
        boolean isLayoutRequested;
        TraceEvent.m56864a(0, "UIList.layout");
        ViewGroup viewGroup = this.f67365g;
        if (viewGroup != null) {
            isLayoutRequested = viewGroup.isLayoutRequested();
        } else {
            isLayoutRequested = ((RecyclerView) this.mView).isLayoutRequested();
        }
        if (!isLayoutRequested) {
            TraceEvent.m56869b(0, "UIList.layout");
            return;
        }
        layoutChildren();
        ViewGroup viewGroup2 = this.f67365g;
        if (viewGroup2 != null) {
            viewGroup2.layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
        } else {
            ((RecyclerView) this.mView).layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
        }
        C0792v.m2745a(this.mView, getBoundRectForOverflow());
        this.f67373p.mo49558a();
        TraceEvent.m56869b(0, "UIList.layout");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void measure() {
        boolean isLayoutRequested;
        int makeMeasureSpec;
        TraceEvent.m56864a(0, "UIList.measure");
        ViewGroup viewGroup = this.f67365g;
        if (viewGroup != null) {
            isLayoutRequested = viewGroup.isLayoutRequested();
        } else {
            isLayoutRequested = ((RecyclerView) this.mView).isLayoutRequested();
        }
        if (!isLayoutRequested) {
            TraceEvent.m56869b(0, "UIList.measure");
            return;
        }
        measureChildren();
        setLayoutParamsInternal();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
        if (this.f67369l) {
            if (f67360h) {
                LLog.m56860b("UIList", "UIList autoMeasure maxHeight " + this.mMaxHeight);
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) this.mMaxHeight, Integer.MIN_VALUE);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824);
        }
        ViewGroup viewGroup2 = this.f67365g;
        if (viewGroup2 != null) {
            viewGroup2.measure(makeMeasureSpec2, makeMeasureSpec);
        } else {
            ((RecyclerView) this.mView).measure(makeMeasureSpec2, makeMeasureSpec);
        }
        this.f67361c.f67458e = true;
        TraceEvent.m56869b(0, "UIList.measure");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onPropsUpdated() {
        boolean z;
        int size;
        RecyclerView.AbstractC1362i iVar;
        super.onPropsUpdated();
        if (((RecyclerView) this.mView).getAdapter() == null) {
            ((RecyclerView) this.mView).setAdapter(this.f67361c);
        }
        C28646i iVar2 = this.f67361c;
        if (iVar2.f67459f == null || iVar2.f67460g == null || iVar2.f67459f.size() != iVar2.f67460g.size()) {
            z = false;
        } else {
            z = true;
        }
        JavaOnlyMap a = iVar2.f67456c.mo49525a();
        if (a != null) {
            iVar2.f67460g = a.getArray("fullspan");
            iVar2.f67459f = a.getArray("viewTypes");
            iVar2.f67461h = a.getArray("stickyTop");
            iVar2.f67462i = a.getArray("stickyBottom");
            iVar2.f67463j = a.getArray("estimatedHeight");
            boolean z2 = a.getBoolean("diffable");
            iVar2.f67457d = a.getBoolean("newarch");
            for (int i = 0; i < iVar2.f67459f.size(); i++) {
                String string = iVar2.f67459f.getString(i);
                if (!iVar2.f67454a.containsKey(string)) {
                    iVar2.f67454a.put(string, Integer.valueOf(iVar2.f67454a.size()));
                }
            }
            if (z || !z2 || !iVar2.f67458e) {
                iVar2.notifyDataSetChanged();
            } else {
                C28646i.C28647a aVar = iVar2.f67464k;
                ReadableMap map = a.getMap("diffResult");
                aVar.f67468a = map.getArray("insertions");
                aVar.f67469b = map.getArray("removals");
                aVar.f67470c = map.getArray("updateFrom");
                aVar.f67471d = map.getArray("updateTo");
                aVar.f67472e = map.getArray("moveFrom");
                aVar.f67473f = map.getArray("moveTo");
                if (aVar.f67468a.size() > 0 || aVar.f67469b.size() > 0 || aVar.f67470c.size() > 0 || aVar.f67471d.size() > 0 || aVar.f67472e.size() > 0 || aVar.f67473f.size() > 0) {
                    C28646i.this.f67458e = false;
                }
                C28646i.C28647a aVar2 = iVar2.f67464k;
                for (int i2 = 0; i2 < aVar2.f67470c.size(); i2++) {
                    C28646i.this.notifyItemChanged(aVar2.f67470c.getInt(i2), Integer.valueOf(aVar2.f67471d.getInt(i2)));
                }
                for (int i3 = 0; i3 < aVar2.f67472e.size(); i3++) {
                    C28646i.this.notifyItemMoved(aVar2.f67472e.getInt(i3), aVar2.f67473f.getInt(i3));
                }
                for (int size2 = aVar2.f67469b.size() - 1; size2 >= 0; size2--) {
                    C28646i.this.notifyItemRemoved(aVar2.f67469b.getInt(size2));
                }
                for (int i4 = 0; i4 < aVar2.f67468a.size(); i4++) {
                    C28646i.this.notifyItemInserted(aVar2.f67468a.getInt(i4));
                }
            }
        }
        if (this.f67367j) {
            new WeakReference(this);
            if (TextUtils.equals(this.f67366i, "single")) {
                iVar = new ListLayoutManager.ListLinearLayoutManager(this);
            } else if (TextUtils.equals(this.f67366i, "flow")) {
                iVar = new ListLayoutManager.ListGridLayoutManager(this.mContext, this.f67362d, this);
            } else if (TextUtils.equals(this.f67366i, "waterfall")) {
                iVar = new ListLayoutManager.C28622a(this.f67362d, this);
                this.f67361c.f67465l = true;
            } else {
                iVar = null;
            }
            View$OnAttachStateChangeListenerC28640g gVar = this.f67372o;
            if (gVar != null) {
                if (gVar.f67439b.f67448b != -1) {
                    gVar.mo49579a(gVar.f67439b);
                }
                if (gVar.f67440c.f67448b != -1) {
                    gVar.mo49579a(gVar.f67440c);
                }
            }
            ((RecyclerView) this.mView).setLayoutManager(iVar);
        }
        this.f67367j = false;
        if (((RecyclerView) this.mView).getLayoutManager() instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) this.mView).getLayoutManager();
            gridLayoutManager.mo4320a(new GridLayoutManager.AbstractC1337c() {
                /* class com.lynx.tasm.behavior.p2052ui.list.UIList.C286242 */

                static {
                    Covode.recordClassIndex(34683);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
                /* renamed from: a */
                public final int mo4342a(int i) {
                    if (!UIList.this.f67361c.mo49592a(i) || UIList.this.f67362d <= 1) {
                        return 1;
                    }
                    return gridLayoutManager.f4316b;
                }
            });
        }
        if (this.f67361c.f67459f == null) {
            size = 0;
        } else {
            size = this.f67361c.f67459f.size();
        }
        int i5 = this.f67374q;
        if (size > i5 && i5 >= 0) {
            this.f67368k.mo49576a(i5, 0, null);
            this.f67374q = -1;
        }
        LLog.m56860b("UIList", "onPropsUpdated viewNames ".concat(String.valueOf(size)));
        if (this.f67363e.mo49574a()) {
            this.f67370m = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public RecyclerView mo49549a(Context context) {
        return new C28625a(context, this);
    }

    @AbstractC28525m(mo49059a = "auto-measure", mo49060b = "false")
    public void setAutoMeasure(AbstractC28367a aVar) {
        this.f67369l = C28637e.m57265a(aVar, false);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setInitialScrollIndex(AbstractC28367a aVar) {
        this.f67374q = C28637e.m57261a(aVar, -1);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setNeedVisibleCells(boolean z) {
        this.f67363e.f67418g = z;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setScrollEnable(AbstractC28367a aVar) {
        this.f67364f = C28637e.m57265a(aVar, true);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setLowerThreshold(AbstractC28367a aVar) {
        this.f67363e.f67415d = C28637e.m57261a(aVar, 50);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setLowerThresholdItemCount(AbstractC28367a aVar) {
        this.f67363e.f67417f = C28637e.m57261a(aVar, 0);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setScrollEventThrottle(AbstractC28367a aVar) {
        this.f67363e.f67413b = C28637e.m57261a(aVar, 200);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setUpperThreshold(AbstractC28367a aVar) {
        this.f67363e.f67414c = C28637e.m57261a(aVar, 50);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setUpperThresholdItemCount(AbstractC28367a aVar) {
        this.f67363e.f67416e = C28637e.m57261a(aVar, 0);
    }

    public UIList(AbstractC28520j jVar) {
        super(jVar);
        if (f67360h) {
            LLog.m56856a(4, "UIList", "UIList init");
        }
    }

    @AbstractC28525m(mo49059a = "android-diffable", mo49060b = "true")
    public void setDiffable(AbstractC28367a aVar) {
        if (((RecyclerView) this.mView).getAdapter() == null) {
            this.f67361c.setHasStableIds(!C28637e.m57265a(aVar, true));
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setEnableSticky(AbstractC28367a aVar) {
        if (C28637e.m57265a(aVar, false) && this.f67365g == null) {
            View$OnAttachStateChangeListenerC28640g gVar = new View$OnAttachStateChangeListenerC28640g(this);
            this.f67372o = gVar;
            this.f67365g = gVar.f67438a;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setListType(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "single";
        }
        if (!TextUtils.equals(str, this.f67366i)) {
            this.f67367j = true;
            this.f67366i = str;
        }
    }

    @AbstractC28525m(mo49059a = "enable-new-exposure-strategy", mo49064f = false)
    public void setNewAppear(boolean z) {
        C28626a aVar = this.f67373p;
        if (z != aVar.f67384d) {
            aVar.f67384d = z;
            if (z) {
                aVar.f67383c = new C28630c(aVar.f67381a, aVar.f67382b);
            } else {
                aVar.f67383c = new C28627b(aVar.f67381a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.UIList$a */
    public static class C28625a extends RecyclerView {

        /* renamed from: O */
        private WeakReference<AbstractC28520j> f67379O;

        /* renamed from: P */
        private WeakReference<LynxBaseUI> f67380P;

        static {
            Covode.recordClassIndex(34684);
        }

        /* renamed from: d */
        private void m57235d(boolean z) {
            WeakReference<AbstractC28520j> weakReference = this.f67379O;
            if (weakReference != null && this.f67380P != null) {
                AbstractC28520j jVar = weakReference.get();
                LynxBaseUI lynxBaseUI = this.f67380P.get();
                if (z && jVar != null && lynxBaseUI != null) {
                    jVar.mo49037a(lynxBaseUI);
                }
            }
        }

        public C28625a(Context context, LynxBaseUI lynxBaseUI) {
            super(context);
            if (context != null && (context instanceof AbstractC28520j)) {
                this.f67379O = new WeakReference<>(context);
                this.f67380P = new WeakReference<>(lynxBaseUI);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
            boolean dispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
            m57235d(dispatchNestedPreScroll);
            return dispatchNestedPreScroll;
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        /* renamed from: a */
        public final boolean mo4408a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
            boolean a = super.mo4408a(i, i2, iArr, iArr2, i3);
            m57235d(a);
            return a;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        RecyclerView a = mo49549a(context);
        a.setClipToPadding(false);
        this.f67363e = new C28637e(this.mContext.f67064e, a, this);
        this.f67373p = new C28626a(this.mContext.f67064e, a);
        a.setItemAnimator(null);
        this.f67361c = new C28646i(this, this.f67373p);
        this.f67368k = new C28638f(context, a);
        return a;
    }

    @AbstractC28528p
    public void getVisibleCells(Callback callback) {
        if (callback == null) {
            LLog.m56856a(4, "UIList", "getVisibleCells with null callback");
            return;
        }
        callback.invoke(0, this.f67363e.mo49575b());
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setColumnCount(int i) {
        this.f67362d = i;
        RecyclerView.AbstractC1362i layoutManager = ((RecyclerView) this.mView).getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).mo4318a(this.f67362d);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) layoutManager).mo4318a(this.f67362d);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setEnablePagerSnap(AbstractC28367a aVar) {
        if (C28637e.m57265a(aVar, false)) {
            if (this.f67371n == null) {
                this.f67371n = new C1494y();
            }
            this.f67371n.mo4857a((RecyclerView) this.mView);
            return;
        }
        AbstractC1392ac acVar = this.f67371n;
        if (acVar != null) {
            acVar.mo4857a((RecyclerView) null);
            this.f67371n = null;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList
    public void setUpdateAnimation(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "none")) {
            ((RecyclerView) this.mView).setItemAnimator(null);
        }
        if (TextUtils.equals(str, "default")) {
            ((RecyclerView) this.mView).setItemAnimator(new C1434i());
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C28637e eVar = this.f67363e;
        eVar.f67412a = 0;
        if (map != null) {
            if (map.containsKey("scroll")) {
                i = eVar.f67412a | 1;
            } else {
                i = eVar.f67412a;
            }
            eVar.f67412a = i;
            if (map.containsKey("scrolltoupper")) {
                i2 = eVar.f67412a | 2;
            } else {
                i2 = eVar.f67412a;
            }
            eVar.f67412a = i2;
            if (map.containsKey("scrolltolower")) {
                i3 = eVar.f67412a | 4;
            } else {
                i3 = eVar.f67412a;
            }
            eVar.f67412a = i3;
            if (map.containsKey("scrollstatechange")) {
                i4 = eVar.f67412a | 8;
            } else {
                i4 = eVar.f67412a;
            }
            eVar.f67412a = i4;
            if (map.containsKey("layoutcomplete")) {
                i5 = eVar.f67412a | 16;
            } else {
                i5 = eVar.f67412a;
            }
            eVar.f67412a = i5;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutFinish(long j) {
        boolean z;
        boolean z2;
        C28646i iVar = this.f67361c;
        if (f67360h) {
            LLog.m56860b("UIList", "Adapter onLayoutFinish " + (65535 & j));
        }
        C28644h remove = iVar.f67455b.remove(Long.valueOf(j));
        if (remove != null) {
            UIComponent uIComponent = remove.f67449a.f67451b;
            if (uIComponent != null) {
                uIComponent.setTop(0);
                uIComponent.setLeft(0);
                uIComponent.requestLayout();
                if (uIComponent.getWidth() != remove.itemView.getWidth()) {
                    z = true;
                } else {
                    z = false;
                }
                if (uIComponent.getHeight() != remove.itemView.getHeight()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    remove.itemView.requestLayout();
                }
                if (f67360h) {
                    LLog.m56860b("UIList", C1764a.m5928a("UIComponent layout finish, position %d (w %d, h %d)", new Object[]{Integer.valueOf(remove.getAdapterPosition()), Integer.valueOf(uIComponent.getWidth()), Integer.valueOf(uIComponent.getHeight())}));
                }
            }
            remove.f67449a.f67450a = 2;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.list.AbsLynxList, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
        if (f67360h) {
            LLog.m56860b("UIList", "insertChild index: " + i + " child: " + lynxBaseUI);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034 A[RETURN] */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.lynx.tasm.behavior.p2048a.AbstractC28464a hitTest(float r6, float r7) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.list.UIList.hitTest(float, float):com.lynx.tasm.behavior.a.a");
    }

    @AbstractC28528p
    public void scrollToPosition(ReadableMap readableMap, Callback callback) {
        int height;
        if (this.f67361c == null) {
            callback.invoke(1, "scrollToPosition before init");
            return;
        }
        int i = readableMap.getInt("position", 0);
        int a = (int) C28926j.m57938a((float) readableMap.getDouble("offset", 0.0d));
        boolean z = readableMap.getBoolean("smooth", false);
        int a2 = (int) C28926j.m57938a((float) readableMap.getDouble("itemHeight", 0.0d));
        String string = readableMap.getString("alignTo", "none");
        if (i < 0 || i > this.f67361c.getItemCount()) {
            callback.invoke(4, "position < 0 or position >= data count");
        } else if (z) {
            C28638f.RunnableC28639a aVar = this.f67368k.f67427b;
            RecyclerView recyclerView = aVar.f67429a.get();
            if (recyclerView == null || recyclerView.getLayoutManager() == null || recyclerView.getChildCount() == 0) {
                aVar.f67435g = false;
                callback.invoke("can not scroll before init");
                return;
            }
            aVar.f67430b = callback;
            aVar.f67431c = i;
            aVar.f67432d = string;
            aVar.f67433e = a;
            aVar.f67434f = null;
            if (!aVar.f67435g) {
                aVar.f67435g = true;
                recyclerView.post(aVar);
            }
        } else {
            if (TextUtils.equals(string, "middle")) {
                height = (((RecyclerView) this.mView).getHeight() - a2) / 2;
            } else {
                if (TextUtils.equals(string, "bottom")) {
                    height = ((RecyclerView) this.mView).getHeight() - a2;
                }
                this.f67368k.mo49576a(i, a, callback);
            }
            a += height;
            this.f67368k.mo49576a(i, a, callback);
        }
    }
}

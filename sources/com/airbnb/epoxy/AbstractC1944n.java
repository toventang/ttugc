package com.airbnb.epoxy;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.airbnb.epoxy.n */
public abstract class AbstractC1944n {
    private static final AbstractC1921ak NO_OP_TIMER = new C1914ad();
    public static Handler defaultDiffingHandler = C1907ab.f5753b.f5897a;
    public static Handler defaultModelBuildingHandler = C1907ab.f5753b.f5897a;
    private static boolean filterDuplicatesDefault = false;
    private static boolean globalDebugLoggingEnabled = false;
    private static AbstractC1948a globalExceptionHandler = new AbstractC1948a() {
        /* class com.airbnb.epoxy.AbstractC1944n.C19462 */

        static {
            Covode.recordClassIndex(2137);
        }
    };
    public final C1951o adapter;
    private final Runnable buildModelsRunnable;
    private C1953p debugObserver;
    private volatile boolean filterDuplicates;
    public volatile boolean hasBuiltModelsEver;
    public final AbstractC1935f helper;
    private final List<AbstractC1949b> interceptors;
    private final Handler modelBuildHandler;
    private List<AbstractC1950c> modelInterceptorCallbacks;
    public C1937h modelsBeingBuilt;
    public int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    public AbstractC1956s<?> stagedModel;
    public volatile Thread threadBuildingModels;
    public AbstractC1921ak timer;

    /* renamed from: com.airbnb.epoxy.n$a */
    public interface AbstractC1948a {
        static {
            Covode.recordClassIndex(2139);
        }
    }

    /* renamed from: com.airbnb.epoxy.n$b */
    public interface AbstractC1949b {
        static {
            Covode.recordClassIndex(2140);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.n$c */
    public interface AbstractC1950c {
        static {
            Covode.recordClassIndex(2141);
        }

        /* renamed from: a */
        void mo5779a();

        /* renamed from: b */
        void mo5780b();
    }

    /* access modifiers changed from: protected */
    public abstract void buildModels();

    public boolean isStickyHeader(int i) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    /* access modifiers changed from: protected */
    public void onExceptionSwallowed(RuntimeException runtimeException) {
    }

    /* access modifiers changed from: protected */
    public void onModelBound(C1974u uVar, AbstractC1956s<?> sVar, int i, AbstractC1956s<?> sVar2) {
    }

    /* access modifiers changed from: protected */
    public void onModelUnbound(C1974u uVar, AbstractC1956s<?> sVar) {
    }

    /* access modifiers changed from: protected */
    public void onViewAttachedToWindow(C1974u uVar, AbstractC1956s<?> sVar) {
    }

    /* access modifiers changed from: protected */
    public void onViewDetachedFromWindow(C1974u uVar, AbstractC1956s<?> sVar) {
    }

    public void setupStickyHeaderView(View view) {
    }

    public void teardownStickyHeaderView(View view) {
    }

    public C1951o getAdapter() {
        return this.adapter;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    public AbstractC1944n() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    public int getSpanCount() {
        return this.adapter.f5793a;
    }

    public GridLayoutManager.AbstractC1337c getSpanSizeLookup() {
        return this.adapter.f5796d;
    }

    public boolean isMultiSpan() {
        return this.adapter.mo5726d();
    }

    private void assertIsBuildingModels() {
        if (!isBuildingModels()) {
            throw new C1978y("Can only call this when inside the `buildModels` method");
        }
    }

    private void assertNotBuildingModels() {
        if (isBuildingModels()) {
            throw new C1978y("Cannot call this from inside `buildModels`");
        }
    }

    /* access modifiers changed from: package-private */
    public void addCurrentlyStagedModelIfExists() {
        AbstractC1956s<?> sVar = this.stagedModel;
        if (sVar != null) {
            sVar.mo5787a(this);
        }
        this.stagedModel = null;
    }

    public int getExpectedModelCount() {
        int itemCount = this.adapter.getItemCount();
        if (itemCount != 0) {
            return itemCount;
        }
        return 25;
    }

    /* access modifiers changed from: protected */
    public int getModelCountBuiltSoFar() {
        assertIsBuildingModels();
        return this.modelsBeingBuilt.size();
    }

    /* access modifiers changed from: protected */
    public boolean isBuildingModels() {
        if (this.threadBuildingModels == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public boolean isDebugLoggingEnabled() {
        if (this.timer != NO_OP_TIMER) {
            return true;
        }
        return false;
    }

    public synchronized void cancelPendingModelBuild() {
        if (this.requestedModelBuildType != 0) {
            this.requestedModelBuildType = 0;
            this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
        }
    }

    public boolean hasPendingModelBuild() {
        if (this.requestedModelBuildType == 0 && this.threadBuildingModels == null && !this.adapter.f5822f.f5776d.mo5711c()) {
            return false;
        }
        return true;
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new C1978y("Cannot call `requestModelBuild` from inside `buildModels`");
        } else if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    static {
        Covode.recordClassIndex(2135);
    }

    public void runInterceptors() {
        if (!this.interceptors.isEmpty()) {
            List<AbstractC1950c> list = this.modelInterceptorCallbacks;
            if (list != null) {
                for (AbstractC1950c cVar : list) {
                    cVar.mo5779a();
                }
            }
            this.timer.mo5701a("Interceptors executed");
            Iterator<AbstractC1949b> it = this.interceptors.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.timer.mo5700a();
            List<AbstractC1950c> list2 = this.modelInterceptorCallbacks;
            if (list2 != null) {
                for (AbstractC1950c cVar2 : list2) {
                    cVar2.mo5780b();
                }
            }
        }
        this.modelInterceptorCallbacks = null;
    }

    public static void setGlobalDebugLoggingEnabled(boolean z) {
        globalDebugLoggingEnabled = z;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z) {
        filterDuplicatesDefault = z;
    }

    public static void setGlobalExceptionHandler(AbstractC1948a aVar) {
        globalExceptionHandler = aVar;
    }

    public void add(AbstractC1956s<?> sVar) {
        sVar.mo5787a(this);
    }

    public void setFilterDuplicates(boolean z) {
        this.filterDuplicates = z;
    }

    public void addInterceptor(AbstractC1949b bVar) {
        this.interceptors.add(bVar);
    }

    public void addModelBuildListener(AbstractC1917ag agVar) {
        this.adapter.f5824h.add(agVar);
    }

    public void removeInterceptor(AbstractC1949b bVar) {
        this.interceptors.remove(bVar);
    }

    public void removeModelBuildListener(AbstractC1917ag agVar) {
        this.adapter.f5824h.remove(agVar);
    }

    public void setSpanCount(int i) {
        this.adapter.f5793a = i;
    }

    /* access modifiers changed from: package-private */
    public void clearModelFromStaging(AbstractC1956s<?> sVar) {
        if (this.stagedModel != sVar) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    /* access modifiers changed from: package-private */
    public void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void setStagedModel(AbstractC1956s<?> sVar) {
        if (sVar != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = sVar;
    }

    /* access modifiers changed from: protected */
    public void add(AbstractC1956s<?>... sVarArr) {
        C1937h hVar = this.modelsBeingBuilt;
        hVar.ensureCapacity(hVar.size() + sVarArr.length);
        for (AbstractC1956s<?> sVar : sVarArr) {
            add(sVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void addAfterInterceptorCallback(AbstractC1950c cVar) {
        assertIsBuildingModels();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(cVar);
    }

    /* access modifiers changed from: package-private */
    public int getFirstIndexOfModelInBuildingList(AbstractC1956s<?> sVar) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        for (int i = 0; i < size; i++) {
            if (this.modelsBeingBuilt.get(i) == sVar) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean isModelAddedMultipleTimes(AbstractC1956s<?> sVar) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.modelsBeingBuilt.get(i2) == sVar) {
                i++;
            }
        }
        if (i > 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i;
        if (i > 1) {
            C1907ab.f5753b.f5897a.postDelayed(new Runnable() {
                /* class com.airbnb.epoxy.AbstractC1944n.RunnableC19473 */

                static {
                    Covode.recordClassIndex(2138);
                }

                public final void run() {
                    if (AbstractC1944n.this.recyclerViewAttachCount > 1) {
                        AbstractC1944n.this.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
                    }
                }
            }, 3000);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    /* access modifiers changed from: protected */
    public void add(List<? extends AbstractC1956s<?>> list) {
        C1937h hVar = this.modelsBeingBuilt;
        hVar.ensureCapacity(hVar.size() + list.size());
        for (AbstractC1956s<?> sVar : list) {
            add(sVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void addInternal(AbstractC1956s<?> sVar) {
        assertIsBuildingModels();
        if (sVar.f5844g) {
            throw new C1978y("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
        } else if (sVar.f5839b) {
            clearModelFromStaging(sVar);
            sVar.f5841d = null;
            this.modelsBeingBuilt.add(sVar);
        } else {
            throw new C1978y("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C1951o oVar = this.adapter;
        if (oVar.f5794b.f5799a.mo2080b() > 0) {
            throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
        } else if (bundle != null) {
            oVar.f5795c = (ViewHolderState) bundle.getParcelable("saved_state_view_holders");
            if (oVar.f5795c == null) {
                throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C1951o oVar = this.adapter;
        Iterator<C1974u> it = oVar.f5794b.iterator();
        while (it.hasNext()) {
            it.next().mo5821b();
        }
        if (oVar.f5795c.mo2080b() <= 0 || oVar.mHasStableIds) {
            bundle.putParcelable("saved_state_view_holders", oVar.f5795c);
            return;
        }
        throw new IllegalStateException("Must have stable ids when saving view holder state");
    }

    public synchronized void requestDelayedModelBuild(int i) {
        if (!isBuildingModels()) {
            int i2 = 1;
            if (this.requestedModelBuildType == 2) {
                cancelPendingModelBuild();
            } else if (this.requestedModelBuildType == 1) {
                return;
            }
            if (i != 0) {
                i2 = 2;
            }
            this.requestedModelBuildType = i2;
            this.modelBuildHandler.postDelayed(this.buildModelsRunnable, (long) i);
            return;
        }
        throw new C1978y("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
    }

    public void setDebugLoggingEnabled(boolean z) {
        assertNotBuildingModels();
        if (z) {
            this.timer = new C1939i(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new C1953p(getClass().getSimpleName());
            }
            this.adapter.registerAdapterDataObserver(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        C1953p pVar = this.debugObserver;
        if (pVar != null) {
            this.adapter.unregisterAdapterDataObserver(pVar);
        }
    }

    public void filterDuplicatesIfNeeded(List<AbstractC1956s<?>> list) {
        if (this.filterDuplicates) {
            this.timer.mo5701a("Duplicates filtered");
            HashSet hashSet = new HashSet(list.size());
            ListIterator<AbstractC1956s<?>> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                AbstractC1956s<?> next = listIterator.next();
                if (!hashSet.add(Long.valueOf(next.f5838a))) {
                    int previousIndex = listIterator.previousIndex();
                    listIterator.remove();
                    int findPositionOfDuplicate = findPositionOfDuplicate(list, next);
                    AbstractC1956s<?> sVar = list.get(findPositionOfDuplicate);
                    if (previousIndex <= findPositionOfDuplicate) {
                        findPositionOfDuplicate++;
                    }
                    onExceptionSwallowed(new C1978y("Two models have the same ID. ID's must be unique!\nOriginal has position " + findPositionOfDuplicate + ":\n" + sVar + "\nDuplicate has position " + previousIndex + ":\n" + next));
                }
            }
            this.timer.mo5700a();
        }
    }

    public AbstractC1944n(Handler handler, Handler handler2) {
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        this.helper = C1936g.m6159a(this);
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new Runnable() {
            /* class com.airbnb.epoxy.AbstractC1944n.RunnableC19451 */

            static {
                Covode.recordClassIndex(2136);
            }

            public final void run() {
                AbstractC1944n.this.threadBuildingModels = Thread.currentThread();
                AbstractC1944n.this.cancelPendingModelBuild();
                AbstractC1944n.this.helper.resetAutoModels();
                AbstractC1944n.this.modelsBeingBuilt = new C1937h(AbstractC1944n.this.getExpectedModelCount());
                AbstractC1944n.this.timer.mo5701a("Models built");
                try {
                    AbstractC1944n.this.buildModels();
                    AbstractC1944n.this.addCurrentlyStagedModelIfExists();
                    AbstractC1944n.this.timer.mo5700a();
                    AbstractC1944n.this.runInterceptors();
                    AbstractC1944n nVar = AbstractC1944n.this;
                    nVar.filterDuplicatesIfNeeded(nVar.modelsBeingBuilt);
                    C1937h hVar = AbstractC1944n.this.modelsBeingBuilt;
                    hVar.f5756c = C1937h.f5804a;
                    if (hVar.f5755b) {
                        hVar.f5755b = false;
                        AbstractC1944n.this.timer.mo5701a("Models diffed");
                        AbstractC1944n.this.adapter.mo5781a(AbstractC1944n.this.modelsBeingBuilt);
                        AbstractC1944n.this.timer.mo5700a();
                        AbstractC1944n.this.modelsBeingBuilt = null;
                        AbstractC1944n.this.hasBuiltModelsEver = true;
                        AbstractC1944n.this.threadBuildingModels = null;
                        return;
                    }
                    throw new IllegalStateException("Notifications already resumed");
                } catch (Throwable th) {
                    AbstractC1944n.this.timer.mo5700a();
                    AbstractC1944n.this.modelsBeingBuilt = null;
                    AbstractC1944n.this.hasBuiltModelsEver = true;
                    AbstractC1944n.this.threadBuildingModels = null;
                    AbstractC1944n.this.stagedModel = null;
                    throw th;
                }
            }
        };
        this.adapter = new C1951o(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    private int findPositionOfDuplicate(List<AbstractC1956s<?>> list, AbstractC1956s<?> sVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).f5838a == sVar.f5838a) {
                return i;
            }
        }
        throw new IllegalArgumentException("No duplicates in list");
    }

    public void moveModel(int i, int i2) {
        assertNotBuildingModels();
        C1951o oVar = this.adapter;
        ArrayList arrayList = new ArrayList(oVar.f5822f.f5778f);
        arrayList.add(i2, arrayList.remove(i));
        oVar.f5821e.f5769a = true;
        oVar.notifyItemMoved(i, i2);
        oVar.f5821e.f5769a = false;
        if (oVar.f5822f.mo5704a(arrayList)) {
            oVar.f5823g.requestModelBuild();
        }
        requestDelayedModelBuild(500);
    }
}

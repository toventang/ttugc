package com.bytedance.android.widget;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1205n;
import com.C1764a;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class WidgetManager implements AbstractC1204m, AbstractC33974au {
    public static final String TAG = WidgetManager.class.getCanonicalName();
    public C12243c asyncLayoutInflater;
    public boolean configured;
    public View contentView;
    public Context context;
    Map<Object, Long> customCallBackInfoMap = new ConcurrentHashMap();
    protected boolean isRTL;
    public C1205n lifecycleRegistry = new C1205n(this);
    public FluencyOpt mFluencyOpt;
    public AbstractC12240a mWidgetCreateTimeListener;
    private final int maxTaskCount;
    public Fragment parentFragment;
    public LayoutInflater syncLayoutInflater;
    public Widget.AbstractC12236a widgetCallback = new Widget.AbstractC12236a() {
        /* class com.bytedance.android.widget.WidgetManager.C122381 */

        static {
            Covode.recordClassIndex(13973);
        }

        @Override // com.bytedance.android.widget.Widget.AbstractC12236a
        public final void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
        }

        @Override // com.bytedance.android.widget.Widget.AbstractC12236a
        public final void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget) {
        }

        @Override // com.bytedance.android.widget.Widget.AbstractC12236a
        public final void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
        }

        @Override // com.bytedance.android.widget.Widget.AbstractC12236a
        public final void removeAllMessages(Object obj) {
        }

        @Override // com.bytedance.android.widget.Widget.AbstractC12236a
        public final Fragment getFragment() {
            return WidgetManager.this.parentFragment;
        }

        @Override // com.bytedance.android.widget.Widget.AbstractC12236a
        public final void unloadWidget(Widget widget) {
            WidgetManager.this.unload(widget);
        }

        @Override // com.bytedance.android.widget.Widget.AbstractC12236a
        public final void loadWidget(Widget widget) {
            WidgetManager.this.load(widget);
        }

        @Override // com.bytedance.android.widget.Widget.AbstractC12236a
        public final void loadWidget(int i, Widget widget, boolean z) {
            WidgetManager.this.load(i, widget, z);
        }
    };
    public Map<Widget, ViewGroup> widgetViewGroupHashMap = new HashMap();
    public Set<Widget> widgets = new CopyOnWriteArraySet();

    /* renamed from: com.bytedance.android.widget.WidgetManager$a */
    public interface AbstractC12240a {
        static {
            Covode.recordClassIndex(13975);
        }

        boolean needUploadTime(Widget widget);

        void onLoad(Widget widget, long j);
    }

    /* renamed from: com_bytedance_android_widget_WidgetManager_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m22023x622afae5(String str, String str2) {
        return 0;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.lifecycleRegistry;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        this.lifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        this.lifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        this.lifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onStart() {
        this.lifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
        this.lifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
    }

    static {
        Covode.recordClassIndex(13972);
    }

    public void detachWidget() {
        for (Widget widget : this.widgets) {
            widget.onDetachWidget();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.widget.WidgetManager$2 */
    public static /* synthetic */ class C122392 {

        /* renamed from: a */
        static final /* synthetic */ int[] f29500a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 13974(0x3696, float:1.9582E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.widget.WidgetManager.C122392.f29500a = r2
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.widget.WidgetManager.C122392.f29500a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.CREATED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.widget.WidgetManager.C122392.f29500a     // Catch:{ NoSuchFieldError -> 0x002d }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.STARTED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.widget.WidgetManager.C122392.f29500a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.widget.WidgetManager.C122392.<clinit>():void");
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.lifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        Fragment fragment = this.parentFragment;
        if (fragment != null) {
            fragment.getLifecycle().mo4013b(this);
        }
        this.parentFragment = null;
        this.widgets.clear();
        this.widgetViewGroupHashMap.clear();
        this.customCallBackInfoMap.clear();
    }

    public void addWidgetAndCallCustomBack(Widget widget) {
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
    }

    public WidgetManager(int i) {
        this.maxTaskCount = i;
    }

    public WidgetManager load(Widget widget) {
        if (widget == null) {
            return this;
        }
        if (!widget.shouldAttach()) {
            widget.saveSnapShot(-1, false);
            addWidgetAndCallCustomBack(widget);
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        getLifecycle().mo4012a(widget);
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onCustomInfoCallBack(Widget widget) {
        for (Object obj : this.customCallBackInfoMap.keySet()) {
            if (this.customCallBackInfoMap.get(obj).longValue() < SystemClock.elapsedRealtime() && widget.hasRegister(obj.getClass())) {
                widget.onCustomInfoCallBack(obj);
            }
        }
    }

    public WidgetManager unload(Widget widget) {
        MethodCollector.m26663i(3243);
        if (widget == null) {
            MethodCollector.m26664o(3243);
            return this;
        }
        getLifecycle().mo4013b(widget);
        if (widget.isViewValid) {
            int i = C122392.f29500a[getLifecycle().mo4011a().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    widget.onDestroy();
                } else if (i == 3) {
                    widget.onStop();
                    widget.onDestroy();
                } else if (i == 4) {
                    widget.onPause();
                    widget.onStop();
                    widget.onDestroy();
                }
            } else if (!widget.isDestroyed) {
                widget.onDestroy();
            }
        }
        if (widget.widgetContainer != null) {
            widget.widgetContainer.mo19713a(widget.contentView);
        } else if (this.widgetViewGroupHashMap.containsKey(widget)) {
            if (this.widgetViewGroupHashMap.get(widget) != null) {
                this.widgetViewGroupHashMap.get(widget).removeAllViews();
            }
            this.widgetViewGroupHashMap.remove(widget);
        }
        this.widgets.remove(widget);
        widget.context = null;
        widget.containerView = null;
        widget.widgetCallback = null;
        widget.widgetContainer = null;
        MethodCollector.m26664o(3243);
        return this;
    }

    public WidgetManager load(int i, Widget widget) {
        return load(i, widget, true);
    }

    public <T> void onCustomInfoCallBack(Class<T> cls, T t) {
        if (!(t == null || cls == null)) {
            for (Widget widget : this.widgets) {
                if (widget.hasRegister(cls)) {
                    widget.onCustomInfoCallBack(t);
                }
            }
            this.customCallBackInfoMap.put(t, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: of */
    public static WidgetManager m22024of(Fragment fragment, View view, FluencyOpt fluencyOpt) {
        return m22025of(fragment, view, fluencyOpt, 10);
    }

    /* renamed from: of */
    public static WidgetManager m22026of(ActivityC0945e eVar, View view, FluencyOpt fluencyOpt) {
        return m22027of(eVar, view, fluencyOpt, 10);
    }

    private WidgetManager loadOld(ViewGroup viewGroup, Widget widget, boolean z) {
        View view;
        widget.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(widget, viewGroup);
        if (widget.getLayoutId() == 0) {
            continueLoadOld(widget, viewGroup, null);
            return this;
        }
        if (z) {
            FluencyOpt fluencyOpt = this.mFluencyOpt;
            if (fluencyOpt == null || (view = fluencyOpt.getPreloadLayout(widget.getLayoutId())) == null) {
                this.asyncLayoutInflater.mo19742a(widget.getLayoutId(), viewGroup, new C12253g(this, widget, viewGroup));
            }
            continueLoadOld(widget, viewGroup, view);
        } else {
            FluencyOpt fluencyOpt2 = this.mFluencyOpt;
            if (fluencyOpt2 == null || (view = fluencyOpt2.getPreloadLayout(widget.getLayoutId())) == null) {
                view = C1764a.m5927a(this.syncLayoutInflater, widget.getLayoutId(), viewGroup, false);
            }
            continueLoadOld(widget, viewGroup, view);
        }
        return this;
    }

    public void continueLoadOld(Widget widget, ViewGroup viewGroup, View view) {
        MethodCollector.m26663i(3104);
        if (this.parentFragment == null) {
            MethodCollector.m26664o(3104);
            return;
        }
        widget.widgetContainer = null;
        if (widget.containerView == null) {
            MethodCollector.m26664o(3104);
            return;
        }
        widget.contentView = view;
        if (!(viewGroup == null || view == null)) {
            viewGroup.addView(view);
        }
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        AbstractC12240a aVar = this.mWidgetCreateTimeListener;
        if (aVar == null || !aVar.needUploadTime(widget)) {
            getLifecycle().mo4012a(widget);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            getLifecycle().mo4012a(widget);
            this.mWidgetCreateTimeListener.onLoad(widget, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
        MethodCollector.m26664o(3104);
    }

    private WidgetManager loadNew(WidgetContainer widgetContainer, Widget widget, boolean z) {
        View view;
        View preloadLayout;
        widget.widgetContainer = widgetContainer;
        if (widget.getLayoutId() == 0) {
            continueLoadNew(widget, widgetContainer, null);
        } else if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            FluencyOpt fluencyOpt = this.mFluencyOpt;
            if (fluencyOpt == null || (preloadLayout = fluencyOpt.getPreloadLayout(widget.getLayoutId())) == null) {
                this.asyncLayoutInflater.mo19742a(widget.getLayoutId(), (ViewGroup) widgetContainer.getParent(), new C12252f(this, widget, widgetContainer));
            } else {
                continueLoadNew(widget, widgetContainer, preloadLayout);
            }
            m22023x622afae5("async_inflate_duration", widget.getClass().getSimpleName() + (System.currentTimeMillis() - currentTimeMillis));
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            FluencyOpt fluencyOpt2 = this.mFluencyOpt;
            if (fluencyOpt2 == null || (view = fluencyOpt2.getPreloadLayout(widget.getLayoutId())) == null) {
                view = C1764a.m5927a(this.syncLayoutInflater, widget.getLayoutId(), (ViewGroup) widgetContainer.getParent(), false);
            }
            continueLoadNew(widget, widgetContainer, view);
            m22023x622afae5("inflate_duration", widget.getClass().getSimpleName() + (System.currentTimeMillis() - currentTimeMillis2));
        }
        return this;
    }

    public WidgetManager load(int i, Widget widget, boolean z) {
        if (this.parentFragment == null || widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        if (!widget.shouldAttach()) {
            widget.saveSnapShot(i, z);
            addWidgetAndCallCustomBack(widget);
            return this;
        } else if (this.contentView.findViewById(i) instanceof WidgetContainer) {
            return loadNew((WidgetContainer) this.contentView.findViewById(i), widget, z);
        } else {
            boolean z2 = false;
            Widget widget2 = null;
            for (Widget widget3 : this.widgets) {
                if (widget3.getClass() == widget.getClass()) {
                    z2 = true;
                    widget2 = widget3;
                }
            }
            if (!C12254h.m22031a(widget) && z2) {
                unload(widget2);
                return load(i, widget, z);
            } else if (C12254h.m22031a(widget) || !C12254h.m22030a(this.context)) {
                return loadOld((ViewGroup) this.contentView.findViewById(i), widget, z);
            } else {
                throw new C12251e(widget);
            }
        }
    }

    public void continueLoadNew(Widget widget, WidgetContainer widgetContainer, View view) {
        int i;
        int i2;
        int a;
        int i3;
        MethodCollector.m26663i(3125);
        if (this.parentFragment == null) {
            MethodCollector.m26664o(3125);
            return;
        }
        if (view != null) {
            widget.contentView = view;
        }
        if (widgetContainer != null) {
            ViewParent parent = widgetContainer.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                if (view == null) {
                    viewGroup.removeViewInLayout(widgetContainer);
                } else {
                    int indexOfChild = viewGroup.indexOfChild(widgetContainer);
                    ViewGroup.LayoutParams layoutParams = widgetContainer.getLayoutParams();
                    if (layoutParams != null) {
                        i = layoutParams.height;
                    } else {
                        i = 0;
                    }
                    ViewGroup.LayoutParams layoutParams2 = widgetContainer.getLayoutParams();
                    if (layoutParams2 != null) {
                        i2 = layoutParams2.width;
                    } else {
                        i2 = 0;
                    }
                    widgetContainer.f29492a = new WidgetContainer.C12237a(i, i2, indexOfChild, widgetContainer.getId(), widgetContainer.getVisibility(), viewGroup);
                    if (view.getVisibility() == 0 && widgetContainer.getVisibility() == 0) {
                        view.setVisibility(0);
                    } else {
                        view.setVisibility(8);
                    }
                    if (viewGroup instanceof RelativeLayout) {
                        a = widgetContainer.getId();
                    } else {
                        a = C0792v.m2735a();
                    }
                    view.setId(a);
                    widgetContainer.setId(-1);
                    viewGroup.removeViewInLayout(widgetContainer);
                    ViewParent parent2 = view.getParent();
                    if (!(parent2 instanceof ViewGroup)) {
                        parent2 = null;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) parent2;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view);
                    }
                    if (widgetContainer.getLayoutParams() != null) {
                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        ViewGroup.LayoutParams layoutParams4 = widgetContainer.getLayoutParams();
                        if (layoutParams3 != null) {
                            int i4 = -2;
                            if (WidgetContainer.m22021a(view.getLayoutParams().width)) {
                                i3 = view.getLayoutParams().width;
                            } else if (WidgetContainer.m22021a(layoutParams4.width) || layoutParams4.width == view.getLayoutParams().width) {
                                i3 = layoutParams4.width;
                            } else {
                                i3 = -2;
                            }
                            layoutParams4.width = i3;
                            if (WidgetContainer.m22021a(view.getLayoutParams().height)) {
                                i4 = view.getLayoutParams().height;
                            } else if (WidgetContainer.m22021a(layoutParams4.height) || layoutParams4.height == view.getLayoutParams().height) {
                                i4 = layoutParams4.height;
                            }
                            layoutParams4.height = i4;
                        }
                        viewGroup.addView(view, indexOfChild, layoutParams4);
                    } else {
                        viewGroup.addView(view, indexOfChild);
                    }
                }
            }
            if (this.isRTL && view != null) {
                C0792v.m2759b(view, 1);
            }
        }
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        AbstractC12240a aVar = this.mWidgetCreateTimeListener;
        if (aVar == null || !aVar.needUploadTime(widget)) {
            getLifecycle().mo4012a(widget);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            getLifecycle().mo4012a(widget);
            this.mWidgetCreateTimeListener.onLoad(widget, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
        MethodCollector.m26664o(3125);
    }

    /* renamed from: of */
    public static WidgetManager m22025of(Fragment fragment, View view, FluencyOpt fluencyOpt, int i) {
        WidgetManager widgetManager = new WidgetManager(i);
        widgetManager.config(null, fragment, view, fragment.getContext(), fluencyOpt);
        return widgetManager;
    }

    /* renamed from: of */
    public static WidgetManager m22027of(ActivityC0945e eVar, View view, FluencyOpt fluencyOpt, int i) {
        WidgetManager widgetManager = new WidgetManager(i);
        widgetManager.config(eVar, null, view, eVar, fluencyOpt);
        return widgetManager;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$loadNew$0$WidgetManager(Widget widget, WidgetContainer widgetContainer, View view, int i, ViewGroup viewGroup) {
        Fragment fragment = this.parentFragment;
        if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            continueLoadNew(widget, widgetContainer, view);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$loadOld$1$WidgetManager(Widget widget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        Fragment fragment = this.parentFragment;
        if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            continueLoadOld(widget, viewGroup, view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        if (r0.getLayoutDirection() == 1) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void config(androidx.fragment.app.ActivityC0945e r6, androidx.fragment.app.Fragment r7, android.view.View r8, android.content.Context r9, com.bytedance.ies.sdk.widgets.FluencyOpt r10) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.widget.WidgetManager.config(androidx.fragment.app.e, androidx.fragment.app.Fragment, android.view.View, android.content.Context, com.bytedance.ies.sdk.widgets.FluencyOpt):void");
    }
}

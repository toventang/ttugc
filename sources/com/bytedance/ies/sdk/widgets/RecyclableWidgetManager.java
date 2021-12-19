package com.bytedance.ies.sdk.widgets;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.android.widget.C12251e;
import com.bytedance.android.widget.C12254h;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.Set;

public class RecyclableWidgetManager extends WidgetManager implements AbstractC33974au {
    public boolean isSubWidgetManager;
    private boolean mIsVisibilityToUser;
    public final IWidgetProvider mWidgetProvider;

    static {
        Covode.recordClassIndex(20445);
    }

    @Override // com.bytedance.android.widget.WidgetManager, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public Set<Widget> getWidgetList() {
        return this.widgets;
    }

    public <T extends LiveRecyclableWidget> void continueLoadSubWidget(T t) {
        if (t.isInitialized()) {
            continueLoadNew(t, null, ((LiveRecyclableWidget) t).contentView);
        }
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public WidgetManager load(Widget widget) {
        WidgetManager load = super.load(widget);
        onVisibilityToUser(widget, this.mIsVisibilityToUser);
        return load;
    }

    public void onVisibility(boolean z) {
        this.mIsVisibilityToUser = z;
        for (Widget widget : this.widgets) {
            onVisibilityToUser(widget, z);
        }
    }

    public static void detachFromParent(View view) {
        MethodCollector.m26663i(975);
        if (view == null || view.getParent() == null) {
            MethodCollector.m26664o(975);
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            MethodCollector.m26664o(975);
            return;
        }
        try {
            ((ViewGroup) parent).removeView(view);
            MethodCollector.m26664o(975);
        } catch (Exception unused) {
            MethodCollector.m26664o(975);
        }
    }

    public <T extends LiveRecyclableWidget> T load(Class<T> cls) {
        T t = (T) initWidget(cls, null);
        boolean contains = this.widgets.contains(t);
        this.widgets.add(t);
        getLifecycle().mo4012a(t);
        onVisibilityToUser(t, this.mIsVisibilityToUser);
        if (!contains) {
            onCustomInfoCallBack(t);
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$generateNewWidget$0$RecyclableWidgetManager(LiveRecyclableWidget liveRecyclableWidget, WidgetContainer widgetContainer) {
        continueLoadNew(liveRecyclableWidget, widgetContainer, liveRecyclableWidget.contentView);
    }

    public RecyclableWidgetManager(IWidgetProvider iWidgetProvider, int i) {
        super(i);
        this.mWidgetProvider = iWidgetProvider;
        this.widgetCallback = new Widget.AbstractC12236a() {
            /* class com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.C178571 */

            static {
                Covode.recordClassIndex(20449);
            }

            @Override // com.bytedance.android.widget.Widget.AbstractC12236a
            public Fragment getFragment() {
                return RecyclableWidgetManager.this.parentFragment;
            }

            @Override // com.bytedance.android.widget.Widget.AbstractC12236a
            public void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.continueLoadSubWidget(liveRecyclableWidget);
            }

            @Override // com.bytedance.android.widget.Widget.AbstractC12236a
            public void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.mWidgetProvider.recycleRecyclableWidget(liveRecyclableWidget);
            }

            @Override // com.bytedance.android.widget.Widget.AbstractC12236a
            public void unloadWidget(Widget widget) {
                RecyclableWidgetManager.this.unload(widget);
            }

            @Override // com.bytedance.android.widget.Widget.AbstractC12236a
            public void loadWidget(Widget widget) {
                RecyclableWidgetManager.this.load(widget);
            }

            @Override // com.bytedance.android.widget.Widget.AbstractC12236a
            public void removeAllMessages(Object obj) {
                if (RecyclableWidgetManager.this.mFluencyOpt != null) {
                    RecyclableWidgetManager.this.mFluencyOpt.removeMessages(obj);
                }
            }

            @Override // com.bytedance.android.widget.Widget.AbstractC12236a
            public void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
                if (liveRecyclableWidget.widgetContainer != null) {
                    RecyclableWidgetManager.this.generateNewWidget(liveRecyclableWidget.widgetContainer, liveRecyclableWidget.async, liveRecyclableWidget);
                }
                if (liveRecyclableWidget.containerView != null) {
                    RecyclableWidgetManager.this.generateOldWidget(liveRecyclableWidget.containerView, liveRecyclableWidget.async, liveRecyclableWidget);
                }
            }

            @Override // com.bytedance.android.widget.Widget.AbstractC12236a
            public void loadWidget(int i, Widget widget, boolean z) {
                RecyclableWidgetManager.this.load(i, widget, z);
            }
        };
    }

    private void onVisibilityToUser(Widget widget, boolean z) {
        if (widget instanceof LiveWidget) {
            ((LiveWidget) widget).onVisibilityToUser(z);
        }
    }

    private <T extends LiveRecyclableWidget> T initWidget(Class<T> cls, Object[] objArr) {
        T t = (T) ((LiveRecyclableWidget) this.mWidgetProvider.provide(cls));
        t.setArgs(objArr);
        t.setWidgetCallback(this.widgetCallback);
        ((LiveRecyclableWidget) t).context = this.context;
        ((LiveRecyclableWidget) t).dataChannel = C17846f.m33055a(this.parentFragment);
        return t;
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls) {
        return (T) load(i, (Class) cls, true);
    }

    public <T extends LiveRecyclableWidget> T loadSubWidget(Class<T> cls, Object[] objArr) {
        T t = (T) initWidget(cls, objArr);
        if (!t.shouldAttach()) {
            t.saveSnapShot(true);
            addWidgetAndCallCustomBack(t);
            return t;
        }
        continueLoadSubWidget(t);
        return t;
    }

    private <T extends LiveRecyclableWidget> T tryGetWidget(Class<T> cls, Object[] objArr) {
        for (Widget widget : this.widgets) {
            if (widget.getClass() == cls) {
                return (T) ((LiveRecyclableWidget) widget);
            }
        }
        T t = (T) initWidget(cls, objArr);
        if (((LiveRecyclableWidget) t).widgetContainer != null) {
            ((LiveRecyclableWidget) t).widgetContainer.mo19713a(((LiveRecyclableWidget) t).contentView);
        }
        return t;
    }

    public <T extends LiveRecyclableWidget> T load(View view, Class<T> cls) {
        return (T) load(view, (Class) cls, true);
    }

    private <T extends LiveRecyclableWidget> T load(View view, Class<T> cls, boolean z) {
        return (T) load(view, cls, z, (Object[]) null);
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void continueLoadNew(Widget widget, WidgetContainer widgetContainer, View view) {
        if (this.parentFragment != null && widget.context != null) {
            if (view != null && (widgetContainer != null || !this.isSubWidgetManager)) {
                detachFromParent(view);
            }
            super.continueLoadNew(widget, widgetContainer, view);
            onVisibilityToUser(widget, this.mIsVisibilityToUser);
        }
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void continueLoadOld(Widget widget, ViewGroup viewGroup, View view) {
        if (this.parentFragment != null && widget.containerView != null) {
            if (view != null) {
                detachFromParent(view);
            }
            super.continueLoadOld(widget, viewGroup, view);
            onVisibilityToUser(widget, this.mIsVisibilityToUser);
        }
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z) {
        return (T) load(i, cls, z, (Object[]) null);
    }

    public <T extends LiveRecyclableWidget> T generateOldWidget(ViewGroup viewGroup, boolean z, T t) {
        View view;
        View preloadLayout;
        ((LiveRecyclableWidget) t).containerView = viewGroup;
        this.widgetViewGroupHashMap.put(t, viewGroup);
        if (t.isInitialized()) {
            try {
                continueLoadOld(t, viewGroup, ((LiveRecyclableWidget) t).contentView);
                return t;
            } catch (Exception e) {
                throw new RuntimeException(this.context.getResources().getClass().getName(), e);
            }
        } else if (t.getLayoutId() == 0) {
            continueLoadOld(t, viewGroup, null);
            return t;
        } else if (z) {
            if (this.mFluencyOpt == null || (preloadLayout = this.mFluencyOpt.getPreloadLayout(t.getLayoutId())) == null) {
                this.asyncLayoutInflater.mo19742a(t.getLayoutId(), viewGroup, new RecyclableWidgetManager$$Lambda$2(this, t, viewGroup));
            } else {
                continueLoadOld(t, viewGroup, preloadLayout);
            }
            return t;
        } else {
            if (this.mFluencyOpt == null || (view = this.mFluencyOpt.getPreloadLayout(t.getLayoutId())) == null) {
                view = C1764a.m5927a(this.syncLayoutInflater, t.getLayoutId(), viewGroup, false);
            }
            continueLoadOld(t, viewGroup, view);
            return t;
        }
    }

    public <T extends LiveRecyclableWidget> T generateNewWidget(WidgetContainer widgetContainer, boolean z, T t) {
        View view;
        View preloadLayout;
        if (!t.shouldAttach()) {
            t.saveSnapShot(widgetContainer, z);
            addWidgetAndCallCustomBack(t);
            return t;
        }
        ((LiveRecyclableWidget) t).widgetContainer = widgetContainer;
        if (t.isInitialized()) {
            if (z) {
                try {
                    if (this.mFluencyOpt != null) {
                        this.mFluencyOpt.post(new RecyclableWidgetManager$$Lambda$0(this, t, widgetContainer), null);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(this.context.getResources().getClass().getName(), e);
                }
            } else {
                continueLoadNew(t, widgetContainer, ((LiveRecyclableWidget) t).contentView);
            }
            return t;
        } else if (t.getLayoutId() == 0) {
            continueLoadNew(t, widgetContainer, null);
            return t;
        } else if (z) {
            if (this.mFluencyOpt == null || (preloadLayout = this.mFluencyOpt.getPreloadLayout(t.getLayoutId())) == null) {
                this.asyncLayoutInflater.mo19742a(t.getLayoutId(), (ViewGroup) widgetContainer.getParent(), new RecyclableWidgetManager$$Lambda$1(this, t, widgetContainer));
            } else {
                continueLoadNew(t, widgetContainer, preloadLayout);
            }
            return t;
        } else {
            if (this.mFluencyOpt == null || (view = this.mFluencyOpt.getPreloadLayout(t.getLayoutId())) == null) {
                view = C1764a.m5927a(this.syncLayoutInflater, t.getLayoutId(), (ViewGroup) widgetContainer.getParent(), false);
            }
            continueLoadNew(t, widgetContainer, view);
            return t;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.sdk.widgets.RecyclableWidgetManager */
    /* JADX WARN: Multi-variable type inference failed */
    public <T extends LiveRecyclableWidget> T loadNew(WidgetContainer widgetContainer, Class<T> cls, boolean z, Object[] objArr) {
        return (T) generateNewWidget(widgetContainer, z, initWidget(cls, objArr));
    }

    public <T extends LiveRecyclableWidget> T loadOld(ViewGroup viewGroup, Class<T> cls, boolean z, Object[] objArr) {
        T t = (T) initWidget(cls, objArr);
        if (t.shouldAttach()) {
            return (T) generateOldWidget(viewGroup, z, t);
        }
        t.saveSnapShot(viewGroup, z);
        addWidgetAndCallCustomBack(t);
        return t;
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z, Object[] objArr) {
        return (T) load(this.contentView.findViewById(i), cls, z, objArr);
    }

    public <T extends LiveRecyclableWidget> T load(View view, Class<T> cls, boolean z, Object[] objArr) {
        Widget widget = null;
        if (this.parentFragment == null) {
            return null;
        }
        if (view == null && this.isSubWidgetManager) {
            return (T) loadSubWidget(cls, objArr);
        }
        if (view instanceof WidgetContainer) {
            return (T) loadNew((WidgetContainer) view, cls, z, objArr);
        }
        boolean z2 = false;
        for (Widget widget2 : this.widgets) {
            if (widget2.getClass() == cls) {
                z2 = true;
                widget = widget2;
            }
        }
        if (view != null) {
            if (z2 && !C12254h.m22032a(cls)) {
                unload(widget);
                return (T) load(view.getId(), cls, z, objArr);
            } else if (C12254h.m22030a(this.context) && !C12254h.m22032a(cls)) {
                throw new C12251e(cls);
            }
        }
        return (T) loadOld((ViewGroup) view, cls, z, objArr);
    }

    /* renamed from: of */
    public static RecyclableWidgetManager m33062of(Fragment fragment, View view, boolean z, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt) {
        return m33063of(fragment, view, z, iWidgetProvider, fluencyOpt, 10);
    }

    /* renamed from: of */
    public static RecyclableWidgetManager m33064of(ActivityC0945e eVar, View view, boolean z, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt) {
        return m33065of(eVar, view, z, iWidgetProvider, fluencyOpt, 10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$generateNewWidget$1$RecyclableWidgetManager(LiveRecyclableWidget liveRecyclableWidget, WidgetContainer widgetContainer, View view, int i, ViewGroup viewGroup) {
        if (this.parentFragment != null && !this.parentFragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            continueLoadNew(liveRecyclableWidget, widgetContainer, view);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$generateOldWidget$2$RecyclableWidgetManager(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (this.parentFragment != null && !this.parentFragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            continueLoadOld(liveRecyclableWidget, viewGroup, view);
        }
    }

    /* renamed from: of */
    public static RecyclableWidgetManager m33063of(Fragment fragment, View view, boolean z, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, int i) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider, i);
        recyclableWidgetManager.config(null, fragment, view, fragment.getContext(), fluencyOpt);
        recyclableWidgetManager.mIsVisibilityToUser = z;
        return recyclableWidgetManager;
    }

    /* renamed from: of */
    public static RecyclableWidgetManager m33065of(ActivityC0945e eVar, View view, boolean z, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, int i) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider, i);
        recyclableWidgetManager.config(eVar, null, view, eVar, fluencyOpt);
        recyclableWidgetManager.mIsVisibilityToUser = z;
        return recyclableWidgetManager;
    }
}

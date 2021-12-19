package com.bytedance.android.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.ArrayList;
import java.util.List;

public abstract class Widget implements AbstractC1204m, AbstractC33974au {
    public boolean async;
    private int containerId;
    public ViewGroup containerView;
    public View contentView;
    public Context context;
    public boolean hasAttached;
    public boolean isDestroyed;
    public boolean isViewValid;
    public C1205n lifecycleRegistry = new C1205n(this);
    public List mRegisterEvents = new ArrayList(8);
    public AbstractC12236a widgetCallback;
    public WidgetContainer widgetContainer;

    /* renamed from: com.bytedance.android.widget.Widget$a */
    public interface AbstractC12236a {
        static {
            Covode.recordClassIndex(13969);
        }

        Fragment getFragment();

        void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget);

        void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget);

        void loadWidget(int i, Widget widget, boolean z);

        void loadWidget(Widget widget);

        void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget);

        void removeAllMessages(Object obj);

        void unloadWidget(Widget widget);
    }

    static {
        Covode.recordClassIndex(13968);
    }

    public int getLayoutId() {
        return 0;
    }

    public <T> void onCustomInfoCallBack(T t) {
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

    public boolean shouldAttach() {
        return true;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.lifecycleRegistry;
    }

    public boolean isViewValid() {
        return this.isViewValid;
    }

    public void onDetachWidget() {
        AbstractC12236a aVar = this.widgetCallback;
        if (aVar != null) {
            aVar.unloadWidget(this);
        }
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

    public View getView() {
        View view = this.contentView;
        if (view != null) {
            return view;
        }
        WidgetContainer widgetContainer2 = this.widgetContainer;
        if (widgetContainer2 != null) {
            return widgetContainer2;
        }
        return this.containerView;
    }

    public int getViewId() {
        View view = getView();
        if (view != null) {
            return view.getId();
        }
        return -1;
    }

    public void hide() {
        View view = getView();
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean isShowing() {
        View view = getView();
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        this.isViewValid = true;
        this.isDestroyed = false;
        this.hasAttached = true;
        this.lifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.lifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    public void show() {
        View view = getView();
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void attach() {
        AbstractC12236a aVar;
        if (shouldAttach() && (aVar = this.widgetCallback) != null && !this.hasAttached) {
            int i = this.containerId;
            if (i == -1) {
                aVar.loadWidget(this);
            } else {
                aVar.loadWidget(i, this, this.async);
            }
            this.hasAttached = true;
        }
    }

    public void setWidgetCallback(AbstractC12236a aVar) {
        this.widgetCallback = aVar;
    }

    public <T> boolean hasRegister(Class<T> cls) {
        return this.mRegisterEvents.contains(cls);
    }

    public <T> void register(T t) {
        this.mRegisterEvents.add(t);
    }

    public void saveSnapShot(int i, boolean z) {
        this.containerId = i;
        this.async = z;
    }
}

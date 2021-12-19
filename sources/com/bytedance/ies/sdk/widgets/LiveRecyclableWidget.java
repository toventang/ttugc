package com.bytedance.ies.sdk.widgets;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.widget.C12254h;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public abstract class LiveRecyclableWidget extends LiveWidget implements IRecyclableWidget, AbstractC33974au {
    private Object[] args;
    private boolean initialized;
    private boolean shouldLoadSubWidget;

    static {
        Covode.recordClassIndex(20435);
    }

    public boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public abstract void onInit(Object[] objArr);

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public abstract void onLoad(Object[] objArr);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public abstract void onUnload();

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final boolean isInitialized() {
        return this.initialized;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void resetInternal() {
        this.hasAttached = false;
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        if (!this.initialized) {
            onInit(this.args);
            this.initialized = true;
        }
        onLoad(this.args);
    }

    public void resetAnim() {
        if (getView() != null) {
            getView().setAlpha(1.0f);
            show();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void attach() {
        if (shouldAttach() && this.widgetCallback != null && !this.hasAttached) {
            if (this.shouldLoadSubWidget) {
                this.widgetCallback.loadSubWidget(this);
            }
            if (this.widgetContainer != null) {
                this.widgetCallback.loadRecyclableWidget(this);
            }
            if (this.containerView != null) {
                this.widgetCallback.loadRecyclableWidget(this);
            }
            this.hasAttached = true;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        if (!(this.contentView == null || this.containerView == null)) {
            this.containerView.removeView(this.contentView);
        }
        try {
            onUnload();
        } catch (Exception e) {
            if (C12254h.m22030a(this.context)) {
                throw e;
            }
        }
        super.onDestroy();
        this.containerView = null;
        if (this.widgetCallback != null && needRecycle()) {
            this.widgetCallback.recycleRecyclableWidget(this);
        }
        this.dataChannel = null;
        setWidgetCallback(null);
        this.args = null;
        this.context = null;
    }

    public void saveSnapShot(boolean z) {
        this.shouldLoadSubWidget = z;
    }

    public final void setArgs(Object[] objArr) {
        this.args = objArr;
    }

    public void saveSnapShot(ViewGroup viewGroup, boolean z) {
        this.containerView = viewGroup;
        this.async = z;
    }

    public void saveSnapShot(WidgetContainer widgetContainer, boolean z) {
        this.widgetContainer = widgetContainer;
        this.async = z;
    }
}

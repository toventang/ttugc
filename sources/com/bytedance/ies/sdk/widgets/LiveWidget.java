package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.util.rxutils.C11121a;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4560f.p4561a.p4565b.C88411a;

public abstract class LiveWidget extends Widget implements AbstractC33974au {
    private C88411a compositeDisposable;
    public DataChannel dataChannel;
    private C11121a lifecycleTransformer;
    public RecyclableWidgetManager subWidgetManager;

    static {
        Covode.recordClassIndex(20436);
    }

    @Override // com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final <T> C11121a<T> getAutoUnbindTransformer() {
        return this.lifecycleTransformer;
    }

    public Context getContext() {
        return this.context;
    }

    public DataChannel provideDataChannel() {
        return this.dataChannel;
    }

    public void enableSubWidgetManager() {
        enableSubWidgetManager(null, null);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onDetachWidget() {
        if (!(this instanceof IUnLoadWidget)) {
            if (this.widgetCallback != null) {
                this.widgetCallback.unloadWidget(this);
            }
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            if (recyclableWidgetManager != null && recyclableWidgetManager.isSubWidgetManager) {
                this.subWidgetManager.detachWidget();
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onCreate() {
        C88411a aVar = this.compositeDisposable;
        if (aVar != null) {
            aVar.dispose();
        }
        this.compositeDisposable = new C88411a();
        this.lifecycleTransformer = new C11121a(this.compositeDisposable);
        super.onCreate();
        this.dataChannel = C17846f.m33055a(this.widgetCallback.getFragment());
    }

    @Override // com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        if (this.widgetCallback != null) {
            this.widgetCallback.removeAllMessages(this);
        }
        onDetachWidget();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.mo28316b(this);
        }
        DataChannelGlobal.f42558d.mo28326b(this);
        this.compositeDisposable.dispose();
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (!(recyclableWidgetManager == null || recyclableWidgetManager.parentFragment == null)) {
            this.subWidgetManager.parentFragment.getLifecycle().mo4013b(this.subWidgetManager);
        }
        this.subWidgetManager = null;
    }

    public final <T extends View> T findViewById(int i) {
        return (T) getView().findViewById(i);
    }

    public void onVisibilityToUser(boolean z) {
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null && recyclableWidgetManager.isSubWidgetManager) {
            this.subWidgetManager.onVisibility(z);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void setWidgetCallback(Widget.AbstractC12236a aVar) {
        super.setWidgetCallback(aVar);
        if (aVar != null) {
            this.dataChannel = C17846f.m33055a(aVar.getFragment());
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public <T> void onCustomInfoCallBack(T t) {
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null && recyclableWidgetManager.isSubWidgetManager) {
            this.subWidgetManager.onCustomInfoCallBack(t.getClass(), t);
        }
    }

    public void enableSubWidgetManager(WidgetManager.AbstractC12240a aVar, FluencyOpt fluencyOpt) {
        if (this.subWidgetManager == null) {
            RecyclableWidgetManager of = RecyclableWidgetManager.m33062of(this.widgetCallback.getFragment(), getView(), false, (IWidgetProvider) LiveWidgetProvider.getInstance(), fluencyOpt);
            this.subWidgetManager = of;
            of.mWidgetCreateTimeListener = aVar;
            this.subWidgetManager.isSubWidgetManager = true;
        }
    }
}

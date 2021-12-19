package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public abstract class Widget implements AbstractC1204m, AbstractC33974au {
    public ViewGroup containerView;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public boolean isDestroyed;
    public boolean isViewValid;
    public C1205n lifecycleRegistry = new C1205n(this);
    public WidgetManager subWidgetManager;
    public WidgetCallback widgetCallback;

    public interface WidgetCallback {
        static {
            Covode.recordClassIndex(20451);
        }

        Fragment getFragment();

        <T extends AbstractC1174ac> T getViewModel(Class<T> cls);

        <T extends AbstractC1174ac> T getViewModel(Class<T> cls, C1175ad.AbstractC1177b bVar);

        void startActivity(Intent intent);

        void startActivity(Intent intent, Bundle bundle);

        void startActivityForResult(Intent intent, int i);

        void startActivityForResult(Intent intent, int i, Bundle bundle);
    }

    static {
        Covode.recordClassIndex(20450);
    }

    public int getLayoutId() {
        return 0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
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

    public boolean isViewValid() {
        return this.isViewValid;
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

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        this.isViewValid = true;
        this.isDestroyed = false;
        this.lifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    public void enableSubWidgetManager() {
        if (this.subWidgetManager == null) {
            WidgetManager of = WidgetManager.m33066of(this.widgetCallback.getFragment(), this.contentView);
            this.subWidgetManager = of;
            of.setDataCenter(this.dataCenter);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.lifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        if (this.subWidgetManager != null) {
            this.widgetCallback.getFragment().getChildFragmentManager().mo3552a().mo3455a(this.subWidgetManager).mo3478e();
        }
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    public void setWidgetCallback(WidgetCallback widgetCallback2) {
        this.widgetCallback = widgetCallback2;
    }

    public <T extends AbstractC1174ac> T getViewModel(Class<T> cls) {
        return (T) this.widgetCallback.getViewModel(cls);
    }

    public void startActivity(Intent intent) {
        this.widgetCallback.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        this.widgetCallback.startActivityForResult(intent, i);
    }

    public <T extends AbstractC1174ac> T getViewModel(Class<T> cls, C1175ad.AbstractC1177b bVar) {
        return (T) this.widgetCallback.getViewModel(cls, bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        this.widgetCallback.startActivity(intent, bundle);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.widgetCallback.startActivityForResult(intent, i, bundle);
    }
}

package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.p022b.p023a.C0464a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.Widget;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class WidgetManager extends Fragment {
    public static final String TAG = WidgetManager.class.getCanonicalName();
    public C0464a asyncLayoutInflater;
    public boolean configured;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public AbstractC0952i.AbstractC0954b parentDestroyedCallback = new AbstractC0952i.AbstractC0954b() {
        /* class com.bytedance.ies.sdk.widgets.WidgetManager.C178592 */

        static {
            Covode.recordClassIndex(20457);
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public void onFragmentViewDestroyed(AbstractC0952i iVar, Fragment fragment) {
            if (fragment == WidgetManager.this.parentFragment) {
                iVar.mo3554a(WidgetManager.this.parentDestroyedCallback);
                fragment.getChildFragmentManager().mo3552a().mo3455a(WidgetManager.this).mo3478e();
            }
        }
    };
    public Fragment parentFragment;
    public LayoutInflater syncLayoutInflater;
    public Widget.WidgetCallback widgetCallback = new Widget.WidgetCallback() {
        /* class com.bytedance.ies.sdk.widgets.WidgetManager.C178581 */

        static {
            Covode.recordClassIndex(20456);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public Fragment getFragment() {
            return WidgetManager.this;
        }

        /* renamed from: com_bytedance_ies_sdk_widgets_WidgetManager$1_androidx_lifecycle_VScopeLancet_of */
        public static C1175ad m33068x7cc65c2c(Fragment fragment) {
            return C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivity(Intent intent) {
            WidgetManager.this.startActivity(intent);
        }

        /* renamed from: com_bytedance_ies_sdk_widgets_WidgetManager$1_androidx_lifecycle_VScopeLancet_of */
        public static C1175ad m33069x7cc65c2c(ActivityC0945e eVar) {
            return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public <T extends AbstractC1174ac> T getViewModel(Class<T> cls) {
            return WidgetManager.this.parentFragment != null ? (T) m33068x7cc65c2c(WidgetManager.this.parentFragment).mo3983a(cls) : (T) m33069x7cc65c2c(WidgetManager.this.getActivity()).mo3983a(cls);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivityForResult(Intent intent, int i) {
            WidgetManager.this.startActivityForResult(intent, i);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivity(Intent intent, Bundle bundle) {
            WidgetManager.this.startActivity(intent, bundle);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public <T extends AbstractC1174ac> T getViewModel(Class<T> cls, C1175ad.AbstractC1177b bVar) {
            return WidgetManager.this.parentFragment != null ? (T) C1181ae.m3879a(WidgetManager.this.parentFragment, bVar).mo3983a(cls) : (T) C1181ae.m3881a(WidgetManager.this.getActivity(), bVar).mo3983a(cls);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivityForResult(Intent intent, int i, Bundle bundle) {
            WidgetManager.this.startActivityForResult(intent, i, bundle);
        }
    };
    public Map<Widget, ViewGroup> widgetViewGroupHashMap = new HashMap();
    public List<Widget> widgets = new CopyOnWriteArrayList();

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    static {
        Covode.recordClassIndex(20454);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.parentFragment = null;
        this.widgets.clear();
        this.widgetViewGroupHashMap.clear();
        this.dataCenter = null;
    }

    /* renamed from: com.bytedance.ies.sdk.widgets.WidgetManager$3 */
    static /* synthetic */ class C178603 {
        static final /* synthetic */ int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 20458(0x4fea, float:2.8668E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.ies.sdk.widgets.WidgetManager.C178603.$SwitchMap$android$arch$lifecycle$Lifecycle$State = r2
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.ies.sdk.widgets.WidgetManager.C178603.$SwitchMap$android$arch$lifecycle$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.ies.sdk.widgets.WidgetManager.C178603.$SwitchMap$android$arch$lifecycle$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x002d }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.CREATED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.ies.sdk.widgets.WidgetManager.C178603.$SwitchMap$android$arch$lifecycle$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.STARTED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.ies.sdk.widgets.WidgetManager.C178603.$SwitchMap$android$arch$lifecycle$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.WidgetManager.C178603.<clinit>():void");
        }
    }

    public WidgetManager load(Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.dataCenter = this.dataCenter;
        this.widgets.add(widget);
        getLifecycle().mo4012a(widget);
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (Widget widget : this.widgets) {
            widget.onConfigurationChanged(configuration);
        }
    }

    public WidgetManager setDataCenter(DataCenter dataCenter2) {
        this.dataCenter = dataCenter2;
        for (Widget widget : this.widgets) {
            widget.dataCenter = dataCenter2;
        }
        return this;
    }

    public WidgetManager unload(Widget widget) {
        MethodCollector.m26663i(7648);
        if (widget == null) {
            MethodCollector.m26664o(7648);
            return this;
        }
        getLifecycle().mo4013b(widget);
        if (widget.isViewValid) {
            int i = C178603.$SwitchMap$android$arch$lifecycle$Lifecycle$State[getLifecycle().mo4011a().ordinal()];
            if (i != 2) {
                if (i == 3) {
                    widget.onDestroy();
                } else if (i == 4) {
                    widget.onStop();
                    widget.onDestroy();
                } else if (i == 5) {
                    widget.onPause();
                    widget.onStop();
                    widget.onDestroy();
                }
            } else if (!widget.isDestroyed) {
                widget.onDestroy();
            }
        }
        widget.containerView = null;
        widget.context = null;
        widget.widgetCallback = null;
        widget.dataCenter = null;
        this.widgets.remove(widget);
        if (this.widgetViewGroupHashMap.containsKey(widget)) {
            this.widgetViewGroupHashMap.get(widget).removeAllViews();
            this.widgetViewGroupHashMap.remove(widget);
        }
        MethodCollector.m26664o(7648);
        return this;
    }

    public WidgetManager load(int i, Widget widget) {
        return load(i, widget, true);
    }

    /* renamed from: of */
    public static WidgetManager m33066of(Fragment fragment, View view) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(null, fragment, view, fragment.getContext());
        return widgetManager;
    }

    /* renamed from: of */
    public static WidgetManager m33067of(ActivityC0945e eVar, View view) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(eVar, null, view, eVar);
        return widgetManager;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (Widget widget : this.widgets) {
            widget.onActivityResult(i, i2, intent);
        }
    }

    public void continueLoad(Widget widget, ViewGroup viewGroup, View view) {
        MethodCollector.m26663i(7646);
        if (widget.containerView == null) {
            MethodCollector.m26664o(7646);
            return;
        }
        widget.contentView = view;
        if (!(viewGroup == null || view == null)) {
            viewGroup.addView(view);
        }
        this.widgets.add(widget);
        getLifecycle().mo4012a(widget);
        MethodCollector.m26664o(7646);
    }

    public WidgetManager load(int i, Widget widget, boolean z) {
        if (widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.dataCenter = this.dataCenter;
        ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(i);
        widget.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(widget, viewGroup);
        if (widget.getLayoutId() == 0) {
            continueLoad(widget, viewGroup, null);
            return this;
        } else if (z) {
            this.asyncLayoutInflater.mo2025a(widget.getLayoutId(), viewGroup, new WidgetManager$$Lambda$0(this, widget, viewGroup));
            return this;
        } else {
            continueLoad(widget, viewGroup, C1764a.m5927a(this.syncLayoutInflater, widget.getLayoutId(), viewGroup, false));
            return this;
        }
    }

    public void config(ActivityC0945e eVar, Fragment fragment, View view, Context context2) {
        AbstractC0952i childFragmentManager;
        if (!this.configured) {
            if (eVar != null) {
                childFragmentManager = eVar.getSupportFragmentManager();
            } else if (fragment != null) {
                childFragmentManager = fragment.getChildFragmentManager();
            } else {
                return;
            }
            this.parentFragment = fragment;
            this.contentView = view;
            this.context = context2;
            this.asyncLayoutInflater = new C0464a(context2);
            this.syncLayoutInflater = LayoutInflater.from(context2);
            if (!(fragment == null || fragment.getFragmentManager() == null)) {
                fragment.getFragmentManager().mo3555a(this.parentDestroyedCallback, false);
            }
            childFragmentManager.mo3552a().mo3456a(this, TAG).mo3478e();
            this.configured = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$load$0$WidgetManager(Widget widget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (!isRemoving() && !isDetached() && getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            continueLoad(widget, viewGroup, view);
        }
    }
}

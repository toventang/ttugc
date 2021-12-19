package com.bytedance.android.monitorV2;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.android.monitorV2.p728a.AbstractC12069d;
import com.bytedance.android.monitorV2.p728a.AbstractC12073h;
import com.bytedance.android.monitorV2.p730c.C12078a;
import com.bytedance.android.monitorV2.p731d.C12084d;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p735h.AbstractC12113f;
import com.bytedance.android.monitorV2.p735h.C12104b;
import com.bytedance.android.monitorV2.p735h.C12105c;
import com.bytedance.android.monitorV2.p735h.p736a.C12097a;
import com.bytedance.android.monitorV2.p735h.p736a.C12100c;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p740l.C12127d;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.p740l.C12132h;
import com.bytedance.android.monitorV2.p740l.C12133i;
import com.bytedance.android.monitorV2.p740l.C12134j;
import com.bytedance.android.monitorV2.webview.AbstractC12190b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public class HybridMultiMonitor {
    private static volatile HybridMultiMonitor instance;
    public boolean AB_TEST = false;
    private Application application;
    private AbstractC12069d exceptionHandler;
    private AbstractC12113f hybridSettingManager;
    private List<AbstractC12073h> interceptorList;
    private boolean isInitialized;
    private boolean isRegisterTouchCallback;
    private C12064a normalCustomMonitor = new C12064a();
    private C12062a touchTraceCallback;

    static {
        Covode.recordClassIndex(13786);
    }

    public static boolean isDebuggable() {
        return C12078a.f28942a;
    }

    public static boolean isOutputFile() {
        return C12078a.f28943b;
    }

    public Application getApplication() {
        return this.application;
    }

    public AbstractC12069d getExceptionHandler() {
        return this.exceptionHandler;
    }

    public boolean isAbTestEnable() {
        return this.AB_TEST;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitorV2.HybridMultiMonitor$b */
    public static class Window$CallbackC12063b implements Window.Callback {

        /* renamed from: a */
        private Window.Callback f28923a;

        static {
            Covode.recordClassIndex(13792);
        }

        public final void onAttachedToWindow() {
            this.f28923a.onAttachedToWindow();
        }

        public final void onContentChanged() {
            this.f28923a.onContentChanged();
        }

        public final void onDetachedFromWindow() {
            this.f28923a.onDetachedFromWindow();
        }

        public final boolean onSearchRequested() {
            return this.f28923a.onSearchRequested();
        }

        private Window$CallbackC12063b(Window.Callback callback) {
            this.f28923a = callback;
        }

        public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            return this.f28923a.dispatchGenericMotionEvent(motionEvent);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f28923a.dispatchKeyEvent(keyEvent);
        }

        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return this.f28923a.dispatchKeyShortcutEvent(keyEvent);
        }

        public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            return this.f28923a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }

        public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            return this.f28923a.dispatchTrackballEvent(motionEvent);
        }

        public final void onActionModeFinished(ActionMode actionMode) {
            this.f28923a.onActionModeFinished(actionMode);
        }

        public final void onActionModeStarted(ActionMode actionMode) {
            this.f28923a.onActionModeStarted(actionMode);
        }

        public final View onCreatePanelView(int i) {
            return this.f28923a.onCreatePanelView(i);
        }

        public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            this.f28923a.onWindowAttributesChanged(layoutParams);
        }

        public final void onWindowFocusChanged(boolean z) {
            this.f28923a.onWindowFocusChanged(z);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.f28923a.onWindowStartingActionMode(callback);
        }

        public final boolean onSearchRequested(SearchEvent searchEvent) {
            return this.f28923a.onSearchRequested(searchEvent);
        }

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null && motionEvent.getAction() == 0) {
                C12134j.f29156a = System.currentTimeMillis();
            }
            return this.f28923a.dispatchTouchEvent(motionEvent);
        }

        /* synthetic */ Window$CallbackC12063b(Window.Callback callback, byte b) {
            this(callback);
        }

        public final boolean onCreatePanelMenu(int i, Menu menu) {
            return this.f28923a.onCreatePanelMenu(i, menu);
        }

        public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
            return this.f28923a.onMenuItemSelected(i, menuItem);
        }

        public final boolean onMenuOpened(int i, Menu menu) {
            return this.f28923a.onMenuOpened(i, menu);
        }

        public final void onPanelClosed(int i, Menu menu) {
            this.f28923a.onPanelClosed(i, menu);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return this.f28923a.onWindowStartingActionMode(callback, i);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            return this.f28923a.onPreparePanel(i, view, menu);
        }
    }

    private void initComponent() {
        injectWebOffline();
        injectFalconX();
    }

    public AbstractC12190b getCustomReportMonitor() {
        return this.normalCustomMonitor.f28924a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitorV2.HybridMultiMonitor$a */
    public static class C12062a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private Set<Integer> f28922a;

        static {
            Covode.recordClassIndex(13791);
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }

        private C12062a() {
            this.f28922a = new HashSet();
        }

        /* synthetic */ C12062a(byte b) {
            this();
        }

        public void onActivityStarted(Activity activity) {
            mo19382a(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            this.f28922a.remove(Integer.valueOf(activity.hashCode()));
        }

        /* renamed from: b */
        private boolean m21468b(Activity activity) {
            if (activity != null && !this.f28922a.contains(Integer.valueOf(activity.hashCode()))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo19382a(Activity activity) {
            try {
                if (m21468b(activity)) {
                    this.f28922a.add(Integer.valueOf(activity.hashCode()));
                    Window window = activity.getWindow();
                    window.setCallback(new Window$CallbackC12063b(window.getCallback(), (byte) 0));
                }
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            mo19382a(activity);
        }
    }

    private void initDebugEnvir() {
        C12093a.m21524a(new Runnable() {
            /* class com.bytedance.android.monitorV2.HybridMultiMonitor.RunnableC120592 */

            static {
                Covode.recordClassIndex(13788);
            }

            public final void run() {
                Application application = HybridMultiMonitor.this.getApplication();
                if (application != null) {
                    try {
                        File a = C12127d.m21637a(application, "monitor_data_switch");
                        File file = new File(a, "is_debug");
                        if (file.isFile() && file.exists()) {
                            C12078a.m21503a(true, false);
                        }
                        File file2 = new File(a, "is_output_file");
                        if (file2.isFile() && file2.exists()) {
                            C12078a.m21504b(true, false);
                        }
                    } catch (Throwable unused) {
                        HybridMultiMonitor.getInstance().getExceptionHandler();
                    }
                }
            }
        });
    }

    private void initFileRecord() {
        registerReportInterceptor(new AbstractC12073h() {
            /* class com.bytedance.android.monitorV2.HybridMultiMonitor.C120581 */

            static {
                Covode.recordClassIndex(13787);
            }

            @Override // com.bytedance.android.monitorV2.p728a.AbstractC12073h
            /* renamed from: a */
            public final void mo19378a(String str, String str2, JSONObject jSONObject) {
                boolean z;
                C12115b.m21583b("HybridMultiMonitor", "fileRecord, outputFile: " + HybridMultiMonitor.isOutputFile() + ", service: " + str + ", eventType: " + str2);
                if (HybridMultiMonitor.isOutputFile()) {
                    C89219l.m154719c(str2, "");
                    C89219l.m154719c(jSONObject, "");
                    if (C89219l.m154714a((Object) "samplecustom", (Object) str2) || C89219l.m154714a((Object) "newcustom", (Object) str2) || C89219l.m154714a((Object) "custom", (Object) str2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        try {
                            String optString = jSONObject.getJSONObject("extra").optString("url", "");
                            HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
                            C89219l.m154709a((Object) instance, "");
                            File a = C12127d.m21637a(instance.getApplication(), "monitor_data_debug");
                            if (a != null && a.exists()) {
                                C12127d.m21639a(new File(a, "custom_with_".concat(String.valueOf(Uri.parse(optString).getQueryParameter("bytest_case_id")))).getAbsolutePath(), C89361p.m154854b("\n     " + jSONObject + "\n     \n     "));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("extra").getJSONObject("nativeBase");
                            String string = jSONObject2.getString("navigation_id");
                            String optString2 = jSONObject2.optString("url", "");
                            HybridMultiMonitor instance2 = HybridMultiMonitor.getInstance();
                            C89219l.m154709a((Object) instance2, "");
                            File a2 = C12127d.m21637a(instance2.getApplication(), "monitor_data_debug");
                            if (a2 != null && a2.exists()) {
                                C12127d.m21639a(new File(a2, string + "_with_" + Uri.parse(optString2).getQueryParameter("bytest_case_id")).getAbsolutePath(), C89361p.m154854b("\n     " + jSONObject + "\n     \n     "));
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    private void injectFalconX() {
        C12093a.m21522a().execute(new Runnable() {
            /* class com.bytedance.android.monitorV2.HybridMultiMonitor.RunnableC120614 */

            static {
                Covode.recordClassIndex(13790);
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("com.bytedance.webx.monitor.falconx.NewFalconXMonitor");
                    C12133i.m21663a(cls, "beginMonitor", C12133i.m21663a(cls, "getInstance", new Object[0]));
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
            }
        });
    }

    private void injectWebOffline() {
        C12093a.m21522a().execute(new Runnable() {
            /* class com.bytedance.android.monitorV2.HybridMultiMonitor.RunnableC120603 */

            static {
                Covode.recordClassIndex(13789);
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("com.bytedance.webx.monitor.weboffline.NewWebOfflineMonitor");
                    C12133i.m21663a(cls, "beginMonitor", C12133i.m21663a(cls, "getInstance", new Object[0]));
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
            }
        });
    }

    public void DisableReportInfo() {
        C12077c.m21502a().f28941a.clear();
    }

    public AbstractC12113f getHybridSettingManager() {
        AbstractC12113f fVar = this.hybridSettingManager;
        if (fVar != null) {
            return fVar;
        }
        return C12104b.m21550a();
    }

    public void registerTouchCallback() {
        if (this.application != null && !this.isRegisterTouchCallback) {
            C12062a aVar = new C12062a((byte) 0);
            this.touchTraceCallback = aVar;
            this.application.registerActivityLifecycleCallbacks(aVar);
            this.isRegisterTouchCallback = true;
        }
    }

    public static HybridMultiMonitor getInstance() {
        MethodCollector.m26663i(3291);
        if (instance == null) {
            synchronized (HybridMultiMonitor.class) {
                try {
                    if (instance == null) {
                        instance = new HybridMultiMonitor();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3291);
                    throw th;
                }
            }
        }
        HybridMultiMonitor hybridMultiMonitor = instance;
        MethodCollector.m26664o(3291);
        return hybridMultiMonitor;
    }

    public void setAbTestEnable(boolean z) {
        this.AB_TEST = z;
    }

    public void setExceptionHandler(AbstractC12069d dVar) {
        this.exceptionHandler = dVar;
    }

    public static void setDebuggable(boolean z) {
        C12078a.m21503a(z, false);
    }

    public static void setOutputFile(boolean z) {
        C12078a.m21504b(z, false);
    }

    public void customReportInner(C12084d dVar) {
        this.normalCustomMonitor.mo19413a(dVar);
    }

    public void init(Application application2) {
        init(application2, true);
    }

    public void clearDisableReportInfo(String str) {
        C12077c a = C12077c.m21502a();
        if (!TextUtils.isEmpty(str)) {
            a.f28941a.remove(str);
        }
    }

    public void setConfig(C12100c cVar) {
        initHybridSetting(new C12105c(cVar));
    }

    public void wrapTouchTraceCallback(Activity activity) {
        C12062a aVar;
        if (activity != null && this.isRegisterTouchCallback && (aVar = this.touchTraceCallback) != null) {
            aVar.mo19382a(activity);
        }
    }

    public void initHybridSetting(AbstractC12113f fVar) {
        if (fVar != null) {
            this.hybridSettingManager = fVar;
            try {
                fVar.mo19478a(this.application);
            } catch (Throwable unused) {
                getInstance().getExceptionHandler();
            }
        }
    }

    public void registerReportInterceptor(AbstractC12073h hVar) {
        if (hVar != null) {
            if (this.interceptorList == null) {
                this.interceptorList = new CopyOnWriteArrayList();
            }
            this.interceptorList.add(hVar);
        }
    }

    public void setCustomReportMonitor(AbstractC12190b bVar) {
        this.normalCustomMonitor.f28924a = bVar;
        C12115b.m21583b("CustomMonitor", "use new Monitor: ".concat(String.valueOf(bVar)));
    }

    public void unregisterReportInterceptor(AbstractC12073h hVar) {
        List<AbstractC12073h> list;
        if (hVar != null && (list = this.interceptorList) != null && list.size() != 0) {
            this.interceptorList.remove(hVar);
        }
    }

    public void customReport(C12084d dVar) {
        C12097a.C12098a a;
        if (dVar != null && (a = getInstance().getHybridSettingManager().mo19479b().mo19449a(dVar.f28951b)) != null) {
            if (dVar.f28956g.length() == 0) {
                JSONObject jSONObject = new JSONObject();
                C12130f.m21652a(jSONObject, "bid", dVar.f28951b);
                C12130f.m21652a(jSONObject, "setting_bid", a.f29047a);
                C12130f.m21650a(jSONObject, "hit_sample", a.f29048b);
                C12130f.m21650a(jSONObject, "setting_id", a.f29049c);
                C12130f.m21649a(jSONObject, "can_sample", dVar.f28963n);
                dVar.f28956g = jSONObject;
            }
            this.normalCustomMonitor.mo19413a(dVar);
        }
    }

    public static void setDebuggable(boolean z, boolean z2) {
        C12078a.m21503a(z, z2);
    }

    public static void setOutputFile(boolean z, boolean z2) {
        C12078a.m21504b(z, z2);
    }

    public void init(Application application2, boolean z) {
        if (application2 != null && !this.isInitialized) {
            this.isInitialized = true;
            this.application = application2;
            if (z) {
                registerTouchCallback();
            }
            C12115b.m21583b("HybridMultiMonitor", "init sdkinfo: 1.2.0-alpha.4, 1020024, false");
            C12115b.m21583b("HybridMultiMonitor", "init hostinfo: " + C12132h.m21661a() + ", " + C12132h.m21662b());
            initComponent();
            initFileRecord();
            initDebugEnvir();
        }
    }

    public void registerDisableReportInfo(String str, List<String> list) {
        MethodCollector.m26663i(3366);
        C12077c a = C12077c.m21502a();
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(3366);
        } else if (list == null || list.size() == 0) {
            MethodCollector.m26664o(3366);
        } else {
            Set<String> set = a.f28941a.get(str);
            if (set == null) {
                set = Collections.synchronizedSet(new HashSet());
                a.f28941a.put(str, set);
            }
            synchronized (a) {
                try {
                    set.addAll(list);
                } finally {
                    MethodCollector.m26664o(3366);
                }
            }
        }
    }

    public void notifyReportInterceptor(String str, String str2, String str3, JSONObject jSONObject) {
        List<AbstractC12073h> list = this.interceptorList;
        if (list != null && list.size() > 0) {
            for (AbstractC12073h hVar : this.interceptorList) {
                if (hVar != null) {
                    hVar.mo19378a(str, str2, jSONObject);
                }
            }
        }
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        C12064a aVar = this.normalCustomMonitor;
        aVar.mo19414a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, i, aVar.f28924a);
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, AbstractC12190b bVar) {
        this.normalCustomMonitor.mo19414a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, i, bVar);
    }
}

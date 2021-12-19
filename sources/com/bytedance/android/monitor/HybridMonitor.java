package com.bytedance.android.monitor;

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
import com.bytedance.android.monitor.p704b.AbstractC11910d;
import com.bytedance.android.monitor.p704b.AbstractC11914h;
import com.bytedance.android.monitor.p705c.C11916a;
import com.bytedance.android.monitor.p706d.C11919c;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.android.monitor.p712j.AbstractC11940b;
import com.bytedance.android.monitor.p712j.C11939a;
import com.bytedance.android.monitor.p714l.C11949c;
import com.bytedance.android.monitor.p714l.C11953g;
import com.bytedance.android.monitor.p714l.C11954h;
import com.bytedance.android.monitor.p714l.C11955i;
import com.bytedance.android.monitor.webview.AbstractC12009a;
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

public class HybridMonitor {
    private static volatile HybridMonitor instance;
    public boolean AB_TEST = false;
    private Application application;
    private AbstractC11910d exceptionHandler;
    private List<AbstractC11914h> interceptorList;
    private boolean isInitialized;
    private boolean isRegisterTouchCallback;
    private C11897a normalCustomMonitor = new C11897a();
    private AbstractC11940b settingManager;
    private C11895a touchTraceCallback;

    static {
        Covode.recordClassIndex(13616);
    }

    public static boolean isDebuggable() {
        return C11916a.f28465a;
    }

    public static boolean isOutputFile() {
        return C11916a.f28466b;
    }

    public Application getApplication() {
        return this.application;
    }

    public AbstractC11910d getExceptionHandler() {
        return this.exceptionHandler;
    }

    public boolean isAbTestEnable() {
        return this.AB_TEST;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitor.HybridMonitor$b */
    public static class Window$CallbackC11896b implements Window.Callback {

        /* renamed from: a */
        private Window.Callback f28453a;

        static {
            Covode.recordClassIndex(13622);
        }

        public final void onAttachedToWindow() {
            this.f28453a.onAttachedToWindow();
        }

        public final void onContentChanged() {
            this.f28453a.onContentChanged();
        }

        public final void onDetachedFromWindow() {
            this.f28453a.onDetachedFromWindow();
        }

        public final boolean onSearchRequested() {
            return this.f28453a.onSearchRequested();
        }

        private Window$CallbackC11896b(Window.Callback callback) {
            this.f28453a = callback;
        }

        public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            return this.f28453a.dispatchGenericMotionEvent(motionEvent);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f28453a.dispatchKeyEvent(keyEvent);
        }

        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return this.f28453a.dispatchKeyShortcutEvent(keyEvent);
        }

        public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            return this.f28453a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }

        public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            return this.f28453a.dispatchTrackballEvent(motionEvent);
        }

        public final void onActionModeFinished(ActionMode actionMode) {
            this.f28453a.onActionModeFinished(actionMode);
        }

        public final void onActionModeStarted(ActionMode actionMode) {
            this.f28453a.onActionModeStarted(actionMode);
        }

        public final View onCreatePanelView(int i) {
            return this.f28453a.onCreatePanelView(i);
        }

        public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            this.f28453a.onWindowAttributesChanged(layoutParams);
        }

        public final void onWindowFocusChanged(boolean z) {
            this.f28453a.onWindowFocusChanged(z);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.f28453a.onWindowStartingActionMode(callback);
        }

        public final boolean onSearchRequested(SearchEvent searchEvent) {
            return this.f28453a.onSearchRequested(searchEvent);
        }

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null && motionEvent.getAction() == 0) {
                C11955i.f28581a = System.currentTimeMillis();
            }
            return this.f28453a.dispatchTouchEvent(motionEvent);
        }

        /* synthetic */ Window$CallbackC11896b(Window.Callback callback, byte b) {
            this(callback);
        }

        public final boolean onCreatePanelMenu(int i, Menu menu) {
            return this.f28453a.onCreatePanelMenu(i, menu);
        }

        public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
            return this.f28453a.onMenuItemSelected(i, menuItem);
        }

        public final boolean onMenuOpened(int i, Menu menu) {
            return this.f28453a.onMenuOpened(i, menu);
        }

        public final void onPanelClosed(int i, Menu menu) {
            this.f28453a.onPanelClosed(i, menu);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return this.f28453a.onWindowStartingActionMode(callback, i);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            return this.f28453a.onPreparePanel(i, view, menu);
        }
    }

    private void initComponent() {
        injectWebOffline();
        injectFalconX();
    }

    public void clearSetting() {
        if (this.settingManager != null) {
            this.settingManager = null;
        }
    }

    public AbstractC12009a getCustomReportMonitor() {
        return this.normalCustomMonitor.f28454a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitor.HybridMonitor$a */
    public static class C11895a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private Set<Integer> f28452a;

        static {
            Covode.recordClassIndex(13621);
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }

        private C11895a() {
            this.f28452a = new HashSet();
        }

        /* synthetic */ C11895a(byte b) {
            this();
        }

        public void onActivityStarted(Activity activity) {
            mo19075a(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            this.f28452a.remove(Integer.valueOf(activity.hashCode()));
        }

        /* renamed from: b */
        private boolean m20986b(Activity activity) {
            if (activity != null && !this.f28452a.contains(Integer.valueOf(activity.hashCode()))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo19075a(Activity activity) {
            try {
                if (m20986b(activity)) {
                    this.f28452a.add(Integer.valueOf(activity.hashCode()));
                    Window window = activity.getWindow();
                    window.setCallback(new Window$CallbackC11896b(window.getCallback(), (byte) 0));
                }
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            mo19075a(activity);
        }
    }

    private void initDebugEnvir() {
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.android.monitor.HybridMonitor.RunnableC118922 */

            static {
                Covode.recordClassIndex(13618);
            }

            public final void run() {
                Application application = HybridMonitor.this.getApplication();
                if (application != null) {
                    try {
                        File a = C11949c.m21087a(application, "monitor_data_switch");
                        File file = new File(a, "is_debug");
                        if (file.isFile() && file.exists()) {
                            C11916a.m21020a(true, false);
                        }
                        File file2 = new File(a, "is_output_file");
                        if (file2.isFile() && file2.exists()) {
                            C11916a.m21021b(true, false);
                        }
                    } catch (Throwable unused) {
                        HybridMonitor.getInstance().getExceptionHandler();
                    }
                }
            }
        });
    }

    private void initFileRecord() {
        registerReportInterceptor(new AbstractC11914h() {
            /* class com.bytedance.android.monitor.HybridMonitor.C118911 */

            static {
                Covode.recordClassIndex(13617);
            }

            @Override // com.bytedance.android.monitor.p704b.AbstractC11914h
            /* renamed from: a */
            public final void mo19071a(String str, String str2, JSONObject jSONObject) {
                boolean z;
                C11937b.m21063b("HybridMonitor", "fileRecord, outputFile: " + HybridMonitor.isOutputFile() + ", service: " + str + ", eventType: " + str2);
                if (HybridMonitor.isOutputFile()) {
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
                            HybridMonitor instance = HybridMonitor.getInstance();
                            C89219l.m154709a((Object) instance, "");
                            File a = C11949c.m21087a(instance.getApplication(), "monitor_data_debug");
                            if (a != null && a.exists()) {
                                C11949c.m21089a(new File(a, "custom_with_".concat(String.valueOf(Uri.parse(optString).getQueryParameter("bytest_case_id")))).getAbsolutePath(), C89361p.m154854b("\n     " + jSONObject + "\n     \n     "));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("extra").getJSONObject("nativeBase");
                            String string = jSONObject2.getString("navigation_id");
                            String optString2 = jSONObject2.optString("url", "");
                            HybridMonitor instance2 = HybridMonitor.getInstance();
                            C89219l.m154709a((Object) instance2, "");
                            File a2 = C11949c.m21087a(instance2.getApplication(), "monitor_data_debug");
                            if (a2 != null && a2.exists()) {
                                C11949c.m21089a(new File(a2, string + "_with_" + Uri.parse(optString2).getQueryParameter("bytest_case_id")).getAbsolutePath(), C89361p.m154854b("\n     " + jSONObject + "\n     \n     "));
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
        C11929a.m21040a().execute(new Runnable() {
            /* class com.bytedance.android.monitor.HybridMonitor.RunnableC118944 */

            static {
                Covode.recordClassIndex(13620);
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("com.bytedance.webx.monitor.falconx.FalconXMonitor");
                    C11954h.m21111a(cls, "beginMonitor", C11954h.m21111a(cls, "getInstance", new Object[0]));
                } catch (Exception unused) {
                    HybridMonitor.getInstance().getExceptionHandler();
                }
            }
        });
    }

    private void injectWebOffline() {
        C11929a.m21040a().execute(new Runnable() {
            /* class com.bytedance.android.monitor.HybridMonitor.RunnableC118933 */

            static {
                Covode.recordClassIndex(13619);
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("com.bytedance.webx.monitor.weboffline.WebOfflineMonitor");
                    C11954h.m21111a(cls, "beginMonitor", C11954h.m21111a(cls, "getInstance", new Object[0]));
                } catch (Exception unused) {
                    HybridMonitor.getInstance().getExceptionHandler();
                }
            }
        });
    }

    public void DisableReportInfo() {
        C11915c.m21019a().f28464a.clear();
    }

    public AbstractC11940b getSettingManager() {
        AbstractC11940b bVar = this.settingManager;
        if (bVar != null) {
            return bVar;
        }
        return C11939a.m21073a();
    }

    public void registerTouchCallback() {
        if (this.application != null && !this.isRegisterTouchCallback) {
            C11895a aVar = new C11895a((byte) 0);
            this.touchTraceCallback = aVar;
            this.application.registerActivityLifecycleCallbacks(aVar);
            this.isRegisterTouchCallback = true;
        }
    }

    public static HybridMonitor getInstance() {
        MethodCollector.m26663i(4225);
        if (instance == null) {
            synchronized (HybridMonitor.class) {
                try {
                    if (instance == null) {
                        instance = new HybridMonitor();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4225);
                    throw th;
                }
            }
        }
        HybridMonitor hybridMonitor = instance;
        MethodCollector.m26664o(4225);
        return hybridMonitor;
    }

    public void setAbTestEnable(boolean z) {
        this.AB_TEST = z;
    }

    public void setExceptionHandler(AbstractC11910d dVar) {
        this.exceptionHandler = dVar;
    }

    public static void setDebuggable(boolean z) {
        C11916a.m21020a(z, false);
    }

    public static void setOutputFile(boolean z) {
        C11916a.m21021b(z, false);
    }

    public void customReport(C11919c cVar) {
        this.normalCustomMonitor.mo19106a(cVar);
    }

    public void init(Application application2) {
        init(application2, true);
    }

    public void initSetting(AbstractC11940b bVar) {
        if (bVar != null) {
            this.settingManager = bVar;
        }
    }

    public void clearDisableReportInfo(String str) {
        C11915c a = C11915c.m21019a();
        if (!TextUtils.isEmpty(str)) {
            a.f28464a.remove(str);
        }
    }

    public void wrapTouchTraceCallback(Activity activity) {
        C11895a aVar;
        if (activity != null && this.isRegisterTouchCallback && (aVar = this.touchTraceCallback) != null) {
            aVar.mo19075a(activity);
        }
    }

    public void registerReportInterceptor(AbstractC11914h hVar) {
        if (hVar != null) {
            if (this.interceptorList == null) {
                this.interceptorList = new CopyOnWriteArrayList();
            }
            this.interceptorList.add(hVar);
        }
    }

    public void setCustomReportMonitor(AbstractC12009a aVar) {
        this.normalCustomMonitor.f28454a = aVar;
        C11937b.m21063b("CustomMonitor", "use new Monitor: ".concat(String.valueOf(aVar)));
    }

    public void unregisterReportInterceptor(AbstractC11914h hVar) {
        List<AbstractC11914h> list;
        if (hVar != null && (list = this.interceptorList) != null && list.size() != 0) {
            this.interceptorList.remove(hVar);
        }
    }

    public static void setDebuggable(boolean z, boolean z2) {
        C11916a.m21020a(z, z2);
    }

    public static void setOutputFile(boolean z, boolean z2) {
        C11916a.m21021b(z, z2);
    }

    public void init(Application application2, boolean z) {
        if (application2 != null && !this.isInitialized) {
            this.isInitialized = true;
            this.application = application2;
            if (z) {
                registerTouchCallback();
            }
            C11937b.m21063b("HybridMonitor", "init sdkinfo: 1.2.5, 1020590, false");
            C11937b.m21063b("HybridMonitor", "init hostinfo: " + C11953g.m21109a(application2) + ", " + C11953g.m21110b(application2));
            initComponent();
            initFileRecord();
            initDebugEnvir();
        }
    }

    public void registerDisableReportInfo(String str, List<String> list) {
        MethodCollector.m26663i(4263);
        C11915c a = C11915c.m21019a();
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(4263);
        } else if (list == null || list.size() == 0) {
            MethodCollector.m26664o(4263);
        } else {
            Set<String> set = a.f28464a.get(str);
            if (set == null) {
                set = Collections.synchronizedSet(new HashSet());
                a.f28464a.put(str, set);
            }
            synchronized (a) {
                try {
                    set.addAll(list);
                } finally {
                    MethodCollector.m26664o(4263);
                }
            }
        }
    }

    public void notifyReportInterceptor(String str, String str2, String str3, JSONObject jSONObject) {
        List<AbstractC11914h> list = this.interceptorList;
        if (list != null && list.size() > 0) {
            for (AbstractC11914h hVar : this.interceptorList) {
                if (hVar != null) {
                    hVar.mo19071a(str, str2, jSONObject);
                }
            }
        }
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        C11897a aVar = this.normalCustomMonitor;
        aVar.mo19107a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z, aVar.f28454a);
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z, AbstractC12009a aVar) {
        this.normalCustomMonitor.mo19107a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z, aVar);
    }
}

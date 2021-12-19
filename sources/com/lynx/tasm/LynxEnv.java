package com.lynx.tasm;

import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.lynx.C28180a;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.NetworkingModule;
import com.lynx.tasm.C28785i;
import com.lynx.tasm.base.AbstractC28456e;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC28465b;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.C28501d;
import com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28589b;
import com.lynx.tasm.behavior.utils.C28702c;
import com.lynx.tasm.behavior.utils.PropsHolderAutoRegister;
import com.lynx.tasm.core.C28745a;
import com.lynx.tasm.provider.AbstractC28843b;
import com.lynx.tasm.provider.AbstractC28850h;
import com.lynx.tasm.provider.AbstractC28853k;
import com.lynx.tasm.provider.AbstractC28854l;
import com.lynx.tasm.provider.CanvasProvider;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class LynxEnv {

    /* renamed from: F */
    private static AbstractC28372a f66626F;

    /* renamed from: x */
    private static volatile LynxEnv f66627x;

    /* renamed from: A */
    private boolean f66628A = false;

    /* renamed from: B */
    private boolean f66629B = true;

    /* renamed from: C */
    private boolean f66630C = false;

    /* renamed from: D */
    private boolean f66631D = true;

    /* renamed from: E */
    private volatile boolean f66632E = false;

    /* renamed from: G */
    private volatile boolean f66633G = false;

    /* renamed from: a */
    public Application f66634a;

    /* renamed from: b */
    public AbstractC28843b f66635b;

    /* renamed from: c */
    public AbstractC28853k f66636c;

    /* renamed from: d */
    public AbstractC28854l f66637d;

    /* renamed from: e */
    public AbstractC28465b f66638e;

    /* renamed from: f */
    public final AtomicBoolean f66639f = new AtomicBoolean(false);

    /* renamed from: g */
    public boolean f66640g = false;

    /* renamed from: h */
    public boolean f66641h = false;

    /* renamed from: i */
    public boolean f66642i = true;

    /* renamed from: j */
    public boolean f66643j = true;

    /* renamed from: k */
    public boolean f66644k = false;

    /* renamed from: l */
    public boolean f66645l = false;

    /* renamed from: m */
    public LynxModuleManager f66646m;

    /* renamed from: n */
    public List<C28463a> f66647n;

    /* renamed from: o */
    public final C28841p f66648o = new C28841p();

    /* renamed from: p */
    public AbstractC28589b f66649p = null;

    /* renamed from: q */
    public CanvasProvider f66650q = null;

    /* renamed from: r */
    public InputMethodManager f66651r = null;

    /* renamed from: s */
    public boolean f66652s = true;

    /* renamed from: t */
    public AbstractC28773f f66653t = null;

    /* renamed from: u */
    public SharedPreferences f66654u;

    /* renamed from: v */
    public Map<String, AbstractC28850h> f66655v = new HashMap();

    /* renamed from: w */
    public String f66656w = null;

    /* renamed from: y */
    private boolean f66657y = false;

    /* renamed from: z */
    private boolean f66658z = true;

    /* renamed from: com.lynx.tasm.LynxEnv$a */
    public interface AbstractC28372a {
        static {
            Covode.recordClassIndex(34357);
        }
    }

    /* renamed from: g */
    public static String m56707g() {
        return "2.1.5-rc.22-cxxshared";
    }

    public native boolean nativeGetEnv(String str, boolean z);

    public native void nativeSetEnv(String str, boolean z);

    /* renamed from: f */
    public final boolean mo48573f() {
        mo48562a();
        return this.f66632E;
    }

    static {
        Covode.recordClassIndex(34356);
        if (!C28702c.f67700a) {
            C28702c.f67700a = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized List<C28463a> mo48569c() {
        List<C28463a> list;
        MethodCollector.m26663i(2208);
        list = this.f66647n;
        MethodCollector.m26664o(2208);
        return list;
    }

    /* renamed from: d */
    public final boolean mo48571d() {
        SharedPreferences sharedPreferences = this.f66654u;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("enable_devtool", this.f66657y);
        }
        LLog.m56856a(6, "LynxEnv", "isDevtoolEnabled() must be called after init()");
        return false;
    }

    /* renamed from: e */
    public final boolean mo48572e() {
        SharedPreferences sharedPreferences = this.f66654u;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("enable_redbox", this.f66658z);
        }
        LLog.m56856a(6, "LynxEnv", "isRedBoxEnabled() must be called after init()");
        return false;
    }

    /* renamed from: b */
    public static LynxEnv m56706b() {
        MethodCollector.m26663i(2207);
        if (f66627x == null) {
            synchronized (LynxEnv.class) {
                try {
                    if (f66627x == null) {
                        f66627x = new LynxEnv();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2207);
                    throw th;
                }
            }
        }
        LynxEnv lynxEnv = f66627x;
        MethodCollector.m26664o(2207);
        return lynxEnv;
    }

    private LynxEnv() {
    }

    /* renamed from: h */
    private void m56708h() {
        if (mo48573f()) {
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
                Object invoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
                cls.getMethod("init", Context.class).invoke(invoke, this.f66634a);
            } catch (Exception e) {
                LLog.m56856a(6, "LynxEnv", "initDevtoolEnv failed: " + e.toString());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo48562a() {
        MethodCollector.m26663i(2185);
        if (this.f66639f.get() || this.f66633G) {
            MethodCollector.m26664o(2185);
            return;
        }
        C28785i.AbstractC28786a aVar = C28785i.f67896a;
        if (aVar != null) {
            this.f66633G = true;
            aVar.mo49901a();
            MethodCollector.m26664o(2185);
            return;
        }
        if (f66626F != null) {
            this.f66633G = true;
        }
        MethodCollector.m26664o(2185);
    }

    /* renamed from: a */
    private void m56704a(Map<String, Object> map) {
        this.f66648o.mo49972a(map);
    }

    /* renamed from: a */
    private static void m56703a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    /* renamed from: b */
    public final void mo48567b(boolean z) {
        String str;
        if (z) {
            str = "Turn on devtool";
        } else {
            str = "Turn off devtool";
        }
        LLog.m56856a(4, "LynxEnv", str);
        this.f66657y = z;
        if (z) {
            LLog.m56855a(2);
        } else {
            LLog.m56855a(4);
        }
        mo48565a("enable_devtool", z);
    }

    /* renamed from: c */
    public final void mo48570c(boolean z) {
        String str;
        if (z) {
            str = "Turn on redbox";
        } else {
            str = "Turn off redbox";
        }
        LLog.m56856a(4, "LynxEnv", str);
        this.f66658z = z;
        mo48565a("enable_redbox", z);
    }

    /* renamed from: a */
    private boolean m56705a(AbstractC28773f fVar) {
        if (this.f66641h) {
            if (fVar != null) {
                try {
                    fVar.mo33431a("lynx_debug");
                    this.f66653t = fVar;
                    return true;
                } catch (UnsatisfiedLinkError e) {
                    LLog.m56856a(6, "LynxEnv", "Debug Lynx Library load from system with error message " + e.getMessage());
                }
            } else {
                m56703a("lynx_debug");
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo48566a(boolean z) {
        String str;
        if (z) {
            str = "enable lynx debug";
        } else {
            str = "disable lynx debug";
        }
        LLog.m56856a(4, "LynxEnv", str);
        this.f66640g = z;
        if (z && this.f66634a != null) {
            m56708h();
        }
    }

    /* renamed from: a */
    public static Object m56702a(Application application, String str) {
        Object obj;
        MethodCollector.m26663i(2274);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = application.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = application.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2274);
                }
            }
        } else {
            obj = application.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: b */
    public final boolean mo48568b(String str, boolean z) {
        if (!mo48573f()) {
            return z;
        }
        try {
            Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
            Object invoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
            z = ((Boolean) cls.getMethod("getDevtoolEnv", String.class, Boolean.class).invoke(invoke, str, Boolean.valueOf(z))).booleanValue();
            return z;
        } catch (Exception e) {
            LLog.m56856a(6, "LynxEnv", "getDevtoolEnv failed: " + e.toString());
            return z;
        }
    }

    /* renamed from: a */
    public final void mo48565a(String str, boolean z) {
        if (mo48573f()) {
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
                Object invoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
                cls.getMethod("setDevtoolEnv", String.class, Boolean.class).invoke(invoke, str, Boolean.valueOf(z));
            } catch (Exception e) {
                LLog.m56856a(6, "LynxEnv", "setDevtoolEnv failed: " + e.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo48564a(String str, Class<? extends LynxModule> cls, Object obj) {
        if (this.f66646m == null) {
            this.f66646m = new LynxModuleManager(this.f66634a);
        }
        this.f66646m.mo48441a(str, cls, obj);
    }

    public static void reportJSBridgeInvoked(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("module-name", str);
        hashMap.put("method-name", str2);
        hashMap.put("url", str4);
        if (!str3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str3);
            hashMap.put("params", arrayList);
        }
        m56706b().m56704a(hashMap);
    }

    /* renamed from: a */
    public final synchronized void mo48563a(Application application, AbstractC28773f fVar, AbstractC28843b bVar, AbstractC28465b bVar2) {
        int i;
        MethodCollector.m26663i(2180);
        if (this.f66639f.get()) {
            LLog.m56856a(5, "LynxEnv", "LynxEnv is already initialized");
            MethodCollector.m26664o(2180);
            return;
        }
        LLog.m56856a(4, "LynxEnv", "LynxEnv start init");
        this.f66639f.set(true);
        if (TraceEvent.m56868a() && C28180a.f65962d.booleanValue()) {
            try {
                Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, true);
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        if (!PropsHolderAutoRegister.f67693a) {
            PropsHolderAutoRegister.f67693a = true;
        }
        this.f66634a = application;
        SharedPreferences a = C34822d.m71158a(application, "lynx_env_config", 0);
        this.f66654u = a;
        this.f66641h = a.getBoolean("enable_debug_mode", C28180a.f65959a.booleanValue());
        this.f66638e = bVar2;
        this.f66635b = bVar;
        ArrayList arrayList = new ArrayList();
        this.f66647n = arrayList;
        arrayList.addAll(new C28501d().mo33432a());
        if (m56706b().f66638e != null) {
            this.f66647n.addAll(m56706b().f66638e.mo33432a());
        }
        C28745a.m57564a().execute(new Runnable(this.f66647n) {
            /* class com.lynx.tasm.C28438b.RunnableC284391 */

            /* renamed from: a */
            final /* synthetic */ List f66898a;

            static {
                Covode.recordClassIndex(34429);
            }

            public final void run() {
                SystemClock.uptimeMillis();
                try {
                    for (C28463a aVar : this.f66898a) {
                        AbstractC28392a b = aVar.mo26076b();
                        if (b != null) {
                            b.mo48815a();
                        }
                    }
                    SystemClock.uptimeMillis();
                } catch (Throwable unused) {
                }
            }

            {
                this.f66898a = r1;
            }
        });
        LynxModuleManager lynxModuleManager = new LynxModuleManager(application);
        this.f66646m = lynxModuleManager;
        lynxModuleManager.mo48441a("NetworkingModule", NetworkingModule.class, null);
        if (!this.f66632E) {
            try {
                if (m56705a(fVar)) {
                    LLog.m56856a(4, "LynxEnv", "Debug Lynx Library load success ");
                    this.f66632E = true;
                } else {
                    if (fVar != null) {
                        fVar.mo33431a("lynx");
                        this.f66653t = fVar;
                    } else {
                        m56703a("lynx");
                    }
                    this.f66632E = true;
                    AbstractC28456e eVar = LLog.f66910b.get(Integer.valueOf(LLog.f66909a));
                    if (eVar != null) {
                        i = eVar.mo33437b();
                    } else {
                        i = 4;
                    }
                    LLog.m56855a(i);
                    LLog.m56856a(4, "LynxEnv", "Native Lynx Library load success ");
                }
            } catch (UnsatisfiedLinkError e4) {
                if (fVar == null) {
                    LLog.m56856a(6, "LynxEnv", "Native Lynx Library load from system with error message " + e4.getMessage());
                } else {
                    LLog.m56856a(6, "LynxEnv", "Native Lynx Library load from " + fVar.getClass().getName() + " with error message " + e4.getMessage());
                }
                this.f66632E = false;
            }
        }
        if (this.f66640g) {
            m56708h();
        }
        MethodCollector.m26664o(2180);
    }
}

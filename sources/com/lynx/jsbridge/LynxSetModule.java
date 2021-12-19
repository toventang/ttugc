package com.lynx.jsbridge;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28512g;
import com.lynx.tasm.behavior.C28517h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class LynxSetModule extends LynxContextModule {
    static {
        Covode.recordClassIndex(34320);
    }

    @AbstractC28359d
    public boolean getEnableRadonCompatible() {
        return LynxEnv.m56706b().f66642i;
    }

    @AbstractC28359d
    public boolean isDebugModeEnabled() {
        return LynxEnv.m56706b().f66641h;
    }

    @AbstractC28359d
    public boolean getDevtoolDebug() {
        return LynxEnv.m56706b().mo48571d();
    }

    @AbstractC28359d
    public boolean getDevtoolNextSupport() {
        return LynxEnv.m56706b().mo48568b("enable_devtool_next", true);
    }

    @AbstractC28359d
    public boolean getRedBoxSupport() {
        return LynxEnv.m56706b().mo48572e();
    }

    @AbstractC28359d
    public boolean isDevtoolBadgeEnabled() {
        return LynxEnv.m56706b().mo48568b("show_devtool_badge", false);
    }

    @AbstractC28359d
    public boolean isQuickjsCacheEnabled() {
        return LynxEnv.m56706b().mo48568b("enable_quickjs_cache", true);
    }

    @AbstractC28359d
    public boolean isV8Enabled() {
        return LynxEnv.m56706b().mo48568b("enable_v8", true);
    }

    @AbstractC28359d
    public boolean getLogToSystemStatus() {
        try {
            Class<?> cls = Class.forName("com.ss.android.agilelogger.ALog");
            Field declaredField = cls.getDeclaredField("sDebug");
            declaredField.setAccessible(true);
            return declaredField.getBoolean(cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public LynxSetModule(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28359d
    public void switchDevtoolBadge(Boolean bool) {
        LynxEnv.m56706b().mo48565a("show_devtool_badge", bool.booleanValue());
    }

    @AbstractC28359d
    public void switchDevtoolDebug(Boolean bool) {
        LynxEnv.m56706b().mo48567b(bool.booleanValue());
    }

    @AbstractC28359d
    public void switchDevtoolNextSupport(Boolean bool) {
        LynxEnv.m56706b().mo48565a("enable_devtool_next", bool.booleanValue());
    }

    @AbstractC28359d
    public void switchQuickjsCache(Boolean bool) {
        LynxEnv.m56706b().mo48565a("enable_quickjs_cache", bool.booleanValue());
    }

    @AbstractC28359d
    public void switchRedBoxSupport(Boolean bool) {
        LynxEnv.m56706b().mo48570c(bool.booleanValue());
    }

    @AbstractC28359d
    public void switchV8(Boolean bool) {
        LynxEnv.m56706b().mo48565a("enable_v8", bool.booleanValue());
    }

    @AbstractC28359d
    public void switchEnableRadonCompatible(Boolean bool) {
        String str;
        LynxEnv b = LynxEnv.m56706b();
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            str = "Turn on RadonCompatible";
        } else {
            str = "Turn off RadonCompatible";
        }
        LLog.m56856a(4, "LynxEnv", str);
        b.f66642i = booleanValue;
    }

    @AbstractC28359d
    public void switchDebugModeEnable(Boolean bool) {
        String str;
        LynxEnv b = LynxEnv.m56706b();
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            str = "Turn on DebugMode";
        } else {
            str = "Turn off DebugMode";
        }
        LLog.m56856a(4, "LynxEnv", str);
        b.f66641h = booleanValue;
        if (b.f66654u == null) {
            LLog.m56856a(6, "LynxEnv", "enableDebugMode() must be called after init()");
        } else {
            b.f66654u.edit().putBoolean("enable_debug_mode", booleanValue).apply();
        }
    }

    @AbstractC28359d
    public void switchLogToSystem(boolean z) {
        try {
            Class.forName("com.ss.android.agilelogger.ALog").getMethod("setDebug", Boolean.TYPE).invoke(null, Boolean.valueOf(z));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    @AbstractC28359d
    public void switchKeyBoardDetect(boolean z) {
        if (z) {
            C28517h a = C28517h.m56984a();
            AbstractC28520j jVar = this.mLynxContext;
            if (!(jVar.mo49032a() instanceof Activity)) {
                LLog.m56856a(6, "Lynx", "context is not a Activity, KeyBoardEventDispatcher is not functional.");
            } else if (a.f67056a.containsKey(jVar)) {
                a.f67056a.get(jVar).mo49017a();
            } else {
                C28512g gVar = new C28512g(jVar);
                gVar.mo49017a();
                a.f67056a.put(jVar, gVar);
                jVar.f67073n.get().addLynxViewClient(new AbstractC28838o(jVar) {
                    /* class com.lynx.tasm.behavior.C28517h.C285181 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC28520j f67057a;

                    static {
                        Covode.recordClassIndex(34516);
                    }

                    @Override // com.lynx.tasm.AbstractC28838o
                    /* renamed from: e */
                    public final void mo19153e() {
                        C28517h.this.mo49025a(this.f67057a);
                        super.mo19153e();
                    }

                    {
                        this.f67057a = r2;
                    }
                });
            }
        } else {
            C28517h.m56984a().mo49025a(this.mLynxContext);
        }
    }

    @AbstractC28359d
    public void invokeCdp(String str, String str2, Callback callback) {
        AbstractC28520j jVar = this.mLynxContext;
        if (jVar.f67073n.get() != null) {
            jVar.f67073n.get().getBaseInspectorOwner();
        }
    }
}

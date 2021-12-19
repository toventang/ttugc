package com.lynx.tasm;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.lynx.devtoolwrapper.AbstractC28330a;
import com.lynx.devtoolwrapper.C28333d;
import com.lynx.jsbridge.C28357b;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.C28783h;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28510f;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2049b.C28471b;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.core.VSyncMonitor;
import com.lynx.tasm.p2059g.C28782a;
import com.lynx.tasm.utils.C28929m;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;

public class LynxView extends UIBody.C28581a {
    private boolean mAttached;
    private boolean mCanDispatchTouchEvent;
    protected boolean mDispatchTouchEventToDev = true;
    private boolean mIsDevtoolConfigView;
    public LynxTemplateRender mLynxTemplateRender;

    static {
        Covode.recordClassIndex(34373);
    }

    /* renamed from: com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m56745x7610661f(String str, String str2) {
        return 0;
    }

    public LynxPerfMetric forceGetPerf() {
        return null;
    }

    public Object getTag() {
        return "lynxview";
    }

    public void renderTemplateUrl(String str, String str2) {
        m56746x9d784d0d(this, str, str2);
    }

    public void renderTemplateUrl(String str, Map map) {
        m56747x9d784d0d(this, str, map);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, TemplateData templateData, String str) {
        m56748x7a8c2ed6(this, bArr, templateData, str);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, String str, String str2) {
        m56749x7a8c2ed6(this, bArr, str, str2);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, Map map, String str) {
        m56750x7a8c2ed6(this, bArr, map, str);
    }

    public void setIsLynxDevtoolConfigView() {
        this.mIsDevtoolConfigView = true;
    }

    public boolean isLynxDevtoolConfigView() {
        return this.mIsDevtoolConfigView;
    }

    public static C28820n builder() {
        return new C28820n();
    }

    public void syncFlush() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.syncFlush();
        }
    }

    public AbstractC28330a getBaseInspectorOwner() {
        C28333d devTool;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (devTool = lynxTemplateRender.getDevTool()) == null) {
            return null;
        }
        return devTool.f66535a;
    }

    public long getFirstMeasureTime() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return -1;
        }
        return lynxTemplateRender.getFirstMeasureTime();
    }

    public AbstractC28520j getLynxContext() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.getLynxContext();
        }
        return null;
    }

    public UIGroup<UIBody.C28581a> getLynxUIRoot() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getLynxRootUI();
    }

    public String getPageVersion() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return "";
        }
        return lynxTemplateRender.getPageVersion();
    }

    public String getTemplateUrl() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getTemplateUrl();
    }

    public C28782a getTheme() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getTheme();
    }

    public EnumC28856r getThreadStrategyForRendering() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getThreadStrategyForRendering();
    }

    public void pauseRootLayoutAnimation() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.pauseRootLayoutAnimation();
        }
    }

    public void resumeRootLayoutAnimation() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.resumeRootLayoutAnimation();
        }
    }

    public C28783h getLynxConfigInfo() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return new C28783h.C28784a().mo49900a();
        }
        return lynxTemplateRender.getLynxConfigInfo();
    }

    public void destroy() {
        LLog.m56856a(4, "LynxView", "lynxview destroy " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.destroy();
            this.mLynxTemplateRender = null;
            C28471b bVar = C28471b.C28474a.f66975a;
            C28471b.m56908a(bVar.f66966e, this);
            C28471b.m56908a(bVar.f66963b, this);
            C28471b.m56908a(bVar.f66962a, this);
            C28471b.m56908a(bVar.f66965d, this);
            C28471b.m56908a(bVar.f66964c, this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LLog.m56856a(4, "Lynx", "onAttachedToWindow:" + hashCode());
        this.mAttached = true;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onAttachedToWindow();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        LLog.m56856a(4, "Lynx", "onDetachedFromWindow:" + hashCode());
        this.mAttached = false;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onDetachedFromWindow();
        }
        super.onDetachedFromWindow();
    }

    public void onEnterBackground() {
        LLog.m56856a(4, "LynxView", "onEnterBackground" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onEnterBackground();
        }
    }

    public void onEnterForeground() {
        LLog.m56856a(4, "LynxView", "onEnterForeground " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onEnterForeground();
        }
    }

    public LynxView(Context context) {
        super(context);
    }

    public void addStateListener(AbstractC28767e eVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.addLStateListener(eVar);
        }
    }

    public void removeStateListener(AbstractC28767e eVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.removeStateListener(eVar);
        }
    }

    public void updateData(String str) {
        updateData(str, (String) null);
    }

    public static C28820n builder(Context context) {
        return new C28820n();
    }

    public void addLynxViewClient(AbstractC28838o oVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.addLynxViewClient(oVar);
        }
    }

    public LynxBaseUI findUIByIdSelector(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findUIByIdSelector(str);
    }

    public LynxBaseUI findUIByIndex(int i) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.findUIByIndex(i);
        }
        return null;
    }

    public LynxBaseUI findUIByName(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findUIByName(str);
    }

    public View findViewByIdSelector(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findViewByIdSelector(str);
    }

    public View findViewByName(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findViewByName(str);
    }

    public void getCurrentData(AbstractC28817k kVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.getCurrentData(kVar);
        }
    }

    public C28357b getJSModule(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getJSModule(str);
    }

    public void removeLynxViewClient(AbstractC28838o oVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.removeLynxViewClient(oVar);
        }
    }

    public void runOnTasmThread(Runnable runnable) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.runOnTasmThread(runnable);
        }
    }

    public void setGlobalProps(TemplateData templateData) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setGlobalProps(templateData);
        }
    }

    public void setImageInterceptor(AbstractC28510f fVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setImageInterceptor(fVar);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (onClickListener == null) {
            z = true;
        } else {
            z = false;
        }
        setFocusableInTouchMode(z);
        super.setOnClickListener(onClickListener);
    }

    public void setTheme(C28782a aVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setTheme(aVar);
        }
    }

    public void updateData(Map<String, Object> map) {
        updateData(map, (String) null);
    }

    public void updateFontScacle(float f) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateFontScale(f);
        }
    }

    public void setGlobalProps(Map<String, Object> map) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setGlobalProps(map);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null && this.mCanDispatchTouchEvent) {
                lynxTemplateRender.onInterceptTouchEvent(motionEvent);
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            LynxTemplateRender lynxTemplateRender2 = this.mLynxTemplateRender;
            if (lynxTemplateRender2 == null) {
                return false;
            }
            lynxTemplateRender2.onErrorOccurred(1801, "An exception occurred during the execution of the onInterceptTouchEvent function，and the error message is " + th.getMessage());
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null && this.mCanDispatchTouchEvent) {
                lynxTemplateRender.onTouchEvent(motionEvent);
            }
            if (this.mLynxTemplateRender.blockNativeEvent() && getParent() != null) {
                return true;
            }
            super.onTouchEvent(motionEvent);
            return true;
        } catch (Throwable th) {
            LynxTemplateRender lynxTemplateRender2 = this.mLynxTemplateRender;
            if (lynxTemplateRender2 == null) {
                return false;
            }
            lynxTemplateRender2.onErrorOccurred(1801, "An exception occurred during the execution of the onTouchEvent function，and the error message is " + th.getMessage());
            return false;
        }
    }

    public void resetData(TemplateData templateData) {
        LLog.m56856a(4, "LynxView", "resetData with json in " + templateData.toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.resetData(templateData);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        LLog.m56856a(4, "Lynx", "setVisibility:" + hashCode() + " " + i);
    }

    public void updateData(TemplateData templateData) {
        LLog.m56856a(4, "LynxView", "updateData with data in " + templateData.toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateData(templateData);
        }
    }

    public void attachTemplateRender(final LynxTemplateRender lynxTemplateRender) {
        if (lynxTemplateRender == null) {
            LLog.m56856a(5, "Lynx", "render is null! in " + toString());
        } else if (!C28929m.m57950a()) {
            C28929m.m57947a(new Runnable() {
                /* class com.lynx.tasm.LynxView.RunnableC283861 */

                static {
                    Covode.recordClassIndex(34374);
                }

                public final void run() {
                    LynxView.this.attachTemplateRender(lynxTemplateRender);
                }
            });
        } else if (this.mLynxTemplateRender != null) {
            LLog.m56856a(5, "Lynx", "already attached" + toString());
        } else if (lynxTemplateRender.attach(this)) {
            if (this.mAttached) {
                lynxTemplateRender.onAttachedToWindow();
            }
            this.mLynxTemplateRender = lynxTemplateRender;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        try {
            if (this.mLynxTemplateRender == null) {
                return super.dispatchTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mCanDispatchTouchEvent = true;
            }
            if (this.mCanDispatchTouchEvent) {
                z = this.mLynxTemplateRender.dispatchTouchEvent(motionEvent);
                if (this.mLynxTemplateRender.blockNativeEvent() && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else {
                z = false;
            }
            if (action == 1 || action == 3) {
                this.mCanDispatchTouchEvent = false;
            }
            if (!this.mLynxTemplateRender.enableEventThrough() || z) {
                if (this.mDispatchTouchEventToDev) {
                    this.mLynxTemplateRender.onDispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        } catch (Throwable th) {
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null) {
                lynxTemplateRender.onErrorOccurred(1801, "An exception occurred during the execution of the dispatchTouchEvent function，and the error message is " + th.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void innerSetMeasuredDimension(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    public void hotModuleReplace(String str, String str2) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.hotModuleReplace(str, str2);
        }
    }

    public LynxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void sendGlobalEvent(String str, JavaOnlyArray javaOnlyArray) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.sendGlobalEvent(str, javaOnlyArray);
        }
    }

    public void sendGlobalEventToLepus(String str, List<Object> list) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.sendGlobalEventToLepus(str, list);
        }
    }

    public void updateViewport(int i, int i2) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateViewport(i, i2);
        }
    }

    public LynxView(Context context, C28820n nVar) {
        super(context);
        LLog.m56856a(4, "LynxView", "new lynxview  " + toString());
        setFocusableInTouchMode(true);
        VSyncMonitor.f67788a = new WeakReference<>(m56744x621d1442(context, "window"));
        this.mLynxTemplateRender = new LynxTemplateRender(context, this, nVar);
    }

    public void LynxView__renderTemplateUrl$___twin___(String str, String str2) {
        LLog.m56856a(4, "LynxView", "renderTemplateUrl " + str + "with jsonData in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateUrl(str, str2);
        }
    }

    public void renderTemplate(byte[] bArr, TemplateData templateData) {
        LLog.m56856a(4, "LynxView", "renderTemplate with templateData in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplate(bArr, templateData);
        }
    }

    public void renderTemplateUrl(String str, TemplateData templateData) {
        LLog.m56856a(4, "LynxView", "renderTemplateUrl " + str + "with templatedata in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateUrl(str, templateData);
        }
    }

    public void updateScreenMetrics(int i, int i2) {
        if (this.mLynxTemplateRender != null) {
            if (DisplayMetricsHolder.f68335a != null) {
                DisplayMetricsHolder.f68335a.widthPixels = i;
                DisplayMetricsHolder.f68335a.heightPixels = i2;
            }
            if (DisplayMetricsHolder.f68336b != null) {
                DisplayMetricsHolder.f68336b.widthPixels = i;
                DisplayMetricsHolder.f68336b.heightPixels = i2;
            }
            this.mLynxTemplateRender.updateScreenMetrics(i, i2);
        }
    }

    /* renamed from: com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m56744x621d1442(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1822);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
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
                    MethodCollector.m26664o(1822);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void LynxView__renderTemplateUrl$___twin___(String str, Map<String, Object> map) {
        LLog.m56856a(4, "LynxView", "renderTemplateUrl " + str + "with Map in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateUrl(str, map);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        LLog.m56856a(4, "Lynx", "onMeasure:" + hashCode() + ", width" + View.MeasureSpec.toString(i) + ", height" + View.MeasureSpec.toString(i2));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            super.onMeasure(i, i2);
        } else {
            lynxTemplateRender.onMeasure(i, i2);
        }
    }

    public void renderTemplate(byte[] bArr, Map<String, Object> map) {
        LLog.m56856a(4, "LynxView", "renderTemplate with initdata in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplate(bArr, map);
        }
    }

    public void updateData(String str, String str2) {
        LLog.m56856a(4, "LynxView", "updateData with json in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateData(str, str2);
        }
    }

    public void updateData(Map<String, Object> map, String str) {
        LLog.m56856a(4, "LynxView", "updateData with map in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateData(map, str);
        }
    }

    /* renamed from: com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl */
    public static void m56746x9d784d0d(LynxView lynxView, String str, String str2) {
        m56745x7610661f("Security.lynx", "renderTemplateUrl " + str + "with jsonData");
        C89378p<String, Boolean> a = C84357h.f188595a.mo129369a(str, lynxView);
        if (a.getSecond().booleanValue()) {
            lynxView.LynxView__renderTemplateUrl$___twin___(a.getFirst(), str2);
        }
    }

    public void LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, TemplateData templateData, String str) {
        LLog.m56856a(4, "LynxView", "renderTemplateWithBaseUrl " + str + "with templateData in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateWithBaseUrl(bArr, templateData, str);
        }
    }

    /* renamed from: com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl */
    public static void m56747x9d784d0d(LynxView lynxView, String str, Map map) {
        m56745x7610661f("Security.lynx", "renderTemplateUrl " + str + " with Map");
        C89378p<String, Boolean> a = C84357h.f188595a.mo129369a(str, lynxView);
        if (a.getSecond().booleanValue()) {
            lynxView.LynxView__renderTemplateUrl$___twin___(a.getFirst(), map);
        }
    }

    public void LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, String str, String str2) {
        LLog.m56856a(4, "LynxView", "renderTemplateWithBaseUrl " + str2 + "with stringdata in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateWithBaseUrl(bArr, str, str2);
        }
    }

    public void LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, Map<String, Object> map, String str) {
        LLog.m56856a(4, "LynxView", "renderTemplateWithBaseUrl " + str + "with map in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateWithBaseUrl(bArr, map, str);
        }
    }

    /* renamed from: com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl */
    public static void m56748x7a8c2ed6(LynxView lynxView, byte[] bArr, TemplateData templateData, String str) {
        m56745x7610661f("Security.lynx", "renderTemplateWithBaseUrl " + str + " with templateData");
        C89378p<String, Boolean> a = C84357h.f188595a.mo129369a(str, lynxView);
        if (a.getSecond().booleanValue()) {
            lynxView.LynxView__renderTemplateWithBaseUrl$___twin___(bArr, templateData, a.getFirst());
        }
    }

    /* renamed from: com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl */
    public static void m56749x7a8c2ed6(LynxView lynxView, byte[] bArr, String str, String str2) {
        m56745x7610661f("Security.lynx", "renderTemplateWithBaseUrl " + str2 + " with stringdata");
        C89378p<String, Boolean> a = C84357h.f188595a.mo129369a(str2, lynxView);
        if (a.getSecond().booleanValue()) {
            lynxView.LynxView__renderTemplateWithBaseUrl$___twin___(bArr, str, a.getFirst());
        }
    }

    /* renamed from: com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl */
    public static void m56750x7a8c2ed6(LynxView lynxView, byte[] bArr, Map map, String str) {
        m56745x7610661f("Security.lynx", "renderTemplateWithBaseUrl " + str + " with map");
        C89378p<String, Boolean> a = C84357h.f188595a.mo129369a(str, lynxView);
        if (a.getSecond().booleanValue()) {
            lynxView.LynxView__renderTemplateWithBaseUrl$___twin___(bArr, map, a.getFirst());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onLayout(z, i, i2, i3, i4);
            LLog.m56856a(4, "Lynx", "onLayout:" + hashCode() + i + " " + i2 + " " + i3 + " " + i4);
        }
    }
}

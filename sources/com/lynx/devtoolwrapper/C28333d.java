package com.lynx.devtoolwrapper;

import android.content.Context;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.AbstractC28767e;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.C28460i;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.devtoolwrapper.d */
public class C28333d {

    /* renamed from: f */
    private static final String f66534f = C28333d.class.getSimpleName();

    /* renamed from: a */
    public AbstractC28331b f66535a;

    /* renamed from: b */
    public AbstractC28332c f66536b;

    /* renamed from: c */
    public C28460i f66537c;

    /* renamed from: d */
    public WeakReference<LynxView> f66538d;

    /* renamed from: e */
    public AbstractC28767e f66539e;

    static {
        Covode.recordClassIndex(34293);
    }

    public C28333d(LynxView lynxView, LynxTemplateRender lynxTemplateRender) {
        try {
            String str = f66534f;
            LLog.m56856a(4, str, "Initialize LynxDevtool, lynxDebugEnabled:" + LynxEnv.m56706b().f66640g);
            this.f66538d = new WeakReference<>(lynxView);
            if (LynxEnv.m56706b().f66640g) {
                LLog.m56856a(4, str, "devtoolEnabled:" + LynxEnv.m56706b().mo48571d() + ", redBoxEnabled:" + LynxEnv.m56706b().mo48572e());
                Object newInstance = Class.forName("com.lynx.devtool.LynxDevtoolManager").getConstructor(LynxView.class).newInstance(lynxView);
                if (newInstance instanceof AbstractC28767e) {
                    this.f66539e = (AbstractC28767e) newInstance;
                }
                if (LynxEnv.m56706b().mo48571d()) {
                    Object newInstance2 = Class.forName("com.lynx.devtool.LynxInspectorOwner").getConstructor(LynxView.class).newInstance(lynxView);
                    if (newInstance2 instanceof AbstractC28330a) {
                        this.f66535a = (AbstractC28331b) newInstance2;
                    }
                }
                if (LynxEnv.m56706b().mo48572e()) {
                    Object newInstance3 = Class.forName("com.lynx.devtool.redbox.RedBoxManager").getConstructor(Context.class, LynxTemplateRender.class).newInstance(lynxTemplateRender.getLynxContext().getBaseContext(), lynxTemplateRender);
                    if (newInstance3 instanceof AbstractC28332c) {
                        this.f66536b = (AbstractC28332c) newInstance3;
                        if (this.f66535a != null) {
                            new Runnable() {
                                /* class com.lynx.devtoolwrapper.C28333d.RunnableC283341 */

                                static {
                                    Covode.recordClassIndex(34294);
                                }

                                public final void run() {
                                }
                            };
                        }
                    }
                }
                DisplayMetrics displayMetrics = lynxTemplateRender.getLynxContext().f67075p;
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                float f = displayMetrics.density;
            }
            if (this.f66535a != null || this.f66536b != null) {
                this.f66537c = new C28460i(lynxTemplateRender);
            }
        } catch (Exception e) {
            LLog.m56856a(6, f66534f, "failed to init LynxDevtool: " + e.toString());
            this.f66535a = null;
            this.f66536b = null;
            this.f66537c = null;
        }
    }

    /* renamed from: a */
    public final void mo48415a(byte[] bArr, TemplateData templateData, String str) {
        C28460i iVar = this.f66537c;
        if (iVar != null) {
            iVar.f66927c = false;
            iVar.f66926b = true;
            iVar.f66928d.f66931a = bArr;
            iVar.f66928d.f66932b = str;
            iVar.f66928d.f66933c = templateData;
            iVar.f66925a = str;
        }
    }
}

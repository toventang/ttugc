package com.lynx.tasm.behavior;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.core.C28745a;
import com.lynx.tasm.utils.C28929m;

/* renamed from: com.lynx.tasm.behavior.g */
public final class C28512g {

    /* renamed from: a */
    AbstractC28520j f67041a;

    /* renamed from: b */
    public float f67042b;

    /* renamed from: c */
    public DialogC28519i f67043c;

    /* renamed from: d */
    public int f67044d;

    /* renamed from: e */
    public int f67045e;

    /* renamed from: f */
    public Rect f67046f = new Rect();

    /* renamed from: g */
    public int f67047g;

    /* renamed from: h */
    private ViewTreeObserver.OnGlobalLayoutListener f67048h;

    /* renamed from: i */
    private boolean f67049i;

    static {
        Covode.recordClassIndex(34510);
    }

    /* renamed from: c */
    public final void mo49019c() {
        if (this.f67049i) {
            if (!C28929m.m57950a()) {
                C28929m.m57947a(new Runnable() {
                    /* class com.lynx.tasm.behavior.C28512g.RunnableC285163 */

                    static {
                        Covode.recordClassIndex(34514);
                    }

                    public final void run() {
                        C28512g.this.mo49020d();
                    }
                });
            } else {
                mo49020d();
            }
            this.f67049i = false;
        }
    }

    /* renamed from: a */
    public final void mo49017a() {
        if (this.f67049i) {
            LLog.m56859a("Lynx", "KeyboardEvent for LynxView " + this.f67041a.hashCode() + "already started");
            return;
        }
        if (!C28929m.m57950a()) {
            C28929m.m57947a(new Runnable() {
                /* class com.lynx.tasm.behavior.C28512g.RunnableC285131 */

                static {
                    Covode.recordClassIndex(34511);
                }

                public final void run() {
                    C28512g.this.mo49018b();
                }
            });
        } else {
            mo49018b();
        }
        this.f67049i = true;
    }

    /* renamed from: d */
    public final void mo49020d() {
        DialogC28519i iVar;
        LLog.m56859a("Lynx", "KeyboardEvent for LynxView " + this.f67041a.hashCode() + "stopping");
        try {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f67048h;
            if (onGlobalLayoutListener != null && (iVar = this.f67043c) != null) {
                iVar.mo49029b(onGlobalLayoutListener);
                this.f67043c.mo49030c();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo49018b() {
        LLog.m56859a("Lynx", "KeyboardEvent for LynxView " + this.f67041a.hashCode() + "starting");
        if (this.f67043c == null) {
            this.f67043c = new DialogC28519i(this.f67041a.mo49032a());
        }
        final View decorView = ((Activity) this.f67041a.mo49032a()).getWindow().getDecorView();
        ViewTreeObserver$OnGlobalLayoutListenerC285142 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.lynx.tasm.behavior.C28512g.ViewTreeObserver$OnGlobalLayoutListenerC285142 */

            static {
                Covode.recordClassIndex(34512);
            }

            public final void onGlobalLayout() {
                LLog.m56856a(3, "Lynx", "onGlobalLayout invoked.");
                C28745a.m57564a().execute(new Runnable() {
                    /* class com.lynx.tasm.behavior.C28512g.ViewTreeObserver$OnGlobalLayoutListenerC285142.RunnableC285151 */

                    static {
                        Covode.recordClassIndex(34513);
                    }

                    public final void run() {
                        boolean z;
                        int i;
                        String str;
                        try {
                            C28512g.this.f67043c.getWindow().getDecorView().getWindowVisibleDisplayFrame(C28512g.this.f67046f);
                            int i2 = C28512g.this.f67046f.bottom - C28512g.this.f67046f.top;
                            if (C28512g.this.f67044d == 0) {
                                C28512g.this.f67044d = decorView.getHeight();
                            }
                            if (C28512g.this.f67045e == 0) {
                                C28512g.this.f67045e = C28512g.this.f67043c.getWindow().getDecorView().getHeight();
                            }
                            int i3 = C28512g.this.f67044d;
                            int i4 = C28512g.this.f67045e;
                            double d = (double) i2;
                            double d2 = (double) i3;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            double d3 = d / d2;
                            if (d3 < 0.4d) {
                                C28512g.this.f67043c.getWindow().getDecorView().requestLayout();
                                return;
                            }
                            int i5 = 0;
                            if (d3 < 0.8d) {
                                z = true;
                                i5 = (int) (((float) (i3 - i2)) / C28512g.this.f67042b);
                                i = (int) (((float) (i4 - i2)) / C28512g.this.f67042b);
                            } else {
                                z = false;
                                i = 0;
                            }
                            LLog.m56859a("Lynx", "KeyboardEvent visible = " + z + ", height = " + i5 + ", compatHeight = " + i);
                            if (i5 != C28512g.this.f67047g) {
                                C28512g gVar = C28512g.this;
                                if (gVar.f67041a.f67064e != null) {
                                    JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                                    if (z) {
                                        str = "on";
                                    } else {
                                        str = "off";
                                    }
                                    javaOnlyArray.pushString(str);
                                    javaOnlyArray.pushInt(i5);
                                    javaOnlyArray.pushInt(i);
                                    gVar.f67041a.mo49038a("keyboardstatuschanged", javaOnlyArray);
                                }
                                C28512g.this.f67047g = i5;
                            }
                        } catch (Exception e) {
                            LLog.m56862d("Lynx", e.getMessage());
                        }
                    }
                });
            }
        };
        this.f67048h = r1;
        this.f67043c.mo49027a(r1);
        this.f67043c.mo49028b();
    }

    public C28512g(AbstractC28520j jVar) {
        LLog.m56859a("Lynx", "KeyboardEvent initialized.");
        this.f67041a = jVar;
        this.f67042b = jVar.mo49032a().getResources().getDisplayMetrics().density;
    }
}

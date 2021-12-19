package com.bytedance.bdturing;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bdturing.C13241a;
import com.bytedance.bdturing.C13270e;
import com.bytedance.bdturing.C13301m;
import com.bytedance.bdturing.p863c.AbstractC13255a;
import com.bytedance.bdturing.p863c.C13256b;
import com.bytedance.bdturing.p863c.C13261c;
import com.bytedance.bdturing.p863c.C13264e;
import com.bytedance.bdturing.p866f.C13284b;
import com.bytedance.bdturing.verify.p867a.AbstractC13322a;
import com.bytedance.bdturing.verify.p867a.C13331j;
import com.bytedance.bdturing.verify.p867a.C13332k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.l */
public class DialogC13293l extends Dialog {

    /* renamed from: a */
    ImageView f32509a;

    /* renamed from: b */
    public VerifyWebView f32510b;

    /* renamed from: c */
    public ViewGroup f32511c;

    /* renamed from: d */
    Context f32512d;

    /* renamed from: e */
    FrameLayout f32513e;

    /* renamed from: f */
    public boolean f32514f = false;

    /* renamed from: g */
    public boolean f32515g = false;

    /* renamed from: h */
    public boolean f32516h = false;

    /* renamed from: i */
    public boolean f32517i = false;

    /* renamed from: j */
    public String f32518j = null;

    /* renamed from: k */
    public AbstractC13248b f32519k;

    /* renamed from: l */
    public DialogInterface.OnDismissListener f32520l;

    /* renamed from: m */
    public C13270e.EnumC13271a f32521m = C13270e.EnumC13271a.CLOSE_REASON_APP;

    /* renamed from: n */
    public int f32522n;

    /* renamed from: o */
    public AbstractC13322a f32523o;

    /* renamed from: p */
    private C13256b f32524p;

    /* renamed from: q */
    private TextView f32525q;

    /* renamed from: r */
    private Button f32526r;

    /* renamed from: s */
    private Button f32527s;

    /* renamed from: t */
    private String f32528t;

    /* renamed from: u */
    private C13287i f32529u = null;

    /* renamed from: v */
    private C13286h f32530v;

    /* renamed from: w */
    private int f32531w;

    /* renamed from: x */
    private AbstractC13255a f32532x = new C13264e() {
        /* class com.bytedance.bdturing.DialogC13293l.C132985 */

        static {
            Covode.recordClassIndex(15260);
        }

        @Override // com.bytedance.bdturing.p863c.C13264e
        /* renamed from: a */
        public final void mo21432a() {
            DialogC13293l.this.mo21457a();
        }

        @Override // com.bytedance.bdturing.p863c.C13264e
        /* renamed from: b */
        public final void mo21437b() {
            JSONObject jSONObject;
            if ((DialogC13293l.this.f32523o instanceof C13332k) && (jSONObject = ((C13332k) DialogC13293l.this.f32523o).f32595g) != null) {
                DialogC13293l.this.mo21458a(C13261c.m23830a("bytedcert.verifyData", "call", jSONObject, "bytedcert.verifyData"));
            }
        }

        @Override // com.bytedance.bdturing.p863c.C13264e
        /* renamed from: a */
        public final void mo21435a(C13261c cVar) {
            JSONObject jSONObject;
            C13252c cVar2 = C13241a.C13243a.f32360a.f32353a;
            int i = DialogC13293l.this.f32522n;
            if (i == 1) {
                jSONObject = cVar2.f32392s;
            } else if (i != 3) {
                jSONObject = cVar2.f32393t;
            } else {
                jSONObject = cVar2.f32391r;
            }
            cVar.mo21430a(1, jSONObject);
        }

        @Override // com.bytedance.bdturing.p863c.C13264e
        /* renamed from: a */
        public final void mo21436a(String str, AbstractC13248b bVar) {
            C13331j jVar = new C13331j(str, (byte) 0);
            jVar.f32581e = false;
            jVar.f32580d = false;
            DialogC13293l.this.f32520l.onDismiss(DialogC13293l.this);
            C13241a.C13243a.f32360a.mo21396a(DialogC13293l.this.f32523o.f32577a, jVar, bVar);
        }

        @Override // com.bytedance.bdturing.p863c.C13264e
        /* renamed from: a */
        public final void mo21433a(int i, int i2) {
            DialogC13293l lVar = DialogC13293l.this;
            C13285g.m23905d("changeDialog width = " + i + ", height = " + i2);
            if (!lVar.f32516h && lVar.isShowing()) {
                if (lVar.f32523o.mo21494a()) {
                    i = -1;
                    i2 = -1;
                } else if (i > 0 && i2 > 0) {
                    float a = C13284b.m23892a(lVar.f32512d);
                    i = Math.round(((float) i) * a);
                    i2 = Math.round(a * ((float) i2));
                }
                ViewGroup.LayoutParams layoutParams = lVar.f32510b.getLayoutParams();
                if (!lVar.f32517i || layoutParams.width <= 0 || layoutParams.height <= 0) {
                    lVar.f32510b.post(new Runnable(layoutParams, i, i2) {
                        /* class com.bytedance.bdturing.DialogC13293l.RunnableC132952 */

                        /* renamed from: a */
                        final /* synthetic */ ViewGroup.LayoutParams f32536a;

                        /* renamed from: b */
                        final /* synthetic */ int f32537b;

                        /* renamed from: c */
                        final /* synthetic */ int f32538c;

                        static {
                            Covode.recordClassIndex(15257);
                        }

                        public final void run() {
                            if (!DialogC13293l.this.f32516h) {
                                DialogC13293l lVar = DialogC13293l.this;
                                if (lVar.f32523o.f32581e) {
                                    lVar.f32509a.clearAnimation();
                                    lVar.f32509a.setVisibility(8);
                                }
                                if (lVar.f32523o.f32580d) {
                                    lVar.f32513e.setBackgroundColor(-2013265920);
                                }
                                this.f32536a.width = this.f32537b;
                                this.f32536a.height = this.f32538c;
                                DialogC13293l.this.f32510b.setLayoutParams(this.f32536a);
                                DialogC13293l.this.f32510b.setVisibility(0);
                            }
                        }

                        {
                            this.f32536a = r2;
                            this.f32537b = r3;
                            this.f32538c = r4;
                        }
                    });
                    return;
                }
                VerifyWebView verifyWebView = lVar.f32510b;
                int i3 = layoutParams.width;
                int i4 = layoutParams.height;
                ValueAnimator ofObject = ValueAnimator.ofObject(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0066: INVOKE  (r2v2 'ofObject' android.animation.ValueAnimator) = 
                      (wrap: com.bytedance.bdturing.VerifyWebView$1 : 0x004e: CONSTRUCTOR  (r6v0 com.bytedance.bdturing.VerifyWebView$1) = (r8v0 'verifyWebView' com.bytedance.bdturing.VerifyWebView) call: com.bytedance.bdturing.VerifyWebView.1.<init>(com.bytedance.bdturing.VerifyWebView):void type: CONSTRUCTOR)
                      (wrap: java.lang.Object[] : ?: FILLED_NEW_ARRAY  (r2v1 java.lang.Object[]) = 
                      (wrap: int[] : ?: FILLED_NEW_ARRAY  (r0v18 int[]) = (r1v6 'i3' int), (r7v0 'i4' int) elemType: int)
                      (wrap: int[] : ?: FILLED_NEW_ARRAY  (r0v19 int[]) = (r10v2 'i' int), (r11v2 'i2' int) elemType: int)
                     elemType: java.lang.Object)
                     type: STATIC call: android.animation.ValueAnimator.ofObject(android.animation.TypeEvaluator, java.lang.Object[]):android.animation.ValueAnimator in method: com.bytedance.bdturing.l.5.a(int, int):void, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004e: CONSTRUCTOR  (r6v0 com.bytedance.bdturing.VerifyWebView$1) = (r8v0 'verifyWebView' com.bytedance.bdturing.VerifyWebView) call: com.bytedance.bdturing.VerifyWebView.1.<init>(com.bytedance.bdturing.VerifyWebView):void type: CONSTRUCTOR in method: com.bytedance.bdturing.l.5.a(int, int):void, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 25 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.bdturing.VerifyWebView, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 31 more
                    */
                /*
                // Method dump skipped, instructions count: 160
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.DialogC13293l.C132985.mo21433a(int, int):void");
            }

            @Override // com.bytedance.bdturing.p863c.C13264e
            /* renamed from: a */
            public final void mo21434a(int i, String str, String str2) {
                boolean z;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", System.currentTimeMillis() - C13270e.f32453a);
                    jSONObject.put("result", i);
                    jSONObject.put("key", "result");
                    C13270e.m23849a("turing_verify_sdk", jSONObject);
                } catch (JSONException e) {
                    C13285g.m23900a(e);
                }
                if (DialogC13293l.this.f32519k != null) {
                    if (z) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("token", str);
                            jSONObject2.put("mobile", str2);
                        } catch (JSONException e2) {
                            C13285g.m23900a(e2);
                        }
                        DialogC13293l.this.f32519k.mo21412b(i);
                    } else {
                        DialogC13293l.this.f32519k.mo21411a(i);
                    }
                    DialogC13293l.this.f32519k = null;
                }
                DialogC13293l.this.f32515g = true;
                DialogC13293l.this.dismiss();
            }
        };

        /* renamed from: y */
        private AbstractC13304n f32533y = new AbstractC13304n() {
            /* class com.bytedance.bdturing.DialogC13293l.C132996 */

            static {
                Covode.recordClassIndex(15261);
            }

            @Override // com.bytedance.bdturing.AbstractC13304n
            /* renamed from: a */
            public final void mo21467a() {
                DialogC13293l.this.f32514f = true;
                C13270e.m23848a(0, "success");
            }

            @Override // com.bytedance.bdturing.AbstractC13304n
            /* renamed from: a */
            public final void mo21468a(int i, String str) {
                DialogC13293l.this.f32514f = false;
                if (!DialogC13293l.this.f32516h) {
                    DialogC13293l.this.f32518j = "Service error" + i + ", Please feed back to us";
                }
                C13270e.m23848a(i, str);
            }
        };

        /* renamed from: z */
        private ComponentCallbacks f32534z = new ComponentCallbacks() {
            /* class com.bytedance.bdturing.DialogC13293l.ComponentCallbacksC133007 */

            static {
                Covode.recordClassIndex(15262);
            }

            public final void onLowMemory() {
            }

            public final void onConfigurationChanged(Configuration configuration) {
                int i;
                boolean z;
                if (configuration.orientation == 1 || configuration.orientation == 2) {
                    if (configuration.orientation == 1) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    if (DialogC13293l.this.f32523o.mo21495b() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C13285g.m23905d("canOrientation: ".concat(String.valueOf(z)));
                    if (z) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("orientation", i);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        String a = C13261c.m23830a("bytedcert.orientation_changing", "call", jSONObject, "bytedcert.orientation_changing");
                        DialogC13293l.this.f32517i = true;
                        DialogC13293l.this.mo21458a(a);
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("result", i);
                            jSONObject2.put("key", "orientation_change");
                            C13270e.m23849a("turing_verify_sdk", jSONObject2);
                        } catch (JSONException e2) {
                            C13285g.m23900a(e2);
                        }
                    }
                }
            }
        };

        static {
            Covode.recordClassIndex(15255);
        }

        /* renamed from: a */
        public final synchronized void mo21457a() {
            MethodCollector.m26663i(3769);
            C13285g.m23901a("clearResource()");
            if (this.f32512d == null && this.f32524p == null) {
                MethodCollector.m26664o(3769);
                return;
            }
            this.f32512d = null;
            C13256b bVar = this.f32524p;
            if (bVar.f32421a != null) {
                bVar.f32422b.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0028: INVOKE  
                      (wrap: android.os.Handler : 0x0021: IGET  (r1v0 android.os.Handler) = (r2v0 'bVar' com.bytedance.bdturing.c.b) com.bytedance.bdturing.c.b.b android.os.Handler)
                      (wrap: com.bytedance.bdturing.c.b$2 : 0x0025: CONSTRUCTOR  (r0v4 com.bytedance.bdturing.c.b$2) = (r2v0 'bVar' com.bytedance.bdturing.c.b) call: com.bytedance.bdturing.c.b.2.<init>(com.bytedance.bdturing.c.b):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.bytedance.bdturing.l.a():void, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0025: CONSTRUCTOR  (r0v4 com.bytedance.bdturing.c.b$2) = (r2v0 'bVar' com.bytedance.bdturing.c.b) call: com.bytedance.bdturing.c.b.2.<init>(com.bytedance.bdturing.c.b):void type: CONSTRUCTOR in method: com.bytedance.bdturing.l.a():void, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 27 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.bdturing.c.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 33 more
                    */
                /*
                    this = this;
                    monitor-enter(r5)
                    r4 = 3769(0xeb9, float:5.281E-42)
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)     // Catch:{ all -> 0x0036 }
                    java.lang.String r0 = "clearResource()"
                    com.bytedance.bdturing.C13285g.m23901a(r0)     // Catch:{ all -> 0x0036 }
                    android.content.Context r0 = r5.f32512d     // Catch:{ all -> 0x0036 }
                    if (r0 != 0) goto L_0x0018
                    com.bytedance.bdturing.c.b r0 = r5.f32524p     // Catch:{ all -> 0x0036 }
                    if (r0 != 0) goto L_0x0018
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)     // Catch:{ all -> 0x0036 }
                    monitor-exit(r5)
                    return
                L_0x0018:
                    r3 = 0
                    r5.f32512d = r3
                    com.bytedance.bdturing.c.b r2 = r5.f32524p
                    android.webkit.WebView r0 = r2.f32421a
                    if (r0 == 0) goto L_0x002f
                    android.os.Handler r1 = r2.f32422b
                    com.bytedance.bdturing.c.b$2 r0 = new com.bytedance.bdturing.c.b$2
                    r0.<init>()
                    r1.post(r0)
                    r2.f32422b = r3
                    r2.f32421a = r3
                L_0x002f:
                    r5.f32524p = r3
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                    monitor-exit(r5)
                    return
                L_0x0036:
                    r0 = move-exception
                    monitor-exit(r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.DialogC13293l.mo21457a():void");
            }

            public void dismiss() {
                if (this.f32510b != null) {
                    getWindow().getDecorView().post(new Runnable() {
                        /* class com.bytedance.bdturing.DialogC13293l.RunnableC132963 */

                        /* renamed from: b */
                        private WebView f32541b;

                        static {
                            Covode.recordClassIndex(15258);
                        }

                        public final void run() {
                            MethodCollector.m26663i(127);
                            C13285g.m23903b("remove webview");
                            WebView webView = this.f32541b;
                            if (webView == null) {
                                MethodCollector.m26664o(127);
                                return;
                            }
                            ViewParent parent = webView.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(this.f32541b);
                            }
                            MethodCollector.m26664o(127);
                        }

                        {
                            this.f32541b = DialogC13293l.this.f32510b;
                        }
                    });
                    this.f32510b = null;
                }
                if (!this.f32516h) {
                    this.f32516h = true;
                    super.dismiss();
                    if (this.f32523o.f32577a != null) {
                        this.f32523o.f32577a.unregisterComponentCallbacks(this.f32534z);
                    }
                    C13286h hVar = this.f32530v;
                    if (hVar != null) {
                        if (hVar.f32488a != null) {
                            hVar.f32488a.getApplication().unregisterActivityLifecycleCallbacks(hVar);
                        }
                        this.f32530v = null;
                    }
                    DialogInterface.OnDismissListener onDismissListener = this.f32520l;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(this);
                    }
                    C13301m mVar = C13301m.C13302a.f32548a;
                    if (mVar.f32547b != null) {
                        mVar.f32547b.sendMessageDelayed(mVar.f32547b.obtainMessage(1, this), 10000);
                    }
                    AbstractC13248b bVar = this.f32519k;
                    if (bVar != null && !this.f32514f) {
                        bVar.mo21411a(3);
                        this.f32519k = null;
                    }
                    if (!this.f32515g) {
                        String name = this.f32521m.getName();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("style", name);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        mo21458a(C13261c.m23830a("bytedcert.goToClose", "call", jSONObject, "bytedcert.goToClose"));
                    }
                    if (!this.f32514f) {
                        C13270e.EnumC13271a aVar = this.f32521m;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("duration", System.currentTimeMillis() - C13270e.f32453a);
                            jSONObject2.put("result", aVar.getName());
                            jSONObject2.put("key", "close");
                            C13270e.m23849a("turing_verify_sdk", jSONObject2);
                        } catch (JSONException e2) {
                            C13285g.m23900a(e2);
                        }
                        mo21457a();
                    }
                    C13301m.C13302a.f32548a.mo21471a(3, null);
                }
            }

            public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
                this.f32520l = onDismissListener;
            }

            /* renamed from: a */
            public final boolean mo21458a(String str) {
                C13256b bVar = this.f32524p;
                if (bVar == null) {
                    C13285g.m23904c("(mJsBridge == null) ");
                    return false;
                }
                bVar.mo21423a(str);
                return true;
            }

            public boolean onTouchEvent(MotionEvent motionEvent) {
                this.f32529u.mo21455a(motionEvent);
                if (this.f32523o.f32579c) {
                    if (this.f32511c.getVisibility() == 0) {
                        this.f32521m = C13270e.EnumC13271a.CLOSE_FB_MASK;
                    } else {
                        this.f32521m = C13270e.EnumC13271a.CLOSE_REASON_MASK;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }

            /* access modifiers changed from: protected */
            public void onCreate(Bundle bundle) {
                MethodCollector.m26663i(3634);
                super.onCreate(bundle);
                setContentView(LayoutInflater.from(this.f32512d).inflate(R.layout.air, (ViewGroup) null));
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                getWindow().setAttributes(attributes);
                this.f32511c = (ViewGroup) findViewById(R.id.ff8);
                this.f32525q = (TextView) findViewById(R.id.ega);
                this.f32526r = (Button) findViewById(R.id.xk);
                this.f32527s = (Button) findViewById(R.id.xl);
                this.f32509a = (ImageView) findViewById(R.id.cfa);
                this.f32510b = (VerifyWebView) findViewById(R.id.fbg);
                this.f32513e = (FrameLayout) findViewById(R.id.akr);
                View$OnClickListenerC132941 r1 = new View.OnClickListener() {
                    /* class com.bytedance.bdturing.DialogC13293l.View$OnClickListenerC132941 */

                    static {
                        Covode.recordClassIndex(15256);
                    }

                    public final void onClick(View view) {
                        int id = view.getId();
                        if (id == R.id.xl) {
                            DialogC13293l.this.f32521m = C13270e.EnumC13271a.CLOSE_FB_CLOSE;
                        } else if (id == R.id.xk) {
                            DialogC13293l.this.f32521m = C13270e.EnumC13271a.CLOSE_FB_FEEDBACK;
                        }
                        DialogC13293l.this.dismiss();
                    }
                };
                this.f32526r.setOnClickListener(r1);
                this.f32527s.setOnClickListener(r1);
                this.f32510b.mo21379a(this.f32533y);
                C13287i iVar = new C13287i(this.f32523o.mo21497d());
                this.f32529u = iVar;
                this.f32510b.setOnTouchListener(iVar);
                if (this.f32523o.f32581e) {
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(1000);
                    rotateAnimation.setRepeatCount(-1);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    this.f32509a.startAnimation(rotateAnimation);
                    this.f32513e.setBackgroundColor(-2013265920);
                } else {
                    this.f32509a.setVisibility(8);
                }
                if (this.f32523o.f32577a != null) {
                    this.f32523o.f32577a.registerComponentCallbacks(this.f32534z);
                }
                C13286h hVar = this.f32530v;
                if (hVar.f32488a != null) {
                    hVar.f32488a.getApplication().registerActivityLifecycleCallbacks(hVar);
                }
                setCanceledOnTouchOutside(this.f32523o.f32579c);
                setCancelable(true);
                this.f32524p = new C13256b(this.f32532x, this.f32510b);
                C13285g.m23901a("loadUrl = " + this.f32528t);
                VerifyWebView verifyWebView = this.f32510b;
                String str = this.f32528t;
                String a = C84357h.f188595a.mo129370a(verifyWebView, str);
                if (!TextUtils.isEmpty(a)) {
                    str = a;
                }
                verifyWebView.loadUrl(str);
                if (this.f32523o.mo21494a()) {
                    DisplayMetrics displayMetrics = this.f32512d.getResources().getDisplayMetrics();
                    ViewGroup.LayoutParams layoutParams = this.f32510b.getLayoutParams();
                    layoutParams.width = displayMetrics.widthPixels;
                    layoutParams.height = displayMetrics.heightPixels;
                    this.f32510b.setLayoutParams(layoutParams);
                    this.f32510b.setVisibility(0);
                }
                MethodCollector.m26664o(3634);
            }

            public DialogC13293l(AbstractC13322a aVar, AbstractC13248b bVar) {
                super(aVar.f32577a, R.style.ot);
                this.f32523o = aVar;
                this.f32522n = aVar.mo21495b();
                this.f32528t = this.f32523o.mo21498e();
                this.f32519k = bVar;
                this.f32531w = C13284b.m23893a(this.f32523o.f32577a);
                this.f32530v = new C13286h(this.f32523o.f32577a);
                this.f32512d = aVar.f32577a;
                setOnKeyListener(new DialogInterface.OnKeyListener() {
                    /* class com.bytedance.bdturing.DialogC13293l.DialogInterface$OnKeyListenerC132974 */

                    static {
                        Covode.recordClassIndex(15259);
                    }

                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        int keyCode = keyEvent.getKeyCode();
                        int action = keyEvent.getAction();
                        if (keyCode != 4 || action != 1) {
                            return false;
                        }
                        if (DialogC13293l.this.f32511c.getVisibility() == 0) {
                            DialogC13293l.this.f32521m = C13270e.EnumC13271a.CLOSE_FB_SYSTEM;
                            return false;
                        } else if (DialogC13293l.this.f32510b == null || !DialogC13293l.this.f32510b.canGoBack()) {
                            DialogC13293l.this.f32521m = C13270e.EnumC13271a.CLOSE_REASON_BACK;
                            return false;
                        } else {
                            DialogC13293l.this.f32510b.goBack();
                            return true;
                        }
                    }
                });
            }
        }

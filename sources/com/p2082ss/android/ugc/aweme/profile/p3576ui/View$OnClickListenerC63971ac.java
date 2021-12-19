package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ac */
final /* synthetic */ class View$OnClickListenerC63971ac implements View.OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f145079a;

    /* renamed from: b */
    private final String f145080b;

    /* renamed from: c */
    private final String f145081c;

    static {
        Covode.recordClassIndex(75415);
    }

    View$OnClickListenerC63971ac(EnterpriseTransformLayout enterpriseTransformLayout, String str, String str2) {
        this.f145079a = enterpriseTransformLayout;
        this.f145080b = str;
        this.f145081c = str2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f145079a;
        String str = this.f145080b;
        String str2 = this.f145081c;
        Uri parse = Uri.parse(str);
        if (!C38000g.m77059j().mo67243a(parse) || !C38000g.m77059j().mo67241a(enterpriseTransformLayout.getContext()) || !C38000g.m77059j().mo67242a(enterpriseTransformLayout.getContext(), parse)) {
            enterpriseTransformLayout.f144955l = false;
            SmartRouter.buildRoute(enterpriseTransformLayout.f144952i, "aweme://webview/").withCallback(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: INVOKE  
                  (wrap: com.bytedance.router.SmartRoute : 0x0050: INVOKE  (r0v23 com.bytedance.router.SmartRoute) = 
                  (wrap: com.bytedance.router.SmartRoute : 0x0049: INVOKE  (r2v4 com.bytedance.router.SmartRoute) = 
                  (wrap: com.bytedance.router.SmartRoute : 0x0043: INVOKE  (r1v7 com.bytedance.router.SmartRoute) = 
                  (wrap: com.bytedance.router.SmartRoute : 0x003a: INVOKE  (r1v6 com.bytedance.router.SmartRoute) = 
                  (wrap: android.app.Activity : 0x0036: IGET  (r1v5 android.app.Activity) = (r5v0 'enterpriseTransformLayout' com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout) com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout.i android.app.Activity)
                  ("aweme://webview/")
                 type: STATIC call: com.bytedance.router.SmartRouter.buildRoute(android.content.Context, java.lang.String):com.bytedance.router.SmartRoute)
                  (wrap: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$1 : 0x0040: CONSTRUCTOR  (r0v20 com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$1) = (r5v0 'enterpriseTransformLayout' com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout) call: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout.1.<init>(com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.router.SmartRoute.withCallback(com.bytedance.router.OpenResultCallback):com.bytedance.router.SmartRoute)
                  ("url")
                  (r6v0 'str' java.lang.String)
                 type: VIRTUAL call: com.bytedance.router.SmartRoute.withParam(java.lang.String, java.lang.String):com.bytedance.router.SmartRoute)
                  ("use_webview_title")
                  true
                 type: VIRTUAL call: com.bytedance.router.SmartRoute.withParam(java.lang.String, boolean):com.bytedance.router.SmartRoute)
                 type: VIRTUAL call: com.bytedance.router.SmartRoute.open():void in method: com.ss.android.ugc.aweme.profile.ui.ac.onClick(android.view.View):void, file: classes3.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: INVOKE  (r0v23 com.bytedance.router.SmartRoute) = 
                  (wrap: com.bytedance.router.SmartRoute : 0x0049: INVOKE  (r2v4 com.bytedance.router.SmartRoute) = 
                  (wrap: com.bytedance.router.SmartRoute : 0x0043: INVOKE  (r1v7 com.bytedance.router.SmartRoute) = 
                  (wrap: com.bytedance.router.SmartRoute : 0x003a: INVOKE  (r1v6 com.bytedance.router.SmartRoute) = 
                  (wrap: android.app.Activity : 0x0036: IGET  (r1v5 android.app.Activity) = (r5v0 'enterpriseTransformLayout' com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout) com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout.i android.app.Activity)
                  ("aweme://webview/")
                 type: STATIC call: com.bytedance.router.SmartRouter.buildRoute(android.content.Context, java.lang.String):com.bytedance.router.SmartRoute)
                  (wrap: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$1 : 0x0040: CONSTRUCTOR  (r0v20 com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$1) = (r5v0 'enterpriseTransformLayout' com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout) call: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout.1.<init>(com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.router.SmartRoute.withCallback(com.bytedance.router.OpenResultCallback):com.bytedance.router.SmartRoute)
                  ("url")
                  (r6v0 'str' java.lang.String)
                 type: VIRTUAL call: com.bytedance.router.SmartRoute.withParam(java.lang.String, java.lang.String):com.bytedance.router.SmartRoute)
                  ("use_webview_title")
                  true
                 type: VIRTUAL call: com.bytedance.router.SmartRoute.withParam(java.lang.String, boolean):com.bytedance.router.SmartRoute in method: com.ss.android.ugc.aweme.profile.ui.ac.onClick(android.view.View):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: INVOKE  (r2v4 com.bytedance.router.SmartRoute) = 
                  (wrap: com.bytedance.router.SmartRoute : 0x0043: INVOKE  (r1v7 com.bytedance.router.SmartRoute) = 
                  (wrap: com.bytedance.router.SmartRoute : 0x003a: INVOKE  (r1v6 com.bytedance.router.SmartRoute) = 
                  (wrap: android.app.Activity : 0x0036: IGET  (r1v5 android.app.Activity) = (r5v0 'enterpriseTransformLayout' com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout) com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout.i android.app.Activity)
                  ("aweme://webview/")
                 type: STATIC call: com.bytedance.router.SmartRouter.buildRoute(android.content.Context, java.lang.String):com.bytedance.router.SmartRoute)
                  (wrap: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$1 : 0x0040: CONSTRUCTOR  (r0v20 com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$1) = (r5v0 'enterpriseTransformLayout' com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout) call: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout.1.<init>(com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.router.SmartRoute.withCallback(com.bytedance.router.OpenResultCallback):com.bytedance.router.SmartRoute)
                  ("url")
                  (r6v0 'str' java.lang.String)
                 type: VIRTUAL call: com.bytedance.router.SmartRoute.withParam(java.lang.String, java.lang.String):com.bytedance.router.SmartRoute in method: com.ss.android.ugc.aweme.profile.ui.ac.onClick(android.view.View):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: INVOKE  (r1v7 com.bytedance.router.SmartRoute) = 
                  (wrap: com.bytedance.router.SmartRoute : 0x003a: INVOKE  (r1v6 com.bytedance.router.SmartRoute) = 
                  (wrap: android.app.Activity : 0x0036: IGET  (r1v5 android.app.Activity) = (r5v0 'enterpriseTransformLayout' com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout) com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout.i android.app.Activity)
                  ("aweme://webview/")
                 type: STATIC call: com.bytedance.router.SmartRouter.buildRoute(android.content.Context, java.lang.String):com.bytedance.router.SmartRoute)
                  (wrap: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$1 : 0x0040: CONSTRUCTOR  (r0v20 com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$1) = (r5v0 'enterpriseTransformLayout' com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout) call: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout.1.<init>(com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.router.SmartRoute.withCallback(com.bytedance.router.OpenResultCallback):com.bytedance.router.SmartRoute in method: com.ss.android.ugc.aweme.profile.ui.ac.onClick(android.view.View):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 31 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR  (r0v20 com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$1) = (r5v0 'enterpriseTransformLayout' com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout) call: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout.1.<init>(com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.profile.ui.ac.onClick(android.view.View):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 37 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 43 more
                */
            /*
            // Method dump skipped, instructions count: 177
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.View$OnClickListenerC63971ac.onClick(android.view.View):void");
        }
    }

package com.p2082ss.android.ugc.aweme.shortvideo.festival;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80232az;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.d */
final /* synthetic */ class View$OnClickListenerC71838d implements View.OnClickListener {

    /* renamed from: a */
    private final ImageView f160993a;

    /* renamed from: b */
    private final ViewGroup f160994b;

    /* renamed from: c */
    private final TextView f160995c;

    /* renamed from: d */
    private final int f160996d;

    /* renamed from: e */
    private final int f160997e;

    /* renamed from: f */
    private final SpannableString f160998f;

    /* renamed from: g */
    private final SpannableString f160999g;

    /* renamed from: h */
    private final TextView f161000h;

    static {
        Covode.recordClassIndex(84387);
    }

    View$OnClickListenerC71838d(ImageView imageView, ViewGroup viewGroup, TextView textView, int i, int i2, SpannableString spannableString, SpannableString spannableString2, TextView textView2) {
        this.f160993a = imageView;
        this.f160994b = viewGroup;
        this.f160995c = textView;
        this.f160996d = i;
        this.f160997e = i2;
        this.f160998f = spannableString;
        this.f160999g = spannableString2;
        this.f161000h = textView2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ImageView imageView = this.f160993a;
        ViewGroup viewGroup = this.f160994b;
        TextView textView = this.f160995c;
        int i = this.f160996d;
        int i2 = this.f160997e;
        SpannableString spannableString = this.f160998f;
        SpannableString spannableString2 = this.f160999g;
        TextView textView2 = this.f161000h;
        boolean isSelected = imageView.isSelected();
        C80232az.m139069a(viewGroup, imageView, textView, i, i2, isSelected, false, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: INVOKE  
              (r3v0 'viewGroup' android.view.ViewGroup)
              (r4v0 'imageView' android.widget.ImageView)
              (r5v0 'textView' android.widget.TextView)
              (r6v0 'i' int)
              (r7v0 'i2' int)
              (r8v0 'isSelected' boolean)
              false
              (wrap: com.ss.android.ugc.aweme.shortvideo.festival.a$1 : 0x0019: CONSTRUCTOR  (r10v0 com.ss.android.ugc.aweme.shortvideo.festival.a$1) = 
              (r8v0 'isSelected' boolean)
              (r5v0 'textView' android.widget.TextView)
              (r1v0 'spannableString' android.text.SpannableString)
             call: com.ss.android.ugc.aweme.shortvideo.festival.a.1.<init>(boolean, android.widget.TextView, android.text.SpannableString):void type: CONSTRUCTOR)
             type: STATIC call: com.ss.android.ugc.aweme.utils.az.a(android.view.ViewGroup, android.widget.ImageView, android.widget.TextView, int, int, boolean, boolean, android.animation.AnimatorListenerAdapter):void in method: com.ss.android.ugc.aweme.shortvideo.festival.d.onClick(android.view.View):void, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0019: CONSTRUCTOR  (r10v0 com.ss.android.ugc.aweme.shortvideo.festival.a$1) = 
              (r8v0 'isSelected' boolean)
              (r5v0 'textView' android.widget.TextView)
              (r1v0 'spannableString' android.text.SpannableString)
             call: com.ss.android.ugc.aweme.shortvideo.festival.a.1.<init>(boolean, android.widget.TextView, android.text.SpannableString):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.festival.d.onClick(android.view.View):void, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.festival.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r12)
            android.widget.ImageView r4 = r11.f160993a
            android.view.ViewGroup r3 = r11.f160994b
            android.widget.TextView r5 = r11.f160995c
            int r6 = r11.f160996d
            int r7 = r11.f160997e
            android.text.SpannableString r1 = r11.f160998f
            android.text.SpannableString r0 = r11.f160999g
            android.widget.TextView r2 = r11.f161000h
            boolean r8 = r4.isSelected()
            com.ss.android.ugc.aweme.shortvideo.festival.a$1 r10 = new com.ss.android.ugc.aweme.shortvideo.festival.a$1
            r10.<init>(r8, r5, r1)
            r9 = 0
            com.p2082ss.android.ugc.aweme.utils.C80232az.m139069a(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r8 == 0) goto L_0x0025
            r5.setText(r0)
        L_0x0025:
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r1 = r0.getResources()
            if (r8 == 0) goto L_0x003f
            r0 = 2131824265(0x7f110e89, float:1.9281353E38)
        L_0x0032:
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            r0 = r8 ^ 1
            r4.setSelected(r0)
            return
        L_0x003f:
            r0 = 2131823985(0x7f110d71, float:1.9280785E38)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.festival.View$OnClickListenerC71838d.onClick(android.view.View):void");
    }
}

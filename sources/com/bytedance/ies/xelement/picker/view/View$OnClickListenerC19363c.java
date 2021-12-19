package com.bytedance.ies.xelement.picker.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.picker.p1386c.C19333a;
import com.bytedance.ies.xelement.picker.p1386c.C19334b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ies.xelement.picker.view.c */
public final class View$OnClickListenerC19363c extends AbstractC19354a implements View.OnClickListener {

    /* renamed from: j */
    private C19370f f45835j;

    /* renamed from: k */
    private C19334b f45836k;

    static {
        Covode.recordClassIndex(22152);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.picker.view.AbstractC19354a
    /* renamed from: a */
    public final C19333a mo30848a() {
        return this.f45836k;
    }

    @Override // com.bytedance.ies.xelement.picker.view.AbstractC19354a
    /* renamed from: h */
    public final boolean mo30857h() {
        return this.f45836k.f45715w;
    }

    public final void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            if (this.f45836k.f45720E != null) {
                this.f45836k.f45720E.mo30774a(new ArrayList(this.f45835j.f45862d));
            }
            this.f45818i = true;
        } else if (str.equals("cancel")) {
            if (this.f45836k.f45693a != null) {
                this.f45836k.f45693a.mo30773a();
            }
            this.f45818i = true;
        }
        mo30854e();
    }

    public View$OnClickListenerC19363c(C19334b bVar) {
        super(bVar.f45698f);
        String str;
        String str2;
        String str3;
        MethodCollector.m26663i(9775);
        this.f45836k = bVar;
        Context context = bVar.f45698f;
        mo30856g();
        mo30851b();
        mo30852c();
        if (this.f45836k.f45694b == null) {
            LayoutInflater.from(context).inflate(this.f45836k.f45695c, this.f45810a);
            TextView textView = (TextView) mo30847a(R.id.ers);
            RelativeLayout relativeLayout = (RelativeLayout) mo30847a(R.id.dom);
            Button button = (Button) mo30847a(R.id.ws);
            Button button2 = (Button) mo30847a(R.id.wq);
            button.setTag("submit");
            button2.setTag("cancel");
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            Map<String, String> a = this.f45836k.f45727L.mo16277a();
            if (TextUtils.isEmpty(this.f45836k.f45699g)) {
                str = a.get("confirm");
            } else {
                str = this.f45836k.f45699g;
            }
            button.setText(str);
            if (TextUtils.isEmpty(this.f45836k.f45700h)) {
                str2 = a.get("cancel");
            } else {
                str2 = this.f45836k.f45700h;
            }
            button2.setText(str2);
            if (TextUtils.isEmpty(this.f45836k.f45701i)) {
                str3 = "";
            } else {
                str3 = this.f45836k.f45701i;
            }
            textView.setText(str3);
            button.setTextColor(this.f45836k.f45702j);
            button2.setTextColor(this.f45836k.f45703k);
            textView.setTextColor(this.f45836k.f45704l);
            relativeLayout.setBackgroundColor(this.f45836k.f45706n);
            button.setTextSize((float) this.f45836k.f45707o);
            button2.setTextSize((float) this.f45836k.f45707o);
            textView.setTextSize((float) this.f45836k.f45708p);
        } else {
            LayoutInflater.from(context).inflate(this.f45836k.f45695c, this.f45810a);
        }
        LinearLayout linearLayout = (LinearLayout) mo30847a(R.id.cx8);
        linearLayout.setBackgroundColor(this.f45836k.f45705m);
        C19370f fVar = new C19370f(linearLayout);
        this.f45835j = fVar;
        fVar.f45864f = this.f45836k;
        if (this.f45836k.f45719D != null) {
            this.f45835j.f45863e = this.f45836k.f45719D;
        }
        List<List<String>> list = this.f45836k.f45721F;
        C19370f fVar2 = this.f45835j;
        if (fVar2 != null) {
            if (list == null) {
                fVar2.f45861c = null;
                fVar2.f45860b.clear();
                if (fVar2.f45859a instanceof ViewGroup) {
                    ((ViewGroup) fVar2.f45859a).removeAllViews();
                }
            } else {
                if (fVar2.f45861c == null) {
                    fVar2.f45861c = new ArrayList();
                } else {
                    fVar2.f45861c.clear();
                }
                fVar2.f45861c.addAll(list);
                for (int i = 0; i < list.size(); i++) {
                    List<String> list2 = list.get(i);
                    if (list2 != null) {
                        while (fVar2.f45860b.size() <= i) {
                            WheelView wheelView = new WheelView(fVar2.f45859a.getContext());
                            wheelView.setLocalizeAdapter(fVar2.f45864f.f45727L);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                            layoutParams.weight = 1.0f;
                            wheelView.setLayoutParams(layoutParams);
                            wheelView.setOnItemSelectedListener(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x020a: INVOKE  
                                  (r8v0 'wheelView' com.bytedance.ies.xelement.picker.view.WheelView)
                                  (wrap: com.bytedance.ies.xelement.picker.view.f$1 : 0x0207: CONSTRUCTOR  (r0v67 com.bytedance.ies.xelement.picker.view.f$1) = (r3v0 'fVar2' com.bytedance.ies.xelement.picker.view.f), (r5v1 'i' int) call: com.bytedance.ies.xelement.picker.view.f.1.<init>(com.bytedance.ies.xelement.picker.view.f, int):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: com.bytedance.ies.xelement.picker.view.WheelView.setOnItemSelectedListener(com.bytedance.ies.xelement.picker.e.f):void in method: com.bytedance.ies.xelement.picker.view.c.<init>(com.bytedance.ies.xelement.picker.c.b):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:239)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:210)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0207: CONSTRUCTOR  (r0v67 com.bytedance.ies.xelement.picker.view.f$1) = (r3v0 'fVar2' com.bytedance.ies.xelement.picker.view.f), (r5v1 'i' int) call: com.bytedance.ies.xelement.picker.view.f.1.<init>(com.bytedance.ies.xelement.picker.view.f, int):void type: CONSTRUCTOR in method: com.bytedance.ies.xelement.picker.view.c.<init>(com.bytedance.ies.xelement.picker.c.b):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 41 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.xelement.picker.view.f, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 47 more
                                */
                            /*
                            // Method dump skipped, instructions count: 632
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.picker.view.View$OnClickListenerC19363c.<init>(com.bytedance.ies.xelement.picker.c.b):void");
                        }
                    }

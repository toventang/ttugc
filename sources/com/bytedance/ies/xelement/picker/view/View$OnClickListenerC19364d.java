package com.bytedance.ies.xelement.picker.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.picker.p1384a.C19326b;
import com.bytedance.ies.xelement.picker.p1384a.C19327c;
import com.bytedance.ies.xelement.picker.p1386c.C19333a;
import com.bytedance.ies.xelement.picker.p1386c.C19335c;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19339c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.ies.xelement.picker.view.d */
public final class View$OnClickListenerC19364d extends AbstractC19354a implements View.OnClickListener {

    /* renamed from: j */
    public C19335c f45837j;

    /* renamed from: k */
    private C19372g f45838k;

    static {
        Covode.recordClassIndex(22153);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.picker.view.AbstractC19354a
    /* renamed from: a */
    public final C19333a mo30848a() {
        return this.f45837j;
    }

    @Override // com.bytedance.ies.xelement.picker.view.AbstractC19354a
    /* renamed from: h */
    public final boolean mo30857h() {
        return this.f45837j.f45715w;
    }

    /* renamed from: i */
    public final String mo30868i() {
        String str;
        if (this.f45837j.f45749Y != null) {
            str = this.f45837j.f45749Y;
        } else {
            str = ":";
        }
        boolean[] zArr = this.f45837j.f45731G;
        Calendar calendar = this.f45838k.f45873g;
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        int i3 = calendar.get(13);
        if (zArr == null || zArr.length != 3) {
            return C1764a.m5929a(Locale.getDefault(), "%02d%s%02d%s%02d", new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str, Integer.valueOf(i3)});
        } else if (zArr[2]) {
            return C1764a.m5929a(Locale.getDefault(), "%02d%s%02d%s%02d", new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str, Integer.valueOf(i3)});
        } else if (zArr[1]) {
            return C1764a.m5929a(Locale.getDefault(), "%02d%s%02d", new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2)});
        } else {
            return C1764a.m5929a(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(i)});
        }
    }

    public final void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            if (this.f45837j.f45728D != null) {
                this.f45837j.f45728D.mo30772a(mo30868i());
            }
            this.f45818i = true;
        } else if (str.equals("cancel")) {
            if (this.f45837j.f45693a != null) {
                this.f45837j.f45693a.mo30773a();
            }
            this.f45818i = true;
        }
        mo30854e();
    }

    public View$OnClickListenerC19364d(C19335c cVar) {
        super(cVar.f45698f);
        String str;
        String str2;
        String str3;
        MethodCollector.m26663i(9778);
        this.f45837j = cVar;
        Context context = cVar.f45698f;
        mo30856g();
        mo30851b();
        mo30852c();
        if (this.f45837j.f45694b == null) {
            LayoutInflater.from(context).inflate(R.layout.ajx, this.f45810a);
            TextView textView = (TextView) mo30847a(R.id.ers);
            RelativeLayout relativeLayout = (RelativeLayout) mo30847a(R.id.dom);
            Button button = (Button) mo30847a(R.id.ws);
            Button button2 = (Button) mo30847a(R.id.wq);
            button.setTag("submit");
            button2.setTag("cancel");
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            Map<String, String> a = this.f45837j.f45748X.mo16277a();
            if (TextUtils.isEmpty(this.f45837j.f45699g)) {
                str = a.get("confirm");
            } else {
                str = this.f45837j.f45699g;
            }
            button.setText(str);
            if (TextUtils.isEmpty(this.f45837j.f45700h)) {
                str2 = a.get("cancel");
            } else {
                str2 = this.f45837j.f45700h;
            }
            button2.setText(str2);
            if (TextUtils.isEmpty(this.f45837j.f45701i)) {
                str3 = "";
            } else {
                str3 = this.f45837j.f45701i;
            }
            textView.setText(str3);
            button.setTextColor(this.f45837j.f45702j);
            button2.setTextColor(this.f45837j.f45703k);
            textView.setTextColor(this.f45837j.f45704l);
            relativeLayout.setBackgroundColor(this.f45837j.f45706n);
            button.setTextSize((float) this.f45837j.f45707o);
            button2.setTextSize((float) this.f45837j.f45707o);
            textView.setTextSize((float) this.f45837j.f45708p);
        } else {
            LayoutInflater.from(context).inflate(this.f45837j.f45695c, this.f45810a);
        }
        LinearLayout linearLayout = (LinearLayout) mo30847a(R.id.ei4);
        linearLayout.setBackgroundColor(this.f45837j.f45705m);
        this.f45838k = new C19372g(linearLayout, this.f45837j.f45731G, this.f45837j.f45697e, this.f45837j.f45709q, this.f45837j.f45748X);
        if (this.f45837j.f45729E != null) {
            this.f45838k.f45874h = new AbstractC19339c() {
                /* class com.bytedance.ies.xelement.picker.view.View$OnClickListenerC19364d.C193651 */

                static {
                    Covode.recordClassIndex(22154);
                }

                @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19339c
                /* renamed from: a */
                public final void mo30807a() {
                    View$OnClickListenerC19364d.this.mo30868i();
                }
            };
        }
        Calendar calendar = this.f45837j.f45733I;
        Calendar calendar2 = this.f45837j.f45734J;
        C19372g gVar = this.f45838k;
        calendar = calendar == null ? Calendar.getInstance() : calendar;
        calendar2 = calendar2 == null ? Calendar.getInstance() : calendar2;
        Calendar b = C19372g.m36159b(calendar);
        Calendar b2 = C19372g.m36159b(calendar2);
        if (b.getTimeInMillis() > b2.getTimeInMillis()) {
            b2.add(5, 1);
        }
        gVar.f45868b.setAdapter(new C19327c(b.get(11), b2.get(11)));
        gVar.f45869c.setAdapter(new C19326b(0, 59));
        gVar.f45870d.setAdapter(new C19326b(0, 59));
        gVar.f45871e = b;
        gVar.f45872f = b2;
        gVar.f45868b.setOnItemSelectedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x016b: INVOKE  
              (wrap: com.bytedance.ies.xelement.picker.view.WheelView : 0x0164: IGET  (r1v9 com.bytedance.ies.xelement.picker.view.WheelView) = (r4v1 'gVar' com.bytedance.ies.xelement.picker.view.g) com.bytedance.ies.xelement.picker.view.g.b com.bytedance.ies.xelement.picker.view.WheelView)
              (wrap: com.bytedance.ies.xelement.picker.view.g$1 : 0x0168: CONSTRUCTOR  (r0v23 com.bytedance.ies.xelement.picker.view.g$1) = (r4v1 'gVar' com.bytedance.ies.xelement.picker.view.g) call: com.bytedance.ies.xelement.picker.view.g.1.<init>(com.bytedance.ies.xelement.picker.view.g):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.ies.xelement.picker.view.WheelView.setOnItemSelectedListener(com.bytedance.ies.xelement.picker.e.f):void in method: com.bytedance.ies.xelement.picker.view.d.<init>(com.bytedance.ies.xelement.picker.c.c):void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0168: CONSTRUCTOR  (r0v23 com.bytedance.ies.xelement.picker.view.g$1) = (r4v1 'gVar' com.bytedance.ies.xelement.picker.view.g) call: com.bytedance.ies.xelement.picker.view.g.1.<init>(com.bytedance.ies.xelement.picker.view.g):void type: CONSTRUCTOR in method: com.bytedance.ies.xelement.picker.view.d.<init>(com.bytedance.ies.xelement.picker.c.c):void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 16 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.xelement.picker.view.g, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 22 more
            */
        /*
        // Method dump skipped, instructions count: 709
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.picker.view.View$OnClickListenerC19364d.<init>(com.bytedance.ies.xelement.picker.c.c):void");
    }
}

package com.p2082ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Message;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.aweme.views.TextClickable;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.promote.e */
public class DialogC65233e extends DialogC81459o implements WeakHandler.IHandler, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    String f147171a;

    /* renamed from: b */
    public String f147172b;

    /* renamed from: c */
    TextView f147173c;

    /* renamed from: d */
    TextView f147174d;

    /* renamed from: e */
    TextView f147175e;

    /* renamed from: f */
    View f147176f;

    /* renamed from: g */
    View f147177g;

    /* renamed from: h */
    View f147178h;

    /* renamed from: i */
    public Activity f147179i;

    /* renamed from: j */
    public AbstractC65226a f147180j;

    /* renamed from: k */
    public WeakHandler f147181k;

    /* renamed from: n */
    private String f147182n;

    /* renamed from: o */
    private View f147183o;

    /* renamed from: p */
    private DialogC81438i f147184p;

    static {
        Covode.recordClassIndex(76709);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(165, new RunnableC90250g(DialogC65233e.class, "closeKrCopyright", C65237f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public void dismiss() {
        super.dismiss();
        mo104393a(false);
    }

    public void show() {
        super.show();
        C17197a.m31761a(true, this.f147178h);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus a = EventBus.m156962a();
        if (a.mo145393a(this)) {
            a.mo145395b(this);
        }
    }

    @AbstractC90264r
    public void closeKrCopyright(C65237f fVar) {
        dismiss();
    }

    /* renamed from: a */
    public final void mo104393a(boolean z) {
        if (z) {
            if (this.f147184p == null) {
                this.f147184p = new DialogC81438i(this.f147179i);
            }
            this.f147184p.show();
            return;
        }
        DialogC81438i iVar = this.f147184p;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        mo104393a(false);
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof C34485a) {
            new C23144b(this.f147179i).mo37635a(((C34485a) obj).getErrorMsg()).mo37637b();
        } else if (obj instanceof Exception) {
            new C23144b(this.f147179i).mo37635a(getContext().getResources().getString(R.string.dcr)).mo37637b();
        } else if ((obj instanceof PromoteProgramResponse) && i == 1 && ((PromoteProgramResponse) obj).isConfirmedSuccess()) {
            dismiss();
            SharedPreferences.Editor edit = C65238g.m116896a().edit();
            edit.putBoolean("joined", true);
            edit.apply();
        }
    }

    public DialogC65233e(Activity activity, String str) {
        super(activity, R.style.zn, false, true, true);
        MethodCollector.m26663i(7598);
        this.f147179i = activity;
        this.f147182n = str;
        setCancelable(false);
        EventBus a = EventBus.m156962a();
        if (!a.mo145393a(this)) {
            EventBus.m156966a(a, this);
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.xh, (ViewGroup) null);
        this.f147183o = inflate;
        setContentView(inflate);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = C17197a.f40977h;
        window.addFlags(2);
        window.setAttributes(attributes);
        window.setWindowAnimations(0);
        attributes.width = (int) C13628n.m24520b(getContext(), 280.0f);
        this.f147171a = this.f147183o.getContext().getString(R.string.exc);
        this.f147173c = (TextView) this.f147183o.findViewById(R.id.f63);
        this.f147174d = (TextView) this.f147183o.findViewById(R.id.ezl);
        this.f147175e = (TextView) this.f147183o.findViewById(R.id.f1o);
        this.f147176f = this.f147183o.findViewById(R.id.y1);
        this.f147177g = this.f147183o.findViewById(R.id.ye);
        this.f147178h = this.f147183o.findViewById(R.id.dnb);
        this.f147180j = new C65240h();
        String c = SharePrefCache.inst().getPromoteDialogPopupPopupUrl().mo59941c();
        this.f147172b = TextUtils.isEmpty(c) ? "" : c;
        String c2 = SharePrefCache.inst().getPromoteDialogPopupPopupLinkText().mo59941c();
        this.f147171a = TextUtils.isEmpty(c2) ? this.f147171a : c2;
        this.f147181k = new WeakHandler(this);
        final Integer c3 = SharePrefCache.inst().getPromoteDialogPopupClickType().mo59941c();
        this.f147176f.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.promote.DialogC65233e.View$OnClickListenerC652341 */

            static {
                Covode.recordClassIndex(76710);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C39162r.m79460a("creative_permission_yes", new C33744d().f79943a);
                if (c3.intValue() == 0) {
                    DialogC65233e.this.mo104393a(true);
                    C34608n.m70658a().mo61083a(DialogC65233e.this.f147181k, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002a: INVOKE  
                          (wrap: com.ss.android.ugc.aweme.base.n : 0x0021: INVOKE  (r1v2 com.ss.android.ugc.aweme.base.n) =  type: STATIC call: com.ss.android.ugc.aweme.base.n.a():com.ss.android.ugc.aweme.base.n)
                          (wrap: com.bytedance.common.utility.collection.WeakHandler : 0x001f: IGET  (r2v1 com.bytedance.common.utility.collection.WeakHandler) = 
                          (wrap: com.ss.android.ugc.aweme.promote.e : 0x001d: IGET  (r0v12 com.ss.android.ugc.aweme.promote.e) = (r4v0 'this' com.ss.android.ugc.aweme.promote.e$1 A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.promote.e.1.b com.ss.android.ugc.aweme.promote.e)
                         com.ss.android.ugc.aweme.promote.e.k com.bytedance.common.utility.collection.WeakHandler)
                          (wrap: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$1 : 0x0027: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$1) =  call: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager.1.<init>():void type: CONSTRUCTOR)
                          (1 int)
                         type: VIRTUAL call: com.ss.android.ugc.aweme.base.n.a(android.os.Handler, java.util.concurrent.Callable, int):void in method: com.ss.android.ugc.aweme.promote.e.1.onClick(android.view.View):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0027: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$1) =  call: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.promote.e.1.onClick(android.view.View):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 19 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 25 more
                        */
                    /*
                        this = this;
                        com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r5)
                        com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                        r0.<init>()
                        java.util.Map<java.lang.String, java.lang.String> r1 = r0.f79943a
                        java.lang.String r0 = "creative_permission_yes"
                        com.p2082ss.android.ugc.aweme.common.C39162r.m79460a(r0, r1)
                        java.lang.Integer r0 = r2
                        int r0 = r0.intValue()
                        r3 = 1
                        if (r0 != 0) goto L_0x002e
                        com.ss.android.ugc.aweme.promote.e r0 = com.p2082ss.android.ugc.aweme.promote.DialogC65233e.this
                        r0.mo104393a(r3)
                        com.ss.android.ugc.aweme.promote.e r0 = com.p2082ss.android.ugc.aweme.promote.DialogC65233e.this
                        com.bytedance.common.utility.collection.WeakHandler r2 = r0.f147181k
                        com.ss.android.ugc.aweme.base.n r1 = com.p2082ss.android.ugc.aweme.base.C34608n.m70658a()
                        com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$1 r0 = new com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$1
                        r0.<init>()
                        r1.mo61083a(r2, r0, r3)
                        return
                    L_0x002e:
                        java.lang.Integer r0 = r2
                        int r0 = r0.intValue()
                        if (r0 != r3) goto L_0x0049
                        com.ss.android.ugc.aweme.promote.e r0 = com.p2082ss.android.ugc.aweme.promote.DialogC65233e.this
                        com.ss.android.ugc.aweme.promote.a r3 = r0.f147180j
                        com.ss.android.ugc.aweme.promote.e r0 = com.p2082ss.android.ugc.aweme.promote.DialogC65233e.this
                        android.app.Activity r2 = r0.f147179i
                        com.ss.android.ugc.aweme.promote.e r0 = com.p2082ss.android.ugc.aweme.promote.DialogC65233e.this
                        java.lang.String r1 = r0.f147172b
                        com.ss.android.ugc.aweme.promote.e r0 = com.p2082ss.android.ugc.aweme.promote.DialogC65233e.this
                        java.lang.String r0 = r0.f147171a
                        r3.mo104387a(r2, r1, r0)
                    L_0x0049:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.promote.DialogC65233e.View$OnClickListenerC652341.onClick(android.view.View):void");
                }
            });
            this.f147177g.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.promote.DialogC65233e.View$OnClickListenerC652352 */

                static {
                    Covode.recordClassIndex(76711);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    DialogC65233e.this.mo104393a(true);
                    C39162r.m79460a("creative_permission_no", new C33744d().f79943a);
                    C34608n.m70658a().mo61083a(null, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: INVOKE  
                          (wrap: com.ss.android.ugc.aweme.base.n : 0x0015: INVOKE  (r2v0 com.ss.android.ugc.aweme.base.n) =  type: STATIC call: com.ss.android.ugc.aweme.base.n.a():com.ss.android.ugc.aweme.base.n)
                          (null android.os.Handler)
                          (wrap: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$2 : 0x001b: CONSTRUCTOR  (r1v1 com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$2) =  call: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager.2.<init>():void type: CONSTRUCTOR)
                          (1 int)
                         type: VIRTUAL call: com.ss.android.ugc.aweme.base.n.a(android.os.Handler, java.util.concurrent.Callable, int):void in method: com.ss.android.ugc.aweme.promote.e.2.onClick(android.view.View):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR  (r1v1 com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$2) =  call: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager.2.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.promote.e.2.onClick(android.view.View):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 14 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 20 more
                        */
                    /*
                        this = this;
                        com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r5)
                        com.ss.android.ugc.aweme.promote.e r0 = com.p2082ss.android.ugc.aweme.promote.DialogC65233e.this
                        r3 = 1
                        r0.mo104393a(r3)
                        com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                        r0.<init>()
                        java.util.Map<java.lang.String, java.lang.String> r1 = r0.f79943a
                        java.lang.String r0 = "creative_permission_no"
                        com.p2082ss.android.ugc.aweme.common.C39162r.m79460a(r0, r1)
                        com.ss.android.ugc.aweme.base.n r2 = com.p2082ss.android.ugc.aweme.base.C34608n.m70658a()
                        com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$2 r1 = new com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$2
                        r1.<init>()
                        r0 = 0
                        r2.mo61083a(r0, r1, r3)
                        com.ss.android.ugc.aweme.promote.e r0 = com.p2082ss.android.ugc.aweme.promote.DialogC65233e.this
                        r0.dismiss()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.promote.DialogC65233e.View$OnClickListenerC652352.onClick(android.view.View):void");
                }
            });
            String c4 = SharePrefCache.inst().getPromoteDialogPopupPopupTitle().mo59941c();
            String c5 = SharePrefCache.inst().getPromoteDialogPopupPopupMsg().mo59941c();
            String c6 = SharePrefCache.inst().getPromoteDialogPopupPopupContent().mo59941c();
            if (!TextUtils.isEmpty(c4)) {
                this.f147173c.setText(c4);
            }
            if (this.f147173c.getText() != null) {
                if (c3.intValue() == 0) {
                    TextView textView = this.f147173c;
                    textView.setText(textView.getText().toString().replaceAll("!", "").replaceAll("！", ""));
                }
                TextView textView2 = this.f147173c;
                textView2.setText(textView2.getText().toString().replaceAll("\\\\n", "\n"));
            }
            if (!TextUtils.isEmpty(c5)) {
                this.f147174d.setText(c5);
            } else {
                this.f147174d.setVisibility(8);
            }
            if (!TextUtils.isEmpty(c6)) {
                this.f147175e.setText(c6);
            }
            TextClickable textClickable = new TextClickable();
            textClickable.f181969d = Pattern.compile(this.f147171a);
            textClickable.f181967b = 0;
            TextView textView3 = this.f147175e;
            if (textView3 != null) {
                SpannableString spannableString = new SpannableString(textView3.getText());
                if (textClickable.mo125061a(spannableString)) {
                    textView3.setText(spannableString);
                    textView3.setOnTouchListener(new View.OnTouchListener(spannableString) {
                        /* class com.p2082ss.android.ugc.aweme.views.TextClickable.View$OnTouchListenerC814221 */

                        /* renamed from: a */
                        final /* synthetic */ SpannableString f181973a;

                        static {
                            Covode.recordClassIndex(94784);
                        }

                        {
                            this.f181973a = r2;
                        }

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            TextView textView = (TextView) view;
                            if (motionEvent.getAction() == 1) {
                                int x = (int) motionEvent.getX();
                                int y = (int) motionEvent.getY();
                                int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                                int totalPaddingTop = y - textView.getTotalPaddingTop();
                                int scrollX = totalPaddingLeft + textView.getScrollX();
                                int scrollY = totalPaddingTop + textView.getScrollY();
                                Layout layout = textView.getLayout();
                                if (layout == null) {
                                    return false;
                                }
                                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
                                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.f181973a.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                if (clickableSpanArr.length != 0) {
                                    clickableSpanArr[0].onClick(textView);
                                }
                            }
                            return true;
                        }
                    });
                }
            }
            textClickable.f181968c = new TextClickable.AbstractC81423a() {
                /* class com.p2082ss.android.ugc.aweme.promote.DialogC65233e.C652363 */

                static {
                    Covode.recordClassIndex(76712);
                }

                @Override // com.p2082ss.android.ugc.aweme.views.TextClickable.AbstractC81423a
                /* renamed from: a */
                public final void mo104400a(TextPaint textPaint) {
                    textPaint.setFakeBoldText(true);
                    textPaint.setColor(C0643b.m2378c(DialogC65233e.this.f147179i, R.color.c1));
                    textPaint.setUnderlineText(true);
                }

                @Override // com.p2082ss.android.ugc.aweme.views.TextClickable.AbstractC81423a
                /* renamed from: a */
                public final void mo104401a(String str) {
                    if (DialogC65233e.this.f147171a.equals(str)) {
                        DialogC65233e.this.f147180j.mo104387a(DialogC65233e.this.f147179i, DialogC65233e.this.f147172b, DialogC65233e.this.f147171a);
                    }
                }
            };
            MethodCollector.m26664o(7598);
        }
    }

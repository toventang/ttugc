package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.DialogC0240h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c */
public final class DialogC72914c extends DialogC0240h {

    /* renamed from: a */
    boolean f163635a;

    /* renamed from: b */
    boolean f163636b;

    /* renamed from: c */
    boolean f163637c;

    /* renamed from: d */
    private ViewPagerBottomSheetBehavior<FrameLayout> f163638d;

    /* renamed from: e */
    private ViewPagerBottomSheetBehavior.AbstractC72909a f163639e;

    static {
        Covode.recordClassIndex(85614);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.f163638d;
        if (viewPagerBottomSheetBehavior != null && 4 != viewPagerBottomSheetBehavior.f163606f) {
            if (viewPagerBottomSheetBehavior.f163609i == null) {
                viewPagerBottomSheetBehavior.f163606f = 4;
                return;
            }
            V v = viewPagerBottomSheetBehavior.f163609i.get();
            if (v != null) {
                ViewParent parent = v.getParent();
                if (parent == null || !parent.isLayoutRequested() || !C0792v.m2791y(v)) {
                    viewPagerBottomSheetBehavior.mo115294b(v, 4);
                } else {
                    v.post(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0034: INVOKE  
                          (r1v1 'v' V extends android.view.View)
                          (wrap: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$1 : 0x0031: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$1) = 
                          (r3v0 'viewPagerBottomSheetBehavior' com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior<android.widget.FrameLayout>)
                          (r1v1 'v' V extends android.view.View)
                         call: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.1.<init>(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior, android.view.View):void type: CONSTRUCTOR)
                         type: VIRTUAL call: android.view.View.post(java.lang.Runnable):boolean in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c.onStart():void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0031: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$1) = 
                          (r3v0 'viewPagerBottomSheetBehavior' com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior<android.widget.FrameLayout>)
                          (r1v1 'v' V extends android.view.View)
                         call: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.1.<init>(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior, android.view.View):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c.onStart():void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 33 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 39 more
                        */
                    /*
                        this = this;
                        super.onStart()
                        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior<android.widget.FrameLayout> r3 = r4.f163638d
                        if (r3 == 0) goto L_0x003b
                        int r0 = r3.f163606f
                        r2 = 4
                        if (r2 == r0) goto L_0x003b
                        java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.f163609i
                        if (r0 != 0) goto L_0x0013
                        r3.f163606f = r2
                        return
                    L_0x0013:
                        java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.f163609i
                        java.lang.Object r1 = r0.get()
                        android.view.View r1 = (android.view.View) r1
                        if (r1 == 0) goto L_0x003b
                        android.view.ViewParent r0 = r1.getParent()
                        if (r0 == 0) goto L_0x0038
                        boolean r0 = r0.isLayoutRequested()
                        if (r0 == 0) goto L_0x0038
                        boolean r0 = androidx.core.p037h.C0792v.m2791y(r1)
                        if (r0 == 0) goto L_0x0038
                        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$1 r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$1
                        r0.<init>(r1)
                        r1.post(r0)
                        return
                    L_0x0038:
                        r3.mo115294b(r1, r2)
                    L_0x003b:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DialogC72914c.onStart():void");
                }

                public final void setCancelable(boolean z) {
                    super.setCancelable(z);
                    if (this.f163635a != z) {
                        this.f163635a = z;
                        ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.f163638d;
                        if (viewPagerBottomSheetBehavior != null) {
                            viewPagerBottomSheetBehavior.f163604d = z;
                        }
                    }
                }

                @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
                public final void setContentView(int i) {
                    super.setContentView(m128765a(i, null, null));
                }

                @Override // androidx.appcompat.app.DialogC0240h
                public final void onCreate(Bundle bundle) {
                    super.onCreate(bundle);
                    Window window = getWindow();
                    if (window != null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            window.clearFlags(67108864);
                            window.addFlags(Integer.MIN_VALUE);
                        }
                        window.setLayout(-1, -1);
                    }
                }

                public final void setCanceledOnTouchOutside(boolean z) {
                    super.setCanceledOnTouchOutside(z);
                    if (z && !this.f163635a) {
                        this.f163635a = true;
                    }
                    this.f163636b = z;
                    this.f163637c = true;
                }

                @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
                public final void setContentView(View view) {
                    super.setContentView(m128765a(0, view, null));
                }

                /* JADX WARNING: Illegal instructions before constructor call */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public DialogC72914c(android.content.Context r5, int r6) {
                    /*
                        r4 = this;
                        r3 = 1
                        if (r6 != 0) goto L_0x0017
                        android.util.TypedValue r2 = new android.util.TypedValue
                        r2.<init>()
                        android.content.res.Resources$Theme r1 = r5.getTheme()
                        r0 = 2130969005(0x7f0401ad, float:1.754668E38)
                        boolean r0 = r1.resolveAttribute(r0, r2, r3)
                        if (r0 == 0) goto L_0x0029
                        int r6 = r2.resourceId
                    L_0x0017:
                        r4.<init>(r5, r6)
                        r4.f163635a = r3
                        r4.f163636b = r3
                        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c$4 r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c$4
                        r0.<init>()
                        r4.f163639e = r0
                        r4.cn_()
                        return
                    L_0x0029:
                        r6 = 2131886528(0x7f1201c0, float:1.9407637E38)
                        goto L_0x0017
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DialogC72914c.<init>(android.content.Context, int):void");
                }

                @Override // androidx.appcompat.app.DialogC0240h
                public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
                    super.setContentView(m128765a(0, view, layoutParams));
                }

                /* renamed from: a */
                private View m128765a(int i, View view, ViewGroup.LayoutParams layoutParams) {
                    MethodCollector.m26663i(6152);
                    FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.vw, null);
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.aeb);
                    if (i != 0 && view == null) {
                        view = C1764a.m5927a(getLayoutInflater(), i, coordinatorLayout, false);
                    }
                    FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.ajx);
                    ViewPagerBottomSheetBehavior<FrameLayout> b = ViewPagerBottomSheetBehavior.m128739b(frameLayout2);
                    this.f163638d = b;
                    b.mo115290a(this);
                    this.f163638d.f163612l = this.f163639e;
                    this.f163638d.f163604d = this.f163635a;
                    if (layoutParams == null) {
                        frameLayout2.addView(view);
                    } else {
                        frameLayout2.addView(view, layoutParams);
                    }
                    coordinatorLayout.findViewById(R.id.emn).setOnClickListener(new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DialogC72914c.View$OnClickListenerC729151 */

                        static {
                            Covode.recordClassIndex(85615);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            if (DialogC72914c.this.f163635a && DialogC72914c.this.isShowing()) {
                                DialogC72914c cVar = DialogC72914c.this;
                                if (!cVar.f163637c) {
                                    int i = Build.VERSION.SDK_INT;
                                    TypedArray obtainStyledAttributes = cVar.getContext().obtainStyledAttributes(new int[]{16843611});
                                    cVar.f163636b = obtainStyledAttributes.getBoolean(0, true);
                                    obtainStyledAttributes.recycle();
                                    cVar.f163637c = true;
                                }
                                if (cVar.f163636b) {
                                    DialogC72914c.this.cancel();
                                }
                            }
                        }
                    });
                    C0792v.m2747a(frameLayout2, new C0726a() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DialogC72914c.C729162 */

                        static {
                            Covode.recordClassIndex(85616);
                        }

                        @Override // androidx.core.p037h.C0726a
                        /* renamed from: a */
                        public final void mo2808a(View view, C0733d dVar) {
                            super.mo2808a(view, dVar);
                            if (DialogC72914c.this.f163635a) {
                                dVar.mo2829a(1048576);
                                dVar.mo2845e(true);
                                return;
                            }
                            dVar.mo2845e(false);
                        }

                        @Override // androidx.core.p037h.C0726a
                        /* renamed from: a */
                        public final boolean mo2809a(View view, int i, Bundle bundle) {
                            if (i != 1048576 || !DialogC72914c.this.f163635a) {
                                return super.mo2809a(view, i, bundle);
                            }
                            DialogC72914c.this.cancel();
                            return true;
                        }
                    });
                    frameLayout2.setOnTouchListener(new View.OnTouchListener() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DialogC72914c.View$OnTouchListenerC729173 */

                        static {
                            Covode.recordClassIndex(85617);
                        }

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            return true;
                        }
                    });
                    MethodCollector.m26664o(6152);
                    return frameLayout;
                }
            }

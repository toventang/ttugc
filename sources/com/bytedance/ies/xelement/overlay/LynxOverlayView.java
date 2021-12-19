package com.bytedance.ies.xelement.overlay;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.overlay.C19307b;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.AbstractC28618d;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxOverlayView extends UIGroup<C28698a> {

    /* renamed from: b */
    public static final C19300a f45601b = new C19300a((byte) 0);

    /* renamed from: a */
    public final LynxOverlayViewProxy f45602a;

    /* renamed from: c */
    private boolean f45603c;

    /* renamed from: d */
    private boolean f45604d;

    /* renamed from: e */
    private boolean f45605e = true;

    /* renamed from: f */
    private String f45606f;

    /* renamed from: g */
    private final DialogC19305a f45607g;

    /* renamed from: h */
    private C19301b f45608h;

    static {
        Covode.recordClassIndex(22078);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            switch (nextKey.hashCode()) {
                case -1952821320:
                    if (nextKey.equals("overlay-id")) {
                        setOverlayId(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1389050563:
                    if (nextKey.equals("events-pass-through")) {
                        setEventsPassThrough(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -939362323:
                    if (nextKey.equals("cut-out-mode")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setCutOutMode(z);
                        continue;
                    }
                    break;
                case -243354428:
                    if (nextKey.equals("status-bar-translucent")) {
                        setStatusBarTranslucent(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 466743410:
                    if (nextKey.equals("visible")) {
                        setVisible(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1860950378:
                    if (nextKey.equals("full-screen")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setFullScreen(z);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.overlay.LynxOverlayView$a */
    public static final class C19300a {
        static {
            Covode.recordClassIndex(22082);
        }

        private C19300a() {
        }

        public /* synthetic */ C19300a(byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void onDetach() {
        super.onDetach();
        m36034b();
    }

    /* renamed from: a */
    public final boolean mo30717a() {
        if (!this.f45604d) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: b */
    private final void m36034b() {
        DialogC19305a aVar = this.f45607g;
        if (aVar != null) {
            aVar.dismiss();
        }
        mo30716a("onDismissOverlay");
        C19307b.m36040a(this.f45606f);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.AbstractC28618d
    public final void requestLayout() {
        super.requestLayout();
        if (this.f45602a.getTransitionAnimator() != null || this.f45602a.enableLayoutAnimation()) {
            this.f45608h.invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        return new C28698a(context);
    }

    @AbstractC28525m(mo49059a = "overlay-id")
    public final void setOverlayId(String str) {
        C89219l.m154719c(str, "");
        this.f45606f = str;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setParent(AbstractC28618d dVar) {
        super.setParent(dVar);
        if (dVar == null) {
            m36034b();
        }
    }

    @AbstractC28525m(mo49059a = "cut-out-mode")
    public final void setCutOutMode(boolean z) {
        DialogC19305a aVar;
        Window window;
        WindowManager.LayoutParams attributes;
        if (z && (aVar = this.f45607g) != null && (window = aVar.getWindow()) != null && (attributes = window.getAttributes()) != null && Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30716a(String str) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("currentOverlayId", this.f45606f);
        javaOnlyMap.put("overlays", C19307b.m36039a());
        javaOnlyArray.pushMap(javaOnlyMap);
        this.mContext.mo49038a(str, javaOnlyArray);
    }

    @AbstractC28525m(mo49059a = "events-pass-through")
    public final void setEventsPassThrough(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        ReadableType h = aVar.mo48559h();
        if (h != null) {
            int i = C19309c.f45631c[h.ordinal()];
            if (i == 1) {
                String e = aVar.mo48556e();
                if (e == null) {
                    C89219l.m154707a();
                }
                this.f45605e = Boolean.parseBoolean(e);
            } else if (i == 2) {
                this.f45605e = aVar.mo48553b();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r0 == null) goto L_0x001e;
     */
    @com.lynx.tasm.behavior.AbstractC28525m(mo49059a = "full-screen")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setFullScreen(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0039
            r1 = 5894(0x1706, float:8.259E-42)
            com.bytedance.ies.xelement.overlay.a r0 = r2.f45607g
            if (r0 == 0) goto L_0x003a
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x003a
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x003a
            int r0 = r0.getSystemUiVisibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x0021
        L_0x001e:
            p4600h.p4611f.p4613b.C89219l.m154707a()
        L_0x0021:
            int r0 = r0.intValue()
            r1 = r1 | r0
            com.bytedance.ies.xelement.overlay.a r0 = r2.f45607g
            if (r0 == 0) goto L_0x0039
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0039
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0039
            r0.setSystemUiVisibility(r1)
        L_0x0039:
            return
        L_0x003a:
            r0 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.overlay.LynxOverlayView.setFullScreen(boolean):void");
    }

    @AbstractC28525m(mo49059a = "visible")
    public final void setVisible(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        ReadableType h = aVar.mo48559h();
        if (h != null) {
            int i = C19309c.f45629a[h.ordinal()];
            if (i == 1) {
                String e = aVar.mo48556e();
                if (e == null) {
                    C89219l.m154707a();
                }
                this.f45603c = Boolean.parseBoolean(e);
            } else if (i == 2) {
                this.f45603c = aVar.mo48553b();
            }
        }
        if (this.f45603c) {
            DialogC19305a aVar2 = this.f45607g;
            if (aVar2 != null) {
                String str = this.f45606f;
                C89219l.m154719c(aVar2, "");
                if (str == null) {
                    StringBuilder sb = new StringBuilder("default_overlay_id_");
                    int i2 = C19307b.f45625b;
                    C19307b.f45625b = i2 + 1;
                    str = sb.append(i2).toString();
                    C89219l.m154709a((Object) str, "");
                }
                C19307b.f45624a.add(0, new C19307b.C19308a(str, aVar2));
                this.f45606f = str;
                DialogC19305a aVar3 = this.f45607g;
                if (aVar3 == null) {
                    C89219l.m154707a();
                }
                aVar3.show();
                mo30716a("onShowOverlay");
                return;
            }
            return;
        }
        m36034b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r0 == null) goto L_0x0053;
     */
    @com.lynx.tasm.behavior.AbstractC28525m(mo49059a = "status-bar-translucent")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setStatusBarTranslucent(com.lynx.react.bridge.AbstractC28367a r4) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.overlay.LynxOverlayView.setStatusBarTranslucent(com.lynx.react.bridge.a):void");
    }

    /* renamed from: com.bytedance.ies.xelement.overlay.LynxOverlayView$b */
    public static final class C19301b extends C28698a {

        /* renamed from: a */
        final /* synthetic */ LynxOverlayView f45610a;

        /* renamed from: b */
        final /* synthetic */ AbstractC28520j f45611b;

        static {
            Covode.recordClassIndex(22083);
        }

        @Override // com.lynx.tasm.behavior.p2052ui.view.C28698a
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            this.f45610a.measureChildren();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19301b(LynxOverlayView lynxOverlayView, AbstractC28520j jVar, Context context) {
            super(context);
            this.f45610a = lynxOverlayView;
            this.f45611b = jVar;
        }

        @Override // com.lynx.tasm.behavior.p2052ui.view.C28698a
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.f45610a.layout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxOverlayView(AbstractC28520j jVar, LynxOverlayViewProxy lynxOverlayViewProxy) {
        super(jVar);
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(lynxOverlayViewProxy, "");
        this.f45602a = lynxOverlayViewProxy;
        DialogC19305a aVar = new DialogC19305a(jVar, this);
        this.f45607g = aVar;
        this.f45608h = new C19301b(this, jVar, jVar);
        Window window = aVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        this.f45608h.addView(this.mView, -1, -1);
        aVar.setContentView(this.f45608h, new ViewGroup.LayoutParams(-1, -1));
        aVar.setOnKeyListener(new DialogInterface.OnKeyListener(this) {
            /* class com.bytedance.ies.xelement.overlay.LynxOverlayView.DialogInterface$OnKeyListenerC192991 */

            /* renamed from: a */
            final /* synthetic */ LynxOverlayView f45609a;

            static {
                Covode.recordClassIndex(22081);
            }

            {
                this.f45609a = r1;
            }

            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                C89219l.m154709a((Object) keyEvent, "");
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                this.f45609a.mo30716a("onRequestClose");
                return true;
            }
        });
        this.f45608h.setClickable(true);
        this.f45608h.setFocusable(true);
        this.f45608h.setFocusableInTouchMode(true);
    }

    /* renamed from: a */
    public final boolean mo30718a(float f, float f2) {
        if (!this.f45603c) {
            return false;
        }
        if (!this.f45605e) {
            return true;
        }
        List<LynxBaseUI> list = this.mChildren;
        C89219l.m154709a((Object) list, "");
        for (LynxBaseUI lynxBaseUI : list) {
            int left = getLeft();
            C89219l.m154709a((Object) lynxBaseUI, "");
            if (((float) (left + lynxBaseUI.getLeft())) + lynxBaseUI.getTranslationX() < f && ((float) getLeft()) + ((float) lynxBaseUI.getLeft()) + lynxBaseUI.getTranslationX() + ((float) lynxBaseUI.getWidth()) > f && ((float) (getTop() + lynxBaseUI.getTop())) + lynxBaseUI.getTranslationY() < f2 && ((float) getTop()) + ((float) lynxBaseUI.getTop()) + lynxBaseUI.getTranslationY() + ((float) lynxBaseUI.getHeight()) > f2) {
                return true;
            }
        }
        return false;
    }
}

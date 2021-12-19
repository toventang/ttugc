package com.bytedance.ies.xelement.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.DialogC28519i;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.input.f */
public final class C19285f {

    /* renamed from: q */
    public static final C19287a f45567q = new C19287a((byte) 0);

    /* renamed from: a */
    final AbstractC28520j f45568a;

    /* renamed from: b */
    ViewTreeObserver.OnGlobalLayoutListener f45569b;

    /* renamed from: c */
    public C19279c f45570c;

    /* renamed from: d */
    public DialogC28519i f45571d;

    /* renamed from: e */
    public Rect f45572e = new Rect();

    /* renamed from: f */
    public int f45573f;

    /* renamed from: g */
    String f45574g = "end";

    /* renamed from: h */
    public boolean f45575h = true;

    /* renamed from: i */
    int f45576i;

    /* renamed from: j */
    public boolean f45577j;

    /* renamed from: k */
    public int f45578k = -1;

    /* renamed from: l */
    public int f45579l = -1;

    /* renamed from: m */
    boolean f45580m = true;

    /* renamed from: n */
    public boolean f45581n;

    /* renamed from: o */
    public boolean f45582o;

    /* renamed from: p */
    public LynxBaseInputView f45583p;

    static {
        Covode.recordClassIndex(22064);
    }

    /* renamed from: com.bytedance.ies.xelement.input.f$a */
    public static final class C19287a {

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.xelement.input.f$a$a */
        public enum EnumC19288a {
            NONE,
            IMMERSIVE,
            NORMAL,
            NOTHING;

            static {
                Covode.recordClassIndex(22067);
            }
        }

        static {
            Covode.recordClassIndex(22066);
        }

        private C19287a() {
        }

        public /* synthetic */ C19287a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private final boolean m36007c() {
        Context baseContext = this.f45568a.getBaseContext();
        int i = Build.VERSION.SDK_INT;
        if (baseContext != null) {
            Window window = ((Activity) baseContext).getWindow();
            C89219l.m154709a((Object) window, "");
            View decorView = window.getDecorView();
            C89219l.m154709a((Object) decorView, "");
            if ((decorView.getSystemUiVisibility() & 1024) != 0) {
                return true;
            }
            return false;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    public final boolean mo30698a() {
        if (!this.f45580m || TextUtils.equals(this.f45574g, "none") || !(this.f45568a.getBaseContext() instanceof Activity) || m36008d() == C19287a.EnumC19288a.NONE || this.f45571d == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final C19287a.EnumC19288a m36008d() {
        Context baseContext = this.f45568a.getBaseContext();
        if (!(baseContext instanceof Activity)) {
            return C19287a.EnumC19288a.NONE;
        }
        Window window = ((Activity) baseContext).getWindow();
        C89219l.m154709a((Object) window, "");
        int i = window.getAttributes().softInputMode & 240 & 240;
        if (i != 16) {
            if (i == 32) {
                return C19287a.EnumC19288a.NONE;
            }
            if (i != 48) {
                return C19287a.EnumC19288a.NONE;
            }
            return C19287a.EnumC19288a.NOTHING;
        } else if (m36007c()) {
            return C19287a.EnumC19288a.IMMERSIVE;
        } else {
            return C19287a.EnumC19288a.NORMAL;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30699b() {
        /*
        // Method dump skipped, instructions count: 686
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.C19285f.mo30699b():void");
    }

    public C19285f(LynxBaseInputView lynxBaseInputView) {
        C89219l.m154719c(lynxBaseInputView, "");
        this.f45583p = lynxBaseInputView;
        AbstractC28520j jVar = lynxBaseInputView.mContext;
        C89219l.m154709a((Object) jVar, "");
        this.f45568a = jVar;
        if (jVar.mo49032a() instanceof Activity) {
            this.f45571d = new DialogC28519i(jVar.mo49032a());
            C19279c cVar = this.f45583p.f45481a;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            this.f45570c = cVar;
            if (m36008d() != C19287a.EnumC19288a.NONE) {
                this.f45569b = new ViewTreeObserver.OnGlobalLayoutListener(this) {
                    /* class com.bytedance.ies.xelement.input.C19285f.ViewTreeObserver$OnGlobalLayoutListenerC192861 */

                    /* renamed from: a */
                    final /* synthetic */ C19285f f45584a;

                    static {
                        Covode.recordClassIndex(22065);
                    }

                    {
                        this.f45584a = r1;
                    }

                    public final void onGlobalLayout() {
                        boolean z;
                        if (this.f45584a.mo30698a()) {
                            DialogC28519i iVar = this.f45584a.f45571d;
                            if (iVar == null) {
                                C89219l.m154707a();
                            }
                            iVar.mo49026a().getWindowVisibleDisplayFrame(this.f45584a.f45572e);
                            int i = this.f45584a.f45572e.bottom - this.f45584a.f45572e.top;
                            if (this.f45584a.f45573f == 0) {
                                C19285f fVar = this.f45584a;
                                DialogC28519i iVar2 = fVar.f45571d;
                                if (iVar2 == null) {
                                    C89219l.m154707a();
                                }
                                View a = iVar2.mo49026a();
                                C89219l.m154709a((Object) a, "");
                                fVar.f45573f = a.getHeight();
                            }
                            int i2 = this.f45584a.f45573f;
                            double d = (double) i;
                            double d2 = (double) i2;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            double d3 = d / d2;
                            if (d3 < 0.8d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (d3 < 0.4d) {
                                DialogC28519i iVar3 = this.f45584a.f45571d;
                                if (iVar3 == null) {
                                    C89219l.m154707a();
                                }
                                iVar3.mo49026a().requestLayout();
                                return;
                            }
                            if (z != this.f45584a.f45577j || this.f45584a.f45581n || this.f45584a.f45582o) {
                                if (z) {
                                    this.f45584a.f45578k = i2 - i;
                                    C19279c cVar = this.f45584a.f45570c;
                                    if (cVar != null && cVar.isFocused()) {
                                        C19285f fVar2 = this.f45584a;
                                        LynxBaseUI parentBaseUI = fVar2.f45583p.getParentBaseUI();
                                        while (true) {
                                            if (parentBaseUI == null) {
                                                break;
                                            } else if (parentBaseUI instanceof AbsLynxUIScroll) {
                                                ViewGroup viewGroup = (ViewGroup) ((LynxUI) parentBaseUI).mView;
                                                C89219l.m154709a((Object) viewGroup, "");
                                                i -= viewGroup.getTop();
                                                break;
                                            } else {
                                                parentBaseUI = parentBaseUI.getParentBaseUI();
                                            }
                                        }
                                        fVar2.f45579l = i;
                                        this.f45584a.mo30699b();
                                    }
                                } else if (this.f45584a.f45575h) {
                                    LynxBaseUI parentBaseUI2 = this.f45584a.f45583p.getParentBaseUI();
                                    while (true) {
                                        if (parentBaseUI2 == null) {
                                            break;
                                        } else if (parentBaseUI2 instanceof AbsLynxUIScroll) {
                                            LynxUI lynxUI = (LynxUI) parentBaseUI2;
                                            View childAt = ((ViewGroup) lynxUI.mView).getChildAt(0);
                                            C89219l.m154709a((Object) childAt, "");
                                            if (childAt.getPaddingBottom() != 0) {
                                                ((ViewGroup) lynxUI.mView).getChildAt(0).setPadding(0, 0, 0, 0);
                                            }
                                        } else {
                                            parentBaseUI2 = parentBaseUI2.getParentBaseUI();
                                        }
                                    }
                                }
                            }
                            this.f45584a.f45577j = z;
                        }
                    }
                };
                DialogC28519i iVar = this.f45571d;
                if (iVar == null) {
                    C89219l.m154707a();
                }
                iVar.mo49027a(this.f45569b);
                DialogC28519i iVar2 = this.f45571d;
                if (iVar2 == null) {
                    C89219l.m154707a();
                }
                iVar2.mo49028b();
            }
        }
    }

    /* renamed from: a */
    private final boolean m36006a(Rect rect, View view) {
        int i;
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        int[] iArr = {-1, -1};
        C19279c cVar = this.f45570c;
        if (cVar != null) {
            cVar.getLocationInWindow(iArr);
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[0];
        C19279c cVar2 = this.f45570c;
        if (cVar2 == null) {
            C89219l.m154707a();
        }
        int width = i4 + cVar2.getWidth();
        int i5 = iArr[1];
        C19279c cVar3 = this.f45570c;
        if (cVar3 == null) {
            C89219l.m154707a();
        }
        Rect rect3 = new Rect(i2, i3, width, i5 + cVar3.getHeight());
        if (!TextUtils.equals(this.f45574g, "center")) {
            i = (rect2.bottom - rect3.bottom) - this.f45576i;
        } else if (this.f45579l == -1) {
            this.f45582o = true;
            C19279c cVar4 = this.f45570c;
            if (cVar4 == null) {
                C89219l.m154707a();
            }
            cVar4.requestLayout();
            DialogC28519i iVar = this.f45571d;
            if (iVar == null) {
                C89219l.m154707a();
            }
            iVar.mo49026a().requestLayout();
            return true;
        } else {
            this.f45582o = false;
            i = (rect2.bottom - rect3.bottom) - ((this.f45579l - rect.height()) / 2);
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }
}

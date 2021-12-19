package com.google.android.material.bottomsheet;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.DialogC0240h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.material.bottomsheet.a */
public class DialogC26609a extends DialogC0240h {

    /* renamed from: a */
    private BottomSheetBehavior<FrameLayout> f62921a;

    /* renamed from: b */
    private BottomSheetBehavior.AbstractC26607a f62922b;

    /* renamed from: g */
    boolean f62923g;

    /* renamed from: h */
    boolean f62924h;

    /* renamed from: i */
    boolean f62925i;

    static {
        Covode.recordClassIndex(32057);
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f62921a;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f62896j == 5) {
            this.f62921a.mo43978c(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f62923g != z) {
            this.f62923g = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f62921a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f62894h = z;
            }
        }
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(m52786a(i, null, null));
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public void onCreate(Bundle bundle) {
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

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f62923g) {
            this.f62923g = true;
        }
        this.f62924h = z;
        this.f62925i = true;
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m52786a(0, view, null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DialogC26609a(android.content.Context r5, int r6) {
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
            r4.f62923g = r3
            r4.f62924h = r3
            com.google.android.material.bottomsheet.a$4 r0 = new com.google.android.material.bottomsheet.a$4
            r0.<init>()
            r4.f62922b = r0
            r4.cn_()
            return
        L_0x0029:
            r6 = 2131886528(0x7f1201c0, float:1.9407637E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.DialogC26609a.<init>(android.content.Context, int):void");
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m52786a(0, view, layoutParams));
    }

    /* renamed from: a */
    private View m52786a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(10820);
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.vj, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.aeb);
        if (i != 0 && view == null) {
            view = C1764a.m5927a(getLayoutInflater(), i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.ajx);
        BottomSheetBehavior<FrameLayout> a = BottomSheetBehavior.m52754a(frameLayout2);
        this.f62921a = a;
        a.f62901o = this.f62922b;
        this.f62921a.f62894h = this.f62923g;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.emn).setOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.bottomsheet.DialogC26609a.View$OnClickListenerC266101 */

            static {
                Covode.recordClassIndex(32058);
            }

            public final void onClick(View view) {
                if (DialogC26609a.this.f62923g && DialogC26609a.this.isShowing()) {
                    DialogC26609a aVar = DialogC26609a.this;
                    if (!aVar.f62925i) {
                        TypedArray obtainStyledAttributes = aVar.getContext().obtainStyledAttributes(new int[]{16843611});
                        aVar.f62924h = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        aVar.f62925i = true;
                    }
                    if (aVar.f62924h) {
                        DialogC26609a.this.cancel();
                    }
                }
            }
        });
        C0792v.m2747a(frameLayout2, new C0726a() {
            /* class com.google.android.material.bottomsheet.DialogC26609a.C266112 */

            static {
                Covode.recordClassIndex(32059);
            }

            @Override // androidx.core.p037h.C0726a
            /* renamed from: a */
            public final void mo2808a(View view, C0733d dVar) {
                super.mo2808a(view, dVar);
                if (DialogC26609a.this.f62923g) {
                    dVar.mo2829a(1048576);
                    dVar.mo2845e(true);
                    return;
                }
                dVar.mo2845e(false);
            }

            @Override // androidx.core.p037h.C0726a
            /* renamed from: a */
            public final boolean mo2809a(View view, int i, Bundle bundle) {
                if (i != 1048576 || !DialogC26609a.this.f62923g) {
                    return super.mo2809a(view, i, bundle);
                }
                DialogC26609a.this.cancel();
                return true;
            }
        });
        frameLayout2.setOnTouchListener(new View.OnTouchListener() {
            /* class com.google.android.material.bottomsheet.DialogC26609a.View$OnTouchListenerC266123 */

            static {
                Covode.recordClassIndex(32060);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        MethodCollector.m26664o(10820);
        return frameLayout;
    }
}

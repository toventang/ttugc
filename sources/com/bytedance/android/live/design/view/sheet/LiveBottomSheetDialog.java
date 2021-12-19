package com.bytedance.android.live.design.view.sheet;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;

public class LiveBottomSheetDialog extends LifecycleAwareDialog implements AbstractC33974au {

    /* renamed from: a */
    private CoordinatorLayout f11442a;

    /* renamed from: b */
    LiveBottomSheetBehavior<FrameLayout> f11443b;

    /* renamed from: c */
    public FrameLayout f11444c;

    /* renamed from: d */
    FrameLayout f11445d;

    /* renamed from: e */
    boolean f11446e;

    /* renamed from: f */
    boolean f11447f;

    /* renamed from: g */
    boolean f11448g;

    /* renamed from: h */
    float f11449h;

    /* renamed from: i */
    private LiveBottomSheetBehavior.AbstractC4107a f11450i;

    static {
        Covode.recordClassIndex(4657);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: b */
    public final LiveBottomSheetBehavior<FrameLayout> mo9590b() {
        if (this.f11443b == null) {
            m9985c();
        }
        return this.f11443b;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehavior = this.f11443b;
        if (liveBottomSheetBehavior != null && liveBottomSheetBehavior.f11416n == 5) {
            this.f11443b.mo9582c(4);
        }
    }

    /* renamed from: c */
    private FrameLayout m9985c() {
        MethodCollector.m26663i(8610);
        if (this.f11444c == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.aje, null);
            this.f11444c = frameLayout;
            this.f11442a = (CoordinatorLayout) frameLayout.findViewById(R.id.aeb);
            FrameLayout frameLayout2 = (FrameLayout) this.f11444c.findViewById(R.id.ajx);
            this.f11445d = frameLayout2;
            LiveBottomSheetBehavior<FrameLayout> a = LiveBottomSheetBehavior.m9940a(frameLayout2);
            this.f11443b = a;
            a.mo9574a(this.f11450i);
            this.f11443b.mo9580b(this.f11446e);
            this.f11444c.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog.View$OnLayoutChangeListenerC41091 */

                static {
                    Covode.recordClassIndex(4658);
                }

                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int b;
                    LiveBottomSheetDialog liveBottomSheetDialog = LiveBottomSheetDialog.this;
                    if (liveBottomSheetDialog.getWindow() != null && (b = liveBottomSheetDialog.f11443b.f11419q - liveBottomSheetDialog.f11443b.mo9577b()) > 0) {
                        liveBottomSheetDialog.getWindow().setDimAmount((((float) (liveBottomSheetDialog.f11443b.f11419q - liveBottomSheetDialog.f11445d.getTop())) / ((float) b)) * liveBottomSheetDialog.f11449h);
                    }
                    LiveBottomSheetDialog.this.f11444c.removeOnLayoutChangeListener(this);
                }
            });
        }
        FrameLayout frameLayout3 = this.f11444c;
        MethodCollector.m26664o(8610);
        return frameLayout3;
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(m9984a(i, null, null));
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f11446e != z) {
            this.f11446e = z;
            LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehavior = this.f11443b;
            if (liveBottomSheetBehavior != null) {
                liveBottomSheetBehavior.mo9580b(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f11446e) {
            this.f11446e = true;
        }
        this.f11447f = z;
        this.f11448g = true;
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m9984a(0, view, null));
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 23) {
                    window.addFlags(67108864);
                }
            }
            window.setLayout(-1, -1);
            int i = getContext().getResources().getConfiguration().orientation;
            int i2 = R.style.j;
            if (i == 1) {
                i2 = R.style.i;
            } else {
                int i3 = Build.VERSION.SDK_INT;
                if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                    i2 = R.style.k;
                }
            }
            window.setWindowAnimations(i2);
        }
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842802, typedValue, true);
        this.f11449h = typedValue.getFloat();
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m9984a(0, view, layoutParams));
    }

    /* renamed from: a */
    private View m9984a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(8767);
        m9985c();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f11444c.findViewById(R.id.aeb);
        if (i != 0 && view == null) {
            view = C1764a.m5927a(getLayoutInflater(), i, coordinatorLayout, false);
        }
        this.f11445d.removeAllViews();
        if (layoutParams == null) {
            this.f11445d.addView(view, -1, -1);
        } else {
            this.f11445d.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.emn).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog.View$OnClickListenerC41102 */

            static {
                Covode.recordClassIndex(4659);
            }

            public final void onClick(View view) {
                if (LiveBottomSheetDialog.this.f11446e && LiveBottomSheetDialog.this.isShowing()) {
                    LiveBottomSheetDialog liveBottomSheetDialog = LiveBottomSheetDialog.this;
                    if (!liveBottomSheetDialog.f11448g) {
                        TypedArray obtainStyledAttributes = liveBottomSheetDialog.getContext().obtainStyledAttributes(new int[]{16843611});
                        liveBottomSheetDialog.f11447f = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        liveBottomSheetDialog.f11448g = true;
                    }
                    if (liveBottomSheetDialog.f11447f) {
                        LiveBottomSheetDialog.this.cancel();
                    }
                }
            }
        });
        C0792v.m2747a(this.f11445d, new C0726a() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog.C41113 */

            static {
                Covode.recordClassIndex(4660);
            }

            @Override // androidx.core.p037h.C0726a
            /* renamed from: a */
            public final void mo2808a(View view, C0733d dVar) {
                super.mo2808a(view, dVar);
                if (LiveBottomSheetDialog.this.f11446e) {
                    dVar.mo2829a(1048576);
                    dVar.mo2845e(true);
                    return;
                }
                dVar.mo2845e(false);
            }

            @Override // androidx.core.p037h.C0726a
            /* renamed from: a */
            public final boolean mo2809a(View view, int i, Bundle bundle) {
                if (i != 1048576 || !LiveBottomSheetDialog.this.f11446e) {
                    return super.mo2809a(view, i, bundle);
                }
                LiveBottomSheetDialog.this.cancel();
                return true;
            }
        });
        this.f11445d.setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog.View$OnTouchListenerC41124 */

            static {
                Covode.recordClassIndex(4661);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        FrameLayout frameLayout = this.f11444c;
        MethodCollector.m26664o(8767);
        return frameLayout;
    }
}

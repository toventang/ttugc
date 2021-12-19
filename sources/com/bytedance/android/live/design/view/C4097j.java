package com.bytedance.android.live.design.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.p037h.C0792v;
import com.bytedance.android.live.design.view.C4081a;
import com.bytedance.android.live.design.view.C4087e;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;

/* renamed from: com.bytedance.android.live.design.view.j */
public final class C4097j {
    static {
        Covode.recordClassIndex(4642);
    }

    /* renamed from: a */
    private static int m9919a(int i, int i2, int i3) {
        return i3 == 48 ? i - i2 : i3 == 80 ? i + i2 : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r5 != false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r5 != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return r2 - r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m9920a(int r2, int r3, int r4, boolean r5) {
        /*
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 != r1) goto L_0x0009
            if (r5 == 0) goto L_0x0010
        L_0x0007:
            int r2 = r2 + r3
        L_0x0008:
            return r2
        L_0x0009:
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r4 != r0) goto L_0x0012
            if (r5 == 0) goto L_0x0007
        L_0x0010:
            int r2 = r2 - r3
            return r2
        L_0x0012:
            if (r4 != r1) goto L_0x0017
            if (r5 != 0) goto L_0x0007
            goto L_0x0008
        L_0x0017:
            if (r4 != r0) goto L_0x0008
            if (r5 != 0) goto L_0x0008
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.C4097j.m9920a(int, int, int, boolean):int");
    }

    /* renamed from: b */
    public static boolean m9933b(long j) {
        return j > 0;
    }

    /* renamed from: a */
    public static void m9928a(long j) {
        if (m9933b(j)) {
            C4087e.C4091c.f11305a.mo9542a(j, 4);
        }
    }

    /* renamed from: a */
    static void m9930a(final C4087e.C4090b bVar) {
        if (C0792v.m2788v(bVar.f11303d.f11337b)) {
            m9932b(bVar);
            return;
        }
        View$OnLayoutChangeListenerC40981 r1 = new View.OnLayoutChangeListener() {
            /* class com.bytedance.android.live.design.view.C4097j.View$OnLayoutChangeListenerC40981 */

            static {
                Covode.recordClassIndex(4643);
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                bVar.f11302c = null;
                C4097j.m9932b(bVar);
                bVar.f11303d.f11337b.removeOnLayoutChangeListener(this);
            }
        };
        bVar.f11302c = r1;
        bVar.f11303d.f11337b.addOnLayoutChangeListener(r1);
    }

    /* renamed from: a */
    static final /* synthetic */ void m9931a(C4094h hVar, Runnable runnable, View.OnAttachStateChangeListener onAttachStateChangeListener, C4087e.C4090b bVar, C4086d dVar) {
        hVar.f11337b.removeCallbacks(runnable);
        hVar.f11337b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        if (bVar.f11301b != null) {
            bVar.f11301b.mo9538a(dVar.f11292a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (r12 != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        r9.setAnimationStyle(com.p2082ss.android.ugc.trill.R.style.p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0045, code lost:
        if (r12 != false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m9929a(android.content.Context r8, com.bytedance.android.live.design.view.C4086d r9, android.graphics.PointF r10, int r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.C4097j.m9929a(android.content.Context, com.bytedance.android.live.design.view.d, android.graphics.PointF, int, boolean):void");
    }

    /* renamed from: a */
    public static long m9924a(C4081a aVar) {
        return m9925a((C4094h) aVar);
    }

    /* renamed from: a */
    public static long m9925a(C4094h hVar) {
        if (hVar == null || hVar.f11336a == null || hVar.f11337b == null || hVar.f11338c == null) {
            return 0;
        }
        return C4087e.C4091c.f11305a.mo9541a(hVar);
    }

    /* renamed from: a */
    private static View m9926a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x019a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9932b(com.bytedance.android.live.design.view.C4087e.C4090b r19) {
        /*
        // Method dump skipped, instructions count: 566
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.C4097j.m9932b(com.bytedance.android.live.design.view.e$b):void");
    }

    /* renamed from: a */
    public static long m9922a(View view, CharSequence charSequence) {
        C4081a.C4082a aVar = new C4081a.C4082a(view);
        aVar.f11288a = charSequence;
        return m9925a((C4094h) aVar.mo9530b());
    }

    /* renamed from: a */
    private static int m9921a(Resources resources, int i) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    /* renamed from: a */
    public static long m9923a(View view, CharSequence charSequence, long j) {
        C4081a.C4082a aVar = new C4081a.C4082a(view);
        aVar.f11288a = charSequence;
        return m9925a((C4094h) ((C4081a.C4082a) aVar.mo9554a(j)).mo9530b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r6 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r7.left < (r11.right - r9.right)) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        r8.right = r9.right;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        r8.right = java.lang.Math.min(r11.right - r7.left, r10.right);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r6 != false) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m9927a(int r5, boolean r6, android.graphics.Rect r7, android.graphics.Rect r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.C4097j.m9927a(int, boolean, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):void");
    }
}

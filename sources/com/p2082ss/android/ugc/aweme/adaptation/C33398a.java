package com.p2082ss.android.ugc.aweme.adaptation;

import android.app.Application;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70635dg;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.AbstractC84922b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.adaptation.a */
public final class C33398a implements AbstractC84922b {

    /* renamed from: a */
    public static final C33398a f79357a = new C33398a();

    /* renamed from: b */
    private static final Keva f79358b;

    /* renamed from: c */
    private static Application f79359c = C63247i.f143610a;

    /* renamed from: a */
    private static boolean m68486a(int i, int i2) {
        return i2 * 9 > i * 16;
    }

    private C33398a() {
    }

    static {
        Covode.recordClassIndex(40253);
        Keva repo = Keva.getRepo("screen_adapt_repo");
        C89219l.m154716b(repo, "");
        f79358b = repo;
    }

    /* renamed from: c */
    public static int m68487c() {
        Application application = f79359c;
        C89219l.m154716b(application, "");
        return application.getResources().getDimensionPixelSize(R.dimen.e1);
    }

    /* renamed from: a */
    public final synchronized int mo59448a() {
        int i;
        MethodCollector.m26663i(862);
        i = f79358b.getInt("key_adapt_plan", 0);
        MethodCollector.m26664o(862);
        return i;
    }

    /* renamed from: b */
    public final synchronized int mo59451b() {
        int i;
        MethodCollector.m26663i(878);
        i = f79358b.getInt("key_navibar_height", -1);
        MethodCollector.m26664o(878);
        return i;
    }

    @Override // com.p2082ss.android.ugc.tools.view.AbstractC84922b
    /* renamed from: d */
    public final int mo59453d() {
        int c = C70636dh.m124833c(f79359c);
        int a = mo59448a();
        if (a == 1 || a == 6 || a == 3 || a == 4) {
            return c;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.tools.view.AbstractC84922b
    /* renamed from: e */
    public final boolean mo59454e() {
        if (mo59448a() == 1 || mo59448a() == 3 || mo59448a() == 4 || mo59448a() == 6) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.tools.view.AbstractC84922b
    /* renamed from: f */
    public final int mo59455f() {
        int c = m68487c();
        int a = mo59448a();
        if (a == 1 || a == 2) {
            return c;
        }
        if (a == 4 || a == 5) {
            return mo59451b() + c;
        }
        if (a == 6 || a == 7) {
            return mo59451b();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo59452b(int i) {
        int c = C70636dh.m124833c(f79359c);
        int e = C70636dh.m124836e(f79359c);
        switch (mo59448a()) {
            case 1:
                return (e - c) - i;
            case 2:
                return e - i;
            case 3:
                return e - c;
            case 4:
                return ((e - mo59451b()) - c) - i;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return (e - mo59451b()) - i;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return (e - mo59451b()) - c;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                if (m68486a(C70636dh.m124831b(f79359c), e)) {
                    return e - mo59451b();
                }
                return e;
            default:
                return e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r3 < r8) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r3 < r8) goto L_0x0057;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo59449a(int r11) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.adaptation.C33398a.mo59449a(int):void");
    }

    @Override // com.p2082ss.android.ugc.tools.view.AbstractC84922b
    /* renamed from: a */
    public final void mo59450a(View view, int i, int i2) {
        int i3;
        int i4;
        if (view != null && i != 0 && i2 != 0) {
            int e = C70636dh.m124836e(f79359c);
            int b = C70636dh.m124831b(f79359c);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (m68486a(b, e)) {
                i3 = mo59453d();
                e = mo59452b(m68487c());
            } else {
                i3 = 0;
            }
            if (C70635dg.m124827a(i, i2)) {
                layoutParams.height = e;
                layoutParams.topMargin = i3;
                layoutParams.width = (e * i) / i2;
                layoutParams.leftMargin = (C70636dh.m124831b(f79359c) - layoutParams.width) / 2;
            } else {
                layoutParams.width = b;
                layoutParams.height = (b * i2) / i;
                layoutParams.topMargin = i3 + ((e - layoutParams.height) / 2);
                if (layoutParams.topMargin >= 0) {
                    i4 = layoutParams.topMargin;
                } else {
                    i4 = 0;
                }
                layoutParams.topMargin = i4;
                layoutParams.leftMargin = 0;
            }
            C84911q.m145921a("ScreenSizeCompat: surfaceView height:" + layoutParams.height + ", width:" + layoutParams.width + ",plan=" + mo59448a() + " videoWidth：" + i + " x " + i2 + ", topMargin=" + layoutParams.topMargin);
            int i5 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(layoutParams.leftMargin);
            view.setLayoutParams(layoutParams);
        }
    }
}

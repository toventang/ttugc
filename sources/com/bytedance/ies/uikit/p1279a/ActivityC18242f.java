package com.bytedance.ies.uikit.p1279a;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.common.utility.AbstractC13615f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1282d.C18248a;
import com.bytedance.ies.uikit.p1282d.C18253d;
import com.bytedance.ies.uikit.p1282d.HandlerC18250b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

/* renamed from: com.bytedance.ies.uikit.a.f */
public final class ActivityC18242f extends AbstractActivityC18232a implements AbstractC13615f {

    /* renamed from: a */
    protected int f43457a;

    /* renamed from: b */
    private boolean f43458b;

    static {
        Covode.recordClassIndex(20901);
    }

    public final void overridePendingTransition(int i, int i2) {
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            e.printStackTrace();
            finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
    public final void onResume() {
        super.onResume();
        HandlerC18250b.m33961a().mo29121a(this);
    }

    /* renamed from: a */
    private C18248a m33942a() {
        C18248a aVar = new C18248a(this);
        aVar.f43467c = 17;
        aVar.f43484t = false;
        aVar.f43477m = false;
        aVar.mo29114a(C18253d.m33966a(aVar.mo29116b()), C18253d.m33967b(aVar.mo29116b()));
        return aVar;
    }

    public final void finish() {
        int i;
        int i2;
        super.finish();
        int i3 = this.f43457a;
        if (i3 == 0) {
            i = C18235c.f43441a;
            i2 = C18235c.f43442b;
        } else if (i3 == 1) {
            i = C18235c.f43449i;
            i2 = C18235c.f43450j;
        } else if (i3 == 2) {
            i = C18235c.f43445e;
            i2 = C18235c.f43446f;
        } else if (i3 != 3) {
            i = C18235c.f43441a;
            i2 = C18235c.f43442b;
        } else {
            i = C18235c.f43443c;
            i2 = C18235c.f43444d;
        }
        super.overridePendingTransition(i, i2);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
    public final void onPause() {
        for (C18248a aVar : HandlerC18250b.m33961a().f43493a) {
            if (aVar != null && aVar.f43465a == this) {
                aVar.f43473i = true;
            }
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
    public final void onStop() {
        super.onStop();
        HandlerC18250b a = HandlerC18250b.m33961a();
        a.removeMessages(1929);
        int size = a.f43493a.size();
        for (int i = 0; i < size; i++) {
            C18248a poll = a.f43493a.poll();
            if (poll != null) {
                if (poll.f43465a == this) {
                    a.removeMessages(1110, poll);
                    poll.mo29118d();
                    poll.f43469e.clearAnimation();
                    poll.f43465a = null;
                    HandlerC18250b a2 = HandlerC18250b.m33961a();
                    a2.f43493a.remove(poll);
                    while (a2.f43493a.contains(poll)) {
                        a2.f43493a.remove(poll);
                    }
                } else {
                    a.f43493a.add(poll);
                }
            }
        }
        if (!a.f43493a.isEmpty()) {
            a.sendEmptyMessage(1929);
        }
        a.f43494b = false;
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        this.f43458b = false;
        int i3 = this.f43457a;
        if (i3 == 0) {
            i = C18235c.f43443c;
            i2 = C18235c.f43444d;
        } else if (i3 == 1) {
            i = C18235c.f43451k;
            i2 = C18235c.f43452l;
        } else if (i3 == 2) {
            i = C18235c.f43447g;
            i2 = C18235c.f43448h;
        } else if (i3 != 3) {
            i = C18235c.f43443c;
            i2 = C18235c.f43444d;
        } else {
            i = C18235c.f43441a;
            i2 = C18235c.f43442b;
        }
        super.overridePendingTransition(i, i2);
    }

    /* renamed from: a */
    public final void mo29101a(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    @Override // com.bytedance.common.utility.AbstractC13615f
    public final void showCustomLongToast(int i, String str) {
        if (mo29094u()) {
            m33942a().mo29115a(str, i);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
    public final void onActivityResult(int i, int i2, Intent intent) {
        HandlerC18250b.m33961a().mo29121a(this);
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.bytedance.common.utility.AbstractC13615f
    public final void showCustomToast(int i, String str, int i2, int i3) {
        if (mo29094u()) {
            C18248a a = m33942a();
            a.f43472h = (long) i2;
            a.f43467c = i3;
            a.mo29115a(str, i);
        }
    }
}

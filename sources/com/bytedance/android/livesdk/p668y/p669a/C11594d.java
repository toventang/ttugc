package com.bytedance.android.livesdk.p668y.p669a;

import com.bytedance.android.livesdk.p668y.p670b.C11596a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.y.a.d */
final /* synthetic */ class C11594d implements AbstractC88433f {

    /* renamed from: a */
    private final C11591a f27749a;

    static {
        Covode.recordClassIndex(13260);
    }

    C11594d(C11591a aVar) {
        this.f27749a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C11591a aVar = this.f27749a;
        long j = ((C11596a) obj).f27751a;
        if (j > 0) {
            int i = (int) (j / 1000);
            int i2 = i / 60;
            int i3 = i % 60;
            String valueOf = i2 >= 10 ? String.valueOf(i2) : "0".concat(String.valueOf(i2));
            String valueOf2 = i3 >= 10 ? String.valueOf(i3) : "0".concat(String.valueOf(i3));
            aVar.f27742a.setText(valueOf);
            aVar.f27743b.setText(valueOf2);
        }
    }
}

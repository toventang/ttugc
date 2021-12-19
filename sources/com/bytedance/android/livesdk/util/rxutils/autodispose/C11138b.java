package com.bytedance.android.livesdk.util.rxutils.autodispose;

import androidx.lifecycle.AbstractC1196i;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.p649b.AbstractC11139a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.p649b.C11140b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.b */
final /* synthetic */ class C11138b implements AbstractC11139a {

    /* renamed from: a */
    static final AbstractC11139a f26757a = new C11138b();

    static {
        Covode.recordClassIndex(12765);
    }

    private C11138b() {
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.p649b.AbstractC11139a, p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        AbstractC1196i.EnumC1198a aVar = (AbstractC1196i.EnumC1198a) obj;
        int i = C11126a.C111271.f26748a[aVar.ordinal()];
        if (i == 1) {
            return AbstractC1196i.EnumC1198a.ON_DESTROY;
        }
        if (i == 2) {
            return AbstractC1196i.EnumC1198a.ON_STOP;
        }
        if (i == 3) {
            return AbstractC1196i.EnumC1198a.ON_PAUSE;
        }
        if (i == 4) {
            return AbstractC1196i.EnumC1198a.ON_STOP;
        }
        throw new C11140b("Lifecycle has ended! Last event was ".concat(String.valueOf(aVar)));
    }
}

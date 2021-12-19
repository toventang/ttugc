package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.b */
public final class C33072b implements AbstractC33101v {

    /* renamed from: a */
    public WeakReference<ActivityC17312a> f78632a;

    static {
        Covode.recordClassIndex(39884);
    }

    /* renamed from: a */
    private final ActivityC17312a m67769a() {
        ActivityC17312a aVar;
        WeakReference<ActivityC17312a> weakReference = this.f78632a;
        if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
            C89219l.m154716b(aVar, "");
            if (C33067a.m67725a(aVar)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo58855b(String str) {
        ActivityC17312a a = m67769a();
        if (a != null) {
            new C23144b(a).mo37635a(str).mo37637b();
        }
    }

    /* renamed from: a */
    public final void mo58854a(String str) {
        ActivityC17312a a = m67769a();
        if (a != null) {
            new C23144b(a).mo37635a(str).mo37637b();
        }
    }

    @Override // com.bytedance.common.utility.AbstractC13615f
    public final void showCustomLongToast(int i, String str) {
        mo58855b(str);
    }

    @Override // com.bytedance.common.utility.AbstractC13615f
    public final void showCustomToast(int i, String str, int i2, int i3) {
        mo58855b(str);
    }
}

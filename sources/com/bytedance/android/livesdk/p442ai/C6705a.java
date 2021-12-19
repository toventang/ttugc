package com.bytedance.android.livesdk.p442ai;

import android.content.Context;
import com.bytedance.android.live.p250i.p251a.AbstractC4352a;
import com.bytedance.android.live.p250i.p252b.C4360b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6552h;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1206f.C17309b;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.ai.a */
public final class C6705a implements AbstractC4352a {

    /* renamed from: a */
    static String f16632a;

    /* renamed from: b */
    WeakReference<AbstractC4352a.AbstractC4353a> f16633b;

    static {
        Covode.recordClassIndex(7443);
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4352a
    /* renamed from: a */
    public final String mo10102a() {
        String str = f16632a;
        if (str != null) {
            return str;
        }
        Context context = ((IHostContext) C6193a.m13435a(IHostContext.class)).context();
        if (context != null) {
            f16632a = C17309b.m32048a(context, C17309b.f41588b).mo27620a("hardware_info_cpu_soc", (String) null);
        }
        return f16632a;
    }

    /* renamed from: com.bytedance.android.livesdk.ai.a$a */
    public static final class C6706a implements C4360b.AbstractC4362b<AbstractC4352a> {
        static {
            Covode.recordClassIndex(7444);
        }

        @Override // com.bytedance.android.live.p250i.p252b.C4360b.AbstractC4362b
        /* renamed from: a */
        public final C4360b.AbstractC4362b.C4363a<AbstractC4352a> mo10117a(C4360b.AbstractC4362b.C4363a<AbstractC4352a> aVar) {
            aVar.f11884a = (R) new C6705a();
            aVar.f11885b = true;
            return aVar;
        }
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4352a
    /* renamed from: a */
    public final void mo10103a(AbstractC4352a.AbstractC4353a aVar) {
        this.f16633b = new WeakReference<>(aVar);
        C6552h.m14010a().mo12689a(new CallableC6712b(this));
    }
}

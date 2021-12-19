package com.bytedance.android.live.p250i.p252b;

import com.bytedance.android.live.p250i.p251a.AbstractC4352a;
import com.bytedance.android.live.p250i.p251a.AbstractC4354b;
import com.bytedance.android.live.p379n.AbstractC5771e;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p379n.AbstractC5779l;
import com.bytedance.android.livesdk.p442ai.C6741n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.live.i.b.d */
public class C4365d implements AbstractC4359a {

    /* renamed from: a */
    private static volatile C4365d f11887a;

    static {
        Covode.recordClassIndex(4939);
    }

    @Override // com.bytedance.android.live.p250i.p252b.AbstractC4359a
    /* renamed from: a */
    public final AbstractC5777j mo10110a() {
        return (AbstractC5777j) C4360b.m10458a().mo10116a(AbstractC5777j.class);
    }

    @Override // com.bytedance.android.live.p250i.p252b.AbstractC4359a
    /* renamed from: b */
    public final C6741n mo10111b() {
        return (C6741n) C4360b.m10458a().mo10116a(C6741n.class);
    }

    @Override // com.bytedance.android.live.p250i.p252b.AbstractC4359a
    /* renamed from: c */
    public final AbstractC5771e mo10112c() {
        return (AbstractC5771e) C4360b.m10458a().mo10116a(AbstractC5771e.class);
    }

    @Override // com.bytedance.android.live.p250i.p252b.AbstractC4359a
    /* renamed from: d */
    public final AbstractC5779l mo10113d() {
        return (AbstractC5779l) C4360b.m10458a().mo10116a(AbstractC5779l.class);
    }

    @Override // com.bytedance.android.live.p250i.p252b.AbstractC4359a
    /* renamed from: e */
    public final AbstractC4354b mo10114e() {
        return (AbstractC4354b) C4360b.m10458a().mo10116a(AbstractC4354b.class);
    }

    @Override // com.bytedance.android.live.p250i.p252b.AbstractC4359a
    /* renamed from: f */
    public final AbstractC4352a mo10115f() {
        return (AbstractC4352a) C4360b.m10458a().mo10116a(AbstractC4352a.class);
    }

    /* renamed from: g */
    public static AbstractC4359a m10462g() {
        MethodCollector.m26663i(12213);
        if (f11887a == null) {
            synchronized (C4365d.class) {
                try {
                    if (f11887a == null) {
                        f11887a = new C4365d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12213);
                    throw th;
                }
            }
        }
        C4365d dVar = f11887a;
        MethodCollector.m26664o(12213);
        return dVar;
    }
}

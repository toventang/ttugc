package com.p2082ss.ugc.effectplatform.algorithm;

import com.bef.effectsdk.RequirementResourceMapper;
import com.bytedance.covode.number.Covode;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;

/* renamed from: com.ss.ugc.effectplatform.algorithm.i */
public final class C86716i {

    /* renamed from: a */
    public static final C86716i f195548a = new C86716i();

    private C86716i() {
    }

    static {
        Covode.recordClassIndex(102415);
    }

    /* renamed from: a */
    public static final String[] m150217a(String[] strArr) {
        try {
            return RequirementResourceMapper.peekResourcesNeededByRequirements(strArr);
        } catch (UnsatisfiedLinkError unused) {
            C88060b.m153136a("RequirementResourceMapper", "not load effect so", null);
            C86705b.f195526a.loadLibrary("effect");
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        return RequirementResourceMapper.peekResourcesNeededByRequirements(strArr);
    }
}

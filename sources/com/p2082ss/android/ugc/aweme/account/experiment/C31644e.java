package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.p2082ss.android.ugc.aweme.EnumC35462cf;
import com.p2082ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl;
import com.p2082ss.android.ugc.aweme.account.login.EnumC32330v;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.e */
public final class C31644e {

    /* renamed from: a */
    public static final C31644e f75691a = new C31644e();

    /* renamed from: b */
    private static final int f75692b = 1;

    /* renamed from: c */
    private static final int f75693c = 2;

    /* renamed from: d */
    private static final int f75694d = 3;

    /* renamed from: e */
    private static final AbstractC89244h f75695e = C89250i.m154773a((AbstractC89171a) C31645a.f75696a);

    private C31644e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.e$a */
    static final class C31645a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C31645a f75696a = new C31645a();

        static {
            Covode.recordClassIndex(38376);
        }

        C31645a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25411a("remove_vk", ClientExpManager.remove_vk()));
        }
    }

    static {
        Covode.recordClassIndex(38375);
    }

    /* renamed from: a */
    public static EnumC32330v[] m65952a(EnumC32330v[] vVarArr) {
        int b;
        C89219l.m154721d(vVarArr, "");
        if (!AccountExperimentLayerServiceImpl.m65977b().mo57062a(EnumC35462cf.DEPRIORITIZE_VK)) {
            return vVarArr;
        }
        int intValue = ((Number) f75695e.getValue()).intValue();
        if (intValue == f75692b) {
            ArrayList arrayList = new ArrayList();
            for (EnumC32330v vVar : vVarArr) {
                if (vVar != EnumC32330v.VK) {
                    arrayList.add(vVar);
                }
            }
            Object[] array = arrayList.toArray(new EnumC32330v[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return (EnumC32330v[]) array;
        }
        if (intValue == f75693c && (b = C89064i.m154493b(vVarArr, EnumC32330v.VK)) >= 0 && b != vVarArr.length - 1) {
            int i = b + 1;
            vVarArr[b] = vVarArr[i];
            vVarArr[i] = EnumC32330v.VK;
        }
        return vVarArr;
    }
}

package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b;

import androidx.fragment.app.ActivityC0945e;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3149a.AbstractC54866a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54823a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54841a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.b */
public final class C54868b implements AbstractC54866a {

    /* renamed from: a */
    private final ActivityC0945e f125642a;

    /* renamed from: b */
    private final String f125643b;

    /* renamed from: c */
    private final String f125644c;

    /* renamed from: d */
    private final AbstractC89172b<String, Boolean> f125645d;

    /* renamed from: e */
    private final AbstractC89172b<Integer, C89391z> f125646e;

    static {
        Covode.recordClassIndex(64587);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3149a.AbstractC54866a
    /* renamed from: a */
    public final void mo91875a(AbstractC56237a aVar, int i) {
        boolean z;
        C89219l.m154721d(aVar, "");
        if (i == 0) {
            AbstractC56238b bVar = aVar.f128244w;
            if (bVar != null) {
                bVar.mo91861a(this.f125642a, aVar, i);
            }
            this.f125646e.invoke(Integer.valueOf(aVar.mo91860c()));
        } else if (i == 1 || i == 2) {
            if (aVar.f128242u == null) {
                aVar.f128242u = new HashMap<>();
            }
            HashMap<String, String> hashMap = aVar.f128242u;
            C89219l.m154716b(hashMap, "");
            hashMap.put("enter_from", this.f125643b);
            if (this.f125644c.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                HashMap<String, String> hashMap2 = aVar.f128242u;
                C89219l.m154716b(hashMap2, "");
                hashMap2.put("enter_method", "cell");
            } else {
                HashMap<String, String> hashMap3 = aVar.f128242u;
                C89219l.m154716b(hashMap3, "");
                hashMap3.put("enter_method", this.f125644c);
            }
            AbstractC56238b bVar2 = aVar.f128244w;
            if (bVar2 != null) {
                bVar2.mo91861a(this.f125642a, aVar, i);
            }
            if (aVar.mo91860c() == 20) {
                AbstractC89172b<String, Boolean> bVar3 = this.f125645d;
                String bL_ = aVar.bL_();
                C89219l.m154716b(bL_, "");
                if (bVar3.invoke(bL_).booleanValue()) {
                    return;
                }
            }
            if (i != 2 || !(aVar instanceof C54841a)) {
                aVar.f128238q = 0;
            }
        }
    }

    public /* synthetic */ C54868b(ActivityC0945e eVar, String str, String str2) {
        this(eVar, str, str2, new AbstractC89172b<String, Boolean>(C55339a.f126553a) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b.C54868b.C548691 */

            static {
                Covode.recordClassIndex(64588);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(String str) {
                return Boolean.valueOf(C55339a.m101148a(AbstractC17420a.C17421a.m32276a().mo27720a(str)));
            }
        }, new AbstractC89172b<Integer, C89391z>(C54823a.f125589a) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b.C54868b.C548702 */

            static {
                Covode.recordClassIndex(64589);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Integer num) {
                String str;
                String str2;
                int intValue = num.intValue();
                C54823a.C54827d dVar = C54823a.C54827d.f125593a;
                C89219l.m154721d(dVar, "");
                if (C55052e.m100674e()) {
                    C0484a aVar = new C0484a();
                    if (intValue == 20) {
                        str2 = "group";
                    } else {
                        str2 = "private";
                    }
                    aVar.put("chat_type", str2);
                    aVar.put("target", "report");
                    dVar.invoke("chat_list_feedback", aVar);
                } else {
                    C0484a aVar2 = new C0484a();
                    if (intValue == 1) {
                        str = "message_box";
                    } else {
                        str = "message";
                    }
                    aVar2.put("enter_from", str);
                    dVar.invoke("chat_list_long_press", aVar2);
                }
                return C89391z.f203057a;
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.String, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private C54868b(ActivityC0945e eVar, String str, String str2, AbstractC89172b<? super String, Boolean> bVar, AbstractC89172b<? super Integer, C89391z> bVar2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f125642a = eVar;
        this.f125643b = str;
        this.f125644c = str2;
        this.f125645d = bVar;
        this.f125646e = bVar2;
    }
}

package com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.h */
public final class C68362h extends C39088c<AbstractC39085b<BaseResponse>, AbstractC68349a> {
    static {
        Covode.recordClassIndex(80590);
    }

    public C68362h() {
        mo67838a(new AbstractC39085b<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68362h.C683631 */

            static {
                Covode.recordClassIndex(80591);
            }

            /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.h$1$a */
            static final class CallableC68364a<V> implements Callable {

                /* renamed from: a */
                final /* synthetic */ Object[] f153015a;

                static {
                    Covode.recordClassIndex(80592);
                }

                CallableC68364a(Object[] objArr) {
                    this.f153015a = objArr;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object[] objArr = this.f153015a;
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    Object obj2 = objArr[1];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    return PushSettingsApiManager.m120632c((String) obj, ((Integer) obj2).intValue());
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                C89219l.m154721d(objArr, "");
                if (objArr.length != 2 || !(objArr[0] instanceof String) || !(objArr[1] instanceof Integer)) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(Object... objArr) {
                C89219l.m154721d(objArr, "");
                if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                    return false;
                }
                C34608n.m70658a().mo61083a(this.mHandler, new CallableC68364a(objArr), 0);
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        AbstractC68349a aVar;
        AbstractC39085b bVar = this.f92286h;
        if (bVar != null && (aVar = (AbstractC68349a) this.f92287i) != null) {
            T t = bVar.mData;
            C89219l.m154716b(t, "");
            aVar.mo108810a(t);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        AbstractC68349a aVar = (AbstractC68349a) this.f92287i;
        if (aVar != null) {
            aVar.mo108809a();
        }
    }
}

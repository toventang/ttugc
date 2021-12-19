package com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39144m;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.f */
public final class C68356f extends C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> {
    static {
        Covode.recordClassIndex(80584);
    }

    public C68356f() {
        mo67838a(new AbstractC39085b<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68356f.C683571 */

            static {
                Covode.recordClassIndex(80585);
            }

            /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.f$1$a */
            static final class CallableC68358a<V> implements Callable {

                /* renamed from: a */
                final /* synthetic */ Object[] f153009a;

                static {
                    Covode.recordClassIndex(80586);
                }

                CallableC68358a(Object[] objArr) {
                    this.f153009a = objArr;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object obj = this.f153009a[0];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    return PushSettingsApiManager.m120629b(((Integer) obj).intValue());
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                C89219l.m154721d(objArr, "");
                if (objArr.length == 1) {
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(Object... objArr) {
                C89219l.m154721d(objArr, "");
                if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                    return false;
                }
                C34608n.m70658a().mo61083a(this.mHandler, new CallableC68358a(objArr), 0);
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92286h != null) {
            AbstractC39085b bVar = this.f92286h;
            if (bVar == null) {
                C89219l.m154715b();
            }
            if (bVar.mData != null && this.f92287i != null) {
                AbstractC39144m mVar = this.f92287i;
                if (mVar == null) {
                    C89219l.m154715b();
                }
                ((AbstractC68350b) mVar).aD_();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        C89219l.m154721d(exc, "");
        if (this.f92287i != null) {
            AbstractC39144m mVar = this.f92287i;
            if (mVar == null) {
                C89219l.m154715b();
            }
            ((AbstractC68350b) mVar).cm_();
        }
    }
}

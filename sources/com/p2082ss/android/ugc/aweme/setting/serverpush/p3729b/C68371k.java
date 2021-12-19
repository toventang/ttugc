package com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68346d;
import java.util.Arrays;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.k */
public final class C68371k extends C39088c<AbstractC39085b<C68346d>, AbstractC68352d> {
    static {
        Covode.recordClassIndex(80599);
    }

    public C68371k() {
        mo67838a(new AbstractC39085b<C68346d>() {
            /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68371k.C683721 */

            static {
                Covode.recordClassIndex(80600);
            }

            /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.k$1$a */
            static final class CallableC68373a<V> implements Callable {

                /* renamed from: a */
                public static final CallableC68373a f153022a = new CallableC68373a();

                static {
                    Covode.recordClassIndex(80601);
                }

                CallableC68373a() {
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return PushSettingsApiManager.m120631b();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                C89219l.m154721d(objArr, "");
                if (objArr.length == 0) {
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
                C34608n.m70658a().mo61083a(this.mHandler, CallableC68373a.f153022a, 0);
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        T t;
        AbstractC39085b bVar = this.f92286h;
        if (bVar != null && (t = bVar.mData) != null) {
            ((AbstractC68352d) this.f92287i).mo108811a(t);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        AbstractC68352d dVar = (AbstractC68352d) this.f92287i;
        if (dVar != null) {
            dVar.mo108812b();
        }
    }
}

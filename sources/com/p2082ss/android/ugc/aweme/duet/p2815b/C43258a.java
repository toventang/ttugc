package com.p2082ss.android.ugc.aweme.duet.p2815b;

import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.duet.api.API;
import com.p2082ss.android.ugc.aweme.duet.p2814a.C43256c;
import com.p2082ss.android.ugc.aweme.duet.p2816ui.AbstractC43296h;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.duet.b.a */
public final class C43258a extends C39088c<AbstractC39085b<C43256c>, AbstractC43296h> {

    /* renamed from: a */
    public static final C43260a f100992a = new C43260a((byte) 0);

    static {
        Covode.recordClassIndex(51461);
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.b.a$a */
    public static final class C43260a {
        static {
            Covode.recordClassIndex(51463);
        }

        private C43260a() {
        }

        public /* synthetic */ C43260a(byte b) {
            this();
        }
    }

    public C43258a() {
        mo67838a(new AbstractC39085b<C43256c>(this) {
            /* class com.p2082ss.android.ugc.aweme.duet.p2815b.C43258a.C432591 */

            /* renamed from: a */
            final /* synthetic */ C43258a f100993a;

            static {
                Covode.recordClassIndex(51462);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                C89219l.m154721d(objArr, "");
                return true;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f100993a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(Object... objArr) {
                C89219l.m154721d(objArr, "");
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                WeakHandler weakHandler = this.mHandler;
                C89219l.m154716b(weakHandler, "");
                Object obj = objArr[0];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                if (!C80580in.m139687c()) {
                    C34608n.f81665a.mo61083a(weakHandler, new CallableC43261b(str), 0);
                }
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92287i != null && this.f92286h != null) {
            AbstractC39085b bVar = this.f92286h;
            C89219l.m154716b(bVar, "");
            T t = bVar.mData;
            C89219l.m154716b(t, "");
            ((AbstractC43296h) this.f92287i).mo73790a((C43256c) t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.b.a$b */
    static final class CallableC43261b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f100994a;

        static {
            Covode.recordClassIndex(51464);
        }

        CallableC43261b(String str) {
            this.f100994a = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str = this.f100994a;
            C89219l.m154721d(str, "");
            String str2 = Api.f79771d;
            C89219l.m154716b(str2, "");
            C43256c cVar = ((API) C18097a.m33696a().mo28816a(str2).mo28858a(API.class)).getDuetDetailModel(str).get();
            C89219l.m154716b(cVar, "");
            return cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        C89219l.m154721d(exc, "");
        if (this.f92287i != null) {
            ((AbstractC43296h) this.f92287i).mo73791a(exc);
        }
    }
}

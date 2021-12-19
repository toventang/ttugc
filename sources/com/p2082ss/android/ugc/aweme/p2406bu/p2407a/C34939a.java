package com.p2082ss.android.ugc.aweme.p2406bu.p2407a;

import android.os.Handler;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi;
import com.p2082ss.android.ugc.aweme.mvtemplate.p3486a.C61248d;
import com.p2082ss.android.ugc.aweme.mvtemplate.view.AbstractC61260a;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bu.a.a */
public final class C34939a extends C39088c<AbstractC39085b<C61248d>, AbstractC61260a> {

    /* renamed from: a */
    public static final C34941a f82424a = new C34941a((byte) 0);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bu.a.a$c */
    public final /* synthetic */ class CallableC34943c implements Callable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f82427a;

        static {
            Covode.recordClassIndex(41964);
        }

        CallableC34943c(AbstractC89171a aVar) {
            this.f82427a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f82427a.invoke();
        }
    }

    static {
        Covode.recordClassIndex(41960);
    }

    /* renamed from: com.ss.android.ugc.aweme.bu.a.a$a */
    public static final class C34941a {
        static {
            Covode.recordClassIndex(41962);
        }

        private C34941a() {
        }

        public /* synthetic */ C34941a(byte b) {
            this();
        }
    }

    public C34939a() {
        mo67838a(new AbstractC39085b<C61248d>(this) {
            /* class com.p2082ss.android.ugc.aweme.p2406bu.p2407a.C34939a.C349401 */

            /* renamed from: a */
            final /* synthetic */ C34939a f82425a;

            static {
                Covode.recordClassIndex(41961);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                C89219l.m154721d(objArr, "");
                return true;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f82425a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(Object... objArr) {
                C89219l.m154721d(objArr, "");
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                if (objArr.length >= 6) {
                    WeakHandler weakHandler = this.mHandler;
                    C89219l.m154716b(weakHandler, "");
                    Object obj = objArr[1];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    Object obj2 = objArr[2];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    ((Integer) obj2).intValue();
                    C34939a.m71330a(weakHandler, (String) obj);
                } else {
                    WeakHandler weakHandler2 = this.mHandler;
                    C89219l.m154716b(weakHandler2, "");
                    Object obj3 = objArr[1];
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    Object obj4 = objArr[2];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    ((Integer) obj4).intValue();
                    C34939a.m71330a(weakHandler2, (String) obj3);
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
            ((AbstractC61260a) this.f92287i).mo98785a((C61248d) t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bu.a.a$b */
    public static final class C34942b extends AbstractC89220m implements AbstractC89171a<C61248d> {

        /* renamed from: a */
        final /* synthetic */ String f82426a;

        static {
            Covode.recordClassIndex(41963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34942b(String str) {
            super(0);
            this.f82426a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61248d invoke() {
            String str = this.f82426a;
            C89219l.m154721d(str, "");
            String str2 = MovieDetailAPi.f139100e;
            C89219l.m154716b(str2, "");
            C61248d dVar = ((MovieDetailAPi.MvDetail) C18097a.m33696a().mo28816a(str2).mo28858a(MovieDetailAPi.MvDetail.class)).getMvDetail(str).get();
            C89219l.m154716b(dVar, "");
            return dVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        C89219l.m154721d(exc, "");
        if (this.f92287i != null) {
            ((AbstractC61260a) this.f92287i).mo98786a(exc);
        }
    }

    /* renamed from: a */
    public static void m71330a(Handler handler, String str) {
        C34608n.f81665a.mo61083a(handler, new CallableC34943c(new C34942b(str)), 0);
    }
}

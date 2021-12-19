package com.p2082ss.android.ugc.aweme.user.p4194a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.AbstractC40763cv;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C43200dr;
import com.p2082ss.android.ugc.aweme.account.network.AbstractC32876a;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.trill.R;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.user.a.c */
public final class C80039c {

    /* renamed from: a */
    public static final C80039c f179357a = new C80039c();

    private C80039c() {
    }

    static {
        Covode.recordClassIndex(93270);
    }

    /* renamed from: com.ss.android.ugc.aweme.user.a.c$a */
    public static final class C80040a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C80040a f179358a = new C80040a();

        static {
            Covode.recordClassIndex(93271);
        }

        C80040a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return new AbstractC90213b() {
                /* class com.p2082ss.android.ugc.aweme.user.p4194a.C80039c.C80040a.C800411 */

                static {
                    Covode.recordClassIndex(93272);
                }

                @Override // org.p4663a.AbstractC90213b
                /* renamed from: a_ */
                public final void mo57509a_(AbstractC90214c<? super C80038b> cVar) {
                    AbstractC32876a aVar = C43200dr.f100694b;
                    C89219l.m154716b(aVar, "");
                    cVar.onNext(aVar.mo58679a().mo46670a(str, (Class) C80038b.class));
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.a.c$c */
    public static final class C80043c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC40763cv f179361a;

        static {
            Covode.recordClassIndex(93274);
        }

        public C80043c(AbstractC40763cv cvVar) {
            this.f179361a = cvVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC40763cv cvVar = this.f179361a;
            if (cvVar != null) {
                cvVar.mo57507a(C31291a.f74991a.getString(R.string.dck));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.a.c$b */
    public static final class C80042b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC40763cv f179360a;

        static {
            Covode.recordClassIndex(93273);
        }

        public C80042b(AbstractC40763cv cvVar) {
            this.f179360a = cvVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C80037a aVar;
            boolean z;
            C80037a aVar2;
            Boolean bool;
            C80038b bVar = (C80038b) obj;
            String str2 = null;
            if (bVar != null) {
                str = bVar.f179355a;
            } else {
                str = null;
            }
            if (TextUtils.equals(str, "success")) {
                if (bVar == null || (aVar2 = bVar.f179356b) == null || (bool = aVar2.f179352a) == null) {
                    z = false;
                } else {
                    z = bool.booleanValue();
                }
                C80039c.m138780a(z);
                AbstractC40763cv cvVar = this.f179360a;
                if (cvVar != null) {
                    cvVar.mo57508a(z);
                    return;
                }
                return;
            }
            AbstractC40763cv cvVar2 = this.f179360a;
            if (cvVar2 != null) {
                if (!(bVar == null || (aVar = bVar.f179356b) == null)) {
                    str2 = aVar.f179353b;
                }
                cvVar2.mo57507a(str2);
            }
        }
    }

    /* renamed from: a */
    public static final void m138780a(boolean z) {
        Keva.getRepo("password_status").storeBoolean(C80061e.f179403k.mo123517e() + "_password_set_status", z);
    }
}

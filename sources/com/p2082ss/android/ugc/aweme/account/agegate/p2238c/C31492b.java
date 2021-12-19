package com.p2082ss.android.ugc.aweme.account.agegate.p2238c;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.AbstractC22346c;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22317d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.AbstractC40763cv;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p2082ss.android.ugc.aweme.account.util.C33052u;
import java.util.List;
import org.json.JSONObject;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b */
public final class C31492b {

    /* renamed from: a */
    public static final C31493a f75353a = new C31493a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f75354b = C89250i.m154773a((AbstractC89171a) C31501g.f75370a);

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$c */
    public static final class C31495c {
        @AbstractC27891c(mo46611a = "message")

        /* renamed from: a */
        public final String f75359a;
        @AbstractC27891c(mo46611a = "data")

        /* renamed from: b */
        public final C31499e f75360b;

        static {
            Covode.recordClassIndex(38212);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31495c)) {
                return false;
            }
            C31495c cVar = (C31495c) obj;
            return C89219l.m154714a(this.f75359a, cVar.f75359a) && C89219l.m154714a(this.f75360b, cVar.f75360b);
        }

        public final int hashCode() {
            String str = this.f75359a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C31499e eVar = this.f75360b;
            if (eVar != null) {
                i = eVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "UpdateUserNameNetworkEntity(message=" + this.f75359a + ", data=" + this.f75360b + ")";
        }
    }

    static {
        Covode.recordClassIndex(38209);
    }

    /* renamed from: a */
    public final String mo57494a() {
        return (String) this.f75354b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$a */
    public static final class C31493a {
        static {
            Covode.recordClassIndex(38210);
        }

        private C31493a() {
        }

        public /* synthetic */ C31493a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$d */
    public static abstract class AbstractC31496d {
        static {
            Covode.recordClassIndex(38213);
        }

        private AbstractC31496d() {
        }

        /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$d$b */
        public static final class C31498b extends AbstractC31496d {

            /* renamed from: a */
            public static final C31498b f75363a = new C31498b();

            private C31498b() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(38215);
            }
        }

        public /* synthetic */ AbstractC31496d(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$d$a */
        public static final class C31497a extends AbstractC31496d {

            /* renamed from: a */
            public final int f75361a;

            /* renamed from: b */
            public final String f75362b;

            static {
                Covode.recordClassIndex(38214);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C31497a)) {
                    return false;
                }
                C31497a aVar = (C31497a) obj;
                return this.f75361a == aVar.f75361a && C89219l.m154714a(this.f75362b, aVar.f75362b);
            }

            public final int hashCode() {
                int i = this.f75361a * 31;
                String str = this.f75362b;
                return i + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                return "Invalid(errorCode=" + this.f75361a + ", description=" + this.f75362b + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C31497a(int i, String str) {
                super((byte) 0);
                C89219l.m154721d(str, "");
                this.f75361a = i;
                this.f75362b = str;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$e */
    public static final class C31499e {
        @AbstractC27891c(mo46611a = "error_code")

        /* renamed from: a */
        public final int f75364a;
        @AbstractC27891c(mo46611a = "description")

        /* renamed from: b */
        public final String f75365b;
        @AbstractC27891c(mo46611a = "login_name")

        /* renamed from: c */
        public final String f75366c;

        static {
            Covode.recordClassIndex(38216);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31499e)) {
                return false;
            }
            C31499e eVar = (C31499e) obj;
            return this.f75364a == eVar.f75364a && C89219l.m154714a(this.f75365b, eVar.f75365b) && C89219l.m154714a(this.f75366c, eVar.f75366c);
        }

        public final int hashCode() {
            int i = this.f75364a * 31;
            String str = this.f75365b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f75366c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "UserNameDataEntity(errorCode=" + this.f75364a + ", description=" + this.f75365b + ", loginName=" + this.f75366c + ")";
        }

        private /* synthetic */ C31499e() {
            this("", "");
        }

        private C31499e(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f75364a = 0;
            this.f75365b = str;
            this.f75366c = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$b */
    public static final class C31494b {
        @AbstractC27891c(mo46611a = "login_name")

        /* renamed from: a */
        public final String f75355a = null;
        @AbstractC27891c(mo46611a = "description")

        /* renamed from: b */
        public final String f75356b = null;
        @AbstractC27891c(mo46611a = "error_code")

        /* renamed from: c */
        public final String f75357c = null;
        @AbstractC27891c(mo46611a = "recommend_usernames")

        /* renamed from: d */
        public final List<String> f75358d = null;

        static {
            Covode.recordClassIndex(38211);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31494b)) {
                return false;
            }
            C31494b bVar = (C31494b) obj;
            return C89219l.m154714a(this.f75355a, bVar.f75355a) && C89219l.m154714a(this.f75356b, bVar.f75356b) && C89219l.m154714a(this.f75357c, bVar.f75357c) && C89219l.m154714a(this.f75358d, bVar.f75358d);
        }

        public final int hashCode() {
            String str = this.f75355a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f75356b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f75357c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            List<String> list = this.f75358d;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "LoginNameCheckData(loginName=" + this.f75355a + ", description=" + this.f75356b + ", error_code=" + this.f75357c + ", suggestions=" + this.f75358d + ")";
        }

        private C31494b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$g */
    static final class C31501g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C31501g f75370a = new C31501g();

        static {
            Covode.recordClassIndex(38218);
        }

        C31501g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C33052u.m67704a(C36085cj.m73552f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$h */
    public static final class C31502h implements AbstractC40763cv {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f75371a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f75372b;

        static {
            Covode.recordClassIndex(38219);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
        /* renamed from: a */
        public final void mo57507a(String str) {
            this.f75372b.invoke(str);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
        /* renamed from: a */
        public final void mo57508a(boolean z) {
            this.f75371a.invoke(Boolean.valueOf(z));
        }

        C31502h(AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f75371a = bVar;
            this.f75372b = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$f */
    public static final class C31500f extends AbstractC22346c<C22317d> {

        /* renamed from: c */
        final /* synthetic */ String f75367c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f75368d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89171a f75369e;

        static {
            Covode.recordClassIndex(38217);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: e */
        public final /* synthetic */ void mo36686e(C22317d dVar) {
            if (dVar == null) {
                this.f75368d.invoke(null, null);
            } else {
                this.f75369e.invoke();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: a */
        public final /* synthetic */ void mo36681a(C22317d dVar, int i) {
            JSONObject jSONObject;
            List<String> list;
            C22317d dVar2 = dVar;
            String str = null;
            if (dVar2 != null) {
                jSONObject = dVar2.f52748v;
            } else {
                jSONObject = null;
            }
            C31494b bVar = (C31494b) NetworkProxyAccount.f78256b.mo58679a().mo46670a(String.valueOf(jSONObject), C31494b.class);
            if (bVar != null) {
                list = bVar.f75358d;
            } else {
                list = null;
            }
            AbstractC89183m mVar = this.f75368d;
            if (dVar2 != null) {
                str = dVar2.f52717f;
            }
            mVar.invoke(list, str);
        }

        C31500f(String str, AbstractC89183m mVar, AbstractC89171a aVar) {
            this.f75367c = str;
            this.f75368d = mVar;
            this.f75369e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$i */
    static final class C31503i<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C31492b f75373a;

        static {
            Covode.recordClassIndex(38220);
        }

        C31503i(C31492b bVar) {
            this.f75373a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return new AbstractC90213b(this) {
                /* class com.p2082ss.android.ugc.aweme.account.agegate.p2238c.C31492b.C31503i.C315041 */

                /* renamed from: a */
                final /* synthetic */ C31503i f75374a;

                static {
                    Covode.recordClassIndex(38221);
                }

                {
                    this.f75374a = r1;
                }

                @Override // org.p4663a.AbstractC90213b
                /* renamed from: a_ */
                public final void mo57509a_(AbstractC90214c<? super AbstractC31496d> cVar) {
                    AbstractC31496d dVar;
                    C31495c cVar2 = (C31495c) NetworkProxyAccount.f78256b.mo58679a().mo46670a(str, (Class) C31495c.class);
                    C89219l.m154716b(cVar2, "");
                    if (cVar2.f75360b.f75364a != 0) {
                        dVar = new AbstractC31496d.C31497a(cVar2.f75360b.f75364a, cVar2.f75360b.f75365b);
                    } else {
                        dVar = AbstractC31496d.C31498b.f75363a;
                    }
                    cVar.onNext(dVar);
                }
            };
        }
    }
}

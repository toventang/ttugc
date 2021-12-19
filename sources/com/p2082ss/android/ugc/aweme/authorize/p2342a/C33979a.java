package com.p2082ss.android.ugc.aweme.authorize.p2342a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.authorize.network.C34029a;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62712d;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62713e;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62714f;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62715g;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62700d;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62704h;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62706j;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.a.a */
public final class C33979a {

    /* renamed from: a */
    public static final C33980a f80372a = new C33980a((byte) 0);

    static {
        Covode.recordClassIndex(40910);
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.a.a$a */
    public static final class C33980a {
        static {
            Covode.recordClassIndex(40911);
        }

        private C33980a() {
        }

        public /* synthetic */ C33980a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.a.a$b */
    public static final class C33981b implements AbstractC88406ae<C62704h> {

        /* renamed from: a */
        final /* synthetic */ AbstractC62713e f80373a;

        static {
            Covode.recordClassIndex(40912);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        public C33981b(AbstractC62713e eVar) {
            this.f80373a = eVar;
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            C62704h hVar = new C62704h();
            hVar.f142157b = false;
            this.f80373a.mo60317a(hVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C62704h hVar) {
            C62704h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            hVar2.f142157b = TextUtils.equals("success", hVar2.f142156a);
            this.f80373a.mo60317a(hVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.a.a$c */
    public static final class C33982c implements AbstractC88406ae<C62706j> {

        /* renamed from: a */
        final /* synthetic */ AbstractC62714f f80374a;

        static {
            Covode.recordClassIndex(40913);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        public C33982c(AbstractC62714f fVar) {
            this.f80374a = fVar;
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            C62706j jVar = new C62706j();
            jVar.f142163b = false;
            this.f80374a.mo60318a(jVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C62706j jVar) {
            C62706j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            jVar2.f142163b = TextUtils.equals("success", jVar2.f142162a);
            this.f80374a.mo60318a(jVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.a.a$d */
    public static final class C33983d implements AbstractC88406ae<C62700d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC62712d f80375a;

        static {
            Covode.recordClassIndex(40914);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C33983d(AbstractC62712d dVar) {
            this.f80375a = dVar;
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            C62700d dVar = new C62700d();
            dVar.setStatusCode(-1);
            this.f80375a.mo60321b(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C62700d dVar) {
            C62700d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            Integer statusCode = dVar2.getStatusCode();
            if (statusCode != null && statusCode.intValue() == 0) {
                this.f80375a.mo60320a(dVar2);
            } else {
                this.f80375a.mo60321b(dVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.a.a$e */
    public static final class C33984e implements AbstractC88406ae<C62706j> {

        /* renamed from: a */
        final /* synthetic */ AbstractC62715g f80376a;

        static {
            Covode.recordClassIndex(40915);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        public C33984e(AbstractC62715g gVar) {
            this.f80376a = gVar;
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            C62706j jVar = new C62706j();
            jVar.f142163b = false;
            this.f80376a.mo60324a(jVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C62706j jVar) {
            C62706j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            jVar2.f142163b = TextUtils.equals("success", jVar2.f142162a);
            this.f80376a.mo60324a(jVar2);
        }
    }

    /* renamed from: a */
    public static void m69577a(String str, int i, String str2, String str3, String str4, AbstractC62712d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C34029a.f80478a.getAuthPageInfo(str, i, str2, str3, str4).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C33983d(dVar));
    }
}

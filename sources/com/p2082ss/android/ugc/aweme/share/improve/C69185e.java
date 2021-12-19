package com.p2082ss.android.ugc.aweme.share.improve;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.C68857ad;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89623h;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89133g;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.share.improve.e */
public final class C69185e {

    /* renamed from: a */
    public static final C69185e f154670a = new C69185e();

    private C69185e() {
    }

    static {
        Covode.recordClassIndex(81499);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e$b */
    public static final class C69189b<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ String f154681a;

        static {
            Covode.recordClassIndex(81503);
        }

        public C69189b(String str) {
            this.f154681a = str;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<String> oVar) {
            String str = "";
            C89219l.m154721d(oVar, str);
            String str2 = this.f154681a;
            if (str2 != null) {
                str = str2;
            }
            oVar.mo143049a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e$a */
    public static final class C69186a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f154671a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f154672b;

        /* renamed from: c */
        final /* synthetic */ String f154673c;

        /* renamed from: d */
        final /* synthetic */ String f154674d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f154675e;

        /* renamed from: f */
        final /* synthetic */ boolean f154676f;

        static {
            Covode.recordClassIndex(81500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69186a(C89233z.C89238e eVar, String str, String str2, C89233z.C89238e eVar2, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f154672b = eVar;
            this.f154673c = str;
            this.f154674d = str2;
            this.f154675e = eVar2;
            this.f154676f = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C69186a(this.f154672b, this.f154673c, this.f154674d, this.f154675e, this.f154676f, dVar);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C69186a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f154671a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C691871 r5 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.share.improve.C69185e.C69186a.C691871 */

                    /* renamed from: a */
                    int f154677a;

                    /* renamed from: b */
                    final /* synthetic */ C69186a f154678b;

                    static {
                        Covode.recordClassIndex(81501);
                    }

                    {
                        this.f154678b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.String */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* renamed from: a */
                        public static /* synthetic */ String m122286a(String str, String str2, String str3) {
                            C89219l.m154721d(str, "");
                            C89219l.m154721d(str3, "");
                            if (!C80580in.m139687c() && str2 != 0 && str2.length() != 0) {
                                C89233z.C89238e eVar = new C89233z.C89238e();
                                eVar.element = "";
                                C89233z.C89238e eVar2 = new C89233z.C89238e();
                                eVar2.element = str2;
                                eVar2.element = (T) C68857ad.m121524a(eVar2.element, str3);
                                Object unused = C89623h.m155552a(C89133g.INSTANCE, new C69186a(eVar, str, str3, eVar2, true, null));
                                T t = eVar.element;
                                if (C80538hl.m139614a(t) && t != null) {
                                    return t;
                                }
                                T t2 = eVar2.element;
                                C89219l.m154716b(t2, "");
                                return t2;
                            } else if (str2 == 0) {
                                return "";
                            } else {
                                return str2;
                            }
                        }
                    }

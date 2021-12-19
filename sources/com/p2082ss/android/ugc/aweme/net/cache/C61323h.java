package com.p2082ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p2082ss.android.ugc.aweme.utils.C80276bw;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89426h;
import p4632k.C89436q;

/* renamed from: com.ss.android.ugc.aweme.net.cache.h */
public final class C61323h {

    /* renamed from: b */
    public static final C61324a f139274b = new C61324a((byte) 0);

    /* renamed from: a */
    final C80276bw f139275a;

    static {
        Covode.recordClassIndex(71954);
    }

    /* renamed from: com.ss.android.ugc.aweme.net.cache.h$a */
    public static final class C61324a {
        static {
            Covode.recordClassIndex(71955);
        }

        private C61324a() {
        }

        public /* synthetic */ C61324a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.net.cache.h$b */
    public static final class C61325b {

        /* renamed from: a */
        final String f139276a;

        /* renamed from: b */
        final String f139277b;

        /* renamed from: c */
        final int f139278c;

        /* renamed from: d */
        final String f139279d;

        /* renamed from: e */
        public final String f139280e;

        /* renamed from: f */
        final List<C22027b> f139281f;

        /* renamed from: g */
        public final long f139282g;

        static {
            Covode.recordClassIndex(71956);
        }

        /* renamed from: com.ss.android.ugc.aweme.net.cache.h$b$a */
        public static final class C61326a implements TypedInput {

            /* renamed from: a */
            final /* synthetic */ C61325b f139283a;

            /* renamed from: b */
            final /* synthetic */ C80276bw.C80281c f139284b;

            static {
                Covode.recordClassIndex(71957);
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            public final long length() {
                return -1;
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            public final String mimeType() {
                return this.f139283a.f139280e;
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            /* renamed from: in */
            public final InputStream mo11577in() {
                InputStream inputStream = this.f139284b.f179799a[1];
                C89219l.m154716b(inputStream, "");
                return inputStream;
            }

            C61326a(C61325b bVar, C80276bw.C80281c cVar) {
                this.f139283a = bVar;
                this.f139284b = cVar;
            }
        }

        public C61325b(AbstractC89408aa aaVar) {
            C22027b bVar;
            C89219l.m154721d(aaVar, "");
            try {
                AbstractC89426h a = C89436q.m155160a(aaVar);
                this.f139276a = a.mo143850s();
                this.f139277b = a.mo143850s();
                this.f139278c = Integer.parseInt(a.mo143850s());
                this.f139279d = a.mo143850s();
                this.f139280e = a.mo143850s();
                this.f139282g = Long.parseLong(a.mo143850s());
                int parseInt = Integer.parseInt(a.mo143850s());
                this.f139281f = new ArrayList(parseInt);
                for (int i = 0; i < parseInt; i++) {
                    String s = a.mo143850s();
                    ArrayList arrayList = (ArrayList) this.f139281f;
                    int a2 = C89361p.m154888a((CharSequence) s, ":", 0, false, 6);
                    if (a2 == -1) {
                        if (!C89361p.m154874b(s, ":", false)) {
                            bVar = new C22027b("", s);
                        } else if (s != null) {
                            String substring = s.substring(1);
                            C89219l.m154716b(substring, "");
                            bVar = new C22027b("", substring);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else if (s != null) {
                        String substring2 = s.substring(0, a2);
                        C89219l.m154716b(substring2, "");
                        String substring3 = s.substring(a2 + 1);
                        C89219l.m154716b(substring3, "");
                        bVar = new C22027b(substring2, substring3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    arrayList.add(bVar);
                }
            } finally {
                aaVar.close();
            }
        }

        public C61325b(C22028c cVar, Request request) {
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(request, "");
            String str = cVar.f52039a;
            C89219l.m154716b(str, "");
            this.f139276a = str;
            String method = request.getMethod();
            C89219l.m154716b(method, "");
            this.f139277b = method;
            this.f139278c = cVar.f52040b;
            String str2 = cVar.f52041c;
            C89219l.m154716b(str2, "");
            this.f139279d = str2;
            String mimeType = cVar.f52043e.mimeType();
            this.f139280e = mimeType == null ? "" : mimeType;
            this.f139282g = System.currentTimeMillis();
            List<C22027b> list = cVar.f52042d;
            C89219l.m154716b(list, "");
            this.f139281f = list;
        }
    }

    /* renamed from: a */
    public final C22028c mo98945a(Request request) {
        C61318d dVar;
        Object obj;
        Object obj2;
        C89219l.m154721d(request, "");
        C61321f a = C61316b.m111000a(request);
        if (a == null || (dVar = a.f139271v) == null) {
            return null;
        }
        int i = dVar.f139268d;
        if (i != 1 && i != 2) {
            return null;
        }
        String a2 = C61316b.m111001a(C61316b.m111006e(request));
        try {
            obj = C89379q.m157068constructorimpl(this.f139275a.mo123669a(a2));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        C80276bw.C80281c cVar = (C80276bw.C80281c) obj;
        if (cVar == null) {
            return null;
        }
        try {
            InputStream inputStream = cVar.f179799a[0];
            C89219l.m154716b(inputStream, "");
            obj2 = C89379q.m157068constructorimpl(new C61325b(C89436q.m155158a(inputStream)));
        } catch (Throwable th2) {
            obj2 = C89379q.m157068constructorimpl(C89382r.m154941a(th2));
        }
        if (C89379q.m157071exceptionOrNullimpl(obj2) != null) {
            cVar.close();
        }
        if (C89379q.m157073isFailureimpl(obj2)) {
            obj2 = null;
        }
        C61325b bVar = (C61325b) obj2;
        if (bVar == null) {
            return null;
        }
        if (System.currentTimeMillis() - bVar.f139282g > ((long) dVar.f139267c)) {
            try {
                C89379q.m157068constructorimpl(Boolean.valueOf(this.f139275a.mo123675c(a2)));
            } catch (Throwable th3) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th3));
            }
            return null;
        }
        C89219l.m154721d(cVar, "");
        return new C22028c(bVar.f139276a, bVar.f139278c, bVar.f139279d, bVar.f139281f, new C61325b.C61326a(bVar, cVar));
    }
}

package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.j */
public final class C60148j implements AbstractC60160s {

    /* renamed from: c */
    public static String f137097c;

    /* renamed from: d */
    public static final C60149a f137098d;

    /* renamed from: a */
    public final String f137099a;

    /* renamed from: b */
    final AbstractC60142d f137100b;

    /* renamed from: e */
    private final String f137101e;

    /* renamed from: com.ss.android.ugc.aweme.model.j$a */
    public static final class C60149a {
        static {
            Covode.recordClassIndex(70676);
        }

        private C60149a() {
        }

        public /* synthetic */ C60149a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C60148j m109619a(C28022o oVar, AbstractC60142d dVar) {
            C89219l.m154721d(oVar, "");
            C89219l.m154721d(dVar, "");
            try {
                AbstractC28019l c = oVar.mo46803c("key");
                C89219l.m154716b(c, "");
                String c2 = c.mo46689c();
                AbstractC28019l c3 = oVar.mo46803c("thumbnail");
                C89219l.m154716b(c3, "");
                String c4 = c3.mo46689c();
                C89219l.m154716b(c2, "");
                C89219l.m154716b(c4, "");
                return new C60148j(c2, c4, dVar);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60160s
    /* renamed from: a */
    public final String mo97825a() {
        return this.f137099a;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60160s
    /* renamed from: b */
    public final String mo97826b() {
        return this.f137101e;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60160s
    /* renamed from: c */
    public final AbstractC60142d mo97827c() {
        return this.f137100b;
    }

    static {
        Covode.recordClassIndex(70675);
        C60149a aVar = new C60149a((byte) 0);
        f137098d = aVar;
        f137097c = aVar.getClass().getSimpleName();
    }

    public C60148j(String str, String str2, AbstractC60142d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(dVar, "");
        this.f137099a = str;
        this.f137101e = str2;
        this.f137100b = dVar;
    }
}

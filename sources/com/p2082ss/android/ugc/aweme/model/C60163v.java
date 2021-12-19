package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.v */
public final class C60163v implements AbstractC60162u {

    /* renamed from: a */
    public static String f137147a;

    /* renamed from: b */
    public static final C60164a f137148b;

    /* renamed from: c */
    private ArrayList<AbstractC60142d> f137149c = new ArrayList<>();

    /* renamed from: d */
    private String f137150d;

    /* renamed from: e */
    private String f137151e;

    /* renamed from: com.ss.android.ugc.aweme.model.v$a */
    public static final class C60164a {
        static {
            Covode.recordClassIndex(70691);
        }

        private C60164a() {
        }

        public /* synthetic */ C60164a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC60162u m109661a(C28022o oVar) {
            C89219l.m154721d(oVar, "");
            try {
                AbstractC28019l c = oVar.mo46803c("key");
                C89219l.m154716b(c, "");
                String c2 = c.mo46689c();
                AbstractC28019l c3 = oVar.mo46803c(StringSet.name);
                C89219l.m154716b(c3, "");
                String c4 = c3.mo46689c();
                C89219l.m154716b(c2, "");
                C89219l.m154716b(c4, "");
                return new C60163v(c2, c4);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60162u
    /* renamed from: a */
    public final String mo97836a() {
        return this.f137150d;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60162u
    /* renamed from: b */
    public final String mo97837b() {
        return this.f137151e;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60162u
    /* renamed from: c */
    public final ArrayList<AbstractC60142d> mo97838c() {
        return this.f137149c;
    }

    static {
        Covode.recordClassIndex(70690);
        C60164a aVar = new C60164a((byte) 0);
        f137148b = aVar;
        f137147a = aVar.getClass().getSimpleName();
    }

    public C60163v(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f137150d = str;
        this.f137151e = str2;
    }
}

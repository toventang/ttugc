package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.model.C60148j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.k */
public final class C60150k implements AbstractC60142d {

    /* renamed from: f */
    public static String f137102f;

    /* renamed from: g */
    public static final C60151a f137103g;

    /* renamed from: a */
    HashMap<String, C60152l> f137104a = new HashMap<>();

    /* renamed from: b */
    C60145g f137105b;

    /* renamed from: c */
    C60146h f137106c;

    /* renamed from: d */
    HashMap<String, C60148j> f137107d = new HashMap<>();

    /* renamed from: e */
    String f137108e;

    /* renamed from: h */
    private ArrayList<AbstractC60154n> f137109h = new ArrayList<>();

    /* renamed from: i */
    private String f137110i;

    /* renamed from: j */
    private String f137111j;

    /* renamed from: k */
    private EnumC60153m f137112k;

    /* renamed from: l */
    private String f137113l;

    /* renamed from: m */
    private boolean f137114m;

    /* renamed from: com.ss.android.ugc.aweme.model.k$a */
    public static final class C60151a {
        static {
            Covode.recordClassIndex(70678);
        }

        private C60151a() {
        }

        public /* synthetic */ C60151a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC60142d m109630a(C28022o oVar) {
            EnumC60153m mVar;
            boolean z;
            C89219l.m154721d(oVar, "");
            try {
                if (oVar.mo46802b(StringSet.type)) {
                    AbstractC28019l c = oVar.mo46803c(StringSet.type);
                    C89219l.m154716b(c, "");
                    if (C89219l.m154714a((Object) c.mo46689c(), (Object) "color_picker")) {
                        mVar = EnumC60153m.COLOR_PICKER;
                    } else {
                        mVar = EnumC60153m.GRID;
                    }
                } else {
                    mVar = EnumC60153m.GRID;
                }
                AbstractC28019l c2 = oVar.mo46803c("key");
                C89219l.m154716b(c2, "");
                String c3 = c2.mo46689c();
                C89219l.m154716b(c3, "");
                AbstractC28019l c4 = oVar.mo46803c(StringSet.name);
                C89219l.m154716b(c4, "");
                String c5 = c4.mo46689c();
                C89219l.m154716b(c5, "");
                AbstractC28019l c6 = oVar.mo46803c("tab");
                C89219l.m154716b(c6, "");
                String c7 = c6.mo46689c();
                C89219l.m154716b(c7, "");
                if (!oVar.mo46802b("inspirations")) {
                    z = true;
                } else {
                    z = false;
                }
                C60150k kVar = new C60150k(c3, c5, mVar, c7, z);
                if (oVar.mo46802b("color_pickers")) {
                    C60145g gVar = new C60145g();
                    AbstractC28019l c8 = oVar.mo46803c("color_pickers");
                    C89219l.m154716b(c8, "");
                    Iterator<AbstractC28019l> it = c8.mo46790k().iterator();
                    while (it.hasNext()) {
                        AbstractC28019l next = it.next();
                        C89219l.m154716b(next, "");
                        C28022o j = next.mo46789j();
                        C89219l.m154716b(j, "");
                        C60143e a = C60144f.m109615a(j, kVar);
                        if (a != null) {
                            gVar.f137090a.add(a);
                        }
                    }
                    kVar.f137105b = gVar;
                }
                if (oVar.mo46802b("flip")) {
                    AbstractC28019l c9 = oVar.mo46803c("flip");
                    C89219l.m154716b(c9, "");
                    AbstractC28019l c10 = c9.mo46789j().mo46803c("key");
                    C89219l.m154716b(c10, "");
                    String c11 = c10.mo46689c();
                    C89219l.m154716b(c11, "");
                    kVar.f137106c = new C60146h(c11);
                }
                if (oVar.mo46802b("sliders")) {
                    AbstractC28019l c12 = oVar.mo46803c("sliders");
                    C89219l.m154716b(c12, "");
                    Iterator<AbstractC28019l> it2 = c12.mo46790k().iterator();
                    while (it2.hasNext()) {
                        AbstractC28019l next2 = it2.next();
                        C89219l.m154716b(next2, "");
                        AbstractC28019l c13 = next2.mo46789j().mo46803c("key");
                        C89219l.m154716b(c13, "");
                        String c14 = c13.mo46689c();
                        C89219l.m154716b(c14, "");
                        AbstractC28019l c15 = next2.mo46789j().mo46803c(StringSet.name);
                        C89219l.m154716b(c15, "");
                        String c16 = c15.mo46689c();
                        C89219l.m154716b(c16, "");
                        AbstractC28019l c17 = next2.mo46789j().mo46803c("min");
                        C89219l.m154716b(c17, "");
                        int g = c17.mo46694g();
                        AbstractC28019l c18 = next2.mo46789j().mo46803c("max");
                        C89219l.m154716b(c18, "");
                        int g2 = c18.mo46694g();
                        AbstractC28019l c19 = next2.mo46789j().mo46803c("default");
                        C89219l.m154716b(c19, "");
                        int g3 = c19.mo46694g();
                        AbstractC28019l c20 = next2.mo46789j().mo46803c("step");
                        C89219l.m154716b(c20, "");
                        C60152l lVar = new C60152l(c14, c16, g, g2, g3, c20.mo46694g(), kVar);
                        kVar.f137104a.put(lVar.f137116b, lVar);
                    }
                }
                if (oVar.mo46802b("inspirations")) {
                    AbstractC28019l c21 = oVar.mo46803c("inspirations");
                    C89219l.m154716b(c21, "");
                    Iterator<AbstractC28019l> it3 = c21.mo46790k().iterator();
                    while (it3.hasNext()) {
                        AbstractC28019l next3 = it3.next();
                        C89219l.m154716b(next3, "");
                        C28022o j2 = next3.mo46789j();
                        C89219l.m154716b(j2, "");
                        C60148j a2 = C60148j.C60149a.m109619a(j2, kVar);
                        if (a2 != null) {
                            kVar.f137107d.put(a2.f137099a, a2);
                        }
                    }
                }
                if (oVar.mo46802b("group")) {
                    AbstractC28019l c22 = oVar.mo46803c("group");
                    C89219l.m154716b(c22, "");
                    String c23 = c22.mo46689c();
                    if (c23 != null) {
                        if (c23.length() != 0) {
                            kVar.f137108e = c23;
                        }
                    }
                }
                return kVar;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60142d
    /* renamed from: a */
    public final String mo97815a() {
        return this.f137110i;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60142d
    /* renamed from: b */
    public final String mo97816b() {
        return this.f137111j;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60142d
    /* renamed from: c */
    public final EnumC60153m mo97817c() {
        return this.f137112k;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60142d
    /* renamed from: d */
    public final String mo97818d() {
        return this.f137113l;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60142d
    /* renamed from: e */
    public final ArrayList<AbstractC60154n> mo97819e() {
        return this.f137109h;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60142d
    /* renamed from: f */
    public final HashMap<String, C60152l> mo97820f() {
        return this.f137104a;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60142d
    /* renamed from: g */
    public final HashMap<String, C60148j> mo97821g() {
        return this.f137107d;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60142d
    /* renamed from: h */
    public final String mo97822h() {
        return this.f137108e;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60142d
    /* renamed from: i */
    public final C60145g mo97823i() {
        return this.f137105b;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60142d
    /* renamed from: j */
    public final C60146h mo97824j() {
        return this.f137106c;
    }

    static {
        Covode.recordClassIndex(70677);
        C60151a aVar = new C60151a((byte) 0);
        f137103g = aVar;
        f137102f = aVar.getClass().getSimpleName();
    }

    public C60150k(String str, String str2, EnumC60153m mVar, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str3, "");
        this.f137110i = str;
        this.f137111j = str2;
        this.f137112k = mVar;
        this.f137113l = str3;
        this.f137114m = z;
    }
}

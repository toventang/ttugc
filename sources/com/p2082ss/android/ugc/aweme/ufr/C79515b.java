package com.p2082ss.android.ugc.aweme.ufr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ufr.b */
public final class C79515b {

    /* renamed from: a */
    public static final C79515b f178470a = new C79515b();

    private C79515b() {
    }

    static {
        Covode.recordClassIndex(92718);
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.b$a */
    static final class C79516a<T> implements AbstractC88983w<T> {

        /* renamed from: a */
        public static final C79516a f178471a = new C79516a();

        static {
            Covode.recordClassIndex(92719);
        }

        C79516a() {
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C79546d> vVar) {
            C89219l.m154719c(vVar, "");
            vVar.mo143023a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ufr.b$b */
    public static final class C79517b<T> implements AbstractC88983w<T> {

        /* renamed from: a */
        public static final C79517b f178472a = new C79517b();

        static {
            Covode.recordClassIndex(92720);
        }

        C79517b() {
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C79546d> vVar) {
            C89219l.m154719c(vVar, "");
            vVar.mo143023a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ufr.b$c */
    public static final class C79518c<T> implements AbstractC88983w<T> {

        /* renamed from: a */
        public static final C79518c f178473a = new C79518c();

        static {
            Covode.recordClassIndex(92721);
        }

        C79518c() {
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C79546d> vVar) {
            C89219l.m154719c(vVar, "");
            vVar.mo143023a();
        }
    }

    /* renamed from: b */
    public static AbstractC88979t<C79546d> m138230b(Context context, Class<? extends AbstractC79495a> cls, String str, String str2, String str3) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        if (TextUtils.isEmpty(str)) {
            AbstractC88979t<C79546d> a = AbstractC88979t.m154294a(C79516a.f178471a);
            C89219l.m154709a((Object) a, "");
            return a;
        }
        if (str == null) {
            C89219l.m154707a();
        }
        return C79550h.m138256a(context, cls, str, str2, str3);
    }

    /* renamed from: a */
    public static AbstractC88979t<C79546d> m138227a(Context context, Class<? extends AbstractC79495a> cls, String str, String str2, String str3, boolean z) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        if (TextUtils.isEmpty(str)) {
            AbstractC88979t<C79546d> a = AbstractC88979t.m154294a(C79518c.f178473a);
            C89219l.m154709a((Object) a, "");
            return a;
        }
        C79550h hVar = new C79550h();
        if (str == null) {
            C89219l.m154707a();
        }
        return hVar.mo123090a(context, cls, str, str2, str3, true, true, z, null);
    }

    /* renamed from: a */
    public static AbstractC88979t<C79546d> m138229a(Context context, Class<? extends AbstractC79495a> cls, String str, String str2, String str3, boolean z, boolean z2, Map<String, String> map) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        if (TextUtils.isEmpty(str)) {
            AbstractC88979t<C79546d> a = AbstractC88979t.m154294a(C79517b.f178472a);
            C89219l.m154709a((Object) a, "");
            return a;
        }
        C79550h hVar = new C79550h();
        if (str == null) {
            C89219l.m154707a();
        }
        return hVar.mo123090a(context, cls, str, str2, str3, z, false, z2, map);
    }
}

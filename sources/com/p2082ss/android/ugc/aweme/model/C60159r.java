package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.r */
public final class C60159r {

    /* renamed from: a */
    public static C60157q f137138a;

    /* renamed from: b */
    public static C60141c f137139b;

    /* renamed from: c */
    public static C60141c f137140c;

    /* renamed from: d */
    public static C60141c f137141d;

    /* renamed from: e */
    public static HashMap<String, AbstractC60142d> f137142e;

    /* renamed from: f */
    public static C60107b f137143f;

    /* renamed from: g */
    public static final C60159r f137144g = new C60159r();

    private C60159r() {
    }

    static {
        Covode.recordClassIndex(70686);
    }

    /* renamed from: a */
    public static void m109648a() {
        f137138a = null;
        f137140c = null;
        f137139b = null;
        f137141d = null;
        f137143f = null;
    }

    /* renamed from: a */
    public static void m109649a(C60107b bVar) {
        C89219l.m154721d(bVar, "");
        HashMap<String, AbstractC60142d> hashMap = f137142e;
        if (hashMap == null) {
            f137143f = bVar;
        } else {
            m109650a(C60157q.C60158a.m109647a(bVar, hashMap));
        }
    }

    /* renamed from: a */
    public static void m109650a(C60157q qVar) {
        C89219l.m154721d(qVar, "");
        m109648a();
        f137138a = qVar;
    }
}

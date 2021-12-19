package com.bytedance.ies.powerpreload.p1242a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17796c;
import com.bytedance.ies.powerpreload.task.AbstractC17825c;
import com.bytedance.ies.powerpreload.task.C17834g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.a.a */
public final class C17778a {

    /* renamed from: a */
    public static C17834g f42448a;

    /* renamed from: b */
    public static C17779b f42449b;

    /* renamed from: c */
    public static final C17778a f42450c = new C17778a();

    private C17778a() {
    }

    static {
        Covode.recordClassIndex(20342);
    }

    /* renamed from: a */
    public static C17779b m32983a() {
        C17779b bVar = f42449b;
        if (bVar == null) {
            C89219l.m154710a("config");
        }
        return bVar;
    }

    /* renamed from: c */
    public static AbstractC17825c m32986c() {
        C17779b bVar = f42449b;
        if (bVar == null) {
            C89219l.m154710a("config");
        }
        return bVar.f42453c;
    }

    /* renamed from: b */
    public static boolean m32985b() {
        if (!C17796c.C17797a.m32994a()) {
            return false;
        }
        C17779b bVar = f42449b;
        if (bVar == null) {
            C89219l.m154710a("config");
        }
        return bVar.f42452b;
    }

    /* renamed from: a */
    public static void m32984a(Exception exc) {
        C89219l.m154719c(exc, "");
        if (!m32985b()) {
            exc.printStackTrace();
            return;
        }
        throw exc;
    }
}

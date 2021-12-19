package com.p2082ss.android.ugc.aweme.editSticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45871d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.view.AbstractC84922b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.g */
public final class C45890g {

    /* renamed from: a */
    public static AbstractC84922b f106878a;

    /* renamed from: b */
    public static AbstractC45871d f106879b;

    /* renamed from: c */
    public static final C45890g f106880c = new C45890g();

    /* renamed from: d */
    private static C45874e f106881d;

    /* renamed from: e */
    private static AbstractC84398d f106882e;

    /* renamed from: f */
    private static boolean f106883f;

    private C45890g() {
    }

    static {
        Covode.recordClassIndex(54414);
    }

    /* renamed from: a */
    public static final C45874e m88534a() {
        C45874e eVar = f106881d;
        if (eVar == null) {
            C89219l.m154710a("textConfig");
        }
        return eVar;
    }

    /* renamed from: b */
    public static final AbstractC84398d m88536b() {
        AbstractC84398d dVar = f106882e;
        if (dVar == null) {
            C89219l.m154710a("fontEffectPlatform");
        }
        return dVar;
    }

    /* renamed from: a */
    public static void m88535a(C45874e eVar, AbstractC84398d dVar, AbstractC84922b bVar, AbstractC45871d dVar2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        if (!f106883f) {
            f106881d = eVar;
            f106882e = dVar;
            f106878a = bVar;
            f106879b = dVar2;
            f106883f = true;
        }
    }
}

package com.p2082ss.ttvideoengine.p4421n;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86516d;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4421n.p4423b.AbstractC86586h;
import com.p2082ss.ttvideoengine.p4421n.p4423b.C86587i;

/* renamed from: com.ss.ttvideoengine.n.a */
public final class C86575a {
    static {
        Covode.recordClassIndex(101803);
    }

    /* renamed from: a */
    public static EnumC86649v m149944a(AbstractC86517e eVar, EnumC86649v vVar) {
        int abs;
        if (eVar == null || vVar == null) {
            return EnumC86649v.Standard;
        }
        int length = EnumC86649v.getAllResolutions().length;
        EnumC86649v[] i = eVar.mo137756i();
        if (i == null || i.length == 0) {
            return vVar;
        }
        EnumC86649v vVar2 = vVar;
        for (EnumC86649v vVar3 : i) {
            if (vVar3 != null && (abs = Math.abs(vVar3.ordinal() - vVar.ordinal())) < length) {
                vVar2 = vVar3;
                if (abs == 0) {
                    break;
                }
                length = abs;
            }
        }
        return vVar2;
    }

    /* renamed from: b */
    public static EnumC86649v m149946b(AbstractC86517e eVar, EnumC86649v vVar) {
        if (eVar == null || vVar == null) {
            return EnumC86649v.Standard;
        }
        long j = 0;
        EnumC86649v[] i = eVar.mo137756i();
        if (!(i == null || i.length == 0)) {
            for (EnumC86649v vVar2 : i) {
                long a = C86313ai.m148632a(eVar, vVar2);
                if (a > j) {
                    vVar = vVar2;
                    j = a;
                }
            }
        }
        return vVar;
    }

    /* renamed from: c */
    public static EnumC86649v m149947c(AbstractC86517e eVar, EnumC86649v vVar) {
        if (eVar == null || vVar == null) {
            return EnumC86649v.Standard;
        }
        EnumC86649v[] i = eVar.mo137756i();
        if (!(i == null || i.length == 0)) {
            for (EnumC86649v vVar2 : i) {
                if (C86313ai.m148632a(eVar, vVar2) > 0 && vVar2.ordinal() > vVar.ordinal()) {
                    vVar = vVar2;
                }
            }
        }
        return vVar;
    }

    /* renamed from: a */
    public static EnumC86649v m149945a(AbstractC86517e eVar, EnumC86649v vVar, double d, AbstractC86586h hVar) {
        if (!(eVar == null || vVar == null || hVar == null)) {
            C86587i iVar = new C86587i(hVar);
            C86587i.C86588a aVar = new C86587i.C86588a();
            aVar.f195098a = d;
            AbstractC86516d dVar = iVar.mo137832a(eVar, aVar.mo137856a()).f195084a;
            if (dVar != null) {
                return dVar.mo137729c();
            }
        }
        return vVar;
    }
}

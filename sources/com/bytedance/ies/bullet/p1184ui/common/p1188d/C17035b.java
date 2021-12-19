package com.bytedance.ies.bullet.p1184ui.common.p1188d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16746t;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16735l;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16742r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.d.b */
public final class C17035b {

    /* renamed from: a */
    public static final C17035b f40569a = new C17035b();

    private C17035b() {
    }

    static {
        Covode.recordClassIndex(19484);
    }

    /* renamed from: b */
    public static void m31494b(C16721b bVar) {
        C89219l.m154719c(bVar, "");
        if (C89219l.m154714a((Object) bVar.f39927c.mo26550b(), (Object) true)) {
            bVar.f39926b.mo26549a((Boolean) true);
        }
    }

    /* renamed from: a */
    public static void m31493a(C16721b bVar) {
        boolean z;
        Boolean b;
        Boolean b2;
        EnumC16735l lVar;
        C16746t b3;
        C16746t b4;
        Boolean b5;
        Boolean bool;
        Boolean b6;
        C89219l.m154719c(bVar, "");
        AbstractC16725d<Boolean> dVar = bVar.f39950z;
        if (dVar.mo26552c() && (b6 = dVar.mo26550b()) != null) {
            if (b6.booleanValue()) {
                bVar.f39930f.mo26549a(EnumC16742r.DARK);
            } else {
                bVar.f39930f.mo26549a(EnumC16742r.LIGHT);
            }
        }
        Boolean b7 = bVar.f39938n.mo26550b();
        if (b7 != null) {
            z = b7.booleanValue();
        } else {
            z = true;
        }
        C16722a aVar = bVar.f39911B;
        if (!aVar.mo26552c()) {
            aVar = null;
        }
        if (!(aVar == null || (bool = (Boolean) aVar.mo26550b()) == null)) {
            boolean booleanValue = bool.booleanValue();
            if (!z || !booleanValue) {
                z = false;
            } else {
                z = true;
            }
        }
        AbstractC16725d<Boolean> dVar2 = bVar.f39910A;
        if (dVar2.mo26552c() && (b5 = dVar2.mo26550b()) != null) {
            boolean booleanValue2 = b5.booleanValue();
            if (!z || booleanValue2) {
                z = false;
            } else {
                z = true;
            }
        }
        bVar.f39938n.mo26549a(Boolean.valueOf(z));
        AbstractC16725d<Boolean> dVar3 = bVar.f39912C;
        if (dVar3.mo26552c()) {
            bVar.f39927c.mo26549a(dVar3.mo26550b());
        }
        AbstractC16725d<C16746t> dVar4 = bVar.f39913D;
        if (!dVar4.mo26552c()) {
            dVar4 = null;
        }
        if (!(dVar4 == null || (b4 = dVar4.mo26550b()) == null || b4.f39989a == -2)) {
            bVar.f39935k.mo26549a(b4);
        }
        AbstractC16725d<C16746t> dVar5 = bVar.f39914E;
        if (!(!dVar5.mo26552c() || (b3 = dVar5.mo26550b()) == null || b3.f39989a == -2)) {
            bVar.f39928d.mo26549a(b3);
        }
        AbstractC16725d<Boolean> dVar6 = bVar.f39915F;
        if (dVar6.mo26552c() && (b2 = dVar6.mo26550b()) != null) {
            boolean booleanValue3 = b2.booleanValue();
            AbstractC16725d<EnumC16735l> dVar7 = bVar.f39937m;
            if (booleanValue3) {
                lVar = EnumC16735l.BOTTOM;
            } else {
                lVar = EnumC16735l.AUTO;
            }
            dVar7.mo26549a(lVar);
        }
        AbstractC16725d<Boolean> dVar8 = bVar.f39916G;
        if (dVar8.mo26552c() && !bVar.f39925a.mo26552c() && (b = dVar8.mo26550b()) != null) {
            bVar.f39925a.mo26549a(Boolean.valueOf(!b.booleanValue()));
        }
    }
}

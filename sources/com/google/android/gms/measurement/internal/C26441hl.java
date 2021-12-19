package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import com.google.android.gms.internal.measurement.C25802av;
import com.google.android.gms.internal.measurement.C26155mm;
import com.google.android.gms.internal.measurement.C26156mn;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.hl */
public final class C26441hl extends AbstractC26500jp {
    static {
        Covode.recordClassIndex(31863);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26500jp
    /* renamed from: d */
    public final boolean mo43092d() {
        return false;
    }

    /* renamed from: e */
    private static String m52078e() {
        throw new SecurityException("This implementation should not be used.");
    }

    public C26441hl(C26498jo joVar) {
        super(joVar);
    }

    /* renamed from: a */
    public final byte[] mo43367a(zzao zzao, String str) {
        C26507jw jwVar;
        Bundle a;
        C26526l lVar;
        long j;
        mo43002c();
        C26381ff.m51906u();
        C25565r.m49314a(zzao);
        C25565r.m49316a(str);
        if (!mo43018s().mo43641d(str, C26530p.f62486Y)) {
            mo43016q().f61834j.mo43170a("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if ("_iap".equals(zzao.f62578a) || "_iapx".equals(zzao.f62578a)) {
            C25802av.C25813f.C25814a a2 = C25802av.C25813f.m49880a();
            mo43174J_().mo43096e();
            try {
                C26351ec b = mo43174J_().mo43086b(str);
                if (b == null) {
                    mo43016q().f61834j.mo43170a("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!b.mo43159q()) {
                    mo43016q().f61834j.mo43170a("Log and bundle disabled. package_name", str);
                    byte[] bArr = new byte[0];
                    mo43174J_().mo43102g();
                    return bArr;
                } else {
                    C25802av.C25815g.C25816a a3 = C25802av.C25815g.m49893c().mo42007a().mo42018a("android");
                    if (!TextUtils.isEmpty(b.mo43125b())) {
                        a3.mo42130f(b.mo43125b());
                    }
                    if (!TextUtils.isEmpty(b.mo43155m())) {
                        a3.mo42125e(b.mo43155m());
                    }
                    if (!TextUtils.isEmpty(b.mo43153k())) {
                        a3.mo42134g(b.mo43153k());
                    }
                    if (b.mo43154l() != -2147483648L) {
                        a3.mo42132g((int) b.mo43154l());
                    }
                    a3.mo42129f(b.mo43156n()).mo42143j(b.mo43158p());
                    C26155mm.m51249b();
                    if (mo43018s().mo43641d(b.mo43125b(), C26530p.f62529ao)) {
                        if (!TextUtils.isEmpty(b.mo43133d())) {
                            a3.mo42146k(b.mo43133d());
                        } else if (!TextUtils.isEmpty(b.mo43139f())) {
                            a3.mo42155o(b.mo43139f());
                        } else if (!TextUtils.isEmpty(b.mo43136e())) {
                            a3.mo42152n(b.mo43136e());
                        }
                    } else if (!TextUtils.isEmpty(b.mo43133d())) {
                        a3.mo42146k(b.mo43133d());
                    } else if (!TextUtils.isEmpty(b.mo43136e())) {
                        a3.mo42152n(b.mo43136e());
                    }
                    a3.mo42133g(b.mo43157o());
                    if (this.f62077z.mo43265r() && mo43018s().mo43645f(a3.mo42147k())) {
                        a3.mo42147k();
                        if (!TextUtils.isEmpty(null)) {
                            a3.mo42156p();
                        }
                    }
                    Pair<String, Boolean> a4 = mo43017r().mo43188a(b.mo43125b());
                    if (b.mo43166x() && !TextUtils.isEmpty((CharSequence) a4.first)) {
                        try {
                            Object obj = a4.first;
                            Long.toString(zzao.f62581d);
                            a3.mo42138h(m52078e());
                            if (a4.second != null) {
                                a3.mo42106a(((Boolean) a4.second).booleanValue());
                            }
                        } catch (SecurityException e) {
                            mo43016q().f61834j.mo43170a("Resettable device id encryption failed", e.getMessage());
                            byte[] bArr2 = new byte[0];
                            mo43174J_().mo43102g();
                            return bArr2;
                        }
                    }
                    mo43010k().mo43288x();
                    C25802av.C25815g.C25816a c = a3.mo42116c(Build.MODEL);
                    mo43010k().mo43288x();
                    c.mo42110b(Build.VERSION.RELEASE).mo42123e((int) mo43010k().mo43442e()).mo42122d(mo43010k().mo43443f());
                    try {
                        b.mo43129c();
                        Long.toString(zzao.f62581d);
                        a3.mo42141i(m52078e());
                        if (!TextUtils.isEmpty(b.mo43145h())) {
                            a3.mo42149l(b.mo43145h());
                        }
                        String b2 = b.mo43125b();
                        List<C26507jw> a5 = mo43174J_().mo43072a(b2);
                        Iterator<C26507jw> it = a5.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                jwVar = null;
                                break;
                            }
                            jwVar = it.next();
                            if ("_lte".equals(jwVar.f62393c)) {
                                break;
                            }
                        }
                        if (jwVar == null || jwVar.f62395e == null) {
                            C26507jw jwVar2 = new C26507jw(b2, "auto", "_lte", mo43011l().mo41857a(), 0L);
                            a5.add(jwVar2);
                            mo43174J_().mo43081a(jwVar2);
                        }
                        C26506jv L_ = mo43176L_();
                        L_.mo43016q().f61835k.mo43169a("Checking account type status for ad personalization signals");
                        if (L_.mo43010k().mo43445h()) {
                            String b3 = b.mo43125b();
                            if (b.mo43166x() && L_.mo43173I_().mo43232e(b3)) {
                                L_.mo43016q().f61834j.mo43169a("Turning off ad personalization due to account type");
                                Iterator<C26507jw> it2 = a5.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(it2.next().f62393c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                a5.add(new C26507jw(b3, "auto", "_npa", L_.mo43011l().mo41857a(), 1L));
                            }
                        }
                        C25802av.C25824k[] kVarArr = new C25802av.C25824k[a5.size()];
                        for (int i = 0; i < a5.size(); i++) {
                            C25802av.C25824k.C25825a a6 = C25802av.C25824k.m49997d().mo42018a(a5.get(i).f62393c).mo42179a(a5.get(i).f62394d);
                            mo43176L_().mo43499a(a6, a5.get(i).f62395e);
                            kVarArr[i] = (C25802av.C25824k) ((AbstractC25981gj) a6.mo42629w());
                        }
                        a3.mo42109b(Arrays.asList(kVarArr));
                        C26156mn.m51251b();
                        if (!mo43018s().mo43641d(null, C26530p.f62503aO) || !mo43018s().mo43641d(null, C26530p.f62504aP)) {
                            a = zzao.f62579b.mo43665a();
                        } else {
                            C26355eg a7 = C26355eg.m51789a(zzao);
                            mo43014o().mo43524a(a7.f61877b, mo43174J_().mo43106i(str));
                            mo43014o().mo43533a(a7, mo43018s().mo43630a(str));
                            a = a7.f61877b;
                        }
                        a.putLong("_c", 1);
                        mo43016q().f61834j.mo43169a("Marking in-app purchase as real-time");
                        a.putLong("_r", 1);
                        a.putString("_o", zzao.f62580c);
                        if (mo43014o().mo43548f(a3.mo42147k())) {
                            mo43014o().mo43525a(a, "_dbg", (Object) 1L);
                            mo43014o().mo43525a(a, "_r", (Object) 1L);
                        }
                        C26526l a8 = mo43174J_().mo43070a(str, zzao.f62578a);
                        if (a8 == null) {
                            lVar = new C26526l(str, zzao.f62578a, zzao.f62581d);
                            j = 0;
                        } else {
                            j = a8.f62448f;
                            lVar = a8.mo43652a(zzao.f62581d);
                        }
                        mo43174J_().mo43077a(lVar);
                        C26527m mVar = new C26527m(this.f62077z, zzao.f62580c, str, zzao.f62578a, zzao.f62581d, j, a);
                        C25802av.C25807c.C25808a b4 = C25802av.C25807c.m49834c().mo42067a(mVar.f62456c).mo42018a(mVar.f62455b).mo42074b(mVar.f62457d);
                        Iterator<String> it3 = mVar.f62458e.iterator();
                        while (it3.hasNext()) {
                            String next = it3.next();
                            C25802av.C25811e.C25812a a9 = C25802av.C25811e.m49862e().mo42018a(next);
                            mo43176L_().mo43498a(a9, mVar.f62458e.mo43666a(next));
                            b4.mo42068a(a9);
                        }
                        a3.mo42101a(b4).mo42102a(C25802av.C25817h.m49965a().mo42159a(C25802av.C25809d.m49856a().mo42080a(lVar.f62445c).mo42018a(zzao.f62578a)));
                        a3.mo42115c(mo43175K_().mo43618a(b.mo43125b(), Collections.emptyList(), a3.mo42126e(), Long.valueOf(b4.mo42078f()), Long.valueOf(b4.mo42078f())));
                        if (b4.mo42077e()) {
                            a3.mo42108b(b4.mo42078f()).mo42114c(b4.mo42078f());
                        }
                        long j2 = b.mo43151j();
                        if (j2 != 0) {
                            a3.mo42124e(j2);
                        }
                        long i2 = b.mo43148i();
                        if (i2 != 0) {
                            a3.mo42120d(i2);
                        } else if (j2 != 0) {
                            a3.mo42120d(j2);
                        }
                        b.mo43163u();
                        C25802av.C25815g.C25816a f = a3.mo42128f((int) b.mo43160r());
                        mo43018s();
                        f.mo42148l().mo42100a(mo43011l().mo41857a()).mo42111b(Boolean.TRUE.booleanValue());
                        a2.mo42094a(a3);
                        b.mo43120a(a3.mo42131g());
                        b.mo43126b(a3.mo42135h());
                        mo43174J_().mo43076a(b);
                        mo43174J_().mo43099f();
                        mo43174J_().mo43102g();
                        try {
                            return mo43176L_().mo43503c(((AbstractC25981gj) a2.mo42629w()).mo42364h());
                        } catch (IOException e2) {
                            mo43016q().f61827c.mo43171a("Data loss. Failed to bundle and serialize. appId", C26350eb.m51691a(str), e2);
                            return null;
                        }
                    } catch (SecurityException e3) {
                        mo43016q().f61834j.mo43170a("app instance id encryption failed", e3.getMessage());
                        byte[] bArr3 = new byte[0];
                        mo43174J_().mo43102g();
                        return bArr3;
                    }
                }
            } finally {
                mo43174J_().mo43102g();
            }
        } else {
            mo43016q().f61834j.mo43171a("Generating a payload for this event is not available. package_name, event_name", str, zzao.f62578a);
            return null;
        }
    }
}

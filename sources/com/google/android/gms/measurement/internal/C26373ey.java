package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import com.google.android.gms.internal.measurement.C25794at;
import com.google.android.gms.internal.measurement.C25994gr;
import com.google.android.gms.internal.measurement.C26109ku;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.ey */
public final class C26373ey extends AbstractC26500jp implements AbstractC26267b {

    /* renamed from: a */
    private static int f61968a = 65535;

    /* renamed from: b */
    private static int f61969b = 2;

    /* renamed from: c */
    private final Map<String, Map<String, String>> f61970c = new C0484a();

    /* renamed from: d */
    private final Map<String, Map<String, Boolean>> f61971d = new C0484a();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f61972e = new C0484a();

    /* renamed from: f */
    private final Map<String, C25794at.C25797b> f61973f = new C0484a();

    /* renamed from: g */
    private final Map<String, Map<String, Integer>> f61974g = new C0484a();

    /* renamed from: h */
    private final Map<String, String> f61975h = new C0484a();

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26500jp
    /* renamed from: d */
    public final boolean mo43092d() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42994a() {
        super.mo42994a();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo42999b() {
        super.mo42999b();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43002c() {
        super.mo43002c();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: I_ */
    public final /* bridge */ /* synthetic */ C26373ey mo43173I_() {
        return super.mo43173I_();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: J_ */
    public final /* bridge */ /* synthetic */ C26348e mo43174J_() {
        return super.mo43174J_();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: K_ */
    public final /* bridge */ /* synthetic */ C26515kd mo43175K_() {
        return super.mo43175K_();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: L_ */
    public final /* bridge */ /* synthetic */ C26506jv mo43176L_() {
        return super.mo43176L_();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C26483j mo43010k() {
        return super.mo43010k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ AbstractC25603e mo43011l() {
        return super.mo43011l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43012m() {
        return super.mo43012m();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C26347dz mo43013n() {
        return super.mo43013n();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C26510jz mo43014o() {
        return super.mo43014o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C26372ex mo43015p() {
        return super.mo43015p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C26350eb mo43016q() {
        return super.mo43016q();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C26361em mo43017r() {
        return super.mo43017r();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C26524km mo43018s() {
        return super.mo43018s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C26523kl mo43019t() {
        return super.mo43019t();
    }

    static {
        Covode.recordClassIndex(31795);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo43226b(String str) {
        mo43002c();
        return this.f61975h.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo43228c(String str) {
        mo43002c();
        this.f61975h.put(str, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo43231d(String str) {
        mo43002c();
        this.f61973f.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo43232e(String str) {
        mo43002c();
        C25794at.C25797b a = mo43224a(str);
        if (a == null) {
            return false;
        }
        return a.zzk;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo43234g(String str) {
        return "1".equals(mo43021a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo43235h(String str) {
        return "1".equals(mo43021a(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C25794at.C25797b mo43224a(String str) {
        mo43486B();
        mo43002c();
        C25565r.m49316a(str);
        m51856i(str);
        return this.f61973f.get(str);
    }

    C26373ey(C26498jo joVar) {
        super(joVar);
    }

    /* renamed from: a */
    private static Map<String, String> m51854a(C25794at.C25797b bVar) {
        C0484a aVar = new C0484a();
        if (bVar != null) {
            for (C25794at.C25799c cVar : bVar.zzg) {
                aVar.put(cVar.zzd, cVar.zze);
            }
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final long mo43233f(String str) {
        String a = mo43021a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(a)) {
            return 0;
        }
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException e) {
            mo43016q().f61830f.mo43171a("Unable to parse timezone offset. appId", C26350eb.m51691a(str), e);
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.at$b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private final void m51856i(String str) {
        mo43486B();
        mo43002c();
        C25565r.m49316a(str);
        if (this.f61973f.get(str) == null) {
            byte[] d = mo43174J_().mo43093d(str);
            if (d == null) {
                this.f61970c.put(str, null);
                this.f61971d.put(str, null);
                this.f61972e.put(str, null);
                this.f61973f.put(str, null);
                this.f61975h.put(str, null);
                this.f61974g.put(str, null);
                return;
            }
            C25794at.C25797b.C25798a aVar = (C25794at.C25797b.C25798a) m51853a(str, d).mo42620l();
            m51855a(str, aVar);
            this.f61970c.put(str, m51854a((C25794at.C25797b) ((AbstractC25981gj) aVar.mo42629w())));
            this.f61973f.put(str, (AbstractC25981gj) aVar.mo42629w());
            this.f61975h.put(str, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo43230d(String str, String str2) {
        Integer num;
        mo43002c();
        m51856i(str);
        Map<String, Integer> map = this.f61974g.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo43227b(String str, String str2) {
        Boolean bool;
        mo43002c();
        m51856i(str);
        if (mo43234g(str) && C26510jz.m52406e(str2)) {
            return true;
        }
        if (mo43235h(str) && C26510jz.m52394a(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f61971d.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    private final C25794at.C25797b m51853a(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return C25794at.C25797b.zzl;
        }
        try {
            C25794at.C25797b bVar = (C25794at.C25797b) ((AbstractC25981gj) ((C25794at.C25797b.C25798a) C26506jv.m52332a(C25794at.C25797b.m49808b(), bArr)).mo42629w());
            C26353ee eeVar = mo43016q().f61835k;
            String str2 = null;
            if (bVar.mo42049a()) {
                l = Long.valueOf(bVar.zzd);
            } else {
                l = null;
            }
            if ((bVar.zzc & 2) != 0) {
                str2 = bVar.zze;
            }
            eeVar.mo43171a("Parsed config. version, gmp_app_id", l, str2);
            return bVar;
        } catch (C25994gr e) {
            mo43016q().f61830f.mo43171a("Unable to merge remote config. appId", C26350eb.m51691a(str), e);
            return C25794at.C25797b.zzl;
        } catch (RuntimeException e2) {
            mo43016q().f61830f.mo43171a("Unable to merge remote config. appId", C26350eb.m51691a(str), e2);
            return C25794at.C25797b.zzl;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo43229c(String str, String str2) {
        Boolean bool;
        mo43002c();
        m51856i(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        C26109ku.m51181b();
        if (mo43018s().mo43641d(null, C26530p.f62498aJ) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map<String, Boolean> map = this.f61972e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    private final void m51855a(String str, C25794at.C25797b.C25798a aVar) {
        C0484a aVar2 = new C0484a();
        C0484a aVar3 = new C0484a();
        C0484a aVar4 = new C0484a();
        if (aVar != null) {
            for (int i = 0; i < aVar.mo42007a(); i++) {
                C25794at.C25795a.C25796a aVar5 = (C25794at.C25795a.C25796a) aVar.mo42050a(i).mo42620l();
                if (TextUtils.isEmpty(aVar5.mo42007a())) {
                    mo43016q().f61830f.mo43169a("EventConfig contained null event name");
                } else {
                    String a = C26407ge.m51981a(aVar5.mo42007a());
                    if (!TextUtils.isEmpty(a)) {
                        aVar5 = aVar5.mo42018a(a);
                        aVar.mo42051a(i, aVar5);
                    }
                    aVar2.put(aVar5.mo42007a(), Boolean.valueOf(aVar5.mo42045b()));
                    aVar3.put(aVar5.mo42007a(), Boolean.valueOf(aVar5.mo42046c()));
                    if (aVar5.mo42047d()) {
                        if (aVar5.mo42048e() < f61969b || aVar5.mo42048e() > f61968a) {
                            mo43016q().f61830f.mo43171a("Invalid sampling rate. Event name, sample rate", aVar5.mo42007a(), Integer.valueOf(aVar5.mo42048e()));
                        } else {
                            aVar4.put(aVar5.mo42007a(), Integer.valueOf(aVar5.mo42048e()));
                        }
                    }
                }
            }
        }
        this.f61971d.put(str, aVar2);
        this.f61972e.put(str, aVar3);
        this.f61974g.put(str, aVar4);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26267b
    /* renamed from: a */
    public final String mo43021a(String str, String str2) {
        mo43002c();
        m51856i(str);
        Map<String, String> map = this.f61970c.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.at$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.at$b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo43225a(String str, byte[] bArr, String str2) {
        MethodCollector.m26663i(8189);
        mo43486B();
        mo43002c();
        C25565r.m49316a(str);
        C25794at.C25797b.C25798a aVar = (C25794at.C25797b.C25798a) m51853a(str, bArr).mo42620l();
        if (aVar == null) {
            MethodCollector.m26664o(8189);
            return false;
        }
        m51855a(str, aVar);
        this.f61973f.put(str, (AbstractC25981gj) aVar.mo42629w());
        this.f61975h.put(str, str2);
        this.f61970c.put(str, m51854a((C25794at.C25797b) ((AbstractC25981gj) aVar.mo42629w())));
        mo43174J_().mo43078a(str, new ArrayList(aVar.mo42052b()));
        try {
            aVar.mo42053c();
            bArr = ((C25794at.C25797b) ((AbstractC25981gj) aVar.mo42629w())).mo42364h();
        } catch (RuntimeException e) {
            mo43016q().f61830f.mo43171a("Unable to serialize reduced-size config. Storing full config instead. appId", C26350eb.m51691a(str), e);
        }
        C26348e J_ = mo43174J_();
        C25565r.m49316a(str);
        J_.mo43002c();
        J_.mo43486B();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) J_.mo43105h().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                J_.mo43016q().f61827c.mo43170a("Failed to update remote config (got 0). appId", C26350eb.m51691a(str));
            }
        } catch (SQLiteException e2) {
            J_.mo43016q().f61827c.mo43171a("Error storing remote config. appId", C26350eb.m51691a(str), e2);
        }
        this.f61973f.put(str, (AbstractC25981gj) aVar.mo42629w());
        MethodCollector.m26664o(8189);
        return true;
    }
}

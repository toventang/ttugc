package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.p1938c.C25500c;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import com.google.android.gms.internal.measurement.C25794at;
import com.google.android.gms.internal.measurement.C25802av;
import com.google.android.gms.internal.measurement.C26098kj;
import com.google.android.gms.internal.measurement.C26109ku;
import com.google.android.gms.internal.measurement.C26136lu;
import com.google.android.gms.internal.measurement.C26155mm;
import com.google.android.gms.internal.measurement.C26156mn;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.measurement.internal.jo */
public class C26498jo implements AbstractC26404gb {

    /* renamed from: f */
    private static volatile C26498jo f62353f;

    /* renamed from: a */
    C26441hl f62354a;

    /* renamed from: b */
    public final C26381ff f62355b;

    /* renamed from: c */
    List<Runnable> f62356c;

    /* renamed from: d */
    int f62357d;

    /* renamed from: e */
    int f62358e;

    /* renamed from: g */
    private C26373ey f62359g;

    /* renamed from: h */
    private C26354ef f62360h;

    /* renamed from: i */
    private C26348e f62361i;

    /* renamed from: j */
    private C26360el f62362j;

    /* renamed from: k */
    private C26494jk f62363k;

    /* renamed from: l */
    private C26515kd f62364l;

    /* renamed from: m */
    private final C26506jv f62365m;

    /* renamed from: n */
    private boolean f62366n;

    /* renamed from: o */
    private boolean f62367o;

    /* renamed from: p */
    private long f62368p;

    /* renamed from: q */
    private boolean f62369q;

    /* renamed from: r */
    private boolean f62370r;

    /* renamed from: s */
    private boolean f62371s;

    /* renamed from: t */
    private FileLock f62372t;

    /* renamed from: u */
    private FileChannel f62373u;

    /* renamed from: v */
    private List<Long> f62374v;

    /* renamed from: w */
    private List<Long> f62375w;

    /* renamed from: x */
    private long f62376x;

    static {
        Covode.recordClassIndex(31920);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43462a() {
        this.f62355b.mo43015p().mo43002c();
        mo43476d().mo43109u();
        if (this.f62355b.mo43253b().f61904d.mo43209a() == 0) {
            this.f62355b.mo43253b().f61904d.mo43210a(this.f62355b.mo43011l().mo41857a());
        }
        mo43483j();
    }

    /* renamed from: a */
    static void m52277a(AbstractC26500jp jpVar) {
        if (jpVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!jpVar.mo43485A()) {
            String valueOf = String.valueOf(jpVar.getClass());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Component not initialized: ").append(valueOf).toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43465a(zzao zzao, String str) {
        C26351ec b = mo43476d().mo43086b(str);
        if (b == null || TextUtils.isEmpty(b.mo43153k())) {
            this.f62355b.mo43016q().f61834j.mo43170a("No app data available; dropping event", str);
            return;
        }
        Boolean b2 = m52281b(b);
        if (b2 == null) {
            if (!"_ui".equals(zzao.f62578a)) {
                this.f62355b.mo43016q().f61830f.mo43170a("Could not find package. appId", C26350eb.m51691a(str));
            }
        } else if (!b2.booleanValue()) {
            this.f62355b.mo43016q().f61827c.mo43170a("App version does not match; dropping event. appId", C26350eb.m51691a(str));
            return;
        }
        String d = b.mo43133d();
        String k = b.mo43153k();
        long l = b.mo43154l();
        String m = b.mo43155m();
        long n = b.mo43156n();
        long o = b.mo43157o();
        boolean q = b.mo43159q();
        String h = b.mo43145h();
        long w = b.mo43165w();
        boolean x = b.mo43166x();
        boolean y = b.mo43167y();
        String e = b.mo43136e();
        Boolean z = b.mo43168z();
        long p = b.mo43158p();
        List<String> A = b.mo43119A();
        C26155mm.m51249b();
        m52283b(zzao, new zzn(str, d, k, l, m, n, o, (String) null, q, false, h, w, 0L, 0, x, y, false, e, z, p, A, this.f62355b.f62001e.mo43641d(b.mo43125b(), C26530p.f62529ao) ? b.mo43139f() : null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43464a(zzao zzao, zzn zzn) {
        List<zzw> list;
        List<zzw> list2;
        List<zzw> list3;
        zzao zzao2 = zzao;
        C25565r.m49314a(zzn);
        C25565r.m49316a(zzn.f62590a);
        mo43480g();
        mo43481h();
        String str = zzn.f62590a;
        long j = zzao2.f62581d;
        mo43479f();
        if (C26506jv.m52343a(zzao2, zzn)) {
            if (!zzn.f62597h) {
                mo43474c(zzn);
                return;
            }
            if (this.f62355b.f62001e.mo43641d(str, C26530p.f62517ac) && zzn.f62610u != null) {
                if (zzn.f62610u.contains(zzao2.f62578a)) {
                    Bundle a = zzao2.f62579b.mo43665a();
                    a.putLong("ga_safelisted", 1);
                    zzao2 = new zzao(zzao2.f62578a, new zzan(a), zzao2.f62580c, zzao2.f62581d);
                } else {
                    this.f62355b.mo43016q().f61834j.mo43172a("Dropping non-safelisted event. appId, event name, origin", str, zzao2.f62578a, zzao2.f62580c);
                    return;
                }
            }
            mo43476d().mo43096e();
            try {
                C26348e d = mo43476d();
                C25565r.m49316a(str);
                d.mo43002c();
                d.mo43486B();
                if (j < 0) {
                    d.mo43016q().f61830f.mo43171a("Invalid time querying timed out conditional properties", C26350eb.m51691a(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = d.mo43075a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzw zzw : list) {
                    if (zzw != null) {
                        this.f62355b.mo43016q().f61835k.mo43172a("User property timed out", zzw.f62612a, this.f62355b.mo43257f().mo43064c(zzw.f62614c.f62582a), zzw.f62614c.mo43675a());
                        if (zzw.f62618g != null) {
                            m52284c(new zzao(zzw.f62618g, j), zzn);
                        }
                        mo43476d().mo43094e(str, zzw.f62614c.f62582a);
                    }
                }
                C26348e d2 = mo43476d();
                C25565r.m49316a(str);
                d2.mo43002c();
                d2.mo43486B();
                if (j < 0) {
                    d2.mo43016q().f61830f.mo43171a("Invalid time querying expired conditional properties", C26350eb.m51691a(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = d2.mo43075a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzw zzw2 : list2) {
                    if (zzw2 != null) {
                        this.f62355b.mo43016q().f61835k.mo43172a("User property expired", zzw2.f62612a, this.f62355b.mo43257f().mo43064c(zzw2.f62614c.f62582a), zzw2.f62614c.mo43675a());
                        mo43476d().mo43088b(str, zzw2.f62614c.f62582a);
                        if (zzw2.f62622k != null) {
                            arrayList.add(zzw2.f62622k);
                        }
                        mo43476d().mo43094e(str, zzw2.f62614c.f62582a);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    m52284c(new zzao((zzao) obj, j), zzn);
                }
                C26348e d3 = mo43476d();
                String str2 = zzao2.f62578a;
                C25565r.m49316a(str);
                C25565r.m49316a(str2);
                d3.mo43002c();
                d3.mo43486B();
                if (j < 0) {
                    d3.mo43016q().f61830f.mo43172a("Invalid time querying triggered conditional properties", C26350eb.m51691a(str), d3.mo43013n().mo43062a(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = d3.mo43075a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzw zzw3 : list3) {
                    if (zzw3 != null) {
                        zzkr zzkr = zzw3.f62614c;
                        C26507jw jwVar = new C26507jw(zzw3.f62612a, zzw3.f62613b, zzkr.f62582a, j, zzkr.mo43675a());
                        if (mo43476d().mo43081a(jwVar)) {
                            this.f62355b.mo43016q().f61835k.mo43172a("User property triggered", zzw3.f62612a, this.f62355b.mo43257f().mo43064c(jwVar.f62393c), jwVar.f62395e);
                        } else {
                            this.f62355b.mo43016q().f61827c.mo43172a("Too many active user properties, ignoring", C26350eb.m51691a(zzw3.f62612a), this.f62355b.mo43257f().mo43064c(jwVar.f62393c), jwVar.f62395e);
                        }
                        if (zzw3.f62620i != null) {
                            arrayList2.add(zzw3.f62620i);
                        }
                        zzw3.f62614c = new zzkr(jwVar);
                        zzw3.f62616e = true;
                        mo43476d().mo43083a(zzw3);
                    }
                }
                m52284c(zzao2, zzn);
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    m52284c(new zzao((zzao) obj2, j), zzn);
                }
                mo43476d().mo43099f();
            } finally {
                mo43476d().mo43102g();
            }
        }
    }

    /* renamed from: c */
    private final void m52284c(zzao zzao, zzn zzn) {
        long j;
        boolean z;
        C26526l lVar;
        List<Integer> e;
        C26507jw c;
        long j2;
        String str;
        C26507jw jwVar;
        int i;
        zzao zzao2 = zzao;
        MethodCollector.m26663i(6332);
        C25565r.m49314a(zzn);
        C25565r.m49316a(zzn.f62590a);
        long nanoTime = System.nanoTime();
        mo43480g();
        mo43481h();
        String str2 = zzn.f62590a;
        mo43479f();
        if (!C26506jv.m52343a(zzao2, zzn)) {
            MethodCollector.m26664o(6332);
        } else if (!zzn.f62597h) {
            mo43474c(zzn);
            MethodCollector.m26664o(6332);
        } else if (mo43470b().mo43227b(str2, zzao2.f62578a)) {
            this.f62355b.mo43016q().f61830f.mo43171a("Dropping blacklisted event. appId", C26350eb.m51691a(str2), this.f62355b.mo43257f().mo43062a(zzao2.f62578a));
            if (mo43470b().mo43234g(str2) || mo43470b().mo43235h(str2)) {
                C26351ec b = mo43476d().mo43086b(str2);
                if (b != null) {
                    if (Math.abs(this.f62355b.mo43011l().mo41857a() - Math.max(b.mo43162t(), b.mo43161s())) > C26530p.f62565z.mo43024a(null).longValue()) {
                        this.f62355b.mo43016q().f61834j.mo43169a("Fetching config for blacklisted app");
                        m52275a(b);
                    }
                }
            } else if (!"_err".equals(zzao2.f62578a)) {
                this.f62355b.mo43256e().mo43542b(11, "_ev", zzao2.f62578a, 0);
            }
            MethodCollector.m26664o(6332);
        } else {
            C26098kj.m51128b();
            if (this.f62355b.f62001e.mo43641d(null, C26530p.f62499aK)) {
                C26355eg a = C26355eg.m51789a(zzao2);
                this.f62355b.mo43256e().mo43533a(a, this.f62355b.f62001e.mo43630a(str2));
                zzao2 = a.mo43178a();
            }
            if (this.f62355b.mo43016q().mo43117a(2)) {
                this.f62355b.mo43016q().f61835k.mo43170a("Logging event", this.f62355b.mo43257f().mo43061a(zzao2));
            }
            mo43476d().mo43096e();
            try {
                mo43474c(zzn);
                C26109ku.m51181b();
                boolean z2 = "ecommerce_purchase".equals(zzao2.f62578a) || ((this.f62355b.f62001e.mo43641d(null, C26530p.f62498aJ)) && ("purchase".equals(zzao2.f62578a) || "refund".equals(zzao2.f62578a)));
                if ("_iap".equals(zzao2.f62578a) || z2) {
                    String d = zzao2.f62579b.mo43669d("currency");
                    if (z2) {
                        double doubleValue = zzao2.f62579b.mo43668c("value").doubleValue() * 1000000.0d;
                        if (doubleValue == 0.0d) {
                            double longValue = (double) zzao2.f62579b.mo43667b("value").longValue();
                            Double.isNaN(longValue);
                            doubleValue = longValue * 1000000.0d;
                        }
                        if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                            this.f62355b.mo43016q().f61830f.mo43171a("Data lost. Currency value is too big. appId", C26350eb.m51691a(str2), Double.valueOf(doubleValue));
                            mo43476d().mo43099f();
                            mo43476d().mo43102g();
                            MethodCollector.m26664o(6332);
                            return;
                        }
                        j2 = Math.round(doubleValue);
                        C26109ku.m51181b();
                        if (this.f62355b.f62001e.mo43641d(null, C26530p.f62498aJ) && "refund".equals(zzao2.f62578a)) {
                            j2 = -j2;
                        }
                    } else {
                        j2 = zzao2.f62579b.mo43667b("value").longValue();
                    }
                    if (!TextUtils.isEmpty(d)) {
                        String upperCase = d.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            String valueOf = String.valueOf(upperCase);
                            if (valueOf.length() != 0) {
                                str = "_ltv_".concat(valueOf);
                            } else {
                                str = new String("_ltv_");
                            }
                            C26507jw c2 = mo43476d().mo43090c(str2, str);
                            if (c2 == null || !(c2.f62395e instanceof Long)) {
                                C26348e d2 = mo43476d();
                                int b2 = this.f62355b.f62001e.mo43636b(str2, C26530p.f62466E) - 1;
                                C25565r.m49316a(str2);
                                d2.mo43002c();
                                d2.mo43486B();
                                try {
                                    d2.mo43105h().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str2, str2, String.valueOf(b2)});
                                } catch (SQLiteException e2) {
                                    d2.mo43016q().f61827c.mo43171a("Error pruning currencies. appId", C26350eb.m51691a(str2), e2);
                                }
                                String str3 = zzao2.f62580c;
                                long a2 = this.f62355b.mo43011l().mo41857a();
                                Long valueOf2 = Long.valueOf(j2);
                                i = 0;
                                jwVar = new C26507jw(str2, str3, str, a2, valueOf2);
                            } else {
                                i = 0;
                                jwVar = new C26507jw(str2, zzao2.f62580c, str, this.f62355b.mo43011l().mo41857a(), Long.valueOf(((Long) c2.f62395e).longValue() + j2));
                            }
                            if (!mo43476d().mo43081a(jwVar)) {
                                this.f62355b.mo43016q().f61827c.mo43172a("Too many unique user properties are set. Ignoring user property. appId", C26350eb.m51691a(str2), this.f62355b.mo43257f().mo43064c(jwVar.f62393c), jwVar.f62395e);
                                this.f62355b.mo43256e().mo43542b(9, (String) null, (String) null, i);
                            }
                        }
                    }
                }
                boolean a3 = C26510jz.m52394a(zzao2.f62578a);
                boolean equals = "_err".equals(zzao2.f62578a);
                C26109ku.m51181b();
                if (this.f62355b.f62001e.mo43641d(zzn.f62590a, C26530p.f62494aF)) {
                    this.f62355b.mo43256e();
                    j = C26510jz.m52382a(zzao2.f62579b) + 1;
                } else {
                    j = 1;
                }
                C26321d a4 = mo43476d().mo43068a(m52288r(), str2, j, true, a3, false, equals, false);
                long intValue = a4.f61762b - ((long) C26530p.f62550k.mo43024a(null).intValue());
                if (intValue > 0) {
                    if (intValue % 1000 == 1) {
                        this.f62355b.mo43016q().f61827c.mo43171a("Data loss. Too many events logged. appId, count", C26350eb.m51691a(str2), Long.valueOf(a4.f61762b));
                    }
                    mo43476d().mo43099f();
                    return;
                }
                if (a3) {
                    long intValue2 = a4.f61761a - ((long) C26530p.f62552m.mo43024a(null).intValue());
                    if (intValue2 > 0) {
                        if (intValue2 % 1000 == 1) {
                            this.f62355b.mo43016q().f61827c.mo43171a("Data loss. Too many public events logged. appId, count", C26350eb.m51691a(str2), Long.valueOf(a4.f61761a));
                        }
                        this.f62355b.mo43256e().mo43542b(16, "_ev", zzao2.f62578a, 0);
                        mo43476d().mo43099f();
                        mo43476d().mo43102g();
                        MethodCollector.m26664o(6332);
                        return;
                    }
                }
                if (equals) {
                    long max = a4.f61764d - ((long) Math.max(0, Math.min(1000000, this.f62355b.f62001e.mo43636b(zzn.f62590a, C26530p.f62551l))));
                    if (max > 0) {
                        if (max == 1) {
                            this.f62355b.mo43016q().f61827c.mo43171a("Too many error events logged. appId, count", C26350eb.m51691a(str2), Long.valueOf(a4.f61764d));
                        }
                        mo43476d().mo43099f();
                        mo43476d().mo43102g();
                        MethodCollector.m26664o(6332);
                        return;
                    }
                }
                Bundle a5 = zzao2.f62579b.mo43665a();
                this.f62355b.mo43256e().mo43525a(a5, "_o", zzao2.f62580c);
                if (this.f62355b.mo43256e().mo43548f(str2)) {
                    this.f62355b.mo43256e().mo43525a(a5, "_dbg", (Object) 1L);
                    this.f62355b.mo43256e().mo43525a(a5, "_r", (Object) 1L);
                }
                if ("_s".equals(zzao2.f62578a) && (c = mo43476d().mo43090c(zzn.f62590a, "_sno")) != null && (c.f62395e instanceof Long)) {
                    this.f62355b.mo43256e().mo43525a(a5, "_sno", c.f62395e);
                }
                long c3 = mo43476d().mo43089c(str2);
                if (c3 > 0) {
                    this.f62355b.mo43016q().f61830f.mo43171a("Data lost. Too many events stored on disk, deleted. appId", C26350eb.m51691a(str2), Long.valueOf(c3));
                }
                C26527m mVar = new C26527m(this.f62355b, zzao2.f62580c, str2, zzao2.f62578a, zzao2.f62581d, 0, a5);
                C26526l a6 = mo43476d().mo43070a(str2, mVar.f62455b);
                if (a6 != null) {
                    z = false;
                    mVar = mVar.mo43655a(this.f62355b, a6.f62448f);
                    lVar = a6.mo43652a(mVar.f62456c);
                } else if (mo43476d().mo43103h(str2) < ((long) this.f62355b.f62001e.mo43635b(str2)) || !a3) {
                    z = false;
                    lVar = new C26526l(str2, mVar.f62455b, mVar.f62456c);
                } else {
                    this.f62355b.mo43016q().f61827c.mo43172a("Too many event names used, ignoring event. appId, name, supported count", C26350eb.m51691a(str2), this.f62355b.mo43257f().mo43062a(mVar.f62455b), Integer.valueOf(this.f62355b.f62001e.mo43635b(str2)));
                    this.f62355b.mo43256e().mo43542b(8, (String) null, (String) null, 0);
                    mo43476d().mo43102g();
                    MethodCollector.m26664o(6332);
                    return;
                }
                mo43476d().mo43077a(lVar);
                mo43480g();
                mo43481h();
                C25565r.m49314a(mVar);
                C25565r.m49314a(zzn);
                C25565r.m49316a(mVar.f62454a);
                C25565r.m49324b(mVar.f62454a.equals(zzn.f62590a));
                C25802av.C25815g.C25816a a7 = C25802av.C25815g.m49893c().mo42007a().mo42018a("android");
                if (!TextUtils.isEmpty(zzn.f62590a)) {
                    a7.mo42130f(zzn.f62590a);
                }
                if (!TextUtils.isEmpty(zzn.f62593d)) {
                    a7.mo42125e(zzn.f62593d);
                }
                if (!TextUtils.isEmpty(zzn.f62592c)) {
                    a7.mo42134g(zzn.f62592c);
                }
                if (zzn.f62599j != -2147483648L) {
                    a7.mo42132g((int) zzn.f62599j);
                }
                a7.mo42129f(zzn.f62594e);
                if (!TextUtils.isEmpty(zzn.f62591b)) {
                    a7.mo42146k(zzn.f62591b);
                }
                C26155mm.m51249b();
                if (this.f62355b.f62001e.mo43641d(zzn.f62590a, C26530p.f62529ao)) {
                    if (TextUtils.isEmpty(a7.mo42153n()) && !TextUtils.isEmpty(zzn.f62611v)) {
                        a7.mo42155o(zzn.f62611v);
                    }
                    if (TextUtils.isEmpty(a7.mo42153n()) && TextUtils.isEmpty(a7.mo42158r()) && !TextUtils.isEmpty(zzn.f62607r)) {
                        a7.mo42152n(zzn.f62607r);
                    }
                } else if (TextUtils.isEmpty(a7.mo42153n()) && !TextUtils.isEmpty(zzn.f62607r)) {
                    a7.mo42152n(zzn.f62607r);
                }
                if (zzn.f62595f != 0) {
                    a7.mo42133g(zzn.f62595f);
                }
                a7.mo42143j(zzn.f62609t);
                if (this.f62355b.f62001e.mo43641d(zzn.f62590a, C26530p.f62485X) && (e = mo43479f().mo43504e()) != null) {
                    a7.mo42121d(e);
                }
                Pair<String, Boolean> a8 = this.f62355b.mo43253b().mo43188a(zzn.f62590a);
                if (!TextUtils.isEmpty((CharSequence) a8.first)) {
                    if (zzn.f62604o) {
                        a7.mo42138h((String) a8.first);
                        if (a8.second != null) {
                            a7.mo42106a(((Boolean) a8.second).booleanValue());
                        }
                    }
                } else if (!this.f62355b.mo43261j().mo43441a(this.f62355b.mo43012m()) && zzn.f62605p) {
                    String string = Settings.Secure.getString(this.f62355b.mo43012m().getContentResolver(), "android_id");
                    if (string == null) {
                        this.f62355b.mo43016q().f61830f.mo43170a("null secure ID. appId", C26350eb.m51691a(a7.mo42147k()));
                        string = "null";
                    } else if (string.isEmpty()) {
                        this.f62355b.mo43016q().f61830f.mo43170a("empty secure ID. appId", C26350eb.m51691a(a7.mo42147k()));
                    }
                    a7.mo42151m(string);
                }
                this.f62355b.mo43261j().mo43288x();
                C25802av.C25815g.C25816a c4 = a7.mo42116c(Build.MODEL);
                this.f62355b.mo43261j().mo43288x();
                c4.mo42110b(Build.VERSION.RELEASE).mo42123e((int) this.f62355b.mo43261j().mo43442e()).mo42122d(this.f62355b.mo43261j().mo43443f());
                if (!this.f62355b.f62001e.mo43641d(null, C26530p.f62501aM)) {
                    a7.mo42140i(zzn.f62601l);
                }
                if (this.f62355b.mo43265r()) {
                    a7.mo42147k();
                    if (!TextUtils.isEmpty(null)) {
                        a7.mo42156p();
                    }
                }
                C26351ec b3 = mo43476d().mo43086b(zzn.f62590a);
                if (b3 == null) {
                    b3 = new C26351ec(this.f62355b, zzn.f62590a);
                    b3.mo43122a(this.f62355b.mo43256e().mo43552u());
                    b3.mo43141f(zzn.f62600k);
                    b3.mo43127b(zzn.f62591b);
                    b3.mo43138e(this.f62355b.mo43253b().mo43191b(zzn.f62590a));
                    b3.mo43143g(0);
                    b3.mo43120a(0);
                    b3.mo43126b(0);
                    b3.mo43144g(zzn.f62592c);
                    b3.mo43130c(zzn.f62599j);
                    b3.mo43147h(zzn.f62593d);
                    b3.mo43134d(zzn.f62594e);
                    b3.mo43137e(zzn.f62595f);
                    b3.mo43123a(zzn.f62597h);
                    if (!this.f62355b.f62001e.mo43641d(null, C26530p.f62501aM)) {
                        b3.mo43152j(zzn.f62601l);
                    }
                    b3.mo43140f(zzn.f62609t);
                    mo43476d().mo43076a(b3);
                }
                if (!TextUtils.isEmpty(b3.mo43129c())) {
                    a7.mo42141i(b3.mo43129c());
                }
                if (!TextUtils.isEmpty(b3.mo43145h())) {
                    a7.mo42149l(b3.mo43145h());
                }
                List<C26507jw> a9 = mo43476d().mo43072a(zzn.f62590a);
                for (int i2 = 0; i2 < a9.size(); i2++) {
                    C25802av.C25824k.C25825a a10 = C25802av.C25824k.m49997d().mo42018a(a9.get(i2).f62393c).mo42179a(a9.get(i2).f62394d);
                    mo43479f().mo43499a(a10, a9.get(i2).f62395e);
                    a7.mo42103a(a10);
                }
                try {
                    long a11 = mo43476d().mo43066a((C25802av.C25815g) ((AbstractC25981gj) a7.mo42629w()));
                    C26348e d3 = mo43476d();
                    if (mVar.f62458e != null) {
                        Iterator<String> it = mVar.f62458e.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if ("_r".equals(it.next())) {
                                    break;
                                }
                            } else {
                                boolean c5 = mo43470b().mo43229c(mVar.f62454a, mVar.f62455b);
                                C26321d a12 = mo43476d().mo43069a(m52288r(), mVar.f62454a, false, false);
                                if (c5 && a12.f61765e < ((long) this.f62355b.f62001e.mo43638c(mVar.f62454a))) {
                                    z = true;
                                }
                            }
                        }
                        z = true;
                    }
                    if (d3.mo43082a(mVar, a11, z)) {
                        this.f62368p = 0;
                    }
                } catch (IOException e3) {
                    this.f62355b.mo43016q().f61827c.mo43171a("Data loss. Failed to insert raw event metadata. appId", C26350eb.m51691a(a7.mo42147k()), e3);
                }
                mo43476d().mo43099f();
                mo43476d().mo43102g();
                mo43483j();
                this.f62355b.mo43016q().f61835k.mo43170a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                MethodCollector.m26664o(6332);
            } finally {
                mo43476d().mo43102g();
                MethodCollector.m26664o(6332);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0508, code lost:
        if (r27 != false) goto L_0x050e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x075a  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0784  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0ae8  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0aea  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0af2  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0b22  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0e03  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0248  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m52279a(long r38) {
        /*
        // Method dump skipped, instructions count: 3610
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26498jo.m52279a(long):boolean");
    }

    /* renamed from: a */
    private final void m52274a(C25802av.C25815g.C25816a aVar, long j, boolean z) {
        String str;
        C26507jw jwVar;
        if (z) {
            str = "_se";
        } else {
            str = "_lte";
        }
        C26507jw c = mo43476d().mo43090c(aVar.mo42147k(), str);
        if (c == null || c.f62395e == null) {
            jwVar = new C26507jw(aVar.mo42147k(), "auto", str, this.f62355b.mo43011l().mo41857a(), Long.valueOf(j));
        } else {
            jwVar = new C26507jw(aVar.mo42147k(), "auto", str, this.f62355b.mo43011l().mo41857a(), Long.valueOf(((Long) c.f62395e).longValue() + j));
        }
        C25802av.C25824k kVar = (C25802av.C25824k) ((AbstractC25981gj) C25802av.C25824k.m49997d().mo42018a(str).mo42179a(this.f62355b.mo43011l().mo41857a()).mo42181b(((Long) jwVar.f62395e).longValue()).mo42629w());
        int a = C26506jv.m52330a(aVar, str);
        if (a >= 0) {
            aVar.mo42099a(a, kVar);
        } else {
            aVar.mo42104a(kVar);
        }
        if (j > 0) {
            mo43476d().mo43081a(jwVar);
            this.f62355b.mo43016q().f61835k.mo43171a("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", jwVar.f62395e);
        }
    }

    /* renamed from: a */
    private final boolean m52280a(C25802av.C25807c.C25808a aVar, C25802av.C25807c.C25808a aVar2) {
        String str;
        C25565r.m49324b("_e".equals(aVar.mo42076d()));
        mo43479f();
        C25802av.C25811e a = C26506jv.m52331a((C25802av.C25807c) ((AbstractC25981gj) aVar.mo42629w()), "_sc");
        String str2 = null;
        if (a != null) {
            str2 = a.zze;
        }
        mo43479f();
        C25802av.C25811e a2 = C26506jv.m52331a((C25802av.C25807c) ((AbstractC25981gj) aVar2.mo42629w()), "_pc");
        if (a2 == null || (str = a2.zze) == null || !str.equals(str2)) {
            return false;
        }
        m52282b(aVar, aVar2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43463a(int i, Throwable th, byte[] bArr) {
        byte[] bArr2 = bArr;
        MethodCollector.m26663i(6810);
        mo43480g();
        mo43481h();
        if (bArr2 == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.f62370r = false;
                m52290u();
                MethodCollector.m26664o(6810);
                throw th2;
            }
        }
        List<Long> list = this.f62374v;
        this.f62374v = null;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f62355b.mo43253b().f61904d.mo43210a(this.f62355b.mo43011l().mo41857a());
                this.f62355b.mo43253b().f61905e.mo43210a(0);
                mo43483j();
                this.f62355b.mo43016q().f61835k.mo43171a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr2.length));
                mo43476d().mo43096e();
                try {
                    for (Long l : list) {
                        try {
                            C26348e d = mo43476d();
                            long longValue = l.longValue();
                            d.mo43002c();
                            d.mo43486B();
                            try {
                                if (d.mo43105h().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                    SQLiteException sQLiteException = new SQLiteException("Deleted fewer rows from queue than expected");
                                    MethodCollector.m26664o(6810);
                                    throw sQLiteException;
                                }
                            } catch (SQLiteException e) {
                                d.mo43016q().f61827c.mo43170a("Failed to delete a bundle in a queue table", e);
                                MethodCollector.m26664o(6810);
                                throw e;
                            }
                        } catch (SQLiteException e2) {
                            List<Long> list2 = this.f62375w;
                            if (list2 == null || !list2.contains(l)) {
                                MethodCollector.m26664o(6810);
                                throw e2;
                            }
                        }
                    }
                    mo43476d().mo43099f();
                    mo43476d().mo43102g();
                    this.f62375w = null;
                    if (!mo43475c().mo43177e() || !m52289s()) {
                        this.f62376x = -1;
                        mo43483j();
                    } else {
                        mo43482i();
                    }
                    this.f62368p = 0;
                } catch (Throwable th3) {
                    mo43476d().mo43102g();
                    MethodCollector.m26664o(6810);
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f62355b.mo43016q().f61827c.mo43170a("Database error while trying to delete uploaded bundles", e3);
                this.f62368p = this.f62355b.mo43011l().mo41858b();
                this.f62355b.mo43016q().f61835k.mo43170a("Disable upload, time", Long.valueOf(this.f62368p));
            }
        } else {
            this.f62355b.mo43016q().f61835k.mo43171a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f62355b.mo43253b().f61905e.mo43210a(this.f62355b.mo43011l().mo41857a());
            if (i == 503 || i == 429) {
                this.f62355b.mo43253b().f61906f.mo43210a(this.f62355b.mo43011l().mo41857a());
            }
            mo43476d().mo43079a(list);
            mo43483j();
        }
        this.f62370r = false;
        m52290u();
        MethodCollector.m26664o(6810);
    }

    /* renamed from: a */
    private final void m52275a(C26351ec ecVar) {
        mo43480g();
        C26155mm.m51249b();
        if (this.f62355b.f62001e.mo43641d(ecVar.mo43125b(), C26530p.f62529ao)) {
            if (TextUtils.isEmpty(ecVar.mo43133d()) && TextUtils.isEmpty(ecVar.mo43139f()) && TextUtils.isEmpty(ecVar.mo43136e())) {
                mo43469a(ecVar.mo43125b(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(ecVar.mo43133d()) && TextUtils.isEmpty(ecVar.mo43136e())) {
            mo43469a(ecVar.mo43125b(), 204, null, null, null);
            return;
        }
        String a = this.f62355b.f62001e.mo43633a(ecVar);
        try {
            URL url = new URL(a);
            this.f62355b.mo43016q().f61835k.mo43170a("Fetching remote configuration", ecVar.mo43125b());
            C25794at.C25797b a2 = mo43470b().mo43224a(ecVar.mo43125b());
            C0484a aVar = null;
            String b = mo43470b().mo43226b(ecVar.mo43125b());
            if (a2 != null && !TextUtils.isEmpty(b)) {
                aVar = new C0484a();
                aVar.put("If-Modified-Since", b);
            }
            this.f62369q = true;
            C26354ef c = mo43475c();
            String b2 = ecVar.mo43125b();
            C26504jt jtVar = new C26504jt(this);
            c.mo43002c();
            c.mo43486B();
            C25565r.m49314a(url);
            C25565r.m49314a(jtVar);
            c.mo43015p().mo43222b(new RunnableC26357ei(c, b2, url, null, aVar, jtVar));
        } catch (MalformedURLException unused) {
            this.f62355b.mo43016q().f61827c.mo43171a("Failed to parse config URL. Not fetching. appId", C26350eb.m51691a(ecVar.mo43125b()), a);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43469a(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26498jo.mo43469a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* renamed from: a */
    private final boolean m52278a(int i, FileChannel fileChannel) {
        mo43480g();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f62355b.mo43016q().f61827c.mo43169a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            if (this.f62355b.f62001e.mo43641d(null, C26530p.f62540az) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0L);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f62355b.mo43016q().f61827c.mo43170a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f62355b.mo43016q().f61827c.mo43170a("Failed to write to channel", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43467a(zzn zzn) {
        MethodCollector.m26663i(6970);
        if (this.f62374v != null) {
            ArrayList arrayList = new ArrayList();
            this.f62375w = arrayList;
            arrayList.addAll(this.f62374v);
        }
        C26348e d = mo43476d();
        String str = zzn.f62590a;
        C25565r.m49316a(str);
        d.mo43002c();
        d.mo43486B();
        try {
            SQLiteDatabase h = d.mo43105h();
            String[] strArr = {str};
            int delete = h.delete("apps", "app_id=?", strArr) + 0 + h.delete("events", "app_id=?", strArr) + h.delete("user_attributes", "app_id=?", strArr) + h.delete("conditional_properties", "app_id=?", strArr) + h.delete("raw_events", "app_id=?", strArr) + h.delete("raw_events_metadata", "app_id=?", strArr) + h.delete("queue", "app_id=?", strArr) + h.delete("audience_filter_values", "app_id=?", strArr) + h.delete("main_event_params", "app_id=?", strArr) + h.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                d.mo43016q().f61835k.mo43171a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            d.mo43016q().f61827c.mo43171a("Error resetting analytics data. appId, error", C26350eb.m51691a(str), e);
        }
        if (zzn.f62597h) {
            mo43472b(zzn);
        }
        MethodCollector.m26664o(6970);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43466a(zzkr zzkr, zzn zzn) {
        mo43480g();
        mo43481h();
        if (m52285e(zzn)) {
            if (!zzn.f62597h) {
                mo43474c(zzn);
                return;
            }
            int c = this.f62355b.mo43256e().mo43544c(zzkr.f62582a);
            int i = 0;
            if (c != 0) {
                this.f62355b.mo43256e();
                String a = C26510jz.m52388a(zzkr.f62582a, 24, true);
                if (zzkr.f62582a != null) {
                    i = zzkr.f62582a.length();
                }
                this.f62355b.mo43256e().mo43542b(c, "_ev", a, i);
                return;
            }
            int b = this.f62355b.mo43256e().mo43541b(zzkr.f62582a, zzkr.mo43675a());
            if (b != 0) {
                this.f62355b.mo43256e();
                String a2 = C26510jz.m52388a(zzkr.f62582a, 24, true);
                Object a3 = zzkr.mo43675a();
                if (a3 != null && ((a3 instanceof String) || (a3 instanceof CharSequence))) {
                    i = String.valueOf(a3).length();
                }
                this.f62355b.mo43256e().mo43542b(b, "_ev", a2, i);
                return;
            }
            Object c2 = this.f62355b.mo43256e().mo43545c(zzkr.f62582a, zzkr.mo43675a());
            if (c2 != null) {
                if ("_sid".equals(zzkr.f62582a)) {
                    long j = zzkr.f62583b;
                    String str = zzkr.f62586e;
                    long j2 = 0;
                    C26507jw c3 = mo43476d().mo43090c(zzn.f62590a, "_sno");
                    if (c3 != null) {
                        if (c3.f62395e instanceof Long) {
                            j2 = ((Long) c3.f62395e).longValue();
                            mo43466a(new zzkr("_sno", j, Long.valueOf(j2 + 1), str), zzn);
                        } else {
                            this.f62355b.mo43016q().f61830f.mo43170a("Retrieved last session number from database does not contain a valid (long) value", c3.f62395e);
                        }
                    }
                    C26526l a4 = mo43476d().mo43070a(zzn.f62590a, "_s");
                    if (a4 != null) {
                        j2 = a4.f62445c;
                        this.f62355b.mo43016q().f61835k.mo43170a("Backfill the session number. Last used session number", Long.valueOf(j2));
                    }
                    mo43466a(new zzkr("_sno", j, Long.valueOf(j2 + 1), str), zzn);
                }
                C26507jw jwVar = new C26507jw(zzn.f62590a, zzkr.f62586e, zzkr.f62582a, zzkr.f62583b, c2);
                this.f62355b.mo43016q().f61835k.mo43171a("Setting user property", this.f62355b.mo43257f().mo43064c(jwVar.f62393c), c2);
                mo43476d().mo43096e();
                try {
                    mo43474c(zzn);
                    boolean a5 = mo43476d().mo43081a(jwVar);
                    mo43476d().mo43099f();
                    if (!a5) {
                        this.f62355b.mo43016q().f61827c.mo43171a("Too many unique user properties are set. Ignoring user property", this.f62355b.mo43257f().mo43064c(jwVar.f62393c), jwVar.f62395e);
                        this.f62355b.mo43256e().mo43542b(9, (String) null, (String) null, 0);
                    }
                } finally {
                    mo43476d().mo43102g();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzn mo43461a(String str) {
        C26351ec b = mo43476d().mo43086b(str);
        if (b == null || TextUtils.isEmpty(b.mo43153k())) {
            this.f62355b.mo43016q().f61834j.mo43170a("No app data available; dropping", str);
            return null;
        }
        Boolean b2 = m52281b(b);
        if (b2 == null || b2.booleanValue()) {
            String d = b.mo43133d();
            String k = b.mo43153k();
            long l = b.mo43154l();
            String m = b.mo43155m();
            long n = b.mo43156n();
            long o = b.mo43157o();
            boolean q = b.mo43159q();
            String h = b.mo43145h();
            long w = b.mo43165w();
            boolean x = b.mo43166x();
            boolean y = b.mo43167y();
            String e = b.mo43136e();
            Boolean z = b.mo43168z();
            long p = b.mo43158p();
            List<String> A = b.mo43119A();
            C26155mm.m51249b();
            return new zzn(str, d, k, l, m, n, o, (String) null, q, false, h, w, 0L, 0, x, y, false, e, z, p, A, this.f62355b.f62001e.mo43641d(str, C26530p.f62529ao) ? b.mo43139f() : null);
        }
        this.f62355b.mo43016q().f61827c.mo43170a("App version does not match; dropping. appId", C26350eb.m51691a(str));
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43468a(zzw zzw, zzn zzn) {
        C25565r.m49314a(zzw);
        C25565r.m49316a(zzw.f62612a);
        C25565r.m49314a((Object) zzw.f62613b);
        C25565r.m49314a(zzw.f62614c);
        C25565r.m49316a(zzw.f62614c.f62582a);
        mo43480g();
        mo43481h();
        if (m52285e(zzn)) {
            if (!zzn.f62597h) {
                mo43474c(zzn);
                return;
            }
            zzw zzw2 = new zzw(zzw);
            boolean z = false;
            zzw2.f62616e = false;
            mo43476d().mo43096e();
            try {
                zzw d = mo43476d().mo43091d(zzw2.f62612a, zzw2.f62614c.f62582a);
                if (d != null && !d.f62613b.equals(zzw2.f62613b)) {
                    this.f62355b.mo43016q().f61830f.mo43172a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f62355b.mo43257f().mo43064c(zzw2.f62614c.f62582a), zzw2.f62613b, d.f62613b);
                }
                if (d != null && d.f62616e) {
                    zzw2.f62613b = d.f62613b;
                    zzw2.f62615d = d.f62615d;
                    zzw2.f62619h = d.f62619h;
                    zzw2.f62617f = d.f62617f;
                    zzw2.f62620i = d.f62620i;
                    zzw2.f62616e = d.f62616e;
                    zzw2.f62614c = new zzkr(zzw2.f62614c.f62582a, d.f62614c.f62583b, zzw2.f62614c.mo43675a(), d.f62614c.f62586e);
                } else if (TextUtils.isEmpty(zzw2.f62617f)) {
                    zzw2.f62614c = new zzkr(zzw2.f62614c.f62582a, zzw2.f62615d, zzw2.f62614c.mo43675a(), zzw2.f62614c.f62586e);
                    zzw2.f62616e = true;
                    z = true;
                }
                if (zzw2.f62616e) {
                    zzkr zzkr = zzw2.f62614c;
                    C26507jw jwVar = new C26507jw(zzw2.f62612a, zzw2.f62613b, zzkr.f62582a, zzkr.f62583b, zzkr.mo43675a());
                    if (mo43476d().mo43081a(jwVar)) {
                        this.f62355b.mo43016q().f61834j.mo43172a("User property updated immediately", zzw2.f62612a, this.f62355b.mo43257f().mo43064c(jwVar.f62393c), jwVar.f62395e);
                    } else {
                        this.f62355b.mo43016q().f61827c.mo43172a("(2)Too many active user properties, ignoring", C26350eb.m51691a(zzw2.f62612a), this.f62355b.mo43257f().mo43064c(jwVar.f62393c), jwVar.f62395e);
                    }
                    if (z && zzw2.f62620i != null) {
                        m52284c(new zzao(zzw2.f62620i, zzw2.f62615d), zzn);
                    }
                }
                if (mo43476d().mo43083a(zzw2)) {
                    this.f62355b.mo43016q().f61834j.mo43172a("Conditional property added", zzw2.f62612a, this.f62355b.mo43257f().mo43064c(zzw2.f62614c.f62582a), zzw2.f62614c.mo43675a());
                } else {
                    this.f62355b.mo43016q().f61827c.mo43172a("Too many conditional properties, ignoring", C26350eb.m51691a(zzw2.f62612a), this.f62355b.mo43257f().mo43064c(zzw2.f62614c.f62582a), zzw2.f62614c.mo43675a());
                }
                mo43476d().mo43099f();
            } finally {
                mo43476d().mo43102g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43473b(zzw zzw, zzn zzn) {
        C25565r.m49314a(zzw);
        C25565r.m49316a(zzw.f62612a);
        C25565r.m49314a(zzw.f62614c);
        C25565r.m49316a(zzw.f62614c.f62582a);
        mo43480g();
        mo43481h();
        if (m52285e(zzn)) {
            if (!zzn.f62597h) {
                mo43474c(zzn);
                return;
            }
            mo43476d().mo43096e();
            try {
                mo43474c(zzn);
                zzw d = mo43476d().mo43091d(zzw.f62612a, zzw.f62614c.f62582a);
                if (d != null) {
                    this.f62355b.mo43016q().f61834j.mo43171a("Removing conditional user property", zzw.f62612a, this.f62355b.mo43257f().mo43064c(zzw.f62614c.f62582a));
                    mo43476d().mo43094e(zzw.f62612a, zzw.f62614c.f62582a);
                    if (d.f62616e) {
                        mo43476d().mo43088b(zzw.f62612a, zzw.f62614c.f62582a);
                    }
                    if (zzw.f62622k != null) {
                        Bundle bundle = null;
                        if (zzw.f62622k.f62579b != null) {
                            bundle = zzw.f62622k.f62579b.mo43665a();
                        }
                        m52284c(this.f62355b.mo43256e().mo43519a(zzw.f62612a, zzw.f62622k.f62578a, bundle, d.f62613b, zzw.f62622k.f62581d), zzn);
                    }
                } else {
                    this.f62355b.mo43016q().f61830f.mo43171a("Conditional user property doesn't exist", C26350eb.m51691a(zzw.f62612a), this.f62355b.mo43257f().mo43064c(zzw.f62614c.f62582a));
                }
                mo43476d().mo43099f();
            } finally {
                mo43476d().mo43102g();
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m52276a(C26498jo joVar) {
        joVar.f62355b.mo43015p().mo43002c();
        C26348e eVar = new C26348e(joVar);
        eVar.mo43487C();
        joVar.f62361i = eVar;
        joVar.f62355b.f62001e.f62440a = joVar.f62359g;
        C26515kd kdVar = new C26515kd(joVar);
        kdVar.mo43487C();
        joVar.f62364l = kdVar;
        C26441hl hlVar = new C26441hl(joVar);
        hlVar.mo43487C();
        joVar.f62354a = hlVar;
        C26494jk jkVar = new C26494jk(joVar);
        jkVar.mo43487C();
        joVar.f62363k = jkVar;
        joVar.f62362j = new C26360el(joVar);
        if (joVar.f62357d != joVar.f62358e) {
            joVar.f62355b.mo43016q().f61827c.mo43171a("Not all upload components initialized", Integer.valueOf(joVar.f62357d), Integer.valueOf(joVar.f62358e));
        }
        joVar.f62366n = true;
    }

    /* renamed from: o */
    private final C26494jk m52287o() {
        m52277a(this.f62363k);
        return this.f62363k;
    }

    /* renamed from: b */
    public final C26373ey mo43470b() {
        m52277a(this.f62359g);
        return this.f62359g;
    }

    /* renamed from: c */
    public final C26354ef mo43475c() {
        m52277a(this.f62360h);
        return this.f62360h;
    }

    /* renamed from: d */
    public final C26348e mo43476d() {
        m52277a(this.f62361i);
        return this.f62361i;
    }

    /* renamed from: e */
    public final C26515kd mo43478e() {
        m52277a(this.f62364l);
        return this.f62364l;
    }

    /* renamed from: f */
    public final C26506jv mo43479f() {
        m52277a(this.f62365m);
        return this.f62365m;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb
    /* renamed from: l */
    public final AbstractC25603e mo43011l() {
        return this.f62355b.mo43011l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb
    /* renamed from: m */
    public final Context mo43012m() {
        return this.f62355b.mo43012m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb
    /* renamed from: p */
    public final C26372ex mo43015p() {
        return this.f62355b.mo43015p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb
    /* renamed from: q */
    public final C26350eb mo43016q() {
        return this.f62355b.mo43016q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb
    /* renamed from: t */
    public final C26523kl mo43019t() {
        return this.f62355b.mo43019t();
    }

    /* renamed from: n */
    private final C26360el m52286n() {
        C26360el elVar = this.f62362j;
        if (elVar != null) {
            return elVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo43480g() {
        this.f62355b.mo43015p().mo43002c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo43481h() {
        if (!this.f62366n) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: s */
    private final boolean m52289s() {
        mo43480g();
        mo43481h();
        if (mo43476d().mo43112x() || !TextUtils.isEmpty(mo43476d().mo43107i())) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private final long m52288r() {
        long a = this.f62355b.mo43011l().mo41857a();
        C26361em b = this.f62355b.mo43253b();
        b.mo43288x();
        b.mo43002c();
        long a2 = b.f61908h.mo43209a();
        if (a2 == 0) {
            a2 = 1 + ((long) b.mo43014o().mo43549g().nextInt(86400000));
            b.f61908h.mo43210a(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: u */
    private final void m52290u() {
        mo43480g();
        if (this.f62369q || this.f62370r || this.f62371s) {
            this.f62355b.mo43016q().f61835k.mo43172a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f62369q), Boolean.valueOf(this.f62370r), Boolean.valueOf(this.f62371s));
            return;
        }
        this.f62355b.mo43016q().f61835k.mo43169a("Stopping uploading service(s)");
        List<Runnable> list = this.f62356c;
        if (list != null) {
            for (Runnable runnable : list) {
                runnable.run();
            }
            this.f62356c.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo43484k() {
        mo43480g();
        mo43481h();
        if (!this.f62367o) {
            this.f62367o = true;
            if (m52291v()) {
                int a = m52268a(this.f62373u);
                int A = this.f62355b.mo43262k().mo43042A();
                mo43480g();
                if (a > A) {
                    this.f62355b.mo43016q().f61827c.mo43171a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                } else if (a >= A) {
                } else {
                    if (m52278a(A, this.f62373u)) {
                        this.f62355b.mo43016q().f61835k.mo43171a("Storage version upgraded. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                    } else {
                        this.f62355b.mo43016q().f61827c.mo43171a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                    }
                }
            }
        }
    }

    /* renamed from: v */
    private final boolean m52291v() {
        FileLock fileLock;
        mo43480g();
        if (!this.f62355b.f62001e.mo43641d(null, C26530p.f62527am) || (fileLock = this.f62372t) == null || !fileLock.isValid()) {
            Context m = this.f62355b.mo43012m();
            if (C58016d.f132222c == null || !C58016d.f132224e) {
                C58016d.f132222c = m.getFilesDir();
            }
            try {
                FileChannel channel = new RandomAccessFile(new File(C58016d.f132222c, "google_app_measurement.db"), "rw").getChannel();
                this.f62373u = channel;
                FileLock tryLock = channel.tryLock();
                this.f62372t = tryLock;
                if (tryLock != null) {
                    this.f62355b.mo43016q().f61835k.mo43169a("Storage concurrent access okay");
                    return true;
                }
                this.f62355b.mo43016q().f61827c.mo43169a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                this.f62355b.mo43016q().f61827c.mo43170a("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                this.f62355b.mo43016q().f61827c.mo43170a("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                this.f62355b.mo43016q().f61830f.mo43170a("Storage lock already acquired", e3);
                return false;
            }
        } else {
            this.f62355b.mo43016q().f61835k.mo43169a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo43482i() {
        C26351ec b;
        boolean z;
        mo43480g();
        mo43481h();
        this.f62371s = true;
        try {
            this.f62355b.mo43019t();
            Boolean bool = this.f62355b.mo43260i().f62223c;
            if (bool == null) {
                this.f62355b.mo43016q().f61830f.mo43169a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                this.f62355b.mo43016q().f61827c.mo43169a("Upload called in the client side when service should be used");
                this.f62371s = false;
                m52290u();
            } else if (this.f62368p > 0) {
                mo43483j();
                this.f62371s = false;
                m52290u();
            } else {
                mo43480g();
                if (this.f62374v != null) {
                    this.f62355b.mo43016q().f61835k.mo43169a("Uploading requested multiple times");
                    this.f62371s = false;
                    m52290u();
                } else if (!mo43475c().mo43177e()) {
                    this.f62355b.mo43016q().f61835k.mo43169a("Network not connected, ignoring upload request");
                    mo43483j();
                    this.f62371s = false;
                    m52290u();
                } else {
                    long a = this.f62355b.mo43011l().mo41857a();
                    int b2 = this.f62355b.f62001e.mo43636b(null, C26530p.f62478Q);
                    long j = a - C26524km.m52497j();
                    for (int i = 0; i < b2 && m52279a(j); i++) {
                    }
                    long a2 = this.f62355b.mo43253b().f61904d.mo43209a();
                    if (a2 != 0) {
                        this.f62355b.mo43016q().f61834j.mo43170a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a - a2)));
                    }
                    String i2 = mo43476d().mo43107i();
                    if (!TextUtils.isEmpty(i2)) {
                        if (this.f62376x == -1) {
                            this.f62376x = mo43476d().mo43114z();
                        }
                        List<Pair<C25802av.C25815g, Long>> a3 = mo43476d().mo43073a(i2, this.f62355b.f62001e.mo43636b(i2, C26530p.f62546g), Math.max(0, this.f62355b.f62001e.mo43636b(i2, C26530p.f62547h)));
                        if (!a3.isEmpty()) {
                            Iterator<Pair<C25802av.C25815g, Long>> it = a3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C25802av.C25815g gVar = (C25802av.C25815g) it.next().first;
                                if (!TextUtils.isEmpty(gVar.zzw)) {
                                    String str = gVar.zzw;
                                    if (str != null) {
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= a3.size()) {
                                                break;
                                            }
                                            C25802av.C25815g gVar2 = (C25802av.C25815g) a3.get(i3).first;
                                            if (!(TextUtils.isEmpty(gVar2.zzw) || gVar2.zzw.equals(str))) {
                                                a3 = a3.subList(0, i3);
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                }
                            }
                            C25802av.C25813f.C25814a a4 = C25802av.C25813f.m49880a();
                            int size = a3.size();
                            ArrayList arrayList = new ArrayList(a3.size());
                            boolean f = this.f62355b.f62001e.mo43645f(i2);
                            for (int i4 = 0; i4 < size; i4++) {
                                C25802av.C25815g.C25816a aVar = (C25802av.C25815g.C25816a) ((C25802av.C25815g) a3.get(i4).first).mo42620l();
                                arrayList.add((Long) a3.get(i4).second);
                                C25802av.C25815g.C25816a a5 = aVar.mo42148l().mo42100a(a);
                                this.f62355b.mo43019t();
                                a5.mo42111b(false);
                                if (!f) {
                                    aVar.mo42157q();
                                }
                                if (this.f62355b.f62001e.mo43641d(i2, C26530p.f62487Z)) {
                                    aVar.mo42145k(mo43479f().mo43490a(((C25802av.C25815g) ((AbstractC25981gj) aVar.mo42629w())).mo42364h()));
                                }
                                a4.mo42094a(aVar);
                            }
                            String a6 = this.f62355b.mo43016q().mo43117a(2) ? mo43479f().mo43495a((C25802av.C25813f) ((AbstractC25981gj) a4.mo42629w())) : null;
                            mo43479f();
                            byte[] h = ((C25802av.C25813f) ((AbstractC25981gj) a4.mo42629w())).mo42364h();
                            String a7 = C26530p.f62556q.mo43024a(null);
                            try {
                                URL url = new URL(a7);
                                if (!arrayList.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C25565r.m49324b(z);
                                if (this.f62374v != null) {
                                    this.f62355b.mo43016q().f61827c.mo43169a("Set uploading progress before finishing the previous upload");
                                } else {
                                    this.f62374v = new ArrayList(arrayList);
                                }
                                this.f62355b.mo43253b().f61905e.mo43210a(a);
                                String str2 = "?";
                                if (size > 0) {
                                    str2 = a4.mo42007a().zzs;
                                }
                                this.f62355b.mo43016q().f61835k.mo43172a("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(h.length), a6);
                                this.f62370r = true;
                                C26354ef c = mo43475c();
                                C26501jq jqVar = new C26501jq(this, i2);
                                c.mo43002c();
                                c.mo43486B();
                                C25565r.m49314a(url);
                                C25565r.m49314a(h);
                                C25565r.m49314a(jqVar);
                                c.mo43015p().mo43222b(new RunnableC26357ei(c, i2, url, h, null, jqVar));
                            } catch (MalformedURLException unused) {
                                this.f62355b.mo43016q().f61827c.mo43171a("Failed to parse upload URL. Not uploading. appId", C26350eb.m51691a(i2), a7);
                            }
                        }
                    } else {
                        this.f62376x = -1;
                        String a8 = mo43476d().mo43071a(a - C26524km.m52497j());
                        if (!TextUtils.isEmpty(a8) && (b = mo43476d().mo43086b(a8)) != null) {
                            m52275a(b);
                        }
                    }
                    this.f62371s = false;
                    m52290u();
                }
            }
        } finally {
            this.f62371s = false;
            m52290u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo43483j() {
        boolean z;
        long j;
        mo43480g();
        mo43481h();
        if (this.f62368p > 0) {
            long abs = 3600000 - Math.abs(this.f62355b.mo43011l().mo41858b() - this.f62368p);
            if (abs > 0) {
                this.f62355b.mo43016q().f61835k.mo43170a("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                m52286n().mo43185b();
                m52287o().mo43459e();
                return;
            }
            this.f62368p = 0;
        }
        if (!this.f62355b.mo43268w() || !m52289s()) {
            this.f62355b.mo43016q().f61835k.mo43169a("Nothing to upload or uploading impossible");
            m52286n().mo43185b();
            m52287o().mo43459e();
            return;
        }
        long a = this.f62355b.mo43011l().mo41857a();
        long max = Math.max(0L, C26530p.f62462A.mo43024a(null).longValue());
        if (mo43476d().mo43113y() || mo43476d().mo43108j()) {
            z = true;
            String u = this.f62355b.f62001e.mo43648u();
            if (TextUtils.isEmpty(u) || ".none.".equals(u)) {
                j = Math.max(0L, C26530p.f62560u.mo43024a(null).longValue());
            } else {
                j = Math.max(0L, C26530p.f62561v.mo43024a(null).longValue());
            }
        } else {
            z = false;
            j = Math.max(0L, C26530p.f62559t.mo43024a(null).longValue());
        }
        long a2 = this.f62355b.mo43253b().f61904d.mo43209a();
        long a3 = this.f62355b.mo43253b().f61905e.mo43209a();
        long max2 = Math.max(mo43476d().mo43110v(), mo43476d().mo43111w());
        if (max2 != 0) {
            long abs2 = a - Math.abs(max2 - a);
            long abs3 = a - Math.abs(a2 - a);
            long abs4 = a - Math.abs(a3 - a);
            long max3 = Math.max(abs3, abs4);
            long j2 = abs2 + max;
            if (z && max3 > 0) {
                j2 = Math.min(abs2, max3) + j;
            }
            if (!mo43479f().mo43500a(max3, j)) {
                j2 = max3 + j;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i = 0;
                while (true) {
                    if (i >= Math.min(20, Math.max(0, C26530p.f62464C.mo43024a(null).intValue()))) {
                        break;
                    }
                    j2 += Math.max(0L, C26530p.f62463B.mo43024a(null).longValue()) * (1 << i);
                    if (j2 > abs4) {
                        break;
                    }
                    i++;
                }
            }
            if (j2 != 0) {
                if (!mo43475c().mo43177e()) {
                    this.f62355b.mo43016q().f61835k.mo43169a("No network");
                    m52286n().mo43184a();
                    m52287o().mo43459e();
                    return;
                }
                long a4 = this.f62355b.mo43253b().f61906f.mo43209a();
                long max4 = Math.max(0L, C26530p.f62557r.mo43024a(null).longValue());
                if (!mo43479f().mo43500a(a4, max4)) {
                    j2 = Math.max(j2, a4 + max4);
                }
                m52286n().mo43185b();
                long a5 = j2 - this.f62355b.mo43011l().mo41857a();
                if (a5 <= 0) {
                    a5 = Math.max(0L, C26530p.f62562w.mo43024a(null).longValue());
                    this.f62355b.mo43253b().f61904d.mo43210a(this.f62355b.mo43011l().mo41857a());
                }
                this.f62355b.mo43016q().f61835k.mo43170a("Upload scheduled in approximately ms", Long.valueOf(a5));
                m52287o().mo43458a(a5);
                return;
            }
        }
        this.f62355b.mo43016q().f61835k.mo43169a("Next upload time is 0");
        m52286n().mo43185b();
        m52287o().mo43459e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.measurement.internal.jo$a */
    public class C26499a implements AbstractC26402g {

        /* renamed from: a */
        C25802av.C25815g f62377a;

        /* renamed from: b */
        List<Long> f62378b;

        /* renamed from: c */
        List<C25802av.C25807c> f62379c;

        /* renamed from: d */
        private long f62380d;

        static {
            Covode.recordClassIndex(31921);
        }

        private C26499a() {
        }

        @Override // com.google.android.gms.measurement.internal.AbstractC26402g
        /* renamed from: a */
        public final void mo43291a(C25802av.C25815g gVar) {
            C25565r.m49314a(gVar);
            this.f62377a = gVar;
        }

        /* renamed from: a */
        private static long m52321a(C25802av.C25807c cVar) {
            return ((cVar.zzf / 1000) / 60) / 60;
        }

        /* synthetic */ C26499a(C26498jo joVar, byte b) {
            this();
        }

        @Override // com.google.android.gms.measurement.internal.AbstractC26402g
        /* renamed from: a */
        public final boolean mo43292a(long j, C25802av.C25807c cVar) {
            C25565r.m49314a(cVar);
            if (this.f62379c == null) {
                this.f62379c = new ArrayList();
            }
            if (this.f62378b == null) {
                this.f62378b = new ArrayList();
            }
            if (this.f62379c.size() > 0 && m52321a(this.f62379c.get(0)) != m52321a(cVar)) {
                return false;
            }
            long m = this.f62380d + ((long) cVar.mo42621m());
            if (m >= ((long) Math.max(0, C26530p.f62548i.mo43024a(null).intValue()))) {
                return false;
            }
            this.f62380d = m;
            this.f62379c.add(cVar);
            this.f62378b.add(Long.valueOf(j));
            if (this.f62379c.size() >= Math.max(1, C26530p.f62549j.mo43024a(null).intValue())) {
                return false;
            }
            return true;
        }
    }

    private C26498jo(C26505ju juVar) {
        this(juVar, (byte) 0);
    }

    /* renamed from: a */
    public static C26498jo m52270a(Context context) {
        MethodCollector.m26663i(9473);
        C25565r.m49314a(context);
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C25565r.m49314a(applicationContext);
        if (f62353f == null) {
            synchronized (C26498jo.class) {
                try {
                    if (f62353f == null) {
                        f62353f = new C26498jo(new C26505ju(context));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9473);
                    throw th;
                }
            }
        }
        C26498jo joVar = f62353f;
        MethodCollector.m26664o(9473);
        return joVar;
    }

    /* renamed from: e */
    private final boolean m52285e(zzn zzn) {
        C26155mm.m51249b();
        if (this.f62355b.f62001e.mo43641d(zzn.f62590a, C26530p.f62529ao)) {
            if (!TextUtils.isEmpty(zzn.f62591b) || !TextUtils.isEmpty(zzn.f62611v) || !TextUtils.isEmpty(zzn.f62607r)) {
                return true;
            }
            return false;
        } else if (!TextUtils.isEmpty(zzn.f62591b) || !TextUtils.isEmpty(zzn.f62607r)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo43477d(zzn zzn) {
        try {
            return (String) this.f62355b.mo43015p().mo43219a(new CallableC26503js(this, zzn)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f62355b.mo43016q().f61827c.mo43171a("Failed to get app instance id. appId", C26350eb.m51691a(zzn.f62590a), e);
            return null;
        }
    }

    /* renamed from: a */
    private final int m52268a(FileChannel fileChannel) {
        mo43480g();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f62355b.mo43016q().f61827c.mo43169a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f62355b.mo43016q().f61830f.mo43170a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e) {
            this.f62355b.mo43016q().f61827c.mo43170a("Failed to read from channel", e);
            return 0;
        }
    }

    /* renamed from: b */
    private final Boolean m52281b(C26351ec ecVar) {
        try {
            if (ecVar.mo43154l() != -2147483648L) {
                if (ecVar.mo43154l() == ((long) C25500c.f60481a.mo41741a(this.f62355b.mo43012m()).mo41740b(ecVar.mo43125b(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = C25500c.f60481a.mo41741a(this.f62355b.mo43012m()).mo41740b(ecVar.mo43125b(), 0).versionName;
                if (ecVar.mo43153k() != null && ecVar.mo43153k().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C26351ec mo43474c(zzn zzn) {
        mo43480g();
        mo43481h();
        C25565r.m49314a(zzn);
        C25565r.m49316a(zzn.f62590a);
        C26351ec b = mo43476d().mo43086b(zzn.f62590a);
        String b2 = this.f62355b.mo43253b().mo43191b(zzn.f62590a);
        C26136lu.m51225b();
        if (!this.f62355b.f62001e.mo43641d(null, C26530p.f62535au)) {
            return m52269a(zzn, b, b2);
        }
        if (b == null) {
            b = new C26351ec(this.f62355b, zzn.f62590a);
            b.mo43122a(this.f62355b.mo43256e().mo43552u());
            b.mo43138e(b2);
        } else if (!b2.equals(b.mo43142g())) {
            b.mo43138e(b2);
            b.mo43122a(this.f62355b.mo43256e().mo43552u());
        }
        b.mo43127b(zzn.f62591b);
        b.mo43131c(zzn.f62607r);
        C26155mm.m51249b();
        if (this.f62355b.f62001e.mo43641d(b.mo43125b(), C26530p.f62529ao)) {
            b.mo43135d(zzn.f62611v);
        }
        if (!TextUtils.isEmpty(zzn.f62600k)) {
            b.mo43141f(zzn.f62600k);
        }
        if (zzn.f62594e != 0) {
            b.mo43134d(zzn.f62594e);
        }
        if (!TextUtils.isEmpty(zzn.f62592c)) {
            b.mo43144g(zzn.f62592c);
        }
        b.mo43130c(zzn.f62599j);
        if (zzn.f62593d != null) {
            b.mo43147h(zzn.f62593d);
        }
        b.mo43137e(zzn.f62595f);
        b.mo43123a(zzn.f62597h);
        if (!TextUtils.isEmpty(zzn.f62596g)) {
            b.mo43150i(zzn.f62596g);
        }
        if (!this.f62355b.f62001e.mo43641d(null, C26530p.f62501aM)) {
            b.mo43152j(zzn.f62601l);
        }
        b.mo43128b(zzn.f62604o);
        b.mo43132c(zzn.f62605p);
        b.mo43121a(zzn.f62608s);
        b.mo43140f(zzn.f62609t);
        if (b.mo43124a()) {
            mo43476d().mo43076a(b);
        }
        return b;
    }

    /* renamed from: a */
    private static void m52273a(C25802av.C25815g.C25816a aVar) {
        aVar.mo42108b(Long.MAX_VALUE).mo42114c(Long.MIN_VALUE);
        for (int i = 0; i < aVar.mo42113c(); i++) {
            C25802av.C25807c a = aVar.mo42097a(i);
            if (a.zzf < aVar.mo42131g()) {
                aVar.mo42108b(a.zzf);
            }
            if (a.zzf > aVar.mo42135h()) {
                aVar.mo42114c(a.zzf);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0259  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43472b(com.google.android.gms.measurement.internal.zzn r26) {
        /*
        // Method dump skipped, instructions count: 1203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26498jo.mo43472b(com.google.android.gms.measurement.internal.zzn):void");
    }

    private C26498jo(C26505ju juVar, byte b) {
        C25565r.m49314a(juVar);
        C26381ff a = C26381ff.m51900a(juVar.f62390a, null, null);
        this.f62355b = a;
        this.f62376x = -1;
        C26506jv jvVar = new C26506jv(this);
        jvVar.mo43487C();
        this.f62365m = jvVar;
        C26354ef efVar = new C26354ef(this);
        efVar.mo43487C();
        this.f62360h = efVar;
        C26373ey eyVar = new C26373ey(this);
        eyVar.mo43487C();
        this.f62359g = eyVar;
        a.mo43015p().mo43220a(new RunnableC26502jr(this, juVar));
    }

    /* renamed from: b */
    private final void m52282b(C25802av.C25807c.C25808a aVar, C25802av.C25807c.C25808a aVar2) {
        C25565r.m49324b("_e".equals(aVar.mo42076d()));
        mo43479f();
        C25802av.C25811e a = C26506jv.m52331a((C25802av.C25807c) ((AbstractC25981gj) aVar.mo42629w()), "_et");
        if (a.mo42082b() && a.zzf > 0) {
            long j = a.zzf;
            mo43479f();
            C25802av.C25811e a2 = C26506jv.m52331a((C25802av.C25807c) ((AbstractC25981gj) aVar2.mo42629w()), "_et");
            if (a2 != null && a2.zzf > 0) {
                j += a2.zzf;
            }
            mo43479f().mo43497a(aVar2, "_et", Long.valueOf(j));
            mo43479f().mo43497a(aVar, "_fr", (Object) 1L);
        }
    }

    /* renamed from: b */
    private final void m52283b(zzao zzao, zzn zzn) {
        C26156mn.m51251b();
        if (this.f62355b.f62001e.mo43641d(null, C26530p.f62503aO)) {
            C26355eg a = C26355eg.m51789a(zzao);
            this.f62355b.mo43256e().mo43524a(a.f61877b, mo43476d().mo43106i(zzn.f62590a));
            this.f62355b.mo43256e().mo43533a(a, this.f62355b.f62001e.mo43630a(zzn.f62590a));
            zzao = a.mo43178a();
        }
        mo43464a(zzao, zzn);
    }

    /* renamed from: a */
    private static void m52272a(C25802av.C25807c.C25808a aVar, String str) {
        List a = aVar.mo42007a();
        for (int i = 0; i < a.size(); i++) {
            if (str.equals(((C25802av.C25811e) a.get(i)).zzd)) {
                aVar.mo42073b(i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43471b(zzkr zzkr, zzn zzn) {
        long j;
        mo43480g();
        mo43481h();
        if (m52285e(zzn)) {
            if (!zzn.f62597h) {
                mo43474c(zzn);
            } else if (!"_npa".equals(zzkr.f62582a) || zzn.f62608s == null) {
                this.f62355b.mo43016q().f61834j.mo43170a("Removing user property", this.f62355b.mo43257f().mo43064c(zzkr.f62582a));
                mo43476d().mo43096e();
                try {
                    mo43474c(zzn);
                    mo43476d().mo43088b(zzn.f62590a, zzkr.f62582a);
                    mo43476d().mo43099f();
                    this.f62355b.mo43016q().f61834j.mo43170a("User property removed", this.f62355b.mo43257f().mo43064c(zzkr.f62582a));
                } finally {
                    mo43476d().mo43102g();
                }
            } else {
                this.f62355b.mo43016q().f61834j.mo43169a("Falling back to manifest metadata value for ad personalization");
                long a = this.f62355b.mo43011l().mo41857a();
                if (zzn.f62608s.booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                mo43466a(new zzkr("_npa", a, Long.valueOf(j), "auto"), zzn);
            }
        }
    }

    /* renamed from: a */
    private static void m52271a(C25802av.C25807c.C25808a aVar, int i, String str) {
        List a = aVar.mo42007a();
        for (int i2 = 0; i2 < a.size(); i2++) {
            if ("_err".equals(((C25802av.C25811e) a.get(i2)).zzd)) {
                return;
            }
        }
        aVar.mo42069a((C25802av.C25811e) ((AbstractC25981gj) C25802av.C25811e.m49862e().mo42018a("_err").mo42086a(Long.valueOf((long) i).longValue()).mo42629w())).mo42069a((C25802av.C25811e) ((AbstractC25981gj) C25802av.C25811e.m49862e().mo42018a("_ev").mo42090b(str).mo42629w()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0174, code lost:
        if (r7 == false) goto L_0x0173;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.C26351ec m52269a(com.google.android.gms.measurement.internal.zzn r9, com.google.android.gms.measurement.internal.C26351ec r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 406
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26498jo.m52269a(com.google.android.gms.measurement.internal.zzn, com.google.android.gms.measurement.internal.ec, java.lang.String):com.google.android.gms.measurement.internal.ec");
    }
}

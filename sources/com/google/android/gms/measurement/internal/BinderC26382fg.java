package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.C25505h;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.C25612n;
import com.google.android.gms.internal.measurement.C26156mn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.fg */
public final class BinderC26382fg extends AbstractBinderC26340ds {

    /* renamed from: a */
    final C26498jo f62022a;

    /* renamed from: b */
    private Boolean f62023b;

    /* renamed from: c */
    private String f62024c;

    static {
        Covode.recordClassIndex(31804);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43032a(zzao zzao, zzn zzn) {
        C25565r.m49314a(zzao);
        m51934e(zzn);
        m51932a(new RunnableC26393fr(this, zzao, zzn));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43033a(zzao zzao, String str, String str2) {
        C25565r.m49314a(zzao);
        C25565r.m49316a(str);
        m51933a(str, true);
        m51932a(new RunnableC26392fq(this, zzao, str));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final byte[] mo43038a(zzao zzao, String str) {
        C25565r.m49316a(str);
        C25565r.m49314a(zzao);
        m51933a(str, true);
        this.f62022a.mo43016q().f61834j.mo43170a("Log and bundle. event", this.f62022a.f62355b.mo43257f().mo43062a(zzao.f62578a));
        long c = this.f62022a.mo43011l().mo41859c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f62022a.mo43015p().mo43221b(new CallableC26395ft(this, zzao, str)).get();
            if (bArr == null) {
                this.f62022a.mo43016q().f61827c.mo43170a("Log and bundle returned null. appId", C26350eb.m51691a(str));
                bArr = new byte[0];
            }
            this.f62022a.mo43016q().f61834j.mo43172a("Log and bundle processed. event, size, time_ms", this.f62022a.f62355b.mo43257f().mo43062a(zzao.f62578a), Integer.valueOf(bArr.length), Long.valueOf((this.f62022a.mo43011l().mo41859c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f62022a.mo43016q().f61827c.mo43172a("Failed to log and bundle. appId, event, error", C26350eb.m51691a(str), this.f62022a.f62355b.mo43257f().mo43062a(zzao.f62578a), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43034a(zzkr zzkr, zzn zzn) {
        C25565r.m49314a(zzkr);
        m51934e(zzn);
        m51932a(new RunnableC26394fs(this, zzkr, zzn));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43035a(zzn zzn) {
        m51934e(zzn);
        m51932a(new RunnableC26396fu(this, zzn));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43031a(Bundle bundle, zzn zzn) {
        C26156mn.m51251b();
        if (this.f62022a.f62355b.f62001e.mo43641d(null, C26530p.f62503aO)) {
            m51934e(zzn);
            m51932a(new RunnableC26385fj(this, zzn, bundle));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43037a(zzw zzw, zzn zzn) {
        C25565r.m49314a(zzw);
        C25565r.m49314a(zzw.f62614c);
        m51934e(zzn);
        zzw zzw2 = new zzw(zzw);
        zzw2.f62612a = zzn.f62590a;
        m51932a(new RunnableC26398fw(this, zzw2, zzn));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43036a(zzw zzw) {
        C25565r.m49314a(zzw);
        C25565r.m49314a(zzw.f62614c);
        m51933a(zzw.f62612a, true);
        m51932a(new RunnableC26387fl(this, new zzw(zzw)));
    }

    public BinderC26382fg(C26498jo joVar) {
        this(joVar, (byte) 0);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: b */
    public final void mo43039b(zzn zzn) {
        m51934e(zzn);
        m51932a(new RunnableC26384fi(this, zzn));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: c */
    public final String mo43040c(zzn zzn) {
        m51934e(zzn);
        return this.f62022a.mo43477d(zzn);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: d */
    public final void mo43041d(zzn zzn) {
        m51933a(zzn.f62590a, false);
        m51932a(new RunnableC26390fo(this, zzn));
    }

    /* renamed from: a */
    private final void m51932a(Runnable runnable) {
        C25565r.m49314a(runnable);
        if (this.f62022a.mo43015p().mo43223f()) {
            runnable.run();
        } else {
            this.f62022a.mo43015p().mo43220a(runnable);
        }
    }

    /* renamed from: e */
    private final void m51934e(zzn zzn) {
        C25565r.m49314a(zzn);
        m51933a(zzn.f62590a, false);
        this.f62022a.f62355b.mo43256e().mo43538a(zzn.f62591b, zzn.f62607r, zzn.f62611v);
    }

    private BinderC26382fg(C26498jo joVar, byte b) {
        C25565r.m49314a(joVar);
        this.f62022a = joVar;
        this.f62024c = null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final List<zzkr> mo43025a(zzn zzn, boolean z) {
        m51934e(zzn);
        try {
            List<C26507jw> list = (List) this.f62022a.mo43015p().mo43219a(new CallableC26397fv(this, zzn)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C26507jw jwVar : list) {
                if (z || !C26510jz.m52406e(jwVar.f62393c)) {
                    arrayList.add(new zzkr(jwVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f62022a.mo43016q().f61827c.mo43171a("Failed to get user properties. appId", C26350eb.m51691a(zzn.f62590a), e);
            return null;
        }
    }

    /* renamed from: a */
    private final void m51933a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f62023b == null) {
                        if (!"com.google.android.gms".equals(this.f62024c) && !C25612n.m49429a(this.f62022a.mo43012m(), Binder.getCallingUid())) {
                            if (!C25505h.m49190a(this.f62022a.mo43012m()).mo41743a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f62023b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f62023b = Boolean.valueOf(z2);
                    }
                    if (this.f62023b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f62022a.mo43016q().f61827c.mo43170a("Measurement Service called with invalid calling package. appId", C26350eb.m51691a(str));
                    throw e;
                }
            }
            if (this.f62024c == null && C25612n.m49430a(this.f62022a.mo43012m(), Binder.getCallingUid(), str)) {
                this.f62024c = str;
            }
            if (!str.equals(this.f62024c)) {
                throw new SecurityException(C1764a.m5928a("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f62022a.mo43016q().f61827c.mo43169a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final List<zzw> mo43026a(String str, String str2, zzn zzn) {
        m51934e(zzn);
        try {
            return (List) this.f62022a.mo43015p().mo43219a(new CallableC26388fm(this, zzn, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f62022a.mo43016q().f61827c.mo43170a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final List<zzw> mo43027a(String str, String str2, String str3) {
        m51933a(str, true);
        try {
            return (List) this.f62022a.mo43015p().mo43219a(new CallableC26391fp(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f62022a.mo43016q().f61827c.mo43170a("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43030a(long j, String str, String str2, String str3) {
        m51932a(new RunnableC26399fx(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final List<zzkr> mo43028a(String str, String str2, String str3, boolean z) {
        m51933a(str, true);
        try {
            List<C26507jw> list = (List) this.f62022a.mo43015p().mo43219a(new CallableC26389fn(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C26507jw jwVar : list) {
                if (z || !C26510jz.m52406e(jwVar.f62393c)) {
                    arrayList.add(new zzkr(jwVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f62022a.mo43016q().f61827c.mo43171a("Failed to get user properties as. appId", C26350eb.m51691a(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final List<zzkr> mo43029a(String str, String str2, boolean z, zzn zzn) {
        m51934e(zzn);
        try {
            List<C26507jw> list = (List) this.f62022a.mo43015p().mo43219a(new CallableC26386fk(this, zzn, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C26507jw jwVar : list) {
                if (z || !C26510jz.m52406e(jwVar.f62393c)) {
                    arrayList.add(new zzkr(jwVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f62022a.mo43016q().f61827c.mo43171a("Failed to query user properties. appId", C26350eb.m51691a(zzn.f62590a), e);
            return Collections.emptyList();
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b.C18871a;
import com.google.android.gms.common.util.AbstractC25603e;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.j */
public final class C26483j extends AbstractC26400fy {

    /* renamed from: a */
    long f62321a;

    /* renamed from: b */
    private long f62322b;

    /* renamed from: c */
    private String f62323c;

    /* renamed from: d */
    private Boolean f62324d;

    /* renamed from: e */
    private AccountManager f62325e;

    /* renamed from: f */
    private Boolean f62326f;

    static {
        Covode.recordClassIndex(31905);
    }

    /* renamed from: a */
    private static AccountManagerFuture m52205a(AccountManager accountManager, String str, String[] strArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(accountManager, new Object[]{str, strArr, null, null}, 102502, "android.accounts.AccountManagerFuture", false, null);
        if (((Boolean) a.first).booleanValue()) {
            return (AccountManagerFuture) a.second;
        }
        AccountManagerFuture<Account[]> accountsByTypeAndFeatures = accountManager.getAccountsByTypeAndFeatures(str, strArr, null, null);
        C15346a.m28240a(accountsByTypeAndFeatures, accountManager, new Object[]{str, strArr, null, null}, 102502, "com_google_android_gms_measurement_internal_zzai_android_accounts_AccountManager_getAccountsByTypeAndFeatures(Landroid/accounts/AccountManager;Ljava/lang/String;[Ljava/lang/String;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;");
        return accountsByTypeAndFeatures;
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

    /* renamed from: e */
    public final long mo43442e() {
        mo43288x();
        return this.f62322b;
    }

    /* renamed from: f */
    public final String mo43443f() {
        mo43288x();
        return this.f62323c;
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

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo43444g() {
        mo43002c();
        this.f62326f = null;
        this.f62321a = 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26400fy
    /* renamed from: d */
    public final boolean mo43065d() {
        Calendar instance = Calendar.getInstance();
        this.f62322b = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        this.f62323c = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()).append(lowerCase).append("-").append(lowerCase2).toString();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo43445h() {
        mo43002c();
        long a = mo43011l().mo41857a();
        if (a - this.f62321a > 86400000) {
            this.f62326f = null;
        }
        Boolean bool = this.f62326f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C0643b.m2367a(mo43012m(), "android.permission.GET_ACCOUNTS") != 0) {
            mo43016q().f61831g.mo43169a("Permission error checking for dasher/unicorn accounts");
            this.f62321a = a;
            this.f62326f = false;
            return false;
        }
        if (this.f62325e == null) {
            this.f62325e = AccountManager.get(mo43012m());
        }
        try {
            Account[] accountArr = (Account[]) m52205a(this.f62325e, C18871a.f44691d, new String[]{"service_HOSTED"}).getResult();
            if (accountArr == null || accountArr.length <= 0) {
                Account[] accountArr2 = (Account[]) m52205a(this.f62325e, C18871a.f44691d, new String[]{"service_uca"}).getResult();
                if (accountArr2 != null && accountArr2.length > 0) {
                    this.f62326f = true;
                    this.f62321a = a;
                    return true;
                }
                this.f62321a = a;
                this.f62326f = false;
                return false;
            }
            this.f62326f = true;
            this.f62321a = a;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            mo43016q().f61828d.mo43170a("Exception checking account types", e);
        }
    }

    C26483j(C26381ff ffVar) {
        super(ffVar);
    }

    /* renamed from: a */
    public final boolean mo43441a(Context context) {
        if (this.f62324d == null) {
            mo43019t();
            this.f62324d = false;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f62324d = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f62324d.booleanValue();
    }
}

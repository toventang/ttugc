package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.C25497c;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.p1938c.C25500c;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.internal.measurement.AbstractC26221oy;
import com.google.android.gms.internal.measurement.C26109ku;
import com.google.android.gms.internal.measurement.C26155mm;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.google.android.gms.measurement.internal.jz */
public final class C26510jz extends AbstractC26400fy {

    /* renamed from: a */
    private static final String[] f62397a = {"firebase_", "google_", "ga_"};

    /* renamed from: b */
    private static final String[] f62398b = {"_err"};

    /* renamed from: c */
    private SecureRandom f62399c;

    /* renamed from: d */
    private final AtomicLong f62400d = new AtomicLong(0);

    /* renamed from: e */
    private int f62401e;

    /* renamed from: f */
    private Integer f62402f;

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26400fy
    /* renamed from: d */
    public final boolean mo43065d() {
        return true;
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

    /* renamed from: a */
    static boolean m52394a(String str) {
        C25565r.m49316a(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo43516a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo43016q().f61830f.mo43170a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43536a(String str, String str2) {
        if (str2 == null) {
            mo43016q().f61829e.mo43170a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo43016q().f61829e.mo43170a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo43016q().f61829e.mo43171a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo43016q().f61829e.mo43171a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo43543b(String str, String str2) {
        if (str2 == null) {
            mo43016q().f61829e.mo43170a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo43016q().f61829e.mo43170a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo43016q().f61829e.mo43171a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo43016q().f61829e.mo43171a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43539a(String str, String[] strArr, String str2) {
        if (str2 == null) {
            mo43016q().f61829e.mo43170a("Name is required and can't be null. Type", str);
            return false;
        }
        C25565r.m49314a((Object) str2);
        for (String str3 : f62397a) {
            if (str2.startsWith(str3)) {
                mo43016q().f61829e.mo43171a("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m52396a(str2, strArr)) {
            return true;
        }
        mo43016q().f61829e.mo43171a("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43535a(String str, int i, String str2) {
        if (str2 == null) {
            mo43016q().f61829e.mo43170a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo43016q().f61829e.mo43172a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m52393a(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43537a(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                mo43016q().f61832h.mo43172a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static boolean m52392a(Bundle bundle, int i) {
        int i2 = 0;
        if (bundle.size() <= i) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i2++;
            if (i2 > i) {
                bundle.remove(str);
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        if (r1 != 0) goto L_0x0070;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m52390a(java.lang.String r22, java.lang.String r23, java.lang.String r24, android.os.Bundle r25, java.util.List<java.lang.String> r26, boolean r27) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26510jz.m52390a(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43538a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            C26155mm.m51249b();
            if (mo43018s().mo43641d(null, C26530p.f62529ao) && !TextUtils.isEmpty(str3)) {
                return true;
            }
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(this.f62077z.f61997a)) {
                    mo43016q().f61829e.mo43169a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (m52411j(str2)) {
                return true;
            } else {
                mo43016q().f61829e.mo43170a("Invalid admob_app_id. Analytics disabled.", C26350eb.m51691a(str2));
                return false;
            }
        } else if (m52411j(str)) {
            return true;
        } else {
            if (TextUtils.isEmpty(this.f62077z.f61997a)) {
                mo43016q().f61829e.mo43170a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C26350eb.m51691a(str));
            }
            return false;
        }
    }

    /* renamed from: a */
    static boolean m52395a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty) {
            return isEmpty2 ? (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4) : TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (!isEmpty2) {
            return !str.equals(str2);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo43520a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m52385a(256, obj, true, true);
        }
        if (!m52406e(str)) {
            i = 100;
        }
        return m52385a(i, obj, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo43518a(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        Set<String> keySet;
        int i;
        boolean z3 = z2;
        C26510jz jzVar = this;
        C26109ku.m51181b();
        String str3 = null;
        boolean d = mo43018s().mo43641d(null, C26530p.f62497aI);
        if (d) {
            z3 = m52396a(str2, C26407ge.f62086c);
        }
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int d2 = mo43018s().mo43639d();
        if (mo43018s().mo43641d(str, C26530p.f62516ab)) {
            keySet = new TreeSet<>(bundle.keySet());
        } else {
            keySet = bundle.keySet();
        }
        int i2 = 0;
        for (String str4 : keySet) {
            if ((list == null || !list.contains(str4)) && ((z && (i = jzVar.m52408h(str4)) != 0) || (i = jzVar.m52410i(str4)) != 0)) {
                if (i == 3) {
                    str3 = str4;
                }
                m52389a(bundle2, i, str4, str3);
                bundle2.remove(str4);
            } else {
                int a = m52380a(str, str2, str4, m52386a(bundle, str4), bundle2, list, z, z3);
                if (d && a == 17) {
                    m52389a(bundle2, a, str4, (Object) false);
                } else if (a != 0 && !"_ev".equals(str4)) {
                    m52389a(bundle2, a, a == 21 ? str2 : str4, m52386a(bundle, str4));
                    bundle2.remove(str4);
                }
                if (m52394a(str4) && (i2 = i2 + 1) > d2) {
                    mo43016q().f61829e.mo43171a(new StringBuilder(48).append("Event can't contain more than ").append(d2).append(" params").toString(), mo43013n().mo43062a(str2), mo43013n().mo43060a(bundle));
                    m52401b(bundle2, 5);
                    bundle2.remove(str4);
                }
            }
            str3 = null;
            jzVar = this;
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43533a(C26355eg egVar, int i) {
        int i2 = 0;
        for (String str : new TreeSet(egVar.f61877b.keySet())) {
            if (m52394a(str) && (i2 = i2 + 1) > i) {
                mo43016q().f61829e.mo43171a(new StringBuilder(48).append("Event can't contain more than ").append(i).append(" params").toString(), mo43013n().mo43062a(egVar.f61876a), mo43013n().mo43060a(egVar.f61877b));
                m52401b(egVar.f61877b, 5);
                egVar.f61877b.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43524a(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    mo43014o().mo43525a(bundle, str, m52386a(bundle2, str));
                }
            }
        }
    }

    /* renamed from: a */
    private static void m52389a(Bundle bundle, int i, String str, Object obj) {
        if (m52401b(bundle, i)) {
            bundle.putString("_ev", m52388a(str, 40, true));
            if (obj != null) {
                C25565r.m49314a(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo43541b(String str, Object obj) {
        boolean a;
        if ("_ldl".equals(str)) {
            a = mo43537a("user property referrer", str, m52412k(str), obj);
        } else {
            a = mo43537a("user property", str, m52412k(str), obj);
        }
        return a ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43525a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                C26109ku.m51181b();
                String str2 = null;
                if (mo43018s().mo43641d(null, C26530p.f62496aH) && mo43018s().mo43641d(null, C26530p.f62495aG) && (obj instanceof Bundle[])) {
                    bundle.putParcelableArray(str, (Bundle[]) obj);
                } else if (str != null) {
                    if (obj != null) {
                        str2 = obj.getClass().getSimpleName();
                    }
                    mo43016q().f61832h.mo43171a("Not putting event parameter. Invalid value type. name, type", mo43013n().mo43063b(str), str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo43522a(int i, String str, String str2, int i2) {
        mo43542b(i, str, str2, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43542b(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        m52401b(bundle, i);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            bundle.putString(str, str2);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f62077z.mo43019t();
        this.f62077z.mo43255d().mo43305a("auto", "_err", bundle);
    }

    /* renamed from: a */
    static boolean m52391a(Context context) {
        C25565r.m49314a(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m52400b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m52400b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo43517a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = mo43520a(str, m52386a(bundle, str));
                if (a == null) {
                    mo43016q().f61832h.mo43170a("Param value can't be null", mo43013n().mo43063b(str));
                } else {
                    mo43525a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzao mo43519a(String str, String str2, Bundle bundle, String str3, long j) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo43540b(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            return new zzao(str2, new zzan(mo43517a(mo43518a(str, str2, bundle2, Collections.singletonList("_o"), false, false))), str3, j);
        }
        mo43016q().f61827c.mo43170a("Invalid conditional property event name", mo43013n().mo43064c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo43515a(Context context, String str) {
        mo43002c();
        C25565r.m49314a(context);
        C25565r.m49316a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest h = m52409h();
        if (h == null) {
            mo43016q().f61827c.mo43169a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m52404c(context, str)) {
                    PackageInfo b = C25500c.f60481a.mo41741a(context).mo41740b(mo43012m().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m52383a(h.digest(b.signatures[0].toByteArray()));
                    }
                    mo43016q().f61830f.mo43169a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e) {
                mo43016q().f61827c.mo43170a("Package name not found", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    static byte[] m52397a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    private static boolean m52396a(String str, String[] strArr) {
        C25565r.m49314a(strArr);
        for (String str2 : strArr) {
            if (m52405c(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43523a(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            mo43016q().f61830f.mo43170a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: a */
    public final void mo43529a(AbstractC26221oy oyVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            oyVar.mo42912a(bundle);
        } catch (RemoteException e) {
            this.f62077z.mo43016q().f61830f.mo43170a("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo43527a(AbstractC26221oy oyVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            oyVar.mo42912a(bundle);
        } catch (RemoteException e) {
            this.f62077z.mo43016q().f61830f.mo43170a("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo43526a(AbstractC26221oy oyVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            oyVar.mo42912a(bundle);
        } catch (RemoteException e) {
            this.f62077z.mo43016q().f61830f.mo43170a("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo43532a(AbstractC26221oy oyVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            oyVar.mo42912a(bundle);
        } catch (RemoteException e) {
            this.f62077z.mo43016q().f61830f.mo43170a("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo43531a(AbstractC26221oy oyVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            oyVar.mo42912a(bundle);
        } catch (RemoteException e) {
            this.f62077z.mo43016q().f61830f.mo43170a("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo43528a(AbstractC26221oy oyVar, Bundle bundle) {
        try {
            oyVar.mo42912a(bundle);
        } catch (RemoteException e) {
            this.f62077z.mo43016q().f61830f.mo43170a("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo43530a(AbstractC26221oy oyVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            oyVar.mo42912a(bundle);
        } catch (RemoteException e) {
            this.f62077z.mo43016q().f61830f.mo43170a("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: a */
    public final URL mo43521a(String str, String str2, long j) {
        try {
            C25565r.m49316a(str2);
            C25565r.m49316a(str);
            String a = C1764a.m5928a("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{C1764a.m5928a("v%s.%s", new Object[]{31000L, Integer.valueOf(mo43550i())}), str2, str, Long.valueOf(j)});
            if (str.equals(mo43018s().mo43634a("debug.deferred.deeplink", ""))) {
                a = a.concat("&ddl_test=1");
            }
            return new URL(a);
        } catch (IllegalArgumentException | MalformedURLException e) {
            mo43016q().f61827c.mo43170a("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43534a(String str, double d) {
        try {
            SharedPreferences.Editor edit = C34822d.m71158a(mo43012m(), "google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (Exception e) {
            mo43016q().f61827c.mo43170a("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
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
        Covode.recordClassIndex(31932);
    }

    /* renamed from: j */
    public final int mo43551j() {
        return C25497c.getInstance().isGooglePlayServicesAvailable(mo43012m(), 12451000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final String mo43552u() {
        byte[] bArr = new byte[16];
        mo43549g().nextBytes(bArr);
        return C1764a.m5929a(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: v */
    public final boolean mo43553v() {
        try {
            mo43012m().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: h */
    static MessageDigest m52409h() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26400fy
    /* renamed from: M_ */
    public final void mo43187M_() {
        mo43002c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo43016q().f61830f.mo43169a("Utils falling back to Random for random id");
            }
        }
        this.f62400d.set(nextLong);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final SecureRandom mo43549g() {
        mo43002c();
        if (this.f62399c == null) {
            this.f62399c = new SecureRandom();
        }
        return this.f62399c;
    }

    /* renamed from: i */
    public final int mo43550i() {
        if (this.f62402f == null) {
            this.f62402f = Integer.valueOf(C25497c.getInstance().getApkVersion(mo43012m()) / 1000);
        }
        return this.f62402f.intValue();
    }

    /* renamed from: f */
    public final long mo43547f() {
        long andIncrement;
        long j;
        MethodCollector.m26663i(3568);
        if (this.f62400d.get() == 0) {
            synchronized (this.f62400d) {
                try {
                    long nextLong = new Random(System.nanoTime() ^ mo43011l().mo41857a()).nextLong();
                    int i = this.f62401e + 1;
                    this.f62401e = i;
                    j = nextLong + ((long) i);
                } finally {
                    MethodCollector.m26664o(3568);
                }
            }
            return j;
        }
        synchronized (this.f62400d) {
            try {
                this.f62400d.compareAndSet(-1, 1);
                andIncrement = this.f62400d.getAndIncrement();
            } finally {
                MethodCollector.m26664o(3568);
            }
        }
        return andIncrement;
    }

    C26510jz(C26381ff ffVar) {
        super(ffVar);
    }

    /* renamed from: j */
    private static boolean m52411j(String str) {
        C25565r.m49314a((Object) str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: e */
    static boolean m52406e(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("_")) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m52407g(String str) {
        for (String str2 : f62398b) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private final int m52408h(String str) {
        if (!mo43536a("event param", str)) {
            return 3;
        }
        if (!mo43539a("event param", (String[]) null, str)) {
            return 14;
        }
        if (!mo43535a("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: i */
    private final int m52410i(String str) {
        if (!mo43543b("event param", str)) {
            return 3;
        }
        if (!mo43539a("event param", (String[]) null, str)) {
            return 14;
        }
        if (!mo43535a("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo43544c(String str) {
        if (!mo43543b("user property", str)) {
            return 6;
        }
        if (!mo43539a("user property", C26409gg.f62087a, str)) {
            return 15;
        }
        if (!mo43535a("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo43548f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = mo43018s().mo43648u();
        mo43019t();
        return u.equals(str);
    }

    /* renamed from: a */
    public static long m52382a(zzan zzan) {
        long j = 0;
        if (zzan == null) {
            return 0;
        }
        Iterator<String> it = zzan.iterator();
        while (it.hasNext()) {
            Object a = zzan.mo43666a(it.next());
            if (a instanceof Parcelable[]) {
                j += (long) ((Parcelable[]) a).length;
            }
        }
        return j;
    }

    /* renamed from: k */
    private final int m52412k(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if (!mo43018s().mo43641d(null, C26530p.f62526al) || !"_lgclid".equals(str)) {
            return 36;
        }
        return 100;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo43546d(String str) {
        mo43002c();
        if (C25500c.f60481a.mo41741a(mo43012m()).mo41736a(str) == 0) {
            return true;
        }
        mo43016q().f61834j.mo43170a("Permission not granted", str);
        return false;
    }

    /* renamed from: a */
    static long m52383a(byte[] bArr) {
        boolean z;
        C25565r.m49314a(bArr);
        int i = 0;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49320a(z);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: b */
    public static Bundle m52398b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object a = m52386a(bundle2, str);
            if (a instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) a));
            } else {
                int i = 0;
                if (a instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) a;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (a instanceof List) {
                    List list = (List) a;
                    while (i < list.size()) {
                        Object obj = list.get(i);
                        if (obj instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    public static Bundle m52384a(List<zzkr> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzkr zzkr : list) {
            if (zzkr.f62585d != null) {
                bundle.putString(zzkr.f62582a, zzkr.f62585d);
            } else if (zzkr.f62584c != null) {
                bundle.putLong(zzkr.f62582a, zzkr.f62584c.longValue());
            } else if (zzkr.f62587f != null) {
                bundle.putDouble(zzkr.f62582a, zzkr.f62587f.doubleValue());
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static ArrayList<Bundle> m52399b(List<zzw> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzw zzw : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzw.f62612a);
            bundle.putString("origin", zzw.f62613b);
            bundle.putLong("creation_timestamp", zzw.f62615d);
            bundle.putString(StringSet.name, zzw.f62614c.f62582a);
            C26403ga.m51975a(bundle, zzw.f62614c.mo43675a());
            bundle.putBoolean("active", zzw.f62616e);
            if (zzw.f62617f != null) {
                bundle.putString("trigger_event_name", zzw.f62617f);
            }
            if (zzw.f62618g != null) {
                bundle.putString("timed_out_event_name", zzw.f62618g.f62578a);
                if (zzw.f62618g.f62579b != null) {
                    bundle.putBundle("timed_out_event_params", zzw.f62618g.f62579b.mo43665a());
                }
            }
            bundle.putLong("trigger_timeout", zzw.f62619h);
            if (zzw.f62620i != null) {
                bundle.putString("triggered_event_name", zzw.f62620i.f62578a);
                if (zzw.f62620i.f62579b != null) {
                    bundle.putBundle("triggered_event_params", zzw.f62620i.f62579b.mo43665a());
                }
            }
            bundle.putLong("triggered_timestamp", zzw.f62614c.f62583b);
            bundle.putLong("time_to_live", zzw.f62621j);
            if (zzw.f62622k != null) {
                bundle.putString("expired_event_name", zzw.f62622k.f62578a);
                if (zzw.f62622k.f62579b != null) {
                    bundle.putBundle("expired_event_params", zzw.f62622k.f62579b.mo43665a());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: android.os.Bundle[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    static Bundle[] m52403b(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo43540b(String str) {
        if (!mo43543b("event", str)) {
            return 2;
        }
        if (!mo43539a("event", C26407ge.f62084a, str)) {
            return 13;
        }
        if (!mo43535a("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    private static Object m52386a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static long m52381a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* renamed from: c */
    static boolean m52405c(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m52387a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m52400b(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    private static boolean m52401b(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object mo43545c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m52385a(m52412k(str), obj, true, false);
        }
        return m52385a(m52412k(str), obj, false, false);
    }

    /* renamed from: c */
    private final boolean m52404c(Context context, String str) {
        MethodCollector.m26663i(3937);
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C25500c.f60481a.mo41741a(context).mo41740b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                boolean equals = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
                MethodCollector.m26664o(3937);
                return equals;
            }
        } catch (CertificateException e) {
            mo43016q().f61827c.mo43170a("Error obtaining certificate", e);
        } catch (PackageManager.NameNotFoundException e2) {
            mo43016q().f61827c.mo43170a("Package name not found", e2);
        }
        MethodCollector.m26664o(3937);
        return true;
    }

    /* renamed from: a */
    public static String m52388a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m52402b(String str, String str2, int i, Object obj) {
        int size;
        if (obj instanceof Parcelable[]) {
            size = ((Parcelable[]) obj).length;
        } else {
            if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            return true;
        }
        if (size > i) {
            mo43016q().f61832h.mo43172a("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(size));
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final Object m52385a(int i, Object obj, boolean z, boolean z2) {
        long j;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            return Long.valueOf(j);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m52388a(String.valueOf(obj), i, z);
            }
            C26109ku.m51181b();
            if (!mo43018s().mo43641d(null, C26530p.f62496aH) || !mo43018s().mo43641d(null, C26530p.f62495aG) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable instanceof Bundle) {
                    Bundle a = mo43517a((Bundle) parcelable);
                    if (!a.isEmpty()) {
                        arrayList.add(a);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m52380a(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Object r24, android.os.Bundle r25, java.util.List<java.lang.String> r26, boolean r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26510jz.m52380a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }
}

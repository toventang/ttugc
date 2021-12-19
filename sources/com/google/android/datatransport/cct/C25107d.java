package com.google.android.datatransport.cct;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.datatransport.C25068b;
import com.google.android.datatransport.cct.p1923a.AbstractC25087k;
import com.google.android.datatransport.cct.p1923a.AbstractC25089m;
import com.google.android.datatransport.cct.p1923a.AbstractC25093o;
import com.google.android.datatransport.cct.p1923a.AbstractC25096q;
import com.google.android.datatransport.cct.p1923a.AbstractC25100t;
import com.google.android.datatransport.cct.p1923a.C25074c;
import com.google.android.datatransport.cct.p1923a.C25075d;
import com.google.android.datatransport.cct.p1923a.C25077e;
import com.google.android.datatransport.cct.p1923a.C25078f;
import com.google.android.datatransport.cct.p1923a.C25080g;
import com.google.android.datatransport.cct.p1923a.C25082h;
import com.google.android.datatransport.cct.p1923a.C25085j;
import com.google.android.datatransport.cct.p1923a.C25088l;
import com.google.android.datatransport.cct.p1923a.C25092n;
import com.google.android.datatransport.cct.p1923a.C25095p;
import com.google.android.datatransport.cct.p1923a.C25098r;
import com.google.android.datatransport.cct.p1923a.C25104u;
import com.google.android.datatransport.cct.p1923a.EnumC25073b;
import com.google.android.datatransport.runtime.AbstractC25157h;
import com.google.android.datatransport.runtime.C25156g;
import com.google.android.datatransport.runtime.backends.AbstractC25130f;
import com.google.android.datatransport.runtime.backends.AbstractC25132g;
import com.google.android.datatransport.runtime.backends.AbstractC25140m;
import com.google.android.datatransport.runtime.backends.C25126b;
import com.google.android.datatransport.runtime.p1924a.C25118a;
import com.google.android.datatransport.runtime.p1925b.C25122b;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.firebase.p2008a.AbstractC27673a;
import com.google.firebase.p2008a.p2009a.C27674a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.d */
public final class C25107d implements AbstractC25140m {

    /* renamed from: a */
    final URL f59516a;

    /* renamed from: b */
    private final AbstractC27673a f59517b = new C27674a().mo46300a(C25077e.class, new C25088l()).mo46300a(C25082h.class, new C25098r()).mo46300a(C25078f.class, new C25092n()).mo46300a(C25080g.class, new C25095p()).mo46300a(C25075d.class, new C25074c()).mo46300a(C25085j.class, new C25104u()).mo46301a();

    /* renamed from: c */
    private final ConnectivityManager f59518c;

    /* renamed from: d */
    private final AbstractC25148a f59519d;

    /* renamed from: e */
    private final AbstractC25148a f59520e;

    /* renamed from: f */
    private final int f59521f;

    static {
        Covode.recordClassIndex(30472);
    }

    /* renamed from: a */
    private static NetworkInfo m48134a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    private static URL m48136a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25140m
    /* renamed from: a */
    public final AbstractC25157h mo41060a(AbstractC25157h hVar) {
        int type;
        int subtype;
        NetworkInfo a = m48134a(this.f59518c);
        AbstractC25157h.AbstractC25158a a2 = hVar.mo41142h().mo41143a("sdk-version", Build.VERSION.SDK_INT).mo41145a("model", Build.MODEL).mo41145a("hardware", Build.HARDWARE).mo41145a("device", Build.DEVICE).mo41145a("product", Build.PRODUCT).mo41145a("os-uild", Build.ID).mo41145a("manufacturer", Build.MANUFACTURER).mo41145a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        AbstractC25157h.AbstractC25158a a3 = a2.mo41144a("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        if (a == null) {
            type = AbstractC25100t.EnumC25103c.zzs.zza();
        } else {
            type = a.getType();
        }
        AbstractC25157h.AbstractC25158a a4 = a3.mo41143a("net-type", type);
        if (a == null) {
            subtype = AbstractC25100t.EnumC25102b.zza.zza();
        } else {
            subtype = a.getSubtype();
            if (subtype == -1) {
                subtype = AbstractC25100t.EnumC25102b.zzu.zza();
            } else if (AbstractC25100t.EnumC25102b.zza(subtype) == null) {
                subtype = 0;
            }
        }
        return a4.mo41143a("mobile-subtype", subtype).mo41080b();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        com.google.android.datatransport.runtime.p1924a.C25118a.m48158a("CctTransportBackend");
        r1 = new com.google.android.datatransport.cct.C25107d.C25109b(400, null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0170, code lost:
        r9.close();
        r5.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(13004);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0179, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017b, code lost:
        r9.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(13004);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0181, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0166 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.datatransport.cct.C25107d.C25109b mo41058a(com.google.android.datatransport.cct.C25107d.C25108a r16) {
        /*
        // Method dump skipped, instructions count: 400
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.C25107d.mo41058a(com.google.android.datatransport.cct.d$a):com.google.android.datatransport.cct.d$b");
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25140m
    /* renamed from: a */
    public final AbstractC25132g mo41059a(AbstractC25130f fVar) {
        AbstractC25093o.AbstractC25094a a;
        HashMap hashMap = new HashMap();
        for (AbstractC25157h hVar : fVar.mo41097a()) {
            String a2 = hVar.mo41064a();
            if (!hashMap.containsKey(a2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                hashMap.put(a2, arrayList);
            } else {
                ((List) hashMap.get(a2)).add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC25157h hVar2 = (AbstractC25157h) ((List) entry.getValue()).get(0);
            AbstractC25096q.AbstractC25097a a3 = new C25082h.C25083a().mo41036a(Integer.MIN_VALUE).mo41038a(EnumC25073b.zza).mo41037a(this.f59520e.mo41134a()).mo41043b(this.f59519d.mo41134a()).mo41039a(new C25078f.C25079a().mo41017a(AbstractC25089m.EnumC25091b.zzb).mo41016a(new C25075d.C25076a().mo40996a(Integer.MIN_VALUE).mo40996a(hVar2.mo41138a("sdk-version")).mo40997a(hVar2.mo41140c("model")).mo40999b(hVar2.mo41140c("hardware")).mo41000c(hVar2.mo41140c("device")).mo41001d(hVar2.mo41140c("product")).mo41002e(hVar2.mo41140c("os-uild")).mo41003f(hVar2.mo41140c("manufacturer")).mo41004g(hVar2.mo41140c("fingerprint")).mo40998a()).mo41018a());
            try {
                a3.mo41036a(Integer.valueOf((String) entry.getKey()).intValue());
            } catch (NumberFormatException unused) {
                a3.mo41040a((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC25157h hVar3 : (List) entry.getValue()) {
                C25156g c = hVar3.mo41066c();
                C25068b bVar = c.f59599a;
                if (bVar.equals(C25068b.m48045a("proto"))) {
                    a = new C25080g.C25081a().mo41025a(Integer.MIN_VALUE).mo41029a(c.f59600b);
                } else if (bVar.equals(C25068b.m48045a("json"))) {
                    a = new C25080g.C25081a().mo41025a(Integer.MIN_VALUE).mo41028a(new String(c.f59600b, Charset.forName("UTF-8")));
                } else {
                    C25118a.m48158a("CctTransportBackend");
                    C1764a.m5928a("Received event of unsupported encoding %s. Skipping...", new Object[]{bVar});
                }
                a.mo41026a(hVar3.mo41067d()).mo41031b(hVar3.mo41068e()).mo41032c(hVar3.mo41139b("tz-offset")).mo41027a(new C25085j.C25086a().mo41052a(AbstractC25100t.EnumC25103c.zza(hVar3.mo41138a("net-type"))).mo41051a(AbstractC25100t.EnumC25102b.zza(hVar3.mo41138a("mobile-subtype"))).mo41053a());
                if (hVar3.mo41065b() != null) {
                    a.mo41025a(hVar3.mo41065b().intValue());
                }
                arrayList3.add(a.mo41030a());
            }
            a3.mo41041a(arrayList3);
            arrayList2.add(a3.mo41042a());
        }
        C25077e eVar = new C25077e(arrayList2);
        URL url = this.f59516a;
        String str = null;
        if (fVar.mo41098b() != null) {
            try {
                String str2 = new String(fVar.mo41098b(), Charset.forName("UTF-8"));
                if (str2.startsWith("1$")) {
                    String[] split = str2.substring(2).split(Pattern.quote("\\"), 2);
                    if (split.length == 2) {
                        String str3 = split[0];
                        if (!str3.isEmpty()) {
                            String str4 = split[1];
                            if (str4.isEmpty()) {
                                str4 = null;
                            }
                            C25070a aVar = new C25070a(str3, str4);
                            if (aVar.f59454g != null) {
                                str = aVar.f59454g;
                            }
                            if (aVar.f59453f != null) {
                                url = m48136a(aVar.f59453f);
                            }
                        } else {
                            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                        }
                    } else {
                        throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
                    }
                } else {
                    throw new IllegalArgumentException("Version marker missing from extras");
                }
            } catch (IllegalArgumentException unused2) {
                return AbstractC25132g.m48193d();
            }
        }
        try {
            C25109b bVar2 = (C25109b) C25122b.m48173a(5, new C25108a(url, eVar, str), new C25105b(this), C25106c.f59515a);
            if (bVar2.f59525a == 200) {
                return new C25126b(AbstractC25132g.EnumC25133a.OK, bVar2.f59527c);
            }
            int i = bVar2.f59525a;
            if (i >= 500 || i == 404) {
                return AbstractC25132g.m48192c();
            }
            return AbstractC25132g.m48193d();
        } catch (IOException unused3) {
            C25118a.m48158a("CctTransportBackend");
            return AbstractC25132g.m48192c();
        }
    }

    /* renamed from: a */
    private static Object m48135a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12914);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(12914);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    public static final class C25108a {

        /* renamed from: a */
        final URL f59522a;

        /* renamed from: b */
        final AbstractC25087k f59523b;

        /* renamed from: c */
        final String f59524c;

        static {
            Covode.recordClassIndex(30473);
        }

        C25108a(URL url, AbstractC25087k kVar, String str) {
            this.f59522a = url;
            this.f59523b = kVar;
            this.f59524c = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    public static final class C25109b {

        /* renamed from: a */
        final int f59525a;

        /* renamed from: b */
        final URL f59526b;

        /* renamed from: c */
        final long f59527c;

        static {
            Covode.recordClassIndex(30474);
        }

        C25109b(int i, URL url, long j) {
            this.f59525a = i;
            this.f59526b = url;
            this.f59527c = j;
        }
    }

    C25107d(Context context, AbstractC25148a aVar, AbstractC25148a aVar2) {
        this.f59518c = (ConnectivityManager) m48135a(context, "connectivity");
        this.f59516a = m48136a(C25070a.f59447a);
        this.f59519d = aVar2;
        this.f59520e = aVar;
        this.f59521f = 40000;
    }
}

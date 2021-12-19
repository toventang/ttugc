package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.C1764a;
import com.android.billingclient.api.C2242h;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.p1949h.AbstractC25755a;
import com.google.android.gms.internal.p1949h.C25756b;
import com.google.android.gms.internal.p1949h.C25757c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* renamed from: com.android.billingclient.api.e */
public final class C2237e extends AbstractC2235d {

    /* renamed from: a */
    int f6693a;

    /* renamed from: b */
    final String f6694b;

    /* renamed from: c */
    C2259v f6695c;

    /* renamed from: d */
    Context f6696d;

    /* renamed from: e */
    AbstractC25755a f6697e;

    /* renamed from: f */
    boolean f6698f;

    /* renamed from: g */
    boolean f6699g;

    /* renamed from: h */
    boolean f6700h;

    /* renamed from: i */
    boolean f6701i;

    /* renamed from: j */
    boolean f6702j;

    /* renamed from: k */
    boolean f6703k;

    /* renamed from: l */
    boolean f6704l;

    /* renamed from: m */
    boolean f6705m;

    /* renamed from: n */
    private final Handler f6706n;

    /* renamed from: o */
    private Context f6707o;

    /* renamed from: p */
    private ServiceConnectionC2238a f6708p;

    /* renamed from: q */
    private boolean f6709q;

    /* renamed from: r */
    private ExecutorService f6710r;

    /* renamed from: s */
    private String f6711s;

    /* renamed from: t */
    private final ResultReceiver f6712t;

    static {
        Covode.recordClassIndex(2442);
    }

    @Override // com.android.billingclient.api.AbstractC2235d
    /* renamed from: a */
    public final boolean mo6196a() {
        return (this.f6693a != 2 || this.f6697e == null || this.f6708p == null) ? false : true;
    }

    @Override // com.android.billingclient.api.AbstractC2235d
    /* renamed from: a */
    public final void mo6195a(C2248l lVar, AbstractC2250m mVar) {
        if (!mo6196a()) {
            mVar.mo6216b(C2258u.f6775o, null);
            return;
        }
        String str = lVar.f6738a;
        List<String> list = lVar.f6740c;
        String str2 = lVar.f6739b;
        if (TextUtils.isEmpty(str)) {
            mVar.mo6216b(C2258u.f6767g, null);
        } else if (list == null) {
            mVar.mo6216b(C2258u.f6766f, null);
        } else if (!this.f6705m && str2 != null) {
            mVar.mo6216b(C2258u.f6765e, null);
        } else if (mo6199a(new CallableC2261x(this, str, list, str2, mVar), 30000, new RunnableC2262y(mVar)) == null) {
            mVar.mo6216b(mo6201b(), null);
        }
    }

    @Override // com.android.billingclient.api.AbstractC2235d
    /* renamed from: a */
    public final void mo6194a(C2244i iVar, AbstractC2246j jVar) {
        if (!mo6196a()) {
            jVar.mo6212a(C2258u.f6775o, iVar.f6736a);
        } else if (mo6199a(new CallableC2222ab(this, iVar, jVar), 30000, new RunnableC2221aa(jVar, iVar)) == null) {
            jVar.mo6212a(mo6201b(), iVar.f6736a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2242h mo6201b() {
        int i = this.f6693a;
        if (i == 0 || i == 3) {
            return C2258u.f6775o;
        }
        return C2258u.f6772l;
    }

    /* renamed from: c */
    private static String m6842c() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "3.0.0";
        }
    }

    /* renamed from: com.android.billingclient.api.e$a */
    final class ServiceConnectionC2238a implements ServiceConnection {

        /* renamed from: a */
        final Object f6713a;

        /* renamed from: b */
        boolean f6714b;

        /* renamed from: c */
        AbstractC2239f f6715c;

        static {
            Covode.recordClassIndex(2443);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo6203a(C2242h hVar) {
            C2237e.this.mo6200a(new RunnableC2255r(this, hVar));
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            MethodCollector.m26663i(8118);
            C2237e.this.f6697e = null;
            C2237e.this.f6693a = 0;
            synchronized (this.f6713a) {
                try {
                    AbstractC2239f fVar = this.f6715c;
                    if (fVar != null) {
                        fVar.mo6206a();
                    }
                } finally {
                    MethodCollector.m26664o(8118);
                }
            }
        }

        private ServiceConnectionC2238a(AbstractC2239f fVar) {
            this.f6713a = new Object();
            this.f6714b = false;
            this.f6715c = fVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC25755a cVar;
            C2237e eVar = C2237e.this;
            if (iBinder == null) {
                cVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                if (queryLocalInterface instanceof AbstractC25755a) {
                    cVar = (AbstractC25755a) queryLocalInterface;
                } else {
                    cVar = new C25757c(iBinder);
                }
            }
            eVar.f6697e = cVar;
            if (C2237e.this.mo6199a(new CallableC2257t(this), 30000, new RunnableC2256s(this)) == null) {
                mo6203a(C2237e.this.mo6201b());
            }
        }

        /* synthetic */ ServiceConnectionC2238a(C2237e eVar, AbstractC2239f fVar, byte b) {
            this(fVar);
        }
    }

    /* renamed from: a */
    private final C2242h m6841a(C2242h hVar) {
        this.f6695c.f6783b.f6784a.mo6213a(hVar, null);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6200a(Runnable runnable) {
        if (!Thread.interrupted()) {
            this.f6706n.post(runnable);
        }
    }

    /* renamed from: d */
    private final C2242h m6843d(String str) {
        try {
            if (((Integer) mo6199a(new CallableC2228ah(this, str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS)).intValue() == 0) {
                return C2258u.f6774n;
            }
            return C2258u.f6769i;
        } catch (Exception unused) {
            return C2258u.f6775o;
        }
    }

    @Override // com.android.billingclient.api.AbstractC2235d
    /* renamed from: b */
    public final Purchase.C2218a mo6197b(String str) {
        if (!mo6196a()) {
            return new Purchase.C2218a(C2258u.f6775o, null);
        }
        if (TextUtils.isEmpty(str)) {
            return new Purchase.C2218a(C2258u.f6767g, null);
        }
        try {
            return (Purchase.C2218a) mo6199a(new CallableC2253p(this, str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.C2218a(C2258u.f6776p, null);
        } catch (Exception unused2) {
            return new Purchase.C2218a(C2258u.f6772l, null);
        }
    }

    @Override // com.android.billingclient.api.AbstractC2235d
    /* renamed from: a */
    public final C2242h mo6191a(String str) {
        if (!mo6196a()) {
            return C2258u.f6775o;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    if (this.f6699g) {
                        return C2258u.f6774n;
                    }
                    return C2258u.f6769i;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    if (this.f6701i) {
                        return C2258u.f6774n;
                    }
                    return C2258u.f6769i;
                }
                break;
            case 292218239:
                if (str.equals("inAppItemsOnVr")) {
                    return m6843d("inapp");
                }
                break;
            case 1219490065:
                if (str.equals("subscriptionsOnVr")) {
                    return m6843d("subs");
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    if (this.f6698f) {
                        return C2258u.f6774n;
                    }
                    return C2258u.f6769i;
                }
                break;
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Unsupported feature: ".concat(valueOf);
        } else {
            new String("Unsupported feature: ");
        }
        return C2258u.f6779s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Purchase.C2218a mo6202c(String str) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Querying owned items, item type: ".concat(valueOf);
        } else {
            new String("Querying owned items, item type: ");
        }
        ArrayList arrayList = new ArrayList();
        boolean z = this.f6702j;
        boolean z2 = this.f6709q;
        String str2 = this.f6694b;
        Bundle bundle2 = new Bundle();
        bundle2.putString("playBillingLibraryVersion", str2);
        if (z && z2) {
            bundle2.putBoolean("enablePendingPurchases", true);
        }
        String str3 = null;
        do {
            try {
                if (this.f6702j) {
                    bundle = this.f6697e.mo41990a(this.f6696d.getPackageName(), str, str3, bundle2);
                } else {
                    bundle = this.f6697e.mo41993b(this.f6696d.getPackageName(), str, str3);
                }
                C2242h hVar = C2258u.f6772l;
                if (bundle == null) {
                    C1764a.m5928a("%s got null owned items list", new Object[]{"getPurchase()"});
                } else {
                    int a = C25756b.m49713a(bundle);
                    String b = C25756b.m49718b(bundle);
                    C2242h.C2243a a2 = C2242h.m6864a();
                    a2.f6734a = a;
                    a2.f6735b = b;
                    C2242h a3 = a2.mo6211a();
                    if (a != 0) {
                        C1764a.m5928a("%s failed. Response code: %s", new Object[]{"getPurchase()", Integer.valueOf(a)});
                        hVar = a3;
                    } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        C1764a.m5928a("Bundle returned from %s doesn't contain required fields.", new Object[]{"getPurchase()"});
                    } else {
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            C1764a.m5928a("Bundle returned from %s contains null SKUs list.", new Object[]{"getPurchase()"});
                        } else if (stringArrayList2 == null) {
                            C1764a.m5928a("Bundle returned from %s contains null purchases list.", new Object[]{"getPurchase()"});
                        } else if (stringArrayList3 == null) {
                            C1764a.m5928a("Bundle returned from %s contains null signatures list.", new Object[]{"getPurchase()"});
                        } else {
                            hVar = C2258u.f6774n;
                        }
                    }
                }
                if (hVar != C2258u.f6774n) {
                    return new Purchase.C2218a(hVar, null);
                }
                ArrayList<String> stringArrayList4 = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList5 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList6 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList5.size(); i++) {
                    String str4 = stringArrayList5.get(i);
                    String str5 = stringArrayList6.get(i);
                    String valueOf2 = String.valueOf(stringArrayList4.get(i));
                    if (valueOf2.length() != 0) {
                        "Sku is owned: ".concat(valueOf2);
                    } else {
                        new String("Sku is owned: ");
                    }
                    try {
                        Purchase purchase = new Purchase(str4, str5);
                        TextUtils.isEmpty(purchase.mo6162c());
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        String.valueOf(String.valueOf(e)).length();
                        return new Purchase.C2218a(C2258u.f6772l, null);
                    }
                }
                str3 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf3 = String.valueOf(str3);
                if (valueOf3.length() != 0) {
                    "Continuation token: ".concat(valueOf3);
                } else {
                    new String("Continuation token: ");
                }
            } catch (Exception e2) {
                String.valueOf(String.valueOf(e2)).length();
                return new Purchase.C2218a(C2258u.f6775o, null);
            }
        } while (!TextUtils.isEmpty(str3));
        return new Purchase.C2218a(C2258u.f6774n, arrayList);
    }

    @Override // com.android.billingclient.api.AbstractC2235d
    /* renamed from: a */
    public final void mo6193a(AbstractC2239f fVar) {
        boolean z;
        if (mo6196a()) {
            fVar.mo6207b(C2258u.f6774n);
            return;
        }
        int i = this.f6693a;
        if (i == 1) {
            fVar.mo6207b(C2258u.f6764d);
        } else if (i == 3) {
            fVar.mo6207b(C2258u.f6775o);
        } else {
            this.f6693a = 1;
            C2259v vVar = this.f6695c;
            C2260w wVar = vVar.f6783b;
            Context context = vVar.f6782a;
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
            if (!wVar.f6785b) {
                C2260w.m6873a(context, wVar.f6786c.f6783b, intentFilter);
                wVar.f6785b = true;
            }
            this.f6708p = new ServiceConnectionC2238a(this, fVar, (byte) 0);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f6696d.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if ("com.android.vending".equals(str) && str2 != null) {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.f6694b);
                        Context context2 = this.f6696d;
                        ServiceConnectionC2238a aVar = this.f6708p;
                        if (context2 == null || !(context2 instanceof Context)) {
                            z = context2.bindService(intent2, aVar, 1);
                        } else if (!C65713d.m117625a(context2, intent2)) {
                            z = context2.bindService(intent2, aVar, 1);
                        } else {
                            return;
                        }
                        if (z) {
                            return;
                        }
                    }
                }
            }
            this.f6693a = 0;
            fVar.mo6207b(C2258u.f6763c);
        }
    }

    @Override // com.android.billingclient.api.AbstractC2235d
    /* renamed from: a */
    public final void mo6192a(C2232b bVar, AbstractC2234c cVar) {
        if (!mo6196a()) {
            cVar.mo6189a(C2258u.f6775o);
        } else if (TextUtils.isEmpty(bVar.f6688a)) {
            cVar.mo6189a(C2258u.f6771k);
        } else if (!this.f6702j) {
            cVar.mo6189a(C2258u.f6762b);
        } else if (mo6199a(new CallableC2223ac(this, bVar, cVar), 30000, new RunnableC2227ag(cVar)) == null) {
            cVar.mo6189a(mo6201b());
        }
    }

    @Override // com.android.billingclient.api.AbstractC2235d
    /* renamed from: a */
    public final C2242h mo6190a(Activity activity, C2240g gVar) {
        boolean z;
        Future future;
        long j;
        int i;
        if (!mo6196a()) {
            return m6841a(C2258u.f6775o);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(gVar.f6723g);
        SkuDetails skuDetails = (SkuDetails) arrayList.get(0);
        String c = skuDetails.mo6173c();
        if (c.equals("subs") && !this.f6698f) {
            return m6841a(C2258u.f6777q);
        }
        if (gVar.f6719c != null) {
            z = true;
            if (!this.f6699g) {
                return m6841a(C2258u.f6778r);
            }
        } else {
            z = false;
        }
        if (gVar.mo6208a() && !this.f6700h) {
            return m6841a(C2258u.f6768h);
        }
        String str = "";
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(arrayList.get(i2));
            str = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString();
            if (i2 < arrayList.size() - 1) {
                str = String.valueOf(str).concat(", ");
            }
        }
        String.valueOf(str).length();
        String.valueOf(c).length();
        if (this.f6700h) {
            boolean z2 = this.f6702j;
            boolean z3 = this.f6709q;
            String str2 = this.f6694b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str2);
            if (gVar.f6722f != 0) {
                bundle.putInt("prorationMode", gVar.f6722f);
            }
            if (!TextUtils.isEmpty(gVar.f6718b)) {
                bundle.putString("accountId", gVar.f6718b);
            }
            if (!TextUtils.isEmpty(gVar.f6721e)) {
                bundle.putString("obfuscatedProfileId", gVar.f6721e);
            }
            if (gVar.f6724h) {
                bundle.putBoolean("vr", true);
            }
            if (!TextUtils.isEmpty(gVar.f6719c)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(gVar.f6719c)));
            }
            if (!TextUtils.isEmpty(gVar.f6720d)) {
                bundle.putString("oldSkuPurchaseToken", gVar.f6720d);
            }
            if (z2 && z3) {
                bundle.putBoolean("enablePendingPurchases", true);
            }
            if (!skuDetails.mo6174d().isEmpty()) {
                bundle.putString("skuDetailsToken", skuDetails.mo6174d());
            }
            if (!TextUtils.isEmpty(skuDetails.mo6172b())) {
                bundle.putString("skuPackageName", skuDetails.mo6172b());
            }
            if (!TextUtils.isEmpty(this.f6711s)) {
                bundle.putString("accountName", this.f6711s);
            }
            if (arrayList.size() > 1) {
                ArrayList<String> arrayList2 = new ArrayList<>(arrayList.size() - 1);
                for (int i3 = 1; i3 < arrayList.size(); i3++) {
                    arrayList2.add(((SkuDetails) arrayList.get(i3)).mo6171a());
                }
                bundle.putStringArrayList("additionalSkus", arrayList2);
            }
            if (this.f6702j) {
                i = 9;
            } else if (gVar.f6724h) {
                i = 7;
            } else {
                i = 6;
            }
            CallableC2252o oVar = new CallableC2252o(this, i, skuDetails, c, gVar, bundle);
            j = 5000;
            future = mo6199a(oVar, 5000, (Runnable) null);
        } else {
            j = 5000;
            if (z) {
                future = mo6199a(new CallableC2251n(this, gVar, skuDetails), 5000, (Runnable) null);
            } else {
                future = mo6199a(new CallableC2254q(this, skuDetails, c), 5000, (Runnable) null);
            }
        }
        try {
            Bundle bundle2 = (Bundle) future.get(j, TimeUnit.MILLISECONDS);
            int a = C25756b.m49713a(bundle2);
            String b = C25756b.m49718b(bundle2);
            if (a != 0) {
                C2242h.C2243a a2 = C2242h.m6864a();
                a2.f6734a = a;
                a2.f6735b = b;
                return m6841a(a2.mo6211a());
            }
            Intent intent = new Intent(activity, ProxyBillingActivity.class);
            intent.putExtra("result_receiver", this.f6712t);
            intent.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
            return C2258u.f6774n;
        } catch (CancellationException | TimeoutException unused) {
            String.valueOf(str).length();
            return m6841a(C2258u.f6776p);
        } catch (Exception unused2) {
            String.valueOf(str).length();
            return m6841a(C2258u.f6775o);
        }
    }

    public C2237e(boolean z, Context context, AbstractC2247k kVar) {
        this(context, z, kVar, m6842c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> Future<T> mo6199a(Callable<T> callable, long j, Runnable runnable) {
        double d = (double) j;
        Double.isNaN(d);
        long j2 = (long) (d * 0.95d);
        if (this.f6710r == null) {
            int i = C25756b.f60875a;
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95505c = i;
            this.f6710r = C40780g.m82242a(a.mo70028a());
        }
        try {
            Future<T> submit = this.f6710r.submit(callable);
            this.f6706n.postDelayed(new RunnableC2226af(submit, runnable), j2);
            return submit;
        } catch (Exception e) {
            String.valueOf(String.valueOf(e)).length();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SkuDetails.C2219a mo6198a(String str, List<String> list, String str2) {
        int i;
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 20;
            if (i3 > size) {
                i = size;
            } else {
                i = i3;
            }
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i2, i));
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle2.putString("playBillingLibraryVersion", this.f6694b);
            try {
                if (this.f6703k) {
                    AbstractC25755a aVar = this.f6697e;
                    String packageName = this.f6696d.getPackageName();
                    boolean z = this.f6702j;
                    boolean z2 = this.f6705m;
                    boolean z3 = this.f6709q;
                    String str3 = this.f6694b;
                    Bundle bundle3 = new Bundle();
                    if (z) {
                        bundle3.putString("playBillingLibraryVersion", str3);
                        if (z3) {
                            bundle3.putBoolean("enablePendingPurchases", true);
                        }
                    }
                    if (z2 && str2 != null) {
                        bundle3.putString("SKU_PACKAGE_NAME", str2);
                    }
                    bundle = aVar.mo41988a(packageName, str, bundle2, bundle3);
                } else {
                    bundle = this.f6697e.mo41987a(this.f6696d.getPackageName(), str, bundle2);
                }
                if (bundle == null) {
                    return new SkuDetails.C2219a(4, "Null sku details list", null);
                }
                if (!bundle.containsKey("DETAILS_LIST")) {
                    int a = C25756b.m49713a(bundle);
                    String b = C25756b.m49718b(bundle);
                    if (a != 0) {
                        return new SkuDetails.C2219a(a, b, arrayList);
                    }
                    return new SkuDetails.C2219a(6, b, arrayList);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return new SkuDetails.C2219a(4, "querySkuDetailsAsync got null response list", null);
                }
                for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                    try {
                        SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i4));
                        String.valueOf(String.valueOf(skuDetails)).length();
                        arrayList.add(skuDetails);
                    } catch (JSONException unused) {
                        return new SkuDetails.C2219a(6, "Error trying to decode SkuDetails.", null);
                    }
                }
                i2 = i3;
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                "querySkuDetailsAsync got a remote exception (try to reconnect).".length();
                String.valueOf(valueOf).length();
                return new SkuDetails.C2219a(-1, "Service connection is disconnected.", null);
            }
        }
        return new SkuDetails.C2219a(0, "", arrayList);
    }

    private C2237e(Context context, boolean z, AbstractC2247k kVar, String str) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f6706n = handler;
        this.f6712t = new zzh(this, handler);
        this.f6711s = null;
        this.f6694b = str;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f6696d = applicationContext;
        this.f6695c = new C2259v(this.f6696d, kVar);
        this.f6707o = context;
        this.f6709q = z;
    }
}

package com.bytedance.sdk.p1665b;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.AbstractC22526b;
import com.bytedance.sdk.p1665b.C22541d;
import com.bytedance.sdk.p1665b.p1667b.C22528a;
import com.bytedance.sdk.p1665b.p1667b.C22530b;
import com.bytedance.sdk.p1665b.p1667b.C22531c;
import com.bytedance.sdk.p1665b.p1667b.C22533d;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.bytedance.sdk.p1665b.p1668c.C22540b;
import com.bytedance.sdk.p1665b.p1669d.C22552a;
import com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22556a;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a;
import com.bytedance.sdk.p1665b.p1675e.C22583a;
import com.bytedance.sdk.p1665b.p1676f.C22585b;
import com.bytedance.sdk.p1665b.p1676f.C22586c;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.b.c */
public final class C22534c implements AbstractC22526b, C22541d.AbstractC22548b, C22541d.AbstractC22549c {

    /* renamed from: a */
    final C22583a f53272a;

    /* renamed from: b */
    final HandlerC22538a f53273b;

    /* renamed from: c */
    public final Context f53274c;

    /* renamed from: d */
    public boolean f53275d;

    /* renamed from: e */
    int f53276e;

    /* renamed from: f */
    public C22531c f53277f;

    /* renamed from: g */
    public int f53278g;

    /* renamed from: h */
    public int f53279h;

    /* renamed from: i */
    boolean f53280i;

    /* renamed from: j */
    public C22530b f53281j;

    /* renamed from: k */
    boolean f53282k;

    /* renamed from: l */
    Handler f53283l;

    /* renamed from: m */
    private C22541d f53284m;

    /* renamed from: n */
    private String f53285n = "";

    static {
        Covode.recordClassIndex(26350);
    }

    /* renamed from: g */
    private boolean m42507g() {
        if (this.f53285n.equals("oston_oi")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.p1665b.AbstractC22526b
    /* renamed from: a */
    public final boolean mo36800a() {
        return this.f53280i;
    }

    /* renamed from: e */
    public final void mo36825e() {
        this.f53282k = true;
        this.f53273b.sendEmptyMessage(2);
    }

    C22534c() {
        C22583a a = C22583a.m42598a();
        this.f53272a = a;
        this.f53274c = C22518a.m42479c();
        this.f53273b = new HandlerC22538a(this, (byte) 0);
        mo36823d();
        boolean z = a.f53362a != null ? a.f53362a.getBoolean("is_enable", true) : true;
        this.f53280i = z;
        if (!z) {
            C22539a.m42534b("service enable switch is off, ignore");
        }
    }

    @Override // com.bytedance.sdk.p1665b.AbstractC22526b
    /* renamed from: c */
    public final void mo36802c() {
        C22541d dVar;
        C22541d dVar2 = this.f53284m;
        if (dVar2 != null && dVar2.f53299f && (dVar = this.f53284m) != null) {
            if (dVar.f53294a != null) {
                dVar.f53294a.unregisterReceiver(dVar.f53297d);
                dVar.f53294a.unregisterReceiver(dVar.f53301h);
            }
            if (dVar.f53296c != null) {
                dVar.f53296c.quit();
            }
            dVar.f53299f = false;
            dVar.f53297d = null;
            dVar.f53301h = null;
            this.f53284m = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo36823d() {
        C22531c b = this.f53272a.mo36865b();
        this.f53277f = b;
        if (b == null) {
            this.f53277f = new C22531c();
        }
        C22530b c = this.f53272a.mo36868c();
        this.f53281j = c;
        if (c == null) {
            this.f53281j = new C22530b();
        }
    }

    /* renamed from: f */
    public final void mo36826f() {
        if (this.f53279h < 3) {
            this.f53273b.removeMessages(2);
            this.f53279h++;
            this.f53273b.sendEmptyMessageDelayed(2, TimeUnit.SECONDS.toMillis((long) (this.f53279h * 2)));
            return;
        }
        C22539a.m42535c("get mobile data info fail continuously, stop polling");
        this.f53273b.removeMessages(2);
        this.f53279h = 0;
    }

    @Override // com.bytedance.sdk.p1665b.AbstractC22526b
    /* renamed from: b */
    public final void mo36801b() {
        if (this.f53280i) {
            C22541d dVar = this.f53284m;
            if (dVar == null || !dVar.f53299f) {
                C22539a.m42533a("freeMobileDataService start service");
                C22541d dVar2 = new C22541d();
                this.f53284m = dVar2;
                dVar2.f53298e = this;
                this.f53284m.f53302i = this;
                C22541d dVar3 = this.f53284m;
                try {
                    if (!dVar3.f53299f && dVar3.f53294a != null) {
                        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                        dVar3.f53297d = new C22541d.C22547a(dVar3, (byte) 0);
                        C22541d.m42542a(dVar3.f53294a, dVar3.f53297d, intentFilter);
                        IntentFilter intentFilter2 = new IntentFilter("android.intent.action.SIM_STATE_CHANGED");
                        intentFilter2.addAction("android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED");
                        dVar3.f53301h = new C22541d.C22550d(dVar3, (byte) 0);
                        C22541d.m42542a(dVar3.f53294a, dVar3.f53301h, intentFilter2);
                        dVar3.f53304k = new Handler(Looper.getMainLooper());
                        dVar3.f53296c.start();
                        dVar3.f53303j = new C22541d.HandlerC22551e(dVar3.f53296c.getLooper(), dVar3);
                        dVar3.f53303j.sendEmptyMessage(3);
                        dVar3.f53299f = true;
                    }
                } catch (Throwable th) {
                    C22539a.m42536d(th.getMessage());
                }
            } else {
                C22539a.m42533a("freeMobileDataService has already start");
            }
        }
    }

    @Override // com.bytedance.sdk.p1665b.AbstractC22526b
    /* renamed from: a */
    public final void mo36797a(Handler handler) {
        this.f53283l = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.b.c$a */
    public static class HandlerC22538a extends Handler {

        /* renamed from: a */
        private final SoftReference<C22534c> f53293a;

        static {
            Covode.recordClassIndex(26354);
        }

        private HandlerC22538a(C22534c cVar) {
            super(Looper.getMainLooper());
            this.f53293a = new SoftReference<>(cVar);
        }

        public final void handleMessage(Message message) {
            if (this.f53293a.get() != null) {
                C22534c cVar = this.f53293a.get();
                if (message.what == 2) {
                    cVar.f53273b.removeMessages(2);
                    if (TextUtils.isEmpty(cVar.f53281j.f53261a)) {
                        C22539a.m42534b("get mobile data info: free flow id is empty");
                    } else {
                        if (cVar.f53281j.mo36816a()) {
                            C22539a.m42534b("get mobile data info: free flow id is expired");
                            cVar.mo36819a(C22586c.m42622a(cVar.f53274c, false), C22586c.m42625c(cVar.f53274c, false), false);
                        }
                        if (-1 == cVar.f53276e || (cVar.f53277f.f53263a && !C22585b.m42616a(cVar.f53276e))) {
                            C22539a.m42534b("get mobile data info: no network or free flow user without mobile network, stop polling");
                        } else {
                            C22552a aVar = C22552a.C22555a.f53326a;
                            Context context = cVar.f53274c;
                            String str = cVar.f53281j.f53261a;
                            C225373 r1 = new AbstractC22558a<C22531c>() {
                                /* class com.bytedance.sdk.p1665b.C22534c.C225373 */

                                static {
                                    Covode.recordClassIndex(26353);
                                }

                                @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
                                /* renamed from: a */
                                public final void mo36791a(Exception exc) {
                                    C22539a.m42536d("get mobile data info fail:" + exc.getMessage());
                                    C22540b.m42541b(false, null, -1, exc.getMessage());
                                    C22534c.this.mo36826f();
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
                                /* renamed from: a */
                                public final /* synthetic */ void mo36792a(C22531c cVar) {
                                    String str;
                                    C22531c cVar2 = cVar;
                                    if (cVar2 != null) {
                                        C22534c.this.f53279h = 0;
                                        C22534c.this.f53277f = cVar2;
                                        C22534c cVar3 = C22534c.this;
                                        if (cVar3.f53282k) {
                                            cVar3.f53282k = false;
                                            if (cVar3.f53283l != null) {
                                                cVar3.f53283l.sendEmptyMessage(cVar2.f53263a ? 1 : 0);
                                            }
                                        }
                                        C22540b.m42541b(true, cVar2.f53265c, 0, null);
                                        if (cVar2.f53266d != null) {
                                            boolean z = cVar2.f53263a;
                                            String str2 = cVar2.f53266d.f53268b;
                                            String str3 = cVar2.f53266d.f53270d;
                                            String b = C22586c.m42624b(C22534c.this.f53274c, false);
                                            String a = C22586c.m42622a(C22534c.this.f53274c, false);
                                            JSONObject a2 = C22540b.m42537a();
                                            try {
                                                a2.put("plan_id", str2);
                                                a2.put("start_date", str3);
                                                if (z) {
                                                    str = "1";
                                                } else {
                                                    str = "0";
                                                }
                                                a2.put("status", str);
                                                a2.put("network_carrier", b);
                                                a2.put("network_mccmnc", a);
                                            } catch (JSONException e) {
                                                e.printStackTrace();
                                            }
                                            C22540b.m42538a("zero_rating_status", a2);
                                            return;
                                        }
                                        return;
                                    }
                                    C22540b.m42541b(false, null, -2, "server data invalid");
                                    C22534c.this.mo36826f();
                                }

                                @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
                                /* renamed from: a */
                                public final void mo36790a(int i, String str) {
                                    C22539a.m42536d("get mobile data info error, code:" + i + ", msg:" + str);
                                    C22540b.m42541b(false, null, i, str);
                                    C22534c.this.mo36826f();
                                }
                            };
                            AbstractC22556a aVar2 = aVar.f53319a;
                            C22586c.m42622a(context, false);
                            aVar2.mo36840a(str, r1);
                            C22518a.m42486j();
                            int i = C22518a.f53231a.f53242i;
                            C22539a.m42533a("start mobile data info polling, do next request in " + i + " seconds");
                            cVar.f53273b.sendEmptyMessageDelayed(2, (long) (i * 1000));
                        }
                    }
                }
                if (message.what == 1) {
                    cVar.f53273b.removeMessages(1);
                    Bundle data = message.getData();
                    cVar.mo36822c(data.getString("operator"), data.getInt("sim_subscription_id"));
                }
            }
        }

        /* synthetic */ HandlerC22538a(C22534c cVar, byte b) {
            this(cVar);
        }
    }

    @Override // com.bytedance.sdk.p1665b.C22541d.AbstractC22548b
    /* renamed from: a */
    public final void mo36817a(int i) {
        this.f53276e = i;
        if (C22585b.m42616a(i)) {
            mo36819a(C22586c.m42622a(this.f53274c, false), C22586c.m42625c(this.f53274c, true), true);
        }
    }

    @Override // com.bytedance.sdk.p1665b.C22541d.AbstractC22548b
    /* renamed from: b */
    public final void mo36820b(int i) {
        this.f53276e = i;
        if (C22585b.m42616a(i) && this.f53280i) {
            mo36819a(C22586c.m42622a(this.f53274c, false), C22586c.m42625c(this.f53274c, false), true);
        }
    }

    /* renamed from: a */
    private boolean m42506a(String str) {
        Map<String, List<String>> map;
        C22533d i = C22518a.m42485i();
        if (!(i == null || (map = i.f53271a) == null)) {
            for (String str2 : map.keySet()) {
                if (map.get(str2).contains(str)) {
                    this.f53285n = str2;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.p1665b.AbstractC22526b
    /* renamed from: a */
    public final void mo36798a(AbstractC22558a<C22528a> aVar) {
        C22552a aVar2 = C22552a.C22555a.f53326a;
        Context context = this.f53274c;
        aVar2.f53319a.mo36842a(C22586c.m42622a(context, false), C22586c.m42621a(context), null, aVar, this.f53281j.f53261a);
    }

    @Override // com.bytedance.sdk.p1665b.C22541d.AbstractC22549c
    /* renamed from: a */
    public final void mo36818a(String str, int i) {
        mo36819a(str, i, false);
    }

    @Override // com.bytedance.sdk.p1665b.C22541d.AbstractC22549c
    /* renamed from: b */
    public final void mo36821b(String str, int i) {
        if (this.f53280i) {
            C22539a.m42534b("on sim card or sim operator change");
            mo36819a(str, i, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo36822c(final String str, final int i) {
        if (!this.f53275d && TextUtils.equals(this.f53285n, "oston_oi")) {
            this.f53275d = true;
            C22552a.C22555a.f53326a.mo36836a(this.f53274c, new AbstractC22558a<C22530b>() {
                /* class com.bytedance.sdk.p1665b.C22534c.C225362 */

                static {
                    Covode.recordClassIndex(26352);
                }

                @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
                /* renamed from: a */
                public final void mo36791a(Exception exc) {
                    C22539a.m42536d("get free flow id fail:" + exc.getMessage());
                    C22540b.m42539a(false, null, -1, exc.getMessage());
                    C22534c.this.f53275d = false;
                    C22534c.this.mo36824d(str, i);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
                /* renamed from: a */
                public final /* synthetic */ void mo36792a(C22530b bVar) {
                    C22530b bVar2 = bVar;
                    String str = bVar2.f53261a;
                    if (!TextUtils.isEmpty(str)) {
                        C22539a.m42533a("get free flow id success, id:".concat(String.valueOf(str)));
                        C22540b.m42539a(true, str, 0, null);
                        C22534c.this.f53278g = 0;
                        C22534c.this.f53281j = bVar2;
                        C22534c cVar = C22534c.this;
                        String str2 = str;
                        int i = i;
                        if (!TextUtils.isEmpty(str2)) {
                            cVar.f53272a.mo36864a("sim_operator", str2);
                        }
                        C22583a aVar = cVar.f53272a;
                        if (aVar.f53362a != null) {
                            aVar.f53362a.edit().putInt("key_sim_subscription_id", i).apply();
                        }
                        C22534c.this.f53275d = false;
                        C22534c.this.mo36825e();
                        return;
                    }
                    C22540b.m42539a(false, null, -2, "server data invalid");
                    C22534c.this.f53275d = false;
                    C22534c.this.mo36824d(str, i);
                }

                @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
                /* renamed from: a */
                public final void mo36790a(int i, String str) {
                    C22539a.m42536d("get free flow id error, code:" + i + ", msg:" + str);
                    C22540b.m42539a(false, null, i, str);
                    C22534c.this.f53275d = false;
                    C22534c.this.mo36824d(str, i);
                }
            }, m42507g());
        }
    }

    /* renamed from: d */
    public final void mo36824d(String str, int i) {
        if (this.f53278g < 3) {
            this.f53273b.removeMessages(1);
            this.f53278g++;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putString("operator", str);
            bundle.putInt("sim_subscription_id", i);
            obtain.what = 1;
            obtain.setData(bundle);
            this.f53273b.sendMessageDelayed(obtain, TimeUnit.SECONDS.toMillis((long) (this.f53278g * 2)));
            return;
        }
        C22539a.m42535c("get free flow id fail continuously, stop retry");
        this.f53278g = 0;
    }

    @Override // com.bytedance.sdk.p1665b.AbstractC22526b
    /* renamed from: a */
    public final void mo36799a(final boolean z, final AbstractC22526b.AbstractC22527a aVar) {
        if (this.f53280i != z) {
            C22552a aVar2 = C22552a.C22555a.f53326a;
            C225351 r2 = new AbstractC22558a<Boolean>() {
                /* class com.bytedance.sdk.p1665b.C22534c.C225351 */

                static {
                    Covode.recordClassIndex(26351);
                }

                @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
                /* renamed from: a */
                public final void mo36791a(Exception exc) {
                    AbstractC22526b.AbstractC22527a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo36804b();
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
                /* renamed from: a */
                public final /* synthetic */ void mo36792a(Boolean bool) {
                    int i;
                    C22534c cVar = C22534c.this;
                    boolean z = z;
                    cVar.f53280i = z;
                    C22583a aVar = cVar.f53272a;
                    if (aVar.f53362a != null) {
                        aVar.f53362a.edit().putBoolean("is_enable", z).apply();
                    }
                    JSONObject a = C22540b.m42537a();
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    try {
                        a.put("enable", i);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C22540b.m42538a("mobile_flow_international_enable_switch", a);
                    if (z) {
                        cVar.mo36801b();
                    } else {
                        cVar.mo36823d();
                        cVar.mo36802c();
                    }
                    AbstractC22526b.AbstractC22527a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo36803a();
                    }
                }

                @Override // com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a
                /* renamed from: a */
                public final void mo36790a(int i, String str) {
                    AbstractC22526b.AbstractC22527a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo36804b();
                    }
                }
            };
            if (aVar2.f53320b != null) {
                aVar2.f53320b.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: INVOKE  
                      (wrap: android.os.Handler : 0x0010: IGET  (r1v0 android.os.Handler) = (r3v0 'aVar2' com.bytedance.sdk.b.d.a) com.bytedance.sdk.b.d.a.b android.os.Handler)
                      (wrap: com.bytedance.sdk.b.d.a$2 : 0x0014: CONSTRUCTOR  (r0v2 com.bytedance.sdk.b.d.a$2) = (r3v0 'aVar2' com.bytedance.sdk.b.d.a), (r5v0 'z' boolean), (r2v0 'r2' com.bytedance.sdk.b.c$1) call: com.bytedance.sdk.b.d.a.2.<init>(com.bytedance.sdk.b.d.a, boolean, com.bytedance.sdk.b.d.b.a):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.bytedance.sdk.b.c.a(boolean, com.bytedance.sdk.b.b$a):void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0014: CONSTRUCTOR  (r0v2 com.bytedance.sdk.b.d.a$2) = (r3v0 'aVar2' com.bytedance.sdk.b.d.a), (r5v0 'z' boolean), (r2v0 'r2' com.bytedance.sdk.b.c$1) call: com.bytedance.sdk.b.d.a.2.<init>(com.bytedance.sdk.b.d.a, boolean, com.bytedance.sdk.b.d.b.a):void type: CONSTRUCTOR in method: com.bytedance.sdk.b.c.a(boolean, com.bytedance.sdk.b.b$a):void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.sdk.b.d.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                    this = this;
                    boolean r0 = r4.f53280i
                    if (r0 != r5) goto L_0x0005
                    return
                L_0x0005:
                    com.bytedance.sdk.b.d.a r3 = com.bytedance.sdk.p1665b.p1669d.C22552a.C22555a.f53326a
                    com.bytedance.sdk.b.c$1 r2 = new com.bytedance.sdk.b.c$1
                    r2.<init>(r5, r6)
                    android.os.Handler r0 = r3.f53320b
                    if (r0 == 0) goto L_0x001a
                    android.os.Handler r1 = r3.f53320b
                    com.bytedance.sdk.b.d.a$2 r0 = new com.bytedance.sdk.b.d.a$2
                    r0.<init>(r5, r2)
                    r1.post(r0)
                L_0x001a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.p1665b.C22534c.mo36799a(boolean, com.bytedance.sdk.b.b$a):void");
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo36819a(String str, int i, boolean z) {
                if (!C22585b.m42616a(this.f53276e)) {
                    C22539a.m42534b("check free flow id: is not mobile network");
                } else if (!m42506a(str)) {
                    C22539a.m42534b("check free flow id: is not target operator");
                } else if (TextUtils.isEmpty(this.f53281j.f53261a)) {
                    C22539a.m42534b("check free flow id: free flow id is empty");
                    mo36822c(str, i);
                } else if (this.f53281j.mo36816a()) {
                    C22539a.m42534b("check free flow id: free flow id is expired");
                    mo36822c(str, i);
                } else if (!TextUtils.isEmpty(str) && !this.f53272a.mo36866b("sim_operator").equals(str)) {
                    C22539a.m42534b("check free flow id: sim operator change");
                    mo36822c(str, i);
                } else if (i == -1 || i == this.f53272a.mo36867c("key_sim_subscription_id")) {
                    C22539a.m42534b("check free flow id: no need to update");
                    if (z) {
                        mo36825e();
                    }
                } else {
                    C22539a.m42534b("check sim subscription id: sim subscription id change");
                    mo36822c(str, i);
                }
            }
        }

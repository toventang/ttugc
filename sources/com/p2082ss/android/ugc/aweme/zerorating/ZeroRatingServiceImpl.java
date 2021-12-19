package com.p2082ss.android.ugc.aweme.zerorating;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.sdk.p1665b.AbstractC22526b;
import com.bytedance.sdk.p1665b.C22518a;
import com.bytedance.sdk.p1665b.p1666a.AbstractC22521a;
import com.bytedance.sdk.p1665b.p1666a.AbstractC22522b;
import com.bytedance.sdk.p1665b.p1666a.AbstractC22523c;
import com.bytedance.sdk.p1665b.p1666a.C22524d;
import com.bytedance.sdk.p1665b.p1667b.C22528a;
import com.bytedance.sdk.p1665b.p1669d.C22552a;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a;
import com.bytedance.ttnet.INetworkApi;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.api.AbstractC33535d;
import com.p2082ss.android.ugc.aweme.api.C33538g;
import com.p2082ss.android.ugc.aweme.api.IZeroRatingService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl */
public final class ZeroRatingServiceImpl implements IZeroRatingService {

    /* renamed from: d */
    static final boolean f182918d = false;

    /* renamed from: e */
    public static final C81798a f182919e = new C81798a((byte) 0);

    /* renamed from: a */
    public INetworkApi f182920a;

    /* renamed from: b */
    public INetworkApi f182921b;

    /* renamed from: c */
    public final ArrayList<String> f182922c = new ArrayList<>();

    /* renamed from: f */
    private volatile AbstractC22526b f182923f;

    /* renamed from: com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl$a */
    public static final class C81798a {
        static {
            Covode.recordClassIndex(95207);
        }

        private C81798a() {
        }

        public /* synthetic */ C81798a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl$c */
    public static final class C81800c implements C22518a.AbstractC22520a {
        static {
            Covode.recordClassIndex(95209);
        }

        C81800c() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.api.IZeroRatingService
    /* renamed from: c */
    public final AbstractC33535d mo59646c() {
        return new C81804a();
    }

    @Override // com.p2082ss.android.ugc.aweme.api.IZeroRatingService
    /* renamed from: d */
    public final void mo59647d() {
        AbstractC22526b bVar = this.f182923f;
        if (bVar != null) {
            bVar.mo36801b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.api.IZeroRatingService
    /* renamed from: e */
    public final void mo59648e() {
        AbstractC22526b bVar = this.f182923f;
        if (bVar != null) {
            bVar.mo36802c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl$b */
    static final class RunnableC81799b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ZeroRatingServiceImpl f182924a;

        /* renamed from: b */
        final /* synthetic */ String f182925b;

        static {
            Covode.recordClassIndex(95208);
        }

        RunnableC81799b(ZeroRatingServiceImpl zeroRatingServiceImpl, String str) {
            this.f182924a = zeroRatingServiceImpl;
            this.f182925b = str;
        }

        public final void run() {
            ArrayList<String> arrayList = this.f182924a.f182922c;
            String str = this.f182925b;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.api.IZeroRatingService
    /* renamed from: b */
    public final boolean mo59645b() {
        AbstractC22526b bVar = this.f182923f;
        if (bVar != null) {
            return bVar.mo36800a();
        }
        return false;
    }

    static {
        Covode.recordClassIndex(95206);
    }

    /* renamed from: f */
    public static IZeroRatingService m141669f() {
        MethodCollector.m26663i(11734);
        Object a = C81908b.m141854a(IZeroRatingService.class, false);
        if (a != null) {
            IZeroRatingService iZeroRatingService = (IZeroRatingService) a;
            MethodCollector.m26664o(11734);
            return iZeroRatingService;
        }
        if (C81908b.f183361eE == null) {
            synchronized (IZeroRatingService.class) {
                try {
                    if (C81908b.f183361eE == null) {
                        C81908b.f183361eE = new ZeroRatingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11734);
                    throw th;
                }
            }
        }
        ZeroRatingServiceImpl zeroRatingServiceImpl = (ZeroRatingServiceImpl) C81908b.f183361eE;
        MethodCollector.m26664o(11734);
        return zeroRatingServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.api.IZeroRatingService
    /* renamed from: a */
    public final void mo59641a() {
        String str;
        if (this.f182920a == null) {
            this.f182920a = (INetworkApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(INetworkApi.class);
        }
        if (this.f182921b == null) {
            this.f182921b = (INetworkApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28823a().mo28832d().mo28858a(INetworkApi.class);
        }
        C22524d.C22525a aVar = new C22524d.C22525a();
        Context applicationContext = C17867d.m33078a().getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        aVar.f53246b = applicationContext;
        if (C17867d.f42590n == 1233) {
            str = "carrierflow-va.tiktokv.com";
        } else {
            str = "carrierflow-sg.tiktokv.com";
        }
        aVar.f53251g = str;
        aVar.f53245a = new C81801d(this);
        aVar.f53248d = new C81802e(this);
        aVar.f53249e = new C81803f(this);
        aVar.f53253i = C33538g.m68711a();
        C22524d dVar = new C22524d(aVar, (byte) 0);
        C81800c cVar = new C81800c();
        boolean z = dVar.f53244k;
        C22518a.f53231a = dVar;
        C22518a.m42486j();
        C22518a.m42477a();
        if (z) {
            C22552a aVar2 = C22552a.C22555a.f53326a;
            C22518a.C225191 r2 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008f: CONSTRUCTOR  (r2v1 'r2' com.bytedance.sdk.b.a$1) = (r1v4 'cVar' com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl$c) call: com.bytedance.sdk.b.a.1.<init>(com.bytedance.sdk.b.a$a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl.a():void, file: classes8.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.sdk.b.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                */
            /*
            // Method dump skipped, instructions count: 176
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl.mo59641a():void");
        }

        /* renamed from: com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl$d */
        public static final class C81801d implements AbstractC22523c {

            /* renamed from: a */
            final /* synthetic */ ZeroRatingServiceImpl f182926a;

            static {
                Covode.recordClassIndex(95210);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C81801d(ZeroRatingServiceImpl zeroRatingServiceImpl) {
                this.f182926a = zeroRatingServiceImpl;
            }

            @Override // com.bytedance.sdk.p1665b.p1666a.AbstractC22523c
            /* renamed from: a */
            public final String mo36796a(boolean z, String str) {
                AbstractC21983b<String> doGet;
                C22099u<String> execute;
                T t;
                INetworkApi iNetworkApi = this.f182926a.f182920a;
                if (iNetworkApi == null || (doGet = iNetworkApi.doGet(true, 102400, str, null, null, null)) == null || (execute = doGet.execute()) == null || (t = execute.f52262b) == null) {
                    return "";
                }
                return t;
            }

            @Override // com.bytedance.sdk.p1665b.p1666a.AbstractC22523c
            /* renamed from: a */
            public final String mo36795a(String str, Map<String, String> map) {
                AbstractC21983b<String> doPost;
                C22099u<String> execute;
                T t;
                AbstractC21983b<String> doPost2;
                C22099u<String> execute2;
                T t2;
                if (str == null) {
                    return "";
                }
                if (C89361p.m154908a((CharSequence) str, (CharSequence) "/oversea/carrier_flow/", false)) {
                    INetworkApi iNetworkApi = this.f182926a.f182920a;
                    if (iNetworkApi == null || (doPost2 = iNetworkApi.doPost(102400, str, null, map, null, null)) == null || (execute2 = doPost2.execute()) == null || (t2 = execute2.f52262b) == null) {
                        return "";
                    }
                    return t2;
                }
                INetworkApi iNetworkApi2 = this.f182926a.f182921b;
                if (iNetworkApi2 == null || (doPost = iNetworkApi2.doPost(102400, str, null, map, null, null)) == null || (execute = doPost.execute()) == null || (t = execute.f52262b) == null) {
                    return "";
                }
                return t;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl$f */
        public static final class C81803f implements AbstractC22521a {

            /* renamed from: a */
            final /* synthetic */ ZeroRatingServiceImpl f182928a;

            static {
                Covode.recordClassIndex(95212);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C81803f(ZeroRatingServiceImpl zeroRatingServiceImpl) {
                this.f182928a = zeroRatingServiceImpl;
            }

            @Override // com.bytedance.sdk.p1665b.p1666a.AbstractC22521a
            /* renamed from: a */
            public final void mo36793a(String str) {
                ZeroRatingServiceImpl zeroRatingServiceImpl = this.f182928a;
                if (ZeroRatingServiceImpl.f182918d) {
                    ALog.m59865d("ZeroRatingServiceImpl", "logMsg is:".concat(String.valueOf(str)));
                    if (str == null) {
                        return;
                    }
                    if (C89361p.m154908a((CharSequence) str, (CharSequence) "response raw result", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "request params", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "response exception", false)) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC81799b(zeroRatingServiceImpl, str));
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.api.IZeroRatingService
        /* renamed from: a */
        public final void mo59643a(AbstractC22558a<C22528a> aVar) {
            AbstractC22526b bVar = this.f182923f;
            if (bVar != null) {
                bVar.mo36798a(aVar);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.api.IZeroRatingService
        /* renamed from: a */
        public final void mo59642a(Handler handler) {
            C89219l.m154721d(handler, "");
            AbstractC22526b bVar = this.f182923f;
            if (bVar != null) {
                bVar.mo36797a(handler);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.api.IZeroRatingService
        /* renamed from: a */
        public final void mo59644a(boolean z, AbstractC22526b.AbstractC22527a aVar) {
            C89219l.m154721d(aVar, "");
            AbstractC22526b bVar = this.f182923f;
            if (bVar != null) {
                bVar.mo36799a(z, aVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl$e */
        static final class C81802e implements AbstractC22522b {

            /* renamed from: a */
            final /* synthetic */ ZeroRatingServiceImpl f182927a;

            static {
                Covode.recordClassIndex(95211);
            }

            C81802e(ZeroRatingServiceImpl zeroRatingServiceImpl) {
                this.f182927a = zeroRatingServiceImpl;
            }

            @Override // com.bytedance.sdk.p1665b.p1666a.AbstractC22522b
            /* renamed from: a */
            public final void mo36794a(String str, JSONObject jSONObject) {
                if (str.equals("zero_rating_status")) {
                    AbstractC33535d c = this.f182927a.mo59646c();
                    String optString = jSONObject.optString("plan_id");
                    C89219l.m154716b(optString, "");
                    String optString2 = jSONObject.optString("start_date");
                    C89219l.m154716b(optString2, "");
                    String optString3 = jSONObject.optString("status");
                    C89219l.m154716b(optString3, "");
                    String optString4 = jSONObject.optString("network_carrier");
                    C89219l.m154716b(optString4, "");
                    String optString5 = jSONObject.optString("network_mccmnc");
                    C89219l.m154716b(optString5, "");
                    c.mo59654a(optString, optString2, optString3, optString4, optString5);
                    return;
                }
                Context a = C17867d.m33078a();
                if (C58029j.f132255g == NetworkUtils.EnumC29835h.NONE || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132255g = NetworkUtils.getNetworkType(a);
                }
                jSONObject.put("network_type", C58029j.f132255g.toString());
                Bundle bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.optString(next));
                }
                C29819a.m60076a(str, bundle);
            }
        }
    }

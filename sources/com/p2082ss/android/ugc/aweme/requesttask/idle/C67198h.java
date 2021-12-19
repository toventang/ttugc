package com.p2082ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.bdlocation.traceroute.C13213a;
import com.bytedance.bdlocation.traceroute.p856b.AbstractC13216a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.p1734ug.sdk.region.data.p1737b.C23462a;
import com.bytedance.p1734ug.sdk.region.data.p1737b.C23465b;
import com.bytedance.p1734ug.sdk.region.data.p1738c.AbstractC23467a;
import com.bytedance.p1734ug.sdk.region.data.p1738c.AbstractC23469c;
import com.bytedance.p1734ug.sdk.region.data.p1739d.C23471a;
import com.bytedance.p1734ug.sdk.region.data.p1741f.C23478b;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.legoImp.task.api.BDRegionReportApi;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.h */
public final class C67198h implements AbstractC58259r {

    /* renamed from: a */
    public static final C67199a f150621a = new C67199a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.h$c */
    static final class C67201c implements C23462a.AbstractC23464a {

        /* renamed from: a */
        public static final C67201c f150622a = new C67201c();

        static {
            Covode.recordClassIndex(78818);
        }

        C67201c() {
        }
    }

    static {
        Covode.recordClassIndex(78815);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.h$a */
    public static final class C67199a {
        static {
            Covode.recordClassIndex(78816);
        }

        private C67199a() {
        }

        public /* synthetic */ C67199a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.h$b */
    public static final class C67200b implements AbstractC13216a {
        static {
            Covode.recordClassIndex(78817);
        }

        C67200b() {
        }

        @Override // com.bytedance.bdlocation.traceroute.p856b.AbstractC13216a
        /* renamed from: a */
        public final String mo21343a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
            C22099u<String> execute;
            T t;
            String str3 = str + str2;
            AbstractC21983b<String> doPost = ((TraceRouterApi) RetrofitFactory.m33635a().mo28817b(str3).mo28832d().mo28858a(TraceRouterApi.class)).doPost(str3, map, null, map2, true);
            if (doPost == null || (execute = doPost.execute()) == null || (t = execute.f52262b) == null) {
                return "";
            }
            return t;
        }

        @Override // com.bytedance.bdlocation.traceroute.p856b.AbstractC13216a
        /* renamed from: a */
        public final String mo21344a(String str, Map<String, String> map, Map<String, String> map2, byte[] bArr) {
            C22099u<String> execute;
            T t;
            IRetrofitFactory a = RetrofitFactory.m33635a();
            if (str == null) {
                C89219l.m154715b();
            }
            AbstractC21983b<String> doRegionPost = ((TraceRouterApi) a.mo28817b(str).mo28832d().mo28858a(TraceRouterApi.class)).doRegionPost(str, map, map2, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), true);
            if (doRegionPost == null || (execute = doRegionPost.execute()) == null || (t = execute.f52262b) == null) {
                return "";
            }
            return t;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.IDLE;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.h$e */
    static final class C67203e implements AbstractC23467a {

        /* renamed from: a */
        public static final C67203e f150624a = new C67203e();

        static {
            Covode.recordClassIndex(78820);
        }

        C67203e() {
        }

        @Override // com.bytedance.p1734ug.sdk.region.data.p1738c.AbstractC23467a
        /* renamed from: a */
        public final void mo38224a(Runnable runnable) {
            C40780g.m82245b().execute(runnable);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        int i;
        C89219l.m154721d(context, "");
        if (z) {
            C13213a.f32303f = new C67200b();
            C23465b.C23466a aVar = new C23465b.C23466a();
            aVar.f55652i = context;
            aVar.f55645b = "api.tiktokv.com";
            aVar.f55647d = true;
            if (!C80064f.m138815a(C80061e.f179403k.mo123508a()) || !C80580in.m139689d()) {
                i = 2;
            } else {
                i = 1;
            }
            aVar.f55644a = i;
            aVar.f55648e = C67202d.f150623a;
            aVar.f55649f = C67203e.f150624a;
            C23465b bVar = new C23465b(aVar, (byte) 0);
            C23471a.f55653a = bVar;
            C23471a.f55654b = bVar.f55635a;
            if (Boolean.valueOf(bVar.f55637c).booleanValue() && bVar.f55643i != 1) {
                C23478b.m44168a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005d: INVOKE  
                      (wrap: com.bytedance.ug.sdk.region.data.g.a$1 : 0x005a: CONSTRUCTOR  (r0v18 com.bytedance.ug.sdk.region.data.g.a$1) = 
                      (wrap: android.content.Context : 0x0056: IGET  (r1v3 android.content.Context) = (r1v0 'bVar' com.bytedance.ug.sdk.region.data.b.b) com.bytedance.ug.sdk.region.data.b.b.h android.content.Context)
                     call: com.bytedance.ug.sdk.region.data.g.a.1.<init>(android.content.Context):void type: CONSTRUCTOR)
                     type: STATIC call: com.bytedance.ug.sdk.region.data.f.b.a(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.requesttask.idle.h.a(android.content.Context, boolean):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005a: CONSTRUCTOR  (r0v18 com.bytedance.ug.sdk.region.data.g.a$1) = 
                      (wrap: android.content.Context : 0x0056: IGET  (r1v3 android.content.Context) = (r1v0 'bVar' com.bytedance.ug.sdk.region.data.b.b) com.bytedance.ug.sdk.region.data.b.b.h android.content.Context)
                     call: com.bytedance.ug.sdk.region.data.g.a.1.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.requesttask.idle.h.a(android.content.Context, boolean):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ug.sdk.region.data.g.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 32 more
                    */
                /*
                // Method dump skipped, instructions count: 119
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.requesttask.idle.C67198h.mo58050a(android.content.Context, boolean):void");
            }

            /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.h$d */
            static final class C67202d implements AbstractC23469c {

                /* renamed from: a */
                public static final C67202d f150623a = new C67202d();

                static {
                    Covode.recordClassIndex(78819);
                }

                C67202d() {
                }

                @Override // com.bytedance.p1734ug.sdk.region.data.p1738c.AbstractC23469c
                /* renamed from: a */
                public final String mo38226a(String str, Map<String, String> map, Map<String, String> map2, byte[] bArr) {
                    return ((BDRegionReportApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(BDRegionReportApi.class)).doPost(str, map, map2, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0])).get();
                }
            }
        }

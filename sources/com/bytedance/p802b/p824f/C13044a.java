package com.bytedance.p802b.p824f;

import android.app.Application;
import android.content.Context;
import com.bytedance.apm.config.AbstractC12425f;
import com.bytedance.apm.core.SharedPreferencesC12438d;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p803a.C12918a;
import com.bytedance.p802b.p803a.p804a.AbstractC12921b;
import com.bytedance.p802b.p806b.p807a.AbstractC12976g;
import com.bytedance.p802b.p806b.p807a.C12969e;
import com.bytedance.p802b.p806b.p807a.p808a.AbstractC12929b;
import com.bytedance.p802b.p806b.p807a.p812e.AbstractC12971b;
import com.bytedance.p802b.p806b.p807a.p812e.C12970a;
import com.bytedance.p802b.p806b.p807a.p812e.C12972c;
import com.bytedance.p802b.p813c.p814a.C12983b;
import com.bytedance.p802b.p813c.p815b.AbstractC13000b;
import com.bytedance.p802b.p813c.p818d.C13024a;
import com.bytedance.p802b.p819d.C13026a;
import com.bytedance.p802b.p819d.p820a.AbstractC13029b;
import com.bytedance.p802b.p821e.C13036a;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p821e.p823b.C13043c;
import com.bytedance.p802b.p824f.p825a.C13063a;
import com.bytedance.p802b.p824f.p825a.C13070b;
import com.bytedance.p802b.p824f.p825a.C13072c;
import com.bytedance.p802b.p824f.p825a.C13074d;
import com.bytedance.p802b.p824f.p825a.C13078f;
import com.bytedance.p802b.p824f.p825a.p826a.C13065a;
import com.bytedance.p802b.p827g.AbstractC13081a;
import com.bytedance.p802b.p827g.C13084b;
import com.bytedance.p802b.p827g.p828a.AbstractC13083b;
import com.bytedance.p802b.p830h.C13092a;
import com.bytedance.p802b.p831i.p832a.C13099c;
import com.bytedance.p802b.p834j.AbstractC13100a;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p834j.p835a.AbstractC13101a;
import com.bytedance.p802b.p834j.p836b.AbstractC13103a;
import com.bytedance.p802b.p834j.p838d.AbstractC13106a;
import com.bytedance.p802b.p834j.p839e.AbstractC13109a;
import com.bytedance.p802b.p834j.p839e.AbstractC13111b;
import com.bytedance.p802b.p841k.C13113a;
import com.bytedance.p802b.p841k.C13130f;
import com.bytedance.p802b.p841k.p843b.C13118b;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.bytedance.p802b.p841k.p845d.C13124b;
import com.bytedance.p802b.p841k.p845d.EnumC13126c;
import com.bytedance.services.apm.api.AbstractC22712e;
import com.bytedance.services.apm.api.IHttpService;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.f.a */
public final class C13044a {

    /* renamed from: a */
    private static volatile boolean f31840a;

    static {
        Covode.recordClassIndex(14880);
    }

    /* renamed from: a */
    public static synchronized Runnable m23472a(final AbstractC13080b bVar) {
        synchronized (C13044a.class) {
            if (f31840a) {
                return null;
            }
            f31840a = true;
            C13037a.f31819a = bVar;
            Context b = bVar.mo20739b();
            if (b != null) {
                if (!(b instanceof Application)) {
                    b = b.getApplicationContext();
                    if (C58003a.f132201c && b == null) {
                        b = C58003a.f132199a;
                    }
                }
                C13113a.f31955g = (Application) b;
            }
            C13037a.f31820b = System.currentTimeMillis();
            C13037a.f31821c = System.currentTimeMillis();
            if (C13037a.m23579r()) {
                bVar.mo20744g();
            }
            C13118b.f31959a = new C13043c();
            C13104c.f31944a.put(AbstractC13106a.class, new C13036a());
            return new Runnable() {
                /* class com.bytedance.p802b.p824f.C13044a.RunnableC130451 */

                static {
                    Covode.recordClassIndex(14881);
                }

                public final void run() {
                    AbstractC13080b bVar = bVar;
                    C13104c.m23567a(IHttpService.class, new AbstractC13100a<IHttpService>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C1304711 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31842a;

                        static {
                            Covode.recordClassIndex(14883);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ IHttpService mo20915a() {
                            return this.f31842a.mo20738a();
                        }

                        {
                            this.f31842a = r1;
                        }
                    });
                    C13104c.m23567a(AbstractC12929b.class, new AbstractC13100a<AbstractC12929b>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C1304812 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31843a;

                        static {
                            Covode.recordClassIndex(14884);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC12929b mo20915a() {
                            return new C13078f();
                        }

                        {
                            this.f31843a = r1;
                        }
                    });
                    C13104c.m23567a(AbstractC12921b.class, new AbstractC13100a<AbstractC12921b>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C1304913 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31844a;

                        static {
                            Covode.recordClassIndex(14885);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC12921b mo20915a() {
                            return new C13063a();
                        }

                        {
                            this.f31844a = r1;
                        }
                    });
                    C13104c.m23567a(AbstractC13000b.class, new AbstractC13100a<AbstractC13000b>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C1305014 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31845a;

                        static {
                            Covode.recordClassIndex(14886);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC13000b mo20915a() {
                            return new C13070b();
                        }

                        {
                            this.f31845a = r1;
                        }
                    });
                    C13104c.m23567a(AbstractC12425f.class, new AbstractC13100a<AbstractC12425f>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C1305115 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31846a;

                        static {
                            Covode.recordClassIndex(14887);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC12425f mo20915a() {
                            return new C13074d();
                        }

                        {
                            this.f31846a = r1;
                        }
                    });
                    C13104c.m23567a(AbstractC13106a.class, new AbstractC13100a<AbstractC13106a>() {
                        /* class com.bytedance.p802b.p824f.C13044a.C1305216 */

                        static {
                            Covode.recordClassIndex(14888);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC13106a mo20915a() {
                            return new C13036a();
                        }
                    });
                    C13104c.m23567a(AbstractC22712e.class, new AbstractC13100a<AbstractC22712e>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C1305317 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31847a;

                        static {
                            Covode.recordClassIndex(14889);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC22712e mo20915a() {
                            return this.f31847a.mo20752o();
                        }

                        {
                            this.f31847a = r1;
                        }
                    });
                    C13104c.m23567a(AbstractC13103a.class, new AbstractC13100a<AbstractC13103a>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C1305418 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31848a;

                        static {
                            Covode.recordClassIndex(14890);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC13103a mo20915a() {
                            return this.f31848a.mo20753p();
                        }

                        {
                            this.f31848a = r1;
                        }
                    });
                    C13104c.m23567a(AbstractC13111b.class, new AbstractC13100a<AbstractC13111b>() {
                        /* class com.bytedance.p802b.p824f.C13044a.C130552 */

                        static {
                            Covode.recordClassIndex(14891);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ AbstractC13111b mo20915a() {
                            return C13099c.m23558a();
                        }
                    });
                    new C13036a();
                    C13104c.m23567a(AbstractC13083b.class, new AbstractC13100a<AbstractC13083b>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C130563 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31849a;

                        static {
                            Covode.recordClassIndex(14892);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC13083b mo20915a() {
                            return this.f31849a.mo20758u();
                        }

                        {
                            this.f31849a = r1;
                        }
                    });
                    C13104c.m23567a(AbstractC13081a.class, new AbstractC13100a<AbstractC13081a>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C130574 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31850a;

                        static {
                            Covode.recordClassIndex(14893);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC13081a mo20915a() {
                            return this.f31850a.mo20759v();
                        }

                        {
                            this.f31850a = r1;
                        }
                    });
                    C13104c.m23567a(AbstractC13101a.class, new AbstractC13100a<AbstractC13101a>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C130585 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31851a;

                        static {
                            Covode.recordClassIndex(14894);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC13101a mo20915a() {
                            return this.f31851a.mo20760w();
                        }

                        {
                            this.f31851a = r1;
                        }
                    });
                    C13104c.m23567a(AbstractC13029b.class, new AbstractC13100a<AbstractC13029b>() {
                        /* class com.bytedance.p802b.p824f.C13044a.C130596 */

                        static {
                            Covode.recordClassIndex(14895);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC13029b mo20915a() {
                            return new C13072c();
                        }
                    });
                    C13104c.m23567a(AbstractC13109a.class, new AbstractC13100a<AbstractC13109a>() {
                        /* class com.bytedance.p802b.p824f.C13044a.C130607 */

                        static {
                            Covode.recordClassIndex(14896);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ AbstractC13109a mo20915a() {
                            return C13024a.C13025a.f31742a;
                        }
                    });
                    C13104c.m23567a(AbstractC12976g.class, new AbstractC13100a<AbstractC12976g>(bVar) {
                        /* class com.bytedance.p802b.p824f.C13044a.C130618 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC13080b f31852a;

                        static {
                            Covode.recordClassIndex(14897);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p802b.p834j.AbstractC13100a
                        /* renamed from: a */
                        public final /* synthetic */ AbstractC12976g mo20915a() {
                            return this.f31852a.mo20757t();
                        }

                        {
                            this.f31852a = r1;
                        }
                    });
                    C13065a.m23491a().mo20920b();
                    C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20943a(new AbstractRunnableC13123a() {
                        /* class com.bytedance.p802b.p824f.C13044a.C130629 */

                        static {
                            Covode.recordClassIndex(14898);
                        }

                        public final void run() {
                            long j;
                            C12969e eVar = C12969e.f31592a;
                            if (!C13092a.f31927a.contains(eVar)) {
                                C13092a.f31927a.add(eVar);
                            }
                            C13084b.C13086a.f31905a.mo20925a();
                            if (C13037a.m23435c()) {
                                C13026a aVar = C13026a.f31743a;
                                if (!aVar.f31745c) {
                                    aVar.f31745c = true;
                                    AbstractC13029b bVar = (AbstractC13029b) C13104c.m23566a(AbstractC13029b.class);
                                    if (bVar != null) {
                                        aVar.mo20885a(bVar.mo20888a());
                                    }
                                }
                            }
                            C12983b bVar2 = C12983b.C12986a.f31626a;
                            if (bVar2.f31617a.compareAndSet(false, true)) {
                                bVar2.f31621e = (AbstractC13106a) C13104c.m23566a(AbstractC13106a.class);
                                bVar2.f31620d = SharedPreferencesC12438d.m22396a(C13113a.f31955g, "apm_cpu_front");
                                if (C13037a.m23435c()) {
                                    bVar2.mo20836b();
                                    C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20943a(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: INVOKE  
                                          (wrap: com.bytedance.b.k.d.b : 0x005e: INVOKE  (r1v8 com.bytedance.b.k.d.b) = 
                                          (wrap: com.bytedance.b.k.d.c : 0x005c: SGET  (r0v31 com.bytedance.b.k.d.c) =  com.bytedance.b.k.d.c.LIGHT_WEIGHT com.bytedance.b.k.d.c)
                                         type: STATIC call: com.bytedance.b.k.d.b.a(com.bytedance.b.k.d.c):com.bytedance.b.k.d.b)
                                          (wrap: com.bytedance.b.c.a.b$1 : 0x0064: CONSTRUCTOR  (r0v32 com.bytedance.b.c.a.b$1) = (r4v0 'bVar2' com.bytedance.b.c.a.b) call: com.bytedance.b.c.a.b.1.<init>(com.bytedance.b.c.a.b):void type: CONSTRUCTOR)
                                         type: VIRTUAL call: com.bytedance.b.k.d.b.a(com.bytedance.b.k.d.a):void in method: com.bytedance.b.f.a.9.run():void, file: classes.dex
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
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0064: CONSTRUCTOR  (r0v32 com.bytedance.b.c.a.b$1) = (r4v0 'bVar2' com.bytedance.b.c.a.b) call: com.bytedance.b.c.a.b.1.<init>(com.bytedance.b.c.a.b):void type: CONSTRUCTOR in method: com.bytedance.b.f.a.9.run():void, file: classes.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                        	... 24 more
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.b.c.a.b, state: GENERATED_AND_UNLOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                        	... 30 more
                                        */
                                    /*
                                    // Method dump skipped, instructions count: 215
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p824f.C13044a.C130629.run():void");
                                }
                            });
                            C12972c.f31599a.mo20828a(new AbstractC12971b() {
                                /* class com.bytedance.p802b.p824f.C13044a.C1304610 */

                                static {
                                    Covode.recordClassIndex(14882);
                                }

                                @Override // com.bytedance.p802b.p806b.p807a.p812e.AbstractC12971b
                                /* renamed from: a */
                                public final void mo20827a(List<C12970a> list) {
                                    if (!C13130f.m23608a(list)) {
                                        JSONObject jSONObject = new JSONObject();
                                        for (C12970a aVar : list) {
                                            try {
                                                jSONObject.put("before_size_" + aVar.f31596a, aVar.f31597b);
                                                jSONObject.put("after_size_" + aVar.f31596a, aVar.f31598c);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        C12918a.m23186a("apm_db_size", null, jSONObject, null);
                                    }
                                }
                            });
                        }
                    };
                }
            }
        }

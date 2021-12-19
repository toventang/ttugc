package com.p2082ss.android.ugc.aweme.dmt_integration;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.p936a.p937a.AbstractC14085c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.services.apm.api.C22708a;
import com.google.gson.C27910f;
import com.google.p1998c.p1999a.C27245k;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.editSticker.model.C45937b;
import com.p2082ss.android.ugc.aweme.editSticker.model.C45939c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59183a;
import com.p2082ss.android.ugc.aweme.p2429bx.C35327a;
import com.p2082ss.android.ugc.aweme.p2429bx.C35328b;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63177aj;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63250k;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65348ar;
import com.p2082ss.android.ugc.aweme.services.IAVInitializer;
import com.p2082ss.android.ugc.aweme.services.RuntimeBehaviorServiceDiff;
import com.p2082ss.android.ugc.aweme.services.storage.AVStorageManagerImpl;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68085a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70465j;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70466k;
import com.p2082ss.android.ugc.aweme.shortvideo.mapping.C71981a;
import com.p2082ss.android.ugc.aweme.shortvideo.mapping.C71983b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.sticker.C75456p;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80210ae;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.p4343e.C84415a;
import com.p2082ss.android.ugc.tools.p4343e.C84416b;
import com.p2082ss.android.ugc.tools.p4343e.C84422h;
import com.p2082ss.android.ugc.tools.p4343e.C84423i;
import com.p2082ss.android.ugc.tools.p4344f.AbstractC84429c;
import com.p2082ss.android.ugc.tools.p4345g.AbstractC84433b;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.style.AbstractC84968c;
import com.p2082ss.android.ugc.tools.view.style.C84980f;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl */
public class AVInitializerImpl implements IAVInitializer {

    /* renamed from: a */
    public static boolean f100361a;

    static {
        Covode.recordClassIndex(51198);
    }

    /* renamed from: a */
    public static IAVInitializer m85882a() {
        MethodCollector.m26663i(7520);
        Object a = C81908b.m141854a(IAVInitializer.class, false);
        if (a != null) {
            IAVInitializer iAVInitializer = (IAVInitializer) a;
            MethodCollector.m26664o(7520);
            return iAVInitializer;
        }
        if (C81908b.f183224ba == null) {
            synchronized (IAVInitializer.class) {
                try {
                    if (C81908b.f183224ba == null) {
                        C81908b.f183224ba = new AVInitializerImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7520);
                    throw th;
                }
            }
        }
        AVInitializerImpl aVInitializerImpl = (AVInitializerImpl) C81908b.f183224ba;
        MethodCollector.m26664o(7520);
        return aVInitializerImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVInitializer
    public void initMonitor(Application application) {
        C63250k kVar = C63250k.C63252a.f143622a;
        Objects.requireNonNull(application, "CreativeActivityMonitor: can't init with null application!");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("CreativeActivityMonitor: init must call in main thread!");
        } else if (!kVar.f143618f) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                /* class com.p2082ss.android.ugc.aweme.port.p3561in.C63250k.C632511 */

                static {
                    Covode.recordClassIndex(74524);
                }

                public final void onActivityPaused(Activity activity) {
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityResumed(Activity activity) {
                    C63250k kVar = C63250k.this;
                    new C63246h(activity, (byte) 5);
                    kVar.mo101732b();
                }

                public final void onActivityStarted(Activity activity) {
                    C63250k.this.f143617e++;
                    if (C63250k.this.f143617e == 1) {
                        C63250k.this.mo101730a(1);
                    }
                    C63250k kVar = C63250k.this;
                    new C63246h(activity, (byte) 3);
                    kVar.mo101732b();
                }

                public final void onActivityStopped(Activity activity) {
                    C63250k kVar = C63250k.this;
                    kVar.f143617e--;
                    if (C63250k.this.f143617e == 0) {
                        C63250k.this.mo101730a(2);
                    }
                }

                public final void onActivityDestroyed(Activity activity) {
                    C63250k kVar = C63250k.this;
                    kVar.f143616d--;
                    C63250k kVar2 = C63250k.this;
                    new C63246h(activity, (byte) 2);
                    kVar2.mo101732b();
                    C63250k.this.f143614b.remove(activity);
                    if (C63250k.m114605a(activity)) {
                        C63250k.this.f143613a = false;
                    }
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C63250k.this.f143616d++;
                    C63250k kVar = C63250k.this;
                    new C63246h(activity, (byte) 1);
                    kVar.mo101732b();
                    C63250k.this.f143614b.add(activity);
                    if (C63250k.m114605a(activity)) {
                        C63250k.this.f143613a = true;
                    }
                }
            });
            kVar.f143618f = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAVInitializer
    public void initialize(Application application) {
        boolean z;
        C63247i.f143610a = (Application) C27245k.m54229a(application);
        C43079b bVar = new C43079b(application);
        C89219l.m154721d(bVar, "");
        C63244g.f143604a = bVar;
        C63253l.f143623a = (AbstractC63177aj) C27245k.m54229a(new C43091n());
        if (C68085a.m120388b() != 0) {
            z = true;
        } else {
            z = false;
        }
        C59183a.f134681a = z;
        C84896h.f189732b = C65348ar.m117034a();
        C84896h.f189733c = new C84896h.AbstractC84897a() {
            /* class com.p2082ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.C430481 */

            static {
                Covode.recordClassIndex(51199);
            }

            @Override // com.p2082ss.android.ugc.tools.utils.C84896h.AbstractC84897a
            /* renamed from: a */
            public final void mo73250a(int i, String str) {
                C84911q.m145926b("FileAdapterAndroidR code:" + i + ", msg:" + str);
                C22708a.m42800a("FileAdapterAndroidR code:" + i + ", msg:" + str + ", trace:" + Log.getStackTraceString(new Throwable()));
            }
        };
        C35327a aVar = new C35327a();
        C89219l.m154721d(aVar, "");
        C72724a.f163052a = aVar;
        C35328b bVar2 = new C35328b();
        C89219l.m154721d(bVar2, "");
        C75456p.f169561a = bVar2;
        C70466k kVar = new C70466k();
        C89219l.m154721d(kVar, "");
        C70465j.f157445a = kVar;
        if (!((Boolean) C58152b.f132414a.getValue()).booleanValue()) {
            C63244g.m114602a().mo73279g().mo69468a(new AVStorageManagerImpl());
        }
        f100361a = true;
        C85041d.f190305a = C43080c.f100421a;
        C85041d.f190306b = C43083f.f100424a;
        C43084g gVar = new C43084g(C63244g.m114602a());
        C89219l.m154721d(gVar, "");
        gVar.invoke(C84416b.f188752b);
        C43085h hVar = new C43085h(this);
        C89219l.m154721d(hVar, "");
        hVar.invoke(C84416b.f188753c);
        AbstractC89172b bVar3 = C43086i.f100427a;
        C89219l.m154721d(bVar3, "");
        bVar3.invoke(C84416b.f188754d);
        AbstractC89172b bVar4 = C43087j.f100428a;
        C89219l.m154721d(bVar4, "");
        bVar4.invoke(C84416b.f188755e);
        if (C84416b.f188751a.compareAndSet(false, true)) {
            C84415a aVar2 = C84416b.f188752b;
            Application application2 = aVar2.f188745a;
            if (application2 != null) {
                C89219l.m154721d(application2, "");
                C84401c.f188717a = application2;
                C84896h.f189731a = application2;
            }
            Boolean bool = aVar2.f188746b;
            if (bool != null) {
                C84401c.f188718b = bool.booleanValue();
            }
            C85052j.AbstractC85054b bVar5 = aVar2.f188747c;
            if (bVar5 != null) {
                C89219l.m154721d(bVar5, "");
                C85052j.f190334a = bVar5;
            }
            C27910f fVar = aVar2.f188748d;
            if (fVar != null) {
                C89219l.m154721d(fVar, "");
                C84401c.f188719c = fVar;
            }
            AbstractC84429c cVar = aVar2.f188749e;
            if (cVar != null) {
                C89219l.m154721d(cVar, "");
                C84401c.f188720d = cVar;
            }
            AbstractC84433b bVar6 = aVar2.f188750f;
            if (bVar6 != null) {
                C89219l.m154721d(bVar6, "");
                C84401c.f188721e = bVar6;
            }
            C84423i iVar = C84416b.f188753c;
            AbstractC89171a<? extends Typeface> aVar3 = iVar.f188762b;
            if (aVar3 != null) {
                C89219l.m154721d(aVar3, "");
                C84980f.f190017b = aVar3;
            }
            AbstractC84968c cVar2 = iVar.f188761a;
            if (cVar2 != null) {
                C84980f.f190016a = cVar2;
            }
            AbstractC89172b<? super C84370a, C89391z> bVar7 = iVar.f188763c;
            if (bVar7 != null) {
                bVar7.invoke(C84370a.f188623l);
            }
            AbstractC84903j jVar = C84416b.f188754d.f188757a;
            if (jVar != null) {
                C89219l.m154721d(jVar, "");
                C84401c.f188722f = jVar;
            }
            C84422h hVar2 = C84416b.f188755e;
            AbstractC89172b<? super AbstractC14085c, C89391z> bVar8 = hVar2.f188758a;
            if (bVar8 != null) {
                bVar8.invoke(C71983b.f161312a);
            }
            AbstractC89172b<? super AbstractC14085c, C89391z> bVar9 = hVar2.f188759b;
            if (bVar9 != null) {
                bVar9.invoke(C71981a.f161310a);
            }
            AbstractC89172b<? super C45937b, C89391z> bVar10 = hVar2.f188760c;
            if (bVar10 != null) {
                bVar10.invoke(C45939c.f107003a);
            }
        }
        C80510gr.f180109d = new AbstractC80210ae() {
            /* class com.p2082ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.C430492 */

            static {
                Covode.recordClassIndex(51200);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80210ae
            /* renamed from: a */
            public final void mo73251a(String str) {
                RuntimeBehaviorServiceDiff.INSTANCE.event(str);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80210ae
            /* renamed from: a */
            public final void mo73252a(String str, String str2) {
                RuntimeBehaviorServiceDiff.INSTANCE.event(str, str2);
            }
        };
        C89219l.m154721d(application, "");
        C40964c cVar3 = C40964c.C40968c.f95804a;
        if (!cVar3.f95799c) {
            cVar3.f95798b = new CopyOnWriteArrayList();
            Context applicationContext = application.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            ((Application) applicationContext).registerActivityLifecycleCallbacks(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x015c: INVOKE  
                  (wrap: android.app.Application : 0x0155: CHECK_CAST (r1v8 android.app.Application) = (android.app.Application) (r1v7 'applicationContext' android.content.Context))
                  (wrap: com.ss.android.ugc.aweme.de.c$1 : 0x0159: CONSTRUCTOR  (r0v36 com.ss.android.ugc.aweme.de.c$1) = (r2v0 'cVar3' com.ss.android.ugc.aweme.de.c) call: com.ss.android.ugc.aweme.de.c.1.<init>(com.ss.android.ugc.aweme.de.c):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.app.Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks):void in method: com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.initialize(android.app.Application):void, file: classes8.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0159: CONSTRUCTOR  (r0v36 com.ss.android.ugc.aweme.de.c$1) = (r2v0 'cVar3' com.ss.android.ugc.aweme.de.c) call: com.ss.android.ugc.aweme.de.c.1.<init>(com.ss.android.ugc.aweme.de.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.initialize(android.app.Application):void, file: classes8.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.de.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 400
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.initialize(android.app.Application):void");
        }
    }

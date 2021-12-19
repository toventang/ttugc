package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.p1565a.AbstractC21636b;
import com.bytedance.platform.p1565a.C21622a;
import com.bytedance.platform.p1565a.p1566a.C21624a;
import com.bytedance.platform.p1565a.p1566a.C21625b;
import com.bytedance.platform.p1565a.p1567b.C21647b;
import com.bytedance.platform.p1565a.p1567b.p1568a.C21638a;
import com.bytedance.platform.p1565a.p1567b.p1568a.C21646d;
import com.bytedance.platform.p1565a.p1567b.p1568a.HandlerC21641b;
import com.bytedance.platform.p1565a.p1567b.p1568a.RunnableC21643c;
import com.bytedance.platform.p1565a.p1567b.p1570c.C21650a;
import com.bytedance.platform.p1565a.p1567b.p1570c.C21660e;
import com.bytedance.platform.p1565a.p1567b.p1570c.HandlerC21658c;
import com.bytedance.platform.p1565a.p1567b.p1570c.RunnableC21659d;
import com.bytedance.platform.p1565a.p1567b.p1570c.p1571a.C21654d;
import com.bytedance.platform.p1565a.p1567b.p1570c.p1571a.C21656e;
import com.bytedance.platform.p1565a.p1567b.p1570c.p1571a.View$OnAttachStateChangeListenerC21653c;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask */
public class HoraeInitTask implements AbstractC58264w {

    /* renamed from: a */
    static final List<String> f132840a = Arrays.asList("com.bytedance.android.livesdk", "com.ss.videoarch.strategy", "com.ss.optimizer.live.sdk", "com.ss.android.ugc.aweme.common.net");

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask$a */
    public static class C58338a {
        @AbstractC27891c(mo46611a = "ignore_list")

        /* renamed from: a */
        public List<String> f132842a;

        static {
            Covode.recordClassIndex(68461);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
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

    static {
        Covode.recordClassIndex(68459);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (SettingsManager.m29616a().mo25400a("enable_horae_init", false)) {
            C21622a.C21623a aVar = new C21622a.C21623a();
            aVar.f51303a = false;
            aVar.f51305c = false;
            aVar.f51306d = "double_turbo_quicken_engine";
            aVar.f51304b = new AbstractC21636b() {
                /* class com.p2082ss.android.ugc.aweme.legoImp.task.HoraeInitTask.C583371 */

                static {
                    Covode.recordClassIndex(68460);
                }
            };
            aVar.f51307e = true;
            aVar.f51309g = C16048b.m29633a().mo25421a(true, "async_dispatch_broadcast_pkg_removed", false);
            C58338a aVar2 = null;
            try {
                aVar2 = (C58338a) SettingsManager.m29616a().mo25396a("horae_ignore_config", C58338a.class);
            } catch (Throwable unused) {
            }
            if (aVar2 != null && !C13603b.m24435a((Collection) aVar2.f132842a)) {
                aVar.f51308f = new HashSet(aVar2.f132842a);
            }
            C21638a.AbstractC21640b bVar = C58431e.f133038a;
            if (bVar != null) {
                C21638a.f51340d = bVar;
            }
            C21622a aVar3 = new C21622a(aVar.f51303a, aVar.f51304b, aVar.f51306d, aVar.f51305c, aVar.f51308f, aVar.f51307e, aVar.f51309g, (byte) 0);
            C21647b a = C21647b.m40599a((Application) context);
            if (aVar3.f51300e) {
                C21638a.f51337a.add(133);
            }
            boolean z = aVar3.f51296a;
            String str = aVar3.f51298c;
            AbstractC21636b bVar2 = aVar3.f51297b;
            Set<String> set = aVar3.f51301f;
            boolean z2 = aVar3.f51299d;
            if (!a.f51366b) {
                if (!TextUtils.isEmpty(str)) {
                    a.f51367c = z;
                    a.f51366b = true;
                    if (z) {
                        RunnableC21659d b = RunnableC21659d.m40607b();
                        Application application = a.f51365a;
                        if (!b.f51397e) {
                            b.f51398f = bVar2;
                            b.f51397e = true;
                            b.f51394a = application;
                            b.f51399g = z2;
                            HandlerThread handlerThread = new HandlerThread(str);
                            handlerThread.start();
                            C21650a aVar4 = new C21650a();
                            Application application2 = b.f51394a;
                            C21654d dVar = new C21654d(aVar4);
                            dVar.f51387c = new C21654d.HandlerC21655a(Looper.getMainLooper());
                            dVar.mo35316a();
                            C21656e eVar = new C21656e(aVar4);
                            try {
                                Field a2 = C21625b.m40575a(Looper.class, "mLogging");
                                eVar.f51390c = (Printer) a2.get(Looper.getMainLooper());
                                a2.set(Looper.getMainLooper(), eVar);
                            } catch (Throwable unused2) {
                            }
                            View$OnAttachStateChangeListenerC21653c cVar = new View$OnAttachStateChangeListenerC21653c(application2, aVar4);
                            try {
                                cVar.f51385d = C21625b.m40575a(View.class, "mAttachInfo");
                                if (cVar.f51385d != null) {
                                    cVar.f51385d.setAccessible(true);
                                    cVar.f51384c.registerActivityLifecycleCallbacks(cVar);
                                }
                            } catch (Throwable unused3) {
                            }
                            C21660e eVar2 = C21660e.f51404a;
                            try {
                                Handler handler = (Handler) C21624a.m40572b();
                                Field a3 = C21625b.m40575a(Handler.class, "mCallback");
                                eVar2.f51408d = (Handler.Callback) a3.get(handler);
                                a3.set(handler, eVar2);
                            } catch (Throwable unused4) {
                                if (RunnableC21659d.m40607b().f51398f != null) {
                                    RunnableC21659d.m40607b();
                                }
                            }
                            b.f51395b = new HandlerC21658c(handlerThread.getLooper());
                            b.f51395b.postDelayed(b, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                        }
                    } else {
                        C21638a.f51339c = set;
                        RunnableC21643c a4 = RunnableC21643c.m40597a();
                        Application application3 = a.f51365a;
                        if (!a4.f51350c) {
                            a4.f51352e = bVar2;
                            a4.f51350c = true;
                            a4.f51348a = application3;
                            a4.f51353f = z2;
                            HandlerThread handlerThread2 = new HandlerThread(str);
                            handlerThread2.start();
                            C21646d dVar2 = C21646d.f51361a;
                            try {
                                Handler handler2 = (Handler) C21624a.m40572b();
                                Field a5 = C21625b.m40575a(Handler.class, "mCallback");
                                dVar2.f51363c = (Handler.Callback) a5.get(handler2);
                                a5.set(handler2, dVar2);
                            } catch (Throwable unused5) {
                            }
                            a4.f51351d = handlerThread2.getLooper();
                            a4.f51349b = new HandlerC21641b(a4.f51351d);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            a4.f51349b.post(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01ae: INVOKE  
                                  (wrap: android.os.Handler : 0x01a7: IGET  (r3v7 android.os.Handler) = (r5v2 'a4' com.bytedance.platform.a.b.a.c) com.bytedance.platform.a.b.a.c.b android.os.Handler)
                                  (wrap: com.bytedance.platform.a.b.a.c$1 : 0x01ab: CONSTRUCTOR  (r0v16 com.bytedance.platform.a.b.a.c$1) = (r5v2 'a4' com.bytedance.platform.a.b.a.c), (r4v3 'countDownLatch' java.util.concurrent.CountDownLatch) call: com.bytedance.platform.a.b.a.c.1.<init>(com.bytedance.platform.a.b.a.c, java.util.concurrent.CountDownLatch):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask.a(android.content.Context):void, file: classes.dex
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01ab: CONSTRUCTOR  (r0v16 com.bytedance.platform.a.b.a.c$1) = (r5v2 'a4' com.bytedance.platform.a.b.a.c), (r4v3 'countDownLatch' java.util.concurrent.CountDownLatch) call: com.bytedance.platform.a.b.a.c.1.<init>(com.bytedance.platform.a.b.a.c, java.util.concurrent.CountDownLatch):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask.a(android.content.Context):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 41 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.platform.a.b.a.c, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 47 more
                                */
                            /*
                            // Method dump skipped, instructions count: 466
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.HoraeInitTask.mo28600a(android.content.Context):void");
                        }
                    }

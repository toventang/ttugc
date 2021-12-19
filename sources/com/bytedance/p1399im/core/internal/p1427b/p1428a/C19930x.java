package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19967c;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20004l;
import com.bytedance.p1399im.core.internal.utils.C20043t;
import com.bytedance.p1399im.core.internal.utils.HandlerC20049x;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.p1399im.core.proto.UnReadCountReportRequestBody;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.x */
public final class C19930x implements HandlerC20049x.AbstractC20050a {

    /* renamed from: c */
    private static C19930x f47381c;

    /* renamed from: d */
    private static List<AbstractC19934a> f47382d = new ArrayList();

    /* renamed from: a */
    public HandlerC20049x f47383a = new HandlerC20049x(Looper.getMainLooper(), this);

    /* renamed from: b */
    public boolean f47384b;

    /* renamed from: com.bytedance.im.core.internal.b.a.x$a */
    public interface AbstractC19934a {
        static {
            Covode.recordClassIndex(22778);
        }

        /* renamed from: a */
        AbstractC19927w mo31810a();
    }

    @Override // com.bytedance.p1399im.core.internal.utils.HandlerC20049x.AbstractC20050a
    /* renamed from: a */
    public final void mo31686a(Message message) {
        if (message.obj instanceof C19978k) {
            C19978k kVar = (C19978k) message.obj;
            if (kVar.f47484h != null) {
                kVar.f47484h.mo31804c(kVar);
            }
        }
    }

    static {
        Covode.recordClassIndex(22774);
    }

    private C19930x() {
        C19967c.m37645a().mo31851a(this.f47383a);
    }

    /* renamed from: a */
    public static C19930x m37536a() {
        MethodCollector.m26663i(9892);
        if (f47381c == null) {
            synchronized (C19930x.class) {
                try {
                    if (f47381c == null) {
                        f47381c = new C19930x();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9892);
                    throw th;
                }
            }
        }
        C19930x xVar = f47381c;
        MethodCollector.m26664o(9892);
        return xVar;
    }

    /* renamed from: a */
    public final void mo31808a(Runnable runnable) {
        this.f47383a.post(runnable);
    }

    /* renamed from: a */
    public static void m37541a(String str) {
        new C19902o().mo31785a(str);
    }

    /* renamed from: b */
    public static void m37544b(String str) {
        new C19802ad().mo31743a(str, 0, (AbstractC19977j) null);
    }

    /* renamed from: a */
    public static void m37539a(long j) {
        C19853ar arVar = new C19853ar();
        if (C19483d.m36365a().mo31141b().f46211T) {
            UnReadCountReportRequestBody.Builder builder = new UnReadCountReportRequestBody.Builder();
            if (j != -1) {
                builder.total_unread_count(Long.valueOf(j));
            }
            arVar.mo31798a(0, new RequestBody.Builder().unread_count_report_body(builder.build()).build(), null, new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m37543b(int i, int i2) {
        if (m37542a("getMessageByUser", 0, i, i2)) {
            new C19918u(i).mo31789a(i2);
        }
    }

    /* renamed from: c */
    public final void mo31809c(final int i, final int i2) {
        if (m37542a("pullRecentAndCmdMessage", 1, i, i2)) {
            if (C19483d.m36365a().mo31141b().f46246ak) {
                new C19921v(i).mo31792a(i2);
                new C19898m(i).mo31779a(i2);
                return;
            }
            new C19921v(i, new AbstractC19479b<Boolean>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.C199311 */

                static {
                    Covode.recordClassIndex(22775);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final /* synthetic */ void mo27861a(Boolean bool) {
                    new C19898m(i).mo31779a(i2);
                }
            }).mo31792a(i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[EDGE_INSN: B:24:0x0032->B:15:0x0032 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.p1399im.core.internal.p1431d.C19978k m37537a(com.bytedance.p1399im.core.proto.IMCMD r2, com.bytedance.p1399im.core.internal.p1431d.C19978k r3) {
        /*
            com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.p1399im.core.proto.IMCMD.NEW_MSG_NOTIFY
            r0 = 1
            if (r2 != r1) goto L_0x0036
            com.bytedance.im.core.internal.b.a.ai r0 = new com.bytedance.im.core.internal.b.a.ai
            r0.<init>()
            r3.f47484h = r0
        L_0x000c:
            r2 = 1
        L_0x000d:
            java.util.List<com.bytedance.im.core.internal.b.a.x$a> r0 = com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.f47382d
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0032
            java.util.List<com.bytedance.im.core.internal.b.a.x$a> r0 = com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.f47382d
            java.util.Iterator r1 = r0.iterator()
        L_0x001d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.next()
            com.bytedance.im.core.internal.b.a.x$a r0 = (com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.AbstractC19934a) r0
            com.bytedance.im.core.internal.b.a.w r0 = r0.mo31810a()
            if (r0 == 0) goto L_0x001d
            r3.f47484h = r0
        L_0x0031:
            return r3
        L_0x0032:
            if (r2 != 0) goto L_0x0031
            r0 = 0
            return r0
        L_0x0036:
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.p1399im.core.proto.IMCMD.STRANGER_NEW_MSG_NOTIFY
            if (r2 != r0) goto L_0x0042
            com.bytedance.im.core.internal.b.a.aq r0 = new com.bytedance.im.core.internal.b.a.aq
            r0.<init>()
            r3.f47484h = r0
            goto L_0x000c
        L_0x0042:
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.p1399im.core.proto.IMCMD.NEW_P2P_MSG_NOTIFY
            if (r2 != r0) goto L_0x004e
            com.bytedance.im.core.internal.b.a.aj r0 = new com.bytedance.im.core.internal.b.a.aj
            r0.<init>()
            r3.f47484h = r0
            goto L_0x000c
        L_0x004e:
            r2 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.m37537a(com.bytedance.im.core.proto.IMCMD, com.bytedance.im.core.internal.d.k):com.bytedance.im.core.internal.d.k");
    }

    /* renamed from: a */
    public static void m37540a(C19538ai aiVar, AbstractC19479b<C19538ai> bVar) {
        C19835al alVar = new C19835al(bVar);
        if (aiVar == null) {
            alVar.mo31803b(C19978k.m37686a(-1015));
            return;
        }
        aiVar.setMsgStatus(1);
        alVar.f47106a.f46547a = SystemClock.uptimeMillis();
        C19512f.m36457b("imsdk", "SendMsgHandler save with opt:" + C20043t.m37922b(), (Throwable) null);
        if (C20043t.m37922b()) {
            C20043t a = C20043t.m37921a();
            if (!TextUtils.isEmpty(aiVar.getUuid())) {
                C19512f.m36457b("imsdk", "SendMsgCache cacheMsg: uuid:" + aiVar.getUuid(), (Throwable) null);
                a.f47633a.put(aiVar.getUuid(), aiVar);
            }
            RunnableC19987d.m37729a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0077: INVOKE  
                  (wrap: com.bytedance.im.core.internal.b.a.al$5 : 0x006b: CONSTRUCTOR  (r2v3 com.bytedance.im.core.internal.b.a.al$5) = (r3v0 'alVar' com.bytedance.im.core.internal.b.a.al), (r7v0 'aiVar' com.bytedance.im.core.d.ai) call: com.bytedance.im.core.internal.b.a.al.5.<init>(com.bytedance.im.core.internal.b.a.al, com.bytedance.im.core.d.ai):void type: CONSTRUCTOR)
                  (wrap: com.bytedance.im.core.internal.b.a.al$6 : 0x0070: CONSTRUCTOR  (r1v2 com.bytedance.im.core.internal.b.a.al$6) = (r3v0 'alVar' com.bytedance.im.core.internal.b.a.al) call: com.bytedance.im.core.internal.b.a.al.6.<init>(com.bytedance.im.core.internal.b.a.al):void type: CONSTRUCTOR)
                  (wrap: java.util.concurrent.Executor : 0x0073: INVOKE  (r0v9 java.util.concurrent.Executor) =  type: STATIC call: com.bytedance.im.core.internal.e.a.b():java.util.concurrent.Executor)
                 type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b, java.util.concurrent.Executor):void in method: com.bytedance.im.core.internal.b.a.x.a(com.bytedance.im.core.d.ai, com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.ai>):void, file: classes10.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006b: CONSTRUCTOR  (r2v3 com.bytedance.im.core.internal.b.a.al$5) = (r3v0 'alVar' com.bytedance.im.core.internal.b.a.al), (r7v0 'aiVar' com.bytedance.im.core.d.ai) call: com.bytedance.im.core.internal.b.a.al.5.<init>(com.bytedance.im.core.internal.b.a.al, com.bytedance.im.core.d.ai):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.b.a.x.a(com.bytedance.im.core.d.ai, com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.ai>):void, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.internal.b.a.al, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 171
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.m37540a(com.bytedance.im.core.d.ai, com.bytedance.im.core.a.a.b):void");
        }

        /* renamed from: a */
        public final void mo31807a(int i, int i2) {
            if (C20004l.m37794a().f47545b) {
                C19512f.m36457b("imsdk", "IMHandlerCenter getMessageByLinkMode migrating now", (Throwable) null);
                return;
            }
            int b = C20004l.m37794a().mo31880b();
            if (b == 0) {
                m37543b(i, i2);
            } else if (b == 1) {
                mo31809c(i, i2);
            } else {
                C19512f.m36457b("imsdk", "IMHandlerCenter getMessageByLinkMode invalid mode:".concat(String.valueOf(b)), (Throwable) null);
            }
        }

        /* renamed from: a */
        static boolean m37542a(String str, int i, int i2, int i3) {
            boolean z = C20004l.m37794a().f47545b;
            int b = C20004l.m37794a().mo31880b();
            if (i3 == 9) {
                return true;
            }
            if (!z && i == b) {
                return true;
            }
            C19512f.m36457b("imsdk", "IMHandlerCenter " + str + " illegal state, inbox:" + i2 + ", reason:" + i3 + ", isMigrating:" + z + ", linkMode:" + b, (Throwable) null);
            return false;
        }

        /* renamed from: a */
        public static void m37538a(int i, String str, long j, int i2, AbstractC19479b<C19638h> bVar) {
            new C19902o(bVar).mo31784a(i, str, j, i2, System.currentTimeMillis(), true);
        }
    }

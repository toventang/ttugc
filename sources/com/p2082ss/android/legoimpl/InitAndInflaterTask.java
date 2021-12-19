package com.p2082ss.android.legoimpl;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17865c;
import com.bytedance.nita.api.AbstractC21524b;
import com.bytedance.nita.api.AbstractC21525c;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p084a.p088b.C1862a;
import com.p084a.p088b.C1870c;
import com.p084a.p088b.C1873d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C47033k;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Random;

/* renamed from: com.ss.android.legoimpl.InitAndInflaterTask */
public class InitAndInflaterTask implements AbstractC58264w {

    /* renamed from: a */
    public static final Random f71453a = new Random();

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
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(36379);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    public static boolean m60435c() {
        if (C1870c.f5679b.f5686g || f71453a.nextFloat() < 0.005f) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        System.currentTimeMillis();
        C1873d.C1874a aVar = new C1873d.C1874a();
        aVar.f5693f = true;
        aVar.f5691d = true;
        C1862a.f5672b = true;
        aVar.f5692e = false;
        aVar.f5689b = C47033k.f109575e;
        if (aVar.f5689b <= 0 || aVar.f5689b > 8) {
            aVar.f5689b = 1;
        }
        if (Build.VERSION.SDK_INT >= 24 && Build.VERSION.SDK_INT <= 27) {
            aVar.f5689b = 1;
        }
        aVar.f5694g = C67248d.m119173a();
        aVar.f5695h = false;
        aVar.f5690c = R.style.nz;
        C299571 r1 = new AbstractC21524b() {
            /* class com.p2082ss.android.legoimpl.InitAndInflaterTask.C299571 */

            static {
                Covode.recordClassIndex(36380);
            }

            @Override // com.bytedance.nita.api.AbstractC21524b
            /* renamed from: a */
            public final void mo35198a(Throwable th) {
                if (!C1870c.f5679b.f5686g) {
                    C17865c.f42574a.getValue();
                    if (InitAndInflaterTask.m60435c()) {
                        C13468b.m24211a(th, "x2c");
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(th);
            }

            @Override // com.bytedance.nita.api.AbstractC21524b
            /* renamed from: a */
            public final void mo35196a(long j, AbstractC21525c cVar) {
                boolean z;
                if (InitAndInflaterTask.m60435c()) {
                    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C1870c.f5679b.f5686g) {
                        cVar.mo35178a();
                    }
                    C39162r.m79452a().execute(new RunnableC29965c(j, cVar, z));
                }
            }

            @Override // com.bytedance.nita.api.AbstractC21524b
            /* renamed from: a */
            public final void mo35197a(long j, AbstractC21525c cVar, boolean z) {
                boolean z2;
                if (InitAndInflaterTask.m60435c()) {
                    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (C1870c.f5679b.f5686g) {
                        cVar.mo35178a();
                    }
                    C39162r.m79452a().execute(new RunnableC29966d(j, cVar, z, z2));
                }
            }
        };
        aVar.f5688a = r1;
        C1862a.f5671a = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: SPUT  
              (wrap: com.a.b.d$a$1 : 0x0046: CONSTRUCTOR  (r0v5 com.a.b.d$a$1) = (r3v0 'aVar' com.a.b.d$a), (r1v1 'r1' com.ss.android.legoimpl.InitAndInflaterTask$1) call: com.a.b.d.a.1.<init>(com.a.b.d$a, com.bytedance.nita.api.b):void type: CONSTRUCTOR)
             com.a.b.a.a com.a.b.c.a in method: com.ss.android.legoimpl.InitAndInflaterTask.a(android.content.Context):void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: CONSTRUCTOR  (r0v5 com.a.b.d$a$1) = (r3v0 'aVar' com.a.b.d$a), (r1v1 'r1' com.ss.android.legoimpl.InitAndInflaterTask$1) call: com.a.b.d.a.1.<init>(com.a.b.d$a, com.bytedance.nita.api.b):void type: CONSTRUCTOR in method: com.ss.android.legoimpl.InitAndInflaterTask.a(android.content.Context):void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:439)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.a.b.d, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.legoimpl.InitAndInflaterTask.mo28600a(android.content.Context):void");
    }
}

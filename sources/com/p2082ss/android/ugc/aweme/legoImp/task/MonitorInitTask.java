package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.C12255a;
import com.bytedance.apm.config.C12419c;
import com.bytedance.apm.impl.DefaultTTNetImpl;
import com.bytedance.apm.p775g.AbstractC12474b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask */
public class MonitorInitTask implements AbstractC58264w {

    /* renamed from: a */
    private static final AtomicBoolean f132907a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final String[] f132908b = {"https://mon-va.tiktokv.com/monitor/collect/c/exception"};

    /* renamed from: c */
    private static final List<String> f132909c;

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
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
        return EnumC58151ae.BOOT_FINISH;
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
        String str;
        Covode.recordClassIndex(68540);
        String[] strArr = new String[3];
        String str2 = "https://mon.tiktokv.com/monitor/collect/";
        if (C58071d.m104909c()) {
            str = str2;
        } else {
            str = "https://mon-va.tiktokv.com/monitor/collect/";
        }
        strArr[0] = str;
        if (C58071d.m104909c()) {
            str2 = "https://mon-va.tiktokv.com/monitor/collect/";
        }
        strArr[1] = str2;
        strArr[2] = "https://mon-sg.tiktokv.com/monitor/collect/";
        f132909c = new ArrayList(Arrays.asList(strArr));
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        String str;
        boolean z = false;
        if (f132907a.compareAndSet(false, true)) {
            C12255a.C12259a.f29537a.mo19750a(C17867d.m33078a());
            C12419c.C12420a aVar = new C12419c.C12420a();
            JSONObject headerCopy = AppLog.getHeaderCopy();
            if (headerCopy != null) {
                aVar.mo20214a(headerCopy);
            }
            String[] strArr = new String[3];
            String str2 = "https://mon.tiktokv.com/monitor/appmonitor/v2/settings";
            if (C58071d.m104909c()) {
                str = str2;
            } else {
                str = "https://mon-va.tiktokv.com/monitor/appmonitor/v2/settings";
            }
            strArr[0] = str;
            if (C58071d.m104909c()) {
                str2 = "https://mon-va.tiktokv.com/monitor/appmonitor/v2/settings";
            }
            strArr[1] = str2;
            strArr[2] = "https://mon-sg.tiktokv.com/monitor/appmonitor/v2/settings";
            aVar.f30117m = Arrays.asList(strArr);
            aVar.f30124t = Math.min(60L, 30L);
            aVar.f30119o = Arrays.asList(f132908b);
            aVar.f30118n = f132909c;
            aVar.mo20212a("aid", C17867d.f42590n).mo20213a("device_id", AppLog.getServerDeviceId()).mo20213a("app_version", C17867d.m33085f()).mo20213a("update_version_code", String.valueOf(C17867d.m33083d())).mo20213a("channel", C17867d.f42595s).f30125u = new AbstractC12474b() {
                /* class com.p2082ss.android.ugc.aweme.legoImp.task.MonitorInitTask.C583681 */

                static {
                    Covode.recordClassIndex(68541);
                }

                @Override // com.bytedance.apm.p775g.AbstractC12474b
                /* renamed from: a */
                public final void mo20294a() {
                    new C58221f.C58224c().mo95703b((AbstractC58264w) new RheaTraceUploadTask()).mo95706a();
                }
            };
            if (TextUtils.equals(C17867d.f42595s, "local_test")) {
                aVar.f30126v = new C58445r(context);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                z = true;
            }
            aVar.f30116l = z;
            Context a = C17867d.m33078a();
            aVar.f30122r = new DefaultTTNetImpl();
            aVar.f30121q = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00be: IPUT  
                  (wrap: com.ss.android.ugc.aweme.app.n$1 : 0x00bb: CONSTRUCTOR  (r0v27 com.ss.android.ugc.aweme.app.n$1) =  call: com.ss.android.ugc.aweme.app.n.1.<init>():void type: CONSTRUCTOR)
                  (r2v0 'aVar' com.bytedance.apm.config.c$a)
                 com.bytedance.apm.config.c.a.q com.bytedance.apm.core.b in method: com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask.a(android.content.Context):void, file: classes2.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00bb: CONSTRUCTOR  (r0v27 com.ss.android.ugc.aweme.app.n$1) =  call: com.ss.android.ugc.aweme.app.n.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask.a(android.content.Context):void, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.app.n, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 212
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.MonitorInitTask.mo28600a(android.content.Context):void");
        }
    }

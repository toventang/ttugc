package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1643f.C22383g;
import com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22463a;
import com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22466c;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22477d;
import com.p2082ss.android.account.C29351f;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.AgeGateService;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p2082ss.android.ugc.aweme.account.network.p2275a.C32877a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.BindOrModifyPhoneActivity;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.services.BindService;
import com.p2082ss.android.ugc.aweme.services.DataService;
import com.p2082ss.android.ugc.aweme.services.InterceptorService;
import com.p2082ss.android.ugc.aweme.services.LoginMethodService;
import com.p2082ss.android.ugc.aweme.services.LoginService;
import com.p2082ss.android.ugc.aweme.services.PasswordService;
import com.p2082ss.android.ugc.aweme.services.ProAccountService;
import com.p2082ss.android.ugc.aweme.services.RnAndH5Service;
import com.p2082ss.android.ugc.aweme.services.TelecomCarrierService;
import com.p2082ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.p2082ss.android.ugc.aweme.services.VerificationService;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.an */
public abstract class AbstractC33494an implements IAccountService {

    /* renamed from: a */
    LoginService f79568a;

    /* renamed from: b */
    BindService f79569b;

    /* renamed from: c */
    VerificationService f79570c;

    /* renamed from: d */
    PasswordService f79571d;

    /* renamed from: e */
    ProAccountService f79572e;

    /* renamed from: f */
    AbstractC35319bw f79573f;

    /* renamed from: g */
    private AgeGateService f79574g;

    /* renamed from: h */
    private C52817g f79575h;

    /* renamed from: i */
    private RnAndH5Service f79576i;

    /* renamed from: j */
    private InterceptorService f79577j;

    /* renamed from: k */
    private DataService f79578k;

    /* renamed from: l */
    private LoginMethodService f79579l;

    /* renamed from: m */
    private AbstractC35339ca f79580m;

    /* renamed from: n */
    private AbstractC35418cb f79581n;

    /* renamed from: o */
    private final AtomicBoolean f79582o = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(40351);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: p */
    public final boolean mo57080p() {
        return this.f79582o.get();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: b */
    public final String mo57065b() {
        return C58071d.m104907a().toUpperCase(Locale.ROOT);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: c */
    public final IAgeGateService mo57067c() {
        mo57079o();
        if (this.f79574g == null) {
            this.f79574g = new AgeGateService();
        }
        return this.f79574g;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: d */
    public final AbstractC34881bk mo57068d() {
        mo57079o();
        if (this.f79578k == null) {
            this.f79578k = new DataService();
        }
        return this.f79578k;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: e */
    public final IAccountUserService mo57069e() {
        mo57079o();
        if (this.f79575h == null) {
            this.f79575h = new C52817g();
            C43200dr.f100694b = NetworkProxyAccount.f78256b;
        }
        return this.f79575h;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: f */
    public final AbstractC35317bv mo57070f() {
        mo57079o();
        if (this.f79576i == null) {
            this.f79576i = new RnAndH5Service();
        }
        return this.f79576i;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: g */
    public final AbstractC34892bo mo57071g() {
        mo57079o();
        if (this.f79568a == null) {
            this.f79568a = new LoginService();
        }
        return this.f79568a;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: h */
    public final AbstractC34877bj mo57072h() {
        mo57079o();
        if (this.f79569b == null) {
            this.f79569b = new BindService();
        }
        return this.f79569b;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: i */
    public final AbstractC34913br mo57073i() {
        mo57079o();
        if (this.f79571d == null) {
            this.f79571d = new PasswordService();
        }
        return this.f79571d;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: j */
    public final AbstractC34930bs mo57074j() {
        mo57079o();
        if (this.f79572e == null) {
            this.f79572e = new ProAccountService();
        }
        return this.f79572e;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: k */
    public final AbstractC34889bn mo57075k() {
        mo57079o();
        if (this.f79579l == null) {
            this.f79579l = new LoginMethodService();
        }
        return this.f79579l;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: l */
    public final AbstractC35339ca mo57076l() {
        mo57079o();
        if (this.f79580m == null) {
            this.f79580m = new TelecomCarrierService();
        }
        return this.f79580m;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: m */
    public final AbstractC35418cb mo57077m() {
        mo57079o();
        if (this.f79581n == null) {
            this.f79581n = new TwoStepVerificationService();
        }
        return this.f79581n;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: n */
    public final AbstractC34886bm mo57078n() {
        mo57079o();
        if (this.f79577j == null) {
            this.f79577j = new InterceptorService();
        }
        return this.f79577j;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService
    /* renamed from: o */
    public final void mo57079o() {
        if (!this.f79582o.get()) {
            synchronized (this.f79582o) {
                if (!this.f79582o.get()) {
                    m68600a();
                    this.f79582o.set(true);
                }
            }
        }
    }

    /* renamed from: a */
    private void m68600a() {
        C36085cj.f85262b = this;
        C36125t.m73594a("aweme://bind/mobile/", BindOrModifyPhoneActivity.class);
        C32877a aVar = new C32877a();
        C29351f.f69671a = aVar;
        C22477d.m42421a(AbstractC22463a.class, C22383g.m42210a(aVar.mo52210b()));
        if (C22477d.m42420a(AbstractC22466c.class) == null) {
            C22477d.m42421a(AbstractC22466c.class, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002c: INVOKE  
                  (wrap: java.lang.Class : 0x0025: CONST_CLASS   com.bytedance.sdk.a.k.a.c.class)
                  (wrap: com.ss.android.account.f$1 : 0x0029: CONSTRUCTOR  (r0v29 com.ss.android.account.f$1) =  call: com.ss.android.account.f.1.<init>():void type: CONSTRUCTOR)
                 type: STATIC call: com.bytedance.sdk.a.k.c.d.a(java.lang.Class, com.bytedance.sdk.a.k.a.d):void in method: com.ss.android.ugc.aweme.an.a():void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0029: CONSTRUCTOR  (r0v29 com.ss.android.account.f$1) =  call: com.ss.android.account.f.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.an.a():void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.account.f, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 208
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.AbstractC33494an.m68600a():void");
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService
        /* renamed from: a */
        public final void mo57064a(IAccountService.AbstractC31272b bVar) {
            C36085cj.m73543a(bVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService
        /* renamed from: b */
        public final void mo57066b(IAccountService.AbstractC31272b bVar) {
            synchronized (C36085cj.class) {
                C36085cj.f85261a.remove(bVar);
            }
        }
    }

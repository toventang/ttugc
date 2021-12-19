package com.p2082ss.android.deviceregister;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.deviceregister.p2134a.C29866a;
import com.p2082ss.android.deviceregister.p2135b.p2136a.AbstractC29873a;
import com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b;
import com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.C29874a;
import com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.C29880d;
import com.p2082ss.android.deviceregister.p2139d.C29895b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.UUID;

/* renamed from: com.ss.android.deviceregister.a */
public abstract class AbstractC29865a implements AbstractC29873a {

    /* renamed from: d */
    static volatile String f71236d;

    /* renamed from: g */
    private static String f71237g;

    /* renamed from: h */
    private static String f71238h;

    /* renamed from: a */
    protected final Context f71239a;

    /* renamed from: b */
    protected final boolean f71240b;

    /* renamed from: c */
    AbstractC29876b f71241c;

    /* renamed from: e */
    protected final String f71242e;

    /* renamed from: f */
    private final C29874a f71243f;

    static {
        Covode.recordClassIndex(36275);
    }

    @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.AbstractC29873a
    /* renamed from: c */
    public final String mo52158c() {
        synchronized (this) {
            if (!C13627m.m24498a(f71236d)) {
                return f71236d;
            }
            f71236d = this.f71241c.mo52164b("", "");
            return f71236d;
        }
    }

    @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.AbstractC29873a
    /* renamed from: b */
    public final String mo52156b() {
        if (!TextUtils.isEmpty(f71238h)) {
            return f71238h;
        }
        try {
            SharedPreferences a = C34822d.m71158a(this.f71239a, C29866a.m60187a(), 0);
            String string = a.getString("clientudid", null);
            if (!C29895b.m60262a(string)) {
                string = UUID.randomUUID().toString();
                SharedPreferences.Editor edit = a.edit();
                edit.putString("clientudid", string);
                edit.commit();
            }
            if (!C13627m.m24498a(string)) {
                string = string + this.f71242e;
            }
            f71238h = string;
            return string;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r3.length() >= 13) goto L_0x0082;
     */
    @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.AbstractC29873a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo52153a() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.deviceregister.AbstractC29865a.mo52153a():java.lang.String");
    }

    /* renamed from: a */
    public final void mo52154a(Account account) {
        C29874a aVar = this.f71243f;
        if (account != null) {
            aVar.f71276b = account;
            if (aVar.f71277c != null && aVar.f71277c.size() > 0) {
                RunnableC13596e.m24423a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: INVOKE  
                      (wrap: com.ss.android.deviceregister.b.a.a.a$1 : 0x0015: CONSTRUCTOR  (r0v3 com.ss.android.deviceregister.b.a.a.a$1) = (r1v0 'aVar' com.ss.android.deviceregister.b.a.a.a), (r3v0 'account' android.accounts.Account) call: com.ss.android.deviceregister.b.a.a.a.1.<init>(com.ss.android.deviceregister.b.a.a.a, android.accounts.Account):void type: CONSTRUCTOR)
                     type: STATIC call: com.bytedance.common.utility.b.e.a(java.lang.Runnable):void in method: com.ss.android.deviceregister.a.a(android.accounts.Account):void, file: classes.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: CONSTRUCTOR  (r0v3 com.ss.android.deviceregister.b.a.a.a$1) = (r1v0 'aVar' com.ss.android.deviceregister.b.a.a.a), (r3v0 'account' android.accounts.Account) call: com.ss.android.deviceregister.b.a.a.a.1.<init>(com.ss.android.deviceregister.b.a.a.a, android.accounts.Account):void type: CONSTRUCTOR in method: com.ss.android.deviceregister.a.a(android.accounts.Account):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.deviceregister.b.a.a.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                    this = this;
                    com.ss.android.deviceregister.b.a.a.a r1 = r2.f71243f
                    if (r3 == 0) goto L_0x0012
                    r1.f71276b = r3
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r1.f71277c
                    if (r0 == 0) goto L_0x0012
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r1.f71277c
                    int r0 = r0.size()
                    if (r0 > 0) goto L_0x0013
                L_0x0012:
                    return
                L_0x0013:
                    com.ss.android.deviceregister.b.a.a.a$1 r0 = new com.ss.android.deviceregister.b.a.a.a$1
                    r0.<init>(r3)
                    com.bytedance.common.utility.p907b.RunnableC13596e.m24423a(r0)
                    goto L_0x0012
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.deviceregister.AbstractC29865a.mo52154a(android.accounts.Account):void");
            }

            @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.AbstractC29873a
            /* renamed from: a */
            public final void mo52155a(String str) {
                if (!C29803q.m60035a(str) && !C13627m.m24499a(str, f71236d)) {
                    f71236d = this.f71241c.mo52164b(str, f71236d);
                }
            }

            @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.AbstractC29873a
            /* renamed from: b */
            public final void mo52157b(String str) {
                if (TextUtils.equals(str, "device_id")) {
                    f71236d = null;
                }
                if (TextUtils.equals(str, "openudid")) {
                    f71237g = null;
                }
                if (TextUtils.equals(str, "clientudid")) {
                    f71238h = null;
                }
                this.f71241c.mo52162b(str);
            }

            AbstractC29865a(Context context, boolean z) {
                String str;
                if (z) {
                    str = "_local";
                } else {
                    str = "";
                }
                this.f71242e = str;
                this.f71240b = z;
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                this.f71239a = applicationContext;
                this.f71241c = new C29880d(applicationContext);
                C29874a aVar = new C29874a(applicationContext);
                this.f71243f = aVar;
                this.f71241c.f71280d = aVar;
            }
        }

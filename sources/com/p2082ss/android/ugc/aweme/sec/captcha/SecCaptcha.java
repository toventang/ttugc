package com.p2082ss.android.ugc.aweme.sec.captcha;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.bdturing.AbstractC13248b;
import com.bytedance.bdturing.C13241a;
import com.bytedance.bdturing.C13252c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.sec.captcha.p3709a.C67824b;
import com.p2082ss.android.ugc.aweme.secapi.AbstractC67839b;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import java.lang.ref.WeakReference;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha */
public final class SecCaptcha implements AbstractC13248b, AbstractC33974au {

    /* renamed from: i */
    public static final C67816a f151995i = new C67816a((byte) 0);

    /* renamed from: a */
    public final C13241a f151996a = C13241a.C13243a.f32360a.mo21394a(mo106919a());

    /* renamed from: b */
    public WeakReference<Activity> f151997b;

    /* renamed from: c */
    public C67837a f151998c;

    /* renamed from: d */
    public String f151999d;

    /* renamed from: e */
    public String f152000e;

    /* renamed from: f */
    public final Context f152001f;

    /* renamed from: g */
    public final C67822a f152002g;

    /* renamed from: h */
    public final AbstractC67839b f152003h;

    /* renamed from: j */
    private final AbstractC89244h f152004j = C89250i.m154773a((AbstractC89171a) new C67817b(this));

    static {
        Covode.recordClassIndex(79475);
    }

    /* renamed from: a */
    public final C13252c mo106919a() {
        return (C13252c) this.f152004j.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            release();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha$a */
    public static final class C67816a {
        static {
            Covode.recordClassIndex(79476);
        }

        private C67816a() {
        }

        public /* synthetic */ C67816a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha$c */
    public static final class RunnableC67820c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SecCaptcha f152008a;

        /* renamed from: b */
        final /* synthetic */ Activity f152009b;

        static {
            Covode.recordClassIndex(79480);
        }

        public RunnableC67820c(SecCaptcha secCaptcha, Activity activity) {
            this.f152008a = secCaptcha;
            this.f152009b = activity;
        }

        public final void run() {
            Activity activity = this.f152009b;
            if (activity instanceof AbstractC1204m) {
                ((AbstractC1204m) activity).getLifecycle().mo4012a(this.f152008a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha$d */
    public static final class RunnableC67821d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SecCaptcha f152010a;

        /* renamed from: b */
        final /* synthetic */ Activity f152011b;

        static {
            Covode.recordClassIndex(79481);
        }

        public RunnableC67821d(SecCaptcha secCaptcha, Activity activity) {
            this.f152010a = secCaptcha;
            this.f152011b = activity;
        }

        public final void run() {
            Activity activity = this.f152011b;
            if (activity instanceof AbstractC1204m) {
                ((AbstractC1204m) activity).getLifecycle().mo4012a(this.f152010a);
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void release() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f151997b;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity instanceof AbstractC1204m) {
            ((AbstractC1204m) activity).getLifecycle().mo4013b(this);
        }
        C13241a aVar = this.f151996a;
        if (aVar != null) {
            aVar.mo21397b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha$b */
    static final class C67817b extends AbstractC89220m implements AbstractC89171a<C13252c> {

        /* renamed from: a */
        final /* synthetic */ SecCaptcha f152005a;

        static {
            Covode.recordClassIndex(79477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67817b(SecCaptcha secCaptcha) {
            super(0);
            this.f152005a = secCaptcha;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C13252c invoke() {
            C13252c.EnumC13254b bVar;
            C13252c.C13253a aVar = new C13252c.C13253a();
            aVar.f32412m = false;
            aVar.f32401b = String.valueOf(this.f152005a.f152002g.f152013b);
            aVar.f32403d = this.f152005a.f152002g.f152014c;
            aVar.f32406g = C17867d.m33088i();
            aVar.f32402c = this.f152005a.f152002g.f152012a;
            aVar.f32416q = C53438a.m98623b();
            aVar.f32404e = this.f152005a.f152002g.f152017f;
            aVar.f32409j = this.f152005a.f152002g.f152016e;
            aVar.f32408i = this.f152005a.f152002g.f152015d;
            boolean equalsIgnoreCase = "IN".equalsIgnoreCase(C58071d.m104913g());
            if (equalsIgnoreCase) {
                bVar = C13252c.EnumC13254b.REGION_INDIA;
            } else if (equalsIgnoreCase) {
                throw new C89376n();
            } else if (C89219l.m154714a((Object) false, (Object) true)) {
                bVar = C13252c.EnumC13254b.REGION_USA_EAST;
            } else if (C89219l.m154714a((Object) false, (Object) false)) {
                bVar = C13252c.EnumC13254b.REGION_SINGAPOER;
            } else {
                throw new C89376n();
            }
            aVar.f32400a = bVar;
            aVar.f32413n = C678181.f152006a;
            aVar.f32418s = C678192.f152007a;
            aVar.f32415p = new C67824b();
            Context applicationContext = this.f152005a.f152001f.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            aVar.f32407h = applicationContext;
            return new C13252c(aVar, (byte) 0);
        }
    }

    @Override // com.bytedance.bdturing.AbstractC13248b
    /* renamed from: b */
    public final void mo21412b(int i) {
        C51423a.m95784a(4, "Sec", "popCaptcha-onSuccess, code=".concat(String.valueOf(i)));
        C67837a aVar = this.f151998c;
        if (aVar != null) {
            aVar.mo61882a(true, i);
        }
    }

    @Override // com.bytedance.bdturing.AbstractC13248b
    /* renamed from: a */
    public final void mo21411a(int i) {
        C51423a.m95784a(4, "Sec", "popCaptcha-onFail, code=".concat(String.valueOf(i)));
        C67837a aVar = this.f151998c;
        if (aVar != null) {
            aVar.mo61882a(false, i);
        }
        C67837a aVar2 = this.f151998c;
        if (aVar2 != null) {
            aVar2.mo90185a();
        }
    }

    /* renamed from: a */
    public final void mo106920a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f152002g.mo106925b(str);
        this.f152002g.mo106924a(str2);
        mo106919a().f32381h = this.f152002g.f152015d;
        mo106919a().f32385l = this.f152002g.f152016e;
    }

    public SecCaptcha(Context context, C67822a aVar, AbstractC67839b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f152001f = context;
        this.f152002g = aVar;
        this.f152003h = bVar;
        String a = bVar.mo98926a();
        this.f151999d = a == null ? "" : a;
        String b = bVar.mo98927b();
        this.f152000e = b == null ? "" : b;
        C14731e.m26987a((C14731e.AbstractC14742k) 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0042: INVOKE  
              (wrap: com.bytedance.frameworks.baselib.network.http.e$k : ?: CAST (com.bytedance.frameworks.baselib.network.http.e$k) (wrap: com.bytedance.bdturing.ttnet.a$2 : 0x003f: CONSTRUCTOR  (r0v8 com.bytedance.bdturing.ttnet.a$2) =  call: com.bytedance.bdturing.ttnet.a.2.<init>():void type: CONSTRUCTOR))
             type: STATIC call: com.bytedance.frameworks.baselib.network.http.e.a(com.bytedance.frameworks.baselib.network.http.e$k):void in method: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha.<init>(android.content.Context, com.ss.android.ugc.aweme.sec.captcha.a, com.ss.android.ugc.aweme.secapi.b):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (com.bytedance.frameworks.baselib.network.http.e$k) (wrap: com.bytedance.bdturing.ttnet.a$2 : 0x003f: CONSTRUCTOR  (r0v8 com.bytedance.bdturing.ttnet.a$2) =  call: com.bytedance.bdturing.ttnet.a.2.<init>():void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha.<init>(android.content.Context, com.ss.android.ugc.aweme.sec.captcha.a, com.ss.android.ugc.aweme.secapi.b):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: CONSTRUCTOR  (r0v8 com.bytedance.bdturing.ttnet.a$2) =  call: com.bytedance.bdturing.ttnet.a.2.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha.<init>(android.content.Context, com.ss.android.ugc.aweme.sec.captcha.a, com.ss.android.ugc.aweme.secapi.b):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.bdturing.ttnet.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sec.captcha.SecCaptcha.<init>(android.content.Context, com.ss.android.ugc.aweme.sec.captcha.a, com.ss.android.ugc.aweme.secapi.b):void");
    }
}

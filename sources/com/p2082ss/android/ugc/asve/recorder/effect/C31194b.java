package com.p2082ss.android.ugc.asve.recorder.effect;

import android.content.Context;
import android.graphics.Bitmap;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.RecordInvoker;
import com.p2082ss.android.medialib.presenter.AbstractC30029f;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31208c;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.C31209d;
import com.p2082ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p2082ss.android.ugc.asve.wrap.ASSimpleFaceInfo;
import com.p2082ss.android.ugc.asve.wrap.AbstractC31262b;
import com.p2082ss.android.ugc.asve.wrap.AbstractC31263c;
import com.p2082ss.android.ugc.asve.wrap.C31261a;
import com.p2082ss.android.vesdk.AbstractC85313aj;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.C85392bf;
import com.p2082ss.android.vesdk.VEARCoreParam;
import com.p2082ss.android.vesdk.VECherEffectParam;
import com.p2082ss.android.vesdk.faceinfo.C85470a;
import com.p2082ss.android.vesdk.faceinfo.C85471b;
import com.p2082ss.android.vesdk.faceinfo.C85474d;
import com.p2082ss.android.vesdk.faceinfo.C85475e;
import com.p2082ss.android.vesdk.faceinfo.VESkeleton;
import com.p2082ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.p2082ss.android.vesdk.p4387c.AbstractC85401a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.b */
public final class C31194b implements AbstractC31193a {

    /* renamed from: a */
    public final List<AbstractC31263c> f74777a = new ArrayList();

    /* renamed from: b */
    public final List<MessageCenter.Listener> f74778b = new ArrayList();

    /* renamed from: c */
    public final C85346av f74779c;

    /* renamed from: e */
    private volatile boolean f74780e;

    /* renamed from: f */
    private final C31196a f74781f = new C31196a(this);

    /* renamed from: g */
    private final AbstractC89244h f74782g;

    static {
        Covode.recordClassIndex(37839);
    }

    /* renamed from: g */
    private final C31209d m64770g() {
        return (C31209d) this.f74782g.getValue();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: d */
    public final void mo56809d() {
        this.f74780e = false;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56784a(String str, float f) {
        this.f74779c.mo130705a(str, f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56786a(String str, String str2, float f, float f2, float f3) {
        this.f74779c.mo130757a(str, str2, f, f2, f3);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56770a(int i, String str) {
        C89219l.m154721d(str, "");
        this.f74779c.mo130695a(i, str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56764a(float f, float f2) {
        this.f74779c.mo130689a(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56763a(float f) {
        this.f74779c.mo130691a(1, f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56783a(String str) {
        this.f74779c.mo130704a(str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56773a(Context context, String str, String str2, String str3) {
        this.f74779c.mo130759a(str, str2, str3);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56772a(Context context, String str, String str2) {
        this.f74779c.mo130756a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56788a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f74779c.mo130711a(z, z2, z3, z4);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56789a(double[] dArr, double d) {
        C89219l.m154721d(dArr, "");
        this.f74779c.mo130712a(dArr, d);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56767a(int i, float f, float f2, int i2) {
        this.f74779c.mo130692a(i, f, f2, i2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56765a(float f, float f2, float f3, float f4, float f5) {
        this.f74779c.mo130690a(f, f2, f3, f4, f5);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56785a(String str, int i, int i2, String str2) {
        C89219l.m154721d(str2, "");
        this.f74779c.mo130774b(str, i, i2, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56787a(boolean z) {
        this.f74779c.mo130813j(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56776a(RecordInvoker.OnARTextCountCallback onARTextCountCallback) {
        C89219l.m154721d(onARTextCountCallback, "");
        this.f74779c.mo130700a(new C31200e(onARTextCountCallback));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56775a(RecordInvoker.OnARTextContentCallback onARTextContentCallback) {
        C89219l.m154721d(onARTextContentCallback, "");
        this.f74779c.mo130772b(new C31201f(onARTextContentCallback));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56802b(boolean z) {
        this.f74779c.mo130816k(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56766a(int i) {
        this.f74779c.mo130777b(i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56771a(Context context) {
        C89219l.m154721d(context, "");
        this.f74779c.mo130818l(true);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56777a(RecordInvoker.OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C89219l.m154721d(onCherEffectParmaCallback, "");
        this.f74779c.mo130746a(new C31198c(onCherEffectParmaCallback));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56790a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f74779c.mo130736a(new VECherEffectParam(strArr, dArr, zArr));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56779a(AbstractC31263c cVar) {
        C89219l.m154721d(cVar, "");
        this.f74777a.add(cVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56778a(AbstractC31262b bVar) {
        C89219l.m154721d(bVar, "");
        this.f74779c.mo130748a(new C31199d(bVar));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56769a(int i, long j, long j2, String str) {
        C89219l.m154721d(str, "");
        this.f74779c.mo130728a(i, j, j2, str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56774a(MessageCenter.Listener listener) {
        MethodCollector.m26663i(4991);
        C89219l.m154721d(listener, "");
        synchronized (this.f74778b) {
            try {
                if (!this.f74778b.contains(listener)) {
                    this.f74778b.add(listener);
                }
                if (!this.f74780e && (!this.f74778b.isEmpty())) {
                    this.f74780e = true;
                    this.f74779c.mo130733a(this.f74781f);
                }
            } finally {
                MethodCollector.m26664o(4991);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56781a(AbstractC85313aj ajVar) {
        C89219l.m154721d(ajVar, "");
        this.f74779c.mo130742a(ajVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: a */
    public final void mo56821a(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        m64770g().mo56821a(list, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: a */
    public final void mo56822a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        m64770g().mo56822a(list, list2, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: b */
    public final void mo56823b(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        m64770g().mo56823b(list, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: a */
    public final void mo56820a(List<ComposerInfo> list) {
        C89219l.m154721d(list, "");
        m64770g().mo56820a(list);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56782a(C85346av.AbstractC85356b bVar, int i) {
        this.f74779c.mo130744a(bVar, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56768a(int i, int i2, C85346av.AbstractC85358d dVar) {
        this.f74779c.mo130727a(i, i2, dVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final boolean mo56791a(C85392bf bfVar, int i) {
        C89219l.m154721d(bfVar, "");
        return this.f74779c.mo130766a(bfVar, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56780a(VEARCoreParam vEARCoreParam) {
        C89219l.m154721d(vEARCoreParam, "");
        AbstractC85401a I = this.f74779c.mo130685I();
        if (I != null) {
            I.mo130892a(vEARCoreParam);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56795b() {
        this.f74779c.mo130825p();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final AbstractC30029f mo56803c() {
        return this.f74779c.mo130684H();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: f */
    public final void mo56827f() {
        m64770g().mo56827f();
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.b$b */
    static final class C31197b extends AbstractC89220m implements AbstractC89171a<C31209d> {

        /* renamed from: a */
        final /* synthetic */ C31194b f74785a;

        static {
            Covode.recordClassIndex(37842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31197b(C31194b bVar) {
            super(0);
            this.f74785a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31209d invoke() {
            return new C31209d(this.f74785a.f74779c);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: e */
    public final AbstractC31208c mo56826e() {
        return m64770g().mo56826e();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56760a() {
        this.f74779c.mo130818l(false);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.b$a */
    public static final class C31196a implements MessageCenter.Listener {

        /* renamed from: a */
        final /* synthetic */ C31194b f74784a;

        static {
            Covode.recordClassIndex(37841);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31196a(C31194b bVar) {
            this.f74784a = bVar;
        }

        @Override // com.bef.effectsdk.message.MessageCenter.Listener
        public final void onMessageReceived(int i, int i2, int i3, String str) {
            if (!this.f74784a.f74778b.isEmpty()) {
                for (MessageCenter.Listener listener : new ArrayList(this.f74784a.f74778b)) {
                    listener.onMessageReceived(i, i2, i3, str);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.b$e */
    public static final class C31200e implements C85346av.AbstractC85362h {

        /* renamed from: a */
        final /* synthetic */ RecordInvoker.OnARTextCountCallback f74788a;

        static {
            Covode.recordClassIndex(37845);
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85362h
        /* renamed from: a */
        public final void mo56833a(String[] strArr) {
        }

        C31200e(RecordInvoker.OnARTextCountCallback onARTextCountCallback) {
            this.f74788a = onARTextCountCallback;
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85362h
        /* renamed from: a */
        public final void mo56832a(int i) {
            this.f74788a.onResult(i);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.b$f */
    public static final class C31201f implements C85346av.AbstractC85362h {

        /* renamed from: a */
        final /* synthetic */ RecordInvoker.OnARTextContentCallback f74789a;

        static {
            Covode.recordClassIndex(37846);
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85362h
        /* renamed from: a */
        public final void mo56832a(int i) {
        }

        C31201f(RecordInvoker.OnARTextContentCallback onARTextContentCallback) {
            this.f74789a = onARTextContentCallback;
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85362h
        /* renamed from: a */
        public final void mo56833a(String[] strArr) {
            this.f74789a.onResult(strArr);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: g */
    public final void mo56818g(boolean z) {
        this.f74779c.mo130820m(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: h */
    public final void mo56819h(boolean z) {
        this.f74779c.mo130826p(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: i */
    public final void mo56828i(boolean z) {
        m64770g().mo56828i(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56754a(Bitmap bitmap) {
        return this.f74779c.mo130696a(bitmap);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final float mo56792b(String str) {
        C89219l.m154721d(str, "");
        return this.f74779c.mo130768b(str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: d */
    public final void mo56811d(String str) {
        this.f74779c.mo130799d(str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56755a(VEEffectFilterParam vEEffectFilterParam) {
        C89219l.m154721d(vEEffectFilterParam, "");
        return this.f74779c.mo130701a(vEEffectFilterParam);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: e */
    public final VEFrame mo56813e(String str) {
        C85346av.C85357c cVar = new C85346av.C85357c();
        cVar.f191093b = str;
        cVar.f191092a = 1;
        return this.f74779c.mo130718a(cVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: f */
    public final void mo56817f(boolean z) {
        this.f74779c.mo130822n(z);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.b$d */
    static final class C31199d implements C85346av.AbstractC85374s {

        /* renamed from: a */
        final /* synthetic */ AbstractC31262b f74787a;

        static {
            Covode.recordClassIndex(37844);
        }

        C31199d(AbstractC31262b bVar) {
            this.f74787a = bVar;
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85374s
        /* renamed from: a */
        public final void mo56831a(C85475e eVar) {
            VESkeleton[] vESkeletonArr;
            C31261a[] aVarArr = null;
            if (!(eVar == null || (vESkeletonArr = eVar.f191450a) == null)) {
                if (vESkeletonArr.length != 0) {
                    int length = vESkeletonArr.length;
                    aVarArr = new C31261a[length];
                    for (int i = 0; i < length; i++) {
                        VESkeleton vESkeleton = vESkeletonArr[i];
                        C89219l.m154716b(vESkeleton, "");
                        aVarArr[i] = new C31261a(vESkeleton.getID());
                    }
                }
            }
            this.f74787a.mo22671a(aVarArr);
        }
    }

    public C31194b(C85346av avVar) {
        C89219l.m154721d(avVar, "");
        this.f74779c = avVar;
        avVar.mo130747a(new C85346av.AbstractC85369n(this) {
            /* class com.p2082ss.android.ugc.asve.recorder.effect.C31194b.C311951 */

            /* renamed from: a */
            final /* synthetic */ C31194b f74783a;

            static {
                Covode.recordClassIndex(37840);
            }

            {
                this.f74783a = r1;
            }

            @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85369n
            /* renamed from: a */
            public final void mo56829a(C85471b bVar, C85474d dVar) {
                ASSimpleFaceInfo[] aSSimpleFaceInfoArr;
                for (AbstractC31263c cVar : C89070n.m154590j(this.f74783a.f74777a)) {
                    if (bVar != null) {
                        C89219l.m154721d(bVar, "");
                        ArrayList arrayList = new ArrayList();
                        C85470a[] aVarArr = bVar.f191426a;
                        C89219l.m154716b(aVarArr, "");
                        for (C85470a aVar : aVarArr) {
                            C89219l.m154716b(aVar, "");
                            C89219l.m154721d(aVar, "");
                            arrayList.add(new ASSimpleFaceInfo(aVar.f191406b));
                        }
                        Object[] array = arrayList.toArray(new ASSimpleFaceInfo[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        aSSimpleFaceInfoArr = (ASSimpleFaceInfo[]) array;
                    } else {
                        aSSimpleFaceInfoArr = null;
                    }
                    if (dVar != null) {
                        C0000a.m0a(dVar);
                    }
                    cVar.mo22700a(aSSimpleFaceInfoArr);
                }
            }
        });
        this.f74782g = C89250i.m154773a((AbstractC89171a) new C31197b(this));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final void mo56806c(String str) {
        C89219l.m154721d(str, "");
        this.f74779c.mo130787c(str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: d */
    public final void mo56812d(boolean z) {
        this.f74779c.mo130812i(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: e */
    public final void mo56815e(boolean z) {
        this.f74779c.mo130804e(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final void mo56807c(boolean z) {
        this.f74779c.mo130810h(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56798b(int i) {
        this.f74779c.mo130788c(i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56799b(MessageCenter.Listener listener) {
        MethodCollector.m26663i(4996);
        C89219l.m154721d(listener, "");
        synchronized (this.f74778b) {
            try {
                this.f74778b.remove(listener);
                if (this.f74780e && this.f74778b.isEmpty()) {
                    this.f74779c.mo130733a((MessageCenter.Listener) null);
                    this.f74780e = false;
                }
            } finally {
                MethodCollector.m26664o(4996);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56761a(double d) {
        this.f74779c.mo130720a(d);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56800b(AbstractC85313aj ajVar) {
        C89219l.m154721d(ajVar, "");
        this.f74779c.mo130780b(ajVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56753a(int i, float f) {
        return this.f74779c.mo130691a(i, f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: d */
    public final void mo56810d(float f, float f2) {
        this.f74779c.mo130794d(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: e */
    public final void mo56814e(float f, float f2) {
        this.f74779c.mo130802e(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: f */
    public final void mo56816f(float f, float f2) {
        this.f74779c.mo130805f(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final void mo56805c(float f, float f2) {
        this.f74779c.mo130770b(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: d */
    public final void mo56825d(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        m64770g().mo56825d(list, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final int mo56794b(String[] strArr, int i) {
        C89219l.m154721d(strArr, "");
        return this.f74779c.mo130775b(strArr, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56757a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f74779c.mo130798d(str, str2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: c */
    public final void mo56824c(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        m64770g().mo56824c(list, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56797b(float f, float f2) {
        this.f74779c.mo130785c(f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56759a(String[] strArr, int i) {
        C89219l.m154721d(strArr, "");
        return this.f74779c.mo130714a(strArr, i);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final int[] mo56808c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int[] c = this.f74779c.mo130792c(str, str2);
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56801b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f74779c.mo130781b(str, str2);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.b$c */
    static final class C31198c implements C85346av.AbstractC85367l {

        /* renamed from: a */
        final /* synthetic */ RecordInvoker.OnCherEffectParmaCallback f74786a;

        static {
            Covode.recordClassIndex(37843);
        }

        C31198c(RecordInvoker.OnCherEffectParmaCallback onCherEffectParmaCallback) {
            this.f74786a = onCherEffectParmaCallback;
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85367l
        /* renamed from: a */
        public final void mo56830a(String[] strArr, double[] dArr, boolean[] zArr) {
            this.f74786a.onCherEffect(strArr, dArr, zArr);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final int mo56793b(String str, float f, float f2) {
        C89219l.m154721d(str, "");
        return this.f74779c.mo130773b(str, f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56756a(String str, float f, float f2) {
        C89219l.m154721d(str, "");
        return this.f74779c.mo130706a(str, f, f2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final int mo56758a(String str, String str2, float f) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f74779c.mo130709a(str, str2, f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: c */
    public final void mo56804c(double d, double d2, double d3, double d4) {
        this.f74779c.mo130784c(d, d2, d3, d4);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: b */
    public final void mo56796b(double d, double d2, double d3, double d4) {
        this.f74779c.mo130769b(d, d2, d3, d4);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a
    /* renamed from: a */
    public final void mo56762a(double d, double d2, double d3, double d4) {
        this.f74779c.mo130688a(d, d2, d3, d4);
    }
}

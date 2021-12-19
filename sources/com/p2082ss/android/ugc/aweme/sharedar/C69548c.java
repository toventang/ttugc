package com.p2082ss.android.ugc.aweme.sharedar;

import android.util.Log;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.sharedar.p3777a.C69512a;
import com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89582cd;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharedar.c */
public final class C69548c implements AbstractC69547b {

    /* renamed from: j */
    public static final C69549a f155360j = new C69549a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f155361a = C89250i.m154773a((AbstractC89171a) new C69550b(this));

    /* renamed from: b */
    final AbstractC89244h f155362b = C89250i.m154773a((AbstractC89171a) C69557c.f155379a);

    /* renamed from: c */
    final AbstractC89244h f155363c = C89250i.m154773a((AbstractC89171a) C69560e.f155381a);

    /* renamed from: d */
    final AbstractC89244h f155364d = C89250i.m154773a((AbstractC89171a) new C69559d(this));

    /* renamed from: e */
    public final C1213t<Integer> f155365e = new C1213t<>();

    /* renamed from: f */
    public final C1213t<Boolean> f155366f = new C1213t<>();

    /* renamed from: g */
    public final ActivityC0945e f155367g;

    /* renamed from: h */
    public final AbstractC14177d f155368h;

    /* renamed from: i */
    public final AbstractC14193m f155369i;

    /* renamed from: k */
    private Effect f155370k;

    /* renamed from: l */
    private final AbstractC89244h f155371l = C89250i.m154773a((AbstractC89171a) new C69561f(this));

    static {
        Covode.recordClassIndex(81890);
    }

    /* renamed from: c */
    public final C69563d mo109789c() {
        return (C69563d) this.f155371l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.c$a */
    public static final class C69549a {
        static {
            Covode.recordClassIndex(81891);
        }

        private C69549a() {
        }

        public /* synthetic */ C69549a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.AbstractC69547b
    /* renamed from: b */
    public final LiveData<Boolean> mo109787b() {
        return this.f155366f;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.c$c */
    static final class C69557c extends AbstractC89220m implements AbstractC89171a<CoroutineExceptionHandler> {

        /* renamed from: a */
        public static final C69557c f155379a = new C69557c();

        static {
            Covode.recordClassIndex(81899);
        }

        C69557c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CoroutineExceptionHandler invoke() {
            return new C69558a(CoroutineExceptionHandler.f203145c);
        }

        /* renamed from: com.ss.android.ugc.aweme.sharedar.c$c$a */
        public static final class C69558a extends AbstractC89097a implements CoroutineExceptionHandler {
            static {
                Covode.recordClassIndex(81900);
            }

            public C69558a(AbstractC89127f.AbstractC89132c cVar) {
                super(cVar);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            public final void handleException(AbstractC89127f fVar, Throwable th) {
                StringBuilder sb = new StringBuilder("Thread[");
                Thread currentThread = Thread.currentThread();
                C89219l.m154716b(currentThread, "");
                C84911q.m145922a("SharedAR", sb.append(currentThread.getName()).append("], exception: ").append(Log.getStackTraceString(th)).toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.c$e */
    static final class C69560e extends AbstractC89220m implements AbstractC89171a<AbstractC89703z> {

        /* renamed from: a */
        public static final C69560e f155381a = new C69560e();

        static {
            Covode.recordClassIndex(81902);
        }

        C69560e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC89703z invoke() {
            return C89582cd.m155517a(null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.AbstractC69547b
    /* renamed from: a */
    public final void mo109783a() {
        mo109789c().mo109791a(16385, 10, 0, null);
    }

    /* renamed from: d */
    public final Effect mo109790d() {
        Effect effect = this.f155370k;
        if (effect == null) {
            C89219l.m154710a("effect");
        }
        return effect;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.c$f */
    static final class C69561f extends AbstractC89220m implements AbstractC89171a<C69563d> {

        /* renamed from: a */
        final /* synthetic */ C69548c f155382a;

        static {
            Covode.recordClassIndex(81903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69561f(C69548c cVar) {
            super(0);
            this.f155382a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C69563d invoke() {
            return new C69563d((C21582f) this.f155382a.f155361a.getValue(), this.f155382a.f155368h, new AbstractC89171a<Boolean>(this) {
                /* class com.p2082ss.android.ugc.aweme.sharedar.C69548c.C69561f.C695621 */

                /* renamed from: a */
                final /* synthetic */ C69561f f155383a;

                static {
                    Covode.recordClassIndex(81904);
                }

                {
                    this.f155383a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ Boolean invoke() {
                    boolean z;
                    AbstractC1174ac a = C1181ae.m3881a(this.f155383a.f155382a.f155367g, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
                    C89219l.m154716b(a, "");
                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
                    if (shortVideoContext != null) {
                        z = shortVideoContext.mo110018b();
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b */
    static final class C69550b extends AbstractC89220m implements AbstractC89171a<C21582f> {

        /* renamed from: a */
        final /* synthetic */ C69548c f155372a;

        static {
            Covode.recordClassIndex(81892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69550b(C69548c cVar) {
            super(0);
            this.f155372a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C21582f invoke() {
            C69512a aVar = new C69512a();
            C695511 r2 = new AbstractC89172b<C21597n, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.sharedar.C69548c.C69550b.C695511 */

                /* renamed from: a */
                final /* synthetic */ C69550b f155373a;

                static {
                    Covode.recordClassIndex(81893);
                }

                {
                    this.f155373a = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b$1$a */
                public static final class C69552a extends AbstractC21603p<ActivityC0945e> {

                    /* renamed from: a */
                    final /* synthetic */ C695511 f155374a;

                    static {
                        Covode.recordClassIndex(81894);
                    }

                    public C69552a(C695511 r1) {
                        this.f155374a = r1;
                    }

                    @Override // com.bytedance.p1559o.AbstractC21603p
                    public final ActivityC0945e get(C21582f fVar) {
                        C89219l.m154721d(fVar, "");
                        return this.f155374a.f155373a.f155372a.f155367g;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b$1$b */
                public static final class C69553b extends AbstractC21603p<AbstractC14177d> {

                    /* renamed from: a */
                    final /* synthetic */ C695511 f155375a;

                    static {
                        Covode.recordClassIndex(81895);
                    }

                    public C69553b(C695511 r1) {
                        this.f155375a = r1;
                    }

                    @Override // com.bytedance.p1559o.AbstractC21603p
                    public final AbstractC14177d get(C21582f fVar) {
                        C89219l.m154721d(fVar, "");
                        return this.f155375a.f155373a.f155372a.f155368h;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b$1$c */
                public static final class C69554c extends AbstractC21603p<AbstractC14193m> {

                    /* renamed from: a */
                    final /* synthetic */ C695511 f155376a;

                    static {
                        Covode.recordClassIndex(81896);
                    }

                    public C69554c(C695511 r1) {
                        this.f155376a = r1;
                    }

                    @Override // com.bytedance.p1559o.AbstractC21603p
                    public final AbstractC14193m get(C21582f fVar) {
                        C89219l.m154721d(fVar, "");
                        return this.f155376a.f155373a.f155372a.f155369i;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b$1$d */
                public static final class C69555d extends AbstractC21603p<C69548c> {

                    /* renamed from: a */
                    final /* synthetic */ C695511 f155377a;

                    static {
                        Covode.recordClassIndex(81897);
                    }

                    public C69555d(C695511 r1) {
                        this.f155377a = r1;
                    }

                    @Override // com.bytedance.p1559o.AbstractC21603p
                    public final C69548c get(C21582f fVar) {
                        C89219l.m154721d(fVar, "");
                        return this.f155377a.f155373a.f155372a;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b$1$e */
                public static final class C69556e extends AbstractC21603p<AbstractC89516am> {

                    /* renamed from: a */
                    final /* synthetic */ C695511 f155378a;

                    static {
                        Covode.recordClassIndex(81898);
                    }

                    public C69556e(C695511 r1) {
                        this.f155378a = r1;
                    }

                    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.coroutines.am, java.lang.Object] */
                    /* JADX WARNING: Unknown variable types count: 1 */
                    @Override // com.bytedance.p1559o.AbstractC21603p
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final kotlinx.coroutines.AbstractC89516am get(com.bytedance.p1559o.C21582f r2) {
                        /*
                            r1 = this;
                            java.lang.String r0 = ""
                            p4600h.p4611f.p4613b.C89219l.m154721d(r2, r0)
                            com.ss.android.ugc.aweme.sharedar.c$b$1 r0 = r1.f155378a
                            com.ss.android.ugc.aweme.sharedar.c$b r0 = r0.f155373a
                            com.ss.android.ugc.aweme.sharedar.c r0 = r0.f155372a
                            h.h r0 = r0.f155364d
                            java.lang.Object r0 = r0.getValue()
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sharedar.C69548c.C69550b.C695511.C69556e.get(com.bytedance.o.f):java.lang.Object");
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C21597n nVar) {
                    C21597n nVar2 = nVar;
                    C89219l.m154721d(nVar2, "");
                    C89219l.m154716b(nVar2.mo35260a(ActivityC0945e.class, (String) null, (AbstractC21603p) new C69552a(this)), "");
                    C89219l.m154716b(nVar2.mo35260a(AbstractC14177d.class, (String) null, (AbstractC21603p) new C69553b(this)), "");
                    C89219l.m154716b(nVar2.mo35260a(AbstractC14193m.class, (String) null, (AbstractC21603p) new C69554c(this)), "");
                    C89219l.m154716b(nVar2.mo35260a(C69548c.class, (String) null, (AbstractC21603p) new C69555d(this)), "");
                    C89219l.m154716b(nVar2.mo35260a(AbstractC89516am.class, (String) null, (AbstractC21603p) new C69556e(this)), "");
                    return C89391z.f203057a;
                }
            };
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(r2, "");
            r2.invoke(aVar.mo109764a());
            C21582f a = aVar.mo109764a().mo35258a();
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.c$d */
    static final class C69559d extends AbstractC89220m implements AbstractC89171a<AbstractC89516am> {

        /* renamed from: a */
        final /* synthetic */ C69548c f155380a;

        static {
            Covode.recordClassIndex(81901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69559d(C69548c cVar) {
            super(0);
            this.f155380a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC89516am invoke() {
            return C89517an.m155448a(C31068c.f74429a.plus((AbstractC89703z) this.f155380a.f155363c.getValue()).plus((CoroutineExceptionHandler) this.f155380a.f155362b.getValue()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.AbstractC69547b
    /* renamed from: a */
    public final void mo109785a(Effect effect) {
        C89219l.m154721d(effect, "");
        this.f155370k = effect;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.AbstractC69547b
    /* renamed from: a */
    public final void mo109786a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session_url", str);
        jSONObject.put("invitee_name", str2);
        mo109789c().mo109791a(16385, 6, 0, jSONObject.toString());
    }

    public C69548c(ActivityC0945e eVar, AbstractC14177d dVar, AbstractC14193m mVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(mVar, "");
        this.f155367g = eVar;
        this.f155368h = dVar;
        this.f155369i = mVar;
    }

    /* renamed from: a */
    public final void mo109788a(int i, long j, long j2, String str) {
        mo109789c().mo109791a(i, j, j2, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.AbstractC69547b
    /* renamed from: a */
    public final void mo109784a(int i, int i2, int i3, String str) {
        C69563d c = mo109789c();
        long j = (long) i;
        long j2 = (long) i2;
        long j3 = (long) i3;
        if (c.f155387c.invoke().booleanValue()) {
            for (AbstractC69514a aVar : (List) c.f155385a.getValue()) {
                if (C69563d.m122769a(16385, j) && C69563d.m122769a(aVar.mo109765a(), j2)) {
                    C84911q.m145922a("SharedAR", "[Effect --> Client]: msgID(" + j + "), arg1(" + j2 + "), arg2(" + j3 + "), arg3(" + str + "), match handler=" + aVar.getClass().getSimpleName());
                    aVar.mo109766a((int) j, j3, str);
                }
            }
        }
    }
}

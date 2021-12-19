package com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1716e.C23053d;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.sharedar.C69548c;
import com.p2082ss.android.ugc.aweme.sharedar.C69566e;
import com.p2082ss.android.ugc.aweme.sharedar.C69569h;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89671m;
import kotlinx.coroutines.C89672n;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b */
public final class C69517b extends AbstractC69514a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f155299b = {new C89232y(C69517b.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C89232y(C69517b.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0), new C89232y(C69517b.class, "coroutineScope", "getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;", 0)};

    /* renamed from: d */
    public static final C69518a f155300d = new C69518a((byte) 0);

    /* renamed from: c */
    final AbstractC89244h f155301c = C89250i.m154773a((AbstractC89171a) C69519b.f155308a);

    /* renamed from: e */
    private final AbstractC89248d f155302e = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);

    /* renamed from: f */
    private final AbstractC89248d f155303f = C21572a.m40504a(getDiContainer(), C69548c.class);

    /* renamed from: g */
    private final AbstractC89248d f155304g = C21572a.m40504a(getDiContainer(), AbstractC89516am.class);

    /* renamed from: h */
    private final AbstractC89244h f155305h = C89250i.m154773a((AbstractC89171a) C69524e.f155319a);

    /* renamed from: i */
    private int f155306i;

    /* renamed from: j */
    private C89386u<String, String, String> f155307j;

    static {
        Covode.recordClassIndex(81859);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    public final long mo109765a() {
        return 12;
    }

    /* renamed from: b */
    public final ActivityC0945e mo109771b() {
        return (ActivityC0945e) this.f155302e.mo23374a(this, f155299b[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C69548c mo109772c() {
        return (C69548c) this.f155303f.mo23374a(this, f155299b[1]);
    }

    /* renamed from: d */
    public final C69569h mo109773d() {
        return (C69569h) this.f155305h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b$a */
    public static final class C69518a {
        static {
            Covode.recordClassIndex(81860);
        }

        private C69518a() {
        }

        public /* synthetic */ C69518a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b$e */
    static final class C69524e extends AbstractC89220m implements AbstractC89171a<C69569h> {

        /* renamed from: a */
        public static final C69524e f155319a = new C69524e();

        static {
            Covode.recordClassIndex(81866);
        }

        C69524e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C69569h invoke() {
            return new C69569h();
        }
    }

    /* renamed from: e */
    public final ShortVideoContext mo109774e() {
        AbstractC1174ac a = C1181ae.m3881a(mo109771b(), (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
        C89219l.m154716b(shortVideoContext, "");
        return shortVideoContext;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b$b */
    static final class C69519b extends AbstractC89220m implements AbstractC89171a<File> {

        /* renamed from: a */
        public static final C69519b f155308a = new C69519b();

        static {
            Covode.recordClassIndex(81861);
        }

        C69519b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ File invoke() {
            File a = C63244g.m114602a().mo73279g().mo69470c().mo69474a(C63244g.m114602a().mo73279g().mo69470c().mo69481g(C63244g.m114602a().mo73279g().mo69470c().mo69478d("shared_ar")), "avatar");
            if (!a.exists() && !a.mkdirs()) {
                C84911q.m145926b("create shared ar effect avatar temp directory failed.");
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b$f */
    static final class C69525f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69517b f155320a;

        /* renamed from: b */
        final /* synthetic */ C89386u f155321b;

        static {
            Covode.recordClassIndex(81867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69525f(C69517b bVar, C89386u uVar) {
            super(0);
            this.f155320a = bVar;
            this.f155321b = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MethodCollector.m26663i(10892);
            String a = C69566e.m122773a(this.f155320a.mo109771b());
            C84911q.m145922a("SharedAR", "my carrier name: ".concat(String.valueOf(a)));
            SharedARModel sharedARModel = this.f155320a.mo109774e().f155756Q;
            if (sharedARModel != null) {
                sharedARModel.setSharedARTelco(a);
            }
            boolean z = this.f155320a.mo109773d().f155395a.getBoolean("shared_ar_dialog_shown", false);
            if (this.f155320a.mo109774e().mo110018b() && !z) {
                C23025b bVar = new C23025b(this.f155320a.mo109771b());
                bVar.mo37416a(R.string.fs3, C695261.f155322a);
                C23023b a2 = C23013a.C23015a.m43405a(this.f155320a.mo109771b());
                C69517b bVar2 = this.f155320a;
                ActivityC0945e b = bVar2.mo109771b();
                Object third = this.f155321b.getThird();
                View inflate = LayoutInflater.from(b).inflate(R.layout.f8, (ViewGroup) null);
                inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                File a3 = C63244g.m114602a().mo73279g().mo69470c().mo69474a(C63244g.m114602a().mo73279g().mo69470c().mo69481g(bVar2.mo109772c().mo109790d().getUnzipPath()), "/".concat(String.valueOf(third)));
                if (a3.exists()) {
                    C20766v a4 = C20761r.m39059a(a3);
                    a4.f49092E = (SmartImageView) inflate.findViewById(R.id.efi);
                    a4.mo34186c();
                }
                C89219l.m154716b(inflate, "");
                ((C23023b) C23053d.m43470a(a2, inflate).mo37411b((CharSequence) this.f155321b.getFirst()).mo37413d((CharSequence) this.f155321b.getSecond()).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
                this.f155320a.mo109773d().f155395a.storeBoolean("shared_ar_dialog_shown", true);
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(10892);
            return zVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b$c */
    public static final class C69520c<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89671m f155309a;

        static {
            Covode.recordClassIndex(81862);
        }

        C69520c(AbstractC89671m mVar) {
            this.f155309a = mVar;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            this.f155309a.resumeWith(C89379q.m157068constructorimpl(obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b$d */
    public static final class C69521d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f155310a;

        /* renamed from: b */
        Object f155311b;

        /* renamed from: c */
        int f155312c;

        /* renamed from: d */
        final /* synthetic */ C69517b f155313d;

        static {
            Covode.recordClassIndex(81863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69521d(C69517b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f155313d = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C69521d(this.f155313d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C69521d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b$d$b */
        public static final class C69523b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Boolean>, Object> {

            /* renamed from: a */
            int f155316a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f155317b;

            /* renamed from: c */
            final /* synthetic */ File f155318c;

            static {
                Covode.recordClassIndex(81865);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69523b(Bitmap bitmap, File file, AbstractC89124d dVar) {
                super(2, dVar);
                this.f155317b = bitmap;
                this.f155318c = file;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C69523b(this.f155317b, this.f155318c, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Boolean> dVar) {
                return ((C69523b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f155316a == 0) {
                    C89382r.m154942a(obj);
                    return Boolean.valueOf(C84891c.m145848a(this.f155317b, this.f155318c, 80, Bitmap.CompressFormat.JPEG));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b$d$a */
        public static final class C69522a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Bitmap>, Object> {

            /* renamed from: a */
            int f155314a;

            /* renamed from: b */
            final /* synthetic */ C69521d f155315b;

            static {
                Covode.recordClassIndex(81864);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69522a(C69521d dVar, AbstractC89124d dVar2) {
                super(2, dVar2);
                this.f155315b = dVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C69522a(this.f155315b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Bitmap> dVar) {
                return ((C69522a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f155314a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    this.f155314a = 1;
                    C89672n nVar = new C89672n(C89099b.m154605a(this), 1);
                    AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
                    if (e == null) {
                        nVar.resumeWith(C89379q.m157068constructorimpl(null));
                    } else {
                        C84402a.m145176a(e.mo58663f(), 0, 0, new C69520c(nVar));
                    }
                    obj = nVar.mo144218e();
                    if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                        C89219l.m154721d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C89382r.m154942a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00de  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 250
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69517b.C69521d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69517b(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    /* renamed from: a */
    public final void mo109770a(String str, File file) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("filepath", file.getPath());
        jSONObject.put("username", str);
        mo109772c().mo109788a(16385, 11L, 0L, jSONObject.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    @Override // com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109766a(int r11, long r12, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69517b.mo109766a(int, long, java.lang.String):void");
    }
}

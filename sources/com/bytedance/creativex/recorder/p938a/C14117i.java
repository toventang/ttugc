package com.bytedance.creativex.recorder.p938a;

import android.content.Context;
import android.os.Bundle;
import androidx.core.p030b.C0622a;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.C14216f;
import com.bytedance.creativex.recorder.filter.p942a.C14219i;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14100b;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14104f;
import com.bytedance.creativex.recorder.p938a.p939a.C14102d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14206w;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.wrap.ASSimpleFaceInfo;
import com.p2082ss.android.ugc.asve.wrap.AbstractC31263c;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77852b;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77856b;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77901a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77927h;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77959j;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77962k;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77971n;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4096h.C77978b;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.C78044a;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.creativex.recorder.a.i */
public final class C14117i extends AbstractC2562j<AbstractC14099a> implements AbstractC14099a, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f34322a = {new C89232y(C14117i.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C14117i.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C14117i.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0)};

    /* renamed from: l */
    public static final C14118a f34323l = new C14118a((byte) 0);

    /* renamed from: A */
    private final AbstractC89171a<C89391z> f34324A;

    /* renamed from: b */
    public final AbstractC14099a f34325b;

    /* renamed from: c */
    public C78044a f34326c;

    /* renamed from: d */
    public final C14119b f34327d;

    /* renamed from: e */
    public boolean f34328e;

    /* renamed from: f */
    int f34329f;

    /* renamed from: g */
    boolean f34330g;

    /* renamed from: h */
    public final C2563k<AbstractC14100b> f34331h;

    /* renamed from: i */
    public final AbstractC89172b<Boolean, String> f34332i;

    /* renamed from: j */
    public final AbstractC14104f f34333j;

    /* renamed from: k */
    public final AbstractC84903j f34334k;

    /* renamed from: m */
    private final AbstractC89248d f34335m;

    /* renamed from: n */
    private final AbstractC89248d f34336n;

    /* renamed from: o */
    private final AbstractC89248d f34337o;

    /* renamed from: p */
    private boolean f34338p;

    /* renamed from: q */
    private AbstractC14095a f34339q;

    /* renamed from: r */
    private AbstractC78054d f34340r;

    /* renamed from: s */
    private final C77971n<BeautyComposerInfo> f34341s;

    /* renamed from: t */
    private final C1213t<Boolean> f34342t;

    /* renamed from: u */
    private boolean f34343u;

    /* renamed from: v */
    private String f34344v;

    /* renamed from: w */
    private int f34345w;

    /* renamed from: x */
    private final C21582f f34346x;

    /* renamed from: y */
    private final boolean f34347y = true;

    /* renamed from: z */
    private final AbstractC89171a<AbstractC84398d> f34348z;

    static {
        Covode.recordClassIndex(16186);
    }

    /* renamed from: p */
    private final AbstractC14193m m25716p() {
        return (AbstractC14193m) this.f34336n.mo23374a(this, f34322a[1]);
    }

    /* renamed from: a */
    public final AbstractC14177d mo22672a() {
        return (AbstractC14177d) this.f34335m.mo23374a(this, f34322a[0]);
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$a */
    public static final class C14118a {
        static {
            Covode.recordClassIndex(16187);
        }

        private C14118a() {
        }

        public /* synthetic */ C14118a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC14099a getApiComponent() {
        return this.f34325b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f34346x;
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2559g mo22658h() {
        return this.f34331h;
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$b */
    public static class C14119b {

        /* renamed from: a */
        public AbstractC89171a<Integer> f34349a = C14122c.f34373a;

        /* renamed from: b */
        public AbstractC89171a<String> f34350b = C14130k.f34381a;

        /* renamed from: c */
        public AbstractC89171a<String> f34351c = C14128i.f34379a;

        /* renamed from: d */
        public AbstractC89171a<Boolean> f34352d = C14127h.f34378a;

        /* renamed from: e */
        public AbstractC89171a<Boolean> f34353e = C14123d.f34374a;

        /* renamed from: f */
        public AbstractC89171a<Integer> f34354f = C14120a.f34371a;

        /* renamed from: g */
        public AbstractC89171a<Integer> f34355g = C14125f.f34376a;

        /* renamed from: h */
        public AbstractC89171a<Boolean> f34356h = C14124e.f34375a;

        /* renamed from: i */
        public AbstractC89171a<Boolean> f34357i = C14134o.f34385a;

        /* renamed from: j */
        public AbstractC89171a<Boolean> f34358j = C14121b.f34372a;

        /* renamed from: k */
        public AbstractC89171a<Boolean> f34359k = C14132m.f34383a;

        /* renamed from: l */
        public AbstractC89171a<Float> f34360l = C14129j.f34380a;

        /* renamed from: m */
        public AbstractC89171a<Float> f34361m = C14131l.f34382a;

        /* renamed from: n */
        public AbstractC89172b<? super BeautyMetadata, ? extends Serializable> f34362n;

        /* renamed from: o */
        public AbstractC89171a<Float> f34363o = C14126g.f34377a;

        /* renamed from: p */
        public boolean f34364p;

        /* renamed from: q */
        public AbstractC89183m<? super Context, ? super String, C89391z> f34365q;

        /* renamed from: r */
        public AbstractC89171a<Boolean> f34366r = C14133n.f34384a;

        /* renamed from: s */
        public boolean f34367s;

        /* renamed from: t */
        public boolean f34368t = true;

        /* renamed from: u */
        public AbstractC78055e f34369u = new C77962k("");

        /* renamed from: v */
        public boolean f34370v;

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$i */
        static final class C14128i extends AbstractC89220m implements AbstractC89171a<String> {

            /* renamed from: a */
            public static final C14128i f34379a = new C14128i();

            static {
                Covode.recordClassIndex(16197);
            }

            C14128i() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ String invoke() {
                return "";
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$k */
        static final class C14130k extends AbstractC89220m implements AbstractC89171a<String> {

            /* renamed from: a */
            public static final C14130k f34381a = new C14130k();

            static {
                Covode.recordClassIndex(16199);
            }

            C14130k() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ String invoke() {
                return "";
            }
        }

        static {
            Covode.recordClassIndex(16188);
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$a */
        static final class C14120a extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            public static final C14120a f34371a = new C14120a();

            static {
                Covode.recordClassIndex(16189);
            }

            C14120a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return 0;
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$b */
        static final class C14121b extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C14121b f34372a = new C14121b();

            static {
                Covode.recordClassIndex(16190);
            }

            C14121b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$c */
        static final class C14122c extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            public static final C14122c f34373a = new C14122c();

            static {
                Covode.recordClassIndex(16191);
            }

            C14122c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return 0;
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$d */
        static final class C14123d extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C14123d f34374a = new C14123d();

            static {
                Covode.recordClassIndex(16192);
            }

            C14123d() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$e */
        static final class C14124e extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C14124e f34375a = new C14124e();

            static {
                Covode.recordClassIndex(16193);
            }

            C14124e() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return true;
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$f */
        static final class C14125f extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            public static final C14125f f34376a = new C14125f();

            static {
                Covode.recordClassIndex(16194);
            }

            C14125f() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return 0;
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$g */
        static final class C14126g extends AbstractC89220m implements AbstractC89171a<Float> {

            /* renamed from: a */
            public static final C14126g f34377a = new C14126g();

            static {
                Covode.recordClassIndex(16195);
            }

            C14126g() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Float invoke() {
                return Float.valueOf(0.8f);
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$h */
        static final class C14127h extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C14127h f34378a = new C14127h();

            static {
                Covode.recordClassIndex(16196);
            }

            C14127h() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$j */
        static final class C14129j extends AbstractC89220m implements AbstractC89171a<Float> {

            /* renamed from: a */
            public static final C14129j f34380a = new C14129j();

            static {
                Covode.recordClassIndex(16198);
            }

            C14129j() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Float invoke() {
                return Float.valueOf(0.6f);
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$l */
        static final class C14131l extends AbstractC89220m implements AbstractC89171a<Float> {

            /* renamed from: a */
            public static final C14131l f34382a = new C14131l();

            static {
                Covode.recordClassIndex(16200);
            }

            C14131l() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Float invoke() {
                return Float.valueOf(0.8f);
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$m */
        static final class C14132m extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C14132m f34383a = new C14132m();

            static {
                Covode.recordClassIndex(16201);
            }

            C14132m() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return true;
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$n */
        static final class C14133n extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C14133n f34384a = new C14133n();

            static {
                Covode.recordClassIndex(16202);
            }

            C14133n() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$o */
        static final class C14134o extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C14134o f34385a = new C14134o();

            static {
                Covode.recordClassIndex(16203);
            }

            C14134o() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        /* renamed from: a */
        public final void mo22691a(AbstractC89171a<Boolean> aVar) {
            C89219l.m154721d(aVar, "");
            this.f34353e = aVar;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$e */
    static final class C14137e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34388a;

        static {
            Covode.recordClassIndex(16206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14137e(C14117i iVar) {
            super(0);
            this.f34388a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo22699a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo22699a() {
            C14117i.m25715a(this.f34388a).mo121766a(this.f34388a.f34332i.invoke(this.f34388a.f34327d.f34356h.invoke()), new C14135c());
        }
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: d */
    public final boolean mo22655d() {
        return this.f34327d.f34364p;
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: e */
    public final boolean mo22656e() {
        return this.f34327d.f34370v;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: h.f.a.m<? super android.content.Context, ? super java.lang.String, h.z>, h.f.a.m<android.content.Context, java.lang.String, h.z> */
    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: f */
    public final AbstractC89183m<Context, String, C89391z> mo22657f() {
        return this.f34327d.f34365q;
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: c */
    public final void mo22652c() {
        this.f34342t.setValue(true);
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: i */
    public final AbstractC77967m mo22659i() {
        C78044a aVar = this.f34326c;
        if (aVar == null) {
            C89219l.m154710a("beautyManager");
        }
        return aVar.f175093c;
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: j */
    public final void mo22660j() {
        C78044a aVar = this.f34326c;
        if (aVar == null) {
            C89219l.m154710a("beautyManager");
        }
        aVar.mo121770c();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: k */
    public final int mo22686k() {
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        return dVar.mo22686k();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: l */
    public final int mo22687l() {
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        return dVar.mo22687l();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: m */
    public final int mo22688m() {
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        return dVar.mo22688m();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: n */
    public final int mo22689n() {
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        return dVar.mo22689n();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: o */
    public final void mo22690o() {
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        dVar.mo22690o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.a.i$o */
    public static final class C14149o extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34400a;

        /* renamed from: b */
        final /* synthetic */ EnumC77817a f34401b;

        static {
            Covode.recordClassIndex(16218);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14149o(C14117i iVar, EnumC77817a aVar) {
            super(0);
            this.f34400a = iVar;
            this.f34401b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C14117i iVar = this.f34400a;
            EnumC77817a aVar = this.f34401b;
            C89219l.m154721d(aVar, "");
            C78044a aVar2 = iVar.f34326c;
            if (aVar2 == null) {
                C89219l.m154710a("beautyManager");
            }
            aVar2.mo121767a(true, aVar);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        C41093a.m82765c("detachBeautyManager");
        C77901a.f174778c = null;
        C41093a.f96055a = null;
        C78044a aVar = this.f34326c;
        if (aVar == null) {
            C89219l.m154710a("beautyManager");
        }
        aVar.f175093c.mo121636t();
        super.onDestroy();
    }

    /* renamed from: b */
    public final void mo22678b() {
        Boolean a = mo22672a().mo22818g().mo7034a();
        Boolean value = this.f34342t.getValue();
        if (a != null && a.booleanValue() && value != null && value.booleanValue()) {
            AbstractC14095a aVar = this.f34339q;
            if (aVar == null) {
                C89219l.m154710a("beautyPresenter");
            }
            aVar.mo22645a(this);
        }
    }

    /* renamed from: g */
    public final BeautyMetadata mo22684g() {
        if (!this.f34327d.f34352d.invoke().booleanValue() || (this.f34345w != 0 && (this.f34327d.f34364p || this.f34345w != -1))) {
            AbstractC14095a aVar = this.f34339q;
            if (aVar == null) {
                C89219l.m154710a("beautyPresenter");
            }
            BeautyMetadata a = aVar.mo22643a();
            C89219l.m154716b(a, "");
            return a;
        }
        AbstractC14095a aVar2 = this.f34339q;
        if (aVar2 == null) {
            C89219l.m154710a("beautyPresenter");
        }
        BeautyMetadata a2 = aVar2.mo22643a();
        a2.setBeautyId("");
        a2.setBeautyName("");
        a2.setBeautyRes("");
        a2.setBeautyStrength("");
        a2.setBeautyValid("");
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        C2560h<FilterBean> curSelectedFilter;
        C2559g<C14219i> filterUpdateEvent;
        String str;
        super.onCreate();
        C41093a.f96055a = new C14136d(this);
        AbstractC89171a<C89391z> aVar = this.f34324A;
        if (aVar != null) {
            aVar.invoke();
        }
        BeautyFilterConfig beautyFilterConfig = new BeautyFilterConfig(this.f34327d.f34354f.invoke().intValue(), "", this.f34327d.f34356h.invoke().booleanValue());
        beautyFilterConfig.setPrimaryBeautyPanelEnable(this.f34327d.f34370v);
        beautyFilterConfig.setULike2ComposerTagValueConvert(true);
        beautyFilterConfig.setConvertKey(true);
        beautyFilterConfig.setItemShape(this.f34327d.f34355g.invoke().intValue());
        boolean booleanValue = this.f34327d.f34352d.invoke().booleanValue();
        C77856b bVar = new C77856b();
        bVar.f174665a = new C77959j(C2556g.m7474c(this), this.f34327d.f34354f.invoke().intValue(), this.f34327d.f34350b.invoke(), this.f34327d.f34351c.invoke(), booleanValue).f174896a;
        beautyFilterConfig.setDataConfig(bVar);
        AbstractC78055e eVar = this.f34327d.f34369u;
        if (!this.f34327d.f34353e.invoke().booleanValue()) {
            eVar.mo110216a(true);
        }
        AbstractC89171a<AbstractC84398d> aVar2 = this.f34348z;
        C89219l.m154721d("record", "");
        C89219l.m154721d(beautyFilterConfig, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar2, "");
        C78044a.C78045a aVar3 = new C78044a.C78045a();
        C89219l.m154721d("record", "");
        aVar3.f175097b = "record";
        C89219l.m154721d(beautyFilterConfig, "");
        aVar3.f175098c = beautyFilterConfig;
        C89219l.m154721d(eVar, "");
        aVar3.f175096a = eVar;
        C89219l.m154721d(aVar2, "");
        aVar3.f175100e = aVar2;
        C27910f a = C77978b.m136237a();
        C89219l.m154721d(a, "");
        aVar3.f175099d = a;
        AbstractC77967m.AbstractC77969b bVar2 = beautyFilterConfig.getDataConfig().f174666b;
        if (bVar2 != null) {
            C89219l.m154721d(bVar2, "");
            aVar3.f175101f = bVar2;
        }
        AbstractC78055e eVar2 = aVar3.f175096a;
        if (eVar2 == null) {
            if (C89219l.m154714a((Object) aVar3.f175097b, (Object) "record")) {
                str = "";
            } else {
                str = aVar3.f175097b;
            }
            eVar2 = new C77962k(str);
            aVar3.f175096a = eVar2;
        }
        BeautyFilterConfig beautyFilterConfig2 = aVar3.f175098c;
        if (beautyFilterConfig2 != null) {
            C27910f fVar = aVar3.f175099d;
            if (fVar != null) {
                AbstractC89171a<? extends AbstractC84398d> aVar4 = aVar3.f175100e;
                if (aVar4 != null) {
                    C89219l.m154721d(eVar2, "");
                    C89219l.m154721d(beautyFilterConfig2, "");
                    C89219l.m154721d(fVar, "");
                    C89219l.m154721d(aVar4, "");
                    C77927h hVar = new C77927h(eVar2, beautyFilterConfig2, fVar, aVar4);
                    hVar.mo121590a(aVar3.f175101f);
                    this.f34326c = new C78044a(aVar3.f175097b, hVar, eVar2);
                    new C14137e(this).mo22699a();
                    AbstractC31193a w = mo22672a().mo22835w();
                    C89219l.m154721d(w, "");
                    C14150j jVar = new C14150j(w);
                    AbstractC14210a aVar5 = (AbstractC14210a) this.f34337o.mo23374a(this, f34322a[2]);
                    C78044a aVar6 = this.f34326c;
                    if (aVar6 == null) {
                        C89219l.m154710a("beautyManager");
                    }
                    AbstractC84903j jVar2 = this.f34334k;
                    boolean z = this.f34327d.f34367s;
                    C89219l.m154721d(jVar, "");
                    C89219l.m154721d(aVar6, "");
                    C14154l lVar = new C14154l(jVar, aVar5, aVar6, jVar2, z);
                    this.f34339q = lVar;
                    AbstractC78054d dVar = lVar.f34286a;
                    C89219l.m154716b(dVar, "");
                    this.f34340r = dVar;
                    C78044a aVar7 = this.f34326c;
                    if (aVar7 == null) {
                        C89219l.m154710a("beautyManager");
                    }
                    C89219l.m154721d(aVar7, "");
                    C41093a.m82765c("attachBeautyManager");
                    C77901a.f174778c = aVar7;
                    mo22672a().mo22818g().mo7036a(this, new C14138f(this));
                    this.f34342t.observe(this, new C14139g(this));
                    mo22672a().mo22818g().mo7036a(this, new C14140h(this));
                    mo22672a().mo22821i().mo6997a(this, new C14142i(this));
                    m25716p().mo22905l().mo6997a(this, new C14143j(this));
                    mo22672a().mo22797ae().mo6997a(this, new C14144k(this));
                    m25716p().mo22902i().mo6997a(this, new C14146l(this));
                    AbstractC14210a aVar8 = (AbstractC14210a) getDiContainer().mo35254c(AbstractC14210a.class);
                    if (!(aVar8 == null || (filterUpdateEvent = aVar8.getFilterUpdateEvent()) == null)) {
                        filterUpdateEvent.mo6997a(this, new C14147m(this));
                    }
                    AbstractC14210a aVar9 = (AbstractC14210a) getDiContainer().mo35254c(AbstractC14210a.class);
                    if (aVar9 != null && (curSelectedFilter = aVar9.getCurSelectedFilter()) != null) {
                        curSelectedFilter.mo7036a(this, new C14148n(this));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("effectPlatformProvider must be set".toString());
            }
            throw new IllegalStateException("gson must be set".toString());
        }
        throw new IllegalStateException("beautyFilterConfig must be set".toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.a.i$c */
    public final class C14135c implements AbstractC78051c.AbstractC78052a {
        static {
            Covode.recordClassIndex(16204);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c.AbstractC78052a
        /* renamed from: a */
        public final void mo22692a(Exception exc) {
            C89219l.m154721d(exc, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c.AbstractC78052a
        /* renamed from: a */
        public final void mo22693a(List<BeautyCategory> list) {
            C89219l.m154721d(list, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C14135c() {
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$d */
    public static final class C14136d implements C41093a.AbstractC41094a {

        /* renamed from: a */
        final /* synthetic */ C14117i f34387a;

        static {
            Covode.recordClassIndex(16205);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14136d(C14117i iVar) {
            this.f34387a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a.AbstractC41094a
        /* renamed from: a */
        public final void mo22694a(String str, String str2) {
            this.f34387a.f34334k.mo123658a(str + ':' + str2);
        }

        @Override // com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a.AbstractC41094a
        /* renamed from: b */
        public final void mo22696b(String str, String str2) {
            this.f34387a.f34334k.mo123660b(str + ':' + str2);
        }

        @Override // com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a.AbstractC41094a
        /* renamed from: c */
        public final void mo22697c(String str, String str2) {
            this.f34387a.f34334k.mo123661c(str + ':' + str2);
        }

        @Override // com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a.AbstractC41094a
        /* renamed from: d */
        public final void mo22698d(String str, String str2) {
            this.f34387a.f34334k.mo123662d(str + ':' + str2);
        }

        @Override // com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a.AbstractC41094a
        /* renamed from: a */
        public final void mo22695a(String str, Throwable th) {
            this.f34387a.f34334k.mo123660b(str + ':' + th);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$g */
    static final class C14139g<T> implements AbstractC1214u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34390a;

        static {
            Covode.recordClassIndex(16208);
        }

        C14139g(C14117i iVar) {
            this.f34390a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Boolean bool) {
            this.f34390a.mo22678b();
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$i */
    static final class C14142i<T> implements AbstractC2565m<Integer> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34393a;

        static {
            Covode.recordClassIndex(16211);
        }

        C14142i(C14117i iVar) {
            this.f34393a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Integer num) {
            this.f34393a.mo22660j();
        }
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: a */
    public final void mo22651a(boolean z) {
        this.f34338p = true;
        mo22653c(z);
    }

    /* renamed from: a */
    public static final /* synthetic */ C78044a m25715a(C14117i iVar) {
        C78044a aVar = iVar.f34326c;
        if (aVar == null) {
            C89219l.m154710a("beautyManager");
        }
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: e */
    public final void mo22682e(boolean z) {
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        dVar.mo22682e(z);
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$f */
    static final class C14138f<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34389a;

        static {
            Covode.recordClassIndex(16207);
        }

        C14138f(C14117i iVar) {
            this.f34389a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            if (!C89219l.m154714a((Object) bool, (Object) false)) {
                this.f34389a.mo22678b();
            }
        }
    }

    /* renamed from: f */
    public final void mo22683f(boolean z) {
        if (this.f34343u != z) {
            this.f34343u = z;
            int i = this.f34345w;
            if (i != -1) {
                boolean z2 = true;
                if (i != 1) {
                    z2 = false;
                }
                mo22653c(z2);
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$h */
    static final class C14140h<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34391a;

        static {
            Covode.recordClassIndex(16209);
        }

        C14140h(C14117i iVar) {
            this.f34391a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            if (this.f34391a.f34327d.f34366r.invoke().booleanValue()) {
                this.f34391a.mo22672a().mo22747A().getEffectController().mo56779a(new AbstractC31263c(this) {
                    /* class com.bytedance.creativex.recorder.p938a.C14117i.C14140h.C141411 */

                    /* renamed from: a */
                    final /* synthetic */ C14140h f34392a;

                    static {
                        Covode.recordClassIndex(16210);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f34392a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.asve.wrap.AbstractC31263c
                    /* renamed from: a */
                    public final void mo22700a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
                        boolean z;
                        if (aSSimpleFaceInfoArr != null || this.f34392a.f34391a.mo22672a().mo22758L()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (this.f34392a.f34391a.f34328e != z) {
                            this.f34392a.f34391a.f34328e = z;
                            this.f34392a.f34391a.mo22672a().mo22748B().mo56552j().mo130828q(z);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$k */
    static final class C14144k<T> implements AbstractC2565m<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34395a;

        static {
            Covode.recordClassIndex(16213);
        }

        C14144k(C14117i iVar) {
            this.f34395a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C89391z zVar) {
            C78044a aVar = this.f34395a.f34326c;
            if (aVar == null) {
                C89219l.m154710a("beautyManager");
            }
            if (aVar.f175091a && aVar.f175094d.mo121655c() < 3) {
                this.f34395a.mo22672a().mo22747A().getEffectController().mo56779a(new AbstractC31263c(this) {
                    /* class com.bytedance.creativex.recorder.p938a.C14117i.C14144k.C141451 */

                    /* renamed from: a */
                    final /* synthetic */ C14144k f34396a;

                    static {
                        Covode.recordClassIndex(16214);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f34396a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.asve.wrap.AbstractC31263c
                    /* renamed from: a */
                    public final void mo22700a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
                        Float invoke;
                        if (aSSimpleFaceInfoArr != null) {
                            C14117i iVar = this.f34396a.f34395a;
                            if (!iVar.f34330g) {
                                if (aSSimpleFaceInfoArr.length == 0) {
                                    iVar.f34329f = 0;
                                } else {
                                    iVar.f34329f++;
                                    if (iVar.f34329f == 6) {
                                        int length = aSSimpleFaceInfoArr.length;
                                        int i = 0;
                                        while (true) {
                                            if (i >= length) {
                                                iVar.mo22673a(EnumC77817a.MALE);
                                                iVar.f34330g = true;
                                                break;
                                            }
                                            ASSimpleFaceInfo aSSimpleFaceInfo = aSSimpleFaceInfoArr[i];
                                            if (!(aSSimpleFaceInfo == null || (invoke = iVar.f34327d.f34363o.invoke()) == null || aSSimpleFaceInfo.f74943a > invoke.floatValue())) {
                                                iVar.mo22673a(EnumC77817a.FEMALE);
                                                iVar.f34330g = true;
                                                break;
                                            }
                                            i++;
                                        }
                                    }
                                }
                            }
                            Float invoke2 = this.f34396a.f34395a.f34327d.f34363o.invoke();
                            for (ASSimpleFaceInfo aSSimpleFaceInfo2 : aSSimpleFaceInfoArr) {
                                if (aSSimpleFaceInfo2 != null && invoke2 != null && aSSimpleFaceInfo2.f74943a > invoke2.floatValue()) {
                                    this.f34396a.f34395a.mo22683f(true);
                                    return;
                                }
                            }
                            this.f34396a.f34395a.mo22683f(false);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$l */
    static final class C14146l<T> implements AbstractC2565m<C14206w> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34397a;

        static {
            Covode.recordClassIndex(16215);
        }

        C14146l(C14117i iVar) {
            this.f34397a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14206w wVar) {
            Serializable serializable;
            C14206w wVar2 = wVar;
            C89219l.m154716b(wVar2, "");
            Bundle bundle = wVar2.f34484c;
            AbstractC89172b<? super BeautyMetadata, ? extends Serializable> bVar = this.f34397a.f34327d.f34362n;
            if (bVar == null || (serializable = (Serializable) bVar.invoke(this.f34397a.mo22684g())) == null) {
                serializable = this.f34397a.mo22684g();
            }
            bundle.putSerializable("beautyMetadata", serializable);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$m */
    static final class C14147m<T> implements AbstractC2565m<C14219i> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34398a;

        static {
            Covode.recordClassIndex(16216);
        }

        C14147m(C14117i iVar) {
            this.f34398a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14219i iVar) {
            float f;
            C14219i iVar2 = iVar;
            if (C14216f.m25969a(iVar2.f34505b)) {
                if (C50691c.m94985a(iVar2.f34505b.f34498b.mo86071f(), iVar2.f34504a) == 0) {
                    f = 0.35f;
                } else {
                    f = 0.0f;
                }
                this.f34398a.mo22672a().mo22804b(f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22673a(EnumC77817a aVar) {
        C80558hx.m139642a(0, new C14149o(this, aVar));
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: c */
    public final void mo22653c(boolean z) {
        mo22672a().mo22803b().f155637B = z;
        mo22659i().mo121597a(z);
        this.f34345w = z ? 1 : 0;
        AbstractC14095a aVar = this.f34339q;
        if (aVar == null) {
            C89219l.m154710a("beautyPresenter");
        }
        aVar.mo22646a(false);
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: d */
    public final void mo22654d(boolean z) {
        int i;
        Object a = getDiContainer().mo35247a(ActivityC0945e.class);
        C89219l.m154716b(a, "");
        ActivityC0945e eVar = (ActivityC0945e) a;
        if (this.f34327d.f34368t) {
            if (z) {
                i = R.string.a3q;
            } else {
                i = R.string.a3k;
            }
            C85052j.C85053a.m146247b(eVar, i, 0).mo129996a();
        }
        if (z) {
            mo22653c(true);
        } else {
            mo22653c(false);
        }
        this.f34331h.mo6999a(new C14102d(z));
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$n */
    static final class C14148n<T> implements AbstractC2565m<FilterBean> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34399a;

        static {
            Covode.recordClassIndex(16217);
        }

        C14148n(C14117i iVar) {
            this.f34399a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            if (filterBean2 == null) {
                return;
            }
            if (filterBean2.isSaveFilter2BeautySequence()) {
                this.f34399a.mo22659i().mo121609d().add(new BeautyComposerInfo("EFFECT_ID_TYPE_FILTER", "", ""));
                C14117i iVar = this.f34399a;
                C77852b bVar = new C77852b("EFFECT_ID_TYPE_FILTER", 2);
                C89219l.m154721d(bVar, "");
                C78044a aVar = iVar.f34326c;
                if (aVar == null) {
                    C89219l.m154710a("beautyManager");
                }
                C89219l.m154721d(bVar, "");
                aVar.f175093c.mo121589a(bVar);
                return;
            }
            filterBean2.setSaveFilter2BeautySequence(true);
        }
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a
    /* renamed from: a */
    public final void mo22650a(String str) {
        C89219l.m154721d(str, "");
        C78044a aVar = this.f34326c;
        if (aVar == null) {
            C89219l.m154710a("beautyManager");
        }
        C89219l.m154721d(str, "");
        aVar.f175092b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: b */
    public final void mo22680b(boolean z) {
        if (z) {
            mo22675a(C14109f.m25704a(mo22659i().mo121609d()), 10000);
        } else {
            mo22675a(this.f34341s, 10000);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$j */
    static final class C14143j<T> implements AbstractC2565m<C14207x> {

        /* renamed from: a */
        final /* synthetic */ C14117i f34394a;

        static {
            Covode.recordClassIndex(16212);
        }

        C14143j(C14117i iVar) {
            this.f34394a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14207x xVar) {
            C14207x xVar2 = xVar;
            C89219l.m154716b(xVar2, "");
            if (xVar2.f34485a == 1) {
                return;
            }
            if (this.f34394a.f34327d.f34359k.invoke().booleanValue()) {
                this.f34394a.mo22672a().mo22803b().f155642G.f155727d.add(Integer.toString(this.f34394a.mo22686k()));
                this.f34394a.mo22672a().mo22803b().f155642G.f155730g.add(Integer.toString(this.f34394a.mo22689n()));
                this.f34394a.mo22672a().mo22803b().f155642G.f155729f.add(Integer.toString(this.f34394a.mo22687l()));
                this.f34394a.mo22672a().mo22803b().f155642G.f155728e.add(Integer.toString(this.f34394a.mo22688m()));
                return;
            }
            int k = this.f34394a.mo22686k();
            this.f34394a.mo22672a().mo22803b().f155642G.f155727d.add(Integer.toString((int) ((this.f34394a.f34327d.f34361m.invoke().floatValue() / 5.0f) * ((float) C0622a.m2312a(k, 0, 5)) * 100.0f)));
            int m = this.f34394a.mo22688m();
            int floatValue = (int) ((this.f34394a.f34327d.f34360l.invoke().floatValue() / 5.0f) * ((float) C0622a.m2312a(m, 0, 5)) * 100.0f);
            this.f34394a.mo22672a().mo22803b().f155642G.f155728e.add(Integer.toString(floatValue));
            this.f34394a.mo22672a().mo22803b().f155642G.f155729f.add(Integer.toString(floatValue));
            this.f34394a.mo22672a().mo22803b().f155642G.f155730g.add(Integer.toString(this.f34394a.mo22689n()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: b */
    public final void mo22679b(List<BeautyComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        dVar.mo22679b(list, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: c */
    public final void mo22681c(List<BeautyComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        dVar.mo22681c(list, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: a */
    public final void mo22675a(List<BeautyComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        dVar.mo22675a(list, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: a */
    public final int[] mo22677a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        return dVar.mo22677a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: a */
    public final void mo22674a(String str, String str2, float f) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        dVar.mo22674a(str, str2, f);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78054d
    /* renamed from: a */
    public final void mo22676a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        AbstractC78054d dVar = this.f34340r;
        if (dVar == null) {
            C89219l.m154710a("beautyModule");
        }
        dVar.mo22676a(list, list2, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super java.lang.Boolean, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14117i(C21582f fVar, AbstractC89171a<? extends AbstractC84398d> aVar, AbstractC89172b<? super Boolean, String> bVar, AbstractC14104f fVar2, AbstractC84903j jVar, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super C14119b, C89391z> bVar2) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar2, "");
        C89219l.m154721d(jVar, "");
        this.f34346x = fVar;
        this.f34348z = aVar;
        this.f34332i = bVar;
        this.f34333j = fVar2;
        this.f34334k = jVar;
        this.f34324A = aVar2;
        this.f34325b = this;
        this.f34335m = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f34336n = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        this.f34337o = C21572a.m40505b(getDiContainer(), AbstractC14210a.class);
        this.f34338p = true;
        this.f34341s = new C77971n<>();
        this.f34342t = new C1213t<>();
        C14119b bVar3 = new C14119b();
        this.f34327d = bVar3;
        bVar2.invoke(bVar3);
        this.f34331h = new C2563k<>();
        this.f34344v = "";
        this.f34345w = -1;
    }
}

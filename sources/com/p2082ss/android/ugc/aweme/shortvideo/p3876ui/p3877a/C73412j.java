package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import android.app.Activity;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.tools.C78608j;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.j */
public final class C73412j extends AbstractC2562j<AbstractC73411i> implements AbstractC21566a, AbstractC73411i {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f164935a = {new C89232y(C73412j.class, "activity", "getActivity()Landroid/app/Activity;", 0), new C89232y(C73412j.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0)};

    /* renamed from: b */
    public final AbstractC73411i f164936b = this;

    /* renamed from: c */
    public final ShortVideoContext f164937c = ((ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null));

    /* renamed from: d */
    public final C2563k<Boolean> f164938d = new C2563k<>();

    /* renamed from: e */
    private final AbstractC89248d f164939e = C21572a.m40504a(getDiContainer(), Activity.class);

    /* renamed from: f */
    private final AbstractC89248d f164940f = C21572a.m40504a(getDiContainer(), AbstractC14209z.class);

    /* renamed from: g */
    private final AbstractC14193m f164941g = ((AbstractC14193m) getDiContainer().mo35249a(AbstractC14193m.class, (String) null));

    /* renamed from: h */
    private final C21582f f164942h;

    static {
        Covode.recordClassIndex(86149);
    }

    /* renamed from: b */
    public final Activity mo116038b() {
        return (Activity) this.f164939e.mo23374a(this, f164935a[0]);
    }

    /* renamed from: c */
    public final AbstractC14209z mo116039c() {
        return (AbstractC14209z) this.f164940f.mo23374a(this, f164935a[1]);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73411i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2559g mo116036a() {
        return this.f164938d;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC73411i getApiComponent() {
        return this.f164936b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f164942h;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f164941g.mo22912s().mo6997a(this, new C73413a(this));
        mo116039c().mo22831s().mo6997a(this, new C73414b(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73411i
    /* renamed from: a */
    public final void mo116037a(boolean z) {
        this.f164938d.mo6999a(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.j$a */
    static final class C73413a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73412j f164943a;

        static {
            Covode.recordClassIndex(86150);
        }

        C73413a(C73412j jVar) {
            this.f164943a = jVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f164943a.f164937c.f155817b.mo109891d().isEmpty() && this.f164943a.f164937c.mo110022c()) {
                this.f164943a.mo116039c().mo22782a(new C78608j(3));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.j$b */
    static final class C73414b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73412j f164944a;

        static {
            Covode.recordClassIndex(86151);
        }

        C73414b(C73412j jVar) {
            this.f164944a = jVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C78608j jVar = (C78608j) obj;
            if (this.f164944a.f164937c.mo110022c()) {
                C89219l.m154716b(jVar, "");
                int i = jVar.f176647a;
                if (i == 1) {
                    this.f164944a.f164937c.mo110021c(false);
                    StitchParams stitchParams = this.f164944a.f164937c.f155743D.f155846a;
                    if (stitchParams != null) {
                        stitchParams.setMuted(false);
                    }
                    C85052j.C85053a.m146247b(this.f164944a.mo116038b(), (int) R.string.f5s, 1).mo129996a();
                } else if (i == 2) {
                    this.f164944a.f164937c.mo110021c(true);
                    StitchParams stitchParams2 = this.f164944a.f164937c.f155743D.f155846a;
                    if (stitchParams2 != null) {
                        stitchParams2.setMuted(true);
                    }
                    C85052j.C85053a.m146247b(this.f164944a.mo116038b(), (int) R.string.b00, 1).mo129996a();
                }
            }
        }
    }

    public C73412j(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f164942h = fVar;
    }
}

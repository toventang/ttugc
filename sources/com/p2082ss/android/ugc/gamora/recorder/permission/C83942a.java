package com.p2082ss.android.ugc.gamora.recorder.permission;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.property.C65338ah;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.permission.a */
public final class C83942a extends AbstractC2562j<AbstractC2547b> implements AbstractC2547b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f187388a = {new C89232y(C83942a.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C89232y(C83942a.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C83942a.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};

    /* renamed from: b */
    final AbstractC89248d f187389b = C21572a.m40504a(getDiContainer(), AbstractC83406b.class);

    /* renamed from: c */
    public boolean f187390c;

    /* renamed from: d */
    public final boolean f187391d = C65338ah.m117024a();

    /* renamed from: e */
    public boolean f187392e;

    /* renamed from: f */
    private final AbstractC89248d f187393f = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);

    /* renamed from: g */
    private final AbstractC89248d f187394g = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: h */
    private final AbstractC89244h f187395h = C89250i.m154773a((AbstractC89171a) new C83945c(this));

    /* renamed from: i */
    private final C21582f f187396i;

    static {
        Covode.recordClassIndex(97835);
    }

    /* renamed from: c */
    private final PermissionStateViewModel m144378c() {
        return (PermissionStateViewModel) this.f187395h.getValue();
    }

    /* renamed from: a */
    public final ActivityC0945e mo128832a() {
        return (ActivityC0945e) this.f187393f.mo23374a(this, f187388a[0]);
    }

    /* renamed from: b */
    public final AbstractC14177d mo128833b() {
        return (AbstractC14177d) this.f187394g.mo23374a(this, f187388a[1]);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final AbstractC2547b getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187396i;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.permission.a$c */
    static final class C83945c extends AbstractC89220m implements AbstractC89171a<PermissionStateViewModel> {

        /* renamed from: a */
        final /* synthetic */ C83942a f187399a;

        static {
            Covode.recordClassIndex(97838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83945c(C83942a aVar) {
            super(0);
            this.f187399a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PermissionStateViewModel invoke() {
            return C20531t.m38716a(this.f187399a.mo128832a()).mo33800a(PermissionStateViewModel.class);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onResume() {
        super.onResume();
        this.f187392e = false;
        if (!this.f187391d && this.f187390c) {
            mo128833b().mo22740a(true, (PrivacyCert) null);
            this.f187390c = false;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        AbstractC88412b unused = m144378c().mo33677a(mo128832a(), C83946b.f187400a, new C20370ah(), new C83943a(this));
        AbstractC88412b unused2 = m144378c().mo33677a(mo128832a(), C83947c.f187401a, new C20370ah(), new C83944b(this));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.permission.a$a */
    static final class C83943a extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83942a f187397a;

        static {
            Covode.recordClassIndex(97836);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83943a(C83942a aVar) {
            super(1);
            this.f187397a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            this.f187397a.f187392e = true;
            C83942a aVar = this.f187397a;
            if (((AbstractC83406b) aVar.f187389b.mo23374a(aVar, C83942a.f187388a[2])).isCurrentTabNeedCamera() && !this.f187397a.f187391d) {
                this.f187397a.mo128833b().mo22742b(true, (PrivacyCert) null);
                this.f187397a.f187390c = true;
            }
            return C89391z.f203057a;
        }
    }

    public C83942a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f187396i = fVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.permission.a$b */
    static final class C83944b extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83942a f187398a;

        static {
            Covode.recordClassIndex(97837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83944b(C83942a aVar) {
            super(1);
            this.f187398a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            if (this.f187398a.f187392e) {
                this.f187398a.mo128833b().mo22738a();
                this.f187398a.f187390c = true;
            } else {
                AbstractC1196i lifecycle = this.f187398a.mo128832a().getLifecycle();
                C89219l.m154716b(lifecycle, "");
                if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
                    this.f187398a.mo128833b().mo22740a(false, (PrivacyCert) null);
                }
            }
            return C89391z.f203057a;
        }
    }
}

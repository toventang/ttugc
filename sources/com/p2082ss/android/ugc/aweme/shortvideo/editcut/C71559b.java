package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70579x;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b */
public final class C71559b implements AbstractC1204m, AbstractC21566a, AbstractC71793q {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f160359a = {new C89232y(C71559b.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C89232y(C71559b.class, "editCutterViewModel", "getEditCutterViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", 0)};

    /* renamed from: b */
    public AbstractC31071f f160360b;

    /* renamed from: c */
    public AbstractC70078j f160361c;

    /* renamed from: d */
    private final AbstractC89248d f160362d = C21572a.m40504a(getDiContainer(), AbstractC72510a.class);

    /* renamed from: e */
    private final AbstractC89248d f160363e = C21572a.m40504a(getDiContainer(), VEVideoCutterViewModel.class);

    /* renamed from: f */
    private final AbstractC1204m f160364f;

    /* renamed from: g */
    private final C21582f f160365g;

    static {
        Covode.recordClassIndex(84104);
    }

    /* renamed from: e */
    private final AbstractC72510a m126460e() {
        return (AbstractC72510a) this.f160362d.mo23374a(this, f160359a[0]);
    }

    /* renamed from: b */
    public final VEVideoCutterViewModel mo113314b() {
        return (VEVideoCutterViewModel) this.f160363e.mo23374a(this, f160359a[1]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b$b */
    public static final class C71563b extends AbstractC89220m implements AbstractC89171a<VEEditorAutoStartStopArbiter> {

        /* renamed from: a */
        final /* synthetic */ VEEditorAutoStartStopArbiter f160369a;

        static {
            Covode.recordClassIndex(84108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71563b(VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter) {
            super(0);
            this.f160369a = vEEditorAutoStartStopArbiter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ VEEditorAutoStartStopArbiter invoke() {
            return this.f160369a;
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f160365g;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b$a */
    static final class C71562a implements VEListener.AbstractC85250s {

        /* renamed from: a */
        final /* synthetic */ C71559b f160368a;

        static {
            Covode.recordClassIndex(84107);
        }

        C71562a(C71559b bVar) {
            this.f160368a = bVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85250s
        /* renamed from: a */
        public final void mo87822a() {
            this.f160368a.mo113314b().mo111336a(C70576a.C70577a.m124666a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71793q
    /* renamed from: a */
    public final long mo113312a() {
        AbstractC70078j c = mo113315c();
        if (c != null) {
            return c.mo110548a();
        }
        return 0;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f160364f.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: c */
    public final AbstractC70078j mo113315c() {
        if (this.f160361c == null) {
            AbstractC31071f fVar = this.f160360b;
            VEEditorAutoStartStopArbiter value = m126460e().mo114779D().getValue();
            if (!(fVar == null || value == null)) {
                this.f160361c = new C70579x(fVar, new C71563b(value));
            }
        }
        return this.f160361c;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71793q
    /* renamed from: d */
    public final boolean mo113316d() {
        AbstractC70078j c = mo113315c();
        if (c == null || !c.mo110551b()) {
            mo113314b().mo111336a(new C70576a(1, true));
            return true;
        }
        mo113314b().mo111336a(new C70576a(2, true));
        return false;
    }

    public C71559b(AbstractC1204m mVar, C21582f fVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(fVar, "");
        this.f160364f = mVar;
        this.f160365g = fVar;
        m126460e().mo114778C().observe(this, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71559b.C715601 */

            /* renamed from: a */
            final /* synthetic */ C71559b f160366a;

            static {
                Covode.recordClassIndex(84105);
            }

            {
                this.f160366a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                this.f160366a.f160360b = (AbstractC31071f) obj;
            }
        });
        mo113314b().mo111335a().observe(this, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71559b.C715612 */

            /* renamed from: a */
            final /* synthetic */ C71559b f160367a;

            static {
                Covode.recordClassIndex(84106);
            }

            {
                this.f160367a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                Integer valueOf;
                AbstractC70078j c;
                C70576a aVar = (C70576a) obj;
                if (aVar != null && (valueOf = Integer.valueOf(aVar.f157914d)) != null) {
                    if (valueOf.intValue() == 1) {
                        AbstractC70078j c2 = this.f160367a.mo113315c();
                        if (c2 != null) {
                            c2.mo110550a(aVar.f157915e);
                        }
                    } else if (valueOf.intValue() == 2) {
                        AbstractC70078j c3 = this.f160367a.mo113315c();
                        if (c3 != null) {
                            c3.mo110552b(aVar.f157915e);
                        }
                    } else if (valueOf.intValue() == 3 && (c = this.f160367a.mo113315c()) != null) {
                        c.mo110549a(aVar.f157912b, aVar.f157911a, aVar.f157913c);
                    }
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71793q
    /* renamed from: a */
    public final void mo113313a(long j, C85581w.EnumC85607f fVar, boolean z) {
        C71562a aVar;
        C89219l.m154721d(fVar, "");
        if (j >= 0) {
            VEVideoCutterViewModel b = mo113314b();
            if (fVar == C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing || !z) {
                aVar = null;
            } else {
                aVar = new C71562a(this);
            }
            C89219l.m154721d(fVar, "");
            b.mo111336a(new C70576a(j, fVar, aVar));
            return;
        }
        mo113314b().mo111336a(C70576a.C70577a.m124666a());
    }
}

package com.p2082ss.android.ugc.gamora.editor.progress;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71392j;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88296t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.editor.progress.d */
public final class C82485d extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184468a = {new C89232y(C82485d.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: t */
    public static final C82489d f184469t = new C82489d((byte) 0);

    /* renamed from: b */
    public C1213t<C88296t> f184470b;

    /* renamed from: c */
    public TextView f184471c;

    /* renamed from: d */
    public TextView f184472d;

    /* renamed from: e */
    public View f184473e;

    /* renamed from: f */
    public ImageView f184474f;

    /* renamed from: g */
    public ImageView f184475g;

    /* renamed from: h */
    public boolean f184476h;

    /* renamed from: i */
    public boolean f184477i;

    /* renamed from: j */
    public int f184478j;

    /* renamed from: k */
    public float f184479k;

    /* renamed from: l */
    public final AbstractC82496g f184480l;

    /* renamed from: u */
    private final AbstractC89248d f184481u = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: v */
    private final AbstractC89244h f184482v = C89250i.m154774a(EnumC89331m.NONE, new C82486a(this));

    /* renamed from: w */
    private final AbstractC89244h f184483w = C89250i.m154774a(EnumC89331m.NONE, new C82488c(this));

    /* renamed from: x */
    private final AbstractC89244h f184484x;

    /* renamed from: y */
    private final C21582f f184485y;

    static {
        Covode.recordClassIndex(96327);
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo127567a() {
        return (VideoPublishEditModel) this.f184481u.mo23374a(this, f184468a[0]);
    }

    /* renamed from: b */
    public final AbstractC72510a mo127568b() {
        return (AbstractC72510a) this.f184482v.getValue();
    }

    /* renamed from: d */
    public final AbstractC82478a mo127569d() {
        return (AbstractC82478a) this.f184483w.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.d$d */
    public static final class C82489d {
        static {
            Covode.recordClassIndex(96331);
        }

        private C82489d() {
        }

        public /* synthetic */ C82489d(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184485y;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.d$a */
    public static final class C82486a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184486a;

        static {
            Covode.recordClassIndex(96328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82486a(AbstractC21566a aVar) {
            super(0);
            this.f184486a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184486a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.progress.C82485d.C82486a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.d$c */
    public static final class C82488c extends AbstractC89220m implements AbstractC89171a<AbstractC82478a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184490a;

        static {
            Covode.recordClassIndex(96330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82488c(AbstractC21566a aVar) {
            super(0);
            this.f184490a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.progress.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184490a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progress.a> r1 = com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.progress.C82485d.C82488c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.d$h */
    public static final class C82493h implements AbstractC82496g {

        /* renamed from: a */
        final /* synthetic */ C82485d f184494a;

        static {
            Covode.recordClassIndex(96335);
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82496g
        /* renamed from: a */
        public final void mo127571a() {
            AbstractC82478a d = this.f184494a.mo127569d();
            if (d == null || d.mo127564a()) {
                this.f184494a.mo127566C();
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82496g
        /* renamed from: b */
        public final void mo127573b() {
            String str;
            AbstractC82478a d = this.f184494a.mo127569d();
            if ((d == null || d.mo127564a()) && this.f184494a.f184478j != -1) {
                if (this.f184494a.f184479k > 0.0f) {
                    str = "right";
                } else {
                    str = "left";
                }
                C39162r.m79460a("drag_edit_page_progress", new C84425b().mo129406a("creation_id", this.f184494a.mo127567a().creationId).mo129406a("content_source", C70968bl.m125262b(this.f184494a.mo127567a())).mo129406a("content_type", C70968bl.m125249a(this.f184494a.mo127567a())).mo129406a("direction", str).mo129403a("drag_time", (int) Math.abs(((float) this.f184494a.mo127567a().getPreviewInfo().getPreviewVideoLength()) * this.f184494a.f184479k)).mo129406a("enter_from", "video_edit_page").mo129403a("creation_duration", this.f184494a.mo127567a().getPreviewInfo().getPreviewVideoLength()).f188764a);
                if (this.f184494a.mo127568b().mo114824m() == 1) {
                    C82485d.m142588a(this.f184494a).setValue(C88296t.m153437b());
                    this.f184494a.f184478j = -1;
                    C82485d.m142590c(this.f184494a).setVisibility(8);
                    C82485d.m142591d(this.f184494a).setVisibility(8);
                    C82485d.m142589b(this.f184494a).setVisibility(0);
                    this.f184494a.f184477i = true;
                    return;
                }
                C82485d.m142588a(this.f184494a).setValue(C88296t.m153435a());
                this.f184494a.f184478j = -1;
                C82485d.m142590c(this.f184494a).setVisibility(8);
                C82485d.m142591d(this.f184494a).setVisibility(8);
                C82485d.m142589b(this.f184494a).setVisibility(8);
                this.f184494a.f184477i = false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82493h(C82485d dVar) {
            this.f184494a = dVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82496g
        /* renamed from: a */
        public final void mo127572a(float f) {
            AbstractC31071f value;
            int i;
            AbstractC82478a d = this.f184494a.mo127569d();
            if ((d == null || d.mo127564a()) && (value = this.f184494a.mo127568b().mo114778C().getValue()) != null) {
                float j = ((float) value.mo56368j()) / 1000.0f;
                if (j < 7.0f) {
                    i = 0;
                } else if (j < 15.0f) {
                    i = 1;
                } else if (j < 30.0f) {
                    i = 2;
                } else if (j < 45.0f) {
                    i = 3;
                } else if (j < 60.0f) {
                    i = 4;
                } else {
                    i = 5;
                }
                String.valueOf(i);
                SparseArray<Integer> a = C71392j.m126090a();
                String.valueOf(a.toString());
                float floatValue = (a.get((a.size() - i) - 1).floatValue() / 100.0f) * f;
                if (C78099c.m136517a(this.f184494a.mo36486t())) {
                    floatValue = -f;
                }
                this.f184494a.f184479k = floatValue;
                C82485d.m142588a(this.f184494a).setValue(C88296t.m153437b());
                C82485d.m142590c(this.f184494a).setVisibility(0);
                C82485d.m142591d(this.f184494a).setVisibility(0);
                C82485d.m142589b(this.f184494a).setVisibility(8);
                float f2 = 0.0f;
                C82485d.m142590c(this.f184494a).setRotation(0.0f);
                if (floatValue < 0.0f) {
                    C82485d.m142590c(this.f184494a).setRotation(180.0f);
                }
                if (this.f184494a.f184478j == -1) {
                    this.f184494a.f184478j = value.mo56370k();
                }
                float j2 = ((float) this.f184494a.f184478j) + (((float) value.mo56368j()) * floatValue);
                if (j2 > ((float) value.mo56368j())) {
                    j2 = (float) value.mo56368j();
                }
                if (j2 >= 0.0f) {
                    f2 = j2;
                }
                C82485d.m142588a(this.f184494a).setValue(C88296t.m153438b((long) f2));
                C82485d.m142588a(this.f184494a).setValue(C88296t.m153437b());
                TextView textView = this.f184494a.f184471c;
                if (textView == null) {
                    C89219l.m154710a("curTextView");
                }
                textView.setText(C82495f.m142603a(f2));
                TextView textView2 = this.f184494a.f184472d;
                if (textView2 == null) {
                    C89219l.m154710a("totalTextView");
                }
                textView2.setText(C82495f.m142603a((float) value.mo56368j()));
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        if (this.f184476h && this.f184477i) {
            this.f184476h = false;
            C1213t<C88296t> tVar = this.f184470b;
            if (tVar == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar.setValue(C88296t.m153435a());
            ImageView imageView = this.f184475g;
            if (imageView == null) {
                C89219l.m154710a("playView");
            }
            imageView.setVisibility(8);
            mo127568b().mo114808b(0);
            this.f184477i = false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.d$b */
    public static final class C82487b extends AbstractC89220m implements AbstractC89171a<EditProgressViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184487a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184488b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184489c;

        static {
            Covode.recordClassIndex(96329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82487b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184487a = jVar;
            this.f184488b = cVar;
            this.f184489c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.progress.EditProgressViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.progress.EditProgressViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progress.EditProgressViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184487a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184489c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184489c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184488b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142599x38acab31(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184487a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184488b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142599x38acab31(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.progress.C82485d.C82487b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_progress_EditProgressScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142599x38acab31(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: C */
    public final void mo127566C() {
        if (this.f184477i) {
            ImageView imageView = this.f184475g;
            if (imageView == null) {
                C89219l.m154710a("playView");
            }
            imageView.setVisibility(8);
            mo127568b().mo114808b(0);
            C1213t<C88296t> tVar = this.f184470b;
            if (tVar == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar.setValue(C88296t.m153435a());
            this.f184477i = false;
            return;
        }
        C39162r.m79460a("click_edit_page_pause", new C84425b().mo129406a("creation_id", mo127567a().creationId).mo129406a("content_source", C70968bl.m125262b(mo127567a())).mo129406a("content_type", C70968bl.m125249a(mo127567a())).mo129406a("enter_from", "video_edit_page").mo129403a("creation_duration", mo127567a().getPreviewInfo().getPreviewVideoLength()).f188764a);
        ImageView imageView2 = this.f184475g;
        if (imageView2 == null) {
            C89219l.m154710a("playView");
        }
        imageView2.setVisibility(0);
        C1213t<C88296t> tVar2 = this.f184470b;
        if (tVar2 == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        tVar2.setValue(C88296t.m153437b());
        this.f184477i = true;
        mo127568b().mo114808b(1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.d$e */
    static final class View$OnClickListenerC82490e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C82485d f184491a;

        static {
            Covode.recordClassIndex(96332);
        }

        View$OnClickListenerC82490e(C82485d dVar) {
            this.f184491a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f184491a.mo127566C();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C1213t m142588a(C82485d dVar) {
        C1213t<C88296t> tVar = dVar.f184470b;
        if (tVar == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        return tVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m142589b(C82485d dVar) {
        ImageView imageView = dVar.f184475g;
        if (imageView == null) {
            C89219l.m154710a("playView");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m142590c(C82485d dVar) {
        ImageView imageView = dVar.f184474f;
        if (imageView == null) {
            C89219l.m154710a("seekView");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m142591d(C82485d dVar) {
        View view = dVar.f184473e;
        if (view == null) {
            C89219l.m154710a("parentView");
        }
        return view;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.d$g */
    static final class C82492g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82485d f184493a;

        static {
            Covode.recordClassIndex(96334);
        }

        C82492g(C82485d dVar) {
            this.f184493a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 3) {
                    if (this.f184493a.mo127568b().mo114824m() == 1) {
                        C82485d.m142589b(this.f184493a).setVisibility(8);
                    }
                } else if (intValue == -1 && this.f184493a.mo127568b().mo114824m() == 1) {
                    C82485d.m142589b(this.f184493a).setVisibility(0);
                }
            }
        }
    }

    public C82485d(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f184485y = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditProgressViewModel.class);
        this.f184484x = C89250i.m154773a((AbstractC89171a) new C82487b(this, a, a));
        this.f184478j = -1;
        this.f184480l = new C82493h(this);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.ehs);
        C89219l.m154716b(c, "");
        this.f184473e = c;
        View c2 = mo36475c(R.id.agp);
        C89219l.m154716b(c2, "");
        this.f184471c = (TextView) c2;
        View c3 = mo36475c(R.id.emi);
        C89219l.m154716b(c3, "");
        this.f184472d = (TextView) c3;
        View c4 = mo36475c(R.id.dtw);
        C89219l.m154716b(c4, "");
        this.f184474f = (ImageView) c4;
        View c5 = mo36475c(R.id.d35);
        C89219l.m154716b(c5, "");
        this.f184475g = (ImageView) c5;
        View c6 = mo36475c(R.id.a34);
        C89219l.m154716b(c6, "");
        View view = this.f184473e;
        if (view == null) {
            C89219l.m154710a("parentView");
        }
        view.setTranslationY(((float) (-C30745b.m63133b(mo36486t()))) / 5.0f);
        ImageView imageView = this.f184474f;
        if (imageView == null) {
            C89219l.m154710a("seekView");
        }
        imageView.setTranslationY(((float) (-C30745b.m63133b(mo36486t()))) / 5.0f);
        c6.setTranslationY(-C30745b.m63132b(mo36486t(), 1.5f));
        ImageView imageView2 = this.f184474f;
        if (imageView2 == null) {
            C89219l.m154710a("seekView");
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = this.f184475g;
        if (imageView3 == null) {
            C89219l.m154710a("playView");
        }
        imageView3.setVisibility(8);
        View view2 = this.f184473e;
        if (view2 == null) {
            C89219l.m154710a("parentView");
        }
        view2.setVisibility(8);
        this.f184470b = mo127568b().mo114833v();
        ((AbstractC14552j) getDiContainer().mo35249a(AbstractC14552j.class, (String) null)).mo23383a(new C14544f(1, new C82483c(this.f184480l)));
        ImageView imageView4 = this.f184475g;
        if (imageView4 == null) {
            C89219l.m154710a("playView");
        }
        imageView4.setOnClickListener(new View$OnClickListenerC82490e(this));
        AbstractC20382b.C20383a.m38603b(this, (EditProgressViewModel) this.f184484x.getValue(), C82494e.f184495a, new C82491f(this));
        mo127568b().mo114825n().observe(this, new C82492g(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asc, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.d$f */
    static final class C82491f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82485d f184492a;

        static {
            Covode.recordClassIndex(96333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82491f(C82485d dVar) {
            super(2);
            this.f184492a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            if (intValue == -1) {
                this.f184492a.f184476h = true;
            } else if (intValue == 5 || intValue == 1 || intValue == 8 || intValue == 7 || intValue == 1001 || intValue == 6) {
                if (this.f184492a.f184477i) {
                    if (intValue != 1) {
                        C82485d.m142588a(this.f184492a).setValue(C88296t.m153435a());
                    } else if (C70976bp.m125316l(this.f184492a.mo127567a())) {
                        C82485d.m142588a(this.f184492a).setValue(C88296t.m153435a());
                    }
                }
                C82485d.m142589b(this.f184492a).setVisibility(8);
                this.f184492a.mo127568b().mo114808b(0);
                this.f184492a.f184477i = false;
            } else if (!(intValue == 4 || intValue == 3)) {
                C82485d.m142589b(this.f184492a).setVisibility(8);
                this.f184492a.mo127568b().mo114808b(0);
                this.f184492a.f184477i = false;
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

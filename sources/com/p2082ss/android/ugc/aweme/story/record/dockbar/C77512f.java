package com.p2082ss.android.ugc.aweme.story.record.dockbar;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65348ar;
import com.p2082ss.android.ugc.aweme.story.record.dockbar.StoryRecordDockBarViewModel;
import com.p2082ss.android.ugc.aweme.story.record.p4066f.C77561a;
import com.p2082ss.android.ugc.aweme.story.record.p4069i.C77600a;
import com.p2082ss.android.ugc.aweme.story.record.widget.StoryUploadButton;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.f */
public final class C77512f extends AbstractC22219j implements AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f173861a = {new C89232y(C77512f.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0), new C89232y(C77512f.class, "recordContext", "getRecordContext()Lcom/ss/android/ugc/aweme/story/record/model/StoryRecordContext;", 0)};

    /* renamed from: e */
    public static final C77515b f173862e = new C77515b((byte) 0);

    /* renamed from: b */
    final AbstractC89244h f173863b;

    /* renamed from: c */
    final AbstractC89248d f173864c = C21572a.m40504a(getDiContainer(), C77561a.class);

    /* renamed from: d */
    ImageView f173865d;

    /* renamed from: f */
    private final AbstractC89248d f173866f = C21572a.m40504a(getDiContainer(), AbstractC14330a.class);

    /* renamed from: g */
    private final C77516c f173867g = new C77516c(this);

    /* renamed from: h */
    private StoryUploadButton f173868h;

    /* renamed from: i */
    private final C21582f f173869i;

    static {
        Covode.recordClassIndex(90549);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.f$b */
    public static final class C77515b {
        static {
            Covode.recordClassIndex(90552);
        }

        private C77515b() {
        }

        public /* synthetic */ C77515b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f173869i;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.f$a */
    public static final class C77513a extends AbstractC89220m implements AbstractC89171a<StoryRecordDockBarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f173870a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f173871b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f173872c;

        static {
            Covode.recordClassIndex(90550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77513a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f173870a = jVar;
            this.f173871b = cVar;
            this.f173872c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.story.record.dockbar.StoryRecordDockBarViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.record.dockbar.StoryRecordDockBarViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.scene.j r0 = r3.f173870a
                android.app.Activity r1 = r0.mo36486t()
                java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                java.util.Objects.requireNonNull(r1, r0)
                androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                com.ss.android.ugc.aweme.story.record.dockbar.f$a$1 r0 = new com.ss.android.ugc.aweme.story.record.dockbar.f$a$1
                r0.<init>()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r3.f173872c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                h.k.c r0 = r3.f173871b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m135519x4ec41df0(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.record.dockbar.C77512f.C77513a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_story_record_dockbar_StoryRecordDockBarScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m135519x4ec41df0(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        StoryUploadButton storyUploadButton = this.f173868h;
        if (storyUploadButton == null) {
            C89219l.m154710a("uploadButton");
        }
        if (!storyUploadButton.f174243b && C63253l.f143623a.mo73307c().mo101757a(storyUploadButton.f174242a) == 0) {
            Context applicationContext = C63247i.f143610a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C59187c.m108691a(applicationContext, C65348ar.m117034a());
            C59187c.f134693a.mo96691a(1, 1, 0, storyUploadButton);
            storyUploadButton.f174243b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.f$c */
    public static final class C77516c extends AbstractView$OnClickListenerC81441k {

        /* renamed from: a */
        final /* synthetic */ C77512f f173873a;

        static {
            Covode.recordClassIndex(90553);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77516c(C77512f fVar) {
            super(500, false, 2);
            this.f173873a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
        /* renamed from: a */
        public final void mo78773a(View view) {
            Integer valueOf;
            C89219l.m154721d(view, "");
            C77512f fVar = this.f173873a;
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.ze) {
                    ((JediViewModel) fVar.f173863b.getValue()).mo33689c(StoryRecordDockBarViewModel.C77499a.f173841a);
                } else if (valueOf.intValue() == R.id.asy) {
                    ((AbstractC14333c) fVar.getDiContainer().mo35249a((Type) AbstractC14333c.class, (String) null)).mo23139a(true);
                    C77561a aVar = (C77561a) fVar.f173864c.mo23374a(fVar, C77512f.f173861a[1]);
                    C89219l.m154721d(aVar, "");
                    C39162r.m79460a("click_prop_entrance", new C84425b().mo129406a("creation_id", aVar.f173950b).mo129406a("shoot_way", aVar.f173951c).mo129406a("enter_from", "video_shoot_page").mo129406a("is_westwindow_exist", aVar.f173957i).mo129406a("shoot_page", "story_shoot_page").mo129406a("shoot_tab_name", "story").f188764a);
                }
            }
        }
    }

    public C77512f(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f173869i = fVar;
        AbstractC89277c a = C89204ab.m154669a(StoryRecordDockBarViewModel.class);
        this.f173863b = C89250i.m154773a((AbstractC89171a) new C77513a(this, a, a));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.ze);
        C89219l.m154716b(c, "");
        StoryUploadButton storyUploadButton = (StoryUploadButton) c;
        this.f173868h = storyUploadButton;
        if (storyUploadButton == null) {
            C89219l.m154710a("uploadButton");
        }
        storyUploadButton.setOnClickListener(this.f173867g);
        View c2 = mo36475c(R.id.c0j);
        C89219l.m154716b(c2, "");
        this.f173865d = (ImageView) c2;
        mo36475c(R.id.asy).setOnClickListener(this.f173867g);
        View view = this.f52550n;
        C89219l.m154716b(view, "");
        AbstractC14330a aVar = (AbstractC14330a) this.f173866f.mo23374a(this, f173861a[0]);
        C89219l.m154721d(this, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        new C77600a(this, aVar, (ViewGroup) view.findViewById(R.id.asy), (RemoteImageView) view.findViewById(R.id.c0j), (RemoteImageView) view.findViewById(R.id.c0l));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b22, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }
}

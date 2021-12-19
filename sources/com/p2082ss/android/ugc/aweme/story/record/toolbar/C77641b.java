package com.p2082ss.android.ugc.aweme.story.record.toolbar;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14100b;
import com.bytedance.creativex.recorder.p938a.p939a.C14102d;
import com.bytedance.creativex.recorder.p938a.p939a.EnumC14101c;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14178e;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.tux.p1722h.C23160g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.p2082ss.android.ugc.aweme.story.record.p4066f.C77561a;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77609c;
import com.p2082ss.android.ugc.aweme.tools.C78599g;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b */
public final class C77641b extends AbstractC2562j<AbstractC77640a> implements AbstractC21566a, AbstractC77640a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f174135a = {new C89232y(C77641b.class, "recordContext", "getRecordContext()Lcom/ss/android/ugc/aweme/story/record/model/StoryRecordContext;", 0), new C89232y(C77641b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C77641b.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new C89232y(C77641b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0), new C89232y(C77641b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b */
    public final View$OnClickListenerC77666j f174136b;

    /* renamed from: c */
    final AbstractC89244h f174137c;

    /* renamed from: d */
    public final AbstractC22186b f174138d;

    /* renamed from: e */
    public final int f174139e = R.id.dgc;

    /* renamed from: f */
    private final AbstractC89248d f174140f;

    /* renamed from: g */
    private final AbstractC89244h f174141g;

    /* renamed from: h */
    private final AbstractC89244h f174142h;

    /* renamed from: i */
    private final AbstractC89248d f174143i;

    /* renamed from: j */
    private final AbstractC89248d f174144j;

    /* renamed from: k */
    private final AbstractC89248d f174145k;

    /* renamed from: l */
    private final AbstractC89248d f174146l;

    /* renamed from: m */
    private final C21582f f174147m;

    static {
        Covode.recordClassIndex(90682);
    }

    /* renamed from: g */
    private final StoryRecordToolbarViewModel m135644g() {
        return (StoryRecordToolbarViewModel) this.f174141g.getValue();
    }

    /* renamed from: b */
    public final C77561a mo121172b() {
        return (C77561a) this.f174140f.mo23374a(this, f174135a[0]);
    }

    /* renamed from: c */
    public final StoryRecordBaseViewModel mo121173c() {
        return (StoryRecordBaseViewModel) this.f174142h.getValue();
    }

    /* renamed from: d */
    public final AbstractC14177d mo121174d() {
        return (AbstractC14177d) this.f174143i.mo23374a(this, f174135a[1]);
    }

    /* renamed from: e */
    public final AbstractC14099a mo121175e() {
        return (AbstractC14099a) this.f174144j.mo23374a(this, f174135a[2]);
    }

    /* renamed from: f */
    public final AbstractC14330a mo121176f() {
        return (AbstractC14330a) this.f174145k.mo23374a(this, f174135a[3]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC77640a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f174147m;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$p */
    static final class C77657p extends AbstractC89220m implements AbstractC89171a<C23160g> {

        /* renamed from: a */
        final /* synthetic */ C77641b f174163a;

        static {
            Covode.recordClassIndex(90698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77657p(C77641b bVar) {
            super(0);
            this.f174163a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23160g invoke() {
            return new C23160g(C2556g.m7473b(this.f174163a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$o */
    static final class C77656o extends AbstractC89220m implements AbstractC89171a<StoryRecordBaseViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77641b f174162a;

        static {
            Covode.recordClassIndex(90697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77656o(C77641b bVar) {
            super(0);
            this.f174162a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            JediViewModel a = C20531t.m38716a(C22228c.m41832b(this.f174162a.f174138d)).mo33800a(StoryRecordBaseViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$q */
    static final class C77658q extends AbstractC89220m implements AbstractC89171a<StoryRecordToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77641b f174164a;

        static {
            Covode.recordClassIndex(90699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77658q(C77641b bVar) {
            super(0);
            this.f174164a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordToolbarViewModel invoke() {
            JediViewModel a = C20531t.m38716a(C22228c.m41832b(this.f174164a.f174138d)).mo33800a(StoryRecordToolbarViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.toolbar.AbstractC77640a
    /* renamed from: a */
    public final void mo121171a() {
        View$OnClickListenerC77666j jVar = this.f174136b;
        View c = jVar.mo36475c(R.id.ekg);
        C89219l.m154716b(c, "");
        ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + C70636dh.m124833c(jVar.mo36485s()), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        c.setLayoutParams(marginLayoutParams);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f174138d.mo36387a(this.f174139e, this.f174136b, "StoryRecordToolbarScene");
        AbstractC88412b unused = m135644g().mo33677a(this, C77659c.f174165a, new C20370ah(), new C77649h(this));
        AbstractC88412b unused2 = m135644g().mo33677a(this, C77663g.f174169a, new C20370ah(), new C77652k(this));
        AbstractC88412b unused3 = m135644g().mo33677a(this, C77664h.f174170a, new C20370ah(), new C77653l(this));
        AbstractC88412b unused4 = m135644g().mo33677a(this, C77665i.f174171a, new C20370ah(), new C77654m(this));
        mo121174d().mo22828p().mo6997a(this, new C77655n(this));
        mo121174d().mo22823k().mo6997a(this, new C77642a(this));
        mo121174d().mo22833u().mo6997a(this, new C77643b(this));
        mo121174d().mo22822j().mo6997a(this, new C77644c(this));
        AbstractC88412b unused5 = mo121173c().mo33677a(this, C77660d.f174166a, new C20370ah(), new C77645d(this));
        AbstractC88412b unused6 = mo121173c().mo33677a(this, C77661e.f174167a, new C20370ah(), new C77646e(this));
        AbstractC88412b unused7 = mo121173c().mo33677a(this, C77662f.f174168a, new C20370ah(), new C77647f(this));
        mo121176f().mo23122d().mo6997a(this, new C77648g(this));
        ((AbstractC14193m) this.f174146l.mo23374a(this, f174135a[4])).mo22901h().mo6997a(this, new C77650i(this));
        mo121175e().mo22658h().mo6997a(this, new C77651j(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$a */
    static final class C77642a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77641b f174148a;

        static {
            Covode.recordClassIndex(90683);
        }

        C77642a(C77641b bVar) {
            this.f174148a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            View$OnClickListenerC77666j jVar = this.f174148a.f174136b;
            C89219l.m154716b(bool, "");
            jVar.mo121180b(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$d */
    static final class C77645d extends AbstractC89220m implements AbstractC89172b<C20523m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77641b f174151a;

        static {
            Covode.recordClassIndex(90686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77645d(C77641b bVar) {
            super(1);
            this.f174151a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20523m mVar) {
            C89219l.m154721d(mVar, "");
            View view = this.f174151a.f174136b.f52550n;
            C89219l.m154716b(view, "");
            view.setVisibility(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$f */
    static final class C77647f extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77641b f174153a;

        static {
            Covode.recordClassIndex(90688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77647f(C77641b bVar) {
            super(1);
            this.f174153a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            this.f174153a.f174136b.mo121177a();
            this.f174153a.f174136b.mo121180b(true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$h */
    static final class C77649h extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77641b f174155a;

        static {
            Covode.recordClassIndex(90690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77649h(C77641b bVar) {
            super(1);
            this.f174155a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            C77609c.m135600b(this.f174155a.mo121172b(), "click_cross");
            this.f174155a.mo121173c().mo121089a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$l */
    static final class C77653l extends AbstractC89220m implements AbstractC89172b<C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77641b f174159a;

        static {
            Covode.recordClassIndex(90694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77653l(C77641b bVar) {
            super(1);
            this.f174159a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            this.f174159a.mo121175e().mo22654d(kVar2.f48283b.booleanValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$n */
    static final class C77655n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77641b f174161a;

        static {
            Covode.recordClassIndex(90696);
        }

        C77655n(C77641b bVar) {
            this.f174161a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            View$OnClickListenerC77666j jVar = this.f174161a.f174136b;
            if (num != null && num.intValue() == 0) {
                z = false;
            } else {
                z = true;
            }
            jVar.mo121178a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$e */
    static final class C77646e extends AbstractC89220m implements AbstractC89172b<C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77641b f174152a;

        static {
            Covode.recordClassIndex(90687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77646e(C77641b bVar) {
            super(1);
            this.f174152a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20521k kVar) {
            int i;
            C20521k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            View view = this.f174152a.f174136b.f52550n;
            C89219l.m154716b(view, "");
            if (kVar2.f48283b.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$i */
    static final class C77650i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77641b f174156a;

        static {
            Covode.recordClassIndex(90691);
        }

        C77650i(C77641b bVar) {
            this.f174156a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (!C72847c.m128639e(C75346e.m132154a(this.f174156a.mo121176f()))) {
                View view = this.f174156a.f174136b.f52550n;
                C89219l.m154716b(view, "");
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$b */
    static final class C77643b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77641b f174149a;

        static {
            Covode.recordClassIndex(90684);
        }

        C77643b(C77641b bVar) {
            this.f174149a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C78599g gVar = (C78599g) obj;
            if (Build.VERSION.SDK_INT >= 29) {
                ((C23160g) this.f174149a.f174137c.getValue()).mo37653b();
            } else {
                new C23160g(C2556g.m7473b(this.f174149a)).mo37652a();
            }
            if (!C89219l.m154714a((Object) this.f174149a.mo121176f().mo23122d().mo6996a(), (Object) true)) {
                View$OnClickListenerC77666j jVar = this.f174149a.f174136b;
                C89219l.m154716b(gVar, "");
                jVar.mo121179a(!gVar.f176643a, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$c */
    static final class C77644c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77641b f174150a;

        static {
            Covode.recordClassIndex(90685);
        }

        C77644c(C77641b bVar) {
            this.f174150a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14178e eVar = (C14178e) obj;
            C77561a b = this.f174150a.mo121172b();
            C89219l.m154716b(eVar, "");
            C89219l.m154721d(b, "");
            C89219l.m154721d(eVar, "");
            C80322d.m139251a("flip_camera", new C84425b().mo129406a("creation_id", b.f173950b).mo129406a("shoot_way", b.f173951c).mo129406a("to_status", eVar.f34452c).mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_page", "story_shoot_page").mo129406a("shoot_tab_name", "story").mo129406a("camera_type", eVar.f34451b).mo129404a("duration", eVar.f34450a).f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$g */
    static final class C77648g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77641b f174154a;

        static {
            Covode.recordClassIndex(90689);
        }

        C77648g(C77641b bVar) {
            this.f174154a = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            View$OnClickListenerC77666j jVar = this.f174154a.f174136b;
            C89219l.m154716b(bool, "");
            boolean booleanValue = bool.booleanValue();
            ImageView[] imageViewArr = new ImageView[3];
            ImageView imageView = jVar.f174177e;
            if (imageView == null) {
                C89219l.m154710a("backButton");
            }
            imageViewArr[0] = imageView;
            ImageView imageView2 = jVar.f174175c;
            if (imageView2 == null) {
                C89219l.m154710a("flashButton");
            }
            imageViewArr[1] = imageView2;
            ImageView imageView3 = jVar.f174176d;
            if (imageView3 == null) {
                C89219l.m154710a("beautyButton");
            }
            imageViewArr[2] = imageView3;
            for (T t : C89070n.m154522b(imageViewArr)) {
                if (booleanValue) {
                    i = 4;
                } else {
                    i = 0;
                }
                t.setVisibility(i);
                t.setEnabled(!booleanValue);
            }
            if (((AbstractC14177d) jVar.f174174b.mo23374a(jVar, View$OnClickListenerC77666j.f174172a[0])).mo22757K() == 1) {
                ImageView imageView4 = jVar.f174175c;
                if (imageView4 == null) {
                    C89219l.m154710a("flashButton");
                }
                imageView4.setEnabled(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$j */
    static final class C77651j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77641b f174157a;

        static {
            Covode.recordClassIndex(90692);
        }

        C77651j(C77641b bVar) {
            this.f174157a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            AbstractC14100b bVar = (AbstractC14100b) obj;
            if (bVar.f34299a == EnumC14101c.BEAUTY_ON_OFF && (bVar instanceof C14102d)) {
                C77561a b = this.f174157a.mo121172b();
                boolean z = ((C14102d) bVar).f34301b;
                C89219l.m154721d(b, "");
                C84425b a = new C84425b().mo129406a("creation_id", b.f173950b).mo129406a("shoot_way", b.f173951c).mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_page", "story_shoot_page").mo129406a("shoot_tab_name", "story");
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                C39162r.m79460a("click_beautify_entrance", a.mo129406a("to_status", str).f188764a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$k */
    static final class C77652k extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77641b f174158a;

        static {
            Covode.recordClassIndex(90693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77652k(C77641b bVar) {
            super(1);
            this.f174158a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            boolean z;
            String str;
            C89219l.m154721d(pVar, "");
            int O = this.f174158a.mo121174d().mo22761O();
            this.f174158a.mo121174d().mo22777a(O);
            C77561a b = this.f174158a.mo121172b();
            if (O != 0) {
                z = true;
            } else {
                z = false;
            }
            C89219l.m154721d(b, "");
            C84425b a = new C84425b().mo129406a("creation_id", b.f173950b).mo129406a("shoot_way", b.f173951c).mo129406a("shoot_page", "story_shoot_page").mo129406a("shoot_tab_name", "story");
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            C80322d.m139251a("light", a.mo129406a("to_status", str).f188764a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$m */
    static final class C77654m extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77641b f174160a;

        static {
            Covode.recordClassIndex(90695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77654m(C77641b bVar) {
            super(1);
            this.f174160a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            PrivacyCert build;
            C89219l.m154721d(pVar, "");
            this.f174160a.mo121174d().mo22788a(false);
            boolean a = C89219l.m154714a((Object) this.f174160a.mo121176f().mo23122d().mo6996a(), (Object) true);
            AbstractC14177d d = this.f174160a.mo121174d();
            if (a) {
                build = PrivacyCert.Builder.Companion.with("bpea-308").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
            } else {
                build = PrivacyCert.Builder.Companion.with("bpea-309").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
            }
            int unused = d.mo22774a(false, build, (String) null);
            return C89391z.f203057a;
        }
    }

    public C77641b(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f174138d = bVar;
        this.f174147m = fVar;
        this.f174136b = new View$OnClickListenerC77666j(getDiContainer());
        this.f174140f = C21572a.m40504a(getDiContainer(), C77561a.class);
        this.f174141g = C89250i.m154773a((AbstractC89171a) new C77658q(this));
        this.f174142h = C89250i.m154773a((AbstractC89171a) new C77656o(this));
        this.f174143i = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f174144j = C21572a.m40504a(getDiContainer(), AbstractC14099a.class);
        this.f174145k = C21572a.m40504a(getDiContainer(), AbstractC14330a.class);
        this.f174146l = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        this.f174137c = C89250i.m154773a((AbstractC89171a) new C77657p(this));
    }
}

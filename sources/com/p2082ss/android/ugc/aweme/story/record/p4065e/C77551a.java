package com.p2082ss.android.ugc.aweme.story.record.p4065e;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22233n;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.record.AbstractC66808b;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i;
import com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.p2082ss.android.ugc.aweme.story.record.p4063c.C77493a;
import com.p2082ss.android.ugc.aweme.story.record.p4066f.C77561a;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77609c;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.Objects;
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

/* renamed from: com.ss.android.ugc.aweme.story.record.e.a */
public final class C77551a extends AbstractC2562j<AbstractC2547b> implements AbstractC2547b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f173928a = {new C89232y(C77551a.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new C89232y(C77551a.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C77551a.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C77551a.class, "recordContext", "getRecordContext()Lcom/ss/android/ugc/aweme/story/record/model/StoryRecordContext;", 0)};

    /* renamed from: b */
    final AbstractC89248d f173929b;

    /* renamed from: c */
    AbstractC22233n f173930c;

    /* renamed from: d */
    public boolean f173931d;

    /* renamed from: e */
    public boolean f173932e;

    /* renamed from: f */
    public final int f173933f = R.id.e9z;

    /* renamed from: g */
    private final AbstractC89248d f173934g;

    /* renamed from: h */
    private final AbstractC89248d f173935h;

    /* renamed from: i */
    private final AbstractC89248d f173936i;

    /* renamed from: j */
    private final AbstractC89244h f173937j;

    /* renamed from: k */
    private final AbstractC22186b f173938k;

    /* renamed from: l */
    private final C21582f f173939l;

    static {
        Covode.recordClassIndex(90588);
    }

    /* renamed from: a */
    public final AbstractC14315b mo121115a() {
        return (AbstractC14315b) this.f173934g.mo23374a(this, f173928a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC14177d mo121116b() {
        return (AbstractC14177d) this.f173935h.mo23374a(this, f173928a[2]);
    }

    /* renamed from: c */
    public final C77561a mo121117c() {
        return (C77561a) this.f173936i.mo23374a(this, f173928a[3]);
    }

    /* renamed from: d */
    public final StoryRecordBaseViewModel mo121118d() {
        return (StoryRecordBaseViewModel) this.f173937j.getValue();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final AbstractC2547b getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f173939l;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e.a$f */
    static final class C77557f extends AbstractC89220m implements AbstractC89171a<StoryRecordBaseViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77551a f173945a;

        static {
            Covode.recordClassIndex(90594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77557f(C77551a aVar) {
            super(0);
            this.f173945a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            Activity b = C2556g.m7473b(this.f173945a);
            Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) b).mo33800a(StoryRecordBaseViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e.a$c */
    static final class C77554c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77551a f173942a;

        static {
            Covode.recordClassIndex(90591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77554c(C77551a aVar) {
            super(0);
            this.f173942a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C77551a aVar = this.f173942a;
            aVar.mo121116b().mo22742b(false, PrivacyCert.Builder.Companion.with("bpea-301").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            aVar.mo121116b().mo22750D().setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* renamed from: e */
    public final void mo121119e() {
        AbstractC22233n nVar = this.f173930c;
        if (nVar != null) {
            nVar.mo36341b();
        }
        mo121116b().mo22740a(false, PrivacyCert.Builder.Companion.with("bpea-303").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        this.f173931d = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e.a$d */
    static final class C77555d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77551a f173943a;

        static {
            Covode.recordClassIndex(90592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77555d(C77551a aVar) {
            super(0);
            this.f173943a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C77551a aVar = this.f173943a;
            AbstractC22233n nVar = aVar.f173930c;
            if (nVar != null) {
                nVar.mo36341b();
            }
            aVar.mo121116b().mo22740a(false, PrivacyCert.Builder.Companion.with("bpea-302").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            Object a = aVar.getDiContainer().mo35249a((Type) AbstractC14330a.class, (String) null);
            C89219l.m154716b(a, "");
            if (!C75466g.m132369u(C75346e.m132154a((AbstractC75649i) a))) {
                aVar.mo121118d().mo121091a(false);
            }
            aVar.f173931d = false;
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        AbstractC88412b unused = mo121118d().mo33677a(this, C77558b.f173946a, new C20370ah(), new C77552a(this));
        AbstractC14315b a = mo121115a();
        if (a != null) {
            a.mo23097a(new C77553b(this), 0);
        }
        AbstractC66808b albumService = C63244g.m114602a().mo73284l().getAlbumService();
        Activity b = C2556g.m7473b(this);
        Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        albumService.subscribeAlbumOpen((ActivityC0945e) b, new C77554c(this));
        AbstractC66808b albumService2 = C63244g.m114602a().mo73284l().getAlbumService();
        Activity b2 = C2556g.m7473b(this);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        albumService2.subscribeAlbumClose((ActivityC0945e) b2, new C77555d(this));
        AbstractC88412b unused2 = mo121118d().mo33677a(this, C77559c.f173947a, new C20370ah(), new C77556e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e.a$b */
    public static final class C77553b extends AbstractC14318d {

        /* renamed from: a */
        final /* synthetic */ C77551a f173941a;

        static {
            Covode.recordClassIndex(90590);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77553b(C77551a aVar) {
            this.f173941a = aVar;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: b */
        public final boolean mo23057b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            AbstractC14318d dVar;
            if (motionEvent == null || motionEvent2 == null) {
                return super.mo23057b(motionEvent, motionEvent2, f, f2);
            }
            AbstractC14315b a = this.f173941a.mo121115a();
            if (a != null) {
                dVar = a.mo23095a(6);
            } else {
                dVar = null;
            }
            if (dVar != null && dVar.mo23057b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            if (motionEvent2.getY() < motionEvent.getY() && Math.abs(motionEvent.getY() - motionEvent2.getY()) > Math.abs(motionEvent.getX() - motionEvent2.getX())) {
                C77551a aVar = this.f173941a;
                if (((AbstractC14193m) aVar.f173929b.mo23374a(aVar, C77551a.f173928a[1])).mo22894d().f7727a.getValue().booleanValue() || !this.f173941a.f173932e || !C77493a.f173829a) {
                    return false;
                }
                this.f173941a.mo121118d().mo121092b(true);
                C77609c.m135597a(this.f173941a.mo121117c(), "slide_up");
                return false;
            } else if (motionEvent2.getX() >= motionEvent.getX() || Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY()) || !this.f173941a.f173932e) {
                return false;
            } else {
                this.f173941a.mo121118d().mo33689c(StoryRecordBaseViewModel.C77456e.f173784a);
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e.a$e */
    static final class C77556e extends AbstractC89220m implements AbstractC89172b<C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77551a f173944a;

        static {
            Covode.recordClassIndex(90593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77556e(C77551a aVar) {
            super(1);
            this.f173944a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            this.f173944a.f173932e = !kVar2.f48283b.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e.a$a */
    static final class C77552a extends AbstractC89220m implements AbstractC89172b<C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77551a f173940a;

        static {
            Covode.recordClassIndex(90589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77552a(C77551a aVar) {
            super(1);
            this.f173940a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            if (!kVar2.f48283b.booleanValue()) {
                this.f173940a.mo121119e();
            } else if (!this.f173940a.f173931d) {
                C77551a aVar = this.f173940a;
                aVar.mo121118d().mo121091a(true);
                AbstractC66808b albumService = C63244g.m114602a().mo73284l().getAlbumService();
                ShortVideoContext e = aVar.mo121117c().mo121126e();
                Activity b = C2556g.m7473b(aVar);
                Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                int i = aVar.f173933f;
                Object a = aVar.getDiContainer().mo35247a(AbstractC84919c.class);
                C89219l.m154716b(a, "");
                Bundle bundle = new Bundle();
                bundle.putParcelable("key_story_edit_context", aVar.mo121117c().mo121127f());
                aVar.f173930c = albumService.openAlbum(e, (ActivityC0945e) b, i, (AbstractC84919c) a, bundle);
                aVar.f173931d = true;
            }
            return C89391z.f203057a;
        }
    }

    public C77551a(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f173938k = bVar;
        this.f173939l = fVar;
        this.f173934g = C21572a.m40505b(getDiContainer(), AbstractC14315b.class);
        this.f173929b = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        this.f173935h = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f173936i = C21572a.m40504a(getDiContainer(), C77561a.class);
        this.f173937j = C89250i.m154773a((AbstractC89171a) new C77557f(this));
        this.f173932e = true;
    }
}

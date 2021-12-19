package com.p2082ss.android.ugc.aweme.story.record.p4068h;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.TextView;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72479d;
import com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.p2082ss.android.ugc.aweme.story.record.p4063c.C77494b;
import com.p2082ss.android.ugc.aweme.story.record.p4066f.C77561a;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77609c;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77610d;
import com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout;
import com.p2082ss.android.ugc.aweme.tools.C78600h;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
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

/* renamed from: com.ss.android.ugc.aweme.story.record.h.b */
public final class C77584b extends AbstractC2562j<AbstractC77583a> implements AbstractC21566a, AbstractC77583a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f174003a = {new C89232y(C77584b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C77584b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C77584b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0)};

    /* renamed from: b */
    public final C77594d f174004b;

    /* renamed from: c */
    final AbstractC89244h f174005c;

    /* renamed from: d */
    final AbstractC89248d f174006d;

    /* renamed from: e */
    final AbstractC89244h f174007e;

    /* renamed from: f */
    public final AbstractC22186b f174008f;

    /* renamed from: g */
    public final int f174009g = R.id.dgc;

    /* renamed from: h */
    private final AbstractC89248d f174010h;

    /* renamed from: i */
    private final AbstractC89248d f174011i;

    /* renamed from: j */
    private final C21582f f174012j;

    static {
        Covode.recordClassIndex(90621);
    }

    /* renamed from: b */
    public final AbstractC14193m mo121142b() {
        return (AbstractC14193m) this.f174010h.mo23374a(this, f174003a[0]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC77583a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f174012j;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.b$a */
    public static final class C77585a implements StoryRecordLayout.AbstractC77674c {

        /* renamed from: a */
        final /* synthetic */ C77584b f174013a;

        static {
            Covode.recordClassIndex(90622);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.AbstractC77674c
        /* renamed from: a */
        public final void mo121143a() {
            this.f174013a.mo121142b().mo22872a(0);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.AbstractC77674c
        /* renamed from: b */
        public final void mo121145b() {
            C14207x xVar = new C14207x("record end");
            xVar.f34485a = 5;
            AbstractC14193m b = this.f174013a.mo121142b();
            C89219l.m154716b(xVar, "");
            b.mo22889b(xVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.AbstractC77674c
        /* renamed from: c */
        public final void mo121146c() {
            C72479d.m127866a(C72477c.f162474a).mo114741c();
            this.f174013a.mo121142b().mo22880a(new C78600h("take photo"));
            MediaPlayer mediaPlayer = (MediaPlayer) this.f174013a.f174007e.getValue();
            if (mediaPlayer != null) {
                C77610d.m135604a(mediaPlayer, C2556g.m7474c(this.f174013a));
            }
            Object a = this.f174013a.getDiContainer().mo35249a((Type) C77561a.class, (String) null);
            C89219l.m154716b(a, "");
            C77609c.m135598a((C77561a) a, false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77585a(C77584b bVar) {
            this.f174013a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.AbstractC77674c
        /* renamed from: a */
        public final void mo121144a(float f, float f2) {
            C77584b bVar = this.f174013a;
            ((AbstractC14177d) bVar.f174006d.mo23374a(bVar, C77584b.f174003a[1])).mo22805b(f, f2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.b$g */
    static final class C77591g extends AbstractC89220m implements AbstractC89171a<MediaPlayer> {

        /* renamed from: a */
        final /* synthetic */ C77584b f174019a;

        static {
            Covode.recordClassIndex(90628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77591g(C77584b bVar) {
            super(0);
            this.f174019a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MediaPlayer invoke() {
            return C77610d.m135602a(C2556g.m7474c(this.f174019a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.b$h */
    static final class C77592h extends AbstractC89220m implements AbstractC89171a<StoryRecordBaseViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77584b f174020a;

        static {
            Covode.recordClassIndex(90629);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77592h(C77584b bVar) {
            super(0);
            this.f174020a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            JediViewModel a = C20531t.m38716a(C22228c.m41832b(this.f174020a.f174008f)).mo33800a(StoryRecordBaseViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.p4068h.AbstractC77583a
    /* renamed from: a */
    public final String mo121141a() {
        C77594d dVar = this.f174004b;
        if (dVar.f174035t) {
            return "handsfree";
        }
        StoryRecordLayout storyRecordLayout = dVar.f174031i;
        if (storyRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        if (storyRecordLayout.getRecordingMode() == StoryRecordLayout.EnumC77675d.CLICK_RECORDING) {
            return "single_click";
        }
        return "long_press";
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f174008f.mo36387a(this.f174009g, this.f174004b, "StoryRecordControlProgressScene");
        this.f174004b.f174024b = new C77585a(this);
        mo121142b().mo22906m().mo6997a(this, new C77586b(this));
        ((AbstractC14330a) this.f174011i.mo23374a(this, f174003a[2])).mo23122d().mo6997a(this, new C77587c(this));
        mo121142b().mo22908o().mo7038b(this, new C77588d(this));
        mo121142b().mo22901h().mo6997a(this, new C77589e(this));
        AbstractC88412b unused = ((BaseJediViewModel) C20531t.m38716a(C22228c.m41832b(this.f174008f)).mo33800a(StoryRecordBaseViewModel.class)).mo33677a(this, C77593c.f174021a, new C20370ah(), new C77590f(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.b$c */
    static final class C77587c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77584b f174015a;

        static {
            Covode.recordClassIndex(90624);
        }

        C77587c(C77584b bVar) {
            this.f174015a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            View view = this.f174015a.f174004b.f52550n;
            C89219l.m154716b(view, "");
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.b$e */
    static final class C77589e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77584b f174017a;

        static {
            Covode.recordClassIndex(90626);
        }

        C77589e(C77584b bVar) {
            this.f174017a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Object a = this.f174017a.getDiContainer().mo35249a((Type) C77561a.class, (String) null);
            C89219l.m154716b(a, "");
            C77609c.m135598a((C77561a) a, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.b$b */
    static final class C77586b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77584b f174014a;

        static {
            Covode.recordClassIndex(90623);
        }

        C77586b(C77584b bVar) {
            this.f174014a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14207x xVar = (C14207x) obj;
            C72479d.m127866a(C72477c.f162474a).mo114741c();
            C89219l.m154716b(xVar, "");
            if (xVar.f34485a != 5) {
                this.f174014a.mo121142b().mo22880a(new C78600h("stop_record"));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.b$d */
    static final class C77588d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77584b f174016a;

        static {
            Covode.recordClassIndex(90625);
        }

        C77588d(C77584b bVar) {
            this.f174016a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14201t tVar = (C14201t) obj;
            if (tVar != null) {
                C77594d dVar = this.f174016a.f174004b;
                float f = (((float) tVar.f34477b) * 100.0f) / 15000.0f;
                StoryRecordLayout storyRecordLayout = dVar.f174031i;
                if (storyRecordLayout == null) {
                    C89219l.m154710a("recordLayout");
                }
                storyRecordLayout.f174203b = f;
                storyRecordLayout.invalidate();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.b$f */
    static final class C77590f extends AbstractC89220m implements AbstractC89172b<C20523m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77584b f174018a;

        static {
            Covode.recordClassIndex(90627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77590f(C77584b bVar) {
            super(1);
            this.f174018a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20523m mVar) {
            boolean z;
            C20523m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            C77594d dVar = this.f174018a.f174004b;
            dVar.f174035t = false;
            dVar.f174036u = false;
            if (C77494b.f173831a) {
                View view = dVar.f174028f;
                if (view == null) {
                    C89219l.m154710a("lockLayout");
                }
                view.setVisibility(8);
                View view2 = dVar.f174030h;
                if (view2 == null) {
                    C89219l.m154710a("lockedIcon");
                }
                view2.setScaleX(0.0f);
                View view3 = dVar.f174030h;
                if (view3 == null) {
                    C89219l.m154710a("lockedIcon");
                }
                view3.setScaleY(0.0f);
                View view4 = dVar.f174030h;
                if (view4 == null) {
                    C89219l.m154710a("lockedIcon");
                }
                view4.setAlpha(1.0f);
                View view5 = dVar.f174029g;
                if (view5 == null) {
                    C89219l.m154710a("unLockIcon");
                }
                view5.setAlpha(1.0f);
                TextView textView = dVar.f174034l;
                if (textView == null) {
                    C89219l.m154710a("releaseHint");
                }
                textView.setAlpha(0.0f);
                TextView textView2 = dVar.f174033k;
                if (textView2 == null) {
                    C89219l.m154710a("dragLeftHint");
                }
                textView2.setAlpha(0.0f);
            }
            TextView textView3 = dVar.f174032j;
            if (textView3 == null) {
                C89219l.m154710a("iDleHint");
            }
            textView3.setAlpha(1.0f);
            ((C77561a) dVar.f174025c.mo23374a(dVar, C77594d.f174022a[0])).f173956h = null;
            StoryRecordLayout storyRecordLayout = dVar.f174031i;
            if (storyRecordLayout == null) {
                C89219l.m154710a("recordLayout");
            }
            storyRecordLayout.setState(StoryRecordLayout.EnumC77676e.IDLE);
            StoryRecordLayout storyRecordLayout2 = dVar.f174031i;
            if (storyRecordLayout2 == null) {
                C89219l.m154710a("recordLayout");
            }
            storyRecordLayout2.setRecordingMode(StoryRecordLayout.EnumC77675d.LONG_PRESS_RECORDING);
            AbstractC14193m b = this.f174018a.mo121142b();
            if (mVar2.f48283b.intValue() == 10) {
                z = true;
            } else {
                z = false;
            }
            b.mo22893c(z);
            ((StoryRecordBaseViewModel) this.f174018a.f174005c.getValue()).mo121091a(false);
            return C89391z.f203057a;
        }
    }

    public C77584b(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f174008f = bVar;
        this.f174012j = fVar;
        this.f174004b = new C77594d(getDiContainer());
        this.f174005c = C89250i.m154773a((AbstractC89171a) new C77592h(this));
        this.f174010h = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        this.f174006d = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f174011i = C21572a.m40504a(getDiContainer(), AbstractC14330a.class);
        this.f174007e = C89250i.m154773a((AbstractC89171a) new C77591g(this));
    }
}

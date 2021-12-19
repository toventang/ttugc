package com.p2082ss.android.ugc.aweme.story.record.dockbar;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.p2082ss.android.ugc.aweme.story.record.p4066f.C77561a;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77609c;
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

/* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.b */
public final class C77501b extends AbstractC2562j<AbstractC77500a> implements AbstractC21566a, AbstractC77500a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f173842a = {new C89232y(C77501b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0), new C89232y(C77501b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b */
    public final C77512f f173843b;

    /* renamed from: c */
    public final AbstractC22186b f173844c;

    /* renamed from: d */
    public final int f173845d = R.id.dgc;

    /* renamed from: e */
    private final AbstractC89244h f173846e;

    /* renamed from: f */
    private final AbstractC89244h f173847f;

    /* renamed from: g */
    private final AbstractC89248d f173848g;

    /* renamed from: h */
    private final AbstractC89248d f173849h;

    /* renamed from: i */
    private final C21582f f173850i;

    static {
        Covode.recordClassIndex(90538);
    }

    /* renamed from: a */
    public final StoryRecordBaseViewModel mo121106a() {
        return (StoryRecordBaseViewModel) this.f173847f.getValue();
    }

    /* renamed from: b */
    public final AbstractC14330a mo121107b() {
        return (AbstractC14330a) this.f173848g.mo23374a(this, f173842a[0]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC77500a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f173850i;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.b$f */
    static final class C77507f extends AbstractC89220m implements AbstractC89171a<StoryRecordBaseViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77501b f173856a;

        static {
            Covode.recordClassIndex(90544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77507f(C77501b bVar) {
            super(0);
            this.f173856a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            Activity b = C2556g.m7473b(this.f173856a);
            Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) b).mo33800a(StoryRecordBaseViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.b$g */
    static final class C77508g extends AbstractC89220m implements AbstractC89171a<StoryRecordDockBarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77501b f173857a;

        static {
            Covode.recordClassIndex(90545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77508g(C77501b bVar) {
            super(0);
            this.f173857a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordDockBarViewModel invoke() {
            JediViewModel a = C20531t.m38716a(C22228c.m41832b(this.f173857a.f173844c)).mo33800a(StoryRecordDockBarViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f173844c.mo36387a(this.f173845d, this.f173843b, "StoryRecordDockBarScene");
        AbstractC88412b unused = ((StoryRecordDockBarViewModel) this.f173846e.getValue()).mo33677a(this, C77509c.f173858a, new C20370ah(), new C77502a(this));
        mo121107b().mo23122d().mo6997a(this, new C77503b(this));
        ((AbstractC14193m) this.f173849h.mo23374a(this, f173842a[1])).mo22901h().mo6997a(this, new C77504c(this));
        AbstractC88412b unused2 = mo121106a().mo33677a(this, C77510d.f173859a, new C20370ah(), new C77505d(this));
        AbstractC88412b unused3 = mo121106a().mo33677a(this, C77511e.f173860a, new C20370ah(), new C77506e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.b$c */
    static final class C77504c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77501b f173853a;

        static {
            Covode.recordClassIndex(90541);
        }

        C77504c(C77501b bVar) {
            this.f173853a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            View view = this.f173853a.f173843b.f52550n;
            C89219l.m154716b(view, "");
            view.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.b$e */
    static final class C77506e extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77501b f173855a;

        static {
            Covode.recordClassIndex(90543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77506e(C77501b bVar) {
            super(1);
            this.f173855a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            ImageView imageView = this.f173855a.f173843b.f173865d;
            if (imageView == null) {
                C89219l.m154710a("ivTool");
            }
            imageView.setImageResource(2131233944);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.b$a */
    static final class C77502a extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77501b f173851a;

        static {
            Covode.recordClassIndex(90539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77502a(C77501b bVar) {
            super(1);
            this.f173851a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            Object a = this.f173851a.getDiContainer().mo35249a((Type) C77561a.class, (String) null);
            C89219l.m154716b(a, "");
            C77609c.m135597a((C77561a) a, "click_button");
            this.f173851a.mo121106a().mo121092b(true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.b$b */
    static final class C77503b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77501b f173852a;

        static {
            Covode.recordClassIndex(90540);
        }

        C77503b(C77501b bVar) {
            this.f173852a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                View view = this.f173852a.f173843b.f52550n;
                C89219l.m154716b(view, "");
                view.setVisibility(8);
                return;
            }
            View view2 = this.f173852a.f173843b.f52550n;
            C89219l.m154716b(view2, "");
            view2.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.b$d */
    static final class C77505d extends AbstractC89220m implements AbstractC89172b<C20523m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77501b f173854a;

        static {
            Covode.recordClassIndex(90542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77505d(C77501b bVar) {
            super(1);
            this.f173854a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20523m mVar) {
            C89219l.m154721d(mVar, "");
            if (!C75466g.m132348b(this.f173854a.mo121107b().mo23127i())) {
                View view = this.f173854a.f173843b.f52550n;
                C89219l.m154716b(view, "");
                view.setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    public C77501b(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f173844c = bVar;
        this.f173850i = fVar;
        this.f173843b = new C77512f(getDiContainer());
        this.f173846e = C89250i.m154773a((AbstractC89171a) new C77508g(this));
        this.f173847f = C89250i.m154773a((AbstractC89171a) new C77507f(this));
        this.f173848g = C21572a.m40504a(getDiContainer(), AbstractC14330a.class);
        this.f173849h = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
    }
}

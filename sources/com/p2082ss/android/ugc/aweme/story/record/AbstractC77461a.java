package com.p2082ss.android.ugc.aweme.story.record;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1213t;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c;
import com.p2082ss.android.ugc.aweme.story.record.p4067g.AbstractC77563a;
import com.p2082ss.android.ugc.aweme.story.record.p4067g.C77564b;
import com.p2082ss.android.ugc.aweme.story.record.p4067g.C77570d;
import com.p2082ss.android.ugc.aweme.view.AbstractC81298w;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.a */
public abstract class AbstractC77461a extends AbstractC81298w implements AbstractC76616c {

    /* renamed from: b */
    public EnterStoryParam f173789b;

    /* renamed from: c */
    public C77564b f173790c;

    /* renamed from: d */
    private final AbstractC89244h f173791d = C89250i.m154773a((AbstractC89171a) new C77465d(this));

    static {
        Covode.recordClassIndex(90496);
    }

    @Override // com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: E */
    public final void mo62771E() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract boolean mo121094F();

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo121095G();

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: a */
    public void mo120318a(int i, int i2, Intent intent) {
    }

    @Override // com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: b */
    public void mo120627b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: b */
    public boolean mo120320b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: c */
    public void mo120321c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.a$d */
    static final class C77465d extends AbstractC89220m implements AbstractC89171a<StoryRecordBaseViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC77461a f173796a;

        static {
            Covode.recordClassIndex(90500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77465d(AbstractC77461a aVar) {
            super(0);
            this.f173796a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            JediViewModel a = C20531t.m38716a(C22228c.m41832b(this.f173796a)).mo33800a(StoryRecordBaseViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: a */
    public void mo120626a(boolean z) {
        C77564b bVar = this.f173790c;
        if (bVar != null) {
            bVar.f173962b.mo121136b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.record.a$b */
    public static final class C77463b extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC77461a f173794a;

        static {
            Covode.recordClassIndex(90498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77463b(AbstractC77461a aVar) {
            super(1);
            this.f173794a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            Context s = this.f173794a.mo36485s();
            C89219l.m154716b(s, "");
            if (C77570d.m135569a(s)) {
                this.f173794a.mo121095G();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.record.a$c */
    public static final class C77464c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ AbstractC77461a f173795a;

        static {
            Covode.recordClassIndex(90499);
        }

        C77464c(AbstractC77461a aVar) {
            this.f173795a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC1196i lifecycle = this.f173795a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
                this.f173795a.mo121095G();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.a$a */
    public static final class C77462a extends AbstractC21603p<C77564b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f173792a;

        /* renamed from: b */
        final /* synthetic */ AbstractC77461a f173793b;

        static {
            Covode.recordClassIndex(90497);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77564b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            AbstractC77461a aVar = this.f173793b;
            ActivityC0945e b = C22228c.m41832b(this.f173793b);
            AbstractC77461a aVar2 = this.f173793b;
            aVar.f173790c = new C77564b(b, aVar2, R.id.dnh, fVar, aVar2.mo121094F());
            C77564b bVar = this.f173793b.f173790c;
            if (bVar == null) {
                C89219l.m154715b();
            }
            return bVar;
        }

        public C77462a(C2553d dVar, AbstractC77461a aVar) {
            this.f173792a = dVar;
            this.f173793b = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: a */
    public void mo120319a(EnterStoryParam enterStoryParam) {
        EnterStoryParam enterStoryParam2;
        C89219l.m154721d(enterStoryParam, "");
        EnterStoryParam enterStoryParam3 = this.f173789b;
        if (enterStoryParam3 != null) {
            enterStoryParam2 = EnterStoryParam.copy$default(enterStoryParam3, null, enterStoryParam.getEnterMethod(), enterStoryParam.getEnterFrom(), false, false, enterStoryParam.isWestWindowExist(), false, 89, null);
        } else {
            enterStoryParam2 = null;
        }
        this.f173789b = enterStoryParam2;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public void mo22704a(Bundle bundle) {
        EnterStoryParam enterStoryParam;
        C1213t<Boolean> tVar;
        super.mo22704a(bundle);
        Bundle bundle2 = this.f52554r;
        if (bundle2 != null) {
            enterStoryParam = (EnterStoryParam) bundle2.getParcelable("enter_story_param");
        } else {
            enterStoryParam = null;
        }
        this.f173789b = enterStoryParam;
        Context s = mo36485s();
        C89219l.m154716b(s, "");
        if (!C77570d.m135569a(s)) {
            C2551b bVar = new C2551b(C2552c.m7462a(this));
            C2553d dVar = new C2553d();
            AlsLogicContainer alsLogicContainer = bVar.f7720a;
            alsLogicContainer.f7696d.mo35260a(C77564b.class, (String) null, (AbstractC21603p) new C77462a(dVar, this));
            alsLogicContainer.mo7005a(AbstractC77563a.class, C77564b.class);
            bVar.mo7031a();
        }
        AbstractC88412b unused = ((StoryRecordBaseViewModel) this.f173791d.getValue()).mo33677a(this, C77479b.f173813a, new C20370ah(), new C77463b(this));
        C77564b bVar2 = this.f173790c;
        if (bVar2 != null && (tVar = bVar2.f173961a) != null) {
            tVar.observe(this, new C77464c(this));
        }
    }
}

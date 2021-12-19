package com.p2082ss.android.ugc.aweme.story.record.p4067g;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1213t;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63198aw;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.g.b */
public final class C77564b extends AbstractC2562j<AbstractC77563a> implements AbstractC77563a {

    /* renamed from: a */
    public final C1213t<Boolean> f173961a;

    /* renamed from: b */
    public final C77574e f173962b;

    /* renamed from: c */
    public final ActivityC0945e f173963c;

    /* renamed from: d */
    public final int f173964d;

    /* renamed from: e */
    public final C21582f f173965e;

    /* renamed from: f */
    private final AbstractC89244h f173966f;

    /* renamed from: g */
    private boolean f173967g;

    /* renamed from: h */
    private final AbstractC22186b f173968h;

    static {
        Covode.recordClassIndex(90601);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC77563a getApiComponent() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.p4067g.AbstractC77563a
    /* renamed from: a */
    public final void mo121128a() {
        this.f173962b.mo121136b();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.b$d */
    static final class C77568d extends AbstractC89220m implements AbstractC89171a<StoryRecordBaseViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77564b f173972a;

        static {
            Covode.recordClassIndex(90605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77568d(C77564b bVar) {
            super(0);
            this.f173972a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            ActivityC0945e eVar = this.f173972a.f173963c;
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a(eVar).mo33800a(StoryRecordBaseViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onResume() {
        super.onResume();
        if (this.f173967g && C77570d.m135569a(this.f173963c)) {
            mo121130c();
        }
    }

    /* renamed from: b */
    public final void mo121129b() {
        this.f173962b.mo121135a(true);
        ActivityC0945e eVar = this.f173963c;
        C77567c cVar = new C77567c(this);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        if (C63253l.f143623a.mo73307c().mo101671a()) {
            C63253l.f143623a.mo73307c().mo101758a(eVar, cVar, "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    /* renamed from: c */
    public final void mo121130c() {
        this.f173961a.setValue(true);
        if (this.f173967g && this.f173968h.mo36394b(this.f173962b) != null) {
            this.f173968h.mo36400c(this.f173962b);
            this.f173967g = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.b$b */
    static final class C77566b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77564b f173970a;

        static {
            Covode.recordClassIndex(90603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77566b(C77564b bVar) {
            super(0);
            this.f173970a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C77564b bVar = this.f173970a;
            AbstractC63198aw awVar = null;
            if (C63253l.f143623a.mo73307c().mo101671a()) {
                String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
                int i = 0;
                while (true) {
                    if (i >= 3) {
                        bVar.mo121129b();
                        break;
                    }
                    String str = strArr[i];
                    if (C63253l.f143623a.mo73307c().mo101670a((Context) bVar.f173963c, str) == 0 || C63253l.f143623a.mo73307c().mo101672a((Activity) bVar.f173963c, str)) {
                        i++;
                    } else {
                        AbstractC63264v b = C63244g.m114602a().mo73274b();
                        if (b instanceof AbstractC63198aw) {
                            awVar = b;
                        }
                        AbstractC63198aw awVar2 = (AbstractC63198aw) awVar;
                        if (awVar2 != null) {
                            awVar2.mo101675d(bVar.f173963c);
                        }
                    }
                }
            } else {
                AbstractC63264v b2 = C63244g.m114602a().mo73274b();
                if (b2 instanceof AbstractC63198aw) {
                    awVar = b2;
                }
                AbstractC63198aw awVar3 = awVar;
                if (awVar3 != null) {
                    awVar3.mo101675d(bVar.f173963c);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        AbstractC88412b unused = ((StoryRecordBaseViewModel) this.f173966f.getValue()).mo33677a(this, C77569c.f173973a, new C20370ah(), new C77565a(this));
        Collection<Integer> values = C77570d.m135570b(this.f173963c).values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() != 0) {
                    this.f173968h.mo36387a(this.f173964d, this.f173962b, "StoryRecordPermissionScene");
                    this.f173967g = true;
                    return;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.b$c */
    public static final class C77567c implements AbstractC63264v.AbstractC63265a {

        /* renamed from: a */
        final /* synthetic */ C77564b f173971a;

        static {
            Covode.recordClassIndex(90604);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77567c(C77564b bVar) {
            this.f173971a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v.AbstractC63265a
        /* renamed from: a */
        public final void mo87657a(String[] strArr, int[] iArr) {
            if (iArr != null && iArr.length != 0 && strArr != null && strArr.length != 0) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        this.f173971a.mo121130c();
                        break;
                    } else if (iArr[i] != 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                this.f173971a.f173962b.mo121135a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.b$a */
    static final class C77565a extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77564b f173969a;

        static {
            Covode.recordClassIndex(90602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77565a(C77564b bVar) {
            super(1);
            this.f173969a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            if (C63253l.f143623a.mo73307c().mo101671a() && !C77570d.m135569a(this.f173969a.f173963c)) {
                this.f173969a.mo121129b();
            }
            return C89391z.f203057a;
        }
    }

    public /* synthetic */ C77564b(ActivityC0945e eVar, AbstractC22186b bVar, C21582f fVar) {
        this(eVar, bVar, R.id.e9z, fVar, false);
    }

    public C77564b(ActivityC0945e eVar, AbstractC22186b bVar, int i, C21582f fVar, boolean z) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f173963c = eVar;
        this.f173968h = bVar;
        this.f173964d = i;
        this.f173965e = fVar;
        this.f173961a = new C1213t<>();
        this.f173966f = C89250i.m154773a((AbstractC89171a) new C77568d(this));
        this.f173962b = new C77574e(z, new C77566b(this));
    }
}

package com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.p4031a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.story.edit.C76740a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.AbstractC77024e;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.C77009a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77130b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.a */
public final class C76815a extends AbstractC77130b<EditStickerViewModel> {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172398a = {new C89232y(C76815a.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/story/edit/preview/StoryEditPreviewApi;", 0), new C89232y(C76815a.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0), new C89232y(C76815a.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b */
    final AbstractC22186b f172399b;

    /* renamed from: c */
    public final int f172400c = R.id.asd;

    /* renamed from: d */
    private final AbstractC89244h f172401d;

    /* renamed from: f */
    private final AbstractC89248d f172402f;

    /* renamed from: k */
    private final AbstractC89248d f172403k;

    /* renamed from: l */
    private final AbstractC89248d f172404l;

    /* renamed from: m */
    private final AbstractC89244h f172405m;

    /* renamed from: n */
    private final AbstractC89171a<EditStickerViewModel> f172406n;

    static {
        Covode.recordClassIndex(89811);
    }

    /* renamed from: a */
    public final C76821b mo120453a() {
        return (C76821b) this.f172401d.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77130b
    /* renamed from: f */
    public final VEEditClipCluster mo120455f() {
        return (VEEditClipCluster) this.f172403k.mo23374a(this, f172398a[1]);
    }

    /* renamed from: g */
    public final VideoPublishEditModel mo120456g() {
        return (VideoPublishEditModel) this.f172404l.mo23374a(this, f172398a[2]);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditStickerViewModel> mo23031b() {
        return this.f172406n;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f172399b;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.a$e */
    static final class C76820e extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        public static final C76820e f172412a = new C76820e();

        static {
            Covode.recordClassIndex(89816);
        }

        C76820e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditStickerViewModel invoke() {
            return new EditStickerViewModel();
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77130b, com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77117a
    public final /* synthetic */ VEEditClipCluster cF_() {
        return cF_();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.a$a */
    public static final class C76816a extends AbstractC89220m implements AbstractC89171a<AbstractC77024e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172407a;

        static {
            Covode.recordClassIndex(89812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76816a(AbstractC21566a aVar) {
            super(0);
            this.f172407a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.f.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.AbstractC77024e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172407a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.f.e> r1 = com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.AbstractC77024e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.p4031a.C76815a.C76816a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77125f, com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        ((AbstractC76760e) this.f172402f.mo23374a(this, f172398a[0])).mo114817f().observe(this, new C76817b(this));
        ((AbstractC77024e) this.f172405m.getValue()).mo120563b().mo6997a(this, new C76818c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.a$d */
    static final class C76819d extends AbstractC89220m implements AbstractC89171a<C76821b> {

        /* renamed from: a */
        final /* synthetic */ C76815a f172410a;

        /* renamed from: b */
        final /* synthetic */ C21582f f172411b;

        static {
            Covode.recordClassIndex(89815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76819d(C76815a aVar, C21582f fVar) {
            super(0);
            this.f172410a = aVar;
            this.f172411b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76821b invoke() {
            StoryEditClipModel d = C77134a.m134739d(this.f172410a);
            if (d != null) {
                C76740a.m134325d(d, this.f172410a.mo120456g());
            }
            C76821b bVar = new C76821b(this.f172411b);
            AbstractC22186b bVar2 = this.f172410a.f172399b;
            int i = this.f172410a.f172400c;
            bVar.mo127708a((AbstractC14552j) this.f172410a.getDiContainer().mo35249a((Type) AbstractC14552j.class, (String) null));
            bVar.mo127709a((AbstractC45899e) this.f172410a.getDiContainer().mo35249a((Type) AbstractC45899e.class, (String) null));
            bVar.mo127711a((AbstractC82035ab) this.f172410a.getDiContainer().mo35249a((Type) AbstractC82035ab.class, (String) null));
            bVar2.mo36387a(i, bVar, "EditStickerScene");
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.a$c */
    static final class C76818c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C76815a f172409a;

        static {
            Covode.recordClassIndex(89814);
        }

        C76818c(C76815a aVar) {
            this.f172409a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            StoryEditClipModel d;
            if ((obj instanceof C77009a) && (d = C77134a.m134739d(this.f172409a)) != null) {
                C76740a.m134322b(this.f172409a.mo120456g(), d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.a$b */
    static final class C76817b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C76815a f172408a;

        static {
            Covode.recordClassIndex(89813);
        }

        C76817b(C76815a aVar) {
            this.f172408a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            ((EditStickerViewModel) this.f172408a.getApiComponent()).mo127674a(this.f172408a.mo120453a());
            StoryEditClipModel d = C77134a.m134739d(this.f172408a);
            if (d != null) {
                C77148a.m134764i(d);
            }
            this.f172408a.mo120453a().mo127718af();
            this.f172408a.mo120453a().mo127716ad();
            this.f172408a.mo120453a().mo127717ae();
            this.f172408a.getApiComponent().mo33690d(new EditStickerViewModel.C82586c());
            this.f172408a.getApiComponent().mo33690d(new EditStickerViewModel.C82591h());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76815a(C21582f fVar, AbstractC22186b bVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f172399b = bVar;
        this.f172401d = C89250i.m154773a((AbstractC89171a) new C76819d(this, fVar));
        this.f172402f = C21572a.m40504a(getDiContainer(), AbstractC76760e.class);
        this.f172403k = C21572a.m40504a(getDiContainer(), VEEditClipCluster.class);
        this.f172404l = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);
        this.f172405m = C89250i.m154774a(EnumC89331m.NONE, new C76816a(this));
        this.f172406n = C76820e.f172412a;
    }
}

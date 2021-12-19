package com.p2082ss.android.ugc.aweme.story.edit.business.p4030a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.editSticker.model.C45939c;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.p4031a.C76815a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.AbstractC77135b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77156c;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.d */
public final class C76836d extends AbstractC22186b implements AbstractC21566a, AbstractC77135b, AbstractC82035ab {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f172447b = {new C89232y(C76836d.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C76836d.class, "storySharedEditConfigure", "getStorySharedEditConfigure()Lcom/ss/android/ugc/aweme/story/edit/model/StorySharedEditConfigure;", 0), new C89232y(C76836d.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: c */
    public static final C76837a f172448c = new C76837a((byte) 0);

    /* renamed from: d */
    private final AbstractC89248d f172449d;

    /* renamed from: e */
    private final AbstractC89248d f172450e;

    /* renamed from: f */
    private final AbstractC89248d f172451f;

    /* renamed from: g */
    private boolean f172452g;

    /* renamed from: h */
    private final C21582f f172453h;

    static {
        Covode.recordClassIndex(89832);
    }

    /* renamed from: F */
    private final VideoPublishEditModel m134451F() {
        return (VideoPublishEditModel) this.f172449d.mo23374a(this, f172447b[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.d$a */
    public static final class C76837a {
        static {
            Covode.recordClassIndex(89833);
        }

        private C76837a() {
        }

        public /* synthetic */ C76837a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77117a
    public final /* synthetic */ VEEditClipCluster cF_() {
        return (VEEditClipCluster) this.f172451f.mo23374a(this, f172447b[2]);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        C21582f b = C2552c.m7464b(this);
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab
    /* renamed from: T */
    public final AbstractC70977bq mo87631T() {
        C77156c cVar = (C77156c) this.f172450e.mo23374a(this, f172447b[1]);
        StoryEditClipModel d = C77134a.m134739d(this);
        if (d == null) {
            C89219l.m154715b();
        }
        return cVar.mo120775a(d);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.d$c */
    static final class C76839c extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76836d f172456a;

        static {
            Covode.recordClassIndex(89835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76839c(C76836d dVar) {
            super(1);
            this.f172456a = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.d$c$a */
        public static final class C76840a extends AbstractC21603p<C76836d> {

            /* renamed from: a */
            final /* synthetic */ C76839c f172457a;

            static {
                Covode.recordClassIndex(89836);
            }

            public C76840a(C76839c cVar) {
                this.f172457a = cVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C76836d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f172457a.f172456a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C21597n.C21600a a = nVar2.mo35260a(C76836d.class, (String) null, (AbstractC21603p) new C76840a(this));
            C89219l.m154716b(a, "");
            a.mo35263a(AbstractC82035ab.class);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.d$b */
    public static final class C76838b extends AbstractC21603p<C76815a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f172454a;

        /* renamed from: b */
        final /* synthetic */ C76836d f172455b;

        static {
            Covode.recordClassIndex(89834);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C76815a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C76815a(fVar, this.f172455b);
        }

        public C76838b(C2553d dVar, C76836d dVar2) {
            this.f172454a = dVar;
            this.f172455b = dVar2;
        }
    }

    /* renamed from: a */
    public final <T> T mo120463a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        if (this.f172452g) {
            return (T) getDiContainer().mo35252b(cls, null);
        }
        return null;
    }

    public C76836d(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172453h = fVar;
        this.f172449d = C21572a.m40504a(fVar, VideoPublishEditModel.class);
        this.f172450e = C21572a.m40504a(fVar, C77156c.class);
        this.f172451f = C21572a.m40504a(fVar, VEEditClipCluster.class);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        C2556g.m7472a(this, new C76839c(this));
        C2551b bVar = new C2551b(C2552c.m7462a(this));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar.f7720a;
        alsLogicContainer.f7696d.mo35260a(C76815a.class, (String) null, (AbstractC21603p) new C76838b(dVar, this));
        alsLogicContainer.mo7005a(EditStickerViewModel.class, C76815a.class);
        bVar.mo7031a();
        this.f172452g = true;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab
    /* renamed from: a */
    public final void mo87638a(StickerItemModel stickerItemModel) {
        List<StickerItemModel> list;
        List<StickerItemModel> list2;
        C89219l.m154721d(stickerItemModel, "");
        int i = 1;
        if (m134451F().infoStickerModel != null) {
            InfoStickerModel infoStickerModel = m134451F().infoStickerModel;
            if (!(infoStickerModel == null || (list2 = infoStickerModel.stickers) == null)) {
                for (T t : list2) {
                    C89219l.m154716b(t, "");
                    if (C45939c.m88695a(t) && t.layerWeight > i) {
                        i = t.layerWeight;
                    }
                }
            }
            stickerItemModel.layerWeight += i;
            InfoStickerModel infoStickerModel2 = m134451F().infoStickerModel;
            if (!(infoStickerModel2 == null || (list = infoStickerModel2.stickers) == null)) {
                list.add(stickerItemModel);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("the infoStickerModel of tmp VideoPublishEditModel is null which is not allowed".toString());
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b1x, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }
}

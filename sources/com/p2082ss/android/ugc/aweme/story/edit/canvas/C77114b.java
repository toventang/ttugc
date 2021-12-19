package com.p2082ss.android.ugc.aweme.story.edit.canvas;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.canvas.C35369ac;
import com.p2082ss.android.ugc.aweme.canvas.C35394m;
import com.p2082ss.android.ugc.aweme.canvas.guide.EditPhotoCanvasPromptViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77130b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.canvas.b */
public final class C77114b extends AbstractC77130b<EditPhotoCanvasViewModel> {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172956a = {new C89232y(C77114b.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0)};

    /* renamed from: b */
    private final AbstractC89171a<EditPhotoCanvasViewModel> f172957b;

    /* renamed from: c */
    private final AbstractC89248d f172958c;

    /* renamed from: d */
    private boolean f172959d;

    /* renamed from: f */
    private C35394m f172960f;

    /* renamed from: k */
    private final AbstractC22186b f172961k;

    /* renamed from: l */
    private final int f172962l = R.id.c7m;

    /* renamed from: m */
    private final AbstractC89171a<AbstractC14552j> f172963m;

    static {
        Covode.recordClassIndex(90117);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditPhotoCanvasViewModel> mo23031b() {
        return this.f172957b;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f172961k;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.canvas.b$a */
    static final class C77115a extends AbstractC89220m implements AbstractC89171a<EditPhotoCanvasViewModel> {

        /* renamed from: a */
        public static final C77115a f172964a = new C77115a();

        static {
            Covode.recordClassIndex(90118);
        }

        C77115a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditPhotoCanvasViewModel invoke() {
            return new EditPhotoCanvasViewModel();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77125f, com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        List<StoryEditClipModel> clips = ((StoryEditModel) this.f172958c.mo23374a(this, f172956a[0])).getClips();
        if (!(clips instanceof Collection) || !clips.isEmpty()) {
            Iterator<T> it = clips.iterator();
            while (it.hasNext()) {
                if (m134700a((StoryEditClipModel) it.next())) {
                    this.f172959d = true;
                    C35394m mVar = new C35394m(getDiContainer(), this.f172963m);
                    this.f172961k.mo36387a(this.f172962l, mVar, "StoryEditCanvasScene");
                    this.f172960f = mVar;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m134700a(StoryEditClipModel storyEditClipModel) {
        if (storyEditClipModel.getVideoEditorType() == 11) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77125f
    /* renamed from: b */
    public final /* synthetic */ void mo120633b(VEEditClip vEEditClip) {
        C35394m mVar;
        AbstractC14552j a;
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        super.mo120633b(vEEditClip2);
        if (this.f172959d && m134700a(vEEditClip2.f172984g) && (mVar = this.f172960f) != null && (a = mVar.mo62313a()) != null) {
            C14544f fVar = mVar.f83519g;
            if (fVar == null) {
                C89219l.m154710a("gestureInteractItem");
            }
            a.mo23385b(fVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77125f
    /* renamed from: a */
    public final /* synthetic */ void mo120490a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        super.mo120490a(vEEditClip2);
        if (this.f172959d && m134700a(vEEditClip2.f172984g)) {
            C35394m mVar = this.f172960f;
            if (mVar != null) {
                mVar.mo62314a(vEEditClip2.f172984g.getClipId(), vEEditClip2.f172984g.getCanvasVideoData());
            }
            if (C35369ac.f83453a && !C71529w.m126421a("canvas_gesture")) {
                Activity b = C2556g.m7473b(this);
                Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                EditPhotoCanvasPromptViewModel.C35385a.m72412a((ActivityC0945e) b).mo62287a();
                C71529w.m126422b("canvas_gesture");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends com.bytedance.f.a.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77114b(C21582f fVar, AbstractC22186b bVar, AbstractC89171a<? extends AbstractC14552j> aVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f172961k = bVar;
        this.f172963m = aVar;
        this.f172957b = C77115a.f172964a;
        this.f172958c = C21572a.m40504a(getDiContainer(), StoryEditModel.class);
    }
}

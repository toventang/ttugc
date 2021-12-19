package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4037d;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.AbstractC77135b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.e */
public final class C76963e extends AbstractC22219j implements AbstractC21566a, AbstractC77135b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172683a = {new C89232y(C76963e.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0), new C89232y(C76963e.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: d */
    public static final C76965b f172684d = new C76965b((byte) 0);

    /* renamed from: b */
    public RecyclerView f172685b;

    /* renamed from: c */
    public C76958b f172686c;

    /* renamed from: e */
    private final AbstractC89248d f172687e = C21572a.m40504a(getDiContainer(), StoryEditModel.class);

    /* renamed from: f */
    private final AbstractC89248d f172688f = C21572a.m40504a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: g */
    private final AbstractC89244h f172689g = C89250i.m154774a(EnumC89331m.NONE, new C76964a(this));

    /* renamed from: h */
    private final C21582f f172690h;

    static {
        Covode.recordClassIndex(89959);
    }

    /* renamed from: a */
    public final StoryEditModel mo120516a() {
        return (StoryEditModel) this.f172687e.mo23374a(this, f172683a[0]);
    }

    /* renamed from: b */
    public final VEEditClipCluster cF_() {
        return (VEEditClipCluster) this.f172688f.mo23374a(this, f172683a[1]);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.e$b */
    public static final class C76965b {
        static {
            Covode.recordClassIndex(89961);
        }

        private C76965b() {
        }

        public /* synthetic */ C76965b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172690h;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.e$a */
    public static final class C76964a extends AbstractC89220m implements AbstractC89171a<AbstractC76760e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172691a;

        static {
            Covode.recordClassIndex(89960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76964a(AbstractC21566a aVar) {
            super(0);
            this.f172691a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172691a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4037d.C76963e.C76964a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.e$c */
    public static final class C76966c extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        final /* synthetic */ C76963e f172692a;

        static {
            Covode.recordClassIndex(89962);
        }

        C76966c(C76963e eVar) {
            this.f172692a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            int i;
            int a;
            int a2;
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            boolean a3 = C78099c.m136517a(this.f172692a.mo36486t());
            RecyclerView recyclerView2 = this.f172692a.f172685b;
            if (recyclerView2 == null) {
                C89219l.m154710a("clipNavigateView");
            }
            RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
            if (adapter != null) {
                i = adapter.getItemCount();
            } else {
                i = 0;
            }
            int d = RecyclerView.m4277d(view);
            if (a3) {
                if (d == 0) {
                    rect.right = C71812ep.m126783a(14.0d, C63247i.f143610a);
                }
                if (d == i - 1) {
                    a2 = C71812ep.m126783a(10.0d, C63247i.f143610a);
                } else {
                    a2 = C71812ep.m126783a(6.0d, C63247i.f143610a);
                }
                rect.left = a2;
                return;
            }
            if (d == 0) {
                rect.left = C71812ep.m126783a(14.0d, C63247i.f143610a);
            }
            if (d == i - 1) {
                a = C71812ep.m126783a(10.0d, C63247i.f143610a);
            } else {
                a = C71812ep.m126783a(6.0d, C63247i.f143610a);
            }
            rect.right = a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.e$e */
    static final class C76968e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C76963e f172694a;

        static {
            Covode.recordClassIndex(89964);
        }

        C76968e(C76963e eVar) {
            this.f172694a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f172694a.f172686c != null) {
                C76958b bVar = this.f172694a.f172686c;
                if (bVar == null) {
                    C89219l.m154710a("clipAdapter");
                }
                bVar.f172670a = true;
                bVar.notifyDataSetChanged();
            }
        }
    }

    public C76963e(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172690h = fVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        MethodCollector.m26663i(5292);
        super.mo22704a(bundle);
        if (mo120516a().getClips().size() > 1) {
            View inflate = ((ViewStub) mo36475c(R.id.cr9)).inflate();
            if (inflate != null) {
                RecyclerView recyclerView = (RecyclerView) inflate;
                this.f172686c = new C76958b(recyclerView, mo120516a().getClips(), C77134a.m134739d(this), new C76967d(this));
                this.f172685b = recyclerView;
                if (recyclerView == null) {
                    C89219l.m154710a("clipNavigateView");
                }
                mo36486t();
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                recyclerView.mo4415b(new C76966c(this));
                C76958b bVar = this.f172686c;
                if (bVar == null) {
                    C89219l.m154710a("clipAdapter");
                }
                recyclerView.setAdapter(bVar);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                MethodCollector.m26664o(5292);
                throw nullPointerException;
            }
        }
        ((AbstractC76760e) this.f172689g.getValue()).mo114817f().observe(this, new C76968e(this));
        MethodCollector.m26664o(5292);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b1v, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.e$d */
    static final class C76967d extends AbstractC89220m implements AbstractC89183m<StoryEditClipModel, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76963e f172693a;

        static {
            Covode.recordClassIndex(89963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76967d(C76963e eVar) {
            super(2);
            this.f172693a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(StoryEditClipModel storyEditClipModel, Integer num) {
            StoryEditClipModel storyEditClipModel2 = storyEditClipModel;
            int intValue = num.intValue();
            C89219l.m154721d(storyEditClipModel2, "");
            VEEditClipCluster b = this.f172693a.cF_();
            String clipId = storyEditClipModel2.getClipId();
            C89219l.m154721d(clipId, "");
            VEEditClip vEEditClip = b.f172997a.get(clipId);
            if (vEEditClip != null) {
                b.mo120640a(vEEditClip);
            }
            StoryEditModel a = this.f172693a.mo120516a();
            C89219l.m154721d(a, "");
            C39162r.m79460a("click_clip", new C84425b().mo129406a("creation_id", a.getCreationId()).mo129406a("shoot_way", a.getShootWay()).mo129403a("clip_index", intValue).mo129403a("clips_cnt", a.getClips().size()).f188764a);
            return C89391z.f203057a;
        }
    }
}

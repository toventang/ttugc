package com.p2082ss.android.ugc.aweme.story.edit.clip.impl;

import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77128g;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.EnumC77124e;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import dmt.p4542av.video.VEPreviewParams;
import dmt.p4542av.video.p4545b.AbstractC88176f;
import dmt.p4542av.video.p4545b.AbstractC88181j;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip */
public final class VEEditClip implements AbstractC77128g<AbstractC88181j>, AbstractC77128g {

    /* renamed from: a */
    public AbstractC88176f.AbstractC88177a f172978a;

    /* renamed from: b */
    public boolean f172979b;

    /* renamed from: c */
    EnumC77124e f172980c = EnumC77124e.INITIALIZED;

    /* renamed from: d */
    public final AbstractC89183m<StoryEditModel, StoryEditClipModel, AbstractC88181j> f172981d;

    /* renamed from: e */
    public final AbstractC89183m<StoryEditModel, StoryEditClipModel, AbstractC14088a> f172982e;

    /* renamed from: f */
    public final StoryEditModel f172983f;

    /* renamed from: g */
    public final StoryEditClipModel f172984g;

    /* renamed from: h */
    private final C1205n f172985h = new C1205n(this);

    /* renamed from: i */
    private boolean f172986i;

    /* renamed from: j */
    private boolean f172987j;

    /* renamed from: k */
    private boolean f172988k;

    /* renamed from: l */
    private final AbstractC89244h f172989l = C89250i.m154773a((AbstractC89171a) new C77133c(this));

    /* renamed from: m */
    private final AbstractC89244h f172990m = C89250i.m154773a((AbstractC89171a) new C77132b(this));

    /* renamed from: n */
    private final Context f172991n;

    /* renamed from: o */
    private final AbstractC1204m f172992o;

    /* renamed from: p */
    private final SurfaceView f172993p;

    static {
        Covode.recordClassIndex(90134);
    }

    /* renamed from: a */
    public final AbstractC14088a mo120643a() {
        return (AbstractC14088a) this.f172989l.getValue();
    }

    /* renamed from: b */
    public final AbstractC88181j mo120644b() {
        return (AbstractC88181j) this.f172990m.getValue();
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f172985h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip$a */
    public static final class C77131a implements AbstractC88176f.AbstractC88177a {

        /* renamed from: a */
        final /* synthetic */ VEEditClip f172994a;

        static {
            Covode.recordClassIndex(90135);
        }

        C77131a(VEEditClip vEEditClip) {
            this.f172994a = vEEditClip;
        }

        @Override // dmt.p4542av.video.p4545b.AbstractC88176f.AbstractC88177a
        /* renamed from: a */
        public final void mo114869a() {
            AbstractC88176f.AbstractC88177a aVar = this.f172994a.f172978a;
            if (aVar != null) {
                aVar.mo114869a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip$b */
    static final class C77132b extends AbstractC89220m implements AbstractC89171a<AbstractC88181j> {

        /* renamed from: a */
        final /* synthetic */ VEEditClip f172995a;

        static {
            Covode.recordClassIndex(90136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77132b(VEEditClip vEEditClip) {
            super(0);
            this.f172995a = vEEditClip;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC88181j invoke() {
            this.f172995a.f172979b = true;
            return this.f172995a.f172981d.invoke(this.f172995a.f172983f, this.f172995a.f172984g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip$c */
    static final class C77133c extends AbstractC89220m implements AbstractC89171a<AbstractC14088a> {

        /* renamed from: a */
        final /* synthetic */ VEEditClip f172996a;

        static {
            Covode.recordClassIndex(90137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77133c(VEEditClip vEEditClip) {
            super(0);
            this.f172996a = vEEditClip;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC14088a invoke() {
            return this.f172996a.f172982e.invoke(this.f172996a.f172983f, this.f172996a.f172984g);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    private final void onPause() {
        this.f172986i = false;
        if (this.f172980c == EnumC77124e.LOADED) {
            this.f172985h.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    private final void onResume() {
        this.f172986i = true;
        if (this.f172980c == EnumC77124e.LOADED) {
            this.f172985h.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    private final void onStart() {
        this.f172987j = true;
        if (this.f172980c == EnumC77124e.LOADED) {
            this.f172985h.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    private final void onStop() {
        this.f172987j = true;
        if (this.f172980c == EnumC77124e.LOADED) {
            this.f172985h.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
        }
    }

    /* renamed from: f */
    public final void mo120648f() {
        AbstractC31071f a;
        this.f172980c = EnumC77124e.DESTROYED;
        if (this.f172979b && (a = C77134a.m134735a(this)) != null) {
            a.mo56387s();
        }
        this.f172985h.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
    }

    /* renamed from: d */
    public final void mo120646d() {
        this.f172980c = EnumC77124e.LOADED;
        mo120644b().mo142730a(true);
        if (this.f172987j) {
            this.f172985h.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
        }
        if (this.f172986i) {
            this.f172985h.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
        }
    }

    /* renamed from: e */
    public final void mo120647e() {
        this.f172980c = EnumC77124e.CREATED;
        this.f172988k = true;
        AbstractC31071f b = mo120644b().mo142739b();
        if (b != null) {
            b.mo56385r();
        }
        if (this.f172986i) {
            this.f172985h.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
        }
        if (this.f172987j) {
            this.f172985h.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
        }
    }

    /* renamed from: c */
    public final void mo120645c() {
        this.f172980c = EnumC77124e.CREATED;
        mo120644b().f200164y = new C77131a(this);
        mo120644b().mo142714a(this.f172991n, mo120643a(), this.f172993p, this);
        if (mo120643a() instanceof VEPreviewParams) {
            AbstractC14088a a = mo120643a();
            Objects.requireNonNull(a, "null cannot be cast to non-null type dmt.av.video.VEPreviewParams");
            if (((VEPreviewParams) a).isFastImport) {
                AbstractC31071f b = mo120644b().mo142739b();
                b.mo56313a(b.mo56300a().f191689j, b.mo56300a().f191690k, mo120643a().getVolume());
            }
        }
        this.f172985h.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.story.edit.model.StoryEditModel, ? super com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel, ? extends dmt.av.video.b.j> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.story.edit.model.StoryEditModel, ? super com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel, ? extends com.bytedance.creativex.editor.preview.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public VEEditClip(Context context, AbstractC1204m mVar, AbstractC89183m<? super StoryEditModel, ? super StoryEditClipModel, ? extends AbstractC88181j> mVar2, AbstractC89183m<? super StoryEditModel, ? super StoryEditClipModel, ? extends AbstractC14088a> mVar3, StoryEditModel storyEditModel, StoryEditClipModel storyEditClipModel, SurfaceView surfaceView) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(mVar2, "");
        C89219l.m154721d(mVar3, "");
        C89219l.m154721d(storyEditModel, "");
        C89219l.m154721d(storyEditClipModel, "");
        C89219l.m154721d(surfaceView, "");
        this.f172991n = context;
        this.f172992o = mVar;
        this.f172981d = mVar2;
        this.f172982e = mVar3;
        this.f172983f = storyEditModel;
        this.f172984g = storyEditClipModel;
        this.f172993p = surfaceView;
        mVar.getLifecycle().mo4012a(this);
    }
}

package com.p2082ss.android.ugc.aweme.canvas;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22228c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.canvas.C35391l;
import com.p2082ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CanvasVideoEditorTrackViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.canvas.m */
public final class C35394m extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f83512a = {new C89232y(C35394m.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C89232y(C35394m.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: j */
    public static final C35395a f83513j = new C35395a((byte) 0);

    /* renamed from: b */
    public PhotoCanvasTransformFilterParam f83514b;

    /* renamed from: c */
    int f83515c = Integer.MIN_VALUE;

    /* renamed from: d */
    CanvasVideoData f83516d;

    /* renamed from: e */
    public final C35391l f83517e = new C35391l();

    /* renamed from: f */
    public C35412w f83518f;

    /* renamed from: g */
    public C14544f f83519g;

    /* renamed from: h */
    boolean f83520h;

    /* renamed from: i */
    public final AbstractC89171a<AbstractC14552j> f83521i;

    /* renamed from: k */
    private final AbstractC89244h f83522k = C89250i.m154773a((AbstractC89171a) new C35396b(this));

    /* renamed from: l */
    private final AbstractC89248d f83523l = C21572a.m40504a(getDiContainer(), AbstractC72510a.class);

    /* renamed from: t */
    private final AbstractC89248d f83524t = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: u */
    private final C21582f f83525u;

    static {
        Covode.recordClassIndex(42568);
    }

    /* renamed from: a */
    public final AbstractC14552j mo62313a() {
        return (AbstractC14552j) this.f83522k.getValue();
    }

    /* renamed from: b */
    public final AbstractC72510a mo62315b() {
        return (AbstractC72510a) this.f83523l.mo23374a(this, f83512a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final VideoPublishEditModel mo62316d() {
        return (VideoPublishEditModel) this.f83524t.mo23374a(this, f83512a[1]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.m$a */
    public static final class C35395a {
        static {
            Covode.recordClassIndex(42569);
        }

        private C35395a() {
        }

        public /* synthetic */ C35395a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f83525u;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.m$b */
    static final class C35396b extends AbstractC89220m implements AbstractC89171a<AbstractC14552j> {

        /* renamed from: a */
        final /* synthetic */ C35394m f83526a;

        static {
            Covode.recordClassIndex(42570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35396b(C35394m mVar) {
            super(0);
            this.f83526a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC14552j invoke() {
            return this.f83526a.f83521i.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.m$f */
    static final class C35401f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C35394m f83532a;

        static {
            Covode.recordClassIndex(42575);
        }

        C35401f(C35394m mVar) {
            this.f83532a = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            final SurfaceView surfaceView = (SurfaceView) obj;
            surfaceView.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.canvas.C35394m.C35401f.RunnableC354021 */

                /* renamed from: a */
                final /* synthetic */ C35401f f83533a;

                static {
                    Covode.recordClassIndex(42576);
                }

                {
                    this.f83533a = r1;
                }

                public final void run() {
                    AbstractC31071f b = this.f83533a.f83532a.mo62315b().mo114813d().mo142739b();
                    SurfaceView surfaceView = surfaceView;
                    C89219l.m154716b(surfaceView, "");
                    int width = surfaceView.getWidth();
                    SurfaceView surfaceView2 = surfaceView;
                    C89219l.m154716b(surfaceView2, "");
                    VESize a = b.mo56299a(width, surfaceView2.getHeight());
                    C35391l lVar = this.f83533a.f83532a.f83517e;
                    C89219l.m154721d(a, "");
                    C35390k kVar = lVar.f83499b;
                    C89219l.m154721d(a, "");
                    kVar.f83494b = a;
                    kVar.f83495c = null;
                    C35412w wVar = this.f83533a.f83532a.f83518f;
                    if (wVar != null) {
                        C89219l.m154721d(a, "");
                        wVar.f83553b = a;
                    }
                    StringBuilder sb = new StringBuilder("surface layout size ");
                    SurfaceView surfaceView3 = surfaceView;
                    C89219l.m154716b(surfaceView3, "");
                    StringBuilder append = sb.append(surfaceView3.getWidth()).append(',');
                    SurfaceView surfaceView4 = surfaceView;
                    C89219l.m154716b(surfaceView4, "");
                    C89219l.m154721d(append.append(surfaceView4.getHeight()).append(", veSize:").append(a).toString(), "");
                }
            });
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.m$d */
    static final class C35399d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35394m f83530a;

        static {
            Covode.recordClassIndex(42573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35399d(C35394m mVar) {
            super(1);
            this.f83530a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89386u<Boolean, Boolean, Boolean> value = this.f83530a.mo62315b().mo114781F().getValue();
            if (value == null || value.getFirst().booleanValue() != booleanValue) {
                this.f83530a.mo62315b().mo114805a((AbstractC72510a) booleanValue, false, booleanValue);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.m$e */
    static final class C35400e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C35394m f83531a;

        static {
            Covode.recordClassIndex(42574);
        }

        C35400e(C35394m mVar) {
            this.f83531a = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (((Boolean) ((C89386u) obj).getFirst()).booleanValue()) {
                C35412w wVar = this.f83531a.f83518f;
                if (wVar != null) {
                    wVar.f83552a = true;
                    C89219l.m154721d("enableGesture", "");
                    return;
                }
                return;
            }
            C35412w wVar2 = this.f83531a.f83518f;
            if (wVar2 != null) {
                C89219l.m154721d("disableGesture", "");
                if (!wVar2.f83554c) {
                    wVar2.f83552a = false;
                    wVar2.mo62318c();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.m$c */
    static final class C35397c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C35394m f83527a;

        static {
            Covode.recordClassIndex(42571);
        }

        C35397c(C35394m mVar) {
            this.f83527a = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam;
            List<PhotoCanvasTransformFilterParam> transformInfo;
            String str;
            final VEVideoTransformFilterParam vEVideoTransformFilterParam = (VEVideoTransformFilterParam) obj;
            C35394m mVar = this.f83527a;
            int i = 1;
            if (!mVar.f83520h) {
                mVar.f83520h = true;
                C89219l.m154721d("mob zoom", "");
                C84425b a = new C84425b().mo129406a("shoot_way", mVar.mo62316d().mShootWay).mo129406a("enter_from", "video_edit_page").mo129406a("creation_id", mVar.mo62316d().creationId);
                if (mVar.mo62316d().isUploadVideo()) {
                    str = "upload";
                } else {
                    str = "shoot";
                }
                C39162r.m79460a("zoom_photo", a.mo129406a("content_source", str).mo129406a("content_type", "photo_canvas").f188764a);
            }
            C35394m mVar2 = this.f83527a;
            C353981 r3 = new AbstractC89172b<Integer, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.canvas.C35394m.C35397c.C353981 */

                /* renamed from: a */
                final /* synthetic */ C35397c f83528a;

                static {
                    Covode.recordClassIndex(42572);
                }

                {
                    this.f83528a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Integer num) {
                    int i;
                    int intValue = num.intValue();
                    PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam = this.f83528a.f83527a.f83514b;
                    if (photoCanvasTransformFilterParam != null) {
                        VEVideoTransformFilterParam vEVideoTransformFilterParam = vEVideoTransformFilterParam;
                        C89219l.m154721d(photoCanvasTransformFilterParam, "");
                        if (vEVideoTransformFilterParam != null) {
                            photoCanvasTransformFilterParam.setDegree(vEVideoTransformFilterParam.degree);
                            photoCanvasTransformFilterParam.setTransX(vEVideoTransformFilterParam.transX);
                            photoCanvasTransformFilterParam.setTransY(vEVideoTransformFilterParam.transY);
                            photoCanvasTransformFilterParam.setScaleFactor(vEVideoTransformFilterParam.scaleFactor);
                        }
                    }
                    AbstractC72510a b = this.f83528a.f83527a.mo62315b();
                    PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam2 = this.f83528a.f83527a.f83514b;
                    if (photoCanvasTransformFilterParam2 != null) {
                        i = photoCanvasTransformFilterParam2.getClipIndex();
                    } else {
                        i = 0;
                    }
                    VEVideoTransformFilterParam vEVideoTransformFilterParam2 = vEVideoTransformFilterParam;
                    C89219l.m154716b(vEVideoTransformFilterParam2, "");
                    b.mo114797a(i, intValue, vEVideoTransformFilterParam2);
                    return C89391z.f203057a;
                }
            };
            if (mVar2.f83514b != null) {
                if (mVar2.f83515c < 0) {
                    CanvasVideoEditorTrackViewModel canvasVideoEditorTrackViewModel = CanvasVideoEditorTrackViewModel.Companion.get(mVar2.f52549m);
                    if (canvasVideoEditorTrackViewModel != null) {
                        i = canvasVideoEditorTrackViewModel.filterIndex;
                    }
                    mVar2.f83515c = i;
                }
                r3.invoke(Integer.valueOf(mVar2.f83515c));
                return;
            }
            CanvasVideoEditorTrackViewModel canvasVideoEditorTrackViewModel2 = CanvasVideoEditorTrackViewModel.Companion.get(mVar2.f52549m);
            if (canvasVideoEditorTrackViewModel2 != null && canvasVideoEditorTrackViewModel2.isFilterIndexValid()) {
                mVar2.f83515c = canvasVideoEditorTrackViewModel2.filterIndex;
                CanvasVideoData canvasVideoData = mVar2.f83516d;
                if (canvasVideoData == null || (transformInfo = canvasVideoData.getTransformInfo()) == null) {
                    photoCanvasTransformFilterParam = null;
                } else {
                    photoCanvasTransformFilterParam = (PhotoCanvasTransformFilterParam) C89070n.m154583g((List) transformInfo);
                }
                mVar2.f83514b = photoCanvasTransformFilterParam;
                if (mVar2.f83514b == null) {
                    PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam2 = new PhotoCanvasTransformFilterParam();
                    photoCanvasTransformFilterParam2.setClipIndex(0);
                    mVar2.f83514b = photoCanvasTransformFilterParam2;
                    CanvasVideoData canvasVideoData2 = mVar2.f83516d;
                    if (canvasVideoData2 != null) {
                        PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam3 = mVar2.f83514b;
                        if (photoCanvasTransformFilterParam3 == null) {
                            C89219l.m154715b();
                        }
                        canvasVideoData2.putTransform(photoCanvasTransformFilterParam3);
                    }
                }
                r3.invoke(Integer.valueOf(canvasVideoEditorTrackViewModel2.filterIndex));
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b1u, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.f.a.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C35394m(C21582f fVar, AbstractC89171a<? extends AbstractC14552j> aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        this.f83525u = fVar;
        this.f83521i = aVar;
    }

    /* renamed from: a */
    public final void mo62314a(String str, CanvasVideoData canvasVideoData) {
        PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam;
        List<PhotoCanvasTransformFilterParam> transformInfo;
        C89219l.m154721d(str, "");
        AbstractC14552j a = mo62313a();
        if (a != null) {
            C14544f fVar = this.f83519g;
            if (fVar == null) {
                C89219l.m154710a("gestureInteractItem");
            }
            a.mo23383a(fVar);
        }
        C35391l lVar = this.f83517e;
        C89219l.m154721d(str, "");
        C35390k kVar = lVar.f83499b;
        C89219l.m154721d(str, "");
        kVar.f83493a = str;
        lVar.f83500c = str;
        this.f83516d = canvasVideoData;
        if (canvasVideoData == null || (transformInfo = canvasVideoData.getTransformInfo()) == null) {
            photoCanvasTransformFilterParam = null;
        } else {
            photoCanvasTransformFilterParam = (PhotoCanvasTransformFilterParam) C89070n.m154583g((List) transformInfo);
        }
        this.f83514b = photoCanvasTransformFilterParam;
        C35412w wVar = this.f83518f;
        if (wVar != null) {
            wVar.f83560i = this.f83516d;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        MethodCollector.m26663i(5964);
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) mo36474b(R.id.btk);
        View b = mo36474b(R.id.d1o);
        ActivityC0945e a = C22228c.m41828a(this);
        if (a == null) {
            C89219l.m154715b();
        }
        CanvasGestureGuideWidget canvasGestureGuideWidget = new CanvasGestureGuideWidget(a, simpleDraweeView, b);
        canvasGestureGuideWidget.mo62284a().observe(canvasGestureGuideWidget.f83469b, new CanvasGestureGuideWidget.C35380a(canvasGestureGuideWidget));
        View view2 = canvasGestureGuideWidget.f83471d;
        if (view2 != null) {
            view2.setOnTouchListener(new CanvasGestureGuideWidget.View$OnTouchListenerC35381b(canvasGestureGuideWidget));
        }
        canvasGestureGuideWidget.f83469b.getLifecycle().mo4012a(new CanvasGestureGuideWidget.CanvasGestureGuideObserver());
        C35391l lVar = this.f83517e;
        AbstractC1204m lifecycleOwner = getLifecycleOwner();
        C35397c cVar = new C35397c(this);
        C89219l.m154721d(lifecycleOwner, "");
        C89219l.m154721d(cVar, "");
        lVar.f83499b.f83496d.observe(lifecycleOwner, cVar);
        C35412w wVar = new C35412w(this.f83517e, new C35399d(this));
        wVar.f83557f = true;
        this.f83518f = wVar;
        C35412w wVar2 = this.f83518f;
        if (wVar2 == null) {
            C89219l.m154715b();
        }
        this.f83519g = new C14544f(0, wVar2);
        mo62315b().mo114781F().observe(getLifecycleOwner(), new C35400e(this));
        FrameLayout frameLayout = (FrameLayout) mo36474b(R.id.b4_);
        if (frameLayout != null) {
            AbstractC45913a aVar = C45866d.m88490c().f106821d;
            if (aVar == null) {
                C89219l.m154715b();
            }
            Activity t = mo36486t();
            C89219l.m154716b(t, "");
            AbstractC45920e a2 = aVar.mo77311a(t, 0);
            frameLayout.addView(a2.getContentView());
            C35391l lVar2 = this.f83517e;
            C89219l.m154721d(a2, "");
            View contentView = a2.getContentView();
            contentView.post(new C35391l.RunnableC35393b(lVar2, contentView, a2));
            mo62315b().mo114818g().observe(this, new C35401f(this));
            MethodCollector.m26664o(5964);
            return;
        }
        MethodCollector.m26664o(5964);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

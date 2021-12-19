package com.p2082ss.android.ugc.aweme.ftc.pages;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63223bh;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65374bn;
import com.p2082ss.android.ugc.aweme.property.C65388ca;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.MvEffectVideoCoverGeneratorImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.AbstractC72001h;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71991a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73972ax;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74295o;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import dmt.p4542av.video.C88296t;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.pages.c */
public final class C52765c extends Fragment implements FTCChooseCoverView.AbstractC52809a {

    /* renamed from: a */
    public AbstractC52760a f121428a;

    /* renamed from: b */
    public float f121429b;

    /* renamed from: c */
    public C1213t<Bitmap> f121430c;

    /* renamed from: d */
    public C1213t<Boolean> f121431d;

    /* renamed from: e */
    public SafeHandler f121432e;

    /* renamed from: f */
    public boolean f121433f;

    /* renamed from: g */
    public AbstractC69978a f121434g;

    /* renamed from: h */
    public RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> f121435h;

    /* renamed from: i */
    ProgressDialogC84958b f121436i;

    /* renamed from: j */
    private boolean f121437j;

    /* renamed from: k */
    private HashMap f121438k;

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$i */
    static final class View$OnTouchListenerC52778i implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC52778i f121455a = new View$OnTouchListenerC52778i();

        static {
            Covode.recordClassIndex(62177);
        }

        View$OnTouchListenerC52778i() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(62164);
    }

    /* renamed from: a */
    public final View mo88434a(int i) {
        if (this.f121438k == null) {
            this.f121438k = new HashMap();
        }
        View view = (View) this.f121438k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f121438k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$c */
    static final class C52768c implements AbstractC72004a {

        /* renamed from: a */
        final /* synthetic */ C52765c f121441a;

        static {
            Covode.recordClassIndex(62167);
        }

        C52768c(C52765c cVar) {
            this.f121441a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a
        /* renamed from: a */
        public final void mo87651a() {
            this.f121441a.mo88439b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar = this.f121435h;
        if (aVar instanceof C74295o) {
            ((C74295o) aVar).mo116904a();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f121438k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$j */
    public static final class RunnableC52779j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52765c f121456a;

        /* renamed from: b */
        final /* synthetic */ long f121457b;

        static {
            Covode.recordClassIndex(62178);
        }

        RunnableC52779j(C52765c cVar, long j) {
            this.f121456a = cVar;
            this.f121457b = j;
        }

        public final void run() {
            this.f121456a.f121433f = false;
            C52765c.m97646a(this.f121456a).mo88409b().setValue(C88296t.m153438b(this.f121457b));
            this.f121456a.mo88436a(this.f121457b);
        }
    }

    /* renamed from: a */
    public final int mo88433a() {
        FrameLayout frameLayout = (FrameLayout) mo88434a(R.id.bdy);
        C89219l.m154716b(frameLayout, "");
        return frameLayout.getMeasuredHeight();
    }

    /* renamed from: c */
    public final boolean mo88441c() {
        if (!isAdded()) {
            return false;
        }
        requireFragmentManager().mo3552a().mo3455a(this).mo3473c();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.AbstractC52809a
    /* renamed from: d */
    public final void mo88442d() {
        SafeHandler safeHandler = this.f121432e;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        C88296t b = C88296t.m153437b();
        AbstractC52760a aVar = this.f121428a;
        if (aVar == null) {
            C89219l.m154710a("mDependency");
        }
        aVar.mo88409b().setValue(b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$e */
    public static final class C52772e extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52765c f121446a;

        static {
            Covode.recordClassIndex(62171);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$e$a */
        static final class C52773a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C52772e f121447a;

            /* renamed from: b */
            final /* synthetic */ VideoPublishEditModel f121448b;

            static {
                Covode.recordClassIndex(62172);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52773a(C52772e eVar, VideoPublishEditModel videoPublishEditModel) {
                super(0);
                this.f121447a = eVar;
                this.f121448b = videoPublishEditModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C52765c cVar = this.f121447a.f121446a;
                VideoPublishEditModel videoPublishEditModel = this.f121448b;
                videoPublishEditModel.getCoverPublishModel().setVideoCoverViewX(((FTCChooseCoverView) cVar.mo88434a(R.id.fbp)).getVideoCoverViewX());
                videoPublishEditModel.mVideoCoverStartTm = cVar.f121429b / 1000.0f;
                if (videoPublishEditModel.isMvThemeVideoType()) {
                    videoPublishEditModel.mvCreateVideoData.videoCoverStartTime = (int) cVar.f121429b;
                    cVar.f121436i = ProgressDialogC84958b.m146021b(cVar.getContext(), "");
                    ProgressDialogC84958b bVar = cVar.f121436i;
                    if (bVar != null) {
                        bVar.setIndeterminate(true);
                    }
                    AbstractC52760a aVar = cVar.f121428a;
                    if (aVar == null) {
                        C89219l.m154710a("mDependency");
                    }
                    new C71993c(aVar.mo88408a(), videoPublishEditModel.mvCreateVideoData.videoCoverImgPath, videoPublishEditModel.mvCreateVideoData.videoCoverStartTime, new C52766a(videoPublishEditModel), C52767b.f121440a, new C52768c(cVar));
                } else {
                    cVar.mo88439b();
                }
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52772e(C52765c cVar) {
            this.f121446a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            VideoPublishEditModel c = C52765c.m97646a(this.f121446a).mo88410c();
            AbstractC31071f a = C52765c.m97646a(this.f121446a).mo88408a();
            boolean z = !C73972ax.m130099a(c.mVideoCoverStartTm, this.f121446a.f121429b / 1000.0f);
            AbstractC63223bh K = C63244g.m114602a().mo73265K();
            a.mo56330b();
            a.mo56330b();
            K.mo101705a(c, z, new C52773a(this, c));
            C39162r.m79460a("save_cover_edit", new C84425b().mo129406a("creation_id", c.creationId).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", "direct_shoot").mo129406a("shoot_entrance", "direct_shoot").f188764a);
        }
    }

    /* renamed from: b */
    public final boolean mo88439b() {
        SafeHandler safeHandler = this.f121432e;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        C88296t b = C88296t.m153437b();
        AbstractC52760a aVar = this.f121428a;
        if (aVar == null) {
            C89219l.m154710a("mDependency");
        }
        aVar.mo88409b().setValue(b);
        AbstractC52760a aVar2 = this.f121428a;
        if (aVar2 == null) {
            C89219l.m154710a("mDependency");
        }
        aVar2.mo88408a().mo56311a(true);
        C88296t a = C88296t.m153435a();
        AbstractC52760a aVar3 = this.f121428a;
        if (aVar3 == null) {
            C89219l.m154710a("mDependency");
        }
        aVar3.mo88409b().setValue(a);
        if (getFragmentManager() == null) {
            return false;
        }
        return mo88441c();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$d */
    static final class RunnableC52769d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52765c f121442a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f121443b;

        static {
            Covode.recordClassIndex(62168);
        }

        RunnableC52769d(C52765c cVar, VideoPublishEditModel videoPublishEditModel) {
            this.f121442a = cVar;
            this.f121443b = videoPublishEditModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            C74295o oVar;
            FTCChooseCoverView fTCChooseCoverView = (FTCChooseCoverView) this.f121442a.mo88434a(R.id.fbp);
            C89219l.m154716b(fTCChooseCoverView, "");
            int measuredHeight = fTCChooseCoverView.getMeasuredHeight();
            int oneThumbWidth = (int) ((FTCChooseCoverView) this.f121442a.mo88434a(R.id.fbp)).getOneThumbWidth();
            C52765c cVar = this.f121442a;
            if (cVar.mo88437a(this.f121443b)) {
                C71991a aVar = new C71991a(oneThumbWidth, measuredHeight);
                ((FTCChooseCoverView) this.f121442a.mo88434a(R.id.fbp)).setAdapter(aVar);
                C71993c cVar2 = new C71993c();
                cVar2.f161328b = C52770a.f121444a;
                C71993c a = cVar2.mo114167a(oneThumbWidth, measuredHeight);
                a.f161338l = this.f121442a.f121430c;
                a.f161339m = this.f121442a.f121431d;
                a.mo114168a(this.f121442a.getActivity(), C52765c.m97646a(this.f121442a).mo88408a(), 7, new C52771b(aVar));
                oVar = aVar;
            } else {
                AbstractC69978a aVar2 = this.f121442a.f121434g;
                if (aVar2 == null) {
                    C89219l.m154710a("mEffectVideoCoverGenerator");
                }
                C74295o oVar2 = new C74295o(aVar2, oneThumbWidth, measuredHeight, (byte) 0);
                ((FTCChooseCoverView) this.f121442a.mo88434a(R.id.fbp)).setAdapter(oVar2);
                oVar = oVar2;
            }
            cVar.f121435h = oVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$d$b */
        static final class C52771b implements AbstractC72001h {

            /* renamed from: a */
            final /* synthetic */ C71991a f121445a;

            static {
                Covode.recordClassIndex(62170);
            }

            C52771b(C71991a aVar) {
                this.f121445a = aVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.AbstractC72001h
            /* renamed from: a */
            public final void mo78808a(List<Bitmap> list) {
                this.f121445a.mo114165a(list);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$d$a */
        static final class C52770a implements C71993c.AbstractC71996b {

            /* renamed from: a */
            public static final C52770a f121444a = new C52770a();

            static {
                Covode.recordClassIndex(62169);
            }

            C52770a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c.AbstractC71996b
            /* renamed from: a */
            public final void mo78807a(String str) {
                C63244g.m114602a().mo73263I().mo101628a(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.AbstractC52809a
    /* renamed from: b */
    public final void mo88438b(float f) {
        mo88440c(f);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$b */
    static final class C52767b implements C71993c.AbstractC71996b {

        /* renamed from: a */
        public static final C52767b f121440a = new C52767b();

        static {
            Covode.recordClassIndex(62166);
        }

        C52767b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c.AbstractC71996b
        /* renamed from: a */
        public final void mo78807a(String str) {
            C63244g.m114602a().mo73263I().mo101628a(str);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC52760a m97646a(C52765c cVar) {
        AbstractC52760a aVar = cVar.f121428a;
        if (aVar == null) {
            C89219l.m154710a("mDependency");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$f */
    public static final class C52774f extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52765c f121449a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f121450b;

        static {
            Covode.recordClassIndex(62173);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$f$a */
        static final class C52775a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C52774f f121451a;

            static {
                Covode.recordClassIndex(62174);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52775a(C52774f fVar) {
                super(1);
                this.f121451a = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                Boolean bool2 = bool;
                if (bool2 != null && bool2.booleanValue()) {
                    this.f121451a.f121449a.mo88441c();
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C63244g.m114602a().mo73265K().mo101706a(!C73972ax.m130099a(this.f121450b.mVideoCoverStartTm, this.f121449a.f121429b / 1000.0f), new C52775a(this));
        }

        C52774f(C52765c cVar, VideoPublishEditModel videoPublishEditModel) {
            this.f121449a = cVar;
            this.f121450b = videoPublishEditModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$a */
    static final class C52766a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f121439a;

        static {
            Covode.recordClassIndex(62165);
        }

        C52766a(VideoPublishEditModel videoPublishEditModel) {
            this.f121439a = videoPublishEditModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            C89219l.m154721d(bitmap, "");
            return this.f121439a.getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
        }
    }

    /* renamed from: d */
    private final int m97647d(float f) {
        AbstractC52760a aVar = this.f121428a;
        if (aVar == null) {
            C89219l.m154710a("mDependency");
        }
        return (int) (((float) aVar.mo88408a().mo56368j()) * f);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$h */
    static final class C52777h extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52765c f121454a;

        static {
            Covode.recordClassIndex(62176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52777h(C52765c cVar) {
            super(1);
            this.f121454a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    FrameLayout frameLayout = (FrameLayout) this.f121454a.mo88434a(R.id.bdy);
                    C89219l.m154716b(frameLayout, "");
                    frameLayout.setVisibility(4);
                } else {
                    FrameLayout frameLayout2 = (FrameLayout) this.f121454a.mo88434a(R.id.bdy);
                    C89219l.m154716b(frameLayout2, "");
                    frameLayout2.setVisibility(0);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo88440c(float f) {
        this.f121433f = true;
        C88296t b = C88296t.m153438b((long) m97647d(f));
        AbstractC52760a aVar = this.f121428a;
        if (aVar == null) {
            C89219l.m154710a("mDependency");
        }
        aVar.mo88409b().setValue(b);
        mo88436a(b.f200367b);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C89219l.m154721d(context, "");
        super.onAttach(context);
        if (context instanceof AbstractC52760a) {
            this.f121428a = (AbstractC52760a) context;
            this.f121437j = C65388ca.m117085a();
            C71827ew.m126830c((Activity) context);
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$g */
    static final class C52776g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52765c f121452a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f121453b;

        static {
            Covode.recordClassIndex(62175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52776g(C52765c cVar, AbstractC89172b bVar) {
            super(1);
            this.f121452a = cVar;
            this.f121453b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                SafeHandler safeHandler = this.f121452a.f121432e;
                if (safeHandler == null) {
                    C89219l.m154710a("mSafeHandler");
                }
                safeHandler.removeCallbacksAndMessages(null);
                C52765c.m97646a(this.f121452a).mo88409b().setValue(C88296t.m153437b());
                C52765c.m97646a(this.f121452a).mo88408a().mo56311a(true);
                C52765c.m97646a(this.f121452a).mo88409b().setValue(C88296t.m153435a());
                if (this.f121452a.getFragmentManager() == null) {
                    this.f121453b.invoke(false);
                } else {
                    this.f121452a.requireFragmentManager().mo3552a().mo3455a(this.f121452a).mo3473c();
                    this.f121453b.invoke(true);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.AbstractC52809a
    /* renamed from: a */
    public final void mo88435a(float f) {
        this.f121433f = true;
        C88296t a = C88296t.m153436a((long) m97647d(f));
        AbstractC52760a aVar = this.f121428a;
        if (aVar == null) {
            C89219l.m154710a("mDependency");
        }
        aVar.mo88409b().setValue(a);
    }

    /* renamed from: a */
    public final void mo88436a(long j) {
        C88296t b = C88296t.m153437b();
        AbstractC52760a aVar = this.f121428a;
        if (aVar == null) {
            C89219l.m154710a("mDependency");
        }
        aVar.mo88409b().setValue(b);
        C88296t a = C88296t.m153435a();
        AbstractC52760a aVar2 = this.f121428a;
        if (aVar2 == null) {
            C89219l.m154710a("mDependency");
        }
        aVar2.mo88409b().setValue(a);
        SafeHandler safeHandler = this.f121432e;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        safeHandler.postDelayed(new RunnableC52779j(this, j), 1000);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        C85581w.EnumC85602a aVar;
        AbstractC69978a vEVideoCoverGeneratorImpl;
        super.onActivityCreated(bundle);
        this.f121432e = new SafeHandler(this);
        AbstractC52760a aVar2 = this.f121428a;
        if (aVar2 == null) {
            C89219l.m154710a("mDependency");
        }
        VideoPublishEditModel c = aVar2.mo88410c();
        if (C65374bn.m117070a()) {
            aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NORMAL;
        } else {
            aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NOEFFECT;
        }
        AbstractC52760a aVar3 = this.f121428a;
        if (aVar3 == null) {
            C89219l.m154710a("mDependency");
        }
        if (mo88437a(aVar3.mo88410c())) {
            AbstractC52760a aVar4 = this.f121428a;
            if (aVar4 == null) {
                C89219l.m154710a("mDependency");
            }
            vEVideoCoverGeneratorImpl = new MvEffectVideoCoverGeneratorImpl(aVar4.mo88408a().mo56368j());
        } else if (c.isMultiVideoEdit()) {
            AbstractC52760a aVar5 = this.f121428a;
            if (aVar5 == null) {
                C89219l.m154710a("mDependency");
            }
            int j = aVar5.mo88408a().mo56368j();
            AbstractC52760a aVar6 = this.f121428a;
            if (aVar6 == null) {
                C89219l.m154710a("mDependency");
            }
            vEVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(aVar6.mo88408a(), this, ((FTCChooseCoverView) mo88434a(R.id.fbp)).getCoverSize(), j, 0, aVar);
        } else {
            AbstractC52760a aVar7 = this.f121428a;
            if (aVar7 == null) {
                C89219l.m154710a("mDependency");
            }
            vEVideoCoverGeneratorImpl = new VEVideoCoverGeneratorImpl(aVar7.mo88408a(), this, ((FTCChooseCoverView) mo88434a(R.id.fbp)).getCoverSize(), aVar, "choose_cover");
        }
        this.f121434g = vEVideoCoverGeneratorImpl;
        ((FTCChooseCoverView) mo88434a(R.id.fbp)).setOnScrollListener(this);
        ((FTCChooseCoverView) mo88434a(R.id.fbp)).post(new RunnableC52769d(this, c));
        ((TuxTextView) mo88434a(R.id.erd)).setOnClickListener(new C52772e(this));
        ((TuxTextView) mo88434a(R.id.erc)).setOnClickListener(new C52774f(this, c));
    }

    /* renamed from: a */
    public final boolean mo88437a(VideoPublishEditModel videoPublishEditModel) {
        if (this.f121437j || videoPublishEditModel.isMvThemeVideoType()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) mo88434a(R.id.erd);
        C89219l.m154716b(tuxTextView, "");
        TextPaint paint = tuxTextView.getPaint();
        C89219l.m154716b(paint, "");
        paint.setFakeBoldText(true);
        ActivityC0945e activity = getActivity();
        if (activity instanceof ActivityC0218d) {
            TuxTextView tuxTextView2 = (TuxTextView) mo88434a(R.id.erf);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
            AbstractC63223bh K = C63244g.m114602a().mo73265K();
            ActivityC0218d dVar = (ActivityC0218d) activity;
            FrameLayout frameLayout = (FrameLayout) mo88434a(R.id.asw);
            C89219l.m154716b(frameLayout, "");
            FrameLayout frameLayout2 = (FrameLayout) mo88434a(R.id.asv);
            C89219l.m154716b(frameLayout2, "");
            FrameLayout frameLayout3 = (FrameLayout) mo88434a(R.id.asx);
            C89219l.m154716b(frameLayout3, "");
            AbstractC52760a aVar = this.f121428a;
            if (aVar == null) {
                C89219l.m154710a("mDependency");
            }
            EffectTextModel effectTextModel = aVar.mo88410c().getCoverPublishModel().getEffectTextModel();
            AbstractC52760a aVar2 = this.f121428a;
            if (aVar2 == null) {
                C89219l.m154710a("mDependency");
            }
            K.mo101703a(dVar, "coverpic", "covertext", frameLayout, frameLayout2, frameLayout3, effectTextModel, aVar2.mo88410c().getAvetParameter(), new C52777h(this));
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) mo88434a(R.id.erf);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setVisibility(0);
        }
        ((RelativeLayout) mo88434a(R.id.fek)).setOnTouchListener(View$OnTouchListenerC52778i.f121455a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a10, viewGroup, false);
    }
}

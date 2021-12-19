package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70299bu;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70230aw;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70983b;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71793q;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71796s;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71557a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a.C71625q;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a */
public abstract class AbstractC71564a extends AbstractC22186b implements AbstractC21566a, AbstractC71643d {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f160370b = {new C89232y(AbstractC71564a.class, "editAdjustClipsModel", "getEditAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new C89232y(AbstractC71564a.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0), new C89232y(AbstractC71564a.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0), new C89232y(AbstractC71564a.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new C89232y(AbstractC71564a.class, "editCutterViewModel", "getEditCutterViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", 0), new C89232y(AbstractC71564a.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0), new C89232y(AbstractC71564a.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0)};

    /* renamed from: c */
    protected View f160371c;

    /* renamed from: d */
    protected AbstractC70516a f160372d;

    /* renamed from: e */
    public final RunnableC71585t f160373e = new RunnableC71585t(this);

    /* renamed from: f */
    public final AbstractC22186b f160374f;

    /* renamed from: g */
    public final int f160375g = R.id.vm;

    /* renamed from: h */
    private final AbstractC89248d f160376h = C21572a.m40504a(getDiContainer(), C71557a.class);

    /* renamed from: i */
    private final AbstractC89248d f160377i = C21572a.m40504a(getDiContainer(), CutMultiVideoViewModel.class);

    /* renamed from: j */
    private final AbstractC89248d f160378j = C21572a.m40504a(getDiContainer(), VideoEditViewModel.class);

    /* renamed from: k */
    private final AbstractC89248d f160379k = C21572a.m40504a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: l */
    private final AbstractC89248d f160380l = C21572a.m40504a(getDiContainer(), VEVideoCutterViewModel.class);

    /* renamed from: t */
    private final AbstractC89248d f160381t = C21572a.m40504a(getDiContainer(), AbstractC71775m.class);

    /* renamed from: u */
    private final AbstractC89248d f160382u = C21572a.m40504a(getDiContainer(), AbstractC71793q.class);

    /* renamed from: v */
    private final AbstractC89244h f160383v = C89250i.m154773a((AbstractC89171a) new C71567b(this));

    /* renamed from: w */
    private final AbstractC89244h f160384w = C89250i.m154773a((AbstractC89171a) new C71565a(this));

    /* renamed from: x */
    private final C21582f f160385x;

    static {
        Covode.recordClassIndex(84109);
    }

    /* renamed from: Q */
    private final C71557a mo113354Q() {
        return (C71557a) this.f160376h.mo23374a(this, f160370b[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract int mo62771E();

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final CutMultiVideoViewModel mo113319H() {
        return (CutMultiVideoViewModel) this.f160377i.mo23374a(this, f160370b[1]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final VideoEditViewModel mo113320I() {
        return (VideoEditViewModel) this.f160378j.mo23374a(this, f160370b[2]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final EditAdjustClipsBottomViewModel mo113321J() {
        return (EditAdjustClipsBottomViewModel) this.f160379k.mo23374a(this, f160370b[3]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final VEVideoCutterViewModel mo113322K() {
        return (VEVideoCutterViewModel) this.f160380l.mo23374a(this, f160370b[4]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final AbstractC71775m mo113323L() {
        return (AbstractC71775m) this.f160381t.mo23374a(this, f160370b[5]);
    }

    /* renamed from: M */
    public final AbstractC71793q mo113324M() {
        return (AbstractC71793q) this.f160382u.mo23374a(this, f160370b[6]);
    }

    /* renamed from: N */
    public final SafeHandler mo113325N() {
        return (SafeHandler) this.f160383v.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final C71625q mo113326O() {
        return (C71625q) this.f160384w.getValue();
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f160385x;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$b */
    static final class C71567b extends AbstractC89220m implements AbstractC89171a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160388a;

        static {
            Covode.recordClassIndex(84112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71567b(AbstractC71564a aVar) {
            super(0);
            this.f160388a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.f160388a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$a */
    static final class C71565a extends AbstractC89220m implements AbstractC89171a<C71625q> {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160386a;

        static {
            Covode.recordClassIndex(84110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71565a(AbstractC71564a aVar) {
            super(0);
            this.f160386a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$a$a */
        public static final class C71566a implements AbstractC70299bu {

            /* renamed from: a */
            final /* synthetic */ C71565a f160387a;

            static {
                Covode.recordClassIndex(84111);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70299bu
            /* renamed from: G */
            public final float mo87661G() {
                return this.f160387a.f160386a.mo113318G().getSelectedTime();
            }

            C71566a(C71565a aVar) {
                this.f160387a = aVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71625q invoke() {
            C71625q qVar = new C71625q(this.f160386a.getDiContainer(), this.f160386a);
            ((C70230aw) qVar).f157022a = new C71566a(this);
            return qVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final View mo113317F() {
        View view = this.f160371c;
        if (view == null) {
            C89219l.m154710a("ivRotate");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final AbstractC70516a mo113318G() {
        AbstractC70516a aVar = this.f160372d;
        if (aVar == null) {
            C89219l.m154710a("videoEditView");
        }
        return aVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: v */
    public final void mo36489v() {
        super.mo36489v();
        mo113325N().post(this.f160373e);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        super.mo36492y();
        mo113325N().removeCallbacks(this.f160373e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo113327P() {
        View c = mo36475c(R.id.bza);
        C89219l.m154716b(c, "");
        this.f160371c = c;
        if (c == null) {
            C89219l.m154710a("ivRotate");
        }
        c.setOnClickListener(new C71584s(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$t */
    public static final class RunnableC71585t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160406a;

        static {
            Covode.recordClassIndex(84130);
        }

        public final void run() {
            C1213t<CutVideoContext> tVar = this.f160406a.mo113320I().f157698w;
            C89219l.m154716b(tVar, "");
            if (tVar.getValue() != null) {
                long a = this.f160406a.mo113324M().mo113312a();
                if (a > 0) {
                    this.f160406a.mo113319H().mo110474a(a, this.f160406a.mo113320I().mo111231j(), this.f160406a.mo113320I().mo111233l());
                }
                this.f160406a.mo113325N().postDelayed(this, 30);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC71585t(AbstractC71564a aVar) {
            this.f160406a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$s */
    public static final class C71584s extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160405a;

        static {
            Covode.recordClassIndex(84129);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71584s(AbstractC71564a aVar) {
            this.f160405a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f160405a.mo113323L().mo113375a(this.f160405a.mo113321J().mo113264a().getCurrentEditOriginIndex(), this.f160405a.mo113318G().getCurrentRotate());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$d */
    static final class C71569d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160390a;

        static {
            Covode.recordClassIndex(84114);
        }

        C71569d(AbstractC71564a aVar) {
            this.f160390a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC71564a aVar = this.f160390a;
            AbstractC71564a.m126468a(aVar, aVar.mo113318G().getLeftSeekingValue(), null, false, 6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$e */
    static final class C71570e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160391a;

        static {
            Covode.recordClassIndex(84115);
        }

        C71570e(AbstractC71564a aVar) {
            this.f160391a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC71564a aVar = this.f160391a;
            AbstractC71564a.m126468a(aVar, aVar.mo113318G().getRightSeekingValue(), null, false, 6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$g */
    static final class C71572g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160393a;

        static {
            Covode.recordClassIndex(84117);
        }

        C71572g(AbstractC71564a aVar) {
            this.f160393a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC71564a aVar = this.f160393a;
            AbstractC71564a.m126468a(aVar, aVar.mo113318G().getRightSeekingValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateOut, false, 4);
            this.f160393a.mo113321J().mo113271g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$h */
    static final class C71573h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160394a;

        static {
            Covode.recordClassIndex(84118);
        }

        C71573h(AbstractC71564a aVar) {
            this.f160394a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC71564a aVar = this.f160394a;
            AbstractC71564a.m126468a(aVar, aVar.mo113318G().getPlayingPosition(), null, false, 6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$i */
    static final class C71574i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160395a;

        static {
            Covode.recordClassIndex(84119);
        }

        C71574i(AbstractC71564a aVar) {
            this.f160395a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC71564a aVar = this.f160395a;
            AbstractC71564a.m126468a(aVar, aVar.mo113318G().getSingleSeekTime(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateInOut, false, 4);
            this.f160395a.mo113321J().mo113271g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$j */
    static final class C71575j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160396a;

        static {
            Covode.recordClassIndex(84120);
        }

        C71575j(AbstractC71564a aVar) {
            this.f160396a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC71564a aVar = this.f160396a;
            AbstractC71564a.m126468a(aVar, aVar.mo113318G().getLeftSeekingValue(), null, false, 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$k */
    static final class C71576k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160397a;

        static {
            Covode.recordClassIndex(84121);
        }

        C71576k(AbstractC71564a aVar) {
            this.f160397a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC71564a aVar = this.f160397a;
            aVar.mo113328a(aVar.mo113318G().getLeftSeekingValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateInOut, false);
            this.f160397a.mo113321J().mo113271g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$m */
    static final class C71578m extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160399a;

        static {
            Covode.recordClassIndex(84123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71578m(AbstractC71564a aVar) {
            super(1);
            this.f160399a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f160399a.mo113318G().mo111105a(bool.booleanValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$o */
    static final class C71580o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160401a;

        static {
            Covode.recordClassIndex(84125);
        }

        C71580o(AbstractC71564a aVar) {
            this.f160401a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Integer num = (Integer) obj;
            View F = this.f160401a.mo113317F();
            if (num != null && num.intValue() == 1) {
                i = 8;
            } else {
                i = 0;
            }
            F.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$p */
    static final class C71581p<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160402a;

        static {
            Covode.recordClassIndex(84126);
        }

        C71581p(AbstractC71564a aVar) {
            this.f160402a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && (!bool.booleanValue())) {
                bool.booleanValue();
                AbstractC71564a aVar = this.f160402a;
                aVar.mo113328a(aVar.mo113318G().getPlayingPosition(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$q */
    static final class C71582q<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160403a;

        static {
            Covode.recordClassIndex(84127);
        }

        C71582q(AbstractC71564a aVar) {
            this.f160403a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (l != null) {
                this.f160403a.mo113328a(l.longValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$r */
    static final class C71583r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160404a;

        static {
            Covode.recordClassIndex(84128);
        }

        C71583r(AbstractC71564a aVar) {
            this.f160404a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f160404a.mo113321J().mo113265a(this.f160404a.mo113318G().getSelectedTime());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo113329a(AbstractC70516a aVar) {
        C89219l.m154721d(aVar, "");
        this.f160372d = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$c */
    static final class C71568c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160389a;

        static {
            Covode.recordClassIndex(84113);
        }

        C71568c(AbstractC71564a aVar) {
            this.f160389a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            C70576a aVar = (C70576a) obj;
            if (aVar != null && (valueOf = Integer.valueOf(aVar.f157914d)) != null) {
                if (valueOf.intValue() == 1) {
                    this.f160389a.mo113325N().post(this.f160389a.f160373e);
                } else if (valueOf.intValue() == 2 || valueOf.intValue() == 3) {
                    this.f160389a.mo113325N().removeCallbacks(this.f160389a.f160373e);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$f */
    static final class C71571f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160392a;

        static {
            Covode.recordClassIndex(84116);
        }

        C71571f(AbstractC71564a aVar) {
            this.f160392a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC71564a aVar = this.f160392a;
            AbstractC71564a.m126468a(aVar, aVar.mo113318G().getLeftSeekingValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateIn, false, 4);
            this.f160392a.mo113319H().f156541m = this.f160392a.mo113318G().getLeftSeekingValue();
            this.f160392a.mo113321J().mo113271g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$l */
    static final class C71577l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160398a;

        static {
            Covode.recordClassIndex(84122);
        }

        C71577l(AbstractC71564a aVar) {
            this.f160398a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            EditAdjustClipsBottomViewModel J = this.f160398a.mo113321J();
            C89219l.m154716b(bool, "");
            J.mo33690d(new EditAdjustClipsBottomViewModel.C71545l(bool.booleanValue()));
            this.f160398a.mo113318G().setEnabled(!bool.booleanValue());
            this.f160398a.mo113317F().setEnabled(!bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$n */
    static final class C71579n extends AbstractC89220m implements AbstractC89172b<C20391d<? extends C71796s>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC71564a f160400a;

        static {
            Covode.recordClassIndex(84124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71579n(AbstractC71564a aVar) {
            super(1);
            this.f160400a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20391d<? extends C71796s> dVar) {
            C20391d<? extends C71796s> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            T t = dVar2.f48283b;
            if (t == null) {
                this.f160400a.mo113318G().mo111108e();
            } else {
                this.f160400a.mo113318G().mo111132a(new C0692e<>(Float.valueOf((float) t.f160904b), Float.valueOf((float) t.f160905c)), (List<VideoSegment>) null);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        mo113327P();
        if (this.f160372d != null) {
            AbstractC70516a aVar = this.f160372d;
            if (aVar == null) {
                C89219l.m154710a("videoEditView");
            }
            C70983b.m125338a(aVar);
            boolean z = mo113354Q().f160355b;
            AbstractC70516a aVar2 = this.f160372d;
            if (aVar2 == null) {
                C89219l.m154710a("videoEditView");
            }
            aVar2.setMultiEditEnableForStickPointMode(true);
            AbstractC70516a aVar3 = this.f160372d;
            if (aVar3 == null) {
                C89219l.m154710a("videoEditView");
            }
            aVar3.setExtractFramesInRoughMode(true);
            AbstractC70516a aVar4 = this.f160372d;
            if (aVar4 == null) {
                C89219l.m154710a("videoEditView");
            }
            boolean z2 = false;
            aVar4.setLayoutDirection(0);
            AbstractC70516a aVar5 = this.f160372d;
            if (aVar5 == null) {
                C89219l.m154710a("videoEditView");
            }
            Boolean isMusicSyncMode = mo113321J().mo113264a().isMusicSyncMode();
            if (isMusicSyncMode != null) {
                z2 = isMusicSyncMode.booleanValue();
            }
            aVar5.setDefaultMode(z2);
            AbstractC70516a aVar6 = this.f160372d;
            if (aVar6 == null) {
                C89219l.m154710a("videoEditView");
            }
            aVar6.mo111138a(C22228c.m41832b(this), mo113319H(), mo113320I(), mo113323L().mo113381b(), z ? 1 : 0);
            AbstractC70516a aVar7 = this.f160372d;
            if (aVar7 == null) {
                C89219l.m154710a("videoEditView");
            }
            aVar7.setEditViewHeight(!mo113354Q().f160355b);
            AbstractC71775m L = mo113323L();
            AbstractC70516a aVar8 = this.f160372d;
            if (aVar8 == null) {
                C89219l.m154710a("videoEditView");
            }
            L.mo113376a(aVar8);
        }
        mo113322K().mo111335a().observe(this, new C71568c(this));
        AbstractC88412b unused = mo113321J().mo33677a(this, C71641b.f160518a, new C20370ah(), new C71578m(this));
        AbstractC88412b unused2 = mo113321J().mo33677a(this, C71642c.f160519a, new C20370ah(), new C71579n(this));
        mo113320I().f157677b.observe(this, new C71580o(this));
        mo113320I().f157678c.observe(this, new C71581p(this));
        mo113320I().f157680e.observe(this, new C71582q(this));
        mo113320I().f157679d.observe(this, new C71583r(this));
        mo113320I().f157682g.observe(this, new C71569d(this));
        mo113320I().f157681f.observe(this, new C71570e(this));
        mo113320I().f157683h.observe(this, new C71571f(this));
        mo113320I().f157686k.observe(this, new C71572g(this));
        mo113320I().f157687l.observe(this, new C71573h(this));
        mo113320I().f157688m.observe(this, new C71574i(this));
        mo113320I().f157684i.observe(this, new C71575j(this));
        mo113320I().f157685j.observe(this, new C71576k(this));
        mo113320I().f157694s.observe(this, new C71577l(this));
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
        View a = C1764a.m5927a(layoutInflater, R.layout.d3, viewGroup, false);
        C1764a.m5927a(layoutInflater, mo62771E(), (FrameLayout) a.findViewById(R.id.b3n), true);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }

    public AbstractC71564a(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f160385x = fVar;
        this.f160374f = bVar;
    }

    /* renamed from: a */
    public final void mo113328a(long j, C85581w.EnumC85607f fVar, boolean z) {
        AbstractC71793q.C71794a.m126761a(mo113324M(), j, fVar, false, 4);
        if (z) {
            EditAdjustClipsBottomViewModel J = mo113321J();
            AbstractC70516a aVar = this.f160372d;
            if (aVar == null) {
                C89219l.m154710a("videoEditView");
            }
            J.mo113265a(aVar.getSelectedTime());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m126468a(AbstractC71564a aVar, long j, C85581w.EnumC85607f fVar, boolean z, int i) {
        if ((i & 2) != 0) {
            fVar = C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aVar.mo113328a(j, fVar, z);
    }
}

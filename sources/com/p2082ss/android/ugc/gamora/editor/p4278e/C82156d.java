package com.p2082ss.android.ugc.gamora.editor.p4278e;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.filter.C50644b;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2982b.C50647b;
import com.p2082ss.android.ugc.aweme.filter.p2983c.C50649a;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50798l;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50800m;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50808r;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50811a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65341ak;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70635dg;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70926h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70936b;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.C72515b;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.C72547d;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.gamora.editor.filter.C82186a;
import com.p2082ss.android.ugc.gamora.editor.gesture.EditGestureViewModel;
import com.p2082ss.android.ugc.gamora.editor.p4278e.C82148a;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VECherEffectParam;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.filterparam.VEComposerFilterParam;
import dmt.p4542av.video.C88252e;
import dmt.p4542av.video.C88297u;
import dmt.p4542av.video.CompileProbeViewModel;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.VEPreviewParams;
import dmt.p4542av.video.p4545b.AbstractC88181j;
import dmt.p4542av.video.p4545b.C88229m;
import dmt.p4542av.video.p4545b.C88231n;
import dmt.p4542av.video.p4545b.C88233o;
import dmt.p4542av.video.p4545b.C88234p;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.gamora.editor.e.d */
public final class C82156d extends C72515b<AbstractC82155c> implements AbstractC82155c {

    /* renamed from: m */
    public static final C82162f f183814m = new C82162f((byte) 0);

    /* renamed from: j */
    final AbstractC89244h f183815j = C89250i.m154773a((AbstractC89171a) new C82163g(this));

    /* renamed from: k */
    public FilterBean f183816k;

    /* renamed from: l */
    final AbstractC89244h f183817l = C89250i.m154773a((AbstractC89171a) new C82175o(this));

    /* renamed from: n */
    private final AbstractC89244h f183818n = C89250i.m154774a(EnumC89331m.NONE, new C82157a(this));

    /* renamed from: o */
    private final AbstractC89244h f183819o = C89250i.m154774a(EnumC89331m.NONE, new C82158b(this));

    /* renamed from: p */
    private final AbstractC89244h f183820p = C89250i.m154774a(EnumC89331m.NONE, new C82159c(this));

    /* renamed from: q */
    private final AbstractC89244h f183821q = C89250i.m154774a(EnumC89331m.NONE, new C82160d(this));

    /* renamed from: r */
    private final AbstractC89244h f183822r = C89250i.m154774a(EnumC89331m.NONE, new C82161e(this));

    /* renamed from: s */
    private final AbstractC89244h f183823s;

    /* renamed from: t */
    private final boolean f183824t;

    /* renamed from: u */
    private boolean f183825u;

    /* renamed from: v */
    private final AbstractC89244h f183826v;

    /* renamed from: w */
    private final Map<String, Integer> f183827w;

    /* renamed from: x */
    private final C1213t<C89391z> f183828x;

    /* renamed from: y */
    private final VEPreviewParams f183829y;

    static {
        Covode.recordClassIndex(95984);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ac */
    public final EditGestureViewModel mo127363ac() {
        return (EditGestureViewModel) this.f183818n.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ad */
    public final FTCEditInfoStickerViewModel mo127364ad() {
        return (FTCEditInfoStickerViewModel) this.f183819o.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ae */
    public final EditStickerViewModel mo127365ae() {
        return (EditStickerViewModel) this.f183820p.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: af */
    public final FTCEditStickerViewModel mo127366af() {
        return (FTCEditStickerViewModel) this.f183821q.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ag */
    public final EditInfoStickerViewModel mo127367ag() {
        return (EditInfoStickerViewModel) this.f183822r.getValue();
    }

    /* renamed from: ah */
    public final VideoPublishEditModel mo127368ah() {
        return (VideoPublishEditModel) this.f183823s.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$f */
    public static final class C82162f {
        static {
            Covode.recordClassIndex(95990);
        }

        private C82162f() {
        }

        public /* synthetic */ C82162f(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.C72515b
    /* renamed from: W */
    public final boolean mo114858W() {
        return this.f183825u;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c
    /* renamed from: X */
    public final LiveData<C89391z> mo120449X() {
        return this.f183828x;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.C72515b, com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c
    /* renamed from: Y */
    public final VideoPublishEditModel mo120450Y() {
        return mo127368ah();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c
    /* renamed from: Z */
    public final void mo120451Z() {
        this.f183828x.setValue(C89391z.f203057a);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$n */
    static final class C82174n extends AbstractC89220m implements AbstractC89171a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C21582f f183848a;

        static {
            Covode.recordClassIndex(96002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82174n(C21582f fVar) {
            super(0);
            this.f183848a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            Object a = this.f183848a.mo35249a((Type) VideoPublishEditModel.class, (String) null);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$a */
    public static final class C82157a extends AbstractC89220m implements AbstractC89171a<EditGestureViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82156d f183830a;

        static {
            Covode.recordClassIndex(95985);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82157a(C82156d dVar) {
            super(0);
            this.f183830a = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.gesture.EditGestureViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.e.d r0 = r2.f183830a
                androidx.fragment.app.e r0 = r0.mo114855T()
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.C20531t.m38716a(r0)
                java.lang.Class<com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel> r0 = com.p2082ss.android.ugc.gamora.editor.gesture.EditGestureViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.mo33800a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82157a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$b */
    public static final class C82158b extends AbstractC89220m implements AbstractC89171a<FTCEditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82156d f183831a;

        static {
            Covode.recordClassIndex(95986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82158b(C82156d dVar) {
            super(0);
            this.f183831a = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.e.d r0 = r2.f183831a
                androidx.fragment.app.e r0 = r0.mo114855T()
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.C20531t.m38716a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel> r0 = com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.mo33800a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82158b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$c */
    public static final class C82159c extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82156d f183832a;

        static {
            Covode.recordClassIndex(95987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82159c(C82156d dVar) {
            super(0);
            this.f183832a = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.e.d r0 = r2.f183832a
                androidx.fragment.app.e r0 = r0.mo114855T()
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.C20531t.m38716a(r0)
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel> r0 = com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.mo33800a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82159c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$d */
    public static final class C82160d extends AbstractC89220m implements AbstractC89171a<FTCEditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82156d f183833a;

        static {
            Covode.recordClassIndex(95988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82160d(C82156d dVar) {
            super(0);
            this.f183833a = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.e.d r0 = r2.f183833a
                androidx.fragment.app.e r0 = r0.mo114855T()
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.C20531t.m38716a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel> r0 = com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.mo33800a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82160d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$e */
    public static final class C82161e extends AbstractC89220m implements AbstractC89171a<EditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82156d f183834a;

        static {
            Covode.recordClassIndex(95989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82161e(C82156d dVar) {
            super(0);
            this.f183834a = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.e.d r0 = r2.f183834a
                androidx.fragment.app.e r0 = r0.mo114855T()
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.C20531t.m38716a(r0)
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel> r0 = com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.mo33800a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82161e.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$g */
    static final class C82163g extends AbstractC89220m implements AbstractC89171a<CompileProbeViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82156d f183835a;

        static {
            Covode.recordClassIndex(95991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82163g(C82156d dVar) {
            super(0);
            this.f183835a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CompileProbeViewModel invoke() {
            return C1181ae.m3881a(this.f183835a.mo114855T(), (C1175ad.AbstractC1177b) null).mo3983a(CompileProbeViewModel.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.C72515b
    /* renamed from: aa */
    public final AbstractC88181j mo114861aa() {
        AbstractC88181j a = C88229m.m153326a(mo127368ah().videoEditorType, this.f162556a.f162626f);
        a.f200163x = new C82164h(this);
        return a;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$k */
    static final class C82168k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82156d f183839a;

        static {
            Covode.recordClassIndex(95996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82168k(C82156d dVar) {
            super(0);
            this.f183839a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C50649a value = this.f183839a.f162565b.getValue();
            if (value != null) {
                if (!value.f116986c) {
                    this.f183839a.mo114813d().mo142731a(value.f116985b, this.f183839a.f162556a.f162621a.invoke().booleanValue());
                } else {
                    this.f183839a.mo114860a(value.f116985b, value.f116987d);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$o */
    static final class C82175o extends AbstractC89220m implements AbstractC89171a<C82148a> {

        /* renamed from: a */
        final /* synthetic */ C82156d f183849a;

        static {
            Covode.recordClassIndex(96003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82175o(C82156d dVar) {
            super(0);
            this.f183849a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82148a invoke() {
            SurfaceView cH_ = this.f183849a.cH_();
            AbstractC31071f b = this.f183849a.mo114813d().mo142739b();
            if (b == null) {
                C89219l.m154715b();
            }
            return new C82148a(cH_, b, new AbstractC89187q<Float, Float, Float, C89391z>(this.f183849a) {
                /* class com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82175o.C821761 */

                static {
                    Covode.recordClassIndex(96004);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89187q
                public final /* synthetic */ C89391z invoke(Float f, Float f2, Float f3) {
                    float floatValue = f.floatValue();
                    float floatValue2 = f2.floatValue();
                    float floatValue3 = f3.floatValue();
                    C82156d dVar = (C82156d) this.receiver;
                    dVar.mo127365ae().mo33689c(new EditStickerViewModel.C82607x(floatValue, floatValue2, floatValue3));
                    dVar.mo127365ae().mo127671a(floatValue, floatValue2, floatValue3);
                    dVar.mo127365ae().mo33689c(new EditStickerViewModel.C82608y(floatValue, floatValue2, floatValue3));
                    dVar.mo127365ae().mo33689c(new EditStickerViewModel.C82606w(floatValue, floatValue2, floatValue3));
                    dVar.mo127363ac().mo33689c(new EditGestureViewModel.C82253e(floatValue, floatValue2, floatValue3));
                    if (C63244g.m114602a().mo73255A().mo93901a()) {
                        dVar.mo127364ad().mo33689c(new FTCEditInfoStickerViewModel.C52226e(floatValue, floatValue2, floatValue3));
                        dVar.mo127366af().mo33689c(new FTCEditStickerViewModel.C52172i(floatValue, floatValue2, floatValue3));
                    } else {
                        dVar.mo127367ag().mo33689c(new EditInfoStickerViewModel.C82838h(floatValue, floatValue2, floatValue3));
                        dVar.mo127365ae().mo127671a(floatValue, floatValue2, floatValue3);
                    }
                    return C89391z.f203057a;
                }
            }, new AbstractC89172b<Float, C89391z>(this.f183849a) {
                /* class com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82175o.C821772 */

                static {
                    Covode.recordClassIndex(96005);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Float f) {
                    float floatValue = f.floatValue();
                    C82156d dVar = (C82156d) this.receiver;
                    dVar.mo127363ac().mo33689c(new EditGestureViewModel.C82249a(floatValue));
                    if (C63244g.m114602a().mo73255A().mo93901a()) {
                        dVar.mo127364ad().mo33689c(new FTCEditInfoStickerViewModel.C52222a(floatValue));
                        dVar.mo127366af().mo33689c(new FTCEditStickerViewModel.C52164a(floatValue));
                    } else {
                        dVar.mo127367ag().mo33689c(new EditInfoStickerViewModel.C82831a(floatValue));
                        dVar.mo127365ae().mo33689c(new EditStickerViewModel.C82583a(floatValue));
                    }
                    return C89391z.f203057a;
                }
            }, new AbstractC89188r<Integer, Integer, Integer, Integer, C89391z>(this.f183849a) {
                /* class com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82175o.C821783 */

                static {
                    Covode.recordClassIndex(96006);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89188r
                /* renamed from: a */
                public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, Integer num3, Integer num4) {
                    ((C82156d) this.receiver).mo127362a(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$i */
    static final class C82165i extends AbstractC89220m implements AbstractC89171a<C82186a> {

        /* renamed from: a */
        final /* synthetic */ C82156d f183837a;

        static {
            Covode.recordClassIndex(95993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82165i(C82156d dVar) {
            super(0);
            this.f183837a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82186a invoke() {
            C50798l a = C50798l.C50799a.m95127a(this.f183837a.f162556a.f162624d.invoke());
            AbstractC50706n value = this.f183837a.mo114856U().getValue();
            AbstractC50703k value2 = this.f183837a.mo114857V().getValue();
            if (value == null || C89219l.m154714a(value.getClass(), a.getClass()) || value2 == null) {
                return null;
            }
            return new C82186a(C50800m.m95128a(a, new AbstractC50703k() {
                /* class com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82165i.C821661 */

                static {
                    Covode.recordClassIndex(95994);
                }

                @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k
                /* renamed from: a */
                public final float mo23007a(FilterBean filterBean) {
                    C89219l.m154721d(filterBean, "");
                    return 0.8f;
                }
            }), C50800m.m95128a(value, value2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.C72515b, com.bytedance.als.AbstractC2562j
    public final void onStart() {
        AbstractC31071f cJ_;
        AbstractC31071f cJ_2;
        if (C65341ak.m117027a() && C71817eu.m126800k(mo127368ah()) && (cJ_ = cJ_()) != null) {
            C85581w.EnumC85611j f = cJ_.mo56356f();
            if (f == null) {
                f = C85581w.EnumC85611j.ERROR;
            }
            if (f.getValue() < C85581w.EnumC85611j.PREPARED.getValue()) {
                AbstractC31071f cJ_3 = cJ_();
                if (cJ_3 != null) {
                    cJ_3.mo56382q();
                }
                if (!mo127368ah().editMusicSyncMode && (cJ_2 = cJ_()) != null) {
                    cJ_2.mo56248I();
                }
            }
        }
        super.onStart();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.C72515b
    /* renamed from: ab */
    public final void mo114862ab() {
        C73975b.C73976a.f166071a.step("av_video_edit", "VEEditor init start");
        super.mo114862ab();
        if (this.f183829y.veCherEffectParam != null) {
            VECherEffectParam vECherEffectParam = this.f183829y.veCherEffectParam;
            C89219l.m154716b(vECherEffectParam, "");
            if (vECherEffectParam.getMatrix() != null) {
                AbstractC31071f b = mo114813d().mo142739b();
                VECherEffectParam vECherEffectParam2 = this.f183829y.veCherEffectParam;
                C89219l.m154716b(vECherEffectParam2, "");
                b.mo56317a(vECherEffectParam2);
            }
        }
        if (mo114813d() instanceof C88233o) {
            mo114813d().mo142739b().mo56313a(0, 1, this.f183829y.mMusicVolume);
        } else if (mo114813d() instanceof C88234p) {
            mo114813d().mo142739b().mo56313a(0, 1, this.f183829y.mMusicVolume);
        } else if (mo114813d() instanceof C88231n) {
            mo114813d().mo142739b().mo56313a(0, 0, this.f183829y.mVolume);
        } else if (this.f183829y.mAudioPaths != null && this.f183829y.mAudioPaths.length == 1) {
            mo114813d().mo142739b().mo56313a(0, 0, this.f183829y.mVolume);
        }
        if (this.f183829y.isFastImport || this.f183829y.isCutSameType) {
            mo114813d().mo142739b().mo56313a(mo114813d().mo142739b().mo56300a().f191689j, mo114813d().mo142739b().mo56300a().f191690k, this.f183829y.mVolume);
        }
        C73975b.C73976a.f166071a.step("av_video_edit", "VEEditor init end");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.C72515b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        StitchParams stitchParams;
        super.onCreate();
        mo114776A().observe(this, new C82167j(this));
        if (mo127368ah().isMusic() == 1 && (mo127368ah().recordMode == 0 || mo127368ah().mIsFromDraft)) {
            VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
            vEPreviewMusicParams.f200081a = mo127368ah().mMusicPath;
            vEPreviewMusicParams.f200082b = mo127368ah().mMusicStart;
            vEPreviewMusicParams.f200094n = mo127368ah().recordBgmDelay;
            if (mo127368ah().loudnessBalanceParam != null) {
                vEPreviewMusicParams.f200095o = mo127368ah().loudnessBalanceParam.getBgmLoudness();
                vEPreviewMusicParams.f200096p = mo127368ah().loudnessBalanceParam.getPeakLoudness();
                vEPreviewMusicParams.f200097q = mo127368ah().loudnessBalanceParam.getAvgLoudness();
            }
            String str = mo127368ah().mMusicPath;
            C89219l.m154721d(mo127368ah(), "");
            vEPreviewMusicParams.f200083c = C80418fa.m139406a(str);
            if (C70005cr.m123611a().f156482a != null) {
                C69905c cVar = C70005cr.m123611a().f156482a;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                if (cVar.getShootDuration() > 0) {
                    int i = vEPreviewMusicParams.f200083c;
                    C69905c cVar2 = C70005cr.m123611a().f156482a;
                    if (cVar2 == null) {
                        C89219l.m154715b();
                    }
                    if (Math.abs(i - cVar2.getShootDuration()) >= 1000) {
                        C69905c cVar3 = C70005cr.m123611a().f156482a;
                        if (cVar3 == null) {
                            C89219l.m154715b();
                        }
                        vEPreviewMusicParams.f200084d = cVar3.getShootDuration();
                        vEPreviewMusicParams.f200085e = mo127368ah().musicVolume;
                        vEPreviewMusicParams.f200086f = mo127368ah().musicId;
                        vEPreviewMusicParams.f200087g = mo127368ah().previewStartTime;
                        vEPreviewMusicParams.f200089i = mo127368ah().isFastImport;
                        Boolean bool = mo127368ah().isSoundLoop;
                        C89219l.m154716b(bool, "");
                        vEPreviewMusicParams.f200092l = bool.booleanValue();
                        if (mo127368ah().isStitchMode() && (stitchParams = mo127368ah().getStitchParams()) != null && stitchParams.isPGCMusic() && stitchParams.getMusicStart() >= 0) {
                            long duration = stitchParams.getDuration();
                            vEPreviewMusicParams.f200090j = 0;
                            vEPreviewMusicParams.f200091k = (int) duration;
                        }
                        mo114806a(vEPreviewMusicParams);
                    }
                }
            }
            vEPreviewMusicParams.f200084d = vEPreviewMusicParams.f200083c;
            vEPreviewMusicParams.f200085e = mo127368ah().musicVolume;
            vEPreviewMusicParams.f200086f = mo127368ah().musicId;
            vEPreviewMusicParams.f200087g = mo127368ah().previewStartTime;
            vEPreviewMusicParams.f200089i = mo127368ah().isFastImport;
            Boolean bool2 = mo127368ah().isSoundLoop;
            C89219l.m154716b(bool2, "");
            vEPreviewMusicParams.f200092l = bool2.booleanValue();
            long duration2 = stitchParams.getDuration();
            vEPreviewMusicParams.f200090j = 0;
            vEPreviewMusicParams.f200091k = (int) duration2;
            mo114806a(vEPreviewMusicParams);
        } else if (C80285bz.m139187a(mo127368ah()) && C70005cr.m123611a().f156482a == null) {
            VEPreviewMusicParams vEPreviewMusicParams2 = new VEPreviewMusicParams();
            vEPreviewMusicParams2.f200093m = true;
            mo114806a(vEPreviewMusicParams2);
        }
        if (mo127368ah().isMusic() == 1 && mo127368ah().recordMode == 1) {
            mo127368ah().mMusicPath = null;
        }
        C82186a aVar = (C82186a) this.f183826v.getValue();
        if (aVar != null) {
            C82168k kVar = new C82168k(this);
            C89219l.m154721d(kVar, "");
            String str2 = aVar.f183869a.get(C63244g.m114602a().mo73290r().mo86010h().mo5560b());
            if (str2 != null && !aVar.f183870b.getBoolean("Edit_Filter_Data_Has_Migrated_".concat(String.valueOf(str2)), false)) {
                new C50644b(C82186a.C82190d.f183877a, new C82186a.C82191e(str2)).mo85999a(new C82186a.C82188b(aVar, str2, kVar), C82186a.C82189c.f183876a);
            }
        }
        mo114821j().observe(this, new C82169l(this));
        if (C80537hk.m139613a(mo127368ah().mSelectedFilterId) || C80537hk.m139613a(mo127368ah().mSelectedFilterResId)) {
            mo114863b(new C50649a(true, C71817eu.m126789a(mo127368ah(), C63244g.m114602a().mo73290r().mo86006d())));
        }
        C1213t<C88297u> E = mo114780E();
        E.observe(this, new C82170m(this));
        E.observe(this, new C88252e());
        AudioRecorderParam veAudioRecordParam = this.f183829y.getVeAudioRecordParam();
        if (veAudioRecordParam != null && !TextUtils.isEmpty(veAudioRecordParam.getAudioUrl())) {
            C89219l.m154716b(veAudioRecordParam, "");
            C70926h.m125230a(this, veAudioRecordParam);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$h */
    static final class C82164h implements VEListener.AbstractC85253v {

        /* renamed from: a */
        final /* synthetic */ C82156d f183836a;

        static {
            Covode.recordClassIndex(95992);
        }

        C82164h(C82156d dVar) {
            this.f183836a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x032d, code lost:
            if (r3 == com.p2082ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.State.CANCEL) goto L_0x032f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x03c9, code lost:
            if (r10 != null) goto L_0x03cb;
         */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x03d4  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0473  */
        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85253v
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo56396a() {
            /*
            // Method dump skipped, instructions count: 1673
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82164h.mo56396a():void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$p */
    public static final class C82179p implements AbstractC50703k {

        /* renamed from: a */
        final /* synthetic */ AbstractC31071f f183850a;

        static {
            Covode.recordClassIndex(96007);
        }

        C82179p(AbstractC31071f fVar) {
            this.f183850a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k
        /* renamed from: a */
        public final float mo23007a(FilterBean filterBean) {
            C89219l.m154721d(filterBean, "");
            float c = C50811a.m95161c(filterBean);
            if (c != 0.0f) {
                return c;
            }
            AbstractC31071f fVar = this.f183850a;
            String filterFolder = filterBean.getFilterFolder();
            C89219l.m154716b(filterFolder, "");
            return fVar.mo56335c(filterFolder);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$j */
    static final class C82167j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82156d f183838a;

        static {
            Covode.recordClassIndex(95995);
        }

        C82167j(C82156d dVar) {
            this.f183838a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f183838a.mo114813d().mo142726a((C70936b) obj, "");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.C72515b
    /* renamed from: a */
    public final AbstractC50706n mo114859a(String str) {
        C89219l.m154721d(str, "");
        if (C50647b.m94905a()) {
            return C50808r.C50809a.m95157a(str);
        }
        return C50798l.C50799a.m95127a(str);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$l */
    static final class C82169l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82156d f183840a;

        static {
            Covode.recordClassIndex(95997);
        }

        C82169l(C82156d dVar) {
            this.f183840a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C50649a aVar = (C50649a) obj;
            if (aVar != null) {
                FilterBean filterBean = aVar.f116985b;
                if (this.f183840a.f183816k == null) {
                    this.f183840a.f183816k = filterBean;
                } else if (filterBean != null) {
                    FilterBean filterBean2 = this.f183840a.f183816k;
                    if (filterBean2 == null) {
                        C89219l.m154715b();
                    }
                    if (filterBean2.getId() != filterBean.getId()) {
                        C84425b a = new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("creation_id", this.f183840a.mo127368ah().creationId).mo129406a("shoot_way", this.f183840a.mo127368ah().mShootWay).mo129403a("draft_id", this.f183840a.mo127368ah().draftId).mo129403a("filter_id", filterBean.getId()).mo129406a("filter_name", filterBean.getEnName());
                        AbstractC50706n value = this.f183840a.mo114856U().getValue();
                        if (value == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(value, "");
                        AbstractC50706n nVar = value;
                        AbstractC50703k value2 = this.f183840a.mo114857V().getValue();
                        if (value2 == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(value2, "");
                        C84425b a2 = a.mo129405a("value", Float.valueOf(C50648c.m94909a(filterBean, nVar, value2)));
                        if (this.f183840a.mo127368ah().draftId != 0) {
                            a2.mo129403a("draft_id", this.f183840a.mo127368ah().draftId);
                        }
                        if (!TextUtils.isEmpty(this.f183840a.mo127368ah().newDraftId)) {
                            a2.mo129406a("new_draft_id", this.f183840a.mo127368ah().newDraftId);
                        }
                        C39162r.m79460a("adjust_filter_complete", a2.f188764a);
                        this.f183840a.f183816k = filterBean;
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.d$m */
    static final class C82170m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82156d f183841a;

        static {
            Covode.recordClassIndex(95998);
        }

        C82170m(C82156d dVar) {
            this.f183841a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            int i;
            int i2;
            int e;
            C88297u uVar = (C88297u) obj;
            if (uVar != null) {
                final C89233z.C89234a aVar = new C89233z.C89234a();
                int i3 = 0;
                aVar.element = false;
                final C89233z.C89234a aVar2 = new C89233z.C89234a();
                aVar2.element = false;
                final int i4 = uVar.f200379k;
                if (uVar.f200378j == 1) {
                    aVar.element = false;
                    aVar2.element = false;
                } else if (uVar.f200378j == 0) {
                    aVar.element = true;
                    aVar2.element = uVar.f200374f;
                }
                C82148a aVar3 = (C82148a) this.f183841a.f183817l.getValue();
                boolean z = aVar.element;
                int i5 = uVar.f200371c;
                int i6 = uVar.f200372d;
                int i7 = uVar.f200373e;
                Boolean bool = uVar.f200377i;
                C821711 r1 = new AbstractC89172b<C82152b, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82170m.C821711 */

                    /* renamed from: a */
                    final /* synthetic */ C82170m f183842a;

                    static {
                        Covode.recordClassIndex(95999);
                    }

                    {
                        this.f183842a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C82152b bVar) {
                        C82152b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        C821721 r0 = new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82170m.C821711.C821721 */

                            /* renamed from: a */
                            final /* synthetic */ C821711 f183846a;

                            static {
                                Covode.recordClassIndex(96000);
                            }

                            {
                                this.f183846a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                if (!aVar.element) {
                                    VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f183846a.f183842a.f183841a.mo114813d().f200144e;
                                    if (vEEditorAutoStartStopArbiter == null) {
                                        C89219l.m154715b();
                                    }
                                    vEEditorAutoStartStopArbiter.mo142667a(true, false);
                                    AbstractC31071f b = this.f183846a.f183842a.f183841a.mo114813d().mo142739b();
                                    if (b != null) {
                                        b.mo56331b(i4);
                                    }
                                    ActivityC0945e T = this.f183846a.f183842a.f183841a.mo114855T();
                                    if (T instanceof VEVideoPublishEditActivity) {
                                        ((VEVideoPublishEditActivity) T).mo111766b(i4);
                                    }
                                } else {
                                    ActivityC0945e T2 = this.f183846a.f183842a.f183841a.mo114855T();
                                    if (T2 instanceof VEVideoPublishEditActivity) {
                                        ((VEVideoPublishEditActivity) T2).mo111766b(C0643b.m2378c(this.f183846a.f183842a.f183841a.mo114855T(), R.color.a2));
                                    }
                                }
                                return C89391z.f203057a;
                            }
                        };
                        C89219l.m154721d(r0, "");
                        bVar2.f183810a = r0;
                        C821732 r02 = new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.gamora.editor.p4278e.C82156d.C82170m.C821711.C821732 */

                            /* renamed from: a */
                            final /* synthetic */ C821711 f183847a;

                            static {
                                Covode.recordClassIndex(96001);
                            }

                            {
                                this.f183847a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                if (aVar.element) {
                                    AbstractC31071f b = this.f183847a.f183842a.f183841a.mo114813d().mo142739b();
                                    if (b != null) {
                                        b.mo56331b(i4);
                                    }
                                    VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f183847a.f183842a.f183841a.mo114813d().f200144e;
                                    if (vEEditorAutoStartStopArbiter == null) {
                                        C89219l.m154715b();
                                    }
                                    vEEditorAutoStartStopArbiter.mo142667a(false, aVar2.element);
                                }
                                return C89391z.f203057a;
                            }
                        };
                        C89219l.m154721d(r02, "");
                        bVar2.f183811b = r02;
                        return C89391z.f203057a;
                    }
                };
                C89219l.m154721d(r1, "");
                C82152b bVar = new C82152b();
                r1.invoke(bVar);
                bVar.f183810a.invoke();
                C70636dh.m124836e(aVar3.f183794c);
                int width = aVar3.f183796e.getWidth();
                C70636dh.m124833c(aVar3.f183794c);
                VESize b = aVar3.f183797f.mo56330b();
                int i8 = b.height;
                int i9 = b.width;
                float f2 = (float) i8;
                float f3 = ((float) i9) / f2;
                if (i7 > i8) {
                    ViewGroup.LayoutParams layoutParams = aVar3.f183796e.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (z) {
                        i3 = (((((C70636dh.m124836e(aVar3.f183794c) - i5) - i6) - i8) / 2) + i5) - marginLayoutParams.topMargin;
                        e = 0;
                    } else {
                        e = (((((C70636dh.m124836e(aVar3.f183794c) - i5) - i6) - i8) / 2) + i5) - marginLayoutParams.topMargin;
                    }
                    aVar3.mo127358a(i3, e);
                    aVar3.f183799h.invoke(Float.valueOf((float) e));
                } else {
                    if (z) {
                        f = (float) i7;
                    } else {
                        f = f2;
                        f2 = (float) i7;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
                    C89219l.m154716b(ofFloat, "");
                    ofFloat.setDuration(300L);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.addUpdateListener(new C82148a.C82149a(aVar3, z, i8, i9, f3, width, i5));
                    ofFloat.addListener(new C82148a.C82150b(bVar));
                    ofFloat.start();
                    if (!C70635dg.m124827a(i9, i8)) {
                        if (!z) {
                            ViewGroup.LayoutParams layoutParams2 = aVar3.f183796e.getLayoutParams();
                            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            aVar3.f183792a = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin - i5;
                            i2 = -aVar3.f183792a;
                            i = 0;
                        } else {
                            i = -aVar3.f183792a;
                            i2 = 0;
                        }
                        aVar3.mo127358a(i, i2);
                    }
                }
                if (bool != null) {
                    aVar3.f183797f.mo56311a(bool.booleanValue());
                } else {
                    aVar3.f183797f.mo56311a(z);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.C72515b
    /* renamed from: c */
    public final void mo114864c(C50649a aVar) {
        boolean z;
        String filterFolder;
        if (aVar != null) {
            if (!aVar.f116986c) {
                FilterBean filterBean = aVar.f116985b;
                if (filterBean == null || !C50811a.m95159a(filterBean)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int j = mo114813d().mo142750j();
                    FilterBean filterBean2 = mo114813d().f200129B;
                    if (filterBean2 != null) {
                        this.f183827w.remove(filterBean2.getFilterFolder());
                        String filterFolder2 = filterBean2.getFilterFolder();
                        FilterBean filterBean3 = aVar.f116985b;
                        if (filterBean3 != null && (filterFolder = filterBean3.getFilterFolder()) != null) {
                            Integer num = this.f183827w.get(filterFolder);
                            if (num != null) {
                                int intValue = num.intValue();
                                AbstractC31071f value = mo114778C().getValue();
                                if (value != null) {
                                    if (intValue == 1) {
                                        C89219l.m154716b(filterFolder2, "");
                                        m142177a(value, filterFolder, filterFolder2, 1.0f, j);
                                    } else if (intValue == 2) {
                                        C89219l.m154716b(filterFolder2, "");
                                        m142177a(value, filterFolder2, filterFolder, 0.0f, j);
                                    }
                                }
                            }
                            this.f183827w.remove(filterFolder);
                        } else {
                            return;
                        }
                    }
                    if (!this.f183827w.keySet().isEmpty()) {
                        Object[] array = this.f183827w.keySet().toArray(new String[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
                        vEComposerFilterParam.autoDump = true;
                        vEComposerFilterParam.removeComposerNodes((String[]) array);
                        mo114813d().mo142739b().mo56263a(j, vEComposerFilterParam);
                        this.f183827w.clear();
                    }
                }
                mo114813d().mo142731a(aVar.f116985b, this.f162556a.f162621a.invoke().booleanValue());
                FilterBean filterBean4 = aVar.f116985b;
                if (filterBean4 != null) {
                    mo127368ah().mSelectedFilterResId = filterBean4.getResId();
                    mo127368ah().mSelectedFilterId = String.valueOf(filterBean4.getId());
                    mo127368ah().mSelectedFilterLabel = filterBean4.getEnName();
                } else {
                    mo127368ah().mSelectedFilterResId = null;
                }
                FilterBean filterBean5 = mo114813d().f200129B;
                if (filterBean5 != null) {
                    Map<String, Integer> map = this.f183827w;
                    String filterFolder3 = filterBean5.getFilterFolder();
                    C89219l.m154716b(filterFolder3, "");
                    map.put(filterFolder3, 3);
                }
            } else if (aVar.f116985b != null) {
                mo114860a(aVar.f116985b, aVar.f116987d);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82156d(C21582f fVar, VEPreviewParams vEPreviewParams, AbstractC89172b<? super C72547d, C89391z> bVar) {
        super(fVar, vEPreviewParams, bVar, (byte) 0);
        boolean z;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(vEPreviewParams, "");
        boolean z2 = false;
        this.f183829y = vEPreviewParams;
        this.f183823s = C89250i.m154773a((AbstractC89171a) new C82174n(fVar));
        if (mo127368ah().videoEditorType == 6) {
            z = true;
        } else {
            z = false;
        }
        this.f183824t = z;
        this.f183825u = (!z || !vEPreviewParams.recordData.isMultiEditRetake) ? true : z2;
        this.f183826v = C89250i.m154773a((AbstractC89171a) new C82165i(this));
        this.f183827w = new LinkedHashMap();
        this.f183828x = new C1213t<>();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a, com.p2082ss.android.ugc.aweme.shortvideo.preview.C72515b
    /* renamed from: a */
    public final void mo114798a(FilterBean filterBean, FilterBean filterBean2, float f) {
        AbstractC31071f value;
        if (filterBean != null && filterBean2 != null && (value = mo114778C().getValue()) != null) {
            if (this.f162556a.f162621a.invoke().booleanValue()) {
                C82179p pVar = new C82179p(value);
                C89219l.m154716b(value, "");
                AbstractC50706n value2 = mo114822k().getValue();
                if (value2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value2, "");
                float a = C50648c.m94909a(filterBean, value2, pVar);
                AbstractC50706n value3 = mo114822k().getValue();
                if (value3 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value3, "");
                m142176a(value, filterBean, filterBean2, f, a, C50648c.m94909a(filterBean2, value3, pVar));
                return;
            }
            C89219l.m154716b(value, "");
            m142176a(value, filterBean, filterBean2, f, 0.0f, 0.0f);
        }
    }

    /* renamed from: a */
    public final void mo127362a(int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = cI_().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = i;
        layoutParams2.topMargin = i2;
        layoutParams2.width = i3;
        layoutParams2.height = i4;
        cI_().setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    private static void m142177a(AbstractC31071f fVar, String str, String str2, float f, int i) {
        VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
        vEComposerFilterParam.autoDump = true;
        vEComposerFilterParam.updateMultiComposerNodes(new String[]{str, str2}, new String[]{"leftSlidePosition", "rightSlidePosition"}, new float[]{f, f});
        fVar.mo56263a(i, vEComposerFilterParam);
    }

    /* renamed from: a */
    private final void m142176a(AbstractC31071f fVar, FilterBean filterBean, FilterBean filterBean2, float f, float f2, float f3) {
        float f4;
        float f5;
        if (filterBean != null && filterBean2 != null) {
            boolean a = C50811a.m95159a(filterBean);
            boolean a2 = C50811a.m95159a(filterBean2);
            if (!a || !a2) {
                if (f < 0.0f) {
                    f4 = Math.abs(f);
                } else {
                    f4 = 1.0f - f;
                }
                if (f2 == 0.0f || f3 == 0.0f) {
                    fVar.mo56289a(filterBean.getFilterFolder(), filterBean2.getFilterFolder(), f4);
                } else {
                    fVar.mo56290a(filterBean.getFilterFolder(), filterBean2.getFilterFolder(), f4, f2, f3);
                }
            } else {
                String filterFolder = filterBean.getFilterFolder();
                String filterFolder2 = filterBean2.getFilterFolder();
                if (f < 0.0f) {
                    f5 = Math.abs(f);
                } else {
                    f5 = 1.0f - f;
                }
                if (Math.abs(f) <= 0.05f) {
                    if (f <= 0.0f) {
                        f5 = 0.0f;
                    } else {
                        f5 = 1.0f;
                    }
                }
                int j = mo114813d().mo142750j();
                if (f5 == 0.0f) {
                    if (this.f183827w.containsKey(filterFolder)) {
                        C89219l.m154716b(filterFolder, "");
                        C89219l.m154716b(filterFolder2, "");
                        m142177a(fVar, filterFolder, filterFolder2, 0.0f, j);
                        VEComposerFilterParam vEComposerFilterParam = new VEComposerFilterParam();
                        vEComposerFilterParam.autoDump = true;
                        vEComposerFilterParam.removeComposerNodes(new String[]{filterBean.getFilterFolder()});
                        fVar.mo56263a(j, vEComposerFilterParam);
                        this.f183827w.remove(filterFolder2);
                    }
                } else if (f5 != 1.0f) {
                    if (!this.f183827w.containsKey(filterFolder)) {
                        VEComposerFilterParam vEComposerFilterParam2 = new VEComposerFilterParam();
                        vEComposerFilterParam2.autoDump = true;
                        vEComposerFilterParam2.appendComposerNodesWithTag(new String[]{filterFolder + ":leftSlidePosition:0"}, new String[]{""});
                        fVar.mo56263a(j, vEComposerFilterParam2);
                        vEComposerFilterParam2.updateMultiComposerNodes(new String[]{filterFolder}, new String[]{C50811a.m95160b(filterBean)}, new float[]{f2});
                        fVar.mo56263a(j, vEComposerFilterParam2);
                        Map<String, Integer> map = this.f183827w;
                        C89219l.m154716b(filterFolder, "");
                        map.put(filterFolder, 1);
                    }
                    if (!this.f183827w.containsKey(filterFolder2)) {
                        VEComposerFilterParam vEComposerFilterParam3 = new VEComposerFilterParam();
                        vEComposerFilterParam3.autoDump = true;
                        vEComposerFilterParam3.appendComposerNodesWithTag(new String[]{filterFolder2 + ":rightSlidePosition:1"}, new String[]{""});
                        fVar.mo56263a(j, vEComposerFilterParam3);
                        vEComposerFilterParam3.updateMultiComposerNodes(new String[]{filterFolder2}, new String[]{C50811a.m95160b(filterBean2)}, new float[]{f3});
                        fVar.mo56263a(j, vEComposerFilterParam3);
                        Map<String, Integer> map2 = this.f183827w;
                        C89219l.m154716b(filterFolder2, "");
                        map2.put(filterFolder2, 2);
                    }
                    C89219l.m154716b(filterFolder, "");
                    C89219l.m154716b(filterFolder2, "");
                    m142177a(fVar, filterFolder, filterFolder2, f5, j);
                } else if (this.f183827w.containsKey(filterFolder2)) {
                    C89219l.m154716b(filterFolder, "");
                    C89219l.m154716b(filterFolder2, "");
                    m142177a(fVar, filterFolder, filterFolder2, 1.0f, j);
                    VEComposerFilterParam vEComposerFilterParam4 = new VEComposerFilterParam();
                    vEComposerFilterParam4.autoDump = true;
                    vEComposerFilterParam4.removeComposerNodes(new String[]{filterBean2.getFilterFolder()});
                    fVar.mo56263a(j, vEComposerFilterParam4);
                    this.f183827w.remove(filterFolder2);
                }
            }
        }
    }
}

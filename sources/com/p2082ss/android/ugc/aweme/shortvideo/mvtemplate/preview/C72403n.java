package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.AbstractC22213f;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.experiment.C46916ew;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72323j;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72316c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3845a.C72296a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72357f;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a.animationInterpolatorC74267a;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.view.widget.AVLoadingLayout;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.ttvideoengine.AbstractC86651x;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n */
public final class C72403n extends AbstractC22213f implements AbstractC72364c {

    /* renamed from: v */
    public static final C72404a f162309v = new C72404a((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f162310A = C89250i.m154773a((AbstractC89171a) new C72415l(this));

    /* renamed from: B */
    private final AbstractC89244h f162311B = C89250i.m154773a((AbstractC89171a) new C72406c(this));

    /* renamed from: C */
    private final AbstractC89244h f162312C = C89250i.m154773a((AbstractC89171a) new C72411h(this));

    /* renamed from: f */
    public int f162313f;

    /* renamed from: g */
    public String f162314g = "";

    /* renamed from: h */
    public EnumC72405b f162315h = EnumC72405b.NONE;

    /* renamed from: i */
    public AbstractC72363b f162316i;

    /* renamed from: j */
    public C86313ai f162317j;

    /* renamed from: k */
    public boolean f162318k;

    /* renamed from: l */
    public boolean f162319l;

    /* renamed from: t */
    public boolean f162320t;

    /* renamed from: u */
    public Surface f162321u;

    /* renamed from: w */
    private MvImageChooseAdapter.MyMediaModel f162322w;

    /* renamed from: x */
    private int f162323x;

    /* renamed from: y */
    private final AbstractC89244h f162324y = C89250i.m154773a((AbstractC89171a) new C72414k(this));

    /* renamed from: z */
    private View f162325z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$b */
    public enum EnumC72405b {
        NONE,
        FILE_DELETED,
        DISABLE_4K,
        NORMAL_VIDEO_PLAY;

        static {
            Covode.recordClassIndex(85078);
        }
    }

    static {
        Covode.recordClassIndex(85076);
    }

    /* renamed from: I */
    private final ImageView m127685I() {
        return (ImageView) this.f162311B.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final TextureView mo62771E() {
        return (TextureView) this.f162324y.getValue();
    }

    /* renamed from: F */
    public final SimpleDraweeView mo114674F() {
        return (SimpleDraweeView) this.f162310A.getValue();
    }

    /* renamed from: G */
    public final AVLoadingLayout mo114675G() {
        return (AVLoadingLayout) this.f162312C.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$a */
    public static final class C72404a {
        static {
            Covode.recordClassIndex(85077);
        }

        private C72404a() {
        }

        public /* synthetic */ C72404a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$e */
    public static final class C72408e extends AbstractC72323j {

        /* renamed from: b */
        final /* synthetic */ View f162329b;

        static {
            Covode.recordClassIndex(85081);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72323j
        /* renamed from: c */
        public final View mo114591c() {
            return this.f162329b;
        }

        C72408e(View view) {
            this.f162329b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$j */
    public static final class C72413j extends AbstractC72323j {

        /* renamed from: b */
        final /* synthetic */ View f162334b;

        static {
            Covode.recordClassIndex(85086);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72323j
        /* renamed from: c */
        public final View mo114591c() {
            return this.f162334b;
        }

        C72413j(View view) {
            this.f162334b = view;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72364c
    /* renamed from: d */
    public final void mo114661d() {
        mo114676H();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$i */
    public static final class C72412i implements AbstractC72357f {

        /* renamed from: a */
        final /* synthetic */ C72403n f162333a;

        static {
            Covode.recordClassIndex(85085);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72318e
        /* renamed from: b */
        public final void mo114586b() {
            this.f162333a.mo114676H();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72357f
        /* renamed from: c */
        public final void mo114639c() {
            AbstractC72363b bVar = this.f162333a.f162316i;
            if (bVar != null) {
                bVar.mo114655f();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72357f
        /* renamed from: d */
        public final void mo114640d() {
            AbstractC72363b bVar = this.f162333a.f162316i;
            if (bVar != null) {
                bVar.mo114656g();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72318e
        /* renamed from: a */
        public final void mo114584a() {
            if (C46916ew.m90217b()) {
                AbstractC72363b bVar = this.f162333a.f162316i;
                if (bVar != null) {
                    bVar.mo114654e();
                    return;
                }
                return;
            }
            this.f162333a.mo114676H();
        }

        C72412i(C72403n nVar) {
            this.f162333a = nVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72318e
        /* renamed from: a */
        public final void mo114585a(float f) {
            AbstractC72363b bVar = this.f162333a.f162316i;
            if (bVar != null) {
                bVar.mo114648a(f);
            }
            if (this.f162333a.f162317j == null) {
                return;
            }
            if (f < 1.0f) {
                C72403n.m127688a(this.f162333a).mo137255l();
            } else if (f == 1.0f) {
                C72403n.m127688a(this.f162333a).mo137251k();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$c */
    static final class C72406c extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C72403n f162327a;

        static {
            Covode.recordClassIndex(85079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72406c(C72403n nVar) {
            super(0);
            this.f162327a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            View c = this.f162327a.mo36475c(R.id.aj2);
            C89219l.m154716b(c, "");
            return c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$d */
    public static final class C72407d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72403n f162328a;

        static {
            Covode.recordClassIndex(85080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72407d(C72403n nVar) {
            super(0);
            this.f162328a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC72363b bVar = this.f162328a.f162316i;
            if (bVar != null) {
                bVar.mo114653d();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$h */
    static final class C72411h extends AbstractC89220m implements AbstractC89171a<AVLoadingLayout> {

        /* renamed from: a */
        final /* synthetic */ C72403n f162332a;

        static {
            Covode.recordClassIndex(85084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72411h(C72403n nVar) {
            super(0);
            this.f162332a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AVLoadingLayout invoke() {
            View c = this.f162332a.mo36475c(R.id.cg3);
            C89219l.m154716b(c, "");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$k */
    static final class C72414k extends AbstractC89220m implements AbstractC89171a<TextureView> {

        /* renamed from: a */
        final /* synthetic */ C72403n f162335a;

        static {
            Covode.recordClassIndex(85087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72414k(C72403n nVar) {
            super(0);
            this.f162335a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextureView invoke() {
            View c = this.f162335a.mo36475c(R.id.eh4);
            C89219l.m154716b(c, "");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$l */
    static final class C72415l extends AbstractC89220m implements AbstractC89171a<SimpleDraweeView> {

        /* renamed from: a */
        final /* synthetic */ C72403n f162336a;

        static {
            Covode.recordClassIndex(85088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72415l(C72403n nVar) {
            super(0);
            this.f162336a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SimpleDraweeView invoke() {
            View c = this.f162336a.mo36475c(R.id.c0f);
            C89219l.m154716b(c, "");
            return c;
        }
    }

    /* renamed from: J */
    private final void m127686J() {
        MvImageChooseAdapter.MyMediaModel myMediaModel = this.f162322w;
        if (myMediaModel != null) {
            C84402a.m145174a(mo114674F(), C84896h.m145871d(myMediaModel.f134662b).toString(), -1, -1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72364c
    /* renamed from: a */
    public final void mo114657a() {
        if (this.f162317j != null) {
            C86313ai aiVar = this.f162317j;
            if (aiVar == null) {
                C89219l.m154710a("videoEngine");
            }
            if (aiVar.f193374v == 2) {
                C86313ai aiVar2 = this.f162317j;
                if (aiVar2 == null) {
                    C89219l.m154710a("videoEngine");
                }
                aiVar2.mo137251k();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72364c
    /* renamed from: b */
    public final void mo114660b() {
        if (this.f162317j != null) {
            C86313ai aiVar = this.f162317j;
            if (aiVar == null) {
                C89219l.m154710a("videoEngine");
            }
            if (aiVar.f193374v == 1) {
                C86313ai aiVar2 = this.f162317j;
                if (aiVar2 == null) {
                    C89219l.m154710a("videoEngine");
                }
                aiVar2.mo137255l();
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        if (((AbstractC22213f) this).f52519c && this.f162318k) {
            C86313ai aiVar = this.f162317j;
            if (aiVar == null) {
                C89219l.m154710a("videoEngine");
            }
            aiVar.mo137251k();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        if (((AbstractC22213f) this).f52519c && this.f162318k) {
            C86313ai aiVar = this.f162317j;
            if (aiVar == null) {
                C89219l.m154710a("videoEngine");
            }
            aiVar.mo137255l();
        }
    }

    /* renamed from: H */
    public final void mo114676H() {
        View c;
        AbstractC72363b bVar = this.f162316i;
        if (!(bVar == null || (c = bVar.mo114652c()) == null)) {
            C72408e eVar = new C72408e(c);
            AbstractC72352c a = C72402m.m127682a(this.f162325z);
            if (a != null) {
                a.mo114510a(eVar.mo114589a(), eVar.mo114590b(), new C72316c(), m127687K(), new C72407d(this));
                if (C89391z.f203057a != null) {
                    return;
                }
            }
        }
        AbstractC72363b bVar2 = this.f162316i;
        if (bVar2 != null) {
            bVar2.mo114653d();
        }
    }

    /* renamed from: K */
    private static C72296a m127687K() {
        C72296a aVar = new C72296a();
        aVar.f162078f = 220;
        aVar.f162079g = 220;
        aVar.f162080h = 220;
        aVar.f162081i = 220;
        aVar.mo114562a(new animationInterpolatorC74267a(C72402m.f162308a.getFirst(), C72402m.f162308a.getSecond()));
        aVar.mo114563b(new animationInterpolatorC74267a(C72402m.f162308a.getFirst(), C72402m.f162308a.getSecond()));
        aVar.mo114564c(new animationInterpolatorC74267a(C72402m.f162308a.getFirst(), C72402m.f162308a.getSecond()));
        aVar.mo114565d(new animationInterpolatorC74267a(C72402m.f162308a.getFirst(), C72402m.f162308a.getSecond()));
        return aVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22213f
    /* renamed from: n_ */
    public final void mo22713n_() {
        int i;
        super.mo22713n_();
        if (this.f162317j != null) {
            C86313ai aiVar = this.f162317j;
            if (aiVar == null) {
                C89219l.m154710a("videoEngine");
            }
            aiVar.mo137261n();
            Surface surface = this.f162321u;
            if (surface != null) {
                surface.release();
            }
            if (this.f162318k) {
                boolean z = this.f162320t;
                JSONObject jSONObject = new JSONObject();
                int i2 = 0;
                if (this.f162315h == EnumC72405b.DISABLE_4K) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_4k", i);
                jSONObject.put("error_code", this.f162313f);
                jSONObject.put("error_message", this.f162314g);
                jSONObject.put("display_status", this.f162315h.ordinal());
                C86313ai aiVar2 = this.f162317j;
                if (aiVar2 == null) {
                    C89219l.m154710a("videoEngine");
                }
                if (aiVar2.f192970bg != null) {
                    i2 = aiVar2.f192970bg.f195259a.mo137905c();
                }
                jSONObject.put("video_watched_duration", Float.valueOf(((float) i2) / 1000.0f));
                C40982q.m82520a("tool_performance_preview_video_play_status", z ? 1 : 0, jSONObject);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72364c
    /* renamed from: a */
    public final void mo114659a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        this.f162322w = myMediaModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$f */
    public static final class C72409f extends AbstractC72362a {

        /* renamed from: a */
        final /* synthetic */ C72403n f162330a;

        static {
            Covode.recordClassIndex(85082);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72409f(C72403n nVar) {
            this.f162330a = nVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72362a, com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16749a(C86633c cVar) {
            super.mo16749a(cVar);
            if (cVar != null) {
                this.f162330a.f162313f = cVar.f195251a;
                C72403n nVar = this.f162330a;
                String cVar2 = cVar.toString();
                C89219l.m154716b(cVar2, "");
                nVar.f162314g = cVar2;
            }
            this.f162330a.f162320t = true;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72362a, com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: c */
        public final void mo16752c(C86313ai aiVar) {
            super.mo16752c(aiVar);
            this.f162330a.mo114674F().setVisibility(8);
            this.f162330a.mo114675G().setVisibility(8);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72362a, com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: b */
        public final void mo16750b(C86313ai aiVar) {
            this.f162330a.f162318k = true;
            if (!((AbstractC22213f) this.f162330a).f52519c) {
                C72403n.m127688a(this.f162330a).mo137255l();
            }
            C72403n nVar = this.f162330a;
            int u = C72403n.m127688a(nVar).mo137269u();
            int v = C72403n.m127688a(this.f162330a).mo137270v();
            if (u > 0 && v > 0) {
                int b = C13628n.m24521b(nVar.mo36486t());
                int a = C13628n.m24504a(nVar.mo36486t());
                float f = (float) v;
                float f2 = (float) u;
                float a2 = (((float) C13628n.m24504a(nVar.mo36486t())) * f) / f2;
                float f3 = (float) b;
                if (a2 >= f3) {
                    a = (int) ((f3 * f2) / f);
                } else {
                    b = (int) a2;
                }
                C13628n.m24511a(nVar.mo62771E(), a, b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.n$g */
    public static final class TextureView$SurfaceTextureListenerC72410g implements TextureView.SurfaceTextureListener {

        /* renamed from: a */
        final /* synthetic */ C72403n f162331a;

        static {
            Covode.recordClassIndex(85083);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C89219l.m154721d(surfaceTexture, "");
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C89219l.m154721d(surfaceTexture, "");
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C89219l.m154721d(surfaceTexture, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        TextureView$SurfaceTextureListenerC72410g(C72403n nVar) {
            this.f162331a = nVar;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C89219l.m154721d(surfaceTexture, "");
            if (this.f162331a.f162317j != null && this.f162331a.f162321u == null) {
                this.f162331a.f162321u = new Surface(surfaceTexture);
                C72403n.m127688a(this.f162331a).mo137167a(this.f162331a.f162321u);
                if (((AbstractC22213f) this.f162331a).f52519c) {
                    this.f162331a.f162319l = true;
                    C72403n.m127688a(this.f162331a).mo137251k();
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C86313ai m127688a(C72403n nVar) {
        C86313ai aiVar = nVar.f162317j;
        if (aiVar == null) {
            C89219l.m154710a("videoEngine");
        }
        return aiVar;
    }

    @Override // com.bytedance.scene.group.AbstractC22213f
    /* renamed from: a */
    public final void mo36459a(boolean z) {
        AbstractC72352c a;
        super.mo36459a(z);
        if (!z && (a = C72402m.m127682a(this.f162325z)) != null) {
            a.mo114506a();
        }
        if (this.f162317j == null) {
            return;
        }
        if (this.f162318k) {
            if (z) {
                C86313ai aiVar = this.f162317j;
                if (aiVar == null) {
                    C89219l.m154710a("videoEngine");
                }
                aiVar.mo137251k();
                return;
            }
            C86313ai aiVar2 = this.f162317j;
            if (aiVar2 == null) {
                C89219l.m154710a("videoEngine");
            }
            aiVar2.mo137255l();
            C86313ai aiVar3 = this.f162317j;
            if (aiVar3 == null) {
                C89219l.m154710a("videoEngine");
            }
            aiVar3.mo137163a(0, (AbstractC86651x) null);
        } else if (!this.f162319l && this.f162321u != null && z) {
            C86313ai aiVar4 = this.f162317j;
            if (aiVar4 == null) {
                C89219l.m154710a("videoEngine");
            }
            aiVar4.mo137251k();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22213f
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        int i;
        String str;
        View c;
        AbstractC72363b bVar;
        int i2;
        MvImageChooseAdapter.MyMediaModel myMediaModel;
        String str2;
        MvImageChooseAdapter.MyMediaModel myMediaModel2;
        super.mo22704a(bundle);
        mo62771E().setVisibility(8);
        mo114674F().setVisibility(8);
        m127685I().setVisibility(8);
        MvImageChooseAdapter.MyMediaModel myMediaModel3 = this.f162322w;
        int i3 = 0;
        if (myMediaModel3 != null) {
            i = myMediaModel3.f134672l;
        } else {
            i = 0;
        }
        String str3 = null;
        if (!((i > 0 && (myMediaModel2 = this.f162322w) != null && myMediaModel2.f134673m > 0) || (myMediaModel = this.f162322w) == null || (str2 = myMediaModel.f134662b) == null)) {
            C63244g.m114602a().mo73293u();
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str2);
            if (videoFileInfo != null) {
                MvImageChooseAdapter.MyMediaModel myMediaModel4 = this.f162322w;
                if (myMediaModel4 != null) {
                    myMediaModel4.f134672l = videoFileInfo.width;
                }
                MvImageChooseAdapter.MyMediaModel myMediaModel5 = this.f162322w;
                if (myMediaModel5 != null) {
                    myMediaModel5.f134673m = videoFileInfo.height;
                }
            }
        }
        MvImageChooseAdapter.MyMediaModel myMediaModel6 = this.f162322w;
        if (myMediaModel6 != null) {
            str = myMediaModel6.f134662b;
        } else {
            str = null;
        }
        if (!C84902i.m145892a(str)) {
            this.f162315h = EnumC72405b.FILE_DELETED;
            m127685I().setVisibility(0);
        } else if (C72402m.m127683a(this.f162322w)) {
            this.f162315h = EnumC72405b.DISABLE_4K;
            mo114674F().setVisibility(0);
            m127686J();
        } else {
            this.f162315h = EnumC72405b.NORMAL_VIDEO_PLAY;
            mo114674F().setVisibility(0);
            m127686J();
            mo62771E().setVisibility(0);
            mo114675G().setVisibility(0);
            Activity t = mo36486t();
            C89219l.m154716b(t, "");
            Context applicationContext = t.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C86313ai aiVar = new C86313ai(applicationContext, 2);
            this.f162317j = aiVar;
            aiVar.f192899aJ = "preview";
            C86313ai aiVar2 = this.f162317j;
            if (aiVar2 == null) {
                C89219l.m154710a("videoEngine");
            }
            aiVar2.mo137242h(true);
            C86313ai aiVar3 = this.f162317j;
            if (aiVar3 == null) {
                C89219l.m154710a("videoEngine");
            }
            MvImageChooseAdapter.MyMediaModel myMediaModel7 = this.f162322w;
            if (myMediaModel7 != null) {
                str3 = myMediaModel7.f134662b;
            }
            aiVar3.mo137231f(str3);
            C86313ai aiVar4 = this.f162317j;
            if (aiVar4 == null) {
                C89219l.m154710a("videoEngine");
            }
            aiVar4.mo137173a(new C72409f(this));
            mo62771E().setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC72410g(this));
        }
        View c2 = mo36475c(R.id.b_c);
        this.f162325z = c2;
        AbstractC72352c a = C72402m.m127682a(c2);
        if (a != null) {
            MvImageChooseAdapter.MyMediaModel myMediaModel8 = this.f162322w;
            if (myMediaModel8 != null) {
                i2 = myMediaModel8.f134672l;
            } else {
                i2 = 0;
            }
            MvImageChooseAdapter.MyMediaModel myMediaModel9 = this.f162322w;
            if (myMediaModel9 != null) {
                i3 = myMediaModel9.f134673m;
            }
            a.mo114508a(i2, i3);
            a.setGestureListener(new C72412i(this));
        }
        AbstractC72363b bVar2 = this.f162316i;
        if (!(bVar2 == null || (c = bVar2.mo114652c()) == null || (bVar = this.f162316i) == null || !bVar.mo114650a())) {
            AbstractC72363b bVar3 = this.f162316i;
            if (bVar3 != null) {
                bVar3.mo114651b();
            }
            C72413j jVar = new C72413j(c);
            AbstractC72352c a2 = C72402m.m127682a(this.f162325z);
            if (a2 != null) {
                a2.mo114509a(jVar.mo114589a(), jVar.mo114590b(), new C72316c(), m127687K());
            }
        }
        ((AbstractC22213f) this).f52518b.getLifecycle().mo4012a(new PreviewVideoScene$onActivityCreated$3(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72364c
    /* renamed from: a */
    public final void mo114658a(int i, AbstractC72363b bVar) {
        C89219l.m154721d(bVar, "");
        this.f162323x = i;
        this.f162316i = bVar;
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        if (C46916ew.m90217b()) {
            i = R.layout.at_;
        } else {
            i = R.layout.at9;
        }
        View a = C1764a.m5927a(layoutInflater, i, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }
}

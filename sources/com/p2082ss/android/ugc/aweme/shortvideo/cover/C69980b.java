package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63223bh;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65374bn;
import com.p2082ss.android.ugc.aweme.property.C65388ca;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73972ax;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74295o;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import dmt.p4542av.video.C88296t;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.b */
public final class C69980b extends Fragment implements ChooseVideoCoverViewV2.AbstractC74239a {

    /* renamed from: A */
    private final int f156402A = 7;

    /* renamed from: a */
    public ChooseVideoCoverViewV2 f156403a;

    /* renamed from: b */
    TextView f156404b;

    /* renamed from: c */
    View f156405c;

    /* renamed from: d */
    public ViewGroup f156406d;

    /* renamed from: e */
    public FrameLayout f156407e;

    /* renamed from: f */
    public FrameLayout f156408f;

    /* renamed from: g */
    public ViewGroup f156409g;

    /* renamed from: h */
    public FrameLayout f156410h;

    /* renamed from: i */
    FrameLayout f156411i;

    /* renamed from: j */
    AbstractC69978a f156412j;

    /* renamed from: k */
    final SafeHandler f156413k = new SafeHandler(this);

    /* renamed from: l */
    public AbstractC69983a f156414l;

    /* renamed from: m */
    TextView f156415m;

    /* renamed from: n */
    public float f156416n;

    /* renamed from: o */
    public final SparseArray<Float> f156417o = new SparseArray<>();

    /* renamed from: p */
    public final SparseArray<EffectTextModel> f156418p = new SparseArray<>();

    /* renamed from: q */
    public boolean f156419q;

    /* renamed from: r */
    ProgressDialogC84958b f156420r;

    /* renamed from: s */
    public C1213t<Bitmap> f156421s;

    /* renamed from: t */
    public C1213t<Boolean> f156422t;

    /* renamed from: u */
    public boolean f156423u = false;

    /* renamed from: v */
    private final SafeHandler f156424v = new SafeHandler(this);

    /* renamed from: w */
    private boolean f156425w;

    /* renamed from: x */
    private final C1213t<Integer> f156426x = new C1213t<>();

    /* renamed from: y */
    private final int f156427y = 0;

    /* renamed from: z */
    private final int f156428z = 1;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.b$a */
    public interface AbstractC69983a {
        static {
            Covode.recordClassIndex(82397);
        }

        /* renamed from: a */
        AbstractC31071f mo110436a();

        /* renamed from: b */
        C1213t<C88296t> mo110437b();

        /* renamed from: c */
        VideoPublishEditModel mo110438c();
    }

    static {
        Covode.recordClassIndex(82394);
    }

    /* renamed from: b */
    public final boolean mo110434b() {
        if (!C73972ax.m130099a(this.f156414l.mo110438c().mVideoCoverStartTm, this.f156416n / 1000.0f)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.AbstractC74239a
    /* renamed from: c */
    public final void mo110435c() {
        this.f156413k.removeCallbacksAndMessages(null);
        this.f156414l.mo110437b().setValue(C88296t.m153437b());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C74295o oVar;
        if ((this.f156403a.getAdapter() instanceof C74295o) && (oVar = (C74295o) this.f156403a.getAdapter()) != null) {
            oVar.mo116904a();
        }
        this.f156413k.removeCallbacksAndMessages(null);
        this.f156424v.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo110427a() {
        ProgressDialogC84958b bVar = this.f156420r;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.f156413k.removeCallbacksAndMessages(null);
        this.f156414l.mo110437b().setValue(C88296t.m153437b());
        this.f156414l.mo110436a().mo56311a(true);
        this.f156414l.mo110437b().setValue(C88296t.m153435a());
        if (getFragmentManager() != null && isAdded()) {
            requireFragmentManager().mo3552a().mo3455a(this).mo3473c();
        }
    }

    /* renamed from: c */
    private int m123584c(float f) {
        return (int) (((float) this.f156414l.mo110436a().mo56368j()) * f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo110432a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isMvThemeVideoType() || this.f156425w) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.AbstractC74239a
    /* renamed from: a */
    public final void mo110428a(float f) {
        this.f156419q = true;
        this.f156414l.mo110437b().setValue(C88296t.m153436a((long) m123584c(f)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AbstractC69983a) {
            this.f156414l = (AbstractC69983a) context;
            this.f156425w = C65388ca.m117085a();
            C71827ew.m126830c((Activity) context);
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.AbstractC74239a
    /* renamed from: b */
    public final void mo110433b(float f) {
        mo110429a(f, true);
        C84425b a = new C84425b().mo129406a("creation_id", this.f156414l.mo110438c().creationId).mo129406a("shoot_way", this.f156414l.mo110438c().mShootWay);
        if (this.f156414l.mo110438c().draftId != 0) {
            a.mo129403a("draft_id", this.f156414l.mo110438c().draftId);
        }
        if (!TextUtils.isEmpty(this.f156414l.mo110438c().newDraftId)) {
            a.mo129406a("new_draft_id", this.f156414l.mo110438c().newDraftId);
        }
        C39162r.m79460a("cover_click", a.f188764a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        C85581w.EnumC85602a aVar;
        AbstractC69978a vEVideoCoverGeneratorImpl;
        super.onActivityCreated(bundle);
        this.f156403a.setOnScrollListener(this);
        VideoPublishEditModel c = this.f156414l.mo110438c();
        int i = 0;
        this.f156417o.put(0, Float.valueOf(c.getCoverPublishModel().getVideoCoverViewX()));
        this.f156416n = c.mVideoCoverStartTm * 1000.0f;
        this.f156418p.put(0, c.getCoverPublishModel().getEffectTextModel());
        this.f156403a.setItemCount(7);
        this.f156403a.setTotalPage(1);
        if (C65374bn.m117070a()) {
            aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NORMAL;
        } else {
            aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NOEFFECT;
        }
        if (mo110432a(c)) {
            if (this.f156414l.mo110436a() != null) {
                i = this.f156414l.mo110436a().mo56368j();
            }
            vEVideoCoverGeneratorImpl = new MvEffectVideoCoverGeneratorImpl(i);
        } else if (c.isMultiVideoEdit()) {
            vEVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(this.f156414l.mo110436a(), this, this.f156403a.getCoverSize(), this.f156414l.mo110436a().mo56368j(), 0, aVar);
        } else {
            vEVideoCoverGeneratorImpl = new VEVideoCoverGeneratorImpl(this.f156414l.mo110436a(), this, this.f156403a.getCoverSize(), aVar, "choose_cover");
        }
        this.f156412j = vEVideoCoverGeneratorImpl;
        this.f156403a.post(new RunnableC69991j(this, c));
        this.f156426x.observe(this, C69992k.f156444a);
        this.f156404b.setOnClickListener(new AbstractView$OnClickListenerC81432d() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cover.C69980b.C699811 */

            static {
                Covode.recordClassIndex(82395);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                VideoPublishEditModel c = C69980b.this.f156414l.mo110438c();
                AbstractC31071f a = C69980b.this.f156414l.mo110436a();
                boolean b = C69980b.this.mo110434b();
                EffectTextModel effectTextModel = new EffectTextModel();
                AbstractC63223bh K = C63244g.m114602a().mo73265K();
                a.mo56330b();
                a.mo56330b();
                K.mo101704a(c, effectTextModel, b, true, new C69999r(this, effectTextModel, c));
            }
        });
        this.f156405c.setOnClickListener(new AbstractView$OnClickListenerC81432d() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cover.C69980b.C699822 */

            static {
                Covode.recordClassIndex(82396);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                C69980b.this.mo110431a((AbstractC89172b<Boolean, Boolean>) null);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo110430a(long j) {
        this.f156414l.mo110437b().setValue(C88296t.m153437b());
        this.f156414l.mo110437b().setValue(C88296t.m153435a());
        this.f156413k.postDelayed(new RunnableC69988g(this, j), 1000);
    }

    /* renamed from: a */
    public final void mo110431a(AbstractC89172b<Boolean, Boolean> bVar) {
        VideoPublishEditModel c = this.f156414l.mo110438c();
        AbstractC31071f a = this.f156414l.mo110436a();
        EffectTextModel effectTextModel = new EffectTextModel();
        boolean b = mo110434b();
        AbstractC63223bh K = C63244g.m114602a().mo73265K();
        a.mo56330b();
        a.mo56330b();
        K.mo101704a(c, effectTextModel, b, false, new C69987f(this, effectTextModel, bVar));
    }

    /* renamed from: a */
    public final void mo110429a(float f, boolean z) {
        this.f156419q = z;
        C88296t b = C88296t.m153438b((long) m123584c(f));
        this.f156414l.mo110437b().setValue(b);
        if (this.f156412j != null) {
            mo110430a(b.f200367b);
        }
    }

    /* renamed from: a */
    static boolean m123583a(EffectTextModel effectTextModel, EffectTextModel effectTextModel2) {
        if (effectTextModel == effectTextModel2 || effectTextModel.getTextSticker() == effectTextModel2.getTextSticker()) {
            return false;
        }
        if (effectTextModel.getTextSticker() == null || effectTextModel2.getTextSticker() == null) {
            return true;
        }
        if (!(effectTextModel.getTextSticker().stickerId == null || effectTextModel2.getTextSticker().stickerId == null)) {
            if (!effectTextModel.getTextSticker().stickerId.equals(effectTextModel2.getTextSticker().stickerId)) {
                return true;
            }
            try {
                TextStickerData textStickerData = (TextStickerData) C63244g.m114602a().mo73261G().mo46670a(effectTextModel.getTextSticker().extra, TextStickerData.class);
                TextStickerData textStickerData2 = (TextStickerData) C63244g.m114602a().mo73261G().mo46670a(effectTextModel2.getTextSticker().extra, TextStickerData.class);
                if (textStickerData == textStickerData2) {
                    return false;
                }
                if (textStickerData == null || textStickerData2 == null) {
                    return true;
                }
                C89219l.m154721d(textStickerData, "");
                C89219l.m154721d(textStickerData2, "");
                if (TextStickerData.C46070b.C46071a.m88931a(textStickerData.getX(), textStickerData2.getX())) {
                    if (TextStickerData.C46070b.C46071a.m88931a(textStickerData.getY(), textStickerData2.getY())) {
                        if (textStickerData.getFontSize() == textStickerData2.getFontSize()) {
                            if (textStickerData.getColor() == textStickerData2.getColor()) {
                                if (textStickerData.getScale() == textStickerData2.getScale()) {
                                    if (textStickerData.getRotation() == textStickerData2.getRotation()) {
                                        if (textStickerData.getBgMode() == textStickerData2.getBgMode()) {
                                            if (textStickerData.getAlign() == textStickerData2.getAlign()) {
                                                if (!C89219l.m154714a((Object) TextStickerData.C46070b.C46072b.m88932a(textStickerData.getTextWrapList()), (Object) TextStickerData.C46070b.C46072b.m88932a(textStickerData2.getTextWrapList()))) {
                                                    return true;
                                                }
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f156403a = (ChooseVideoCoverViewV2) C0792v.m2762c(view, (int) R.id.a5c);
        this.f156404b = (TextView) C0792v.m2762c(view, (int) R.id.etl);
        this.f156405c = C0792v.m2762c(view, (int) R.id.etk);
        this.f156407e = (FrameLayout) C0792v.m2762c(view, (int) R.id.fe5);
        this.f156408f = (FrameLayout) C0792v.m2762c(view, (int) R.id.b3t);
        this.f156406d = (ViewGroup) C0792v.m2762c(view, (int) R.id.be4);
        this.f156409g = (ViewGroup) C0792v.m2762c(view, (int) R.id.dgq);
        this.f156410h = (FrameLayout) C0792v.m2762c(view, (int) R.id.b3s);
        this.f156411i = (FrameLayout) C0792v.m2762c(view, (int) R.id.b3r);
        TextView textView = (TextView) C0792v.m2762c(view, (int) R.id.eto);
        this.f156415m = textView;
        textView.setVisibility(8);
        C63244g.m114602a().mo73265K().mo101703a((ActivityC0218d) getActivity(), "coverpic", "covertext", this.f156410h, this.f156411i, this.f156408f, this.f156414l.mo110438c().getCoverPublishModel().getEffectTextModel(), this.f156414l.mo110438c().getAvetParameter(), new C69984c(this));
        C0792v.m2762c(view, (int) R.id.ffy).setOnTouchListener(View$OnTouchListenerC69985d.f156432a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.d_, viewGroup, false);
    }
}

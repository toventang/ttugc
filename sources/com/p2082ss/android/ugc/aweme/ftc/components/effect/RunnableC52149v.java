package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46348c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65374bn;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70542w;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71991a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74297p;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.C85581w;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.v */
final /* synthetic */ class RunnableC52149v implements Runnable {

    /* renamed from: a */
    private final C52125f f120143a;

    static {
        Covode.recordClassIndex(61530);
    }

    RunnableC52149v(C52125f fVar) {
        this.f120143a = fVar;
    }

    public final void run() {
        C52125f fVar = this.f120143a;
        int frameHeight = fVar.f120113w.getFrameHeight();
        int frameWidth = fVar.f120113w.getFrameWidth();
        int ceil = (int) Math.ceil((double) (((float) (C13628n.m24504a(fVar.f120073L) - (Math.round(C13628n.m24520b(fVar.f120073L, 24.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
        fVar.f120113w.setCoverSize(ceil);
        fVar.f120116z = new VEVideoCoverGeneratorImpl(fVar.f120062A, fVar.f120073L, fVar.f120113w.getCoverSize(), C65374bn.m117070a() ? C85581w.EnumC85602a.GET_FRAMES_MODE_NORMAL : C85581w.EnumC85602a.GET_FRAMES_MODE_NOEFFECT, "special_effects");
        fVar.f120064C = new C74297p(fVar.f120116z, frameWidth, frameHeight, ceil);
        if (fVar.f120092b.isMvThemeVideoType()) {
            C71991a aVar = new C71991a(frameWidth, frameHeight);
            fVar.f120113w.setAdapter(aVar);
            C71993c cVar = new C71993c();
            cVar.f161328b = C52101ac.f120021a;
            cVar.f161339m = fVar.f120082U;
            cVar.f161338l = fVar.f120081T;
            cVar.mo114167a(frameWidth, frameHeight).mo114168a(fVar.f120073L, fVar.f120062A, ceil, new C52103ae(aVar));
            fVar.f120113w.setAdapter(aVar);
            return;
        }
        fVar.f120113w.setAdapter(new ChooseVideoCoverView.C74231a(fVar.f120064C, frameWidth, frameHeight));
        if (fVar.f120062A == null) {
            C63244g.m114602a().mo73263I().mo101628a("VEEffectHelper activity is finishing " + fVar.f120073L.isFinishing());
            return;
        }
        int G = fVar.f120062A.mo56246G();
        fVar.f120115y = (CutMultiVideoViewModel) C1181ae.m3881a(fVar.f120073L, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        fVar.f120114x.setCanEdit(false);
        fVar.f120114x.setMinVideoLength(1000);
        fVar.f120114x.setMaxVideoLength((long) G);
        fVar.f120115y.f156539k = fVar.f120092b.isMvThemeVideoType();
        fVar.f120115y.f156540l = G;
        C84911q.m145927c("initCutTimeView video duration is " + fVar.f120062A.mo56368j());
        fVar.f120114x.setVeEditor(fVar.f120062A);
        List<MediaModel> mediaModelList = fVar.f120092b.getMediaModelList();
        C70542w wVar = new C70542w();
        wVar.f157762b = false;
        wVar.mo111271a(new C46348c(fVar.f120073L, new C52145r(fVar), new C52147t(fVar), new C52148u(fVar)));
        fVar.f120114x.setViewConfig(wVar);
        fVar.f120114x.mo111139a(fVar.f120073L, fVar.f120115y, fVar.f120064C, mediaModelList);
        fVar.f120114x.setPointerType(2);
        fVar.f120114x.getVideoEditViewModel().f157681f.observe(fVar.f120099i, new C52137j(fVar));
        fVar.f120114x.getVideoEditViewModel().f157686k.observe(fVar.f120099i, new C52138k(fVar));
        fVar.f120114x.getVideoEditViewModel().f157684i.observe(fVar.f120099i, new C52139l(fVar));
        fVar.f120114x.getVideoEditViewModel().f157685j.observe(fVar.f120099i, new C52140m(fVar));
        fVar.f120114x.getVideoEditViewModel().f157682g.observe(fVar.f120099i, new C52141n(fVar));
        fVar.f120114x.getVideoEditViewModel().f157683h.observe(fVar.f120099i, new C52142o(fVar));
        fVar.f120114x.getVideoEditViewModel().f157678c.observe(fVar.f120099i, new C52143p(fVar));
        fVar.f120114x.getVideoEditViewModel().f157680e.observe(fVar.f120099i, new C52144q(fVar));
        fVar.f120076O.mo78829a(G);
    }
}

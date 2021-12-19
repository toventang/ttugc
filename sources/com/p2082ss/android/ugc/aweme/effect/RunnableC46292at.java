package com.p2082ss.android.ugc.aweme.effect;

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

/* renamed from: com.ss.android.ugc.aweme.effect.at */
public final /* synthetic */ class RunnableC46292at implements Runnable {

    /* renamed from: a */
    private final C46267ac f107927a;

    static {
        Covode.recordClassIndex(54869);
    }

    public RunnableC46292at(C46267ac acVar) {
        this.f107927a = acVar;
    }

    public final void run() {
        C46267ac acVar = this.f107927a;
        int frameHeight = acVar.f107895w.getFrameHeight();
        int frameWidth = acVar.f107895w.getFrameWidth();
        int ceil = (int) Math.ceil((double) (((float) (C13628n.m24504a(acVar.f107851L) - (Math.round(C13628n.m24520b(acVar.f107851L, 24.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
        acVar.f107895w.setCoverSize(ceil);
        acVar.f107898z = new VEVideoCoverGeneratorImpl(acVar.f107840A, acVar.f107851L, acVar.f107895w.getCoverSize(), C65374bn.m117070a() ? C85581w.EnumC85602a.GET_FRAMES_MODE_NORMAL : null, "special_effects");
        acVar.f107842C = new C74297p(acVar.f107898z, frameWidth, frameHeight, ceil);
        if (acVar.f107874b.isMvThemeVideoType()) {
            C71991a aVar = new C71991a(frameWidth, frameHeight);
            acVar.f107895w.setAdapter(aVar);
            C71993c cVar = new C71993c();
            cVar.f161328b = C46316bb.f107970a;
            cVar.f161339m = acVar.f107860U;
            cVar.f161338l = acVar.f107859T;
            cVar.mo114167a(frameWidth, frameHeight).mo114168a(acVar.f107851L, acVar.f107840A, ceil, new C46317bc(aVar));
            acVar.f107895w.setAdapter(aVar);
        } else {
            acVar.f107895w.setAdapter(new ChooseVideoCoverView.C74231a(acVar.f107842C, frameWidth, frameHeight));
        }
        if (acVar.f107840A == null) {
            C63244g.m114602a().mo73263I().mo101628a("VEEffectHelper activity is finishing " + acVar.f107851L.isFinishing());
            return;
        }
        int G = acVar.f107840A.mo56246G();
        acVar.f107897y = (CutMultiVideoViewModel) C1181ae.m3881a(acVar.f107851L, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        acVar.f107896x.setCanEdit(false);
        acVar.f107896x.setMinVideoLength(1000);
        acVar.f107896x.setMaxVideoLength((long) G);
        acVar.f107897y.f156539k = acVar.f107874b.isMvThemeVideoType();
        acVar.f107897y.f156540l = G;
        C84911q.m145927c("initCutTimeView video duration is " + acVar.f107840A.mo56368j());
        acVar.f107896x.setVeEditor(acVar.f107840A);
        List<MediaModel> mediaModelList = acVar.f107874b.getMediaModelList();
        C70542w wVar = new C70542w();
        wVar.f157762b = false;
        wVar.mo111271a(new C46348c(acVar.f107851L, new C46289aq(acVar), new C46290ar(acVar), new C46291as(acVar)));
        acVar.f107896x.setViewConfig(wVar);
        acVar.f107896x.mo111139a(acVar.f107851L, acVar.f107897y, acVar.f107842C, mediaModelList);
        acVar.f107896x.setPointerType(2);
        acVar.f107896x.getVideoEditViewModel().f157681f.observe(acVar.f107881i, new C46280ah(acVar));
        acVar.f107896x.getVideoEditViewModel().f157686k.observe(acVar.f107881i, new C46281ai(acVar));
        acVar.f107896x.getVideoEditViewModel().f157684i.observe(acVar.f107881i, new C46282aj(acVar));
        acVar.f107896x.getVideoEditViewModel().f157685j.observe(acVar.f107881i, new C46283ak(acVar));
        acVar.f107896x.getVideoEditViewModel().f157682g.observe(acVar.f107881i, new C46284al(acVar));
        acVar.f107896x.getVideoEditViewModel().f157683h.observe(acVar.f107881i, new C46285am(acVar));
        acVar.f107896x.getVideoEditViewModel().f157678c.observe(acVar.f107881i, new C46286an(acVar));
        acVar.f107896x.getVideoEditViewModel().f157680e.observe(acVar.f107881i, new C46287ao(acVar));
        acVar.f107854O.mo78829a(G);
    }
}

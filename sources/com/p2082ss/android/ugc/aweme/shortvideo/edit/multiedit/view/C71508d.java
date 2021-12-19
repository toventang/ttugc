package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.google.android.material.internal.CheckableImageButton;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70542w;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.d */
public final class C71508d extends C71497b {

    /* renamed from: k */
    public CutVideoSpeedViewModel f160259k;

    /* renamed from: l */
    public CutVideoBottomBarViewModel f160260l;

    /* renamed from: m */
    public boolean f160261m = true;

    static {
        Covode.recordClassIndex(84049);
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoSpeedViewModel m126373a(C71508d dVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = dVar.f160259k;
        if (cutVideoSpeedViewModel == null) {
            C89219l.m154710a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: b */
    public final void mo113202b(C0692e<Float, Float> eVar) {
        C89219l.m154721d(eVar, "");
        mo113217l().mo111133a(eVar, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113191a(View.OnClickListener onClickListener) {
        super.mo113191a(onClickListener);
        mo113221p().setOnClickListener(new View$OnClickListenerC71509a(this));
        mo113222q().setOnClickListener(onClickListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: c */
    public final void mo113208c(boolean z) {
        int i;
        CheckableImageButton p = mo113221p();
        if (z) {
            i = 255;
        } else {
            i = 127;
        }
        p.setImageAlpha(i);
        this.f160261m = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.d$a */
    static final class View$OnClickListenerC71509a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71508d f160262a;

        static {
            Covode.recordClassIndex(84050);
        }

        View$OnClickListenerC71509a(C71508d dVar) {
            this.f160262a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f160262a.f160261m) {
                new C79459a(this.f160262a.mo113221p().getContext()).mo123050a(R.string.b1o).mo123053a();
                return;
            }
            boolean isChecked = this.f160262a.mo113221p().isChecked();
            this.f160262a.mo113221p().toggle();
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f160262a.f160260l;
            if (cutVideoBottomBarViewModel == null) {
                C89219l.m154710a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel.mo110649b(!isChecked);
            if (!isChecked) {
                CutVideoSpeedViewModel a = C71508d.m126373a(this.f160262a);
                EnumC78601i a2 = C70082m.m123739a(this.f160262a.mo113217l().getCurrentSpeed());
                C89219l.m154716b(a2, "");
                a.mo110750a(a2);
                C71508d.m126373a(this.f160262a).mo110754b(true);
                return;
            }
            C71508d.m126373a(this.f160262a).mo110754b(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113194a(ActivityC0945e eVar, View view, boolean z) {
        if (eVar != null && view != null) {
            super.mo113194a(eVar, view, z);
            JediViewModel a = C20531t.m38716a(eVar).mo33800a(CutVideoSpeedViewModel.class);
            C89219l.m154716b(a, "");
            this.f160259k = (CutVideoSpeedViewModel) a;
            JediViewModel a2 = C20531t.m38716a(eVar).mo33800a(CutVideoBottomBarViewModel.class);
            C89219l.m154716b(a2, "");
            this.f160260l = (CutVideoBottomBarViewModel) a2;
            view.findViewById(R.id.asb).setBackgroundColor(0);
            View findViewById = view.findViewById(R.id.arh);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(8);
            mo113220o().setVisibility(8);
            if (z) {
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.vk);
                C89219l.m154716b(frameLayout, "");
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 80;
                frameLayout.setLayoutParams(layoutParams2);
                mo113221p().setVisibility(0);
                mo113222q().setVisibility(0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113195a(ActivityC0945e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends MediaModel> list, boolean z, C70542w wVar) {
        C89219l.m154721d(eVar, "");
        if (!C84904k.m145909a(list)) {
            mo113217l().setExtractFramesInRoughMode(true);
            mo113217l().mo111141a(eVar, cutMultiVideoViewModel, (List<MediaModel>) list);
            ViewGroup.LayoutParams layoutParams = mo113217l().getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = (int) C30745b.m63132b(eVar, 70.0f);
            mo113217l().setLayoutParams(layoutParams2);
            AbstractC70516a l = mo113217l();
            if (!(l instanceof VideoEditView)) {
                l = null;
            }
            VideoEditView videoEditView = (VideoEditView) l;
            if (videoEditView != null) {
                videoEditView.setViewConfig(wVar);
            }
        }
    }
}

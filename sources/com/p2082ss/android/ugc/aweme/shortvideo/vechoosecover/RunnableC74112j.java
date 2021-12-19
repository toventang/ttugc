package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46104o;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.C69980b;
import com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VESize;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.j */
final /* synthetic */ class RunnableC74112j implements Runnable {

    /* renamed from: a */
    private final ChooseCoverActivity.C74095a f166405a;

    /* renamed from: b */
    private final C69980b f166406b;

    static {
        Covode.recordClassIndex(86865);
    }

    RunnableC74112j(ChooseCoverActivity.C74095a aVar, C69980b bVar) {
        this.f166405a = aVar;
        this.f166406b = bVar;
    }

    public final void run() {
        boolean z;
        ChooseCoverActivity.C74095a aVar = this.f166405a;
        C69980b bVar = this.f166406b;
        ActivityC0945e activity = bVar.getActivity();
        if (!bVar.isDetached() && activity != null && !activity.isFinishing()) {
            int c = C0643b.m2378c(ChooseCoverActivity.this, R.color.e);
            int measuredHeight = bVar.f156406d.getMeasuredHeight();
            int measuredHeight2 = bVar.f156409g.getMeasuredHeight() + bVar.f156410h.getMeasuredHeight();
            int measuredHeight3 = bVar.f156407e.getMeasuredHeight();
            int d = C70636dh.m124835d(activity);
            ChooseCoverActivity.this.f166350e.f200423w.mo56331b(c);
            int e = C70636dh.m124836e(bVar.getActivity());
            int width = ChooseCoverActivity.this.f166352g.getWidth();
            VESize b = ChooseCoverActivity.this.f166350e.f200423w.mo56330b();
            float f = (float) b.height;
            float f2 = ((float) b.width) / f;
            float f3 = (float) width;
            float f4 = (float) measuredHeight3;
            if (f2 > f3 / f4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, (float) ((int) (f3 / f2)));
                ofFloat.setDuration(0L);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new C74113k(aVar, f2, e, d, measuredHeight2, measuredHeight));
                ofFloat.start();
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f, f4);
                ofFloat2.setDuration(0L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.addUpdateListener(new C74114l(aVar, f2, width, measuredHeight));
                ofFloat2.start();
            }
            ChooseCoverActivity.this.f166350e.f200423w.mo56311a(false);
            float f5 = ((float) b.width) / ((float) b.height);
            int width2 = bVar.f156408f.getWidth();
            int height = bVar.f156408f.getHeight();
            float f6 = (float) width2;
            float f7 = (float) height;
            int i = -1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.f156408f.getLayoutParams();
            float f8 = 1.0f;
            if (f5 > f6 / f7) {
                layoutParams.width = width2;
                layoutParams.height = ((int) (f6 / f5)) + 2;
                i = (height * 9) / 16;
                z = false;
            } else {
                float f9 = ((float) ((int) (f5 * f7))) / f6;
                if (f9 != 0.0f && !Float.isNaN(f9) && !Float.isInfinite(f9)) {
                    f8 = f9;
                }
                layoutParams.height = (int) (f7 / f8);
                z = true;
            }
            bVar.f156408f.setLayoutParams(layoutParams);
            bVar.f156408f.setScaleX(f8);
            bVar.f156408f.setScaleY(f8);
            bVar.f156408f.setTag(new C46104o(z, f8, i));
            if (!ChooseCoverActivity.this.f166349d.isMvThemeVideoType() || SettingsManager.m29616a().mo25400a("enable_mv_type_video_show_last_chosen_cover", true)) {
                float j = (ChooseCoverActivity.this.f166349d.mVideoCoverStartTm * 1000.0f) / ((float) ChooseCoverActivity.this.f166350e.f200423w.mo56368j());
                C69980b bVar2 = ChooseCoverActivity.this.f166351f;
                bVar2.f156423u = true;
                bVar2.mo110429a(j, false);
                ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = bVar2.f156403a;
                chooseVideoCoverViewV2.f166763a.setX(bVar2.f156414l.mo110438c().getCoverPublishModel().getVideoCoverViewX());
            }
        }
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.EnumC75306a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83090d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.f */
public final /* synthetic */ class RunnableC74108f implements Runnable {

    /* renamed from: a */
    private final ChooseCoverActivity f166391a;

    /* renamed from: b */
    private final TextView f166392b;

    /* renamed from: c */
    private final int f166393c;

    /* renamed from: d */
    private final float f166394d;

    /* renamed from: e */
    private final C75309d f166395e;

    /* renamed from: f */
    private final int f166396f;

    /* renamed from: g */
    private final float f166397g;

    /* renamed from: h */
    private final int f166398h;

    /* renamed from: i */
    private final float f166399i;

    /* renamed from: j */
    private final float f166400j;

    static {
        Covode.recordClassIndex(86861);
    }

    RunnableC74108f(ChooseCoverActivity chooseCoverActivity, TextView textView, int i, float f, C75309d dVar, int i2, float f2, int i3, float f3, float f4) {
        this.f166391a = chooseCoverActivity;
        this.f166392b = textView;
        this.f166393c = i;
        this.f166394d = f;
        this.f166395e = dVar;
        this.f166396f = i2;
        this.f166397g = f2;
        this.f166398h = i3;
        this.f166399i = f3;
        this.f166400j = f4;
    }

    public final void run() {
        ChooseCoverActivity chooseCoverActivity = this.f166391a;
        TextView textView = this.f166392b;
        int i = this.f166393c;
        float f = this.f166394d;
        C75309d dVar = this.f166395e;
        int i2 = this.f166396f;
        float f2 = this.f166397g;
        int i3 = this.f166398h;
        float f3 = this.f166399i;
        float f4 = this.f166400j;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        textView.setPivotX(0.0f);
        textView.setMaxWidth(C83090d.f185670v);
        if (C80471gb.m139482a()) {
            layoutParams.rightMargin = (int) (((float) (i + chooseCoverActivity.f166352g.getLeft())) + f);
        } else {
            layoutParams.leftMargin = (int) (((float) (i + chooseCoverActivity.f166352g.getLeft())) + f);
        }
        if (dVar.getLocation() == EnumC75306a.LEFT_TOP.getValue()) {
            layoutParams.gravity = 48;
            layoutParams.topMargin = (int) (((float) i2) + f2);
            textView.setPivotY(0.0f);
        } else {
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = (int) (((float) ((((ViewGroup) textView.getParent()).getHeight() - i2) - i3)) + f3);
            textView.setPivotY((float) textView.getHeight());
        }
        textView.setScaleX(f4);
        textView.setScaleY(f4);
        chooseCoverActivity.f166350e.f200423w.mo56305a(new C74111i(chooseCoverActivity, textView));
    }
}

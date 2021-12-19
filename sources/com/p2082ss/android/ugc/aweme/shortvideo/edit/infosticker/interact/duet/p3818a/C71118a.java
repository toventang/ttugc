package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.p3818a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.a */
public final class C71118a extends FrameLayout {

    /* renamed from: a */
    public SmartCircleImageView f159291a;

    /* renamed from: b */
    public TuxTextView f159292b;

    /* renamed from: c */
    public TuxCheckBox f159293c;

    /* renamed from: d */
    public FrameLayout f159294d;

    static {
        Covode.recordClassIndex(83624);
    }

    public final SmartCircleImageView getAvatar() {
        SmartCircleImageView smartCircleImageView = this.f159291a;
        if (smartCircleImageView == null) {
            C89219l.m154710a("avatar");
        }
        return smartCircleImageView;
    }

    public final TuxCheckBox getCheckBox() {
        TuxCheckBox tuxCheckBox = this.f159293c;
        if (tuxCheckBox == null) {
            C89219l.m154710a("checkBox");
        }
        return tuxCheckBox;
    }

    public final FrameLayout getCheckLayout() {
        FrameLayout frameLayout = this.f159294d;
        if (frameLayout == null) {
            C89219l.m154710a("checkLayout");
        }
        return frameLayout;
    }

    public final TuxTextView getUserName() {
        TuxTextView tuxTextView = this.f159292b;
        if (tuxTextView == null) {
            C89219l.m154710a("userName");
        }
        return tuxTextView;
    }

    public final void setAvatar(SmartCircleImageView smartCircleImageView) {
        C89219l.m154721d(smartCircleImageView, "");
        this.f159291a = smartCircleImageView;
    }

    public final void setCheckBox(TuxCheckBox tuxCheckBox) {
        C89219l.m154721d(tuxCheckBox, "");
        this.f159293c = tuxCheckBox;
    }

    public final void setCheckLayout(FrameLayout frameLayout) {
        C89219l.m154721d(frameLayout, "");
        this.f159294d = frameLayout;
    }

    public final void setUserName(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f159292b = tuxTextView;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71118a(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13127);
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.e6, this, true);
        View findViewById = a.findViewById(R.id.aq8);
        C89219l.m154716b(findViewById, "");
        this.f159291a = (SmartCircleImageView) findViewById;
        View findViewById2 = a.findViewById(R.id.aqa);
        C89219l.m154716b(findViewById2, "");
        this.f159292b = (TuxTextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.aq_);
        C89219l.m154716b(findViewById3, "");
        this.f159293c = (TuxCheckBox) findViewById3;
        View findViewById4 = a.findViewById(R.id.aq9);
        C89219l.m154716b(findViewById4, "");
        this.f159294d = (FrameLayout) findViewById4;
        MethodCollector.m26664o(13127);
    }
}

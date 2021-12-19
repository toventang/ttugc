package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.p3818a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a.d */
public final class C71126d extends FrameLayout {

    /* renamed from: a */
    public SmartCircleImageView f159321a;

    /* renamed from: b */
    public TuxTextView f159322b;

    /* renamed from: c */
    public TuxTextView f159323c;

    /* renamed from: d */
    public TuxCheckBox f159324d;

    /* renamed from: e */
    public View f159325e;

    static {
        Covode.recordClassIndex(83632);
    }

    /* renamed from: a */
    public final void mo112433a() {
        View view = this.f159325e;
        if (view == null) {
            C89219l.m154710a("containerView");
        }
        view.setAlpha(0.3f);
    }

    /* renamed from: b */
    public final void mo112434b() {
        View view = this.f159325e;
        if (view == null) {
            C89219l.m154710a("containerView");
        }
        view.setAlpha(1.0f);
    }

    public final SmartCircleImageView getAvatar() {
        SmartCircleImageView smartCircleImageView = this.f159321a;
        if (smartCircleImageView == null) {
            C89219l.m154710a("avatar");
        }
        return smartCircleImageView;
    }

    public final TuxCheckBox getCheckBox() {
        TuxCheckBox tuxCheckBox = this.f159324d;
        if (tuxCheckBox == null) {
            C89219l.m154710a("checkBox");
        }
        return tuxCheckBox;
    }

    public final View getContainerView() {
        View view = this.f159325e;
        if (view == null) {
            C89219l.m154710a("containerView");
        }
        return view;
    }

    public final TuxTextView getNickName() {
        TuxTextView tuxTextView = this.f159323c;
        if (tuxTextView == null) {
            C89219l.m154710a("nickName");
        }
        return tuxTextView;
    }

    public final TuxTextView getUserName() {
        TuxTextView tuxTextView = this.f159322b;
        if (tuxTextView == null) {
            C89219l.m154710a("userName");
        }
        return tuxTextView;
    }

    public final void setAvatar(SmartCircleImageView smartCircleImageView) {
        C89219l.m154721d(smartCircleImageView, "");
        this.f159321a = smartCircleImageView;
    }

    public final void setCheckBox(TuxCheckBox tuxCheckBox) {
        C89219l.m154721d(tuxCheckBox, "");
        this.f159324d = tuxCheckBox;
    }

    public final void setContainerView(View view) {
        C89219l.m154721d(view, "");
        this.f159325e = view;
    }

    public final void setNickName(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f159323c = tuxTextView;
    }

    public final void setUserName(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f159322b = tuxTextView;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71126d(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12856);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.e8, this, true);
        C89219l.m154716b(a, "");
        this.f159325e = a;
        if (a == null) {
            C89219l.m154710a("containerView");
        }
        View findViewById = a.findViewById(R.id.aq2);
        C89219l.m154716b(findViewById, "");
        this.f159321a = (SmartCircleImageView) findViewById;
        View view = this.f159325e;
        if (view == null) {
            C89219l.m154710a("containerView");
        }
        View findViewById2 = view.findViewById(R.id.aq4);
        C89219l.m154716b(findViewById2, "");
        this.f159322b = (TuxTextView) findViewById2;
        View view2 = this.f159325e;
        if (view2 == null) {
            C89219l.m154710a("containerView");
        }
        View findViewById3 = view2.findViewById(R.id.aq3);
        C89219l.m154716b(findViewById3, "");
        this.f159323c = (TuxTextView) findViewById3;
        View view3 = this.f159325e;
        if (view3 == null) {
            C89219l.m154710a("containerView");
        }
        View findViewById4 = view3.findViewById(R.id.aq1);
        C89219l.m154716b(findViewById4, "");
        this.f159324d = (TuxCheckBox) findViewById4;
        MethodCollector.m26664o(12856);
    }
}

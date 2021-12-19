package com.p2082ss.android.ugc.aweme.notification.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.FollowTuxTextView */
public final class FollowTuxTextView extends TuxTextView implements AbstractC51346a {

    /* renamed from: a */
    public boolean f141353a;

    /* renamed from: b */
    private TuxTextView f141354b;

    static {
        Covode.recordClassIndex(73058);
    }

    public FollowTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setFollowStatus(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    public final AbstractC1204m getLifeCycleOwner() {
        Activity d = C34729o.m70962d(this);
        Objects.requireNonNull(d, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC0945e) d;
    }

    public final void setPrefixView(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f141354b = tuxTextView;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo73175a(int i, int i2) {
        StringBuilder append;
        if (i == 0) {
            setTextColor(getResources().getColor(R.color.b9));
            if (i2 == 0) {
                append = new StringBuilder().append(getResources().getString(R.string.bxs));
            } else {
                append = new StringBuilder().append(getResources().getString(R.string.bxw));
            }
            setText(append);
            TuxTextView tuxTextView = this.f141354b;
            if (tuxTextView != null) {
                tuxTextView.setText("+");
            }
            TuxTextView tuxTextView2 = this.f141354b;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(getResources().getColor(R.color.b9));
            }
            setClickable(true);
        } else if (i == 1) {
            setText(new StringBuilder().append(getResources().getString(R.string.bzd)));
            TuxTextView tuxTextView3 = this.f141354b;
            if (tuxTextView3 != null) {
                tuxTextView3.setText("·");
            }
            if (!this.f141353a) {
                setClickable(false);
            }
            setTextColor(getResources().getColor(R.color.c5));
            TuxTextView tuxTextView4 = this.f141354b;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColor(getResources().getColor(R.color.c5));
            }
        } else if (i == 2) {
            setText(new StringBuilder().append(getResources().getString(R.string.baw)));
            TuxTextView tuxTextView5 = this.f141354b;
            if (tuxTextView5 != null) {
                tuxTextView5.setText("·");
            }
            if (!this.f141353a) {
                setClickable(false);
            }
            setTextColor(getResources().getColor(R.color.c5));
            TuxTextView tuxTextView6 = this.f141354b;
            if (tuxTextView6 != null) {
                tuxTextView6.setTextColor(getResources().getColor(R.color.c5));
            }
        } else if (i == 4) {
            setText(new StringBuilder().append(getResources().getString(R.string.byz)));
            TuxTextView tuxTextView7 = this.f141354b;
            if (tuxTextView7 != null) {
                tuxTextView7.setText("·");
            }
            if (!this.f141353a) {
                setClickable(false);
            }
            setTextColor(getResources().getColor(R.color.c5));
            TuxTextView tuxTextView8 = this.f141354b;
            if (tuxTextView8 != null) {
                tuxTextView8.setTextColor(getResources().getColor(R.color.c5));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo86406a(int i, int i2, String str) {
        mo73175a(i, i2);
    }

    private /* synthetic */ FollowTuxTextView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FollowTuxTextView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}

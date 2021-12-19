package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.SharePanelFollowButton */
public final class SharePanelFollowButton extends TuxButton implements AbstractC51346a {

    /* renamed from: e */
    public boolean f127763e;

    /* renamed from: f */
    private int f127764f;

    static {
        Covode.recordClassIndex(65826);
    }

    public SharePanelFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getStatus() {
        return this.f127764f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.SharePanelFollowButton$a */
    public static final class RunnableC56032a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SharePanelFollowButton f127765a;

        static {
            Covode.recordClassIndex(65827);
        }

        RunnableC56032a(SharePanelFollowButton sharePanelFollowButton) {
            this.f127765a = sharePanelFollowButton;
        }

        public final void run() {
            this.f127765a.setAnimating(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.SharePanelFollowButton$b */
    public static final class RunnableC56033b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SharePanelFollowButton f127766a;

        static {
            Covode.recordClassIndex(65828);
        }

        RunnableC56033b(SharePanelFollowButton sharePanelFollowButton) {
            this.f127766a = sharePanelFollowButton;
        }

        public final void run() {
            this.f127766a.setVisibility(8);
            this.f127766a.setAnimating(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    public final AbstractC1204m getLifeCycleOwner() {
        Activity d = C34729o.m70962d(this);
        Objects.requireNonNull(d, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC0945e) d;
    }

    public final void setAnimating(boolean z) {
        this.f127763e = z;
    }

    public final void setStatus(int i) {
        this.f127764f = i;
    }

    public final void setFollowStatus(int i) {
        mo73175a(i, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo73175a(int i, int i2) {
        if (i == 0) {
            setButtonVariant(0);
            setText(getResources().getText(R.string.bxw));
            setClickable(true);
            setVisibility(0);
        } else if (i == 4) {
            setButtonVariant(1);
            setText(getResources().getText(R.string.c15));
            setClickable(false);
            setVisibility(0);
        } else if (this.f127764f == 4 && !this.f127763e) {
            animate().alpha(0.0f).setDuration(250).withStartAction(new RunnableC56032a(this)).withEndAction(new RunnableC56033b(this));
        }
        this.f127764f = i;
        setButtonSize(1);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo86406a(int i, int i2, String str) {
        mo73175a(i, i2);
    }

    private /* synthetic */ SharePanelFollowButton(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SharePanelFollowButton(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.bo);
        C89219l.m154721d(context, "");
        mo37349a(true);
        setEllipsize(null);
    }
}

package com.p2082ss.android.ugc.aweme.follow;

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

/* renamed from: com.ss.android.ugc.aweme.follow.NewFollowButton */
public class NewFollowButton extends TuxButton implements AbstractC51346a {

    /* renamed from: e */
    private boolean f117785e;

    /* renamed from: f */
    private String f117786f;

    static {
        Covode.recordClassIndex(60250);
    }

    public NewFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final String getMessageText() {
        return this.f117786f;
    }

    public final boolean getShouldShowMessageText() {
        return this.f117785e;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    public AbstractC1204m getLifeCycleOwner() {
        Activity d = C34729o.m70962d(this);
        Objects.requireNonNull(d, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC0945e) d;
    }

    public final void setMessageText(String str) {
        this.f117786f = str;
    }

    public final void setShouldShowMessageText(boolean z) {
        this.f117785e = z;
    }

    public void setFollowStatus(int i) {
        mo73175a(i, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo73175a(int i, int i2) {
        CharSequence charSequence;
        CharSequence text;
        setVisibility(0);
        if (i == 0) {
            setButtonVariant(0);
            if (i2 == 1) {
                text = getResources().getText(R.string.bxw);
            } else {
                text = getResources().getText(R.string.bxs);
            }
            setText(text);
        } else {
            setButtonVariant(1);
            if (i == 1) {
                charSequence = getResources().getText(R.string.bz9);
            } else if (i != 2) {
                if (i == 3) {
                    setVisibility(8);
                } else if (i == 4) {
                    charSequence = getResources().getText(R.string.byz);
                }
            } else if (this.f117785e) {
                String str = this.f117786f;
                if (str == null || str.length() == 0) {
                    charSequence = getResources().getText(R.string.d2m);
                } else {
                    charSequence = this.f117786f;
                }
            } else {
                charSequence = getResources().getText(R.string.baw);
            }
            setText(charSequence);
        }
        setButtonSize(1);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo86406a(int i, int i2, String str) {
        mo73175a(i, i2);
    }

    private /* synthetic */ NewFollowButton(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (int) R.attr.bo);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewFollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.bo);
        C89219l.m154721d(context, "");
        mo37349a(true);
        setEllipsize(null);
    }
}

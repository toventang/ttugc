package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.PronounsEditText */
public final class PronounsEditText extends AppCompatEditText {

    /* renamed from: a */
    private int f144383a;

    static {
        Covode.recordClassIndex(74997);
    }

    public PronounsEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getSelectionMinIndex() {
        return this.f144383a;
    }

    public final void setSelectionMinIndex(int i) {
        this.f144383a = i;
    }

    /* access modifiers changed from: protected */
    public final void onSelectionChanged(int i, int i2) {
        int i3 = this.f144383a;
        if (i <= i3) {
            setSelection(i3);
        }
        super.onSelectionChanged(i, i2);
    }

    private /* synthetic */ PronounsEditText(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PronounsEditText(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.ce);
        C89219l.m154721d(context, "");
    }
}

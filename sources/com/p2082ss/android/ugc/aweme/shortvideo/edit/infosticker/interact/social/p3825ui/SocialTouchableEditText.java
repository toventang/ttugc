package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3825ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.ui.SocialTouchableEditText */
public final class SocialTouchableEditText extends AppCompatEditText {

    /* renamed from: a */
    private boolean f159944a;

    static {
        Covode.recordClassIndex(83891);
    }

    public final boolean getMCanTouchMoved() {
        return this.f159944a;
    }

    public final void setMCanTouchMoved(boolean z) {
        this.f159944a = z;
    }

    public final void setMode(boolean z) {
        this.f159944a = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f159944a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialTouchableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }
}

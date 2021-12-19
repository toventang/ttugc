package com.p2082ss.android.ugc.aweme.story.record.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.aweme.sticker.View$OnTouchListenerC75885t;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordToolbarItem */
public final class StoryRecordToolbarItem extends AVDmtImageView {
    static {
        Covode.recordClassIndex(90731);
    }

    public StoryRecordToolbarItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    private /* synthetic */ StoryRecordToolbarItem(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryRecordToolbarItem(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        setOnTouchListener(new View$OnTouchListenerC75885t(1.2f, 100, this));
    }
}

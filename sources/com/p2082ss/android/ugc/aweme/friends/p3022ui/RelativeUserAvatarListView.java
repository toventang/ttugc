package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RelativeUserAvatarListView */
public final class RelativeUserAvatarListView extends FrameLayout {

    /* renamed from: a */
    private int f119106a;

    /* renamed from: b */
    private int f119107b;

    /* renamed from: c */
    private final int f119108c;

    static {
        Covode.recordClassIndex(61030);
    }

    public RelativeUserAvatarListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ RelativeUserAvatarListView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RelativeUserAvatarListView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(2688);
        this.f119106a = (int) C13628n.m24520b(context, 16.0f);
        this.f119107b = (int) C13628n.m24520b(context, 20.0f);
        this.f119108c = (int) C13628n.m24520b(context, 1.0f);
        MethodCollector.m26664o(2688);
    }
}

package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view.GroupChatBlockedView */
public final class GroupChatBlockedView extends ConstraintLayout {

    /* renamed from: g */
    private HashMap f123924g;

    static {
        Covode.recordClassIndex(63747);
    }

    public GroupChatBlockedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: b */
    public final View mo9603b(int i) {
        if (this.f123924g == null) {
            this.f123924g = new HashMap();
        }
        View view = (View) this.f123924g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f123924g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private /* synthetic */ GroupChatBlockedView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GroupChatBlockedView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5623);
        View.inflate(context, R.layout.a70, this);
        MethodCollector.m26664o(5623);
    }
}

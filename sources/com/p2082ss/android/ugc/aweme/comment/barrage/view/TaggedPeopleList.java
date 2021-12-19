package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.TaggedPeopleList */
public final class TaggedPeopleList extends PowerList {
    static {
        Covode.recordClassIndex(43672);
    }

    public TaggedPeopleList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setMaxLineCount(int i) {
        RecyclerView.AbstractC1362i layoutManager = getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).mo4318a(i);
    }

    private /* synthetic */ TaggedPeopleList(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TaggedPeopleList(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        setLayoutManager(new GridLayoutManager(3));
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}

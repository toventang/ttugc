package com.p2082ss.android.ugc.aweme.comment.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.util.C37200j;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.FixedCommentViewPager */
public final class FixedCommentViewPager extends RtlViewPager {
    static {
        Covode.recordClassIndex(44661);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedCommentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 1) {
            View childAt = getChildAt(0);
            C89219l.m154716b(childAt, "");
            if (childAt.getTag() instanceof String) {
                Object tag = childAt.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.String");
                if (TextUtils.equals((String) tag, "comment_list_page")) {
                    int childCount = getChildCount();
                    for (int i5 = 1; i5 < childCount; i5++) {
                        View childAt2 = getChildAt(i5);
                        View childAt3 = getChildAt(i5 - 1);
                        C89219l.m154716b(childAt2, "");
                        int left = childAt2.getLeft();
                        C89219l.m154716b(childAt3, "");
                        if (left < childAt3.getRight()) {
                            int left2 = childAt2.getLeft();
                            int right = childAt2.getRight();
                            int right2 = childAt3.getRight();
                            childAt2.layout(right2, childAt2.getTop(), childAt2.getMeasuredWidth() + right2, childAt2.getBottom());
                            C37200j.m75177b("Comment ViewPager => child(" + i5 + ") before fix: {" + left2 + ", " + right + "}, after fix: {" + childAt2.getLeft() + ", " + childAt2.getRight() + '}');
                        }
                    }
                    return;
                }
            }
            C37200j.m75176a("Comment ViewPager => child(0) is not CommentList");
        }
    }
}

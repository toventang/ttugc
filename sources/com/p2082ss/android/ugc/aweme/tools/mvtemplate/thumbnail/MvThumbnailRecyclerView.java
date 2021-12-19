package com.p2082ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78962g;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRecyclerView */
public final class MvThumbnailRecyclerView extends RecyclerView {

    /* renamed from: O */
    final int f177530O;

    /* renamed from: P */
    int f177531P;

    static {
        Covode.recordClassIndex(92157);
    }

    public MvThumbnailRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getMScrollX() {
        return this.f177531P;
    }

    public final int getCurrentPosition() {
        return this.f177531P / this.f177530O;
    }

    public final float getOffset() {
        int i = this.f177530O;
        return (((float) this.f177531P) % ((float) i)) / ((float) i);
    }

    public final void setMScrollX(int i) {
        this.f177531P = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            AbstractC81915c.m141874a(new C78962g(C78962g.EnumC78964b.START, C78962g.EnumC78963a.ICON_LIST));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private /* synthetic */ MvThumbnailRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* renamed from: a */
    public final void mo122804a(int i, float f, boolean z) {
        if (f > 0.99f) {
            f = 1.0f;
        }
        float f2 = ((((float) i) + f) * ((float) this.f177530O)) - ((float) this.f177531P);
        if (z) {
            mo4395a((int) f2, 0);
        } else {
            scrollBy((int) f2, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MvThumbnailRecyclerView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f177530O = C79005b.m137829a(context);
        int i = Build.VERSION.SDK_INT;
        setLayoutDirection(0);
        setLayoutManager(new LinearLayoutManager(0, false));
        mo4405a(new RecyclerView.AbstractC1371n(this) {
            /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRecyclerView.C789991 */

            /* renamed from: a */
            final /* synthetic */ MvThumbnailRecyclerView f177532a;

            static {
                Covode.recordClassIndex(92158);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f177532a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                C89219l.m154721d(recyclerView, "");
                super.mo4753a(recyclerView, i);
                if (i == 0) {
                    MvThumbnailRecyclerView mvThumbnailRecyclerView = this.f177532a;
                    int i2 = mvThumbnailRecyclerView.f177531P % mvThumbnailRecyclerView.f177530O;
                    if (i2 <= mvThumbnailRecyclerView.f177530O / 2) {
                        mvThumbnailRecyclerView.mo4395a(-i2, 0);
                    } else {
                        mvThumbnailRecyclerView.mo4395a(mvThumbnailRecyclerView.f177530O - i2, 0);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                C89219l.m154721d(recyclerView, "");
                super.mo4754a(recyclerView, i, i2);
                MvThumbnailRecyclerView mvThumbnailRecyclerView = this.f177532a;
                mvThumbnailRecyclerView.setMScrollX(mvThumbnailRecyclerView.getMScrollX() + i);
                AbstractC81915c.m141874a(new C78962g(C78962g.EnumC78964b.SCROLL, C78962g.EnumC78963a.ICON_LIST, this.f177532a.getCurrentPosition(), this.f177532a.getOffset()));
            }
        });
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}

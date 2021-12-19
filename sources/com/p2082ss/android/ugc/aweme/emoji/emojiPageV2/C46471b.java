package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.b */
public final class C46471b extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public final int f108259a = 1;

    /* renamed from: b */
    public final int f108260b;

    /* renamed from: c */
    public int f108261c;

    /* renamed from: d */
    public int f108262d;

    /* renamed from: e */
    private final boolean f108263e;

    static {
        Covode.recordClassIndex(55056);
    }

    public C46471b(int i, int i2, int i3) {
        this.f108260b = i;
        this.f108261c = i2;
        this.f108262d = i3;
        this.f108263e = C80471gb.m139483a(C17867d.m33078a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int i;
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        int d = RecyclerView.m4277d(view);
        int i2 = this.f108260b;
        if (d >= 0 && i2 > d) {
            rect.top = (int) C13628n.m24520b(view.getContext(), 16.0f);
        }
        if (d >= this.f108260b) {
            rect.top = this.f108262d;
        }
        int i3 = this.f108260b;
        int i4 = d % i3;
        int i5 = this.f108261c;
        int i6 = (i4 * i5) / i3;
        int i7 = i5 - (((i4 + 1) * i5) / i3);
        if (this.f108263e) {
            i = i7;
        } else {
            i = i6;
        }
        rect.left = i;
        if (!this.f108263e) {
            i6 = i7;
        }
        rect.right = i6;
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            C89219l.m154716b(adapter, "");
            int itemCount = adapter.getItemCount() % this.f108260b;
            if (itemCount == 0) {
                if (d >= (adapter.getItemCount() - 1) - this.f108260b) {
                    rect.bottom = (int) C13628n.m24520b(view.getContext(), 10.0f);
                }
            } else if (d >= adapter.getItemCount() - itemCount) {
                rect.bottom = (int) C13628n.m24520b(view.getContext(), 10.0f);
            }
        }
    }
}

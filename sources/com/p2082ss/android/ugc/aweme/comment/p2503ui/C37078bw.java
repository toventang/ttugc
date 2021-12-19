package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bw */
public final class C37078bw extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public static final C37079a f87361a = new C37079a((byte) 0);

    /* renamed from: b */
    private static final int f87362b = ((int) C13628n.m24520b(C17867d.m33078a(), 4.0f));

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bw$a */
    public static final class C37079a {
        static {
            Covode.recordClassIndex(44433);
        }

        private C37079a() {
        }

        public /* synthetic */ C37079a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(44432);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        float f;
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        Context a = C17867d.m33078a();
        if (RecyclerView.m4277d(view) != 0) {
            f = 0.0f;
        } else {
            f = 16.0f;
        }
        int b = (int) C13628n.m24520b(a, f);
        if (C80471gb.m139483a(view.getContext())) {
            rect.set(f87362b, 0, b, 0);
        } else {
            rect.set(b, 0, f87362b, 0);
        }
    }
}

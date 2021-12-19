package com.p2082ss.android.ugc.aweme.kids.profile.p3365b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.b.a */
public final class C57756a extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public static final C57757a f131761a = new C57757a((byte) 0);

    /* renamed from: b */
    private final int f131762b;

    static {
        Covode.recordClassIndex(67742);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.b.a$a */
    public static final class C57757a {
        static {
            Covode.recordClassIndex(67743);
        }

        private C57757a() {
        }

        public /* synthetic */ C57757a(byte b) {
            this();
        }
    }

    public C57756a(int i) {
        this.f131762b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        RecyclerView.AbstractC1350a adapter;
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        int e = RecyclerView.m4278e(view);
        if (e != 0 && (adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() > 1) {
            int i = e - 1;
            if (i / 3 > 0) {
                rect.top = this.f131762b;
            }
            int i2 = i % 3;
            if (i2 == 0) {
                rect.right = this.f131762b / 2;
            } else if (i2 == 1) {
                rect.left = this.f131762b / 2;
                rect.right = this.f131762b / 2;
            } else if (i2 == 2) {
                rect.left = this.f131762b / 2;
            }
        }
    }
}

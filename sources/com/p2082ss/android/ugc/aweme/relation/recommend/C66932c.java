package com.p2082ss.android.ugc.aweme.relation.recommend;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.c */
public final class C66932c extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final C66933a f150226b = new C66933a((byte) 0);

    /* renamed from: a */
    final View f150227a;

    static {
        Covode.recordClassIndex(78509);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.c$a */
    public static final class C66933a {
        static {
            Covode.recordClassIndex(78510);
        }

        private C66933a() {
        }

        public /* synthetic */ C66933a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66932c(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f150227a = view;
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        marginLayoutParams.bottomMargin = C89241a.m154730a(TypedValue.applyDimension(1, 28.0f, system.getDisplayMetrics()));
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        view3.setLayoutParams(marginLayoutParams);
    }
}

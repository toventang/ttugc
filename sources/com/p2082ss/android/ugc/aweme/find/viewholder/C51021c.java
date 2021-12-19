package com.p2082ss.android.ugc.aweme.find.viewholder;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.find.viewholder.c */
public final class C51021c extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final View f117696a;

    static {
        Covode.recordClassIndex(60203);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C51021c(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131559484(0x7f0d043c, float:1.8744313E38)
            r0 = 0
            android.view.View r1 = com.C1764a.m5927a(r2, r1, r4, r0)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            r3.<init>(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.find.viewholder.C51021c.<init>(android.view.ViewGroup):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C51021c(ViewGroup viewGroup, View view) {
        super(view);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(view, "");
        this.f117696a = view;
        ((ImageView) view.findViewById(R.id.eia)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.find.viewholder.C51021c.View$OnClickListenerC510221 */

            /* renamed from: a */
            final /* synthetic */ C51021c f117697a;

            static {
                Covode.recordClassIndex(60204);
            }

            {
                this.f117697a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                Activity a = C34729o.m70950a(this.f117697a.f117696a.getContext());
                if (a != null) {
                    C63419ae.f143971a.mo101955a(a, "find_friends", "personal_homepage");
                }
            }
        });
    }
}

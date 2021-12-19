package com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.api.model.C33542a;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.AbstractC65728a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.q.a.b.c */
public final class C65746c extends AbstractC65728a<C33542a, RecyclerView.ViewHolder> {
    static {
        Covode.recordClassIndex(77245);
    }

    public C65746c(AbstractC34884bl blVar) {
        super(blVar);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(RecyclerView.ViewHolder viewHolder, Object obj) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(obj, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.b.c$a */
    public final class C65747a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C65746c f148135a;

        static {
            Covode.recordClassIndex(77246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65747a(C65746c cVar, final View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f148135a = cVar;
            view.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b.C65746c.C65747a.RunnableC657481 */

                /* renamed from: a */
                final /* synthetic */ C65747a f148136a;

                static {
                    Covode.recordClassIndex(77247);
                }

                {
                    this.f148136a = r1;
                }

                public final void run() {
                    int i;
                    View childAt;
                    int height = view.getHeight();
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof RecyclerView)) {
                        parent = null;
                    }
                    RecyclerView recyclerView = (RecyclerView) parent;
                    int adapterPosition = this.f148136a.getAdapterPosition();
                    int i2 = 0;
                    for (int i3 = 0; i3 < adapterPosition; i3++) {
                        if (recyclerView == null || (childAt = recyclerView.getChildAt(i3)) == null) {
                            i = 0;
                        } else {
                            i = childAt.getHeight();
                        }
                        i2 += i;
                    }
                    view.getLayoutParams().height = height - i2;
                    View view = view;
                    view.setLayoutParams(view.getLayoutParams());
                }
            });
        }
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a9_, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C65747a(this, a);
    }
}

package com.p2082ss.android.ugc.aweme.tools.music.p4125d;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.d */
public final class C78814d extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final C78816a f177131b = new C78816a((byte) 0);

    /* renamed from: a */
    public final AbstractC40895j f177132a;

    /* renamed from: c */
    private AVDmtImageTextView f177133c;

    static {
        Covode.recordClassIndex(91957);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.d$a */
    public static final class C78816a {
        static {
            Covode.recordClassIndex(91959);
        }

        private C78816a() {
        }

        public /* synthetic */ C78816a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78814d(final View view, AbstractC40895j jVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f177132a = jVar;
        AVDmtImageTextView aVDmtImageTextView = (AVDmtImageTextView) view.findViewById(R.id.brr);
        this.f177133c = aVDmtImageTextView;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.music.p4125d.C78814d.View$OnClickListenerC788151 */

                /* renamed from: a */
                final /* synthetic */ C78814d f177134a;

                static {
                    Covode.recordClassIndex(91958);
                }

                {
                    this.f177134a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    AbstractC40895j jVar = this.f177134a.f177132a;
                    if (jVar != null) {
                        jVar.mo70092a(view, this.f177134a.getAdapterPosition());
                    }
                }
            });
        }
    }
}

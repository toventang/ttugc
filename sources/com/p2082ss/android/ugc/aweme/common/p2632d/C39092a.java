package com.p2082ss.android.ugc.aweme.common.p2632d;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35672z;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;

/* renamed from: com.ss.android.ugc.aweme.common.d.a */
public final class C39092a {

    /* renamed from: a */
    public RecyclerView f92289a;

    /* renamed from: b */
    public C35672z f92290b;

    static {
        Covode.recordClassIndex(46708);
    }

    /* renamed from: a */
    public final void mo67849a() {
        RecyclerView recyclerView = this.f92289a;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.ViewHolder a = this.f92289a.mo4393a(this.f92289a.getChildAt(i));
                if (a.getItemViewType() == 0) {
                    AbstractC39062g gVar = (AbstractC39062g) a;
                    gVar.mo66990a(false);
                    gVar.as_();
                }
            }
        }
    }

    public C39092a(RecyclerView recyclerView, C35672z zVar) {
        this.f92290b = zVar;
        this.f92289a = recyclerView;
    }

    /* renamed from: a */
    public final void mo67850a(final boolean z, boolean z2) {
        int i;
        RunnableC390931 r1 = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.common.p2632d.C39092a.RunnableC390931 */

            static {
                Covode.recordClassIndex(46709);
            }

            /* renamed from: a */
            private static boolean m79366a() {
                try {
                    return C34719f.C34720a.f82009a.mo61395c();
                } catch (Exception unused) {
                    return false;
                }
            }

            public final void run() {
                if (C39092a.this.f92290b != null && C39092a.this.f92289a != null) {
                    if (z) {
                        C17867d.m33078a();
                        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132256h = m79366a();
                        }
                        if (!C58029j.f132256h) {
                            return;
                        }
                    }
                    C39092a.this.f92290b.mo62697a(C39092a.this.f92289a, z);
                }
            }
        };
        if (z2) {
            i = 100;
        } else {
            i = 0;
        }
        C29339a.m58753a(r1, i);
    }
}

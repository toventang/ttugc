package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.d */
public final class C40536d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    C40545l f94854a;

    /* renamed from: b */
    int f94855b;

    static {
        Covode.recordClassIndex(48357);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40536d(View view) {
        super(view);
        C89219l.m154721d(view, "");
        view.setOnLongClickListener(new View.OnLongClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.crossplatform.activity.C40536d.View$OnLongClickListenerC405371 */

            /* renamed from: a */
            final /* synthetic */ C40536d f94856a;

            static {
                Covode.recordClassIndex(48358);
            }

            {
                this.f94856a = r1;
            }

            public final boolean onLongClick(View view) {
                String str;
                C40536d dVar = this.f94856a;
                LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
                View view2 = dVar.itemView;
                C89219l.m154716b(view2, "");
                Context context = view2.getContext();
                C40545l lVar = dVar.f94854a;
                String str2 = null;
                if (lVar != null) {
                    str = lVar.f94872a;
                } else {
                    str = null;
                }
                C40545l lVar2 = dVar.f94854a;
                if (lVar2 != null) {
                    str2 = lVar2.f94873b;
                }
                localTestApi.getDebugUrlMessage(context, str, str2);
                new C79459a(C17867d.m33078a()).mo123052a("Copied").mo123053a();
                return true;
            }
        });
    }
}

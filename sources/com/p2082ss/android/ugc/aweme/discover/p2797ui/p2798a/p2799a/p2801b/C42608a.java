package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2799a.p2801b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUserFeedback;
import com.p2082ss.android.ugc.aweme.search.feedback.C67434a;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.a.b.a */
public final class C42608a extends RecyclerView.ViewHolder {

    /* renamed from: c */
    public static final C42610a f99399c = new C42610a((byte) 0);

    /* renamed from: a */
    public SearchUserFeedback f99400a;

    /* renamed from: b */
    public Map<String, String> f99401b;

    static {
        Covode.recordClassIndex(50712);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.a.b.a$a */
    public static final class C42610a {
        static {
            Covode.recordClassIndex(50714);
        }

        private C42610a() {
        }

        public /* synthetic */ C42610a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42608a(final View view) {
        super(view);
        C89219l.m154721d(view, "");
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2799a.p2801b.C42608a.View$OnClickListenerC426091 */

            /* renamed from: a */
            final /* synthetic */ C42608a f99402a;

            static {
                Covode.recordClassIndex(50713);
            }

            {
                this.f99402a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                SearchUserFeedback searchUserFeedback = this.f99402a.f99400a;
                if (searchUserFeedback != null) {
                    C67434a.m119469a(view.getContext(), searchUserFeedback.schema, false, this.f99402a.f99401b, null);
                }
            }
        });
    }
}

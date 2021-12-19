package com.p2082ss.android.ugc.aweme.account.login.p2254a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.service.IAssistantService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.e */
public final class C31824e extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final TuxTextView f76056a;

    /* renamed from: b */
    public final View f76057b;

    /* renamed from: c */
    private final TextView f76058c;

    static {
        Covode.recordClassIndex(38566);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31824e(View view, boolean z) {
        super(view);
        C89219l.m154721d(view, "");
        this.f76057b = view;
        View findViewById = view.findViewById(R.id.title);
        C89219l.m154716b(findViewById, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.f76056a = tuxTextView;
        View findViewById2 = view.findViewById(R.id.dtf);
        C89219l.m154716b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.f76058c = textView;
        if (z) {
            tuxTextView.setText(view.getContext().getText(R.string.aq5));
        } else {
            tuxTextView.setText(view.getContext().getText(R.string.aoh));
            textView.setText(view.getContext().getText(R.string.aoe));
        }
        tuxTextView.setOnLongClickListener(new View.OnLongClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.account.login.p2254a.C31824e.View$OnLongClickListenerC318251 */

            /* renamed from: a */
            final /* synthetic */ C31824e f76059a;

            static {
                Covode.recordClassIndex(38567);
            }

            {
                this.f76059a = r1;
            }

            public final boolean onLongClick(View view) {
                IAssistantService iAssistantService = (IAssistantService) ServiceManager.get().getService(IAssistantService.class);
                if (iAssistantService == null) {
                    return true;
                }
                Context context = this.f76059a.f76057b.getContext();
                C89219l.m154716b(context, "");
                iAssistantService.openPage(context);
                return true;
            }
        });
    }
}

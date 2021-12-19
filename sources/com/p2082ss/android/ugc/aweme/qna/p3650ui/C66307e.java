package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.model.C66299k;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.e */
public final class C66307e extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final View f149085a;

    /* renamed from: b */
    public final String f149086b;

    static {
        Covode.recordClassIndex(77818);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.e$a */
    static final class View$OnClickListenerC66308a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66307e f149087a;

        /* renamed from: b */
        final /* synthetic */ AbstractC66363i f149088b;

        /* renamed from: c */
        final /* synthetic */ C66299k f149089c;

        static {
            Covode.recordClassIndex(77819);
        }

        View$OnClickListenerC66308a(C66307e eVar, AbstractC66363i iVar, C66299k kVar) {
            this.f149087a = eVar;
            this.f149088b = iVar;
            this.f149089c = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149088b.mo105264a(this.f149089c, this.f149087a.f149086b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66307e(View view, String str) {
        super(view);
        C89219l.m154721d(view, "");
        this.f149085a = view;
        this.f149086b = str;
    }
}

package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.aweme.qna.model.C66290c;
import com.p2082ss.android.ugc.aweme.qna.model.C66292e;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66298j;
import com.p2082ss.android.ugc.aweme.qna.model.C66299k;
import com.p2082ss.android.ugc.aweme.qna.p3644b.C66016a;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66356b;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.f */
public final class C66309f extends C66318g {

    /* renamed from: a */
    public final AbstractC66363i f149090a;

    /* renamed from: b */
    public final Context f149091b;

    /* renamed from: d */
    private C66290c f149092d;

    static {
        Covode.recordClassIndex(77820);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.f$a */
    static final class View$OnClickListenerC66310a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f149093a;

        /* renamed from: b */
        final /* synthetic */ ConstraintLayout f149094b;

        /* renamed from: c */
        final /* synthetic */ C66309f f149095c;

        /* renamed from: d */
        final /* synthetic */ C66293f f149096d;

        /* renamed from: e */
        final /* synthetic */ C66290c f149097e;

        static {
            Covode.recordClassIndex(77821);
        }

        View$OnClickListenerC66310a(String str, ConstraintLayout constraintLayout, C66309f fVar, C66293f fVar2, C66290c cVar) {
            this.f149093a = str;
            this.f149094b = constraintLayout;
            this.f149095c = fVar;
            this.f149096d = fVar2;
            this.f149097e = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149095c.f149090a.mo105266a(this.f149093a, "click_answer");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.f$c */
    static final class View$OnClickListenerC66312c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66309f f149103a;

        /* renamed from: b */
        final /* synthetic */ C66290c f149104b;

        static {
            Covode.recordClassIndex(77823);
        }

        View$OnClickListenerC66312c(C66309f fVar, C66290c cVar) {
            this.f149103a = fVar;
            this.f149104b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149103a.f149090a.mo105265a(this.f149104b.f149028a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.f$d */
    static final class View$OnClickListenerC66313d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66309f f149105a;

        /* renamed from: b */
        final /* synthetic */ C66290c f149106b;

        static {
            Covode.recordClassIndex(77824);
        }

        View$OnClickListenerC66313d(C66309f fVar, C66290c cVar) {
            this.f149105a = fVar;
            this.f149106b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149105a.f149090a.mo105265a(this.f149106b.f149028a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.f$e */
    static final class View$OnClickListenerC66314e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66292e f149107a;

        /* renamed from: b */
        final /* synthetic */ C66309f f149108b;

        /* renamed from: c */
        final /* synthetic */ C66290c f149109c;

        /* renamed from: d */
        final /* synthetic */ C66293f f149110d;

        static {
            Covode.recordClassIndex(77825);
        }

        View$OnClickListenerC66314e(C66292e eVar, C66309f fVar, C66290c cVar, C66293f fVar2) {
            this.f149107a = eVar;
            this.f149108b = fVar;
            this.f149109c = cVar;
            this.f149110d = fVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149108b.f149090a.mo105265a(this.f149107a.f149040d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.f$f */
    static final class View$OnClickListenerC66315f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66292e f149111a;

        /* renamed from: b */
        final /* synthetic */ C66309f f149112b;

        /* renamed from: c */
        final /* synthetic */ C66290c f149113c;

        /* renamed from: d */
        final /* synthetic */ C66293f f149114d;

        static {
            Covode.recordClassIndex(77826);
        }

        View$OnClickListenerC66315f(C66292e eVar, C66309f fVar, C66290c cVar, C66293f fVar2) {
            this.f149111a = eVar;
            this.f149112b = fVar;
            this.f149113c = cVar;
            this.f149114d = fVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149112b.f149090a.mo105265a(this.f149111a.f149040d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.f$b */
    static final class View$OnLongClickListenerC66311b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ String f149098a;

        /* renamed from: b */
        final /* synthetic */ ConstraintLayout f149099b;

        /* renamed from: c */
        final /* synthetic */ C66309f f149100c;

        /* renamed from: d */
        final /* synthetic */ C66293f f149101d;

        /* renamed from: e */
        final /* synthetic */ C66290c f149102e;

        static {
            Covode.recordClassIndex(77822);
        }

        View$OnLongClickListenerC66311b(String str, ConstraintLayout constraintLayout, C66309f fVar, C66293f fVar2, C66290c cVar) {
            this.f149098a = str;
            this.f149099b = constraintLayout;
            this.f149100c = fVar;
            this.f149101d = fVar2;
            this.f149102e = cVar;
        }

        public final boolean onLongClick(View view) {
            this.f149100c.f149090a.mo105254a(new C66356b(this.f149098a, this.f149102e.f149033f.f149069a, "TODO", this.f149102e.f149033f.f149072d));
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.f$h */
    static final class View$OnLongClickListenerC66317h implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ String f149120a;

        /* renamed from: b */
        final /* synthetic */ View f149121b;

        /* renamed from: c */
        final /* synthetic */ C66292e f149122c;

        /* renamed from: d */
        final /* synthetic */ C66309f f149123d;

        /* renamed from: e */
        final /* synthetic */ C66290c f149124e;

        /* renamed from: f */
        final /* synthetic */ C66293f f149125f;

        static {
            Covode.recordClassIndex(77828);
        }

        View$OnLongClickListenerC66317h(String str, View view, C66292e eVar, C66309f fVar, C66290c cVar, C66293f fVar2) {
            this.f149120a = str;
            this.f149121b = view;
            this.f149122c = eVar;
            this.f149123d = fVar;
            this.f149124e = cVar;
            this.f149125f = fVar2;
        }

        public final boolean onLongClick(View view) {
            this.f149123d.f149090a.mo105254a(new C66356b(this.f149120a, this.f149124e.f149033f.f149069a, "TODO", this.f149124e.f149033f.f149072d));
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.f$g */
    static final class View$OnClickListenerC66316g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f149115a;

        /* renamed from: b */
        final /* synthetic */ C66292e f149116b;

        /* renamed from: c */
        final /* synthetic */ C66309f f149117c;

        /* renamed from: d */
        final /* synthetic */ C66290c f149118d;

        /* renamed from: e */
        final /* synthetic */ C66293f f149119e;

        static {
            Covode.recordClassIndex(77827);
        }

        View$OnClickListenerC66316g(View view, C66292e eVar, C66309f fVar, C66290c cVar, C66293f fVar2) {
            this.f149115a = view;
            this.f149116b = eVar;
            this.f149117c = fVar;
            this.f149118d = cVar;
            this.f149119e = fVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            List<C66299k> list = this.f149116b.f149041e;
            if (list != null && (!list.isEmpty())) {
                this.f149117c.f149090a.mo105264a(list.get(0), this.f149118d.f149030c);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3650ui.C66318g
    /* renamed from: a */
    public final void mo105231a(C66293f fVar) {
        String str;
        C66292e eVar;
        String str2;
        int i;
        String str3;
        String str4;
        C89219l.m154721d(fVar, "");
        super.mo105231a(fVar);
        C66290c cVar = (C66290c) fVar;
        C66298j jVar = cVar.f149033f;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f149126c.findViewById(R.id.k9);
        if (!(constraintLayout == null || (str4 = fVar.f149044h) == null)) {
            constraintLayout.setOnClickListener(new View$OnClickListenerC66310a(str4, constraintLayout, this, fVar, cVar));
            constraintLayout.setOnLongClickListener(new View$OnLongClickListenerC66311b(str4, constraintLayout, this, fVar, cVar));
        }
        SmartImageView smartImageView = (SmartImageView) this.f149126c.findViewById(R.id.k7);
        String str5 = null;
        if (smartImageView != null) {
            C66290c cVar2 = this.f149092d;
            if (cVar2 != null) {
                str3 = cVar2.f149031d;
            } else {
                str3 = null;
            }
            if (!C89219l.m154714a((Object) str3, (Object) cVar.f149031d)) {
                C66016a.m117827a(smartImageView, cVar.f149031d);
                smartImageView.setOnClickListener(new View$OnClickListenerC66312c(this, cVar));
            }
        }
        TuxTextView tuxTextView = (TuxTextView) this.f149126c.findViewById(R.id.k8);
        if (tuxTextView != null) {
            tuxTextView.setText(cVar.f149029b);
            tuxTextView.setOnClickListener(new View$OnClickListenerC66313d(this, cVar));
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.f149126c.findViewById(R.id.k_);
        if (tuxTextView2 != null) {
            String str6 = cVar.f149030c;
            if (str6 != null) {
                str2 = new C89350l("(?m)^[ \t]*\r?\n").replace(str6, "");
            } else {
                str2 = null;
            }
            tuxTextView2.setText(str2);
            int i2 = 3;
            if (C80471gb.m139482a()) {
                i = 4;
            } else {
                i = 3;
            }
            tuxTextView2.setTextDirection(i);
            if (C80471gb.m139482a()) {
                i2 = 5;
            }
            tuxTextView2.setGravity(i2);
            EOYServiceImpl.m120048b().mo106960a(tuxTextView2);
        }
        CommentTranslationStatusView commentTranslationStatusView = (CommentTranslationStatusView) this.f149126c.findViewById(R.id.eng);
        if (commentTranslationStatusView != null) {
            if (jVar.f149070b) {
                commentTranslationStatusView.setVisibility(0);
                commentTranslationStatusView.setLoading(true);
                commentTranslationStatusView.setLoadingText(R.string.am9);
            } else {
                commentTranslationStatusView.setVisibility(8);
            }
        }
        C66292e eVar2 = cVar.f149032e;
        if (eVar2 != null) {
            SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.f149126c.findViewById(R.id.kb);
            if (smartAvatarImageView != null) {
                C66290c cVar3 = this.f149092d;
                if (!(cVar3 == null || (eVar = cVar3.f149032e) == null)) {
                    str5 = eVar.f149037a;
                }
                if (!C89219l.m154714a((Object) str5, (Object) eVar2.f149037a)) {
                    C66016a.m117827a(smartAvatarImageView, eVar2.f149037a);
                    smartAvatarImageView.setOnClickListener(new View$OnClickListenerC66314e(eVar2, this, cVar, fVar));
                }
            }
            TuxTextView tuxTextView3 = (TuxTextView) this.f149126c.findViewById(R.id.kd);
            if (tuxTextView3 != null) {
                tuxTextView3.setText(eVar2.f149038b);
                tuxTextView3.setOnClickListener(new View$OnClickListenerC66315f(eVar2, this, cVar, fVar));
            }
            TuxTextView tuxTextView4 = (TuxTextView) this.f149126c.findViewById(R.id.kc);
            if (tuxTextView4 != null) {
                tuxTextView4.setText(eVar2.f149039c);
            }
            RecyclerView recyclerView = (RecyclerView) this.f149126c.findViewById(R.id.ke);
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.mo4356b(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                C66304c cVar4 = new C66304c(this.f149090a, cVar.f149030c);
                recyclerView.setAdapter(cVar4);
                List<C66299k> list = eVar2.f149041e;
                if (list != null) {
                    cVar4.mo5018a(list);
                }
            }
            View findViewById = this.f149126c.findViewById(R.id.eb2);
            if (!(findViewById == null || (str = fVar.f149044h) == null)) {
                findViewById.setOnClickListener(new View$OnClickListenerC66316g(findViewById, eVar2, this, cVar, fVar));
                findViewById.setOnLongClickListener(new View$OnLongClickListenerC66317h(str, findViewById, eVar2, this, cVar, fVar));
            }
        }
        this.f149092d = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66309f(AbstractC66363i iVar, View view, Context context) {
        super(view);
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(context, "");
        this.f149090a = iVar;
        this.f149091b = context;
    }
}

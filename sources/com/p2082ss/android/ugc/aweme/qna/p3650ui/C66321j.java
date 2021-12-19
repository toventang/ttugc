package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66295g;
import com.p2082ss.android.ugc.aweme.qna.model.C66298j;
import com.p2082ss.android.ugc.aweme.qna.model.C66299k;
import com.p2082ss.android.ugc.aweme.qna.p3644b.C66016a;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66356b;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.j */
public final class C66321j extends C66318g {

    /* renamed from: a */
    public final AbstractC66363i f149128a;

    /* renamed from: b */
    private C66295g f149129b;

    static {
        Covode.recordClassIndex(77832);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.j$b */
    static final class View$OnClickListenerC66323b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f149135a;

        /* renamed from: b */
        final /* synthetic */ ConstraintLayout f149136b;

        /* renamed from: c */
        final /* synthetic */ C66321j f149137c;

        /* renamed from: d */
        final /* synthetic */ C66293f f149138d;

        /* renamed from: e */
        final /* synthetic */ C66298j f149139e;

        static {
            Covode.recordClassIndex(77834);
        }

        View$OnClickListenerC66323b(String str, ConstraintLayout constraintLayout, C66321j jVar, C66293f fVar, C66298j jVar2) {
            this.f149135a = str;
            this.f149136b = constraintLayout;
            this.f149137c = jVar;
            this.f149138d = fVar;
            this.f149139e = jVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149137c.f149128a.mo105266a(this.f149135a, "click_question");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.j$a */
    static final class View$OnLongClickListenerC66322a implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ String f149130a;

        /* renamed from: b */
        final /* synthetic */ ConstraintLayout f149131b;

        /* renamed from: c */
        final /* synthetic */ C66321j f149132c;

        /* renamed from: d */
        final /* synthetic */ C66293f f149133d;

        /* renamed from: e */
        final /* synthetic */ C66298j f149134e;

        static {
            Covode.recordClassIndex(77833);
        }

        View$OnLongClickListenerC66322a(String str, ConstraintLayout constraintLayout, C66321j jVar, C66293f fVar, C66298j jVar2) {
            this.f149130a = str;
            this.f149131b = constraintLayout;
            this.f149132c = jVar;
            this.f149133d = fVar;
            this.f149134e = jVar2;
        }

        public final boolean onLongClick(View view) {
            this.f149132c.f149128a.mo105254a(new C66356b(this.f149130a, this.f149134e.f149069a, "TODO", ((C66295g) this.f149133d).f149053l, this.f149134e.f149072d));
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.j$c */
    static final class View$OnClickListenerC66324c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66321j f149140a;

        /* renamed from: b */
        final /* synthetic */ C66295g f149141b;

        static {
            Covode.recordClassIndex(77835);
        }

        View$OnClickListenerC66324c(C66321j jVar, C66295g gVar) {
            this.f149140a = jVar;
            this.f149141b = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149140a.f149128a.mo105264a(this.f149141b.f149046b, this.f149141b.f149048d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3650ui.C66318g
    /* renamed from: a */
    public final void mo105231a(C66293f fVar) {
        String str;
        int i;
        String str2;
        String str3;
        C89219l.m154721d(fVar, "");
        super.mo105231a(fVar);
        C66295g gVar = (C66295g) fVar;
        C66298j jVar = gVar.f149052k;
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.f149126c.findViewById(R.id.dd8);
        String str4 = null;
        if (smartAvatarImageView != null) {
            C66295g gVar2 = this.f149129b;
            if (gVar2 != null) {
                str3 = gVar2.f149050f;
            } else {
                str3 = null;
            }
            if (!C89219l.m154714a((Object) str3, (Object) gVar.f149050f)) {
                C66016a.m117827a(smartAvatarImageView, gVar.f149050f);
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f149126c.findViewById(R.id.dd_);
        if (!(constraintLayout == null || (str2 = fVar.f149044h) == null)) {
            constraintLayout.setOnLongClickListener(new View$OnLongClickListenerC66322a(str2, constraintLayout, this, fVar, jVar));
            constraintLayout.setOnClickListener(new View$OnClickListenerC66323b(str2, constraintLayout, this, fVar, jVar));
        }
        TuxTextView tuxTextView = (TuxTextView) this.f149126c.findViewById(R.id.dd9);
        if (tuxTextView != null) {
            tuxTextView.setText(gVar.f149047c);
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.f149126c.findViewById(R.id.ddc);
        if (tuxTextView2 != null) {
            tuxTextView2.setText(gVar.f149054m);
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.f149126c.findViewById(R.id.dda);
        if (tuxTextView3 != null) {
            String str5 = gVar.f149048d;
            if (str5 != null) {
                str4 = new C89350l("(?m)^[ \t]*\r?\n").replace(str5, "");
            }
            tuxTextView3.setText(str4);
            int i2 = 3;
            if (C80471gb.m139482a()) {
                i = 4;
            } else {
                i = 3;
            }
            tuxTextView3.setTextDirection(i);
            if (C80471gb.m139482a()) {
                i2 = 5;
            }
            tuxTextView3.setGravity(i2);
            EOYServiceImpl.m120048b().mo106960a(tuxTextView3);
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
        TuxTextView tuxTextView4 = (TuxTextView) this.f149126c.findViewById(R.id.ddb);
        if (tuxTextView4 != null) {
            tuxTextView4.setText(gVar.f149049e);
        }
        SmartImageView smartImageView = (SmartImageView) this.f149126c.findViewById(R.id.ddd);
        if (smartImageView != null) {
            C66299k kVar = gVar.f149046b;
            if (kVar == null || (str = kVar.f149075c) == null) {
                smartImageView.setVisibility(8);
            } else {
                C66016a.m117827a(smartImageView, str);
                smartImageView.setOnClickListener(new View$OnClickListenerC66324c(this, gVar));
                smartImageView.setVisibility(0);
            }
        }
        this.f149129b = gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66321j(AbstractC66363i iVar, View view) {
        super(view);
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(view, "");
        this.f149128a = iVar;
    }
}

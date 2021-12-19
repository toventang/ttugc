package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DoubleColorBallAnimationView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66296h;
import com.p2082ss.android.ugc.aweme.qna.p3644b.C66016a;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66286e;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.AbstractC66363i;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.views.MultiAvatarView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.k */
public final class C66325k extends C66318g {

    /* renamed from: a */
    public C66296h f149142a;

    /* renamed from: b */
    public final AbstractC66363i f149143b;

    /* renamed from: d */
    public final Context f149144d;

    /* renamed from: e */
    public final C66286e f149145e;

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.k$d */
    static final class View$OnClickListenerC66329d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC66329d f149153a = new View$OnClickListenerC66329d();

        static {
            Covode.recordClassIndex(77840);
        }

        View$OnClickListenerC66329d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(77836);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.k$a */
    static final class View$OnClickListenerC66326a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66325k f149146a;

        /* renamed from: b */
        final /* synthetic */ C66296h f149147b;

        static {
            Covode.recordClassIndex(77837);
        }

        View$OnClickListenerC66326a(C66325k kVar, C66296h hVar) {
            this.f149146a = kVar;
            this.f149147b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149146a.f149143b.mo105263b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.k$c */
    static final class View$OnClickListenerC66328c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ List f149150a;

        /* renamed from: b */
        final /* synthetic */ C66325k f149151b;

        /* renamed from: c */
        final /* synthetic */ C66296h f149152c;

        static {
            Covode.recordClassIndex(77839);
        }

        View$OnClickListenerC66328c(List list, C66325k kVar, C66296h hVar) {
            this.f149150a = list;
            this.f149151b = kVar;
            this.f149152c = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149151b.f149143b.mo105265a(this.f149152c.f149055a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.k$b */
    static final class View$OnClickListenerC66327b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66325k f149148a;

        /* renamed from: b */
        final /* synthetic */ C66296h f149149b;

        static {
            Covode.recordClassIndex(77838);
        }

        View$OnClickListenerC66327b(C66325k kVar, C66296h hVar) {
            this.f149148a = kVar;
            this.f149149b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149148a.f149143b.mo105264a(this.f149149b.f149056b, this.f149149b.f149058d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.k$e */
    static final class View$OnClickListenerC66330e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66325k f149154a;

        /* renamed from: b */
        final /* synthetic */ C66296h f149155b;

        static {
            Covode.recordClassIndex(77841);
        }

        View$OnClickListenerC66330e(C66325k kVar, C66296h hVar) {
            this.f149154a = kVar;
            this.f149155b = hVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            String str2 = this.f149155b.f149044h;
            if (str2 != null) {
                if (this.f149155b.f149065n) {
                    str = "click_invitation";
                } else {
                    str = "click_recommendation";
                }
                this.f149154a.f149143b.mo105266a(str2, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.k$f */
    static final class View$OnClickListenerC66331f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66325k f149156a;

        /* renamed from: b */
        final /* synthetic */ C66296h f149157b;

        static {
            Covode.recordClassIndex(77842);
        }

        View$OnClickListenerC66331f(C66325k kVar, C66296h hVar) {
            this.f149156a = kVar;
            this.f149157b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String str = this.f149157b.f149044h;
            if (str != null) {
                this.f149156a.f149143b.mo105262a(str, this.f149157b.f149065n, this.f149157b.f149066o);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.k$g */
    static final class View$OnClickListenerC66332g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66325k f149158a;

        /* renamed from: b */
        final /* synthetic */ C66296h f149159b;

        static {
            Covode.recordClassIndex(77843);
        }

        View$OnClickListenerC66332g(C66325k kVar, C66296h hVar) {
            this.f149158a = kVar;
            this.f149159b = hVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            Boolean bool = this.f149159b.f149062k;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                String str2 = this.f149159b.f149044h;
                if (str2 != null) {
                    if (!booleanValue) {
                        boolean z = this.f149159b.f149065n;
                        C89219l.m154721d(str2, "");
                        C33744d a = new C33744d().mo59983a("enter_from", "qa_personal_profile");
                        if (z) {
                            str = "click_invitation";
                        } else {
                            str = "click_recommendation";
                        }
                        C39162r.m79460a("favorite_qa", a.mo59983a("enter_method", str).mo59983a("question_id", str2).f79943a);
                    }
                    this.f149158a.f149143b.mo105261a(str2, booleanValue ? 1 : 0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.k$h */
    static final class View$OnClickListenerC66333h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66325k f149160a;

        /* renamed from: b */
        final /* synthetic */ C66296h f149161b;

        static {
            Covode.recordClassIndex(77844);
        }

        View$OnClickListenerC66333h(C66325k kVar, C66296h hVar) {
            this.f149160a = kVar;
            this.f149161b = hVar;
        }

        public final void onClick(View view) {
            Integer num;
            ClickAgent.onClick(view);
            String str = this.f149161b.f149044h;
            if (str != null) {
                List<String> list = this.f149161b.f149066o;
                if (list != null) {
                    num = Integer.valueOf(list.size());
                } else {
                    num = null;
                }
                C89219l.m154721d(str, "");
                C39162r.m79460a("delete_qa_invitation", new C33744d().mo59983a("enter_from", "qa_personal_profile").mo59983a("question_id", str).mo59982a("inviter_cnt", num).f79943a);
                this.f149160a.f149143b.mo105260a(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3650ui.C66318g
    /* renamed from: a */
    public final void mo105231a(C66293f fVar) {
        int i;
        MultiAvatarView multiAvatarView;
        String str;
        Integer num;
        C89219l.m154721d(fVar, "");
        C66296h hVar = (C66296h) fVar;
        this.f149142a = hVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f149126c.findViewById(R.id.dbz);
        if (constraintLayout != null) {
            if (hVar.f149063l) {
                TuxTextView tuxTextView = (TuxTextView) this.f149126c.findViewById(R.id.dbf);
                if (tuxTextView != null) {
                    C66286e eVar = this.f149145e;
                    if (eVar == null || (num = eVar.f149018b) == null) {
                        str = this.f149144d.getString(R.string.f2f);
                        C89219l.m154716b(str, "");
                    } else {
                        str = this.f149144d.getString(R.string.f2g, String.valueOf(num.intValue()));
                        C89219l.m154716b(str, "");
                    }
                    tuxTextView.setText(str);
                }
                constraintLayout.setVisibility(0);
                constraintLayout.setOnClickListener(new View$OnClickListenerC66326a(this, hVar));
            } else {
                constraintLayout.setVisibility(8);
                constraintLayout.setOnClickListener(View$OnClickListenerC66329d.f149153a);
            }
        }
        DoubleColorBallAnimationView doubleColorBallAnimationView = (DoubleColorBallAnimationView) this.f149126c.findViewById(R.id.ap9);
        if (doubleColorBallAnimationView != null) {
            if (hVar.f149064m) {
                doubleColorBallAnimationView.setVisibility(0);
            } else {
                doubleColorBallAnimationView.setVisibility(8);
            }
        }
        ((TuxButton) this.f149126c.findViewById(R.id.k3)).setOnClickListener(new View$OnClickListenerC66331f(this, hVar));
        TuxButton tuxButton = (TuxButton) this.f149126c.findViewById(R.id.k5);
        tuxButton.setOnClickListener(new View$OnClickListenerC66332g(this, hVar));
        if (hVar.f149062k == null || !hVar.f149062k.booleanValue()) {
            C89219l.m154716b(tuxButton, "");
            tuxButton.setText(this.f149144d.getString(R.string.f3i));
            tuxButton.mo37348a(Integer.valueOf((int) R.raw.icon_bookmark));
        } else {
            C89219l.m154716b(tuxButton, "");
            tuxButton.setText(this.f149144d.getString(R.string.f3g));
            tuxButton.mo37348a(Integer.valueOf((int) R.raw.icon_bookmark_fill));
        }
        if (hVar.f149056b == null) {
            View findViewById = this.f149126c.findViewById(R.id.fe6);
            C89219l.m154716b(findViewById, "");
            ((SmartImageView) findViewById).setVisibility(8);
        } else {
            SmartImageView smartImageView = (SmartImageView) this.f149126c.findViewById(R.id.fe6);
            if (smartImageView != null) {
                smartImageView.setVisibility(0);
                C66016a.m117827a(smartImageView, hVar.f149056b.f149075c);
                smartImageView.setOnClickListener(new View$OnClickListenerC66327b(this, hVar));
            }
        }
        if (hVar.f149065n) {
            View findViewById2 = this.f149126c.findViewById(R.id.dc2);
            C89219l.m154716b(findViewById2, "");
            ((TuxIconView) findViewById2).setVisibility(0);
            ((TuxIconView) this.f149126c.findViewById(R.id.dc2)).setOnClickListener(new View$OnClickListenerC66333h(this, hVar));
        } else {
            View findViewById3 = this.f149126c.findViewById(R.id.dc2);
            C89219l.m154716b(findViewById3, "");
            ((TuxIconView) findViewById3).setVisibility(8);
        }
        List<User> list = hVar.f149060f;
        if (!(list == null || (multiAvatarView = (MultiAvatarView) this.f149126c.findViewById(R.id.on)) == null)) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            multiAvatarView.mo125016a(a, C89241a.m154730a(TypedValue.applyDimension(1, 13.5f, system2.getDisplayMetrics())));
            multiAvatarView.mo125017a(list, 0);
            multiAvatarView.setOnClickListener(new View$OnClickListenerC66328c(list, this, hVar));
        }
        String str2 = hVar.f149057c;
        if (str2 != null) {
            View findViewById4 = this.f149126c.findViewById(R.id.ow);
            C89219l.m154716b(findViewById4, "");
            ((TuxTextView) findViewById4).setText(str2);
        }
        String str3 = hVar.f149058d;
        if (str3 != null) {
            TuxTextView tuxTextView2 = (TuxTextView) this.f149126c.findViewById(R.id.ddf);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(new C89350l("(?m)^[ \t]*\r?\n").replace(str3, ""));
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
            EOYServiceImpl.m120048b().mo106960a((TextView) this.f149126c.findViewById(R.id.ddf));
        }
        ((LinearLayout) this.f149126c.findViewById(R.id.ebj)).setOnClickListener(new View$OnClickListenerC66330e(this, hVar));
        String str4 = hVar.f149059e;
        if (str4 != null) {
            View findViewById5 = this.f149126c.findViewById(R.id.ddh);
            C89219l.m154716b(findViewById5, "");
            ((TuxTextView) findViewById5).setText(str4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66325k(AbstractC66363i iVar, View view, Context context, C66286e eVar) {
        super(view);
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(context, "");
        this.f149143b = iVar;
        this.f149144d = context;
        this.f149145e = eVar;
    }
}

package com.p2082ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.experiment.C46951fq;
import com.p2082ss.android.ugc.aweme.follow.NewFollowButton;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51700au;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.social.ext.C74729a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.base.widget.c */
public final class C34746c extends LinearLayout implements AbstractC66614a {

    /* renamed from: b */
    public static final C34747a f82065b = new C34747a((byte) 0);

    /* renamed from: a */
    public AbstractC89172b<? super Integer, C89391z> f82066a;

    /* renamed from: d */
    private final int f82067d;

    /* renamed from: e */
    private C56520b f82068e;

    /* renamed from: f */
    private int f82069f;

    /* renamed from: g */
    private SparseArray f82070g;

    static {
        Covode.recordClassIndex(41742);
    }

    /* renamed from: c */
    private View m70980c(int i) {
        if (this.f82070g == null) {
            this.f82070g = new SparseArray();
        }
        View view = (View) this.f82070g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82070g.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a
    public final C34746c getView() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.c$a */
    public static final class C34747a {
        static {
            Covode.recordClassIndex(41743);
        }

        private C34747a() {
        }

        public /* synthetic */ C34747a(byte b) {
            this();
        }
    }

    public final int getScenario() {
        return this.f82069f;
    }

    public final int getScene() {
        return this.f82067d;
    }

    public final C56520b getUiStyleConfig() {
        return this.f82068e;
    }

    /* renamed from: a */
    private final boolean m70977a() {
        int i = this.f82069f;
        if (i == 1 || i == 8 || i == 9) {
            return true;
        }
        return false;
    }

    private final int getAvatarMarginLeft() {
        if (this.f82069f == 1) {
            return 12;
        }
        return 16;
    }

    private final int getItemVerticalPaddingByScenario() {
        int i = this.f82069f;
        if (i == 1 || i == 5) {
            return 10;
        }
        return 8;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a
    public final AbstractC51346a getFollowBtn() {
        NewFollowButton newFollowButton = (NewFollowButton) m70980c(R.id.b6b);
        C89219l.m154716b(newFollowButton, "");
        return newFollowButton;
    }

    private final int getAvatarSize() {
        int i = this.f82069f;
        if (i == 1 || i == 5) {
            return 48;
        }
        if (AbstractC66614a.C66615a.f149748a.contains(Integer.valueOf(this.f82069f))) {
            return 40;
        }
        return 56;
    }

    private final int getFollowBtnMarginRight() {
        int i = this.f82069f;
        if (i == 1) {
            return 12;
        }
        if (i == 8 || AbstractC66614a.C66615a.f149748a.contains(Integer.valueOf(i))) {
            return 16;
        }
        return 0;
    }

    private final int getItemHeightByScenario() {
        int i = this.f82069f;
        if (i == 1 || i == 5) {
            return 68;
        }
        if (AbstractC66614a.C66615a.f149748a.contains(Integer.valueOf(this.f82069f))) {
            return 56;
        }
        return 72;
    }

    /* renamed from: b */
    private final void m70978b() {
        NewFollowButton newFollowButton = (NewFollowButton) m70980c(R.id.b6b);
        C89219l.m154716b(newFollowButton, "");
        ViewGroup.LayoutParams layoutParams = newFollowButton.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, 0, 0, 0);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        layoutParams2.setMarginEnd(C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        layoutParams2.width = C89241a.m154730a(TypedValue.applyDimension(1, 88.0f, system2.getDisplayMetrics()));
        NewFollowButton newFollowButton2 = (NewFollowButton) m70980c(R.id.b6b);
        C89219l.m154716b(newFollowButton2, "");
        newFollowButton2.setLayoutParams(layoutParams2);
    }

    /* renamed from: c */
    private final void m70981c() {
        NewFollowButton newFollowButton = (NewFollowButton) m70980c(R.id.b6b);
        C89219l.m154716b(newFollowButton, "");
        ViewGroup.LayoutParams layoutParams = newFollowButton.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        layoutParams2.setMargins(0, 0, C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())), 0);
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        layoutParams2.setMarginEnd(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        layoutParams2.width = C89241a.m154730a(TypedValue.applyDimension(1, 120.0f, system3.getDisplayMetrics()));
        NewFollowButton newFollowButton2 = (NewFollowButton) m70980c(R.id.b6b);
        C89219l.m154716b(newFollowButton2, "");
        newFollowButton2.setLayoutParams(layoutParams2);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a
    public final void setEventListener(AbstractC89172b<? super Integer, C89391z> bVar) {
        this.f82066a = bVar;
    }

    public final void setScenario(int i) {
        this.f82069f = i;
    }

    public final void setUiStyleConfig(C56520b bVar) {
        this.f82068e = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.c$b */
    static final class View$OnClickListenerC34748b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34746c f82071a;

        static {
            Covode.recordClassIndex(41744);
        }

        View$OnClickListenerC34748b(C34746c cVar) {
            this.f82071a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super Integer, C89391z> bVar = this.f82071a.f82066a;
            if (bVar != null) {
                bVar.invoke(1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.c$c */
    static final class View$OnClickListenerC34749c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34746c f82072a;

        static {
            Covode.recordClassIndex(41745);
        }

        View$OnClickListenerC34749c(C34746c cVar) {
            this.f82072a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super Integer, C89391z> bVar = this.f82072a.f82066a;
            if (bVar != null) {
                bVar.invoke(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.c$d */
    static final class View$OnClickListenerC34750d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34746c f82073a;

        static {
            Covode.recordClassIndex(41746);
        }

        View$OnClickListenerC34750d(C34746c cVar) {
            this.f82073a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super Integer, C89391z> bVar = this.f82073a.f82066a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(C51700au.f119172d));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.c$e */
    static final class View$OnClickListenerC34751e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34746c f82074a;

        static {
            Covode.recordClassIndex(41747);
        }

        View$OnClickListenerC34751e(C34746c cVar) {
            this.f82074a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super Integer, C89391z> bVar = this.f82074a.f82066a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(C51700au.f119173e));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a
    /* renamed from: a */
    public final void mo61445a(boolean z) {
        ((NewFollowButton) m70980c(R.id.b6b)).setShouldShowMessageText(z);
    }

    /* renamed from: a */
    private final void m70974a(int i) {
        if (!m70977a()) {
            if (i == 0) {
                TuxIconView tuxIconView = (TuxIconView) m70980c(R.id.sx);
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                return;
            }
            TuxIconView tuxIconView2 = (TuxIconView) m70980c(R.id.sx);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
    }

    /* renamed from: b */
    private final void m70979b(int i) {
        if (m70977a()) {
            if (this.f82069f != 9) {
                m70978b();
            }
        } else if (i == 0) {
            m70978b();
        } else if (i == 1 || i == 2 || i == 4) {
            m70981c();
        }
    }

    private final void setRecommendReason(User user) {
        if (!TextUtils.isEmpty(user.getRecommendReason())) {
            TuxTextView tuxTextView = (TuxTextView) m70980c(R.id.df3);
            C89219l.m154716b(tuxTextView, "");
            String recommendReason = user.getRecommendReason();
            if (recommendReason == null) {
                recommendReason = "";
            }
            tuxTextView.setText(recommendReason);
        }
    }

    /* renamed from: a */
    private final void m70976a(View view) {
        C56520b bVar = this.f82068e;
        if (bVar != null && bVar.f128868j != -1 && 1 != 0 && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = bVar.f128868j;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a
    /* renamed from: a */
    public final void mo61443a(C56520b bVar) {
        boolean z;
        C56520b bVar2;
        C89219l.m154721d(bVar, "");
        if (!C89219l.m154714a(this.f82068e, bVar)) {
            this.f82068e = bVar;
            if (bVar.f128860b != -1) {
                z = true;
            } else {
                z = false;
            }
            C56520b bVar3 = null;
            if (z) {
                SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) m70980c(R.id.o3);
                C89219l.m154716b(smartAvatarImageView, "");
                SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) m70980c(R.id.o3);
                C89219l.m154716b(smartAvatarImageView2, "");
                ViewGroup.LayoutParams layoutParams = smartAvatarImageView2.getLayoutParams();
                layoutParams.width = bVar.f128860b;
                layoutParams.height = bVar.f128860b;
                smartAvatarImageView.setLayoutParams(layoutParams);
            }
            if (bVar.f128863e != -1) {
                bVar2 = bVar;
            } else {
                bVar2 = null;
            }
            if (bVar2 != null) {
                ((TuxTextView) m70980c(R.id.chu)).setTuxFont(bVar2.f128863e);
            }
            if (bVar.f128864f != -1) {
                ((TuxTextView) m70980c(R.id.chu)).mo37697a((float) bVar.f128864f);
            }
            if (bVar.f128865g != -1) {
                bVar3 = bVar;
            }
            if (bVar3 != null) {
                ((TuxTextView) m70980c(R.id.ajg)).setTuxFont(bVar3.f128865g);
            }
            if (bVar.f128867i != -1) {
                ((TuxTextView) m70980c(R.id.ajg)).setTextColor(bVar.f128867i);
            }
            TuxTextView tuxTextView = (TuxTextView) m70980c(R.id.ajg);
            C89219l.m154716b(tuxTextView, "");
            m70976a(tuxTextView);
            TuxTextView tuxTextView2 = (TuxTextView) m70980c(R.id.df3);
            C89219l.m154716b(tuxTextView2, "");
            m70976a(tuxTextView2);
            MutualRelationView mutualRelationView = (MutualRelationView) m70980c(R.id.cp2);
            C89219l.m154716b(mutualRelationView, "");
            m70976a(mutualRelationView);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a
    /* renamed from: a */
    public final void mo61444a(User user) {
        C89219l.m154721d(user, "");
        setOnClickListener(new View$OnClickListenerC34748b(this));
        C20766v a = C20761r.m39060a(C34735v.m70965a(user.getAvatarThumb()));
        a.f49092E = (SmartImageView) m70980c(R.id.o3);
        a.mo34179a("NewRecommendSuggestedItemView").mo34186c();
        int a2 = C46951fq.m90234a();
        if (a2 == C46951fq.f109421a) {
            int i = this.f82069f;
            if (i == 2 || i == 1 || i == 7 || i == 6) {
                TuxTextView tuxTextView = (TuxTextView) m70980c(R.id.chu);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(user.getNickname());
                TuxTextView tuxTextView2 = (TuxTextView) m70980c(R.id.ajg);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setText(user.getUniqueId());
            } else {
                TuxTextView tuxTextView3 = (TuxTextView) m70980c(R.id.chu);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setText(user.getUniqueId());
                TuxTextView tuxTextView4 = (TuxTextView) m70980c(R.id.ajg);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setText(user.getNickname());
            }
        } else if (a2 == C46951fq.f109422b) {
            TuxTextView tuxTextView5 = (TuxTextView) m70980c(R.id.chu);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setText(user.getNickname());
            TuxTextView tuxTextView6 = (TuxTextView) m70980c(R.id.ajg);
            C89219l.m154716b(tuxTextView6, "");
            tuxTextView6.setText(user.getUniqueId());
        } else if (a2 == C46951fq.f109423c) {
            TuxTextView tuxTextView7 = (TuxTextView) m70980c(R.id.chu);
            C89219l.m154716b(tuxTextView7, "");
            tuxTextView7.setText(user.getUniqueId());
            TuxTextView tuxTextView8 = (TuxTextView) m70980c(R.id.ajg);
            C89219l.m154716b(tuxTextView8, "");
            tuxTextView8.setText(user.getNickname());
        } else if (a2 == C46951fq.f109424d) {
            TuxTextView tuxTextView9 = (TuxTextView) m70980c(R.id.chu);
            C89219l.m154716b(tuxTextView9, "");
            tuxTextView9.setText(user.getNickname());
            TuxTextView tuxTextView10 = (TuxTextView) m70980c(R.id.ajg);
            C89219l.m154716b(tuxTextView10, "");
            tuxTextView10.setVisibility(8);
        } else if (a2 == C46951fq.f109425e) {
            TuxTextView tuxTextView11 = (TuxTextView) m70980c(R.id.chu);
            C89219l.m154716b(tuxTextView11, "");
            tuxTextView11.setText(user.getUniqueId());
            TuxTextView tuxTextView12 = (TuxTextView) m70980c(R.id.ajg);
            C89219l.m154716b(tuxTextView12, "");
            tuxTextView12.setVisibility(8);
        }
        if (this.f82069f == 8) {
            TuxTextView tuxTextView13 = (TuxTextView) m70980c(R.id.chu);
            C89219l.m154716b(tuxTextView13, "");
            tuxTextView13.setText(user.getNickname());
            TuxTextView tuxTextView14 = (TuxTextView) m70980c(R.id.ajg);
            C89219l.m154716b(tuxTextView14, "");
            tuxTextView14.setText(user.getUniqueId());
            TuxTextView tuxTextView15 = (TuxTextView) m70980c(R.id.ajg);
            C89219l.m154716b(tuxTextView15, "");
            tuxTextView15.setVisibility(0);
        }
        ((TuxTextView) m70980c(R.id.chu)).setOnClickListener(new View$OnClickListenerC34749c(this));
        if (user.getMutualStruct() != null) {
            TuxTextView tuxTextView16 = (TuxTextView) m70980c(R.id.df3);
            C89219l.m154716b(tuxTextView16, "");
            tuxTextView16.setVisibility(8);
            MutualRelationView mutualRelationView = (MutualRelationView) m70980c(R.id.cp2);
            C89219l.m154716b(mutualRelationView, "");
            mutualRelationView.setVisibility(0);
            ((MutualRelationView) m70980c(R.id.cp2)).setTextColor(C0643b.m2378c(getContext(), R.color.c5));
            ((MutualRelationView) m70980c(R.id.cp2)).mo125023a(user.getMutualStruct(), C51487e.m95907d());
        } else {
            C74729a.m131190a((TuxTextView) m70980c(R.id.df3), user, null, null, 6);
            MutualRelationView mutualRelationView2 = (MutualRelationView) m70980c(R.id.cp2);
            C89219l.m154716b(mutualRelationView2, "");
            mutualRelationView2.setVisibility(8);
            TuxTextView tuxTextView17 = (TuxTextView) m70980c(R.id.df3);
            C89219l.m154716b(tuxTextView17, "");
            tuxTextView17.setVisibility(0);
        }
        ((NewFollowButton) m70980c(R.id.b6b)).setOnClickListener(new View$OnClickListenerC34750d(this));
        if (m70977a()) {
            NewFollowButton newFollowButton = (NewFollowButton) m70980c(R.id.b6b);
            C89219l.m154716b(newFollowButton, "");
            ViewGroup.LayoutParams layoutParams = newFollowButton.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float followBtnMarginRight = (float) getFollowBtnMarginRight();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a3 = C89241a.m154730a(TypedValue.applyDimension(1, followBtnMarginRight, system.getDisplayMetrics()));
            layoutParams2.setMarginEnd(a3);
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, a3, layoutParams2.bottomMargin);
            NewFollowButton newFollowButton2 = (NewFollowButton) m70980c(R.id.b6b);
            C89219l.m154716b(newFollowButton2, "");
            newFollowButton2.setLayoutParams(layoutParams2);
            TuxIconView tuxIconView = (TuxIconView) m70980c(R.id.sx);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(8);
        } else {
            NewFollowButton newFollowButton3 = (NewFollowButton) m70980c(R.id.b6b);
            C89219l.m154716b(newFollowButton3, "");
            ViewGroup.LayoutParams layoutParams3 = newFollowButton3.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            layoutParams4.setMarginEnd(C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system2.getDisplayMetrics())));
            int i2 = layoutParams4.leftMargin;
            int i3 = layoutParams4.topMargin;
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            layoutParams4.setMargins(i2, i3, C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system3.getDisplayMetrics())), layoutParams4.bottomMargin);
            NewFollowButton newFollowButton4 = (NewFollowButton) m70980c(R.id.b6b);
            C89219l.m154716b(newFollowButton4, "");
            newFollowButton4.setLayoutParams(layoutParams4);
            TuxIconView tuxIconView2 = (TuxIconView) m70980c(R.id.sx);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
            ((TuxIconView) m70980c(R.id.sx)).setOnClickListener(new View$OnClickListenerC34751e(this));
        }
        mo61442a(user.getFollowStatus(), user.getFollowerStatus(), user.getUid());
        TuxIconView tuxIconView3 = (TuxIconView) m70980c(R.id.fbd);
        C89219l.m154716b(tuxIconView3, "");
        tuxIconView3.setVisibility(8);
        C80581io.m139704a(getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), (TextView) m70980c(R.id.chu));
    }

    /* renamed from: a */
    private final void m70975a(int i, int i2) {
        if (C80580in.m139687c()) {
            NewFollowButton newFollowButton = (NewFollowButton) m70980c(R.id.b6b);
            C89219l.m154716b(newFollowButton, "");
            newFollowButton.setVisibility(8);
            return;
        }
        ((NewFollowButton) m70980c(R.id.b6b)).mo73175a(i, i2);
        m70979b(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C34746c(Context context, int i) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6999);
        this.f82069f = i;
        this.f82067d = i;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float itemVerticalPaddingByScenario = (float) getItemVerticalPaddingByScenario();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, itemVerticalPaddingByScenario, system.getDisplayMetrics()));
        C23163i.m43660a((View) this, Integer.valueOf(paddingLeft), Integer.valueOf(a), Integer.valueOf(paddingRight), Integer.valueOf(a), false, 16);
        LayoutInflater.from(context).inflate(R.layout.ap9, this);
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) m70980c(R.id.o3);
        C89219l.m154716b(smartAvatarImageView, "");
        ViewGroup.LayoutParams layoutParams = smartAvatarImageView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float avatarSize = (float) getAvatarSize();
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            layoutParams2.width = C89241a.m154730a(TypedValue.applyDimension(1, avatarSize, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            layoutParams2.height = C89241a.m154730a(TypedValue.applyDimension(1, avatarSize, system3.getDisplayMetrics()));
            float avatarMarginLeft = (float) getAvatarMarginLeft();
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            layoutParams2.setMarginStart(C89241a.m154730a(TypedValue.applyDimension(1, avatarMarginLeft, system4.getDisplayMetrics())));
            float avatarMarginLeft2 = (float) getAvatarMarginLeft();
            Resources system5 = Resources.getSystem();
            C89219l.m154709a((Object) system5, "");
            layoutParams2.setMargins(C89241a.m154730a(TypedValue.applyDimension(1, avatarMarginLeft2, system5.getDisplayMetrics())), layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) m70980c(R.id.o3);
            C89219l.m154716b(smartAvatarImageView2, "");
            smartAvatarImageView2.setLayoutParams(layoutParams2);
            setBackgroundResource(R.drawable.bbm);
            setWeightSum(1.0f);
            MethodCollector.m26664o(6999);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        MethodCollector.m26664o(6999);
        throw nullPointerException;
    }

    public /* synthetic */ C34746c(Context context, int i, byte b) {
        this(context, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r0 == null) goto L_0x0022;
     */
    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61442a(int r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            r4.m70974a(r5)
            r0 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r3 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r0)
            r0 = 2131364384(0x7f0a0a20, float:1.8348604E38)
            android.view.View r2 = r4.m70980c(r0)
            com.ss.android.ugc.aweme.follow.NewFollowButton r2 = (com.p2082ss.android.ugc.aweme.follow.NewFollowButton) r2
            if (r3 == 0) goto L_0x0022
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            java.lang.String r0 = r3.getEntranceButtonText(r1, r7)
            if (r0 != 0) goto L_0x002d
        L_0x0022:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131825818(0x7f11149a, float:1.9284503E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x002d:
            r2.setMessageText(r0)
            r4.m70975a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.widget.C34746c.mo61442a(int, int, java.lang.String):void");
    }
}

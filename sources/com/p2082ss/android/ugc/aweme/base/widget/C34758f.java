package com.p2082ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34688h;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34734r;
import com.p2082ss.android.ugc.aweme.common.C39080af;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66620d;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.base.widget.f */
public final class C34758f extends ConstraintLayout implements AbstractC66620d {

    /* renamed from: i */
    public static final C34761a f82093i = new C34761a((byte) 0);

    /* renamed from: g */
    String f82094g;

    /* renamed from: h */
    public View.OnClickListener f82095h;

    /* renamed from: j */
    private final AbstractC89244h f82096j;

    /* renamed from: k */
    private final AbstractC89244h f82097k;

    /* renamed from: l */
    private C56520b f82098l;

    /* renamed from: m */
    private SparseArray f82099m;

    static {
        Covode.recordClassIndex(41754);
    }

    /* renamed from: b */
    private View m70993b(int i) {
        if (this.f82099m == null) {
            this.f82099m = new SparseArray();
        }
        View view = (View) this.f82099m.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82099m.put(i, findViewById);
        return findViewById;
    }

    private final int getNormalTextColor() {
        return ((Number) this.f82096j.getValue()).intValue();
    }

    private final int getPressedTextColor() {
        return ((Number) this.f82097k.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.f$a */
    public static final class C34761a {
        static {
            Covode.recordClassIndex(41757);
        }

        private C34761a() {
        }

        public /* synthetic */ C34761a(byte b) {
            this();
        }
    }

    public final C56520b getUiStyleConfig() {
        return this.f82098l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.base.widget.f$c */
    public static final class RunnableC34763c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34758f f82103a;

        /* renamed from: b */
        final /* synthetic */ SpannableStringBuilder f82104b;

        static {
            Covode.recordClassIndex(41759);
        }

        RunnableC34763c(C34758f fVar, SpannableStringBuilder spannableStringBuilder) {
            this.f82103a = fVar;
            this.f82104b = spannableStringBuilder;
        }

        public final void run() {
            this.f82103a.mo61468a(this.f82104b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.f$d */
    static final class C34764d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f82105a;

        static {
            Covode.recordClassIndex(41760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34764d(Context context) {
            super(0);
            this.f82105a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0643b.m2378c(this.f82105a, R.color.bx));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.f$e */
    static final class C34765e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f82106a;

        static {
            Covode.recordClassIndex(41761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34765e(Context context) {
            super(0);
            this.f82106a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0643b.m2378c(this.f82106a, R.color.c4));
        }
    }

    public final void setUiStyleConfig(C56520b bVar) {
        this.f82098l = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.f$b */
    public static final class C34762b implements C39080af.AbstractC39081a {

        /* renamed from: a */
        final /* synthetic */ C34758f f82102a;

        static {
            Covode.recordClassIndex(41758);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34762b(C34758f fVar) {
            this.f82102a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.C39080af.AbstractC39081a
        /* renamed from: a */
        public final void mo61478a(View view, User user, int i) {
            C89219l.m154721d(view, "");
            if (i == 1) {
                View.OnClickListener onClickListener = this.f82102a.f82095h;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                C34758f fVar = this.f82102a;
                if (user == null) {
                    C89219l.m154715b();
                }
                SmartRouter.buildRoute(fVar.getContext(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("enter_from", fVar.f82094g).withParam("sec_user_id", user.getSecUid()).withParam("previous_page", "message").withParam("enter_method", "follow_button").withParam("extra_from_pre_page", "notification_page").withParam("extra_previous_page_position", "card_head").open();
            } else if (i == 0) {
                this.f82102a.performClick();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66620d
    public final void setEnterFrom(String str) {
        C89219l.m154721d(str, "");
        this.f82094g = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66620d
    public final void setOutClickListener(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        this.f82095h = onClickListener;
    }

    /* renamed from: a */
    private final C39080af m70992a(User user) {
        return new C39080af(user, new C34762b(this), getNormalTextColor(), getPressedTextColor());
    }

    /* renamed from: b */
    public final void mo61471b(View view) {
        View.OnClickListener onClickListener = this.f82095h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        SmartRouter.buildRoute(getContext(), "//friends/find").withParam("previous_page", "notification_page").open();
        C39162r.m79460a("enter_find_friends", C89041ag.m154412a(C89387v.m154943a("enter_from", "notification_page")));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C34758f(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6141);
        LayoutInflater.from(context).inflate(R.layout.ar4, this);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        setLayoutParams(new ConstraintLayout.C0547a(-1, C89241a.m154730a(TypedValue.applyDimension(1, 56.0f, system.getDisplayMetrics()))));
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.base.widget.C34758f.View$OnClickListenerC347591 */

            /* renamed from: a */
            final /* synthetic */ C34758f f82100a;

            static {
                Covode.recordClassIndex(41755);
            }

            {
                this.f82100a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200)) {
                    C34758f fVar = this.f82100a;
                    C89219l.m154716b(view, "");
                    fVar.mo61471b(view);
                }
            }
        });
        ((TuxTextView) m70993b(R.id.eu6)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.base.widget.C34758f.View$OnClickListenerC347602 */

            /* renamed from: a */
            final /* synthetic */ C34758f f82101a;

            static {
                Covode.recordClassIndex(41756);
            }

            {
                this.f82101a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200)) {
                    C34758f fVar = this.f82101a;
                    C89219l.m154716b(view, "");
                    fVar.mo61471b(view);
                }
            }
        });
        this.f82096j = C89250i.m154773a((AbstractC89171a) new C34764d(context));
        this.f82097k = C89250i.m154773a((AbstractC89171a) new C34765e(context));
        this.f82094g = "";
        MethodCollector.m26664o(6141);
    }

    /* renamed from: a */
    public final void mo61468a(SpannableStringBuilder spannableStringBuilder) {
        TuxTextView tuxTextView = (TuxTextView) m70993b(R.id.eu6);
        C89219l.m154716b(tuxTextView, "");
        if (tuxTextView.getWidth() == 0) {
            ((TuxTextView) m70993b(R.id.eu6)).post(new RunnableC34763c(this, spannableStringBuilder));
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            TuxTextView tuxTextView2 = (TuxTextView) m70993b(R.id.eu6);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setBreakStrategy(0);
        }
        TuxTextView tuxTextView3 = (TuxTextView) m70993b(R.id.eu6);
        C89219l.m154716b(tuxTextView3, "");
        TuxTextView tuxTextView4 = (TuxTextView) m70993b(R.id.eu6);
        C89219l.m154716b(tuxTextView4, "");
        TextPaint paint = tuxTextView4.getPaint();
        C89219l.m154716b(paint, "");
        TuxTextView tuxTextView5 = (TuxTextView) m70993b(R.id.eu6);
        C89219l.m154716b(tuxTextView5, "");
        int width = tuxTextView5.getWidth();
        TuxTextView tuxTextView6 = (TuxTextView) m70993b(R.id.eu6);
        C89219l.m154716b(tuxTextView6, "");
        tuxTextView3.setText(C34734r.m70964a(spannableStringBuilder, paint, width, tuxTextView6.getMaxLines(), 0, 0));
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66620d
    /* renamed from: a */
    public final void mo61469a(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        if (!C89219l.m154714a(this.f82098l, bVar)) {
            this.f82098l = bVar;
            if (bVar.f128860b != -1 && 1 != 0 && bVar.f128861c != -1 && bVar.f128862d != -1) {
                RemoteImageView remoteImageView = (RemoteImageView) m70993b(R.id.bsw);
                C89219l.m154716b(remoteImageView, "");
                if (remoteImageView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    RemoteImageView remoteImageView2 = (RemoteImageView) m70993b(R.id.bsu);
                    C89219l.m154716b(remoteImageView2, "");
                    RemoteImageView remoteImageView3 = (RemoteImageView) m70993b(R.id.bsu);
                    C89219l.m154716b(remoteImageView3, "");
                    ViewGroup.LayoutParams layoutParams = remoteImageView3.getLayoutParams();
                    layoutParams.width = bVar.f128861c;
                    layoutParams.height = bVar.f128861c;
                    remoteImageView2.setLayoutParams(layoutParams);
                    RemoteImageView remoteImageView4 = (RemoteImageView) m70993b(R.id.bsw);
                    C89219l.m154716b(remoteImageView4, "");
                    RemoteImageView remoteImageView5 = (RemoteImageView) m70993b(R.id.bsw);
                    C89219l.m154716b(remoteImageView5, "");
                    ViewGroup.LayoutParams layoutParams2 = remoteImageView5.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.width = bVar.f128862d;
                    marginLayoutParams.height = bVar.f128862d;
                    int i = bVar.f128860b;
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    marginLayoutParams.setMarginStart((i + C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()))) - bVar.f128862d);
                    remoteImageView4.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public /* synthetic */ C34758f(Context context, byte b) {
        this(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66620d
    /* renamed from: a */
    public final void mo61470a(List<? extends User> list, int i) {
        Integer num;
        CharSequence quantityText;
        if (list == null || list.size() < 2) {
            StringBuilder sb = new StringBuilder("bind but friends data invalid:");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            C39109f.m79404c("RecommendAggregate", sb.append(num).append(", ").append(i).toString());
            return;
        }
        User user = (User) list.get(0);
        User user2 = (User) list.get(1);
        C34577e.m70592a((RemoteImageView) m70993b(R.id.bsu), user.getAvatarThumb());
        C34577e.m70592a((RemoteImageView) m70993b(R.id.bsw), user2.getAvatarThumb());
        if (list.size() == 2) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            quantityText = context.getResources().getString(R.string.ckq);
        } else {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            quantityText = context2.getResources().getQuantityText(R.plurals.d8, i - 2);
        }
        SpannableStringBuilder a = m70991a(m70991a(new SpannableStringBuilder(quantityText), "%1$s", user), "%2$s", user2);
        int i2 = i - 2;
        int a2 = C89361p.m154888a((CharSequence) a, "%3$d", 0, false, 6);
        if (a2 >= 0) {
            a.replace(a2, a2 + 4, (CharSequence) String.valueOf(i2));
        }
        mo61468a(a);
        TuxTextView tuxTextView = (TuxTextView) m70993b(R.id.eu6);
        C89219l.m154716b(tuxTextView, "");
        if (C34688h.f81945a == null) {
            C34688h.f81945a = new C34688h();
        }
        tuxTextView.setMovementMethod(C34688h.f81945a);
    }

    /* renamed from: a */
    private final SpannableStringBuilder m70991a(SpannableStringBuilder spannableStringBuilder, String str, User user) {
        int a;
        String nickname = user.getNickname();
        if (!(nickname == null || nickname.length() == 0 || nickname == null || (a = C89361p.m154888a((CharSequence) spannableStringBuilder, str, 0, false, 6)) < 0)) {
            spannableStringBuilder.replace(a, str.length() + a, (CharSequence) nickname);
            spannableStringBuilder.setSpan(m70992a(user), a, nickname.length() + a, 17);
        }
        return spannableStringBuilder;
    }
}

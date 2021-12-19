package com.p2082ss.android.ugc.aweme.comment.widget;

import android.content.Context;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36305b;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37593d;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46959fx;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49495aa;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50109bf;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74147f;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentDescView */
public final class CommentDescView extends LinearLayout {

    /* renamed from: y */
    public static final C37268a f87848y = new C37268a((byte) 0);

    /* renamed from: A */
    private final boolean f87849A = C33403c.f79371a;

    /* renamed from: B */
    private boolean f87850B;

    /* renamed from: C */
    private boolean f87851C;

    /* renamed from: D */
    private Integer f87852D;

    /* renamed from: E */
    private boolean f87853E;

    /* renamed from: F */
    private AbstractC89171a<C89391z> f87854F;

    /* renamed from: a */
    public final MentionTextView f87855a;

    /* renamed from: b */
    public final TuxTextView f87856b;

    /* renamed from: c */
    public final FrameLayout f87857c;

    /* renamed from: d */
    public String f87858d = "";

    /* renamed from: e */
    public int f87859e;

    /* renamed from: f */
    public SpannableStringBuilder f87860f;

    /* renamed from: g */
    public int f87861g;

    /* renamed from: h */
    public SpannableStringBuilder f87862h;

    /* renamed from: i */
    public int f87863i;

    /* renamed from: j */
    int f87864j;

    /* renamed from: k */
    boolean f87865k;

    /* renamed from: l */
    public Aweme f87866l;

    /* renamed from: m */
    public C36305b f87867m;

    /* renamed from: n */
    public final int f87868n = AVExternalServiceImpl.m113114a().publishService().getAddVideosExperiConsuSideCode();

    /* renamed from: o */
    public Integer f87869o;

    /* renamed from: p */
    int f87870p = 4;

    /* renamed from: q */
    boolean f87871q = true;

    /* renamed from: r */
    public final boolean f87872r = C46959fx.m90245a();

    /* renamed from: s */
    public SpannableStringBuilder f87873s;

    /* renamed from: t */
    public List<? extends TextExtraStruct> f87874t;

    /* renamed from: u */
    public String[] f87875u;

    /* renamed from: v */
    public int f87876v;

    /* renamed from: w */
    public int f87877w;

    /* renamed from: x */
    public boolean f87878x;

    /* renamed from: z */
    private String f87879z = "";

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentDescView$f */
    static final class C37275f implements AbstractC38029b {

        /* renamed from: a */
        public static final C37275f f87892a = new C37275f();

        static {
            Covode.recordClassIndex(44641);
        }

        C37275f() {
        }
    }

    static {
        Covode.recordClassIndex(44632);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentDescView$a */
    public static final class C37268a {
        static {
            Covode.recordClassIndex(44634);
        }

        private C37268a() {
        }

        public /* synthetic */ C37268a(byte b) {
            this();
        }
    }

    public final Integer getExtraBackgroundSpanColor() {
        return this.f87852D;
    }

    public final boolean getMEnableToggle() {
        return this.f87871q;
    }

    public final int getMMaxLinesWhenFold() {
        return this.f87870p;
    }

    public final boolean getMUnableClickSpan() {
        return this.f87853E;
    }

    public final AbstractC89171a<C89391z> getSpanClickInterceptor() {
        return this.f87854F;
    }

    public final Integer getTextColor() {
        return this.f87869o;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentDescView$d */
    public static final class C37273d implements MentionTextView.AbstractC81409f {

        /* renamed from: a */
        final /* synthetic */ CommentDescView f87890a;

        static {
            Covode.recordClassIndex(44639);
        }

        public C37273d(CommentDescView commentDescView) {
            this.f87890a = commentDescView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:124:0x0323  */
        @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81409f
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo63408a(com.p2082ss.android.ugc.aweme.model.TextExtraStruct r22) {
            /*
            // Method dump skipped, instructions count: 2235
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.widget.CommentDescView.C37273d.mo63408a(com.ss.android.ugc.aweme.model.TextExtraStruct):void");
        }
    }

    /* renamed from: b */
    private static boolean m75262b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m75261a() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean b = m75262b();
        C58029j.f132256h = b;
        return b;
    }

    public final CharSequence getEndTextWhenTruncated() {
        SpannableStringBuilder append = getEndOmitTextAndTime().append("   ").append((CharSequence) getContext().getString(R.string.bua));
        C89219l.m154716b(append, "");
        return append;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentDescView$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC37270c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CommentDescView f87885a;

        /* renamed from: b */
        final /* synthetic */ Aweme f87886b;

        static {
            Covode.recordClassIndex(44636);
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentDescView$c$a */
        static final class RunnableC37271a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC37270c f87887a;

            /* renamed from: b */
            final /* synthetic */ int f87888b;

            static {
                Covode.recordClassIndex(44637);
            }

            RunnableC37271a(ViewTreeObserver$OnGlobalLayoutListenerC37270c cVar, int i) {
                this.f87887a = cVar;
                this.f87888b = i;
            }

            public final void run() {
                this.f87887a.f87885a.f87863i = this.f87887a.f87885a.f87855a.getHeight();
                this.f87887a.f87885a.f87861g = (this.f87887a.f87885a.f87863i * (this.f87888b + 10)) / this.f87887a.f87885a.f87870p;
                this.f87887a.f87885a.mo64823a(true);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentDescView$c$b */
        static final class RunnableC37272b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC37270c f87889a;

            static {
                Covode.recordClassIndex(44638);
            }

            RunnableC37272b(ViewTreeObserver$OnGlobalLayoutListenerC37270c cVar) {
                this.f87889a = cVar;
            }

            public final void run() {
                if (this.f87889a.f87885a.f87855a.getLineCount() != 0) {
                    this.f87889a.f87885a.f87855a.setLines(this.f87889a.f87885a.f87855a.getLineCount());
                    this.f87889a.f87885a.mo64823a(false);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:77:0x02bd, code lost:
            if (r10 == null) goto L_0x026a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x01d6  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x020e  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0233  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0246  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onGlobalLayout() {
            /*
            // Method dump skipped, instructions count: 751
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.widget.CommentDescView.ViewTreeObserver$OnGlobalLayoutListenerC37270c.onGlobalLayout():void");
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC37270c(CommentDescView commentDescView, Aweme aweme) {
            this.f87885a = commentDescView;
            this.f87886b = aweme;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentDescView$e */
    public static final class RunnableC37274e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommentDescView f87891a;

        static {
            Covode.recordClassIndex(44640);
        }

        RunnableC37274e(CommentDescView commentDescView) {
            this.f87891a = commentDescView;
        }

        public final void run() {
            int lineCount;
            MentionTextView mentionTextView = this.f87891a.f87855a;
            if (this.f87891a.f87878x) {
                lineCount = Math.min(50, this.f87891a.f87855a.getLineCount());
            } else {
                lineCount = this.f87891a.f87855a.getLineCount();
            }
            mentionTextView.setLines(lineCount);
        }
    }

    public final SpannableStringBuilder getEndOmitTextAndTime() {
        Aweme aweme = this.f87866l;
        if (aweme == null) {
            C89219l.m154710a("mAweme");
        }
        String a = m75260a(aweme.getCreateTime() * 1000);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "...").append((CharSequence) a).setSpan(new ForegroundColorSpan(C0643b.m2378c(getContext(), R.color.c5)), 3, a.length() + 3, 33);
        return spannableStringBuilder;
    }

    public final CharSequence getPostTime() {
        Aweme aweme = this.f87866l;
        if (aweme == null) {
            C89219l.m154710a("mAweme");
        }
        String a = m75260a(aweme.getCreateTime() * 1000);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) " ".concat(String.valueOf(a))).setSpan(new ForegroundColorSpan(C0643b.m2378c(getContext(), R.color.c5)), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void setExtraBackgroundSpanColor(Integer num) {
        this.f87852D = num;
    }

    public final void setMEnableToggle(boolean z) {
        this.f87871q = z;
    }

    public final void setMMaxLinesWhenFold(int i) {
        this.f87870p = i;
    }

    public final void setMUnableClickSpan(boolean z) {
        this.f87853E = z;
    }

    public final void setSpanClickInterceptor(AbstractC89171a<C89391z> aVar) {
        this.f87854F = aVar;
    }

    public final void setTextColor(Integer num) {
        this.f87869o = num;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentDescView$b */
    public static final class C37269b extends AbstractC50109bf {

        /* renamed from: c */
        private final WeakReference<CommentDescView> f87881c;

        /* renamed from: d */
        private final SpannableStringBuilder f87882d;

        /* renamed from: e */
        private final boolean f87883e;

        /* renamed from: f */
        private final boolean f87884f;

        static {
            Covode.recordClassIndex(44635);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            CommentDescView commentDescView = this.f87881c.get();
            if (commentDescView == null) {
                return;
            }
            if (this.f87884f) {
                Aweme aweme = commentDescView.f87866l;
                if (aweme == null) {
                    C89219l.m154710a("mAweme");
                }
                boolean E = C37699a.m76202E(aweme);
                Aweme aweme2 = commentDescView.f87866l;
                if (aweme2 == null) {
                    C89219l.m154710a("mAweme");
                }
                if (aweme2.isAd() || !E) {
                    AbstractC37873az c = C38000g.m77052c();
                    Context context = commentDescView.getContext();
                    Aweme aweme3 = commentDescView.f87866l;
                    if (aweme3 == null) {
                        C89219l.m154710a("mAweme");
                    }
                    c.mo65918a(context, aweme3, 1, C37275f.f87892a);
                    return;
                }
                new C23144b(commentDescView.f87855a).mo37640e(R.string.o6).mo37637b();
                return;
            }
            commentDescView.mo64822a(this.f87882d, this.f87883e);
        }

        public C37269b(CommentDescView commentDescView, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2) {
            C89219l.m154721d(commentDescView, "");
            C89219l.m154721d(spannableStringBuilder, "");
            this.f87882d = spannableStringBuilder;
            this.f87883e = z;
            this.f87884f = z2;
            this.f87881c = new WeakReference<>(commentDescView);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Aweme m75259a(CommentDescView commentDescView) {
        Aweme aweme = commentDescView.f87866l;
        if (aweme == null) {
            C89219l.m154710a("mAweme");
        }
        return aweme;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentDescView$g */
    static final class C37276g implements MentionTextView.AbstractC81407d {

        /* renamed from: a */
        final /* synthetic */ CommentDescView f87893a;

        static {
            Covode.recordClassIndex(44642);
        }

        C37276g(CommentDescView commentDescView) {
            this.f87893a = commentDescView;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81407d
        /* renamed from: a */
        public final boolean mo59077a(TextExtraStruct textExtraStruct) {
            C89219l.m154721d(textExtraStruct, "");
            if (this.f87893a.f87868n == 0 && textExtraStruct.getType() == 5) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final String m75260a(long j) {
        String d;
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        if (instance.getTimeInMillis() - j <= 0) {
            Calendar instance2 = Calendar.getInstance();
            C89219l.m154716b(instance2, "");
            j = instance2.getTimeInMillis() - 1;
        }
        if (C16048b.m29633a().mo25421a(true, "standardize_timestamp", false)) {
            C80187aa.C80188a aVar = C80187aa.f179656s;
            d = C80187aa.C80188a.m139006a(j);
        } else {
            d = C80566ib.m139654d(getContext(), j);
        }
        C17191a.C17192a aVar2 = new C17191a.C17192a();
        C89219l.m154716b(d, "");
        String aVar3 = aVar2.mo27177a(C89361p.m154869a(d, " ", " ", false)).f40973a.toString();
        C89219l.m154716b(aVar3, "");
        return aVar3;
    }

    public final void setDescSafely(CharSequence charSequence) {
        try {
            if (C49495aa.m92734a()) {
                C51423a.m95791b(4, "CommentDescView", "VideoDescView_setDescSafely desc:" + charSequence);
            }
            if (this.f87878x) {
                Aweme aweme = this.f87866l;
                if (aweme == null) {
                    C89219l.m154710a("mAweme");
                }
                String descLanguage = aweme.getDescLanguage();
                if (!this.f87872r || this.f87873s == null || !C89361p.m154929e((CharSequence) charSequence.toString(), (CharSequence) "\n")) {
                    this.f87855a.mo124997a(charSequence, descLanguage);
                } else {
                    this.f87855a.mo124997a(this.f87873s, descLanguage);
                }
            } else {
                Aweme aweme2 = this.f87866l;
                if (aweme2 == null) {
                    C89219l.m154710a("mAweme");
                }
                if (aweme2.isAd()) {
                    this.f87855a.setText(charSequence);
                    return;
                }
                Aweme aweme3 = this.f87866l;
                if (aweme3 == null) {
                    C89219l.m154710a("mAweme");
                }
                this.f87855a.mo124997a(charSequence, aweme3.getDescLanguage());
            }
        } catch (Exception e) {
            C51423a.m95786a(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r0v49. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct> */
    public final void setTextExtraList(Aweme aweme) {
        int c;
        List list;
        if (aweme != null) {
            List textExtra = aweme.getTextExtra();
            if (this.f87872r && (list = this.f87874t) != null) {
                textExtra = list;
            }
            if (!aweme.isScheduleVideo()) {
                this.f87855a.mo124999a(textExtra, new C74147f(), new C37276g(this));
            }
            CommerceChallengeServiceImpl.m75741e().mo65385a(this.f87855a, aweme, this.f87858d);
            if (textExtra != null && !TextUtils.isEmpty(aweme.getDesc())) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    C89219l.m154716b(textExtraStruct, "");
                    if ((mo64824a(textExtraStruct) && textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype() || 5 == textExtraStruct.getSubtype() || 7 == textExtraStruct.getSubtype()) && aweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) || (mo64824a(textExtraStruct) && this.f87868n == 1 && textExtraStruct.getType() == 5 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()))) {
                        Integer num = this.f87852D;
                        if (num != null) {
                            c = num.intValue();
                        } else {
                            c = C0643b.m2378c(getContext(), R.color.g);
                        }
                        Context context = getContext();
                        C89219l.m154716b(context, "");
                        C37593d dVar = new C37593d(context, (float) C89241a.m154730a(((float) C13628n.m24504a(getContext())) - (C13628n.m24520b(getContext(), 100.0f) + getContext().getResources().getDimension(R.dimen.g5))), c, C0643b.m2378c(getContext(), R.color.bx), textExtraStruct, true);
                        dVar.f88862b = C13628n.m24520b(getContext(), 12.0f);
                        dVar.f88863c = C13628n.m24520b(getContext(), 2.0f);
                        dVar.f88861a = C13628n.m24520b(getContext(), 13.0f);
                        this.f87855a.mo124996a(textExtraStruct.getStart(), textExtraStruct.getEnd(), dVar);
                        if (4 == textExtraStruct.getSubtype()) {
                            C33744d a = new C33744d().mo59983a("enter_from", this.f87858d);
                            Aweme aweme2 = this.f87866l;
                            if (aweme2 == null) {
                                C89219l.m154710a("mAweme");
                            }
                            C33744d a2 = a.mo59983a("group_id", aweme2.getAid());
                            Aweme aweme3 = this.f87866l;
                            if (aweme3 == null) {
                                C89219l.m154710a("mAweme");
                            }
                            C33744d a3 = a2.mo59983a("author_id", aweme3.getAuthorUid());
                            Aweme aweme4 = this.f87866l;
                            if (aweme4 == null) {
                                C89219l.m154710a("mAweme");
                            }
                            C39162r.m79460a("duet_with_show", a3.mo59983a("music_id", C59208ac.m108770d(aweme4)).f79943a);
                        }
                    }
                }
            }
            this.f87855a.setAdHashTag(aweme);
        }
    }

    /* renamed from: a */
    public final void mo64823a(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        Context context = getContext();
        if (context != null) {
            Aweme aweme = this.f87866l;
            if (aweme == null) {
                C89219l.m154710a("mAweme");
            }
            if (aweme.getDesc() != null) {
                boolean a = C80471gb.m139483a(context);
                boolean isRtl = BidiFormatter.getInstance().isRtl(aweme.getDesc());
                int i2 = 1;
                if (a != isRtl) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                try {
                    ViewGroup.LayoutParams layoutParams = this.f87855a.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        if (z) {
                            if (!this.f87851C) {
                                if (z2) {
                                    if (this.f87850B) {
                                        return;
                                    }
                                } else if (!this.f87850B) {
                                    return;
                                }
                            }
                            this.f87851C = false;
                            if (!this.f87850B) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.f87850B = z3;
                            MentionTextView mentionTextView = this.f87855a;
                            if (!isRtl) {
                                i2 = 0;
                            }
                            C0792v.m2759b((View) mentionTextView, i2);
                            ViewGroup.LayoutParams layoutParams3 = this.f87856b.getLayoutParams();
                            if (layoutParams3 != null) {
                                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                if (isRtl) {
                                    i = 83;
                                } else {
                                    i = 85;
                                }
                                layoutParams4.gravity = i;
                                this.f87856b.setLayoutParams(layoutParams4);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                        } else if (C0792v.m2768e(this.f87855a) != a) {
                            this.f87851C = true;
                            MentionTextView mentionTextView2 = this.f87855a;
                            if (!a) {
                                i2 = 0;
                            }
                            C0792v.m2759b((View) mentionTextView2, i2);
                        } else {
                            return;
                        }
                        this.f87855a.setLayoutParams(layoutParams2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo64824a(TextExtraStruct textExtraStruct) {
        Aweme aweme = this.f87866l;
        if (aweme == null) {
            C89219l.m154710a("mAweme");
        }
        if (aweme.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0) {
            return false;
        }
        int end = textExtraStruct.getEnd();
        Aweme aweme2 = this.f87866l;
        if (aweme2 == null) {
            C89219l.m154710a("mAweme");
        }
        if (end > aweme2.getDesc().length()) {
            return false;
        }
        int start = textExtraStruct.getStart();
        Aweme aweme3 = this.f87866l;
        if (aweme3 == null) {
            C89219l.m154710a("mAweme");
        }
        if (start >= aweme3.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    public CommentDescView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(9405);
        View.inflate(getContext(), R.layout.j8, this);
        View findViewById = findViewById(R.id.ajd);
        C89219l.m154716b(findViewById, "");
        this.f87855a = (MentionTextView) findViewById;
        View findViewById2 = findViewById(R.id.f68);
        C89219l.m154716b(findViewById2, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.f87856b = tuxTextView;
        View findViewById3 = findViewById(R.id.ajk);
        C89219l.m154716b(findViewById3, "");
        this.f87857c = (FrameLayout) findViewById3;
        tuxTextView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.comment.widget.CommentDescView.View$OnClickListenerC372671 */

            /* renamed from: a */
            final /* synthetic */ CommentDescView f87880a;

            static {
                Covode.recordClassIndex(44633);
            }

            {
                this.f87880a = r1;
            }

            public final void onClick(View view) {
                CharSequence charSequence;
                ClickAgent.onClick(view);
                if (TextUtils.isEmpty(this.f87880a.f87860f) || TextUtils.isEmpty(this.f87880a.f87862h)) {
                    CommentDescView commentDescView = this.f87880a;
                    Aweme a = CommentDescView.m75259a(this.f87880a);
                    CharSequence charSequence2 = null;
                    if (a != null) {
                        charSequence = a.getProcessedDesc();
                    } else {
                        charSequence = null;
                    }
                    commentDescView.f87860f = new SpannableStringBuilder(charSequence);
                    CommentDescView commentDescView2 = this.f87880a;
                    Aweme a2 = CommentDescView.m75259a(this.f87880a);
                    if (a2 != null) {
                        charSequence2 = a2.getEllipsizeDesc();
                    }
                    commentDescView2.f87862h = new SpannableStringBuilder(charSequence2);
                }
                boolean a3 = C89219l.m154714a((Object) this.f87880a.f87856b.getText().toString(), (Object) this.f87880a.getContext().getString(R.string.bua));
                if (a3) {
                    SpannableStringBuilder spannableStringBuilder = this.f87880a.f87860f;
                    if (spannableStringBuilder != null) {
                        this.f87880a.mo64822a(spannableStringBuilder, a3);
                        return;
                    }
                    return;
                }
                SpannableStringBuilder spannableStringBuilder2 = this.f87880a.f87862h;
                if (spannableStringBuilder2 != null) {
                    this.f87880a.mo64822a(spannableStringBuilder2, a3);
                }
            }
        });
        this.f87878x = true;
        MethodCollector.m26664o(9405);
    }

    /* renamed from: a */
    public final void mo64822a(SpannableStringBuilder spannableStringBuilder, boolean z) {
        String str;
        int i;
        if (z) {
            str = "spread";
        } else {
            str = "fold";
        }
        C33744d a = new C33744d().mo59983a("enter_from", this.f87858d);
        Aweme aweme = this.f87866l;
        if (aweme == null) {
            C89219l.m154710a("mAweme");
        }
        C33744d a2 = a.mo59983a("group_id", aweme.getAid());
        Aweme aweme2 = this.f87866l;
        if (aweme2 == null) {
            C89219l.m154710a("mAweme");
        }
        C39162r.m79460a("video_detail", a2.mo59983a("author_id", aweme2.getAuthorUid()).mo59983a("action_type", str).f79943a);
        if (z) {
            i = 50;
        } else {
            if (this.f87866l == null) {
                C89219l.m154710a("mAweme");
            }
            i = this.f87870p;
        }
        setDescSafely(spannableStringBuilder);
        if (this.f87864j == 0) {
            this.f87864j = this.f87856b.getHeight();
        }
        int i2 = this.f87857c.getLayoutParams().height;
        if (z) {
            this.f87855a.post(new RunnableC37274e(this));
            this.f87856b.setText(R.string.bu_);
            return;
        }
        if (this.f87878x) {
            this.f87855a.scrollTo(0, 0);
        }
        CharSequence text = this.f87855a.getText();
        C89219l.m154716b(text, "");
        if (text.length() > 0) {
            MentionTextView mentionTextView = this.f87855a;
            if (this.f87866l == null) {
                C89219l.m154710a("mAweme");
            }
            mentionTextView.setLines(this.f87870p);
        } else {
            this.f87855a.setMaxLines(i);
        }
        this.f87856b.setText(R.string.bua);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64821a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z, boolean z2) {
        C37269b bVar = new C37269b(this, spannableStringBuilder2, z, z2);
        bVar.f115672a = 0;
        spannableStringBuilder.setSpan(bVar, 0, spannableStringBuilder.length(), 17);
    }

    /* renamed from: a */
    public final int mo64820a(CharSequence charSequence, String str, int i, int i2, int i3) {
        float f;
        try {
            float measureText = this.f87856b.getPaint().measureText(str);
            int width = this.f87855a.getWidth();
            float measureText2 = this.f87855a.getPaint().measureText(charSequence, i2, i3);
            SpannableStringBuilder endOmitTextAndTime = getEndOmitTextAndTime();
            if (this.f87849A) {
                f = this.f87855a.getPaint().measureText(endOmitTextAndTime, 0, str.length());
            } else {
                f = 0.0f;
            }
            float f2 = ((measureText2 + measureText) + f) - ((float) width);
            if (f2 <= 0.0f) {
                return 0;
            }
            int i4 = 1;
            int i5 = (i3 - i2) + 1;
            if (i5 > 0) {
                while (this.f87855a.getPaint().measureText(charSequence, i3 - i4, i3) < f2) {
                    if (i4 != i5) {
                        i4++;
                    }
                }
                return i4;
            }
            return i + 1;
        } catch (Exception unused) {
            return i;
        }
    }
}

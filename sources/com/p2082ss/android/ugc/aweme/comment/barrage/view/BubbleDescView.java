package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36296a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37593d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.BubbleDescView */
public final class BubbleDescView extends MentionTextView {

    /* renamed from: a */
    public Aweme f85978a;

    /* renamed from: b */
    public C36296a f85979b;

    /* renamed from: c */
    public Integer f85980c;

    /* renamed from: e */
    int f85981e = 2;

    /* renamed from: f */
    public final int f85982f = AVExternalServiceImpl.m113114a().publishService().getAddVideosExperiConsuSideCode();

    /* renamed from: j */
    private Integer f85983j;

    /* renamed from: k */
    private AbstractC89171a<C89391z> f85984k;

    static {
        Covode.recordClassIndex(43645);
    }

    public final Integer getExtraBackgroundSpanColor() {
        return this.f85983j;
    }

    public final int getMMaxLinesWhenFold() {
        return this.f85981e;
    }

    public final AbstractC89171a<C89391z> getSpanClickInterceptor() {
        return this.f85984k;
    }

    public final Integer getTextColor() {
        return this.f85980c;
    }

    public final SpannableStringBuilder getEndText() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "...");
        Aweme aweme = this.f85978a;
        if (aweme != null) {
            spannableStringBuilder.append((CharSequence) mo63612a(aweme));
        }
        return spannableStringBuilder;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.BubbleDescView$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC36360b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ BubbleDescView f85986a;

        /* renamed from: b */
        final /* synthetic */ MentionTextView f85987b;

        /* renamed from: c */
        final /* synthetic */ Aweme f85988c;

        static {
            Covode.recordClassIndex(43647);
        }

        public final void onGlobalLayout() {
            int lineCount;
            int i;
            int i2;
            CharSequence subSequence;
            ViewTreeObserver viewTreeObserver = this.f85987b.getViewTreeObserver();
            if (this.f85987b.getWidth() != 0) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                if (this.f85986a.getContext() != null) {
                    int i3 = this.f85986a.f85981e;
                    SpannableStringBuilder endText = this.f85986a.getEndText();
                    int length = endText.length();
                    int i4 = length + 1;
                    if (this.f85987b.getLineCount() == 0) {
                        lineCount = i3;
                    } else {
                        lineCount = this.f85987b.getLineCount();
                    }
                    if (lineCount > i3) {
                        if (this.f85987b.getLayout() != null) {
                            int i5 = i3 - 1;
                            i2 = this.f85987b.getLayout().getLineStart(i5);
                            i = this.f85987b.getLayout().getLineEnd(i5);
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                        String obj = this.f85987b.getText().toString();
                        String spannableStringBuilder = this.f85986a.mo63612a(this.f85988c).toString();
                        C89219l.m154716b(spannableStringBuilder, "");
                        SpannableString spannableString = new SpannableString(C89361p.m154868a(obj, spannableStringBuilder, ""));
                        if (i == 0) {
                            i = spannableString.length() / 2;
                        }
                        if (i >= i4) {
                            int i6 = i - i4;
                            if (AVExternalServiceImpl.m113114a().publishService().containEmoji(spannableString.subSequence(i6, i6 + 2).toString())) {
                                subSequence = spannableString.subSequence(0, Math.max(0, i6));
                                C89219l.m154716b(subSequence, "");
                                if (subSequence.length() > 0 && subSequence.charAt(subSequence.length() - 1) == '\n') {
                                    subSequence = subSequence.subSequence(0, subSequence.length() - 1);
                                }
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(subSequence);
                                spannableStringBuilder2.append((CharSequence) this.f85986a.getEndText());
                                this.f85987b.setLines(this.f85986a.f85981e);
                                this.f85986a.setDescSafely(spannableStringBuilder2);
                                return;
                            }
                        }
                        BubbleDescView bubbleDescView = this.f85986a;
                        String spannableStringBuilder3 = endText.toString();
                        C89219l.m154716b(spannableStringBuilder3, "");
                        subSequence = spannableString.subSequence(0, Math.max(0, i - bubbleDescView.mo63611a(spannableString, spannableStringBuilder3, length, i2, i)));
                        C89219l.m154716b(subSequence, "");
                        subSequence = subSequence.subSequence(0, subSequence.length() - 1);
                        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder22.append((CharSequence) this.f85986a.getEndText());
                        this.f85987b.setLines(this.f85986a.f85981e);
                        this.f85986a.setDescSafely(spannableStringBuilder22);
                        return;
                    }
                    MentionTextView mentionTextView = this.f85987b;
                    mentionTextView.setLines(mentionTextView.getLineCount());
                }
            }
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC36360b(BubbleDescView bubbleDescView, MentionTextView mentionTextView, Aweme aweme) {
            this.f85986a = bubbleDescView;
            this.f85987b = mentionTextView;
            this.f85988c = aweme;
        }
    }

    public final void setExtraBackgroundSpanColor(Integer num) {
        this.f85983j = num;
    }

    public final void setMMaxLinesWhenFold(int i) {
        this.f85981e = i;
    }

    public final void setSpanClickInterceptor(AbstractC89171a<C89391z> aVar) {
        this.f85984k = aVar;
    }

    public final void setTextColor(Integer num) {
        this.f85980c = num;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.BubbleDescView$a */
    public final class C36359a implements MentionTextView.AbstractC81407d {
        static {
            Covode.recordClassIndex(43646);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C36359a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81407d
        /* renamed from: a */
        public final boolean mo59077a(TextExtraStruct textExtraStruct) {
            if (textExtraStruct == null) {
                return false;
            }
            if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1 || textExtraStruct.getType() == 3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.BubbleDescView$c */
    public static final class C36361c implements MentionTextView.AbstractC81409f {

        /* renamed from: a */
        final /* synthetic */ BubbleDescView f85989a;

        static {
            Covode.recordClassIndex(43648);
        }

        public C36361c(BubbleDescView bubbleDescView) {
            this.f85989a = bubbleDescView;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81409f
        /* renamed from: a */
        public final void mo63408a(TextExtraStruct textExtraStruct) {
            AbstractC89171a<C89391z> spanClickInterceptor;
            if (this.f85989a.getSpanClickInterceptor() != null && (spanClickInterceptor = this.f85989a.getSpanClickInterceptor()) != null) {
                spanClickInterceptor.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.BubbleDescView$d */
    static final class C36362d implements MentionTextView.AbstractC81407d {

        /* renamed from: a */
        final /* synthetic */ BubbleDescView f85990a;

        static {
            Covode.recordClassIndex(43649);
        }

        C36362d(BubbleDescView bubbleDescView) {
            this.f85990a = bubbleDescView;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81407d
        /* renamed from: a */
        public final boolean mo59077a(TextExtraStruct textExtraStruct) {
            C89219l.m154721d(textExtraStruct, "");
            if (this.f85990a.f85982f == 0 && textExtraStruct.getType() == 5) {
                return true;
            }
            return false;
        }
    }

    public final void setDescSafely(CharSequence charSequence) {
        try {
            Aweme aweme = this.f85978a;
            if (aweme == null) {
                C89219l.m154715b();
            }
            mo124997a(charSequence, aweme.getDescLanguage());
        } catch (Exception e) {
            C51423a.m95788a("", e);
        }
    }

    /* renamed from: a */
    private final boolean m74065a(TextExtraStruct textExtraStruct) {
        Aweme aweme = this.f85978a;
        if (aweme == null || aweme.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0) {
            return false;
        }
        int end = textExtraStruct.getEnd();
        Aweme aweme2 = this.f85978a;
        if (aweme2 == null) {
            C89219l.m154715b();
        }
        if (end > aweme2.getDesc().length()) {
            return false;
        }
        int start = textExtraStruct.getStart();
        Aweme aweme3 = this.f85978a;
        if (aweme3 == null) {
            C89219l.m154715b();
        }
        if (start >= aweme3.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final SpannableStringBuilder mo63612a(Aweme aweme) {
        String str;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        boolean isSecret = curUser.isSecret();
        if (!C50545m.m94762a(aweme)) {
            return new SpannableStringBuilder();
        }
        AwemeStatus status = aweme.getStatus();
        C89219l.m154716b(status, "");
        if (status.getPrivateStatus() != 0) {
            AwemeStatus status2 = aweme.getStatus();
            C89219l.m154716b(status2, "");
            int privateStatus = status2.getPrivateStatus();
            if (privateStatus == 1) {
                Context context = getContext();
                C89219l.m154716b(context, "");
                str = context.getResources().getString(R.string.et7);
            } else if (privateStatus == 2) {
                Context context2 = getContext();
                C89219l.m154716b(context2, "");
                str = context2.getResources().getString(R.string.g_q);
            } else if (isSecret) {
                Context context3 = getContext();
                C89219l.m154716b(context3, "");
                str = context3.getResources().getString(R.string.g_p);
            } else {
                str = "";
            }
            C89219l.m154716b(str, "");
        } else {
            if (isSecret) {
                Context context4 = getContext();
                C89219l.m154716b(context4, "");
                str = context4.getResources().getString(R.string.g_p);
            } else {
                str = "";
            }
            C89219l.m154716b(str, "");
        }
        if (str.length() == 0) {
            return new SpannableStringBuilder();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (" · " + C89361p.m154868a(str, " ", " "))).setSpan(new ForegroundColorSpan(C0643b.m2378c(getContext(), R.color.a9)), 2, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new C23126b(52), 2, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void setTextExtraList(Aweme aweme) {
        String str;
        TextExtraStruct next;
        int c;
        String str2;
        String str3;
        if (aweme != null) {
            if (!aweme.isScheduleVideo()) {
                mo124999a(aweme.getTextExtra(), new C36359a(), new C36362d(this));
            }
            ICommerceChallengeService e = CommerceChallengeServiceImpl.m75741e();
            C36296a aVar = this.f85979b;
            String str4 = null;
            if (aVar != null) {
                str = aVar.f85809b;
            } else {
                str = null;
            }
            e.mo65385a(this, aweme, str);
            if (aweme.getTextExtra() != null && !TextUtils.isEmpty(aweme.getDesc())) {
                Iterator<TextExtraStruct> it = aweme.getTextExtra().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    C89219l.m154716b(next, "");
                    if (!(m74065a(next) && next.getType() == 0 && ((!TextUtils.isEmpty(next.getAwemeId()) || 2 == next.getSubtype() || 7 == next.getSubtype() || 5 == next.getSubtype()) && aweme.getDesc().charAt(next.getStart()) == '@')) && (!m74065a(next) || this.f85982f != 1 || next.getType() != 5 || TextUtils.isEmpty(next.getAwemeId()))) {
                    }
                }
                Integer num = this.f85983j;
                if (num != null) {
                    c = num.intValue();
                } else {
                    c = C0643b.m2378c(getContext(), R.color.ur);
                }
                Context context = getContext();
                C89219l.m154716b(context, "");
                C37593d dVar = new C37593d(context, (float) Math.round(((float) C13628n.m24504a(getContext())) - (C13628n.m24520b(getContext(), 100.0f) + getContext().getResources().getDimension(R.dimen.g5))), c, C0643b.m2378c(getContext(), R.color.a9), next);
                dVar.f88862b = C13628n.m24520b(getContext(), 12.0f);
                dVar.f88863c = C13628n.m24520b(getContext(), 2.0f);
                dVar.f88861a = C13628n.m24520b(getContext(), 14.0f);
                mo124996a(next.getStart(), next.getEnd(), dVar);
                if (4 == next.getSubtype()) {
                    C33744d dVar2 = new C33744d();
                    C36296a aVar2 = this.f85979b;
                    if (aVar2 != null) {
                        str2 = aVar2.f85809b;
                    } else {
                        str2 = null;
                    }
                    C33744d a = dVar2.mo59983a("enter_from", str2);
                    Aweme aweme2 = this.f85978a;
                    if (aweme2 != null) {
                        str3 = aweme2.getAid();
                    } else {
                        str3 = null;
                    }
                    C33744d a2 = a.mo59983a("group_id", str3);
                    Aweme aweme3 = this.f85978a;
                    if (aweme3 != null) {
                        str4 = aweme3.getAuthorUid();
                    }
                    C39162r.m79460a("duet_with_show", a2.mo59983a("author_id", str4).mo59983a("music_id", C59208ac.m108770d(this.f85978a)).f79943a);
                }
            }
            setAdHashTag(aweme);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BubbleDescView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    public final int mo63611a(CharSequence charSequence, String str, int i, int i2, int i3) {
        try {
            int width = getWidth();
            float measureText = ((getPaint().measureText(charSequence, i2, i3) + (getPaint().measureText(str) + 100.0f)) + 0.0f) - ((float) width);
            if (measureText <= 0.0f) {
                return 0;
            }
            int i4 = 1;
            int i5 = (i3 - i2) + 1;
            if (i5 > 0) {
                while (getPaint().measureText(charSequence, i3 - i4, i3) < measureText) {
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

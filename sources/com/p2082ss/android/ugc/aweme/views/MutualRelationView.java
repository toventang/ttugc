package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.friends.model.MutualUser;
import com.p2082ss.android.ugc.aweme.views.SuggestUserAvatarView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.views.MutualRelationView */
public final class MutualRelationView extends LinearLayout {

    /* renamed from: c */
    public static final C81410a f181900c = new C81410a((byte) 0);

    /* renamed from: a */
    public TuxTextView f181901a;

    /* renamed from: b */
    public boolean f181902b;

    /* renamed from: d */
    private View f181903d;

    /* renamed from: e */
    private SuggestUserAvatarView f181904e;

    /* renamed from: f */
    private final TuxTextView f181905f;

    static {
        Covode.recordClassIndex(94764);
    }

    public MutualRelationView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public MutualRelationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MutualRelationView$a */
    public static final class C81410a {
        static {
            Covode.recordClassIndex(94765);
        }

        private C81410a() {
        }

        public /* synthetic */ C81410a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m141133a(Context context, Integer num) {
            C89219l.m154721d(context, "");
            if (num != null) {
                if (num.intValue() == 3) {
                    String string = context.getString(R.string.f61);
                    C89219l.m154716b(string, "");
                    return string;
                } else if (num.intValue() == 2) {
                    String string2 = context.getString(R.string.f60);
                    C89219l.m154716b(string2, "");
                    return string2;
                } else if (num.intValue() == 1) {
                    String string3 = context.getString(R.string.f62);
                    C89219l.m154716b(string3, "");
                    return string3;
                }
            }
            return "";
        }
    }

    public final SuggestUserAvatarView getRelativeAvatar() {
        return this.f181904e;
    }

    public final TuxTextView getTvDesc() {
        return this.f181901a;
    }

    public final TuxTextView getTvDescTextOnly() {
        return this.f181905f;
    }

    /* renamed from: b */
    public final void mo125024b() {
        this.f181904e.f181957a = true;
    }

    /* renamed from: a */
    public final void mo125020a() {
        this.f181901a.setVisibility(0);
        this.f181905f.setVisibility(8);
        this.f181904e.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MutualRelationView$b */
    static final class RunnableC81411b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MutualRelationView f181906a;

        /* renamed from: b */
        final /* synthetic */ float f181907b = 8.0f;

        /* renamed from: c */
        final /* synthetic */ MutualStruct f181908c;

        /* renamed from: d */
        final /* synthetic */ int f181909d;

        /* renamed from: e */
        final /* synthetic */ float f181910e;

        static {
            Covode.recordClassIndex(94766);
        }

        RunnableC81411b(MutualRelationView mutualRelationView, MutualStruct mutualStruct, float f) {
            this.f181906a = mutualRelationView;
            this.f181908c = mutualStruct;
            this.f181909d = 2;
            this.f181910e = f;
        }

        public final void run() {
            CharSequence text = this.f181906a.getTvDesc().getText();
            if (this.f181906a.getTvDesc().getLayout() != null) {
                Layout layout = this.f181906a.getTvDesc().getLayout();
                C89219l.m154716b(layout, "");
                int lineCount = layout.getLineCount();
                int i = lineCount - 1;
                float c = ((float) C13628n.m24522c(this.f181906a.getContext(), this.f181906a.getTvDesc().getLayout().getLineWidth(i))) + (this.f181907b * 2.0f) + SuggestUserAvatarView.C81421a.m141180a(this.f181908c);
                if (lineCount < this.f181909d && c > this.f181910e) {
                    this.f181906a.getTvDescTextOnly().setText(this.f181906a.getTvDesc().getText());
                    this.f181906a.getTvDesc().setText("");
                    this.f181906a.getTvDescTextOnly().setVisibility(0);
                } else if (lineCount > 1) {
                    int lineStart = this.f181906a.getTvDesc().getLayout().getLineStart(i);
                    TuxTextView tvDescTextOnly = this.f181906a.getTvDescTextOnly();
                    C89219l.m154716b(text, "");
                    tvDescTextOnly.setText(text.subSequence(0, lineStart).toString());
                    this.f181906a.getTvDesc().setText(text.subSequence(lineStart, text.length() - 1).toString());
                    this.f181906a.getTvDesc().setMaxLines(1);
                    this.f181906a.getTvDescTextOnly().setVisibility(0);
                } else {
                    this.f181906a.getTvDescTextOnly().setVisibility(8);
                }
                if (lineCount != this.f181909d || c <= this.f181910e) {
                    this.f181906a.getRelativeAvatar().setVisibility(0);
                } else {
                    this.f181906a.getRelativeAvatar().setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.views.MutualRelationView$c */
    public static final class RunnableC81412c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MutualRelationView f181911a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f181912b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f181913c;

        /* renamed from: d */
        final /* synthetic */ MutualStruct f181914d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f181915e;

        static {
            Covode.recordClassIndex(94767);
        }

        RunnableC81412c(MutualRelationView mutualRelationView, C89233z.C89238e eVar, C89233z.C89236c cVar, MutualStruct mutualStruct, C89233z.C89238e eVar2) {
            this.f181911a = mutualRelationView;
            this.f181912b = eVar;
            this.f181913c = cVar;
            this.f181914d = mutualStruct;
            this.f181915e = eVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0116, code lost:
            if (java.lang.Math.abs(r10) < (r0 - 2)) goto L_0x00b0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 283
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.views.MutualRelationView.RunnableC81412c.run():void");
        }
    }

    public final void setDarkMode(boolean z) {
        this.f181904e.setDarkMode(z);
    }

    public final void setRelativeAvatar(SuggestUserAvatarView suggestUserAvatarView) {
        C89219l.m154721d(suggestUserAvatarView, "");
        this.f181904e = suggestUserAvatarView;
    }

    public final void setSocialVideoTag(boolean z) {
        this.f181904e.setSocialVideoTag(z);
    }

    public final void setTextColor(int i) {
        this.f181901a.setTextColor(i);
    }

    public final void setTvDesc(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f181901a = tuxTextView;
    }

    public final void setTvMaxWidth(int i) {
        this.f181901a.setMaxWidth(i);
    }

    private final void setAvatarView(MutualStruct mutualStruct) {
        this.f181904e.setVisibility(0);
        this.f181904e.mo125058b(mutualStruct);
    }

    public final void setAllTextColorUseAttrResource(int i) {
        this.f181901a.setTextColorRes(i);
        this.f181905f.setTextColorRes(i);
    }

    public final void setRootBackground(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        this.f181903d.setBackground(drawable);
    }

    public final void setTuxTextSize(int i) {
        this.f181901a.setTuxFont(i);
        this.f181905f.setTuxFont(i);
    }

    /* renamed from: a */
    private final String m141123a(int i) {
        String quantityString = getResources().getQuantityString(R.plurals.fa, i, Integer.valueOf(i));
        C89219l.m154716b(quantityString, "");
        return quantityString;
    }

    private final void setTextSuggestStr(MutualStruct mutualStruct) {
        this.f181901a.setVisibility(0);
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList == null || userList.isEmpty()) {
            this.f181901a.setText(m141123a(mutualStruct.getTotal()));
            return;
        }
        TuxTextView tuxTextView = this.f181901a;
        Context context = getContext();
        C89219l.m154716b(context, "");
        tuxTextView.setText(C81410a.m141133a(context, Integer.valueOf(mutualStruct.getMutualType())));
    }

    public final void setNickNameBold(String str) {
        SpannableStringBuilder spannableStringBuilder;
        int length;
        int length2;
        if (this.f181902b && (length = str.length()) < (length2 = (spannableStringBuilder = new SpannableStringBuilder(this.f181901a.getText().toString())).length())) {
            spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
            this.f181901a.setText(spannableStringBuilder);
        }
    }

    private final void setTextWithoutNum(MutualStruct mutualStruct) {
        String str;
        String nickname;
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList == null || !userList.isEmpty()) {
            this.f181901a.setVisibility(0);
            List<MutualUser> userList2 = mutualStruct.getUserList();
            if (userList2 == null) {
                userList2 = C89086z.INSTANCE;
            }
            MutualUser mutualUser = userList2.get(0);
            String str2 = "";
            if (mutualUser == null || (str = mutualUser.getNickname()) == null) {
                str = str2;
            }
            Context context = getContext();
            C89219l.m154716b(context, str2);
            String a = C81410a.m141133a(context, Integer.valueOf(mutualStruct.getMutualType()));
            if (userList2.size() > 1) {
                MutualUser mutualUser2 = userList2.get(1);
                if (!(mutualUser2 == null || (nickname = mutualUser2.getNickname()) == null)) {
                    str2 = nickname;
                }
                str2 = a + " " + str + "," + str2 + " ";
            } else if (userList2.size() == 1) {
                str2 = a + " " + str + " ";
            }
            this.f181901a.setText(str2);
            setNickNameBold(a);
            return;
        }
        this.f181901a.setText(m141123a(mutualStruct.getTotal()));
    }

    /* renamed from: a */
    public final void mo125021a(int i, int i2) {
        this.f181904e.mo125057b(i, i2);
    }

    /* renamed from: b */
    public final void mo125025b(int i, int i2) {
        this.f181904e.mo125056a(i, i2);
    }

    /* renamed from: a */
    public final void mo125022a(MutualStruct mutualStruct, float f) {
        C89219l.m154721d(mutualStruct, "");
        this.f181904e.setVisibility(8);
        this.f181901a.setMaxLines(2);
        C23163i.m43668b(this.f181905f, 0, 0, 0, 0, false, 16);
        C23163i.m43668b(this.f181901a, 0, 0, 0, 0, false, 16);
        this.f181901a.post(new RunnableC81411b(this, mutualStruct, f));
    }

    /* renamed from: a */
    public final void mo125023a(MutualStruct mutualStruct, int i) {
        if (mutualStruct != null && mutualStruct.getTotal() > 0) {
            switch (i) {
                case 1:
                    m141124a(mutualStruct, 1, 1);
                    return;
                case 2:
                    m141124a(mutualStruct, 1, 2);
                    return;
                case 3:
                    m141124a(mutualStruct, 2, 2);
                    return;
                case 4:
                    setTextSuggestStr(mutualStruct);
                    setAvatarView(mutualStruct);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    setTextWithoutNum(mutualStruct);
                    setAvatarView(mutualStruct);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    setTextSuggestStr(mutualStruct);
                    this.f181904e.mo125058b(mutualStruct);
                    this.f181904e.setVisibility(8);
                    return;
                default:
                    this.f181901a.setVisibility(8);
                    this.f181904e.setVisibility(8);
                    return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ MutualRelationView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MutualRelationView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11150);
        View.inflate(context, R.layout.agg, this);
        View findViewById = findViewById(R.id.cp4);
        C89219l.m154716b(findViewById, "");
        this.f181903d = findViewById;
        View findViewById2 = findViewById(R.id.ev0);
        C89219l.m154716b(findViewById2, "");
        this.f181901a = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.dhm);
        C89219l.m154716b(findViewById3, "");
        this.f181904e = (SuggestUserAvatarView) findViewById3;
        View findViewById4 = findViewById(R.id.ev1);
        C89219l.m154716b(findViewById4, "");
        this.f181905f = (TuxTextView) findViewById4;
        MethodCollector.m26664o(11150);
    }

    /* renamed from: a */
    private final void m141124a(MutualStruct mutualStruct, int i, int i2) {
        int size;
        String nickname;
        String str;
        this.f181901a.setVisibility(0);
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList == null) {
            userList = C89086z.INSTANCE;
        }
        int total = mutualStruct.getTotal();
        this.f181901a.setMaxLines(i);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new StringBuilder();
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        Context context = getContext();
        String str2 = "";
        C89219l.m154716b(context, str2);
        eVar2.element = (T) C81410a.m141133a(context, Integer.valueOf(mutualStruct.getMutualType()));
        eVar.element.append(eVar2.element).append(" ");
        if (i2 <= 1 || total <= 1) {
            T t = eVar.element;
            MutualUser mutualUser = userList.get(0);
            if (!(mutualUser == null || (nickname = mutualUser.getNickname()) == null)) {
                str2 = nickname;
            }
            t.append(str2).append(" ");
        } else {
            int i3 = 0;
            for (T t2 : userList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C89070n.m154520a();
                }
                T t3 = t2;
                T t4 = eVar.element;
                if (t3 == null || (str = t3.getNickname()) == null) {
                    str = str2;
                }
                t4.append(str);
                if (i3 != userList.size() - 1) {
                    eVar.element.append(", ");
                } else {
                    eVar.element.append(" ");
                }
                i3 = i4;
            }
        }
        eVar.element.length();
        C89233z.C89236c cVar = new C89233z.C89236c();
        if (i2 == 1) {
            size = total - 1;
        } else {
            size = total - userList.size();
        }
        cVar.element = size;
        if (cVar.element > 99) {
            cVar.element = 99;
        }
        if (cVar.element > 0) {
            this.f181901a.setText(eVar.element.append(getContext().getString(R.string.f63, Integer.valueOf(cVar.element))));
        } else {
            this.f181901a.setText(eVar.element);
        }
        this.f181901a.post(new RunnableC81412c(this, eVar, cVar, mutualStruct, eVar2));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m141126a(Integer num, Integer num2, Integer num3, Integer num4) {
        C23163i.m43659a(this.f181903d, num, num2, num3, num4, true);
    }
}

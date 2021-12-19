package com.p2082ss.android.ugc.aweme.qasticker.view;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxEditText;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.qasticker.C65864b;
import com.p2082ss.android.ugc.aweme.setting.C68719x;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.sticker.data.EnumC75311f;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.utils.KeyboardUtils;
import com.p2082ss.android.ugc.tools.view.widget.CircleImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qasticker.view.QaStickerView */
public final class QaStickerView extends ConstraintLayout {

    /* renamed from: k */
    public static final C65868a f148418k = new C65868a((byte) 0);

    /* renamed from: g */
    public ConstraintLayout f148419g;

    /* renamed from: h */
    public TuxEditText f148420h;

    /* renamed from: i */
    public TuxTextView f148421i;

    /* renamed from: j */
    public boolean f148422j;

    /* renamed from: l */
    private CircleImageView f148423l;

    /* renamed from: m */
    private long f148424m;

    /* renamed from: n */
    private long f148425n;

    /* renamed from: o */
    private long f148426o;

    /* renamed from: p */
    private String f148427p;

    /* renamed from: q */
    private String f148428q;

    /* renamed from: r */
    private EnumC75311f f148429r;

    /* renamed from: s */
    private UrlModel f148430s;

    /* renamed from: t */
    private List<Long> f148431t;

    /* renamed from: u */
    private boolean f148432u;

    static {
        Covode.recordClassIndex(77371);
    }

    public QaStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.qasticker.view.QaStickerView$a */
    public static final class C65868a {
        static {
            Covode.recordClassIndex(77372);
        }

        private C65868a() {
        }

        public /* synthetic */ C65868a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m117801a(Spannable spannable) {
            C89219l.m154721d(spannable, "");
            List<String> c = C68719x.m121154c();
            Integer b = C68719x.m121153b();
            if (!(c.isEmpty() || b == null)) {
                for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), ForegroundColorSpan.class)) {
                    spannable.removeSpan(foregroundColorSpan);
                }
                for (String str : c) {
                    Matcher matcher = Pattern.compile(str, 2).matcher(spannable);
                    while (matcher.find()) {
                        spannable.setSpan(new ForegroundColorSpan(b.intValue()), matcher.start(), matcher.end(), 33);
                    }
                }
            }
        }
    }

    public final boolean getTouchAble() {
        return this.f148432u;
    }

    public final ConstraintLayout getContentView() {
        ConstraintLayout constraintLayout = this.f148419g;
        if (constraintLayout == null) {
            C89219l.m154710a("contentView");
        }
        return constraintLayout;
    }

    /* renamed from: b */
    public final void mo9139b() {
        TuxEditText tuxEditText = this.f148420h;
        if (tuxEditText == null) {
            C89219l.m154710a("questionEditText");
        }
        tuxEditText.setFocusable(false);
        TuxEditText tuxEditText2 = this.f148420h;
        if (tuxEditText2 == null) {
            C89219l.m154710a("questionEditText");
        }
        tuxEditText2.setFocusableInTouchMode(false);
    }

    public final String getQaEditTextContent() {
        String obj;
        TuxEditText tuxEditText = this.f148420h;
        if (tuxEditText == null) {
            C89219l.m154710a("questionEditText");
        }
        Editable text = tuxEditText.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    /* renamed from: d */
    public final void mo105011d() {
        TuxTextView tuxTextView = this.f148421i;
        if (tuxTextView == null) {
            C89219l.m154710a("questionText");
        }
        tuxTextView.setVisibility(8);
        TuxEditText tuxEditText = this.f148420h;
        if (tuxEditText == null) {
            C89219l.m154710a("questionEditText");
        }
        tuxEditText.setVisibility(0);
        TuxEditText tuxEditText2 = this.f148420h;
        if (tuxEditText2 == null) {
            C89219l.m154710a("questionEditText");
        }
        TuxTextView tuxTextView2 = this.f148421i;
        if (tuxTextView2 == null) {
            C89219l.m154710a("questionText");
        }
        tuxEditText2.setText(tuxTextView2.getText().toString());
    }

    /* renamed from: c */
    public final void mo105010c() {
        int i;
        TuxEditText tuxEditText = this.f148420h;
        if (tuxEditText == null) {
            C89219l.m154710a("questionEditText");
        }
        tuxEditText.setFocusable(true);
        TuxEditText tuxEditText2 = this.f148420h;
        if (tuxEditText2 == null) {
            C89219l.m154710a("questionEditText");
        }
        tuxEditText2.setFocusableInTouchMode(true);
        TuxEditText tuxEditText3 = this.f148420h;
        if (tuxEditText3 == null) {
            C89219l.m154710a("questionEditText");
        }
        tuxEditText3.requestFocus();
        TuxEditText tuxEditText4 = this.f148420h;
        if (tuxEditText4 == null) {
            C89219l.m154710a("questionEditText");
        }
        KeyboardUtils.m145809b(tuxEditText4, C63247i.f143610a);
        TuxEditText tuxEditText5 = this.f148420h;
        if (tuxEditText5 == null) {
            C89219l.m154710a("questionEditText");
        }
        TuxEditText tuxEditText6 = this.f148420h;
        if (tuxEditText6 == null) {
            C89219l.m154710a("questionEditText");
        }
        Editable text = tuxEditText6.getText();
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        tuxEditText5.setSelection(i);
        this.f148422j = true;
    }

    public final QaStruct getQaStruct() {
        String obj;
        TuxEditText tuxEditText = this.f148420h;
        if (tuxEditText == null) {
            C89219l.m154710a("questionEditText");
        }
        Editable text = tuxEditText.getText();
        String str = null;
        if (text == null || (obj = text.toString()) == null || obj.length() == 0) {
            TuxTextView tuxTextView = this.f148421i;
            if (tuxTextView == null) {
                C89219l.m154710a("questionText");
            }
            CharSequence text2 = tuxTextView.getText();
            if (text2 == null || (str = text2.toString()) == null) {
                str = "";
            }
        } else {
            TuxEditText tuxEditText2 = this.f148420h;
            if (tuxEditText2 == null) {
                C89219l.m154710a("questionEditText");
            }
            Editable text3 = tuxEditText2.getText();
            if (text3 != null) {
                str = text3.toString();
            }
        }
        return new QaStruct(this.f148425n, this.f148426o, this.f148424m, this.f148430s, this.f148428q, str, this.f148427p, this.f148431t, this.f148429r);
    }

    public final void setTouchAble(boolean z) {
        this.f148432u = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.qasticker.view.QaStickerView$b */
    public static final class C65869b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ QaStickerView f148433a;

        static {
            Covode.recordClassIndex(77373);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C65869b(QaStickerView qaStickerView) {
            this.f148433a = qaStickerView;
        }

        public final void afterTextChanged(Editable editable) {
            Editable text;
            TuxEditText a = QaStickerView.m117796a(this.f148433a);
            if (!(a == null || (text = a.getText()) == null || text.length() == 0 || C65864b.m117794a(a) <= 6)) {
                String obj = a.getText().toString();
                if (obj.length() >= 600) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    obj = obj.substring(0, 600);
                    C89219l.m154716b(obj, "");
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String substring = obj.substring(0, obj.length() - 1);
                C89219l.m154716b(substring, "");
                int length = substring.length() - 1;
                while (length >= 0 && Character.isHighSurrogate(substring.charAt(length))) {
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    substring = substring.substring(0, length);
                    C89219l.m154716b(substring, "");
                    length--;
                }
                a.setText(substring);
                a.setSelection(a.getText().length());
            }
            if (editable != null) {
                C65868a.m117801a(editable);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null) {
                boolean z = false;
                if (this.f148433a.f148422j) {
                    this.f148433a.f148422j = false;
                    C39162r.m79460a("input_question", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("group_id", C70747dv.m124972a()).mo129406a("author_id", C63244g.m114602a().mo73255A().mo93904c()).mo129406a("question_user_id", C63244g.m114602a().mo73255A().mo93904c()).f188764a);
                }
                if (C89361p.m154910b(charSequence).length() == 0) {
                    z = true;
                }
                if (z) {
                    TuxEditText a = QaStickerView.m117796a(this.f148433a);
                    Context context = this.f148433a.getContext();
                    C89219l.m154716b(context, "");
                    a.setHint(context.getResources().getString(R.string.cg));
                    return;
                }
                QaStickerView.m117796a(this.f148433a).setHint("");
            }
        }
    }

    public final void setContentView(ConstraintLayout constraintLayout) {
        C89219l.m154721d(constraintLayout, "");
        this.f148419g = constraintLayout;
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxEditText m117796a(QaStickerView qaStickerView) {
        TuxEditText tuxEditText = qaStickerView.f148420h;
        if (tuxEditText == null) {
            C89219l.m154710a("questionEditText");
        }
        return tuxEditText;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f148432u) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        setAlpha(f);
    }

    /* renamed from: a */
    public final void mo105009a(QaStruct qaStruct) {
        if (qaStruct != null) {
            UrlModel avatarUrl = qaStruct.getAvatarUrl();
            if (avatarUrl != null) {
                this.f148430s = avatarUrl;
                CircleImageView circleImageView = this.f148423l;
                if (circleImageView == null) {
                    C89219l.m154710a("avatarImage");
                }
                C84402a.m145169a(circleImageView, avatarUrl, -1, -1);
            }
            String questionContent = qaStruct.getQuestionContent();
            if (questionContent != null) {
                TuxEditText tuxEditText = this.f148420h;
                if (tuxEditText == null) {
                    C89219l.m154710a("questionEditText");
                }
                tuxEditText.setVisibility(8);
                TuxTextView tuxTextView = this.f148421i;
                if (tuxTextView == null) {
                    C89219l.m154710a("questionText");
                }
                tuxTextView.setVisibility(0);
                SpannableString spannableString = new SpannableString(questionContent);
                C65868a.m117801a(spannableString);
                TuxTextView tuxTextView2 = this.f148421i;
                if (tuxTextView2 == null) {
                    C89219l.m154710a("questionText");
                }
                tuxTextView2.setText(spannableString);
                TuxEditText tuxEditText2 = this.f148420h;
                if (tuxEditText2 == null) {
                    C89219l.m154710a("questionEditText");
                }
                tuxEditText2.setText(spannableString);
            }
            this.f148425n = qaStruct.getQuestionId();
            this.f148426o = qaStruct.getUserId();
            this.f148427p = qaStruct.getSecId();
            this.f148424m = qaStruct.getItemId();
            String userName = qaStruct.getUserName();
            if (userName == null) {
                userName = "";
            }
            this.f148428q = userName;
            this.f148431t = qaStruct.getInviteUserList();
            this.f148429r = qaStruct.getSource();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QaStickerView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private QaStickerView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        UrlModel urlModel;
        C89219l.m154721d(context, "");
        this.f148427p = "";
        this.f148428q = "";
        this.f148429r = EnumC75311f.StickerPanel;
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        if (e != null) {
            urlModel = e.mo58663f();
        } else {
            urlModel = null;
        }
        this.f148430s = urlModel;
        this.f148431t = C89086z.INSTANCE;
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ct, this, true);
        Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) a;
        this.f148419g = constraintLayout;
        if (constraintLayout == null) {
            C89219l.m154710a("contentView");
        }
        View findViewById = constraintLayout.findViewById(R.id.dbh);
        C89219l.m154716b(findViewById, "");
        this.f148423l = (CircleImageView) findViewById;
        ConstraintLayout constraintLayout2 = this.f148419g;
        if (constraintLayout2 == null) {
            C89219l.m154710a("contentView");
        }
        View findViewById2 = constraintLayout2.findViewById(R.id.dbi);
        C89219l.m154716b(findViewById2, "");
        TuxEditText tuxEditText = (TuxEditText) findViewById2;
        this.f148420h = tuxEditText;
        if (tuxEditText == null) {
            C89219l.m154710a("questionEditText");
        }
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        tuxEditText.setMaxWidth((int) C84912r.m145930a(context2, 186.0f));
        ConstraintLayout constraintLayout3 = this.f148419g;
        if (constraintLayout3 == null) {
            C89219l.m154710a("contentView");
        }
        View findViewById3 = constraintLayout3.findViewById(R.id.dbk);
        C89219l.m154716b(findViewById3, "");
        this.f148421i = (TuxTextView) findViewById3;
        CircleImageView circleImageView = this.f148423l;
        if (circleImageView == null) {
            C89219l.m154710a("avatarImage");
        }
        C84402a.m145169a(circleImageView, this.f148430s, -1, -1);
        TuxEditText tuxEditText2 = this.f148420h;
        if (tuxEditText2 == null) {
            C89219l.m154710a("questionEditText");
        }
        tuxEditText2.addTextChangedListener(new C65869b(this));
    }
}

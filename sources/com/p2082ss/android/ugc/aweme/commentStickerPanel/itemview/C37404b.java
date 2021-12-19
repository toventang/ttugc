package com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxEditText;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.widget.CircleImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.b */
public final class C37404b extends ConstraintLayout {

    /* renamed from: p */
    public static final C37405a f88267p = new C37405a((byte) 0);

    /* renamed from: g */
    public ConstraintLayout f88268g;

    /* renamed from: h */
    public CircleImageView f88269h;

    /* renamed from: i */
    public TuxEditText f88270i;

    /* renamed from: j */
    public long f88271j;

    /* renamed from: k */
    public long f88272k;

    /* renamed from: l */
    public long f88273l;

    /* renamed from: m */
    public String f88274m;

    /* renamed from: n */
    public String f88275n;

    /* renamed from: o */
    public UrlModel f88276o;

    /* renamed from: q */
    private boolean f88277q;

    static {
        Covode.recordClassIndex(44785);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.b$a */
    public static final class C37405a {
        static {
            Covode.recordClassIndex(44786);
        }

        private C37405a() {
        }

        public /* synthetic */ C37405a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.b$b */
    public static final class C37406b implements TextWatcher {
        static {
            Covode.recordClassIndex(44787);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C37406b() {
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                QaStickerView.C65868a.m117801a(editable);
            }
        }
    }

    public final boolean getTouchAble() {
        return this.f88277q;
    }

    public final ConstraintLayout getContentView() {
        ConstraintLayout constraintLayout = this.f88268g;
        if (constraintLayout == null) {
            C89219l.m154710a("contentView");
        }
        return constraintLayout;
    }

    public final QaStruct getQaStruct() {
        String str;
        UrlModel urlModel = this.f88276o;
        TuxEditText tuxEditText = this.f88270i;
        if (tuxEditText == null) {
            C89219l.m154710a("questionEditText");
        }
        Editable text = tuxEditText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        return new QaStruct(this.f88272k, this.f88273l, this.f88271j, urlModel, this.f88275n, str, this.f88274m, null, null, 384, null);
    }

    public final void setTouchAble(boolean z) {
        this.f88277q = z;
    }

    public final void setContentView(ConstraintLayout constraintLayout) {
        C89219l.m154721d(constraintLayout, "");
        this.f88268g = constraintLayout;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f88277q) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C37404b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        UrlModel urlModel = null;
        this.f88274m = "";
        this.f88275n = "";
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        this.f88276o = e != null ? e.mo58663f() : urlModel;
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.cs, this, true);
        Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) a;
        this.f88268g = constraintLayout;
        if (constraintLayout == null) {
            C89219l.m154710a("contentView");
        }
        View findViewById = constraintLayout.findViewById(R.id.dbh);
        C89219l.m154716b(findViewById, "");
        this.f88269h = (CircleImageView) findViewById;
        ConstraintLayout constraintLayout2 = this.f88268g;
        if (constraintLayout2 == null) {
            C89219l.m154710a("contentView");
        }
        View findViewById2 = constraintLayout2.findViewById(R.id.dbi);
        C89219l.m154716b(findViewById2, "");
        this.f88270i = (TuxEditText) findViewById2;
        CircleImageView circleImageView = this.f88269h;
        if (circleImageView == null) {
            C89219l.m154710a("avatarImage");
        }
        C84402a.m145169a(circleImageView, this.f88276o, -1, -1);
        TuxEditText tuxEditText = this.f88270i;
        if (tuxEditText == null) {
            C89219l.m154710a("questionEditText");
        }
        tuxEditText.addTextChangedListener(new C37406b());
    }

    public /* synthetic */ C37404b(Context context, byte b) {
        this(context);
    }
}

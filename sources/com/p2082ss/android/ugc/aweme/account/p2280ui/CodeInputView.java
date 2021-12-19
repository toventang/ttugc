package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32850c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView */
public final class CodeInputView extends DmtEditText implements TextWatcher {

    /* renamed from: b */
    public static final C32960b f78423b = new C32960b((byte) 0);

    /* renamed from: a */
    public View.OnClickListener f78424a;

    /* renamed from: c */
    private boolean f78425c;

    /* renamed from: d */
    private Boolean f78426d;

    /* renamed from: e */
    private int f78427e;

    /* renamed from: f */
    private float f78428f;

    /* renamed from: g */
    private float f78429g;

    /* renamed from: h */
    private float f78430h;

    /* renamed from: i */
    private Integer f78431i;

    /* renamed from: j */
    private int f78432j;

    /* renamed from: k */
    private int f78433k;

    /* renamed from: l */
    private int f78434l;

    /* renamed from: m */
    private int f78435m;

    /* renamed from: n */
    private int f78436n;

    /* renamed from: o */
    private int f78437o;

    /* renamed from: p */
    private int f78438p;

    /* renamed from: q */
    private int f78439q;

    /* renamed from: r */
    private int f78440r;

    /* renamed from: s */
    private final AbstractC89244h f78441s;

    /* renamed from: t */
    private final AbstractC89244h f78442t;

    /* renamed from: u */
    private final AbstractC89244h f78443u;

    /* renamed from: v */
    private int f78444v;

    /* renamed from: w */
    private AbstractC32959a f78445w;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$a */
    public interface AbstractC32959a {
        static {
            Covode.recordClassIndex(39756);
        }

        /* renamed from: a_ */
        void mo58199a_(String str);

        /* renamed from: b */
        void mo58201b(String str);
    }

    static {
        Covode.recordClassIndex(39755);
    }

    public CodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Rect getCharBounds() {
        return (Rect) this.f78443u.getValue();
    }

    private final Paint getCursorPaint() {
        return (Paint) this.f78442t.getValue();
    }

    private final Paint getLinePaint() {
        return (Paint) this.f78441s.getValue();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$b */
    public static final class C32960b {
        static {
            Covode.recordClassIndex(39757);
        }

        private C32960b() {
        }

        public /* synthetic */ C32960b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$e */
    public static final class ActionMode$CallbackC32963e implements ActionMode.Callback {
        static {
            Covode.recordClassIndex(39760);
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        ActionMode$CallbackC32963e() {
        }
    }

    public final AbstractC32959a getCallback() {
        return this.f78445w;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$c */
    static final class C32961c extends AbstractC89220m implements AbstractC89171a<Rect> {

        /* renamed from: a */
        public static final C32961c f78446a = new C32961c();

        static {
            Covode.recordClassIndex(39758);
        }

        C32961c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Rect invoke() {
            return new Rect();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$d */
    static final class C32962d extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        public static final C32962d f78447a = new C32962d();

        static {
            Covode.recordClassIndex(39759);
        }

        C32962d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            return new Paint();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$f */
    static final class C32964f extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        public static final C32964f f78448a = new C32964f();

        static {
            Covode.recordClassIndex(39761);
        }

        C32964f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            return new Paint();
        }
    }

    /* renamed from: a */
    public final void mo58738a() {
        super.setOnClickListener(new View$OnClickListenerC32965g(this));
    }

    /* renamed from: b */
    public final void mo58740b() {
        super.setCustomSelectionActionModeCallback(new ActionMode$CallbackC32963e());
    }

    /* renamed from: c */
    public final void mo58742c() {
        getLinePaint().setColor(this.f78435m);
        invalidate();
    }

    /* renamed from: d */
    public final void mo58743d() {
        getLinePaint().setColor(this.f78433k);
        invalidate();
    }

    private final void getNumberHeight() {
        boolean z;
        Editable text = getText();
        if (text == null || text.length() != 0) {
            z = false;
        } else {
            z = true;
            setText("0");
        }
        getCharBounds().setEmpty();
        getPaint().getTextBounds(String.valueOf(getText()), 0, 1, getCharBounds());
        this.f78429g = (float) (getCharBounds().bottom - getCharBounds().top);
        if (z) {
            setText("");
        }
    }

    public final void setCallback(AbstractC32959a aVar) {
        this.f78445w = aVar;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f78424a = onClickListener;
    }

    public final void setGravity(int i) {
        super.setGravity(i);
        this.f78444v = i;
    }

    public final void setInputLength(int i) {
        if (i > 0) {
            this.f78439q = 0;
            this.f78438p = i;
            C32850c.m67444a(this, i);
            invalidate();
        }
    }

    public final void setTextAndAutoCheck(CharSequence charSequence) {
        this.f78425c = true;
        setText(charSequence);
        this.f78425c = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$g */
    public static final class View$OnClickListenerC32965g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CodeInputView f78449a;

        static {
            Covode.recordClassIndex(39762);
        }

        View$OnClickListenerC32965g(CodeInputView codeInputView) {
            this.f78449a = codeInputView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            CodeInputView codeInputView = this.f78449a;
            Editable text = codeInputView.getText();
            if (text == null) {
                C89219l.m154715b();
            }
            codeInputView.setSelection(text.length());
            View.OnClickListener onClickListener = this.f78449a.f78424a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        this.f78426d = true;
        super.onRestoreInstanceState(parcelable);
        this.f78426d = false;
    }

    public final void setInputType(int i) {
        int i2;
        super.setInputType(i);
        if (C0792v.m2768e(this) == 1) {
            if (i == 2) {
                i2 = 8388613;
            } else {
                i2 = this.f78444v;
            }
            setGravity(i2);
        }
    }

    public final void afterTextChanged(Editable editable) {
        int i;
        AbstractC32959a aVar;
        AbstractC32959a aVar2;
        if (this.f78445w != null) {
            if (editable != null) {
                i = editable.length();
            } else {
                i = 0;
            }
            int i2 = this.f78427e;
            if (i2 > 0 && i >= 0 && i2 > i && (aVar2 = this.f78445w) != null) {
                aVar2.mo58201b(String.valueOf(editable));
            }
            if (((!C89219l.m154714a((Object) this.f78426d, (Object) true)) || this.f78425c) && i > 0 && i == this.f78438p && (aVar = this.f78445w) != null) {
                String valueOf = String.valueOf(editable);
                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = C89361p.m154910b((CharSequence) valueOf).toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = obj.toLowerCase();
                C89219l.m154716b(lowerCase, "");
                aVar.mo58199a_(lowerCase);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r27) {
        /*
        // Method dump skipped, instructions count: 374
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView.onDraw(android.graphics.Canvas):void");
    }

    private /* synthetic */ CodeInputView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CodeInputView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.sd);
        int i;
        Integer num;
        C89219l.m154721d(context, "");
        this.f78431i = Integer.valueOf((int) R.color.a2);
        this.f78441s = C89250i.m154773a((AbstractC89171a) C32964f.f78448a);
        this.f78442t = C89250i.m154773a((AbstractC89171a) C32962d.f78447a);
        this.f78443u = C89250i.m154773a((AbstractC89171a) C32961c.f78446a);
        setBackgroundResource(0);
        if (attributeSet != null) {
            i = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
        } else {
            i = 4;
        }
        this.f78438p = i;
        if (attributeSet != null) {
            num = Integer.valueOf(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", R.color.a2));
        } else {
            num = null;
        }
        this.f78431i = num;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.qo, R.attr.qq, R.attr.t7, R.attr.v1, R.attr.a2d, R.attr.a2e, R.attr.a2f});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f78433k = obtainStyledAttributes.getColor(4, -16777216);
        this.f78434l = obtainStyledAttributes.getColor(0, -65536);
        this.f78435m = obtainStyledAttributes.getColor(2, -65536);
        this.f78432j = obtainStyledAttributes.getDimensionPixelSize(1, C34728n.m70946a(2.0d));
        this.f78436n = obtainStyledAttributes.getDimensionPixelSize(5, C34728n.m70946a(1.0d));
        this.f78437o = obtainStyledAttributes.getDimensionPixelSize(3, C34728n.m70946a(10.0d));
        this.f78440r = obtainStyledAttributes.getDimensionPixelSize(6, C34728n.m70946a(5.0d));
        obtainStyledAttributes.recycle();
        TextPaint paint = getPaint();
        C89219l.m154716b(paint, "");
        Integer num2 = this.f78431i;
        if (num2 == null) {
            C89219l.m154715b();
        }
        paint.setColor(C0643b.m2378c(context, num2.intValue()));
        getLinePaint().setColor(this.f78433k);
        getLinePaint().setStrokeWidth((float) this.f78436n);
        getLinePaint().setAntiAlias(true);
        getCursorPaint().setColor(this.f78434l);
        getCursorPaint().setStrokeWidth((float) this.f78432j);
        getCursorPaint().setAntiAlias(true);
        getCursorPaint().setStrokeCap(Paint.Cap.ROUND);
        this.f78430h = getCursorPaint().getStrokeWidth() / 2.0f;
        setCursorVisible(false);
        this.f78444v = getGravity();
        addTextChangedListener(this);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (charSequence != null) {
            i4 = charSequence.length();
        } else {
            i4 = 0;
        }
        this.f78427e = i4;
    }
}

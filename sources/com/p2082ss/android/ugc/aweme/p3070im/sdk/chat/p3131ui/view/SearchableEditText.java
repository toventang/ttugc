package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.p035f.C0687g;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText */
public final class SearchableEditText extends C54464b {

    /* renamed from: d */
    public static final C54452a f124737d = new C54452a((byte) 0);

    /* renamed from: c */
    public boolean f124738c;

    /* renamed from: e */
    private final String f124739e;

    /* renamed from: f */
    private final Drawable f124740f;

    /* renamed from: g */
    private final Drawable f124741g;

    /* renamed from: h */
    private AbstractC54453b f124742h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText$b */
    public interface AbstractC54453b {
        static {
            Covode.recordClassIndex(64161);
        }

        /* renamed from: b */
        void mo91384b();
    }

    static {
        Covode.recordClassIndex(64159);
    }

    public SearchableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText$a */
    public static final class C54452a {
        static {
            Covode.recordClassIndex(64160);
        }

        private C54452a() {
        }

        public /* synthetic */ C54452a(byte b) {
            this();
        }
    }

    public final void setKeyImeChangeListener(AbstractC54453b bVar) {
        C89219l.m154721d(bVar, "");
        this.f124742h = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText$c */
    static final class C54454c extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C54454c f124743a = new C54454c();

        static {
            Covode.recordClassIndex(64162);
        }

        C54454c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_x_mark_circle_fill;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bj);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private void m99794a(boolean z) {
        Drawable drawable;
        if (!this.f124738c || !z) {
            drawable = null;
        } else {
            drawable = this.f124740f;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        C89219l.m154716b(compoundDrawablesRelative, "");
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    public final void setSearchable(boolean z) {
        Drawable drawable;
        this.f124738c = z;
        if (z) {
            drawable = this.f124741g;
        } else {
            drawable = null;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        C89219l.m154716b(compoundDrawablesRelative, "");
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public final boolean onTextContextMenuItem(int i) {
        if (i != 16908322) {
            return super.onTextContextMenuItem(i);
        }
        try {
            boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
            if (onTextContextMenuItem) {
                Editable text = getText();
                if (text == null) {
                    C89219l.m154715b();
                }
                if (text.length() <= 1024) {
                    C46579b.m89899a(this);
                }
            }
            return onTextContextMenuItem;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText$d */
    static final class C54455d extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C54455d f124744a = new C54455d();

        static {
            Covode.recordClassIndex(64163);
        }

        C54455d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_tab_explore_fill;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()));
            aVar2.f54435e = Integer.valueOf((int) R.attr.bj);
            return C89391z.f203057a;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() == 1) {
            Drawable drawable = getCompoundDrawablesRelative()[2];
            if (C0687g.m2442a(Locale.getDefault()) == 1) {
                if (drawable != null && motionEvent.getX() >= ((float) (getLeft() + getPaddingLeft())) && motionEvent.getX() <= ((float) (getLeft() + getPaddingLeft() + drawable.getBounds().width()))) {
                    setText("");
                }
            } else if (drawable != null && motionEvent.getX() <= ((float) (getWidth() - getPaddingRight())) && motionEvent.getX() >= ((float) ((getWidth() - getPaddingRight()) - drawable.getBounds().width()))) {
                setText("");
            }
        }
        String str = this.f124739e;
        StringBuilder append = new StringBuilder().append(motionEvent.getAction()).append(", ").append(getLineCount()).append(" line, ");
        Editable text = getText();
        if (text != null) {
            num = Integer.valueOf(text.length());
        } else {
            num = null;
        }
        C56244a.m102191c(str, append.append(num).append(" character.").toString());
        int lineCount = getLineCount();
        boolean z = false;
        for (int i = 0; i < lineCount; i++) {
            C56244a.m102191c(this.f124739e, "Line " + i + " has " + (getLayout().getLineEnd(i) - getLayout().getLineStart(i)) + " character.");
        }
        try {
            z = super.onTouchEvent(motionEvent);
            return z;
        } catch (IndexOutOfBoundsException e) {
            C56244a.m102188a(e);
            return z;
        }
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AbstractC54453b bVar;
        if (keyEvent == null || keyEvent.getAction() != 0 || 4 != keyEvent.getKeyCode() || (bVar = this.f124742h) == null) {
            return false;
        }
        bVar.mo91384b();
        return false;
    }

    private /* synthetic */ SearchableEditText(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.DmtEditText
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        Editable text;
        super.onFocusChanged(z, i, rect);
        boolean z2 = true;
        if (!z || !((text = getText()) == null || text.length() == 0)) {
            z2 = false;
        }
        m99794a(z2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchableEditText(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f124739e = "SearchableEditText";
        this.f124740f = C23005c.m43393a(C54454c.f124743a).mo37368a(context);
        this.f124741g = C23005c.m43393a(C54455d.f124744a).mo37368a(context);
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C89219l.m154721d(charSequence, "");
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z = true;
        if (!isFocused() || charSequence.length() <= 0) {
            z = false;
        }
        m99794a(z);
    }
}

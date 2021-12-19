package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17174a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46577a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.Range;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.b */
public class C54464b extends DmtEditText {

    /* renamed from: b */
    public static final C54465a f124761b = new C54465a((byte) 0);

    /* renamed from: a */
    AbstractC89171a<C89391z> f124762a;

    /* renamed from: c */
    private View.OnKeyListener f124763c;

    static {
        Covode.recordClassIndex(64174);
    }

    public C54464b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.b$a */
    public static final class C54465a {
        static {
            Covode.recordClassIndex(64175);
        }

        private C54465a() {
        }

        public /* synthetic */ C54465a(byte b) {
            this();
        }
    }

    public final AbstractC89171a<C89391z> getHeightChangeListener() {
        return this.f124762a;
    }

    /* access modifiers changed from: protected */
    public final View.OnKeyListener getMOnKeyListener() {
        return this.f124763c;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.b$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC54468d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public int f124770a;

        /* renamed from: b */
        final /* synthetic */ C54464b f124771b;

        static {
            Covode.recordClassIndex(64178);
        }

        public final void onGlobalLayout() {
            if (this.f124771b.getHeight() != this.f124770a) {
                this.f124770a = this.f124771b.getHeight();
                AbstractC89171a<C89391z> aVar = this.f124771b.f124762a;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC54468d(C54464b bVar) {
            this.f124771b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.b$c */
    public final class C54467c {

        /* renamed from: a */
        public int f124766a;

        /* renamed from: b */
        public String f124767b;

        /* renamed from: c */
        public String f124768c;

        /* renamed from: d */
        public Range f124769d;

        static {
            Covode.recordClassIndex(64177);
        }

        public final int hashCode() {
            int i;
            int i2;
            String str = this.f124767b;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str2 = this.f124768c;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (((i4 + i2) * 31) + this.f124766a) * 31;
            Range range = this.f124769d;
            if (range != null) {
                i3 = range.hashCode();
            }
            return i5 + i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C54467c)) {
                return false;
            }
            C54467c cVar = (C54467c) obj;
            if (this.f124766a != cVar.f124766a || !C89219l.m154714a((Object) this.f124768c, (Object) cVar.f124768c) || !C89219l.m154714a((Object) this.f124767b, (Object) cVar.f124767b) || !C89219l.m154714a(this.f124769d, cVar.f124769d)) {
                return false;
            }
            return true;
        }
    }

    private final List<C54467c> getMentionSpans() {
        Object[] spans;
        Editable text = getText();
        List<C54467c> list = null;
        if (!(text == null || (spans = text.getSpans(0, text.length(), C54467c.class)) == null || (list = C89064i.m154508i(spans)) == null)) {
            for (T t : list) {
                t.f124769d = new Range(text.getSpanStart(t), text.getSpanEnd(t));
            }
        }
        return list;
    }

    /* renamed from: a */
    public final boolean mo91538a() {
        C54467c a;
        Editable text;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionEnd != selectionStart || (a = m99799a(selectionStart, selectionEnd)) == null) {
            return false;
        }
        Range range = a.f124769d;
        if (range == null || (text = getText()) == null) {
            return true;
        }
        text.delete(range.getFrom(), range.getTo());
        return true;
    }

    public final void setHeightChangeListener(AbstractC89171a<C89391z> aVar) {
        this.f124762a = aVar;
    }

    /* access modifiers changed from: protected */
    public final void setMOnKeyListener(View.OnKeyListener onKeyListener) {
        this.f124763c = onKeyListener;
    }

    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.f124763c = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C89219l.m154721d(editorInfo, "");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C89219l.m154716b(onCreateInputConnection, "");
        return new C54466b(this, onCreateInputConnection, this);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.b$b */
    final class C54466b extends InputConnectionWrapper {

        /* renamed from: a */
        public final C54464b f124764a;

        /* renamed from: b */
        final /* synthetic */ C54464b f124765b;

        static {
            Covode.recordClassIndex(64176);
        }

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            C89219l.m154721d(keyEvent, "");
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && this.f124764a.mo91538a()) {
                View.OnKeyListener mOnKeyListener = this.f124765b.getMOnKeyListener();
                if (mOnKeyListener == null) {
                    return true;
                }
                mOnKeyListener.onKey(this.f124764a, keyEvent.getKeyCode(), keyEvent);
                return true;
            } else if (super.sendKeyEvent(keyEvent)) {
                return true;
            } else {
                return false;
            }
        }

        public final boolean deleteSurroundingText(int i, int i2) {
            if ((i != 1 || i2 != 0 || !this.f124764a.mo91538a()) && !super.deleteSurroundingText(i, i2)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54466b(C54464b bVar, InputConnection inputConnection, C54464b bVar2) {
            super(inputConnection, true);
            C89219l.m154721d(inputConnection, "");
            C89219l.m154721d(bVar2, "");
            this.f124765b = bVar;
            this.f124764a = bVar2;
        }
    }

    /* renamed from: a */
    public final boolean mo91539a(String str) {
        C89219l.m154721d(str, "");
        if (getEditableText() == null) {
            return false;
        }
        int selectionStart = getSelectionStart();
        if (selectionStart < 0) {
            C56244a.m102193e("MentionEditText", "addEmojiText index invalid: ".concat(String.valueOf(selectionStart)));
            return false;
        }
        SpannableString spannableString = new SpannableString(str);
        Drawable a = new C46577a().mo79102a(getContext(), str);
        if (a != null) {
            int lineHeight = getLineHeight();
            a.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a.getIntrinsicWidth()) + 0.0f) / ((float) a.getIntrinsicHeight()))) + 0.5f), lineHeight);
            spannableString.setSpan(new C17174a(a), 0, spannableString.length(), 33);
        }
        Editable text = getText();
        if (text == null) {
            return true;
        }
        text.insert(selectionStart, spannableString);
        return true;
    }

    /* renamed from: a */
    private final C54467c m99799a(int i, int i2) {
        List<C54467c> i3;
        Editable text = getText();
        if (text != null) {
            if (text.length() < i2) {
                Object[] spans = text.getSpans(0, text.length(), C54467c.class);
                if (spans != null) {
                    i3 = C89064i.m154508i(spans);
                }
            } else {
                Object[] spans2 = text.getSpans(0, i2, C54467c.class);
                if (spans2 != null) {
                    i3 = C89064i.m154508i(spans2);
                }
            }
            if (i3 != null) {
                for (C54467c cVar : i3) {
                    cVar.f124769d = new Range(text.getSpanStart(cVar), text.getSpanEnd(cVar));
                }
                for (C54467c cVar2 : i3) {
                    Range range = cVar2.f124769d;
                    if (!(range == null || !range.contains(i, i2) || i2 == range.getFrom())) {
                        return cVar2;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        List<C54467c> mentionSpans = getMentionSpans();
        if (mentionSpans != null) {
            Iterator<T> it = mentionSpans.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                Range range = next.f124769d;
                if (range != null && range.isWrappedBy(i, i2)) {
                    Range range2 = next.f124769d;
                    if (range2 != null) {
                        if (i == i2) {
                            try {
                                setSelection(range2.getAnchorPosition(i));
                                return;
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                        } else {
                            if (i2 < range2.getTo()) {
                                setSelection(i, range2.getTo());
                            }
                            if (i > range2.getFrom()) {
                                setSelection(range2.getFrom(), i2);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (i == i2) {
            setSelection(i);
        }
    }

    private /* synthetic */ C54464b(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54464b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        Context context2 = getContext();
        if (context2 != null) {
            int i2 = Build.VERSION.SDK_INT;
            Resources resources = context2.getResources();
            C89219l.m154716b(resources, "");
            Configuration configuration = resources.getConfiguration();
            C89219l.m154716b(configuration, "");
            if (configuration.getLayoutDirection() == 1) {
                int i3 = Build.VERSION.SDK_INT;
                setTextAlignment(5);
                setGravity(getGravity() | 8388611);
            }
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC54468d(this));
    }
}

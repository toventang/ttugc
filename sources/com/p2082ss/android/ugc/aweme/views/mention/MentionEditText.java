package com.p2082ss.android.ugc.aweme.views.mention;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText */
public class MentionEditText extends DmtEditText {

    /* renamed from: a */
    protected int f182036a;

    /* renamed from: b */
    protected int f182037b;

    /* renamed from: c */
    public boolean f182038c;

    /* renamed from: d */
    public C81453b f182039d;

    /* renamed from: e */
    protected List<C81453b> f182040e;

    /* renamed from: f */
    public AbstractC81450c f182041f;

    /* renamed from: g */
    protected List<TextWatcher> f182042g = new ArrayList();

    /* renamed from: h */
    public Set<String> f182043h = new HashSet();

    /* renamed from: i */
    public View.OnKeyListener f182044i;

    /* renamed from: j */
    private Runnable f182045j;

    /* renamed from: k */
    private int f182046k;

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$c */
    public interface AbstractC81450c {
        static {
            Covode.recordClassIndex(94822);
        }
    }

    static {
        Covode.recordClassIndex(94815);
    }

    public String getAdTag() {
        return "";
    }

    /* access modifiers changed from: protected */
    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructList();
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSavedState */
    public static class MentionSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<MentionSavedState> CREATOR = new Parcelable.Creator<MentionSavedState>() {
            /* class com.p2082ss.android.ugc.aweme.views.mention.MentionEditText.MentionSavedState.C814461 */

            static {
                Covode.recordClassIndex(94817);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MentionSavedState[] newArray(int i) {
                return new MentionSavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MentionSavedState createFromParcel(Parcel parcel) {
                return m141222a(parcel);
            }

            /* renamed from: a */
            private static MentionSavedState m141222a(Parcel parcel) {
                try {
                    return new MentionSavedState(parcel, (byte) 0);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        };

        /* renamed from: a */
        public String f182047a;

        /* renamed from: b */
        public int f182048b;

        /* renamed from: c */
        public List<TextExtraStruct> f182049c;

        static {
            Covode.recordClassIndex(94816);
        }

        public MentionSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private MentionSavedState(Parcel parcel) {
            super(parcel);
            this.f182047a = parcel.readString();
            this.f182048b = parcel.readInt();
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            if (readBundle != null) {
                this.f182049c = readBundle.getParcelableArrayList("text_extra_struct");
            }
        }

        /* synthetic */ MentionSavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f182047a);
            parcel.writeInt(this.f182048b);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("text_extra_struct", (ArrayList) this.f182049c);
            parcel.writeBundle(bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan */
    public static class MentionSpan extends ForegroundColorSpan {
        public static final Parcelable.Creator<MentionSpan> CREATOR = new Parcelable.Creator<MentionSpan>() {
            /* class com.p2082ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan.C814471 */

            static {
                Covode.recordClassIndex(94819);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MentionSpan[] newArray(int i) {
                return new MentionSpan[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MentionSpan createFromParcel(Parcel parcel) {
                return new MentionSpan(parcel);
            }
        };

        /* renamed from: a */
        public String f182050a;

        /* renamed from: b */
        public String f182051b;

        /* renamed from: c */
        public int f182052c;

        /* renamed from: d */
        public TextExtraStruct f182053d;

        /* renamed from: e */
        public String f182054e = "";

        /* renamed from: f */
        public int f182055f;

        /* renamed from: g */
        public String f182056g = "";

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(94818);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            String str = this.f182050a;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = i * 31;
            String str2 = this.f182051b;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (((i6 + i2) * 31) + this.f182052c) * 31;
            TextExtraStruct textExtraStruct = this.f182053d;
            if (textExtraStruct != null) {
                i3 = textExtraStruct.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str3 = this.f182054e;
            if (str3 != null) {
                i4 = str3.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (((i8 + i4) * 31) + this.f182055f) * 31;
            String str4 = this.f182056g;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return i9 + i5;
        }

        /* renamed from: a */
        public final void mo125126a(int i) {
            this.f182055f = i;
            this.f182053d.setSubType(i);
        }

        /* renamed from: a */
        public final void mo125127a(String str) {
            this.f182054e = str;
            this.f182053d.setAwemeId(str);
        }

        /* renamed from: a */
        public final void mo125128a(boolean z) {
            this.f182053d.setStarAtlasTag(z);
        }

        protected MentionSpan(Parcel parcel) {
            super(parcel);
            this.f182050a = parcel.readString();
            this.f182051b = parcel.readString();
            this.f182052c = parcel.readInt();
            this.f182053d = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
            this.f182056g = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                MentionSpan mentionSpan = (MentionSpan) obj;
                if (this.f182052c != mentionSpan.f182052c || this.f182055f != mentionSpan.f182055f) {
                    return false;
                }
                String str = this.f182050a;
                if (str == null ? mentionSpan.f182050a != null : !str.equals(mentionSpan.f182050a)) {
                    return false;
                }
                String str2 = this.f182051b;
                if (str2 == null ? mentionSpan.f182051b != null : !str2.equals(mentionSpan.f182051b)) {
                    return false;
                }
                TextExtraStruct textExtraStruct = this.f182053d;
                if (textExtraStruct == null ? mentionSpan.f182053d != null : !textExtraStruct.equals(mentionSpan.f182053d)) {
                    return false;
                }
                String str3 = this.f182054e;
                if (str3 == null ? mentionSpan.f182054e != null : !str3.equals(mentionSpan.f182054e)) {
                    return false;
                }
                String str4 = this.f182056g;
                String str5 = mentionSpan.f182056g;
                if (str4 != null) {
                    return str4.equals(str5);
                }
                if (str5 == null) {
                    return true;
                }
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f182050a);
            parcel.writeString(this.f182051b);
            parcel.writeInt(this.f182052c);
            parcel.writeParcelable(this.f182053d, i);
            parcel.writeString(this.f182056g);
        }

        public MentionSpan(int i, String str, String str2, int i2, String str3, String str4) {
            super(i);
            this.f182050a = str2;
            this.f182051b = str;
            this.f182052c = i2;
            this.f182056g = str4;
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            this.f182053d = textExtraStruct;
            textExtraStruct.setUserId(str2);
            this.f182053d.setType(i2);
            this.f182053d.setAtUserType(str3);
            this.f182053d.setSecUid(str4);
        }
    }

    public int getMentionTextCount() {
        MentionSpan[] mentionText = getMentionText();
        if (mentionText == null) {
            return 0;
        }
        return mentionText.length;
    }

    public String getNoAdTagText() {
        return getText().toString();
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$d */
    static class RunnableC81451d implements Runnable {

        /* renamed from: a */
        private WeakReference<MentionEditText> f182060a;

        static {
            Covode.recordClassIndex(94823);
        }

        public final void run() {
            MentionEditText mentionEditText = this.f182060a.get();
            if (mentionEditText != null) {
                mentionEditText.setSelection(mentionEditText.getText().length());
            }
        }

        public RunnableC81451d(MentionEditText mentionEditText) {
            this.f182060a = new WeakReference<>(mentionEditText);
        }
    }

    /* renamed from: b */
    private void m141218b() {
        this.f182040e = new ArrayList(5);
        this.f182036a = -65536;
        addTextChangedListener(new C81449b(this, (byte) 0));
        if (m141216a(getContext())) {
            int i = Build.VERSION.SDK_INT;
            setTextAlignment(5);
            setGravity(getGravity() | 8388611);
        }
    }

    public MentionSpan[] getMentionText() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(0, getNoAdTagText().length(), MentionSpan.class);
        Arrays.sort(mentionSpanArr, new C81452a(text));
        return mentionSpanArr;
    }

    public ArrayList<TextExtraStruct> getTextExtraStructList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        MentionSpan[] mentionText = getMentionText();
        for (MentionSpan mentionSpan : mentionText) {
            if (mentionSpan.f182052c == 0) {
                mentionSpan.f182053d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f182053d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f182053d);
            }
        }
        return arrayList;
    }

    public Parcelable onSaveInstanceState() {
        MentionSavedState mentionSavedState = new MentionSavedState(super.onSaveInstanceState());
        mentionSavedState.f182047a = getNoAdTagText();
        mentionSavedState.f182048b = Math.max(getSelectionEnd(), 0);
        mentionSavedState.f182049c = getCompatTextExtraStructList();
        return mentionSavedState;
    }

    public ArrayList<TextExtraStruct> getStarAtlasExtraList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        MentionSpan[] mentionText = getMentionText();
        for (MentionSpan mentionSpan : mentionText) {
            if (mentionSpan.f182053d.isStarAtlasTag()) {
                mentionSpan.f182053d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f182053d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f182053d);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo125101a() {
        int i;
        Editable text = getText();
        if (!(text == null || TextUtils.isEmpty(text.toString()))) {
            int length = text.length();
            MentionSpan[] mentionText = getMentionText();
            for (MentionSpan mentionSpan : mentionText) {
                TextExtraStruct textExtraStruct = mentionSpan.f182053d;
                if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getType() == 0) {
                    text.removeSpan(mentionSpan);
                    if (textExtraStruct.isStarAtlasTag()) {
                        i = this.f182037b;
                    } else {
                        i = this.f182036a;
                    }
                    MentionSpan mentionSpan2 = new MentionSpan(i, text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getAtUserType(), textExtraStruct.getSecUid());
                    mentionSpan2.mo125128a(textExtraStruct.isStarAtlasTag());
                    if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                        mentionSpan2.mo125127a(textExtraStruct.getAwemeId());
                    }
                    mentionSpan2.mo125126a(textExtraStruct.getSubtype());
                    text.setSpan(mentionSpan2, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                }
            }
        }
    }

    public void setMentionTextColor(int i) {
        this.f182036a = i;
    }

    public void setMentionTextTypeface(int i) {
        this.f182046k = i;
    }

    public void setOnMentionInputListener(AbstractC81450c cVar) {
        this.f182041f = cVar;
    }

    public void setStarAtlasMentionTextColor(int i) {
        this.f182037b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$b */
    public class C81449b implements TextWatcher {
        static {
            Covode.recordClassIndex(94821);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private C81449b() {
        }

        /* synthetic */ C81449b(MentionEditText mentionEditText, byte b) {
            this();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 == 1 && !TextUtils.isEmpty(charSequence)) {
                charSequence.toString().charAt(i);
            }
        }
    }

    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.f182044i = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        List<TextWatcher> list = this.f182042g;
        if (list != null && textWatcher != null) {
            list.add(textWatcher);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new C81448a(onCreateInputConnection, this);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        List<TextWatcher> list = this.f182042g;
        if (list != null && textWatcher != null) {
            list.remove(textWatcher);
        }
    }

    public MentionEditText(Context context) {
        super(context);
        m141218b();
    }

    /* renamed from: a */
    private static boolean m141216a(Context context) {
        if (context != null) {
            int i = Build.VERSION.SDK_INT;
            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                return true;
            }
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MentionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MentionSavedState mentionSavedState = (MentionSavedState) parcelable;
        super.onRestoreInstanceState(mentionSavedState.getSuperState());
        setText(mentionSavedState.f182047a);
        int min = Math.min(mentionSavedState.f182048b, getText().length());
        if (min >= 0) {
            setSelection(min);
        }
        setTextExtraList(mentionSavedState.f182049c);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$a */
    class C81448a extends InputConnectionWrapper {

        /* renamed from: b */
        private EditText f182058b;

        static {
            Covode.recordClassIndex(94820);
        }

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            if (MentionEditText.this.f182044i != null) {
                return MentionEditText.this.f182044i.onKey(MentionEditText.this, keyEvent.getKeyCode(), keyEvent);
            }
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                return super.sendKeyEvent(keyEvent);
            }
            int selectionStart = this.f182058b.getSelectionStart();
            C81453b a = MentionEditText.this.mo125100a(selectionStart, this.f182058b.getSelectionEnd());
            if (a == null) {
                MentionEditText.this.f182038c = false;
                return super.sendKeyEvent(keyEvent);
            } else if (MentionEditText.this.f182038c || selectionStart == a.f182062a) {
                MentionEditText.this.f182038c = false;
                return super.sendKeyEvent(keyEvent);
            } else {
                MentionEditText.this.f182038c = true;
                MentionEditText.this.f182039d = a;
                if (Build.VERSION.SDK_INT >= 25) {
                    setSelection(a.f182062a, a.f182063b);
                } else {
                    setSelection(a.f182063b, a.f182062a);
                }
                return true;
            }
        }

        public final boolean commitText(CharSequence charSequence, int i) {
            try {
                return super.commitText(charSequence, i);
            } catch (NullPointerException e) {
                e.printStackTrace();
                return true;
            }
        }

        public final boolean deleteSurroundingText(int i, int i2) {
            MentionSpan[] mentionSpanArr;
            int i3 = i;
            int i4 = i2;
            if (i3 == 1) {
                if (i4 == 0) {
                    Editable text = MentionEditText.this.getText();
                    if (text != null && text.length() > 0) {
                        MentionEditText mentionEditText = MentionEditText.this;
                        int length = text.length();
                        int max = Math.max(mentionEditText.getSelectionStart() - i3, 0);
                        int min = Math.min(mentionEditText.getSelectionEnd() + i4, length);
                        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(0, length, CharacterStyle.class);
                        int i5 = max;
                        int i6 = min;
                        boolean z = false;
                        boolean z2 = false;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).f182052c != 1) {
                                int spanStart = text.getSpanStart(characterStyle);
                                int spanEnd = text.getSpanEnd(characterStyle);
                                if (!z && spanStart <= max && spanEnd > max) {
                                    i5 = spanStart;
                                    z = true;
                                }
                                if (!z2 && spanStart < min && spanEnd >= min) {
                                    i6 = spanEnd;
                                    z2 = true;
                                }
                                if (z && z2) {
                                    break;
                                }
                            }
                        }
                        int[] iArr = {i5, i6};
                        int i7 = iArr[0];
                        int i8 = iArr[1];
                        if (i7 > i8) {
                            i7 = i8;
                            i8 = i7;
                        }
                        C81453b a = MentionEditText.this.mo125100a(i7, i8);
                        if (a == null || (mentionSpanArr = (MentionSpan[]) text.getSpans(a.f182062a, a.f182063b, MentionSpan.class)) == null || mentionSpanArr.length <= 0) {
                            text.delete(i7, i8);
                        } else if (!sendKeyEvent(new KeyEvent(0, 67)) || !sendKeyEvent(new KeyEvent(1, 67))) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
            } else if (i3 < 0) {
                int i9 = -i4;
                i4 = -i3;
                i3 = i9;
            }
            return super.deleteSurroundingText(i3, i4);
        }

        C81448a(InputConnection inputConnection, MentionEditText mentionEditText) {
            super(inputConnection, true);
            this.f182058b = mentionEditText;
        }
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        Editable text;
        int i;
        this.f182038c = false;
        List<C81453b> list2 = this.f182040e;
        if (list2 != null) {
            list2.clear();
        }
        if (!(list == null || list.isEmpty() || (text = getText()) == null || TextUtils.isEmpty(text.toString()))) {
            int length = text.length();
            for (TextExtraStruct textExtraStruct : list) {
                if (textExtraStruct.isStarAtlasTag()) {
                    i = this.f182037b;
                } else {
                    i = this.f182036a;
                }
                if (textExtraStruct.getType() == 0 && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                    MentionSpan mentionSpan = new MentionSpan(i, text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getAtUserType(), textExtraStruct.getSecUid());
                    mentionSpan.mo125128a(textExtraStruct.isStarAtlasTag());
                    if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                        mentionSpan.mo125127a(textExtraStruct.getAwemeId());
                    }
                    mentionSpan.mo125126a(textExtraStruct.getSubtype());
                    text.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                    this.f182040e.add(new C81453b(textExtraStruct.getStart(), textExtraStruct.getEnd()));
                }
            }
        }
    }

    @Override // android.widget.TextView, android.widget.EditText
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception unused) {
        }
        if (this.f182045j == null) {
            this.f182045j = new RunnableC81451d(this);
        }
        if (getText().length() > 0) {
            post(this.f182045j);
        }
    }

    public MentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m141218b();
    }

    /* renamed from: a */
    public final C81453b mo125100a(int i, int i2) {
        List<C81453b> list = this.f182040e;
        if (list == null) {
            return null;
        }
        for (C81453b bVar : list) {
            if (bVar.mo125143a(i, i2)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        int i3;
        int i4;
        int i5;
        super.onSelectionChanged(i, i2);
        String adTag = getAdTag();
        if (!TextUtils.isEmpty(adTag)) {
            int length = getText().length() - adTag.length();
            if (i > length) {
                setSelection(length);
            } else if (i2 > length) {
                setSelection(i, length);
            }
        }
        ArrayList<TextExtraStruct> starAtlasExtraList = getStarAtlasExtraList();
        if (!(starAtlasExtraList == null || starAtlasExtraList.size() == 0 || TextUtils.isEmpty(getNoAdTagText()))) {
            Iterator<TextExtraStruct> it = getStarAtlasExtraList().iterator();
            while (it.hasNext()) {
                TextExtraStruct next = it.next();
                if (i < next.getEnd() + 1) {
                    i4 = next.getEnd() + 1;
                } else {
                    i4 = i;
                }
                if (i2 < next.getEnd() + 1) {
                    i5 = next.getEnd() + 1;
                } else {
                    i5 = i2;
                }
                setSelection(Math.min(i4, getNoAdTagText().length()), Math.min(i5, getNoAdTagText().length()));
            }
        }
        C81453b bVar = this.f182039d;
        if (bVar != null) {
            if (bVar.f182062a != i || bVar.f182063b != i2) {
                if (bVar.f182062a == i2 && bVar.f182063b == i) {
                    return;
                }
            } else {
                return;
            }
        }
        C81453b a = mo125100a(i, i2);
        if (a != null && a.f182063b == i2) {
            this.f182038c = false;
        }
        List<C81453b> list = this.f182040e;
        if (list != null) {
            for (C81453b bVar2 : list) {
                if ((i > bVar2.f182062a && i < bVar2.f182063b) || (i2 > bVar2.f182062a && i2 < bVar2.f182063b)) {
                    if (i == i2) {
                        try {
                            if ((i - bVar2.f182062a) - (bVar2.f182063b - i) >= 0) {
                                i3 = bVar2.f182063b;
                            } else {
                                i3 = bVar2.f182062a;
                            }
                            setSelection(i3);
                            return;
                        } catch (IndexOutOfBoundsException e) {
                            e.printStackTrace();
                            return;
                        }
                    } else {
                        if (i2 < bVar2.f182063b) {
                            setSelection(i, bVar2.f182063b);
                        }
                        if (i > bVar2.f182062a) {
                            setSelection(bVar2.f182062a, i2);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo125102a(String str, String str2, String str3) {
        return m141217a(str, str2, "", str3);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f182038c = false;
        List<C81453b> list = this.f182040e;
        if (list != null) {
            list.clear();
        }
        Editable text = getText();
        if (!(text == null || TextUtils.isEmpty(text.toString()))) {
            MentionSpan[] mentionText = getMentionText();
            for (MentionSpan mentionSpan : mentionText) {
                C81453b bVar = new C81453b(text.getSpanStart(mentionSpan), text.getSpanEnd(mentionSpan));
                if (!TextUtils.equals(text.subSequence(bVar.f182062a, bVar.f182063b).toString(), mentionSpan.f182051b)) {
                    text.removeSpan(mentionSpan);
                } else if (mentionSpan.f182052c == 0) {
                    this.f182040e.add(bVar);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m141217a(String str, String str2, String str3, String str4) {
        int selectionStart = getSelectionStart();
        Editable text = getText();
        if (text == null) {
            return false;
        }
        SpannableString spannableString = new SpannableString("@" + str);
        MentionSpan mentionSpan = new MentionSpan(this.f182036a, spannableString.toString(), str2, 0, str3, str4);
        spannableString.setSpan(mentionSpan, 0, spannableString.length(), 33);
        if (this.f182046k != 0) {
            spannableString.setSpan(new StyleSpan(this.f182046k), 0, spannableString.length(), 33);
        }
        mentionSpan.mo125128a(false);
        MentionSpan[] mentionText = getMentionText();
        if (mentionText != null && Arrays.asList(mentionText).contains(mentionSpan)) {
            return false;
        }
        if (TextUtils.isEmpty(text)) {
            text.insert(0, spannableString);
            text.append((CharSequence) " ");
            return true;
        }
        int length = text.length();
        if (selectionStart <= length && selectionStart >= 0) {
            if (selectionStart > 0) {
                int i = selectionStart - 1;
                if (TextUtils.equals(text.subSequence(i, selectionStart), "@")) {
                    text.delete(i, selectionStart);
                    selectionStart--;
                    length--;
                }
            }
            int min = Math.min(length, Math.max(0, selectionStart));
            text.insert(min, spannableString);
            text.insert(Math.min(min + spannableString.length(), text.length()), " ");
        }
        return true;
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
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
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63201ay;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.publish.api.C65510c;
import com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText;
import com.p2082ss.android.ugc.aweme.setting.C68044c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69753a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69763d;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74041w;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.MentionEditText */
public class MentionEditText extends DmtEditText implements IAVMentionEditText {

    /* renamed from: A */
    public AbstractC74129c f166460A;

    /* renamed from: B */
    protected List<TextWatcher> f166461B = new ArrayList();

    /* renamed from: C */
    public Set<String> f166462C = new HashSet();

    /* renamed from: D */
    public View.OnKeyListener f166463D;

    /* renamed from: a */
    private Runnable f166464a;

    /* renamed from: b */
    private int f166465b;

    /* renamed from: c */
    private int f166466c = -1;

    /* renamed from: d */
    private int f166467d = -1;

    /* renamed from: e */
    private String f166468e;

    /* renamed from: f */
    private VideoPublishEditModel f166469f;

    /* renamed from: g */
    private boolean f166470g;

    /* renamed from: h */
    private boolean f166471h;

    /* renamed from: n */
    protected int f166472n = -65536;

    /* renamed from: o */
    protected int f166473o;

    /* renamed from: p */
    public boolean f166474p;

    /* renamed from: q */
    public C74159r f166475q;

    /* renamed from: r */
    protected List<C74159r> f166476r = new ArrayList(5);

    /* renamed from: s */
    public boolean f166477s;

    /* renamed from: t */
    public int f166478t;

    /* renamed from: u */
    public int f166479u;

    /* renamed from: v */
    public boolean f166480v;

    /* renamed from: w */
    public boolean f166481w;

    /* renamed from: x */
    public boolean f166482x;

    /* renamed from: y */
    public boolean f166483y;

    /* renamed from: z */
    public boolean f166484z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$c */
    public interface AbstractC74129c {
        static {
            Covode.recordClassIndex(86887);
        }

        /* renamed from: a */
        void mo113564a();
    }

    static {
        Covode.recordClassIndex(86879);
    }

    /* renamed from: a */
    public void mo116495a() {
    }

    /* renamed from: a */
    public void mo116496a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo116500a(MentionSpan mentionSpan, C74159r rVar) {
    }

    /* renamed from: a */
    public void mo116501a(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void addHashTag(String str) {
    }

    public String getAdTag() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void removeHashTag() {
    }

    public int getPasteEnd() {
        return this.f166467d;
    }

    public int getPasteStart() {
        return this.f166466c;
    }

    public String getPasteUrl() {
        return this.f166468e;
    }

    public int getUrlEnd() {
        return this.f166479u;
    }

    public int getUrlStart() {
        return this.f166478t;
    }

    public VideoPublishEditModel getVideoPublishEditModel() {
        return this.f166469f;
    }

    /* access modifiers changed from: protected */
    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructList();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$MentionSavedState */
    public static class MentionSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<MentionSavedState> CREATOR = new Parcelable.Creator<MentionSavedState>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText.MentionSavedState.C741251 */

            static {
                Covode.recordClassIndex(86882);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MentionSavedState[] newArray(int i) {
                return new MentionSavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MentionSavedState createFromParcel(Parcel parcel) {
                return m130353a(parcel);
            }

            /* renamed from: a */
            private static MentionSavedState m130353a(Parcel parcel) {
                try {
                    return new MentionSavedState(parcel, (byte) 0);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        };

        /* renamed from: a */
        public String f166485a;

        /* renamed from: b */
        public int f166486b;

        /* renamed from: c */
        public List<TextExtraStruct> f166487c;

        static {
            Covode.recordClassIndex(86881);
        }

        public MentionSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private MentionSavedState(Parcel parcel) {
            super(parcel);
            this.f166485a = parcel.readString();
            this.f166486b = parcel.readInt();
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            if (readBundle != null) {
                this.f166487c = readBundle.getParcelableArrayList("text_extra_struct");
            }
        }

        /* synthetic */ MentionSavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f166485a);
            parcel.writeInt(this.f166486b);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("text_extra_struct", (ArrayList) this.f166487c);
            parcel.writeBundle(bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$MentionSpan */
    public static class MentionSpan extends ForegroundColorSpan {
        public static final Parcelable.Creator<MentionSpan> CREATOR = new Parcelable.Creator<MentionSpan>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText.MentionSpan.C741261 */

            static {
                Covode.recordClassIndex(86884);
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
        public String f166488a;

        /* renamed from: b */
        public String f166489b;

        /* renamed from: c */
        public int f166490c;

        /* renamed from: d */
        public TextExtraStruct f166491d;

        /* renamed from: e */
        public String f166492e = "";

        /* renamed from: f */
        public int f166493f;

        /* renamed from: g */
        public String f166494g = "";

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(86883);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            String str = this.f166488a;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = i * 31;
            String str2 = this.f166489b;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (((i6 + i2) * 31) + this.f166490c) * 31;
            TextExtraStruct textExtraStruct = this.f166491d;
            if (textExtraStruct != null) {
                i3 = textExtraStruct.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str3 = this.f166492e;
            if (str3 != null) {
                i4 = str3.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (((i8 + i4) * 31) + this.f166493f) * 31;
            String str4 = this.f166494g;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return i9 + i5;
        }

        /* renamed from: a */
        public final void mo116578a(int i) {
            this.f166493f = i;
            this.f166491d.setSubType(i);
        }

        /* renamed from: a */
        public final void mo116579a(String str) {
            this.f166492e = str;
            this.f166491d.setAwemeId(str);
        }

        /* renamed from: a */
        public final void mo116580a(boolean z) {
            this.f166491d.setStarAtlasTag(z);
        }

        protected MentionSpan(Parcel parcel) {
            super(parcel);
            this.f166488a = parcel.readString();
            this.f166489b = parcel.readString();
            this.f166490c = parcel.readInt();
            this.f166491d = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
            this.f166494g = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                MentionSpan mentionSpan = (MentionSpan) obj;
                if (this.f166490c != mentionSpan.f166490c || this.f166493f != mentionSpan.f166493f) {
                    return false;
                }
                String str = this.f166488a;
                if (str == null ? mentionSpan.f166488a != null : !str.equals(mentionSpan.f166488a)) {
                    return false;
                }
                String str2 = this.f166489b;
                if (str2 == null ? mentionSpan.f166489b != null : !str2.equals(mentionSpan.f166489b)) {
                    return false;
                }
                TextExtraStruct textExtraStruct = this.f166491d;
                if (textExtraStruct == null ? mentionSpan.f166491d != null : !textExtraStruct.equals(mentionSpan.f166491d)) {
                    return false;
                }
                String str3 = this.f166492e;
                if (str3 == null ? mentionSpan.f166492e != null : !str3.equals(mentionSpan.f166492e)) {
                    return false;
                }
                String str4 = this.f166494g;
                String str5 = mentionSpan.f166494g;
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
            parcel.writeString(this.f166488a);
            parcel.writeString(this.f166489b);
            parcel.writeInt(this.f166490c);
            parcel.writeParcelable(this.f166491d, i);
            parcel.writeString(this.f166494g);
        }

        public MentionSpan(int i, String str, String str2, int i2, String str3, String str4) {
            super(i);
            this.f166488a = str2;
            this.f166489b = str;
            this.f166490c = i2;
            this.f166494g = str4;
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            this.f166491d = textExtraStruct;
            textExtraStruct.setUserId(str2);
            this.f166491d.setType(i2);
            this.f166491d.setAtUserType(str3);
            this.f166491d.setSecUid(str4);
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$d */
    static class RunnableC74130d implements Runnable {

        /* renamed from: a */
        private WeakReference<MentionEditText> f166498a;

        static {
            Covode.recordClassIndex(86888);
        }

        public final void run() {
            MentionEditText mentionEditText = this.f166498a.get();
            if (mentionEditText != null) {
                mentionEditText.setSelection(mentionEditText.getText().length());
            }
        }

        RunnableC74130d(MentionEditText mentionEditText) {
            this.f166498a = new WeakReference<>(mentionEditText);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo116540c() {
        for (TextWatcher textWatcher : this.f166461B) {
            super.removeTextChangedListener(textWatcher);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo116541d() {
        for (TextWatcher textWatcher : this.f166461B) {
            super.addTextChangedListener(textWatcher);
        }
    }

    public MentionSpan[] getMentionText() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(0, getNoAdTagText().length(), MentionSpan.class);
        Arrays.sort(mentionSpanArr, new C74157p(text));
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
            if (mentionSpan.f166490c == 0) {
                mentionSpan.f166491d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f166491d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f166491d);
            }
        }
        return arrayList;
    }

    public Parcelable onSaveInstanceState() {
        MentionSavedState mentionSavedState = new MentionSavedState(super.onSaveInstanceState());
        mentionSavedState.f166485a = getNoAdTagText();
        mentionSavedState.f166486b = Math.max(getSelectionEnd(), 0);
        mentionSavedState.f166487c = getCompatTextExtraStructList();
        return mentionSavedState;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public ArrayList<TextExtraStruct> getStarAtlasExtraList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        MentionSpan[] mentionText = getMentionText();
        for (MentionSpan mentionSpan : mentionText) {
            if (mentionSpan.f166491d.isStarAtlasTag()) {
                mentionSpan.f166491d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f166491d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f166491d);
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void removeStarAtlas() {
        if (getStarAtlasExtraList() != null && getText() != null) {
            Boolean.valueOf(false);
            mo116495a();
            mo116496a(0);
            Iterator<TextExtraStruct> it = getStarAtlasExtraList().iterator();
            while (it.hasNext()) {
                TextExtraStruct next = it.next();
                if (next.isStarAtlasTag()) {
                    if (getText().charAt(next.getEnd()) == ' ') {
                        getText().replace(next.getStart(), next.getEnd() + 1, "");
                    } else {
                        getText().replace(next.getStart(), next.getEnd(), "");
                    }
                }
            }
            Boolean.valueOf(false);
            mo116501a((String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$AdSpan */
    public static class AdSpan extends ForegroundColorSpan {
        static {
            Covode.recordClassIndex(86880);
        }

        public AdSpan(int i) {
            super(i);
        }
    }

    public void setAddByPaste(boolean z) {
        this.f166480v = z;
    }

    public void setAddChainSuccess(boolean z) {
        this.f166470g = z;
    }

    public void setAddVideoChain(boolean z) {
        this.f166481w = z;
    }

    public void setHasUrlTransforming(boolean z) {
        this.f166477s = z;
    }

    public void setMentionTextColor(int i) {
        this.f166472n = i;
    }

    public void setMentionTextTypeface(int i) {
        this.f166465b = i;
    }

    public void setOnMentionInputListener(AbstractC74129c cVar) {
        this.f166460A = cVar;
    }

    public void setPasteEnd(int i) {
        this.f166467d = i;
    }

    public void setPasteStart(int i) {
        this.f166466c = i;
    }

    public void setPasteUrl(String str) {
        this.f166468e = str;
    }

    public void setRepasteUrl(boolean z) {
        this.f166482x = z;
    }

    public void setRepasteUrlSuccess(boolean z) {
        this.f166471h = z;
    }

    public void setShouldDisableTrim(boolean z) {
        this.f166483y = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void setStarAtlasMentionTextColor(int i) {
        this.f166473o = i;
    }

    public void setTransformingUrlRemoved(boolean z) {
        this.f166484z = z;
    }

    public void setUrlEnd(int i) {
        this.f166479u = i;
    }

    public void setUrlStart(int i) {
        this.f166478t = i;
    }

    public void setVideoPublishEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.f166469f = videoPublishEditModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$b */
    class C74128b implements TextWatcher {
        static {
            Covode.recordClassIndex(86886);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private C74128b() {
        }

        /* synthetic */ C74128b(MentionEditText mentionEditText, byte b) {
            this();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i) && MentionEditText.this.f166460A != null) {
                C39162r.m79460a("click_video_at", new C84425b().mo129406a("enter_from", "video_post_page").mo129406a("enter_method", "input").f188764a);
                MentionEditText.this.f166460A.mo113564a();
            }
        }
    }

    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.f166463D = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        List<TextWatcher> list = this.f166461B;
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
        return new C74127a(onCreateInputConnection, this);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        List<TextWatcher> list = this.f166461B;
        if (list != null && textWatcher != null) {
            list.remove(textWatcher);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MentionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MentionSavedState mentionSavedState = (MentionSavedState) parcelable;
        super.onRestoreInstanceState(mentionSavedState.getSuperState());
        setText(mentionSavedState.f166485a);
        int min = Math.min(mentionSavedState.f166486b, getText().length());
        if (min >= 0) {
            setSelection(min);
        }
        setTextExtraList(mentionSavedState.f166487c);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$a */
    class C74127a extends InputConnectionWrapper {

        /* renamed from: b */
        private EditText f166496b;

        static {
            Covode.recordClassIndex(86885);
        }

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            if (MentionEditText.this.f166463D != null) {
                return MentionEditText.this.f166463D.onKey(MentionEditText.this, keyEvent.getKeyCode(), keyEvent);
            }
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                return super.sendKeyEvent(keyEvent);
            }
            int selectionStart = this.f166496b.getSelectionStart();
            C74159r a = MentionEditText.this.mo116535a(selectionStart, this.f166496b.getSelectionEnd());
            if (a == null) {
                MentionEditText.this.f166474p = false;
                return super.sendKeyEvent(keyEvent);
            } else if (MentionEditText.this.f166474p || selectionStart == a.f166560a) {
                MentionEditText.this.f166474p = false;
                return super.sendKeyEvent(keyEvent);
            } else {
                MentionEditText.this.f166474p = true;
                MentionEditText.this.f166475q = a;
                if (Build.VERSION.SDK_INT >= 25) {
                    setSelection(a.f166560a, a.f166561b);
                } else {
                    setSelection(a.f166561b, a.f166560a);
                }
                return true;
            }
        }

        public final boolean setComposingText(CharSequence charSequence, int i) {
            EditText editText = this.f166496b;
            if (editText == null || !(editText instanceof MentionEditText) || !((MentionEditText) editText).f166477s) {
                return super.setComposingText(charSequence, i);
            }
            return false;
        }

        public final boolean commitText(CharSequence charSequence, int i) {
            try {
                if (MentionEditText.this.f166477s) {
                    return false;
                }
                if (C68044c.m120346a() != 1 || !C74041w.m130201a(charSequence.toString())) {
                    return super.commitText(charSequence, i);
                }
                MentionEditText mentionEditText = MentionEditText.this;
                String charSequence2 = charSequence.toString();
                if (!TextUtils.isEmpty(charSequence2)) {
                    mentionEditText.setHasUrlTransforming(true);
                    int selectionStart = mentionEditText.getSelectionStart();
                    Editable text = mentionEditText.getText();
                    if (text != null) {
                        SpannableString spannableString = new SpannableString(charSequence2 + " ");
                        spannableString.setSpan(new C69763d(mentionEditText.getContext(), mentionEditText), spannableString.length() - 1, spannableString.length(), 33);
                        if (TextUtils.isEmpty(text)) {
                            text.insert(0, spannableString);
                            mentionEditText.setUrlStart(0);
                            mentionEditText.setUrlEnd(spannableString.length() + 1);
                            text.append((CharSequence) " ");
                        } else {
                            int length = text.length();
                            if (selectionStart <= length && selectionStart >= 0) {
                                int min = Math.min(length, Math.max(0, selectionStart));
                                text.insert(min, spannableString);
                                mentionEditText.setUrlStart(min);
                                mentionEditText.setUrlEnd(spannableString.length() + min + 1);
                                text.insert(Math.min(min + spannableString.length(), text.length()), " ");
                            }
                        }
                        C74041w.m130200a(charSequence.toString(), MentionEditText.this.f166478t, MentionEditText.this.f166479u, MentionEditText.this);
                    }
                }
                return true;
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
                            if ((!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).f166490c != 1) && !(characterStyle instanceof StyleSpan)) {
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
                        C74159r a = MentionEditText.this.mo116535a(i7, i8);
                        if (a == null || (mentionSpanArr = (MentionSpan[]) text.getSpans(a.f166560a, a.f166561b, MentionSpan.class)) == null || mentionSpanArr.length <= 0) {
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

        C74127a(InputConnection inputConnection, MentionEditText mentionEditText) {
            super(inputConnection, true);
            this.f166496b = mentionEditText;
        }
    }

    /* renamed from: d */
    public final void mo116542d(String str) {
        Editable text;
        if (!TextUtils.isEmpty(str) && (text = getText()) != null && text.length() >= str.length() && TextUtils.equals(text.toString().substring(0, str.length()), str)) {
            mo116496a(0);
            Boolean.valueOf(true);
            mo116495a();
            text.replace(0, str.length(), "");
            Boolean.valueOf(true);
            mo116501a((String) null);
        }
    }

    public boolean onTextContextMenuItem(int i) {
        if (C68044c.m120346a() != 1 || i != 16908322) {
            return super.onTextContextMenuItem(i);
        }
        if (this.f166477s) {
            return false;
        }
        setAddByPaste(true);
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (getPasteUrl() != null && getPasteStart() >= 0) {
            setHasUrlTransforming(true);
            Editable text = getText();
            if (text == null) {
                return false;
            }
            SpannableString spannableString = new SpannableString(getPasteUrl() + " ");
            spannableString.setSpan(new C69763d(getContext(), this), spannableString.length() - 1, spannableString.length(), 33);
            text.replace(getPasteStart(), getPasteEnd(), spannableString);
            setUrlStart(getPasteStart());
            setUrlEnd(getUrlStart() + spannableString.length() + 1);
            text.insert(Math.min(getPasteStart() + spannableString.length(), text.length()), " ");
            C74041w.m130200a(getPasteUrl(), this.f166478t, this.f166479u, this);
        }
        setPasteUrl(null);
        setPasteStart(-1);
        setPasteEnd(-1);
        return onTextContextMenuItem;
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        Editable text;
        int i;
        this.f166474p = false;
        List<C74159r> list2 = this.f166476r;
        if (list2 != null) {
            list2.clear();
        }
        if (!(list == null || list.isEmpty() || (text = getText()) == null || TextUtils.isEmpty(text.toString()))) {
            int length = text.length();
            for (TextExtraStruct textExtraStruct : list) {
                if (textExtraStruct.isStarAtlasTag()) {
                    i = this.f166473o;
                } else {
                    i = this.f166472n;
                }
                if ((textExtraStruct.getType() == 0 || textExtraStruct.getType() == 5) && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() >= 0) {
                    MentionSpan mentionSpan = new MentionSpan(i, text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getAtUserType(), textExtraStruct.getSecUid());
                    mentionSpan.mo116580a(textExtraStruct.isStarAtlasTag());
                    if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                        mentionSpan.mo116579a(textExtraStruct.getAwemeId());
                    }
                    mentionSpan.mo116578a(textExtraStruct.getSubtype());
                    text.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                    this.f166476r.add(new C74159r(textExtraStruct.getStart(), textExtraStruct.getEnd()));
                }
            }
        }
    }

    /* renamed from: a */
    public final C74159r mo116535a(int i, int i2) {
        List<C74159r> list = this.f166476r;
        if (list == null) {
            return null;
        }
        for (C74159r rVar : list) {
            if (rVar.mo116632a(i, i2)) {
                return rVar;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.widget.EditText
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception unused) {
        }
        if (this.f166464a == null) {
            this.f166464a = new RunnableC74130d(this);
        }
        if (getText().length() > 0) {
            post(this.f166464a);
        }
    }

    public MentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addTextChangedListener(new C74128b(this, (byte) 0));
        Context context2 = getContext();
        if (context2 != null) {
            int i = Build.VERSION.SDK_INT;
            if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
                int i2 = Build.VERSION.SDK_INT;
                setTextAlignment(5);
                setGravity(getGravity() | 8388611);
            }
        }
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
        C74159r rVar = this.f166475q;
        if (rVar != null) {
            if (rVar.f166560a != i || rVar.f166561b != i2) {
                if (rVar.f166560a == i2 && rVar.f166561b == i) {
                    return;
                }
            } else {
                return;
            }
        }
        C74159r a = mo116535a(i, i2);
        if (a != null && a.f166561b == i2) {
            this.f166474p = false;
        }
        List<C74159r> list = this.f166476r;
        if (list != null) {
            for (C74159r rVar2 : list) {
                if ((i > rVar2.f166560a && i < rVar2.f166561b) || (i2 > rVar2.f166560a && i2 < rVar2.f166561b)) {
                    if (i == i2) {
                        try {
                            if ((i - rVar2.f166560a) - (rVar2.f166561b - i) >= 0) {
                                i3 = rVar2.f166561b;
                            } else {
                                i3 = rVar2.f166560a;
                            }
                            setSelection(i3);
                            return;
                        } catch (IndexOutOfBoundsException e) {
                            e.printStackTrace();
                            return;
                        }
                    } else {
                        if (i2 < rVar2.f166561b) {
                            setSelection(i, rVar2.f166561b);
                        }
                        if (i > rVar2.f166560a) {
                            setSelection(rVar2.f166560a, i2);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo116536a(String str, String str2, String str3) {
        return m130341a(0, str, str2, "", str3, false);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f166474p = false;
        List<C74159r> list = this.f166476r;
        if (list != null) {
            list.clear();
        }
        Editable text = getText();
        if (!(text == null || TextUtils.isEmpty(text.toString()))) {
            MentionSpan[] mentionText = getMentionText();
            for (MentionSpan mentionSpan : mentionText) {
                C74159r rVar = new C74159r(text.getSpanStart(mentionSpan), text.getSpanEnd(mentionSpan));
                if (!TextUtils.equals(text.subSequence(rVar.f166560a, rVar.f166561b).toString(), mentionSpan.f166489b)) {
                    text.removeSpan(mentionSpan);
                } else {
                    if (mentionSpan.f166490c == 0 || mentionSpan.f166490c == 5) {
                        this.f166476r.add(rVar);
                    }
                    mo116500a(mentionSpan, rVar);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public boolean addMentionText(int i, String str, String str2, String str3, boolean z) {
        return m130341a(i, str, str2, "", str3, z);
    }

    /* renamed from: a */
    public final boolean mo116538a(String str, boolean z, int i, C65510c cVar, String str2) {
        String str3;
        int i2 = i;
        if (this.f166484z) {
            this.f166484z = false;
            return false;
        } else if (cVar == null) {
            setRepasteUrl(true);
            getText().insert(i2, str2);
            if (this.f166471h && !TextUtils.isEmpty(str)) {
                if ("timeout".equals(str)) {
                    new C23144b(this).mo37640e(R.string.g_m).mo37637b();
                } else {
                    new C23144b(this).mo37635a(str).mo37637b();
                }
                this.f166471h = false;
            }
            return false;
        } else {
            Editable text = getText();
            if (text == null) {
                return false;
            }
            setAddVideoChain(true);
            StringBuilder append = new StringBuilder().append("@");
            C89219l.m154721d(cVar, "");
            AbstractC63201ay ayVar = C63238c.f143580g;
            C89219l.m154716b(ayVar, "");
            Boolean b = ayVar.mo93848b();
            C89219l.m154716b(b, "");
            if (b.booleanValue()) {
                str3 = cVar.f147737c;
            } else {
                str3 = cVar.f147741g;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(append.append(str3).toString());
            MentionSpan mentionSpan = new MentionSpan(this.f166472n, spannableStringBuilder.toString(), Long.toString(cVar.f147736b), 5, " ", cVar.f147738d);
            mentionSpan.mo116579a(Long.toString(cVar.f147735a));
            mentionSpan.mo116578a(6);
            spannableStringBuilder.setSpan(mentionSpan, 0, spannableStringBuilder.length(), 33);
            if (this.f166465b != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(this.f166465b), 0, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.setSpan(new C69753a(getContext(), this), 0, spannableStringBuilder.length(), 33);
            mentionSpan.mo116580a(false);
            String str4 = "paste_long";
            if (i2 == 0) {
                text.insert(0, spannableStringBuilder);
                text.append((CharSequence) " ");
                if (this.f166470g && !TextUtils.isEmpty(str)) {
                    new C23144b(this).mo37635a(str).mo37637b();
                    this.f166470g = false;
                }
                VideoPublishEditModel videoPublishEditModel = this.f166469f;
                if (!z) {
                    str4 = "paste_short";
                }
                C74041w.m130199a(videoPublishEditModel, str4, cVar.f147739e, cVar.f147740f);
                return true;
            }
            int length = text.length();
            if (i2 <= length && i2 >= 0) {
                int i3 = i2 - 1;
                if (TextUtils.equals(text.subSequence(i3, i2), "@")) {
                    text.delete(i3, i2);
                    i2--;
                    length--;
                }
                int min = Math.min(length, Math.max(0, i2));
                text.insert(min, spannableStringBuilder);
                text.insert(Math.min(min + spannableStringBuilder.length(), text.length()), " ");
                if (this.f166470g && !TextUtils.isEmpty(str)) {
                    new C23144b(this).mo37635a(str).mo37637b();
                    this.f166470g = false;
                }
                VideoPublishEditModel videoPublishEditModel2 = this.f166469f;
                if (!z) {
                    str4 = "paste_short";
                }
                C74041w.m130199a(videoPublishEditModel2, str4, cVar.f147739e, cVar.f147740f);
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m130341a(int i, String str, String str2, String str3, String str4, boolean z) {
        int selectionStart;
        String str5;
        int i2;
        if (this.f166477s) {
            return false;
        }
        if (z) {
            selectionStart = 0;
        } else {
            selectionStart = getSelectionStart();
        }
        Editable text = getText();
        if (text == null) {
            return false;
        }
        if (i == 0) {
            str5 = "@";
        } else if (i == 1) {
            str5 = "#";
        } else {
            str5 = "";
        }
        SpannableString spannableString = new SpannableString(str5 + str);
        if (z) {
            i2 = this.f166473o;
        } else {
            i2 = this.f166472n;
        }
        MentionSpan mentionSpan = new MentionSpan(i2, spannableString.toString(), str2, i, str3, str4);
        spannableString.setSpan(mentionSpan, 0, spannableString.length(), 33);
        if (this.f166465b != 0) {
            spannableString.setSpan(new StyleSpan(this.f166465b), 0, spannableString.length(), 33);
        }
        mentionSpan.mo116580a(z);
        MentionSpan[] mentionText = getMentionText();
        if (!z && mentionText != null && Arrays.asList(mentionText).contains(mentionSpan)) {
            return false;
        }
        if (TextUtils.isEmpty(text)) {
            if (z) {
                mo116496a(spannableString.length() + 1);
                Boolean.valueOf(false);
                mo116495a();
            }
            text.insert(0, spannableString);
            text.append((CharSequence) " ");
            if (z) {
                Boolean.valueOf(false);
                mo116501a(((Object) spannableString) + " ");
            }
            return true;
        }
        int length = text.length();
        if (z) {
            mo116496a(spannableString.length() + 1);
            Boolean.valueOf(false);
            mo116495a();
            text.insert(selectionStart, " ");
            text.insert(selectionStart, spannableString);
            Boolean.valueOf(false);
            mo116501a(((Object) spannableString) + " ");
        } else if (selectionStart <= length && selectionStart >= 0) {
            C84911q.m145926b("index = " + selectionStart + " length = " + length + " text = " + text.toString());
            if (selectionStart > 0) {
                int i3 = selectionStart - 1;
                if (TextUtils.equals(text.subSequence(i3, selectionStart), str5)) {
                    text.delete(i3, selectionStart);
                    selectionStart--;
                    length--;
                }
            }
            int min = Math.min(length, Math.max(0, selectionStart));
            if (min > text.length()) {
                C84911q.m145926b("index = " + min + " length = " + length + " text = " + text.toString());
            }
            try {
                text.insert(min, spannableString);
                text.insert(Math.min(min + spannableString.length(), text.length()), " ");
            } catch (IndexOutOfBoundsException e) {
                if (!SettingsManager.m29616a().mo25400a("mention_crash_catch", false)) {
                    throw e;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo116537a(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        if (this.f166477s || str == null || str.isEmpty() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return false;
        }
        int selectionStart = getSelectionStart();
        Editable text = getText();
        if (text == null) {
            return false;
        }
        setAddVideoChain(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@" + str);
        MentionSpan mentionSpan = new MentionSpan(this.f166472n, spannableStringBuilder.toString(), str3, 5, " ", str4);
        mentionSpan.mo116579a(str2);
        mentionSpan.mo116578a(6);
        spannableStringBuilder.setSpan(mentionSpan, 0, spannableStringBuilder.length(), 33);
        if (this.f166465b != 0) {
            spannableStringBuilder.setSpan(new StyleSpan(this.f166465b), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new C69753a(getContext(), this), 0, spannableStringBuilder.length(), 33);
        mentionSpan.mo116580a(false);
        if (TextUtils.isEmpty(text)) {
            text.insert(0, spannableStringBuilder);
            text.append((CharSequence) " ");
            if (this.f166470g) {
                if (i2 == 1) {
                    new C23144b(this).mo37640e(R.string.g_r).mo37637b();
                } else if (i == 143 || i == 2) {
                    new C23144b(this).mo37640e(R.string.g_n).mo37637b();
                } else if (i == 144) {
                    new C23144b(this).mo37640e(R.string.g_h).mo37637b();
                }
                this.f166470g = false;
            }
            C74041w.m130199a(this.f166469f, str5, i, i2);
            return true;
        }
        int length = text.length();
        if (selectionStart <= length && selectionStart >= 0) {
            if (selectionStart > 0) {
                int i3 = selectionStart - 1;
                if (TextUtils.equals(text.subSequence(i3, selectionStart), "@")) {
                    text.delete(i3, selectionStart);
                    selectionStart--;
                    length--;
                }
            }
            int min = Math.min(length, Math.max(0, selectionStart));
            text.insert(min, spannableStringBuilder);
            text.insert(Math.min(min + spannableStringBuilder.length(), text.length()), " ");
            if (this.f166470g) {
                if (i2 == 1) {
                    new C23144b(this).mo37640e(R.string.g_r).mo37637b();
                } else if (i == 143 || i == 2) {
                    new C23144b(this).mo37640e(R.string.g_n).mo37637b();
                } else if (i == 144) {
                    new C23144b(this).mo37640e(R.string.g_h).mo37637b();
                }
                this.f166470g = false;
            }
            C74041w.m130199a(this.f166469f, str5, i, i2);
        }
        return true;
    }
}

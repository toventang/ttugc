package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.emoji.widget.C0907b;
import com.bytedance.android.live.design.C4052a;
import com.bytedance.android.live.design.widget.p235b.C4127e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class LiveEditText extends AppCompatEditText {

    /* renamed from: a */
    private static final boolean f11506a = C4052a.C4053a.f11190a.mo9495a();

    /* renamed from: b */
    private C0907b f11507b;

    /* renamed from: c */
    private boolean f11508c;

    /* renamed from: d */
    private C4127e f11509d;

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().f3262b;
    }

    static {
        Covode.recordClassIndex(4675);
    }

    private C0907b getEmojiEditTextHelper() {
        if (this.f11507b == null) {
            this.f11507b = new C0907b(this);
        }
        return this.f11507b;
    }

    public LiveEditText(Context context) {
        this(context, null);
    }

    public void setMaxEmojiCount(int i) {
        getEmojiEditTextHelper().mo3210a(i);
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        this.f11509d.mo9633a(i);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (f11506a) {
            return getEmojiEditTextHelper().mo3209a(onCreateInputConnection, editorInfo);
        }
        return onCreateInputConnection;
    }

    public void setKeyListener(KeyListener keyListener) {
        if (f11506a && keyListener != null) {
            keyListener = getEmojiEditTextHelper().mo3208a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public LiveEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveEditText(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.sd);
        if (!this.f11508c) {
            this.f11508c = true;
            C4127e eVar = new C4127e(this);
            this.f11509d = eVar;
            eVar.mo9537a(attributeSet, R.attr.sd, 0);
            if (f11506a) {
                setMaxEmojiCount(Integer.MAX_VALUE);
                setKeyListener(super.getKeyListener());
            }
        }
    }
}

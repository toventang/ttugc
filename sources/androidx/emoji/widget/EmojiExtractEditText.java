package androidx.emoji.widget;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;

public class EmojiExtractEditText extends ExtractEditText {

    /* renamed from: a */
    private C0907b f3258a;

    /* renamed from: b */
    private boolean f3259b;

    static {
        Covode.recordClassIndex(992);
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().f3263c;
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().f3262b;
    }

    private C0907b getEmojiEditTextHelper() {
        if (this.f3258a == null) {
            this.f3258a = new C0907b(this);
        }
        return this.f3258a;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0823h.m2905a(this, callback));
    }

    public void setMaxEmojiCount(int i) {
        getEmojiEditTextHelper().mo3210a(i);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().mo3209a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public void setEmojiReplaceStrategy(int i) {
        C0907b emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.f3263c = i;
        emojiEditTextHelper.f3261a.mo3214b(i);
    }

    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().mo3208a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.f3259b) {
            this.f3259b = true;
            setMaxEmojiCount(new C0906a(this, attributeSet).f3260a);
            setKeyListener(super.getKeyListener());
        }
    }
}

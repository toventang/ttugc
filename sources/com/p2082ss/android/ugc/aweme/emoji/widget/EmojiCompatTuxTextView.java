package com.p2082ss.android.ugc.aweme.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.emoji.widget.C0915g;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.emoji.lego.EmojiCompatTask;
import com.p2082ss.android.ugc.aweme.emoji.p2896a.C46445a;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.widget.EmojiCompatTuxTextView */
public class EmojiCompatTuxTextView extends TuxTextView {

    /* renamed from: a */
    private C0915g f108819a;

    static {
        Covode.recordClassIndex(55266);
    }

    public EmojiCompatTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final boolean getEnableEmojiCompat() {
        if (!C46445a.m89641a() || !EmojiCompatTask.f108605a) {
            return false;
        }
        return true;
    }

    private final C0915g getEmojiTextViewHelper() {
        if (this.f108819a == null) {
            this.f108819a = new C0915g(this);
        }
        C0915g gVar = this.f108819a;
        Objects.requireNonNull(gVar, "null cannot be cast to non-null type androidx.emoji.widget.EmojiTextViewHelper");
        return gVar;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (getEnableEmojiCompat()) {
            getEmojiTextViewHelper().mo3224a(z);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        C89219l.m154721d(inputFilterArr, "");
        if (getEnableEmojiCompat()) {
            super.setFilters(getEmojiTextViewHelper().mo3225a(inputFilterArr));
        } else {
            super.setFilters(inputFilterArr);
        }
    }

    private /* synthetic */ EmojiCompatTuxTextView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiCompatTuxTextView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        if (getEnableEmojiCompat()) {
            getEmojiTextViewHelper().f3274a.mo3226a();
        }
    }
}

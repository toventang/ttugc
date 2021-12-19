package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.emoji.p045a.C0877a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.emoji.lego.EmojiCompatTask;
import com.p2082ss.android.ugc.aweme.emoji.p2896a.C46445a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SolidEmojiTuxTextView */
public final class SolidEmojiTuxTextView extends TuxTextView {

    /* renamed from: a */
    private final String f124745a;

    /* renamed from: b */
    private int f124746b;

    static {
        Covode.recordClassIndex(64164);
    }

    public SolidEmojiTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final boolean getEnableEmojiCompat() {
        if (!C46445a.m89641a() || !EmojiCompatTask.f108605a) {
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i) {
        if (getEnableEmojiCompat()) {
            this.f124746b = i;
        } else {
            super.setTextColor(i);
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!getEnableEmojiCompat() || charSequence == null || charSequence.length() == 0) {
            super.setText(charSequence, bufferType);
            return;
        }
        if (EmojiCompatTask.f108605a) {
            try {
                CharSequence a = C0877a.m3052a().mo3162a(charSequence);
                C89219l.m154716b(a, "");
                SpannableString valueOf = SpannableString.valueOf(a);
                C89219l.m154709a((Object) valueOf, "");
                C89269g gVar = new C89269g(0, valueOf.length());
                valueOf.setSpan(new ForegroundColorSpan(this.f124746b), Integer.valueOf(gVar.f202927a).intValue(), Integer.valueOf(gVar.f202928b).intValue(), 17);
                charSequence = valueOf;
            } catch (IllegalAccessException unused) {
                String str = this.f124745a;
                C89219l.m154716b(str, "");
                C56244a.m102193e(str, "EmojiCompat not initialized");
            }
        }
        super.setText(charSequence, bufferType);
    }

    private /* synthetic */ SolidEmojiTuxTextView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SolidEmojiTuxTextView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f124745a = getClass().getSimpleName();
    }
}

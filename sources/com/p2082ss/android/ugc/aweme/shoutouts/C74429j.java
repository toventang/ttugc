package com.p2082ss.android.ugc.aweme.shoutouts;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.j */
public final class C74429j implements InputFilter {

    /* renamed from: a */
    public boolean f167380a;

    /* renamed from: b */
    private final int f167381b = 150;

    /* renamed from: c */
    private MentionEditText f167382c;

    static {
        Covode.recordClassIndex(87207);
    }

    public C74429j(MentionEditText mentionEditText) {
        this.f167382c = mentionEditText;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length;
        MentionEditText.AdSpan[] adSpanArr = (MentionEditText.AdSpan[]) spanned.getSpans(0, spanned.length(), MentionEditText.AdSpan.class);
        if (TextUtils.isEmpty(this.f167382c.getAdTag())) {
            length = this.f167381b - (spanned.length() - (i4 - i3));
        } else if (adSpanArr.length == 0) {
            return null;
        } else {
            length = this.f167381b - (this.f167382c.getNoAdTagText().length() - (i4 - i3));
        }
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                new C79459a(C51427a.f118503a).mo123050a(R.string.hc7).mo123053a();
                this.f167380a = true;
            }
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            if (!Character.isHighSurrogate(charSequence.charAt(i5 - 1)) || i5 - 1 != i) {
                new C79459a(C51427a.f118503a).mo123050a(R.string.hc7).mo123053a();
                this.f167380a = true;
                return charSequence.subSequence(i, i5);
            }
            new C79459a(C51427a.f118503a).mo123050a(R.string.hc7).mo123053a();
            this.f167380a = true;
            return "";
        }
    }
}

package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.feed;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3107a.C54086b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b.C54101a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.SearchableEditText;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3196a.C55326b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView */
public final class DetailFeedInputView extends BaseInputView implements TextWatcher, View.OnClickListener {

    /* renamed from: j */
    public AbstractC54294a f124370j;

    /* renamed from: k */
    private boolean f124371k = true;

    /* renamed from: l */
    private String f124372l = "";

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView$a */
    public interface AbstractC54294a {
        static {
            Covode.recordClassIndex(63989);
        }

        /* renamed from: a */
        void mo91381a();
    }

    static {
        Covode.recordClassIndex(63988);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91243a(C46447a aVar) {
        C89219l.m154721d(aVar, "");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: r */
    public final boolean mo91250r() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: o */
    public final void mo91229o() {
        C54086b.m99274a("chat_video_detail");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: p */
    public final void mo91235p() {
        C54086b.m99275b("chat_video_detail");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: j */
    public final void mo91224j() {
        super.mo91224j();
        SearchableEditText a = mo91200a();
        a.removeTextChangedListener(this);
        a.addTextChangedListener(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    public final void onDestroy() {
        mo91200a().removeTextChangedListener(this);
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: q */
    public final void mo91249q() {
        C55059b.m100694b("enter_from", "chat_video_detail");
        AbstractC54294a aVar = this.f124370j;
        if (aVar != null) {
            aVar.mo91381a();
        }
        mo91227m();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: b */
    public final void mo91216b(boolean z) {
        super.mo91216b(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: a */
    public final C54101a.C54104b mo91199a(C54101a.C54104b bVar) {
        C89219l.m154721d(bVar, "");
        return bVar.mo91192f().mo91189c();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: a */
    public final void mo91212a(String str) {
        C89219l.m154721d(str, "");
        super.mo91212a(str);
    }

    /* renamed from: c */
    private final void m99569c(boolean z) {
        int i;
        boolean isActivated = mo91217c().isActivated();
        mo91217c().setActivated(z);
        mo91217c().setEnabled(z);
        TuxIconView c = mo91217c();
        if (z) {
            i = R.attr.ay;
        } else {
            i = R.attr.ad;
        }
        c.setTintColorRes(i);
        if (z && !isActivated) {
            C55326b.m101137a(mo91217c());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: a */
    public final void mo91204a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View findViewById = viewGroup.findViewById(R.id.cmi);
        C89219l.m154716b(findViewById, "");
        mo91211a((SearchableEditText) findViewById);
        View findViewById2 = viewGroup.findViewById(R.id.arr);
        C89219l.m154716b(findViewById2, "");
        mo91203a(findViewById2);
        View findViewById3 = viewGroup.findViewById(R.id.au7);
        C89219l.m154716b(findViewById3, "");
        mo91205a((TuxIconView) findViewById3);
        View findViewById4 = viewGroup.findViewById(R.id.dvb);
        C89219l.m154716b(findViewById4, "");
        mo91215b((TuxIconView) findViewById4);
        View findViewById5 = viewGroup.findViewById(R.id.cyt);
        C89219l.m154716b(findViewById5, "");
        mo91209a((SoftInputResizeFuncLayoutView) findViewById5);
        mo91225k();
        super.mo91204a(viewGroup);
    }

    public final void afterTextChanged(Editable editable) {
        int i;
        boolean z;
        String valueOf = String.valueOf(editable);
        int length = valueOf.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (C89219l.m154703a(valueOf.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                if (!z) {
                    break;
                }
                length--;
            } else if (!z) {
                z2 = true;
            } else {
                i2++;
            }
        }
        if (TextUtils.isEmpty(valueOf.subSequence(i2, length + 1).toString())) {
            m99569c(false);
            mo91200a().setMaxLines(1);
            mo91200a().setHint(this.f124372l);
            return;
        }
        m99569c(true);
        if (this.f124371k) {
            mo91200a().setMaxLines(5);
            mo91200a().setHint("");
            this.f124371k = false;
        }
    }

    public DetailFeedInputView(ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        mo91204a(viewGroup);
        mo91224j();
        if (bundle != null) {
            CharSequence charSequence = bundle.getCharSequence("hint");
            if (charSequence != null) {
                this.f124372l = charSequence.toString();
            }
            if (bundle.getBoolean("showEmojiPanel")) {
                mo91201a(1);
                mo91214b().setSelected(true);
            } else {
                mo91201a(-2);
                mo91214b().setSelected(false);
                mo91200a().requestFocus();
                z = false;
            }
            mo91213a(z);
        }
    }
}

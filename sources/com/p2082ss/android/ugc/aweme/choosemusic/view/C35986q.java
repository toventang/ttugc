package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractView$OnClickListenerC35761a;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39079ae;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60822a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.q */
public final class C35986q extends AbstractC35966c {
    static {
        Covode.recordClassIndex(43232);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35966c
    /* renamed from: d */
    public final void mo63108d() {
        EditText editText = this.f84916j;
        C89219l.m154716b(editText, "");
        editText.setFilters(new InputFilter[]{new C39079ae()});
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35966c
    /* renamed from: c */
    public final void mo63107c() {
        if (!C60822a.C60823a.m110420a("show_tcm_info", (Boolean) true, "music_sp") || !CommerceMediaServiceImpl.m77578f().mo66516d() || CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            StarTcmItem starTcmItem = this.f84921o;
            C89219l.m154716b(starTcmItem, "");
            starTcmItem.setVisibility(8);
            return;
        }
        StarTcmItem starTcmItem2 = this.f84921o;
        C89219l.m154716b(starTcmItem2, "");
        starTcmItem2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35986q(View view, AbstractView$OnClickListenerC35761a aVar, int i, TextWatcher textWatcher) {
        super(view, aVar, i, textWatcher);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(textWatcher, "");
    }
}

package com.bytedance.android.live.publicscreen.impl.model.chat;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f;
import com.bytedance.android.live.publicscreen.impl.p400f.C5967b;
import com.bytedance.android.livesdk.chatroom.p488c.C7382ao;
import com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7885cz;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.b */
public class C5993b extends AbstractC5988a<C9878i> implements AbstractC6017f {

    /* renamed from: h */
    private boolean f15043h;

    /* renamed from: i */
    private boolean f15044i;

    /* renamed from: j */
    private CharSequence f15045j;

    static {
        Covode.recordClassIndex(6603);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f
    /* renamed from: c */
    public final boolean mo11877c() {
        return this.f15043h;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f
    /* renamed from: s */
    public final boolean mo11878s() {
        return this.f15044i;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f
    /* renamed from: t */
    public final CharSequence mo11879t() {
        return this.f15045j;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9878i) this.f14737d).f23854g;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h, com.bytedance.android.live.publicscreen.impl.model.chat.AbstractC5988a
    /* renamed from: r */
    public final void mo11692r() {
        super.mo11692r();
        this.f15043h = false;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f
    /* renamed from: u */
    public final CharSequence mo11880u() {
        return mo11710z();
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public CharSequence mo10374a() {
        if (TextUtils.isEmpty(mo11871v())) {
            return "";
        }
        String a = C4054a.m9854a(((C9878i) this.f14737d).f23853f);
        if (TextUtils.isEmpty(a)) {
            return "";
        }
        SpannableString spannableString = new SpannableString(a);
        spannableString.setSpan(new AbstractC7885cz() {
            /* class com.bytedance.android.live.publicscreen.impl.model.chat.C5993b.C59941 */

            static {
                Covode.recordClassIndex(6604);
            }

            @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7885cz
            /* renamed from: a */
            public final void mo11881a(View view) {
            }

            public final void updateDrawState(TextPaint textPaint) {
            }

            public final void onClick(View view) {
                C5993b bVar = C5993b.this;
                CharSequence v = bVar.mo11871v();
                if (bVar.mo10375b() != null && !TextUtils.isEmpty(v)) {
                    C7382ao aoVar = new C7382ao(v.toString(), "positive_reply");
                    aoVar.f18301e = bVar.mo10375b();
                    C6779a.m14563a().mo13053a(aoVar);
                }
                C5967b.m13085b(bVar.f14737d);
            }
        }, 0, spannableString.length(), 33);
        return spannableString;
    }

    public C5993b(C9878i iVar) {
        super(iVar);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f
    /* renamed from: a */
    public final void mo11874a(CharSequence charSequence) {
        this.f15045j = charSequence;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f
    /* renamed from: b */
    public final void mo11876b(boolean z) {
        this.f15043h = z;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f
    /* renamed from: a */
    public final void mo11875a(boolean z) {
        this.f15044i = z;
    }
}

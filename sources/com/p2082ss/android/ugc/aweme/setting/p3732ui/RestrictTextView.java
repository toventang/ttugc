package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.setting.model.C68181k;
import com.p2082ss.android.ugc.aweme.setting.model.C68182l;
import com.p2082ss.android.ugc.aweme.setting.p3723k.AbstractC68122d;
import com.p2082ss.android.ugc.aweme.setting.p3723k.C68123e;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.RestrictTextView */
public class RestrictTextView extends TuxTextView implements AbstractC68122d {

    /* renamed from: a */
    private C68123e f153312a;

    /* renamed from: b */
    private String f153313b;

    static {
        Covode.recordClassIndex(80750);
    }

    public RestrictTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo109008a(String str) {
        this.f153313b = str;
        this.f153312a.mo108688a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.p3723k.AbstractC68122d
    /* renamed from: a */
    public final void mo108687a(C68181k kVar) {
        if (TextUtils.equals(kVar.f152659a, this.f153313b)) {
            setVisibility(0);
            setText(C1764a.m5928a("Review time:%s \nReview AllFriends:%s ", new Object[]{kVar.f152660b, kVar.f152661c}));
        }
    }

    public RestrictTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private RestrictTextView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 16842884);
        this.f153312a = new C68123e(new C68182l(), this);
    }
}

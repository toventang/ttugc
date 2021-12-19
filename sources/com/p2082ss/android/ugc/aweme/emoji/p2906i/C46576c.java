package com.p2082ss.android.ugc.aweme.emoji.p2906i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46577a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.c */
public final class C46576c extends C46448b {

    /* renamed from: b */
    protected int f108597b;

    /* renamed from: c */
    private Context f108598c;

    /* renamed from: d */
    private C46577a f108599d = new C46577a();

    static {
        Covode.recordClassIndex(55163);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: a */
    public final int mo78964a() {
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: h */
    public final int mo78973h() {
        return 20;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: k */
    public final int mo78976k() {
        m89881n();
        return this.f108597b;
    }

    /* renamed from: n */
    private void m89881n() {
        if (this.f108597b == 0) {
            this.f108597b = this.f108599d.mo79100a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: d */
    public final Drawable mo78969d() {
        return this.f108599d.mo79101a(this.f108598c);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: g */
    public final int mo78972g() {
        m89881n();
        int i = this.f108597b;
        if (i == 0) {
            return 1;
        }
        return ((i - 1) / 20) + 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: l */
    public final String mo78977l() {
        return String.valueOf(mo78975j());
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: m */
    public final List<C46447a> mo78978m() {
        C46577a aVar = this.f108599d;
        return aVar.mo79103a(0, aVar.mo79100a());
    }

    public C46576c(Context context) {
        this.f108598c = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: b */
    public final List<C46447a> mo78967b(int i) {
        List<C46447a> a = this.f108599d.mo79103a(i * 20, 20);
        C46447a aVar = new C46447a();
        aVar.f108221a = R.drawable.a7g;
        a.add(aVar);
        return a;
    }
}

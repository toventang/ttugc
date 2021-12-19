package com.p2082ss.android.ugc.aweme.emoji.systembigemoji;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.C46516b;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46459a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.c */
public class C46625c extends C46448b {

    /* renamed from: c */
    public List<C46534a> f108728c;

    /* renamed from: d */
    public C46516b f108729d;

    static {
        Covode.recordClassIndex(55216);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: a */
    public int mo78964a() {
        return 2131231992;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: j */
    public int mo78975j() {
        return 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: b */
    public final String mo78966b() {
        return this.f108729d.getIconUrl();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: d */
    public final Drawable mo78969d() {
        return super.mo78969d();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: e */
    public String mo78970e() {
        return this.f108729d.getDisplayName();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: h */
    public final int mo78973h() {
        if (mo78974i()) {
            return 8;
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: i */
    public boolean mo78974i() {
        List<C46534a> list = this.f108728c;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: k */
    public final int mo78976k() {
        List<C46534a> list = this.f108728c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: g */
    public int mo78972g() {
        if (!mo78974i()) {
            return 1;
        }
        return ((this.f108728c.size() - 1) / 8) + 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: l */
    public String mo78977l() {
        return mo78975j() + "-" + this.f108729d.getId();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: m */
    public final List<C46447a> mo78978m() {
        C46534a aVar;
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i < this.f108728c.size(); i++) {
            C46447a aVar2 = new C46447a();
            if (i >= 0 && i < this.f108728c.size() && (aVar = this.f108728c.get(i)) != null) {
                aVar2.f108223c = C46459a.m89690b(aVar);
                aVar2.f108224d = aVar;
            }
            arrayList.add(aVar2);
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f, com.p2082ss.android.ugc.aweme.emoji.p2897b.C46448b
    /* renamed from: b */
    public List<C46447a> mo78967b(int i) {
        C46534a aVar;
        ArrayList arrayList = new ArrayList(8);
        for (int i2 = i * 8; i2 < (i + 1) * 8; i2++) {
            C46447a aVar2 = new C46447a();
            if (i2 >= 0 && i2 < this.f108728c.size() && (aVar = this.f108728c.get(i2)) != null) {
                aVar2.f108223c = C46459a.m89690b(aVar);
                aVar2.f108224d = aVar;
            }
            arrayList.add(aVar2);
        }
        return arrayList;
    }
}

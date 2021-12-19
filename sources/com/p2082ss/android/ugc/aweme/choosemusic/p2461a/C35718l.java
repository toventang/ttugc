package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35771af;
import com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58186a;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.l */
public final class C35718l extends AbstractC58186a {

    /* renamed from: a */
    public final ArrayList<C35771af> f84252a;

    /* renamed from: b */
    public final ArrayList<MusicCollectionItem> f84253b;

    /* renamed from: c */
    private AbstractC0952i f84254c;

    /* renamed from: f */
    private String f84255f;

    /* renamed from: g */
    private String f84256g;

    /* renamed from: h */
    private String f84257h;

    /* renamed from: i */
    private boolean f84258i;

    /* renamed from: j */
    private String f84259j;

    /* renamed from: k */
    private int f84260k;

    /* renamed from: l */
    private int f84261l;

    static {
        Covode.recordClassIndex(42950);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f84253b.size();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58188b
    /* renamed from: a */
    public final /* synthetic */ Fragment mo62762a(int i) {
        C35771af afVar = this.f84252a.get(i);
        C89219l.m154716b(afVar, "");
        return afVar;
    }

    private C35718l(AbstractC0952i iVar) {
        super(iVar);
        this.f84252a = new ArrayList<>();
        this.f84253b = new ArrayList<>();
    }

    /* renamed from: a */
    public final void mo62763a(String str, String str2, boolean z, C33935b<String, Object> bVar, int i) {
        this.f84252a.add(C35771af.m72985a(str, str2, this.f84257h, this.f84261l, z, this.f84259j, 2, bVar, i, null, false));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C35718l(AbstractC0952i iVar, String str, String str2, String str3, int i, boolean z, String str4, int i2) {
        this(iVar);
        C89219l.m154721d(iVar, "");
        this.f84254c = iVar;
        this.f84255f = str;
        this.f84256g = str2;
        this.f84257h = str3;
        this.f84261l = i;
        this.f84258i = z;
        this.f84257h = str3;
        this.f84259j = str4;
        this.f84260k = i2;
    }
}

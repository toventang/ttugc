package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.C57221p;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;
import com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58186a;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a.j */
public final class C57186j extends AbstractC58186a {

    /* renamed from: a */
    public final ArrayList<C57221p> f130212a;

    /* renamed from: b */
    public final ArrayList<C57110d> f130213b;

    /* renamed from: c */
    private AbstractC0952i f130214c;

    /* renamed from: f */
    private String f130215f;

    /* renamed from: g */
    private String f130216g;

    /* renamed from: h */
    private String f130217h;

    /* renamed from: i */
    private boolean f130218i;

    /* renamed from: j */
    private String f130219j;

    /* renamed from: k */
    private int f130220k;

    /* renamed from: l */
    private int f130221l;

    static {
        Covode.recordClassIndex(67087);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f130213b.size();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58188b
    /* renamed from: a */
    public final /* synthetic */ Fragment mo62762a(int i) {
        C57221p pVar = this.f130212a.get(i);
        C89219l.m154716b(pVar, "");
        return pVar;
    }

    private C57186j(AbstractC0952i iVar) {
        super(iVar);
        this.f130212a = new ArrayList<>();
        this.f130213b = new ArrayList<>();
    }

    /* renamed from: a */
    public final void mo94385a(String str, String str2, boolean z, C33935b<String, Object> bVar) {
        this.f130212a.add(C57221p.m103754a(str, str2, this.f130217h, this.f130221l, z, this.f130219j, 2, bVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C57186j(AbstractC0952i iVar, String str, String str2, String str3, int i, boolean z, String str4, int i2) {
        this(iVar);
        C89219l.m154721d(iVar, "");
        this.f130214c = iVar;
        this.f130215f = str;
        this.f130216g = str2;
        this.f130217h = str3;
        this.f130221l = i;
        this.f130218i = z;
        this.f130217h = str3;
        this.f130219j = str4;
        this.f130220k = i2;
    }
}

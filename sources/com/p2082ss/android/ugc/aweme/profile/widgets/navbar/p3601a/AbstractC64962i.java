package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a;

import android.text.SpannableStringBuilder;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC64966a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.i */
public abstract class AbstractC64962i extends AbstractC64941c<EnumC64966a, C23194g> {

    /* renamed from: h */
    private AbstractC64958g f146801h;

    static {
        Covode.recordClassIndex(76430);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.profile.widgets.navbar.b.c' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ EnumC64966a mo104273v() {
        return EnumC64966a.Nickname;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public void mo20518f() {
        super.mo20518f();
        this.f146801h = (AbstractC64958g) C12801d.m23023b(this, C89204ab.m154669a(AbstractC64958g.class));
        mo104291a(new C64963a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.i$a */
    static final class C64963a extends AbstractC89220m implements AbstractC89172b<C23194g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC64962i f146802a;

        static {
            Covode.recordClassIndex(76431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64963a(AbstractC64962i iVar) {
            super(1);
            this.f146802a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23194g gVar) {
            C23194g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            this.f146802a.mo104269a(gVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static CharSequence m116720a(User user) {
        String nickname;
        if (user == null || (nickname = user.getNickname()) == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nickname);
        spannableStringBuilder.setSpan(new C23126b(33), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public static CharSequence m116721b(User user) {
        UserPronounsInfo pronounsInfo;
        String pronouns;
        if (user == null || (pronounsInfo = user.getPronounsInfo()) == null || (pronouns = pronounsInfo.getPronouns()) == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pronouns);
        spannableStringBuilder.setSpan(new C23126b(62), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public final void mo104291a(AbstractC89172b<? super C23194g, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC64958g gVar = this.f146801h;
        if (gVar == null) {
            C89219l.m154710a("service");
        }
        gVar.mo104280b(EnumC64966a.Nickname, bVar);
    }
}

package com.p2082ss.android.ugc.aweme.comment.gift;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.util.rxutils.p646a.C11122a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.h */
public final class C36466h extends RecyclerView.ViewHolder {

    /* renamed from: a */
    GiftStruct f86202a;

    /* renamed from: b */
    long f86203b = -1;

    /* renamed from: c */
    final C36458f f86204c;

    /* renamed from: d */
    final View f86205d;

    /* renamed from: e */
    final ActivityC0945e f86206e;

    /* renamed from: f */
    final String f86207f;

    /* renamed from: g */
    final GiftViewModel f86208g;

    /* renamed from: h */
    final String f86209h;

    /* renamed from: i */
    final String f86210i;

    /* renamed from: j */
    final String f86211j;

    /* renamed from: k */
    private final Fragment f86212k;

    static {
        Covode.recordClassIndex(43764);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36466h(View view, Fragment fragment, ActivityC0945e eVar, String str, GiftViewModel giftViewModel, String str2, String str3, String str4) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(giftViewModel, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f86205d = view;
        this.f86212k = fragment;
        this.f86206e = eVar;
        this.f86207f = str;
        this.f86208g = giftViewModel;
        this.f86209h = str2;
        this.f86210i = str3;
        this.f86211j = str4;
        this.f86204c = new C36458f(fragment, eVar, giftViewModel, str2, str3, str4);
        C11122a.m19756a(view).mo143301g(1, TimeUnit.SECONDS).mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.comment.gift.C36466h.C364671 */

            /* renamed from: a */
            final /* synthetic */ C36466h f86213a;

            static {
                Covode.recordClassIndex(43765);
            }

            {
                this.f86213a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final void accept(Object obj) {
                C36466h hVar = this.f86213a;
                if (hVar.f86202a != null) {
                    long j = hVar.f86203b;
                    GiftStruct giftStruct = hVar.f86202a;
                    if (giftStruct == null) {
                        C89219l.m154715b();
                    }
                    if (j == giftStruct.getId()) {
                        hVar.f86208g.mo63841b().setValue(null);
                        return;
                    }
                    GiftStruct giftStruct2 = hVar.f86202a;
                    if (giftStruct2 == null) {
                        C89219l.m154715b();
                    }
                    Long valueOf = Long.valueOf(giftStruct2.getId());
                    if (!(valueOf == null || valueOf.longValue() == 0)) {
                        C33744d a = new C33744d().mo59983a("enter_from", hVar.f86209h).mo59983a("gift_tab", hVar.f86207f).mo59983a("group_id", hVar.f86210i).mo59983a("author_id", hVar.f86211j).mo59981a("gift_id", valueOf.longValue());
                        C89219l.m154716b(a, "");
                        C39162r.m79460a("choose_gift", a.f79943a);
                    }
                    GiftViewModel giftViewModel = hVar.f86208g;
                    GiftStruct giftStruct3 = hVar.f86202a;
                    if (giftStruct3 == null) {
                        C89219l.m154715b();
                    }
                    long id = giftStruct3.getId();
                    GiftStruct giftStruct4 = hVar.f86202a;
                    if (giftStruct4 == null) {
                        C89219l.m154715b();
                    }
                    giftViewModel.mo63836a(id, giftStruct4.getEffectAsset());
                    Long value = hVar.f86208g.mo63843d().getValue();
                    if (value == null || value.longValue() != -1) {
                        GiftStruct giftStruct5 = hVar.f86202a;
                        if (giftStruct5 == null) {
                            C89219l.m154715b();
                        }
                        long diamondCount = (long) giftStruct5.getDiamondCount();
                        Long value2 = hVar.f86208g.mo63843d().getValue();
                        if (value2 == null) {
                            value2 = 0L;
                        }
                        C89219l.m154716b(value2, "");
                        if (diamondCount > value2.longValue()) {
                            hVar.f86204c.mo63786a("video_gift_select_insufficient_balance");
                            C33744d a2 = new C33744d().mo59983a("enter_method", "select_gift").mo59983a("enter_from", hVar.f86209h).mo59983a("group_id", hVar.f86210i).mo59983a("author_id", hVar.f86211j).mo59982a("current_balance", hVar.f86208g.mo63843d().getValue());
                            C89219l.m154716b(a2, "");
                            C39162r.m79460a("enter_coin_recharge", a2.f79943a);
                            return;
                        }
                    }
                    hVar.f86208g.mo63841b().setValue(hVar.f86202a);
                }
            }
        });
    }
}

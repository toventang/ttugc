package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3160a;

import android.view.View;
import androidx.p025c.C0484a;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.p3155a.C54916a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3156b.p3157a.C54919a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54833b;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.b */
public final class C54924b extends RecyclerView.ViewHolder implements AbstractC66619c {

    /* renamed from: a */
    final AbstractC66617b f125734a;

    /* renamed from: b */
    public final RecommendFriendInDMViewModel f125735b;

    static {
        Covode.recordClassIndex(64646);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: a */
    public final void mo91924a(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        C54916a.m100541b();
        if (fVar == EnumC66622f.CONTACT) {
            C54833b.C54838e eVar = C54833b.C54838e.f125608a;
            C89219l.m154721d(eVar, "");
            C0484a aVar = new C0484a();
            aVar.put("enter_from", "message_rec");
            eVar.invoke("show_user_authorize_pop_up", aVar);
            return;
        }
        C39162r.m79460a("friend_list_notify_show", new C33744d().mo59983a("platform", "fb").mo59983a("enter_from", "message_rec").f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: b */
    public final void mo91925b(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        if (fVar == EnumC66622f.CONTACT) {
            this.f125735b.mo91929a();
            View view = this.itemView;
            C89219l.m154716b(view, "");
            new C23144b(view).mo37640e(R.string.atd).mo37637b();
            return;
        }
        this.f125735b.mo91930b();
        this.f125735b.mo91929a();
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        new C23144b(view2).mo37640e(R.string.gfn).mo37637b();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.AbstractC66619c
    /* renamed from: c */
    public final void mo91926c(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        if (fVar == EnumC66622f.CONTACT) {
            RecommendFriendInDMViewModel recommendFriendInDMViewModel = this.f125735b;
            List<C54919a> value = recommendFriendInDMViewModel.f125757c.getValue();
            T t = null;
            if (value != null) {
                Iterator<T> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.f125729c == 1) {
                        t = next;
                        break;
                    }
                }
            }
            List<C54919a> value2 = recommendFriendInDMViewModel.f125757c.getValue();
            if (value2 != null) {
                Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                C89206ad.m154680b(value2).remove(t);
            }
            recommendFriendInDMViewModel.f125757c.setValue(recommendFriendInDMViewModel.f125757c.getValue());
            return;
        }
        this.f125735b.mo91930b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54924b(AbstractC66617b bVar, RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
        super(bVar.getContainer());
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(recommendFriendInDMViewModel, "");
        this.f125734a = bVar;
        this.f125735b = recommendFriendInDMViewModel;
        bVar.setActionListener(this);
        bVar.setEnterFrom("message_rec");
        bVar.setUFRSubscription(recommendFriendInDMViewModel.f125756b);
    }
}

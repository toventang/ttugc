package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.feed.api.C48337k;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.q */
public final class C48292q extends AbstractC39060f<C48337k> {

    /* renamed from: a */
    public static final C48293a f111916a = new C48293a((byte) 0);

    static {
        Covode.recordClassIndex(57034);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.q$a */
    public static final class C48293a {
        static {
            Covode.recordClassIndex(57035);
        }

        private C48293a() {
        }

        public /* synthetic */ C48293a(byte b) {
            this();
        }
    }

    public C48292q() {
        mo67829d(false);
    }

    /* renamed from: a */
    private static SlimRoom m91726a(C48337k kVar) {
        if (kVar.getSlimRoom() != null) {
            return kVar.getSlimRoom();
        }
        String str = kVar.getUser().roomData;
        C89219l.m154716b(str, "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            kVar.setSlimRoom((SlimRoom) C80342dg.m139301a(str, SlimRoom.class));
            return kVar.getSlimRoom();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        SlimRoom.C11692a linkMic;
        List<User> list;
        Object obj = this.f92236l.get(i);
        C89219l.m154716b(obj, "");
        SlimRoom a = m91726a((C48337k) obj);
        if (a == null || (linkMic = a.getLinkMic()) == null || (list = linkMic.f27944a) == null || list.size() < 2) {
            return 1;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C48296s) {
            ((C48296s) viewHolder).f111934d.mo85363d();
        }
        if (viewHolder instanceof C48294r) {
            C48294r rVar = (C48294r) viewHolder;
            rVar.f111918c.mo85363d();
            rVar.f111919d.mo85363d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01f1  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder r31) {
        /*
        // Method dump skipped, instructions count: 554
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.C48292q.onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            C89219l.m154715b();
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = R.layout.a0g;
        if (i != 1 && i == 2) {
            i2 = R.layout.a0f;
        }
        View a = C1764a.m5927a(from, i2, viewGroup, false);
        if (i == 1) {
            C89219l.m154716b(a, "");
            return new C48296s(a);
        } else if (i != 2) {
            C89219l.m154716b(a, "");
            return new C48296s(a);
        } else {
            C89219l.m154716b(a, "");
            return new C48294r(a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C48296s) {
            C48296s sVar = (C48296s) viewHolder;
            Object obj = this.f92236l.get(i);
            C89219l.m154716b(obj, "");
            C48337k kVar = (C48337k) obj;
            List e = mo63369e();
            C89219l.m154716b(e, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : e) {
                if (obj2 instanceof C48337k) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
            for (Object obj3 : arrayList2) {
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.api.FollowingInterestUser");
                arrayList3.add(obj3);
            }
            sVar.mo80407a(kVar, arrayList3, i);
        }
        if (viewHolder instanceof C48294r) {
            C48294r rVar = (C48294r) viewHolder;
            Object obj4 = this.f92236l.get(i);
            C89219l.m154716b(obj4, "");
            C48337k kVar2 = (C48337k) obj4;
            List e2 = mo63369e();
            C89219l.m154716b(e2, "");
            ArrayList arrayList4 = new ArrayList();
            for (Object obj5 : e2) {
                if (obj5 instanceof C48337k) {
                    arrayList4.add(obj5);
                }
            }
            ArrayList arrayList5 = arrayList4;
            ArrayList arrayList6 = new ArrayList(C89070n.m154526a((Iterable) arrayList5, 10));
            for (Object obj6 : arrayList5) {
                Objects.requireNonNull(obj6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.api.FollowingInterestUser");
                arrayList6.add(obj6);
            }
            rVar.mo80405a(kVar2, arrayList6, i);
        }
    }
}

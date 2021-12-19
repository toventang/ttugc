package com.p2082ss.android.ugc.aweme.comment.gift;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.comment.gift.model.C36481a;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftPage;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftResponse;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftResult;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.p4460a.p4461a.C87034e;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.c */
public final class C36446c extends PagerAdapter {

    /* renamed from: a */
    public final GiftViewModel f86156a;

    /* renamed from: b */
    private final Fragment f86157b;

    /* renamed from: c */
    private final ActivityC0945e f86158c;

    /* renamed from: d */
    private final String f86159d;

    /* renamed from: e */
    private final String f86160e;

    /* renamed from: f */
    private final String f86161f;

    static {
        Covode.recordClassIndex(43744);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(obj, "");
        return view == obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.c$a */
    public static final class C36447a extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(43745);
        }

        C36447a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (i != 0) {
                super.mo4753a(recyclerView, i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.c$b */
    public static final class C36448b extends C36468i {
        static {
            Covode.recordClassIndex(43746);
        }

        C36448b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.gift.AbstractC36470j, com.p2082ss.android.ugc.aweme.comment.gift.C36468i
        /* renamed from: a */
        public final View mo63776a(RecyclerView.AbstractC1362i iVar) {
            C89219l.m154721d(iVar, "");
            View a = super.mo63776a(iVar);
            if (a == null) {
                return null;
            }
            return a;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        if (i == 0) {
            return this.f86158c.getResources().getString(R.string.h8x);
        }
        return this.f86158c.getResources().getString(R.string.h8y);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.c$c */
    static final class C36449c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C36446c f86162a;

        /* renamed from: b */
        final /* synthetic */ C36464g f86163b;

        /* renamed from: c */
        final /* synthetic */ int f86164c;

        static {
            Covode.recordClassIndex(43747);
        }

        C36449c(C36446c cVar, C36464g gVar, int i) {
            this.f86162a = cVar;
            this.f86163b = gVar;
            this.f86164c = i;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            GiftResult giftPageList;
            List<GiftPage> giftPageList2;
            int i;
            int i2;
            GiftResponse value = this.f86162a.f86156a.mo63835a().getValue();
            if (!(value == null || (giftPageList = value.getGiftPageList()) == null || (giftPageList2 = giftPageList.getGiftPageList()) == null || !(!giftPageList2.isEmpty()))) {
                C36464g gVar = this.f86163b;
                List<GiftStruct> giftList = giftPageList2.get(this.f86164c).getGiftList();
                if (!(giftList == null || giftList.isEmpty())) {
                    int size = (((giftList.size() - 1) / gVar.f86191b) + 1) * gVar.f86191b;
                    GiftStruct[] giftStructArr = new GiftStruct[size];
                    int i3 = 0;
                    for (T t : giftList) {
                        int i4 = i3 / gVar.f86191b;
                        int i5 = i3 % gVar.f86191b;
                        int i6 = gVar.f86191b / 2;
                        if (i5 < i6) {
                            i = i5 * 2;
                            i2 = gVar.f86191b;
                        } else {
                            i = ((i5 - i6) * 2) + 1;
                            i2 = gVar.f86191b;
                        }
                        int i7 = i + (i4 * i2);
                        if (i7 < size) {
                            giftStructArr[i7] = t;
                        }
                        i3++;
                    }
                    gVar.f86190a = giftStructArr;
                    gVar.notifyDataSetChanged();
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        MethodCollector.m26663i(9875);
        C89219l.m154721d(viewGroup, "");
        RecyclerView recyclerView = new RecyclerView(this.f86158c);
        recyclerView.setLayoutParams(new RecyclerView.C1367j(-1, -1));
        recyclerView.setLayoutManager(new GridLayoutManager(2, 0, false));
        Fragment fragment = this.f86157b;
        ActivityC0945e eVar = this.f86158c;
        GiftViewModel giftViewModel = this.f86156a;
        CharSequence pageTitle = getPageTitle(i);
        if (pageTitle != null) {
            C36464g gVar = new C36464g(fragment, eVar, giftViewModel, (String) pageTitle, this.f86159d, this.f86160e, this.f86161f);
            recyclerView.setAdapter(gVar);
            C36448b bVar = new C36448b();
            if (((C36468i) bVar).f86214a > 0) {
                ((C36468i) bVar).f86214a = 2;
                if (((C36468i) bVar).f86215b > 0) {
                    ((C36468i) bVar).f86215b = 4;
                    bVar.mo63796a(recyclerView);
                    recyclerView.mo4405a(new C36447a());
                    this.f86156a.mo63835a().observe(this.f86158c, new C36449c(this, gVar, i));
                    viewGroup.addView(recyclerView);
                    MethodCollector.m26664o(9875);
                    return recyclerView;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("column must be greater than zero");
                MethodCollector.m26664o(9875);
                throw illegalArgumentException;
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("row must be greater than zero");
            MethodCollector.m26664o(9875);
            throw illegalArgumentException2;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.String");
        MethodCollector.m26664o(9875);
        throw nullPointerException;
    }

    public C36446c(Fragment fragment, ActivityC0945e eVar, GiftViewModel giftViewModel, String str, String str2, String str3) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(giftViewModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f86157b = fragment;
        this.f86158c = eVar;
        this.f86156a = giftViewModel;
        this.f86159d = str;
        this.f86160e = str2;
        this.f86161f = str3;
        if (C36481a.f86257f == null) {
            C87034e.C87035a aVar = new C87034e.C87035a(eVar);
            aVar.f196226f = 2;
            aVar.f196223c = 2;
            aVar.f196225e = 5;
            C87034e a = aVar.mo140639a();
            C89219l.m154716b(a, "");
            C89219l.m154721d(a, "");
            C36481a.f86257f = a;
        }
    }
}

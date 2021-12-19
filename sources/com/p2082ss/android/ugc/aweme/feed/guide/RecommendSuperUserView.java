package com.p2082ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39098d;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48169av;
import com.p2082ss.android.ugc.aweme.feed.adapter.View$OnClickListenerC48170aw;
import com.p2082ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView */
public final class RecommendSuperUserView extends RelativeLayout {

    /* renamed from: a */
    public RecyclerView f114077a;

    /* renamed from: b */
    public C48169av f114078b;

    /* renamed from: c */
    public GalleryLayoutManager f114079c;

    /* renamed from: d */
    private String f114080d = "";

    /* renamed from: e */
    private List<UserWithAweme> f114081e = new ArrayList();

    static {
        Covode.recordClassIndex(58426);
    }

    public final List<UserWithAweme> getMCardItems() {
        return this.f114081e;
    }

    public final String getRequestId() {
        return this.f114080d;
    }

    public final C48169av getAdapter() {
        C48169av avVar = this.f114078b;
        if (avVar == null) {
            C89219l.m154710a("adapter");
        }
        return avVar;
    }

    public final GalleryLayoutManager getLayoutManager() {
        GalleryLayoutManager galleryLayoutManager = this.f114079c;
        if (galleryLayoutManager == null) {
            C89219l.m154710a("layoutManager");
        }
        return galleryLayoutManager;
    }

    public final RecyclerView getList() {
        RecyclerView recyclerView = this.f114077a;
        if (recyclerView == null) {
            C89219l.m154710a("list");
        }
        return recyclerView;
    }

    /* renamed from: a */
    public final void mo81346a() {
        RecyclerView recyclerView = this.f114077a;
        if (recyclerView == null) {
            C89219l.m154710a("list");
        }
        GalleryLayoutManager galleryLayoutManager = this.f114079c;
        if (galleryLayoutManager == null) {
            C89219l.m154710a("layoutManager");
        }
        RecyclerView.ViewHolder f = recyclerView.mo4451f(galleryLayoutManager.f114053b);
        if (f != null) {
            Objects.requireNonNull(f, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
            ((View$OnClickListenerC48170aw) f).mo80309f();
        }
        RecyclerView recyclerView2 = this.f114077a;
        if (recyclerView2 == null) {
            C89219l.m154710a("list");
        }
        GalleryLayoutManager galleryLayoutManager2 = this.f114079c;
        if (galleryLayoutManager2 == null) {
            C89219l.m154710a("layoutManager");
        }
        RecyclerView.ViewHolder f2 = recyclerView2.mo4451f(galleryLayoutManager2.f114053b + 1);
        if (f2 != null) {
            Objects.requireNonNull(f2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
            ((View$OnClickListenerC48170aw) f2).mo80306c();
        }
        RecyclerView recyclerView3 = this.f114077a;
        if (recyclerView3 == null) {
            C89219l.m154710a("list");
        }
        GalleryLayoutManager galleryLayoutManager3 = this.f114079c;
        if (galleryLayoutManager3 == null) {
            C89219l.m154710a("layoutManager");
        }
        RecyclerView.ViewHolder f3 = recyclerView3.mo4451f(galleryLayoutManager3.f114053b - 1);
        if (f3 != null) {
            Objects.requireNonNull(f3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
            ((View$OnClickListenerC48170aw) f3).mo80306c();
        }
    }

    public final void setAdapter(C48169av avVar) {
        C89219l.m154721d(avVar, "");
        this.f114078b = avVar;
    }

    public final void setLayoutManager(GalleryLayoutManager galleryLayoutManager) {
        C89219l.m154721d(galleryLayoutManager, "");
        this.f114079c = galleryLayoutManager;
    }

    public final void setList(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f114077a = recyclerView;
    }

    public final void setMCardItems(List<UserWithAweme> list) {
        C89219l.m154721d(list, "");
        this.f114081e = list;
    }

    public final void setRequestId(String str) {
        C89219l.m154721d(str, "");
        this.f114080d = str;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!(parent instanceof RecyclerView));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setContainer(WeakReference<Activity> weakReference) {
        C89219l.m154721d(weakReference, "");
        GalleryLayoutManager galleryLayoutManager = this.f114079c;
        if (galleryLayoutManager == null) {
            C89219l.m154710a("layoutManager");
        }
        galleryLayoutManager.f114059h = weakReference;
    }

    public final void setOnItemOperationListener(C64357h.AbstractC64362b bVar) {
        C89219l.m154721d(bVar, "");
        C48169av avVar = this.f114078b;
        if (avVar == null) {
            C89219l.m154710a("adapter");
        }
        C89219l.m154721d(bVar, "");
        avVar.f111565c = bVar;
    }

    public final void setOnViewFirstShowListener(AbstractC39098d<View$OnClickListenerC48170aw> dVar) {
        C89219l.m154721d(dVar, "");
        C48169av avVar = this.f114078b;
        if (avVar == null) {
            C89219l.m154710a("adapter");
        }
        C89219l.m154721d(dVar, "");
        avVar.f111564b = dVar;
    }

    public final void setData(List<UserWithAweme> list) {
        C89219l.m154721d(list, "");
        this.f114080d = this.f114080d;
        this.f114081e = list;
        C48169av avVar = this.f114078b;
        if (avVar == null) {
            C89219l.m154710a("adapter");
        }
        avVar.mo62377b_(this.f114081e);
        C48169av avVar2 = this.f114078b;
        if (avVar2 == null) {
            C89219l.m154710a("adapter");
        }
        String str = this.f114080d;
        C89219l.m154721d(str, "");
        avVar2.f111563a = str;
        C48169av avVar3 = this.f114078b;
        if (avVar3 == null) {
            C89219l.m154710a("adapter");
        }
        avVar3.notifyDataSetChanged();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendSuperUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(6745);
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f114077a = recyclerView;
        addView(recyclerView, new ViewGroup.LayoutParams(-1, -1));
        GalleryLayoutManager galleryLayoutManager = new GalleryLayoutManager();
        this.f114079c = galleryLayoutManager;
        RecyclerView recyclerView2 = this.f114077a;
        if (recyclerView2 == null) {
            C89219l.m154710a("list");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The attach RecycleView must not null!!");
            MethodCollector.m26664o(6745);
            throw illegalArgumentException;
        }
        galleryLayoutManager.f114062k = recyclerView2;
        galleryLayoutManager.f114052a = Math.max(0, 0);
        recyclerView2.setLayoutManager(galleryLayoutManager);
        galleryLayoutManager.f114055d.mo4857a(recyclerView2);
        recyclerView2.mo4405a(galleryLayoutManager.f114056e);
        GalleryLayoutManager galleryLayoutManager2 = this.f114079c;
        if (galleryLayoutManager2 == null) {
            C89219l.m154710a("layoutManager");
        }
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        galleryLayoutManager2.f114060i = new C49591g(context2);
        GalleryLayoutManager galleryLayoutManager3 = this.f114079c;
        if (galleryLayoutManager3 == null) {
            C89219l.m154710a("layoutManager");
        }
        C89219l.m154721d(galleryLayoutManager3, "");
        C48169av avVar = new C48169av(galleryLayoutManager3);
        avVar.mo67829d(false);
        avVar.mo63366c(this.f114081e);
        this.f114078b = avVar;
        RecyclerView recyclerView3 = this.f114077a;
        if (recyclerView3 == null) {
            C89219l.m154710a("list");
        }
        C48169av avVar2 = this.f114078b;
        if (avVar2 == null) {
            C89219l.m154710a("adapter");
        }
        recyclerView3.setAdapter(avVar2);
        RecyclerView recyclerView4 = this.f114077a;
        if (recyclerView4 == null) {
            C89219l.m154710a("list");
        }
        RecyclerView recyclerView5 = this.f114077a;
        if (recyclerView5 == null) {
            C89219l.m154710a("list");
        }
        recyclerView4.setItemAnimator(new C49596j(recyclerView5));
        MethodCollector.m26664o(6745);
    }
}

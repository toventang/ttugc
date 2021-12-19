package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55879c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55895h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.IndexView;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.b */
public final class C55913b extends View$OnTouchListenerC55918c {

    /* renamed from: f */
    public static final C55914a f127518f = new C55914a((byte) 0);

    /* renamed from: a */
    public IndexView f127519a;

    /* renamed from: b */
    public LinearLayoutManager f127520b;

    /* renamed from: c */
    public final float f127521c;

    /* renamed from: d */
    public List<Integer> f127522d;

    /* renamed from: e */
    public List<String> f127523e;

    /* renamed from: v */
    private View f127524v;

    /* renamed from: w */
    private TextView f127525w;

    /* renamed from: x */
    private C55912a f127526x;

    static {
        Covode.recordClassIndex(65705);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.b$a */
    public static final class C55914a {
        static {
            Covode.recordClassIndex(65706);
        }

        private C55914a() {
        }

        public /* synthetic */ C55914a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c
    /* renamed from: b */
    public final void mo92783b() {
        super.mo92783b();
        AbstractC55867a aVar = this.f127542o;
        if (aVar == null) {
            C89219l.m154715b();
        }
        aVar.f127350j = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c
    /* renamed from: c */
    public final void mo92784c() {
        super.mo92784c();
        if (this.f127536i) {
            IndexView indexView = this.f127519a;
            if (indexView == null) {
                C89219l.m154710a("mIndexView");
            }
            indexView.setVisibility(8);
            return;
        }
        IndexView indexView2 = this.f127519a;
        if (indexView2 == null) {
            C89219l.m154710a("mIndexView");
        }
        indexView2.setIndexLetters(this.f127523e);
        IndexView indexView3 = this.f127519a;
        if (indexView3 == null) {
            C89219l.m154710a("mIndexView");
        }
        indexView3.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c
    /* renamed from: a */
    public final void mo92779a() {
        View findViewById = this.f127547t.findViewById(R.id.eiz);
        C89219l.m154716b(findViewById, "");
        mo92789a((ImTextTitleBar) findViewById);
        View findViewById2 = this.f127547t.findViewById(R.id.e7i);
        C89219l.m154716b(findViewById2, "");
        mo92788a((TuxStatusView) findViewById2);
        View findViewById3 = this.f127547t.findViewById(R.id.dgl);
        C89219l.m154716b(findViewById3, "");
        mo92787a((RecyclerView) findViewById3);
        this.f127520b = new LinearLayoutManager();
        mo92796f().setLayoutManager(this.f127520b);
        mo92796f().mo4405a(new C55915b(this, this.f127546s));
        mo92796f().mo4404a(new C55916c(this));
        View findViewById4 = this.f127547t.findViewById(R.id.ds1);
        C89219l.m154716b(findViewById4, "");
        this.f127524v = findViewById4;
        if (findViewById4 == null) {
            C89219l.m154710a("mSearchBar");
        }
        View findViewById5 = findViewById4.findViewById(R.id.drm);
        C89219l.m154716b(findViewById5, "");
        mo92785a((EditText) findViewById5);
        mo92794d().setTag("relation_search_tag");
        mo92794d().setHint(R.string.c_j);
        View view = this.f127524v;
        if (view == null) {
            C89219l.m154710a("mSearchBar");
        }
        View findViewById6 = view.findViewById(R.id.x7);
        C89219l.m154716b(findViewById6, "");
        mo92786a((ImageView) findViewById6);
        View findViewById7 = this.f127547t.findViewById(R.id.bmt);
        C89219l.m154716b(findViewById7, "");
        this.f127519a = (IndexView) findViewById7;
        View findViewById8 = this.f127547t.findViewById(R.id.bmq);
        C89219l.m154716b(findViewById8, "");
        this.f127525w = (TextView) findViewById8;
        IndexView indexView = this.f127519a;
        if (indexView == null) {
            C89219l.m154710a("mIndexView");
        }
        indexView.setOnLetterTouchListener(new C55917d(this));
        IndexView indexView2 = this.f127519a;
        if (indexView2 == null) {
            C89219l.m154710a("mIndexView");
        }
        TextView textView = this.f127525w;
        if (textView == null) {
            C89219l.m154710a("mIndexLetterTv");
        }
        indexView2.setIndexLetterTv(textView);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.b$c */
    public static final class C55916c implements RecyclerView.AbstractC1370m {

        /* renamed from: a */
        final /* synthetic */ C55913b f127528a;

        static {
            Covode.recordClassIndex(65708);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: a */
        public final void mo4750a(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: b */
        public final void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(motionEvent, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55916c(C55913b bVar) {
            this.f127528a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: a */
        public final boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(motionEvent, "");
            if (motionEvent.getY() < this.f127528a.f127521c) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.b$d */
    static final class C55917d implements IndexView.AbstractC55911a {

        /* renamed from: a */
        final /* synthetic */ C55913b f127529a;

        static {
            Covode.recordClassIndex(65709);
        }

        C55917d(C55913b bVar) {
            this.f127529a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.IndexView.AbstractC55911a
        /* renamed from: a */
        public final void mo92778a(int i) {
            AbstractC55867a aVar = this.f127529a.f127542o;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.ui.adapter.IndexerListAdapter");
            int positionForSection = ((C55879c) aVar).getPositionForSection(i);
            if (this.f127529a.f127542o != null) {
                AbstractC55867a aVar2 = this.f127529a.f127542o;
                if (aVar2 == null) {
                    C89219l.m154715b();
                }
                positionForSection += aVar2.mo92722b();
            }
            LinearLayoutManager linearLayoutManager = this.f127529a.f127520b;
            if (linearLayoutManager == null) {
                C89219l.m154715b();
            }
            linearLayoutManager.mo4347a(positionForSection, 0);
            C39162r.onEventV3("index_bar_click");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c
    /* renamed from: a */
    public final void mo92780a(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        this.f127536i = false;
        List<String> list2 = this.f127523e;
        List<Integer> list3 = this.f127522d;
        if (!(list2 == null || list2.isEmpty() || list3 == null || list3.isEmpty())) {
            int[] iArr = new int[list3.size()];
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                iArr[i] = list3.get(i).intValue();
            }
            Object[] array = list2.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            C55895h hVar = new C55895h((String[]) array, iArr);
            AbstractC55867a aVar = this.f127542o;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.ui.adapter.IndexerListAdapter");
            C55879c cVar = (C55879c) aVar;
            cVar.f127381m = hVar;
            cVar.f127382n.f127384a = -1;
            AbstractC55867a aVar2 = this.f127542o;
            if (aVar2 != null) {
                aVar2.mo92718a((List<IMContact>) list);
            }
            if (this.f127526x != null) {
                RecyclerView f = mo92796f();
                C55912a aVar3 = this.f127526x;
                if (aVar3 == null) {
                    C89219l.m154715b();
                }
                f.mo4425c(aVar3);
            }
            this.f127526x = new C55912a(this.f127546s, list2, list3);
            RecyclerView f2 = mo92796f();
            C55912a aVar4 = this.f127526x;
            if (aVar4 == null) {
                C89219l.m154715b();
            }
            f2.mo4415b(aVar4);
            mo92784c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.b$b */
    public static final class C55915b extends C51425a {

        /* renamed from: a */
        final /* synthetic */ C55913b f127527a;

        static {
            Covode.recordClassIndex(65707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55915b(C55913b bVar, Context context) {
            super(context);
            this.f127527a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            LinearLayoutManager linearLayoutManager = this.f127527a.f127520b;
            if (linearLayoutManager == null) {
                C89219l.m154715b();
            }
            int k = linearLayoutManager.mo4371k();
            AbstractC55867a aVar = this.f127527a.f127542o;
            if (aVar == null) {
                C89219l.m154715b();
            }
            int b = k - aVar.mo92722b();
            AbstractC55867a aVar2 = this.f127527a.f127542o;
            Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.ui.adapter.IndexerListAdapter");
            int sectionForPosition = ((C55879c) aVar2).getSectionForPosition(b);
            List<String> list = this.f127527a.f127523e;
            if (list != null && !list.isEmpty() && sectionForPosition >= 0 && sectionForPosition < list.size()) {
                IndexView indexView = this.f127527a.f127519a;
                if (indexView == null) {
                    C89219l.m154710a("mIndexView");
                }
                indexView.setCurrentIndex(list.get(sectionForPosition));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            if (((float) i2) > C13628n.m24520b(this.f127527a.f127546s, 10.0f)) {
                C39115e.m79412a(this.f127527a.f127546s, this.f127527a.mo92794d());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c
    /* renamed from: a */
    public final void mo92782a(List<Integer> list, List<String> list2) {
        this.f127522d = list;
        this.f127523e = list2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c
    /* renamed from: a */
    public final void mo92781a(List<? extends IMContact> list, CharSequence charSequence) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(charSequence, "");
        this.f127536i = true;
        if (this.f127526x != null) {
            RecyclerView f = mo92796f();
            C55912a aVar = this.f127526x;
            if (aVar == null) {
                C89219l.m154715b();
            }
            f.mo4425c(aVar);
        }
        AbstractC55867a aVar2 = this.f127542o;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        aVar2.mo92719a((List<IMContact>) list, charSequence);
        mo92784c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55913b(Activity activity, View view, boolean z, List<Integer> list, List<String> list2) {
        super(activity, view, z);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        this.f127522d = list;
        this.f127523e = list2;
        this.f127521c = C13628n.m24520b(activity, 32.0f);
    }
}

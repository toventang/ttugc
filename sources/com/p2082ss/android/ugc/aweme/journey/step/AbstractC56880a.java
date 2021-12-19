package com.p2082ss.android.ugc.aweme.journey.step;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.a */
public abstract class AbstractC56880a extends AbstractC34586a {

    /* renamed from: a */
    protected TextView f129565a;

    /* renamed from: b */
    protected RecyclerView f129566b;

    /* renamed from: c */
    protected View f129567c;

    /* renamed from: d */
    public long f129568d = System.currentTimeMillis();

    /* renamed from: e */
    public AbstractC89172b<? super Boolean, C89391z> f129569e;

    /* renamed from: j */
    public boolean f129570j;

    /* renamed from: k */
    private long f129571k = System.currentTimeMillis();

    /* renamed from: l */
    private long f129572l;

    /* renamed from: m */
    private SparseArray f129573m;

    static {
        Covode.recordClassIndex(66767);
    }

    /* renamed from: a */
    public View mo94100a(int i) {
        if (this.f129573m == null) {
            this.f129573m = new SparseArray();
        }
        View view = (View) this.f129573m.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129573m.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public void mo94104c() {
        SparseArray sparseArray = this.f129573m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final TextView mo94101a() {
        TextView textView = this.f129565a;
        if (textView == null) {
            C89219l.m154710a("doneView");
        }
        return textView;
    }

    /* renamed from: b */
    public final RecyclerView mo94103b() {
        RecyclerView recyclerView = this.f129566b;
        if (recyclerView == null) {
            C89219l.m154710a("infoListView");
        }
        return recyclerView;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        long currentTimeMillis = System.currentTimeMillis();
        this.f129571k = currentTimeMillis;
        this.f129568d = currentTimeMillis;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onDestroyView() {
        View view = this.f129567c;
        if (view == null) {
            C89219l.m154710a("loadingView");
        }
        view.clearAnimation();
        super.onDestroyView();
        mo94104c();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        AbstractC89172b<? super Boolean, C89391z> bVar;
        this.f129572l += System.currentTimeMillis() - this.f129571k;
        if (!this.f129570j && (bVar = this.f129569e) != null) {
            bVar.invoke(true);
        }
        super.onStop();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.a$a */
    public static final class C56881a extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        public int f129574a;

        /* renamed from: b */
        final /* synthetic */ AbstractC56880a f129575b;

        static {
            Covode.recordClassIndex(66768);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56881a(AbstractC56880a aVar) {
            this.f129575b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            this.f129574a += i2;
            if (this.f129575b.af_()) {
                TextTitleBar textTitleBar = (TextTitleBar) this.f129575b.mo94100a(R.id.eiz);
                C89219l.m154716b(textTitleBar, "");
                if (textTitleBar.getHeight() > 0) {
                    TextTitleBar textTitleBar2 = (TextTitleBar) this.f129575b.mo94100a(R.id.eiz);
                    C89219l.m154716b(textTitleBar2, "");
                    TextTitleBar textTitleBar3 = (TextTitleBar) this.f129575b.mo94100a(R.id.eiz);
                    C89219l.m154716b(textTitleBar3, "");
                    textTitleBar2.setAlpha((((float) this.f129574a) * 1.0f) / ((float) textTitleBar3.getHeight()));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo94102a(boolean z) {
        TextView textView = this.f129565a;
        if (textView == null) {
            C89219l.m154710a("doneView");
        }
        textView.setEnabled(z);
        if (z) {
            TextView textView2 = this.f129565a;
            if (textView2 == null) {
                C89219l.m154710a("doneView");
            }
            TextView textView3 = this.f129565a;
            if (textView3 == null) {
                C89219l.m154710a("doneView");
            }
            textView2.setTextColor(C0643b.m2378c(textView3.getContext(), R.color.a9));
            return;
        }
        TextView textView4 = this.f129565a;
        if (textView4 == null) {
            C89219l.m154710a("doneView");
        }
        TextView textView5 = this.f129565a;
        if (textView5 == null) {
            C89219l.m154710a("doneView");
        }
        textView4.setTextColor(C0643b.m2378c(textView5.getContext(), R.color.bz));
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) mo94100a(R.id.anm);
        C89219l.m154716b(tuxTextView, "");
        this.f129565a = tuxTextView;
        RecyclerView recyclerView = (RecyclerView) mo94100a(R.id.dnz);
        C89219l.m154716b(recyclerView, "");
        this.f129566b = recyclerView;
        ImageView imageView = (ImageView) mo94100a(R.id.cfv);
        C89219l.m154716b(imageView, "");
        this.f129567c = imageView;
        RecyclerView recyclerView2 = this.f129566b;
        if (recyclerView2 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView2.setItemAnimator(null);
        TextView textView = this.f129565a;
        if (textView == null) {
            C89219l.m154710a("doneView");
        }
        C17235c.m31810a(textView, 0.75f);
        C17235c.m31810a(mo94100a(R.id.e1u), 0.75f);
        RecyclerView recyclerView3 = this.f129566b;
        if (recyclerView3 == null) {
            C89219l.m154710a("infoListView");
        }
        ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = marginLayoutParams.leftMargin;
        RecyclerView recyclerView4 = this.f129566b;
        if (recyclerView4 == null) {
            C89219l.m154710a("infoListView");
        }
        marginLayoutParams.leftMargin = i - ((int) C13628n.m24520b(recyclerView4.getContext(), 4.0f));
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        mo94102a(false);
        RecyclerView recyclerView5 = this.f129566b;
        if (recyclerView5 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView5.mo4405a(new C56881a(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ab9, viewGroup, false);
    }
}

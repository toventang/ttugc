package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.aweme.shortvideo.C74330z;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cb */
public final class C69908cb extends Fragment {

    /* renamed from: a */
    CircularProgressView f156213a;

    /* renamed from: b */
    TextView f156214b;

    /* renamed from: c */
    public ImageView f156215c;

    /* renamed from: d */
    public ImageView f156216d;

    /* renamed from: e */
    public ImageView f156217e;

    /* renamed from: f */
    public TextView f156218f;

    /* renamed from: g */
    public final C69752aa f156219g = new C69752aa();

    /* renamed from: h */
    public final C69921cc f156220h;

    /* renamed from: i */
    private SparseArray f156221i;

    static {
        Covode.recordClassIndex(82317);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$a */
    public static final class C69909a extends ViewOutlineProvider {
        static {
            Covode.recordClassIndex(82318);
        }

        C69909a() {
        }

        public final void getOutline(View view, Outline outline) {
            if (view != null && outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) C34728n.m70946a(4.0d));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$g */
    public static final class C69915g implements C74330z.AbstractC74331a {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156227a;

        /* renamed from: b */
        final /* synthetic */ C74330z f156228b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f156229c;

        static {
            Covode.recordClassIndex(82324);
        }

        public C69915g(C69908cb cbVar, C74330z zVar, ViewPropertyAnimator viewPropertyAnimator) {
            this.f156227a = cbVar;
            this.f156228b = zVar;
            this.f156229c = viewPropertyAnimator;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.C74330z.AbstractC74331a
        /* renamed from: a */
        public final void mo110324a() {
            this.f156227a.f156219g.mo110118b(this.f156228b);
            this.f156229c.cancel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$h */
    public static final class RunnableC69916h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156230a;

        /* renamed from: b */
        final /* synthetic */ C74330z f156231b;

        static {
            Covode.recordClassIndex(82325);
        }

        public RunnableC69916h(C69908cb cbVar, C74330z zVar) {
            this.f156230a = cbVar;
            this.f156231b = zVar;
        }

        public final void run() {
            this.f156230a.f156219g.mo110118b(this.f156231b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f156221i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$i */
    public static final class C69917i implements C74330z.AbstractC74331a {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156232a;

        /* renamed from: b */
        final /* synthetic */ C74330z f156233b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f156234c;

        /* renamed from: d */
        final /* synthetic */ ViewPropertyAnimator f156235d;

        static {
            Covode.recordClassIndex(82326);
        }

        public C69917i(C69908cb cbVar, C74330z zVar, ViewPropertyAnimator viewPropertyAnimator, ViewPropertyAnimator viewPropertyAnimator2) {
            this.f156232a = cbVar;
            this.f156233b = zVar;
            this.f156234c = viewPropertyAnimator;
            this.f156235d = viewPropertyAnimator2;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.C74330z.AbstractC74331a
        /* renamed from: a */
        public final void mo110324a() {
            this.f156232a.f156219g.mo110118b(this.f156233b);
            this.f156234c.cancel();
            this.f156235d.cancel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$j */
    public static final class RunnableC69918j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156236a;

        /* renamed from: b */
        final /* synthetic */ C74330z f156237b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f156238c;

        static {
            Covode.recordClassIndex(82327);
        }

        public RunnableC69918j(C69908cb cbVar, C74330z zVar, AbstractC89171a aVar) {
            this.f156236a = cbVar;
            this.f156237b = zVar;
            this.f156238c = aVar;
        }

        public final void run() {
            this.f156236a.f156219g.mo110118b(this.f156237b);
            this.f156238c.invoke();
            this.f156236a.mo110322d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$k */
    public static final class C69919k implements C74330z.AbstractC74331a {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156239a;

        /* renamed from: b */
        final /* synthetic */ C74330z f156240b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f156241c;

        /* renamed from: d */
        final /* synthetic */ ViewPropertyAnimator f156242d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f156243e;

        static {
            Covode.recordClassIndex(82328);
        }

        public C69919k(C69908cb cbVar, C74330z zVar, ViewPropertyAnimator viewPropertyAnimator, ViewPropertyAnimator viewPropertyAnimator2, ViewPropertyAnimator viewPropertyAnimator3) {
            this.f156239a = cbVar;
            this.f156240b = zVar;
            this.f156241c = viewPropertyAnimator;
            this.f156242d = viewPropertyAnimator2;
            this.f156243e = viewPropertyAnimator3;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.C74330z.AbstractC74331a
        /* renamed from: a */
        public final void mo110324a() {
            this.f156239a.f156219g.mo110118b(this.f156240b);
            this.f156241c.cancel();
            this.f156242d.cancel();
            this.f156243e.cancel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$l */
    public static final class RunnableC69920l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156244a;

        /* renamed from: b */
        final /* synthetic */ C74330z f156245b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f156246c;

        static {
            Covode.recordClassIndex(82329);
        }

        public RunnableC69920l(C69908cb cbVar, C74330z zVar, AbstractC89171a aVar) {
            this.f156244a = cbVar;
            this.f156245b = zVar;
            this.f156246c = aVar;
        }

        public final void run() {
            this.f156244a.f156219g.mo110118b(this.f156245b);
            this.f156246c.invoke();
            this.f156244a.mo110322d();
        }
    }

    public C69908cb() {
        C69921cc ccVar = new C69921cc();
        ccVar.f156248b.setValue(-1);
        ccVar.mo110328a(0);
        this.f156220h = ccVar;
    }

    /* renamed from: a */
    public final void mo110319a() {
        requireFragmentManager().mo3552a().mo3451a(R.anim.ds, R.anim.dt).mo3474c(this).mo3473c();
    }

    /* renamed from: b */
    public final void mo110320b() {
        requireFragmentManager().mo3552a().mo3471b(this).mo3473c();
    }

    /* renamed from: c */
    public final void mo110321c() {
        if (getFragmentManager() != null) {
            AbstractC0952i fragmentManager = getFragmentManager();
            if (fragmentManager == null) {
                C89219l.m154715b();
            }
            fragmentManager.mo3552a().mo3455a(this).mo3473c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (getActivity() != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            C69488a.C69489a.m122709a(activity).mo109736a("upload_progress_fragment", false);
        }
        mo110321c();
        super.onDestroy();
    }

    /* renamed from: d */
    public final void mo110322d() {
        ImageView imageView = this.f156215c;
        if (imageView == null) {
            C89219l.m154710a("mBGCoverFirst");
        }
        imageView.setAlpha(1.0f);
        ImageView imageView2 = this.f156215c;
        if (imageView2 == null) {
            C89219l.m154710a("mBGCoverFirst");
        }
        imageView2.setTranslationX(0.0f);
        ImageView imageView3 = this.f156215c;
        if (imageView3 == null) {
            C89219l.m154710a("mBGCoverFirst");
        }
        imageView3.setTranslationY(0.0f);
        ImageView imageView4 = this.f156216d;
        if (imageView4 == null) {
            C89219l.m154710a("mBGCoverSecond");
        }
        imageView4.setAlpha(1.0f);
        ImageView imageView5 = this.f156216d;
        if (imageView5 == null) {
            C89219l.m154710a("mBGCoverSecond");
        }
        imageView5.setTranslationX(0.0f);
        ImageView imageView6 = this.f156216d;
        if (imageView6 == null) {
            C89219l.m154710a("mBGCoverSecond");
        }
        imageView6.setTranslationY(0.0f);
        ImageView imageView7 = this.f156217e;
        if (imageView7 == null) {
            C89219l.m154710a("mBGCoverThird");
        }
        imageView7.setAlpha(1.0f);
        ImageView imageView8 = this.f156217e;
        if (imageView8 == null) {
            C89219l.m154710a("mBGCoverThird");
        }
        imageView8.setTranslationX(0.0f);
        ImageView imageView9 = this.f156217e;
        if (imageView9 == null) {
            C89219l.m154710a("mBGCoverThird");
        }
        imageView9.setTranslationY(0.0f);
    }

    /* renamed from: a */
    private static void m123470a(View view) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new C69909a());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$d */
    static final class C69912d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156224a;

        static {
            Covode.recordClassIndex(82321);
        }

        C69912d(C69908cb cbVar) {
            this.f156224a = cbVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            ImageView imageView = this.f156224a.f156215c;
            if (imageView == null) {
                C89219l.m154710a("mBGCoverFirst");
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$e */
    static final class C69913e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156225a;

        static {
            Covode.recordClassIndex(82322);
        }

        C69913e(C69908cb cbVar) {
            this.f156225a = cbVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            ImageView imageView = this.f156225a.f156216d;
            if (imageView == null) {
                C89219l.m154710a("mBGCoverSecond");
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$f */
    static final class C69914f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156226a;

        static {
            Covode.recordClassIndex(82323);
        }

        C69914f(C69908cb cbVar) {
            this.f156226a = cbVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            ImageView imageView = this.f156226a.f156217e;
            if (imageView == null) {
                C89219l.m154710a("mBGCoverThird");
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$b */
    static final class C69910b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156222a;

        static {
            Covode.recordClassIndex(82319);
        }

        C69910b(C69908cb cbVar) {
            this.f156222a = cbVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C69908cb cbVar = this.f156222a;
            C89219l.m154716b(num, "");
            int intValue = num.intValue();
            CircularProgressView circularProgressView = cbVar.f156213a;
            if (circularProgressView == null) {
                C89219l.m154710a("mProgressView");
            }
            circularProgressView.setProgress((float) intValue);
            TextView textView = cbVar.f156214b;
            if (textView == null) {
                C89219l.m154710a("mProgressText");
            }
            textView.setText(new StringBuilder().append(intValue).append('%').toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cb$c */
    static final class C69911c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C69908cb f156223a;

        static {
            Covode.recordClassIndex(82320);
        }

        C69911c(C69908cb cbVar) {
            this.f156223a = cbVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null || num.intValue() != -1) {
                TextView textView = this.f156223a.f156218f;
                if (textView == null) {
                    C89219l.m154710a("mTvVideoCount");
                }
                Context requireContext = this.f156223a.requireContext();
                C89219l.m154716b(requireContext, "");
                textView.setText(requireContext.getResources().getString(R.string.eqa, num));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        View view2;
        ViewParent viewParent;
        View findViewById;
        View findViewById2;
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            C69488a.C69489a.m122709a(activity).mo109736a("upload_progress_fragment", true);
        }
        ActivityC0945e activity2 = getActivity();
        ViewParent viewParent2 = null;
        if (activity2 != null) {
            view = activity2.findViewById(R.id.e_w);
        } else {
            view = null;
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).setClipChildren(false);
        ActivityC0945e activity3 = getActivity();
        if (activity3 != null) {
            view2 = activity3.findViewById(R.id.e_w);
        } else {
            view2 = null;
        }
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).setClipToPadding(false);
        ActivityC0945e activity4 = getActivity();
        if (activity4 == null || (findViewById2 = activity4.findViewById(R.id.e_w)) == null) {
            viewParent = null;
        } else {
            viewParent = findViewById2.getParent();
        }
        Objects.requireNonNull(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) viewParent).setClipChildren(false);
        ActivityC0945e activity5 = getActivity();
        if (!(activity5 == null || (findViewById = activity5.findViewById(R.id.e_w)) == null)) {
            viewParent2 = findViewById.getParent();
        }
        Objects.requireNonNull(viewParent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) viewParent2).setClipToPadding(false);
        this.f156220h.f156247a.observe(this, new C69910b(this));
        this.f156220h.f156248b.observe(this, new C69911c(this));
        this.f156220h.f156249c.observe(this, new C69912d(this));
        this.f156220h.f156250d.observe(this, new C69913e(this));
        this.f156220h.f156251e.observe(this, new C69914f(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.bxi);
        C89219l.m154716b(findViewById, "");
        CircularProgressView circularProgressView = (CircularProgressView) findViewById;
        this.f156213a = circularProgressView;
        if (circularProgressView == null) {
            C89219l.m154710a("mProgressView");
        }
        circularProgressView.setIndeterminate(false);
        View findViewById2 = view.findViewById(R.id.d_3);
        C89219l.m154716b(findViewById2, "");
        this.f156214b = (TextView) findViewById2;
        if (getActivity() != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            C69488a.C69489a.m122709a(activity).mo109736a("upload_progress_fragment", true);
        }
        View findViewById3 = view.findViewById(R.id.rz);
        C89219l.m154716b(findViewById3, "");
        this.f156215c = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.s1);
        C89219l.m154716b(findViewById4, "");
        this.f156216d = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.s2);
        C89219l.m154716b(findViewById5, "");
        this.f156217e = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bxi);
        C89219l.m154716b(findViewById6, "");
        CircularProgressView circularProgressView2 = (CircularProgressView) findViewById6;
        this.f156213a = circularProgressView2;
        if (circularProgressView2 == null) {
            C89219l.m154710a("mProgressView");
        }
        circularProgressView2.setIndeterminate(false);
        View findViewById7 = view.findViewById(R.id.d_3);
        C89219l.m154716b(findViewById7, "");
        this.f156214b = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.eru);
        C89219l.m154716b(findViewById8, "");
        this.f156218f = (TextView) findViewById8;
        if (Build.VERSION.SDK_INT >= 21) {
            ImageView imageView = this.f156215c;
            if (imageView == null) {
                C89219l.m154710a("mBGCoverFirst");
            }
            m123470a(imageView);
            ImageView imageView2 = this.f156216d;
            if (imageView2 == null) {
                C89219l.m154710a("mBGCoverSecond");
            }
            m123470a(imageView2);
            ImageView imageView3 = this.f156217e;
            if (imageView3 == null) {
                C89219l.m154710a("mBGCoverThird");
            }
            m123470a(imageView3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a1e, viewGroup, false);
    }
}

package com.p2082ss.android.ugc.aweme.story.base.p4023ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.services.story.IStoryView;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.story.base.StoryActivityArg;
import com.p2082ss.android.ugc.aweme.tools.C77804a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity */
public final class StoryRootActivity extends ActivityC33402b {

    /* renamed from: d */
    public IStoryView f171997d;

    /* renamed from: e */
    final AbstractC89244h f171998e = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: f */
    private final SafeHandler f171999f = new SafeHandler(this);

    /* renamed from: g */
    private final AbstractC89244h f172000g = C89250i.m154773a((AbstractC89171a) new C76637a(this));

    /* renamed from: h */
    private HashMap f172001h;

    static {
        Covode.recordClassIndex(89627);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f172001h == null) {
            this.f172001h = new HashMap();
        }
        View view = (View) this.f172001h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f172001h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final int bB_() {
        return C0643b.m2378c(this, R.color.c9);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, C77804a.f174542d);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity$b */
    static final class RunnableC76638b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StoryRootActivity f172003a;

        static {
            Covode.recordClassIndex(89629);
        }

        RunnableC76638b(StoryRootActivity storyRootActivity) {
            this.f172003a = storyRootActivity;
        }

        public final void run() {
            if (!this.f172003a.isFinishing()) {
                IStoryView iStoryView = this.f172003a.f171997d;
                if (iStoryView == null) {
                    C89219l.m154710a("storyView");
                }
                iStoryView.onOpenCompletely();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        IStoryView iStoryView = this.f171997d;
        if (iStoryView == null) {
            C89219l.m154710a("storyView");
        }
        if (!iStoryView.onBackPressed()) {
            super.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity$a */
    static final class C76637a extends AbstractC89220m implements AbstractC89171a<EnterStoryParam> {

        /* renamed from: a */
        final /* synthetic */ StoryRootActivity f172002a;

        static {
            Covode.recordClassIndex(89628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76637a(StoryRootActivity storyRootActivity) {
            super(0);
            this.f172002a = storyRootActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EnterStoryParam invoke() {
            EnterStoryParam enterStoryParam;
            StoryActivityArg storyActivityArg = (StoryActivityArg) this.f172002a.f171998e.getValue();
            if (storyActivityArg == null || (enterStoryParam = storyActivityArg.getEnterStoryParam()) == null) {
                return new EnterStoryParam(null, null, null, false, true, false, false, 111, null);
            }
            return enterStoryParam;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity$c */
    static final class C76639c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ StoryRootActivity f172004a;

        static {
            Covode.recordClassIndex(89630);
        }

        C76639c(StoryRootActivity storyRootActivity) {
            this.f172004a = storyRootActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f172004a.finish();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b16);
        Fragment a = getSupportFragmentManager().mo3551a("StorySlideFragment");
        if (a == null || !(a instanceof IStoryView)) {
            this.f171997d = AVExternalServiceImpl.m113114a().storyService().createStoryView((EnterStoryParam) this.f172000g.getValue());
            AbstractC0976n a2 = getSupportFragmentManager().mo3552a();
            IStoryView iStoryView = this.f171997d;
            if (iStoryView == null) {
                C89219l.m154710a("storyView");
            }
            a2.mo3454a(R.id.b3b, iStoryView.asFragment(), "StorySlideFragment").mo3467b();
        } else {
            this.f171997d = (IStoryView) a;
        }
        IStoryView iStoryView2 = this.f171997d;
        if (iStoryView2 == null) {
            C89219l.m154710a("storyView");
        }
        iStoryView2.getCloseEvent().observe(this, new C76639c(this));
        this.f171999f.postDelayed(new RunnableC76638b(this), 300);
        overridePendingTransition(C77804a.f174539a, 0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        IStoryView iStoryView = this.f171997d;
        if (iStoryView == null) {
            C89219l.m154710a("storyView");
        }
        iStoryView.onActivityResult(i, i2, intent);
    }
}

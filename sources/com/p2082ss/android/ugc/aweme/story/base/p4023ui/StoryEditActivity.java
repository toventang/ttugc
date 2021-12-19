package com.p2082ss.android.ugc.aweme.story.base.p4023ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.AbstractC22233n;
import com.bytedance.scene.C22217i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.story.edit.C77095c;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.C76873c;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.ugc.aweme.utils.C80357ds;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88296t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity */
public final class StoryEditActivity extends ActivityC33402b implements AbstractC84919c {

    /* renamed from: d */
    public static final C76632a f171988d = new C76632a((byte) 0);

    /* renamed from: e */
    private AbstractC22233n f171989e;

    /* renamed from: f */
    private final List<AbstractC84917a> f171990f = new ArrayList();

    /* renamed from: g */
    private final AbstractC89244h f171991g = C89250i.m154773a((AbstractC89171a) C76636d.f171996a);

    /* renamed from: h */
    private HashMap f171992h;

    static {
        Covode.recordClassIndex(89621);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87531a(AbstractC84917a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87532a(AbstractC84918b bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87534b(AbstractC84918b bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f171992h == null) {
            this.f171992h = new HashMap();
        }
        View view = (View) this.f171992h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f171992h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public final C77095c mo120397g() {
        return (C77095c) this.f171991g.getValue();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity$a */
    public static final class C76632a {
        static {
            Covode.recordClassIndex(89622);
        }

        private C76632a() {
        }

        public /* synthetic */ C76632a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m134230a(Activity activity, StoryEditModel storyEditModel) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(storyEditModel, "");
            Intent intent = new Intent(activity, StoryEditActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_edit_model", storyEditModel);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, 531);
            activity.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity$d */
    static final class C76636d extends AbstractC89220m implements AbstractC89171a<C77095c> {

        /* renamed from: a */
        public static final C76636d f171996a = new C76636d();

        static {
            Covode.recordClassIndex(89626);
        }

        C76636d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C77095c invoke() {
            return new C77095c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final int bB_() {
        return C0643b.m2378c(this, R.color.c9);
    }

    public final void finish() {
        setResult(10, new Intent());
        super.finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
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

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity$b */
    static final class C76633b extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryEditActivity f171993a;

        static {
            Covode.recordClassIndex(89623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76633b(StoryEditActivity storyEditActivity) {
            super(1);
            this.f171993a = storyEditActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity$b$a */
        public static final class C76634a extends AbstractC21603p<StoryEditActivity> {

            /* renamed from: a */
            final /* synthetic */ C76633b f171994a;

            static {
                Covode.recordClassIndex(89624);
            }

            public C76634a(C76633b bVar) {
                this.f171994a = bVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final StoryEditActivity get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f171994a.f171993a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(StoryEditActivity.class, (String) null, (AbstractC21603p) new C76634a(this)), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static Bundle m134222a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87533b(AbstractC84917a aVar) {
        C89219l.m154721d(aVar, "");
        this.f171990f.add(aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: c */
    public final void mo87535c(AbstractC84917a aVar) {
        C89219l.m154721d(aVar, "");
        this.f171990f.remove(aVar);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity", "onCreate", true);
        C63244g.m114602a().mo73293u();
        super.onCreate(bundle);
        C2556g.m7471a(this, new C76633b(this));
        new C2551b(C2552c.m7460a(this)).mo7031a();
        C22217i.C22218a a = C22217i.m41761a(this, C77095c.class);
        a.f52534f = new C76635c(this);
        Intent intent = getIntent();
        C89219l.m154716b(intent, "");
        a.f52529a = m134222a(intent);
        a.f52533e = false;
        this.f171989e = a.mo36469a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity", "onCreate", false);
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (AbstractC84917a aVar : this.f171990f) {
            if (aVar.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C76873c cVar = (C76873c) mo120397g().mo36386a("StorySharedClipEditRootScene");
        if (cVar != null) {
            cVar.mo120483P();
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity$c */
    static final class C76635c implements AbstractC22231l {

        /* renamed from: a */
        final /* synthetic */ StoryEditActivity f171995a;

        static {
            Covode.recordClassIndex(89625);
        }

        C76635c(StoryEditActivity storyEditActivity) {
            this.f171995a = storyEditActivity;
        }

        @Override // com.bytedance.scene.AbstractC22231l
        public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            C89219l.m154721d(classLoader, "");
            C89219l.m154721d(str, "");
            if (!C89219l.m154714a((Object) str, (Object) C77095c.class.getName())) {
                return null;
            }
            C77095c g = this.f171995a.mo120397g();
            if (bundle == null) {
                bundle = new Bundle();
            }
            g.f52554r = bundle;
            return g;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C76873c cVar = (C76873c) mo120397g().mo36386a("StorySharedClipEditRootScene");
        if (cVar != null && intent != null && intent.hasExtra("custom_sticker") && intent.hasExtra("custom_sticker_image_info")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("custom_sticker");
            if (parcelableExtra == null) {
                C89219l.m154715b();
            }
            Effect effect = (Effect) parcelableExtra;
            Parcelable parcelableExtra2 = intent.getParcelableExtra("custom_sticker_image_info");
            if (parcelableExtra2 == null) {
                C89219l.m154715b();
            }
            cVar.mo120473F().mo114833v().setValue(C88296t.m153438b(0));
            cVar.mo120476I().mo127988a(effect, C80357ds.m139323a(((CustomStickerInfo) parcelableExtra2).mo93663a()));
        }
    }
}

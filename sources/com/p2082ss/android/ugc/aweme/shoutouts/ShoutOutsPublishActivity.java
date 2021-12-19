package com.p2082ss.android.ugc.aweme.shoutouts;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.C22217i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71901g;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity */
public final class ShoutOutsPublishActivity extends ActivityC33402b implements AbstractC90252i, AbstractC90253j {

    /* renamed from: d */
    public C74389c f167277d;

    /* renamed from: e */
    public VideoPublishEditModel f167278e;

    /* renamed from: f */
    private HashMap f167279f;

    static {
        Covode.recordClassIndex(87156);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final boolean cz_() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f167279f == null) {
            this.f167279f = new HashMap();
        }
        View view = (View) this.f167279f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f167279f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(383, new RunnableC90250g(ShoutOutsPublishActivity.class, "onEvent", C74386b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        super.onBackPressed();
        mo116988h();
    }

    /* renamed from: i */
    private final void m130840i() {
        EventBus a = EventBus.m156962a();
        if (!a.mo145393a(this)) {
            EventBus.m156966a(a, this);
        }
    }

    /* renamed from: g */
    public final void mo116987g() {
        EventBus a = EventBus.m156962a();
        if (a.mo145393a(this)) {
            a.mo145395b(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d */
    public final void mo59480d() {
        C23073a.C23074a.m43508a(this).mo37494a(R.color.l).mo37503d(R.color.l).mo37495a(true).f54627a.mo33415d();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C84412c.m145200a(this);
        IInternalCommerceService h = AVCommerceServiceImpl.m102988h();
        C89219l.m154716b(h, "");
        h.mo93970g();
        mo116987g();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onResume", true);
        super.onResume();
        m130840i();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onResume", false);
    }

    /* renamed from: h */
    public final void mo116988h() {
        if (this.f167278e != null) {
            C74389c cVar = this.f167277d;
            if (cVar != null) {
                cVar.mo117010L();
            }
            VideoPublishEditModel videoPublishEditModel = this.f167278e;
            if (videoPublishEditModel == null) {
                C89219l.m154715b();
            }
            String desc = videoPublishEditModel.mShoutOutsData.getDesc();
            VideoPublishEditModel videoPublishEditModel2 = this.f167278e;
            if (videoPublishEditModel2 == null) {
                C89219l.m154715b();
            }
            C74426g price = videoPublishEditModel2.mShoutOutsData.getPrice();
            VideoPublishEditModel videoPublishEditModel3 = this.f167278e;
            if (videoPublishEditModel3 == null) {
                C89219l.m154715b();
            }
            AbstractC81915c.m141874a(new C71901g(desc, price, videoPublishEditModel3.mShoutOutsData.getBuyerMoneyDes()));
        }
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.c4);
        C84412c.m145202a(this, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("shout_out_from_dl", false)) {
            Serializable serializableExtra = intent.getSerializableExtra("shout_out_data");
            if (serializableExtra != null) {
                m130839a(null, (C74418d) serializableExtra);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.ShoutOutsData");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onCreate", false);
                throw nullPointerException;
            }
        } else {
            Serializable serializableExtra2 = intent.getSerializableExtra("args");
            if (serializableExtra2 != null) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializableExtra2;
                this.f167278e = videoPublishEditModel;
                String.valueOf(videoPublishEditModel);
                VideoPublishEditModel videoPublishEditModel2 = this.f167278e;
                if (videoPublishEditModel2 == null) {
                    C89219l.m154715b();
                }
                m130839a(videoPublishEditModel2, null);
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onCreate", false);
                throw nullPointerException2;
            }
        }
        m130840i();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity", "onCreate", false);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onEvent(C74386b bVar) {
        C89219l.m154721d(bVar, "");
        C74389c cVar = this.f167277d;
        if (cVar != null) {
            C74426g gVar = bVar.f167287a;
            C74381a aVar = bVar.f167288b;
            C89219l.m154721d(gVar, "");
            if (cVar.f167307x != null && gVar.getMoneyDes() != null) {
                C74418d dVar = cVar.f167306w;
                if (dVar == null) {
                    C89219l.m154710a("shoutOutsData");
                }
                dVar.setPrice(gVar);
                C74418d dVar2 = cVar.f167306w;
                if (dVar2 == null) {
                    C89219l.m154710a("shoutOutsData");
                }
                dVar2.setBuyerMoneyDes(aVar);
                cVar.mo117009K();
                TuxButton tuxButton = cVar.f167303t;
                if (tuxButton == null) {
                    C89219l.m154710a("postView");
                }
                tuxButton.setEnabled(true);
                if (cVar.f167294C != null) {
                    VideoPublishEditModel videoPublishEditModel = cVar.f167294C;
                    C74418d dVar3 = cVar.f167306w;
                    if (dVar3 == null) {
                        C89219l.m154710a("shoutOutsData");
                    }
                    videoPublishEditModel.mShoutOutsData = dVar3;
                }
                if (!cVar.f167309z) {
                    View view = cVar.f167302l;
                    if (view == null) {
                        C89219l.m154710a("previewLayout");
                    }
                    view.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m130839a(VideoPublishEditModel videoPublishEditModel, C74418d dVar) {
        this.f167277d = new C74389c(videoPublishEditModel, dVar);
        C22217i.C22218a a = C22217i.m41761a(this, C74389c.class);
        a.f52533e = false;
        a.f52534f = new C74380a(this);
        a.f52530b = false;
        a.f52531c = false;
        a.f52532d = R.id.b84;
        a.mo36469a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity$a */
    public static final class C74380a implements AbstractC22231l {

        /* renamed from: a */
        final /* synthetic */ ShoutOutsPublishActivity f167280a;

        static {
            Covode.recordClassIndex(87157);
        }

        C74380a(ShoutOutsPublishActivity shoutOutsPublishActivity) {
            this.f167280a = shoutOutsPublishActivity;
        }

        @Override // com.bytedance.scene.AbstractC22231l
        public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            C89219l.m154721d(classLoader, "");
            C89219l.m154721d(str, "");
            if (C89219l.m154714a((Object) C74389c.class.getName(), (Object) str)) {
                return this.f167280a.f167277d;
            }
            return null;
        }
    }
}

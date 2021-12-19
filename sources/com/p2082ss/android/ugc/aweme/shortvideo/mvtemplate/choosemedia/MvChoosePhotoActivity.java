package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.C22217i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71899e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity */
public final class MvChoosePhotoActivity extends ActivityC33402b implements AbstractC72264w, AbstractC84919c, AbstractC90252i, AbstractC90253j {

    /* renamed from: e */
    public static final C72040a f161425e = new C72040a((byte) 0);

    /* renamed from: d */
    public C72084ao f161426d;

    /* renamed from: f */
    private final ArrayList<AbstractC84918b> f161427f = new ArrayList<>();

    /* renamed from: g */
    private final ArrayList<AbstractC84917a> f161428g = new ArrayList<>();

    /* renamed from: h */
    private HashMap f161429h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$b */
    public interface AbstractC72041b {
        static {
            Covode.recordClassIndex(84696);
        }

        /* renamed from: a */
        void mo114271a(boolean z);
    }

    static {
        Covode.recordClassIndex(84694);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87531a(AbstractC84917a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final boolean bA_() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f161429h == null) {
            this.f161429h = new HashMap();
        }
        View view = (View) this.f161429h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f161429h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(348, new RunnableC90250g(MvChoosePhotoActivity.class, "onEvent", C71899e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$a */
    public static final class C72040a {
        static {
            Covode.recordClassIndex(84695);
        }

        private C72040a() {
        }

        public /* synthetic */ C72040a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m127136a(Activity activity, Bundle bundle, int i) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bundle, "");
            Intent intent = new Intent(activity, MvChoosePhotoActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("key_choose_request_code", i);
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }

        /* renamed from: a */
        public static Intent m127135a(Activity activity, Bundle bundle, int i, int i2) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bundle, "");
            Intent intent = new Intent(activity, MvChoosePhotoActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("key_choose_request_code", i);
            intent.putExtra("key_start_activity_request_code", i2);
            return intent;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: g */
    public final void mo114266g() {
        C72084ao aoVar = this.f161426d;
        if (aoVar == null) {
            C89219l.m154710a("rootScene");
        }
        aoVar.f161599Z = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: i */
    public final boolean mo114267i() {
        C72084ao aoVar = this.f161426d;
        if (aoVar == null) {
            C89219l.m154710a("rootScene");
        }
        return aoVar.f161599Z;
    }

    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        C73975b.C73976a.f166071a.end(OpenAlbumPanelPerformanceMonitor.f166158a, "animationEnded");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: a */
    public final AbstractC72264w.C72265a mo114263a() {
        C72084ao aoVar = this.f161426d;
        if (aoVar == null) {
            C89219l.m154710a("rootScene");
        }
        if (aoVar.f52549m == null) {
            return new AbstractC72264w.C72265a(null, null);
        }
        C72084ao aoVar2 = this.f161426d;
        if (aoVar2 == null) {
            C89219l.m154710a("rootScene");
        }
        return aoVar2.mo114263a();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: e */
    public final AbstractC72264w.C72265a mo114265e() {
        C72084ao aoVar = this.f161426d;
        if (aoVar == null) {
            C89219l.m154710a("rootScene");
        }
        if (aoVar.f52549m == null) {
            return new AbstractC72264w.C72265a(null, null);
        }
        C72084ao aoVar2 = this.f161426d;
        if (aoVar2 == null) {
            C89219l.m154710a("rootScene");
        }
        return aoVar2.mo114265e();
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$c */
    static final class C72042c implements AbstractC22231l {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f161430a;

        static {
            Covode.recordClassIndex(84697);
        }

        C72042c(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f161430a = mvChoosePhotoActivity;
        }

        /* renamed from: a */
        private static Bundle m127138a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.scene.AbstractC22231l
        public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            C89219l.m154721d(classLoader, "");
            C89219l.m154721d(str, "");
            if (!TextUtils.equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao", str)) {
                return null;
            }
            MvChoosePhotoActivity mvChoosePhotoActivity = this.f161430a;
            C72084ao aoVar = new C72084ao();
            Intent intent = this.f161430a.getIntent();
            C89219l.m154716b(intent, "");
            Bundle a = m127138a(intent);
            if (a == null) {
                a = new Bundle();
            }
            aoVar.f52554r = a;
            mvChoosePhotoActivity.f161426d = aoVar;
            C72084ao aoVar2 = this.f161430a.f161426d;
            if (aoVar2 == null) {
                C89219l.m154710a("rootScene");
            }
            return aoVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87532a(AbstractC84918b bVar) {
        C89219l.m154721d(bVar, "");
        this.f161427f.add(bVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87533b(AbstractC84917a aVar) {
        C89219l.m154721d(aVar, "");
        this.f161428g.add(aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: c */
    public final void mo87535c(AbstractC84917a aVar) {
        C89219l.m154721d(aVar, "");
        this.f161428g.remove(aVar);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onEvent(C71899e eVar) {
        C89219l.m154721d(eVar, "");
        finish();
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87534b(AbstractC84918b bVar) {
        C89219l.m154721d(bVar, "");
        this.f161427f.remove(bVar);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.w, 0);
        if (Build.VERSION.SDK_INT <= 19) {
            C71827ew.m126823a((Activity) this);
        }
        setContentView(R.layout.bp);
        C22217i.C22218a a = C22217i.m41761a(this, C72084ao.class);
        a.f52532d = R.id.b58;
        C22217i.C22218a a2 = a.mo36468a("MvChoosePhotoActivity");
        a2.f52533e = false;
        a2.f52534f = new C72042c(this);
        a2.mo36469a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", false);
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator<T> it = this.f161428g.iterator();
        while (it.hasNext()) {
            if (it.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator<T> it = this.f161427f.iterator();
        while (it.hasNext()) {
            if (it.next().mo62778a(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w
    /* renamed from: a */
    public final void mo114264a(boolean z, MusicModel musicModel, String str) {
        C72084ao aoVar = this.f161426d;
        if (aoVar == null) {
            C89219l.m154710a("rootScene");
        }
        aoVar.mo114264a(z, musicModel, str);
    }
}

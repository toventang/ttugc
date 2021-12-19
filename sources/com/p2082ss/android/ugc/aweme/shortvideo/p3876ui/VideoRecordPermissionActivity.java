package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.experiment.C46981gn;
import com.p2082ss.android.ugc.aweme.experiment.C46982go;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.p2730de.C40984s;
import com.p2082ss.android.ugc.aweme.p3290j.C56813a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63250k;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.AbstractC73764a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73765b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73766c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73771e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73772f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73773g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.DialogC73767d;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p2082ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.p2082ss.android.ugc.aweme.ttep.C79202ac;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.widget.C85056k;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.p4548e.C88253a;
import java.util.List;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity */
public class VideoRecordPermissionActivity extends ActivityC17312a {

    /* renamed from: a */
    ToolSafeHandler f164838a = new ToolSafeHandler(this);

    /* renamed from: b */
    boolean f164839b = C46981gn.m90261a();

    /* renamed from: c */
    boolean f164840c = C46982go.m90262a();

    /* renamed from: d */
    private Runnable f164841d = null;

    static {
        Covode.recordClassIndex(86087);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: c */
    private void m129483c() {
        if (this.f164839b || this.f164840c) {
            m129484d();
        } else {
            m129485e();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C84412c.m145200a(this);
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        Runnable runnable = this.f164841d;
        if (runnable != null) {
            runnable.run();
            this.f164841d = null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        C73448aa.f164993a = getClass();
    }

    /* renamed from: a */
    static void m129478a() {
        C80510gr.m139532a("camera_error", "1");
    }

    /* renamed from: d */
    private void m129484d() {
        Intent intent = getIntent();
        String[] a = C73771e.m129820a(intent);
        if (C73772f.m129825a(a)) {
            this.f164838a.mo116380a(new RunnableC73733gf(this));
        } else if (C79202ac.m138055a(intent) || !this.f164840c) {
            m129481b(a);
        } else {
            m129479a(a);
        }
    }

    /* renamed from: e */
    private void m129485e() {
        AbstractC73764a a = C73766c.m129818a(getIntent());
        if (a.mo116239a(this)) {
            this.f164838a.mo116380a(new RunnableC73749gv(this));
        } else if (C63238c.f143566D.mo73307c().mo101671a()) {
            C88253a.m153364a(this);
            a.mo116238a(this, new C73750gw(this));
        } else {
            this.f164838a.mo116380a(new RunnableC73735gh(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo116013b() {
        Dialog b = new C17197a.C17200a(this).mo27194b(R.string.v0).mo27195b(R.string.v1, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73738gk(this), false).mo27190a(R.string.as2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73739gl(this), false).mo27193a().mo27184b();
        b.setOnCancelListener(new DialogInterface$OnCancelListenerC73740gm(this));
        C85056k.m146252a(b);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
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

    /* renamed from: a */
    private static Context m129476a(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        Context applicationContext = videoRecordPermissionActivity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: b */
    public static boolean m129482b(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("enter_record_from_other_platform", false)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public void onNewIntent(Intent intent) {
        C84412c.m145202a(this, intent, (Bundle) null);
        if (m129482b(intent)) {
            m129483c();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    /* renamed from: b */
    private void m129481b(String[] strArr) {
        C73773g.m129839a(this, strArr, C73773g.m129831a(this), new C73745gr(this), C73746gs.f165586a, new C73747gt(this));
    }

    /* renamed from: a */
    private void m129479a(String[] strArr) {
        DialogC73767d dVar = new DialogC73767d(this);
        dVar.f165621c = new C73734gg(this, strArr, dVar);
        dVar.f165622d = new C73743gp(this, strArr);
        C73765b.m129816c(strArr, this);
        dVar.show();
        this.f164841d = new RunnableC73744gq(this, strArr, dVar);
        C56813a.m135920a(this, 7);
    }

    /* renamed from: a */
    public static boolean m129480a(Intent intent) {
        if (intent == null || !"main".equals(m129477a(intent, "from"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116011a(final boolean z) {
        C63238c.f143570H.mo101685a(new AbstractC63212bb.AbstractC63213a() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity.C733511 */

            static {
                Covode.recordClassIndex(86088);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
            public final void onSuccess() {
                VideoRecordPermissionActivity videoRecordPermissionActivity = VideoRecordPermissionActivity.this;
                boolean z = z;
                C73975b.C73976a.f166071a.step("av_video_record_init", "startVideoRecordActivity");
                if (!videoRecordPermissionActivity.isFinishing() && !videoRecordPermissionActivity.isDestroyed()) {
                    int i = Build.VERSION.SDK_INT;
                    if (!videoRecordPermissionActivity.isDestroyed()) {
                        C40984s.m82526b(RunnableC73736gi.f165572a);
                        C63238c.m114590a(C71815es.m126788a());
                        C74007f.m130162a(videoRecordPermissionActivity, videoRecordPermissionActivity.getIntent(), new C73737gj(videoRecordPermissionActivity, z));
                        return;
                    }
                }
                C80510gr.m139532a("camera_error", "2");
            }
        });
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        C73975b.C73976a.f166071a.start("av_video_record_init", "startToolPermissionActivity");
        C84412c.m145202a(this, getIntent(), bundle);
        C80322d.m139251a("tools_performance_permission", new C84425b().mo129406a("scene", "permission_enter").f188764a);
        C63238c.m114592b();
        boolean booleanExtra = getIntent().getBooleanExtra("enter_record_directly_from_system", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("recreate_record_activity_support", false);
        if (booleanExtra) {
            C80510gr.m139533a("camera_error", "2", "recording");
            finish();
        } else {
            C63250k kVar = C63250k.C63252a.f143622a;
            kVar.mo101729a();
            if (kVar.f143613a) {
                new C79459a(m129476a(this)).mo123050a(R.string.f95).mo123053a();
                C80510gr.m139533a("camera_error", "2", "living");
                finish();
            } else if (m129482b(getIntent()) && C63238c.m114591a()) {
                C80510gr.m139533a("camera_error", "2", "recording");
                finish();
            } else if (m129480a(getIntent()) || m129482b(getIntent()) || !C63238c.m114591a() || booleanExtra2) {
                if (C63244g.m114602a().mo73287o().mo104784d()) {
                    if (StoryPublishServiceImpl.m135314a().isStoryPublishing()) {
                        AVExternalServiceImpl.m113114a().storyService().showPublishingToast(this);
                        C40982q.m82522a("record", new C69840ar().mo110189a("event", "isPublishing").mo110191a());
                        C80510gr.m139533a("camera_error", "2", "publishing");
                        finish();
                    }
                } else if (StoryPublishServiceImpl.m135314a().isPublishing(this)) {
                    AVExternalServiceImpl.m113114a().storyService().showPublishingToast(this);
                    C40982q.m82522a("record", new C69840ar().mo110189a("event", "isPublishing").mo110191a());
                    C80510gr.m139533a("camera_error", "2", "publishing");
                    finish();
                }
                m129483c();
            } else {
                C84911q.m145921a("Recording status:" + C63238c.m114592b() + " recreatedSupport: " + booleanExtra2);
                C40982q.m82522a("record", new C69840ar().mo110189a("event", "isRecording").mo110189a("user_info", C63238c.m114592b()).mo110191a());
                AbstractC63269z zVar = C63238c.f143594u;
                if (zVar == null || zVar.mo93906e() == null || !zVar.mo93906e().mo58669l()) {
                    new C79459a(m129476a(this)).mo123050a(R.string.bzt).mo123053a();
                    C80510gr.m139533a("camera_error", "2", "recording");
                } else {
                    new C79459a(m129476a(this)).mo123050a(R.string.f95).mo123053a();
                    C80510gr.m139533a("camera_error", "2", "recording");
                }
                finish();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m129477a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo116010a(boolean z, List list) {
        Intent intent = getIntent();
        if (!z) {
            intent.putExtra("translation_type", 1);
        }
        C74007f.m130163a(this, getIntent(), list);
        finish();
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116012a(String[] strArr, DialogC73767d dVar) {
        C73765b.m129813a(strArr, this);
        C63238c.f143565C.mo73274b().mo101758a(this, new C73748gu(this, dVar), strArr);
    }
}

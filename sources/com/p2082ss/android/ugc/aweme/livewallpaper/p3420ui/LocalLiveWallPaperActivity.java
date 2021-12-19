package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.lighten.p1477a.AbstractC20755l;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.experiment.C46994gu;
import com.p2082ss.android.ugc.aweme.experiment.C47014hj;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3413a.View$OnClickListenerC58826a;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58850g;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.C58844f;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui.C58917a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p4173ug.EnumC79674h;
import com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.AbstractC79620l;
import com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.C79604c;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63346a;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity */
public class LocalLiveWallPaperActivity extends ActivityC17312a {

    /* renamed from: a */
    TextView f134131a;

    /* renamed from: b */
    RecyclerView f134132b;

    /* renamed from: c */
    TuxStatusView f134133c;

    /* renamed from: d */
    TuxIconView f134134d;

    /* renamed from: e */
    public String f134135e;

    /* renamed from: f */
    private View$OnClickListenerC58826a f134136f;

    /* renamed from: g */
    private boolean f134137g;

    /* renamed from: h */
    private C58844f f134138h;

    /* renamed from: i */
    private boolean f134139i;

    static {
        Covode.recordClassIndex(69233);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", true);
        super.onResume();
        List<LiveWallPaperBean> c = C58895d.f134069e.mo96321c();
        if (C13603b.m24435a((Collection) c)) {
            this.f134133c.setVisibility(0);
            C22999a aVar = new C22999a();
            aVar.f54431a = R.raw.icon_large_live_wallpaper;
            aVar.f54435e = Integer.valueOf((int) R.attr.bd);
            this.f134133c.setStatus(new TuxStatusView.C23263c().mo37877a(aVar).mo37879a(getString(R.string.han)).mo37878a((CharSequence) getString(R.string.ham)));
        } else {
            if (!this.f134137g) {
                this.f134137g = true;
                if (!C13603b.m24435a((Collection) c)) {
                    for (LiveWallPaperBean liveWallPaperBean : c) {
                        C39162r.m79460a("wall_paper_show", new C33744d().mo59983a("group_id", liveWallPaperBean.getId()).mo59983a("enter_from", "paper_set").f79943a);
                    }
                }
            }
            this.f134133c.setVisibility(8);
        }
        View$OnClickListenerC58826a aVar2 = this.f134136f;
        aVar2.f133913a.clear();
        if (!C13603b.m24435a((Collection) c)) {
            aVar2.f133913a.addAll(c);
        }
        aVar2.notifyDataSetChanged();
        if (this.f134139i) {
            this.f134139i = false;
            if (!C13603b.m24435a((Collection) c)) {
                LiveWallPaperBean liveWallPaperBean2 = c.get(0);
                if (!TextUtils.isEmpty(liveWallPaperBean2.getVideoUri()) && !TextUtils.isEmpty(liveWallPaperBean2.getVideoUrl())) {
                    mo96369a(liveWallPaperBean2);
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", false);
    }

    public void exit(View view) {
        finish();
    }

    /* renamed from: b */
    public final void mo96370b(LiveWallPaperBean liveWallPaperBean) {
        Intent intent = new Intent(this, LiveWallPaperPreviewActivity.class);
        intent.putExtra("live_wall_paper", liveWallPaperBean);
        intent.putExtra("from", this.f134135e);
        C84349a.m145093a(intent, this);
        startActivity(intent);
    }

    public void showSettingDialog(View view) {
        boolean z;
        LiveWallPaperBean liveWallPaperBean = C58895d.f134069e.f134072c;
        if (liveWallPaperBean != null) {
            z = liveWallPaperBean.isShouldMute();
        } else {
            z = false;
        }
        new C58933p().mo96385a(this, z, "history", null);
    }

    public void findWallpapersTvClick(View view) {
        C39162r.onEventV3("click_find_wallpapers");
        C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://challenge/detail/1302").mo63248a("enter_from", "wallpaper_record").f85356a.mo52126a());
    }

    /* renamed from: a */
    public final void mo96369a(final LiveWallPaperBean liveWallPaperBean) {
        if (this.f134138h == null) {
            C58844f fVar = new C58844f(this);
            this.f134138h = fVar;
            fVar.f133949d = new AbstractC58850g() {
                /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui.LocalLiveWallPaperActivity.C589162 */

                static {
                    Covode.recordClassIndex(69235);
                }

                @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58850g
                /* renamed from: a */
                public final void mo96254a() {
                    C58901f.m108234b(LocalLiveWallPaperActivity.this.f134135e, liveWallPaperBean.getId(), false);
                }

                @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58850g
                /* renamed from: a */
                public final void mo96255a(String str) {
                    liveWallPaperBean.setVideoPath(str);
                    C58895d.f134069e.mo96319b();
                    LocalLiveWallPaperActivity.this.mo96370b(liveWallPaperBean);
                    C58901f.m108234b(LocalLiveWallPaperActivity.this.f134135e, liveWallPaperBean.getId(), true);
                }
            };
        }
        C58844f fVar2 = this.f134138h;
        String videoUrl = liveWallPaperBean.getVideoUrl();
        String videoUri = liveWallPaperBean.getVideoUri();
        C89219l.m154721d(videoUrl, "");
        C89219l.m154721d(videoUri, "");
        if (fVar2.f133946a == null) {
            ProgressDialogC74145d a = ProgressDialogC74145d.m130371a(fVar2.f133950e, fVar2.f133950e.getString(R.string.cxb));
            a.setIndeterminate(false);
            fVar2.f133946a = a;
        }
        ProgressDialogC74145d dVar = fVar2.f133946a;
        if (dVar == null) {
            C89219l.m154715b();
        }
        dVar.setProgress(0);
        String a2 = C58901f.m108219a();
        String str = a2 + "temp";
        if (!C80720e.m139927b(str)) {
            C80720e.m139917a(str, false);
        }
        String str2 = C13607d.m24442b(videoUri) + ".mp4";
        String str3 = a2 + str2;
        fVar2.f133947b = str + str2;
        if (C80720e.m139927b(str3)) {
            fVar2.mo96248a(str3);
        } else {
            AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(videoUrl);
            with.f100626c = str2;
            with.f100629f = str;
            AbstractC43167a a3 = with.mo73399a(3).mo73402a(true);
            a3.f100601D = new C58844f.C58845a(fVar2, str3);
            a3.mo73409f();
            fVar2.f133948c.postDelayed(new C58844f.RunnableC58849d(fVar2), TimeUnit.SECONDS.toMillis(60));
        }
        C58901f.m108223a(this.f134135e);
    }

    public void howSetWallpapersTvClick(View view) {
        MethodCollector.m26663i(5547);
        C39162r.onEventV3("click_how_to_set_wallpapers");
        C58917a aVar = new C58917a();
        C89219l.m154721d(this, "");
        View inflate = View.inflate(this, R.layout.bjl, null);
        C23226a.C23227a aVar2 = new C23226a.C23227a();
        C89219l.m154716b(inflate, "");
        aVar.f134143a = aVar2.mo37816a(inflate).mo37812a(0).mo37819a(true).f55057a;
        inflate.findViewById(R.id.a77).setOnClickListener(new C58917a.View$OnClickListenerC58918a(aVar));
        IUgCommonService j = UgCommonServiceImpl.m138290j();
        AbstractC79620l c = j.mo123103c();
        if (c.mo123150c()) {
            View findViewById = inflate.findViewById(R.id.e7t);
            C89219l.m154716b(findViewById, "");
            c.mo123148a((ImageView) findViewById, C79604c.C79606b.f178618a);
            View findViewById2 = inflate.findViewById(R.id.e7x);
            C89219l.m154716b(findViewById2, "");
            c.mo123148a((ImageView) findViewById2, C79604c.C79606b.f178619b);
        } else {
            String a = j.mo123093a(EnumC79674h.WALLPAPER_GUIDE_STEP_1);
            if (a == null) {
                a = "";
            }
            String a2 = j.mo123093a(EnumC79674h.WALLPAPER_GUIDE_STEP_2);
            if (a2 == null) {
                a2 = "";
            }
            View findViewById3 = inflate.findViewById(R.id.e7t);
            C89219l.m154716b(findViewById3, "");
            C58917a.m108260a((AbstractC20755l) findViewById3, a);
            View findViewById4 = inflate.findViewById(R.id.e7x);
            C89219l.m154716b(findViewById4, "");
            C58917a.m108260a((AbstractC20755l) findViewById4, a2);
        }
        View findViewById5 = inflate.findViewById(R.id.e7r);
        C89219l.m154716b(findViewById5, "");
        C58917a.m108259a(this, (TextView) findViewById5, R.raw.icon_arrow_turn_up_right);
        View findViewById6 = inflate.findViewById(R.id.e7v);
        C89219l.m154716b(findViewById6, "");
        C58917a.m108259a(this, (TextView) findViewById6, R.raw.icon_2pt_live_wallpaper);
        C23226a aVar3 = aVar.f134143a;
        if (aVar3 != null) {
            aVar3.show(getSupportFragmentManager(), "");
            MethodCollector.m26664o(5547);
            return;
        }
        MethodCollector.m26664o(5547);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = true;
        xVar.f78673g = R.color.nc;
        activityConfiguration(new C58926i(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.bjj);
        this.f134131a = (TextView) findViewById(R.id.title);
        this.f134132b = (RecyclerView) findViewById(R.id.dgw);
        this.f134133c = (TuxStatusView) findViewById(R.id.e7i);
        this.f134134d = (TuxIconView) findViewById(R.id.d5_);
        View findViewById = findViewById(R.id.d5_);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC58927j(this));
        }
        View findViewById2 = findViewById(R.id.pi);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC58928k(this));
        }
        View findViewById3 = findViewById(R.id.b2i);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC58929l(this));
        }
        View findViewById4 = findViewById(R.id.bg4);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new View$OnClickListenerC58930m(this));
        }
        TextView textView = this.f134131a;
        if (textView != null) {
            textView.setText(getString(R.string.haf));
        }
        if (C46994gu.m90274a(this) || C47014hj.m90285a(this)) {
            this.f134134d.setVisibility(0);
        } else {
            this.f134134d.setVisibility(8);
        }
        this.f134132b.setLayoutManager(new WrapGridLayoutManager(3, 1));
        this.f134132b.setHasFixedSize(true);
        View$OnClickListenerC58826a aVar = new View$OnClickListenerC58826a();
        this.f134136f = aVar;
        aVar.f133914b = new View$OnClickListenerC58826a.AbstractC58827a() {
            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui.LocalLiveWallPaperActivity.C589151 */

            static {
                Covode.recordClassIndex(69234);
            }

            @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3413a.View$OnClickListenerC58826a.AbstractC58827a
            /* renamed from: a */
            public final void mo96225a(LiveWallPaperBean liveWallPaperBean) {
                if (TextUtils.isEmpty(liveWallPaperBean.getVideoPath())) {
                    LocalLiveWallPaperActivity.this.mo96369a(liveWallPaperBean);
                } else {
                    LocalLiveWallPaperActivity.this.mo96370b(liveWallPaperBean);
                }
            }
        };
        this.f134132b.mo4402a(new C63346a((int) C13628n.m24520b(this, 1.0f)));
        this.f134132b.setAdapter(this.f134136f);
        this.f134139i = getIntent().getBooleanExtra("is_first_install_launch", false);
        String a = m108253a(getIntent(), "from");
        this.f134135e = a;
        if (a == null) {
            this.f134135e = "plugin";
        }
        C39162r.m79460a("enter_local_live_wallpaper", new C33744d().mo59983a("enter_from", this.f134135e).f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m108253a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.p2082ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2690cr.p2704g.C40383b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService;
import com.p2082ss.android.ugc.aweme.property.AVPreferences;
import com.p2082ss.android.ugc.aweme.property.C65352av;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65404cp;
import com.p2082ss.android.ugc.aweme.publish.C65687t;
import com.p2082ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.C68034bs;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.p3834g.C71857b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3834g.C71859c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71907a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71909c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71910d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73474ax;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73478ay;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73496bd;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73498be;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73502bf;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73630e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73979bb;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88278m;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n */
public final class C72644n {

    /* renamed from: x */
    public static final C72645a f162838x = new C72645a((byte) 0);

    /* renamed from: a */
    public Context f162839a;

    /* renamed from: b */
    public boolean f162840b;

    /* renamed from: c */
    public boolean f162841c;

    /* renamed from: d */
    public boolean f162842d;

    /* renamed from: e */
    public boolean f162843e;

    /* renamed from: f */
    public boolean f162844f;

    /* renamed from: g */
    public C73474ax f162845g;

    /* renamed from: h */
    public boolean f162846h;

    /* renamed from: i */
    public AbstractC89171a<C89391z> f162847i;

    /* renamed from: j */
    public View f162848j;

    /* renamed from: k */
    public boolean f162849k;

    /* renamed from: l */
    public boolean f162850l;

    /* renamed from: m */
    public CommonItemView f162851m;

    /* renamed from: n */
    public final boolean f162852n;

    /* renamed from: o */
    public List<C72683v> f162853o;

    /* renamed from: p */
    public VideoPublishEditModel f162854p;

    /* renamed from: q */
    public String f162855q;

    /* renamed from: r */
    public View f162856r;

    /* renamed from: s */
    public final Fragment f162857s;

    /* renamed from: t */
    public final boolean f162858t;

    /* renamed from: u */
    public final int f162859u = 5;

    /* renamed from: v */
    public final boolean f162860v;

    /* renamed from: w */
    public final boolean f162861w;

    /* renamed from: y */
    private int f162862y;

    /* renamed from: z */
    private final C71859c f162863z;

    static {
        Covode.recordClassIndex(85327);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$a */
    public static final class C72645a {
        static {
            Covode.recordClassIndex(85328);
        }

        private C72645a() {
        }

        /* renamed from: b */
        public static int m128145b() {
            if (C71907a.m126982a() || m128146c()) {
                return 1;
            }
            return 0;
        }

        /* renamed from: a */
        public static boolean m128144a() {
            if (C65357b.m117053i()) {
                IAVSettingService createIAVSettingServicebyMonsterPlugin = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
                C89219l.m154716b(createIAVSettingServicebyMonsterPlugin, "");
                if (!createIAVSettingServicebyMonsterPlugin.getSaveAtPost()) {
                    return m128146c();
                }
            }
            return false;
        }

        /* renamed from: c */
        private static boolean m128146c() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                Boolean silentShareConfigurable = iESSettingsProxy.getSilentShareConfigurable();
                C89219l.m154716b(silentShareConfigurable, "");
                return silentShareConfigurable.booleanValue();
            } catch (C16041a unused) {
                return true;
            }
        }

        public /* synthetic */ C72645a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo114935a() {
        CommonItemView commonItemView = this.f162851m;
        if (commonItemView != null) {
            return commonItemView.mo27138d();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo114934a(boolean z) {
        this.f162846h = z;
        this.f162841c = !z;
        this.f162842d = !z;
    }

    /* renamed from: a */
    public final void mo114931a(LinearLayout linearLayout, List<C72683v> list, VideoPublishEditModel videoPublishEditModel) {
        T t;
        T t2;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (t2.f162953f == EnumC72684w.SAVE_LOCAL) {
                    break;
                }
            }
            t = t2;
        } else {
            t = null;
        }
        if (t != null) {
            String string = linearLayout.getContext().getString(R.string.fds);
            C89219l.m154716b(string, "");
            C89219l.m154721d(string, "");
            t.f162954g = string;
            C89219l.m154721d("", "");
            t.f162955h = "";
        }
        if (m128125e() && t != null) {
            t.f162957j = false;
            if (t.f162950c == null && t != null) {
                t.f162950c = new C72660n(linearLayout);
            }
        }
        m128118a(linearLayout);
        CommonItemView commonItemView = this.f162851m;
        if (commonItemView != null) {
            commonItemView.setOnClickListener(new C72661o(this, list, videoPublishEditModel));
        }
        m128124d(videoPublishEditModel);
    }

    /* renamed from: a */
    public final void mo114933a(VideoPublishEditModel videoPublishEditModel) {
        CommonItemView commonItemView = this.f162851m;
        if (commonItemView != null) {
            int i = !commonItemView.mo27138d();
            ActivityC0945e requireActivity = this.f162857s.requireActivity();
            C89219l.m154716b(requireActivity, "");
            C73496bd.m129633a(requireActivity, i, videoPublishEditModel, "CheckDownload", new C72671t(commonItemView));
        }
    }

    /* renamed from: a */
    public final void mo114932a(Fragment fragment, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(fragment, "");
        ActivityC0945e activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        if (C71909c.m126984a()) {
            C73502bf bfVar = new C73502bf(fragment, C65687t.m117580b(), C72631i.C72632a.m128111a(), this.f162850l);
            int i = bfVar.f165140b;
            boolean z = bfVar.f165141c;
            boolean z2 = bfVar.f165142d;
            Bundle bundle = new Bundle();
            bundle.putInt("save_option", i);
            bundle.putBoolean("mute_download", z);
            bundle.putBoolean("download_grayTag", z2);
            C73498be beVar = new C73498be();
            beVar.setArguments(bundle);
            new C23226a.C23227a().mo37817a(beVar).mo37819a(true).f55057a.show(bfVar.f165139a.getChildFragmentManager(), "SaveLocalWithCaptionSheet");
            return;
        }
        C89219l.m154716b(activity, "");
        int b = C65687t.m117580b();
        boolean a = C72631i.C72632a.m128111a();
        boolean z3 = this.f162850l;
        C89219l.m154721d(activity, "");
        SelectSaveLocalOptionActivity.f164683d = videoPublishEditModel;
        Intent intent = new Intent(activity, SelectSaveLocalOptionActivity.class);
        intent.putExtra("extra_save_option", b);
        intent.putExtra("mute_download", a);
        intent.putExtra("download_gray_tag", z3);
        activity.startActivityForResult(intent, 7);
        if (!SettingsManager.m29616a().mo25400a("enable_high_quality_video", false)) {
            activity.overridePendingTransition(R.anim.p, R.anim.o);
        }
    }

    /* renamed from: b */
    public final SelectSaveLocalOptionActivity.AbstractC73323b mo114937b() {
        return new C72673v(this);
    }

    /* renamed from: f */
    public final int mo114940f() {
        if (this.f162843e) {
            return 0;
        }
        return 3;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$s */
    static final class C72667s extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72644n f162908a;

        /* renamed from: b */
        final /* synthetic */ View f162909b;

        static {
            Covode.recordClassIndex(85350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72667s(C72644n nVar, View view) {
            super(0);
            this.f162908a = nVar;
            this.f162909b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f162909b.postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72644n.C72667s.RunnableC726681 */

                /* renamed from: a */
                final /* synthetic */ C72667s f162910a;

                static {
                    Covode.recordClassIndex(85351);
                }

                {
                    this.f162910a = r1;
                }

                public final void run() {
                    String string = C72644n.m128116a(this.f162910a.f162908a).getString(R.string.azo);
                    C89219l.m154716b(string, "");
                    C23329a a = ((C23329a) new C23329a(C72644n.m128116a(this.f162910a.f162908a)).mo38041b(this.f162910a.f162909b).mo38034a(EnumC23352h.TOP)).mo38022a(string);
                    a.f55300a.f55327f = -70;
                    a.f55300a.f55328g = 20;
                    final AbstractC23317a d = a.mo38045c(-70).mo38030a(3000L).mo38012d();
                    d.mo38006a(true, new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72644n.C72667s.RunnableC726681.View$OnClickListenerC726691 */

                        static {
                            Covode.recordClassIndex(85352);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            d.dismiss();
                        }
                    });
                    this.f162910a.f162909b.post(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72644n.C72667s.RunnableC726681.RunnableC726702 */

                        static {
                            Covode.recordClassIndex(85353);
                        }

                        public final void run() {
                            d.mo38001a();
                        }
                    });
                    VideoPublishEditModel videoPublishEditModel = this.f162910a.f162908a.f162854p;
                    if (videoPublishEditModel != null) {
                        C39162r.m79460a("video_privacy_settings_toast_show", new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_from", "video_post_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("content_source", videoPublishEditModel.getAvetParameter().getContentSource()).mo129406a("content_type", C70968bl.m125249a(videoPublishEditModel)).f188764a);
                    }
                }
            }, 200);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$h */
    public static final class CallableC72652h<V> implements Callable {

        /* renamed from: a */
        public static final CallableC72652h f162877a = new CallableC72652h();

        static {
            Covode.recordClassIndex(85335);
        }

        CallableC72652h() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC63269z zVar = C63238c.f143594u;
            return zVar.mo93896a(zVar.mo93904c(), C63238c.f143594u.mo93905d());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$u */
    public static final class C72672u implements C72631i.AbstractC72633b {

        /* renamed from: a */
        final /* synthetic */ C72631i.AbstractC72633b f162914a;

        /* renamed from: b */
        final /* synthetic */ Dialog f162915b;

        /* renamed from: c */
        final /* synthetic */ String f162916c;

        static {
            Covode.recordClassIndex(85355);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
        /* renamed from: a */
        public final void mo114916a() {
            this.f162914a.mo114916a();
            this.f162915b.dismiss();
            C72631i.C72632a.m128110a("", this.f162916c, "video_post_page", "download_with_publish", "download");
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
        /* renamed from: b */
        public final void mo114917b() {
            this.f162914a.mo114917b();
            this.f162915b.dismiss();
            C72631i.C72632a.m128110a("", this.f162916c, "video_post_page", "download_with_publish", "cancel");
        }

        C72672u(C72631i.AbstractC72633b bVar, Dialog dialog, String str) {
            this.f162914a = bVar;
            this.f162915b = dialog;
            this.f162916c = str;
        }
    }

    /* renamed from: e */
    public static boolean m128125e() {
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar == null || !cVar.isPreventDownload()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo114941g() {
        int a = C65352av.m117037a();
        if (!C65404cp.m117105a()) {
            return false;
        }
        if ((a == 2 || a == 1) && !this.f162861w && !this.f162860v) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$o */
    public static final class C72661o extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C72644n f162891a;

        /* renamed from: b */
        final /* synthetic */ List f162892b;

        /* renamed from: c */
        final /* synthetic */ VideoPublishEditModel f162893c;

        static {
            Covode.recordClassIndex(85344);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$o$a */
        static final class C72662a implements AbstractC0952i.AbstractC0955c {

            /* renamed from: a */
            final /* synthetic */ C72661o f162894a;

            static {
                Covode.recordClassIndex(85345);
            }

            C72662a(C72661o oVar) {
                this.f162894a = oVar;
            }

            @Override // androidx.fragment.app.AbstractC0952i.AbstractC0955c
            /* renamed from: a */
            public final void mo3582a() {
                Object obj;
                List list = this.f162894a.f162892b;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C72683v) obj).f162953f == EnumC72684w.DOWNLOAD) {
                            break;
                        }
                    }
                    C72683v vVar = (C72683v) obj;
                    if (vVar != null) {
                        this.f162894a.f162891a.f162843e = vVar.f162957j;
                    }
                }
                this.f162894a.f162891a.f162844f = true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            AbstractC0952i supportFragmentManager;
            C72644n.m128122c();
            if (this.f162891a.f162845g == null) {
                List list = this.f162892b;
                if (list != null) {
                    C72644n nVar = this.f162891a;
                    VideoPublishEditModel videoPublishEditModel = this.f162893c;
                    int a = C65352av.m117037a();
                    if (!C63238c.f143594u.mo93901a() && C65404cp.m117105a() && ((a == 2 || a == 1) && C72681t.m128157a())) {
                        EnumC72684w wVar = EnumC72684w.DOWNLOAD;
                        String string = nVar.f162857s.getString(R.string.sn);
                        C89219l.m154716b(string, "");
                        C72683v vVar = new C72683v(wVar, string, "", 2131233520, nVar.f162843e, new C72648d(videoPublishEditModel));
                        if (!C72681t.f162944a && !nVar.f162843e) {
                            vVar.f162950c = C72649e.f162869a;
                        }
                        list.add(vVar);
                    }
                }
                C72644n nVar2 = this.f162891a;
                nVar2.f162845g = nVar2.mo114927a(nVar2.f162861w, this.f162893c);
                ActivityC0945e activity = this.f162891a.f162857s.getActivity();
                if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                    supportFragmentManager.mo3556a(new C72662a(this));
                }
            }
            CommonItemView commonItemView = this.f162891a.f162851m;
            if (commonItemView != null) {
                commonItemView.setRightText(this.f162891a.f162855q);
            }
            if (this.f162891a.f162861w) {
                Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
                CommonItemView commonItemView2 = this.f162891a.f162851m;
                if (commonItemView2 != null) {
                    commonItemView2.mo27136c();
                }
            }
            this.f162891a.mo114939d();
            if (C71909c.m126984a()) {
                C72644n.m128120b(this.f162893c);
            }
        }

        C72661o(C72644n nVar, List list, VideoPublishEditModel videoPublishEditModel) {
            this.f162891a = nVar;
            this.f162892b = list;
            this.f162893c = videoPublishEditModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$b */
    public static final class C72646b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72644n f162864a;

        static {
            Covode.recordClassIndex(85329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72646b(C72644n nVar) {
            super(0);
            this.f162864a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            View view;
            MethodCollector.m26663i(6913);
            C72644n nVar = this.f162864a;
            if (C71909c.m126984a() && (view = nVar.f162848j) != null) {
                view.setVisibility(0);
                Context context = nVar.f162839a;
                if (context == null) {
                    C89219l.m154710a("mContext");
                }
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.anim.bn);
                if (loadAnimator != null) {
                    AnimatorSet animatorSet = (AnimatorSet) loadAnimator;
                    animatorSet.setTarget(view);
                    animatorSet.start();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.animation.AnimatorSet");
                    MethodCollector.m26664o(6913);
                    throw nullPointerException;
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(6913);
            return zVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$m */
    public static final class C72658m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72644n f162887a;

        /* renamed from: b */
        final /* synthetic */ TextView f162888b;

        static {
            Covode.recordClassIndex(85341);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72658m(C72644n nVar, TextView textView) {
            super(0);
            this.f162887a = nVar;
            this.f162888b = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            boolean a = AVUIUXBugsExperimentServiceDiff.m103001b().mo93971a();
            String string = this.f162887a.f162857s.requireActivity().getString(R.string.bi);
            C89219l.m154716b(string, "");
            C23329a a2 = ((C23329a) new C23329a(C72644n.m128116a(this.f162887a)).mo38041b(this.f162888b).mo38034a(EnumC23352h.BOTTOM).mo38036a(true).mo38037a(true, (View.OnClickListener) null)).mo38022a(string);
            if (a) {
                a2.mo38039b(-80);
                a2.mo38045c(-100);
            } else {
                a2.mo38045c(-50);
            }
            final AbstractC23317a d = a2.mo38012d();
            CommonItemView commonItemView = this.f162887a.f162851m;
            if (commonItemView != null) {
                commonItemView.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72644n.C72658m.RunnableC726591 */

                    static {
                        Covode.recordClassIndex(85342);
                    }

                    public final void run() {
                        d.mo38001a();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public static void m128122c() {
        int i;
        if (C71910d.m126985a() && (i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("click_advanced_settings_times", 0)) < 3) {
            Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("click_advanced_settings_times", i + 1);
        }
    }

    /* renamed from: h */
    private void m128126h() {
        boolean z;
        String str;
        C73991bj.m130128a("PublishEnhancement -> clickAdvancedSettingsTimes = " + C65687t.m117581c());
        if (C65687t.m117581c() < 3) {
            z = true;
        } else {
            z = false;
        }
        boolean a = SettingsManager.m29616a().mo25400a("enable_high_quality_video", false);
        if (!z || !a) {
            str = null;
        } else {
            Context context = this.f162839a;
            if (context == null) {
                C89219l.m154710a("mContext");
            }
            str = context.getString(R.string.ey6);
        }
        CommonItemView commonItemView = this.f162851m;
        if (commonItemView != null) {
            commonItemView.setDesc(str);
        }
        CommonItemView commonItemView2 = this.f162851m;
        if (commonItemView2 != null) {
            commonItemView2.mo27136c();
        }
    }

    /* renamed from: d */
    public final void mo114939d() {
        IBinder iBinder;
        AbstractC0952i iVar;
        View currentFocus;
        Context context = this.f162839a;
        if (context == null) {
            C89219l.m154710a("mContext");
        }
        Object a = m128117a(context, "input_method");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) a;
        View view = this.f162857s.getView();
        if (view != null) {
            iBinder = view.getWindowToken();
        } else {
            iBinder = null;
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 2);
        ActivityC0945e activity = this.f162857s.getActivity();
        if (!(activity == null || (currentFocus = activity.getCurrentFocus()) == null)) {
            currentFocus.clearFocus();
        }
        C73474ax axVar = this.f162845g;
        if (axVar != null) {
            ActivityC0945e activity2 = this.f162857s.getActivity();
            if (activity2 != null) {
                iVar = activity2.getSupportFragmentManager();
            } else {
                iVar = null;
            }
            if (!axVar.isAdded() && iVar != null && iVar.mo3551a("publish_setting") == null && iVar != null) {
                iVar.mo3552a().mo3452a(R.anim.w, R.anim.x, R.anim.o, R.anim.x).mo3454a(R.id.dnh, axVar, "publish_setting").mo3457a((String) null).mo3467b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$v */
    public static final class C72673v implements SelectSaveLocalOptionActivity.AbstractC73323b {

        /* renamed from: a */
        final /* synthetic */ C72644n f162917a;

        static {
            Covode.recordClassIndex(85356);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity.AbstractC73323b
        /* renamed from: a */
        public final void mo114954a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity.AbstractC73323b
        /* renamed from: b */
        public final void mo114956b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72673v(C72644n nVar) {
            this.f162917a = nVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity.AbstractC73323b
        /* renamed from: a */
        public final void mo114955a(int i) {
            this.f162917a.f162850l = false;
            this.f162917a.mo114928a(i);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m128116a(C72644n nVar) {
        Context context = nVar.f162839a;
        if (context == null) {
            C89219l.m154710a("mContext");
        }
        return context;
    }

    /* renamed from: c */
    private static boolean m128123c(VideoPublishEditModel videoPublishEditModel) {
        C69905c cVar;
        if ((videoPublishEditModel == null || !videoPublishEditModel.hasOriginalSound()) && (cVar = C70005cr.m123611a().f156482a) != null && !cVar.isCommerceMusic()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo114925a(float f) {
        return (int) C13628n.m24520b(this.f162857s.getContext(), f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$c */
    public static final class C72647c extends AbstractC89220m implements AbstractC89172b<C68348f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72636j f162865a;

        /* renamed from: b */
        final /* synthetic */ C72636j f162866b;

        /* renamed from: c */
        final /* synthetic */ C72636j f162867c;

        static {
            Covode.recordClassIndex(85330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72647c(C72636j jVar, C72636j jVar2, C72636j jVar3) {
            super(1);
            this.f162865a = jVar;
            this.f162866b = jVar2;
            this.f162867c = jVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C68348f fVar) {
            boolean z;
            boolean z2;
            C68348f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            C72636j jVar = this.f162865a;
            boolean z3 = true;
            if (fVar2.f152997s == 3) {
                z = true;
            } else {
                z = false;
            }
            jVar.mo114921a(z);
            C72636j jVar2 = this.f162866b;
            if (fVar2.f152999u == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo114921a(z2);
            C72636j jVar3 = this.f162867c;
            if (fVar2.f152996r != 3) {
                z3 = false;
            }
            jVar3.mo114921a(z3);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$i */
    public static final class C72653i<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C72644n f162878a;

        static {
            Covode.recordClassIndex(85336);
        }

        public C72653i(C72644n nVar) {
            this.f162878a = nVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            AbstractC32846a aVar = (AbstractC32846a) iVar.mo5545d();
            if (aVar != null) {
                if (this.f162878a.f162843e && (!aVar.mo58667j() || !aVar.mo58668k())) {
                    this.f162878a.f162843e = false;
                }
                C72681t.f162944a = aVar.mo58667j();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$j */
    static final class View$OnClickListenerC72654j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72644n f162879a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f162880b;

        /* renamed from: c */
        final /* synthetic */ VideoPublishEditModel f162881c;

        static {
            Covode.recordClassIndex(85337);
        }

        View$OnClickListenerC72654j(C72644n nVar, LinearLayout linearLayout, VideoPublishEditModel videoPublishEditModel) {
            this.f162879a = nVar;
            this.f162880b = linearLayout;
            this.f162881c = videoPublishEditModel;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            if (C72631i.C72632a.m128111a() || !C72644n.m128125e() || !C71907a.m126982a()) {
                C72644n nVar = this.f162879a;
                nVar.mo114932a(nVar.f162857s, this.f162881c);
                return;
            }
            C89219l.m154716b(view, "");
            new C23144b(view).mo37635a(this.f162880b.getContext().getString(R.string.fdx)).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$l */
    static final class View$OnClickListenerC72657l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72644n f162885a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f162886b;

        static {
            Covode.recordClassIndex(85340);
        }

        View$OnClickListenerC72657l(C72644n nVar, VideoPublishEditModel videoPublishEditModel) {
            this.f162885a = nVar;
            this.f162886b = videoPublishEditModel;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            if (C72644n.m128125e()) {
                C89219l.m154716b(view, "");
                new C23144b(view).mo37640e(R.string.fdx).mo37637b();
                return;
            }
            this.f162885a.mo114933a(this.f162886b);
        }
    }

    /* renamed from: b */
    private final void m128119b(int i) {
        String string;
        this.f162862y = i;
        CommonItemView commonItemView = this.f162851m;
        if (commonItemView != null) {
            if (i == 1) {
                Context context = this.f162839a;
                if (context == null) {
                    C89219l.m154710a("mContext");
                }
                string = context.getString(R.string.a9r);
            } else if (i != 2) {
                Context context2 = this.f162839a;
                if (context2 == null) {
                    C89219l.m154710a("mContext");
                }
                string = context2.getString(R.string.dkc);
            } else {
                Context context3 = this.f162839a;
                if (context3 == null) {
                    C89219l.m154710a("mContext");
                }
                string = context3.getString(R.string.a9q);
            }
            commonItemView.setRightText(string);
        }
    }

    /* renamed from: c */
    public static int m128121c(CommonSettingItemStatus commonSettingItemStatus) {
        C89219l.m154721d(commonSettingItemStatus, "");
        if (!CrossLanguageUserExperiment.m103003c().mo93972a()) {
            return 0;
        }
        if (C89219l.m154714a((Object) commonSettingItemStatus._checked.getValue(), (Object) true)) {
            return 1;
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo114926a(CommonSettingItemStatus commonSettingItemStatus) {
        C89219l.m154721d(commonSettingItemStatus, "");
        if (C65404cp.m117105a()) {
            int a = C65352av.m117037a();
            if (a == 1 || a == 2) {
                if (this.f162840b) {
                    return 0;
                }
                return 3;
            } else if (C89219l.m154714a((Object) commonSettingItemStatus._checked.getValue(), (Object) true)) {
                return 0;
            } else {
                return 3;
            }
        } else if (C89219l.m154714a((Object) commonSettingItemStatus._checked.getValue(), (Object) true)) {
            return 0;
        } else {
            return 3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$g */
    public static final class View$OnClickListenerC72651g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseShortVideoContext f162874a;

        /* renamed from: b */
        final /* synthetic */ CommonSettingItemStatus f162875b;

        /* renamed from: c */
        final /* synthetic */ HashMap f162876c;

        static {
            Covode.recordClassIndex(85334);
        }

        public View$OnClickListenerC72651g(BaseShortVideoContext baseShortVideoContext, CommonSettingItemStatus commonSettingItemStatus, HashMap hashMap) {
            this.f162874a = baseShortVideoContext;
            this.f162875b = commonSettingItemStatus;
            this.f162876c = hashMap;
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickAgent.onClick(view);
            this.f162875b._checked.setValue(Boolean.valueOf(!C89219l.m154714a((Object) this.f162875b._checked.getValue(), (Object) true)));
            if (C89219l.m154714a((Object) this.f162875b._checked.getValue(), (Object) true)) {
                i = 0;
            } else {
                i = 3;
            }
            if (C89064i.m154489a(new Integer[]{0, 3}, Integer.valueOf(i))) {
                C40383b.f94572c = i;
                C40383b.f94571b.storeInt("privacy_setting_comment", i);
            }
            HashMap hashMap = this.f162876c;
            if (hashMap != null) {
                if (C89219l.m154714a((Object) this.f162875b._checked.getValue(), (Object) true)) {
                    str = "off";
                } else {
                    str = "on";
                }
                hashMap.put("to_status", str);
                C39162r.m79460a("disable_comment", this.f162876c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$k */
    static final class View$OnClickListenerC72655k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72644n f162882a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f162883b;

        static {
            Covode.recordClassIndex(85338);
        }

        View$OnClickListenerC72655k(C72644n nVar, VideoPublishEditModel videoPublishEditModel) {
            this.f162882a = nVar;
            this.f162883b = videoPublishEditModel;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            if (C65687t.m117580b() == 0) {
                C72644n nVar = this.f162882a;
                C726561 r4 = new C72631i.AbstractC72633b(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72644n.View$OnClickListenerC72655k.C726561 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC72655k f162884a;

                    static {
                        Covode.recordClassIndex(85339);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
                    /* renamed from: b */
                    public final void mo114917b() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
                    /* renamed from: a */
                    public final void mo114916a() {
                        this.f162884a.f162882a.f162850l = false;
                        CommonItemView commonItemView = this.f162884a.f162882a.f162851m;
                        if (commonItemView == null) {
                            C89219l.m154715b();
                        }
                        commonItemView.setAlpha(1.0f);
                        this.f162884a.f162882a.mo114933a(this.f162884a.f162883b);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f162884a = r1;
                    }
                };
                AbstractC32846a e = C63238c.f143594u.mo93906e();
                String str = "";
                if (!(e == null || e.mo58660c() == null)) {
                    String c = e.mo58660c();
                    C89219l.m154716b(c, str);
                    str = c;
                }
                C72631i iVar = new C72631i();
                Context context = nVar.f162839a;
                if (context == null) {
                    C89219l.m154710a("mContext");
                }
                Dialog a = iVar.mo114915a(context);
                if (a != null) {
                    iVar.f162808a = new C72672u(r4, a, str);
                    a.show();
                    return;
                }
                return;
            }
            this.f162882a.mo114933a(this.f162883b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$p */
    public static final class C72663p extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C72644n f162895a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f162896b;

        static {
            Covode.recordClassIndex(85346);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            C72644n.m128122c();
            if (this.f162895a.f162845g == null) {
                C72644n nVar = this.f162895a;
                nVar.f162845g = nVar.mo114927a(nVar.f162861w, this.f162896b);
            }
            CommonItemView commonItemView = this.f162895a.f162851m;
            if (commonItemView != null) {
                commonItemView.setRightText(this.f162895a.f162855q);
            }
            if (this.f162895a.f162861w) {
                Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
                CommonItemView commonItemView2 = this.f162895a.f162851m;
                if (commonItemView2 != null) {
                    commonItemView2.mo27136c();
                }
            }
            this.f162895a.mo114939d();
            if (C71909c.m126984a()) {
                C72644n.m128120b(this.f162896b);
            }
        }

        C72663p(C72644n nVar, VideoPublishEditModel videoPublishEditModel) {
            this.f162895a = nVar;
            this.f162896b = videoPublishEditModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$w */
    static final class C72674w extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72644n f162918a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f162919b;

        static {
            Covode.recordClassIndex(85357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72674w(C72644n nVar, AbstractC89171a aVar) {
            super(1);
            this.f162918a = nVar;
            this.f162919b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = C72644n.m128116a(this.f162918a).getResources().getString(R.string.bdu);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72644n.C72674w.C726751 */

                /* renamed from: a */
                final /* synthetic */ C72674w f162920a;

                static {
                    Covode.recordClassIndex(85358);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f162920a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    AbstractC89171a<C89391z> aVar2 = this.f162920a.f162918a.f162847i;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    C71073b.m125571b(this.f162920a.f162918a.f162854p);
                    this.f162920a.f162919b.invoke();
                    return C89391z.f203057a;
                }
            });
            String string2 = C72644n.m128116a(this.f162918a).getResources().getString(R.string.bdo);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, (AbstractC89172b<? super C23024a, C89391z>) null);
            bVar2.f54513b = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static void m128120b(VideoPublishEditModel videoPublishEditModel) {
        C39162r.m79460a("click_advanced_settings_entrance", new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_from", "video_post_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("content_source", videoPublishEditModel.getAvetParameter().getContentSource()).mo129406a("content_type", C70968bl.m125249a(videoPublishEditModel)).f188764a);
    }

    /* renamed from: d */
    private final void m128124d(VideoPublishEditModel videoPublishEditModel) {
        TextView tvwLeft;
        if (C71910d.m126985a()) {
            m128126h();
            return;
        }
        CommonItemView commonItemView = this.f162851m;
        if (commonItemView != null && (tvwLeft = commonItemView.getTvwLeft()) != null && this.f162860v && !C63238c.f143586m.mo93857d().mo93860a().booleanValue() && C88278m.m153407a(videoPublishEditModel)) {
            C71857b bVar = new C71857b("high_quality_video", 1000, new C72658m(this, tvwLeft), (byte) 0);
            C71859c cVar = this.f162863z;
            if (cVar != null) {
                cVar.mo113505a(bVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$f */
    public static final class View$OnClickListenerC72650f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72644n f162870a;

        /* renamed from: b */
        final /* synthetic */ boolean f162871b;

        /* renamed from: c */
        final /* synthetic */ String f162872c;

        /* renamed from: d */
        final /* synthetic */ HashMap f162873d;

        static {
            Covode.recordClassIndex(85333);
        }

        public View$OnClickListenerC72650f(C72644n nVar, boolean z, String str, HashMap hashMap) {
            this.f162870a = nVar;
            this.f162871b = z;
            this.f162872c = str;
            this.f162873d = hashMap;
        }

        public final void onClick(View view) {
            boolean z;
            boolean z2;
            ClickAgent.onClick(view);
            Fragment fragment = this.f162870a.f162857s;
            Intent intent = new Intent(this.f162870a.f162857s.getContext(), PublishPrivacySettingActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("comment_item_checked", this.f162870a.f162840b);
            boolean z3 = true;
            if (!this.f162870a.f162841c || this.f162870a.f162846h) {
                z = false;
            } else {
                z = true;
            }
            bundle.putBoolean("react_duet_item_checked", z);
            if (!this.f162870a.f162842d || this.f162870a.f162846h) {
                z2 = false;
            } else {
                z2 = true;
            }
            bundle.putBoolean("stitch_item_checked", z2);
            bundle.putBoolean("download_item_checked", this.f162870a.f162843e);
            if (!this.f162871b || this.f162870a.f162846h) {
                z3 = false;
            }
            bundle.putBoolean("can_react_duet", z3);
            bundle.putString("creation_id", this.f162872c);
            bundle.putSerializable("mob_data", this.f162873d);
            intent.putExtras(bundle);
            fragment.startActivityForResult(intent, this.f162870a.f162859u);
            C39162r.m79460a("click_advanced_settings", new C84425b().mo129406a("creation_id", this.f162872c).mo129406a("enter_from", "video_post_page").f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$q */
    public static final class View$OnClickListenerC72664q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72644n f162897a;

        /* renamed from: b */
        final /* synthetic */ BaseShortVideoContext f162898b;

        /* renamed from: c */
        final /* synthetic */ CommonSettingItemStatus f162899c;

        /* renamed from: d */
        final /* synthetic */ String f162900d;

        /* renamed from: e */
        final /* synthetic */ HashMap f162901e;

        static {
            Covode.recordClassIndex(85347);
        }

        public View$OnClickListenerC72664q(C72644n nVar, BaseShortVideoContext baseShortVideoContext, CommonSettingItemStatus commonSettingItemStatus, String str, HashMap hashMap) {
            this.f162897a = nVar;
            this.f162898b = baseShortVideoContext;
            this.f162899c = commonSettingItemStatus;
            this.f162900d = str;
            this.f162901e = hashMap;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            C63244g.m114602a().mo73277e().setReactDuetSettingChanged(true);
            if (C89219l.m154714a((Object) this.f162899c._checked.getValue(), (Object) true)) {
                C726651 r5 = new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72644n.View$OnClickListenerC72664q.C726651 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC72664q f162902a;

                    static {
                        Covode.recordClassIndex(85348);
                    }

                    {
                        this.f162902a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        String str;
                        String str2;
                        C63244g.m114602a().mo73277e().setReactDuetSettingCurrent(C68034bs.f152395f);
                        this.f162902a.f162899c._checked.setValue(Boolean.valueOf(!C89219l.m154714a((Object) this.f162902a.f162899c._checked.getValue(), (Object) true)));
                        C84425b a = new C84425b().mo129406a("creation_id", this.f162902a.f162900d).mo129406a("enter_from", "video_post_page");
                        if (C89219l.m154714a((Object) this.f162902a.f162899c._checked.getValue(), (Object) true)) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        C84425b a2 = a.mo129406a("to_status", str);
                        HashMap hashMap = this.f162902a.f162901e;
                        if (hashMap != null) {
                            str2 = (String) hashMap.get("shoot_way");
                        } else {
                            str2 = null;
                        }
                        C39162r.m79460a("click_react_duet_control", a2.mo129406a("shoot_way", str2).f188764a);
                        return C89391z.f203057a;
                    }
                };
                VideoPublishEditModel videoPublishEditModel = this.f162897a.f162854p;
                if (videoPublishEditModel == null || C71073b.m125559a(videoPublishEditModel.getMainBusinessContext()) == null) {
                    r5.invoke();
                    return;
                }
                C72644n nVar = this.f162897a;
                Context context = nVar.f162839a;
                if (context == null) {
                    C89219l.m154710a("mContext");
                }
                C23023b bVar = (C23023b) new C23023b(context).mo37482a(false);
                Context context2 = nVar.f162839a;
                if (context2 == null) {
                    C89219l.m154710a("mContext");
                }
                C23028c.m43435a(bVar.mo37413d(context2.getResources().getString(R.string.be8)), new C72674w(nVar, r5)).mo37405a().mo37396b().show();
                return;
            }
            C63244g.m114602a().mo73277e().setReactDuetSettingCurrent(C68034bs.f152394e);
            this.f162899c._checked.setValue(Boolean.valueOf(true ^ C89219l.m154714a((Object) this.f162899c._checked.getValue(), (Object) true)));
            C84425b a = new C84425b().mo129406a("creation_id", this.f162900d).mo129406a("enter_from", "video_post_page");
            if (C89219l.m154714a((Object) this.f162899c._checked.getValue(), (Object) true)) {
                str = "on";
            } else {
                str = "off";
            }
            C84425b a2 = a.mo129406a("to_status", str);
            HashMap hashMap = this.f162901e;
            if (hashMap != null) {
                str2 = (String) hashMap.get("shoot_way");
            } else {
                str2 = null;
            }
            C39162r.m79460a("click_react_duet_control", a2.mo129406a("shoot_way", str2).f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$r */
    public static final class View$OnClickListenerC72666r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseShortVideoContext f162903a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f162904b;

        /* renamed from: c */
        final /* synthetic */ CommonSettingItemStatus f162905c;

        /* renamed from: d */
        final /* synthetic */ String f162906d;

        /* renamed from: e */
        final /* synthetic */ HashMap f162907e;

        static {
            Covode.recordClassIndex(85349);
        }

        public View$OnClickListenerC72666r(BaseShortVideoContext baseShortVideoContext, C89233z.C89234a aVar, CommonSettingItemStatus commonSettingItemStatus, String str, HashMap hashMap) {
            this.f162903a = baseShortVideoContext;
            this.f162904b = aVar;
            this.f162905c = commonSettingItemStatus;
            this.f162906d = str;
            this.f162907e = hashMap;
        }

        public final void onClick(View view) {
            int i;
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            AVPreferences e = C63244g.m114602a().mo73277e();
            if (C89219l.m154714a((Object) this.f162905c._checked.getValue(), (Object) true)) {
                i = C68034bs.f152394e;
            } else {
                i = C68034bs.f152395f;
            }
            e.setStitchSettingCurrent(i);
            this.f162905c._checked.setValue(Boolean.valueOf(!C89219l.m154714a((Object) this.f162905c._checked.getValue(), (Object) true)));
            C84425b a = new C84425b().mo129406a("creation_id", this.f162906d).mo129406a("enter_from", "video_post_page");
            if (C89219l.m154714a((Object) this.f162905c._checked.getValue(), (Object) true)) {
                str = "on";
            } else {
                str = "off";
            }
            C84425b a2 = a.mo129406a("to_status", str);
            HashMap hashMap = this.f162907e;
            String str4 = null;
            if (hashMap != null) {
                str2 = (String) hashMap.get("content_type");
            } else {
                str2 = null;
            }
            C84425b a3 = a2.mo129406a("content_type", str2);
            HashMap hashMap2 = this.f162907e;
            if (hashMap2 != null) {
                str3 = (String) hashMap2.get("content_source");
            } else {
                str3 = null;
            }
            C84425b a4 = a3.mo129406a("content_source", str3);
            HashMap hashMap3 = this.f162907e;
            if (hashMap3 != null) {
                str4 = (String) hashMap3.get("shoot_way");
            }
            C39162r.m79460a("click_stitch_control", a4.mo129406a("shoot_way", str4).f188764a);
        }
    }

    /* renamed from: a */
    private final void m128118a(LinearLayout linearLayout) {
        CommonItemView commonItemView;
        MethodCollector.m26663i(7692);
        View a = C1764a.m5927a(LayoutInflater.from(linearLayout.getContext()), R.layout.agq, linearLayout, false);
        this.f162848j = a.findViewById(R.id.bf0);
        this.f162851m = (CommonItemView) a.findViewById(R.id.daj);
        C89219l.m154716b(a, "");
        C23163i.m43660a(a, (Integer) 0, (Integer) 0, (Integer) 0, (Integer) 0, false, 16);
        linearLayout.addView(a);
        if (C71909c.m126984a()) {
            CommonItemView commonItemView2 = this.f162851m;
            if (commonItemView2 != null) {
                commonItemView2.setLeftIcon(2131232392);
            }
            CommonItemView commonItemView3 = this.f162851m;
            if (commonItemView3 != null) {
                Context context = this.f162839a;
                if (context == null) {
                    C89219l.m154710a("mContext");
                }
                commonItemView3.setLeftText(context.getString(R.string.azf));
            }
            CommonItemView commonItemView4 = this.f162851m;
            if (commonItemView4 != null) {
                commonItemView4.setRightIconRes(2131230993);
            }
        }
        if (!this.f162861w || Keva.getRepo("sponsored_video_keva").getBoolean("sponsored", false) || (commonItemView = this.f162851m) == null) {
            MethodCollector.m26664o(7692);
            return;
        }
        commonItemView.mo27134b();
        MethodCollector.m26664o(7692);
    }

    /* renamed from: b */
    public final int mo114936b(CommonSettingItemStatus commonSettingItemStatus) {
        C89219l.m154721d(commonSettingItemStatus, "");
        if (C65404cp.m117105a()) {
            int a = C65352av.m117037a();
            if (a == 1 || a == 2) {
                if (this.f162841c) {
                    return 0;
                }
                return 1;
            } else if (C89219l.m154714a((Object) commonSettingItemStatus._checked.getValue(), (Object) true)) {
                return 0;
            } else {
                return 1;
            }
        } else if (C89219l.m154714a((Object) commonSettingItemStatus._checked.getValue(), (Object) true)) {
            return 0;
        } else {
            return 1;
        }
    }

    /* renamed from: a */
    public final void mo114928a(int i) {
        CommonItemView commonItemView = this.f162851m;
        if (commonItemView == null) {
            C89219l.m154715b();
        }
        commonItemView.setAlpha(1.0f);
        String a = C73979bb.m130114a(i);
        if (this.f162845g != null) {
            List<C72683v> list = this.f162853o;
            if (list != null) {
                for (T t : list) {
                    if (t.f162953f == EnumC72684w.SAVE_LOCAL_OPTIONS) {
                        t.mo114962a(a);
                        C73474ax axVar = this.f162845g;
                        if (axVar == null) {
                            C89219l.m154715b();
                        }
                        C73630e eVar = axVar.f165082a;
                        if (eVar != null) {
                            eVar.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        CommonItemView commonItemView2 = this.f162851m;
        if (commonItemView2 != null) {
            commonItemView2.setRightText(a);
        }
        m128119b(i);
    }

    /* renamed from: a */
    public final void mo114929a(View view) {
        C89219l.m154721d(view, "");
        C71857b bVar = new C71857b("video_privacy_settings_item", 3000, new C72667s(this, view), (byte) 0);
        C71859c cVar = this.f162863z;
        if (cVar != null) {
            cVar.mo113505a(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$e */
    static final class C72649e extends AbstractC89220m implements AbstractC89183m<View, CommonItemView, C89391z> {

        /* renamed from: a */
        public static final C72649e f162869a = new C72649e();

        static {
            Covode.recordClassIndex(85332);
        }

        C72649e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View view, CommonItemView commonItemView) {
            CommonItemView commonItemView2 = commonItemView;
            C89219l.m154721d(view, "");
            C89219l.m154721d(commonItemView2, "");
            new C23144b(commonItemView2).mo37640e(R.string.bbo).mo37637b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$t */
    public static final class C72671t extends AbstractC89220m implements AbstractC89183m<Boolean, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f162913a;

        static {
            Covode.recordClassIndex(85354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72671t(CommonItemView commonItemView) {
            super(2);
            this.f162913a = commonItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Boolean bool2) {
            bool.booleanValue();
            this.f162913a.setChecked(bool2.booleanValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$d */
    static final class C72648d extends AbstractC89220m implements AbstractC89183m<CommonItemView, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f162868a;

        static {
            Covode.recordClassIndex(85331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72648d(VideoPublishEditModel videoPublishEditModel) {
            super(2);
            this.f162868a = videoPublishEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(CommonItemView commonItemView, Boolean bool) {
            String str;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(commonItemView, "");
            C84425b a = new C84425b().mo129406a("creation_id", this.f162868a.creationId).mo129406a("enter_from", "video_post_page");
            if (booleanValue) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("click_download_control", a.mo129406a("to_status", str).f188764a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$n */
    static final class C72660n extends AbstractC89220m implements AbstractC89183m<View, CommonItemView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f162890a;

        static {
            Covode.recordClassIndex(85343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72660n(LinearLayout linearLayout) {
            super(2);
            this.f162890a = linearLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View view, CommonItemView commonItemView) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(commonItemView, "");
            Toast makeText = Toast.makeText(this.f162890a.getContext(), this.f162890a.getContext().getString(R.string.fdx), 0);
            if (Build.VERSION.SDK_INT == 25) {
                C80567ic.m139657a(makeText);
            }
            makeText.show();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static Object m128117a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7690);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(7690);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public final C73474ax mo114927a(boolean z, VideoPublishEditModel videoPublishEditModel) {
        if (C71909c.m126984a()) {
            C73478ay ayVar = new C73478ay();
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_enable_sponsor", z);
            bundle.putBoolean("key_general_music", m128123c(videoPublishEditModel));
            bundle.putBoolean("key_added_to_playlist", this.f162849k);
            ayVar.setArguments(bundle);
            return ayVar;
        }
        C73474ax axVar = new C73474ax();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("key_enable_sponsor", z);
        bundle2.putBoolean("key_general_music", m128123c(videoPublishEditModel));
        axVar.setArguments(bundle2);
        return axVar;
    }

    /* renamed from: a */
    public final void mo114930a(LinearLayout linearLayout, VideoPublishEditModel videoPublishEditModel) {
        MethodCollector.m26663i(7684);
        boolean z = true;
        int i = 0;
        if (videoPublishEditModel == null || !videoPublishEditModel.hasSubtitle()) {
            View a = C1764a.m5927a(LayoutInflater.from(linearLayout.getContext()), R.layout.aet, linearLayout, false);
            if (a != null) {
                this.f162851m = (CommonItemView) a;
                if (m128125e() || C72631i.C72632a.m128111a()) {
                    CommonItemView commonItemView = this.f162851m;
                    if (commonItemView == null) {
                        C89219l.m154715b();
                    }
                    commonItemView.setAlpha(0.34f);
                }
                if (!C72631i.C72632a.m128111a() || !C71907a.m126982a()) {
                    CommonItemView commonItemView2 = this.f162851m;
                    if (commonItemView2 != null) {
                        if (m128125e() || C65687t.m117580b() <= 0) {
                            z = false;
                        }
                        commonItemView2.setChecked(z);
                    }
                    CommonItemView commonItemView3 = this.f162851m;
                    if (commonItemView3 != null) {
                        commonItemView3.setOnClickListener(new View$OnClickListenerC72657l(this, videoPublishEditModel));
                    }
                } else {
                    CommonItemView commonItemView4 = this.f162851m;
                    if (commonItemView4 != null) {
                        commonItemView4.setChecked(false);
                    }
                    CommonItemView commonItemView5 = this.f162851m;
                    if (commonItemView5 != null) {
                        commonItemView5.setOnClickListener(new View$OnClickListenerC72655k(this, videoPublishEditModel));
                    }
                }
                linearLayout.addView(this.f162851m, new LinearLayout.LayoutParams(-1, mo114925a(52.0f)));
                MethodCollector.m26664o(7684);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
            MethodCollector.m26664o(7684);
            throw nullPointerException;
        }
        View a2 = C1764a.m5927a(LayoutInflater.from(linearLayout.getContext()), R.layout.aes, linearLayout, false);
        if (a2 != null) {
            CommonItemView commonItemView6 = (CommonItemView) a2;
            this.f162851m = commonItemView6;
            if (commonItemView6 != null) {
                if (m128125e() || C72631i.C72632a.m128111a()) {
                    CommonItemView commonItemView7 = this.f162851m;
                    if (commonItemView7 == null) {
                        C89219l.m154715b();
                    }
                    commonItemView7.setAlpha(0.34f);
                }
                if (!C72631i.C72632a.m128111a() || !C71907a.m126982a()) {
                    if (!m128125e()) {
                        i = C65687t.m117580b();
                    }
                    m128119b(i);
                } else {
                    m128119b(0);
                }
                CommonItemView commonItemView8 = this.f162851m;
                if (commonItemView8 != null) {
                    commonItemView8.setOnClickListener(new View$OnClickListenerC72654j(this, linearLayout, videoPublishEditModel));
                }
            }
            linearLayout.addView(this.f162851m, new LinearLayout.LayoutParams(-1, mo114925a(52.0f)));
            MethodCollector.m26664o(7684);
            return;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
        MethodCollector.m26664o(7684);
        throw nullPointerException2;
    }

    /* renamed from: b */
    public final void mo114938b(LinearLayout linearLayout, List<C72683v> list, VideoPublishEditModel videoPublishEditModel) {
        m128118a(linearLayout);
        int i = -1;
        if (videoPublishEditModel.hasSubtitle()) {
            if (list != null) {
                Iterator<C72683v> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().f162953f == EnumC72684w.SAVE_LOCAL_OPTIONS) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                list.remove(i);
            }
        } else if (list != null) {
            Iterator<C72683v> it2 = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().f162953f == EnumC72684w.SAVE_LOCAL) {
                    i = i3;
                    break;
                } else {
                    i3++;
                }
            }
            list.remove(i);
        }
        CommonItemView commonItemView = this.f162851m;
        if (commonItemView != null) {
            commonItemView.setOnClickListener(new C72663p(this, videoPublishEditModel));
        }
        m128124d(videoPublishEditModel);
    }

    public C72644n(Fragment fragment, boolean z, boolean z2, boolean z3, C71859c cVar) {
        boolean z4;
        C89219l.m154721d(fragment, "");
        this.f162857s = fragment;
        this.f162858t = z;
        this.f162860v = z2;
        this.f162861w = z3;
        this.f162863z = cVar;
        this.f162840b = true;
        boolean z5 = false;
        if (C63244g.m114602a().mo73277e().getReactDuetSettingCurrent(2) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f162841c = z4;
        this.f162842d = C63244g.m114602a().mo73277e().getStitchSettingCurrent(0) == 0 ? true : z5;
        this.f162843e = true;
        this.f162850l = true;
        this.f162852n = C72645a.m128144a();
        this.f162855q = "";
    }
}

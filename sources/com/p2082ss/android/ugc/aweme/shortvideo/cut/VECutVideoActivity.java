package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.lifecycle.C1213t;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63189ao;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70300bv;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70157af;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70198ap;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70217au;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70242ba;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71897c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.aweme.performance.p4431a.C86654a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity */
public final class VECutVideoActivity extends AbstractActivityC33414h implements AbstractC90252i, AbstractC90253j {

    /* renamed from: f */
    public static final C70013a f156543f = new C70013a((byte) 0);

    /* renamed from: i */
    private static final String f156544i = VECutVideoActivity.class.getSimpleName();

    /* renamed from: e */
    public C70198ap f156545e;

    /* renamed from: g */
    private CutVideoViewModel f156546g;

    /* renamed from: h */
    private EditCornerViewModel f156547h;

    /* renamed from: j */
    private HashMap f156548j;

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final boolean bA_() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f156548j == null) {
            this.f156548j = new HashMap();
        }
        View view = (View) this.f156548j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f156548j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(204, new RunnableC90250g(VECutVideoActivity.class, "onEvent", C71897c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity$a */
    public static final class C70013a {
        static {
            Covode.recordClassIndex(82430);
        }

        private C70013a() {
        }

        public /* synthetic */ C70013a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m123646a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        private static void m123648a(Context context, Intent intent) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static void m123649a(Context context, Intent intent, int i) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(intent, "");
            intent.setClass(context, VECutVideoActivity.class);
            if (intent.getLongExtra("extra_start_enter_cut_page", -1) == -1) {
                intent.putExtra("extra_start_enter_cut_page", System.currentTimeMillis());
            }
            if (i == -1 || !(context instanceof Activity)) {
                m123648a(context, intent);
            } else {
                ((Activity) context).startActivityForResult(intent, i);
            }
        }

        /* renamed from: a */
        public static void m123647a(Activity activity, Intent intent, boolean z, boolean z2) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(intent, "");
            if (z2) {
                VEVideoPublishEditActivity.m125011a(activity, intent);
            } else if (z) {
                intent.putExtra("extra_request_code", 8);
                VEVideoPublishEditActivity.m125011a(activity, intent);
            } else {
                VEVideoPublishEditActivity.m125012a((Context) activity, intent);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final int bB_() {
        return C0643b.m2378c(this, R.color.c9);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        CutVideoViewModel cutVideoViewModel = this.f156546g;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        cutVideoViewModel.mo110800a();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C73975b.C73976a.f166071a.leave(this, "clip");
    }

    static {
        Covode.recordClassIndex(82429);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", true);
        super.onResume();
        C86654a.C86655a.m150135a().mo137921a("tool_cut");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        C73975b bVar = C73975b.C73976a.f166071a;
        CutVideoViewModel cutVideoViewModel = this.f156546g;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        String str = cutVideoViewModel.mo110802b().f156854l;
        CutVideoViewModel cutVideoViewModel2 = this.f156546g;
        if (cutVideoViewModel2 == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        bVar.pause(this, "clip", str, cutVideoViewModel2.mo110802b().f156857o);
        C86654a.C86655a.m150135a().mo137922b("tool_cut");
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

    public final void finish() {
        String str;
        super.finish();
        if (C59187c.f134693a != null) {
            C59187c.f134693a.mo96693b();
        }
        CutVideoViewModel cutVideoViewModel = this.f156546g;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!TextUtils.isEmpty(cutVideoViewModel.mo110807k())) {
            CutVideoViewModel cutVideoViewModel2 = this.f156546g;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            C71518t tVar = cutVideoViewModel2.mo110802b().f156849g;
            String str2 = null;
            if (tVar != null) {
                try {
                    str = tVar.getExtra();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (tVar != null) {
                    str2 = tVar.getExtra();
                }
                if (1 == new JSONObject(str2).optInt("timor_video_source")) {
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                    AbstractC63189ao miniAppService = createIAVServiceProxybyMonsterPlugin.getMiniAppService();
                    CutVideoViewModel cutVideoViewModel3 = this.f156546g;
                    if (cutVideoViewModel3 == null) {
                        C89219l.m154710a("cutVideoViewModel");
                    }
                    miniAppService.mo93846a(cutVideoViewModel3.mo110807k());
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: h */
    public final void mo59496h() {
        CutVideoViewModel cutVideoViewModel = this.f156546g;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo110803g()) {
            C70198ap apVar = this.f156545e;
            if (apVar == null) {
                C89219l.m154710a("cutVideoRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = apVar.f156965f;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            if (!cutVideoViewModel2.mo110803g()) {
                VideoEditViewModel videoEditViewModel = apVar.f156966g;
                if (videoEditViewModel == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                int i = videoEditViewModel.mo111232k().get(0).f156714f;
                VideoEditViewModel videoEditViewModel2 = apVar.f156966g;
                if (videoEditViewModel2 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                int min = Math.min(i, videoEditViewModel2.mo111232k().get(0).f156715g);
                VideoEditViewModel videoEditViewModel3 = apVar.f156966g;
                if (videoEditViewModel3 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                int i2 = videoEditViewModel3.mo111232k().get(0).f156714f;
                VideoEditViewModel videoEditViewModel4 = apVar.f156966g;
                if (videoEditViewModel4 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                int max = Math.max(i2, videoEditViewModel4.mo111232k().get(0).f156715g);
                CutVideoPreviewViewModel cutVideoPreviewViewModel = apVar.f156971l;
                if (cutVideoPreviewViewModel == null) {
                    C89219l.m154710a("previewViewModel");
                }
                cutVideoPreviewViewModel.mo110738a(min, max);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m123640a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onEvent(C71897c cVar) {
        C89219l.m154721d(cVar, "");
        finish();
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: a */
    public final void mo59491a(boolean z) {
        int i;
        CutVideoViewModel cutVideoViewModel = this.f156546g;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo110803g()) {
            EditCornerViewModel editCornerViewModel = this.f156547h;
            if (editCornerViewModel == null) {
                C89219l.m154710a("cornerViewModel");
            }
            if (z) {
                i = C70636dh.m124833c(this);
            } else {
                i = 0;
            }
            editCornerViewModel.mo127318a(i);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        CutVideoViewModel cutVideoViewModel = this.f156546g;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110806j()) {
            CutVideoViewModel cutVideoViewModel2 = this.f156546g;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            bundle.putParcelable("workspace", cutVideoViewModel2.mo110802b().f156851i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: b */
    public final void mo59493b(boolean z) {
        int b;
        int i;
        CutVideoViewModel cutVideoViewModel = this.f156546g;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo110803g()) {
            C70198ap apVar = this.f156545e;
            if (apVar == null) {
                C89219l.m154710a("cutVideoRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = apVar.f156965f;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            int i2 = 0;
            if (!cutVideoViewModel2.mo110803g()) {
                C70217au E = apVar.mo62771E();
                int c = C33398a.m68487c();
                View view = E.mo110857F().f52550n;
                C89219l.m154716b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z) {
                    b = c;
                } else {
                    b = (int) C13628n.m24520b(E.f52549m, 132.0f);
                }
                marginLayoutParams.height = b;
                View view2 = E.mo110857F().f52550n;
                C89219l.m154716b(view2, "");
                view2.setLayoutParams(marginLayoutParams);
                View view3 = E.mo110858G().f52550n;
                C89219l.m154716b(view3, "");
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (z) {
                    i = (int) (C13628n.m24520b(E.f52549m, 5.5f) + ((float) c));
                } else {
                    i = 0;
                }
                marginLayoutParams2.bottomMargin = i;
                View view4 = E.mo110858G().f52550n;
                C89219l.m154716b(view4, "");
                view4.setLayoutParams(marginLayoutParams2);
            }
            EditCornerViewModel editCornerViewModel = this.f156547h;
            if (editCornerViewModel == null) {
                C89219l.m154710a("cornerViewModel");
            }
            if (z) {
                i2 = C33398a.m68487c();
            }
            editCornerViewModel.mo127320b(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r1 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fb, code lost:
        if (r7.equals("lv_sync") == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012d, code lost:
        if (r7.equals("system_upload") != false) goto L_0x012f;
     */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m123641a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity$b */
    static final class C70014b implements AbstractC22231l {

        /* renamed from: a */
        final /* synthetic */ VECutVideoActivity f156549a;

        static {
            Covode.recordClassIndex(82431);
        }

        C70014b(VECutVideoActivity vECutVideoActivity) {
            this.f156549a = vECutVideoActivity;
        }

        @Override // com.bytedance.scene.AbstractC22231l
        public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            C89219l.m154721d(classLoader, "");
            C89219l.m154721d(str, "");
            if (!C89219l.m154714a((Object) C70198ap.class.getName(), (Object) str)) {
                return null;
            }
            C70198ap apVar = this.f156549a.f156545e;
            if (apVar == null) {
                C89219l.m154710a("cutVideoRootScene");
            }
            return apVar;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle a;
        List<VideoSegment> videoSegmentList;
        super.onActivityResult(i, i2, intent);
        C70198ap apVar = this.f156545e;
        if (apVar == null) {
            C89219l.m154710a("cutVideoRootScene");
        }
        CutVideoViewModel cutVideoViewModel = apVar.f156965f;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110803g()) {
            C70157af F = apVar.mo110847F();
            CutVideoViewModel cutVideoViewModel2 = F.f156883i;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            if (cutVideoViewModel2.mo110805i()) {
                C70242ba baVar = F.f156880f;
                if (baVar != null) {
                    AbstractC70300bv bvVar = baVar.f157047b;
                    if (bvVar == null) {
                        C89219l.m154710a("stickPointVideoSegController");
                    }
                    bvVar.mo110926a(i, i2, intent);
                }
            } else if (i == 1001) {
                if (i2 == -1 && intent != null) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                    if (!C84904k.m145909a(parcelableArrayListExtra)) {
                        ArrayList arrayList = new ArrayList();
                        VideoEditViewModel videoEditViewModel = F.f156884j;
                        if (videoEditViewModel == null) {
                            C89219l.m154710a("videoEditViewModel");
                        }
                        int size = videoEditViewModel.mo111232k().size();
                        if (parcelableArrayListExtra == null) {
                            C89219l.m154715b();
                        }
                        int size2 = parcelableArrayListExtra.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            VideoSegment videoSegment = new VideoSegment((MediaModel) parcelableArrayListExtra.get(i3));
                            videoSegment.f156709a = size;
                            arrayList.add(videoSegment);
                            size++;
                        }
                        C70582z zVar = F.mo110812I().f157282a;
                        if (zVar != null) {
                            zVar.mo111347b(arrayList);
                        }
                        F.mo110811H().mo110956b().mo111104a(arrayList);
                        VECutVideoPresenter vECutVideoPresenter = F.f156881g;
                        if (vECutVideoPresenter == null) {
                            C89219l.m154710a("presenter");
                        }
                        VideoEditViewModel videoEditViewModel2 = F.f156884j;
                        if (videoEditViewModel2 == null) {
                            C89219l.m154710a("videoEditViewModel");
                        }
                        vECutVideoPresenter.mo110488a(arrayList, videoEditViewModel2.mo111232k().size());
                    }
                } else {
                    return;
                }
            }
            VideoEditViewModel videoEditViewModel3 = F.f156884j;
            if (videoEditViewModel3 == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            C1213t<CutVideoContext> tVar = videoEditViewModel3.f157698w;
            C89219l.m154716b(tVar, "");
            CutVideoContext value = tVar.getValue();
            if (!(value == null || (videoSegmentList = value.getVideoSegmentList()) == null)) {
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) videoSegmentList, 10));
                Iterator<T> it = videoSegmentList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(it.next().f156710b));
                }
                if (C89070n.m154600t(arrayList2) > 60000) {
                    CutVideoViewModel cutVideoViewModel3 = F.f156883i;
                    if (cutVideoViewModel3 == null) {
                        C89219l.m154710a("cutVideoViewModel");
                    }
                    if (!cutVideoViewModel3.mo110805i() || F.mo110810G().mo110835a().getCurrentMode() == 2) {
                        F.mo110815L();
                    }
                }
            }
        }
        if (i == 1002) {
            Intent intent2 = new Intent();
            if (!(intent == null || m123640a(intent) == null)) {
                Bundle a2 = m123640a(intent);
                if (a2 == null) {
                    C89219l.m154715b();
                }
                String string = a2.getString("edit result");
                StringBuilder sb = new StringBuilder("RecordActivity return success ");
                if (string == null) {
                    C89219l.m154715b();
                }
                intent2.putExtra("record result", sb.append(string).toString());
            }
            setResult(-1, intent2);
            finish();
        } else if (i == 8 && i2 == 9) {
            Intent intent3 = new Intent();
            if (!(intent == null || (a = m123640a(intent)) == null)) {
                intent3.putExtras(a);
            }
            setResult(9, intent3);
            finish();
        }
    }
}

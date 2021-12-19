package com.p2082ss.android.ugc.aweme.feed.caption.edit;

import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1712a.C23019c;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.feed.caption.edit.C49405a;
import com.p2082ss.android.ugc.aweme.feed.caption.edit.CaptionEditApi;
import com.p2082ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionModel;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50555t;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity */
public final class TranslatedCaptionEditActivity extends ActivityC17312a implements C49405a.AbstractC49406a, OnUIPlayListener {

    /* renamed from: p */
    public static final C49373a f113471p = new C49373a((byte) 0);

    /* renamed from: A */
    private long f113472A = -1;

    /* renamed from: B */
    private SparseArray f113473B;

    /* renamed from: a */
    public HighLightLayoutManager f113474a;

    /* renamed from: b */
    public C49405a f113475b;

    /* renamed from: c */
    public Aweme f113476c;

    /* renamed from: d */
    public String f113477d;

    /* renamed from: e */
    public Video f113478e;

    /* renamed from: f */
    boolean f113479f;

    /* renamed from: g */
    public boolean f113480g;

    /* renamed from: h */
    public boolean f113481h;

    /* renamed from: i */
    public boolean f113482i;

    /* renamed from: j */
    public boolean f113483j;

    /* renamed from: k */
    public boolean f113484k;

    /* renamed from: l */
    public float f113485l = 0.004f;

    /* renamed from: m */
    public int f113486m;

    /* renamed from: n */
    long f113487n = -1;

    /* renamed from: o */
    long f113488o = -1;

    /* renamed from: q */
    private final AbstractC89244h f113489q = C89250i.m154773a((AbstractC89171a) new C49374b(this));

    /* renamed from: r */
    private final AbstractC89244h f113490r = C89250i.m154773a((AbstractC89171a) C49404r.f113532a);

    /* renamed from: s */
    private final AbstractC89244h f113491s = C89250i.m154773a((AbstractC89171a) new C49403q(this));

    /* renamed from: t */
    private final AbstractC89244h f113492t = C89250i.m154773a((AbstractC89171a) new C49402p(this));

    /* renamed from: u */
    private final AbstractC89244h f113493u = C89250i.m154773a((AbstractC89171a) new C49400n(this));

    /* renamed from: v */
    private final AbstractC89244h f113494v = C89250i.m154773a((AbstractC89171a) new C49389i(this));

    /* renamed from: w */
    private final AbstractC89244h f113495w = C89250i.m154773a((AbstractC89171a) new C49392l(this));

    /* renamed from: x */
    private final AbstractC89244h f113496x = C89250i.m154773a((AbstractC89171a) new C49401o(this));

    /* renamed from: y */
    private final AbstractC89244h f113497y = C89250i.m154773a((AbstractC89171a) new C49375c(this));

    /* renamed from: z */
    private String f113498z;

    static {
        Covode.recordClassIndex(58182);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f113473B;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f113473B == null) {
            this.f113473B = new SparseArray();
        }
        View view = (View) this.f113473B.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f113473B.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final EditCaptionViewModel mo81012a() {
        return (EditCaptionViewModel) this.f113489q.getValue();
    }

    /* renamed from: b */
    public final VideoViewComponent mo81015b() {
        return (VideoViewComponent) this.f113490r.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final FrameLayout mo81018c() {
        return (FrameLayout) this.f113492t.getValue();
    }

    /* renamed from: d */
    public final DmtStatusView mo81019d() {
        return (DmtStatusView) this.f113493u.getValue();
    }

    /* renamed from: e */
    public final View mo81020e() {
        return (View) this.f113494v.getValue();
    }

    /* renamed from: f */
    public final RecyclerView mo81021f() {
        return (RecyclerView) this.f113495w.getValue();
    }

    /* renamed from: g */
    public final DialogC81438i mo81022g() {
        return (DialogC81438i) this.f113497y.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$a */
    public static final class C49373a {
        static {
            Covode.recordClassIndex(58185);
        }

        private C49373a() {
        }

        public /* synthetic */ C49373a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$c */
    static final class C49375c extends AbstractC89220m implements AbstractC89171a<DialogC81438i> {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113502a;

        static {
            Covode.recordClassIndex(58187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49375c(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.f113502a = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81438i invoke() {
            return new DialogC81438i(this.f113502a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$k */
    public static final class C49391k implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113518a;

        static {
            Covode.recordClassIndex(58203);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
            this.f113518a.f113482i = false;
        }

        C49391k(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f113518a = translatedCaptionEditActivity;
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
            this.f113518a.f113482i = true;
            this.f113518a.mo81023h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$r */
    static final class C49404r extends AbstractC89220m implements AbstractC89171a<VideoViewComponent> {

        /* renamed from: a */
        public static final C49404r f113532a = new C49404r();

        static {
            Covode.recordClassIndex(58216);
        }

        C49404r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoViewComponent invoke() {
            return new VideoViewComponent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$i */
    static final class C49389i extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113516a;

        static {
            Covode.recordClassIndex(58201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49389i(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.f113516a = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f113516a.findViewById(R.id.fd7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$l */
    static final class C49392l extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113519a;

        static {
            Covode.recordClassIndex(58204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49392l(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.f113519a = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return this.f113519a.findViewById(R.id.arj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$n */
    static final class C49400n extends AbstractC89220m implements AbstractC89171a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113528a;

        static {
            Covode.recordClassIndex(58212);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49400n(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.f113528a = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.f113528a.findViewById(R.id.cfy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$o */
    static final class C49401o extends AbstractC89220m implements AbstractC89171a<TextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113529a;

        static {
            Covode.recordClassIndex(58213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49401o(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.f113529a = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextTitleBar invoke() {
            return this.f113529a.findViewById(R.id.asp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$p */
    static final class C49402p extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113530a;

        static {
            Covode.recordClassIndex(58214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49402p(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.f113530a = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            return this.f113530a.findViewById(R.id.fe8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$q */
    static final class C49403q extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113531a;

        static {
            Covode.recordClassIndex(58215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49403q(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.f113531a = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            return this.f113531a.findViewById(R.id.d3a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$b */
    static final class C49374b extends AbstractC89220m implements AbstractC89171a<EditCaptionViewModel> {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113501a;

        static {
            Covode.recordClassIndex(58186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49374b(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.f113501a = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditCaptionViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3881a(this.f113501a, (C1175ad.AbstractC1177b) null).mo3983a(EditCaptionViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: h */
    public final void mo81023h() {
        if (this.f113482i && this.f113478e != null) {
            mo81015b().mo129262a(this.f113478e);
            mo81018c().setOnClickListener(new View$OnClickListenerC49390j(this));
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        if (mo81019d().getVisibility() == 8 && this.f113478e != null && mo81015b().mo129273g()) {
            mo81014a(false);
        }
        this.f113487n += SystemClock.elapsedRealtime() - this.f113488o;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onResume", true);
        super.onResume();
        if (mo81019d().getVisibility() == 8 && this.f113478e != null && !mo81015b().mo129273g() && !this.f113481h) {
            mo81014a(false);
        }
        this.f113488o = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
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

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final String mo81024i() {
        Long l;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        T t;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        Aweme aweme = this.f113476c;
        if (aweme == null || (video2 = aweme.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l = null;
        } else {
            l = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        Aweme aweme2 = this.f113476c;
        if (!(aweme2 == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null)) {
            Iterator<T> it = captionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                long languageId = t.getLanguageId();
                if (l != null && l.longValue() == languageId) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2.getLanguageName();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final String mo81025j() {
        Long l;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        T t;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        Aweme aweme = this.f113476c;
        if (aweme == null || (video2 = aweme.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l = null;
        } else {
            l = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        Aweme aweme2 = this.f113476c;
        if (!(aweme2 == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null)) {
            Iterator<T> it = captionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                long languageId = t.getLanguageId();
                if (l != null) {
                    if (l.longValue() != languageId) {
                        break;
                    }
                } else {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2.getLanguageName();
            }
        }
        return null;
    }

    /* renamed from: k */
    public final String mo81026k() {
        Long l;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        T t;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        Aweme aweme = this.f113476c;
        if (aweme == null || (video2 = aweme.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l = null;
        } else {
            l = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        Aweme aweme2 = this.f113476c;
        if (!(aweme2 == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null)) {
            Iterator<T> it = captionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                long languageId = t.getLanguageId();
                if (l != null) {
                    if (l.longValue() != languageId) {
                        break;
                    }
                } else {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2.getClaSubtitleId();
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$HighLightLayoutManager */
    public final class HighLightLayoutManager extends LinearLayoutManager {
        static {
            Covode.recordClassIndex(58183);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$HighLightLayoutManager$a */
        public final class C49372a extends C1481r {
            static {
                Covode.recordClassIndex(58184);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final int mo5011a(int i, int i2, int i3, int i4, int i5) {
                return i3 - i;
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: c */
            public final int mo5016c() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r
            /* renamed from: c */
            public final PointF mo4778c(int i) {
                return HighLightLayoutManager.this.mo4360d(i);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
                if (r0 == null) goto L_0x0010;
             */
            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final float mo4862a(android.util.DisplayMetrics r3) {
                /*
                    r2 = this;
                    com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$HighLightLayoutManager r0 = com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.HighLightLayoutManager.this
                    com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity r0 = com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.this
                    float r1 = r0.f113485l
                    if (r3 == 0) goto L_0x001a
                    int r0 = r3.densityDpi
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    if (r0 != 0) goto L_0x0013
                L_0x0010:
                    p4600h.p4611f.p4613b.C89219l.m154715b()
                L_0x0013:
                    int r0 = r0.intValue()
                    float r0 = (float) r0
                    float r1 = r1 / r0
                    return r1
                L_0x001a:
                    r0 = 0
                    goto L_0x0010
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.HighLightLayoutManager.C49372a.mo4862a(android.util.DisplayMetrics):float");
            }

            public C49372a(Context context) {
                super(context);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public HighLightLayoutManager() {
            super(1, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: a */
        public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
            Context context;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            C49372a aVar = new C49372a(context);
            aVar.f4515g = i;
            mo4695a(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$m */
    public static final class C49393m implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113520a;

        static {
            Covode.recordClassIndex(58205);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C49393m(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f113520a = translatedCaptionEditActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$m$a */
        static final class C49394a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C49393m f113521a;

            static {
                Covode.recordClassIndex(58206);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C49394a(C49393m mVar) {
                super(1);
                this.f113521a = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23025b bVar) {
                C23025b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                bVar2.mo37416a(R.string.af6, new AbstractC89172b<C23024a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.C49393m.C49394a.C493951 */

                    /* renamed from: a */
                    final /* synthetic */ C49394a f113522a;

                    static {
                        Covode.recordClassIndex(58207);
                    }

                    {
                        this.f113522a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        C89219l.m154721d(aVar, "");
                        this.f113522a.f113521a.f113520a.finish();
                        return C89391z.f203057a;
                    }
                });
                bVar2.mo37418b(R.string.af5, C493962.f113523a);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$m$b */
        static final class C49397b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C49393m f113524a;

            /* renamed from: b */
            final /* synthetic */ C49414b f113525b;

            static {
                Covode.recordClassIndex(58209);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C49397b(C49393m mVar, C49414b bVar) {
                super(1);
                this.f113524a = mVar;
                this.f113525b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23025b bVar) {
                C23025b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                bVar2.mo37416a(R.string.af9, new AbstractC89172b<C23024a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.C49393m.C49397b.C493981 */

                    /* renamed from: a */
                    final /* synthetic */ C49397b f113526a;

                    static {
                        Covode.recordClassIndex(58210);
                    }

                    {
                        this.f113526a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        int i;
                        String str;
                        List<CaptionData> transSubtitleItem;
                        CaptionData captionData;
                        Video video;
                        EditCaptionItem editCaptionItem;
                        C89219l.m154721d(aVar, "");
                        this.f113526a.f113524a.f113520a.mo81022g().show();
                        this.f113526a.f113524a.f113520a.f113484k = this.f113526a.f113525b.getCheckbox().isChecked();
                        String k = this.f113526a.f113524a.f113520a.mo81026k();
                        if (k != null) {
                            TranslatedCaptionCacheServiceImpl.m146355j().mo108892c(k);
                        }
                        EditCaptionViewModel a = this.f113526a.f113524a.f113520a.mo81012a();
                        String str2 = this.f113526a.f113524a.f113520a.f113477d;
                        if (!(str2 == null || (editCaptionItem = a.f113451a) == null)) {
                            new C88411a().mo142945a(CaptionEditApi.C49358a.m92446a(str2, editCaptionItem.getTransSubtitleItem(), editCaptionItem.getSrcSubtitleItem()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new EditCaptionViewModel.C49370j(a, str2), new EditCaptionViewModel.C49371k(a, str2)));
                        }
                        TranslatedCaptionEditActivity translatedCaptionEditActivity = this.f113526a.f113524a.f113520a;
                        C33744d a2 = new C33744d().mo59983a("enter_from", TranslatedCaptionEditActivity.m92453a(translatedCaptionEditActivity.getIntent(), "enter_from")).mo59983a("enter_method", TranslatedCaptionEditActivity.m92453a(translatedCaptionEditActivity.getIntent(), "enter_method")).mo59983a("group_id", C59208ac.m108771e(translatedCaptionEditActivity.f113476c)).mo59983a("author_id", C59208ac.m108758a(translatedCaptionEditActivity.f113476c));
                        Aweme aweme = translatedCaptionEditActivity.f113476c;
                        int i2 = 0;
                        if (aweme == null || (video = aweme.getVideo()) == null || !video.isLongVideo()) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        C33744d a3 = a2.mo59980a("is_long", i).mo59983a("video_lang", translatedCaptionEditActivity.mo81024i()).mo59983a("transl_lang", translatedCaptionEditActivity.mo81025j());
                        EditCaptionViewModel a4 = translatedCaptionEditActivity.mo81012a();
                        Iterator<T> it = a4.f113452b.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                C89070n.m154520a();
                            }
                            EditCaptionItem editCaptionItem2 = a4.f113451a;
                            if (editCaptionItem2 == null || (transSubtitleItem = editCaptionItem2.getTransSubtitleItem()) == null || (captionData = transSubtitleItem.get(i3)) == null) {
                                str = null;
                            } else {
                                str = captionData.getText();
                            }
                            if (!C89219l.m154714a((Object) str, (Object) next)) {
                                i2 = 1;
                                break;
                            }
                            i3 = i4;
                        }
                        C39162r.m79460a("submit_transl", a3.mo59980a("has_edit", i2).mo59980a("is_start_next", translatedCaptionEditActivity.f113484k ? 1 : 0).mo59981a("stay_time", (SystemClock.elapsedRealtime() - translatedCaptionEditActivity.f113488o) + translatedCaptionEditActivity.f113487n).f79943a);
                        translatedCaptionEditActivity.f113488o = SystemClock.elapsedRealtime();
                        return C89391z.f203057a;
                    }
                });
                bVar2.mo37418b(R.string.af5, C493992.f113527a);
                return C89391z.f203057a;
            }
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f113520a.f113483j = false;
            TranslatedCaptionEditActivity.m92452a(this.f113520a).mo81031a();
            C23028c.m43435a((C23023b) new C23023b(this.f113520a).mo37479a(R.string.af8).mo37483b(R.string.af7), new C49394a(this)).mo37405a().mo37396b().show();
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            List<CaptionData> transSubtitleItem;
            if (this.f113520a.f113482i) {
                this.f113520a.mo81015b().mo129267b();
                this.f113520a.f113480g = true;
                this.f113520a.f113481h = true;
                this.f113520a.mo81020e().setVisibility(0);
                EditCaptionItem editCaptionItem = this.f113520a.mo81012a().f113451a;
                if (!(editCaptionItem == null || (transSubtitleItem = editCaptionItem.getTransSubtitleItem()) == null)) {
                    int i = 0;
                    for (T t : transSubtitleItem) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C89070n.m154520a();
                        }
                        T t2 = t;
                        String text = t2.getText();
                        Objects.requireNonNull(text, "null cannot be cast to non-null type kotlin.CharSequence");
                        if (C89361p.m154910b((CharSequence) text).toString().length() == 0) {
                            TranslatedCaptionEditActivity.m92452a(this.f113520a).f113537e = true;
                            this.f113520a.mo81015b().mo129260a((((float) t2.getStartTime()) * 100.0f) / ((float) this.f113520a.mo81015b().mo129272f()));
                            this.f113520a.f113486m = t2.getEndTime();
                            this.f113520a.f113483j = true;
                            HighLightLayoutManager highLightLayoutManager = this.f113520a.f113474a;
                            if (highLightLayoutManager == null) {
                                C89219l.m154710a("highLightLayoutManager");
                            }
                            highLightLayoutManager.mo4354a(this.f113520a.mo81021f(), new RecyclerView.C1378s(), i);
                            TranslatedCaptionEditActivity.m92452a(this.f113520a).mo81032a(i);
                            RecyclerView.ViewHolder f = this.f113520a.mo81021f().mo4451f(i);
                            if (f != null) {
                                Objects.requireNonNull(f, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionAdapter.SubtitleViewHolder");
                                C49405a.C49407b bVar = (C49405a.C49407b) f;
                                bVar.f113542b.requestFocus();
                                KeyboardUtils.m70894a(bVar.f113542b);
                            }
                            new C23144b(this.f113520a).mo37640e(R.string.aew).mo37637b();
                            return;
                        }
                        i = i2;
                    }
                }
                this.f113520a.f113483j = false;
                TranslatedCaptionEditActivity.m92452a(this.f113520a).mo81031a();
                C49414b bVar2 = new C49414b(this.f113520a, (byte) 0);
                C23028c.m43435a(C23019c.m43408a((C23023b) new C23023b(this.f113520a).mo37479a(R.string.afb).mo37483b(R.string.afa), bVar2), new C49397b(this, bVar2)).mo37405a().mo37396b().show();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        mo81015b().mo129275i();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        mo81015b().mo129274h();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$e */
    static final class C49377e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113504a;

        static {
            Covode.recordClassIndex(58189);
        }

        C49377e(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f113504a = translatedCaptionEditActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            if (C80537hk.m139613a(str)) {
                this.f113504a.f113477d = str;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$j */
    public static final class View$OnClickListenerC49390j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113517a;

        static {
            Covode.recordClassIndex(58202);
        }

        View$OnClickListenerC49390j(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f113517a = translatedCaptionEditActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113517a.mo81014a(true);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C49405a m92452a(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
        C49405a aVar = translatedCaptionEditActivity.f113475b;
        if (aVar == null) {
            C89219l.m154710a("editCaptionAdapter");
        }
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C84216o oVar) {
        C89219l.m154721d(oVar, "");
        mo81014a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$h */
    static final class View$OnClickListenerC49388h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113515a;

        static {
            Covode.recordClassIndex(58200);
        }

        View$OnClickListenerC49388h(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f113515a = translatedCaptionEditActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113515a.f113483j = false;
            TranslatedCaptionEditActivity.m92452a(this.f113515a).mo81031a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        if (this.f113483j) {
            mo81015b().mo129267b();
            this.f113480g = true;
            this.f113481h = true;
            mo81020e().setVisibility(0);
            C49405a aVar = this.f113475b;
            if (aVar == null) {
                C89219l.m154710a("editCaptionAdapter");
            }
            aVar.mo81033b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$d */
    static final class C49376d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113503a;

        static {
            Covode.recordClassIndex(58188);
        }

        C49376d(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f113503a = translatedCaptionEditActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Aweme aweme = (Aweme) obj;
            if (aweme != null) {
                this.f113503a.f113476c = aweme;
                this.f113503a.f113478e = aweme.getVideo();
                this.f113503a.mo81019d().mo27382d();
                this.f113503a.mo81019d().setVisibility(8);
                TranslatedCaptionEditActivity translatedCaptionEditActivity = this.f113503a;
                if (!translatedCaptionEditActivity.f113479f) {
                    translatedCaptionEditActivity.mo81018c().setVisibility(0);
                    if (aweme.getVideo() != null) {
                        translatedCaptionEditActivity.mo81015b().mo129261a(translatedCaptionEditActivity.mo81018c());
                        translatedCaptionEditActivity.mo81015b().mo129268b(translatedCaptionEditActivity);
                        translatedCaptionEditActivity.mo81015b().f188405b.mo129312a(new C49391k(translatedCaptionEditActivity));
                        translatedCaptionEditActivity.f113479f = true;
                    }
                }
                this.f113503a.mo81023h();
                TranslatedCaptionEditActivity.m92452a(this.f113503a).notifyDataSetChanged();
                this.f113503a.mo81021f().setVisibility(0);
                this.f113503a.mo81017b(false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.caption.edit.C49405a.AbstractC49406a
    /* renamed from: a */
    public final void mo81013a(int i) {
        EditCaptionViewModel a;
        EditCaptionItem editCaptionItem;
        List<CaptionData> srcSubtitleItem;
        CaptionData captionData;
        C49405a aVar = this.f113475b;
        if (aVar == null) {
            C89219l.m154710a("editCaptionAdapter");
        }
        if (!(aVar.f113533a == i || (a = mo81012a()) == null || (editCaptionItem = a.f113451a) == null || (srcSubtitleItem = editCaptionItem.getSrcSubtitleItem()) == null || (captionData = srcSubtitleItem.get(i)) == null)) {
            mo81015b().mo129260a((((float) captionData.getStartTime()) * 100.0f) / ((float) mo81015b().mo129272f()));
            this.f113486m = captionData.getEndTime();
        }
        if (this.f113483j) {
            C49405a aVar2 = this.f113475b;
            if (aVar2 == null) {
                C89219l.m154710a("editCaptionAdapter");
            }
            if (aVar2.f113533a == i) {
                return;
            }
        }
        mo81015b().mo129267b();
        this.f113480g = true;
        this.f113481h = true;
        this.f113483j = true;
        mo81020e().setVisibility(0);
        C49405a aVar3 = this.f113475b;
        if (aVar3 == null) {
            C89219l.m154710a("editCaptionAdapter");
        }
        aVar3.mo81032a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.caption.edit.C49405a.AbstractC49406a
    /* renamed from: b */
    public final void mo81016b(int i) {
        EditCaptionItem editCaptionItem;
        List<CaptionData> srcSubtitleItem;
        CaptionData captionData;
        EditCaptionViewModel a = mo81012a();
        if (!(a == null || (editCaptionItem = a.f113451a) == null || (srcSubtitleItem = editCaptionItem.getSrcSubtitleItem()) == null || (captionData = srcSubtitleItem.get(i)) == null)) {
            mo81015b().mo129260a((((float) captionData.getStartTime()) * 100.0f) / ((float) mo81015b().mo129272f()));
            this.f113486m = captionData.getEndTime();
        }
        this.f113483j = true;
        mo81015b().mo129259a();
        this.f113480g = false;
        this.f113481h = false;
        mo81020e().setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$f */
    static final class C49378f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113505a;

        static {
            Covode.recordClassIndex(58190);
        }

        C49378f(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f113505a = translatedCaptionEditActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 3025001) {
                this.f113505a.mo81019d().mo27382d();
                this.f113505a.mo81019d().setVisibility(8);
                C23028c.m43435a((C23023b) new C23023b(this.f113505a).mo37479a(R.string.adz).mo37483b(R.string.ady).mo37482a(false), new AbstractC89172b<C23025b, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.C49378f.C493791 */

                    /* renamed from: a */
                    final /* synthetic */ C49378f f113506a;

                    static {
                        Covode.recordClassIndex(58191);
                    }

                    {
                        this.f113506a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23025b bVar) {
                        C23025b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        bVar2.mo37416a(R.string.adw, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.C49378f.C493791.C493801 */

                            /* renamed from: a */
                            final /* synthetic */ C493791 f113507a;

                            static {
                                Covode.recordClassIndex(58192);
                            }

                            {
                                this.f113507a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                SmartRouter.buildRoute(this.f113507a.f113506a.f113505a, "//caption/translate/edit").withParam("enter_from", m92474a(this.f113507a.f113506a.f113505a.getIntent(), "enter_from")).withParam("enter_method", "edit_another").withParam("video_lang", m92474a(this.f113507a.f113506a.f113505a.getIntent(), "video_lang")).withParam("transl_lang", m92474a(this.f113507a.f113506a.f113505a.getIntent(), "transl_lang")).open();
                                this.f113507a.f113506a.f113505a.finish();
                                return C89391z.f203057a;
                            }

                            /* renamed from: a */
                            private static String m92474a(Intent intent, String str) {
                                try {
                                    return intent.getStringExtra(str);
                                } catch (Exception unused) {
                                    return null;
                                }
                            }
                        });
                        bVar2.mo37418b(R.string.adv, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.C49378f.C493791.C493812 */

                            /* renamed from: a */
                            final /* synthetic */ C493791 f113508a;

                            static {
                                Covode.recordClassIndex(58193);
                            }

                            {
                                this.f113508a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                this.f113508a.f113506a.f113505a.finish();
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                }).mo37405a().mo37396b().show();
            } else if (num != null && num.intValue() == 3025002) {
                this.f113505a.mo81017b(true);
                this.f113505a.mo81019d().mo27382d();
                this.f113505a.mo81019d().setVisibility(8);
                C23028c.m43435a((C23023b) new C23023b(this.f113505a).mo37479a(R.string.adz).mo37483b(R.string.adx).mo37482a(false), new AbstractC89172b<C23025b, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.C49378f.C493822 */

                    /* renamed from: a */
                    final /* synthetic */ C49378f f113509a;

                    static {
                        Covode.recordClassIndex(58194);
                    }

                    {
                        this.f113509a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23025b bVar) {
                        C23025b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        bVar2.mo37416a(R.string.adw, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.C49378f.C493822.C493831 */

                            /* renamed from: a */
                            final /* synthetic */ C493822 f113510a;

                            static {
                                Covode.recordClassIndex(58195);
                            }

                            {
                                this.f113510a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                SmartRouter.buildRoute(this.f113510a.f113509a.f113505a, "//caption/translate/edit").withParam("enter_from", m92475a(this.f113510a.f113509a.f113505a.getIntent(), "enter_from")).withParam("enter_method", "edit_another").withParam("video_lang", m92475a(this.f113510a.f113509a.f113505a.getIntent(), "video_lang")).withParam("transl_lang", m92475a(this.f113510a.f113509a.f113505a.getIntent(), "transl_lang")).open();
                                this.f113510a.f113509a.f113505a.finish();
                                return C89391z.f203057a;
                            }

                            /* renamed from: a */
                            private static String m92475a(Intent intent, String str) {
                                try {
                                    return intent.getStringExtra(str);
                                } catch (Exception unused) {
                                    return null;
                                }
                            }
                        });
                        bVar2.mo37418b(R.string.adv, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.C49378f.C493822.C493842 */

                            /* renamed from: a */
                            final /* synthetic */ C493822 f113511a;

                            static {
                                Covode.recordClassIndex(58196);
                            }

                            {
                                this.f113511a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                this.f113511a.f113509a.f113505a.finish();
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                }).mo37405a().mo37396b().show();
            } else if (num.intValue() > 0) {
                this.f113505a.mo81017b(true);
                this.f113505a.mo81019d().mo27382d();
                this.f113505a.mo81019d().setVisibility(8);
                new C23144b(this.f113505a).mo37634a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).mo37640e(R.string.fz3).mo37637b();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.C49378f.RunnableC493853 */

                    /* renamed from: a */
                    final /* synthetic */ C49378f f113512a;

                    static {
                        Covode.recordClassIndex(58197);
                    }

                    {
                        this.f113512a = r1;
                    }

                    public final void run() {
                        this.f113512a.f113505a.finish();
                    }
                }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$g */
    static final class C49386g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ TranslatedCaptionEditActivity f113513a;

        static {
            Covode.recordClassIndex(58198);
        }

        C49386g(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f113513a = translatedCaptionEditActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 0) {
                if (this.f113513a.mo81022g().isShowing()) {
                    this.f113513a.mo81022g().dismiss();
                }
                new C23144b(this.f113513a).mo37634a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).mo37640e(R.string.afc).mo37637b();
                EventCenter.m87158a().mo75479a("cla_edit_translation_submit_success", "{}");
                String k = this.f113513a.mo81026k();
                if (k != null) {
                    TranslatedCaptionCacheServiceImpl.m146355j().mo108892c(k);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.C49386g.RunnableC493871 */

                    /* renamed from: a */
                    final /* synthetic */ C49386g f113514a;

                    static {
                        Covode.recordClassIndex(58199);
                    }

                    {
                        this.f113514a = r1;
                    }

                    public final void run() {
                        if (this.f113514a.f113513a.f113484k) {
                            SmartRouter.buildRoute(this.f113514a.f113513a, "//caption/translate/edit").withParam("enter_from", m92476a(this.f113514a.f113513a.getIntent(), "enter_from")).withParam("enter_method", "submit_another").withParam("video_lang", m92476a(this.f113514a.f113513a.getIntent(), "video_lang")).withParam("transl_lang", m92476a(this.f113514a.f113513a.getIntent(), "transl_lang")).open();
                        } else {
                            TranslatedCaptionEditActivity translatedCaptionEditActivity = this.f113514a.f113513a;
                            IAccountUserService g = C31575b.m65865g();
                            C89219l.m154716b(g, "");
                            String curUserId = g.getCurUserId();
                            C89219l.m154716b(curUserId, "");
                            C50555t.m94781a(translatedCaptionEditActivity, curUserId, "video_edit", true, null);
                        }
                        this.f113514a.f113513a.finish();
                    }

                    /* renamed from: a */
                    private static String m92476a(Intent intent, String str) {
                        try {
                            return intent.getStringExtra(str);
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            } else if (num.intValue() > 0) {
                if (this.f113513a.mo81022g().isShowing()) {
                    this.f113513a.mo81022g().dismiss();
                }
                new C23144b(this.f113513a).mo37634a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).mo37640e(R.string.afc).mo37637b();
            }
        }
    }

    /* renamed from: a */
    public final void mo81014a(boolean z) {
        if (this.f113480g) {
            if (!mo81015b().mo129273g() && this.f113478e != null) {
                this.f113483j = false;
                C49405a aVar = this.f113475b;
                if (aVar == null) {
                    C89219l.m154710a("editCaptionAdapter");
                }
                aVar.mo81031a();
                mo81015b().mo129259a();
                this.f113480g = false;
                this.f113481h = false;
                mo81020e().setVisibility(8);
            }
        } else if (mo81015b().mo129273g()) {
            mo81015b().mo129267b();
            if (this.f113483j) {
                C49405a aVar2 = this.f113475b;
                if (aVar2 == null) {
                    C89219l.m154710a("editCaptionAdapter");
                }
                aVar2.mo81033b();
            }
            this.f113480g = true;
            if (z) {
                this.f113481h = true;
                mo81020e().setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    public final void mo81017b(boolean z) {
        Video video;
        C33744d a = new C33744d().mo59983a("enter_from", m92453a(getIntent(), "enter_from")).mo59983a("enter_method", m92453a(getIntent(), "enter_method")).mo59983a("group_id", C59208ac.m108771e(this.f113476c)).mo59983a("author_id", C59208ac.m108758a(this.f113476c));
        Aweme aweme = this.f113476c;
        int i = 1;
        if (aweme == null || (video = aweme.getVideo()) == null || !video.isLongVideo()) {
            i = 0;
        }
        C39162r.m79460a("transl_caption_loaded", a.mo59980a("is_long", i).mo59983a("video_lang", mo81024i()).mo59983a("transl_lang", mo81025j()).mo59981a("load_time", SystemClock.elapsedRealtime() - this.f113472A).mo59980a("is_popup", z ? 1 : 0).f79943a);
        this.f113472A = -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        List<CaptionData> srcSubtitleItem;
        EditCaptionViewModel a;
        EditCaptionItem editCaptionItem;
        List<CaptionData> srcSubtitleItem2;
        CaptionData captionData;
        int i = 0;
        if (!this.f113483j) {
            long e = mo81015b().mo129271e();
            EditCaptionItem editCaptionItem2 = mo81012a().f113451a;
            if (!(editCaptionItem2 == null || (srcSubtitleItem = editCaptionItem2.getSrcSubtitleItem()) == null)) {
                for (T t : srcSubtitleItem) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (((long) t2.getStartTime()) > e || e >= ((long) t2.getEndTime())) {
                        i = i2;
                    } else if (i >= 0) {
                        C49405a aVar = this.f113475b;
                        if (aVar == null) {
                            C89219l.m154710a("editCaptionAdapter");
                        }
                        if (aVar.f113533a != i) {
                            C49405a aVar2 = this.f113475b;
                            if (aVar2 == null) {
                                C89219l.m154710a("editCaptionAdapter");
                            }
                            if (i < aVar2.getItemCount()) {
                                C49405a aVar3 = this.f113475b;
                                if (aVar3 == null) {
                                    C89219l.m154710a("editCaptionAdapter");
                                }
                                if (!(i != aVar3.f113533a - 1 || (a = mo81012a()) == null || (editCaptionItem = a.f113451a) == null || (srcSubtitleItem2 = editCaptionItem.getSrcSubtitleItem()) == null || (captionData = srcSubtitleItem2.get(i)) == null)) {
                                    if (((long) captionData.getEndTime()) - mo81015b().mo129271e() <= 100) {
                                        return;
                                    }
                                }
                                if (i == 0) {
                                    this.f113485l = 0.004f;
                                } else {
                                    this.f113485l = 400.0f;
                                }
                                HighLightLayoutManager highLightLayoutManager = this.f113474a;
                                if (highLightLayoutManager == null) {
                                    C89219l.m154710a("highLightLayoutManager");
                                }
                                highLightLayoutManager.mo4354a(mo81021f(), new RecyclerView.C1378s(), i);
                                C49405a aVar4 = this.f113475b;
                                if (aVar4 == null) {
                                    C89219l.m154710a("editCaptionAdapter");
                                }
                                aVar4.mo81032a(i);
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        } else if ((((float) mo81015b().mo129272f()) * f) / 100.0f >= ((float) this.f113486m)) {
            mo81015b().mo129267b();
            this.f113480g = true;
            this.f113481h = true;
            mo81020e().setVisibility(0);
            C49405a aVar5 = this.f113475b;
            if (aVar5 == null) {
                C89219l.m154710a("editCaptionAdapter");
            }
            aVar5.mo81033b();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        AbstractC88412b bVar;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f113472A = SystemClock.elapsedRealtime();
        this.f113488o = SystemClock.elapsedRealtime();
        setContentView(R.layout.rz);
        try {
            this.f113477d = m92453a(getIntent(), "subtitle_id");
            this.f113498z = m92453a(getIntent(), "enter_from");
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            C89219l.m154716b(window, "");
            window.setNavigationBarColor(-16777216);
        }
        mo81019d().setBuilder(DmtStatusView.C17269a.m31905a(this));
        C39162r.m79460a("enter_edit_transl_page", new C33744d().mo59983a("enter_from", m92453a(getIntent(), "enter_from")).mo59983a("enter_method", m92453a(getIntent(), "enter_method")).mo59983a("group_id", m92453a(getIntent(), "group_id")).mo59983a("author_id", m92453a(getIntent(), "author_id")).mo59980a("is_long", getIntent().getIntExtra("is_long", 0)).mo59983a("video_lang", m92453a(getIntent(), "video_lang")).mo59983a("transl_lang", m92453a(getIntent(), "transl_lang")).f79943a);
        mo81019d().setVisibility(0);
        mo81019d().mo27384f();
        EditCaptionViewModel a = mo81012a();
        String str = this.f113477d;
        if (str == null || str.length() == 0) {
            bVar = CaptionEditApi.C49358a.m92444a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new EditCaptionViewModel.C49362b(a), new EditCaptionViewModel.C49363c(a));
            C89219l.m154716b(bVar, "");
        } else {
            bVar = CaptionEditApi.C49358a.m92445a(str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new EditCaptionViewModel.C49364d(a), new EditCaptionViewModel.C49365e(a));
            C89219l.m154716b(bVar, "");
        }
        new C88411a().mo142945a(bVar);
        mo81012a().mo80984a().observe(this, new C49376d(this));
        mo81012a().mo80985b().observe(this, new C49377e(this));
        mo81012a().mo80986c().observe(this, new C49378f(this));
        mo81012a().mo80987d().observe(this, new C49386g(this));
        this.f113475b = new C49405a(mo81012a(), this);
        this.f113474a = new HighLightLayoutManager();
        RecyclerView f = mo81021f();
        HighLightLayoutManager highLightLayoutManager = this.f113474a;
        if (highLightLayoutManager == null) {
            C89219l.m154710a("highLightLayoutManager");
        }
        f.setLayoutManager(highLightLayoutManager);
        C49405a aVar = this.f113475b;
        if (aVar == null) {
            C89219l.m154710a("editCaptionAdapter");
        }
        f.setAdapter(aVar);
        RecyclerView.AbstractC1356f itemAnimator = f.getItemAnimator();
        if (itemAnimator != null) {
            ((AbstractC1391ab) itemAnimator).f4621m = false;
            ((FrameLayout) this.f113491s.getValue()).setOnClickListener(new View$OnClickListenerC49388h(this));
            ((TextTitleBar) this.f113496x.getValue()).setOnTitleBarClickListener(new C49393m(this));
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onCreate", false);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onCreate", false);
        throw nullPointerException;
    }

    /* renamed from: a */
    static String m92453a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

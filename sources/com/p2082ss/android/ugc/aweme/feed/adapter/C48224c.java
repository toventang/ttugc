package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.C21478d;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38231b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.C48311ag;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a;
import com.p2082ss.android.ugc.aweme.feed.helper.C49618d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49693u;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49695w;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout;
import com.p2082ss.android.ugc.aweme.follow.p3001e.C51078a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.AbstractC33251c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56251d;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56259l;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56261n;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.report.C67105b;
import com.p2082ss.android.ugc.aweme.report.C67107d;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a;
import com.p2082ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.c */
public class C48224c implements C33403c.AbstractC33407c, AbstractC48145ae, AbstractC48147ag, AbstractC48149ai {

    /* renamed from: a */
    public final Context f111707a;

    /* renamed from: b */
    public Aweme f111708b;

    /* renamed from: c */
    public LiveRoomStruct f111709c;

    /* renamed from: d */
    public AbstractC48150aj f111710d;

    /* renamed from: e */
    public String f111711e = "click";

    /* renamed from: f */
    public boolean f111712f;

    /* renamed from: g */
    public boolean f111713g;

    /* renamed from: h */
    public boolean f111714h;

    /* renamed from: i */
    public boolean f111715i;

    /* renamed from: j */
    public final C48229b f111716j = new C48229b(this);

    /* renamed from: k */
    public final View f111717k;

    /* renamed from: l */
    private double f111718l = -1.0d;

    static {
        Covode.recordClassIndex(56966);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: A */
    public final void mo80149A() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: B */
    public final void mo80150B() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: C */
    public final void mo80151C() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: D */
    public final void mo80152D() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: E */
    public final void mo80097E() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48145ae
    /* renamed from: F */
    public void mo80282F() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48145ae
    /* renamed from: G */
    public void mo80283G() {
    }

    /* renamed from: J */
    public String mo80363J() {
        return "";
    }

    /* renamed from: K */
    public String mo80364K() {
        return "";
    }

    /* renamed from: L */
    public boolean mo80365L() {
        return false;
    }

    /* renamed from: M */
    public boolean mo80366M() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: N */
    public final AbstractC80726a mo80100N() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: P */
    public final AbstractC48136a mo80101P() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: Q */
    public final boolean mo80102Q() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: R */
    public final C49618d mo80103R() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: S */
    public final boolean mo80104S() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: T */
    public final AbstractC48149ai mo80105T() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: U */
    public final void mo80106U() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: V */
    public final void mo80107V() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: W */
    public final boolean mo80108W() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final int mo80155a() {
        return 101;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80110a(int i, long j, long j2, int i2, long j3, long j4, long j5, int i3) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80112a(int i, String str, long j, long j2, int i2, long j3, long j4, long j5, int i3) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80158a(long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80113a(View view) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80161a(C49695w wVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80115a(C56251d dVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo80163a(C56257j jVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo80164a(C56259l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo80165a(C56261n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80116a(String str, int i, int i2, int i3, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80117a(String str, int i, int i2, String str2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80167a(String str, String str2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80118a(Map map) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo70616a(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80169a(boolean z, boolean z2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: b */
    public void mo80207b(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: b */
    public final void mo80094b(long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: b */
    public final void mo80123b(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: b */
    public final void mo80095b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: c */
    public final AbstractC48149ai mo80124c(String str) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: c */
    public final void mo80211c(Aweme aweme) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: c */
    public void mo80212c(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.C33403c.AbstractC33407c
    /* renamed from: d */
    public void mo59483d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: d */
    public final void mo80125d(Aweme aweme) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: d */
    public final void mo80126d(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: d */
    public final void mo80214d(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: e */
    public final C48311ag mo70617e() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: e */
    public final void mo80215e(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: e */
    public final void mo80217e(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: f */
    public final void mo70618f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48145ae
    /* renamed from: f */
    public void mo80285f(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: g */
    public void mo80072g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: i */
    public final void mo70619i() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: j */
    public void mo70620j() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: l */
    public void mo80082l() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: m */
    public void mo80083m() {
    }

    /* renamed from: n */
    public void mo80368n() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlaying(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreparePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onResumePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i, float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoSizeChanged(String str, int i, int i2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: q */
    public final void mo80226q() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: s */
    public final int mo80228s() {
        return 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: t */
    public final AbstractC37879bc mo80229t() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: u */
    public final void mo80230u() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: v */
    public final AbstractC48148ah mo80231v() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: w */
    public final boolean mo80232w() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: x */
    public final Surface mo80233x() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: y */
    public final View mo80234y() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: z */
    public final void mo80235z() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48145ae
    /* renamed from: I */
    public final double mo80284I() {
        return this.f111718l;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: b */
    public final Aweme mo80206b() {
        return this.f111708b;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: p */
    public final AbstractC48147ag mo80225p() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80166a(String str) {
        C89219l.m154721d(str, "");
        this.f111711e = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: O */
    public final Aweme mo80089O() {
        return mo80206b();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.c$a */
    static final class C48225a implements LongPressLayout.AbstractC50014a {

        /* renamed from: a */
        final /* synthetic */ C48224c f111719a;

        /* renamed from: b */
        final /* synthetic */ Context f111720b;

        static {
            Covode.recordClassIndex(56967);
        }

        C48225a(C48224c cVar, Context context) {
            this.f111719a = cVar;
            this.f111720b = context;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.c$a$a */
        static final class C48226a implements C11666c.AbstractC11669c {

            /* renamed from: a */
            final /* synthetic */ AbstractC58593c f111721a;

            /* renamed from: b */
            final /* synthetic */ C48225a f111722b;

            /* renamed from: c */
            final /* synthetic */ Room f111723c;

            static {
                Covode.recordClassIndex(56968);
            }

            C48226a(AbstractC58593c cVar, C48225a aVar, Room room) {
                this.f111721a = cVar;
                this.f111722b = aVar;
                this.f111723c = room;
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.C11666c.AbstractC11669c
            /* renamed from: a */
            public final void mo18438a() {
                this.f111722b.f111719a.f111716j.onReportPressed();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.c$a$b */
        static final class C48227b implements C11666c.AbstractC11668b {

            /* renamed from: a */
            final /* synthetic */ String f111724a;

            /* renamed from: b */
            final /* synthetic */ String f111725b;

            /* renamed from: c */
            final /* synthetic */ AbstractC58593c f111726c;

            /* renamed from: d */
            final /* synthetic */ C48225a f111727d;

            /* renamed from: e */
            final /* synthetic */ Room f111728e;

            static {
                Covode.recordClassIndex(56969);
            }

            C48227b(String str, String str2, AbstractC58593c cVar, C48225a aVar, Room room) {
                this.f111724a = str;
                this.f111725b = str2;
                this.f111726c = cVar;
                this.f111727d = aVar;
                this.f111728e = room;
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.C11666c.AbstractC11668b
            /* renamed from: a */
            public final void mo14244a() {
                this.f111727d.f111719a.f111716j.onDislikePressed();
                AbstractC11846d a = C11755f.m20713a();
                if (a != null) {
                    a.mo12999a(this.f111728e, this.f111724a, this.f111725b);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout.AbstractC50014a
        /* renamed from: a */
        public final void mo80347a(float f, float f2) {
            String str;
            String str2;
            this.f111719a.f111714h = true;
            Room room = new Room();
            LiveRoomStruct liveRoomStruct = this.f111719a.f111709c;
            if (liveRoomStruct != null) {
                room.setId(liveRoomStruct.f114485id);
                User user = new User();
                com.p2082ss.android.ugc.aweme.profile.model.User user2 = liveRoomStruct.owner;
                C89219l.m154716b(user2, "");
                user.setSecUid(user2.getSecUid());
                user.setId(liveRoomStruct.ownerUserId);
                FollowInfo followInfo = new FollowInfo();
                com.p2082ss.android.ugc.aweme.profile.model.User user3 = liveRoomStruct.owner;
                C89219l.m154716b(user3, "");
                followInfo.setFollowStatus((long) user3.getFollowStatus());
                user.setFollowInfo(followInfo);
                com.p2082ss.android.ugc.aweme.profile.model.User user4 = liveRoomStruct.owner;
                C89219l.m154716b(user4, "");
                user.setSecret(user4.isPrivateAccount() ? 1 : 0);
                room.setOwner(user);
                Aweme aweme = this.f111719a.f111708b;
                if (aweme == null || (str2 = aweme.getRequestId()) == null) {
                    str2 = "";
                }
                room.setRequestId(str2);
                room.setOwnerUserId(liveRoomStruct.ownerUserId);
                room.setLiveTypeAudio(liveRoomStruct.liveTypeAudio);
            }
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            if (d != null) {
                C11666c.C11667a a = C11666c.m20576a(room);
                String K = this.f111719a.mo80364K();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
                C89219l.m154716b(currentUserID, "");
                a.f27857d = Long.parseLong(currentUserID);
                a.f27875v = room.getId();
                a.f27876w = room.getOwnerUserId();
                a.f27873t = room.getRequestId();
                a.f27841E = K;
                a.f27842F = "live_cell";
                a.f27870q = false;
                a.f27844H = true;
                a.f27845I = d.mo13007a(K, "live_cell");
                a.f27852P = new C48226a(d, this, room);
                a.f27853Q = new C48227b(K, "live_cell", d, this, room);
                Aweme aweme2 = this.f111719a.f111708b;
                if (aweme2 != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                a.f27848L = str;
                if (this.f111719a.mo80365L()) {
                    a.f27843G = "fyp_long_press";
                } else if (this.f111719a.mo80366M()) {
                    a.f27843G = "following_long_press";
                }
                C11666c a2 = a.mo18437a();
                d.mo12994a(this.f111720b, false, room, a2, this.f111719a.f111716j, new C48228c(a2, this, room));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.c$a$c */
        public static final class C48228c implements AbstractC11665b {

            /* renamed from: a */
            final /* synthetic */ C11666c f111729a;

            /* renamed from: b */
            final /* synthetic */ C48225a f111730b;

            /* renamed from: c */
            final /* synthetic */ Room f111731c;

            static {
                Covode.recordClassIndex(56970);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
            /* renamed from: a */
            public final void mo8904a(Throwable th) {
            }

            C48228c(C11666c cVar, C48225a aVar, Room room) {
                this.f111729a = cVar;
                this.f111730b = aVar;
                this.f111731c = room;
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
            /* renamed from: a */
            public final void mo8903a(String str, String str2, Bundle bundle) {
                int i;
                String str3;
                String str4;
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                int i2 = 0;
                if (bundle != null) {
                    ILiveOuterService s = LiveOuterService.m107269s();
                    C89219l.m154716b(s, "");
                    i = bundle.getInt(s.mo95830d().mo13014b(2));
                    ILiveOuterService s2 = LiveOuterService.m107269s();
                    C89219l.m154716b(s2, "");
                    i2 = bundle.getInt(s2.mo95830d().mo13014b(1));
                } else {
                    i = 0;
                }
                String mD5String = MD5Utils.getMD5String("share_success" + System.currentTimeMillis());
                if (bundle != null) {
                    str3 = bundle.getString("shareIdList", "");
                } else {
                    str3 = "";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("share_platform", str);
                hashMap.put("share_type", str2);
                hashMap.put("user_type", "user");
                C11666c cVar = this.f111729a;
                C89219l.m154716b(cVar, "");
                String str5 = cVar.f27795B;
                C89219l.m154716b(str5, "");
                hashMap.put("request_page", str5);
                C89219l.m154716b(mD5String, "");
                hashMap.put("bind_id", mD5String);
                hashMap.put("room_orientation", "portrait");
                C6501b a = C6501b.C6502a.m13948a("livesdk_share").mo12651a("enter_from_merge", this.f111730b.f111719a.mo80364K()).mo12651a("enter_method", "live_cell").mo12646a("anchor_id", this.f111731c.getOwnerUserId()).mo12646a("room_id", this.f111731c.getId()).mo12651a("action_type", "click").mo12645a("is_create_group_chat", i).mo12645a("friends_shared_cnt", i2);
                if (bundle != null) {
                    ILiveOuterService s3 = LiveOuterService.m107269s();
                    C89219l.m154716b(s3, "");
                    str4 = bundle.getString(s3.mo95830d().mo13014b(3));
                } else {
                    str4 = null;
                }
                String str6 = "top_supporters";
                if (!TextUtils.equals(str4, str6)) {
                    if (TextUtils.equals(str4, "recently_shared")) {
                        str6 = "recently_shared";
                    } else {
                        str6 = "none";
                    }
                }
                a.mo12651a("batch_share_type", str6).mo12652a((Map<String, String>) hashMap).mo12655b();
                C6501b.C6502a.m13948a("share_info").mo12651a("bind_id", mD5String).mo12651a("to_user_id", str3).mo12655b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: h */
    public final void mo80127h() {
        C21478d.f50922d = false;
        C67107d.C67108a.f150503a.mo105936b();
    }

    /* renamed from: o */
    public void mo80369o() {
        C80749k a = C80749k.m140049a();
        C89219l.m154716b(a, "");
        a.f180546a = this.f111710d;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.c$b */
    public static final class C48229b implements IHostLongPressCallback {

        /* renamed from: a */
        final /* synthetic */ C48224c f111732a;

        static {
            Covode.recordClassIndex(56971);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.c$b$a */
        public static final class C48230a implements AbstractC33251c {

            /* renamed from: a */
            final /* synthetic */ C48229b f111733a;

            static {
                Covode.recordClassIndex(56972);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.AbstractC33251c
            /* renamed from: a */
            public final void mo58887a() {
                AbstractC81915c.m141874a(new C49677e(this.f111733a.f111732a.f111708b, this.f111733a.f111732a.mo80363J()));
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C48230a(C48229b bVar) {
                this.f111733a = bVar;
            }
        }

        @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
        public final void onDislikePressed() {
            Aweme aweme;
            AwemeRawAd awemeRawAd;
            C38231b dislikeInfo;
            AwemeRawAd awemeRawAd2;
            long j;
            Aweme aweme2 = this.f111732a.f111708b;
            if (aweme2 == null || !aweme2.isAd() || (aweme = this.f111732a.f111708b) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6o);
                AbstractC81915c.m141874a(new C49677e(this.f111732a.f111708b, this.f111732a.mo80363J()));
            } else if (this.f111732a.f111707a instanceof ActivityC0945e) {
                IFeedAdService c = FeedAdServiceImpl.m67808c();
                String str = null;
                if (c != null) {
                    Aweme aweme3 = this.f111732a.f111708b;
                    if (aweme3 != null) {
                        awemeRawAd2 = aweme3.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    Aweme aweme4 = this.f111732a.f111708b;
                    if (aweme4 != null) {
                        str = aweme4.getAid();
                    }
                    C48230a aVar = new C48230a(this);
                    LiveRoomStruct liveRoomStruct = this.f111732a.f111709c;
                    if (liveRoomStruct != null) {
                        j = liveRoomStruct.f114485id;
                    } else {
                        j = 0;
                    }
                    DialogInterface$OnCancelListenerC0944d a = c.mo58876a(awemeRawAd2, str, aVar, j);
                    if (a != null) {
                        a.setCancelable(true);
                        Context context = this.f111732a.f111707a;
                        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        a.show(((ActivityC0945e) context).getSupportFragmentManager(), "feed_ad_dislike_sub_reason_dialog");
                    }
                }
            }
        }

        @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
        public final void onReportPressed() {
            long j;
            LiveRoomStruct liveRoomStruct;
            Aweme aweme = this.f111732a.f111708b;
            if (aweme == null || aweme.isAd()) {
                Aweme aweme2 = this.f111732a.f111708b;
                if (aweme2 != null) {
                    Context context = this.f111732a.f111707a;
                    LiveRoomStruct liveRoomStruct2 = this.f111732a.f111709c;
                    if (liveRoomStruct2 != null) {
                        j = liveRoomStruct2.f114485id;
                    } else {
                        j = 0;
                    }
                    C89219l.m154721d(context, "");
                    C89219l.m154721d(aweme2, "");
                    C39223a.m79587a().mo68694b(C69124b.m122223a(context), C67105b.m118759a(aweme2, "live_ad", j, "ad"));
                    return;
                }
                return;
            }
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            if (d != null && (liveRoomStruct = this.f111732a.f111709c) != null) {
                long j2 = liveRoomStruct.f114485id;
                com.p2082ss.android.ugc.aweme.profile.model.User user = liveRoomStruct.owner;
                C89219l.m154716b(user, "");
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                long parseLong = Long.parseLong(uid);
                com.p2082ss.android.ugc.aweme.profile.model.User user2 = liveRoomStruct.owner;
                C89219l.m154716b(user2, "");
                String uid2 = user2.getUid();
                C89219l.m154716b(uid2, "");
                long parseLong2 = Long.parseLong(uid2);
                com.p2082ss.android.ugc.aweme.profile.model.User user3 = liveRoomStruct.owner;
                C89219l.m154716b(user3, "");
                C11838d dVar = new C11838d(j2, parseLong, parseLong2, user3.getSecUid(), "long_press", this.f111732a.mo80363J(), "live_cell", "click", "report_anchor", "");
                dVar.f28202a = "full_screen";
                d.mo12992a(this.f111732a.f111707a, dVar);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48229b(C48224c cVar) {
            this.f111732a = cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: k */
    public final void mo80128k() {
        C80446fr.m139460c(1000);
        C80446fr.m139459b(1500);
        C80446fr.m139456a(1000);
        C67107d.C67108a.f150503a.mo105934a();
    }

    /* renamed from: H */
    public static void m91545H() {
        C39162r.m79460a("live_play_page_notice", new C33744d().mo59983a("enter_from", "homepage_follow").mo59983a("notice_type", C51078a.f117813a).mo59983a("show_cnt", String.valueOf(C51078a.f117814b)).mo59983a("yellow_dot_logid", C51078a.f117815c).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: c */
    public void mo80080c() {
        AbstractC48150aj ajVar = this.f111710d;
        C80749k a = C80749k.m140049a();
        C89219l.m154716b(a, "");
        if (C89219l.m154714a(ajVar, a.f180546a)) {
            C80749k.m140049a().mo123953b();
            C80749k a2 = C80749k.m140049a();
            C89219l.m154716b(a2, "");
            a2.f180546a = null;
        }
        this.f111718l = -1.0d;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: r */
    public final void mo80227r() {
        Context context = this.f111707a;
        C13605d<SurfaceView> dVar = AbstractC48234cd.C48235a.f111738a.get(context);
        if (dVar != null) {
            Iterator<SurfaceView> it = dVar.iterator();
            while (it.hasNext()) {
                C34729o.m70955a(it.next(), 8);
            }
        }
        C13605d<AbstractC48234cd> dVar2 = AbstractC48234cd.C48235a.f111739b.get(context);
        if (dVar2 != null) {
            Iterator<AbstractC48234cd> it2 = dVar2.iterator();
            while (it2.hasNext()) {
                AbstractC48234cd next = it2.next();
                C89219l.m154716b(next, "");
                if (next.mo80206b() != null) {
                    Aweme b = next.mo80206b();
                    if (b == null) {
                        C89219l.m154715b();
                    }
                    Video video = b.getVideo();
                    if (video == null) {
                        C89219l.m154715b();
                    }
                    next.mo80071a(video);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: c */
    public void mo80210c(int i) {
        this.f111713g = false;
        this.f111715i = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo70614a(int i) {
        AbstractC81915c.m141874a(new C49693u(this.f111708b));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: d */
    public final void mo80213d(int i) {
        this.f111713g = false;
        this.f111715i = false;
        mo80369o();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: b */
    public void mo80209b(Aweme aweme) {
        this.f111713g = false;
        this.f111715i = false;
    }

    public C48224c(View view) {
        C89219l.m154721d(view, "");
        this.f111717k = view;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f111707a = context;
    }

    /* renamed from: a */
    public final LongPressLayout.AbstractC50014a mo80367a(Context context) {
        C89219l.m154721d(context, "");
        if (C11755f.m20713a() == null) {
            return null;
        }
        AbstractC11846d a = C11755f.m20713a();
        if (a == null) {
            C89219l.m154715b();
        }
        Boolean bool = (Boolean) a.mo12981a("live_host_card_long_press_enable", (Object) false);
        C89219l.m154716b(bool, "");
        if (!bool.booleanValue()) {
            return null;
        }
        return new C48225a(this, context);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f) {
        Aweme aweme = this.f111708b;
        if (aweme != null && aweme.getVideo() != null) {
            Aweme aweme2 = this.f111708b;
            if (aweme2 == null) {
                C89219l.m154715b();
            }
            Video video = aweme2.getVideo();
            C89219l.m154716b(video, "");
            double duration = (double) (((float) video.getDuration()) * (f / 100.0f));
            Double.isNaN(duration);
            this.f111718l = duration / 1000.0d;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo70615a(Aweme aweme) {
        this.f111713g = false;
        this.f111715i = false;
        this.f111708b = aweme;
        if (aweme != null) {
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData == null) {
                RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                C89219l.m154716b(roomFeedCellStruct, "");
                newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData();
            }
            this.f111709c = newLiveRoomData;
        }
        mo80368n();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80114a(Aweme aweme, int i) {
        mo70615a(aweme);
    }
}

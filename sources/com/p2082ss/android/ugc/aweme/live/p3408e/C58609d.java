package com.p2082ss.android.ugc.aweme.live.p3408e;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5698a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5700c;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreviewCardUsePreviewSetting;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k;
import com.bytedance.android.livesdkapi.view.AbstractC11876d;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.newfollow.C61493a;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.live.e.d */
public final class C58609d implements C5695a.AbstractC5696a, AbstractC11643g.AbstractC11646c, AbstractC58608c {

    /* renamed from: a */
    public String f133474a;

    /* renamed from: b */
    public TextureRenderView f133475b;

    /* renamed from: c */
    public volatile AbstractC5777j f133476c;

    /* renamed from: d */
    private boolean f133477d;

    /* renamed from: e */
    private AbstractC58607b f133478e;

    /* renamed from: f */
    private String f133479f;

    /* renamed from: g */
    private String f133480g;

    /* renamed from: h */
    private LiveRoomStruct f133481h;

    /* renamed from: i */
    private FrameLayout f133482i;

    /* renamed from: j */
    private AbstractC58606a f133483j;

    /* renamed from: k */
    private Runnable f133484k;

    /* renamed from: l */
    private C5695a f133485l;

    /* renamed from: m */
    private int f133486m;

    /* renamed from: n */
    private final Object f133487n = new Object();

    /* renamed from: o */
    private C11690a f133488o = null;

    /* renamed from: p */
    private AbstractC11656k f133489p = null;

    /* renamed from: q */
    private int f133490q;

    /* renamed from: r */
    private int f133491r;

    static {
        Covode.recordClassIndex(68906);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a.AbstractC5696a
    /* renamed from: b */
    public final boolean mo10547b(int i) {
        return i == 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final String getPlayerTag() {
        return this.f133479f;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final TextureRenderView getTextureView() {
        return this.f133475b;
    }

    /* renamed from: c */
    private void m107725c() {
        this.f133488o = null;
        this.f133489p = null;
        this.f133475b = null;
        m107724b();
    }

    /* renamed from: e */
    private Context m107727e() {
        FrameLayout frameLayout = this.f133482i;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout.getContext();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final Boolean getLivePlayControllerIsPlaying() {
        return Boolean.valueOf(this.f133476c.mo12928l());
    }

    /* renamed from: b */
    private void m107724b() {
        try {
            AbstractC11643g a = m107720a();
            if (a != null) {
                a.mo12911a((String) null, (AbstractC11876d) null, 0, (AbstractC11643g.C11647d) null, (AbstractC11643g.AbstractC11646c) null, (String) null);
                if (a instanceof AbstractC5777j) {
                    ((AbstractC5777j) a).mo11524a((AbstractC11876d) null);
                }
            }
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final JSONObject getStaticLog() {
        if (m107720a() != null) {
            return this.f133476c.mo11543e();
        }
        return new JSONObject();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void pause() {
        if (m107720a() != null && TextUtils.equals(this.f133474a, this.f133476c.mo12929m())) {
            m107728f();
            m107726d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void pauseWithStreamData() {
        if (m107720a() != null && TextUtils.equals(this.f133480g, this.f133476c.mo12930n())) {
            m107728f();
            m107726d();
        }
    }

    /* renamed from: d */
    private void m107726d() {
        MethodCollector.m26663i(899);
        TextureRenderView textureRenderView = this.f133475b;
        if (textureRenderView == null) {
            MethodCollector.m26664o(899);
            return;
        }
        textureRenderView.setVisibility(8);
        ViewGroup viewGroup = (ViewGroup) this.f133475b.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f133475b);
        }
        MethodCollector.m26664o(899);
    }

    /* renamed from: f */
    private void m107728f() {
        if (m107720a() != null) {
            if (this.f133476c != null) {
                if (!TextUtils.isEmpty(this.f133479f)) {
                    this.f133476c.mo11525a(this.f133479f);
                } else {
                    this.f133476c.mo12917d(m107727e());
                }
            }
            this.f133480g = null;
            this.f133474a = null;
            this.f133481h = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void destroy() {
        if (m107720a() != null) {
            m107728f();
            if (!TextUtils.isEmpty(this.f133479f)) {
                this.f133476c.mo11535b(this.f133479f);
            } else {
                this.f133476c.mo12918e(m107727e());
            }
        }
        m107726d();
        this.f133475b = null;
        this.f133488o = null;
        this.f133489p = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void stop() {
        C3854a.m9453a(3, "LivePlayHelper", "+++++++++++++++++++++ready to stop");
        if (m107720a() != null && TextUtils.equals(this.f133474a, this.f133476c.mo12929m())) {
            m107725c();
            m107728f();
            m107726d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void stopWithStreamData() {
        C3854a.m9453a(3, "LivePlayHelper", "+++++++++++++++++++++ready to stop");
        if (m107720a() != null && TextUtils.equals(this.f133480g, this.f133476c.mo12930n())) {
            m107725c();
            m107728f();
            m107726d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void switchCndAbrSwitchResolution() {
        LiveRoomStruct liveRoomStruct;
        String str;
        if (m107720a() != null && (liveRoomStruct = this.f133481h) != null) {
            if (liveRoomStruct.getMultiStreamDefaultPreviewQualitySdkKey() != null) {
                str = this.f133481h.getMultiStreamDefaultPreviewQualitySdkKey().toLowerCase(Locale.US);
            } else {
                str = "";
            }
            if (!TextUtils.equals("auto", str)) {
                this.f133476c.mo12922g(this.f133481h.getMultiStreamDefaultQualitySdkKey());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.e.d$1 */
    static /* synthetic */ class C586101 {

        /* renamed from: a */
        static final /* synthetic */ int[] f133492a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 68907(0x10d2b, float:9.6559E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdkapi.depend.d.g$b[] r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.live.p3408e.C58609d.C586101.f133492a = r2
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.VIDEO_SIZE_CHANGED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.p3408e.C58609d.C586101.f133492a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.DISPLAYED_PLAY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.p3408e.C58609d.C586101.f133492a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.INTERACT_SEI     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.p3408e.C58609d.C586101.f133492a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.PLAYER_PREPARED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.p3408e.C58609d.C586101.f133492a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.COMPLETE_PLAY     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.p2082ss.android.ugc.aweme.live.p3408e.C58609d.C586101.f133492a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.p3408e.C58609d.C586101.<clinit>():void");
        }
    }

    /* renamed from: a */
    private AbstractC11643g m107720a() {
        if (this.f133476c == null) {
            AbstractC11643g gVar = null;
            if (this.f133481h == null) {
                return null;
            }
            this.f133479f = "preview_" + this.f133481h.f114485id + "_" + SystemClock.uptimeMillis();
            if (!(LiveOuterService.m107269s() == null || LiveOuterService.m107269s().mo95830d() == null)) {
                gVar = LiveOuterService.m107269s().mo95830d().mo12977a(this.f133479f);
            }
            this.f133476c = (AbstractC5777j) gVar;
        }
        return this.f133476c;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void setLivePlayerEntranceParam(C11690a aVar) {
        this.f133488o = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void setPlayerLogCache(AbstractC11656k kVar) {
        this.f133489p = kVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void setPlayControllerShouldDestroy(boolean z) {
        this.f133476c.mo12925h(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void changeSRSupportScene(boolean z) {
        if (m107720a() != null) {
            this.f133476c.mo11542d(z);
        }
    }

    /* renamed from: a */
    private void m107722a(FrameLayout frameLayout) {
        MethodCollector.m26663i(868);
        if (frameLayout.indexOfChild(this.f133475b) < 0) {
            m107726d();
            this.f133475b.setVisibility(0);
            frameLayout.addView(this.f133475b);
        }
        MethodCollector.m26664o(868);
    }

    /* renamed from: a */
    private void m107721a(Context context) {
        if (this.f133475b == null) {
            this.f133475b = C61493a.m111333a(context, this.f133481h);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f133475b.setLayoutParams(layoutParams);
        this.f133475b.setVisibility(0);
        this.f133475b.setScaleType(2);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void setMute(boolean z) {
        if (m107720a() != null) {
            if (!TextUtils.isEmpty(this.f133479f)) {
                this.f133476c.mo11531a(z, this.f133479f);
            } else if (this.f133476c != null && m107727e() != null) {
                try {
                    this.f133476c.mo12914a(z, m107727e());
                } catch (Exception e) {
                    C51423a.m95792b("LivePlayHelper", Log.getStackTraceString(e));
                }
            }
        }
    }

    /* renamed from: a */
    private void m107723a(boolean z) {
        TextureRenderView textureRenderView = this.f133475b;
        if (textureRenderView == null) {
            return;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = textureRenderView.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 85;
                this.f133475b.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = textureRenderView.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
            this.f133475b.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final C89378p<Integer, Integer> resolutionOfLiveFromStream(LiveRoomStruct liveRoomStruct) {
        JSONObject optJSONObject;
        if (liveRoomStruct == null) {
            return new C89378p<>(0, 0);
        }
        C89378p<Integer, Integer> pVar = new C89378p<>(0, 0);
        if (liveRoomStruct.stream_url == null || liveRoomStruct.stream_url.liveCoreSDKData == null || liveRoomStruct.stream_url.liveCoreSDKData.getPullData() == null || TextUtils.isEmpty(liveRoomStruct.stream_url.liveCoreSDKData.getPullData().getStreamData())) {
            return pVar;
        }
        try {
            JSONObject optJSONObject2 = new JSONObject(liveRoomStruct.stream_url.liveCoreSDKData.getPullData().getStreamData()).optJSONObject("data");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("origin")) == null) {
                return pVar;
            }
            String[] split = new JSONObject(((JSONObject) Objects.requireNonNull(optJSONObject.optJSONObject("main"))).optString("sdk_params")).optString("resolution").split("x");
            return new C89378p<>(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
        } catch (Exception unused) {
            return pVar;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a.AbstractC5696a
    /* renamed from: a */
    public final void mo10544a(C5698a aVar) {
        List<C5700c> list;
        LiveRoomStruct liveRoomStruct;
        this.f133486m = 0;
        int i = 2;
        int[] iArr = new int[2];
        if (aVar != null && (list = aVar.f14432e) != null && (liveRoomStruct = this.f133481h) != null) {
            long anchorId = liveRoomStruct.getAnchorId();
            int i2 = 0;
            for (C5700c cVar : list) {
                if (!(cVar == null || cVar.f14438b == anchorId)) {
                    int width = this.f133482i.getWidth();
                    int height = this.f133482i.getHeight();
                    iArr = new int[i];
                    float f = ((float) width) / ((float) this.f133490q);
                    float f2 = (float) this.f133491r;
                    float f3 = ((float) height) / f2;
                    if (f <= f3) {
                        f = f3;
                    }
                    double d = (double) (f2 * f);
                    Double.isNaN(d);
                    int i3 = (int) (d * ((1.0d - cVar.f14443g) - cVar.f14441e));
                    double d2 = cVar.f14441e;
                    Double.isNaN(d);
                    iArr[0] = i3;
                    iArr[1] = (int) ((d * d2) + 0.5d);
                    if (i2 <= 0) {
                        i2 = iArr[0];
                    }
                    this.f133486m++;
                }
                i = 2;
            }
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (this.f133483j == null) {
                return;
            }
            if (list.size() == 1) {
                m107723a(true);
            } else if (list.size() > 1) {
                m107723a(true);
            } else {
                m107723a(false);
            }
        }
    }

    public C58609d(Runnable runnable, AbstractC58607b bVar) {
        this.f133484k = runnable;
        this.f133478e = bVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.AbstractC11646c
    /* renamed from: a */
    public final void mo12871a(AbstractC11643g.EnumC11645b bVar, Object obj) {
        C3854a.m9453a(3, "LivePlayHelper", "onPlayerMessage ..." + bVar + "param:" + obj);
        switch (C586101.f133492a[bVar.ordinal()]) {
            case 1:
                if (this.f133478e != null) {
                    int parseInt = Integer.parseInt((String) obj);
                    int i = 65535 & parseInt;
                    this.f133490q = i;
                    int i2 = parseInt >> 16;
                    this.f133491r = i2;
                    ALog.m59865d("LivePlayHelper", "width = " + i + "; height = " + i2);
                    this.f133478e.onVideoSizeChange(this.f133475b, this.f133490q, this.f133491r);
                    TextureRenderView textureRenderView = this.f133475b;
                    if (textureRenderView != null) {
                        textureRenderView.setScaleType(2);
                        this.f133475b.mo19014a(this.f133490q, this.f133491r);
                        break;
                    }
                }
                break;
            case 2:
                Runnable runnable = this.f133484k;
                if (runnable != null) {
                    runnable.run();
                }
                AbstractC58607b bVar2 = this.f133478e;
                if (bVar2 != null) {
                    bVar2.firstFrame();
                    this.f133478e.playing();
                    break;
                }
                break;
            case 3:
                if (obj instanceof String) {
                    C5695a aVar = this.f133485l;
                    if (aVar != null) {
                        aVar.mo11465b((String) obj);
                    }
                    AbstractC58607b bVar3 = this.f133478e;
                    if (bVar3 != null) {
                        bVar3.seiUpdate(String.valueOf(obj));
                    }
                    if (!TextUtils.isEmpty((String) obj)) {
                        try {
                            if (!new JSONObject((String) obj).has("app_data") && this.f133486m > 0) {
                                this.f133486m = 0;
                                break;
                            }
                        } catch (JSONException unused) {
                            break;
                        }
                    }
                }
                break;
            case 4:
                AbstractC58607b bVar4 = this.f133478e;
                if (bVar4 != null) {
                    bVar4.playPrepared(String.valueOf(obj));
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                AbstractC58607b bVar5 = this.f133478e;
                if (bVar5 != null) {
                    bVar5.playComplete(String.valueOf(obj));
                    break;
                }
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                AbstractC58607b bVar6 = this.f133478e;
                if (bVar6 != null) {
                    bVar6.playerMediaError(String.valueOf(obj));
                    break;
                }
                break;
        }
        AbstractC58607b bVar7 = this.f133478e;
        if (bVar7 != null) {
            bVar7.onPlayerMessage(bVar, obj);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void play(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        C3854a.m9453a(3, "LivePlayHelper", "+++++++++++++++++++++ready to play");
        if (frameLayout == null) {
            C51423a.m95792b("LivePlayHelper", "liveStreamContainer is null");
            return;
        }
        this.f133477d = z;
        if (liveRoomStruct.stream_url != null && !TextUtils.equals(this.f133474a, liveRoomStruct.stream_url.rtmp_pull_url)) {
            m107724b();
        }
        if (liveRoomStruct.stream_url != null) {
            this.f133474a = liveRoomStruct.stream_url.rtmp_pull_url;
        }
        this.f133481h = liveRoomStruct;
        this.f133482i = frameLayout;
        try {
            m107721a(frameLayout.getContext());
            m107722a(this.f133482i);
            if (m107720a() != null) {
                this.f133476c.mo12921f(true);
                this.f133476c.mo12908a(this.f133489p);
                this.f133476c.mo12909a(this.f133488o);
                this.f133476c.mo12911a(this.f133481h.stream_url.rtmp_pull_url, this.f133475b, RoomStruct.getStreamType(this.f133481h).ordinal(), (AbstractC11643g.C11647d) null, this, (String) null);
                this.f133476c.mo12914a(this.f133477d, m107727e());
            }
        } catch (Exception e) {
            C51423a.m95792b("LivePlayHelper", Log.getStackTraceString(e));
        }
        this.f133485l = new C5695a(this);
        this.f133486m = 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void playWithStreamData(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        String multiStreamDefaultQualitySdkKey;
        AbstractC11643g.C11647d dVar;
        C3854a.m9453a(3, "LivePlayHelper", "+++++++++++++++++++++ready to play");
        if (frameLayout == null) {
            C51423a.m95792b("LivePlayHelper", "liveStreamContainer is null");
            return;
        }
        this.f133477d = z;
        if (liveRoomStruct.getMultiStreamData() != null) {
            m107724b();
        }
        if (liveRoomStruct.getMultiStreamData() != null) {
            this.f133480g = liveRoomStruct.getMultiStreamData();
        }
        this.f133481h = liveRoomStruct;
        this.f133482i = frameLayout;
        try {
            m107721a(frameLayout.getContext());
            m107722a(this.f133482i);
            if (m107720a() != null) {
                this.f133476c.mo12921f(true);
                if (EnablePreviewCardUsePreviewSetting.INSTANCE.getValue() == 1) {
                    multiStreamDefaultQualitySdkKey = this.f133481h.getMultiStreamDefaultPreviewQualitySdkKey();
                } else {
                    multiStreamDefaultQualitySdkKey = this.f133481h.getMultiStreamDefaultQualitySdkKey();
                }
                this.f133476c.mo12908a(this.f133489p);
                this.f133476c.mo12909a(this.f133488o);
                AbstractC5777j jVar = this.f133476c;
                String multiStreamData = this.f133481h.getMultiStreamData();
                TextureRenderView textureRenderView = this.f133475b;
                int ordinal = RoomStruct.getStreamType(this.f133481h).ordinal();
                if (this.f133481h.getStreamUrlExtraSafely().getSrConfig() == null) {
                    dVar = null;
                } else {
                    AbstractC11643g.C11647d.C11648a aVar = new AbstractC11643g.C11647d.C11648a();
                    aVar.f27786a = this.f133481h.getStreamUrlExtraSafely().getSrConfig().enabled;
                    aVar.f27787b = this.f133481h.getStreamUrlExtraSafely().getSrConfig().antiAlias;
                    aVar.f27788c = this.f133481h.getStreamUrlExtraSafely().getSrConfig().strength;
                    dVar = aVar.mo18426a();
                }
                jVar.mo12915b(multiStreamData, multiStreamDefaultQualitySdkKey, textureRenderView, ordinal, dVar, this, this.f133479f);
                AbstractC5777j jVar2 = this.f133476c;
                jVar2.mo11531a(this.f133477d, this.f133479f);
                LiveOuterService.m107269s().mo95830d().mo13001a(this.f133479f, jVar2);
            }
        } catch (Exception e) {
            C51423a.m95792b("LivePlayHelper", Log.getStackTraceString(e));
        }
        this.f133485l = new C5695a(this);
        this.f133486m = 0;
    }
}

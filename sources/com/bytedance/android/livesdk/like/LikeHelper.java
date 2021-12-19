package com.bytedance.android.livesdk.like;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.BarrageServiceImpl;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.model.C7688h;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9051bq;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.EnumC9050bp;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11209ac;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class LikeHelper implements AbstractC9168b, AbstractC33974au {

    /* renamed from: A */
    private final int f22285A;

    /* renamed from: B */
    private final int f22286B;

    /* renamed from: C */
    private boolean f22287C;

    /* renamed from: D */
    private final boolean f22288D;

    /* renamed from: E */
    private boolean f22289E;

    /* renamed from: F */
    private final boolean f22290F;

    /* renamed from: G */
    private View f22291G;

    /* renamed from: H */
    private View f22292H;

    /* renamed from: I */
    private int[] f22293I;

    /* renamed from: J */
    private final SparseArray<Bitmap> f22294J;

    /* renamed from: K */
    private final Random f22295K;

    /* renamed from: L */
    private final List<Bitmap> f22296L;

    /* renamed from: M */
    private final Handler f22297M;

    /* renamed from: a */
    protected final AbstractC1204m f22298a;

    /* renamed from: b */
    protected final ActivityC0945e f22299b;

    /* renamed from: c */
    protected Room f22300c;

    /* renamed from: d */
    final List<AbstractC9170d> f22301d;

    /* renamed from: e */
    public int f22302e;

    /* renamed from: f */
    public int f22303f;

    /* renamed from: g */
    public final int f22304g;

    /* renamed from: h */
    public boolean f22305h;

    /* renamed from: i */
    public int f22306i;

    /* renamed from: j */
    protected final String f22307j;

    /* renamed from: k */
    protected final boolean f22308k;

    /* renamed from: l */
    protected final SparseArray<Bitmap> f22309l = new SparseArray<>();

    /* renamed from: m */
    protected final List<Bitmap> f22310m = new ArrayList();

    /* renamed from: n */
    protected final BitmapFactory.Options f22311n;

    /* renamed from: o */
    protected final DataChannel f22312o;

    /* renamed from: p */
    protected final Map<String, AbstractC88412b> f22313p;

    /* renamed from: q */
    final List<Bitmap> f22314q;

    /* renamed from: r */
    final Map<String, Bitmap> f22315r;

    /* renamed from: s */
    final List<Bitmap> f22316s;

    /* renamed from: t */
    private final View.OnTouchListener f22317t;

    /* renamed from: u */
    private final long f22318u;

    /* renamed from: v */
    private final int f22319v;

    /* renamed from: w */
    private final long f22320w;

    /* renamed from: x */
    private final boolean f22321x;

    /* renamed from: y */
    private float f22322y;

    /* renamed from: z */
    private float f22323z;

    static {
        Covode.recordClassIndex(10068);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15269a(int i, int i2, int i3, float f, float f2, float f3, float f4) {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: p */
    public boolean mo15298p() {
        return false;
    }

    /* renamed from: com.bytedance.android.livesdk.like.LikeHelper$c */
    static class C9166c {

        /* renamed from: a */
        boolean f22327a;

        /* renamed from: b */
        String f22328b;

        /* renamed from: c */
        Bitmap f22329c;

        static {
            Covode.recordClassIndex(10072);
        }

        private C9166c() {
        }

        /* synthetic */ C9166c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: a */
    public final View.OnTouchListener mo15266a() {
        return this.f22317t;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: b */
    public final View mo15277b() {
        return this.f22292H;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: c */
    public final int mo15282c() {
        return this.f22285A;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: d */
    public final int mo15284d() {
        return this.f22286B;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: e */
    public final int mo15286e() {
        return this.f22319v;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: f */
    public final long mo15287f() {
        return this.f22320w;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: g */
    public final int mo15288g() {
        return this.f22306i;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: k */
    public final boolean mo15292k() {
        return this.f22287C;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: l */
    public final boolean mo15293l() {
        return this.f22308k;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: m */
    public final boolean mo15294m() {
        return this.f22288D;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: n */
    public final boolean mo15295n() {
        return this.f22289E;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: o */
    public final boolean mo15296o() {
        return this.f22290F;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: a */
    public final void mo15274a(boolean z) {
        this.f22287C = z;
    }

    /* renamed from: a */
    public final boolean mo15275a(float f, float f2) {
        View view;
        View view2;
        if (!(this.f22312o.mo28318b(C9051bq.class) == EnumC9050bp.DISMISS && this.f22289E && !this.f22287C && this.f22305h)) {
            return false;
        }
        this.f22303f++;
        this.f22306i++;
        if (!(this.f22322y > 0.0f || this.f22323z > 0.0f || (view = this.f22292H) == null || view.getMeasuredWidth() == 0 || this.f22292H.getMeasuredHeight() == 0 || (view2 = this.f22291G) == null || view2.getMeasuredWidth() == 0 || this.f22291G.getMeasuredHeight() == 0)) {
            int[] iArr = new int[2];
            this.f22292H.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            this.f22291G.getLocationInWindow(iArr2);
            int i = iArr[0] - iArr2[0];
            int i2 = iArr[1] - iArr2[1];
            this.f22322y = ((float) i) + (((float) this.f22292H.getMeasuredWidth()) / 2.0f);
            this.f22323z = ((float) i2) + (((float) this.f22292H.getMeasuredHeight()) / 2.0f);
        }
        int i3 = this.f22302e;
        int i4 = this.f22303f;
        int i5 = this.f22306i;
        float f3 = this.f22322y;
        float f4 = this.f22323z;
        mo15269a(i3, i4, i5, f, f2, f3, f4);
        for (AbstractC9170d dVar : this.f22301d) {
            dVar.mo10822a(this, i3, i4, f, f2, f3, f4);
        }
        this.f22297M.removeMessages(1);
        this.f22297M.sendEmptyMessageDelayed(1, this.f22318u);
        return true;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: i */
    public final void mo15290i() {
        Bitmap bitmap = this.f22309l.get(2131234037);
        if (bitmap != null) {
            this.f22309l.remove(2131234037);
            this.f22310m.remove(bitmap);
        }
    }

    /* renamed from: r */
    private void m17371r() {
        if (this.f22293I == null) {
            TypedArray obtainTypedArray = this.f22299b.getResources().obtainTypedArray(R.array.ax);
            if (obtainTypedArray.length() > 0) {
                this.f22293I = new int[obtainTypedArray.length()];
                for (int i = 0; i < obtainTypedArray.length(); i++) {
                    this.f22293I[i] = obtainTypedArray.getResourceId(i, 0);
                }
            }
            obtainTypedArray.recycle();
        }
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: h */
    public final void mo15289h() {
        MethodCollector.m26663i(7403);
        if (this.f22309l.get(2131234037) != null) {
            MethodCollector.m26664o(7403);
            return;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f22299b.getResources(), 2131234037, this.f22311n);
        if (decodeResource != null) {
            this.f22309l.put(2131234037, decodeResource);
            this.f22310m.add(decodeResource);
        }
        MethodCollector.m26664o(7403);
    }

    /* renamed from: q */
    public final boolean mo15299q() {
        if (this.f22312o.mo28318b(C9051bq.class) != EnumC9050bp.DISMISS || !this.f22289E || this.f22287C || this.f22305h) {
            return false;
        }
        this.f22302e++;
        this.f22303f = 0;
        this.f22305h = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r1 != null) goto L_0x0022;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m17372s() {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.like.LikeHelper.m17372s():android.graphics.Bitmap");
    }

    /* renamed from: t */
    private boolean m17373t() {
        boolean z;
        boolean z2;
        if (this.f22312o.mo28318b(C9119ed.class) != null) {
            z = ((Boolean) this.f22312o.mo28318b(C9119ed.class)).booleanValue();
        } else {
            z = false;
        }
        if (!z || DiggParamsSetting.INSTANCE.getValue().f19049a == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.f22300c.getRoomAuthStatus().isEnableDigg() || !z2 || !C11115u.m19743a().mo17915b().mo13165e()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: j */
    public final Bitmap mo15291j() {
        if (!this.f22310m.isEmpty()) {
            List<Bitmap> list = this.f22310m;
            Bitmap bitmap = list.get(this.f22295K.nextInt(list.size()));
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        }
        if (!this.f22316s.isEmpty()) {
            List<Bitmap> list2 = this.f22316s;
            Bitmap bitmap2 = list2.get(this.f22295K.nextInt(list2.size()));
            if (bitmap2 != null) {
                return bitmap2;
            }
        }
        return m17372s();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f22297M.removeMessages(1);
        this.f22301d.clear();
        this.f22309l.clear();
        for (Bitmap bitmap : this.f22310m) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this.f22310m.clear();
        for (int i = 0; i < this.f22294J.size(); i++) {
            Bitmap bitmap2 = this.f22294J.get(i);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
        }
        this.f22294J.clear();
        this.f22293I = null;
        for (AbstractC88412b bVar : this.f22313p.values()) {
            if (bVar != null && !bVar.isDisposed()) {
                bVar.dispose();
            }
        }
        this.f22298a.getLifecycle().mo4013b(this);
    }

    /* renamed from: com.bytedance.android.livesdk.like.LikeHelper$a */
    class C9164a implements AbstractC9170d {
        static {
            Covode.recordClassIndex(10070);
        }

        private C9164a() {
        }

        /* synthetic */ C9164a(LikeHelper likeHelper, byte b) {
            this();
        }

        @Override // com.bytedance.android.livesdk.like.AbstractC9170d
        /* renamed from: a */
        public final void mo10821a(AbstractC9168b bVar, int i) {
            int i2 = i % LikeHelper.this.f22304g;
            if (i2 != 0) {
                LikeHelper.this.mo15268a(i2);
                LikeHelper.this.mo15278b(i2);
            }
        }

        @Override // com.bytedance.android.livesdk.like.AbstractC9170d
        /* renamed from: a */
        public final void mo10822a(AbstractC9168b bVar, int i, int i2, float f, float f2, float f3, float f4) {
            if (i2 % LikeHelper.this.f22304g == 0) {
                LikeHelper likeHelper = LikeHelper.this;
                likeHelper.mo15268a(likeHelper.f22304g);
                LikeHelper likeHelper2 = LikeHelper.this;
                likeHelper2.mo15278b(likeHelper2.f22304g);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.LikeHelper$b */
    class C9165b extends GestureDetector.SimpleOnGestureListener {
        static {
            Covode.recordClassIndex(10071);
        }

        private C9165b() {
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (LikeHelper.this.mo15299q() || super.onDoubleTap(motionEvent)) {
                return true;
            }
            return false;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            LikeHelper likeHelper = LikeHelper.this;
            if (likeHelper.mo15275a(likeHelper.mo15264a(motionEvent), LikeHelper.this.mo15276b(motionEvent)) || super.onDown(motionEvent)) {
                return true;
            }
            return false;
        }

        /* synthetic */ C9165b(LikeHelper likeHelper, byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo15264a(MotionEvent motionEvent) {
        return motionEvent.getRawX();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo15276b(MotionEvent motionEvent) {
        return motionEvent.getRawY();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo15283c(String str) {
        this.f22313p.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo15285d(String str) {
        this.f22313p.remove(str);
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: b */
    public final void mo15279b(View view) {
        this.f22291G = view;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: b */
    public final void mo15280b(AbstractC9170d dVar) {
        this.f22301d.remove(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15268a(int i) {
        ((AbstractC11181z) ((LikeApi) C5805e.m12718a().mo11572a(LikeApi.class)).like(this.f22300c.getId(), (long) i).mo143274a(C11152e.m19790a(this.f22298a))).mo17950a(C9175i.f22349a, new C9176j(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo15281b(String str) {
        this.f22313p.remove(str);
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: a */
    public final void mo15270a(View view) {
        this.f22292H = view;
        this.f22322y = 0.0f;
        this.f22323z = 0.0f;
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: a */
    public final Bitmap mo15265a(List<ImageModel> list) {
        Bitmap bitmap = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ImageModel imageModel : list) {
                if (this.f22315r.containsKey(imageModel.mUri)) {
                    this.f22296L.add(this.f22315r.get(imageModel.mUri));
                } else {
                    arrayList.add(C7577g.m15569a(imageModel).mo143292d(new C9184r(imageModel)));
                }
            }
            if (!this.f22296L.isEmpty()) {
                List<Bitmap> list2 = this.f22296L;
                bitmap = list2.get(this.f22295K.nextInt(list2.size()));
                this.f22296L.clear();
            }
            if (!arrayList.isEmpty()) {
                String valueOf = String.valueOf(SystemClock.uptimeMillis());
                this.f22313p.put(valueOf, AbstractC88979t.m154313c(arrayList).mo143268a(C9185s.f22361a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new C9186t(this), new C9173g(this, valueOf), new C9174h(this, valueOf)));
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        return m17372s();
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: a */
    public final void mo15271a(AbstractC9170d dVar) {
        if (dVar != null && !this.f22301d.contains(dVar)) {
            this.f22301d.add(dVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15278b(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("live_source", this.f22307j);
        hashMap.put("request_id", this.f22300c.getRequestId());
        hashMap.put("log_pb", this.f22300c.getLog_pb());
        hashMap.put("like_amount", String.valueOf(i));
        hashMap.put("source", new StringBuilder().append(this.f22300c.getUserFrom()).toString());
        if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
            hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
        }
        String g = C6544e.m13993g();
        if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
            hashMap.put("is_subscribe", "0");
        } else {
            hashMap.put("is_subscribe", "1");
        }
        if (C3966y.m9670f()) {
            hashMap.put("room_orientation", "portrait");
        } else {
            hashMap.put("room_orientation", "landscape");
        }
        long j = 0;
        if (DataChannelGlobal.f42558d.mo28324b(C9009ac.class) != null) {
            j = ((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)).getOwnerUserId();
        }
        long j2 = C4384b.C4385a.m10496a().f11958f;
        if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isInCoHost()) {
            hashMap.put("connection_type", "anchor");
            hashMap.put("channel_id", String.valueOf(C4384b.C4385a.m10496a().f11957e));
            hashMap.put("invitee_list", ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getCurrentInviteeList());
            if (C4384b.C4385a.m10496a().f11969q) {
                hashMap.put("connection_inviter_id", String.valueOf(j));
                hashMap.put("connection_invitee_id", String.valueOf(j2));
            } else {
                hashMap.put("connection_invitee_id", String.valueOf(j));
                hashMap.put("connection_inviter_id", String.valueOf(j2));
            }
        }
        if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isRoomInBattle()) {
            hashMap.put("connection_type", "manual_pk");
            hashMap.put("pk_id", String.valueOf(C4384b.C4385a.m10496a().f11946ai));
            if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isBattleStarter()) {
                hashMap.put("pk_inviter_id", String.valueOf(j));
                hashMap.put("pk_invitee_id", String.valueOf(j2));
            } else {
                hashMap.put("pk_invitee_id", String.valueOf(j));
                hashMap.put("pk_inviter_id", String.valueOf(j2));
            }
        }
        if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isInMultiGuest()) {
            hashMap.put("connection_type", "audience");
        }
        hashMap.put("admin_type", C11209ac.m19866a(this.f22300c, this.f22312o));
        C6501b.C6502a.m13948a("like").mo12652a((Map<String, String>) hashMap).mo12654b("live_interact").mo12639a().mo12655b();
        if (C11199a.m19850a(this.f22312o)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("room_id", String.valueOf(this.f22300c.getId()));
            hashMap2.put("anchor_id", String.valueOf(this.f22300c.getOwnerUserId()));
            C11199a.m19849a("live_ad", "like", null, hashMap2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo15272a(String str) {
        this.f22313p.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo15273a(Throwable th) {
        ActivityC0945e eVar = this.f22299b;
        if (eVar == null || eVar.isFinishing()) {
            C11264f.m19957a(C3966y.m9669e(), th);
        } else {
            C11264f.m19957a(this.f22299b, th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo15267a(Room room, boolean z, boolean z2, boolean z3, DataChannel dataChannel, Room room2) {
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
            return C89391z.f203057a;
        }
        this.f22300c = room2;
        this.f22289E = m17373t();
        BarrageServiceImpl.addALogTrace(room, z, z2, z3, dataChannel, this);
        return C89391z.f203057a;
    }

    public LikeHelper(ActivityC0945e eVar, AbstractC1204m mVar, Room room, boolean z, boolean z2, boolean z3, DataChannel dataChannel) {
        long j;
        int i;
        int i2;
        boolean z4;
        int i3;
        long j2;
        String str;
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.f22311n = options;
        this.f22291G = null;
        this.f22292H = null;
        HashMap hashMap = new HashMap();
        this.f22313p = hashMap;
        this.f22294J = new SparseArray<>();
        this.f22295K = new Random();
        this.f22314q = new ArrayList();
        this.f22315r = new HashMap();
        this.f22316s = new ArrayList();
        this.f22296L = new ArrayList();
        this.f22297M = new Handler(new Handler.Callback() {
            /* class com.bytedance.android.livesdk.like.LikeHelper.C91631 */

            static {
                Covode.recordClassIndex(10069);
            }

            public final boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                LikeHelper.this.f22305h = false;
                LikeHelper likeHelper = LikeHelper.this;
                int i = likeHelper.f22303f;
                for (AbstractC9170d dVar : likeHelper.f22301d) {
                    dVar.mo10821a(likeHelper, i);
                }
                return true;
            }
        });
        this.f22308k = z;
        this.f22288D = z2;
        this.f22290F = z3;
        C7688h value = DiggParamsSetting.INSTANCE.getValue();
        if (value == null || value.f19050b <= 0) {
            j = 500;
        } else {
            j = value.f19050b;
        }
        this.f22318u = j;
        int i4 = 15;
        if (room != null && room.likeInfo != null && room.likeInfo.f23099a.intValue() > 0) {
            i = room.likeInfo.f23099a.intValue();
        } else if (value == null || value.f19052d <= 0) {
            i = 15;
        } else {
            i = value.f19052d;
        }
        this.f22304g = i;
        if (room != null && room.likeInfo != null && room.likeInfo.f23100b.intValue() > 0) {
            i2 = room.likeInfo.f23100b.intValue();
        } else if (value == null || value.f19054f <= 0) {
            i2 = 1;
        } else {
            i2 = value.f19054f;
        }
        this.f22319v = i2;
        if (value != null) {
            z4 = value.f19055g;
        } else {
            z4 = false;
        }
        this.f22321x = z4;
        if (value != null && value.f19052d > 0) {
            i4 = value.f19052d;
        }
        this.f22285A = i4;
        if (value == null || value.f19053e <= 0) {
            i3 = 80;
        } else {
            i3 = value.f19053e;
        }
        this.f22286B = i3;
        if (value == null || value.f19056h == 0) {
            j2 = 300;
        } else {
            j2 = value.f19056h;
        }
        this.f22320w = j2;
        this.f22299b = eVar;
        this.f22298a = mVar;
        mVar.getLifecycle().mo4012a(this);
        this.f22317t = new View$OnTouchListenerC9171e(new GestureDetector(eVar, new C9165b(this, (byte) 0)));
        ArrayList arrayList = new ArrayList();
        this.f22301d = arrayList;
        arrayList.add(new C9164a(this, (byte) 0));
        this.f22300c = room;
        if (C34822d.m71158a(eVar, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f22307j = str;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        this.f22312o = dataChannel;
        this.f22289E = m17373t();
        dataChannel.mo28310a(C9093de.class, (AbstractC89172b) new C9172f(this, room, z, z2, z3, dataChannel));
        String valueOf = String.valueOf(SystemClock.uptimeMillis());
        hashMap.put(valueOf, ((LikeApi) C5805e.m12718a().mo11572a(LikeApi.class)).getIcons(this.f22300c.getId(), this.f22300c.getOwnerUserId()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143267a(C9179m.f22353a, false).mo143268a(C9180n.f22354a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new C9181o(this), new C9182p(this, valueOf), new C9183q(this, valueOf)));
        m17371r();
    }
}

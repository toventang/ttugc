package com.bytedance.android.livesdk.like;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.C2997d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.utils.C11209ac;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

public class OptimizedLikeHelper extends LikeHelper implements AbstractC33974au {

    /* renamed from: t */
    public static final int f22330t = C3966y.m9653a(85.0f);

    /* renamed from: u */
    public static final int f22331u = C3966y.m9653a(32.0f);

    /* renamed from: v */
    public static final float f22332v = ((float) C3966y.m9653a(150.0f));

    /* renamed from: w */
    public static final float f22333w = ((float) C3966y.m9653a(50.0f));

    /* renamed from: x */
    public static final float f22334x = ((float) C3966y.m9653a(236.0f));

    /* renamed from: y */
    public static final float f22335y = ((float) C3966y.m9653a(55.0f));

    /* renamed from: z */
    private boolean f22336z;

    @Override // com.bytedance.android.livesdk.like.LikeHelper, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.like.LikeHelper, com.bytedance.android.livesdk.like.AbstractC9168b
    /* renamed from: p */
    public final boolean mo15298p() {
        return true;
    }

    static {
        Covode.recordClassIndex(10073);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.like.LikeHelper
    /* renamed from: a */
    public final float mo15264a(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.like.LikeHelper
    /* renamed from: b */
    public final float mo15276b(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo15304e(String str) {
        this.f22313p.remove(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.like.LikeHelper
    /* renamed from: a */
    public final void mo15268a(int i) {
        String valueOf = String.valueOf(SystemClock.uptimeMillis());
        this.f22313p.put(valueOf, ((LikeApi) C5805e.m12718a().mo11572a(LikeApi.class)).like(this.f22300c.getId(), (long) i).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9188v(this, valueOf), new C9189w(this, valueOf)));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.like.LikeHelper
    /* renamed from: b */
    public final void mo15278b(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("live_source", this.f22307j);
        hashMap.put("request_id", this.f22300c.getRequestId());
        hashMap.put("log_pb", this.f22300c.getLog_pb());
        hashMap.put("like_amount", String.valueOf(i));
        hashMap.put("source", new StringBuilder().append(this.f22300c.getUserFrom()).toString());
        String e = C7411d.m15284a().mo13614e();
        if (!C13627m.m24498a(e)) {
            hashMap.put("enter_live_method", e);
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
        C6501b.C6502a.m13948a("like").mo12652a((Map<String, String>) hashMap).mo12639a().mo12654b("live_interact").mo12655b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo15303a(String str, Throwable th) {
        if (this.f22299b == null || this.f22299b.isFinishing()) {
            C11264f.m19957a(C3966y.m9669e(), th);
        } else {
            C11264f.m19957a(this.f22299b, th);
        }
        this.f22313p.remove(str);
    }

    /* renamed from: a */
    public static Bitmap m17411a(Bitmap bitmap, int i) {
        MethodCollector.m26663i(7187);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Rect rect = new Rect(0, 0, i, i);
        RectF rectF = new RectF(rect);
        float f = (float) (i >> 1);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        paint.setColor(Color.parseColor("#ffffff"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) C3966y.m9653a(1.3f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        MethodCollector.m26664o(7187);
        return createBitmap;
    }

    public OptimizedLikeHelper(ActivityC0945e eVar, AbstractC1204m mVar, Room room, boolean z, boolean z2, boolean z3, DataChannel dataChannel) {
        super(eVar, mVar, room, z, z2, z3, dataChannel);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.like.LikeHelper
    /* renamed from: a */
    public final void mo15269a(int i, int i2, int i3, float f, float f2, float f3, float f4) {
        super.mo15269a(i, i2, i3, f, f2, f3, f4);
        if (!this.f22336z) {
            IMessageManager iMessageManager = (IMessageManager) this.f22312o.mo28318b(C9068cg.class);
            User a = C2997d.C2998a.m8305a();
            if (iMessageManager != null && a != null) {
                iMessageManager.insertMessage(C7302b.m15203a(this.f22300c.getId(), a), true);
                this.f22336z = true;
            }
        }
    }
}

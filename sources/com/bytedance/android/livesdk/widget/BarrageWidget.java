package com.bytedance.android.livesdk.widget;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.model.C7674c;
import com.bytedance.android.livesdk.chatroom.p477a.p478a.C7266a;
import com.bytedance.android.livesdk.chatroom.p477a.p479b.C7269a;
import com.bytedance.android.livesdk.chatroom.p477a.p480c.C7273a;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.model.AbsBarrageWidget;
import com.bytedance.android.livesdk.model.message.C9717ca;
import com.bytedance.android.livesdk.model.message.C9886p;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11209ac;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdk.utils.p654b.C11232c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a;
import com.p2082ss.ugc.live.barrage.p4468b.C87065b;
import com.p2082ss.ugc.live.barrage.p4468b.C87066c;
import com.p2082ss.ugc.live.barrage.view.BarrageLayout;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

public class BarrageWidget extends AbsBarrageWidget implements AbstractC8094bq, AbstractC33974au, OnMessageListener {

    /* renamed from: i */
    private static final TypedArray f27153i;

    /* renamed from: j */
    private static final Bitmap[] f27154j;

    /* renamed from: a */
    final List<Bitmap> f27155a = new ArrayList();

    /* renamed from: b */
    public AbstractC87059a f27156b;

    /* renamed from: c */
    public int f27157c = 0;

    /* renamed from: d */
    public boolean f27158d = false;

    /* renamed from: e */
    public String f27159e;

    /* renamed from: f */
    public Room f27160f;

    /* renamed from: g */
    boolean f27161g;

    /* renamed from: h */
    public String f27162h = null;

    /* renamed from: k */
    private final Random f27163k = new Random();

    /* renamed from: l */
    private final List<C9717ca> f27164l = new CopyOnWriteArrayList();

    /* renamed from: m */
    private IMessageManager f27165m;

    /* renamed from: n */
    private C7269a f27166n;

    /* renamed from: o */
    private BarrageLayout f27167o;

    /* renamed from: p */
    private BarrageLayout f27168p;

    /* renamed from: q */
    private Runnable f27169q = new Runnable() {
        /* class com.bytedance.android.livesdk.widget.BarrageWidget.RunnableC113421 */

        static {
            Covode.recordClassIndex(12984);
        }

        public final void run() {
            if (BarrageWidget.this.isViewValid()) {
                HashMap hashMap = new HashMap();
                hashMap.put("live_source", BarrageWidget.this.f27159e);
                hashMap.put("request_id", BarrageWidget.this.f27160f.getRequestId());
                hashMap.put("log_pb", BarrageWidget.this.f27160f.getLog_pb());
                hashMap.put("like_amount", String.valueOf(BarrageWidget.this.f27157c));
                hashMap.put("source", new StringBuilder().append(BarrageWidget.this.f27160f.getUserFrom()).toString());
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
                hashMap.put("admin_type", C11209ac.m19866a(BarrageWidget.this.f27160f, BarrageWidget.this.dataChannel));
                C6501b.C6502a.m13948a("like").mo12652a((Map<String, String>) hashMap).mo12654b("live_interact").mo12643a(BarrageWidget.this.dataChannel).mo12655b();
                if (BarrageWidget.this.f27160f != null && !BarrageWidget.this.f27160f.isOfficial()) {
                    C7307f.f18161a.mo11557a(BarrageWidget.this.f27160f.getId(), BarrageWidget.this.f27157c, BarrageWidget.this.f27160f.getLabels(), BarrageWidget.this.f27162h);
                }
                BarrageWidget.this.f27162h = null;
                BarrageWidget.this.f27157c = 0;
                BarrageWidget.this.f27158d = false;
            }
        }
    };

    interface BarrageResourceApi {
        static {
            Covode.recordClassIndex(12987);
        }

        @AbstractC22000h(mo35789a = "/webcast/room/digg/icon/list/")
        AbstractC88979t<C5832d<C7674c>> fetchResource(@AbstractC22018z(mo35807a = "room_id") long j);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bai;
    }

    @Override // com.bytedance.android.livesdk.model.AbsBarrageWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    /* renamed from: com.bytedance.android.livesdk.widget.BarrageWidget$3 */
    static /* synthetic */ class C113443 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27172a;

        static {
            Covode.recordClassIndex(12986);
            int[] iArr = new int[EnumC9596a.values().length];
            f27172a = iArr;
            try {
                iArr[EnumC9596a.DIGG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(12983);
        TypedArray obtainTypedArray = C3966y.m9655a().obtainTypedArray(R.array.av);
        f27153i = obtainTypedArray;
        f27154j = new Bitmap[obtainTypedArray.length()];
    }

    /* renamed from: a */
    public final void mo18150a() {
        AbstractC87059a aVar;
        int i;
        MethodCollector.m26663i(5817);
        if (!isViewValid() || this.f27168p == null || (aVar = this.f27156b) == null || aVar.mo13473b() >= 10 || this.f27164l.isEmpty()) {
            MethodCollector.m26664o(5817);
            return;
        }
        C9717ca remove = this.f27164l.remove(0);
        boolean a = C6229a.m13521a(this.context);
        LayoutInflater from = LayoutInflater.from(this.context);
        if (a) {
            i = R.layout.bah;
        } else {
            i = R.layout.bag;
        }
        this.f27156b.mo140680a(new C7273a(from.inflate(i, (ViewGroup) null), remove).f18095b, remove.mo16596c());
        MethodCollector.m26664o(5817);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IMessageManager iMessageManager = this.f27165m;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        BarrageLayout barrageLayout = this.f27168p;
        if (barrageLayout != null) {
            barrageLayout.mo140687a();
        }
        if (this.f27168p != null) {
            this.f27167o.mo140687a();
        }
        this.f27157c = 0;
        this.f27158d = false;
        this.f27164l.clear();
        this.f27161g = false;
        for (Bitmap bitmap : this.f27155a) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this.f27155a.clear();
        Bitmap[] bitmapArr = f27154j;
        for (Bitmap bitmap2 : bitmapArr) {
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        C3854a.m9453a(3, getClass().getName(), th.toString());
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        this.f27160f = (Room) this.dataChannel.mo28318b(C9093de.class);
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.mo28318b(C9068cg.class);
        this.f27165m = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.DIGG.getIntType(), this);
            this.f27165m.addMessageListener(EnumC9596a.SCREEN.getIntType(), this);
        }
        ((C11231b) ((BarrageResourceApi) C5805e.m12718a().mo11572a(BarrageResourceApi.class)).fetchResource(this.f27160f.getId()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143274a(new C11232c())).mo17979a(2).mo143271a(getAutoUnbindTransformer()).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C11378b(this), C11421c.f27384a);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        String str;
        int i = 0;
        if (C34822d.m71158a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f27159e = str;
        this.f27168p = (BarrageLayout) findViewById(R.id.qq);
        if (C6229a.m13521a(this.context)) {
            this.f27156b = new C87065b(this.f27168p, C3966y.m9667d(R.dimen.wt));
        } else {
            this.f27156b = new C87066c(this.f27168p, C3966y.m9667d(R.dimen.wt));
        }
        AbstractC87059a aVar = this.f27156b;
        C113432 r1 = new AbstractC87059a.AbstractC87061a() {
            /* class com.bytedance.android.livesdk.widget.BarrageWidget.C113432 */

            static {
                Covode.recordClassIndex(12985);
            }

            @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a.AbstractC87061a
            /* renamed from: a */
            public final void mo18152a() {
                if (BarrageWidget.this.f27156b.mo13473b() == 1) {
                    LivePerformanceManager.getInstance().onModuleStart("barrage", null);
                }
                LivePerformanceManager.getInstance().monitorPerformance("show_barrage");
            }

            @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a.AbstractC87061a
            /* renamed from: b */
            public final void mo18153b() {
                if (BarrageWidget.this.f27156b.mo13473b() == 0) {
                    LivePerformanceManager.getInstance().onModuleStop("barrage");
                }
                BarrageWidget.this.mo18150a();
            }
        };
        C89219l.m154719c(r1, "");
        aVar.f196278g = r1;
        BarrageLayout.m150805a(this.f27168p, this.f27156b);
        this.f27167o = (BarrageLayout) findViewById(R.id.alc);
        C7269a aVar2 = new C7269a(this.f27167o, 1400);
        this.f27166n = aVar2;
        BarrageLayout.m150805a(this.f27167o, aVar2);
        do {
            Path path = new Path();
            path.moveTo((float) C3966y.m9653a(94.0f), (float) C3966y.m9653a(150.0f));
            float f = (float) (((i - 5) * 8) + 94);
            path.quadTo((float) C3966y.m9653a(f), (float) C3966y.m9653a(150.0f), (float) C3966y.m9653a(f), (float) C3966y.m9653a(40.0f));
            this.f27166n.mo13470a(path);
            i++;
        } while (i < 10);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        Bitmap bitmap;
        MethodCollector.m26663i(5681);
        if (!isViewValid()) {
            MethodCollector.m26664o(5681);
        } else if (iMessage instanceof C9886p) {
            C9886p pVar = (C9886p) iMessage;
            AbstractC2994b a = C11115u.m19743a().mo17915b().mo13147a();
            if (pVar.f23894h == null || a == null || a.getId() != pVar.f23894h.getId()) {
                if (C113443.f27172a[pVar.f28131L.ordinal()] == 1) {
                    if (C6894d.m14753a().f17248n.booleanValue() || !isViewValid()) {
                        MethodCollector.m26664o(5681);
                        return;
                    } else if (this.f27166n.mo13473b() < 24) {
                        if (!this.f27161g || C13617h.m24465a(this.f27155a)) {
                            TypedArray typedArray = f27153i;
                            if (typedArray.length() > 0) {
                                int nextInt = this.f27163k.nextInt(typedArray.length());
                                Bitmap[] bitmapArr = f27154j;
                                if (bitmapArr[nextInt] == null || bitmapArr[nextInt].isRecycled()) {
                                    bitmapArr[nextInt] = BitmapFactory.decodeResource(this.context.getResources(), typedArray.getResourceId(nextInt, 0));
                                }
                                bitmap = bitmapArr[nextInt];
                            }
                        } else {
                            bitmap = this.f27155a.get(this.f27163k.nextInt(this.f27155a.size()));
                        }
                        if (bitmap != null && !bitmap.isRecycled()) {
                            this.f27166n.mo140680a((AbstractC87048a) new C7266a(bitmap, this.f27163k.nextDouble()), false);
                        }
                    }
                }
                MethodCollector.m26664o(5681);
                return;
            }
            MethodCollector.m26664o(5681);
        } else {
            if (iMessage instanceof C9717ca) {
                C9717ca caVar = (C9717ca) iMessage;
                if (this.f27164l.size() >= 200) {
                    Iterator<C9717ca> it = this.f27164l.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C9717ca next = it.next();
                        if (!next.mo16596c()) {
                            this.f27164l.remove(next);
                            break;
                        }
                    }
                }
                if (this.f27164l.size() >= 200) {
                    List<C9717ca> list = this.f27164l;
                    list.remove(list.size() - 1);
                }
                if (caVar.mo16596c()) {
                    this.f27164l.add(0, caVar);
                } else {
                    this.f27164l.add(caVar);
                }
                mo18150a();
            }
            MethodCollector.m26664o(5681);
        }
    }
}

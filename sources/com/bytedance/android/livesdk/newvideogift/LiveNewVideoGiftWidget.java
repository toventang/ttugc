package com.bytedance.android.livesdk.newvideogift;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.p196e.C3227a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p219a.C3889a;
import com.bytedance.android.livesdk.C6901bb;
import com.bytedance.android.livesdk.C6902bc;
import com.bytedance.android.livesdk.chatroom.p481b.EnumC7303c;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.gift.assets.AbstractC8785b;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.manage.C9462a;
import com.bytedance.android.livesdk.model.message.C9888r;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.newvideogift.p595a.C9950b;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.performance.C10085b;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.service.p625c.p628c.C10731d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11631c;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11632d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class LiveNewVideoGiftWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    AbstractC8785b f24079a;

    /* renamed from: b */
    public AbstractC9946a f24080b;

    /* renamed from: c */
    public Room f24081c;

    /* renamed from: d */
    public VideoGiftView f24082d;

    /* renamed from: e */
    public C9888r f24083e;

    /* renamed from: f */
    public C9947b f24084f;

    /* renamed from: g */
    public boolean f24085g;

    /* renamed from: h */
    private AbstractC11631c f24086h = new AbstractC11631c() {
        /* class com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget.C99452 */

        static {
            Covode.recordClassIndex(11496);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11631c
        /* renamed from: b */
        public final void mo16652b() {
            C10085b value;
            m18263a(false, true);
            if (LiveNewVideoGiftWidget.this.f24080b != null) {
                LiveNewVideoGiftWidget.this.f24080b.mo16653b();
            }
            C10731d.C10732a.C10733a.f25859a.f25855e.mo142944a();
            C3227a.f9267a.remove("video_gift_id");
            AbstractC89244h<C10085b> hVar = C10095g.f24528b.get("gift_play");
            if (hVar != null && (value = hVar.getValue()) != null) {
                value.mo16951b();
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11631c
        /* renamed from: a */
        public final void mo16650a() {
            C10085b value;
            C10085b value2;
            long j;
            long j2;
            long j3;
            long j4;
            if (LiveNewVideoGiftWidget.this.f24082d != null) {
                if (LiveNewVideoGiftWidget.this.dataChannel != null) {
                    LiveNewVideoGiftWidget.this.dataChannel.mo28320c(C6902bc.class, false);
                }
                LiveNewVideoGiftWidget.this.f24082d.setVisibility(0);
                LiveNewVideoGiftWidget.this.f24082d.mo16654a();
                m18263a(true, false);
                C9947b bVar = LiveNewVideoGiftWidget.this.f24084f;
                Room room = LiveNewVideoGiftWidget.this.f24081c;
                long j5 = 0;
                if (((Boolean) LiveNewVideoGiftWidget.this.dataChannel.mo28318b(C9119ed.class)).booleanValue()) {
                    C6497a b = C3051c.C3052a.m8359a("ttlive_broadcast_action_all").mo12637b("action", "play_gift");
                    if (bVar.f24092a != null) {
                        j = bVar.f24092a.getId();
                    } else {
                        j = 0;
                    }
                    C6497a b2 = b.mo12636b("action_id", Long.valueOf(j));
                    if (room != null) {
                        j2 = room.getOwnerUserId();
                    } else {
                        j2 = 0;
                    }
                    C6497a b3 = b2.mo12636b("user_id", Long.valueOf(j2));
                    if (room != null) {
                        j3 = room.getId();
                    } else {
                        j3 = 0;
                    }
                    b3.mo12636b("room_id", Long.valueOf(j3)).mo12632a();
                    if (bVar.f24092a != null) {
                        j4 = bVar.f24092a.getId();
                    } else {
                        j4 = 0;
                    }
                    C3227a.f9267a.put("video_gift_id", String.valueOf(j4));
                }
                C9947b bVar2 = LiveNewVideoGiftWidget.this.f24084f;
                if (bVar2.f24092a != null) {
                    j5 = bVar2.f24092a.getId();
                }
                AbstractC89244h<C10085b> hVar = C10095g.f24528b.get("gift_play");
                if (!(hVar == null || (value2 = hVar.getValue()) == null)) {
                    value2.f24499e = j5;
                }
                AbstractC89244h<C10085b> hVar2 = C10095g.f24528b.get("gift_play");
                if (hVar2 != null && (value = hVar2.getValue()) != null) {
                    value.mo16948a();
                }
            }
        }

        /* renamed from: a */
        private void m18263a(boolean z, boolean z2) {
            if (LiveNewVideoGiftWidget.this.f24083e != null && LiveNewVideoGiftWidget.this.f24083e.f23905g != null && LiveNewVideoGiftWidget.this.f24083e.f23905g.getId() == C11115u.m19743a().mo17915b().mo13161c()) {
                EnumC7303c.INSTANCE.setBigGiftPlayStateEvent(z, z2, LiveNewVideoGiftWidget.this.f24083e);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11631c
        /* renamed from: a */
        public final void mo16651a(float f, float f2, float f3, float f4) {
            if (LiveNewVideoGiftWidget.this.f24082d != null) {
                VideoGiftView videoGiftView = LiveNewVideoGiftWidget.this.f24082d;
                if (videoGiftView.f24097e != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) videoGiftView.f24094b.getLayoutParams();
                    layoutParams.width = (int) ((((float) videoGiftView.f24097e.f23706h) / 10000.0f) * f);
                    layoutParams.height = (int) ((((float) videoGiftView.f24097e.f23707i) / 10000.0f) * f2);
                    videoGiftView.f24094b.setLayoutParams(layoutParams);
                    videoGiftView.f24094b.setX(((((float) videoGiftView.f24097e.f23704f) / 10000.0f) * f) + f3);
                    videoGiftView.f24094b.setY(((((float) videoGiftView.f24097e.f23705g) / 10000.0f) * f2) + f4);
                    videoGiftView.f24095c.setTextSize(0, C13628n.m24520b(videoGiftView.getContext(), (float) (videoGiftView.f24097e.f23700b / 100)));
                    if (!C13627m.m24498a(videoGiftView.f24097e.f23711m)) {
                        try {
                            videoGiftView.f24095c.setShadowLayer((float) C3966y.m9653a((float) (videoGiftView.f24097e.f23710l / 100)), (float) C3966y.m9653a((float) (videoGiftView.f24097e.f23708j / 100)), (float) C3966y.m9653a((float) (videoGiftView.f24097e.f23709k / 100)), Color.parseColor(videoGiftView.f24097e.f23711m));
                        } catch (IllegalArgumentException unused) {
                            C3854a.m9459b("parseColor failure. colorStr: " + videoGiftView.f24097e.f23711m);
                        }
                    }
                    C9698b bVar = videoGiftView.f24097e.f23699a;
                    if (bVar == null) {
                        C3854a.m9459b("displayText is null!");
                    } else {
                        videoGiftView.f24095c.setText(C7557c.m15540a(bVar.f23646b, bVar, null));
                    }
                    if (videoGiftView.f24097e.f23701c == null) {
                        videoGiftView.f24096d.setVisibility(8);
                        return;
                    }
                    C3889a a = C3889a.m9507a(videoGiftView.getContext());
                    a.f10755d = videoGiftView.f24097e.f23701c;
                    a.mo9249a(ImageView.ScaleType.FIT_XY).mo9252a(videoGiftView.f24096d);
                    videoGiftView.f24096d.setVisibility(0);
                }
            }
        }
    };

    /* renamed from: i */
    private C9950b.AbstractC9952a f24087i = C9948a.f24102a;

    /* renamed from: j */
    private AbstractC11632d f24088j = new C9972b(this);

    /* renamed from: com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget$a */
    public interface AbstractC9946a {
        static {
            Covode.recordClassIndex(11497);
        }

        /* renamed from: b */
        void mo16653b();
    }

    /* renamed from: com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget$b */
    public static class C9947b {

        /* renamed from: a */
        AssetsModel f24092a;

        static {
            Covode.recordClassIndex(11498);
        }
    }

    static {
        Covode.recordClassIndex(11494);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bev;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: a */
    public final void mo16649a() {
        VideoGiftView videoGiftView = this.f24082d;
        if (videoGiftView != null) {
            videoGiftView.mo16656b();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f24081c = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f24084f = new C9947b();
        this.dataChannel.mo28309a((AbstractC1204m) this, C6901bb.class, (AbstractC89172b) new C9973c(this));
        this.f24085g = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f24082d = (VideoGiftView) this.contentView;
        this.f24082d.setPortrait(((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue());
        VideoGiftView videoGiftView = this.f24082d;
        Context context = this.context;
        AbstractC11631c cVar = this.f24086h;
        C9950b.AbstractC9952a aVar = this.f24087i;
        AbstractC11632d dVar = this.f24088j;
        int i = Build.VERSION.SDK_INT;
        videoGiftView.f24093a.setLayoutDirection(0);
        videoGiftView.f24098f = new C9950b(context, videoGiftView.f24093a, cVar, aVar, dVar);
        this.f24079a = C9462a.C9465b.f23010a;
    }
}

package com.bytedance.android.livesdk.like.widget;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.message.C9605ai;
import com.bytedance.android.livesdk.model.message.C9690bv;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

public final class OthersLikeViewOptimizedWidget extends LiveRecyclableWidget implements Handler.Callback, AbstractC33974au, OnMessageListener {

    /* renamed from: a */
    public static final C9194a f22392a = new C9194a((byte) 0);

    /* renamed from: b */
    private BottomLikeOptimizedView f22393b;

    /* renamed from: c */
    private long f22394c;

    /* renamed from: d */
    private boolean f22395d;

    /* renamed from: e */
    private IMessageManager f22396e;

    /* renamed from: f */
    private boolean f22397f;

    /* renamed from: g */
    private AbstractC9168b f22398g;

    /* renamed from: h */
    private int f22399h = 1;

    /* renamed from: i */
    private long f22400i = 300;

    /* renamed from: j */
    private final Handler f22401j = new Handler(Looper.getMainLooper(), this);

    /* renamed from: k */
    private final LinkedList<Bitmap> f22402k = new LinkedList<>();

    /* renamed from: l */
    private int f22403l;

    static {
        Covode.recordClassIndex(10102);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bay;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeViewOptimizedWidget$a */
    public static final class C9194a {
        static {
            Covode.recordClassIndex(10103);
        }

        private C9194a() {
        }

        public /* synthetic */ C9194a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final void m17457b() {
        if (!this.f22402k.isEmpty()) {
            this.f22401j.sendEmptyMessageDelayed(1, this.f22400i);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        BottomLikeOptimizedView bottomLikeOptimizedView = this.f22393b;
        if (bottomLikeOptimizedView == null) {
            C89219l.m154710a("bottomLikeView");
        }
        bottomLikeOptimizedView.mo15328a();
        IMessageManager iMessageManager = this.f22396e;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f22401j.removeCallbacksAndMessages(null);
        m17455a();
        this.f22402k.clear();
    }

    /* renamed from: a */
    private final void m17455a() {
        Long l;
        Long l2;
        String str;
        AbstractC2994b a;
        C9542az userAttr;
        if (this.f22403l > 0) {
            C6501b a2 = C6501b.C6502a.m13948a("livesdk_like_special_effect_show").mo12643a(this.dataChannel);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            Room room = (Room) this.dataChannel.mo28318b(C9093de.class);
            Boolean bool = null;
            if (b != null) {
                l = Long.valueOf(b.mo13161c());
            } else {
                l = null;
            }
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            if (C89219l.m154714a(l, l2)) {
                str = "anchor";
            } else {
                if (!(b == null || (a = b.mo13147a()) == null || (userAttr = a.getUserAttr()) == null)) {
                    bool = Boolean.valueOf(userAttr.f23192b);
                }
                if (C11279p.m20012a(bool)) {
                    str = "admin";
                } else {
                    str = "user";
                }
            }
            a2.mo12651a("admin_type", str);
            a2.mo12645a("special_effect_amount", this.f22403l);
            a2.mo12651a("action_type", C6544e.m13991e());
            a2.mo12655b();
            this.f22403l = 0;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.cxy);
        C89219l.m154716b(findViewById, "");
        this.f22393b = (BottomLikeOptimizedView) findViewById;
    }

    /* renamed from: a */
    private final void m17456a(Bitmap bitmap) {
        if (bitmap != null) {
            int a = C3966y.m9653a((float) (AbstractC89255c.Default.nextInt(1, 16) * 2));
            BottomLikeOptimizedView bottomLikeOptimizedView = this.f22393b;
            if (bottomLikeOptimizedView == null) {
                C89219l.m154710a("bottomLikeView");
            }
            float f = (float) a;
            bottomLikeOptimizedView.mo15329a(bitmap, OptimizedLikeHelper.f22333w - ((float) (OptimizedLikeHelper.f22331u / 2)), OptimizedLikeHelper.f22334x, OptimizedLikeHelper.f22333w - f, OptimizedLikeHelper.f22335y, OptimizedLikeHelper.f22333w - f, OptimizedLikeHelper.f22332v - ((float) (OptimizedLikeHelper.f22331u / 2)));
        }
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154721d(message, "");
        if (message.what == 1) {
            m17456a(this.f22402k.poll());
            m17457b();
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            m17455a();
            this.f22401j.sendEmptyMessageDelayed(2, 60000);
            return false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        long j;
        IMessageManager iMessageManager;
        int i;
        long j2;
        IMessageManager iMessageManager2;
        Boolean bool;
        Room room;
        boolean z = false;
        this.f22397f = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
            j = 0;
        } else {
            j = room.getId();
        }
        this.f22394c = j;
        DataChannel dataChannel2 = this.dataChannel;
        if (!(dataChannel2 == null || (bool = (Boolean) dataChannel2.mo28318b(C9119ed.class)) == null)) {
            z = bool.booleanValue();
        }
        this.f22395d = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            iMessageManager = (IMessageManager) dataChannel3.mo28318b(C9068cg.class);
        } else {
            iMessageManager = null;
        }
        this.f22396e = iMessageManager;
        AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(this.f22394c);
        this.f22398g = likeHelper;
        if (!(likeHelper == null || !likeHelper.mo15295n() || (iMessageManager2 = this.f22396e) == null)) {
            iMessageManager2.addMessageListener(EnumC9596a.LIKE.getIntType(), this);
        }
        AbstractC9168b bVar = this.f22398g;
        if (bVar != null) {
            i = bVar.mo15286e();
        } else {
            i = 1;
        }
        this.f22399h = i;
        AbstractC9168b bVar2 = this.f22398g;
        if (bVar2 != null) {
            j2 = bVar2.mo15287f();
        } else {
            j2 = 300;
        }
        this.f22400i = j2;
        this.f22401j.sendEmptyMessageDelayed(2, 60000);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Bitmap bitmap;
        if ((iMessage instanceof C9605ai) && this.isViewValid) {
            if (this.f22395d && !this.f22397f) {
                this.f22397f = true;
                C9690bv a = C7302b.m15204a(this.f22394c, this.context.getString(R.string.e4t));
                IMessageManager iMessageManager = this.f22396e;
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(a, true);
                }
            }
            C9605ai aiVar = (C9605ai) iMessage;
            User user = aiVar.f23316h;
            if (user != null) {
                long id = user.getId();
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                if (id == b.mo13161c()) {
                    return;
                }
            }
            this.f22403l += this.f22399h;
            List<ImageModel> list = aiVar.f23318j;
            AbstractC9168b bVar = this.f22398g;
            if (bVar != null) {
                bitmap = bVar.mo15265a(list);
            } else {
                bitmap = null;
            }
            int i = 0;
            if (this.f22400i < 0) {
                int i2 = this.f22399h;
                while (i < i2) {
                    m17456a(bitmap);
                    i++;
                }
                return;
            }
            int i3 = this.f22399h;
            while (i < i3) {
                this.f22402k.offer(bitmap);
                i++;
            }
            if (!this.f22401j.hasMessages(1)) {
                m17457b();
            }
        }
    }
}

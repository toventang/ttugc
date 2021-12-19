package com.bytedance.android.livesdk.like.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.C2997d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.AbstractC9170d;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.anim.BottomLikeView;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.message.C9605ai;
import com.bytedance.android.livesdk.model.message.C9690bv;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

public final class OthersLikeWidget extends LiveRecyclableWidget implements Handler.Callback, AbstractC9170d, AbstractC33974au, OnMessageListener {

    /* renamed from: c */
    public static final int f22404c = C3966y.m9653a(32.0f);

    /* renamed from: d */
    public static final C9195a f22405d = new C9195a((byte) 0);

    /* renamed from: a */
    public BottomLikeView f22406a;

    /* renamed from: b */
    public User f22407b;

    /* renamed from: e */
    private final AbstractC89244h f22408e = C11831d.m20835a(new C9205d(this));

    /* renamed from: f */
    private int f22409f;

    /* renamed from: g */
    private long f22410g;

    /* renamed from: h */
    private Room f22411h;

    /* renamed from: i */
    private boolean f22412i;

    /* renamed from: j */
    private boolean f22413j;

    /* renamed from: k */
    private IMessageManager f22414k;

    /* renamed from: l */
    private boolean f22415l;

    /* renamed from: m */
    private boolean f22416m;

    /* renamed from: n */
    private int f22417n = 1;

    /* renamed from: o */
    private long f22418o = 300;

    /* renamed from: p */
    private final Handler f22419p = new Handler(Looper.getMainLooper(), this);

    /* renamed from: q */
    private final LinkedList<Bitmap> f22420q = new LinkedList<>();

    /* renamed from: r */
    private AbstractC9168b f22421r;

    /* renamed from: s */
    private int f22422s;

    /* renamed from: a */
    private final C9197c m17458a() {
        return (C9197c) this.f22408e.getValue();
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10821a(AbstractC9168b bVar, int i) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bax;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$a */
    public static final class C9195a {
        static {
            Covode.recordClassIndex(10105);
        }

        private C9195a() {
        }

        public /* synthetic */ C9195a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Bitmap m17465a(Bitmap bitmap, int i) {
            MethodCollector.m26663i(5597);
            C89219l.m154721d(bitmap, "");
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Rect rect = new Rect(0, 0, i, i);
            RectF rectF = new RectF(rect);
            float f = (float) (i / 2);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            paint.setColor(Color.parseColor("#ffffff"));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) C3966y.m9653a(1.3f));
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
            C89219l.m154716b(createBitmap, "");
            MethodCollector.m26664o(5597);
            return createBitmap;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$d */
    static final class C9205d extends AbstractC89220m implements AbstractC89171a<C9197c> {

        /* renamed from: a */
        final /* synthetic */ OthersLikeWidget f22433a;

        static {
            Covode.recordClassIndex(10115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9205d(OthersLikeWidget othersLikeWidget) {
            super(0);
            this.f22433a = othersLikeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C9197c invoke() {
            return new C9197c();
        }
    }

    static {
        Covode.recordClassIndex(10104);
    }

    /* renamed from: c */
    private final void m17462c() {
        if (!this.f22420q.isEmpty()) {
            this.f22419p.sendEmptyMessageDelayed(1, this.f22418o);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        m17459a(OthersLikeWidget.this).mo15344a();
        IMessageManager iMessageManager = this.f22414k;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        AbstractC9168b bVar = this.f22421r;
        if (bVar != null && bVar.mo15295n() && bVar.mo15293l()) {
            bVar.mo15280b(this);
        }
        this.f22419p.removeCallbacksAndMessages(null);
        m17461b();
        m17458a();
    }

    /* renamed from: b */
    private final void m17461b() {
        Long l;
        Long l2;
        String str;
        AbstractC2994b a;
        C9542az userAttr;
        if (this.f22422s > 0) {
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
            a2.mo12645a("special_effect_amount", this.f22422s);
            a2.mo12651a("action_type", C6544e.m13991e());
            a2.mo12655b();
            this.f22422s = 0;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$b */
    abstract class AbstractC9196b {
        static {
            Covode.recordClassIndex(10106);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public AbstractC9196b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$c */
    public final class C9197c extends AbstractC9196b {

        /* renamed from: b */
        public Bitmap f22424b;

        /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$c$c */
        static final class C9200c<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C9200c f22428a = new C9200c();

            static {
                Covode.recordClassIndex(10110);
            }

            C9200c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$c$g */
        static final class C9204g<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C9204g f22432a = new C9204g();

            static {
                Covode.recordClassIndex(10114);
            }

            C9204g() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(10107);
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$c$a */
        static final class C9198a<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C9198a f22426a = new C9198a();

            static {
                Covode.recordClassIndex(10108);
            }

            C9198a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                C89219l.m154721d(bitmap, "");
                return C9195a.m17465a(bitmap, OthersLikeWidget.f22404c);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$c$b */
        static final class C9199b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C9197c f22427a;

            static {
                Covode.recordClassIndex(10109);
            }

            C9199b(C9197c cVar) {
                this.f22427a = cVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    this.f22427a.f22424b = bitmap;
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$c$d */
        static final class C9201d<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C9201d f22429a = new C9201d();

            static {
                Covode.recordClassIndex(10111);
            }

            C9201d() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                AbstractC2994b bVar = (AbstractC2994b) obj;
                C89219l.m154721d(bVar, "");
                return C7577g.m15569a(bVar.getAvatarThumb());
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$c$e */
        static final class C9202e<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C9202e f22430a = new C9202e();

            static {
                Covode.recordClassIndex(10112);
            }

            C9202e() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                C89219l.m154721d(bitmap, "");
                return C9195a.m17465a(bitmap, OthersLikeWidget.f22404c);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.OthersLikeWidget$c$f */
        static final class C9203f<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C9197c f22431a;

            static {
                Covode.recordClassIndex(10113);
            }

            C9203f(C9197c cVar) {
                this.f22431a = cVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    this.f22431a.f22424b = bitmap;
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9197c() {
            super();
            MethodCollector.m26663i(6305);
            Context context = OthersLikeWidget.this.context;
            C89219l.m154716b(context, "");
            this.f22424b = OptimizedLikeHelper.m17411a(BitmapFactory.decodeResource(context.getResources(), 2131234441), OptimizedLikeHelper.f22331u);
            MethodCollector.m26664o(6305);
        }

        /* renamed from: a */
        public final void mo15316a(Bitmap bitmap) {
            int i;
            C89219l.m154721d(bitmap, "");
            Bitmap bitmap2 = this.f22424b;
            int nextInt = AbstractC89255c.Default.nextInt(1, 16) * 2;
            BottomLikeView a = OthersLikeWidget.m17459a(OthersLikeWidget.this);
            float a2 = (float) C3966y.m9653a(50.0f);
            int i2 = 0;
            if (bitmap2 != null) {
                i = bitmap2.getWidth();
            } else {
                i = 0;
            }
            PointF pointF = new PointF(a2 - ((float) (i / 2)), (float) C3966y.m9653a(236.0f));
            float f = 50.0f - ((float) nextInt);
            float a3 = (float) C3966y.m9653a(f);
            float a4 = (float) C3966y.m9653a(150.0f);
            if (bitmap2 != null) {
                i2 = bitmap2.getHeight();
            }
            a.mo15345a(bitmap2, bitmap, pointF, new PointF(a3, a4 - ((float) (i2 / 2))), new PointF((float) C3966y.m9653a(f), (float) C3966y.m9653a(55.0f)));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ BottomLikeView m17459a(OthersLikeWidget othersLikeWidget) {
        BottomLikeView bottomLikeView = othersLikeWidget.f22406a;
        if (bottomLikeView == null) {
            C89219l.m154710a("bottomLikeView");
        }
        return bottomLikeView;
    }

    /* renamed from: a */
    private final void m17460a(Bitmap bitmap) {
        if (bitmap != null) {
            m17458a().mo15316a(bitmap);
        }
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154721d(message, "");
        if (message.what == 1) {
            m17460a(this.f22420q.poll());
            m17462c();
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            m17461b();
            this.f22419p.sendEmptyMessageDelayed(2, 60000);
            return false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        AbstractC88979t<Bitmap> a;
        AbstractC88979t<R> d;
        AbstractC88979t<R> b;
        AbstractC88979t<R> a2;
        AbstractC11181z zVar;
        View findViewById = findViewById(R.id.dv1);
        C89219l.m154716b(findViewById, "");
        this.f22406a = (BottomLikeView) findViewById;
        C9197c a3 = m17458a();
        AbstractC6872f b2 = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b2, "");
        AbstractC2994b a4 = b2.mo13147a();
        C89219l.m154716b(a4, "");
        ImageModel avatarThumb = a4.getAvatarThumb();
        if (avatarThumb != null && (a = C7577g.m15569a(avatarThumb)) != null && (d = a.mo143292d(C9197c.C9198a.f22426a)) != null && (b = d.mo143278b(C88925a.m154180b(C88946a.f201991c))) != null && (a2 = b.mo143261a(C88391a.m153580a(C88392a.f200660a))) != null && (zVar = (AbstractC11181z) a2.mo143274a(WidgetExtendsKt.autoDispose(OthersLikeWidget.this))) != null) {
            zVar.mo17950a(new C9197c.C9199b(a3), C9197c.C9200c.f22428a);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Bitmap bitmap;
        if ((iMessage instanceof C9605ai) && this.isViewValid) {
            if (this.f22413j && !this.f22416m) {
                this.f22416m = true;
                C9690bv a = C7302b.m15204a(this.f22410g, this.context.getString(R.string.e4t));
                IMessageManager iMessageManager = this.f22414k;
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
            this.f22422s += this.f22417n;
            List<ImageModel> list = aiVar.f23318j;
            AbstractC9168b bVar = this.f22421r;
            if (bVar != null) {
                bitmap = bVar.mo15265a(list);
            } else {
                bitmap = null;
            }
            int i = 0;
            if (this.f22418o < 0) {
                int i2 = this.f22417n;
                while (i < i2) {
                    m17460a(bitmap);
                    i++;
                }
                return;
            }
            int i3 = this.f22417n;
            while (i < i3) {
                this.f22420q.offer(bitmap);
                i++;
            }
            if (!this.f22419p.hasMessages(1)) {
                m17462c();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        boolean z2;
        long j;
        long j2;
        Boolean bool;
        Boolean bool2;
        this.f22415l = false;
        this.f22416m = false;
        this.f22409f = 0;
        DataChannel dataChannel = this.dataChannel;
        IMessageManager iMessageManager = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f22411h = room;
        DataChannel dataChannel2 = this.dataChannel;
        int i = 1;
        if (dataChannel2 == null || (bool2 = (Boolean) dataChannel2.mo28318b(C9076co.class)) == null) {
            z = true;
        } else {
            z = bool2.booleanValue();
        }
        this.f22412i = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (bool = (Boolean) dataChannel3.mo28318b(C9119ed.class)) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        this.f22413j = z2;
        this.f22407b = C2997d.C2998a.m8305a();
        Room room2 = this.f22411h;
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        this.f22410g = j;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.mo28318b(C9068cg.class);
        }
        this.f22414k = iMessageManager;
        C9197c a = m17458a();
        ((AbstractC11181z) C11115u.m19743a().mo17915b().mo13170j().mo143267a((AbstractC88434g<? super AbstractC2994b, ? extends AbstractC88984x<? extends R>>) C9197c.C9201d.f22429a, false).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143292d(C9197c.C9202e.f22430a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(WidgetExtendsKt.autoDispose(OthersLikeWidget.this))).mo17950a(new C9197c.C9203f(a), C9197c.C9204g.f22432a);
        AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(this.f22410g);
        this.f22421r = likeHelper;
        if (likeHelper != null) {
            i = likeHelper.mo15286e();
        }
        this.f22417n = i;
        AbstractC9168b bVar = this.f22421r;
        if (bVar != null) {
            j2 = bVar.mo15287f();
        } else {
            j2 = 300;
        }
        this.f22418o = j2;
        AbstractC9168b bVar2 = this.f22421r;
        if (bVar2 != null && bVar2.mo15295n()) {
            IMessageManager iMessageManager2 = this.f22414k;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(EnumC9596a.LIKE.getIntType(), this);
            }
            if (bVar2.mo15293l()) {
                bVar2.mo15271a(this);
            }
        }
        this.f22419p.sendEmptyMessageDelayed(2, 60000);
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10822a(AbstractC9168b bVar, int i, int i2, float f, float f2, float f3, float f4) {
        User user;
        C89219l.m154721d(bVar, "");
        if (!this.f22415l && this.f22414k != null && (user = this.f22407b) != null) {
            C9605ai a = C7302b.m15203a(this.f22410g, user);
            IMessageManager iMessageManager = this.f22414k;
            if (iMessageManager == null) {
                C89219l.m154715b();
            }
            iMessageManager.insertMessage(a, true);
            this.f22415l = true;
        }
    }
}

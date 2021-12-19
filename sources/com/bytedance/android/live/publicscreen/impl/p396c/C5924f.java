package com.bytedance.android.live.publicscreen.impl.p396c;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.C7690j;
import com.bytedance.android.livesdk.chatroom.p499ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExternalConfigSetting;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.model.message.C9717ca;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.c.f */
public final class C5924f extends RelativeLayout implements OnMessageListener {

    /* renamed from: i */
    public static final C5925a f14826i = new C5925a((byte) 0);

    /* renamed from: r */
    private static final String f14827r = C5924f.class.getSimpleName();

    /* renamed from: s */
    private static final int f14828s = 4;

    /* renamed from: t */
    private static final int f14829t = 99;

    /* renamed from: u */
    private static final int f14830u = 50;

    /* renamed from: a */
    public RecyclerView f14831a;

    /* renamed from: b */
    AbstractC88412b f14832b;

    /* renamed from: c */
    AbstractC88412b f14833c;

    /* renamed from: d */
    AbstractC88412b f14834d;

    /* renamed from: e */
    AbstractC88412b f14835e;

    /* renamed from: f */
    public int f14836f;

    /* renamed from: g */
    ValueAnimator f14837g;

    /* renamed from: h */
    public int f14838h;

    /* renamed from: j */
    private C5915e f14839j;

    /* renamed from: k */
    private SmoothLinearLayoutManager f14840k;

    /* renamed from: l */
    private int f14841l;

    /* renamed from: m */
    private int f14842m;

    /* renamed from: n */
    private Room f14843n;

    /* renamed from: o */
    private final ArrayList<AbstractC5913d> f14844o = new ArrayList<>();

    /* renamed from: p */
    private final AbstractC89244h f14845p;

    /* renamed from: q */
    private final IMessageManager f14846q;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$h */
    public static final class C5932h<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5932h f14853a = new C5932h();

        static {
            Covode.recordClassIndex(6540);
        }

        C5932h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$j */
    public static final class C5934j<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5934j f14855a = new C5934j();

        static {
            Covode.recordClassIndex(6542);
        }

        C5934j() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private final C7690j getLiveExternalConfigSetting() {
        return (C7690j) this.f14845p.getValue();
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$a */
    public static final class C5925a {
        static {
            Covode.recordClassIndex(6533);
        }

        private C5925a() {
        }

        public /* synthetic */ C5925a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$d */
    static final class C5928d extends AbstractC89220m implements AbstractC89171a<C7690j> {

        /* renamed from: a */
        public static final C5928d f14849a = new C5928d();

        static {
            Covode.recordClassIndex(6536);
        }

        C5928d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C7690j invoke() {
            return LiveExternalConfigSetting.INSTANCE.getValue();
        }
    }

    /* renamed from: f */
    private final void m12938f() {
        m12934b(this.f14844o.size() - 1);
    }

    /* renamed from: c */
    public final void mo11786c() {
        if (this.f14842m > 0) {
            this.f14844o.add(new C5908a(this.f14842m));
            m12938f();
            this.f14842m = 0;
        }
    }

    static {
        Covode.recordClassIndex(6532);
    }

    /* renamed from: d */
    private final void m12936d() {
        this.f14832b = AbstractC88979t.m154310b((Object) 1).mo143295e((long) getLiveExternalConfigSetting().f19062b, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5933i(this), C5934j.f14855a);
    }

    /* renamed from: e */
    private final void m12937e() {
        this.f14834d = AbstractC88979t.m154310b((Object) 1).mo143295e((long) getLiveExternalConfigSetting().f19061a, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5931g(this), C5932h.f14853a);
    }

    /* renamed from: a */
    public final void mo11783a() {
        this.f14833c = C11231b.m19899b((long) getLiveExternalConfigSetting().f19063c, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C5930f(this));
    }

    /* renamed from: b */
    public final void mo11785b() {
        if (this.f14841l > 0) {
            this.f14844o.add(new C5909b(this.f14841l));
            m12938f();
            this.f14841l = 0;
            this.f14835e = AbstractC88979t.m154310b((Object) 1).mo143295e(1, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C5929e(this));
            return;
        }
        mo11786c();
    }

    public final void setRoom(Room room) {
        this.f14843n = room;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$c */
    public static final class C5927c extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        final /* synthetic */ C5924f f14848a;

        static {
            Covode.recordClassIndex(6535);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5927c(C5924f fVar) {
            this.f14848a = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            rect.top = this.f14848a.f14838h;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$e */
    public static final class C5929e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5924f f14850a;

        static {
            Covode.recordClassIndex(6537);
        }

        C5929e(C5924f fVar) {
            this.f14850a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f14850a.mo11786c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$f */
    public static final class C5930f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5924f f14851a;

        static {
            Covode.recordClassIndex(6538);
        }

        C5930f(C5924f fVar) {
            this.f14851a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f14851a.mo11785b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$g */
    public static final class C5931g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5924f f14852a;

        static {
            Covode.recordClassIndex(6539);
        }

        C5931g(C5924f fVar) {
            this.f14852a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f14852a.mo11785b();
            this.f14852a.mo11783a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$i */
    public static final class C5933i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5924f f14854a;

        static {
            Covode.recordClassIndex(6541);
        }

        C5933i(C5924f fVar) {
            this.f14854a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f14854a.mo11785b();
            this.f14854a.mo11783a();
        }
    }

    /* renamed from: a */
    public final void mo11784a(int i) {
        if (i == 1) {
            m12933a(this.f14843n);
        } else if (i == 2) {
            m12936d();
        } else if (i == 3 || i == 4) {
            m12935b(this.f14843n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$b */
    public static final class C5926b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C5924f f14847a;

        static {
            Covode.recordClassIndex(6534);
        }

        C5926b(C5924f fVar) {
            this.f14847a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            RecyclerView recyclerView = this.f14847a.f14831a;
            if (recyclerView != null) {
                layoutParams = recyclerView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = -((int) ((1.0f - floatValue) * ((float) this.f14847a.f14836f)));
                RecyclerView recyclerView2 = this.f14847a.f14831a;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        int i;
        C89219l.m154721d(iMessage, "");
        if ((iMessage instanceof C9878i) || (iMessage instanceof C9717ca)) {
            int i2 = this.f14842m;
            if (i2 < f14829t) {
                this.f14842m = i2 + 1;
            }
        } else if ((iMessage instanceof C9627ay) && (i = this.f14841l) < f14829t) {
            this.f14841l = i + 1;
        }
    }

    /* renamed from: a */
    private final void m12933a(Room room) {
        FansClubMember fansClub;
        FansClubData data;
        if (room != null) {
            C5915e eVar = this.f14839j;
            if (eVar != null) {
                eVar.mo11778a(room);
            }
            User owner = room.getOwner();
            if (owner == null || (fansClub = owner.getFansClub()) == null || (data = fansClub.getData()) == null || data.anchorId == 0) {
                Integer valueOf = Integer.valueOf(room.getUserCount());
                if (valueOf.intValue() > f14830u && valueOf != null) {
                    this.f14844o.add(new C5935g(C5935g.f14858d, valueOf.intValue()));
                    m12938f();
                    return;
                }
                return;
            }
            this.f14844o.add(new C5935g(C5935g.f14856b));
            m12938f();
        }
    }

    /* renamed from: b */
    private void m12934b(int i) {
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams;
        C5915e eVar = this.f14839j;
        if (eVar != null) {
            eVar.notifyItemInserted(i);
            RecyclerView recyclerView = this.f14831a;
            if (recyclerView != null) {
                recyclerView.mo4435d(eVar.getItemCount() - 1);
            }
        }
        if (i <= 2) {
            float f = (float) i;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f / 3.0f, (f + 1.0f) / 3.0f);
            this.f14837g = ofFloat;
            if (ofFloat != null) {
                ofFloat.addUpdateListener(new C5926b(this));
            }
            ValueAnimator valueAnimator = this.f14837g;
            if (valueAnimator != null) {
                valueAnimator.setDuration(200L);
            }
            ValueAnimator valueAnimator2 = this.f14837g;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
        }
        if (i == 1 && this.f14839j != null && (i2 = C5915e.f14808i) > 0 && this.f14836f < (i3 = (i2 * 3) + (this.f14838h * 3))) {
            RecyclerView recyclerView2 = this.f14831a;
            if (recyclerView2 != null) {
                layoutParams = recyclerView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i3;
                }
            } else {
                layoutParams = null;
            }
            RecyclerView recyclerView3 = this.f14831a;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    private final void m12932a(Context context) {
        C1764a.m5927a(LayoutInflater.from(context), R.layout.b7y, this, true);
        this.f14831a = (RecyclerView) findViewById(R.id.cjp);
        this.f14839j = new C5915e();
        SmoothLinearLayoutManager smoothLinearLayoutManager = new SmoothLinearLayoutManager();
        this.f14840k = smoothLinearLayoutManager;
        smoothLinearLayoutManager.f19092a = 200.0f;
        RecyclerView recyclerView = this.f14831a;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.f14840k);
        }
        this.f14838h = (int) C13628n.m24520b(context, (float) f14828s);
        RecyclerView recyclerView2 = this.f14831a;
        if (recyclerView2 != null) {
            recyclerView2.mo4402a(new C5927c(this));
        }
        RecyclerView recyclerView3 = this.f14831a;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f14839j);
        }
        RecyclerView recyclerView4 = this.f14831a;
        ViewGroup.LayoutParams layoutParams = null;
        if (recyclerView4 != null) {
            recyclerView4.setItemAnimator(null);
        }
        RecyclerView recyclerView5 = this.f14831a;
        if (recyclerView5 != null) {
            layoutParams = recyclerView5.getLayoutParams();
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f14836f = -((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        C5915e eVar = this.f14839j;
        if (eVar != null) {
            LayoutInflater from = LayoutInflater.from(context);
            C89219l.m154716b(from, "");
            C89219l.m154721d(from, "");
            eVar.f14810a = from;
            ArrayList<AbstractC5913d> arrayList = this.f14844o;
            C89219l.m154721d(arrayList, "");
            eVar.f14811b = arrayList;
            eVar.notifyDataSetChanged();
            RecyclerView recyclerView6 = this.f14831a;
            if (recyclerView6 != null) {
                recyclerView6.setFadingEdgeLength(0);
            }
        }
        IMessageManager iMessageManager = this.f14846q;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.CHAT.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.f14846q;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC9596a.SCREEN.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.f14846q;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(EnumC9596a.MEMBER.getIntType(), this);
        }
    }

    /* renamed from: b */
    private final void m12935b(Room room) {
        FansClubMember fansClub;
        FansClubData data;
        if (room != null) {
            C5915e eVar = this.f14839j;
            if (eVar != null) {
                eVar.mo11778a(room);
            }
            User owner = room.getOwner();
            if (owner == null || (fansClub = owner.getFansClub()) == null || (data = fansClub.getData()) == null || data.anchorId == 0) {
                Integer valueOf = Integer.valueOf(room.getUserCount());
                if (valueOf.intValue() > f14830u && valueOf != null) {
                    this.f14844o.add(new C5935g(C5935g.f14858d, valueOf.intValue()));
                    m12938f();
                    m12937e();
                    return;
                }
            } else {
                this.f14844o.add(new C5935g(C5935g.f14856b));
                m12938f();
                m12937e();
                return;
            }
        }
        m12936d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5924f(Context context, IMessageManager iMessageManager) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5431);
        this.f14846q = iMessageManager;
        m12932a(context);
        this.f14845p = C89250i.m154773a((AbstractC89171a) C5928d.f14849a);
        MethodCollector.m26664o(5431);
    }
}

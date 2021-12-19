package com.bytedance.android.live.liveinteract.multilive.p362e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5482a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5485d;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5599l;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5605r;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.drawee.view.C24262c;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.e.d */
public final class C5631d extends FrameLayout {
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a */
    public C5271a f14309a;

    /* renamed from: b */
    public AbstractC88412b f14310b;

    /* renamed from: c */
    public boolean f14311c;

    /* renamed from: d */
    private boolean f14312d;

    /* renamed from: e */
    private DataChannel f14313e;

    /* renamed from: f */
    private HashMap f14314f;

    static {
        Covode.recordClassIndex(6228);
    }

    /* renamed from: a */
    public final View mo11410a(int i) {
        if (this.f14314f == null) {
            this.f14314f = new HashMap();
        }
        View view = (View) this.f14314f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f14314f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final DataChannel getMDataChannel() {
        return this.f14313e;
    }

    public final boolean getMIsNormalAudience() {
        return this.f14311c;
    }

    /* renamed from: a */
    public final void mo11411a() {
        mo11412a(Boolean.valueOf(m12210b()));
    }

    public final C5271a getMDataHolder() {
        C5271a aVar = this.f14309a;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        return aVar;
    }

    /* renamed from: b */
    private boolean m12210b() {
        long j;
        String a;
        Room room;
        DataChannel dataChannel = this.f14313e;
        if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
            j = 0;
        } else {
            j = room.getOwnerUserId();
        }
        if (j == 0 || (a = C6898g.C6899a.f17285a.mo13196a(j)) == null || a.length() == 0) {
            return true;
        }
        C5271a aVar = this.f14309a;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        Boolean bool = aVar.mo11108a().get(a);
        if (bool == null) {
            bool = false;
        }
        if (!bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final void m12212d() {
        ImageModel imageModel;
        List<String> urls;
        Room room;
        User owner;
        DataChannel dataChannel = this.f14313e;
        if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null || (owner = room.getOwner()) == null) {
            imageModel = null;
        } else {
            imageModel = owner.getAvatarThumb();
        }
        C11291z zVar = new C11291z(5, 0.0f);
        if (imageModel == null || (urls = imageModel.getUrls()) == null || urls.size() != 0) {
            C3941k.m9604a((HSImageView) mo11410a(R.id.cwf), imageModel, zVar);
            return;
        }
        C24639c a = C24639c.m47149a(C24134g.m45734a(2131234441));
        a.f58560k = zVar;
        C24185e b = C24182c.m45843b();
        b.f57299c = (REQUEST) a.mo40483a();
        C24262c cVar = (C24262c) mo11410a(R.id.cwf);
        C89219l.m154716b(cVar, "");
        b.f57309m = cVar.getController();
        AbstractC24195a c = b.mo39827e();
        C24262c cVar2 = (C24262c) mo11410a(R.id.cwf);
        C89219l.m154716b(cVar2, "");
        cVar2.setController(c);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.d$b */
    static final class RunnableC5635b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5631d f14318a;

        static {
            Covode.recordClassIndex(6232);
        }

        RunnableC5635b(C5631d dVar) {
            this.f14318a = dVar;
        }

        public final void run() {
            HSImageView hSImageView = (HSImageView) this.f14318a.mo11410a(R.id.cwc);
            C89219l.m154716b(hSImageView, "");
            ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
            ConstraintLayout.C0547a aVar = null;
            if (!(layoutParams instanceof ConstraintLayout.C0547a)) {
                layoutParams = null;
            }
            ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams;
            if (aVar2 != null) {
                if (this.f14318a.getMDataHolder().f13646q == EnumC4422k.GRID || this.f14318a.getMDataHolder().f13646q == EnumC4422k.GRID_FIX) {
                    aVar2.bottomMargin = C3966y.m9653a(0.0f);
                    aVar2.width = C3966y.m9653a(60.0f);
                    aVar2.height = C3966y.m9653a(60.0f);
                } else {
                    aVar2.bottomMargin = C3966y.m9653a(30.0f);
                    aVar2.width = C3966y.m9653a(70.0f);
                    aVar2.height = C3966y.m9653a(70.0f);
                }
                HSImageView hSImageView2 = (HSImageView) this.f14318a.mo11410a(R.id.cwc);
                C89219l.m154716b(hSImageView2, "");
                hSImageView2.setLayoutParams(aVar2);
                LiveTextView liveTextView = (LiveTextView) this.f14318a.mo11410a(R.id.eug);
                C89219l.m154716b(liveTextView, "");
                ViewGroup.LayoutParams layoutParams2 = liveTextView.getLayoutParams();
                if (layoutParams2 instanceof ConstraintLayout.C0547a) {
                    aVar = layoutParams2;
                }
                ConstraintLayout.C0547a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.f2266d = R.id.cwc;
                    aVar3.f2269g = R.id.cwc;
                    aVar3.f2270h = R.id.cwc;
                    aVar3.f2273k = R.id.cwc;
                    aVar3.width = aVar2.width;
                    aVar3.height = aVar2.height;
                    LiveTextView liveTextView2 = (LiveTextView) this.f14318a.mo11410a(R.id.eug);
                    C89219l.m154716b(liveTextView2, "");
                    liveTextView2.setLayoutParams(aVar3);
                }
            }
        }
    }

    /* renamed from: c */
    private final void m12211c() {
        ImageModel imageModel;
        Room room;
        User owner;
        HSImageView hSImageView = (HSImageView) mo11410a(R.id.cwc);
        C89219l.m154716b(hSImageView, "");
        hSImageView.setVisibility(0);
        DataChannel dataChannel = this.f14313e;
        if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null || (owner = room.getOwner()) == null) {
            imageModel = null;
        } else {
            imageModel = owner.getAvatarThumb();
        }
        HSImageView hSImageView2 = (HSImageView) mo11410a(R.id.cwc);
        C89219l.m154716b(hSImageView2, "");
        int width = hSImageView2.getWidth();
        HSImageView hSImageView3 = (HSImageView) mo11410a(R.id.cwc);
        C89219l.m154716b(hSImageView3, "");
        C7577g.m15571a((ImageView) mo11410a(R.id.cwc), imageModel, width, hSImageView3.getHeight(), 2131234441);
        if (this.f14311c) {
            C5271a aVar = this.f14309a;
            if (aVar == null) {
                C89219l.m154710a("mDataHolder");
            }
            if (aVar.f13646q == EnumC4422k.FLOATING) {
                HSImageView hSImageView4 = (HSImageView) mo11410a(R.id.cwf);
                C89219l.m154716b(hSImageView4, "");
                hSImageView4.setVisibility(8);
                return;
            }
        }
        HSImageView hSImageView5 = (HSImageView) mo11410a(R.id.cwf);
        C89219l.m154716b(hSImageView5, "");
        hSImageView5.setVisibility(0);
        if (!this.f14312d) {
            m12212d();
            this.f14312d = true;
        }
    }

    public final void setMDataChannel(DataChannel dataChannel) {
        this.f14313e = dataChannel;
    }

    public final void setMIsNormalAudience(boolean z) {
        this.f14311c = z;
    }

    public final void setMDataHolder(C5271a aVar) {
        C89219l.m154721d(aVar, "");
        this.f14309a = aVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.d$a */
    static final class C5634a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5631d f14317a;

        static {
            Covode.recordClassIndex(6231);
        }

        C5634a(C5631d dVar) {
            this.f14317a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = 5 - ((Number) obj).longValue();
            LiveTextView liveTextView = (LiveTextView) this.f14317a.mo11410a(R.id.eug);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setText(String.valueOf(longValue));
            if (longValue == 0) {
                LiveTextView liveTextView2 = (LiveTextView) this.f14317a.mo11410a(R.id.eug);
                C89219l.m154716b(liveTextView2, "");
                liveTextView2.setVisibility(8);
                AbstractC88412b bVar = this.f14317a.f14310b;
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11412a(Boolean bool) {
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            HSImageView hSImageView = (HSImageView) mo11410a(R.id.cwc);
            C89219l.m154716b(hSImageView, "");
            hSImageView.setVisibility(8);
            HSImageView hSImageView2 = (HSImageView) mo11410a(R.id.cwf);
            C89219l.m154716b(hSImageView2, "");
            hSImageView2.setVisibility(8);
            LiveTextView liveTextView = (LiveTextView) mo11410a(R.id.eug);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setVisibility(8);
            return;
        }
        m12211c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5631d(Context context, DataChannel dataChannel, boolean z) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4429);
        this.f14313e = dataChannel;
        this.f14311c = z;
        C4431e.f12034a.mo10201a(this);
        FrameLayout.inflate(context, R.layout.be1, this);
        mo11412a(Boolean.valueOf(m12210b()));
        ((HSImageView) mo11410a(R.id.cwc)).post(new RunnableC5635b(this));
        DataChannel dataChannel2 = this.f14313e;
        if (dataChannel2 != null) {
            dataChannel2.mo28310a(C5482a.class, (AbstractC89172b) new AbstractC89172b<C5485d, C89391z>(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.p362e.C5631d.C56321 */

                /* renamed from: a */
                final /* synthetic */ C5631d f14315a;

                static {
                    Covode.recordClassIndex(6229);
                }

                {
                    this.f14315a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C5485d dVar) {
                    C5485d dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    if (dVar2.f14056a) {
                        LiveTextView liveTextView = (LiveTextView) this.f14315a.mo11410a(R.id.eug);
                        C89219l.m154716b(liveTextView, "");
                        liveTextView.setVisibility(0);
                        C5631d dVar3 = this.f14315a;
                        dVar3.f14310b = C11231b.m19896a(1, TimeUnit.SECONDS).mo143276b(6).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C5634a(dVar3));
                    } else {
                        this.f14315a.mo11412a((Boolean) true);
                        AbstractC88412b bVar = this.f14315a.f14310b;
                        if (bVar != null) {
                            bVar.dispose();
                        }
                    }
                    return C89391z.f203057a;
                }
            }).mo28310a(C5599l.class, (AbstractC89172b) new AbstractC89172b<C5605r, C89391z>(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.p362e.C5631d.C56332 */

                /* renamed from: a */
                final /* synthetic */ C5631d f14316a;

                static {
                    Covode.recordClassIndex(6230);
                }

                {
                    this.f14316a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C5605r rVar) {
                    C89219l.m154721d(rVar, "");
                    if (!this.f14316a.getMIsNormalAudience()) {
                        this.f14316a.mo11411a();
                    }
                    return C89391z.f203057a;
                }
            });
            MethodCollector.m26664o(4429);
            return;
        }
        MethodCollector.m26664o(4429);
    }
}

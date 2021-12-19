package com.bytedance.android.live.liveinteract.multiguest.p333g.p335b;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.C4403aq;
import com.bytedance.android.live.liveinteract.api.p261b.C4423l;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5517c;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5385a;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5394j;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5591d;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5596i;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5597j;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5598k;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5599l;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5605r;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5711f;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5712g;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.drawee.view.C24262c;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b */
public final class C5245b extends C5235a {

    /* renamed from: m */
    public User f13569m;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: n */
    public C5271a f13570n;
    @AbstractC4430d(mo10204a = "LINK_USER_INFO_CENTER")

    /* renamed from: o */
    public C5153d f13571o;

    /* renamed from: p */
    EnumC4422k f13572p;

    /* renamed from: q */
    private boolean f13573q;

    /* renamed from: r */
    private View f13574r;

    /* renamed from: s */
    private HashMap f13575s;

    static {
        Covode.recordClassIndex(5837);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a, com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5139b
    /* renamed from: a */
    public final void mo10892a(boolean z) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a
    /* renamed from: b */
    public final View mo11018b(int i) {
        if (this.f13575s == null) {
            this.f13575s = new HashMap();
        }
        View view = (View) this.f13575s.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13575s.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a
    public final int getWindowLayoutId() {
        return R.layout.bel;
    }

    public final EnumC4422k getMType() {
        return this.f13572p;
    }

    public final C5271a getMDataHolder() {
        C5271a aVar = this.f13570n;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        return aVar;
    }

    public final C5153d getMInfoCenter() {
        C5153d dVar = this.f13571o;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel != null) {
            mDataChannel.mo28316b(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo11063e() {
        ((ConstraintLayout) mo11018b(R.id.c52)).post(new RunnableC5257l(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo11064f() {
        ((HSImageView) mo11018b(R.id.cwc)).post(new RunnableC5256k(this));
    }

    /* access modifiers changed from: package-private */
    public final String getAnchorName() {
        Room room;
        User owner;
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel == null || (room = (Room) mDataChannel.mo28318b(C9093de.class)) == null || (owner = room.getOwner()) == null) {
            return null;
        }
        return owner.getNickName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo11065g() {
        long j;
        Room room;
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel == null || (room = (Room) mDataChannel.mo28318b(C9093de.class)) == null) {
            j = 0;
        } else {
            j = room.getOwnerUserId();
        }
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (j == b.mo13161c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$k */
    public static final class RunnableC5256k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5245b f13587a;

        static {
            Covode.recordClassIndex(5848);
        }

        RunnableC5256k(C5245b bVar) {
            this.f13587a = bVar;
        }

        public final void run() {
            ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a(C3966y.m9653a(60.0f), C3966y.m9653a(60.0f));
            if (this.f13587a.getMType() == EnumC4422k.GRID_FIX || this.f13587a.getMType() == EnumC4422k.GRID) {
                HSImageView hSImageView = (HSImageView) this.f13587a.mo11018b(R.id.cwc);
                C89219l.m154716b(hSImageView, "");
                if (!C5517c.m12024a(hSImageView)) {
                    aVar.f2270h = R.id.cw8;
                    aVar.topMargin = C3966y.m9653a(78.0f);
                    aVar.f2266d = R.id.cw8;
                    aVar.f2269g = R.id.cw8;
                    HSImageView hSImageView2 = (HSImageView) this.f13587a.mo11018b(R.id.cwc);
                    C89219l.m154716b(hSImageView2, "");
                    hSImageView2.setLayoutParams(aVar);
                }
            }
            aVar.f2270h = R.id.cw8;
            aVar.f2273k = R.id.cw8;
            aVar.f2266d = R.id.cw8;
            aVar.f2269g = R.id.cw8;
            HSImageView hSImageView22 = (HSImageView) this.f13587a.mo11018b(R.id.cwc);
            C89219l.m154716b(hSImageView22, "");
            hSImageView22.setLayoutParams(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$l */
    public static final class RunnableC5257l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5245b f13588a;

        static {
            Covode.recordClassIndex(5849);
        }

        RunnableC5257l(C5245b bVar) {
            this.f13588a = bVar;
        }

        public final void run() {
            ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a(-2, -2);
            aVar.f2266d = R.id.cw8;
            aVar.f2279q = R.id.cw8;
            aVar.leftMargin = C3966y.m9653a(8.0f);
            aVar.setMarginStart(C3966y.m9653a(8.0f));
            aVar.rightMargin = C3966y.m9653a(8.0f);
            aVar.setMarginEnd(C3966y.m9653a(8.0f));
            if (this.f13588a.getMType() == EnumC4422k.GRID_FIX || this.f13588a.getMType() == EnumC4422k.GRID) {
                aVar.f2268f = R.id.cwe;
                aVar.f2280r = R.id.cwe;
                aVar.f2270h = R.id.cw8;
                aVar.topMargin = C3966y.m9653a(8.0f);
            } else {
                aVar.f2269g = R.id.cw8;
                aVar.f2281s = R.id.cw8;
                aVar.f2273k = R.id.cw8;
                aVar.bottomMargin = C3966y.m9653a(8.0f);
            }
            aVar.f2243T = true;
            aVar.f2288z = 0.0f;
            aVar.f2230G = 0;
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f13588a.mo11018b(R.id.c52);
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setLayoutParams(aVar);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f13588a.mo11018b(R.id.c52);
            C89219l.m154716b(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
        }
    }

    /* renamed from: h */
    private final void m11583h() {
        ImageModel imageModel;
        User user = this.f13569m;
        if (user != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        HSImageView hSImageView = (HSImageView) mo11018b(R.id.cwc);
        C89219l.m154716b(hSImageView, "");
        int width = hSImageView.getWidth();
        HSImageView hSImageView2 = (HSImageView) mo11018b(R.id.cwc);
        C89219l.m154716b(hSImageView2, "");
        C7577g.m15571a((ImageView) mo11018b(R.id.cwc), imageModel, width, hSImageView2.getHeight(), 2131234441);
        C11291z zVar = new C11291z(5, 0.0f);
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            C24639c a = C24639c.m47149a(C24134g.m45734a(2131234441));
            a.f58560k = zVar;
            C24185e b = C24182c.m45843b();
            b.f57299c = (REQUEST) a.mo40483a();
            C24262c cVar = (C24262c) mo11018b(R.id.cwf);
            C89219l.m154716b(cVar, "");
            b.f57309m = cVar.getController();
            AbstractC24195a c = b.mo39827e();
            C24262c cVar2 = (C24262c) mo11018b(R.id.cwf);
            C89219l.m154716b(cVar2, "");
            cVar2.setController(c);
            return;
        }
        C3941k.m9604a((HSImageView) mo11018b(R.id.cwf), imageModel, zVar);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a
    /* renamed from: a */
    public final void mo11015a() {
        super.mo11015a();
        if (mo11065g()) {
            getMAvatarBackground().setVisibility(0);
        } else {
            getMAvatarBackground().setVisibility(8);
        }
        if (mo11065g() || (!getMCurrentUserIsLinkedGuest() && getMPresenter().mo10886d())) {
            View findViewById = findViewById(R.id.cwd);
            C89219l.m154716b(findViewById, "");
            this.f13574r = findViewById;
            if (findViewById == null) {
                C89219l.m154710a("mOnlinePlayerClose");
            }
            findViewById.setVisibility(0);
            View view = this.f13574r;
            if (view == null) {
                C89219l.m154710a("mOnlinePlayerClose");
            }
            view.setOnClickListener(new View$OnClickListenerC5250e(this));
        }
        mo11063e();
        mo11064f();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel != null) {
            if (getMPresenter().mo10886d()) {
                mDataChannel.mo28312a(this, C5596i.class, new C5251f(this)).mo28312a(this, C5597j.class, new C5252g(this));
            } else {
                mDataChannel.mo28312a(this, C5598k.class, new C5253h(this)).mo28312a(this, C5599l.class, new C5254i(this));
            }
            mDataChannel.mo28312a(this, C4403aq.class, new C5255j(this));
        }
        mo11062c(!m11582a(getInteractId()));
        C5271a aVar = this.f13570n;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        Boolean bool = aVar.mo11111b().get(getInteractId());
        if (bool == null) {
            bool = false;
        }
        C89219l.m154716b(bool, "");
        mo11061b(!bool.booleanValue());
    }

    public final void setMType(EnumC4422k kVar) {
        this.f13572p = kVar;
    }

    public final void setMDataHolder(C5271a aVar) {
        C89219l.m154721d(aVar, "");
        this.f13570n = aVar;
    }

    public final void setMInfoCenter(C5153d dVar) {
        C89219l.m154721d(dVar, "");
        this.f13571o = dVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$b */
    static final class C5247b implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        public static final C5247b f13578a = new C5247b();

        static {
            Covode.recordClassIndex(5839);
        }

        C5247b() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$d */
    static final class C5249d implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        public static final C5249d f13580a = new C5249d();

        static {
            Covode.recordClassIndex(5841);
        }

        C5249d() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            C5714i.m12553b(0);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$j */
    static final class C5255j extends AbstractC89220m implements AbstractC89172b<C4423l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5245b f13586a;

        static {
            Covode.recordClassIndex(5847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5255j(C5245b bVar) {
            super(1);
            this.f13586a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C4423l lVar) {
            C4423l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            C5245b bVar = this.f13586a;
            bVar.f13572p = lVar2.f12023a;
            bVar.mo11063e();
            bVar.mo11064f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo11061b(boolean z) {
        int i;
        ImageView imageView = (ImageView) mo11018b(R.id.cwe);
        if (imageView != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
        mo11063e();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$c */
    static final class C5248c implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        final /* synthetic */ C5245b f13579a;

        static {
            Covode.recordClassIndex(5840);
        }

        C5248c(C5245b bVar) {
            this.f13579a = bVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            this.f13579a.mo11016a(3);
            DataChannel mDataChannel = this.f13579a.getMDataChannel();
            if (mDataChannel != null) {
                mDataChannel.mo28319c(C5394j.class);
            }
            C5714i.m12553b(1);
            dialogInterface.dismiss();
            C5712g.m12498a("guest_over_quickly", this.f13579a.getMDataHolder().f13646q);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$f */
    static final class C5251f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5245b f13582a;

        static {
            Covode.recordClassIndex(5843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5251f(C5245b bVar) {
            super(1);
            this.f13582a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.f13582a.mo11061b(booleanValue);
            this.f13582a.getMDataHolder().mo11111b().put(this.f13582a.getInteractId(), Boolean.valueOf(!booleanValue));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$g */
    static final class C5252g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5245b f13583a;

        static {
            Covode.recordClassIndex(5844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5252g(C5245b bVar) {
            super(1);
            this.f13583a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.f13583a.mo11062c(booleanValue);
            this.f13583a.getMDataHolder().mo11108a().put(this.f13583a.getInteractId(), Boolean.valueOf(!booleanValue));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$h */
    static final class C5253h extends AbstractC89220m implements AbstractC89172b<C5591d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5245b f13584a;

        static {
            Covode.recordClassIndex(5845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5253h(C5245b bVar) {
            super(1);
            this.f13584a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C5591d dVar) {
            C5591d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C5245b bVar = this.f13584a;
            if (C89219l.m154714a((Object) dVar2.f14232a, (Object) bVar.getMPresenter().mo10885c())) {
                bVar.mo11061b(!dVar2.f14233b);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$i */
    static final class C5254i extends AbstractC89220m implements AbstractC89172b<C5605r, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5245b f13585a;

        static {
            Covode.recordClassIndex(5846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5254i(C5245b bVar) {
            super(1);
            this.f13585a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C5605r rVar) {
            C5605r rVar2 = rVar;
            C89219l.m154721d(rVar2, "");
            C5245b bVar = this.f13585a;
            if (C89219l.m154714a((Object) rVar2.f14247a, (Object) bVar.getMPresenter().mo10885c())) {
                bVar.mo11062c(!rVar2.f14248b);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$a */
    static final class C5246a implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        final /* synthetic */ C5245b f13576a;

        /* renamed from: b */
        final /* synthetic */ String f13577b;

        static {
            Covode.recordClassIndex(5838);
        }

        C5246a(C5245b bVar, String str) {
            this.f13576a = bVar;
            this.f13577b = str;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            long j;
            C89219l.m154721d(dialogInterface, "");
            this.f13576a.mo11016a(3);
            DataChannel mDataChannel = this.f13576a.getMDataChannel();
            if (mDataChannel != null) {
                mDataChannel.mo28320c(C5385a.class, this.f13577b);
            }
            dialogInterface.dismiss();
            User user = this.f13576a.f13569m;
            if (user != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            EnumC4422k kVar = this.f13576a.getMDataHolder().f13646q;
            String remove = C5711f.f14474b.remove(Long.valueOf(j));
            if (remove != null && C5711f.f14474b.size() == 0) {
                C5711f.m12497a("connection_end_quickly", j, 0, kVar, remove, 4);
            }
        }
    }

    /* renamed from: a */
    private final boolean m11582a(String str) {
        C5271a aVar = this.f13570n;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        Boolean bool = aVar.mo11108a().get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        C5153d dVar = this.f13571o;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        if (dVar.mo10895a(str) == 2) {
            C5271a aVar2 = this.f13570n;
            if (aVar2 == null) {
                C89219l.m154710a("mDataHolder");
            }
            aVar2.mo11108a().put(str, true);
            return true;
        } else if (!getMPresenter().mo10886d()) {
            return false;
        } else {
            C5271a aVar3 = this.f13570n;
            if (aVar3 == null) {
                C89219l.m154710a("mDataHolder");
            }
            if (!aVar3.f13633d) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo11062c(boolean z) {
        if (z) {
            HSImageView hSImageView = (HSImageView) mo11018b(R.id.cwc);
            C89219l.m154716b(hSImageView, "");
            hSImageView.setVisibility(8);
            HSImageView hSImageView2 = (HSImageView) mo11018b(R.id.cwf);
            C89219l.m154716b(hSImageView2, "");
            hSImageView2.setVisibility(8);
            return;
        }
        HSImageView hSImageView3 = (HSImageView) mo11018b(R.id.cwc);
        C89219l.m154716b(hSImageView3, "");
        hSImageView3.setVisibility(0);
        HSImageView hSImageView4 = (HSImageView) mo11018b(R.id.cwf);
        C89219l.m154716b(hSImageView4, "");
        hSImageView4.setVisibility(0);
        if (!this.f13573q) {
            this.f13573q = true;
            m11583h();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$e */
    static final class View$OnClickListenerC5250e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5245b f13581a;

        static {
            Covode.recordClassIndex(5842);
        }

        View$OnClickListenerC5250e(C5245b bVar) {
            this.f13581a = bVar;
        }

        public final void onClick(View view) {
            String secUid;
            C5245b bVar = this.f13581a;
            if (bVar.mo11065g()) {
                Object[] objArr = new Object[1];
                User user = bVar.f13569m;
                String str = null;
                if (user != null) {
                    str = user.displayId;
                }
                objArr[0] = str;
                String a = C3966y.m9660a((int) R.string.dyw, objArr);
                User user2 = bVar.f13569m;
                if (user2 != null && (secUid = user2.getSecUid()) != null) {
                    LiveDialog.C4056a aVar = new LiveDialog.C4056a(bVar.getContext());
                    aVar.f11227c = a;
                    aVar.mo9504b(R.string.dyx).mo9500a(R.string.dyo, new C5246a(bVar, secUid)).mo9505b(R.string.efo, C5247b.f13578a).mo9503a().show();
                    return;
                }
                return;
            }
            String a2 = C3966y.m9660a((int) R.string.dyw, bVar.getAnchorName());
            String str2 = LinkApi.EnumC7286d.WINDOW.value;
            C89219l.m154716b(str2, "");
            C5714i.m12535a(str2);
            LiveDialog.C4056a aVar2 = new LiveDialog.C4056a(bVar.getContext());
            aVar2.f11227c = a2;
            aVar2.mo9504b(R.string.e4u).mo9500a(R.string.efw, new C5248c(bVar)).mo9505b(R.string.eg2, C5249d.f13580a).mo9503a().show();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a
    /* renamed from: a */
    public final void mo11016a(int i) {
        C5271a aVar = this.f13570n;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        setMultiLiveEnable(aVar.f13637h);
        super.mo11016a(i);
        if ((i == 0 || i == 1) && !m11582a(getInteractId())) {
            getMPrepareAvatar().setVisibility(8);
        }
        getMPrepareHint().setVisibility(8);
        if (!mo11065g()) {
            getMAvatarBackground().setVisibility(8);
        }
        getMWaveEffectView().setVisibility(8);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a, com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5139b
    /* renamed from: a */
    public final void mo10891a(User user) {
        ImageModel imageModel;
        if (user != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        C7577g.m15571a(getMPrepareAvatar(), imageModel, getMPrepareAvatar().getWidth(), getMPrepareAvatar().getHeight(), 2131234441);
        C11291z zVar = new C11291z(5, 0.0f);
        if (mo11065g()) {
            if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                C24639c a = C24639c.m47149a(C24134g.m45734a(2131234441));
                a.f58560k = zVar;
                C24185e b = C24182c.m45843b();
                b.f57299c = (REQUEST) a.mo40483a();
                b.f57309m = getMAvatarBackground().getController();
                getMAvatarBackground().setController(b.mo39827e());
            } else {
                C3941k.m9604a(getMAvatarBackground(), imageModel, zVar);
            }
        }
        getMOnlineName().setText(C6581g.m14075a(user));
        this.f13569m = user;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5245b(Context context, String str, C5137b.AbstractC5138a aVar, C5235a.AbstractC5236a aVar2, DataChannel dataChannel, EnumC4422k kVar) {
        super(context, str, aVar, aVar2, dataChannel);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.f13572p = kVar;
        C4431e.f12034a.mo10201a(this);
    }
}

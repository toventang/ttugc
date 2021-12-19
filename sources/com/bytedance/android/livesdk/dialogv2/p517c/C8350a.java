package com.bytedance.android.livesdk.dialogv2.p517c;

import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.C6889az;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.C9905u;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p668y.p671c.C11599a;
import com.bytedance.android.livesdk.service.animation.p622a.C10645a;
import com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p621a.C10631a;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p628c.C10725a;
import com.bytedance.android.livesdk.service.p625c.p628c.C10730c;
import com.bytedance.android.livesdk.service.p625c.p632g.C10752a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.c.a */
public class C8350a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public ImageView f20648a;

    /* renamed from: b */
    public LiveTextView f20649b;

    /* renamed from: c */
    public HSImageView f20650c;

    /* renamed from: d */
    public int f20651d = 1;

    /* renamed from: e */
    public View f20652e;

    /* renamed from: f */
    LiveNewSendGiftAnimationView f20653f;

    /* renamed from: g */
    public AbstractC8812b<? extends C9543b> f20654g;

    /* renamed from: h */
    public DataChannel f20655h;

    /* renamed from: i */
    public AbstractC8351a f20656i;

    /* renamed from: j */
    public boolean f20657j;

    /* renamed from: k */
    public final View f20658k;

    /* renamed from: l */
    private LiveTextView f20659l;

    /* renamed from: m */
    private LiveTextView f20660m;

    /* renamed from: n */
    private LiveTextView f20661n;

    /* renamed from: o */
    private ImageView f20662o;

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.a$a */
    public interface AbstractC8351a {
        static {
            Covode.recordClassIndex(9189);
        }

        /* renamed from: a */
        void mo14666a(C8350a aVar);

        /* renamed from: b */
        int mo14669b(Long l);
    }

    static {
        Covode.recordClassIndex(9188);
    }

    /* renamed from: e */
    public boolean mo14686e() {
        return false;
    }

    /* renamed from: h */
    public void mo14689h() {
        DataChannel dataChannel = this.f20655h;
        if (dataChannel != null) {
            dataChannel.mo28316b(this);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.a$g */
    static final class RunnableC8357g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8350a f20669a;

        static {
            Covode.recordClassIndex(9195);
        }

        RunnableC8357g(C8350a aVar) {
            this.f20669a = aVar;
        }

        public final void run() {
            C8350a aVar = this.f20669a;
            LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = aVar.f20653f;
            if (liveNewSendGiftAnimationView != null) {
                liveNewSendGiftAnimationView.setVisibility(8);
            }
            long j = C8374a.C8375a.C8376a.f20718a.f20712f;
            AbstractC8812b<? extends C9543b> bVar = aVar.f20654g;
            if (bVar != null && j == bVar.mo14676d() && C8374a.C8375a.C8376a.f20718a.f20713g == aVar.f20651d) {
                aVar.mo14688g();
            }
        }
    }

    /* renamed from: c */
    public final void mo14684c() {
        LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = this.f20653f;
        if (liveNewSendGiftAnimationView != null) {
            liveNewSendGiftAnimationView.setVisibility(8);
        }
        LiveNewSendGiftAnimationView liveNewSendGiftAnimationView2 = this.f20653f;
        if (liveNewSendGiftAnimationView2 != null) {
            liveNewSendGiftAnimationView2.mo17590a();
        }
        this.f20657j = false;
        long j = C8374a.C8375a.C8376a.f20718a.f20712f;
        AbstractC8812b<? extends C9543b> bVar = this.f20654g;
        if (bVar != null && j == bVar.mo14676d() && C8374a.C8375a.C8376a.f20718a.f20713g == this.f20651d) {
            mo14688g();
        }
    }

    /* renamed from: f */
    public void mo14687f() {
        T t;
        C9905u uVar;
        View view = this.f20652e;
        if (view != null) {
            view.setVisibility(4);
        }
        AbstractC8812b<? extends C9543b> bVar = this.f20654g;
        C9904t tVar = null;
        if (bVar != null) {
            t = bVar.f21695b;
        } else {
            t = null;
        }
        if (t instanceof C9904t) {
            tVar = t;
        }
        C9904t tVar2 = tVar;
        if (tVar2 == null || (uVar = tVar2.f23995L) == null || !uVar.f24023b) {
            ImageView imageView = this.f20662o;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f20662o;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14685d() {
        long j;
        String str;
        ImageModel c;
        List<String> list;
        ImageModel imageModel = null;
        boolean z = false;
        try {
            AbstractC8812b<? extends C9543b> bVar = this.f20654g;
            if (bVar == null || (c = bVar.mo14675c()) == null || (list = c.mUrls) == null) {
                str = null;
            } else {
                str = list.get(0);
            }
            z = C3941k.m9612a(Uri.parse(str));
        } catch (Exception unused) {
        }
        C10725a aVar = C10725a.C10726a.C10727a.f25846a;
        AbstractC8812b<? extends C9543b> bVar2 = this.f20654g;
        if (bVar2 != null) {
            j = bVar2.mo14676d();
        } else {
            j = 0;
        }
        aVar.mo17651a(j, z);
        HSImageView hSImageView = this.f20650c;
        AbstractC8812b<? extends C9543b> bVar3 = this.f20654g;
        if (bVar3 != null) {
            imageModel = bVar3.mo14675c();
        }
        C3941k.m9615b(hSImageView, imageModel, new C8355e(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14680a() {
        this.f20648a = (ImageView) this.f20658k.findViewById(R.id.c86);
        this.f20649b = (LiveTextView) this.f20658k.findViewById(R.id.crv);
        this.f20650c = (HSImageView) this.f20658k.findViewById(R.id.cru);
        this.f20652e = this.f20658k.findViewById(R.id.eox);
        this.f20653f = (LiveNewSendGiftAnimationView) this.f20658k.findViewById(R.id.ba2);
        this.f20659l = (LiveTextView) this.f20658k.findViewById(R.id.bqu);
        this.f20660m = (LiveTextView) this.f20658k.findViewById(R.id.brl);
        this.f20661n = (LiveTextView) this.f20658k.findViewById(R.id.brm);
        this.f20662o = (ImageView) this.f20658k.findViewById(R.id.eax);
        LiveTextView liveTextView = this.f20660m;
        if (liveTextView != null) {
            liveTextView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41568b));
        }
        LiveTextView liveTextView2 = this.f20649b;
        if (liveTextView2 != null) {
            liveTextView2.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
    }

    /* renamed from: b */
    public final void mo14683b() {
        Integer num;
        GiftDialogViewModel.EnumC10039a aVar;
        long j;
        boolean z;
        T t;
        T t2;
        T t3;
        String str;
        String str2;
        DataChannel dataChannel;
        Room room;
        AbstractC8812b<? extends C9543b> bVar = this.f20654g;
        T t4 = null;
        if (bVar != null) {
            num = Integer.valueOf(bVar.f21694a);
        } else {
            num = null;
        }
        boolean z2 = true;
        if (num == null || num.intValue() == 1 || num.intValue() != 2) {
            aVar = GiftDialogViewModel.EnumC10039a.GIFT;
        } else {
            aVar = GiftDialogViewModel.EnumC10039a.PROP;
        }
        AbstractC8812b<? extends C9543b> bVar2 = this.f20654g;
        if (bVar2 != null) {
            j = bVar2.mo14676d();
        } else {
            j = 0;
        }
        AbstractC8812b<? extends C9543b> bVar3 = this.f20654g;
        if (bVar3 != null) {
            z = bVar3.mo14679g();
        } else {
            z = false;
        }
        C10700d dVar = new C10700d(aVar, j, z);
        AbstractC8812b<? extends C9543b> bVar4 = this.f20654g;
        if (bVar4 != null) {
            t = bVar4.f21695b;
        } else {
            t = null;
        }
        if (t instanceof C9904t) {
            AbstractC8812b<? extends C9543b> bVar5 = this.f20654g;
            if (bVar5 != null) {
                t2 = bVar5.f21695b;
            } else {
                t2 = null;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            dVar.f25775q = ((C9904t) t2).f23993J;
            AbstractC8812b<? extends C9543b> bVar6 = this.f20654g;
            if (bVar6 != null) {
                t3 = bVar6.f21695b;
            } else {
                t3 = null;
            }
            Objects.requireNonNull(t3, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            dVar.f25764f = ((C9904t) t3).f24001f;
            AbstractC8812b<? extends C9543b> bVar7 = this.f20654g;
            if (bVar7 != null) {
                t4 = bVar7.f21695b;
            }
            Objects.requireNonNull(t4, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            if (((C9904t) t4).f24000e == 1) {
                z2 = false;
            }
            dVar.f25769k = z2;
            dVar.f25771m = this.f20651d;
            dVar.f25770l = GiftManager.inst().getTabName(this.f20651d);
            dVar.f25772n = this.f20651d;
            if (C10631a.C10632a.C10633a.f25635a.f25634a) {
                str = "call";
            } else {
                str = "click";
            }
            dVar.f25773o = str;
            if (mo14686e()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            dVar.f25774p = str2;
            dVar.f25768j = C8374a.C8375a.C8376a.f20718a.f20711e;
            User user = C8374a.C8375a.C8376a.f20718a.f20708b;
            if (user != null || ((dataChannel = this.f20655h) != null && (room = (Room) dataChannel.mo28318b(C9093de.class)) != null && (user = room.getOwner()) != null)) {
                dVar.f25767i = user;
            } else {
                return;
            }
        }
        DataChannel dataChannel2 = this.f20655h;
        if (dataChannel2 != null) {
            dataChannel2.mo28320c(C6889az.class, dVar);
        }
    }

    /* renamed from: g */
    public void mo14688g() {
        T t;
        C9905u uVar;
        View view = this.f20652e;
        if (view != null) {
            view.setVisibility(0);
        }
        ImageView imageView = this.f20662o;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        C11599a aVar = C11599a.C11601a.f27757a;
        C89219l.m154716b(aVar, "");
        if (aVar.f27752a) {
            LiveTextView liveTextView = this.f20659l;
            if (liveTextView != null) {
                liveTextView.setVisibility(0);
            }
            LiveTextView liveTextView2 = this.f20660m;
            if (liveTextView2 != null) {
                liveTextView2.setVisibility(4);
            }
            LiveTextView liveTextView3 = this.f20661n;
            if (liveTextView3 != null) {
                liveTextView3.setVisibility(4);
            }
            C11599a aVar2 = C11599a.C11601a.f27757a;
            C89219l.m154716b(aVar2, "");
            mo14682a(Long.valueOf(aVar2.f27754c));
            return;
        }
        AbstractC8812b<? extends C9543b> bVar = this.f20654g;
        C9904t tVar = null;
        if (bVar != null) {
            t = bVar.f21695b;
        } else {
            t = null;
        }
        if (t instanceof C9904t) {
            tVar = t;
        }
        C9904t tVar2 = tVar;
        if (tVar2 == null || (uVar = tVar2.f23995L) == null || !uVar.f24023b) {
            LiveTextView liveTextView4 = this.f20660m;
            if (liveTextView4 != null) {
                liveTextView4.setVisibility(0);
            }
            LiveTextView liveTextView5 = this.f20661n;
            if (liveTextView5 != null) {
                liveTextView5.setVisibility(4);
            }
            LiveTextView liveTextView6 = this.f20659l;
            if (liveTextView6 != null) {
                liveTextView6.setVisibility(4);
                return;
            }
            return;
        }
        LiveTextView liveTextView7 = this.f20661n;
        if (liveTextView7 != null) {
            liveTextView7.setVisibility(0);
        }
        LiveTextView liveTextView8 = this.f20660m;
        if (liveTextView8 != null) {
            liveTextView8.setVisibility(4);
        }
        LiveTextView liveTextView9 = this.f20659l;
        if (liveTextView9 != null) {
            liveTextView9.setVisibility(4);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.a$e */
    public static final class C8355e implements C3951p.AbstractC3953a {

        /* renamed from: a */
        final /* synthetic */ C8350a f20666a;

        /* renamed from: b */
        private long f20667b;

        static {
            Covode.recordClassIndex(9193);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8355e(C8350a aVar) {
            this.f20666a = aVar;
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9301a(ImageModel imageModel) {
            long j;
            C89219l.m154721d(imageModel, "");
            C10725a aVar = C10725a.C10726a.C10727a.f25846a;
            AbstractC8812b<? extends C9543b> bVar = this.f20666a.f20654g;
            if (bVar != null) {
                j = bVar.mo14676d();
            } else {
                j = 0;
            }
            aVar.mo17650a(j);
            this.f20667b = SystemClock.elapsedRealtime();
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9303a(ImageModel imageModel, Exception exc) {
            long j;
            C89219l.m154721d(imageModel, "");
            C89219l.m154721d(exc, "");
            AbstractC8812b<? extends C9543b> bVar = this.f20666a.f20654g;
            long j2 = 0;
            if (bVar != null && bVar.f21694a == 1) {
                AbstractC8812b<? extends C9543b> bVar2 = this.f20666a.f20654g;
                if (bVar2 != null) {
                    j = bVar2.mo14676d();
                } else {
                    j = 0;
                }
                C10752a.m19346a(j, imageModel.getUri(), exc.getMessage());
            }
            try {
                C10725a aVar = C10725a.C10726a.C10727a.f25846a;
                AbstractC8812b<? extends C9543b> bVar3 = this.f20666a.f20654g;
                if (bVar3 != null) {
                    j2 = bVar3.mo14676d();
                }
                aVar.mo17654c(j2);
            } catch (Exception unused) {
            }
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9302a(ImageModel imageModel, int i, int i2) {
            long j;
            String str;
            long j2;
            C89219l.m154721d(imageModel, "");
            AbstractC8812b<? extends C9543b> bVar = this.f20666a.f20654g;
            long j3 = 0;
            if (bVar != null && bVar.f21694a == 1) {
                AbstractC8812b<? extends C9543b> bVar2 = this.f20666a.f20654g;
                if (bVar2 != null) {
                    j2 = bVar2.mo14676d();
                } else {
                    j2 = 0;
                }
                C10752a.m19345a(j2, imageModel.getUri());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f20667b;
            AbstractC8812b<? extends C9543b> bVar3 = this.f20666a.f20654g;
            if (bVar3 != null) {
                j = bVar3.mo14676d();
            } else {
                j = 0;
            }
            if (imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                str = "";
            } else {
                str = imageModel.getUrls().get(0);
            }
            C89219l.m154716b(str, "");
            C10730c.m19322a(elapsedRealtime, j, str);
            try {
                C10725a aVar = C10725a.C10726a.C10727a.f25846a;
                AbstractC8812b<? extends C9543b> bVar4 = this.f20666a.f20654g;
                if (bVar4 != null) {
                    j3 = bVar4.mo14676d();
                }
                aVar.mo17653b(j3);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.a$f */
    public static final class C8356f implements C3951p.AbstractC3953a {

        /* renamed from: a */
        final /* synthetic */ C8350a f20668a;

        static {
            Covode.recordClassIndex(9194);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9301a(ImageModel imageModel) {
            C89219l.m154721d(imageModel, "");
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9303a(ImageModel imageModel, Exception exc) {
            C89219l.m154721d(imageModel, "");
            C89219l.m154721d(exc, "");
        }

        C8356f(C8350a aVar) {
            this.f20668a = aVar;
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9302a(ImageModel imageModel, int i, int i2) {
            ViewGroup.LayoutParams layoutParams;
            C89219l.m154721d(imageModel, "");
            if (i != 0 && i2 != 0) {
                ImageView imageView = this.f20668a.f20648a;
                if (imageView != null) {
                    layoutParams = imageView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = (i * C3966y.m9653a(13.0f)) / i2;
                    }
                } else {
                    layoutParams = null;
                }
                ImageView imageView2 = this.f20668a.f20648a;
                if (imageView2 != null) {
                    imageView2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.a$c */
    public static final class C8353c extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8350a f20664a;

        static {
            Covode.recordClassIndex(9191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8353c(C8350a aVar) {
            super(1);
            this.f20664a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f20664a.mo14684c();
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8350a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f20658k = view;
        mo14680a();
    }

    /* renamed from: a */
    public final void mo14682a(Long l) {
        String concat;
        String concat2;
        if (l != null && l.longValue() > 0) {
            int longValue = (int) (l.longValue() / 1000);
            int i = longValue / 60;
            int i2 = longValue % 60;
            if (i >= 10) {
                concat = String.valueOf(i);
            } else {
                concat = "0".concat(String.valueOf(i));
            }
            if (i2 >= 10) {
                concat2 = String.valueOf(i2);
            } else {
                concat2 = "0".concat(String.valueOf(i2));
            }
            String str = concat + " : " + concat2;
            LiveTextView liveTextView = this.f20659l;
            if (liveTextView != null) {
                liveTextView.setText(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.a$b */
    public static final class View$OnClickListenerC8352b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8350a f20663a;

        static {
            Covode.recordClassIndex(9190);
        }

        View$OnClickListenerC8352b(C8350a aVar) {
            this.f20663a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d8, code lost:
            if (r1 == null) goto L_0x01da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
            if (((com.bytedance.android.livesdk.model.C9904t) r2).mo16601a() == false) goto L_0x00a3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r23) {
            /*
            // Method dump skipped, instructions count: 681
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.p517c.C8350a.View$OnClickListenerC8352b.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.a$d */
    public static final class View$OnTouchListenerC8354d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C8350a f20665a;

        static {
            Covode.recordClassIndex(9192);
        }

        View$OnTouchListenerC8354d(C8350a aVar) {
            this.f20665a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            if (this.f20665a.f20657j) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                C10645a.m19201a(view).start();
            } else if (1 == motionEvent.getAction()) {
                C10645a.m19202b(view).start();
            } else if (3 == motionEvent.getAction()) {
                C10645a.m19202b(view).start();
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00dc, code lost:
        if (r0 == null) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14681a(com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b<? extends com.bytedance.android.livesdk.model.C9543b> r11, int r12, com.bytedance.ies.sdk.datachannel.DataChannel r13) {
        /*
        // Method dump skipped, instructions count: 453
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.p517c.C8350a.mo14681a(com.bytedance.android.livesdk.gift.model.a.b, int, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}

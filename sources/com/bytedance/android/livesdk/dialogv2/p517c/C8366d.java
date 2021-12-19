package com.bytedance.android.livesdk.dialogv2.p517c;

import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8811a;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.service.animation.p622a.C10645a;
import com.bytedance.android.livesdk.service.p625c.p626a.C10703a;
import com.bytedance.android.livesdk.service.p625c.p628c.C10725a;
import com.bytedance.android.livesdk.service.p625c.p628c.C10730c;
import com.bytedance.android.livesdk.service.p625c.p632g.C10752a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.c.d */
public final class C8366d extends C8350a {

    /* renamed from: l */
    public ImageView f20692l;

    /* renamed from: m */
    private LiveTextView f20693m;

    /* renamed from: n */
    private ImageView f20694n;

    /* renamed from: o */
    private final View f20695o;

    static {
        Covode.recordClassIndex(9204);
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: h */
    public final void mo14689h() {
        super.mo14689h();
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.d$a */
    static final class RunnableC8367a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8366d f20696a;

        static {
            Covode.recordClassIndex(9205);
        }

        RunnableC8367a(C8366d dVar) {
            this.f20696a = dVar;
        }

        public final void run() {
            C10645a.m19203c(this.f20696a.f20692l).start();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.d$d */
    public static final class RunnableC8370d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8366d f20702a;

        static {
            Covode.recordClassIndex(9208);
        }

        public RunnableC8370d(C8366d dVar) {
            this.f20702a = dVar;
        }

        public final void run() {
            C10645a.m19203c(this.f20702a.f20692l).start();
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: e */
    public final boolean mo14686e() {
        T t;
        AbstractC8812b<? extends C9543b> bVar = this.f20654g;
        T t2 = null;
        if (bVar != null) {
            t = bVar.f21695b;
        } else {
            t = null;
        }
        if (t instanceof C9904t) {
            AbstractC8812b<? extends C9543b> bVar2 = this.f20654g;
            if (bVar2 != null) {
                t2 = bVar2.f21695b;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            ImageModel imageModel = ((C9904t) t2).f24011p;
            if (imageModel == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: f */
    public final void mo14687f() {
        super.mo14687f();
        HSImageView hSImageView = this.f20650c;
        if (hSImageView != null) {
            hSImageView.setVisibility(0);
        }
        ImageView imageView = this.f20692l;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        LiveTextView liveTextView = this.f20649b;
        if (liveTextView != null) {
            liveTextView.setVisibility(0);
        }
        LiveTextView liveTextView2 = this.f20693m;
        if (liveTextView2 != null) {
            liveTextView2.setTextColor(C3966y.m9663b((int) R.color.xc));
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: g */
    public final void mo14688g() {
        HSImageView hSImageView;
        super.mo14688g();
        ImageView imageView = this.f20692l;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (!mo14686e() && (hSImageView = this.f20650c) != null) {
            hSImageView.setVisibility(8);
        }
        LiveTextView liveTextView = this.f20649b;
        if (liveTextView != null) {
            liveTextView.setVisibility(8);
        }
        LiveTextView liveTextView2 = this.f20693m;
        if (liveTextView2 != null) {
            liveTextView2.setTextColor(C3966y.m9663b((int) R.color.xd));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: d */
    public final void mo14685d() {
        T t;
        T t2;
        ImageModel imageModel;
        long j;
        AbstractC8812b<? extends C9543b> bVar = this.f20654g;
        ImageModel imageModel2 = null;
        if (bVar != null) {
            t = bVar.f21695b;
        } else {
            t = null;
        }
        if (t instanceof C9904t) {
            AbstractC8812b<? extends C9543b> bVar2 = this.f20654g;
            if (bVar2 != null) {
                t2 = bVar2.f21695b;
            } else {
                t2 = null;
            }
            if (!(t2 instanceof C9904t)) {
                t2 = null;
            }
            C9904t tVar = (C9904t) t2;
            if (tVar != null) {
                imageModel2 = tVar.f24011p;
            }
            if (mo14686e()) {
                if (imageModel2 != null) {
                    if (tVar != null) {
                        j = tVar.f23999d;
                    } else {
                        j = 0;
                    }
                    boolean z = false;
                    try {
                        z = C3941k.m9612a(Uri.parse(imageModel2.mUrls.get(0)));
                    } catch (Exception unused) {
                    }
                    C3951p.m9626a(this.f20692l, imageModel2, -1, -1, true, R.drawable.c5_, new C8369c(this, j, z));
                }
            } else if (!(tVar == null || (imageModel = tVar.f23997b) == null)) {
                C3951p.m9627a(this.f20692l, imageModel, 2131234646, new C8368b(this));
            }
        }
        super.mo14685d();
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.d$b */
    public static final class C8368b implements C3951p.AbstractC3953a {

        /* renamed from: a */
        final /* synthetic */ C8366d f20697a;

        /* renamed from: b */
        private long f20698b;

        static {
            Covode.recordClassIndex(9206);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8368b(C8366d dVar) {
            this.f20697a = dVar;
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9301a(ImageModel imageModel) {
            long j;
            C89219l.m154721d(imageModel, "");
            C10725a aVar = C10725a.C10726a.C10727a.f25846a;
            AbstractC8812b<? extends C9543b> bVar = this.f20697a.f20654g;
            if (bVar != null) {
                j = bVar.mo14676d();
            } else {
                j = 0;
            }
            aVar.mo17650a(j);
            this.f20698b = SystemClock.elapsedRealtime();
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9303a(ImageModel imageModel, Exception exc) {
            long j;
            C89219l.m154721d(imageModel, "");
            C89219l.m154721d(exc, "");
            AbstractC8812b<? extends C9543b> bVar = this.f20697a.f20654g;
            long j2 = 0;
            if (bVar != null && bVar.f21694a == 1) {
                AbstractC8812b<? extends C9543b> bVar2 = this.f20697a.f20654g;
                if (bVar2 != null) {
                    j = bVar2.mo14676d();
                } else {
                    j = 0;
                }
                C10752a.m19346a(j, imageModel.getUri(), exc.getMessage());
            }
            try {
                C10725a aVar = C10725a.C10726a.C10727a.f25846a;
                AbstractC8812b<? extends C9543b> bVar3 = this.f20697a.f20654g;
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
            AbstractC8812b<? extends C9543b> bVar = this.f20697a.f20654g;
            long j3 = 0;
            if (bVar != null && bVar.f21694a == 1) {
                AbstractC8812b<? extends C9543b> bVar2 = this.f20697a.f20654g;
                if (bVar2 != null) {
                    j2 = bVar2.mo14676d();
                } else {
                    j2 = 0;
                }
                C10752a.m19345a(j2, imageModel.getUri());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f20698b;
            AbstractC8812b<? extends C9543b> bVar3 = this.f20697a.f20654g;
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
                AbstractC8812b<? extends C9543b> bVar4 = this.f20697a.f20654g;
                if (bVar4 != null) {
                    j3 = bVar4.mo14676d();
                }
                aVar.mo17653b(j3);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.d$c */
    public static final class C8369c implements C3951p.AbstractC3953a {

        /* renamed from: a */
        final /* synthetic */ C8366d f20699a;

        /* renamed from: b */
        final /* synthetic */ long f20700b;

        /* renamed from: c */
        final /* synthetic */ boolean f20701c;

        static {
            Covode.recordClassIndex(9207);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9301a(ImageModel imageModel) {
            C89219l.m154721d(imageModel, "");
            C10703a.C10704a.C10705a.f25783a.mo17631a(this.f20700b, 0);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9303a(ImageModel imageModel, Exception exc) {
            C89219l.m154721d(imageModel, "");
            C89219l.m154721d(exc, "");
            String message = exc.getMessage();
            if (message == null) {
                message = "Download Error";
            }
            C10703a.m19271a(this.f20700b, message);
        }

        C8369c(C8366d dVar, long j, boolean z) {
            this.f20699a = dVar;
            this.f20700b = j;
            this.f20701c = z;
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9302a(ImageModel imageModel, int i, int i2) {
            HSImageView hSImageView;
            C89219l.m154721d(imageModel, "");
            long j = C8374a.C8375a.C8376a.f20718a.f20712f;
            AbstractC8812b<? extends C9543b> bVar = this.f20699a.f20654g;
            if (bVar != null && j == bVar.mo14676d() && C8374a.C8375a.C8376a.f20718a.f20713g == this.f20699a.f20651d && (hSImageView = this.f20699a.f20650c) != null) {
                hSImageView.setVisibility(8);
            }
            C10703a.C10704a.C10705a.f25783a.mo17632a(this.f20700b, this.f20701c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8366d(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f20695o = view;
        this.f20692l = (ImageView) view.findViewById(R.id.b_w);
        this.f20693m = (LiveTextView) view.findViewById(R.id.crt);
        this.f20694n = (ImageView) view.findViewById(R.id.a7c);
        LiveTextView liveTextView = this.f20693m;
        if (liveTextView != null) {
            liveTextView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: a */
    public final void mo14681a(AbstractC8812b<? extends C9543b> bVar, int i, DataChannel dataChannel) {
        super.mo14681a(bVar, i, dataChannel);
        ImageView imageView = this.f20692l;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        long j = C8374a.C8375a.C8376a.f20718a.f20712f;
        if (bVar != null && j == bVar.mo14676d() && C8374a.C8375a.C8376a.f20718a.f20713g == this.f20651d) {
            HSImageView hSImageView = this.f20650c;
            if (hSImageView != null) {
                hSImageView.setVisibility(8);
            }
            ImageView imageView2 = this.f20692l;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        long j2 = C8374a.C8375a.C8376a.f20718a.f20712f;
        if (bVar != null && j2 == bVar.mo14676d() && !mo14686e() && C8374a.C8375a.C8376a.f20718a.f20714h) {
            C8374a.C8375a.C8376a.f20718a.f20714h = false;
            HSImageView hSImageView2 = this.f20650c;
            if (hSImageView2 != null) {
                hSImageView2.postDelayed(new RunnableC8367a(this), 50);
            }
        }
        AbstractC8812b<? extends C9543b> bVar2 = this.f20654g;
        Objects.requireNonNull(bVar2, "null cannot be cast to non-null type com.bytedance.android.livesdk.dialogv2.panel.GiftPanel");
        AbstractC8811a aVar = (AbstractC8811a) bVar2;
        ImageView imageView3 = this.f20694n;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        LiveTextView liveTextView = this.f20693m;
        if (liveTextView != null) {
            liveTextView.setText(C3966y.m9660a((int) R.string.gnv, String.valueOf(aVar.mo14677e())));
        }
    }
}

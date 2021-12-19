package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34470e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.C72929c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72975f;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73009k;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e */
public final class C72972e extends AbstractC72946a {

    /* renamed from: a */
    public C72975f f163746a;

    /* renamed from: l */
    public C72929c f163747l;

    /* renamed from: m */
    private C73009k f163748m;

    /* renamed from: n */
    private Aweme f163749n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e$b */
    static final class RunnableC72974b implements Runnable {

        /* renamed from: a */
        public static final RunnableC72974b f163751a = new RunnableC72974b();

        static {
            Covode.recordClassIndex(85677);
        }

        RunnableC72974b() {
        }

        public final void run() {
        }
    }

    static {
        Covode.recordClassIndex(85675);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        return 10;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    public final void mo115229f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        MethodCollector.m26663i(8509);
        View view = new View(this.f163695i);
        MethodCollector.m26664o(8509);
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e$a */
    public static final class RunnableC72973a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72972e f163750a;

        static {
            Covode.recordClassIndex(85676);
        }

        RunnableC72973a(C72972e eVar) {
            this.f163750a = eVar;
        }

        public final void run() {
            NormalTrackTimeStamp normalTrackTimeStamp;
            Float scale;
            C72929c cVar = this.f163750a.f163747l;
            C72975f fVar = this.f163750a.f163746a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            LinearLayout stickerView = fVar.getStickerView();
            List<NormalTrackTimeStamp> a = C72890c.m128719a(this.f163750a.f163692f);
            if (!(a == null || (normalTrackTimeStamp = a.get(0)) == null || (scale = normalTrackTimeStamp.getScale()) == null)) {
                scale.floatValue();
            }
            C89219l.m154721d(stickerView, "");
            if (stickerView.getWidth() == 0 || stickerView.getHeight() == 0) {
                stickerView.post(new C72929c.RunnableC72930a(cVar, stickerView));
            } else {
                cVar.mo115321a(stickerView);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C72975f mo115223a() {
        CountDownStickerStruct countDownStickerStruct;
        CountDownStickerStruct countDownStickerStruct2 = null;
        if (this.f163746a == null) {
            C72975f fVar = new C72975f(this.f163695i, this.f163749n);
            this.f163746a = fVar;
            LinearLayout stickerView = fVar.getStickerView();
            if (stickerView != null) {
                stickerView.setVisibility(4);
            }
            C72975f fVar2 = this.f163746a;
            if (fVar2 != null) {
                InteractStickerStruct interactStickerStruct = this.f163692f;
                if (interactStickerStruct != null) {
                    countDownStickerStruct = interactStickerStruct.getCountDownStickerStruct();
                } else {
                    countDownStickerStruct = null;
                }
                fVar2.setCountDownStickerStruct(countDownStickerStruct);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C72975f fVar3 = this.f163746a;
            if (fVar3 != null) {
                fVar3.setLayoutParams(layoutParams);
            }
            C72975f fVar4 = this.f163746a;
            if (fVar4 != null) {
                fVar4.post(new RunnableC72973a(this));
            }
        }
        C72975f fVar5 = this.f163746a;
        if (fVar5 != null) {
            InteractStickerStruct interactStickerStruct2 = this.f163692f;
            if (interactStickerStruct2 != null) {
                countDownStickerStruct2 = interactStickerStruct2.getCountDownStickerStruct();
            }
            fVar5.setData(countDownStickerStruct2);
        }
        C72975f fVar6 = this.f163746a;
        if (fVar6 != null) {
            fVar6.postInvalidate();
        }
        return this.f163746a;
    }

    /* renamed from: c */
    public final boolean mo115386c() {
        C73009k kVar;
        C73009k kVar2;
        AbstractC1196i lifecycle;
        AbstractC1196i.EnumC1199b a;
        String str;
        String str2;
        String str3;
        CountDownStickerStruct countDownStickerStruct;
        String str4;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        CountDownStickerStruct countDownStickerStruct2;
        String str5 = null;
        if (this.f163748m == null) {
            InteractStickerStruct interactStickerStruct = this.f163692f;
            if (interactStickerStruct != null) {
                countDownStickerStruct2 = interactStickerStruct.getCountDownStickerStruct();
            } else {
                countDownStickerStruct2 = null;
            }
            this.f163748m = C73009k.C73010a.m128928a(countDownStickerStruct2, this.f163749n, this.f163697k);
        }
        Context context = this.f163695i;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ((ActivityC0945e) context).getSupportFragmentManager().mo3560b();
        C73009k kVar3 = this.f163748m;
        if ((kVar3 != null && kVar3.isAdded()) || (((kVar = this.f163748m) != null && kVar.isVisible()) || ((kVar2 = this.f163748m) != null && kVar2.isRemoving()))) {
            return false;
        }
        Activity a2 = C34470e.m70451a(this.f163695i);
        if (!(a2 instanceof ActivityC0218d)) {
            a2 = null;
        }
        ActivityC0580d dVar = (ActivityC0580d) a2;
        if (!(dVar == null || (lifecycle = dVar.getLifecycle()) == null || (a = lifecycle.mo4011a()) == null || !a.isAtLeast(AbstractC1196i.EnumC1199b.RESUMED))) {
            C73009k kVar4 = this.f163748m;
            if (kVar4 != null) {
                Context context2 = this.f163695i;
                Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                kVar4.showNow(((ActivityC0945e) context2).getSupportFragmentManager(), "FeedCountDownStickerDialogFragment");
            }
            C72975f fVar = this.f163746a;
            if (fVar != null) {
                fVar.setFeedCountdownStickerDialogFragment(this.f163748m);
            }
            C33744d dVar2 = new C33744d();
            C75391j jVar = this.f163697k;
            if (jVar == null || (iVar3 = jVar.f169463r) == null) {
                str = null;
            } else {
                str = iVar3.f169429c;
            }
            C33744d a3 = dVar2.mo59983a("group_id", str);
            C75391j jVar2 = this.f163697k;
            if (jVar2 == null || (iVar2 = jVar2.f169463r) == null) {
                str2 = null;
            } else {
                str2 = iVar2.f169428b;
            }
            C33744d a4 = a3.mo59983a("author_id", str2);
            C75391j jVar3 = this.f163697k;
            if (jVar3 == null || (iVar = jVar3.f169463r) == null) {
                str3 = null;
            } else {
                str3 = iVar.f169427a;
            }
            C33744d a5 = a4.mo59983a("enter_from", str3);
            InteractStickerStruct interactStickerStruct2 = this.f163692f;
            if (interactStickerStruct2 != null) {
                countDownStickerStruct = interactStickerStruct2.getCountDownStickerStruct();
            } else {
                countDownStickerStruct = null;
            }
            C33744d a6 = a5.mo59981a("countdown_time", C72975f.C72976a.m128882a(countDownStickerStruct));
            IAccountUserService g = C31575b.m65865g();
            String str6 = "";
            C89219l.m154716b(g, str6);
            String curUserId = g.getCurUserId();
            Aweme aweme = this.f163749n;
            if (aweme != null) {
                str5 = aweme.getAuthorUid();
            }
            C33744d a7 = a6.mo59980a("is_author", TextUtils.equals(curUserId, str5) ? 1 : 0);
            C75391j jVar4 = this.f163697k;
            if (!(jVar4 == null || (str4 = jVar4.f169452g) == null)) {
                str6 = str4;
            }
            C39162r.m79460a("livesdk_cd_layer_show", a7.mo59983a("enter_method", str6).f79943a);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo115236a(jVar);
        this.f163747l.mo115236a(jVar);
        C72975f g = mo115223a();
        if (g != null) {
            g.post(RunnableC72974b.f163751a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return this.f163747l.mo115224a(j, i, f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        return this.f163747l.mo115225a(j, i, f, f2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72972e(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar, Aweme aweme) {
        super(i, context, view, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163747l = new C72929c(context, this, interactStickerStruct, jVar);
        this.f163749n = aweme;
        if (jVar != null && jVar.f169451f == 1) {
            mo115386c();
        }
    }
}

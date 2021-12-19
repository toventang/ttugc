package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p3872a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.c */
public final class C72965c extends FrameLayout {

    /* renamed from: c */
    public static final C72966a f163726c = new C72966a((byte) 0);

    /* renamed from: a */
    public ConstraintLayout f163727a;

    /* renamed from: b */
    public TuxTextView f163728b;

    /* renamed from: d */
    private boolean f163729d;

    /* renamed from: e */
    private C75391j f163730e;

    static {
        Covode.recordClassIndex(85668);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.c$a */
    public static final class C72966a {
        static {
            Covode.recordClassIndex(85669);
        }

        private C72966a() {
        }

        public /* synthetic */ C72966a(byte b) {
            this();
        }
    }

    public final C75391j getInteractStickerParams() {
        return this.f163730e;
    }

    public final boolean getTurnOnMic() {
        return this.f163729d;
    }

    public final TuxTextView getDuetTextView() {
        TuxTextView tuxTextView = this.f163728b;
        if (tuxTextView == null) {
            C89219l.m154710a("duetTextView");
        }
        return tuxTextView;
    }

    public final ConstraintLayout getRealDuetStickerView() {
        ConstraintLayout constraintLayout = this.f163727a;
        if (constraintLayout == null) {
            C89219l.m154710a("realDuetStickerView");
        }
        return constraintLayout;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        String str;
        String str2;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        super.onAttachedToWindow();
        C33744d dVar = new C33744d();
        C75391j jVar = this.f163730e;
        String str3 = null;
        if (jVar == null || (iVar3 = jVar.f169463r) == null) {
            str = null;
        } else {
            str = iVar3.f169429c;
        }
        C33744d a = dVar.mo59983a("group_id", str);
        C75391j jVar2 = this.f163730e;
        if (jVar2 == null || (iVar2 = jVar2.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar2.f169428b;
        }
        C33744d a2 = a.mo59983a("author_id", str2);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        C33744d a3 = a2.mo59983a("user_id", g.getCurUserId());
        C75391j jVar3 = this.f163730e;
        if (!(jVar3 == null || (iVar = jVar3.f169463r) == null)) {
            str3 = iVar.f169427a;
        }
        C39162r.m79460a("duet_sticker_show", a3.mo59983a("enter_from", str3).f79943a);
    }

    public final void setInteractStickerParams(C75391j jVar) {
        this.f163730e = jVar;
    }

    public final void setTurnOnMic(boolean z) {
        this.f163729d = z;
    }

    public final void setDuetTextView(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f163728b = tuxTextView;
    }

    public final void setRealDuetStickerView(ConstraintLayout constraintLayout) {
        C89219l.m154721d(constraintLayout, "");
        this.f163727a = constraintLayout;
    }

    /* renamed from: a */
    public final void mo115368a(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = this.f163728b;
        if (tuxTextView == null) {
            C89219l.m154710a("duetTextView");
        }
        tuxTextView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72965c(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8503);
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.a8x, this, false);
        if (a != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) a;
            this.f163727a = constraintLayout;
            if (constraintLayout == null) {
                C89219l.m154710a("realDuetStickerView");
            }
            View findViewById = constraintLayout.findViewById(R.id.aq5);
            C89219l.m154716b(findViewById, "");
            TuxTextView tuxTextView = (TuxTextView) findViewById;
            this.f163728b = tuxTextView;
            if (tuxTextView == null) {
                C89219l.m154710a("duetTextView");
            }
            tuxTextView.mo37697a(30.0f);
            TuxTextView tuxTextView2 = this.f163728b;
            if (tuxTextView2 == null) {
                C89219l.m154710a("duetTextView");
            }
            tuxTextView2.setTypeface(AVExternalServiceImpl.m113114a().typeFaceService().getTypefaceByFontName("Neon"));
            ConstraintLayout constraintLayout2 = this.f163727a;
            if (constraintLayout2 == null) {
                C89219l.m154710a("realDuetStickerView");
            }
            addView(constraintLayout2);
            MethodCollector.m26664o(8503);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        MethodCollector.m26664o(8503);
        throw nullPointerException;
    }
}

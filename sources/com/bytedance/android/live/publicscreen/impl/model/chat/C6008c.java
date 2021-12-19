package com.bytedance.android.live.publicscreen.impl.model.chat;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import androidx.core.graphics.drawable.C0705a;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.live.AbstractC4317f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7885cz;
import com.bytedance.android.livesdk.model.message.C9889s;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.widget.C11432m;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.p1844d.AbstractC24157c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.c */
public final class C6008c extends AbstractC5988a<C9889s> {

    /* renamed from: l */
    public static final int f15080l = C3966y.m9667d(R.dimen.xx);

    /* renamed from: m */
    static final int f15081m = C3966y.m9667d(R.dimen.xy);

    /* renamed from: n */
    static final int f15082n = C3966y.m9667d(R.dimen.xw);

    /* renamed from: o */
    public static final C6009a f15083o = new C6009a((byte) 0);

    /* renamed from: h */
    final SpannableStringBuilder f15084h = new SpannableStringBuilder();

    /* renamed from: i */
    EmoteModel f15085i;

    /* renamed from: j */
    public boolean f15086j;

    /* renamed from: k */
    final int f15087k = 1;

    /* renamed from: p */
    private final List<C6010b> f15088p = new ArrayList();

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.c$a */
    static final class C6009a {
        static {
            Covode.recordClassIndex(6620);
        }

        private C6009a() {
        }

        public /* synthetic */ C6009a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        return this.f15084h;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9889s) this.f14737d).f23914f;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.c$b */
    public final class C6010b {

        /* renamed from: a */
        public Drawable f15089a;

        /* renamed from: b */
        public AbstractC24157c<C24117a<AbstractC24454c>> f15090b;

        /* renamed from: c */
        public boolean f15091c;

        /* renamed from: d */
        public C11432m f15092d;

        /* renamed from: e */
        public final int f15093e;

        /* renamed from: f */
        public final EmoteModel f15094f;

        /* renamed from: g */
        final /* synthetic */ C6008c f15095g;

        static {
            Covode.recordClassIndex(6621);
        }

        /* renamed from: a */
        public final void mo11899a() {
            if (this.f15089a == null && !this.f15091c) {
                this.f15091c = true;
                AbstractC24157c<C24117a<AbstractC24454c>> cVar = this.f15090b;
                if (cVar != null) {
                    cVar.mo39750g();
                }
                ImageModel imageModel = this.f15094f.f8728h;
                int i = C6008c.f15080l;
                AbstractC24157c<C24117a<AbstractC24454c>> a = C3941k.m9597a(imageModel, i, i);
                this.f15090b = a;
                if (a != null) {
                    a.mo39739a(new C6011a(this), C24065a.f56998a);
                }
            }
        }

        /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.c$b$a */
        public static final class C6011a extends AbstractC24435b {

            /* renamed from: a */
            final /* synthetic */ C6010b f15096a;

            static {
                Covode.recordClassIndex(6622);
            }

            /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.c$b$a$a */
            static final class RunnableC6012a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C6011a f15097a;

                /* renamed from: b */
                final /* synthetic */ Bitmap f15098b;

                static {
                    Covode.recordClassIndex(6623);
                }

                RunnableC6012a(C6011a aVar, Bitmap bitmap) {
                    this.f15097a = aVar;
                    this.f15098b = bitmap;
                }

                public final void run() {
                    C6010b bVar = this.f15097a.f15096a;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f15097a.f15096a.f15095g.mo11700A().f14747d.getResources(), this.f15098b);
                    int i = C6008c.f15080l;
                    bitmapDrawable.setBounds(0, 0, i, i);
                    C0705a.m2503b(bitmapDrawable, this.f15097a.f15096a.f15095g.f15086j ? 1 : 0);
                    bVar.f15089a = bitmapDrawable;
                    C6008c cVar = this.f15097a.f15096a.f15095g;
                    C6010b bVar2 = this.f15097a.f15096a;
                    Drawable drawable = bVar2.f15089a;
                    if (drawable != null) {
                        cVar.f15084h.removeSpan(bVar2.f15092d);
                        int i2 = (cVar.f15087k * bVar2.f15093e) + 1;
                        SpannableStringBuilder spannableStringBuilder = cVar.f15084h;
                        C11432m mVar = new C11432m(drawable);
                        mVar.mo18269a((float) C6008c.f15082n);
                        mVar.f27402a = C6008c.f15081m;
                        bVar2.f15092d = mVar;
                        spannableStringBuilder.setSpan(mVar, i2, i2 + 1, 33);
                        cVar.f14735b = null;
                        cVar.mo11700A().mo11742a((AbstractC5873h) cVar);
                    }
                    this.f15097a.f15096a.f15091c = false;
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C6011a(C6010b bVar) {
                this.f15096a = bVar;
            }

            @Override // com.facebook.p1844d.AbstractC24156b
            public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                C89219l.m154721d(cVar, "");
                cVar.mo39750g();
                this.f15096a.f15091c = false;
            }

            @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
            /* renamed from: a */
            public final void mo9033a(Bitmap bitmap) {
                AbstractC24157c<C24117a<AbstractC24454c>> cVar = this.f15096a.f15090b;
                if (!(cVar == null || !cVar.mo39745b() || bitmap == null)) {
                    ((AbstractC5988a) this.f15096a.f15095g).f15033e.post(new RunnableC6012a(this, bitmap));
                }
                AbstractC24157c<C24117a<AbstractC24454c>> cVar2 = this.f15096a.f15090b;
                if (cVar2 != null) {
                    cVar2.mo39750g();
                }
            }
        }

        public C6010b(C6008c cVar, int i, EmoteModel emoteModel) {
            C89219l.m154721d(emoteModel, "");
            this.f15095g = cVar;
            this.f15093e = i;
            this.f15094f = emoteModel;
            this.f15089a = emoteModel.f8733m;
        }
    }

    static {
        Covode.recordClassIndex(6619);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5869d, com.bytedance.android.live.publicscreen.impl.model.chat.AbstractC5988a
    /* renamed from: e */
    public final void mo11677e() {
        super.mo11677e();
        Iterator<T> it = this.f15088p.iterator();
        while (it.hasNext()) {
            it.next().mo11899a();
        }
        if (mo11700A() != null) {
            C6501b.C6502a.m13948a("livesdk_privilege_emote_show").mo12643a(mo11700A().f14755l).mo12651a("show_entrance", "comment_area").mo12655b();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h, com.bytedance.android.live.publicscreen.impl.model.chat.AbstractC5988a
    /* renamed from: r */
    public final void mo11692r() {
        super.mo11692r();
        for (T t : this.f15088p) {
            t.f15091c = false;
            AbstractC24157c<C24117a<AbstractC24454c>> cVar = t.f15090b;
            if (cVar != null) {
                cVar.mo39750g();
            }
        }
        this.f15084h.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11898a(EmoteModel emoteModel) {
        DataChannel dataChannel;
        AbstractC0952i iVar;
        C5889g A = mo11700A();
        if (A != null && (dataChannel = A.f14755l) != null && (iVar = (AbstractC0952i) dataChannel.mo28318b(C9021ao.class)) != null) {
            ((AbstractC4317f) C6193a.m13435a(AbstractC4317f.class)).showEmoteDetailDialog(emoteModel, iVar);
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.c$c */
    public static final class C6013c extends AbstractC7885cz {

        /* renamed from: a */
        final /* synthetic */ C6010b f15099a;

        /* renamed from: b */
        final /* synthetic */ C6008c f15100b;

        /* renamed from: c */
        final /* synthetic */ GradientDrawable f15101c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89236c f15102d;

        static {
            Covode.recordClassIndex(6624);
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7885cz
        /* renamed from: a */
        public final void mo11881a(View view) {
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
        }

        public final void onClick(View view) {
            String str;
            C89219l.m154721d(view, "");
            C6008c cVar = this.f15100b;
            EmoteModel emoteModel = this.f15099a.f15094f;
            if (cVar.mo11700A() != null) {
                if (cVar.mo11700A().f14750g) {
                    cVar.mo11898a(emoteModel);
                } else {
                    cVar.f15085i = emoteModel;
                    C6779a.m14563a().mo13053a(new C11756a(1));
                }
                User b = cVar.mo10375b();
                if (b == null || b.getId() != cVar.mo11700A().f14746c) {
                    if (cVar.mo11700A().f14752i) {
                        str = "live_anchor_c_audience";
                    } else {
                        str = "live_audience_c_audience";
                    }
                } else if (cVar.mo11700A().f14752i) {
                    str = "live_anchor_c_anchor";
                } else {
                    str = "live_audience_c_anchor";
                }
                C6501b.C6502a.m13948a("livesdk_privilege_emote_click").mo12643a(cVar.mo11700A().f14755l).mo12651a("request_page", str).mo12651a("click_position", "comment_area").mo12655b();
            }
        }

        C6013c(C6010b bVar, C6008c cVar, GradientDrawable gradientDrawable, C89233z.C89236c cVar2) {
            this.f15099a = bVar;
            this.f15100b = cVar;
            this.f15101c = gradientDrawable;
            this.f15102d = cVar2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6008c(C9889s sVar) {
        super(sVar);
        List f;
        C89219l.m154721d(sVar, "");
        List<EmoteModel> list = sVar.f23913a;
        if (!(list == null || (f = C89070n.m154580f((Iterable) list)) == null)) {
            int i = 0;
            for (Object obj : f) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                this.f15088p.add(new C6010b(this, i, (EmoteModel) obj));
                i = i2;
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5872g, com.bytedance.android.live.publicscreen.impl.model.chat.AbstractC5988a
    /* renamed from: b */
    public final void mo11686b(C5889g gVar) {
        C89219l.m154721d(gVar, "");
        super.mo11686b(gVar);
        this.f15086j = C6229a.m13521a(gVar.f14747d);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i = f15080l;
        int i2 = 0;
        gradientDrawable.setBounds(0, 0, i, i);
        gradientDrawable.setCornerRadius((float) f15082n);
        gradientDrawable.setColor(C4079b.m9888a(gVar.f14747d, (int) R.attr.amn));
        C0705a.m2503b(gradientDrawable, this.f15086j ? 1 : 0);
        if (this.f15086j) {
            this.f15084h.append((char) 8207);
        } else {
            this.f15084h.append((char) 8206);
        }
        C89233z.C89236c cVar = new C89233z.C89236c();
        for (T t : this.f15088p) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            this.f15084h.append((char) 65532);
            Drawable drawable = t2.f15089a;
            if (drawable == null) {
                drawable = gradientDrawable;
            }
            cVar.element = (this.f15087k * i2) + 1;
            SpannableStringBuilder spannableStringBuilder = this.f15084h;
            C11432m mVar = new C11432m(drawable);
            mVar.mo18269a((float) f15082n);
            mVar.f27402a = f15081m;
            t2.f15092d = mVar;
            spannableStringBuilder.setSpan(mVar, cVar.element, cVar.element + this.f15087k, 33);
            this.f15084h.setSpan(new C6013c(t2, this, gradientDrawable, cVar), cVar.element, cVar.element + 1, 33);
            t2.mo11899a();
            i2 = i3;
        }
        EmoteModel emoteModel = this.f15085i;
        if (emoteModel != null) {
            mo11898a(emoteModel);
            this.f15085i = null;
        }
    }
}
